package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ig81 {

    /* JADX INFO: renamed from: a */
    public final v140 f101926a;

    /* JADX INFO: renamed from: b */
    public final thj f101927b;

    /* JADX INFO: renamed from: c */
    public final boolean f101928c;

    /* JADX INFO: renamed from: d */
    public final v140 f101929d;

    public ig81(v140 v140Var, thj thjVar, boolean z, v140 v140Var2) {
        this.f101926a = v140Var;
        this.f101927b = thjVar;
        this.f101928c = z;
        this.f101929d = v140Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig81)) {
            return false;
        }
        ig81 ig81Var = (ig81) obj;
        return wj50.m88271j(this.f101926a, ig81Var.f101926a) && wj50.m88271j(this.f101927b, ig81Var.f101927b) && this.f101928c == ig81Var.f101928c && wj50.m88271j(this.f101929d, ig81Var.f101929d);
    }

    public final int hashCode() {
        return this.f101929d.hashCode() + s571.m77245d((this.f101927b.f220443a.hashCode() + (this.f101926a.hashCode() * 31)) * 31, 31, this.f101928c);
    }
}
