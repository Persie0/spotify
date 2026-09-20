package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class biz0 {

    /* JADX INFO: renamed from: a */
    public final String f27572a;

    /* JADX INFO: renamed from: b */
    public final String f27573b;

    /* JADX INFO: renamed from: c */
    public final long f27574c;

    /* JADX INFO: renamed from: d */
    public final long f27575d;

    /* JADX INFO: renamed from: e */
    public final long f27576e;

    /* JADX INFO: renamed from: f */
    public final boolean f27577f;

    public biz0(String str, String str2, long j, long j2, long j3, boolean z) {
        this.f27572a = str;
        this.f27573b = str2;
        this.f27574c = j;
        this.f27575d = j2;
        this.f27576e = j3;
        this.f27577f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biz0)) {
            return false;
        }
        biz0 biz0Var = (biz0) obj;
        return wj50.m88271j(this.f27572a, biz0Var.f27572a) && wj50.m88271j(this.f27573b, biz0Var.f27573b) && this.f27574c == biz0Var.f27574c && this.f27575d == biz0Var.f27575d && this.f27576e == biz0Var.f27576e && this.f27577f == biz0Var.f27577f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27577f) + dq60.m36605e(dq60.m36605e(dq60.m36605e(s571.m77243b(this.f27572a.hashCode() * 31, 31, this.f27573b), this.f27574c, 31), this.f27575d, 31), this.f27576e, 31);
    }
}
