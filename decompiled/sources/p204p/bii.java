package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bii {

    /* JADX INFO: renamed from: a */
    public final boolean f27478a;

    /* JADX INFO: renamed from: b */
    public final boolean f27479b;

    /* JADX INFO: renamed from: c */
    public final String f27480c;

    /* JADX INFO: renamed from: d */
    public final String f27481d;

    /* JADX INFO: renamed from: e */
    public final d0n0 f27482e;

    /* JADX INFO: renamed from: f */
    public final agr0 f27483f;

    public bii(boolean z, boolean z2, String str, String str2, d0n0 d0n0Var, agr0 agr0Var) {
        this.f27478a = z;
        this.f27479b = z2;
        this.f27480c = str;
        this.f27481d = str2;
        this.f27482e = d0n0Var;
        this.f27483f = agr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bii)) {
            return false;
        }
        bii biiVar = (bii) obj;
        return this.f27478a == biiVar.f27478a && this.f27479b == biiVar.f27479b && wj50.m88271j(this.f27480c, biiVar.f27480c) && wj50.m88271j(this.f27481d, biiVar.f27481d) && wj50.m88271j(this.f27482e, biiVar.f27482e) && this.f27483f == biiVar.f27483f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f27478a) * 31, 31, this.f27479b);
        String str = this.f27480c;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27481d;
        return this.f27483f.hashCode() + ((this.f27482e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
