package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wke0 extends yke0 {

    /* JADX INFO: renamed from: a */
    public final String f252215a;

    /* JADX INFO: renamed from: b */
    public final String f252216b;

    /* JADX INFO: renamed from: c */
    public final long f252217c;

    /* JADX INFO: renamed from: d */
    public final long f252218d;

    /* JADX INFO: renamed from: e */
    public final mke0 f252219e;

    /* JADX INFO: renamed from: f */
    public final vke0 f252220f;

    public wke0(String str, String str2, long j, long j2, mke0 mke0Var, vke0 vke0Var) {
        this.f252215a = str;
        this.f252216b = str2;
        this.f252217c = j;
        this.f252218d = j2;
        this.f252219e = mke0Var;
        this.f252220f = vke0Var;
    }

    /* JADX INFO: renamed from: c */
    public static wke0 m88365c(wke0 wke0Var, String str, long j, long j2, int i) {
        String str2 = wke0Var.f252215a;
        if ((i & 2) != 0) {
            str = wke0Var.f252216b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            j = wke0Var.f252217c;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = wke0Var.f252218d;
        }
        mke0 mke0Var = wke0Var.f252219e;
        vke0 vke0Var = wke0Var.f252220f;
        wke0Var.getClass();
        return new wke0(str2, str3, j3, j2, mke0Var, vke0Var);
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: a */
    public final String mo26293a() {
        return this.f252215a;
    }

    @Override // p204p.ale0
    /* JADX INFO: renamed from: b */
    public final mke0 mo26294b() {
        return this.f252219e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wke0)) {
            return false;
        }
        wke0 wke0Var = (wke0) obj;
        return wj50.m88271j(this.f252215a, wke0Var.f252215a) && wj50.m88271j(this.f252216b, wke0Var.f252216b) && this.f252217c == wke0Var.f252217c && this.f252218d == wke0Var.f252218d && wj50.m88271j(this.f252219e, wke0Var.f252219e) && wj50.m88271j(this.f252220f, wke0Var.f252220f);
    }

    public final int hashCode() {
        int iHashCode = (this.f252219e.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f252215a.hashCode() * 31, 31, this.f252216b), this.f252217c, 31), this.f252218d, 31)) * 31;
        vke0 vke0Var = this.f252220f;
        return iHashCode + (vke0Var == null ? 0 : vke0Var.hashCode());
    }
}
