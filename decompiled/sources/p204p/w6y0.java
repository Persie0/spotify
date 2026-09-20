package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w6y0 {

    /* JADX INFO: renamed from: a */
    public final String f248485a;

    /* JADX INFO: renamed from: b */
    public final String f248486b;

    /* JADX INFO: renamed from: c */
    public final long f248487c;

    /* JADX INFO: renamed from: d */
    public final long f248488d;

    /* JADX INFO: renamed from: e */
    public final boolean f248489e;

    public w6y0(long j, long j2, String str, String str2, boolean z) {
        this.f248485a = str;
        this.f248486b = str2;
        this.f248487c = j;
        this.f248488d = j2;
        this.f248489e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6y0)) {
            return false;
        }
        w6y0 w6y0Var = (w6y0) obj;
        return wj50.m88271j(this.f248485a, w6y0Var.f248485a) && wj50.m88271j(this.f248486b, w6y0Var.f248486b) && this.f248487c == w6y0Var.f248487c && this.f248488d == w6y0Var.f248488d && this.f248489e == w6y0Var.f248489e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248489e) + dq60.m36605e(dq60.m36605e(s571.m77243b(this.f248485a.hashCode() * 31, 31, this.f248486b), this.f248487c, 31), this.f248488d, 31);
    }
}
