package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class krn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125691a;

    /* JADX INFO: renamed from: b */
    public final nrn0 f125692b;

    public krn0(grn0 grn0Var, int i) {
        this.f125691a = i;
        switch (i) {
            case 1:
                this.f125692b = new nrn0(grn0Var.f83798a, grn0Var.f83800c, 0);
                break;
            default:
                this.f125692b = new nrn0(grn0Var.f83798a, grn0Var.f83800c, 0);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f125691a) {
            case 0:
                break;
        }
        return this.f125692b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f125691a) {
            case 0:
                nrn0 nrn0Var = this.f125692b;
                return new tgc0(1, nrn0Var.f157587b, nrn0Var.m65485b().f221904a);
            default:
                return this.f125692b.m65485b().f221904a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f125691a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
