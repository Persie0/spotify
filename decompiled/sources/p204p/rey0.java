package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rey0 {

    /* JADX INFO: renamed from: a */
    public final String f198451a;

    /* JADX INFO: renamed from: b */
    public final String f198452b;

    /* JADX INFO: renamed from: c */
    public final xfy0 f198453c;

    /* JADX INFO: renamed from: d */
    public final yfy0 f198454d;

    public rey0(String str, String str2, xfy0 xfy0Var, yfy0 yfy0Var) {
        this.f198451a = str;
        this.f198452b = str2;
        this.f198453c = xfy0Var;
        this.f198454d = yfy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rey0)) {
            return false;
        }
        rey0 rey0Var = (rey0) obj;
        return wj50.m88271j(this.f198451a, rey0Var.f198451a) && wj50.m88271j(this.f198452b, rey0Var.f198452b) && wj50.m88271j(this.f198453c, rey0Var.f198453c) && wj50.m88271j(this.f198454d, rey0Var.f198454d);
    }

    public final int hashCode() {
        return this.f198454d.hashCode() + ((this.f198453c.hashCode() + s571.m77243b(this.f198451a.hashCode() * 31, 31, this.f198452b)) * 31);
    }
}
