package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ijm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f102845a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f102846b;

    public ijm0(String str, gkm0 gkm0Var) {
        this.f102845a = str;
        this.f102846b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijm0)) {
            return false;
        }
        ijm0 ijm0Var = (ijm0) obj;
        return wj50.m88271j(this.f102845a, ijm0Var.f102845a) && wj50.m88271j(this.f102846b, ijm0Var.f102846b);
    }

    public final int hashCode() {
        return this.f102846b.hashCode() + (this.f102845a.hashCode() * 31);
    }
}
