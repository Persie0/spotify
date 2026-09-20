package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class alt0 {

    /* JADX INFO: renamed from: a */
    public final String f16981a;

    /* JADX INFO: renamed from: b */
    public final String f16982b;

    /* JADX INFO: renamed from: c */
    public final long f16983c;

    /* JADX INFO: renamed from: d */
    public final int f16984d;

    public alt0(int i, String str, String str2, long j) {
        this.f16981a = str;
        this.f16982b = str2;
        this.f16983c = j;
        this.f16984d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alt0)) {
            return false;
        }
        alt0 alt0Var = (alt0) obj;
        return wj50.m88271j(this.f16981a, alt0Var.f16981a) && wj50.m88271j(this.f16982b, alt0Var.f16982b) && this.f16983c == alt0Var.f16983c && this.f16984d == alt0Var.f16984d;
    }

    public final int hashCode() {
        int iHashCode = this.f16981a.hashCode() * 31;
        String str = this.f16982b;
        return Integer.hashCode(this.f16984d) + dq60.m36605e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f16983c, 31);
    }
}
