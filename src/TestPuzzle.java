public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava pj = new PuzzleJava();
        System.out.println(pj.getTenRolls());
        System.out.println(pj.getRandomCharacter(pj.alphabet));
        System.out.println(pj.generatePassword());
        String[] passwords = pj.getNewPasswordSet(16);
        for (int i = 0; i < passwords.length; i++) {
            System.out.println(passwords[i]);
        }
        String[] shuffled = pj.shuffleArray(passwords);
        for (String pwd : shuffled) {
            System.out.println(pwd);
        }
    }
}