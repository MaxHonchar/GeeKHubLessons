package ua.max.test.modal

import groovy.io.FileType
import test.homeTask2.HomeTask2

/**
 * Created with IntelliJ IDEA.
 * User: Max
 * Date: 15.10.13
 * Time: 1:08
 * To change this template use File | Settings | File Templates.
 */

def list = []
def basePatch =  new File(".").getCanonicalPath()
def resourcePath = "\\resources\\homeTask2"
def regExpUrl = "\\ua\\max\\test\\modal"
def firstCase = "a_"
def secondCase = "1_"
def thirdCase = "d_"
def size = 4;
def random = new Random();
def formatDate = "YYYY-MM-DD HH-MM-SS";
def date = new Date();
def mass = new Integer[size][size];
def sum = 0;

HomeTask2 homeTask2 = new HomeTask2();
basePatch = basePatch - regExpUrl + resourcePath

def dir = new File(basePatch)
dir.eachFileRecurse (FileType.FILES) { file ->
    list << file.getName()
}

list.each {
    switch (it[0] + it[1]) {
        case firstCase:
            def count = homeTask2.getCountByLetter(it, "a");
            homeTask2.writeIntoFile(it, count, basePatch);
            break;
        case secondCase:
            mass = homeTask2.inputMass(mass, random);
            sum = homeTask2.sumDiagonalsOfMatrix(mass);
            homeTask2.writeIntoFile(it, sum, basePatch);
            break;
        case thirdCase:
            def formatedDate = homeTask2.parseDate(date, formatDate);
            homeTask2.writeIntoFile(it, formatedDate, basePatch);
            break;
    }
}
