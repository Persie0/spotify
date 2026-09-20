package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class re30 implements we30 {

    /* JADX INFO: renamed from: a */
    public final String f198265a;

    /* JADX INFO: renamed from: b */
    public final int f198266b;

    /* JADX INFO: renamed from: c */
    public final int f198267c;

    /* JADX INFO: renamed from: d */
    public final int f198268d;

    /* JADX INFO: renamed from: e */
    public final Float f198269e;

    /* JADX INFO: renamed from: f */
    public final Float f198270f;

    public re30(String str, int i, int i2, int i3, Float f, Float f2) {
        this.f198265a = str;
        this.f198266b = i;
        this.f198267c = i2;
        this.f198268d = i3;
        this.f198269e = f;
        this.f198270f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re30)) {
            return false;
        }
        re30 re30Var = (re30) obj;
        return this.f198265a.equals(re30Var.f198265a) && this.f198266b == re30Var.f198266b && this.f198267c == re30Var.f198267c && this.f198268d == re30Var.f198268d && wj50.m88271j(this.f198269e, re30Var.f198269e) && wj50.m88271j(this.f198270f, re30Var.f198270f);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f198268d, f710.m40938f(this.f198267c, f710.m40938f(this.f198266b, this.f198265a.hashCode() * 31, 31), 31), 31);
        Float f = this.f198269e;
        int iHashCode = (iM40938f + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f198270f;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }
}
