package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ezi0 {

    /* JADX INFO: renamed from: a */
    public final boolean f64391a;

    /* JADX INFO: renamed from: b */
    public final boolean f64392b;

    /* JADX INFO: renamed from: c */
    public final int f64393c;

    /* JADX INFO: renamed from: d */
    public final boolean f64394d;

    /* JADX INFO: renamed from: e */
    public final boolean f64395e;

    /* JADX INFO: renamed from: f */
    public final int f64396f;

    /* JADX INFO: renamed from: g */
    public final int f64397g;

    /* JADX INFO: renamed from: h */
    public final int f64398h;

    /* JADX INFO: renamed from: i */
    public final int f64399i;

    public ezi0(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.f64391a = z;
        this.f64392b = z2;
        this.f64393c = i;
        this.f64394d = z3;
        this.f64395e = z4;
        this.f64396f = i2;
        this.f64397g = i3;
        this.f64398h = i4;
        this.f64399i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ezi0)) {
            return false;
        }
        ezi0 ezi0Var = (ezi0) obj;
        return this.f64391a == ezi0Var.f64391a && this.f64392b == ezi0Var.f64392b && this.f64393c == ezi0Var.f64393c && this.f64394d == ezi0Var.f64394d && this.f64395e == ezi0Var.f64395e && this.f64396f == ezi0Var.f64396f && this.f64397g == ezi0Var.f64397g && this.f64398h == ezi0Var.f64398h && this.f64399i == ezi0Var.f64399i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f64391a ? 1 : 0) * 31) + (this.f64392b ? 1 : 0)) * 31) + this.f64393c) * 923521) + (this.f64394d ? 1 : 0)) * 31) + (this.f64395e ? 1 : 0)) * 31) + this.f64396f) * 31) + this.f64397g) * 31) + this.f64398h) * 31) + this.f64399i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ezi0.class.getSimpleName());
        sb.append("(");
        if (this.f64391a) {
            sb.append("launchSingleTop ");
        }
        if (this.f64392b) {
            sb.append("restoreState ");
        }
        int i = this.f64399i;
        int i2 = this.f64398h;
        int i3 = this.f64397g;
        int i4 = this.f64396f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}
