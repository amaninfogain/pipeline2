import java.nio.file.Paths
import java.nio.file.Files
import java.nio.file.*

def call(String name, String name2){
 echo "Hello ${name}"
  echo "Hello ${name2}"

 FileUtils.copyDirectory("/home/xavient/git/pipeline/data", "/home/xavient/git/pipeline/data2");
}
