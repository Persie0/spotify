package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vo01 extends nsg1 {

    /* JADX INFO: renamed from: b */
    public final int f243298b;

    /* JADX INFO: renamed from: c */
    public final boolean f243299c;

    public vo01(int i, boolean z) {
        this.f243298b = i;
        this.f243299c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo01)) {
            return false;
        }
        vo01 vo01Var = (vo01) obj;
        return this.f243298b == vo01Var.f243298b && this.f243299c == vo01Var.f243299c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243299c) + (Integer.hashCode(this.f243298b) * 31);
    }
}
