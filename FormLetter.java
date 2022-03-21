public class FormLetter {
    public String replaceAll(String line, sub, repl) {
        while (line.indexOf(sub) > -1) {
            line = line.substring(0, line.indexOf(sub)) + repl + line.substring(0, line.indexOf(sub) + sub.length());
        }
        return line;
    }


    public void createPersonalizedLetters() {
        for (int i = 0; i < customers.size(); i++) {
            ArrayList<String> lns = makeCopy();
            for (int n = 0; n < lns.size(); n++) {
                String toPrint = lns.get(n);
                toPrint = replaceAll(toPrint, @, customers.get(i).getName());
                toPrint = replaceAll(toPrint, &, customers.get(i).getCity());
                toPrint = replaceAll(toPrint, $, customers.get(i).getState());
                System.out.println(toPrint);
            }
        }
    }


}
