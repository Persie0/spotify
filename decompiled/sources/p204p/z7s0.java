package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class z7s0 {

    /* JADX INFO: renamed from: a */
    public final String f280275a;

    /* JADX INFO: renamed from: b */
    public final int f280276b;

    /* JADX INFO: renamed from: c */
    public final float f280277c;

    public z7s0(float f, int i, String str) {
        this.f280275a = str;
        this.f280276b = i;
        this.f280277c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7s0)) {
            return false;
        }
        z7s0 z7s0Var = (z7s0) obj;
        return wj50.m88271j(this.f280275a, z7s0Var.f280275a) && this.f280276b == z7s0Var.f280276b && Float.compare(this.f280277c, z7s0Var.f280277c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f280277c) + mt60.m62800g(this.f280276b, this.f280275a.hashCode() * 31, 31);
    }
}
