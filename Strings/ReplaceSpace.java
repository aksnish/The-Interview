package Strings;

//Replace spaces with %20
public class ReplaceSpace {
	private static char[] replaceSpaceInString(char[] str, int length) {
		int spaceCounter = 0;

		//First lets calculate number of spaces
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') 
				spaceCounter++;
		}

		//calculate new size
		int newLength = length + 2 * spaceCounter;

		char[] newArray = new char[newLength+1];
		newArray[newLength] = '\0';

		int newArrayPosition = 0;

		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				newArray[newArrayPosition] = '%';
				newArray[newArrayPosition+1] = '2';
				newArray[newArrayPosition+2] = '0';
				newArrayPosition = newArrayPosition + 3;
			}
			else {
				newArray[newArrayPosition] = str[i];
				newArrayPosition++;
			}
		}               
		return newArray;
	}

	public static void main(String[] args) {
		char[] array = {'a','b','c','d',' ','e','f','g',' ','h',' ','j'};
		System.out.println(replaceSpaceInString(array, array.length));
	}
}