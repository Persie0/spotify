package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bxc {

    /* JADX INFO: renamed from: a */
    public final uyc f31818a;

    /* JADX INFO: renamed from: b */
    public final j4m0 f31819b;

    /* JADX INFO: renamed from: c */
    public final boolean f31820c;

    /* JADX INFO: renamed from: d */
    public final boolean f31821d;

    public bxc(uyc uycVar, j4m0 j4m0Var, boolean z, boolean z2) {
        this.f31818a = uycVar;
        this.f31819b = j4m0Var;
        this.f31820c = z;
        this.f31821d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static bxc m30812a(bxc bxcVar, tyc tycVar, int i) {
        uyc uycVar = tycVar;
        if ((i & 1) != 0) {
            uycVar = bxcVar.f31818a;
        }
        bxcVar.getClass();
        j4m0 j4m0Var = bxcVar.f31819b;
        boolean z = bxcVar.f31820c;
        boolean z2 = (i & 16) != 0 ? bxcVar.f31821d : true;
        bxcVar.getClass();
        return new bxc(uycVar, j4m0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxc)) {
            return false;
        }
        bxc bxcVar = (bxc) obj;
        return wj50.m88271j(this.f31818a, bxcVar.f31818a) && this.f31819b.equals(bxcVar.f31819b) && this.f31820c == bxcVar.f31820c && this.f31821d == bxcVar.f31821d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31821d) + s571.m77245d((this.f31819b.hashCode() + s571.m77245d(this.f31818a.hashCode() * 31, 31, true)) * 31, 31, this.f31820c);
    }
}
