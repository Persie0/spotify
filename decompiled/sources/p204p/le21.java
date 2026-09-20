package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class le21 extends AbstractC2246p7 {

    /* JADX INFO: renamed from: c */
    public final Object f132437c;

    public le21(Object obj, int i) {
        super(i, 1);
        this.f132437c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f174531a++;
        return this.f132437c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f174531a--;
        return this.f132437c;
    }
}
