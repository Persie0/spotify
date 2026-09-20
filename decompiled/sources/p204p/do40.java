package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class do40 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50934a;

    /* JADX INFO: renamed from: b */
    public int f50935b;

    /* JADX INFO: renamed from: c */
    public final Object f50936c;

    public /* synthetic */ do40(Object obj, int i) {
        this.f50934a = i;
        this.f50936c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f50934a) {
            case 0:
                return ((Iterator) this.f50936c).hasNext();
            default:
                return this.f50935b < ((int[]) this.f50936c).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f50934a) {
            case 0:
                int i = this.f50935b;
                this.f50935b = i + 1;
                if (i >= 0) {
                    return new bo40(i, ((Iterator) this.f50936c).next());
                }
                h6f.m46722S();
                throw null;
            default:
                int i2 = this.f50935b;
                int[] iArr = (int[]) this.f50936c;
                if (i2 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f50935b));
                }
                this.f50935b = i2 + 1;
                return vr91.m86278a(iArr[i2]);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f50934a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
