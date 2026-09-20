package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sc71 {

    /* JADX INFO: renamed from: a */
    public final rc71 f207657a;

    /* JADX INFO: renamed from: b */
    public final float f207658b;

    public sc71(rc71 rc71Var, float f) {
        this.f207657a = rc71Var;
        this.f207658b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc71)) {
            return false;
        }
        sc71 sc71Var = (sc71) obj;
        return this.f207657a == sc71Var.f207657a && Float.compare(this.f207658b, sc71Var.f207658b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f207658b) + (this.f207657a.hashCode() * 31);
    }
}
