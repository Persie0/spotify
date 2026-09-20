package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vfd0 {

    /* JADX INFO: renamed from: a */
    public final float f240954a;

    /* JADX INFO: renamed from: b */
    public final float f240955b;

    public vfd0(float f, float f2) {
        this.f240954a = f;
        this.f240955b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfd0)) {
            return false;
        }
        vfd0 vfd0Var = (vfd0) obj;
        return Float.compare(this.f240954a, vfd0Var.f240954a) == 0 && Float.compare(this.f240955b, vfd0Var.f240955b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f240955b) + (Float.hashCode(this.f240954a) * 31);
    }
}
