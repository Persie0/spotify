package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class yj5 {

    /* JADX INFO: renamed from: d */
    public final jj5 f273290d;

    /* JADX INFO: renamed from: a */
    public rk31 f273287a = null;

    /* JADX INFO: renamed from: b */
    public float f273288b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f273289c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f273291e = false;

    public yj5(i26 i26Var) {
        this.f273290d = new jj5(this, i26Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m93845a(kl80 kl80Var, int i) {
        this.f273290d.m53522g(kl80Var.m56810j(i), 1.0f);
        this.f273290d.m53522g(kl80Var.m56810j(i), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m93846b(rk31 rk31Var, rk31 rk31Var2, rk31 rk31Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f273288b = i;
        }
        if (z) {
            this.f273290d.m53522g(rk31Var, 1.0f);
            this.f273290d.m53522g(rk31Var2, -1.0f);
            this.f273290d.m53522g(rk31Var3, -1.0f);
        } else {
            this.f273290d.m53522g(rk31Var, -1.0f);
            this.f273290d.m53522g(rk31Var2, 1.0f);
            this.f273290d.m53522g(rk31Var3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93847c(rk31 rk31Var, rk31 rk31Var2, rk31 rk31Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f273288b = i;
        }
        if (z) {
            this.f273290d.m53522g(rk31Var, 1.0f);
            this.f273290d.m53522g(rk31Var2, -1.0f);
            this.f273290d.m53522g(rk31Var3, 1.0f);
        } else {
            this.f273290d.m53522g(rk31Var, -1.0f);
            this.f273290d.m53522g(rk31Var2, 1.0f);
            this.f273290d.m53522g(rk31Var3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public rk31 mo61589d(boolean[] zArr) {
        return m93848f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo61590e() {
        return this.f273287a == null && this.f273288b == 0.0f && this.f273290d.m53519d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final rk31 m93848f(boolean[] zArr, rk31 rk31Var) {
        int i;
        int iM53519d = this.f273290d.m53519d();
        rk31 rk31Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM53519d; i2++) {
            float fM53521f = this.f273290d.m53521f(i2);
            if (fM53521f < 0.0f) {
                rk31 rk31VarM53520e = this.f273290d.m53520e(i2);
                if ((zArr == null || !zArr[rk31VarM53520e.f199968b]) && rk31VarM53520e != rk31Var && (((i = rk31VarM53520e.f199966Y) == 3 || i == 4) && fM53521f < f)) {
                    f = fM53521f;
                    rk31Var2 = rk31VarM53520e;
                }
            }
        }
        return rk31Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m93849g(rk31 rk31Var) {
        rk31 rk31Var2 = this.f273287a;
        if (rk31Var2 != null) {
            this.f273290d.m53522g(rk31Var2, -1.0f);
            this.f273287a.f199969c = -1;
            this.f273287a = null;
        }
        float fM53523h = this.f273290d.m53523h(rk31Var, true) * (-1.0f);
        this.f273287a = rk31Var;
        if (fM53523h == 1.0f) {
            return;
        }
        this.f273288b /= fM53523h;
        jj5 jj5Var = this.f273290d;
        int i = jj5Var.f112919h;
        for (int i2 = 0; i != -1 && i2 < jj5Var.f112912a; i2++) {
            float[] fArr = jj5Var.f112918g;
            fArr[i] = fArr[i] / fM53523h;
            i = jj5Var.f112917f[i];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m93850h(kl80 kl80Var, rk31 rk31Var, boolean z) {
        if (rk31Var.f199972f) {
            float fM53518c = this.f273290d.m53518c(rk31Var);
            this.f273288b = (rk31Var.f199971e * fM53518c) + this.f273288b;
            this.f273290d.m53523h(rk31Var, z);
            if (z) {
                rk31Var.m75716b(this);
            }
            if (this.f273290d.m53519d() == 0) {
                this.f273291e = true;
                kl80Var.f123825a = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo61591i(kl80 kl80Var, yj5 yj5Var, boolean z) {
        jj5 jj5Var = this.f273290d;
        jj5Var.getClass();
        float fM53518c = jj5Var.m53518c(yj5Var.f273287a);
        jj5Var.m53523h(yj5Var.f273287a, z);
        jj5 jj5Var2 = yj5Var.f273290d;
        int iM53519d = jj5Var2.m53519d();
        for (int i = 0; i < iM53519d; i++) {
            rk31 rk31VarM53520e = jj5Var2.m53520e(i);
            jj5Var.m53516a(rk31VarM53520e, jj5Var2.m53518c(rk31VarM53520e) * fM53518c, z);
        }
        this.f273288b = (yj5Var.f273288b * fM53518c) + this.f273288b;
        if (z) {
            yj5Var.f273287a.m75716b(this);
        }
        if (this.f273287a == null || this.f273290d.m53519d() != 0) {
            return;
        }
        this.f273291e = true;
        kl80Var.f123825a = true;
    }

    public String toString() {
        boolean z;
        String strM77250i = s571.m77250i(this.f273287a == null ? "0" : "" + this.f273287a, " = ");
        if (this.f273288b != 0.0f) {
            StringBuilder sbM36620t = dq60.m36620t(strM77250i);
            sbM36620t.append(this.f273288b);
            strM77250i = sbM36620t.toString();
            z = true;
        } else {
            z = false;
        }
        int iM53519d = this.f273290d.m53519d();
        for (int i = 0; i < iM53519d; i++) {
            rk31 rk31VarM53520e = this.f273290d.m53520e(i);
            if (rk31VarM53520e != null) {
                float fM53521f = this.f273290d.m53521f(i);
                if (fM53521f != 0.0f) {
                    String string = rk31VarM53520e.toString();
                    if (z) {
                        if (fM53521f > 0.0f) {
                            strM77250i = s571.m77250i(strM77250i, " + ");
                        } else {
                            strM77250i = s571.m77250i(strM77250i, " - ");
                            fM53521f *= -1.0f;
                        }
                    } else if (fM53521f < 0.0f) {
                        strM77250i = s571.m77250i(strM77250i, "- ");
                        fM53521f *= -1.0f;
                    }
                    strM77250i = fM53521f == 1.0f ? s571.m77250i(strM77250i, string) : strM77250i + fM53521f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? s571.m77250i(strM77250i, "0.0") : strM77250i;
    }
}
