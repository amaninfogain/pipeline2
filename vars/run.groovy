import java.nio.file.Paths
import java.nio.file.Files
import java.nio.file.*
import java.util.*
import java.io.*

def call(String name, String name2){
 echo "Hello ${name}"
  echo "Hello ${name2}"

 def p = "cp -rf ${name} ${name2}".execute()
p.waitFor()
println p.text
}

