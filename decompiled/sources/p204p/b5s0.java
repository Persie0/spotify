package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b5s0 implements c5s0 {

    /* JADX INFO: renamed from: a */
    public final String f23689a;

    /* JADX INFO: renamed from: b */
    public final String f23690b;

    /* JADX INFO: renamed from: c */
    public final long f23691c;

    /* JADX INFO: renamed from: d */
    public final long f23692d;

    public b5s0(String str, long j, long j2, String str2) {
        this.f23689a = str;
        this.f23690b = str2;
        this.f23691c = j;
        this.f23692d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5s0)) {
            return false;
        }
        b5s0 b5s0Var = (b5s0) obj;
        return wj50.m88271j(this.f23689a, b5s0Var.f23689a) && wj50.m88271j(this.f23690b, b5s0Var.f23690b) && this.f23691c == b5s0Var.f23691c && this.f23692d == b5s0Var.f23692d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23692d) + dq60.m36605e(s571.m77243b(this.f23689a.hashCode() * 31, 31, this.f23690b), this.f23691c, 31);
    }
}
