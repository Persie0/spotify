package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a0l {

    /* JADX INFO: renamed from: a */
    public final String f11098a;

    /* JADX INFO: renamed from: b */
    public final int f11099b;

    /* JADX INFO: renamed from: c */
    public final long f11100c;

    /* JADX INFO: renamed from: d */
    public final String f11101d;

    public a0l(int i, String str, String str2, long j) {
        this.f11098a = str;
        this.f11099b = i;
        this.f11100c = j;
        this.f11101d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0l)) {
            return false;
        }
        a0l a0lVar = (a0l) obj;
        return wj50.m88271j(this.f11098a, a0lVar.f11098a) && this.f11099b == a0lVar.f11099b && this.f11100c == a0lVar.f11100c && wj50.m88271j(this.f11101d, a0lVar.f11101d);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(f710.m40938f(this.f11099b, this.f11098a.hashCode() * 31, 31), this.f11100c, 31);
        String str = this.f11101d;
        return iM36605e + (str == null ? 0 : str.hashCode());
    }
}
