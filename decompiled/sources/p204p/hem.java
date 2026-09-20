package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hem {

    /* JADX INFO: renamed from: a */
    public final eht0 f90455a;

    /* JADX INFO: renamed from: b */
    public final boolean f90456b;

    public hem(eht0 eht0Var, boolean z) {
        this.f90455a = eht0Var;
        this.f90456b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hem) {
            hem hemVar = (hem) obj;
            if (hemVar.f90455a.equals(this.f90455a) && hemVar.f90456b == this.f90456b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f90455a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f90456b).hashCode();
    }
}
