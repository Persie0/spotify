package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qa30 {

    /* JADX INFO: renamed from: a */
    public final ua30 f186731a;

    /* JADX INFO: renamed from: b */
    public final ua30 f186732b;

    /* JADX INFO: renamed from: c */
    public final int f186733c;

    /* JADX INFO: renamed from: d */
    public final int f186734d;

    public qa30(ua30 ua30Var, ua30 ua30Var2, int i, int i2) {
        this.f186731a = ua30Var;
        this.f186732b = ua30Var2;
        this.f186733c = i;
        this.f186734d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa30)) {
            return false;
        }
        qa30 qa30Var = (qa30) obj;
        return this.f186731a.equals(qa30Var.f186731a) && this.f186732b.equals(qa30Var.f186732b) && this.f186733c == qa30Var.f186733c && this.f186734d == qa30Var.f186734d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f186734d) + mt60.m62800g(this.f186733c, (this.f186732b.hashCode() + (this.f186731a.hashCode() * 31)) * 31, 31);
    }
}
