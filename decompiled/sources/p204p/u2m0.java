package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u2m0 {

    /* JADX INFO: renamed from: a */
    public final fpq0 f226119a;

    public u2m0(fpq0 fpq0Var) {
        this.f226119a = fpq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2m0) && wj50.m88271j(this.f226119a, ((u2m0) obj).f226119a);
    }

    public final int hashCode() {
        fpq0 fpq0Var = this.f226119a;
        if (fpq0Var == null) {
            return 0;
        }
        return fpq0Var.hashCode();
    }
}
