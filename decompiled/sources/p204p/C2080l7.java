package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p.l7 */
/* JADX INFO: loaded from: classes11.dex */
public final class C2080l7 extends C2042k7 implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC2154n7 f130510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2080l7(AbstractC2154n7 abstractC2154n7, int i) {
        super(abstractC2154n7, 0);
        this.f130510d = abstractC2154n7;
        int iMo33075a = abstractC2154n7.mo33075a();
        if (i < 0 || i > iMo33075a) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", iMo33075a, ", size: "));
        }
        this.f119872b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f119872b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f119872b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f119872b - 1;
        this.f119872b = i;
        return this.f130510d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f119872b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
