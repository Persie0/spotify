package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p204p.C2449ud;
import p204p.RunnableC1978ih;
import p204p.aoc1;
import p204p.aqs;
import p204p.b2u0;
import p204p.b381;
import p204p.boc1;
import p204p.c1i0;
import p204p.c7j;
import p204p.dq60;
import p204p.eef;
import p204p.fa81;
import p204p.hkf1;
import p204p.iew0;
import p204p.ii5;
import p204p.j1i0;
import p204p.k1i0;
import p204p.kk00;
import p204p.l1i0;
import p204p.lgj0;
import p204p.m1i0;
import p204p.m57;
import p204p.m651;
import p204p.mif1;
import p204p.mlc1;
import p204p.mx41;
import p204p.n1i0;
import p204p.nx41;
import p204p.o1i0;
import p204p.p1i0;
import p204p.p6j;
import p204p.q6j;
import p204p.qg41;
import p204p.sgz;
import p204p.t1i0;
import p204p.u1i0;
import p204p.uyq;
import p204p.v1i0;
import p204p.v7j;
import p204p.vbu0;
import p204p.w7j;
import p204p.x1p0;
import p204p.zjc1;
import p204p.zwi;

/* JADX INFO: loaded from: classes3.dex */
public class MotionLayout extends ConstraintLayout implements lgj0 {

    /* JADX INFO: renamed from: V1 */
    public static boolean f633V1;

    /* JADX INFO: renamed from: A1 */
    public float f634A1;

    /* JADX INFO: renamed from: B1 */
    public boolean f635B1;

    /* JADX INFO: renamed from: C1 */
    public int f636C1;

    /* JADX INFO: renamed from: D1 */
    public int f637D1;

    /* JADX INFO: renamed from: E1 */
    public int f638E1;

    /* JADX INFO: renamed from: F1 */
    public int f639F1;

    /* JADX INFO: renamed from: G1 */
    public int f640G1;

    /* JADX INFO: renamed from: H1 */
    public int f641H1;

    /* JADX INFO: renamed from: I1 */
    public float f642I1;

    /* JADX INFO: renamed from: J1 */
    public final iew0 f643J1;

    /* JADX INFO: renamed from: K1 */
    public boolean f644K1;

    /* JADX INFO: renamed from: L1 */
    public m1i0 f645L1;

    /* JADX INFO: renamed from: M1 */
    public b381 f646M1;

    /* JADX INFO: renamed from: N1 */
    public final Rect f647N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f648O1;

    /* JADX INFO: renamed from: P1 */
    public o1i0 f649P1;

    /* JADX INFO: renamed from: Q1 */
    public final zwi f650Q1;

    /* JADX INFO: renamed from: R0 */
    public v1i0 f651R0;

    /* JADX INFO: renamed from: R1 */
    public boolean f652R1;

    /* JADX INFO: renamed from: S0 */
    public j1i0 f653S0;

    /* JADX INFO: renamed from: S1 */
    public final RectF f654S1;

    /* JADX INFO: renamed from: T0 */
    public Interpolator f655T0;

    /* JADX INFO: renamed from: T1 */
    public View f656T1;

    /* JADX INFO: renamed from: U0 */
    public float f657U0;

    /* JADX INFO: renamed from: U1 */
    public Matrix f658U1;

    /* JADX INFO: renamed from: V0 */
    public int f659V0;

    /* JADX INFO: renamed from: W0 */
    public int f660W0;

    /* JADX INFO: renamed from: X0 */
    public int f661X0;

    /* JADX INFO: renamed from: Y0 */
    public int f662Y0;

    /* JADX INFO: renamed from: Z0 */
    public int f663Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f664a1;

    /* JADX INFO: renamed from: b1 */
    public final HashMap f665b1;

    /* JADX INFO: renamed from: c1 */
    public long f666c1;

    /* JADX INFO: renamed from: d1 */
    public float f667d1;

    /* JADX INFO: renamed from: e1 */
    public float f668e1;

    /* JADX INFO: renamed from: f1 */
    public float f669f1;

    /* JADX INFO: renamed from: g1 */
    public long f670g1;

    /* JADX INFO: renamed from: h1 */
    public float f671h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f672i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f673j1;

    /* JADX INFO: renamed from: k1 */
    public int f674k1;

    /* JADX INFO: renamed from: l1 */
    public l1i0 f675l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f676m1;

    /* JADX INFO: renamed from: n1 */
    public final m651 f677n1;

    /* JADX INFO: renamed from: o1 */
    public final k1i0 f678o1;

    /* JADX INFO: renamed from: p1 */
    public uyq f679p1;

    /* JADX INFO: renamed from: q1 */
    public int f680q1;

    /* JADX INFO: renamed from: r1 */
    public int f681r1;

    /* JADX INFO: renamed from: s1 */
    public boolean f682s1;

    /* JADX INFO: renamed from: t1 */
    public float f683t1;

    /* JADX INFO: renamed from: u1 */
    public float f684u1;

    /* JADX INFO: renamed from: v1 */
    public long f685v1;

    /* JADX INFO: renamed from: w1 */
    public float f686w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f687x1;

    /* JADX INFO: renamed from: y1 */
    public int f688y1;

    /* JADX INFO: renamed from: z1 */
    public long f689z1;

    public MotionLayout(Context context) {
        super(context);
        this.f655T0 = null;
        this.f657U0 = 0.0f;
        this.f659V0 = -1;
        this.f660W0 = -1;
        this.f661X0 = -1;
        this.f662Y0 = 0;
        this.f663Z0 = 0;
        this.f664a1 = true;
        this.f665b1 = new HashMap();
        this.f666c1 = 0L;
        this.f667d1 = 1.0f;
        this.f668e1 = 0.0f;
        this.f669f1 = 0.0f;
        this.f671h1 = 0.0f;
        this.f673j1 = false;
        this.f674k1 = 0;
        this.f676m1 = false;
        this.f677n1 = new m651();
        this.f678o1 = new k1i0(this);
        this.f682s1 = false;
        this.f687x1 = false;
        this.f688y1 = 0;
        this.f689z1 = -1L;
        this.f634A1 = 0.0f;
        this.f635B1 = false;
        this.f643J1 = new iew0(1);
        this.f644K1 = false;
        this.f646M1 = null;
        new HashMap();
        this.f647N1 = new Rect();
        this.f648O1 = false;
        this.f649P1 = o1i0.f160764a;
        this.f650Q1 = new zwi(this);
        this.f652R1 = false;
        this.f654S1 = new RectF();
        this.f656T1 = null;
        this.f658U1 = null;
        new ArrayList();
        m332G(null);
    }

    /* JADX INFO: renamed from: x */
    public static Rect m326x(MotionLayout motionLayout, v7j v7jVar) {
        Rect rect = motionLayout.f647N1;
        rect.top = v7jVar.m84888u();
        rect.left = v7jVar.m84887t();
        rect.right = v7jVar.m84886s() + rect.left;
        rect.bottom = v7jVar.m84882m() + rect.top;
        return rect;
    }

