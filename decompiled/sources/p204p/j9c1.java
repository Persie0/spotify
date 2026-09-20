package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j9c1 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f110145a;

    /* JADX INFO: renamed from: b */
    public final int f110146b;

    public j9c1(int i, int i2) {
        this.f110145a = i;
        this.f110146b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m52740a() {
        return this.f110146b;
    }

    /* JADX INFO: renamed from: b */
    public final int m52741b() {
        return this.f110145a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j9c1 j9c1Var = (j9c1) obj;
        return wj50.m88282u(this.f110145a * this.f110146b, j9c1Var.f110145a * j9c1Var.f110146b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9c1)) {
            return false;
        }
        j9c1 j9c1Var = (j9c1) obj;
        return this.f110145a == j9c1Var.f110145a && this.f110146b == j9c1Var.f110146b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110146b) + (Integer.hashCode(this.f110145a) * 31);
    }
}
