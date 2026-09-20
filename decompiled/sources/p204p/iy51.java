package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iy51 {

    /* JADX INFO: renamed from: a */
    public final hy51 f106852a;

    /* JADX INFO: renamed from: b */
    public final n6f f106853b;

    /* JADX INFO: renamed from: c */
    public final String f106854c;

    /* JADX INFO: renamed from: d */
    public final boolean f106855d;

    public iy51(hy51 hy51Var, n6f n6fVar, String str, boolean z) {
        this.f106852a = hy51Var;
        this.f106853b = n6fVar;
        this.f106854c = str;
        this.f106855d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy51)) {
            return false;
        }
        iy51 iy51Var = (iy51) obj;
        return wj50.m88271j(this.f106852a, iy51Var.f106852a) && wj50.m88271j(this.f106853b, iy51Var.f106853b) && wj50.m88271j(this.f106854c, iy51Var.f106854c) && this.f106855d == iy51Var.f106855d;
    }

    public final int hashCode() {
        int iHashCode = this.f106852a.hashCode() * 31;
        n6f n6fVar = this.f106853b;
        return Boolean.hashCode(this.f106855d) + s571.m77243b((iHashCode + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31, 31, this.f106854c);
    }
}
