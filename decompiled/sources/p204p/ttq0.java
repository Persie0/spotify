package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ttq0 extends jjf1 {

    /* JADX INFO: renamed from: d */
    public final String f223663d;

    /* JADX INFO: renamed from: e */
    public final boolean f223664e;

    public ttq0(String str, boolean z) {
        this.f223663d = str;
        this.f223664e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttq0)) {
            return false;
        }
        ttq0 ttq0Var = (ttq0) obj;
        return wj50.m88271j(this.f223663d, ttq0Var.f223663d) && this.f223664e == ttq0Var.f223664e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223664e) + (this.f223663d.hashCode() * 31);
    }
}
