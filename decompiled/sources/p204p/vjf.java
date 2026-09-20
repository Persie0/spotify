package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vjf implements ekf {

    /* JADX INFO: renamed from: a */
    public final String f241983a;

    /* JADX INFO: renamed from: b */
    public final String f241984b;

    /* JADX INFO: renamed from: c */
    public final boolean f241985c;

    /* JADX INFO: renamed from: d */
    public final int f241986d;

    public vjf(String str, String str2, boolean z, int i) {
        this.f241983a = str;
        this.f241984b = str2;
        this.f241985c = z;
        this.f241986d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjf)) {
            return false;
        }
        vjf vjfVar = (vjf) obj;
        return wj50.m88271j(this.f241983a, vjfVar.f241983a) && wj50.m88271j(this.f241984b, vjfVar.f241984b) && this.f241985c == vjfVar.f241985c && this.f241986d == vjfVar.f241986d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f241986d) + s571.m77245d(s571.m77243b(this.f241983a.hashCode() * 31, 31, this.f241984b), 31, this.f241985c);
    }
}
