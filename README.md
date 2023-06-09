# Outfit Rating Platform

In this homework you are expected to implement an “ **_Outfit Rating Platform_** ” with a GUI. You should
fulfill the concepts of:

```
 SOLID Principles
 MVC Design Patterns
 Swing
 Observer Design Pattern
```
In this platform, the users will rate and comment on different outfits and create collections up to
their interest or for their upcoming events. For example, a woman about to marry could create a
collection namely “My Wedding” which consists of a wedding dress, a wedding shoe, a bride crown
etc. Also, the users will see other users’ collections to see different products or combines.

The GUI of the **_Outfit Rating Platform_** allows users:

```
 To login.
 To create a collection of outfits
 To add/remove outfit from the collection
 To like/dislike the outfit
 To comment the outfits
 To follow/unfollow other users
 To view the followed users’ collections
```
On this platform, the outfit’s information is stored in a JSON file with a product id, a brand name, a
clothing type, for which occasion the outfit is suitable i.e. party, elegant, casual, sporty etc., for which
gender, size options, color, number of likes, number of dislikes and comments. All this information
belong to outfits will be displayed on this platform.

There will be also a statistics page which will show the followings:

```
 The most liked outfit
 The most disliked outfit
 The most followed user
```
When a user performs a like/dislike or commenting operation the JSON file should be updated.
Furthermore, if any of these operations affect any of the user’s collections or the statistics page, these
changes should be applied on these as well.

The user information is stored in an XML file with user name, password, following users, follower users
and collection content. The collection will have a name and the product ids which are added to the
corresponding collection. When a user performs follow/unfollow operation, or an addition/removal
operation to one of his/her collections, the XML file should be updated.


You should create a JSON file which consists of at least 15 products and an XML file which consists of
at least 5 users including the instructor and the teaching assistants of this course. Both the JSON and
the XML files should be loaded first when the program starts.

**NOTE:** Please try your best to make your software user friendly and make sure it is expressive enough
to the user.

**Usability Testing:** If you have enough time you can create a check list of every functionality that your
software has and ask your friends to perform each functionality without giving them any hint. If your
friends succeed in every functionality, then your software’s usability is quite high.



