package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class ctz0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public boolean f42005a = true;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42006b;

    public ctz0(Object obj) {
        this.f42006b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42005a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f42005a) {
            throw new NoSuchElementException();
        }
        this.f42005a = false;
        return this.f42006b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
