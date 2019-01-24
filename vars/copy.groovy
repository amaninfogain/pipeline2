import java.nio.file.Paths
import java.nio.file.Files
import java.nio.file.*

def call(String name, String name2){
 echo "Hello ${name}"
  echo "Hello ${name2}"

 Files.copy(Paths.get(${name}), Paths.get(${name2}))
}
