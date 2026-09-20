package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r491 {

    /* JADX INFO: renamed from: a */
    public final int f195705a;

    /* JADX INFO: renamed from: b */
    public final int f195706b;

    /* JADX INFO: renamed from: c */
    public final int f195707c;

    public r491(int i, int i2, int i3) {
        this.f195705a = i;
        this.f195706b = i2;
        this.f195707c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r491)) {
            return false;
        }
        r491 r491Var = (r491) obj;
        return this.f195705a == r491Var.f195705a && this.f195706b == r491Var.f195706b && this.f195707c == r491Var.f195707c;
    }

    public final int hashCode() {
        return Integer.hashCode(8388611) + mt60.m62800g(this.f195707c, mt60.m62800g(this.f195706b, Integer.hashCode(this.f195705a) * 31, 31), 31);
    }
}
