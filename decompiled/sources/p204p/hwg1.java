package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class hwg1 extends o0f1 {

    /* JADX INFO: renamed from: b */
    public final Object f95941b;

    /* JADX INFO: renamed from: c */
    public boolean f95942c;

    public hwg1(Object obj) {
        super(8);
        this.f95941b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f95942c;
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f95942c) {
            throw new NoSuchElementException();
        }
        this.f95942c = true;
        return this.f95941b;
    }
}
