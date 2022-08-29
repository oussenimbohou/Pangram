import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean isPangram(String input) {
        if(input.isEmpty() || input.length() == 0) return false;
        ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 97;i<123;i++) {
			list.add((char)i);
		}
	    Set<Character> inputList = Arrays.asList(input.split(""))
                                   .stream()
	    						   .filter(e->Character
                                   .isLetter(e.charAt(0)))
	    						   .map(e->Character
                                    .toLowerCase(e.charAt(0)))
	    							.collect(Collectors.toSet());
		return list.size() == inputList.size();
    }

}
