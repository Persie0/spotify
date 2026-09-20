package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class tkx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final chc0 f221238a;

    /* JADX INFO: renamed from: b */
    public sua f221239b;

    /* JADX INFO: renamed from: c */
    public int f221240c;

    public tkx0(ukx0 ukx0Var) {
        chc0 chc0Var = new chc0(ukx0Var);
        this.f221238a = chc0Var;
        this.f221239b = new sua(chc0Var.m32762a());
        this.f221240c = ukx0Var.f231381b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f221240c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f221239b.hasNext()) {
            this.f221239b = new sua(this.f221238a.m32762a());
        }
        this.f221240c--;
        return Byte.valueOf(this.f221239b.m79386a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
