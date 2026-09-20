package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mn2 {

    /* JADX INFO: renamed from: a */
    public final float f145298a;

    /* JADX INFO: renamed from: b */
    public final j4m0 f145299b;

    public mn2(float f, j4m0 j4m0Var) {
        this.f145298a = f;
        this.f145299b = j4m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn2)) {
            return false;
        }
        mn2 mn2Var = (mn2) obj;
        return ybs.m93301b(this.f145298a, mn2Var.f145298a) && this.f145299b.equals(mn2Var.f145299b);
    }

    public final int hashCode() {
        return this.f145299b.hashCode() + (Float.hashCode(this.f145298a) * 31);
    }
}
