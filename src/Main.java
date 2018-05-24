import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String value = "aaa";
        String value_null = null;

        Optional<String> value_o = Optional.of(value);
        System.out.println("Optionalができたよ。" + value_o.toString());

        try {
            Optional.of(value_null);
        } catch (Exception e) {
            System.out.println("ぬるぽだよ。" + e.getMessage());
        }

        Optional<String> value_o2 = Optional.ofNullable(value);
        System.out.println("Optionalができたよ。" + value_o2.toString());

        Optional<String> value_null2 = Optional.ofNullable(null);
        System.out.println("Optionalができたよ。" + value_null2.toString());


        Optional<String> value_o3 = Optional.ofNullable(value);
        System.out.println("map()だけだと、Optionalが付いたままだよ。" + value_o3.map(v -> v + ":bbb"));

        Optional<String> value_o4 = Optional.ofNullable(value);
        System.out.println("map().orElse〜だと、Optionalが外れるよ。" + value_o3.map(v -> v + ":bbb").orElse(""));
        System.out.println("map().orElse〜だと、Optionalが外れるよ。" + value_o3.map(v -> v + ":bbb").orElseThrow(() -> new RuntimeException("")));
        System.out.println("map().orElse〜だと、Optionalが外れるよ。" + value_o3.map(v -> v + ":bbb").orElseGet(() -> {
            return "";
        }));

        Optional<String> value_o5 = Optional.ofNullable(value);
        if (value_o5.isPresent()) {
            System.out.println("Optionalの値があるよ。" + value_o5.toString());
        }

        Optional<String> value_null5 = Optional.ofNullable(null);
        if (!value_null5.isPresent()) {
            System.out.println("Optionalの値がないよ。" + value_null5.toString());
        }

        Optional<String> value_o6 = Optional.ofNullable(value);
        System.out.println("Optionalの値を取得するよ。" + value_o6.get());

    }

}
