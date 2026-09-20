package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q520 {

    /* JADX INFO: renamed from: a */
    public final String f185383a;

    /* JADX INFO: renamed from: b */
    public final String f185384b;

    /* JADX INFO: renamed from: c */
    public final String f185385c;

    /* JADX INFO: renamed from: d */
    public final int f185386d;

    /* JADX INFO: renamed from: e */
    public final String f185387e;

    public q520(int i, String str, String str2, String str3, String str4) {
        this.f185383a = str;
        this.f185384b = str2;
        this.f185385c = str3;
        this.f185386d = i;
        this.f185387e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q520)) {
            return false;
        }
        q520 q520Var = (q520) obj;
        return wj50.m88271j(this.f185383a, q520Var.f185383a) && wj50.m88271j(this.f185384b, q520Var.f185384b) && wj50.m88271j(this.f185385c, q520Var.f185385c) && this.f185386d == q520Var.f185386d && wj50.m88271j(this.f185387e, q520Var.f185387e);
    }

    public final int hashCode() {
        String str = this.f185383a;
        int iM62800g = mt60.m62800g(this.f185386d, s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f185384b), 31, this.f185385c), 31);
        String str2 = this.f185387e;
        return iM62800g + (str2 != null ? str2.hashCode() : 0);
    }
}
