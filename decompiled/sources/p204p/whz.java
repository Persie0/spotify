package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class whz extends xz60 {
    @Override // p204p.mz8
    /* JADX INFO: renamed from: f */
    public final Object mo25479f(wz60 wz60Var, float f) {
        return Float.valueOf(m88180l(wz60Var, f));
    }

    /* JADX INFO: renamed from: k */
    public final float m88179k() {
        return m88180l(this.f148644c.mo36143k(), m63236c());
    }

    /* JADX INFO: renamed from: l */
    public final float m88180l(wz60 wz60Var, float f) {
        float f2;
        Object obj = wz60Var.f256493b;
        Object obj2 = wz60Var.f256493b;
        if (obj == null || wz60Var.f256494c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        xh70 xh70Var = this.f148646e;
        if (xh70Var != null) {
            f2 = f;
            Float f3 = (Float) xh70Var.m90961s(wz60Var.f256498g, wz60Var.f256499h.floatValue(), (Float) obj2, (Float) wz60Var.f256494c, f2, m63237d(), this.f148645d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        if (wz60Var.f256500i == -3987645.8f) {
            wz60Var.f256500i = ((Float) obj2).floatValue();
        }
        float f4 = wz60Var.f256500i;
        if (wz60Var.f256501j == -3987645.8f) {
            wz60Var.f256501j = ((Float) wz60Var.f256494c).floatValue();
        }
        return eff0.m38735e(f4, wz60Var.f256501j, f2);
    }
}
