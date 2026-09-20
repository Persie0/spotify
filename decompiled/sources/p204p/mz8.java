package p204p;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mz8 {

    /* JADX INFO: renamed from: c */
    public final kz8 f148644c;

    /* JADX INFO: renamed from: e */
    public xh70 f148646e;

    /* JADX INFO: renamed from: a */
    public final ArrayList f148642a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f148643b = false;

    /* JADX INFO: renamed from: d */
    public float f148645d = 0.0f;

    /* JADX INFO: renamed from: f */
    public Object f148647f = null;

    /* JADX INFO: renamed from: g */
    public float f148648g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f148649h = -1.0f;

    public mz8(List list) {
        kz8 dj0Var;
        if (list.isEmpty()) {
            dj0Var = new ui5(1);
        } else {
            dj0Var = list.size() == 1 ? new dj0(list) : new lz8(list);
        }
        this.f148644c = dj0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m63235a(jz8 jz8Var) {
        this.f148642a.add(jz8Var);
    }

    /* JADX INFO: renamed from: b */
    public float mo46514b() {
        if (this.f148649h == -1.0f) {
            this.f148649h = this.f148644c.mo36146t();
        }
        return this.f148649h;
    }

    /* JADX INFO: renamed from: c */
    public final float m63236c() {
        Interpolator interpolator;
        wz60 wz60VarMo36143k = this.f148644c.mo36143k();
        if (wz60VarMo36143k == null || wz60VarMo36143k.m89400c() || (interpolator = wz60VarMo36143k.f256495d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(m63237d());
    }

    /* JADX INFO: renamed from: d */
    public final float m63237d() {
        if (this.f148643b) {
            return 0.0f;
        }
        wz60 wz60VarMo36143k = this.f148644c.mo36143k();
        if (wz60VarMo36143k.m89400c()) {
            return 0.0f;
        }
        return (this.f148645d - wz60VarMo36143k.m89399b()) / (wz60VarMo36143k.m89398a() - wz60VarMo36143k.m89399b());
    }

    /* JADX INFO: renamed from: e */
    public Object mo46515e() {
        float fM63237d = m63237d();
        xh70 xh70Var = this.f148646e;
        kz8 kz8Var = this.f148644c;
        if (xh70Var == null && kz8Var.mo36142i(fM63237d)) {
            return this.f148647f;
        }
        wz60 wz60VarMo36143k = kz8Var.mo36143k();
        Interpolator interpolator = wz60VarMo36143k.f256496e;
        Interpolator interpolator2 = wz60VarMo36143k.f256497f;
        Object objMo25479f = (interpolator == null || interpolator2 == null) ? mo25479f(wz60VarMo36143k, m63236c()) : mo35150g(wz60VarMo36143k, fM63237d, interpolator.getInterpolation(fM63237d), interpolator2.getInterpolation(fM63237d));
        this.f148647f = objMo25479f;
        return objMo25479f;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo25479f(wz60 wz60Var, float f);

    /* JADX INFO: renamed from: g */
    public Object mo35150g(wz60 wz60Var, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: h */
    public void mo46516h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f148642a;
            if (i >= arrayList.size()) {
                return;
            }
            ((jz8) arrayList.get(i)).mo27895a();
            i++;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo46517i(float f) {
        kz8 kz8Var = this.f148644c;
        if (kz8Var.isEmpty()) {
            return;
        }
        if (this.f148648g == -1.0f) {
            this.f148648g = kz8Var.mo36145m();
        }
        float f2 = this.f148648g;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f148648g = kz8Var.mo36145m();
            }
            f = this.f148648g;
        } else if (f > mo46514b()) {
            f = mo46514b();
        }
        if (f == this.f148645d) {
            return;
        }
        this.f148645d = f;
        if (kz8Var.mo36144l(f)) {
            mo46516h();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m63238j(xh70 xh70Var) {
        xh70 xh70Var2 = this.f148646e;
        if (xh70Var2 != null) {
            xh70Var2.getClass();
        }
        this.f148646e = xh70Var;
    }
}
