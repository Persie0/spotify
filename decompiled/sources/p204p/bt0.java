package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bt0 {

    /* JADX INFO: renamed from: a */
    public final int f30480a;

    /* JADX INFO: renamed from: b */
    public final int f30481b;

    /* JADX INFO: renamed from: c */
    public final int f30482c;

    public bt0(int i, int i2, int i3) {
        this.f30480a = i;
        this.f30481b = i2;
        this.f30482c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt0)) {
            return false;
        }
        bt0 bt0Var = (bt0) obj;
        return this.f30480a == bt0Var.f30480a && this.f30481b == bt0Var.f30481b && this.f30482c == bt0Var.f30482c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30482c) + mt60.m62800g(this.f30481b, Integer.hashCode(this.f30480a) * 31, 31);
    }
}
