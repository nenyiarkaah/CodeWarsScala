
Output
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement a function likes :: List[String] -> String, which must take in input List, containing the names of people who like an item. It must return the display text as shown in the examples:

likes () // must be "no one likes this"
likes List("Peter") // must be "Peter likes this"
likes List("Jacob", "Alex") // must be "Jacob and Alex like this"
likes List("Max", "John", "Mark") // must be "Max, John and Mark like this"
likes List("Alex", "Jacob", "Mark", "Max") // must be "Alex, Jacob and 2 others like this"