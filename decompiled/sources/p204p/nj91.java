package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nj91 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public Object[] f154532a = lj91.f134015e.f134019d;

    /* JADX INFO: renamed from: b */
    public int f154533b;

    /* JADX INFO: renamed from: c */
    public int f154534c;

    /* JADX INFO: renamed from: a */
    public final void m64602a(int i, int i2, Object[] objArr) {
        this.f154532a = objArr;
        this.f154533b = i;
        this.f154534c = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f154534c < this.f154533b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
