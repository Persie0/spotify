package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dhf0 implements ehf0 {

    /* JADX INFO: renamed from: a */
    public final mzc1 f49082a;

    /* JADX INFO: renamed from: b */
    public final int f49083b;

    public dhf0(mzc1 mzc1Var, int i) {
        this.f49082a = mzc1Var;
        this.f49083b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhf0)) {
            return false;
        }
        dhf0 dhf0Var = (dhf0) obj;
        return this.f49082a == dhf0Var.f49082a && this.f49083b == dhf0Var.f49083b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49083b) + (this.f49082a.hashCode() * 31);
    }
}
