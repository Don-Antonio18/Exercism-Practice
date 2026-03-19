
class SqueakyClean {

    static String clean(String identifier) {
        // Base case: empty string
        if (identifier.equals(" ")) {
            return identifier;
        }

        // Replace spaces with underscores: "my  team" -> "my__team"
        if (identifier.contains(" ")) {
            identifier = identifier.replace(' ', '_');
        }

        // Replace 4,3,0,1 and 7 with a, e, o, l, and t,respectively.
        if (identifier.contains("4")) {
            identifier = identifier.replace('4', 'a');
        }
        if (identifier.contains("3")) {
            identifier = identifier.replace('3', 'e');
        }
        if (identifier.contains("0")) {
            identifier = identifier.replace('0', 'o');
        }
        if (identifier.contains("1")) {
            identifier = identifier.replace('1', 'l');
        }
        if (identifier.contains("7")) {
            identifier = identifier.replace('7', 't');
        }

        // Omit characters that are not letters while keeping _ & -
        if (identifier.matches(".*[^a-zA-Z\\s_-].*")) {
            // 2. Perform the replacement and SAVE it back to the variable
            identifier = identifier.replaceAll("[^a-zA-Z\\s_-]", "");
        }

        // Convert kebab-case to camelCase: "a-bc" -> aBc
        StringBuilder sb = new StringBuilder();
        boolean nextUpper = false;

        for (int i = 0; i < identifier.length(); i++) {
            char currentChar = identifier.charAt(i);

            if (currentChar == '-') {
                nextUpper = true;
            } else {

                if (nextUpper) {
                    // Add uppcase version of next char to string
                    sb.append(Character.toUpperCase(currentChar));
                    nextUpper = false;
                }
                else {
                    // Add normal version of next char to string
                    sb.append(currentChar);
                }

            }

        }

        return sb.toString();
    }

    // Test Cases
    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("my   ID"));
        System.out.println(SqueakyClean.clean("a-bc"));
        System.out.println(SqueakyClean.clean("43017"));
        System.out.println(SqueakyClean.clean("a$#.b"));


    }
}
