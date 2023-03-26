package controller.operations.fileOperations.xmlOperations;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import controller.data.Data;
import model.User;

import java.io.*;
import java.util.ArrayList;
import model.Collection;

public class XmlRead {

    public void XmlRead(String fileName) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String xml = inputStreamToString(new FileInputStream(fileName));
            Data.users = xmlMapper.readValue(xml, Data.users.getClass());
            initUsers();
            //initCollection();

        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }

        br.close();
        return sb.toString();
    }

    private void initUsers() {//we have to init users again because while reading the xml the empty lists
        for (User user : Data.users.getUsers()) {
            if (user.getFollowers() == null) {
                user.setFollowers(new ArrayList<>());
            }
            if (user.getFollowing() == null) {
                user.setFollowing(new ArrayList<>());
            }
            if (user.getCollectionContent() == null) {
                user.setCollectionContent(new ArrayList<>());
            }
        }
    }

//    private void initCollection(){
//        for (User user:Data.users.getUsers()) {
//            for (Collection col : user.getCollectionContent()) {
//                Collection collection = new Collection(col.getCollectionName());
//                for (String id: col.getCollectionOutfits()) {
//                    collection.getCollectionOutfits().add(id);
//                }
//                Data.collections.add(collection);
//            }
//        }
//    }
}

