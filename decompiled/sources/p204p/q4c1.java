package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class q4c1 implements r4c1 {

    /* JADX INFO: renamed from: a */
    public final int f185144a;

    /* JADX INFO: renamed from: b */
    public final int f185145b;

    /* JADX INFO: renamed from: c */
    public final int f185146c;

    public q4c1(int i, int i2) {
        this.f185144a = i;
        this.f185145b = i2;
        this.f185146c = (int) (((double) i2) * 1.7777777777777777d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4c1)) {
            return false;
        }
        q4c1 q4c1Var = (q4c1) obj;
        return this.f185144a == q4c1Var.f185144a && this.f185145b == q4c1Var.f185145b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f185145b) + (edb.m38547C(this.f185144a) * 31);
    }
}
