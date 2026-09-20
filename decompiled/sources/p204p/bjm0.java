package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f27719a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f27720b;

    public bjm0(String str, gkm0 gkm0Var) {
        this.f27719a = str;
        this.f27720b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjm0)) {
            return false;
        }
        bjm0 bjm0Var = (bjm0) obj;
        return wj50.m88271j(this.f27719a, bjm0Var.f27719a) && wj50.m88271j(this.f27720b, bjm0Var.f27720b);
    }

    public final int hashCode() {
        return this.f27720b.hashCode() + (this.f27719a.hashCode() * 31);
    }
}
