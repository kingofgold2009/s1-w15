public class FriendsMain{
    public static void main(String[] args) {
        Friends a = new Friends();
        Name r = a.getRandomFriend();
        String n = r.fullName();
        System.out.println(n);
    }
}