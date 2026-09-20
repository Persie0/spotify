package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n4r0 {

    /* JADX INFO: renamed from: a */
    public final s8k f150408a;

    /* JADX INFO: renamed from: b */
    public final zbr f150409b;

    /* JADX INFO: renamed from: c */
    public final cg21 f150410c;

    /* JADX INFO: renamed from: d */
    public final boolean f150411d;

    public n4r0(s8k s8kVar, zbr zbrVar, cg21 cg21Var, boolean z) {
        this.f150408a = s8kVar;
        this.f150409b = zbrVar;
        this.f150410c = cg21Var;
        this.f150411d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4r0)) {
            return false;
        }
        n4r0 n4r0Var = (n4r0) obj;
        return wj50.m88271j(this.f150408a, n4r0Var.f150408a) && wj50.m88271j(this.f150409b, n4r0Var.f150409b) && wj50.m88271j(this.f150410c, n4r0Var.f150410c) && this.f150411d == n4r0Var.f150411d;
    }

    public final int hashCode() {
        s8k s8kVar = this.f150408a;
        int iHashCode = (s8kVar == null ? 0 : s8kVar.hashCode()) * 31;
        zbr zbrVar = this.f150409b;
        int iHashCode2 = (iHashCode + (zbrVar == null ? 0 : zbrVar.hashCode())) * 31;
        cg21 cg21Var = this.f150410c;
        return Boolean.hashCode(this.f150411d) + ((iHashCode2 + (cg21Var != null ? cg21Var.hashCode() : 0)) * 31);
    }
}
