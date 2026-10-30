package org.example
class helper{
  static String toUpper(String name){
    def n = name ?: 'there'
    return n.toUpperCase()
  }
}
