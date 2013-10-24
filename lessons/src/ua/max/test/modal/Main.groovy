package ua.max.test.modal

import groovy.io.FileType

/**
 * Created with IntelliJ IDEA.
 * User: Max
 * Date: 15.10.13
 * Time: 1:08
 * To change this template use File | Settings | File Templates.
 */

/*
def surname = "Honchar";
String name = "Max";
surname = "$surname";
User user = new User(name: name, surname: surname);
println user;*/



def list = []

def basePatch =  new File(".").getCanonicalPath()
def resourcePath = "\\resources\\homeTask2"
def regExpUrl = "\\ua\\max\\test\\modal"
def firstCase = "a_"
def secondCase = "1_"
def thirdCase = "d_"
basePatch = basePatch - regExpUrl + resourcePath

def dir = new File(basePatch)
dir.eachFileRecurse (FileType.FILES) { file ->
    list << file.getName()
}

list.each {
    println(it)
    switch (it[0] + it[1]) {
        case firstCase:println("1");break;
        case secondCase:println("2");break;
        case thirdCase:println("3");break;
    }
}
