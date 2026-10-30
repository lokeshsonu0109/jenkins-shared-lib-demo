import org.example.helper

def call(String name = 'there'){
  def upper = helper.toUpper(name)
  echo "hello $(upper)"
}
