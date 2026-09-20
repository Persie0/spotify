package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bx50 {

    /* JADX INFO: renamed from: a */
    public final String f31786a;

    /* JADX INFO: renamed from: b */
    public final String f31787b;

    /* JADX INFO: renamed from: c */
    public final String f31788c;

    /* JADX INFO: renamed from: d */
    public final boolean f31789d;

    /* JADX INFO: renamed from: e */
    public final boolean f31790e;

    public bx50(String str, String str2, String str3, boolean z, boolean z2) {
        this.f31786a = str;
        this.f31787b = str2;
        this.f31788c = str3;
        this.f31789d = z;
        this.f31790e = z2;
    }

    /* JADX INFO: renamed from: a */
    public static bx50 m30759a(bx50 bx50Var, String str, String str2) {
        return new bx50(str, bx50Var.f31787b, str2, bx50Var.f31789d, bx50Var.f31790e);
    }

    /* JADX INFO: renamed from: b */
    public final String m30760b() {
        return this.f31787b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m30761c() {
        return this.f31790e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx50)) {
            return false;
        }
        bx50 bx50Var = (bx50) obj;
        return wj50.m88271j(this.f31786a, bx50Var.f31786a) && wj50.m88271j(this.f31787b, bx50Var.f31787b) && wj50.m88271j(this.f31788c, bx50Var.f31788c) && this.f31789d == bx50Var.f31789d && this.f31790e == bx50Var.f31790e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f31786a.hashCode() * 31, 31, this.f31787b);
        String str = this.f31788c;
        return Boolean.hashCode(this.f31790e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f31789d);
    }
}
