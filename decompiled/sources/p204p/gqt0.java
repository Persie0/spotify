package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gqt0 {

    /* JADX INFO: renamed from: a */
    public final v4j0 f83529a;

    /* JADX INFO: renamed from: b */
    public final boolean f83530b;

    public gqt0(v4j0 v4j0Var, boolean z) {
        this.f83529a = v4j0Var;
        this.f83530b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqt0)) {
            return false;
        }
        gqt0 gqt0Var = (gqt0) obj;
        return wj50.m88271j(this.f83529a, gqt0Var.f83529a) && this.f83530b == gqt0Var.f83530b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83530b) + (this.f83529a.hashCode() * 31);
    }
}
