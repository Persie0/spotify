package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class er61 extends hpg1 {

    /* JADX INFO: renamed from: c */
    public final int f62032c;

    /* JADX INFO: renamed from: d */
    public final int f62033d;

    public er61(int i, int i2) {
        this.f62032c = i;
        this.f62033d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er61)) {
            return false;
        }
        er61 er61Var = (er61) obj;
        return this.f62032c == er61Var.f62032c && this.f62033d == er61Var.f62033d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f62033d) + (Integer.hashCode(this.f62032c) * 31);
    }
}
