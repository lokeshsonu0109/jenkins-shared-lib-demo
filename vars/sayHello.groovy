import org.example.helper

def call(String name = 'there'){
  def greeting - helper.readGreeting()
  def upperName = helper.toupper(name)
  echo "${greeting} ${upperName}"
}
