package filters;

import java.io.Serializable;
import java.util.Comparator;

import model.Person;

public class FilterLastName implements Comparator<Person>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(Person per1, Person per2) {
		String name1=per1.getLastName();
		String name2=per2.getLastName();
		
		boolean flag=true;
		for(int j=0;j<name1.length()&&j<name2.length()&&flag;j++) {
			
			if(name1.charAt(j)==name2.charAt(j)) {
				flag=true;
			}else if(name1.charAt(j)>name2.charAt(j)){
				flag=false;
				return 1;
			}else {
				return -1;
			}
		}
		
		if(name1.length()>name2.length()) {
			return 1;
		}else if(name1.length()<name2.length()){
			return -1;
		}
		
		if(name1.equals(name2)) {
			return 0;
		}
		return 1;
	}
}
