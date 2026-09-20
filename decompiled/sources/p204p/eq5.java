package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eq5 {

    /* JADX INFO: renamed from: a */
    public final String f61786a;

    /* JADX INFO: renamed from: b */
    public final String f61787b;

    /* JADX INFO: renamed from: c */
    public final String f61788c;

    /* JADX INFO: renamed from: d */
    public final int f61789d;

    /* JADX INFO: renamed from: e */
    public final String f61790e;

    /* JADX INFO: renamed from: f */
    public final w9s f61791f;

    public eq5(String str, String str2, String str3, int i, String str4, w9s w9sVar) {
        this.f61786a = str;
        this.f61787b = str2;
        this.f61788c = str3;
        this.f61789d = i;
        this.f61790e = str4;
        this.f61791f = w9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq5)) {
            return false;
        }
        eq5 eq5Var = (eq5) obj;
        return wj50.m88271j(this.f61786a, eq5Var.f61786a) && wj50.m88271j(this.f61787b, eq5Var.f61787b) && wj50.m88271j(this.f61788c, eq5Var.f61788c) && this.f61789d == eq5Var.f61789d && wj50.m88271j(this.f61790e, eq5Var.f61790e) && this.f61791f == eq5Var.f61791f;
    }

    public final int hashCode() {
        return this.f61791f.hashCode() + s571.m77243b(mt60.m62800g(this.f61789d, s571.m77243b(s571.m77243b(this.f61786a.hashCode() * 31, 31, this.f61787b), 31, this.f61788c), 31), 31, this.f61790e);
    }
}
