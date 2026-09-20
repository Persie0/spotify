package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rnv implements tnv {

    /* JADX INFO: renamed from: a */
    public final bov f201020a;

    /* JADX INFO: renamed from: b */
    public final bmo0 f201021b;

    public rnv(bov bovVar, bmo0 bmo0Var) {
        this.f201020a = bovVar;
        this.f201021b = bmo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnv)) {
            return false;
        }
        rnv rnvVar = (rnv) obj;
        return wj50.m88271j(this.f201020a, rnvVar.f201020a) && wj50.m88271j(this.f201021b, rnvVar.f201021b);
    }

    public final int hashCode() {
        int iHashCode = this.f201020a.hashCode() * 31;
        bmo0 bmo0Var = this.f201021b;
        return iHashCode + (bmo0Var == null ? 0 : bmo0Var.hashCode());
    }
}
