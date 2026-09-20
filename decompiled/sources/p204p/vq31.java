package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vq31 {

    /* JADX INFO: renamed from: a */
    public final xr31 f243865a;

    /* JADX INFO: renamed from: b */
    public final c3z f243866b;

    public vq31(xr31 xr31Var, c3z c3zVar) {
        this.f243865a = xr31Var;
        this.f243866b = c3zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq31)) {
            return false;
        }
        vq31 vq31Var = (vq31) obj;
        return wj50.m88271j(this.f243865a, vq31Var.f243865a) && wj50.m88271j(this.f243866b, vq31Var.f243866b);
    }

    public final int hashCode() {
        return this.f243866b.hashCode() + (this.f243865a.hashCode() * 31);
    }
}
