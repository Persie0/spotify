package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wfb1 {

    /* JADX INFO: renamed from: a */
    public final String f250787a;

    /* JADX INFO: renamed from: b */
    public final long f250788b;

    /* JADX INFO: renamed from: c */
    public final boolean f250789c;

    /* JADX INFO: renamed from: d */
    public final long f250790d;

    /* JADX INFO: renamed from: e */
    public final long f250791e;

    /* JADX INFO: renamed from: f */
    public final String f250792f;

    /* JADX INFO: renamed from: g */
    public final String f250793g;

    public wfb1(String str, long j, boolean z, long j2, long j3, String str2, String str3) {
        this.f250787a = str;
        this.f250788b = j;
        this.f250789c = z;
        this.f250790d = j2;
        this.f250791e = j3;
        this.f250792f = str2;
        this.f250793g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfb1)) {
            return false;
        }
        wfb1 wfb1Var = (wfb1) obj;
        return wj50.m88271j(this.f250787a, wfb1Var.f250787a) && this.f250788b == wfb1Var.f250788b && this.f250789c == wfb1Var.f250789c && this.f250790d == wfb1Var.f250790d && this.f250791e == wfb1Var.f250791e && wj50.m88271j(this.f250792f, wfb1Var.f250792f) && wj50.m88271j(this.f250793g, wfb1Var.f250793g);
    }

    public final int hashCode() {
        return this.f250793g.hashCode() + s571.m77243b(dq60.m36605e(dq60.m36605e(s571.m77245d(dq60.m36605e(this.f250787a.hashCode() * 31, this.f250788b, 31), 31, this.f250789c), this.f250790d, 31), this.f250791e, 31), 31, this.f250792f);
    }
}
