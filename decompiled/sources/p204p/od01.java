package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class od01 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2524w8 f164062a;

    /* JADX INFO: renamed from: b */
    public final ig40 f164063b;

    public od01(AbstractC2524w8 abstractC2524w8, xrn0 xrn0Var) {
        this.f164062a = abstractC2524w8;
        this.f164063b = xrn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od01)) {
            return false;
        }
        od01 od01Var = (od01) obj;
        return this.f164062a.equals(od01Var.f164062a) && wj50.m88271j(this.f164063b, od01Var.f164063b);
    }

    public final int hashCode() {
        return this.f164063b.hashCode() + (this.f164062a.hashCode() * 31);
    }
}
