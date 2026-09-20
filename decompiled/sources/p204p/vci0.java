package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vci0 {

    /* JADX INFO: renamed from: a */
    public final boolean f240138a;

    /* JADX INFO: renamed from: b */
    public final am81 f240139b;

    public vci0(boolean z, am81 am81Var) {
        this.f240138a = z;
        this.f240139b = am81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vci0)) {
            return false;
        }
        vci0 vci0Var = (vci0) obj;
        return this.f240138a == vci0Var.f240138a && wj50.m88271j(this.f240139b, vci0Var.f240139b);
    }

    public final int hashCode() {
        return this.f240139b.hashCode() + (Boolean.hashCode(this.f240138a) * 31);
    }
}
