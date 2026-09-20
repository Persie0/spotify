package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lp0 {

    /* JADX INFO: renamed from: a */
    public final gh0 f135585a;

    /* JADX INFO: renamed from: b */
    public final String f135586b;

    /* JADX INFO: renamed from: c */
    public final boolean f135587c;

    /* JADX INFO: renamed from: d */
    public final String f135588d;

    /* JADX INFO: renamed from: e */
    public final String f135589e;

    /* JADX INFO: renamed from: f */
    public final it91 f135590f;

    public lp0(gh0 gh0Var, String str, boolean z, String str2, String str3, it91 it91Var) {
        this.f135585a = gh0Var;
        this.f135586b = str;
        this.f135587c = z;
        this.f135588d = str2;
        this.f135589e = str3;
        this.f135590f = it91Var;
    }

    /* JADX INFO: renamed from: a */
    public final gh0 m59583a() {
        return this.f135585a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp0)) {
            return false;
        }
        lp0 lp0Var = (lp0) obj;
        return wj50.m88271j(this.f135585a, lp0Var.f135585a) && wj50.m88271j(this.f135586b, lp0Var.f135586b) && this.f135587c == lp0Var.f135587c && wj50.m88271j(this.f135588d, lp0Var.f135588d) && wj50.m88271j(this.f135589e, lp0Var.f135589e) && wj50.m88271j(this.f135590f, lp0Var.f135590f);
    }

    public final int hashCode() {
        gh0 gh0Var = this.f135585a;
        int iHashCode = (gh0Var == null ? 0 : gh0Var.hashCode()) * 31;
        String str = this.f135586b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f135587c);
        String str2 = this.f135588d;
        int iHashCode2 = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f135589e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        it91 it91Var = this.f135590f;
        return iHashCode3 + (it91Var != null ? it91Var.hashCode() : 0);
    }
}
