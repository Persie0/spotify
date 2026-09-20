package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class ke21 extends AbstractC2204o7 {

    /* JADX INFO: renamed from: c */
    public final Object f121781c;

    public ke21(Object obj, int i) {
        super(i, 1);
        this.f121781c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f162442a++;
        return this.f121781c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f162442a--;
        return this.f121781c;
    }
}
