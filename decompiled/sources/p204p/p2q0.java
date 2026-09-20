package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p2q0 extends q2q0 {

    /* JADX INFO: renamed from: a */
    public final String f173408a;

    /* JADX INFO: renamed from: b */
    public final String f173409b;

    /* JADX INFO: renamed from: c */
    public final String f173410c;

    /* JADX INFO: renamed from: d */
    public final String f173411d;

    /* JADX INFO: renamed from: e */
    public final boolean f173412e;

    /* JADX INFO: renamed from: f */
    public final long f173413f;

    /* JADX INFO: renamed from: g */
    public final long f173414g;

    public p2q0(String str, String str2, String str3, String str4, boolean z, long j, long j2) {
        this.f173408a = str;
        this.f173409b = str2;
        this.f173410c = str3;
        this.f173411d = str4;
        this.f173412e = z;
        this.f173413f = j;
        this.f173414g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2q0)) {
            return false;
        }
        p2q0 p2q0Var = (p2q0) obj;
        return wj50.m88271j(this.f173408a, p2q0Var.f173408a) && wj50.m88271j(this.f173409b, p2q0Var.f173409b) && wj50.m88271j(this.f173410c, p2q0Var.f173410c) && wj50.m88271j(this.f173411d, p2q0Var.f173411d) && this.f173412e == p2q0Var.f173412e && this.f173413f == p2q0Var.f173413f && this.f173414g == p2q0Var.f173414g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f173414g) + dq60.m36605e(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f173408a.hashCode() * 31, 31, this.f173409b), 31, this.f173410c), 31, this.f173411d), 31, this.f173412e), this.f173413f, 31);
    }
}
