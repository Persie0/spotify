package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i17 extends l17 {

    /* JADX INFO: renamed from: a */
    public final zgo0 f97424a;

    /* JADX INFO: renamed from: b */
    public final long f97425b;

    public i17(zgo0 zgo0Var, long j) {
        this.f97424a = zgo0Var;
        this.f97425b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i17)) {
            return false;
        }
        i17 i17Var = (i17) obj;
        return wj50.m88271j(this.f97424a, i17Var.f97424a) && this.f97425b == i17Var.f97425b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f97425b) + (this.f97424a.hashCode() * 31);
    }
}
