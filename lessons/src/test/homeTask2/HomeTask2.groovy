package test.homeTask2

class HomeTask2 {

    def inputMass(def mass, def random) {
        (0..<mass.size()).each { i ->
            (0..<mass[i].size()).each { j ->
                mass[i][j] = 1 + random.nextInt(5);
            }
        }

        return mass;
    }

    def sumDiagonalsOfMatrix(def mass) {
        def sum = 0;
        (0..<mass.size()).each { i ->
            sum += mass[i][i]
        }

        (mass.size() - 1..<0).each { i ->
            sum += mass[i][i]
        }

        return sum;
    }

    def getCountByLetter(def str, def letter) {
        def count = 0;
        str.each {
            if (it == letter) {
                count++;
            }
        }
        return count;
    }

    def outputMass(def mass) {
        (0..<mass.size()).each { i ->
            println()
            (0..<mass[i].size()).each { j ->
                print(mass[i][j] + " ")
            }
        }
    }

    def parseDate(Date date, def format) {
        def formattedDate;
        formattedDate = date.format(format)
        println(formattedDate)
        return formattedDate
    }

    def writeIntoFile(def title, def str, def basePatch) {

        File file = new File(basePatch + "\\" + title)
        if (file.exists()) {
            assert file.delete()
            assert file.createNewFile()
        }

        boolean append = true
        FileWriter fileWriter = new FileWriter(file, append)
        BufferedWriter buffWriter = new BufferedWriter(fileWriter)

        buffWriter.write str.toString()

        buffWriter.flush()
        buffWriter.close()

        file.renameTo( new File(basePatch + "\\" + "done_" +title) )
    }

}
