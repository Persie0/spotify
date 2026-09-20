package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mrn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final nrn0 f146585a;

    public mrn0(grn0 grn0Var) {
        this.f146585a = new nrn0(grn0Var.f83798a, grn0Var.f83800c, 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f146585a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        nrn0 nrn0Var = this.f146585a;
        Object objM65484a = nrn0Var.m65484a();
        nrn0Var.m65485b();
        return objM65484a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
