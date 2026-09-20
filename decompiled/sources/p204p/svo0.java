package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class svo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f214477a;

    /* JADX INFO: renamed from: b */
    public final String f214478b;

    /* JADX INFO: renamed from: c */
    public final String f214479c;

    /* JADX INFO: renamed from: d */
    public final boolean f214480d;

    public svo0(String str, String str2, String str3, boolean z) {
        this.f214477a = str;
        this.f214478b = str2;
        this.f214479c = str3;
        this.f214480d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svo0)) {
            return false;
        }
        svo0 svo0Var = (svo0) obj;
        return wj50.m88271j(this.f214477a, svo0Var.f214477a) && wj50.m88271j(this.f214478b, svo0Var.f214478b) && wj50.m88271j(this.f214479c, svo0Var.f214479c) && this.f214480d == svo0Var.f214480d;
    }

    public final int hashCode() {
        int iHashCode = this.f214477a.hashCode() * 31;
        String str = this.f214478b;
        return Boolean.hashCode(this.f214480d) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f214479c);
    }
}
