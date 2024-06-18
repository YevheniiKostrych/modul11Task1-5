package Task4;

import java.util.stream.Stream;

public class StreamIterateValueMapToStreamTest {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 1;


        StreamIterateValueMapToStream streamIterateValueMapToStream = new StreamIterateValueMapToStream();
        Stream<Long> iterateRandom = streamIterateValueMapToStream.SetValueMapToStream(seed, a, c, m);

        iterateRandom.limit(10).forEach(System.out::println);
    }
}
