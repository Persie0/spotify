package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r78 {

    /* JADX INFO: renamed from: a */
    public final String f196459a;

    /* JADX INFO: renamed from: b */
    public final String f196460b;

    /* JADX INFO: renamed from: c */
    public final xfr f196461c;

    /* JADX INFO: renamed from: d */
    public final int f196462d;

    public r78(String str, String str2, xfr xfrVar, int i) {
        this.f196459a = str;
        this.f196460b = str2;
        this.f196461c = xfrVar;
        this.f196462d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r78)) {
            return false;
        }
        r78 r78Var = (r78) obj;
        return wj50.m88271j(this.f196459a, r78Var.f196459a) && wj50.m88271j(this.f196460b, r78Var.f196460b) && this.f196461c == r78Var.f196461c && this.f196462d == r78Var.f196462d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f196462d) + ((this.f196461c.hashCode() + s571.m77243b(this.f196459a.hashCode() * 31, 31, this.f196460b)) * 31);
    }
}
