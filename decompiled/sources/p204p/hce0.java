package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hce0 implements vn50 {

    /* JADX INFO: renamed from: a */
    public final String f89774a;

    /* JADX INFO: renamed from: b */
    public final String f89775b;

    /* JADX INFO: renamed from: c */
    public final String f89776c;

    /* JADX INFO: renamed from: d */
    public final fce0 f89777d;

    /* JADX INFO: renamed from: e */
    public final fce0 f89778e;

    /* JADX INFO: renamed from: f */
    public final boolean f89779f;

    /* JADX INFO: renamed from: g */
    public final fo01 f89780g;

    /* JADX INFO: renamed from: h */
    public final int f89781h;

    public hce0(String str, String str2, String str3, fce0 fce0Var, fce0 fce0Var2, boolean z, fo01 fo01Var, int i) {
        this.f89774a = str;
        this.f89775b = str2;
        this.f89776c = str3;
        this.f89777d = fce0Var;
        this.f89778e = fce0Var2;
        this.f89779f = z;
        this.f89780g = fo01Var;
        this.f89781h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hce0)) {
            return false;
        }
        hce0 hce0Var = (hce0) obj;
        return wj50.m88271j(this.f89774a, hce0Var.f89774a) && wj50.m88271j(this.f89775b, hce0Var.f89775b) && wj50.m88271j(this.f89776c, hce0Var.f89776c) && this.f89777d.equals(hce0Var.f89777d) && this.f89778e.equals(hce0Var.f89778e) && this.f89779f == hce0Var.f89779f && this.f89780g.equals(hce0Var.f89780g) && this.f89781h == hce0Var.f89781h;
    }

    public final int hashCode() {
        return edb.m38547C(this.f89781h) + ((this.f89780g.hashCode() + s571.m77245d((this.f89778e.hashCode() + ((this.f89777d.hashCode() + s571.m77243b(s571.m77243b(this.f89774a.hashCode() * 31, 31, this.f89775b), 31, this.f89776c)) * 31)) * 31, 31, this.f89779f)) * 31);
    }
}
