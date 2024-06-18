package Task5;

import java.util.stream.Stream;

public class MixerStreamsTest {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> second = Stream.of(7, 8, 9);
        Stream<Integer> zippedStream = MixerStreams.zip(first, second);
        zippedStream.forEach(System.out::println);
    }
}
