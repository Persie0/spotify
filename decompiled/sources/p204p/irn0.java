package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class irn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105014a;

    /* JADX INFO: renamed from: b */
    public final jrn0 f105015b;

    public irn0(hrn0 hrn0Var, int i) {
        this.f105014a = i;
        switch (i) {
            case 1:
                this.f105015b = new jrn0(hrn0Var.f94490b, hrn0Var);
                break;
            case 2:
                this.f105015b = new jrn0(hrn0Var.f94490b, hrn0Var);
                break;
            default:
                this.f105015b = new jrn0(hrn0Var.f94490b, hrn0Var);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f105014a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f105015b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f105014a) {
            case 0:
                jrn0 jrn0Var = this.f105015b;
                return new cpi0(jrn0Var.f115237b.f94492d, jrn0Var.f115238c, jrn0Var.next());
            case 1:
                jrn0 jrn0Var2 = this.f105015b;
                jrn0Var2.next();
                return jrn0Var2.f115238c;
            default:
                return this.f105015b.next().f221904a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f105014a) {
            case 0:
                this.f105015b.remove();
                break;
            case 1:
                this.f105015b.remove();
                break;
            default:
                this.f105015b.remove();
                break;
        }
    }
}
