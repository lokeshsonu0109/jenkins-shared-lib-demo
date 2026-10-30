package org.example
class helper{
  static String toUpper(String name){
    def n = name ?: 'there'
    return n.toUpperCase()
  }
  static String readGreeting() {
    return libraryResources('org/example/greeting.txt').trim()
  }
}
