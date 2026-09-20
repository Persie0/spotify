package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jsc0 {

    /* JADX INFO: renamed from: a */
    public final String f115473a;

    /* JADX INFO: renamed from: b */
    public final String f115474b;

    /* JADX INFO: renamed from: c */
    public final boolean f115475c;

    /* JADX INFO: renamed from: d */
    public final boolean f115476d;

    /* JADX INFO: renamed from: e */
    public final gtc0 f115477e;

    public jsc0(String str, String str2, boolean z, boolean z2, gtc0 gtc0Var) {
        this.f115473a = str;
        this.f115474b = str2;
        this.f115475c = z;
        this.f115476d = z2;
        this.f115477e = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsc0)) {
            return false;
        }
        jsc0 jsc0Var = (jsc0) obj;
        return wj50.m88271j(this.f115473a, jsc0Var.f115473a) && wj50.m88271j(this.f115474b, jsc0Var.f115474b) && this.f115475c == jsc0Var.f115475c && this.f115476d == jsc0Var.f115476d && wj50.m88271j(this.f115477e, jsc0Var.f115477e);
    }

    public final int hashCode() {
        int iHashCode = this.f115473a.hashCode() * 31;
        String str = this.f115474b;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f115475c), 31, this.f115476d);
        gtc0 gtc0Var = this.f115477e;
        return iM77245d + (gtc0Var != null ? gtc0Var.hashCode() : 0);
    }

    public /* synthetic */ jsc0(int i, String str, String str2, boolean z, boolean z2) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (gtc0) null);
    }
}
