package p204p;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class iwd1 extends pwd1 {

    /* JADX INFO: renamed from: i */
    public static boolean f106401i = false;

    /* JADX INFO: renamed from: j */
    public static Method f106402j;

    /* JADX INFO: renamed from: k */
    public static Class f106403k;

    /* JADX INFO: renamed from: l */
    public static Field f106404l;

    /* JADX INFO: renamed from: m */
    public static Field f106405m;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f106406c;

    /* JADX INFO: renamed from: d */
    public dx40[] f106407d;

    /* JADX INFO: renamed from: e */
    public dx40 f106408e;

    /* JADX INFO: renamed from: f */
    public swd1 f106409f;

    /* JADX INFO: renamed from: g */
    public dx40 f106410g;

    /* JADX INFO: renamed from: h */
    public int f106411h;

    public iwd1(swd1 swd1Var, WindowInsets windowInsets) {
        super(swd1Var);
        this.f106408e = null;
        this.f106406c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: B */
    private static void m51798B() {
        try {
            f106402j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f106403k = cls;
            f106404l = cls.getDeclaredField("mVisibleInsets");
            f106405m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f106404l.setAccessible(true);
            f106405m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f106401i = true;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m51799C(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: w */
    private dx40 m51800w(int i, boolean z) {
        dx40 dx40VarM37188a = dx40.f53847e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                dx40VarM37188a = dx40.m37188a(dx40VarM37188a, m51816x(i2, z));
            }
        }
        return dx40VarM37188a;
    }

    /* JADX INFO: renamed from: y */
    private dx40 m51801y() {
        swd1 swd1Var = this.f106409f;
        return swd1Var != null ? swd1Var.f214650a.mo54433j() : dx40.f53847e;
    }

    /* JADX INFO: renamed from: z */
    private dx40 m51802z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f106401i) {
            m51798B();
        }
        Method method = f106402j;
        if (method != null && f106403k != null && f106404l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f106404l.get(f106405m.get(objInvoke));
                    if (rect != null) {
                        return dx40.m37190c(rect);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public boolean m51803A(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m51816x(i, false).equals(dx40.f53847e);
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: d */
    public void mo51804d(View view) {
        dx40 dx40VarM51802z = m51802z(view);
        if (dx40VarM51802z == null) {
            dx40VarM51802z = dx40.f53847e;
        }
        mo51813s(dx40VarM51802z);
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: e */
    public void mo51805e(swd1 swd1Var) {
        swd1Var.f214650a.mo51814t(this.f106409f);
        dx40 dx40Var = this.f106410g;
        pwd1 pwd1Var = swd1Var.f214650a;
        pwd1Var.mo51813s(dx40Var);
        pwd1Var.mo51815v(this.f106411h);
    }

    @Override // p204p.pwd1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        iwd1 iwd1Var = (iwd1) obj;
        return Objects.equals(this.f106410g, iwd1Var.f106410g) && m51799C(this.f106411h, iwd1Var.f106411h);
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: g */
    public dx40 mo51806g(int i) {
        return m51800w(i, false);
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: h */
    public dx40 mo51807h(int i) {
        return m51800w(i, true);
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: l */
    public final dx40 mo51808l() {
        if (this.f106408e == null) {
            WindowInsets windowInsets = this.f106406c;
            this.f106408e = dx40.m37189b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f106408e;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: n */
    public swd1 mo51809n(int i, int i2, int i3, int i4) {
        kkc1 kkc1Var = new kkc1(swd1.m79536g(null, this.f106406c));
        kkc1Var.m56713f(swd1.m79535e(mo51808l(), i, i2, i3, i4));
        kkc1Var.m56712e(swd1.m79535e(mo54433j(), i, i2, i3, i4));
        return kkc1Var.m56710b();
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: p */
    public boolean mo51810p() {
        return this.f106406c.isRound();
    }

    @Override // p204p.pwd1
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public boolean mo51811q(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m51803A(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: r */
    public void mo51812r(dx40[] dx40VarArr) {
        this.f106407d = dx40VarArr;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: s */
    public void mo51813s(dx40 dx40Var) {
        this.f106410g = dx40Var;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: t */
    public void mo51814t(swd1 swd1Var) {
        this.f106409f = swd1Var;
    }

    @Override // p204p.pwd1
    /* JADX INFO: renamed from: v */
    public void mo51815v(int i) {
        this.f106411h = i;
    }

    /* JADX INFO: renamed from: x */
    public dx40 m51816x(int i, boolean z) {
        dx40 dx40VarMo54433j;
        int i2;
        dx40 dx40Var = dx40.f53847e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    dx40[] dx40VarArr = this.f106407d;
                    dx40VarMo54433j = dx40VarArr != null ? dx40VarArr[epv0.m39704x(8)] : null;
                    if (dx40VarMo54433j != null) {
                        return dx40VarMo54433j;
                    }
                    dx40 dx40VarMo51808l = mo51808l();
                    dx40 dx40VarM51801y = m51801y();
                    int i3 = dx40VarMo51808l.f53851d;
                    if (i3 > dx40VarM51801y.f53851d) {
                        return dx40.m37189b(0, 0, 0, i3);
                    }
                    dx40 dx40Var2 = this.f106410g;
                    if (dx40Var2 != null && !dx40Var2.equals(dx40Var) && (i2 = this.f106410g.f53851d) > dx40VarM51801y.f53851d) {
                        return dx40.m37189b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo60118k();
                    }
                    if (i == 32) {
                        return mo60117i();
                    }
                    if (i == 64) {
                        return mo60119m();
                    }
                    if (i == 128) {
                        swd1 swd1Var = this.f106409f;
                        evr evrVarMo57527f = swd1Var != null ? swd1Var.f214650a.mo57527f() : mo57527f();
                        if (evrVarMo57527f != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return dx40.m37189b(i4 >= 28 ? r35.m74616x(evrVarMo57527f.f63305a) : 0, i4 >= 28 ? r35.m74618z(evrVarMo57527f.f63305a) : 0, i4 >= 28 ? r35.m74617y(evrVarMo57527f.f63305a) : 0, i4 >= 28 ? r35.m74615w(evrVarMo57527f.f63305a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    dx40 dx40VarM51801y2 = m51801y();
                    dx40 dx40VarMo54433j2 = mo54433j();
                    return dx40.m37189b(Math.max(dx40VarM51801y2.f53848a, dx40VarMo54433j2.f53848a), 0, Math.max(dx40VarM51801y2.f53850c, dx40VarMo54433j2.f53850c), Math.max(dx40VarM51801y2.f53851d, dx40VarMo54433j2.f53851d));
                }
                if ((this.f106411h & 2) == 0) {
                    dx40 dx40VarMo51808l2 = mo51808l();
                    swd1 swd1Var2 = this.f106409f;
                    dx40VarMo54433j = swd1Var2 != null ? swd1Var2.f214650a.mo54433j() : null;
                    int iMin = dx40VarMo51808l2.f53851d;
                    if (dx40VarMo54433j != null) {
                        iMin = Math.min(iMin, dx40VarMo54433j.f53851d);
                    }
                    return dx40.m37189b(dx40VarMo51808l2.f53848a, 0, dx40VarMo51808l2.f53850c, iMin);
                }
            }
        } else {
            if (z) {
                return dx40.m37189b(0, Math.max(m51801y().f53849b, mo51808l().f53849b), 0, 0);
            }
            if ((this.f106411h & 4) == 0) {
                return dx40.m37189b(0, mo51808l().f53849b, 0, 0);
            }
        }
        return dx40Var;
    }

    public iwd1(swd1 swd1Var, iwd1 iwd1Var) {
        this(swd1Var, new WindowInsets(iwd1Var.f106406c));
    }
}
