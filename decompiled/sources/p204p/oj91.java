package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oj91 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public Object[] f166018a = mj91.f144207e.f144211d;

    /* JADX INFO: renamed from: b */
    public int f166019b;

    /* JADX INFO: renamed from: c */
    public int f166020c;

    /* JADX INFO: renamed from: a */
    public final Object[] m67104a() {
        return this.f166018a;
    }

    /* JADX INFO: renamed from: b */
    public final int m67105b() {
        return this.f166020c;
    }

    /* JADX INFO: renamed from: c */
    public final void m67106c(int i, int i2, Object[] objArr) {
        this.f166018a = objArr;
        this.f166019b = i;
        this.f166020c = i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m67107d(int i) {
        this.f166020c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f166020c < this.f166019b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
