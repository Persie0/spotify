package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yoq0 {

    /* JADX INFO: renamed from: a */
    public final hg20 f274717a;

    /* JADX INFO: renamed from: b */
    public final int f274718b;

    public yoq0(hg20 hg20Var, int i) {
        this.f274717a = hg20Var;
        this.f274718b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoq0)) {
            return false;
        }
        yoq0 yoq0Var = (yoq0) obj;
        return wj50.m88271j(this.f274717a, yoq0Var.f274717a) && this.f274718b == yoq0Var.f274718b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f274718b) + (this.f274717a.hashCode() * 31);
    }
}
