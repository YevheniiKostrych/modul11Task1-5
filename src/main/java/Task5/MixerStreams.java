package Task5;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MixerStreams {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        Iterator<T> zippedIterator = new Iterator<T>() {
            private boolean alternate = true;

            public boolean hasNext() {
                return iterator1.hasNext() && iterator2.hasNext();
            }

            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T nextElement;
                if (alternate) {
                    nextElement = iterator1.next();
                } else {
                    nextElement = iterator2.next();
                }
                alternate = !alternate;
                return nextElement;
            }
        };

        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(zippedIterator, Spliterator.ORDERED);
        return StreamSupport.stream(spliterator, false);
    }
}
