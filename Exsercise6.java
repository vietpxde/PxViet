package repetitivewords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class Exsercise6 {
//        static  char repetitive ;
//        public static void main(String[] args) {
//        
//    }

//    public static void main(String args[]) {
//        String input = "This This is text text another another ";
//        String originalText = input;
//        String output = "";
//        Pattern p = Pattern.compile("\\b(\\w+)\\b\\s+\\b\\1\\b", Pattern.MULTILINE + Pattern.CASE_INSENSITIVE);
//        Matcher m = p.matcher(input);
//        System.out.println(m);
//        if (!m.find()) {
//            output = "No duplicates found, no changes made to data";
//        } else {
//            while (m.find()) {
//                if (output == "") {
//                    output = input.replaceFirst(m.group(), m.group(1));
//                } else {
//                    output = output.replaceAll(m.group(), m.group(1));
//                }
//            }
//            input = output;
//            m = p.matcher(input);
//            while (m.find()) {
//                output = "";
//                if (output == "") {
//                    output = input.replaceAll(m.group(), m.group(1));
//                } else {
//                    output = output.replaceAll(m.group(), m.group(1));
//                }
//            }
//        }
//        System.out.println("After removing duplicate the final string is : " + output);
//    }
//}
// 

//Expect output : this is text another 
//real output : this is text another 
    public static void main(String[] args) {
        String v = "Please 1 1  me now Please  !!!!";
        System.out.println(v.replaceAll("(.+?)\\1+"," Help "));
    }
}

//change v = please 1 1 1 me now Please .
//expect output : please Help Help Help me now Please !!!!
//real uotput : please Help Help me now Please .
//change v = Please 2 2   me now Please !!!!
//expect output : Please Help Help me now Please !!!!
//real output : Please 2 2   me now Please !!!!
// change  System.out.println(v.replaceAll("(.+?)\\1+","Help"));
//expect output : Please HelpHelp me now Please !!!!
//real output : PleaseHelp Helpme now Please !!!!
// change v = Please 1 1   me now Please !!!!
//expect output : Please Help  Help me now Please !!!!
//real output : Please Help  Help me now Please  Help 
//change String v = "Please to to  me now Please !!!!";
     //   System.out.println(v.replaceAll("(.+?)\\to+"," Help "));
// expect output : Please Help  Help me now Please !!!!
//real output : Please to to  me now Please !!!!
//change :public static void main(String[] args) {
//        String v = "Please 1 1  me now Please  !!!!";
//        System.out.println(v.replaceAll("(.+?)\\1+"," Help "));
//    }
//}
// expect output : Please Help Help me now Please !!!!
//real output : Please Help  Help me now Please Help  Help 