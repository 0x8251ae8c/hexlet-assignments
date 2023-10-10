package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static void main(String[] args) {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"}
        };
        System.out.println(Arrays.deepToString(image));

//        String[] ff = Arrays.stream(image)
//                .flatMap(x -> Arrays.stream(x))
//                .toArray(String[]::new);
//        //System.out.println(Arrays.deepToString(ff));

        String[][] dd = Arrays.stream(image)
                .map(line -> {
                    String[] a = Arrays.stream(line)
                            .map(x -> x + x)
                            .toArray(String[]::new);
                    return String.join("", a).split("");
                })
                .toArray(String[][]::new);
        String[][] cc = new String[dd.length * 2][dd[0].length];
        for (var i = 0; i < dd.length; i += 1) {
            cc[2 * i] = dd[i].clone();
            cc[2 * i + 1] = dd[i].clone();
        }
        System.out.println(Arrays.deepToString(cc));
    }
    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] temp = Arrays.stream(image)
                .map(line -> {
                    String[] a = Arrays.stream(line)
                            .map(x -> x + x)
                            .toArray(String[]::new);
                    return String.join("", a).split("");
                })
                .toArray(String[][]::new);

        String[][] newImage = new String[temp.length * 2][temp[0].length];

        for (var i = 0; i < temp.length; i += 1) {
            newImage[2 * i] = temp[i].clone();
            newImage[2 * i + 1] = temp[i].clone();
        }
        return newImage;
    }
}
// END
