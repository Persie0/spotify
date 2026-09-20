package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z911 {

    /* JADX INFO: renamed from: a */
    public final y911 f280641a;

    /* JADX INFO: renamed from: b */
    public final j911 f280642b;

    public z911(y911 y911Var, j911 j911Var) {
        this.f280641a = y911Var;
        this.f280642b = j911Var;
    }

    /* JADX INFO: renamed from: a */
    public static z911 m95616a(z911 z911Var, y911 y911Var, j911 j911Var, int i) {
        if ((i & 1) != 0) {
            y911Var = z911Var.f280641a;
        }
        if ((i & 2) != 0) {
            j911Var = z911Var.f280642b;
        }
        z911Var.getClass();
        return new z911(y911Var, j911Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z911)) {
            return false;
        }
        z911 z911Var = (z911) obj;
        return wj50.m88271j(this.f280641a, z911Var.f280641a) && wj50.m88271j(this.f280642b, z911Var.f280642b);
    }

    public final int hashCode() {
        return this.f280642b.hashCode() + (this.f280641a.hashCode() * 31);
    }
}
