package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t350 implements Iterator, pq60 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
