package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vi81 {

    /* JADX INFO: renamed from: a */
    public final int f241644a;

    /* JADX INFO: renamed from: b */
    public final int f241645b;

    public vi81(int i, int i2) {
        this.f241644a = i;
        this.f241645b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi81)) {
            return false;
        }
        vi81 vi81Var = (vi81) obj;
        return this.f241644a == vi81Var.f241644a && this.f241645b == vi81Var.f241645b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f241645b) + (edb.m38547C(this.f241644a) * 31);
    }
}
