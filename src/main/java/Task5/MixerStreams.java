package Task5;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MixerStreams {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        int size = Math.min(firstList.size(), secondList.size());

        return IntStream.range(0, size)
                .boxed()
                .flatMap(i -> Stream.of(firstList.get(i), secondList.get(i)));

    }
}
