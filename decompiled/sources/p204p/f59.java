package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f59 extends h59 {

    /* JADX INFO: renamed from: a */
    public final int f65981a;

    /* JADX INFO: renamed from: b */
    public final int f65982b;

    public f59(int i, int i2) {
        this.f65981a = i;
        this.f65982b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f59)) {
            return false;
        }
        f59 f59Var = (f59) obj;
        return this.f65981a == f59Var.f65981a && this.f65982b == f59Var.f65982b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65982b) + (Integer.hashCode(this.f65981a) * 31);
    }
}
