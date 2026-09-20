package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uge1 implements zge1 {

    /* JADX INFO: renamed from: a */
    public final String f230148a;

    /* JADX INFO: renamed from: b */
    public final String f230149b;

    /* JADX INFO: renamed from: c */
    public final boolean f230150c;

    /* JADX INFO: renamed from: d */
    public final boolean f230151d;

    /* JADX INFO: renamed from: e */
    public final String f230152e;

    /* JADX INFO: renamed from: f */
    public final String f230153f;

    /* JADX INFO: renamed from: g */
    public final long f230154g;

    /* JADX INFO: renamed from: h */
    public final long f230155h;

    /* JADX INFO: renamed from: i */
    public final long f230156i;

    /* JADX INFO: renamed from: j */
    public final double f230157j;

    public uge1(String str, String str2, boolean z, boolean z2, String str3, String str4, long j, long j2, long j3, double d) {
        this.f230148a = str;
        this.f230149b = str2;
        this.f230150c = z;
        this.f230151d = z2;
        this.f230152e = str3;
        this.f230153f = str4;
        this.f230154g = j;
        this.f230155h = j2;
        this.f230156i = j3;
        this.f230157j = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uge1)) {
            return false;
        }
        uge1 uge1Var = (uge1) obj;
        return wj50.m88271j(this.f230148a, uge1Var.f230148a) && wj50.m88271j(this.f230149b, uge1Var.f230149b) && this.f230150c == uge1Var.f230150c && this.f230151d == uge1Var.f230151d && wj50.m88271j(this.f230152e, uge1Var.f230152e) && wj50.m88271j(this.f230153f, uge1Var.f230153f) && this.f230154g == uge1Var.f230154g && this.f230155h == uge1Var.f230155h && this.f230156i == uge1Var.f230156i && Double.compare(this.f230157j, uge1Var.f230157j) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f230157j) + dq60.m36605e(dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77243b(this.f230148a.hashCode() * 31, 31, this.f230149b), 31, this.f230150c), 31, this.f230151d), 31, this.f230152e), 31, this.f230153f), this.f230154g, 31), this.f230155h, 31), this.f230156i, 31);
    }
}
