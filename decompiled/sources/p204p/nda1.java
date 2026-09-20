package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nda1 {

    /* JADX INFO: renamed from: a */
    public final ofy0 f152726a;

    /* JADX INFO: renamed from: b */
    public final nfy0 f152727b;

    /* JADX INFO: renamed from: c */
    public final pfy0 f152728c;

    public nda1(ofy0 ofy0Var, nfy0 nfy0Var, pfy0 pfy0Var) {
        this.f152726a = ofy0Var;
        this.f152727b = nfy0Var;
        this.f152728c = pfy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nda1)) {
            return false;
        }
        nda1 nda1Var = (nda1) obj;
        return this.f152726a.equals(nda1Var.f152726a) && this.f152727b.equals(nda1Var.f152727b) && this.f152728c.equals(nda1Var.f152728c);
    }

    public final int hashCode() {
        return (this.f152728c.hashCode() + ((this.f152727b.hashCode() + (this.f152726a.hashCode() * 31)) * 31)) * 961;
    }
}
