package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class pq51 {

    /* JADX INFO: renamed from: a */
    public final int f180197a;

    /* JADX INFO: renamed from: b */
    public final int f180198b;

    /* JADX INFO: renamed from: c */
    public final int f180199c;

    /* JADX INFO: renamed from: d */
    public final int f180200d;

    public pq51(int i, int i2, int i3, int i4) {
        this.f180197a = i;
        this.f180198b = i2;
        this.f180199c = i3;
        this.f180200d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq51)) {
            return false;
        }
        pq51 pq51Var = (pq51) obj;
        return this.f180197a == pq51Var.f180197a && this.f180198b == pq51Var.f180198b && this.f180199c == pq51Var.f180199c && this.f180200d == pq51Var.f180200d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f180200d) + mt60.m62800g(this.f180199c, f710.m40938f(this.f180198b, Integer.hashCode(this.f180197a) * 31, 31), 31);
    }
}
