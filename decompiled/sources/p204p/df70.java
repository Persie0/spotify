package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class df70 {

    /* JADX INFO: renamed from: a */
    public final String f48503a;

    /* JADX INFO: renamed from: b */
    public final String f48504b;

    /* JADX INFO: renamed from: c */
    public final boolean f48505c;

    /* JADX INFO: renamed from: d */
    public final boolean f48506d;

    /* JADX INFO: renamed from: e */
    public final boolean f48507e;

    public df70(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f48503a = str;
        this.f48504b = str2;
        this.f48505c = z;
        this.f48506d = z2;
        this.f48507e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df70)) {
            return false;
        }
        df70 df70Var = (df70) obj;
        return wj50.m88271j(this.f48503a, df70Var.f48503a) && wj50.m88271j(this.f48504b, df70Var.f48504b) && this.f48505c == df70Var.f48505c && this.f48506d == df70Var.f48506d && this.f48507e == df70Var.f48507e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48507e) + s571.m77245d(s571.m77245d(s571.m77243b(this.f48503a.hashCode() * 31, 31, this.f48504b), 31, this.f48505c), 31, this.f48506d);
    }
}
