package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aub1 {

    /* JADX INFO: renamed from: a */
    public final String f19906a;

    /* JADX INFO: renamed from: b */
    public final int f19907b;

    /* JADX INFO: renamed from: c */
    public final long f19908c;

    /* JADX INFO: renamed from: d */
    public final long f19909d;

    /* JADX INFO: renamed from: e */
    public final String f19910e;

    /* JADX INFO: renamed from: f */
    public final boolean f19911f;

    public aub1(int i, long j, long j2, String str, String str2, boolean z) {
        this.f19906a = str;
        this.f19907b = i;
        this.f19908c = j;
        this.f19909d = j2;
        this.f19910e = str2;
        this.f19911f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aub1)) {
            return false;
        }
        aub1 aub1Var = (aub1) obj;
        return this.f19906a.equals(aub1Var.f19906a) && this.f19907b == aub1Var.f19907b && this.f19908c == aub1Var.f19908c && this.f19909d == aub1Var.f19909d && this.f19910e.equals(aub1Var.f19910e) && this.f19911f == aub1Var.f19911f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19911f) + s571.m77243b(dq60.m36605e(dq60.m36605e(f710.m40938f(this.f19907b, this.f19906a.hashCode() * 31, 31), this.f19908c, 31), this.f19909d, 31), 31, this.f19910e);
    }
}
