import java.nio.file.Paths
import java.nio.file.Files
import java.nio.file.*
import java.util.*
import java.io.*

def call(String name, String name2){
 echo "Hello ${name}"
  echo "Hello ${name2}"
println "cp -rf /home/xavient/git/pipeline/data /home/xavient/git/pipeline/data2".execute().text
//Files.copy("${name}", "${name2}")
 //FileUtils.copyDirectory("/home/xavient/git/pipeline/data", "/home/xavient/git/pipeline/data2");
}

