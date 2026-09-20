package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t30 {

    /* JADX INFO: renamed from: a */
    public final String f216678a;

    /* JADX INFO: renamed from: b */
    public final String f216679b;

    /* JADX INFO: renamed from: c */
    public final String f216680c;

    /* JADX INFO: renamed from: d */
    public final String f216681d;

    /* JADX INFO: renamed from: e */
    public final String f216682e;

    /* JADX INFO: renamed from: f */
    public final n30 f216683f;

    public t30(String str, String str2, String str3, String str4, String str5, n30 n30Var) {
        this.f216678a = str;
        this.f216679b = str2;
        this.f216680c = str3;
        this.f216681d = str4;
        this.f216682e = str5;
        this.f216683f = n30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t30)) {
            return false;
        }
        t30 t30Var = (t30) obj;
        return wj50.m88271j(this.f216678a, t30Var.f216678a) && wj50.m88271j(this.f216679b, t30Var.f216679b) && wj50.m88271j(this.f216680c, t30Var.f216680c) && wj50.m88271j(this.f216681d, t30Var.f216681d) && wj50.m88271j(this.f216682e, t30Var.f216682e) && wj50.m88271j(this.f216683f, t30Var.f216683f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f216678a.hashCode() * 31, 31, this.f216679b), 31, this.f216680c), 31, this.f216681d), 31, this.f216682e);
        n30 n30Var = this.f216683f;
        return iM77243b + (n30Var == null ? 0 : n30Var.hashCode());
    }
}
