import hudson.model.*
import java.nio.file.*

def call(String name, String name2){
 echo "Hello ${name}"
  echo "Hello ${name2}"
 Files.copy(${name}, ${name2}, StandardCopyOption.COPY_ATTRIBUTES)
}
