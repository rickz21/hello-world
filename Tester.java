import java.util.*;
public class Atest {
    public static void main(String arg[]){
		String text = "()<>[]{}\"z";
		text = text.replaceAll(">","&gt;");
        text = text.replaceAll("<","&lt;");
		text = text.replaceAll("[(]","&#40;");
		text = text.replaceAll("[)]","&#41;");
		text = text.replaceAll("\"", "\\\\\"");
		System.out.println(text);
    }
}
//this line was added in local repo
//added monday in notepad++
//which branch is this?
//again I don't know which branch
// on rickbranch?
//on richbranch again!!!!
// tues rickbranch at github
