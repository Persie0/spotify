package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rpp0 implements tpp0 {

    /* JADX INFO: renamed from: a */
    public final lpp0 f201622a;

    public rpp0(lpp0 lpp0Var) {
        this.f201622a = lpp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpp0) && wj50.m88271j(this.f201622a, ((rpp0) obj).f201622a);
    }

    public final int hashCode() {
        lpp0 lpp0Var = this.f201622a;
        if (lpp0Var == null) {
            return 0;
        }
        return lpp0Var.hashCode();
    }
}
