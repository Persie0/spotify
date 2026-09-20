package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class el20 {

    /* JADX INFO: renamed from: a */
    public final int f60570a;

    /* JADX INFO: renamed from: b */
    public final int f60571b;

    public el20(int i, int i2) {
        this.f60570a = i;
        this.f60571b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el20)) {
            return false;
        }
        el20 el20Var = (el20) obj;
        return this.f60570a == el20Var.f60570a && this.f60571b == el20Var.f60571b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60571b) + (Integer.hashCode(this.f60570a) * 31);
    }

    public /* synthetic */ el20(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
