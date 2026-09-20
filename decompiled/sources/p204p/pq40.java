package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pq40 {

    /* JADX INFO: renamed from: a */
    public final int f180184a;

    /* JADX INFO: renamed from: b */
    public final int f180185b;

    /* JADX INFO: renamed from: c */
    public final int f180186c;

    /* JADX INFO: renamed from: d */
    public final int f180187d;

    public pq40(int i, int i2, int i3, int i4) {
        this.f180184a = i;
        this.f180185b = i2;
        this.f180186c = i3;
        this.f180187d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq40)) {
            return false;
        }
        pq40 pq40Var = (pq40) obj;
        return this.f180184a == pq40Var.f180184a && this.f180185b == pq40Var.f180185b && this.f180186c == pq40Var.f180186c && this.f180187d == pq40Var.f180187d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f180187d) + mt60.m62800g(this.f180186c, mt60.m62800g(this.f180185b, Integer.hashCode(this.f180184a) * 31, 31), 31);
    }
}
