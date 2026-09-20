package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gif implements mif {

    /* JADX INFO: renamed from: a */
    public final uhf f80154a;

    /* JADX INFO: renamed from: b */
    public final int f80155b;

    /* JADX INFO: renamed from: c */
    public final boolean f80156c;

    public gif(int i, uhf uhfVar, boolean z) {
        this.f80154a = uhfVar;
        this.f80155b = i;
        this.f80156c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gif)) {
            return false;
        }
        gif gifVar = (gif) obj;
        return wj50.m88271j(this.f80154a, gifVar.f80154a) && this.f80155b == gifVar.f80155b && this.f80156c == gifVar.f80156c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f80156c) + mt60.m62800g(this.f80155b, this.f80154a.hashCode() * 31, 31);
    }
}