    /* JADX INFO: renamed from: B */
    public final void m327B(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0043a c0043a = (C0043a) this.f665b1.get(getChildAt(i));
            if (c0043a != null && "button".equals(mif1.m61891z(c0043a.f699b)) && c0043a.f690A != null) {
                int i2 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = c0043a.f690A;
                    if (i2 < keyTriggerArr.length) {
                        keyTriggerArr[i2].m324g(c0043a.f699b, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0178  */
    /* JADX WARN: Code duplicated, block: B:102:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x0214  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0 A[PHI: r3
      0x00e0: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:49:0x00ae, B:60:0x00d4, B:62:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    /* JADX INFO: renamed from: C */
    public final void m328C(boolean z) {
        boolean z2;
        char c;
        o1i0 o1i0Var;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        View childAt;
        C0043a c0043a;
        boolean z3;
        if (this.f670g1 == -1) {
            this.f670g1 = getNanoTime();
        }
        float f2 = this.f669f1;
        float f3 = 0.0f;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f660W0 = -1;
        }
        boolean z4 = false;
        if (this.f687x1 || (this.f673j1 && (z || this.f671h1 != f2))) {
            float fSignum = Math.signum(this.f671h1 - f2);
            long nanoTime2 = getNanoTime();
            j1i0 j1i0Var = this.f653S0;
            float f4 = j1i0Var == null ? (((nanoTime2 - this.f670g1) * fSignum) * 1.0E-9f) / this.f667d1 : 0.0f;
            float f5 = this.f669f1 + f4;
            if (this.f672i1) {
                f5 = this.f671h1;
            }
            if ((fSignum <= 0.0f || f5 < this.f671h1) && (fSignum > 0.0f || f5 > this.f671h1)) {
                z2 = false;
            } else {
                f5 = this.f671h1;
                this.f673j1 = false;
                z2 = true;
            }
            this.f669f1 = f5;
            this.f668e1 = f5;
            this.f670g1 = nanoTime2;
            if (j1i0Var == null || z2) {
                this.f657U0 = f4;
            } else {
                if (this.f676m1) {
                    float interpolation2 = j1i0Var.getInterpolation((nanoTime2 - this.f666c1) * 1.0E-9f);
                    j1i0 j1i0Var2 = this.f653S0;
                    m651 m651Var = this.f677n1;
                    if (j1i0Var2 == m651Var) {
                        c = m651Var.f140394c.mo55584b() ? (char) 2 : (char) 1;
                    } else {
                        c = 0;
                    }
                    this.f669f1 = interpolation2;
                    this.f670g1 = nanoTime2;
                    j1i0 j1i0Var3 = this.f653S0;
                    if (j1i0Var3 != null) {
                        float fMo52165a = j1i0Var3.mo52165a();
                        this.f657U0 = fMo52165a;
                        if (Math.abs(fMo52165a) * this.f667d1 <= 1.0E-5f && c == 2) {
                            this.f673j1 = false;
                        }
                        if (fMo52165a > 0.0f && interpolation2 >= 1.0f) {
                            this.f669f1 = 1.0f;
                            this.f673j1 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fMo52165a >= 0.0f || interpolation2 > 0.0f) {
                            f5 = interpolation2;
                        } else {
                            this.f669f1 = 0.0f;
                            this.f673j1 = false;
                            f5 = 0.0f;
                        }
                    } else {
                        f5 = interpolation2;
                    }
                } else {
                    float interpolation3 = j1i0Var.getInterpolation(f5);
                    j1i0 j1i0Var4 = this.f653S0;
                    if (j1i0Var4 != null) {
                        this.f657U0 = j1i0Var4.mo52165a();
                    } else {
                        this.f657U0 = ((j1i0Var4.getInterpolation(f5 + f4) - interpolation3) * fSignum) / f4;
                    }
                    f5 = interpolation3;
                }
                if (Math.abs(this.f657U0) > 1.0E-5f) {
                    setState(o1i0.f160766c);
                }
                o1i0Var = o1i0.f160767d;
                if (c != 1) {
                    if ((fSignum <= 0.0f && f5 >= this.f671h1) || (fSignum <= 0.0f && f5 <= this.f671h1)) {
                        f5 = this.f671h1;
                        this.f673j1 = false;
                    }
                    if (f5 < 1.0f || f5 <= 0.0f) {
                        this.f673j1 = false;
                        setState(o1i0Var);
                    }
                }
                childCount = getChildCount();
                this.f687x1 = false;
                nanoTime = getNanoTime();
                this.f642I1 = f5;
                interpolator = this.f655T0;
                if (interpolator == null) {
                    interpolation = f5;
                } else {
                    interpolation = interpolator.getInterpolation(f5);
                }
                interpolator2 = this.f655T0;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f667d1) + f5);
                    this.f657U0 = interpolation4;
                    this.f657U0 = interpolation4 - this.f655T0.getInterpolation(f5);
                }
                i = 0;
                while (i < childCount) {
                    childAt = getChildAt(i);
                    c0043a = (C0043a) this.f665b1.get(childAt);
                    if (c0043a != null) {
                        this.f687x1 = c0043a.m350d(interpolation, nanoTime, childAt, this.f643J1) | this.f687x1;
                    }
                    i++;
                    f3 = f3;
                }
                f = f3;
                boolean z5 = (fSignum <= 0.0f && f5 >= this.f671h1) || (fSignum <= f && f5 <= this.f671h1);
                if (!this.f687x1 && !this.f673j1 && z5) {
                    setState(o1i0Var);
                }
                if (this.f635B1) {
                    requestLayout();
                }
                this.f687x1 = (!z5) | this.f687x1;
                if (f5 <= f && (i4 = this.f659V0) != -1 && this.f660W0 != i4) {
                    this.f660W0 = i4;
                    this.f651R0.m84466b(i4).m31732a(this);
                    setState(o1i0Var);
                    z4 = true;
                }
                if (f5 >= 1.0d) {
                    i2 = this.f660W0;
                    i3 = this.f661X0;
                    if (i2 != i3) {
                        this.f660W0 = i3;
                        this.f651R0.m84466b(i3).m31732a(this);
                        setState(o1i0Var);
                        z4 = true;
                    }
                }
                if (!this.f687x1 || this.f673j1) {
                    invalidate();
                } else if ((fSignum > 0.0f && f5 == 1.0f) || (fSignum < f && f5 == f)) {
                    setState(o1i0Var);
                }
                if (!this.f687x1 && !this.f673j1 && ((fSignum > 0.0f && f5 == 1.0f) || (fSignum < f && f5 == f))) {
                    m333H();
                }
            }
            c = 0;
            if (Math.abs(this.f657U0) > 1.0E-5f) {
                setState(o1i0.f160766c);
            }
            o1i0Var = o1i0.f160767d;
            if (c != 1) {
                if (fSignum <= 0.0f) {
                    f5 = this.f671h1;
                    this.f673j1 = false;
                } else {
                    f5 = this.f671h1;
                    this.f673j1 = false;
                }
                if (f5 < 1.0f) {
                    this.f673j1 = false;
                    setState(o1i0Var);
                } else {
                    this.f673j1 = false;
                    setState(o1i0Var);
                }
            }
            childCount = getChildCount();
            this.f687x1 = false;
            nanoTime = getNanoTime();
            this.f642I1 = f5;
            interpolator = this.f655T0;
            if (interpolator == null) {
                interpolation = f5;
            } else {
                interpolation = interpolator.getInterpolation(f5);
            }
            interpolator2 = this.f655T0;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f667d1) + f5);
                this.f657U0 = interpolation5;
                this.f657U0 = interpolation5 - this.f655T0.getInterpolation(f5);
            }
            i = 0;
            while (i < childCount) {
                childAt = getChildAt(i);
                c0043a = (C0043a) this.f665b1.get(childAt);
                if (c0043a != null) {
                    this.f687x1 = c0043a.m350d(interpolation, nanoTime, childAt, this.f643J1) | this.f687x1;
                }
                i++;
                f3 = f3;
            }
            f = f3;
            if (fSignum <= 0.0f) {
            }
            if (!this.f687x1) {
                setState(o1i0Var);
            }
            if (this.f635B1) {
                requestLayout();
            }
            this.f687x1 = (!z5) | this.f687x1;
            if (f5 <= f) {
                this.f660W0 = i4;
                this.f651R0.m84466b(i4).m31732a(this);
                setState(o1i0Var);
                z4 = true;
            }
            if (f5 >= 1.0d) {
                i2 = this.f660W0;
                i3 = this.f661X0;
                if (i2 != i3) {
                    this.f660W0 = i3;
                    this.f651R0.m84466b(i3).m31732a(this);
                    setState(o1i0Var);
                    z4 = true;
                }
            }
            if (this.f687x1) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f687x1) {
                m333H();
            }
        } else {
            f = 0.0f;
        }
        float f6 = this.f669f1;
        if (f6 < 1.0f) {
            if (f6 <= f) {
                int i5 = this.f660W0;
                int i6 = this.f659V0;
                z3 = i5 == i6 ? z4 : true;
                this.f660W0 = i6;
            }
            this.f652R1 |= z4;
            if (z4 && !this.f644K1) {
                requestLayout();
            }
            this.f668e1 = this.f669f1;
        }
        int i7 = this.f660W0;
        int i8 = this.f661X0;
        z3 = i7 == i8 ? z4 : true;
        this.f660W0 = i8;
        z4 = z3;
        this.f652R1 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f668e1 = this.f669f1;
    }

    /* JADX INFO: renamed from: D */
    public final void m329D(int i, float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        View view = (View) this.f733a.get(i);
        C0043a c0043a = (C0043a) this.f665b1.get(view);
        if (c0043a == null) {
            if (view == null) {
                return;
            }
            view.getContext().getResources().getResourceName(i);
            return;
        }
        p1i0 p1i0Var = c0043a.f703f;
        float[] fArr2 = c0043a.f719v;
        float fM347a = c0043a.m347a(f, fArr2);
        hkf1[] hkf1VarArr = c0043a.f707j;
        int i2 = 0;
        if (hkf1VarArr != null) {
            double d = fM347a;
            hkf1VarArr[0].mo25153t(d, c0043a.f714q);
            c0043a.f707j[0].mo25151r(d, c0043a.f713p);
            float f4 = fArr2[0];
            while (true) {
                dArr = c0043a.f714q;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * ((double) f4);
                i2++;
            }
            ii5 ii5Var = c0043a.f708k;
            if (ii5Var != null) {
                double[] dArr2 = c0043a.f713p;
                if (dArr2.length > 0) {
                    ii5Var.mo25151r(d, dArr2);
                    c0043a.f708k.mo25153t(d, c0043a.f714q);
                    int[] iArr = c0043a.f712o;
                    double[] dArr3 = c0043a.f714q;
                    double[] dArr4 = c0043a.f713p;
                    p1i0Var.getClass();
                    p1i0.m68815e(f2, f3, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = c0043a.f712o;
                double[] dArr5 = c0043a.f713p;
                p1i0Var.getClass();
                p1i0.m68815e(f2, f3, fArr, iArr2, dArr, dArr5);
            }
        } else {
            p1i0 p1i0Var2 = c0043a.f704g;
            float f5 = p1i0Var2.f173103e - p1i0Var.f173103e;
            float f6 = p1i0Var2.f173104f - p1i0Var.f173104f;
            float f7 = p1i0Var2.f173105g - p1i0Var.f173105g;
            float f8 = (p1i0Var2.f173106h - p1i0Var.f173106h) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
        }
        view.getY();
    }

    /* JADX INFO: renamed from: E */
    public final c7j m330E(int i) {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null) {
            return null;
        }
        return v1i0Var.m84466b(i);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m331F(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (m331F((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            float right = (view.getRight() + f) - view.getLeft();
            float bottom = (view.getBottom() + f2) - view.getTop();
            RectF rectF = this.f654S1;
            rectF.set(f, f2, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f3, f4);
                    if (this.f658U1 == null) {
                        this.f658U1 = new Matrix();
                    }
                    matrix.invert(this.f658U1);
                    motionEventObtain.transform(this.f658U1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: G */
    public final void m332G(AttributeSet attributeSet) {
        v1i0 v1i0Var;
        v1i0 v1i0Var2;
        f633V1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b2u0.f22708l);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.f651R0 = new v1i0(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f660W0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f671h1 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f673j1 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.f674k1 == 0) {
                        this.f674k1 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f674k1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.f651R0 = null;
            }
        }
        if (this.f674k1 != 0 && (v1i0Var2 = this.f651R0) != null) {
            int iM84471h = v1i0Var2.m84471h();
            v1i0 v1i0Var3 = this.f651R0;
            c7j c7jVarM84466b = v1i0Var3.m84466b(v1i0Var3.m84471h());
            mif1.m61890y(getContext(), iM84471h);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (c7jVarM84466b.m31741m(childAt.getId()) == null) {
                    mif1.m61891z(childAt);
                }
            }
            Integer[] numArr = (Integer[]) c7jVarM84466b.f34938g.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = numArr[i3].intValue();
            }
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = iArr[i4];
                mif1.m61890y(getContext(), i5);
                findViewById(iArr[i4]);
                int i6 = c7jVarM84466b.m31740l(i5).f258686e.f269827d;
                int i7 = c7jVarM84466b.m31740l(i5).f258686e.f269825c;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (u1i0 u1i0Var : this.f651R0.f236372d) {
                u1i0 u1i0Var2 = this.f651R0.f236371c;
                int i8 = u1i0Var.f225832d;
                int i9 = u1i0Var.f225831c;
                mif1.m61890y(getContext(), i8);
                mif1.m61890y(getContext(), i9);
                sparseIntArray.get(i8);
                sparseIntArray2.get(i9);
                sparseIntArray.put(i8, i9);
                sparseIntArray2.put(i9, i8);
                this.f651R0.m84466b(i8);
                this.f651R0.m84466b(i9);
            }
        }
        if (this.f660W0 != -1 || (v1i0Var = this.f651R0) == null) {
            return;
        }
        this.f660W0 = v1i0Var.m84471h();
        this.f659V0 = this.f651R0.m84471h();
        u1i0 u1i0Var3 = this.f651R0.f236371c;
        this.f661X0 = u1i0Var3 != null ? u1i0Var3.f225831c : -1;
    }

    /* JADX INFO: renamed from: H */
    public final void m333H() {
        u1i0 u1i0Var;
        fa81 fa81Var;
        View viewFindViewById;
        View viewFindViewById2;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null) {
            return;
        }
        if (v1i0Var.m84465a(this.f660W0, this)) {
            requestLayout();
            return;
        }
        int i = this.f660W0;
        View viewFindViewById3 = null;
        if (i != -1) {
            v1i0 v1i0Var2 = this.f651R0;
            ArrayList<u1i0> arrayList = v1i0Var2.f236374f;
            ArrayList<u1i0> arrayList2 = v1i0Var2.f236372d;
            for (u1i0 u1i0Var2 : arrayList2) {
                if (u1i0Var2.f225841m.size() > 0) {
                    Iterator it = u1i0Var2.f225841m.iterator();
                    while (it.hasNext()) {
                        int i2 = ((t1i0) it.next()).f216282b;
                        if (i2 != -1 && (viewFindViewById2 = findViewById(i2)) != null) {
                            viewFindViewById2.setOnClickListener(null);
                        }
                    }
                }
            }
            for (u1i0 u1i0Var3 : arrayList) {
                if (u1i0Var3.f225841m.size() > 0) {
                    Iterator it2 = u1i0Var3.f225841m.iterator();
                    while (it2.hasNext()) {
                        int i3 = ((t1i0) it2.next()).f216282b;
                        if (i3 != -1 && (viewFindViewById = findViewById(i3)) != null) {
                            viewFindViewById.setOnClickListener(null);
                        }
                    }
                }
            }
            for (u1i0 u1i0Var4 : arrayList2) {
                if (u1i0Var4.f225841m.size() > 0) {
                    Iterator it3 = u1i0Var4.f225841m.iterator();
                    while (it3.hasNext()) {
                        ((t1i0) it3.next()).m79877a(this, i, u1i0Var4);
                    }
                }
            }
            for (u1i0 u1i0Var5 : arrayList) {
                if (u1i0Var5.f225841m.size() > 0) {
                    Iterator it4 = u1i0Var5.f225841m.iterator();
                    while (it4.hasNext()) {
                        ((t1i0) it4.next()).m79877a(this, i, u1i0Var5);
                    }
                }
            }
        }
        if (!this.f651R0.m84478o() || (u1i0Var = this.f651R0.f236371c) == null || (fa81Var = u1i0Var.f225840l) == null) {
            return;
        }
        MotionLayout motionLayout = fa81Var.f67482r;
        int i4 = fa81Var.f67468d;
        if (i4 != -1 && (viewFindViewById3 = motionLayout.findViewById(i4)) == null) {
            mif1.m61890y(motionLayout.getContext(), fa81Var.f67468d);
        }
        if (viewFindViewById3 instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById3;
            nestedScrollView.setOnTouchListener(new eef(5));
            nestedScrollView.setOnScrollChangeListener(new m57(28));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m334I() {
        this.f650Q1.m97125i();
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public final void m335J(float f, float f2) {
        if (!super.isAttachedToWindow()) {
            if (this.f645L1 == null) {
                this.f645L1 = new m1i0(this);
            }
            m1i0 m1i0Var = this.f645L1;
            m1i0Var.f138976a = f;
            m1i0Var.f138977b = f2;
            return;
        }
        setProgress(f);
        setState(o1i0.f160766c);
        this.f657U0 = f2;
        if (f2 != 0.0f) {
            m345z(f2 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f == 0.0f || f == 1.0f) {
                return;
            }
            m345z(f > 0.5f ? 1.0f : 0.0f);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m336K(int i) {
        setState(o1i0.f160765b);
        this.f660W0 = i;
        this.f659V0 = -1;
        this.f661X0 = -1;
        C2449ud c2449ud = this.f728L0;
        if (c2449ud == null) {
            v1i0 v1i0Var = this.f651R0;
            if (v1i0Var != null) {
                v1i0Var.m84466b(i).m31733b(this);
                return;
            }
            return;
        }
        float f = -1;
        ConstraintLayout constraintLayout = (ConstraintLayout) c2449ud.f229148c;
        SparseArray sparseArray = (SparseArray) c2449ud.f229149d;
        int i2 = c2449ud.f229147b;
        int i3 = 0;
        if (i2 != i) {
            c2449ud.f229147b = i;
            p6j p6jVar = (p6j) sparseArray.get(i);
            ArrayList arrayList = p6jVar.f174407b;
            while (true) {
                if (i3 >= arrayList.size()) {
                    i3 = -1;
                    break;
                } else if (((q6j) arrayList.get(i3)).m72241a(f, f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList2 = p6jVar.f174407b;
            c7j c7jVar = i3 == -1 ? p6jVar.f174409d : ((q6j) arrayList2.get(i3)).f185834f;
            if (i3 != -1) {
                int i4 = ((q6j) arrayList2.get(i3)).f185833e;
            }
            if (c7jVar == null) {
                return;
            }
            c2449ud.f229150e = i3;
            c7jVar.m31733b(constraintLayout);
            return;
        }
        p6j p6jVar2 = i == -1 ? (p6j) sparseArray.valueAt(0) : (p6j) sparseArray.get(i2);
        int i5 = c2449ud.f229150e;
        if (i5 == -1 || !((q6j) p6jVar2.f174407b.get(i5)).m72241a(f, f)) {
            ArrayList arrayList3 = p6jVar2.f174407b;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    i3 = -1;
                    break;
                } else if (((q6j) arrayList3.get(i3)).m72241a(f, f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList4 = p6jVar2.f174407b;
            if (c2449ud.f229150e == i3) {
                return;
            }
            c7j c7jVar2 = i3 == -1 ? null : ((q6j) arrayList4.get(i3)).f185834f;
            if (i3 != -1) {
                int i6 = ((q6j) arrayList4.get(i3)).f185833e;
            }
            if (c7jVar2 == null) {
                return;
            }
            c2449ud.f229150e = i3;
            c7jVar2.m31733b(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m337L(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f645L1 == null) {
                this.f645L1 = new m1i0(this);
            }
            m1i0 m1i0Var = this.f645L1;
            m1i0Var.f138978c = i;
            m1i0Var.f138979d = i2;
            return;
        }
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null) {
            this.f659V0 = i;
            this.f661X0 = i2;
            v1i0Var.m84477n(i, i2);
            this.f650Q1.m97122f(this.f651R0.m84466b(i), this.f651R0.m84466b(i2));
            m334I();
            this.f669f1 = 0.0f;
            m345z(0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x012d  */
    /* JADX INFO: renamed from: M */
    public final void m338M(float f, float f2, int i) {
        v1i0 v1i0Var;
        u1i0 u1i0Var;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        fa81 fa81Var;
        fa81 fa81Var2;
        fa81 fa81Var3;
        fa81 fa81Var4;
        fa81 fa81Var5;
        u1i0 u1i0Var2;
        fa81 fa81Var6;
        fa81 fa81Var7;
        u1i0 u1i0Var3;
        float f7;
        fa81 fa81Var8;
        if (this.f651R0 == null || this.f669f1 == f) {
            return;
        }
        this.f676m1 = true;
        this.f666c1 = getNanoTime();
        float fM84467c = this.f651R0.m84467c() / 1000.0f;
        this.f667d1 = fM84467c;
        this.f671h1 = f;
        this.f673j1 = true;
        float f8 = 1.0f;
        m651 m651Var = this.f677n1;
        float f9 = 0.0f;
        if (i == 0 || i == 1 || i == 2) {
            if (i != 1 || i == 7) {
                f8 = 0.0f;
            } else if (i != 2 && i != 6) {
                f8 = f;
            }
            v1i0Var = this.f651R0;
            u1i0Var = v1i0Var.f236371c;
            if (u1i0Var != null || (fa81Var7 = u1i0Var.f225840l) == null) {
                i2 = 0;
            } else {
                i2 = fa81Var7.f67464D;
            }
            if (i2 == 0) {
                float f10 = this.f669f1;
                float fM84470g = v1i0Var.m84470g();
                u1i0Var2 = this.f651R0.f236371c;
                if (u1i0Var2 != null && (fa81Var6 = u1i0Var2.f225840l) != null) {
                    f9 = fa81Var6.f67483s;
                }
                this.f677n1.m60946b(f10, f8, f2, fM84467c, fM84470g, f9);
            } else {
                float f11 = this.f669f1;
                if (u1i0Var != null || (fa81Var5 = u1i0Var.f225840l) == null) {
                    f3 = 0.0f;
                } else {
                    f3 = fa81Var5.f67490z;
                }
                if (u1i0Var != null || (fa81Var4 = u1i0Var.f225840l) == null) {
                    f4 = 0.0f;
                } else {
                    f4 = fa81Var4.f67461A;
                }
                if (u1i0Var != null || (fa81Var3 = u1i0Var.f225840l) == null) {
                    f5 = 0.0f;
                } else {
                    f5 = fa81Var3.f67489y;
                }
                if (u1i0Var != null || (fa81Var2 = u1i0Var.f225840l) == null) {
                    f6 = 0.0f;
                } else {
                    f6 = fa81Var2.f67462B;
                }
                if (u1i0Var != null || (fa81Var = u1i0Var.f225840l) == null) {
                    i3 = 0;
                } else {
                    i3 = fa81Var.f67463C;
                }
                if (m651Var.f140393b == null) {
                    qg41 qg41Var = new qg41();
                    qg41Var.f188373a = 0.5d;
                    qg41Var.f188381i = 0;
                    m651Var.f140393b = qg41Var;
                }
                qg41 qg41Var2 = m651Var.f140393b;
                m651Var.f140394c = qg41Var2;
                qg41Var2.f188375c = f8;
                qg41Var2.f188373a = f5;
                qg41Var2.f188377e = f11;
                qg41Var2.f188374b = f4;
                qg41Var2.f188379g = f3;
                qg41Var2.f188380h = f6;
                qg41Var2.f188381i = i3;
                qg41Var2.f188376d = 0.0f;
            }
            int i4 = this.f660W0;
            this.f671h1 = f8;
            this.f660W0 = i4;
            this.f653S0 = m651Var;
        } else {
            k1i0 k1i0Var = this.f678o1;
            if (i == 4) {
                float f12 = this.f669f1;
                float fM84470g2 = this.f651R0.m84470g();
                k1i0Var.f118355a = f2;
                k1i0Var.f118356b = f12;
                k1i0Var.f118357c = fM84470g2;
                this.f653S0 = k1i0Var;
            } else if (i == 5) {
                float f13 = this.f669f1;
                float fM84470g3 = this.f651R0.m84470g();
                if (f2 > 0.0f) {
                    float f14 = f2 / fM84470g3;
                    if (((f2 * f14) - (((fM84470g3 * f14) * f14) / 2.0f)) + f13 > 1.0f) {
                        float f15 = this.f669f1;
                        float fM84470g4 = this.f651R0.m84470g();
                        k1i0Var.f118355a = f2;
                        k1i0Var.f118356b = f15;
                        k1i0Var.f118357c = fM84470g4;
                        this.f653S0 = k1i0Var;
                    } else {
                        float f16 = this.f669f1;
                        float f17 = this.f667d1;
                        float fM84470g5 = this.f651R0.m84470g();
                        u1i0Var3 = this.f651R0.f236371c;
                        if (u1i0Var3 != null || (fa81Var8 = u1i0Var3.f225840l) == null) {
                            f7 = 0.0f;
                        } else {
                            f7 = fa81Var8.f67483s;
                        }
                        this.f677n1.m60946b(f16, f, f2, f17, fM84470g5, f7);
                        this.f657U0 = 0.0f;
                        int i5 = this.f660W0;
                        this.f671h1 = f;
                        this.f660W0 = i5;
                        this.f653S0 = m651Var;
                    }
                } else {
                    float f18 = (-f2) / fM84470g3;
                    if ((((fM84470g3 * f18) * f18) / 2.0f) + (f2 * f18) + f13 < 0.0f) {
                        float f19 = this.f669f1;
                        float fM84470g6 = this.f651R0.m84470g();
                        k1i0Var.f118355a = f2;
                        k1i0Var.f118356b = f19;
                        k1i0Var.f118357c = fM84470g6;
                        this.f653S0 = k1i0Var;
                    } else {
                        float f110 = this.f669f1;
                        float f111 = this.f667d1;
                        float fM84470g7 = this.f651R0.m84470g();
                        u1i0Var3 = this.f651R0.f236371c;
                        if (u1i0Var3 != null) {
                            f7 = 0.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        this.f677n1.m60946b(f110, f, f2, f111, fM84470g7, f7);
                        this.f657U0 = 0.0f;
                        int i6 = this.f660W0;
                        this.f671h1 = f;
                        this.f660W0 = i6;
                        this.f653S0 = m651Var;
                    }
                }
            } else if (i == 6 || i == 7) {
                if (i != 1) {
                    f8 = 0.0f;
                } else {
                    f8 = 0.0f;
                }
                v1i0Var = this.f651R0;
                u1i0Var = v1i0Var.f236371c;
                if (u1i0Var != null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    float f112 = this.f669f1;
                    float fM84470g8 = v1i0Var.m84470g();
                    u1i0Var2 = this.f651R0.f236371c;
                    if (u1i0Var2 != null) {
                        f9 = fa81Var6.f67483s;
                    }
                    this.f677n1.m60946b(f112, f8, f2, fM84467c, fM84470g8, f9);
                } else {
                    float f113 = this.f669f1;
                    if (u1i0Var != null) {
                        f3 = 0.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (u1i0Var != null) {
                        f4 = 0.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    if (u1i0Var != null) {
                        f5 = 0.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    if (u1i0Var != null) {
                        f6 = 0.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    if (u1i0Var != null) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                    if (m651Var.f140393b == null) {
                        qg41 qg41Var3 = new qg41();
                        qg41Var3.f188373a = 0.5d;
                        qg41Var3.f188381i = 0;
                        m651Var.f140393b = qg41Var3;
                    }
                    qg41 qg41Var4 = m651Var.f140393b;
                    m651Var.f140394c = qg41Var4;
                    qg41Var4.f188375c = f8;
                    qg41Var4.f188373a = f5;
                    qg41Var4.f188377e = f113;
                    qg41Var4.f188374b = f4;
                    qg41Var4.f188379g = f3;
                    qg41Var4.f188380h = f6;
                    qg41Var4.f188381i = i3;
                    qg41Var4.f188376d = 0.0f;
                }
                int i7 = this.f660W0;
                this.f671h1 = f8;
                this.f660W0 = i7;
                this.f653S0 = m651Var;
            }
        }
        this.f672i1 = false;
        this.f666c1 = getNanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: N */
    public final void m339N(int i) {
        if (super.isAttachedToWindow()) {
            m340O(i, -1);
            return;
        }
        if (this.f645L1 == null) {
            this.f645L1 = new m1i0(this);
        }
        this.f645L1.f138979d = i;
    }

    /* JADX INFO: renamed from: O */
    public final void m340O(int i, int i2) {
        sgz sgzVar;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null && (sgzVar = v1i0Var.f236370b) != null) {
            int i3 = this.f660W0;
            float f = -1;
            mx41 mx41Var = (mx41) ((SparseArray) sgzVar.f208959c).get(i);
            if (mx41Var != null) {
                ArrayList arrayList = mx41Var.f147953b;
                int i4 = mx41Var.f147954c;
                if (f != -1.0f && f != -1.0f) {
                    Iterator it = arrayList.iterator();
                    nx41 nx41Var = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (nx41Var != null) {
                                i3 = nx41Var.f159363e;
                                break;
                            } else {
                                i3 = i4;
                                break;
                            }
                        }
                        nx41 nx41Var2 = (nx41) it.next();
                        if (nx41Var2.m65818a(f, f)) {
                            if (i3 == nx41Var2.f159363e) {
                                break;
                            } else {
                                nx41Var = nx41Var2;
                            }
                        }
                    }
                } else if (i4 != i3) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            i3 = i4;
                            break;
                        }
                    } while (i3 != ((nx41) it2.next()).f159363e);
                }
            } else {
                i3 = i;
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i5 = this.f660W0;
        if (i5 == i) {
            return;
        }
        if (this.f659V0 == i) {
            m345z(0.0f);
            if (i2 > 0) {
                this.f667d1 = i2 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f661X0 == i) {
            m345z(1.0f);
            if (i2 > 0) {
                this.f667d1 = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.f661X0 = i;
        if (i5 != -1) {
            m337L(i5, i);
            m345z(1.0f);
            this.f669f1 = 0.0f;
            m345z(1.0f);
            this.f646M1 = null;
            if (i2 > 0) {
                this.f667d1 = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.f676m1 = false;
        this.f671h1 = 1.0f;
        this.f668e1 = 0.0f;
        this.f669f1 = 0.0f;
        this.f670g1 = getNanoTime();
        this.f666c1 = getNanoTime();
        this.f672i1 = false;
        this.f653S0 = null;
        if (i2 == -1) {
            this.f667d1 = this.f651R0.m84467c() / 1000.0f;
        }
        this.f659V0 = -1;
        this.f651R0.m84477n(-1, this.f661X0);
        SparseArray sparseArray = new SparseArray();
        if (i2 == 0) {
            this.f667d1 = this.f651R0.m84467c() / 1000.0f;
        } else if (i2 > 0) {
            this.f667d1 = i2 / 1000.0f;
        }
        int childCount = getChildCount();
        HashMap map = this.f665b1;
        map.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            map.put(childAt, new C0043a(childAt));
            sparseArray.put(childAt.getId(), (C0043a) map.get(childAt));
        }
        this.f673j1 = true;
        c7j c7jVarM84466b = this.f651R0.m84466b(i);
        zwi zwiVar = this.f650Q1;
        zwiVar.m97122f(null, c7jVarM84466b);
        m334I();
        zwiVar.m97119a();
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            C0043a c0043a = (C0043a) map.get(childAt2);
            if (c0043a != null) {
                p1i0 p1i0Var = c0043a.f703f;
                p1i0Var.f173101c = 0.0f;
                p1i0Var.f173102d = 0.0f;
                p1i0Var.m68818d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                c1i0 c1i0Var = c0043a.f705h;
                c1i0Var.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                c1i0Var.f33136c = childAt2.getVisibility();
                c1i0Var.f33138e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                c1i0Var.f33139f = childAt2.getElevation();
                c1i0Var.f33140g = childAt2.getRotation();
                c1i0Var.f33141h = childAt2.getRotationX();
                c1i0Var.f33134a = childAt2.getRotationY();
                c1i0Var.f33142i = childAt2.getScaleX();
                c1i0Var.f33143t = childAt2.getScaleY();
                c1i0Var.f33131X = childAt2.getPivotX();
                c1i0Var.f33132Y = childAt2.getPivotY();
                c1i0Var.f33133Z = childAt2.getTranslationX();
                c1i0Var.f33127L0 = childAt2.getTranslationY();
                c1i0Var.f33128M0 = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i8 = 0; i8 < childCount; i8++) {
            C0043a c0043a2 = (C0043a) map.get(getChildAt(i8));
            if (c0043a2 != null) {
                this.f651R0.m84469f(c0043a2);
                c0043a2.m352g(width, getNanoTime(), height);
            }
        }
        u1i0 u1i0Var = this.f651R0.f236371c;
        float f2 = u1i0Var != null ? u1i0Var.f225837i : 0.0f;
        if (f2 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i9 = 0; i9 < childCount; i9++) {
                p1i0 p1i0Var2 = ((C0043a) map.get(getChildAt(i9))).f704g;
                float f3 = p1i0Var2.f173104f + p1i0Var2.f173103e;
                fMin = Math.min(fMin, f3);
                fMax = Math.max(fMax, f3);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                C0043a c0043a3 = (C0043a) map.get(getChildAt(i10));
                p1i0 p1i0Var3 = c0043a3.f704g;
                float f4 = p1i0Var3.f173103e;
                float f5 = p1i0Var3.f173104f;
                c0043a3.f711n = 1.0f / (1.0f - f2);
                c0043a3.f710m = f2 - ((((f4 + f5) - fMin) * f2) / (fMax - fMin));
            }
        }
        this.f668e1 = 0.0f;
        this.f669f1 = 0.0f;
        this.f673j1 = true;
        invalidate();
    }

    /* JADX INFO: renamed from: P */
    public final void m341P(int i) {
        if (super.isAttachedToWindow()) {
            m340O(i, 100);
            return;
        }
        if (this.f645L1 == null) {
            this.f645L1 = new m1i0(this);
        }
        this.f645L1.f138979d = i;
    }

    /* JADX INFO: renamed from: Q */
    public final void m342Q(int i, c7j c7jVar) {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null) {
            v1i0Var.f236375g.put(i, c7jVar);
        }
        this.f650Q1.m97122f(this.f651R0.m84466b(this.f659V0), this.f651R0.m84466b(this.f661X0));
        m334I();
        if (this.f660W0 == i) {
            c7jVar.m31733b(this);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m343R(int i, View... viewArr) {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null) {
            x1p0 x1p0Var = v1i0Var.f236385q;
            x1p0Var.getClass();
            ArrayList arrayList = new ArrayList();
            for (boc1 boc1Var : (ArrayList) x1p0Var.f257248c) {
                if (boc1Var.f29073a == i) {
                    for (View view : viewArr) {
                        if (boc1Var.m30083b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = (MotionLayout) x1p0Var.f257247b;
                        int currentState = motionLayout.getCurrentState();
                        if (boc1Var.f29077e == 2) {
                            boc1Var.m30082a(x1p0Var, (MotionLayout) x1p0Var.f257247b, currentState, null, viewArr2);
                        } else if (currentState == -1) {
                            motionLayout.toString();
                        } else {
                            c7j c7jVarM330E = motionLayout.m330E(currentState);
                            if (c7jVarM330E != null) {
                                boc1Var.m30082a(x1p0Var, (MotionLayout) x1p0Var.f257247b, currentState, c7jVarM330E, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0317 A[PHI: r13
      0x0317: PHI (r13v16 float) = (r13v15 float), (r13v20 float) binds: [B:116:0x02f3, B:121:0x0300] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList<p1i0> arrayList;
        int i;
        int i2;
        int i3;
        Paint paint;
        Paint paint2;
        int i4;
        int i5;
        C0043a c0043a;
        int i6;
        Paint paint3;
        double dMo26896c;
        Paint paint4;
        x1p0 x1p0Var;
        m328C(false);
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null && (x1p0Var = v1i0Var.f236385q) != null) {
            ArrayList arrayList2 = (ArrayList) x1p0Var.f257251f;
            ArrayList arrayList3 = (ArrayList) x1p0Var.f257250e;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((aoc1) it.next()).m26576a();
                }
                ((ArrayList) x1p0Var.f257250e).removeAll(arrayList2);
                arrayList2.clear();
                if (((ArrayList) x1p0Var.f257250e).isEmpty()) {
                    x1p0Var.f257250e = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.f651R0 == null) {
            return;
        }
        if ((this.f674k1 & 1) == 1 && !isInEditMode()) {
            this.f688y1++;
            long nanoTime = getNanoTime();
            long j = this.f689z1;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.f634A1 = ((int) ((this.f688y1 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f688y1 = 0;
                    this.f689z1 = nanoTime;
                }
            } else {
                this.f689z1 = nanoTime;
            }
            Paint paint5 = new Paint();
            paint5.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f634A1);
            sb.append(" fps ");
            int i7 = this.f659V0;
            StringBuilder sbM36620t = dq60.m36620t(dq60.m36616p(i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7), " -> ", sb));
            int i8 = this.f661X0;
            sbM36620t.append(i8 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i8));
            sbM36620t.append(" (progress: ");
            sbM36620t.append(progress);
            sbM36620t.append(" ) state=");
            int i9 = this.f660W0;
            sbM36620t.append(i9 == -1 ? "undefined" : i9 != -1 ? getContext().getResources().getResourceEntryName(i9) : "UNDEFINED");
            String string = sbM36620t.toString();
            paint5.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint5);
            paint5.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint5);
        }
        if (this.f674k1 > 1) {
            if (this.f675l1 == null) {
                this.f675l1 = new l1i0(this);
            }
            l1i0 l1i0Var = this.f675l1;
            int iM84467c = this.f651R0.m84467c();
            int i10 = this.f674k1;
            Paint paint6 = l1i0Var.f128731g;
            Paint paint7 = l1i0Var.f128730f;
            Paint paint8 = l1i0Var.f128733i;
            int i11 = l1i0Var.f128737m;
            Paint paint9 = l1i0Var.f128729e;
            MotionLayout motionLayout = l1i0Var.f128738n;
            HashMap map = this.f665b1;
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!motionLayout.isInEditMode() && (i10 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f661X0) + ":" + motionLayout.getProgress();
                canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, l1i0Var.f128732h);
                canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint9);
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                C0043a c0043a2 = (C0043a) it2.next();
                p1i0 p1i0Var = c0043a2.f703f;
                ArrayList arrayList4 = c0043a2.f718u;
                int iMax = p1i0Var.f173100b;
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    iMax = Math.max(iMax, ((p1i0) it3.next()).f173100b);
                }
                int iMax2 = Math.max(iMax, c0043a2.f704g.f173100b);
                if (i10 > 0 && iMax2 == 0) {
                    iMax2 = 1;
                }
                if (iMax2 != 0) {
                    float[] fArr = l1i0Var.f128727c;
                    int[] iArr = l1i0Var.f128726b;
                    if (fArr != null) {
                        double[] dArrMo25154u = c0043a2.f707j[0].mo25154u();
                        if (iArr != null) {
                            Iterator it4 = arrayList4.iterator();
                            int i12 = 0;
                            while (it4.hasNext()) {
                                iArr[i12] = ((p1i0) it4.next()).f173093M0;
                                i12++;
                                arrayList4 = arrayList4;
                            }
                        }
                        arrayList = arrayList4;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < dArrMo25154u.length) {
                            int i15 = i13;
                            float[] fArr2 = fArr;
                            double[] dArr = dArrMo25154u;
                            c0043a2.f707j[0].mo25151r(dArrMo25154u[i15], c0043a2.f713p);
                            c0043a2.f703f.m68817c(dArr[i15], c0043a2.f712o, c0043a2.f713p, fArr2, i14);
                            i14 += 2;
                            i13 = i15 + 1;
                            fArr = fArr2;
                            dArrMo25154u = dArr;
                        }
                        i = i14 / 2;
                    } else {
                        arrayList = arrayList4;
                        i = 0;
                    }
                    l1i0Var.f128735k = i;
                    if (iMax2 >= 1) {
                        int i16 = iM84467c / 16;
                        float[] fArr3 = l1i0Var.f128725a;
                        if (fArr3 == null || fArr3.length != i16 * 2) {
                            l1i0Var.f128725a = new float[i16 * 2];
                            l1i0Var.f128728d = new Path();
                        }
                        float f = i11;
                        canvas.translate(f, f);
                        paint9.setColor(1996488704);
                        paint8.setColor(1996488704);
                        paint7.setColor(1996488704);
                        paint6.setColor(1996488704);
                        float[] fArr4 = l1i0Var.f128725a;
                        float f2 = 1.0f / (i16 - 1);
                        float f3 = 1.0f;
                        HashMap map2 = c0043a2.f722y;
                        mlc1 mlc1Var = map2 == null ? null : (mlc1) map2.get("translationX");
                        HashMap map3 = c0043a2.f722y;
                        i2 = iM84467c;
                        mlc1 mlc1Var2 = map3 == null ? null : (mlc1) map3.get("translationY");
                        i3 = i10;
                        HashMap map4 = c0043a2.f723z;
                        zjc1 zjc1Var = map4 == null ? null : (zjc1) map4.get("translationX");
                        HashMap map5 = c0043a2.f723z;
                        zjc1 zjc1Var2 = map5 == null ? null : (zjc1) map5.get("translationY");
                        int i17 = 0;
                        while (true) {
                            float f4 = Float.NaN;
                            i5 = i11;
                            if (i17 >= i16) {
                                break;
                            }
                            float fMin = i17 * f2;
                            int i18 = i16;
                            float f5 = c0043a2.f711n;
                            if (f5 != f3) {
                                float f6 = c0043a2.f710m;
                                if (fMin < f6) {
                                    fMin = 0.0f;
                                }
                                if (fMin > f6) {
                                    i6 = i17;
                                    paint3 = paint6;
                                    if (fMin < 1.0d) {
                                        fMin = Math.min((fMin - f6) * f5, f3);
                                    }
                                } else {
                                    i6 = i17;
                                    paint3 = paint6;
                                }
                            } else {
                                i6 = i17;
                                paint3 = paint6;
                            }
                            double d = fMin;
                            aqs aqsVar = p1i0Var.f173099a;
                            float f7 = 0.0f;
                            for (p1i0 p1i0Var2 : arrayList) {
                                double d2 = d;
                                aqs aqsVar2 = p1i0Var2.f173099a;
                                if (aqsVar2 != null) {
                                    float f8 = p1i0Var2.f173101c;
                                    if (f8 < fMin) {
                                        f7 = f8;
                                        aqsVar = aqsVar2;
                                    } else if (Float.isNaN(f4)) {
                                        f4 = p1i0Var2.f173101c;
                                    }
                                }
                                d = d2;
                            }
                            double d3 = d;
                            if (aqsVar != null) {
                                if (Float.isNaN(f4)) {
                                    f4 = 1.0f;
                                }
                                float f9 = f4 - f7;
                                dMo26896c = (((float) aqsVar.mo26896c((fMin - f7) / f9)) * f9) + f7;
                            } else {
                                dMo26896c = d3;
                            }
                            p1i0 p1i0Var3 = p1i0Var;
                            c0043a2.f707j[0].mo25151r(dMo26896c, c0043a2.f713p);
                            ii5 ii5Var = c0043a2.f708k;
                            if (ii5Var != null) {
                                double[] dArr2 = c0043a2.f713p;
                                paint4 = paint8;
                                if (dArr2.length > 0) {
                                    ii5Var.mo25151r(dMo26896c, dArr2);
                                }
                            } else {
                                paint4 = paint8;
                            }
                            int i19 = i6 * 2;
                            c0043a2.f703f.m68817c(dMo26896c, c0043a2.f712o, c0043a2.f713p, fArr4, i19);
                            if (zjc1Var != null) {
                                fArr4[i19] = zjc1Var.m96234a(fMin) + fArr4[i19];
                            } else if (mlc1Var != null) {
                                fArr4[i19] = mlc1Var.m62203a(fMin) + fArr4[i19];
                            }
                            if (zjc1Var2 != null) {
                                int i20 = i19 + 1;
                                fArr4[i20] = zjc1Var2.m96234a(fMin) + fArr4[i20];
                            } else if (mlc1Var2 != null) {
                                int i21 = i19 + 1;
                                fArr4[i21] = mlc1Var2.m62203a(fMin) + fArr4[i21];
                            }
                            i17 = i6 + 1;
                            i11 = i5;
                            i16 = i18;
                            paint6 = paint3;
                            p1i0Var = p1i0Var3;
                            paint8 = paint4;
                            f3 = 1.0f;
                        }
                        p1i0 p1i0Var4 = p1i0Var;
                        l1i0Var.m57875a(canvas, iMax2, l1i0Var.f128735k, c0043a2);
                        paint9.setColor(-21965);
                        paint7.setColor(-2067046);
                        Paint paint10 = paint8;
                        paint10.setColor(-2067046);
                        paint = paint6;
                        paint.setColor(-13391360);
                        int i22 = i5;
                        float f10 = -i22;
                        canvas.translate(f10, f10);
                        l1i0Var.m57875a(canvas, iMax2, l1i0Var.f128735k, c0043a2);
                        char c = 5;
                        if (iMax2 == 5) {
                            float[] fArr5 = l1i0Var.f128734j;
                            l1i0Var.f128728d.reset();
                            int i23 = 0;
                            while (i23 <= 50) {
                                char c2 = c;
                                int i24 = i23;
                                c0043a2.f707j[0].mo25151r(c0043a2.m347a(i23 / 50, null), c0043a2.f713p);
                                int[] iArr2 = c0043a2.f712o;
                                double[] dArr3 = c0043a2.f713p;
                                p1i0 p1i0Var5 = p1i0Var4;
                                float fSin = p1i0Var5.f173103e;
                                float fCos = p1i0Var5.f173104f;
                                float f11 = p1i0Var5.f173105g;
                                float f12 = p1i0Var5.f173106h;
                                float[] fArr6 = fArr5;
                                int i25 = i22;
                                int i26 = 0;
                                while (true) {
                                    c0043a = c0043a2;
                                    if (i26 >= iArr2.length) {
                                        break;
                                    }
                                    Paint paint11 = paint10;
                                    float f13 = (float) dArr3[i26];
                                    int i27 = iArr2[i26];
                                    if (i27 == 1) {
                                        fSin = f13;
                                    } else if (i27 == 2) {
                                        fCos = f13;
                                    } else if (i27 == 3) {
                                        f11 = f13;
                                    } else if (i27 == 4) {
                                        f12 = f13;
                                    }
                                    i26++;
                                    c0043a2 = c0043a;
                                    paint10 = paint11;
                                }
                                Paint paint12 = paint10;
                                if (p1i0Var5.f173098Z != null) {
                                    double d4 = 0.0f;
                                    double d5 = fSin;
                                    double d6 = fCos;
                                    fSin = (float) (((Math.sin(d6) * d5) + d4) - ((double) (f11 / 2.0f)));
                                    fCos = (float) ((d4 - (Math.cos(d6) * d5)) - ((double) (f12 / 2.0f)));
                                }
                                float f14 = f11 + fSin;
                                float f15 = f12 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f16 = fSin + 0.0f;
                                float f17 = fCos + 0.0f;
                                float f18 = f14 + 0.0f;
                                float f19 = f15 + 0.0f;
                                fArr6[0] = f16;
                                fArr6[1] = f17;
                                fArr6[2] = f18;
                                fArr6[3] = f17;
                                fArr6[4] = f18;
                                fArr6[c2] = f19;
                                fArr6[6] = f16;
                                fArr6[7] = f19;
                                l1i0Var.f128728d.moveTo(f16, f17);
                                l1i0Var.f128728d.lineTo(fArr6[2], fArr6[3]);
                                l1i0Var.f128728d.lineTo(fArr6[4], fArr6[c2]);
                                l1i0Var.f128728d.lineTo(fArr6[6], fArr6[7]);
                                l1i0Var.f128728d.close();
                                i23 = i24 + 1;
                                l1i0Var = l1i0Var;
                                p1i0Var4 = p1i0Var5;
                                c = c2;
                                fArr5 = fArr6;
                                c0043a2 = c0043a;
                                i22 = i25;
                                paint10 = paint12;
                            }
                            i4 = i22;
                            l1i0Var = l1i0Var;
                            paint2 = paint10;
                            paint9.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(l1i0Var.f128728d, paint9);
                            canvas.translate(-2.0f, -2.0f);
                            paint9.setColor(-65536);
                            canvas.drawPath(l1i0Var.f128728d, paint9);
                        } else {
                            i4 = i22;
                            paint2 = paint10;
                        }
                        l1i0Var = l1i0Var;
                        paint6 = paint;
                        it2 = it2;
                        iM84467c = i2;
                        i10 = i3;
                        i11 = i4;
                        paint8 = paint2;
                    } else {
                        i2 = iM84467c;
                        i3 = i10;
                        paint = paint6;
                        paint2 = paint8;
                        i4 = i11;
                    }
                    l1i0Var = l1i0Var;
                    paint6 = paint;
                    it2 = it2;
                    iM84467c = i2;
                    i10 = i3;
                    i11 = i4;
                    paint8 = paint2;
                }
            }
            canvas.restore();
        }
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: e */
    public final void mo88e(View view, View view2, int i, int i2) {
        this.f685v1 = getNanoTime();
        this.f686w1 = 0.0f;
        this.f683t1 = 0.0f;
        this.f684u1 = 0.0f;
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: f */
    public final void mo89f(View view, int i) {
        fa81 fa81Var;
        int i2;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null) {
            float f = this.f686w1;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.f683t1 / f;
            float f3 = this.f684u1 / f;
            u1i0 u1i0Var = v1i0Var.f236371c;
            if (u1i0Var == null || (fa81Var = u1i0Var.f225840l) == null) {
                return;
            }
            float[] fArr = fa81Var.f67478n;
            fa81Var.f67477m = false;
            MotionLayout motionLayout = fa81Var.f67482r;
            float progress = motionLayout.getProgress();
            fa81Var.f67482r.m329D(fa81Var.f67468d, progress, fa81Var.f67472h, fa81Var.f67471g, fArr);
            float f4 = fa81Var.f67475k;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * fa81Var.f67476l) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = fa81Var.f67467c) == 3) {
                return;
            }
            motionLayout.m338M(((double) progress) >= 0.5d ? 1.0f : 0.0f, f5, i2);
        }
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: g */
    public final void mo90g(View view, int i, int i2, int[] iArr, int i3) {
        u1i0 u1i0Var;
        boolean z;
        float f;
        fa81 fa81Var;
        float f2;
        fa81 fa81Var2;
        fa81 fa81Var3;
        fa81 fa81Var4;
        int i4;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null || (u1i0Var = v1i0Var.f236371c) == null || (z = u1i0Var.f225843o)) {
            return;
        }
        int i5 = -1;
        if (z || (fa81Var4 = u1i0Var.f225840l) == null || (i4 = fa81Var4.f67469e) == -1 || view.getId() == i4) {
            u1i0 u1i0Var2 = v1i0Var.f236371c;
            if ((u1i0Var2 == null || (fa81Var3 = u1i0Var2.f225840l) == null) ? false : fa81Var3.f67485u) {
                fa81 fa81Var5 = u1i0Var.f225840l;
                if (fa81Var5 != null && (fa81Var5.f67487w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.f668e1;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            fa81 fa81Var6 = u1i0Var.f225840l;
            if (fa81Var6 == null || (fa81Var6.f67487w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                u1i0 u1i0Var3 = v1i0Var.f236371c;
                if (u1i0Var3 == null || (fa81Var2 = u1i0Var3.f225840l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = fa81Var2.f67478n;
                    f = 0.0f;
                    fa81Var2.f67482r.m329D(fa81Var2.f67468d, fa81Var2.f67482r.getProgress(), fa81Var2.f67472h, fa81Var2.f67471g, fArr);
                    float f6 = fa81Var2.f67475k;
                    if (f6 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * fa81Var2.f67476l) / fArr[1];
                    }
                }
                float f7 = this.f669f1;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC1978ih(view, 3));
                    return;
                }
            }
            float f8 = this.f668e1;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.f683t1 = f9;
            float f10 = i2;
            this.f684u1 = f10;
            this.f686w1 = (float) ((nanoTime - this.f685v1) * 1.0E-9d);
            this.f685v1 = nanoTime;
            u1i0 u1i0Var4 = v1i0Var.f236371c;
            if (u1i0Var4 != null && (fa81Var = u1i0Var4.f225840l) != null) {
                float[] fArr2 = fa81Var.f67478n;
                MotionLayout motionLayout = fa81Var.f67482r;
                float progress = motionLayout.getProgress();
                if (!fa81Var.f67477m) {
                    fa81Var.f67477m = true;
                    motionLayout.setProgress(progress);
                }
                fa81Var.f67482r.m329D(fa81Var.f67468d, progress, fa81Var.f67472h, fa81Var.f67471g, fArr2);
                if (Math.abs((fa81Var.f67476l * fArr2[1]) + (fa81Var.f67475k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = fa81Var.f67475k;
                float fMax = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * fa81Var.f67476l) / fArr2[1]), 1.0f), f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f8 != this.f668e1) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m328C(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f682s1 = true;
        }
    }

    public int[] getConstraintSetIds() {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null) {
            return null;
        }
        SparseArray sparseArray = v1i0Var.f236375g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f660W0;
    }

    public ArrayList<u1i0> getDefinedTransitions() {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null) {
            return null;
        }
        return v1i0Var.f236372d;
    }

    public uyq getDesignTool() {
        if (this.f679p1 == null) {
            this.f679p1 = new uyq();
        }
        return this.f679p1;
    }

    public int getEndState() {
        return this.f661X0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f669f1;
    }

    public v1i0 getScene() {
        return this.f651R0;
    }

    public int getStartState() {
        return this.f659V0;
    }

    public float getTargetPosition() {
        return this.f671h1;
    }

    public Bundle getTransitionState() {
        if (this.f645L1 == null) {
            this.f645L1 = new m1i0(this);
        }
        m1i0 m1i0Var = this.f645L1;
        MotionLayout motionLayout = m1i0Var.f138980e;
        m1i0Var.f138979d = motionLayout.f661X0;
        m1i0Var.f138978c = motionLayout.f659V0;
        m1i0Var.f138977b = motionLayout.getVelocity();
        m1i0Var.f138976a = motionLayout.getProgress();
        m1i0 m1i0Var2 = this.f645L1;
        m1i0Var2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", m1i0Var2.f138976a);
        bundle.putFloat("motion.velocity", m1i0Var2.f138977b);
        bundle.putInt("motion.StartState", m1i0Var2.f138978c);
        bundle.putInt("motion.EndState", m1i0Var2.f138979d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null) {
            this.f667d1 = v1i0Var.m84467c() / 1000.0f;
        }
        return (long) (this.f667d1 * 1000.0f);
    }

    public float getVelocity() {
        return this.f657U0;
    }

    @Override // p204p.lgj0
    /* JADX INFO: renamed from: i */
    public final void mo92i(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f682s1 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f682s1 = false;
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: j */
    public final void mo93j(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // p204p.kgj0
    /* JADX INFO: renamed from: k */
    public final boolean mo94k(View view, View view2, int i, int i2) {
        u1i0 u1i0Var;
        fa81 fa81Var;
        v1i0 v1i0Var = this.f651R0;
        return (v1i0Var == null || (u1i0Var = v1i0Var.f236371c) == null || (fa81Var = u1i0Var.f225840l) == null || (fa81Var.f67487w & 2) != 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        u1i0 u1i0Var;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null && (i = this.f660W0) != -1) {
            c7j c7jVarM84466b = v1i0Var.m84466b(i);
            v1i0 v1i0Var2 = this.f651R0;
            SparseArray sparseArray = v1i0Var2.f236375g;
            loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                SparseIntArray sparseIntArray = v1i0Var2.f236377i;
                int i3 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (i3 > 0) {
                    if (i3 == iKeyAt) {
                        break loop0;
                    }
                    int i4 = size - 1;
                    if (size < 0) {
                        break loop0;
                    }
                    i3 = sparseIntArray.get(i3);
                    size = i4;
                }
                v1i0Var2.m84476m(iKeyAt, this);
            }
            if (c7jVarM84466b != null) {
                c7jVarM84466b.m31733b(this);
            }
            this.f659V0 = this.f660W0;
        }
        m333H();
        m1i0 m1i0Var = this.f645L1;
        if (m1i0Var != null) {
            if (this.f648O1) {
                post(new kk00(this, 16));
                return;
            } else {
                m1i0Var.m60537a();
                return;
            }
        }
        v1i0 v1i0Var3 = this.f651R0;
        if (v1i0Var3 == null || (u1i0Var = v1i0Var3.f236371c) == null || u1i0Var.f225842n != 4) {
            return;
        }
        m345z(1.0f);
        this.f646M1 = null;
        setState(o1i0.f160765b);
        setState(o1i0.f160766c);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        fa81 fa81Var;
        int i;
        RectF rectFM41146b;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null || !this.f664a1) {
            return false;
        }
        x1p0 x1p0Var = v1i0Var.f236385q;
        if (x1p0Var != null) {
            ArrayList<boc1> arrayList = (ArrayList) x1p0Var.f257248c;
            MotionLayout motionLayout = (MotionLayout) x1p0Var.f257247b;
            int currentState = motionLayout.getCurrentState();
            if (currentState == -1) {
                z = false;
            } else {
                if (((HashSet) x1p0Var.f257249d) == null) {
                    x1p0Var.f257249d = new HashSet();
                    for (boc1 boc1Var : arrayList) {
                        int childCount = motionLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = motionLayout.getChildAt(i2);
                            if (boc1Var.m30084c(childAt)) {
                                childAt.getId();
                                ((HashSet) x1p0Var.f257249d).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) x1p0Var.f257250e;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (aoc1 aoc1Var : (ArrayList) x1p0Var.f257250e) {
                        Rect rect2 = aoc1Var.f17657l;
                        if (action != 1) {
                            if (action == 2) {
                                aoc1Var.f17648c.f699b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !aoc1Var.f17653h) {
                                    aoc1Var.m26577b();
                                }
                            }
                        } else if (!aoc1Var.f17653h) {
                            aoc1Var.m26577b();
                        }
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    c7j c7jVarM330E = motionLayout.m330E(currentState);
                    for (boc1 boc1Var2 : arrayList) {
                        int i3 = boc1Var2.f29074b;
                        if (i3 == 1) {
                            if (action == 0) {
                                for (View view : (HashSet) x1p0Var.f257249d) {
                                    if (boc1Var2.m30084c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            boc1Var2.m30082a(x1p0Var, (MotionLayout) x1p0Var.f257247b, currentState, c7jVarM330E, view);
                                        }
                                    }
                                }
                            }
                        } else if (i3 == 2) {
                            if (action == 1) {
                                while (r2.hasNext()) {
                                    if (boc1Var2.m30084c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            boc1Var2.m30082a(x1p0Var, (MotionLayout) x1p0Var.f257247b, currentState, c7jVarM330E, view);
                                        }
                                    }
                                }
                            }
                        } else if (i3 == 3 && action == 0) {
                            while (r2.hasNext()) {
                                if (boc1Var2.m30084c(view)) {
                                    view.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        boc1Var2.m30082a(x1p0Var, (MotionLayout) x1p0Var.f257247b, currentState, c7jVarM330E, view);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        u1i0 u1i0Var = this.f651R0.f236371c;
        if (u1i0Var == null || u1i0Var.f225843o || (fa81Var = u1i0Var.f225840l) == null) {
            return z;
        }
        if ((motionEvent.getAction() == 0 && (rectFM41146b = fa81Var.m41146b(this, new RectF())) != null && !rectFM41146b.contains(motionEvent.getX(), motionEvent.getY())) || (i = fa81Var.f67469e) == -1) {
            return z;
        }
        View view2 = this.f656T1;
        if (view2 == null || view2.getId() != i) {
            this.f656T1 = findViewById(i);
        }
        View view3 = this.f656T1;
        if (view3 == null) {
            return z;
        }
        float left = view3.getLeft();
        float top = this.f656T1.getTop();
        float right = this.f656T1.getRight();
        float bottom = this.f656T1.getBottom();
        RectF rectF = this.f654S1;
        rectF.set(left, top, right, bottom);
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m331F((float) this.f656T1.getLeft(), (float) this.f656T1.getTop(), this.f656T1, motionEvent)) ? z : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        MotionLayout motionLayout;
        this.f644K1 = true;
        try {
            if (this.f651R0 == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.f644K1 = false;
                return;
            }
            motionLayout = this;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            try {
                if (motionLayout.f680q1 != i5 || motionLayout.f681r1 != i6) {
                    m334I();
                    m328C(true);
                }
                motionLayout.f680q1 = i5;
                motionLayout.f681r1 = i6;
                motionLayout.f644K1 = false;
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            motionLayout = this;
        }
        Throwable th3 = th;
        motionLayout.f644K1 = false;
        throw th3;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f651R0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f662Y0 == i && this.f663Z0 == i2) ? false : true;
        if (this.f652R1) {
            this.f652R1 = false;
            m333H();
            z3 = true;
        }
        if (this.f740h) {
            z3 = true;
        }
        this.f662Y0 = i;
        this.f663Z0 = i2;
        int iM84471h = this.f651R0.m84471h();
        u1i0 u1i0Var = this.f651R0.f236371c;
        int i3 = u1i0Var == null ? -1 : u1i0Var.f225831c;
        zwi zwiVar = this.f650Q1;
        if ((!z3 && iM84471h == zwiVar.f286987a && i3 == zwiVar.f286988b) || this.f659V0 == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            zwiVar.m97122f(this.f651R0.m84466b(iM84471h), this.f651R0.m84466b(i3));
            zwiVar.m97125i();
            zwiVar.f286987a = iM84471h;
            zwiVar.f286988b = i3;
            z = false;
        }
        if (this.f635B1 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            w7j w7jVar = this.f735c;
            int iM84886s = w7jVar.m84886s() + paddingRight;
            int iM84882m = w7jVar.m84882m() + paddingBottom;
            int i4 = this.f640G1;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.f636C1;
                iM84886s = (int) ((this.f642I1 * (this.f638E1 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.f641H1;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.f637D1;
                iM84882m = (int) ((this.f642I1 * (this.f639F1 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iM84886s, iM84882m);
        }
        float fSignum = Math.signum(this.f671h1 - this.f669f1);
        long nanoTime = getNanoTime();
        j1i0 j1i0Var = this.f653S0;
        float interpolation = this.f669f1 + (!(j1i0Var instanceof m651) ? (((nanoTime - this.f670g1) * fSignum) * 1.0E-9f) / this.f667d1 : 0.0f);
        if (this.f672i1) {
            interpolation = this.f671h1;
        }
        if ((fSignum <= 0.0f || interpolation < this.f671h1) && (fSignum > 0.0f || interpolation > this.f671h1)) {
            z2 = false;
        } else {
            interpolation = this.f671h1;
        }
        if (j1i0Var != null && !z2) {
            interpolation = this.f676m1 ? j1i0Var.getInterpolation((nanoTime - this.f666c1) * 1.0E-9f) : j1i0Var.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f671h1) || (fSignum <= 0.0f && interpolation <= this.f671h1)) {
            interpolation = this.f671h1;
        }
        this.f642I1 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f655T0;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f = interpolation;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C0043a c0043a = (C0043a) this.f665b1.get(childAt);
            if (c0043a != null) {
                c0043a.m350d(f, nanoTime2, childAt, this.f643J1);
            }
        }
        if (this.f635B1) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        fa81 fa81Var;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null) {
            boolean zM359r = m359r();
            v1i0Var.f236384p = zM359r;
            u1i0 u1i0Var = v1i0Var.f236371c;
            if (u1i0Var == null || (fa81Var = u1i0Var.f225840l) == null) {
                return;
            }
            fa81Var.m41147c(zM359r);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x021f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0225  */
    /* JADX WARN: Code duplicated, block: B:115:0x0229  */
    /* JADX WARN: Code duplicated, block: B:119:0x0233  */
    /* JADX WARN: Code duplicated, block: B:121:0x0246  */
    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0257  */
    /* JADX WARN: Code duplicated, block: B:128:0x025e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0263  */
    /* JADX WARN: Code duplicated, block: B:133:0x027c  */
    /* JADX WARN: Code duplicated, block: B:134:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x02af  */
    /* JADX WARN: Code duplicated, block: B:142:0x032b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0330  */
    /* JADX WARN: Code duplicated, block: B:146:0x0336  */
    /* JADX WARN: Code duplicated, block: B:149:0x0342  */
    /* JADX WARN: Code duplicated, block: B:151:0x0346  */
    /* JADX WARN: Code duplicated, block: B:153:0x034e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0355  */
    /* JADX WARN: Code duplicated, block: B:157:0x035b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0375  */
    /* JADX WARN: Code duplicated, block: B:161:0x039a  */
    /* JADX WARN: Code duplicated, block: B:163:0x039e  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:179:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:183:0x0400  */
    /* JADX WARN: Code duplicated, block: B:185:0x0409  */
    /* JADX WARN: Code duplicated, block: B:188:0x0414  */
    /* JADX WARN: Code duplicated, block: B:189:0x041a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0421  */
    /* JADX WARN: Code duplicated, block: B:194:0x0428  */
    /* JADX WARN: Code duplicated, block: B:197:0x0443  */
    /* JADX WARN: Code duplicated, block: B:199:0x0470  */
    /* JADX WARN: Code duplicated, block: B:201:0x0475  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ac A[PHI: r7 r13
      0x04ac: PHI (r7v20 float) = (r7v15 float), (r7v26 float) binds: [B:200:0x0473, B:198:0x0469] A[DONT_GENERATE, DONT_INLINE]
      0x04ac: PHI (r13v12 float) = (r13v7 float), (r13v17 float) binds: [B:200:0x0473, B:198:0x0469] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:205:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:208:0x0509  */
    /* JADX WARN: Code duplicated, block: B:210:0x0518  */
    /* JADX WARN: Code duplicated, block: B:213:0x051f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0577  */
    /* JADX WARN: Code duplicated, block: B:239:0x057f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0585  */
    /* JADX WARN: Code duplicated, block: B:242:0x058a  */
    /* JADX WARN: Code duplicated, block: B:243:0x059b  */
    /* JADX WARN: Code duplicated, block: B:245:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:248:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:250:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:253:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:257:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:259:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:262:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:263:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:266:0x0635  */
    /* JADX WARN: Code duplicated, block: B:269:0x0640  */
    /* JADX WARN: Code duplicated, block: B:270:0x0644  */
    /* JADX WARN: Code duplicated, block: B:273:0x0657  */
    /* JADX WARN: Code duplicated, block: B:276:0x0660  */
    /* JADX WARN: Code duplicated, block: B:279:0x066f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0675  */
    /* JADX WARN: Code duplicated, block: B:283:0x067b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x067d  */
    /* JADX WARN: Code duplicated, block: B:285:0x067f  */
    /* JADX WARN: Code duplicated, block: B:289:0x068c  */
    /* JADX WARN: Code duplicated, block: B:292:0x0695  */
    /* JADX WARN: Code duplicated, block: B:293:0x069a  */
    /* JADX WARN: Code duplicated, block: B:296:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:297:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:300:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:301:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:303:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:305:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:307:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:310:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:311:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:314:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:315:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:318:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:319:0x070b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0732  */
    /* JADX WARN: Code duplicated, block: B:323:0x0734  */
    /* JADX WARN: Code duplicated, block: B:326:0x073c  */
    /* JADX WARN: Code duplicated, block: B:328:0x0742  */
    /* JADX WARN: Code duplicated, block: B:331:0x0748  */
    /* JADX WARN: Code duplicated, block: B:355:0x0793  */
    /* JADX WARN: Code duplicated, block: B:357:0x0799  */
    /* JADX WARN: Code duplicated, block: B:359:0x079f  */
    /* JADX WARN: Code duplicated, block: B:360:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:363:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:367:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:368:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:371:0x07de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u1i0 u1i0Var;
        vbu0 vbu0Var;
        VelocityTracker velocityTracker;
        vbu0 vbu0Var2;
        int i;
        fa81 fa81Var;
        float[] fArr;
        vbu0 vbu0Var3;
        MotionLayout motionLayout;
        boolean z;
        o1i0 o1i0Var;
        VelocityTracker velocityTracker2;
        int action;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        float xVelocity;
        VelocityTracker velocityTracker5;
        float yVelocity;
        float progress;
        int i2;
        char c;
        char c2;
        float f;
        float f2;
        float f3;
        float fAbs;
        float f4;
        int i3;
        float rawY;
        float rawX;
        float progress2;
        int i4;
        char c3;
        char c4;
        float f5;
        float fMax;
        float progress3;
        boolean z2;
        VelocityTracker velocityTracker6;
        VelocityTracker velocityTracker7;
        float xVelocity2;
        VelocityTracker velocityTracker8;
        float yVelocity2;
        float f6;
        int[] iArr;
        VelocityTracker velocityTracker9;
        int action2;
        VelocityTracker velocityTracker10;
        VelocityTracker velocityTracker11;
        float xVelocity3;
        VelocityTracker velocityTracker12;
        float yVelocity3;
        float progress4;
        float width;
        int i5;
        int i6;
        float f7;
        int top;
        int bottom;
        int i7;
        o1i0 o1i0Var2;
        int i8;
        float degrees;
        float f8;
        o1i0 o1i0Var3;
        int i9;
        float width2;
        float height;
        int i10;
        int i11;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float f9;
        float progress5;
        boolean z3;
        int i12;
        int i13;
        ?? r18;
        float fMax2;
        float progress6;
        boolean z4;
        VelocityTracker velocityTracker13;
        VelocityTracker velocityTracker14;
        float xVelocity4;
        VelocityTracker velocityTracker15;
        float yVelocity4;
        MotionEvent motionEvent2;
        u1i0 u1i0Var2;
        int iM78122j;
        Iterator it;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null || !this.f664a1 || !v1i0Var.m84478o()) {
            return super.onTouchEvent(motionEvent);
        }
        v1i0 v1i0Var2 = this.f651R0;
        u1i0 u1i0Var3 = v1i0Var2.f236371c;
        if (u1i0Var3 != null && u1i0Var3.f225843o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        MotionLayout motionLayout2 = v1i0Var2.f236369a;
        RectF rectF = new RectF();
        if (v1i0Var2.f236383o == null) {
            motionLayout2.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            vbu0 vbu0Var4 = vbu0.f239582c;
            vbu0Var4.f239584b = velocityTrackerObtain;
            v1i0Var2.f236383o = vbu0Var4;
        }
        VelocityTracker velocityTracker16 = (VelocityTracker) v1i0Var2.f236383o.f239584b;
        if (velocityTracker16 != null) {
            velocityTracker16.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                v1i0Var2.f236386r = motionEvent.getRawX();
                v1i0Var2.f236387s = motionEvent.getRawY();
                v1i0Var2.f236380l = motionEvent;
                v1i0Var2.f236381m = false;
                fa81 fa81Var2 = v1i0Var2.f236371c.f225840l;
                if (fa81Var2 != null) {
                    RectF rectFM41145a = fa81Var2.m41145a(motionLayout2, rectF);
                    if (rectFM41145a == null || rectFM41145a.contains(v1i0Var2.f236380l.getX(), v1i0Var2.f236380l.getY())) {
                        RectF rectFM41146b = v1i0Var2.f236371c.f225840l.m41146b(motionLayout2, rectF);
                        if (rectFM41146b == null || rectFM41146b.contains(v1i0Var2.f236380l.getX(), v1i0Var2.f236380l.getY())) {
                            v1i0Var2.f236382n = false;
                        } else {
                            v1i0Var2.f236382n = true;
                        }
                        fa81 fa81Var3 = v1i0Var2.f236371c.f225840l;
                        float f10 = v1i0Var2.f236386r;
                        float f11 = v1i0Var2.f236387s;
                        fa81Var3.f67480p = f10;
                        fa81Var3.f67481q = f11;
                    } else {
                        v1i0Var2.f236380l = null;
                        v1i0Var2.f236381m = true;
                    }
                }
            } else if (action3 == 2 && !v1i0Var2.f236381m) {
                float rawY3 = motionEvent.getRawY() - v1i0Var2.f236387s;
                float rawX3 = motionEvent.getRawX() - v1i0Var2.f236386r;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = v1i0Var2.f236380l) != null) {
                    if (currentState != -1) {
                        sgz sgzVar = v1i0Var2.f236370b;
                        if (sgzVar == null || (iM78122j = sgzVar.m78122j(currentState)) == -1) {
                            iM78122j = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (u1i0 u1i0Var4 : v1i0Var2.f236372d) {
                            if (u1i0Var4.f225832d == iM78122j || u1i0Var4.f225831c == iM78122j) {
                                arrayList.add(u1i0Var4);
                            }
                        }
                        RectF rectF2 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f12 = 0.0f;
                        u1i0Var2 = null;
                        while (it2.hasNext()) {
                            u1i0 u1i0Var5 = (u1i0) it2.next();
                            if (u1i0Var5.f225843o) {
                                it = it2;
                            } else {
                                fa81 fa81Var4 = u1i0Var5.f225840l;
                                if (fa81Var4 != null) {
                                    fa81Var4.m41147c(v1i0Var2.f236384p);
                                    RectF rectFM41146b2 = u1i0Var5.f225840l.m41146b(motionLayout2, rectF2);
                                    if (rectFM41146b2 != null) {
                                        it = it2;
                                        if (!rectFM41146b2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    RectF rectFM41145a2 = u1i0Var5.f225840l.m41145a(motionLayout2, rectF2);
                                    if (rectFM41145a2 == null || rectFM41145a2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        fa81 fa81Var5 = u1i0Var5.f225840l;
                                        float fAtan3 = (fa81Var5.f67476l * rawY3) + (fa81Var5.f67475k * rawX3);
                                        if (fa81Var5.f67474j) {
                                            float x = motionEvent2.getX();
                                            u1i0Var5.f225840l.getClass();
                                            float f13 = x - 0.5f;
                                            float y = motionEvent2.getY();
                                            u1i0Var5.f225840l.getClass();
                                            float f14 = y - 0.5f;
                                            fAtan3 = ((float) (Math.atan2(rawY3 + f14, rawX3 + f13) - Math.atan2(f13, f14))) * 10.0f;
                                        }
                                        float f15 = fAtan3 * (u1i0Var5.f225831c == currentState ? -1.0f : 1.1f);
                                        if (f15 > f12) {
                                            f12 = f15;
                                            u1i0Var2 = u1i0Var5;
                                        }
                                        it2 = it;
                                        rectF2 = rectF2;
                                    }
                                } else {
                                    it = it2;
                                    rectF2 = rectF2;
                                    f12 = f12;
                                    u1i0Var2 = u1i0Var2;
                                }
                                f12 = f12;
                                u1i0Var2 = u1i0Var2;
                                it2 = it;
                                rectF2 = rectF2;
                            }
                            it2 = it;
                        }
                    } else {
                        u1i0Var2 = v1i0Var2.f236371c;
                    }
                    if (u1i0Var2 != null) {
                        setTransition(u1i0Var2);
                        RectF rectFM41146b3 = v1i0Var2.f236371c.f225840l.m41146b(motionLayout2, rectF);
                        v1i0Var2.f236382n = (rectFM41146b3 == null || rectFM41146b3.contains(v1i0Var2.f236380l.getX(), v1i0Var2.f236380l.getY())) ? false : true;
                        fa81 fa81Var6 = v1i0Var2.f236371c.f225840l;
                        float f16 = v1i0Var2.f236386r;
                        float f17 = v1i0Var2.f236387s;
                        fa81Var6.f67480p = f16;
                        fa81Var6.f67481q = f17;
                        fa81Var6.f67477m = false;
                    }
                    if (!v1i0Var2.f236381m) {
                        u1i0Var = v1i0Var2.f236371c;
                        if (u1i0Var != null) {
                            fArr = fa81Var.f67478n;
                            if (!v1i0Var2.f236382n) {
                                vbu0Var3 = v1i0Var2.f236383o;
                                motionLayout = fa81Var.f67482r;
                                z = fa81Var.f67474j;
                                o1i0Var = o1i0.f160767d;
                                if (z) {
                                    iArr = fa81Var.f67479o;
                                    velocityTracker9 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker9 != null) {
                                        velocityTracker9.addMovement(motionEvent);
                                    }
                                    action2 = motionEvent.getAction();
                                    if (action2 == 0) {
                                        fa81Var.f67480p = motionEvent.getRawX();
                                        fa81Var.f67481q = motionEvent.getRawY();
                                        fa81Var.f67477m = false;
                                    } else if (action2 == 1) {
                                        fa81Var.f67477m = false;
                                        velocityTracker10 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker10 != null) {
                                            velocityTracker10.computeCurrentVelocity(16);
                                        }
                                        velocityTracker11 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker11 != null) {
                                            xVelocity3 = velocityTracker11.getXVelocity();
                                        } else {
                                            xVelocity3 = 0.0f;
                                        }
                                        velocityTracker12 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker12 != null) {
                                            yVelocity3 = velocityTracker12.getYVelocity();
                                        } else {
                                            yVelocity3 = 0.0f;
                                        }
                                        progress4 = motionLayout.getProgress();
                                        width = motionLayout.getWidth() / 2.0f;
                                        float height2 = motionLayout.getHeight() / 2.0f;
                                        i5 = fa81Var.f67473i;
                                        if (i5 != -1) {
                                            View viewFindViewById2 = motionLayout.findViewById(i5);
                                            motionLayout.getLocationOnScreen(iArr);
                                            width = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                            f7 = iArr[1];
                                            top = viewFindViewById2.getTop();
                                            bottom = viewFindViewById2.getBottom();
                                        } else {
                                            i6 = fa81Var.f67468d;
                                            if (i6 != -1) {
                                                View viewFindViewById3 = motionLayout.findViewById(((C0043a) motionLayout.f665b1.get(motionLayout.findViewById(i6))).f703f.f173096X);
                                                motionLayout.getLocationOnScreen(iArr);
                                                width = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                                f7 = iArr[1];
                                                top = viewFindViewById3.getTop();
                                                bottom = viewFindViewById3.getBottom();
                                            } else {
                                                float rawX4 = motionEvent.getRawX() - width;
                                                float rawY4 = motionEvent.getRawY() - height2;
                                                double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                                i7 = fa81Var.f67468d;
                                                if (i7 != -1) {
                                                    o1i0Var2 = o1i0Var;
                                                    i8 = 6;
                                                    fa81Var.f67482r.m329D(i7, progress4, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
                                                    o1i0Var2 = o1i0Var;
                                                    i8 = 6;
                                                    fArr[1] = 360.0f;
                                                }
                                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
                                                if (Float.isNaN(degrees)) {
                                                    f8 = progress4;
                                                } else {
                                                    f8 = (((degrees * 3.0f) * fa81Var.f67486v) / fArr[1]) + progress4;
                                                }
                                                if (f8 != 0.0f) {
                                                    o1i0Var3 = o1i0Var2;
                                                    if (0.0f < f8) {
                                                        motionLayout.setState(o1i0Var3);
                                                    } else {
                                                        motionLayout.setState(o1i0Var3);
                                                    }
                                                } else {
                                                    o1i0Var3 = o1i0Var2;
                                                    if (0.0f < f8) {
                                                        motionLayout.setState(o1i0Var3);
                                                    } else {
                                                        motionLayout.setState(o1i0Var3);
                                                    }
                                                }
                                            }
                                        }
                                        height2 = ((bottom + top) / 2.0f) + f7;
                                        float rawX5 = motionEvent.getRawX() - width;
                                        float rawY5 = motionEvent.getRawY() - height2;
                                        double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                        i7 = fa81Var.f67468d;
                                        if (i7 != -1) {
                                            o1i0Var2 = o1i0Var;
                                            i8 = 6;
                                            fa81Var.f67482r.m329D(i7, progress4, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            o1i0Var2 = o1i0Var;
                                            i8 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f8 = (((degrees * 3.0f) * fa81Var.f67486v) / fArr[1]) + progress4;
                                        } else {
                                            f8 = progress4;
                                        }
                                        if (f8 != 0.0f) {
                                            o1i0Var3 = o1i0Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(o1i0Var3);
                                            } else {
                                                motionLayout.setState(o1i0Var3);
                                            }
                                        } else {
                                            o1i0Var3 = o1i0Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(o1i0Var3);
                                            } else {
                                                motionLayout.setState(o1i0Var3);
                                            }
                                        }
                                    } else if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        width2 = motionLayout.getWidth() / 2.0f;
                                        height = motionLayout.getHeight() / 2.0f;
                                        i10 = fa81Var.f67473i;
                                        if (i10 != -1) {
                                            View viewFindViewById4 = motionLayout.findViewById(i10);
                                            motionLayout.getLocationOnScreen(iArr);
                                            float right = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                            float bottom2 = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
                                            width2 = right;
                                            height = bottom2;
                                        } else {
                                            i11 = fa81Var.f67468d;
                                            if (i11 != -1) {
                                                motionLayout.getLocationOnScreen(iArr);
                                                width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                            }
                                        }
                                        rawX2 = motionEvent.getRawX() - width2;
                                        rawY2 = motionEvent.getRawY() - height;
                                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                        fAtan2 = (float) (((dAtan2 - Math.atan2(fa81Var.f67481q - height, fa81Var.f67480p - width2)) * 180.0d) / 3.141592653589793d);
                                        if (fAtan2 > 330.0f) {
                                            fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
                                            fAtan2 += 360.0f;
                                        }
                                        f9 = fAtan2;
                                        if (Math.abs(f9) <= 0.01d) {
                                            progress5 = motionLayout.getProgress();
                                            if (fa81Var.f67477m) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                                fa81Var.f67477m = true;
                                                motionLayout.setProgress(progress5);
                                            }
                                            i12 = fa81Var.f67468d;
                                            if (i12 != -1) {
                                                boolean z5 = z3;
                                                i13 = 1000;
                                                fa81Var.f67482r.m329D(i12, progress5, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                                fArr[z5 ? 1 : 0] = (float) Math.toDegrees(fArr[z5 ? 1 : 0]);
                                                r18 = z5;
                                            } else {
                                                boolean z6 = z3;
                                                i13 = 1000;
                                                fArr[z6 ? 1 : 0] = 360.0f;
                                                r18 = z6;
                                            }
                                            fMax2 = Math.max(Math.min(((f9 * fa81Var.f67486v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.m327B(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.m327B(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i13);
                                                }
                                                velocityTracker14 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d = yVelocity4;
                                                double d2 = xVelocity4;
                                                motionLayout.f657U0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d, d2) - dAtan2) * Math.hypot(d, d2)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.f657U0 = 0.0f;
                                            }
                                            fa81Var.f67480p = motionEvent.getRawX();
                                            fa81Var.f67481q = motionEvent.getRawY();
                                        } else {
                                            progress5 = motionLayout.getProgress();
                                            if (fa81Var.f67477m) {
                                                z3 = true;
                                                fa81Var.f67477m = true;
                                                motionLayout.setProgress(progress5);
                                            } else {
                                                z3 = true;
                                            }
                                            i12 = fa81Var.f67468d;
                                            if (i12 != -1) {
                                                boolean z7 = z3;
                                                i13 = 1000;
                                                fa81Var.f67482r.m329D(i12, progress5, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                                fArr[z7 ? 1 : 0] = (float) Math.toDegrees(fArr[z7 ? 1 : 0]);
                                                r18 = z7;
                                            } else {
                                                boolean z8 = z3;
                                                i13 = 1000;
                                                fArr[z8 ? 1 : 0] = 360.0f;
                                                r18 = z8;
                                            }
                                            fMax2 = Math.max(Math.min(((f9 * fa81Var.f67486v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.m327B(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    motionLayout.m327B(z4);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                velocityTracker13 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i13);
                                                }
                                                velocityTracker14 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d3 = yVelocity4;
                                                double d4 = xVelocity4;
                                                motionLayout.f657U0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d3, d4) - dAtan2) * Math.hypot(d3, d4)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.f657U0 = 0.0f;
                                            }
                                            fa81Var.f67480p = motionEvent.getRawX();
                                            fa81Var.f67481q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    velocityTracker2 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    action = motionEvent.getAction();
                                    if (action == 0) {
                                        fa81Var.f67480p = motionEvent.getRawX();
                                        fa81Var.f67481q = motionEvent.getRawY();
                                        fa81Var.f67477m = false;
                                    } else if (action == 1) {
                                        fa81Var.f67477m = false;
                                        velocityTracker3 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker4 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker4 != null) {
                                            xVelocity = velocityTracker4.getXVelocity();
                                        } else {
                                            xVelocity = 0.0f;
                                        }
                                        velocityTracker5 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker5 != null) {
                                            yVelocity = velocityTracker5.getYVelocity();
                                        } else {
                                            yVelocity = 0.0f;
                                        }
                                        progress = motionLayout.getProgress();
                                        i2 = fa81Var.f67468d;
                                        if (i2 != -1) {
                                            fa81Var.f67482r.m329D(i2, progress, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                            c = 1;
                                            c2 = 0;
                                        } else {
                                            float fMin = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                            c = 1;
                                            fArr[1] = fa81Var.f67476l * fMin;
                                            c2 = 0;
                                            fArr[0] = fMin * fa81Var.f67475k;
                                        }
                                        f = fa81Var.f67475k;
                                        f2 = fArr[c2];
                                        f3 = fArr[c];
                                        if (f != 0.0f) {
                                            fAbs = xVelocity / f2;
                                        } else {
                                            fAbs = yVelocity / f3;
                                        }
                                        if (Float.isNaN(fAbs)) {
                                            f4 = progress;
                                        } else {
                                            f4 = (fAbs / 3.0f) + progress;
                                        }
                                        if (f4 == 0.0f) {
                                            if (0.0f < f4) {
                                                motionLayout.setState(o1i0Var);
                                            } else {
                                                motionLayout.setState(o1i0Var);
                                            }
                                        } else if (0.0f < f4) {
                                            motionLayout.setState(o1i0Var);
                                        } else {
                                            motionLayout.setState(o1i0Var);
                                        }
                                    } else if (action == 2) {
                                        rawY = motionEvent.getRawY() - fa81Var.f67481q;
                                        rawX = motionEvent.getRawX() - fa81Var.f67480p;
                                        if (Math.abs((fa81Var.f67476l * rawY) + (fa81Var.f67475k * rawX)) <= fa81Var.f67488x) {
                                            progress2 = motionLayout.getProgress();
                                            if (!fa81Var.f67477m) {
                                                fa81Var.f67477m = true;
                                                motionLayout.setProgress(progress2);
                                            }
                                            i4 = fa81Var.f67468d;
                                            if (i4 != -1) {
                                                fa81Var.f67482r.m329D(i4, progress2, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                                c3 = 1;
                                                c4 = 0;
                                            } else {
                                                float fMin2 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                                c3 = 1;
                                                fArr[1] = fa81Var.f67476l * fMin2;
                                                c4 = 0;
                                                fArr[0] = fMin2 * fa81Var.f67475k;
                                            }
                                            if (Math.abs(((fa81Var.f67476l * fArr[c3]) + (fa81Var.f67475k * fArr[c4])) * fa81Var.f67486v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c3] = 0.01f;
                                            }
                                            if (fa81Var.f67475k != 0.0f) {
                                                f5 = rawX / fArr[0];
                                            } else {
                                                f5 = rawY / fArr[c3];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                            if (fa81Var.f67467c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (fa81Var.f67467c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = motionLayout.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.m327B(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.m327B(z2);
                                                }
                                                motionLayout.setProgress(fMax);
                                                velocityTracker6 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (fa81Var.f67475k != 0.0f) {
                                                    f6 = xVelocity2 / fArr[0];
                                                } else {
                                                    f6 = yVelocity2 / fArr[1];
                                                }
                                                motionLayout.f657U0 = f6;
                                            } else {
                                                motionLayout.f657U0 = 0.0f;
                                            }
                                            fa81Var.f67480p = motionEvent.getRawX();
                                            fa81Var.f67481q = motionEvent.getRawY();
                                        } else {
                                            progress2 = motionLayout.getProgress();
                                            if (!fa81Var.f67477m) {
                                                fa81Var.f67477m = true;
                                                motionLayout.setProgress(progress2);
                                            }
                                            i4 = fa81Var.f67468d;
                                            if (i4 != -1) {
                                                fa81Var.f67482r.m329D(i4, progress2, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                                c3 = 1;
                                                c4 = 0;
                                            } else {
                                                float fMin3 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                                c3 = 1;
                                                fArr[1] = fa81Var.f67476l * fMin3;
                                                c4 = 0;
                                                fArr[0] = fMin3 * fa81Var.f67475k;
                                            }
                                            if (Math.abs(((fa81Var.f67476l * fArr[c3]) + (fa81Var.f67475k * fArr[c4])) * fa81Var.f67486v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c3] = 0.01f;
                                            }
                                            if (fa81Var.f67475k != 0.0f) {
                                                f5 = rawX / fArr[0];
                                            } else {
                                                f5 = rawY / fArr[c3];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                            if (fa81Var.f67467c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (fa81Var.f67467c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = motionLayout.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.m327B(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    motionLayout.m327B(z2);
                                                }
                                                motionLayout.setProgress(fMax);
                                                velocityTracker6 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = (VelocityTracker) vbu0Var3.f239584b;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (fa81Var.f67475k != 0.0f) {
                                                    f6 = xVelocity2 / fArr[0];
                                                } else {
                                                    f6 = yVelocity2 / fArr[1];
                                                }
                                                motionLayout.f657U0 = f6;
                                            } else {
                                                motionLayout.f657U0 = 0.0f;
                                            }
                                            fa81Var.f67480p = motionEvent.getRawX();
                                            fa81Var.f67481q = motionEvent.getRawY();
                                        }
                                    }
                                }
                            }
                        }
                        v1i0Var2.f236386r = motionEvent.getRawX();
                        v1i0Var2.f236387s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            velocityTracker = (VelocityTracker) vbu0Var.f239584b;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                vbu0Var2 = null;
                                vbu0Var.f239584b = null;
                            } else {
                                vbu0Var2 = null;
                            }
                            v1i0Var2.f236383o = vbu0Var2;
                            i = this.f660W0;
                            if (i != -1) {
                                v1i0Var2.m84465a(i, this);
                            }
                        }
                    }
                }
            } else if (!v1i0Var2.f236381m) {
                u1i0Var = v1i0Var2.f236371c;
                if (u1i0Var != null) {
                    fArr = fa81Var.f67478n;
                    if (!v1i0Var2.f236382n) {
                        vbu0Var3 = v1i0Var2.f236383o;
                        motionLayout = fa81Var.f67482r;
                        z = fa81Var.f67474j;
                        o1i0Var = o1i0.f160767d;
                        if (z) {
                            iArr = fa81Var.f67479o;
                            velocityTracker9 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker9 != null) {
                                velocityTracker9.addMovement(motionEvent);
                            }
                            action2 = motionEvent.getAction();
                            if (action2 == 0) {
                                fa81Var.f67480p = motionEvent.getRawX();
                                fa81Var.f67481q = motionEvent.getRawY();
                                fa81Var.f67477m = false;
                            } else if (action2 == 1) {
                                fa81Var.f67477m = false;
                                velocityTracker10 = (VelocityTracker) vbu0Var3.f239584b;
                                if (velocityTracker10 != null) {
                                    velocityTracker10.computeCurrentVelocity(16);
                                }
                                velocityTracker11 = (VelocityTracker) vbu0Var3.f239584b;
                                if (velocityTracker11 != null) {
                                    xVelocity3 = velocityTracker11.getXVelocity();
                                } else {
                                    xVelocity3 = 0.0f;
                                }
                                velocityTracker12 = (VelocityTracker) vbu0Var3.f239584b;
                                if (velocityTracker12 != null) {
                                    yVelocity3 = velocityTracker12.getYVelocity();
                                } else {
                                    yVelocity3 = 0.0f;
                                }
                                progress4 = motionLayout.getProgress();
                                width = motionLayout.getWidth() / 2.0f;
                                float height3 = motionLayout.getHeight() / 2.0f;
                                i5 = fa81Var.f67473i;
                                if (i5 != -1) {
                                    View viewFindViewById5 = motionLayout.findViewById(i5);
                                    motionLayout.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = viewFindViewById5.getTop();
                                    bottom = viewFindViewById5.getBottom();
                                } else {
                                    i6 = fa81Var.f67468d;
                                    if (i6 != -1) {
                                        View viewFindViewById6 = motionLayout.findViewById(((C0043a) motionLayout.f665b1.get(motionLayout.findViewById(i6))).f703f.f173096X);
                                        motionLayout.getLocationOnScreen(iArr);
                                        width = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
                                        f7 = iArr[1];
                                        top = viewFindViewById6.getTop();
                                        bottom = viewFindViewById6.getBottom();
                                    } else {
                                        float rawX6 = motionEvent.getRawX() - width;
                                        float rawY6 = motionEvent.getRawY() - height3;
                                        double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                        i7 = fa81Var.f67468d;
                                        if (i7 != -1) {
                                            o1i0Var2 = o1i0Var;
                                            i8 = 6;
                                            fa81Var.f67482r.m329D(i7, progress4, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            o1i0Var2 = o1i0Var;
                                            i8 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY6, xVelocity3 + rawX6)) - degrees4)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f8 = (((degrees * 3.0f) * fa81Var.f67486v) / fArr[1]) + progress4;
                                        } else {
                                            f8 = progress4;
                                        }
                                        if (f8 != 0.0f) {
                                            o1i0Var3 = o1i0Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(o1i0Var3);
                                            } else {
                                                motionLayout.setState(o1i0Var3);
                                            }
                                        } else {
                                            o1i0Var3 = o1i0Var2;
                                            if (0.0f < f8) {
                                                motionLayout.setState(o1i0Var3);
                                            } else {
                                                motionLayout.setState(o1i0Var3);
                                            }
                                        }
                                    }
                                }
                                height3 = ((bottom + top) / 2.0f) + f7;
                                float rawX7 = motionEvent.getRawX() - width;
                                float rawY7 = motionEvent.getRawY() - height3;
                                double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                                i7 = fa81Var.f67468d;
                                if (i7 != -1) {
                                    o1i0Var2 = o1i0Var;
                                    i8 = 6;
                                    fa81Var.f67482r.m329D(i7, progress4, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    o1i0Var2 = o1i0Var;
                                    i8 = 6;
                                    fArr[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY7, xVelocity3 + rawX7)) - degrees5)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f8 = (((degrees * 3.0f) * fa81Var.f67486v) / fArr[1]) + progress4;
                                } else {
                                    f8 = progress4;
                                }
                                if (f8 != 0.0f) {
                                    o1i0Var3 = o1i0Var2;
                                    if (0.0f < f8) {
                                        motionLayout.setState(o1i0Var3);
                                    } else {
                                        motionLayout.setState(o1i0Var3);
                                    }
                                } else {
                                    o1i0Var3 = o1i0Var2;
                                    if (0.0f < f8) {
                                        motionLayout.setState(o1i0Var3);
                                    } else {
                                        motionLayout.setState(o1i0Var3);
                                    }
                                }
                            } else if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                width2 = motionLayout.getWidth() / 2.0f;
                                height = motionLayout.getHeight() / 2.0f;
                                i10 = fa81Var.f67473i;
                                if (i10 != -1) {
                                    View viewFindViewById7 = motionLayout.findViewById(i10);
                                    motionLayout.getLocationOnScreen(iArr);
                                    float right2 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                    float bottom3 = iArr[1] + ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f);
                                    width2 = right2;
                                    height = bottom3;
                                } else {
                                    i11 = fa81Var.f67468d;
                                    if (i11 != -1) {
                                        motionLayout.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                                rawX2 = motionEvent.getRawX() - width2;
                                rawY2 = motionEvent.getRawY() - height;
                                dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                fAtan2 = (float) (((dAtan2 - Math.atan2(fa81Var.f67481q - height, fa81Var.f67480p - width2)) * 180.0d) / 3.141592653589793d);
                                if (fAtan2 > 330.0f) {
                                    fAtan2 -= 360.0f;
                                } else if (fAtan2 < -330.0f) {
                                    fAtan2 += 360.0f;
                                }
                                f9 = fAtan2;
                                if (Math.abs(f9) <= 0.01d) {
                                    progress5 = motionLayout.getProgress();
                                    if (fa81Var.f67477m) {
                                        z3 = true;
                                        fa81Var.f67477m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = fa81Var.f67468d;
                                    if (i12 != -1) {
                                        boolean z9 = z3;
                                        i13 = 1000;
                                        fa81Var.f67482r.m329D(i12, progress5, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                        fArr[z9 ? 1 : 0] = (float) Math.toDegrees(fArr[z9 ? 1 : 0]);
                                        r18 = z9;
                                    } else {
                                        boolean z10 = z3;
                                        i13 = 1000;
                                        fArr[z10 ? 1 : 0] = 360.0f;
                                        r18 = z10;
                                    }
                                    fMax2 = Math.max(Math.min(((f9 * fa81Var.f67486v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.m327B(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.m327B(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i13);
                                        }
                                        velocityTracker14 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d5 = yVelocity4;
                                        double d6 = xVelocity4;
                                        motionLayout.f657U0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d5, d6) - dAtan2) * Math.hypot(d5, d6)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.f657U0 = 0.0f;
                                    }
                                    fa81Var.f67480p = motionEvent.getRawX();
                                    fa81Var.f67481q = motionEvent.getRawY();
                                } else {
                                    progress5 = motionLayout.getProgress();
                                    if (fa81Var.f67477m) {
                                        z3 = true;
                                        fa81Var.f67477m = true;
                                        motionLayout.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = fa81Var.f67468d;
                                    if (i12 != -1) {
                                        boolean z11 = z3;
                                        i13 = 1000;
                                        fa81Var.f67482r.m329D(i12, progress5, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                        fArr[z11 ? 1 : 0] = (float) Math.toDegrees(fArr[z11 ? 1 : 0]);
                                        r18 = z11;
                                    } else {
                                        boolean z12 = z3;
                                        i13 = 1000;
                                        fArr[z12 ? 1 : 0] = 360.0f;
                                        r18 = z12;
                                    }
                                    fMax2 = Math.max(Math.min(((f9 * fa81Var.f67486v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.m327B(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            motionLayout.m327B(z4);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        velocityTracker13 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i13);
                                        }
                                        velocityTracker14 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d7 = yVelocity4;
                                        double d8 = xVelocity4;
                                        motionLayout.f657U0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d7, d8) - dAtan2) * Math.hypot(d7, d8)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.f657U0 = 0.0f;
                                    }
                                    fa81Var.f67480p = motionEvent.getRawX();
                                    fa81Var.f67481q = motionEvent.getRawY();
                                }
                            }
                        } else {
                            velocityTracker2 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker2 != null) {
                                velocityTracker2.addMovement(motionEvent);
                            }
                            action = motionEvent.getAction();
                            if (action == 0) {
                                fa81Var.f67480p = motionEvent.getRawX();
                                fa81Var.f67481q = motionEvent.getRawY();
                                fa81Var.f67477m = false;
                            } else if (action == 1) {
                                fa81Var.f67477m = false;
                                velocityTracker3 = (VelocityTracker) vbu0Var3.f239584b;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.computeCurrentVelocity(1000);
                                }
                                velocityTracker4 = (VelocityTracker) vbu0Var3.f239584b;
                                if (velocityTracker4 != null) {
                                    xVelocity = velocityTracker4.getXVelocity();
                                } else {
                                    xVelocity = 0.0f;
                                }
                                velocityTracker5 = (VelocityTracker) vbu0Var3.f239584b;
                                if (velocityTracker5 != null) {
                                    yVelocity = velocityTracker5.getYVelocity();
                                } else {
                                    yVelocity = 0.0f;
                                }
                                progress = motionLayout.getProgress();
                                i2 = fa81Var.f67468d;
                                if (i2 != -1) {
                                    fa81Var.f67482r.m329D(i2, progress, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                    c = 1;
                                    c2 = 0;
                                } else {
                                    float fMin4 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c = 1;
                                    fArr[1] = fa81Var.f67476l * fMin4;
                                    c2 = 0;
                                    fArr[0] = fMin4 * fa81Var.f67475k;
                                }
                                f = fa81Var.f67475k;
                                f2 = fArr[c2];
                                f3 = fArr[c];
                                if (f != 0.0f) {
                                    fAbs = xVelocity / f2;
                                } else {
                                    fAbs = yVelocity / f3;
                                }
                                if (Float.isNaN(fAbs)) {
                                    f4 = (fAbs / 3.0f) + progress;
                                } else {
                                    f4 = progress;
                                }
                                if (f4 == 0.0f) {
                                    if (0.0f < f4) {
                                        motionLayout.setState(o1i0Var);
                                    } else {
                                        motionLayout.setState(o1i0Var);
                                    }
                                } else if (0.0f < f4) {
                                    motionLayout.setState(o1i0Var);
                                } else {
                                    motionLayout.setState(o1i0Var);
                                }
                            } else if (action == 2) {
                                rawY = motionEvent.getRawY() - fa81Var.f67481q;
                                rawX = motionEvent.getRawX() - fa81Var.f67480p;
                                if (Math.abs((fa81Var.f67476l * rawY) + (fa81Var.f67475k * rawX)) <= fa81Var.f67488x) {
                                    progress2 = motionLayout.getProgress();
                                    if (!fa81Var.f67477m) {
                                        fa81Var.f67477m = true;
                                        motionLayout.setProgress(progress2);
                                    }
                                    i4 = fa81Var.f67468d;
                                    if (i4 != -1) {
                                        fa81Var.f67482r.m329D(i4, progress2, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                        c3 = 1;
                                        c4 = 0;
                                    } else {
                                        float fMin5 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                        c3 = 1;
                                        fArr[1] = fa81Var.f67476l * fMin5;
                                        c4 = 0;
                                        fArr[0] = fMin5 * fa81Var.f67475k;
                                    }
                                    if (Math.abs(((fa81Var.f67476l * fArr[c3]) + (fa81Var.f67475k * fArr[c4])) * fa81Var.f67486v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c3] = 0.01f;
                                    }
                                    if (fa81Var.f67475k != 0.0f) {
                                        f5 = rawX / fArr[0];
                                    } else {
                                        f5 = rawY / fArr[c3];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                    if (fa81Var.f67467c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (fa81Var.f67467c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = motionLayout.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.m327B(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.m327B(z2);
                                        }
                                        motionLayout.setProgress(fMax);
                                        velocityTracker6 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (fa81Var.f67475k != 0.0f) {
                                            f6 = xVelocity2 / fArr[0];
                                        } else {
                                            f6 = yVelocity2 / fArr[1];
                                        }
                                        motionLayout.f657U0 = f6;
                                    } else {
                                        motionLayout.f657U0 = 0.0f;
                                    }
                                    fa81Var.f67480p = motionEvent.getRawX();
                                    fa81Var.f67481q = motionEvent.getRawY();
                                } else {
                                    progress2 = motionLayout.getProgress();
                                    if (!fa81Var.f67477m) {
                                        fa81Var.f67477m = true;
                                        motionLayout.setProgress(progress2);
                                    }
                                    i4 = fa81Var.f67468d;
                                    if (i4 != -1) {
                                        fa81Var.f67482r.m329D(i4, progress2, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                        c3 = 1;
                                        c4 = 0;
                                    } else {
                                        float fMin6 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                        c3 = 1;
                                        fArr[1] = fa81Var.f67476l * fMin6;
                                        c4 = 0;
                                        fArr[0] = fMin6 * fa81Var.f67475k;
                                    }
                                    if (Math.abs(((fa81Var.f67476l * fArr[c3]) + (fa81Var.f67475k * fArr[c4])) * fa81Var.f67486v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c3] = 0.01f;
                                    }
                                    if (fa81Var.f67475k != 0.0f) {
                                        f5 = rawX / fArr[0];
                                    } else {
                                        f5 = rawY / fArr[c3];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                    if (fa81Var.f67467c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (fa81Var.f67467c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = motionLayout.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.m327B(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            motionLayout.m327B(z2);
                                        }
                                        motionLayout.setProgress(fMax);
                                        velocityTracker6 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = (VelocityTracker) vbu0Var3.f239584b;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (fa81Var.f67475k != 0.0f) {
                                            f6 = xVelocity2 / fArr[0];
                                        } else {
                                            f6 = yVelocity2 / fArr[1];
                                        }
                                        motionLayout.f657U0 = f6;
                                    } else {
                                        motionLayout.f657U0 = 0.0f;
                                    }
                                    fa81Var.f67480p = motionEvent.getRawX();
                                    fa81Var.f67481q = motionEvent.getRawY();
                                }
                            }
                        }
                    }
                }
                v1i0Var2.f236386r = motionEvent.getRawX();
                v1i0Var2.f236387s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    velocityTracker = (VelocityTracker) vbu0Var.f239584b;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        vbu0Var2 = null;
                        vbu0Var.f239584b = null;
                    } else {
                        vbu0Var2 = null;
                    }
                    v1i0Var2.f236383o = vbu0Var2;
                    i = this.f660W0;
                    if (i != -1) {
                        v1i0Var2.m84465a(i, this);
                    }
                }
            }
        } else if (!v1i0Var2.f236381m) {
            u1i0Var = v1i0Var2.f236371c;
            if (u1i0Var != null && (fa81Var = u1i0Var.f225840l) != null) {
                fArr = fa81Var.f67478n;
                if (!v1i0Var2.f236382n) {
                    vbu0Var3 = v1i0Var2.f236383o;
                    motionLayout = fa81Var.f67482r;
                    z = fa81Var.f67474j;
                    o1i0Var = o1i0.f160767d;
                    if (z) {
                        iArr = fa81Var.f67479o;
                        velocityTracker9 = (VelocityTracker) vbu0Var3.f239584b;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            fa81Var.f67480p = motionEvent.getRawX();
                            fa81Var.f67481q = motionEvent.getRawY();
                            fa81Var.f67477m = false;
                        } else if (action2 == 1) {
                            fa81Var.f67477m = false;
                            velocityTracker10 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(16);
                            }
                            velocityTracker11 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker11 != null) {
                                xVelocity3 = velocityTracker11.getXVelocity();
                            } else {
                                xVelocity3 = 0.0f;
                            }
                            velocityTracker12 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker12 != null) {
                                yVelocity3 = velocityTracker12.getYVelocity();
                            } else {
                                yVelocity3 = 0.0f;
                            }
                            progress4 = motionLayout.getProgress();
                            width = motionLayout.getWidth() / 2.0f;
                            float height4 = motionLayout.getHeight() / 2.0f;
                            i5 = fa81Var.f67473i;
                            if (i5 != -1) {
                                View viewFindViewById8 = motionLayout.findViewById(i5);
                                motionLayout.getLocationOnScreen(iArr);
                                width = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
                                f7 = iArr[1];
                                top = viewFindViewById8.getTop();
                                bottom = viewFindViewById8.getBottom();
                            } else {
                                i6 = fa81Var.f67468d;
                                if (i6 != -1) {
                                    View viewFindViewById9 = motionLayout.findViewById(((C0043a) motionLayout.f665b1.get(motionLayout.findViewById(i6))).f703f.f173096X);
                                    motionLayout.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = viewFindViewById9.getTop();
                                    bottom = viewFindViewById9.getBottom();
                                } else {
                                    float rawX8 = motionEvent.getRawX() - width;
                                    float rawY8 = motionEvent.getRawY() - height4;
                                    double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                    i7 = fa81Var.f67468d;
                                    if (i7 != -1) {
                                        o1i0Var2 = o1i0Var;
                                        i8 = 6;
                                        fa81Var.f67482r.m329D(i7, progress4, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        o1i0Var2 = o1i0Var;
                                        i8 = 6;
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY8, xVelocity3 + rawX8)) - degrees6)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f8 = (((degrees * 3.0f) * fa81Var.f67486v) / fArr[1]) + progress4;
                                    } else {
                                        f8 = progress4;
                                    }
                                    if (f8 != 0.0f || f8 == 1.0f || (i9 = fa81Var.f67467c) == 3) {
                                        o1i0Var3 = o1i0Var2;
                                        if (0.0f < f8 || 1.0f <= f8) {
                                            motionLayout.setState(o1i0Var3);
                                        }
                                    } else {
                                        float fAbs2 = (degrees * fa81Var.f67486v) / fArr[1];
                                        float f18 = ((double) f8) < 0.5d ? 0.0f : 1.0f;
                                        if (i9 == i8) {
                                            if (progress4 + fAbs2 < 0.0f) {
                                                fAbs2 = Math.abs(fAbs2);
                                            }
                                            f18 = 1.0f;
                                        }
                                        if (fa81Var.f67467c == 7) {
                                            if (progress4 + fAbs2 > 1.0f) {
                                                fAbs2 = -Math.abs(fAbs2);
                                            }
                                            f18 = 0.0f;
                                        }
                                        motionLayout.m338M(f18, fAbs2 * 3.0f, fa81Var.f67467c);
                                        if (0.0f >= progress4 || 1.0f <= progress4) {
                                            motionLayout.setState(o1i0Var2);
                                        }
                                    }
                                }
                            }
                            height4 = ((bottom + top) / 2.0f) + f7;
                            float rawX9 = motionEvent.getRawX() - width;
                            float rawY9 = motionEvent.getRawY() - height4;
                            double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                            i7 = fa81Var.f67468d;
                            if (i7 != -1) {
                                o1i0Var2 = o1i0Var;
                                i8 = 6;
                                fa81Var.f67482r.m329D(i7, progress4, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                o1i0Var2 = o1i0Var;
                                i8 = 6;
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY9, xVelocity3 + rawX9)) - degrees7)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f8 = (((degrees * 3.0f) * fa81Var.f67486v) / fArr[1]) + progress4;
                            } else {
                                f8 = progress4;
                            }
                            if (f8 != 0.0f) {
                                o1i0Var3 = o1i0Var2;
                                if (0.0f < f8) {
                                    motionLayout.setState(o1i0Var3);
                                } else {
                                    motionLayout.setState(o1i0Var3);
                                }
                            } else {
                                o1i0Var3 = o1i0Var2;
                                if (0.0f < f8) {
                                    motionLayout.setState(o1i0Var3);
                                } else {
                                    motionLayout.setState(o1i0Var3);
                                }
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width2 = motionLayout.getWidth() / 2.0f;
                            height = motionLayout.getHeight() / 2.0f;
                            i10 = fa81Var.f67473i;
                            if (i10 != -1) {
                                View viewFindViewById10 = motionLayout.findViewById(i10);
                                motionLayout.getLocationOnScreen(iArr);
                                float right3 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                                float bottom4 = iArr[1] + ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f);
                                width2 = right3;
                                height = bottom4;
                            } else {
                                i11 = fa81Var.f67468d;
                                if (i11 != -1 && (viewFindViewById = motionLayout.findViewById(((C0043a) motionLayout.f665b1.get(motionLayout.findViewById(i11))).f703f.f173096X)) != null) {
                                    motionLayout.getLocationOnScreen(iArr);
                                    width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                    height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width2;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(fa81Var.f67481q - height, fa81Var.f67480p - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            f9 = fAtan2;
                            if (Math.abs(f9) <= 0.01d || fa81Var.f67477m) {
                                progress5 = motionLayout.getProgress();
                                if (fa81Var.f67477m) {
                                    z3 = true;
                                    fa81Var.f67477m = true;
                                    motionLayout.setProgress(progress5);
                                } else {
                                    z3 = true;
                                }
                                i12 = fa81Var.f67468d;
                                if (i12 != -1) {
                                    boolean z13 = z3;
                                    i13 = 1000;
                                    fa81Var.f67482r.m329D(i12, progress5, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                    fArr[z13 ? 1 : 0] = (float) Math.toDegrees(fArr[z13 ? 1 : 0]);
                                    r18 = z13;
                                } else {
                                    boolean z14 = z3;
                                    i13 = 1000;
                                    fArr[z14 ? 1 : 0] = 360.0f;
                                    r18 = z14;
                                }
                                fMax2 = Math.max(Math.min(((f9 * fa81Var.f67486v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                progress6 = motionLayout.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != 0.0f || progress6 == 1.0f) {
                                        if (progress6 == 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        motionLayout.m327B(z4);
                                    }
                                    motionLayout.setProgress(fMax2);
                                    velocityTracker13 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(i13);
                                    }
                                    velocityTracker14 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker14 != null) {
                                        xVelocity4 = velocityTracker14.getXVelocity();
                                    } else {
                                        xVelocity4 = 0.0f;
                                    }
                                    velocityTracker15 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker15 != null) {
                                        yVelocity4 = velocityTracker15.getYVelocity();
                                    } else {
                                        yVelocity4 = 0.0f;
                                    }
                                    double d9 = yVelocity4;
                                    double d10 = xVelocity4;
                                    motionLayout.f657U0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d9, d10) - dAtan2) * Math.hypot(d9, d10)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    motionLayout.f657U0 = 0.0f;
                                }
                                fa81Var.f67480p = motionEvent.getRawX();
                                fa81Var.f67481q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        velocityTracker2 = (VelocityTracker) vbu0Var3.f239584b;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        action = motionEvent.getAction();
                        if (action == 0) {
                            fa81Var.f67480p = motionEvent.getRawX();
                            fa81Var.f67481q = motionEvent.getRawY();
                            fa81Var.f67477m = false;
                        } else if (action == 1) {
                            fa81Var.f67477m = false;
                            velocityTracker3 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(1000);
                            }
                            velocityTracker4 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker4 != null) {
                                xVelocity = velocityTracker4.getXVelocity();
                            } else {
                                xVelocity = 0.0f;
                            }
                            velocityTracker5 = (VelocityTracker) vbu0Var3.f239584b;
                            if (velocityTracker5 != null) {
                                yVelocity = velocityTracker5.getYVelocity();
                            } else {
                                yVelocity = 0.0f;
                            }
                            progress = motionLayout.getProgress();
                            i2 = fa81Var.f67468d;
                            if (i2 != -1) {
                                fa81Var.f67482r.m329D(i2, progress, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                c = 1;
                                c2 = 0;
                            } else {
                                float fMin7 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c = 1;
                                fArr[1] = fa81Var.f67476l * fMin7;
                                c2 = 0;
                                fArr[0] = fMin7 * fa81Var.f67475k;
                            }
                            f = fa81Var.f67475k;
                            f2 = fArr[c2];
                            f3 = fArr[c];
                            if (f != 0.0f) {
                                fAbs = xVelocity / f2;
                            } else {
                                fAbs = yVelocity / f3;
                            }
                            if (Float.isNaN(fAbs)) {
                                f4 = (fAbs / 3.0f) + progress;
                            } else {
                                f4 = progress;
                            }
                            if (f4 == 0.0f && f4 != 1.0f && (i3 = fa81Var.f67467c) != 3) {
                                float f19 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
                                if (i3 == 6) {
                                    if (progress + fAbs < 0.0f) {
                                        fAbs = Math.abs(fAbs);
                                    }
                                    f19 = 1.0f;
                                }
                                if (fa81Var.f67467c == 7) {
                                    if (progress + fAbs > 1.0f) {
                                        fAbs = -Math.abs(fAbs);
                                    }
                                    f19 = 0.0f;
                                }
                                motionLayout.m338M(f19, fAbs, fa81Var.f67467c);
                                if (0.0f >= progress || 1.0f <= progress) {
                                    motionLayout.setState(o1i0Var);
                                }
                            } else if (0.0f < f4 || 1.0f <= f4) {
                                motionLayout.setState(o1i0Var);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - fa81Var.f67481q;
                            rawX = motionEvent.getRawX() - fa81Var.f67480p;
                            if (Math.abs((fa81Var.f67476l * rawY) + (fa81Var.f67475k * rawX)) <= fa81Var.f67488x || fa81Var.f67477m) {
                                progress2 = motionLayout.getProgress();
                                if (!fa81Var.f67477m) {
                                    fa81Var.f67477m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i4 = fa81Var.f67468d;
                                if (i4 != -1) {
                                    fa81Var.f67482r.m329D(i4, progress2, fa81Var.f67472h, fa81Var.f67471g, fArr);
                                    c3 = 1;
                                    c4 = 0;
                                } else {
                                    float fMin8 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c3 = 1;
                                    fArr[1] = fa81Var.f67476l * fMin8;
                                    c4 = 0;
                                    fArr[0] = fMin8 * fa81Var.f67475k;
                                }
                                if (Math.abs(((fa81Var.f67476l * fArr[c3]) + (fa81Var.f67475k * fArr[c4])) * fa81Var.f67486v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c3] = 0.01f;
                                }
                                if (fa81Var.f67475k != 0.0f) {
                                    f5 = rawX / fArr[0];
                                } else {
                                    f5 = rawY / fArr[c3];
                                }
                                fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                if (fa81Var.f67467c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (fa81Var.f67467c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f || progress3 == 1.0f) {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout.m327B(z2);
                                    }
                                    motionLayout.setProgress(fMax);
                                    velocityTracker6 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    velocityTracker7 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker7 != null) {
                                        xVelocity2 = velocityTracker7.getXVelocity();
                                    } else {
                                        xVelocity2 = 0.0f;
                                    }
                                    velocityTracker8 = (VelocityTracker) vbu0Var3.f239584b;
                                    if (velocityTracker8 != null) {
                                        yVelocity2 = velocityTracker8.getYVelocity();
                                    } else {
                                        yVelocity2 = 0.0f;
                                    }
                                    if (fa81Var.f67475k != 0.0f) {
                                        f6 = xVelocity2 / fArr[0];
                                    } else {
                                        f6 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.f657U0 = f6;
                                } else {
                                    motionLayout.f657U0 = 0.0f;
                                }
                                fa81Var.f67480p = motionEvent.getRawX();
                                fa81Var.f67481q = motionEvent.getRawY();
                            }
                        }
                    }
                }
            }
            v1i0Var2.f236386r = motionEvent.getRawX();
            v1i0Var2.f236387s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (vbu0Var = v1i0Var2.f236383o) != null) {
                velocityTracker = (VelocityTracker) vbu0Var.f239584b;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    vbu0Var2 = null;
                    vbu0Var.f239584b = null;
                } else {
                    vbu0Var2 = null;
                }
                v1i0Var2.f236383o = vbu0Var2;
                i = this.f660W0;
                if (i != -1) {
                    v1i0Var2.m84465a(i, this);
                }
            }
        }
        u1i0 u1i0Var6 = this.f651R0.f236371c;
        if ((u1i0Var6.f225846r & 4) != 0) {
            return u1i0Var6.f225840l.f67477m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        v1i0 v1i0Var;
        u1i0 u1i0Var;
        if (!this.f635B1 && this.f660W0 == -1 && (v1i0Var = this.f651R0) != null && (u1i0Var = v1i0Var.f236371c) != null) {
            int i = u1i0Var.f225845q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((C0043a) this.f665b1.get(getChildAt(i2))).f701d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.f674k1 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f648O1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f664a1 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f651R0 != null) {
            setState(o1i0.f160766c);
            Interpolator interpolatorM84468e = this.f651R0.m84468e();
            if (interpolatorM84468e != null) {
                setProgress(interpolatorM84468e.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
    }

    public void setOnShow(float f) {
    }

    public void setProgress(float f) {
        if (f >= 0.0f) {
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        }
        if (!super.isAttachedToWindow()) {
            if (this.f645L1 == null) {
                this.f645L1 = new m1i0(this);
            }
            this.f645L1.f138976a = f;
            return;
        }
        o1i0 o1i0Var = o1i0.f160767d;
        o1i0 o1i0Var2 = o1i0.f160766c;
        if (f <= 0.0f) {
            if (this.f669f1 == 1.0f && this.f660W0 == this.f661X0) {
                setState(o1i0Var2);
            }
            this.f660W0 = this.f659V0;
            if (this.f669f1 == 0.0f) {
                setState(o1i0Var);
            }
        } else if (f >= 1.0f) {
            if (this.f669f1 == 0.0f && this.f660W0 == this.f659V0) {
                setState(o1i0Var2);
            }
            this.f660W0 = this.f661X0;
            if (this.f669f1 == 1.0f) {
                setState(o1i0Var);
            }
        } else {
            this.f660W0 = -1;
            setState(o1i0Var2);
        }
        if (this.f651R0 == null) {
            return;
        }
        this.f672i1 = true;
        this.f671h1 = f;
        this.f668e1 = f;
        this.f670g1 = -1L;
        this.f666c1 = -1L;
        this.f653S0 = null;
        this.f673j1 = true;
        invalidate();
    }

    public void setScene(v1i0 v1i0Var) {
        fa81 fa81Var;
        this.f651R0 = v1i0Var;
        boolean zM359r = m359r();
        v1i0Var.f236384p = zM359r;
        u1i0 u1i0Var = v1i0Var.f236371c;
        if (u1i0Var != null && (fa81Var = u1i0Var.f225840l) != null) {
            fa81Var.m41147c(zM359r);
        }
        m334I();
    }

    public void setStartState(int i) {
        if (super.isAttachedToWindow()) {
            this.f660W0 = i;
            return;
        }
        if (this.f645L1 == null) {
            this.f645L1 = new m1i0(this);
        }
        m1i0 m1i0Var = this.f645L1;
        m1i0Var.f138978c = i;
        m1i0Var.f138979d = i;
    }

    public void setState(o1i0 o1i0Var) {
        b381 b381Var;
        b381 b381Var2;
        o1i0 o1i0Var2 = o1i0.f160767d;
        if (o1i0Var == o1i0Var2 && this.f660W0 == -1) {
            return;
        }
        o1i0 o1i0Var3 = this.f649P1;
        this.f649P1 = o1i0Var;
        int iOrdinal = o1i0Var3.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (o1i0Var != o1i0Var2 || (b381Var = this.f646M1) == null) {
                return;
            }
            b381Var.run();
            this.f646M1 = null;
            return;
        }
        if (iOrdinal == 2 && o1i0Var == o1i0Var2 && (b381Var2 = this.f646M1) != null) {
            b381Var2.run();
            this.f646M1 = null;
        }
    }

    public void setTransition(int i) {
        u1i0 u1i0Var;
        float f;
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var != null) {
            Iterator it = v1i0Var.f236372d.iterator();
            do {
                if (!it.hasNext()) {
                    u1i0Var = null;
                    break;
                }
                u1i0Var = (u1i0) it.next();
            } while (u1i0Var.f225829a != i);
            this.f659V0 = u1i0Var.f225832d;
            this.f661X0 = u1i0Var.f225831c;
            if (!super.isAttachedToWindow()) {
                if (this.f645L1 == null) {
                    this.f645L1 = new m1i0(this);
                }
                m1i0 m1i0Var = this.f645L1;
                m1i0Var.f138978c = this.f659V0;
                m1i0Var.f138979d = this.f661X0;
                return;
            }
            int i2 = this.f660W0;
            if (i2 == this.f659V0) {
                f = 0.0f;
            } else {
                f = i2 == this.f661X0 ? 1.0f : Float.NaN;
            }
            v1i0 v1i0Var2 = this.f651R0;
            v1i0Var2.f236371c = u1i0Var;
            fa81 fa81Var = u1i0Var.f225840l;
            if (fa81Var != null) {
                fa81Var.m41147c(v1i0Var2.f236384p);
            }
            this.f650Q1.m97122f(this.f651R0.m84466b(this.f659V0), this.f651R0.m84466b(this.f661X0));
            m334I();
            if (this.f669f1 != f) {
                if (f == 0.0f) {
                    m327B(true);
                    this.f651R0.m84466b(this.f659V0).m31733b(this);
                } else if (f == 1.0f) {
                    m327B(false);
                    this.f651R0.m84466b(this.f661X0).m31733b(this);
                }
            }
            this.f669f1 = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                mif1.m61889x();
                m345z(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null) {
            return;
        }
        u1i0 u1i0Var = v1i0Var.f236371c;
        if (u1i0Var != null) {
            u1i0Var.f225836h = Math.max(i, 8);
        } else {
            v1i0Var.f236378j = i;
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f645L1 == null) {
            this.f645L1 = new m1i0(this);
        }
        m1i0 m1i0Var = this.f645L1;
        m1i0Var.getClass();
        m1i0Var.f138976a = bundle.getFloat("motion.progress");
        m1i0Var.f138977b = bundle.getFloat("motion.velocity");
        m1i0Var.f138978c = bundle.getInt("motion.StartState");
        m1i0Var.f138979d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.f645L1.m60537a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* JADX INFO: renamed from: t */
    public final void mo344t(int i) {
        this.f728L0 = null;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return mif1.m61890y(context, this.f659V0) + "->" + mif1.m61890y(context, this.f661X0) + " (pos:" + this.f669f1 + " Dpos/Dt:" + this.f657U0;
    }

    /* JADX INFO: renamed from: z */
    public final void m345z(float f) {
        v1i0 v1i0Var = this.f651R0;
        if (v1i0Var == null) {
            return;
        }
        float f2 = this.f669f1;
        float f3 = this.f668e1;
        if (f2 != f3 && this.f672i1) {
            this.f669f1 = f3;
        }
        float f4 = this.f669f1;
        if (f4 == f) {
            return;
        }
        this.f676m1 = false;
        this.f671h1 = f;
        this.f667d1 = v1i0Var.m84467c() / 1000.0f;
        setProgress(this.f671h1);
        this.f653S0 = null;
        this.f655T0 = this.f651R0.m84468e();
        this.f672i1 = false;
        this.f666c1 = getNanoTime();
        this.f673j1 = true;
        this.f668e1 = f4;
        this.f669f1 = f4;
        invalidate();
    }

    public void setTransitionListener(n1i0 n1i0Var) {
    }

    public void setTransition(u1i0 u1i0Var) {
        fa81 fa81Var;
        v1i0 v1i0Var = this.f651R0;
        v1i0Var.f236371c = u1i0Var;
        if (u1i0Var != null && (fa81Var = u1i0Var.f225840l) != null) {
            fa81Var.m41147c(v1i0Var.f236384p);
        }
        setState(o1i0.f160765b);
        int i = this.f660W0;
        u1i0 u1i0Var2 = this.f651R0.f236371c;
        if (i == (u1i0Var2 == null ? -1 : u1i0Var2.f225831c)) {
            this.f669f1 = 1.0f;
            this.f668e1 = 1.0f;
            this.f671h1 = 1.0f;
        } else {
            this.f669f1 = 0.0f;
            this.f668e1 = 0.0f;
            this.f671h1 = 0.0f;
        }
        this.f670g1 = (u1i0Var.f225846r & 1) != 0 ? -1L : getNanoTime();
        int iM84471h = this.f651R0.m84471h();
        v1i0 v1i0Var2 = this.f651R0;
        u1i0 u1i0Var3 = v1i0Var2.f236371c;
        int i2 = u1i0Var3 != null ? u1i0Var3.f225831c : -1;
        if (iM84471h == this.f659V0 && i2 == this.f661X0) {
            return;
        }
        this.f659V0 = iM84471h;
        this.f661X0 = i2;
        v1i0Var2.m84477n(iM84471h, i2);
        c7j c7jVarM84466b = this.f651R0.m84466b(this.f659V0);
        c7j c7jVarM84466b2 = this.f651R0.m84466b(this.f661X0);
        zwi zwiVar = this.f650Q1;
        zwiVar.m97122f(c7jVarM84466b, c7jVarM84466b2);
        int i3 = this.f659V0;
        int i4 = this.f661X0;
        zwiVar.f286987a = i3;
        zwiVar.f286988b = i4;
        zwiVar.m97125i();
        m334I();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f655T0 = null;
        this.f657U0 = 0.0f;
        this.f659V0 = -1;
        this.f660W0 = -1;
        this.f661X0 = -1;
        this.f662Y0 = 0;
        this.f663Z0 = 0;
        this.f664a1 = true;
        this.f665b1 = new HashMap();
        this.f666c1 = 0L;
        this.f667d1 = 1.0f;
        this.f668e1 = 0.0f;
        this.f669f1 = 0.0f;
        this.f671h1 = 0.0f;
        this.f673j1 = false;
        this.f674k1 = 0;
        this.f676m1 = false;
        this.f677n1 = new m651();
        this.f678o1 = new k1i0(this);
        this.f682s1 = false;
        this.f687x1 = false;
        this.f688y1 = 0;
        this.f689z1 = -1L;
        this.f634A1 = 0.0f;
        this.f635B1 = false;
        this.f643J1 = new iew0(1);
        this.f644K1 = false;
        this.f646M1 = null;
        new HashMap();
        this.f647N1 = new Rect();
        this.f648O1 = false;
        this.f649P1 = o1i0.f160764a;
        this.f650Q1 = new zwi(this);
        this.f652R1 = false;
        this.f654S1 = new RectF();
        this.f656T1 = null;
        this.f658U1 = null;
        new ArrayList();
        m332G(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f655T0 = null;
        this.f657U0 = 0.0f;
        this.f659V0 = -1;
        this.f660W0 = -1;
        this.f661X0 = -1;
        this.f662Y0 = 0;
        this.f663Z0 = 0;
        this.f664a1 = true;
        this.f665b1 = new HashMap();
        this.f666c1 = 0L;
        this.f667d1 = 1.0f;
        this.f668e1 = 0.0f;
        this.f669f1 = 0.0f;
        this.f671h1 = 0.0f;
        this.f673j1 = false;
        this.f674k1 = 0;
        this.f676m1 = false;
        this.f677n1 = new m651();
        this.f678o1 = new k1i0(this);
        this.f682s1 = false;
        this.f687x1 = false;
        this.f688y1 = 0;
        this.f689z1 = -1L;
        this.f634A1 = 0.0f;
        this.f635B1 = false;
        this.f643J1 = new iew0(1);
        this.f644K1 = false;
        this.f646M1 = null;
        new HashMap();
        this.f647N1 = new Rect();
        this.f648O1 = false;
        this.f649P1 = o1i0.f160764a;
        this.f650Q1 = new zwi(this);
        this.f652R1 = false;
        this.f654S1 = new RectF();
        this.f656T1 = null;
        this.f658U1 = null;
        new ArrayList();
        m332G(attributeSet);
    }
}
