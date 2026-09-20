package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class etk0 {

    /* JADX INFO: renamed from: a */
    public final String f62736a;

    /* JADX INFO: renamed from: b */
    public final String f62737b;

    /* JADX INFO: renamed from: c */
    public final String f62738c;

    /* JADX INFO: renamed from: d */
    public final int f62739d;

    public etk0(String str, String str2, int i, String str3) {
        this.f62736a = str;
        this.f62737b = str2;
        this.f62738c = str3;
        this.f62739d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etk0)) {
            return false;
        }
        etk0 etk0Var = (etk0) obj;
        return wj50.m88271j(this.f62736a, etk0Var.f62736a) && wj50.m88271j(this.f62737b, etk0Var.f62737b) && wj50.m88271j(this.f62738c, etk0Var.f62738c) && this.f62739d == etk0Var.f62739d;
    }

    public final int hashCode() {
        String str = this.f62736a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62737b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62738c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        int i = this.f62739d;
        return iHashCode3 + (i != 0 ? edb.m38547C(i) : 0);
    }
}
