package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lyw0 implements rtr {

    /* JADX INFO: renamed from: a */
    public final String f138125a;

    /* JADX INFO: renamed from: b */
    public final boolean f138126b;

    public lyw0(String str, boolean z) {
        this.f138125a = str;
        this.f138126b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyw0)) {
            return false;
        }
        lyw0 lyw0Var = (lyw0) obj;
        return wj50.m88271j(this.f138125a, lyw0Var.f138125a) && this.f138126b == lyw0Var.f138126b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138126b) + (this.f138125a.hashCode() * 31);
    }
}
