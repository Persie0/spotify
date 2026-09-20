package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f3j0 {

    /* JADX INFO: renamed from: a */
    public final voc1 f65520a;

    /* JADX INFO: renamed from: b */
    public final gh00 f65521b;

    /* JADX INFO: renamed from: c */
    public final gh00 f65522c;

    public f3j0(voc1 voc1Var, gh00 gh00Var, gh00 gh00Var2) {
        this.f65520a = voc1Var;
        this.f65521b = gh00Var;
        this.f65522c = gh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3j0)) {
            return false;
        }
        f3j0 f3j0Var = (f3j0) obj;
        return wj50.m88271j(this.f65520a, f3j0Var.f65520a) && wj50.m88271j(this.f65521b, f3j0Var.f65521b) && wj50.m88271j(this.f65522c, f3j0Var.f65522c);
    }

    public final int hashCode() {
        voc1 voc1Var = this.f65520a;
        return this.f65522c.hashCode() + m6b.m60989d(this.f65521b, (voc1Var == null ? 0 : voc1Var.f243453a.hashCode()) * 31, 31);
    }
}
