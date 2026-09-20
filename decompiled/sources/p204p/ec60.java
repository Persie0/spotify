package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ec60 {

    /* JADX INFO: renamed from: a */
    public final long f58235a;

    /* JADX INFO: renamed from: b */
    public long f58236b;

    /* JADX INFO: renamed from: c */
    public final int f58237c;

    /* JADX INFO: renamed from: d */
    public boolean f58238d;

    public ec60(long j, long j2, boolean z, int i) {
        this.f58235a = j;
        this.f58236b = j2;
        this.f58237c = i;
        this.f58238d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec60)) {
            return false;
        }
        ec60 ec60Var = (ec60) obj;
        return this.f58235a == ec60Var.f58235a && this.f58236b == ec60Var.f58236b && this.f58237c == ec60Var.f58237c && this.f58238d == ec60Var.f58238d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58238d) + mt60.m62800g(this.f58237c, dq60.m36605e(Long.hashCode(this.f58235a) * 31, this.f58236b, 31), 31);
    }
}
