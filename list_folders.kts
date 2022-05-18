// Usage:
//  kotlinc -script list_folders.kts /Users/litong.deng/projects

import java.io.File

val folders = File(args[0]).listFiles { file -> file.isDirectory }
folders?.forEach { folder -> println(folder) }