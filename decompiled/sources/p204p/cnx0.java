package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cnx0 {

    /* JADX INFO: renamed from: a */
    public final String f40118a;

    /* JADX INFO: renamed from: b */
    public final int f40119b;

    /* JADX INFO: renamed from: c */
    public final int f40120c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f40121d;

    /* JADX INFO: renamed from: e */
    public final int f40122e;

    public cnx0(String str, int i, int i2, int i3, String str2) {
        this.f40118a = str;
        this.f40119b = i;
        this.f40120c = i2;
        this.f40121d = str2;
        this.f40122e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnx0)) {
            return false;
        }
        cnx0 cnx0Var = (cnx0) obj;
        return wj50.m88271j(this.f40118a, cnx0Var.f40118a) && this.f40119b == cnx0Var.f40119b && this.f40120c == cnx0Var.f40120c && wj50.m88271j(this.f40121d, cnx0Var.f40121d) && this.f40122e == cnx0Var.f40122e;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f40120c, f710.m40938f(this.f40119b, this.f40118a.hashCode() * 31, 31), 31);
        CharSequence charSequence = this.f40121d;
        return Integer.hashCode(this.f40122e) + ((iM40938f + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }
}
