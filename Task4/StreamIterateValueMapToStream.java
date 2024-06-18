package Task4;


import java.util.stream.Stream;

public class StreamIterateValueMapToStream {

    public Stream<Long> SetValueMapToStream(long seed, long a, long c, long m) {
        final Stream<Long> iterate = Stream.iterate(seed, x -> (a * x + c) % m);
        return iterate;

    }
}
