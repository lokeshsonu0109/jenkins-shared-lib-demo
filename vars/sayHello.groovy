import org.example.helper

def call(String name = 'there'){
  def greeting = libraryResource('org/example/greeting.txt').trim()
  def upperName = helper.toUpper(name)
  echo "${greeting} ${upperName}"
}
