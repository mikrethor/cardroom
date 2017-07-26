package org.ablx.cardroom.parser

import org.junit.Test
import java.nio.file.Files
import java.nio.file.Paths
import java.io.File



class ParserTest {
    @Test
    fun testParsing() {

        //Read file and iterate through all lines
        val classLoader = javaClass.classLoader
        val file = File(classLoader.getResource("20131217_Tokyo02_real_holdem_no-limit.txt")!!.file)

        val encoded: ByteArray = Files.readAllBytes(Paths.get(file.absolutePath))
        val contenu: String = String(encoded, Charsets.UTF_8)
        contenu.reader().forEachLine {println( it) }


    }

}