package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rrd1 extends srd1 {

    /* JADX INFO: renamed from: a */
    public final String f202027a;

    /* JADX INFO: renamed from: b */
    public final int f202028b;

    /* JADX INFO: renamed from: c */
    public final String f202029c;

    /* JADX INFO: renamed from: d */
    public final int f202030d;

    /* JADX INFO: renamed from: e */
    public final boolean f202031e;

    /* JADX INFO: renamed from: f */
    public final long f202032f;

    public rrd1(String str, int i, String str2, int i2, boolean z, long j) {
        this.f202027a = str;
        this.f202028b = i;
        this.f202029c = str2;
        this.f202030d = i2;
        this.f202031e = z;
        this.f202032f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrd1)) {
            return false;
        }
        rrd1 rrd1Var = (rrd1) obj;
        return wj50.m88271j(this.f202027a, rrd1Var.f202027a) && this.f202028b == rrd1Var.f202028b && wj50.m88271j(this.f202029c, rrd1Var.f202029c) && this.f202030d == rrd1Var.f202030d && this.f202031e == rrd1Var.f202031e && this.f202032f == rrd1Var.f202032f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f202032f) + s571.m77245d(f710.m40938f(this.f202030d, s571.m77243b(f710.m40938f(this.f202028b, this.f202027a.hashCode() * 31, 31), 31, this.f202029c), 31), 31, this.f202031e);
    }
}
