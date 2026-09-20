package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b091 implements e091 {

    /* JADX INFO: renamed from: a */
    public final String f21806a;

    /* JADX INFO: renamed from: b */
    public final long f21807b;

    /* JADX INFO: renamed from: c */
    public final long f21808c;

    public b091(long j, String str, long j2) {
        this.f21806a = str;
        this.f21807b = j;
        this.f21808c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b091)) {
            return false;
        }
        b091 b091Var = (b091) obj;
        return wj50.m88271j(this.f21806a, b091Var.f21806a) && this.f21807b == b091Var.f21807b && this.f21808c == b091Var.f21808c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21808c) + dq60.m36605e(this.f21806a.hashCode() * 31, this.f21807b, 31);
    }
}
