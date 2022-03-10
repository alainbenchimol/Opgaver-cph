class Happy
{
    public static boolean happy = false;

    public static void main(String[] args) {
        if (iAmHappy()) {
            System.out.println("I clap my hands");
        } else {
            System.out.println("I don't clap my hands");
        }
    }

    public static boolean iAmHappy()
    {
        // fill out what is missing here:
        if (happy) {
            return true;
        }
        return false;
    }
}