package menu.tool;

public class ValidChecker {
  public static void checkNumberOfCoach(String[] nameList) throws IllegalArgumentException {
    if (nameList.length>5||nameList.length<2) {
      throw new IllegalArgumentException("코치는 최소 2명 이상 입력해야 합니다.");
    }
  }
  public static void checkNameLength(String[] nameList) throws IllegalArgumentException {
    for(int i=0;i<nameList.length;i++){
      if(nameList[i].length()<2||nameList[i].length()>4)
        throw new IllegalArgumentException("코치의 이름은 최소 2글자, 최대 4글자여야 합니다.");
        return;
    }
  }
}
