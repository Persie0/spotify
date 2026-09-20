package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cyt0 {

    /* JADX INFO: renamed from: a */
    public final String f43351a;

    /* JADX INFO: renamed from: b */
    public final boolean f43352b;

    /* JADX INFO: renamed from: c */
    public final boolean f43353c;

    /* JADX INFO: renamed from: d */
    public final c0u0 f43354d;

    static {
        c0u0 c0u0Var = c0u0.f32868i;
    }

    public cyt0(String str, boolean z, boolean z2, c0u0 c0u0Var) {
        this.f43351a = str;
        this.f43352b = z;
        this.f43353c = z2;
        this.f43354d = c0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyt0)) {
            return false;
        }
        cyt0 cyt0Var = (cyt0) obj;
        return wj50.m88271j(this.f43351a, cyt0Var.f43351a) && this.f43352b == cyt0Var.f43352b && this.f43353c == cyt0Var.f43353c && wj50.m88271j(this.f43354d, cyt0Var.f43354d);
    }

    public final int hashCode() {
        return this.f43354d.hashCode() + s571.m77245d(s571.m77245d(this.f43351a.hashCode() * 31, 31, this.f43352b), 31, this.f43353c);
    }
}
