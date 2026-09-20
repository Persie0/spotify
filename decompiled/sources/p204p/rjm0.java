package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f199861a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f199862b;

    public rjm0(String str, gkm0 gkm0Var) {
        this.f199861a = str;
        this.f199862b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjm0)) {
            return false;
        }
        rjm0 rjm0Var = (rjm0) obj;
        return wj50.m88271j(this.f199861a, rjm0Var.f199861a) && wj50.m88271j(this.f199862b, rjm0Var.f199862b);
    }

    public final int hashCode() {
        return this.f199862b.hashCode() + (this.f199861a.hashCode() * 31);
    }
}
