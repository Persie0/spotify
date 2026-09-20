package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t2b0 extends r2b0 implements fte {

    /* JADX INFO: renamed from: d */
    public static final t2b0 f216475d = new t2b0(1, 0);

    /* JADX INFO: renamed from: a */
    public final boolean m79894a(long j) {
        return this.f195112a <= j && j <= this.f195113b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t2b0)) {
            return false;
        }
        if (isEmpty() && ((t2b0) obj).isEmpty()) {
            return true;
        }
        t2b0 t2b0Var = (t2b0) obj;
        return this.f195112a == t2b0Var.f195112a && this.f195113b == t2b0Var.f195113b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f195112a;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.f195113b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // p204p.fte
    public final boolean isEmpty() {
        return this.f195112a > this.f195113b;
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: n */
    public final Comparable mo28071n() {
        return Long.valueOf(this.f195112a);
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: o */
    public final Comparable mo28072o() {
        return Long.valueOf(this.f195113b);
    }

    public final String toString() {
        return this.f195112a + ".." + this.f195113b;
    }
}
