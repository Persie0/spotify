package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zr31 {

    /* JADX INFO: renamed from: a */
    public final boolean f285531a;

    /* JADX INFO: renamed from: b */
    public final ur31 f285532b;

    public zr31(boolean z, ur31 ur31Var) {
        this.f285531a = z;
        this.f285532b = ur31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr31)) {
            return false;
        }
        zr31 zr31Var = (zr31) obj;
        return this.f285531a == zr31Var.f285531a && this.f285532b == zr31Var.f285532b;
    }

    public final int hashCode() {
        return this.f285532b.hashCode() + (Boolean.hashCode(this.f285531a) * 31);
    }
}
