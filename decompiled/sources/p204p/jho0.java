package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jho0 extends tho0 {

    /* JADX INFO: renamed from: a */
    public final boolean f112538a;

    /* JADX INFO: renamed from: b */
    public final String f112539b;

    /* JADX INFO: renamed from: c */
    public final yzv f112540c;

    /* JADX INFO: renamed from: d */
    public final long f112541d;

    /* JADX INFO: renamed from: e */
    public final long f112542e;

    public jho0(boolean z, String str, yzv yzvVar, long j, long j2) {
        this.f112538a = z;
        this.f112539b = str;
        this.f112540c = yzvVar;
        this.f112541d = j;
        this.f112542e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jho0)) {
            return false;
        }
        jho0 jho0Var = (jho0) obj;
        return this.f112538a == jho0Var.f112538a && wj50.m88271j(this.f112539b, jho0Var.f112539b) && this.f112540c == jho0Var.f112540c && this.f112541d == jho0Var.f112541d && this.f112542e == jho0Var.f112542e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f112542e) + dq60.m36605e((this.f112540c.hashCode() + s571.m77243b(Boolean.hashCode(this.f112538a) * 31, 31, this.f112539b)) * 31, this.f112541d, 31);
    }
}
