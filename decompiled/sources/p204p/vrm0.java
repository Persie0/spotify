package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vrm0 {

    /* JADX INFO: renamed from: a */
    public final int f244227a;

    /* JADX INFO: renamed from: b */
    public final int f244228b;

    /* JADX INFO: renamed from: c */
    public final jsm0 f244229c;

    public vrm0(int i, int i2, jsm0 jsm0Var) {
        this.f244227a = i;
        this.f244228b = i2;
        this.f244229c = jsm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrm0)) {
            return false;
        }
        vrm0 vrm0Var = (vrm0) obj;
        return this.f244227a == vrm0Var.f244227a && this.f244228b == vrm0Var.f244228b && wj50.m88271j(this.f244229c, vrm0Var.f244229c);
    }

    public final int hashCode() {
        return this.f244229c.hashCode() + mt60.m62800g(this.f244228b, Integer.hashCode(this.f244227a) * 31, 31);
    }
}
