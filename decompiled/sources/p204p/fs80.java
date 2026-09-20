package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fs80 implements hs80 {

    /* JADX INFO: renamed from: a */
    public final sp80 f72802a;

    /* JADX INFO: renamed from: b */
    public final int f72803b;

    public fs80(sp80 sp80Var, int i) {
        this.f72802a = sp80Var;
        this.f72803b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs80)) {
            return false;
        }
        fs80 fs80Var = (fs80) obj;
        return wj50.m88271j(this.f72802a, fs80Var.f72802a) && this.f72803b == fs80Var.f72803b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72803b) + (this.f72802a.hashCode() * 31);
    }
}
