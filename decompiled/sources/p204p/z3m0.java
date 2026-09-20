package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z3m0 {

    /* JADX INFO: renamed from: a */
    public final float f278981a;

    /* JADX INFO: renamed from: b */
    public final List f278982b;

    static {
        new z3m0(0.0f, 3);
    }

    public z3m0(float f, List list) {
        this.f278981a = f;
        this.f278982b = list;
    }

    /* JADX INFO: renamed from: a */
    public final z3m0 m95282a(z3m0 z3m0Var) {
        return new z3m0(this.f278981a + z3m0Var.f278981a, g6f.m43700N0(z3m0Var.f278982b, this.f278982b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3m0)) {
            return false;
        }
        z3m0 z3m0Var = (z3m0) obj;
        return ybs.m93301b(this.f278981a, z3m0Var.f278981a) && wj50.m88271j(this.f278982b, z3m0Var.f278982b);
    }

    public final int hashCode() {
        return this.f278982b.hashCode() + (Float.hashCode(this.f278981a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingDimension(dp=");
        pi9.m70086k(this.f278981a, sb, ", resourceIds=");
        sb.append(this.f278982b);
        sb.append(')');
        return sb.toString();
    }

    public z3m0(float f, int i) {
        this((i & 1) != 0 ? 0 : f, lau.f131415a);
    }
}
