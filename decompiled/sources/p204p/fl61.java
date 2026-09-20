package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fl61 {

    /* JADX INFO: renamed from: a */
    public final float f70710a;

    /* JADX INFO: renamed from: b */
    public final float f70711b;

    public fl61(float f, float f2) {
        this.f70710a = f;
        this.f70711b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl61)) {
            return false;
        }
        fl61 fl61Var = (fl61) obj;
        return ybs.m93301b(this.f70710a, fl61Var.f70710a) && ybs.m93301b(this.f70711b, fl61Var.f70711b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f70711b) + (Float.hashCode(this.f70710a) * 31);
    }

    public final String toString() {
        float f = this.f70710a;
        String strM93302c = ybs.m93302c(f);
        float f2 = this.f70711b;
        return dq60.m36616p(ybs.m93302c(f2), ")", edb.m38573v("TabPosition(left=", strM93302c, ", right=", ybs.m93302c(f + f2), ", width="));
    }
}
