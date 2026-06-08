public class FootballMatchReports {
    static String description;
    public static String onField(int shirtNum) {
        switch (shirtNum) {
            case 1 -> description = "goalie";
            case 2 -> description = "left back";
            case 3, 4 -> description  = "center back";
            case 5 -> description = "right back";
            case 6, 7, 8 -> description = "midfielder";
            case 9 -> description = "left wing";
            case 10 -> description = "striker";
            case 11 -> description = "right wing";
            default -> description = "invalid";
        }
        return description;
    }
}
