package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class eq31 {

    /* JADX INFO: renamed from: a */
    public final int f61771a;

    /* JADX INFO: renamed from: b */
    public final int f61772b;

    public eq31(int i, int i2) {
        this.f61771a = i;
        this.f61772b = i2;
    }

    /* JADX INFO: renamed from: a */
    public static eq31 m39719a(eq31 eq31Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = eq31Var.f61771a;
        }
        int i3 = (i2 & 2) != 0 ? eq31Var.f61772b : 1;
        eq31Var.getClass();
        return new eq31(i, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq31)) {
            return false;
        }
        eq31 eq31Var = (eq31) obj;
        return this.f61771a == eq31Var.f61771a && this.f61772b == eq31Var.f61772b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f61772b) + (edb.m38547C(this.f61771a) * 31);
    }
}
