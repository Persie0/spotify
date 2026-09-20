package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mzn0 {

    /* JADX INFO: renamed from: a */
    public final wwu f148731a;

    /* JADX INFO: renamed from: b */
    public final int f148732b;

    /* JADX INFO: renamed from: c */
    public final long f148733c;

    /* JADX INFO: renamed from: d */
    public final long f148734d;

    /* JADX INFO: renamed from: e */
    public final String f148735e;

    /* JADX INFO: renamed from: f */
    public final String f148736f;

    /* JADX INFO: renamed from: g */
    public final String f148737g;

    /* JADX INFO: renamed from: h */
    public final boolean f148738h;

    /* JADX INFO: renamed from: i */
    public final boolean f148739i;

    /* JADX INFO: renamed from: j */
    public final boolean f148740j;

    /* JADX INFO: renamed from: k */
    public final String f148741k;

    public mzn0(wwu wwuVar, long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3, String str3, int i) {
        wwuVar = (i & 1) != 0 ? null : wwuVar;
        int i2 = (i & 2) != 0 ? 1 : 2;
        j = (i & 4) != 0 ? n6f.f150871k : j;
        String str4 = (i & 32) != 0 ? null : "spotify:playlist:37i9dQZF1EYkqdzj48dyYq";
        String str5 = (i & 64) != 0 ? null : str2;
        boolean z4 = (i & 128) != 0 ? false : z;
        boolean z5 = (i & 256) == 0 ? z2 : true;
        boolean z6 = (i & 512) == 0 ? z3 : false;
        String str6 = (i & 1024) == 0 ? str3 : null;
        this.f148731a = wwuVar;
        this.f148732b = i2;
        this.f148733c = j;
        this.f148734d = j2;
        this.f148735e = str;
        this.f148736f = str4;
        this.f148737g = str5;
        this.f148738h = z4;
        this.f148739i = z5;
        this.f148740j = z6;
        this.f148741k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzn0)) {
            return false;
        }
        mzn0 mzn0Var = (mzn0) obj;
        if (!wj50.m88271j(this.f148731a, mzn0Var.f148731a) || this.f148732b != mzn0Var.f148732b) {
            return false;
        }
        long j = mzn0Var.f148733c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f148733c, j) && as91.m27074b(this.f148734d, mzn0Var.f148734d) && wj50.m88271j(this.f148735e, mzn0Var.f148735e) && wj50.m88271j(this.f148736f, mzn0Var.f148736f) && wj50.m88271j(this.f148737g, mzn0Var.f148737g) && this.f148738h == mzn0Var.f148738h && this.f148739i == mzn0Var.f148739i && this.f148740j == mzn0Var.f148740j && wj50.m88271j(this.f148741k, mzn0Var.f148741k);
    }

    public final int hashCode() {
        wwu wwuVar = this.f148731a;
        int iM40938f = f710.m40938f(this.f148732b, (wwuVar == null ? 0 : wwuVar.hashCode()) * 31, 31);
        int i = n6f.f150872l;
        int iM77243b = s571.m77243b(dq60.m36605e(dq60.m36605e(iM40938f, this.f148733c, 31), this.f148734d, 31), 31, this.f148735e);
        String str = this.f148736f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f148737g;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f148738h), 31, this.f148739i), 31, this.f148740j);
        String str3 = this.f148741k;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }
}
