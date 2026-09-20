package p204p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kl80 {

    /* JADX INFO: renamed from: p */
    public static boolean f123823p = false;

    /* JADX INFO: renamed from: q */
    public static int f123824q = 1000;

    /* JADX INFO: renamed from: c */
    public final mer0 f123827c;

    /* JADX INFO: renamed from: f */
    public yj5[] f123830f;

    /* JADX INFO: renamed from: l */
    public final i26 f123836l;

    /* JADX INFO: renamed from: o */
    public yj5 f123839o;

    /* JADX INFO: renamed from: a */
    public boolean f123825a = false;

    /* JADX INFO: renamed from: b */
    public int f123826b = 0;

    /* JADX INFO: renamed from: d */
    public int f123828d = 32;

    /* JADX INFO: renamed from: e */
    public int f123829e = 32;

    /* JADX INFO: renamed from: g */
    public boolean f123831g = false;

    /* JADX INFO: renamed from: h */
    public boolean[] f123832h = new boolean[32];

    /* JADX INFO: renamed from: i */
    public int f123833i = 1;

    /* JADX INFO: renamed from: j */
    public int f123834j = 0;

    /* JADX INFO: renamed from: k */
    public int f123835k = 32;

    /* JADX INFO: renamed from: m */
    public rk31[] f123837m = new rk31[f123824q];

    /* JADX INFO: renamed from: n */
    public int f123838n = 0;

    public kl80() {
        this.f123830f = null;
        this.f123830f = new yj5[32];
        m56818s();
        i26 i26Var = new i26(25);
        this.f123836l = i26Var;
        mer0 mer0Var = new mer0(i26Var);
        mer0Var.f142830f = new rk31[128];
        mer0Var.f142831g = 0;
        mer0Var.f142832h = new tfm0(mer0Var);
        this.f123827c = mer0Var;
        this.f123839o = new yj5(i26Var);
    }

    /* JADX INFO: renamed from: n */
    public static int m56800n(Object obj) {
        rk31 rk31Var = ((c6j) obj).f34554i;
        if (rk31Var != null) {
            return (int) (rk31Var.f199971e + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final rk31 m56801a(int i) {
        rk31 rk31Var = (rk31) ((cl8) this.f123836l.f97753c).m33250t();
        if (rk31Var == null) {
            rk31Var = new rk31(i);
            rk31Var.f199966Y = i;
        } else {
            rk31Var.m75717c();
            rk31Var.f199966Y = i;
        }
        int i2 = this.f123838n;
        int i3 = f123824q;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f123824q = i4;
            this.f123837m = (rk31[]) Arrays.copyOf(this.f123837m, i4);
        }
        rk31[] rk31VarArr = this.f123837m;
        int i5 = this.f123838n;
        this.f123838n = i5 + 1;
        rk31VarArr[i5] = rk31Var;
        return rk31Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m56802b(rk31 rk31Var, rk31 rk31Var2, int i, float f, rk31 rk31Var3, rk31 rk31Var4, int i2, int i3) {
        yj5 yj5VarM56812l = m56812l();
        if (rk31Var2 == rk31Var3) {
            yj5VarM56812l.f273290d.m53522g(rk31Var, 1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var4, 1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var2, -2.0f);
        } else if (f == 0.5f) {
            yj5VarM56812l.f273290d.m53522g(rk31Var, 1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var2, -1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var3, -1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                yj5VarM56812l.f273288b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            yj5VarM56812l.f273290d.m53522g(rk31Var, -1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var2, 1.0f);
            yj5VarM56812l.f273288b = i;
        } else if (f >= 1.0f) {
            yj5VarM56812l.f273290d.m53522g(rk31Var4, -1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var3, 1.0f);
            yj5VarM56812l.f273288b = -i2;
        } else {
            float f2 = 1.0f - f;
            yj5VarM56812l.f273290d.m53522g(rk31Var, f2 * 1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var2, f2 * (-1.0f));
            yj5VarM56812l.f273290d.m53522g(rk31Var3, (-1.0f) * f);
            yj5VarM56812l.f273290d.m53522g(rk31Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                yj5VarM56812l.f273288b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            yj5VarM56812l.m93845a(this, i3);
        }
        m56803c(yj5VarM56812l);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    /* JADX INFO: renamed from: c */
    public final void m56803c(yj5 yj5Var) {
        boolean z;
        boolean z2;
        rk31 rk31VarM93848f;
        if (this.f123834j + 1 >= this.f123835k || this.f123833i + 1 >= this.f123829e) {
            m56814o();
        }
        if (yj5Var.f273291e) {
            z = false;
        } else {
            ArrayList arrayList = yj5Var.f273289c;
            if (this.f123830f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iM53519d = yj5Var.f273290d.m53519d();
                    for (int i = 0; i < iM53519d; i++) {
                        rk31 rk31VarM53520e = yj5Var.f273290d.m53520e(i);
                        if (rk31VarM53520e.f199969c != -1 || rk31VarM53520e.f199972f) {
                            arrayList.add(rk31VarM53520e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            rk31 rk31Var = (rk31) arrayList.get(i2);
                            if (rk31Var.f199972f) {
                                yj5Var.m93850h(this, rk31Var, true);
                            } else {
                                yj5Var.mo61591i(this, this.f123830f[rk31Var.f199969c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (yj5Var.f273287a != null && yj5Var.f273290d.m53519d() == 0) {
                    yj5Var.f273291e = true;
                    this.f123825a = true;
                }
            }
            if (yj5Var.mo61590e()) {
                return;
            }
            float f = yj5Var.f273288b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                yj5Var.f273288b = f * (-1.0f);
                jj5 jj5Var = yj5Var.f273290d;
                int i3 = jj5Var.f112919h;
                for (int i4 = 0; i3 != -1 && i4 < jj5Var.f112912a; i4++) {
                    float[] fArr = jj5Var.f112918g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = jj5Var.f112917f[i3];
                }
            }
            int iM53519d2 = yj5Var.f273290d.m53519d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            rk31 rk31Var2 = null;
            rk31 rk31Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iM53519d2) {
                float fM53521f = yj5Var.f273290d.m53521f(i5);
                rk31 rk31VarM53520e2 = yj5Var.f273290d.m53520e(i5);
                float f5 = f2;
                if (rk31VarM53520e2.f199966Y == 1) {
                    if (rk31Var2 == null) {
                        if (rk31VarM53520e2.f199965X <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        rk31Var2 = rk31VarM53520e2;
                        f3 = fM53521f;
                    } else {
                        if (f3 > fM53521f) {
                            if (rk31VarM53520e2.f199965X > 1) {
                                z4 = false;
                            }
                            rk31Var2 = rk31VarM53520e2;
                            f3 = fM53521f;
                        } else if (z4 || rk31VarM53520e2.f199965X > 1) {
                        }
                        z4 = true;
                        rk31Var2 = rk31VarM53520e2;
                        f3 = fM53521f;
                    }
                } else if (rk31Var2 == null && fM53521f < f5) {
                    if (rk31Var3 == null) {
                        if (rk31VarM53520e2.f199965X <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        rk31Var3 = rk31VarM53520e2;
                        f4 = fM53521f;
                    } else {
                        if (f4 > fM53521f) {
                            if (rk31VarM53520e2.f199965X > 1) {
                                z5 = false;
                            }
                            rk31Var3 = rk31VarM53520e2;
                            f4 = fM53521f;
                        } else if (z5 || rk31VarM53520e2.f199965X > 1) {
                        }
                        z5 = true;
                        rk31Var3 = rk31VarM53520e2;
                        f4 = fM53521f;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (rk31Var2 == null) {
                rk31Var2 = rk31Var3;
            }
            if (rk31Var2 == null) {
                z2 = true;
            } else {
                yj5Var.m93849g(rk31Var2);
                z2 = false;
            }
            if (yj5Var.f273290d.m53519d() == 0) {
                yj5Var.f273291e = true;
            }
            if (z2) {
                if (this.f123833i + 1 >= this.f123829e) {
                    m56814o();
                }
                rk31 rk31VarM56801a = m56801a(3);
                int i6 = this.f123826b + 1;
                this.f123826b = i6;
                this.f123833i++;
                rk31VarM56801a.f199968b = i6;
                i26 i26Var = this.f123836l;
                ((rk31[]) i26Var.f97754d)[i6] = rk31VarM56801a;
                yj5Var.f273287a = rk31VarM56801a;
                int i7 = this.f123834j;
                m56808h(yj5Var);
                if (this.f123834j == i7 + 1) {
                    yj5 yj5Var2 = this.f123839o;
                    yj5Var2.f273287a = null;
                    yj5Var2.f273290d.m53517b();
                    for (int i8 = 0; i8 < yj5Var.f273290d.m53519d(); i8++) {
                        yj5Var2.f273290d.m53516a(yj5Var.f273290d.m53520e(i8), yj5Var.f273290d.m53521f(i8), true);
                    }
                    m56817r(this.f123839o);
                    if (rk31VarM56801a.f199969c == -1) {
                        if (yj5Var.f273287a == rk31VarM56801a && (rk31VarM93848f = yj5Var.m93848f(null, rk31VarM56801a)) != null) {
                            yj5Var.m93849g(rk31VarM93848f);
                        }
                        if (!yj5Var.f273291e) {
                            yj5Var.f273287a.m75719e(this, yj5Var);
                        }
                        ((cl8) i26Var.f97752b).m33233D(yj5Var);
                        this.f123834j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            rk31 rk31Var4 = yj5Var.f273287a;
            if (rk31Var4 == null) {
                return;
            }
            if (rk31Var4.f199966Y != 1 && yj5Var.f273288b < f6) {
                return;
            }
        }
        if (z) {
            return;
        }
        m56808h(yj5Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m56804d(rk31 rk31Var, int i) {
        int i2 = rk31Var.f199969c;
        if (i2 == -1) {
            rk31Var.m75718d(this, i);
            for (int i3 = 0; i3 < this.f123826b + 1; i3++) {
                rk31 rk31Var2 = ((rk31[]) this.f123836l.f97754d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            yj5 yj5VarM56812l = m56812l();
            yj5VarM56812l.f273287a = rk31Var;
            float f = i;
            rk31Var.f199971e = f;
            yj5VarM56812l.f273288b = f;
            yj5VarM56812l.f273291e = true;
            m56803c(yj5VarM56812l);
            return;
        }
        yj5 yj5Var = this.f123830f[i2];
        if (yj5Var.f273291e) {
            yj5Var.f273288b = i;
            return;
        }
        if (yj5Var.f273290d.m53519d() == 0) {
            yj5Var.f273291e = true;
            yj5Var.f273288b = i;
            return;
        }
        yj5 yj5VarM56812l2 = m56812l();
        if (i < 0) {
            yj5VarM56812l2.f273288b = i * (-1);
            yj5VarM56812l2.f273290d.m53522g(rk31Var, 1.0f);
        } else {
            yj5VarM56812l2.f273288b = i;
            yj5VarM56812l2.f273290d.m53522g(rk31Var, -1.0f);
        }
        m56803c(yj5VarM56812l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m56805e(rk31 rk31Var, rk31 rk31Var2, int i, int i2) {
        if (i2 == 8 && rk31Var2.f199972f && rk31Var.f199969c == -1) {
            rk31Var.m75718d(this, rk31Var2.f199971e + i);
            return;
        }
        yj5 yj5VarM56812l = m56812l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            yj5VarM56812l.f273288b = i;
        }
        if (z) {
            yj5VarM56812l.f273290d.m53522g(rk31Var, 1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var2, -1.0f);
        } else {
            yj5VarM56812l.f273290d.m53522g(rk31Var, -1.0f);
            yj5VarM56812l.f273290d.m53522g(rk31Var2, 1.0f);
        }
        if (i2 != 8) {
            yj5VarM56812l.m93845a(this, i2);
        }
        m56803c(yj5VarM56812l);
    }

    /* JADX INFO: renamed from: f */
    public final void m56806f(rk31 rk31Var, rk31 rk31Var2, int i, int i2) {
        yj5 yj5VarM56812l = m56812l();
        rk31 rk31VarM56813m = m56813m();
        rk31VarM56813m.f199970d = 0;
        yj5VarM56812l.m93846b(rk31Var, rk31Var2, rk31VarM56813m, i);
        if (i2 != 8) {
            yj5VarM56812l.f273290d.m53522g(m56810j(i2), (int) (yj5VarM56812l.f273290d.m53518c(rk31VarM56813m) * (-1.0f)));
        }
        m56803c(yj5VarM56812l);
    }

    /* JADX INFO: renamed from: g */
    public final void m56807g(rk31 rk31Var, rk31 rk31Var2, int i, int i2) {
        yj5 yj5VarM56812l = m56812l();
        rk31 rk31VarM56813m = m56813m();
        rk31VarM56813m.f199970d = 0;
        yj5VarM56812l.m93847c(rk31Var, rk31Var2, rk31VarM56813m, i);
        if (i2 != 8) {
            yj5VarM56812l.f273290d.m53522g(m56810j(i2), (int) (yj5VarM56812l.f273290d.m53518c(rk31VarM56813m) * (-1.0f)));
        }
        m56803c(yj5VarM56812l);
    }

    /* JADX INFO: renamed from: h */
    public final void m56808h(yj5 yj5Var) {
        int i;
        if (yj5Var.f273291e) {
            yj5Var.f273287a.m75718d(this, yj5Var.f273288b);
        } else {
            yj5[] yj5VarArr = this.f123830f;
            int i2 = this.f123834j;
            yj5VarArr[i2] = yj5Var;
            rk31 rk31Var = yj5Var.f273287a;
            rk31Var.f199969c = i2;
            this.f123834j = i2 + 1;
            rk31Var.m75719e(this, yj5Var);
        }
        if (this.f123825a) {
            int i3 = 0;
            while (i3 < this.f123834j) {
                if (this.f123830f[i3] == null) {
                    System.out.println("WTF");
                }
                yj5 yj5Var2 = this.f123830f[i3];
                if (yj5Var2 != null && yj5Var2.f273291e) {
                    yj5Var2.f273287a.m75718d(this, yj5Var2.f273288b);
                    ((cl8) this.f123836l.f97752b).m33233D(yj5Var2);
                    this.f123830f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f123834j;
                        if (i4 >= i) {
                            break;
                        }
                        yj5[] yj5VarArr2 = this.f123830f;
                        int i6 = i4 - 1;
                        yj5 yj5Var3 = yj5VarArr2[i4];
                        yj5VarArr2[i6] = yj5Var3;
                        rk31 rk31Var2 = yj5Var3.f273287a;
                        if (rk31Var2.f199969c == i4) {
                            rk31Var2.f199969c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f123830f[i5] = null;
                    }
                    this.f123834j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f123825a = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m56809i() {
        for (int i = 0; i < this.f123834j; i++) {
            yj5 yj5Var = this.f123830f[i];
            yj5Var.f273287a.f199971e = yj5Var.f273288b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final rk31 m56810j(int i) {
        if (this.f123833i + 1 >= this.f123829e) {
            m56814o();
        }
        rk31 rk31VarM56801a = m56801a(4);
        int i2 = this.f123826b + 1;
        this.f123826b = i2;
        this.f123833i++;
        rk31VarM56801a.f199968b = i2;
        rk31VarM56801a.f199970d = i;
        ((rk31[]) this.f123836l.f97754d)[i2] = rk31VarM56801a;
        mer0 mer0Var = this.f123827c;
        tfm0 tfm0Var = mer0Var.f142832h;
        tfm0Var.m80690b(rk31VarM56801a);
        tfm0Var.m80698m();
        rk31VarM56801a.f199974h[rk31VarM56801a.f199970d] = 1.0f;
        mer0Var.m61592j(rk31VarM56801a);
        return rk31VarM56801a;
    }

    /* JADX INFO: renamed from: k */
    public final rk31 m56811k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f123833i + 1 >= this.f123829e) {
            m56814o();
        }
        if (!(obj instanceof c6j)) {
            return null;
        }
        c6j c6jVar = (c6j) obj;
        rk31 rk31Var = c6jVar.f34554i;
        if (rk31Var == null) {
            c6jVar.m31577k();
            rk31Var = c6jVar.f34554i;
        }
        int i = rk31Var.f199968b;
        i26 i26Var = this.f123836l;
        if (i != -1 && i <= this.f123826b && ((rk31[]) i26Var.f97754d)[i] != null) {
            return rk31Var;
        }
        if (i != -1) {
            rk31Var.m75717c();
        }
        int i2 = this.f123826b + 1;
        this.f123826b = i2;
        this.f123833i++;
        rk31Var.f199968b = i2;
        rk31Var.f199966Y = 1;
        ((rk31[]) i26Var.f97754d)[i2] = rk31Var;
        return rk31Var;
    }

    /* JADX INFO: renamed from: l */
    public final yj5 m56812l() {
        i26 i26Var = this.f123836l;
        yj5 yj5Var = (yj5) ((cl8) i26Var.f97752b).m33250t();
        if (yj5Var == null) {
            return new yj5(i26Var);
        }
        yj5Var.f273287a = null;
        yj5Var.f273290d.m53517b();
        yj5Var.f273288b = 0.0f;
        yj5Var.f273291e = false;
        return yj5Var;
    }

    /* JADX INFO: renamed from: m */
    public final rk31 m56813m() {
        if (this.f123833i + 1 >= this.f123829e) {
            m56814o();
        }
        rk31 rk31VarM56801a = m56801a(3);
        int i = this.f123826b + 1;
        this.f123826b = i;
        this.f123833i++;
        rk31VarM56801a.f199968b = i;
        ((rk31[]) this.f123836l.f97754d)[i] = rk31VarM56801a;
        return rk31VarM56801a;
    }

    /* JADX INFO: renamed from: o */
    public final void m56814o() {
        int i = this.f123828d * 2;
        this.f123828d = i;
        this.f123830f = (yj5[]) Arrays.copyOf(this.f123830f, i);
        i26 i26Var = this.f123836l;
        i26Var.f97754d = (rk31[]) Arrays.copyOf((rk31[]) i26Var.f97754d, this.f123828d);
        int i2 = this.f123828d;
        this.f123832h = new boolean[i2];
        this.f123829e = i2;
        this.f123835k = i2;
    }

    /* JADX INFO: renamed from: p */
    public final void m56815p() {
        mer0 mer0Var = this.f123827c;
        if (mer0Var.mo61590e()) {
            m56809i();
            return;
        }
        if (!this.f123831g) {
            m56816q(mer0Var);
            return;
        }
        for (int i = 0; i < this.f123834j; i++) {
            if (!this.f123830f[i].f273291e) {
                m56816q(mer0Var);
                return;
            }
        }
        m56809i();
    }

    /* JADX INFO: renamed from: q */
    public final void m56816q(mer0 mer0Var) {
        for (int i = 0; i < this.f123834j; i++) {
            yj5 yj5Var = this.f123830f[i];
            int i2 = 1;
            if (yj5Var.f273287a.f199966Y != 1) {
                float f = 0.0f;
                if (yj5Var.f273288b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f123834j) {
                            yj5 yj5Var2 = this.f123830f[i6];
                            if (yj5Var2.f273287a.f199966Y != i2 && !yj5Var2.f273291e && yj5Var2.f273288b < f) {
                                int iM53519d = yj5Var2.f273290d.m53519d();
                                int i8 = 0;
                                while (i8 < iM53519d) {
                                    rk31 rk31VarM53520e = yj5Var2.f273290d.m53520e(i8);
                                    float fM53518c = yj5Var2.f273290d.m53518c(rk31VarM53520e);
                                    if (fM53518c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = rk31VarM53520e.f199973g[i9] / fM53518c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = rk31VarM53520e.f199968b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            yj5 yj5Var3 = this.f123830f[i4];
                            yj5Var3.f273287a.f199969c = -1;
                            yj5Var3.m93849g(((rk31[]) this.f123836l.f97754d)[i5]);
                            rk31 rk31Var = yj5Var3.f273287a;
                            rk31Var.f199969c = i4;
                            rk31Var.m75719e(this, yj5Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f123833i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        m56817r(mer0Var);
        m56809i();
    }

    /* JADX INFO: renamed from: r */
    public final void m56817r(yj5 yj5Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f123833i; i2++) {
            this.f123832h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.f123833i * 2) {
                return;
            }
            rk31 rk31Var = yj5Var.f273287a;
            if (rk31Var != null) {
                this.f123832h[rk31Var.f199968b] = true;
            }
            rk31 rk31VarMo61589d = yj5Var.mo61589d(this.f123832h);
            if (rk31VarMo61589d != null) {
                boolean[] zArr = this.f123832h;
                int i5 = rk31VarMo61589d.f199968b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (rk31VarMo61589d != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.f123834j) {
                    yj5 yj5Var2 = this.f123830f[i6];
                    if (yj5Var2.f273287a.f199966Y != i4 && !yj5Var2.f273291e) {
                        jj5 jj5Var = yj5Var2.f273290d;
                        int i8 = jj5Var.f112919h;
                        if (i8 == -1) {
                            z = false;
                            break;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i8 == -1 || i9 >= jj5Var.f112912a) {
                                z = false;
                                break;
                            } else if (jj5Var.f112916e[i8] == rk31VarMo61589d.f199968b) {
                                z = true;
                                break;
                            } else {
                                i8 = jj5Var.f112917f[i8];
                                i9++;
                            }
                        }
                        if (z) {
                            float fM53518c = yj5Var2.f273290d.m53518c(rk31VarMo61589d);
                            if (fM53518c < 0.0f) {
                                float f2 = (-yj5Var2.f273288b) / fM53518c;
                                if (f2 < f) {
                                    f = f2;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    yj5 yj5Var3 = this.f123830f[i7];
                    yj5Var3.f273287a.f199969c = -1;
                    yj5Var3.m93849g(rk31VarMo61589d);
                    rk31 rk31Var2 = yj5Var3.f273287a;
                    rk31Var2.f199969c = i7;
                    rk31Var2.m75719e(this, yj5Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m56818s() {
        for (int i = 0; i < this.f123834j; i++) {
            yj5 yj5Var = this.f123830f[i];
            if (yj5Var != null) {
                ((cl8) this.f123836l.f97752b).m33233D(yj5Var);
            }
            this.f123830f[i] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m56819t() {
        i26 i26Var;
        int i = 0;
        while (true) {
            i26Var = this.f123836l;
            rk31[] rk31VarArr = (rk31[]) i26Var.f97754d;
            if (i >= rk31VarArr.length) {
                break;
            }
            rk31 rk31Var = rk31VarArr[i];
            if (rk31Var != null) {
                rk31Var.m75717c();
            }
            i++;
        }
        ((cl8) i26Var.f97753c).m33234E(this.f123838n, this.f123837m);
        this.f123838n = 0;
        Arrays.fill((rk31[]) i26Var.f97754d, (Object) null);
        this.f123826b = 0;
        mer0 mer0Var = this.f123827c;
        mer0Var.f142831g = 0;
        mer0Var.f273288b = 0.0f;
        this.f123833i = 1;
        for (int i2 = 0; i2 < this.f123834j; i2++) {
            yj5 yj5Var = this.f123830f[i2];
        }
        m56818s();
        this.f123834j = 0;
        this.f123839o = new yj5(i26Var);
    }
}
