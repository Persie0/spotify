package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wun0 implements xun0 {

    /* JADX INFO: renamed from: a */
    public final String f255232a;

    /* JADX INFO: renamed from: b */
    public final String f255233b;

    /* JADX INFO: renamed from: c */
    public final long f255234c;

    /* JADX INFO: renamed from: d */
    public final long f255235d;

    public wun0(String str, long j, long j2, String str2) {
        this.f255232a = str;
        this.f255233b = str2;
        this.f255234c = j;
        this.f255235d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wun0)) {
            return false;
        }
        wun0 wun0Var = (wun0) obj;
        return wj50.m88271j(this.f255232a, wun0Var.f255232a) && wj50.m88271j(this.f255233b, wun0Var.f255233b) && this.f255234c == wun0Var.f255234c && this.f255235d == wun0Var.f255235d;
    }

    public final int hashCode() {
        int iHashCode = this.f255232a.hashCode() * 31;
        String str = this.f255233b;
        return Long.hashCode(this.f255235d) + dq60.m36605e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f255234c, 31);
    }
}
