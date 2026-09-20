package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i251 {

    /* JADX INFO: renamed from: a */
    public final int f97747a;

    /* JADX INFO: renamed from: b */
    public final boolean f97748b;

    /* JADX INFO: renamed from: c */
    public final boolean f97749c;

    /* JADX INFO: renamed from: d */
    public final boolean f97750d;

    public i251(int i, boolean z, boolean z2, boolean z3) {
        this.f97747a = i;
        this.f97748b = z;
        this.f97749c = z2;
        this.f97750d = z3;
    }

    /* JADX INFO: renamed from: a */
    public static i251 m49449a(i251 i251Var, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            i = i251Var.f97747a;
        }
        if ((i2 & 2) != 0) {
            z = i251Var.f97748b;
        }
        if ((i2 & 4) != 0) {
            z2 = i251Var.f97749c;
        }
        boolean z3 = (i2 & 8) != 0 ? i251Var.f97750d : false;
        i251Var.getClass();
        return new i251(i, z, z2, z3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m49450b() {
        return this.f97747a != 0 || this.f97748b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i251)) {
            return false;
        }
        i251 i251Var = (i251) obj;
        return this.f97747a == i251Var.f97747a && this.f97748b == i251Var.f97748b && this.f97749c == i251Var.f97749c && this.f97750d == i251Var.f97750d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f97750d) + s571.m77245d(s571.m77245d(Integer.hashCode(this.f97747a) * 31, 31, this.f97748b), 31, this.f97749c);
    }
}
