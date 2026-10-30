import org.example.helper

def call(String name = 'there'){
  def greeting - libraryResource('org/example/greeting.txt').trim()
  def upperName = helper.toupper(name)
  echo "${greeting} ${upperName}"
}
