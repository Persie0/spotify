package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p204p.alf1;
import p204p.aqs;
import p204p.c1i0;
import p204p.d6j;
import p204p.dq60;
import p204p.edb;
import p204p.hkf1;
import p204p.iew0;
import p204p.ii5;
import p204p.ilc1;
import p204p.jlc1;
import p204p.klc1;
import p204p.llc1;
import p204p.mlc1;
import p204p.p1i0;
import p204p.pt60;
import p204p.vnc1;
import p204p.wnc1;
import p204p.xjc1;
import p204p.xnc1;
import p204p.ync1;
import p204p.zjc1;
import p204p.znc1;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0043a {

    /* JADX INFO: renamed from: A */
    public KeyTrigger[] f690A;

    /* JADX INFO: renamed from: b */
    public final View f699b;

    /* JADX INFO: renamed from: c */
    public final int f700c;

    /* JADX INFO: renamed from: j */
    public hkf1[] f707j;

    /* JADX INFO: renamed from: k */
    public ii5 f708k;

    /* JADX INFO: renamed from: o */
    public int[] f712o;

    /* JADX INFO: renamed from: p */
    public double[] f713p;

    /* JADX INFO: renamed from: q */
    public double[] f714q;

    /* JADX INFO: renamed from: r */
    public String[] f715r;

    /* JADX INFO: renamed from: s */
    public int[] f716s;

    /* JADX INFO: renamed from: x */
    public HashMap f721x;

    /* JADX INFO: renamed from: y */
    public HashMap f722y;

    /* JADX INFO: renamed from: z */
    public HashMap f723z;

    /* JADX INFO: renamed from: a */
    public final Rect f698a = new Rect();

    /* JADX INFO: renamed from: d */
    public boolean f701d = false;

    /* JADX INFO: renamed from: e */
    public int f702e = -1;

    /* JADX INFO: renamed from: f */
    public final p1i0 f703f = new p1i0();

    /* JADX INFO: renamed from: g */
    public final p1i0 f704g = new p1i0();

    /* JADX INFO: renamed from: h */
    public final c1i0 f705h = new c1i0();

    /* JADX INFO: renamed from: i */
    public final c1i0 f706i = new c1i0();

    /* JADX INFO: renamed from: l */
    public float f709l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f710m = 0.0f;

    /* JADX INFO: renamed from: n */
    public float f711n = 1.0f;

    /* JADX INFO: renamed from: t */
    public final float[] f717t = new float[4];

    /* JADX INFO: renamed from: u */
    public final ArrayList f718u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final float[] f719v = new float[1];

    /* JADX INFO: renamed from: w */
    public final ArrayList f720w = new ArrayList();

    /* JADX INFO: renamed from: B */
    public int f691B = -1;

    /* JADX INFO: renamed from: C */
    public int f692C = -1;

    /* JADX INFO: renamed from: D */
    public View f693D = null;

    /* JADX INFO: renamed from: E */
    public int f694E = -1;

    /* JADX INFO: renamed from: F */
    public float f695F = Float.NaN;

    /* JADX INFO: renamed from: G */
    public Interpolator f696G = null;

    /* JADX INFO: renamed from: H */
    public boolean f697H = false;

    public C0043a(View view) {
        this.f699b = view;
        this.f700c = view.getId();
        view.getLayoutParams();
    }

    /* JADX INFO: renamed from: f */
    public static void m346f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    /* JADX INFO: renamed from: a */
    public final float m347a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f711n;
            if (f3 != 1.0d) {
                float f4 = this.f710m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        aqs aqsVar = this.f703f.f173099a;
        float f5 = Float.NaN;
        for (p1i0 p1i0Var : this.f718u) {
            aqs aqsVar2 = p1i0Var.f173099a;
            if (aqsVar2 != null) {
                float f6 = p1i0Var.f173101c;
                if (f6 < f) {
                    aqsVar = aqsVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = p1i0Var.f173101c;
                }
            }
        }
        if (aqsVar != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) aqsVar.mo26896c(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) aqsVar.mo26897d(d);
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: b */
    public final void m348b(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f707j[0].mo25151r(d, dArr);
        this.f707j[0].mo25153t(d, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f712o;
        p1i0 p1i0Var = this.f703f;
        float f3 = p1i0Var.f173103e;
        float f4 = p1i0Var.f173104f;
        float f5 = p1i0Var.f173105g;
        float f6 = p1i0Var.f173106h;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f10;
                f2 = f11;
            } else if (i2 == 2) {
                f4 = f10;
                f9 = f11;
            } else if (i2 == 3) {
                f5 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f6 = f10;
                f8 = f11;
            }
        }
        float fCos = (f7 / 2.0f) + f2;
        float fSin = (f8 / 2.0f) + f9;
        C0043a c0043a = p1i0Var.f173098Z;
        if (c0043a != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            c0043a.m348b(d, fArr3, fArr4);
            float f12 = fArr3[0];
            float f13 = fArr3[1];
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float fSin2 = (float) (((Math.sin(d3) * d2) + ((double) f12)) - ((double) (f5 / 2.0f)));
            float fCos2 = (float) ((((double) f13) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
            double d4 = f2;
            double d5 = f9;
            f = 2.0f;
            f4 = fCos2;
            fCos = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + ((double) f14));
            fSin = (float) ((Math.sin(d3) * d5) + (((double) f15) - (Math.cos(d3) * d4)));
            f3 = fSin2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + 0.0f;
        fArr[1] = (f6 / f) + f4 + 0.0f;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    /* JADX INFO: renamed from: c */
    public final float m349c() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dMo26896c = f2;
            aqs aqsVar = this.f703f.f173099a;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (p1i0 p1i0Var : this.f718u) {
                aqs aqsVar2 = p1i0Var.f173099a;
                if (aqsVar2 != null) {
                    float f5 = p1i0Var.f173101c;
                    if (f5 < f2) {
                        aqsVar = aqsVar2;
                        f4 = f5;
                    } else if (Float.isNaN(f3)) {
                        f3 = p1i0Var.f173101c;
                    }
                }
            }
            if (aqsVar != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                float f6 = f3 - f4;
                dMo26896c = (((float) aqsVar.mo26896c((f2 - f4) / f6)) * f6) + f4;
            }
            double d3 = dMo26896c;
            this.f707j[0].mo25151r(d3, this.f713p);
            int i2 = i;
            this.f703f.m68817c(d3, this.f712o, this.f713p, fArr, 0);
            if (i2 > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return fHypot;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m350d(float f, long j, View view, iew0 iew0Var) {
        boolean zMo86039d;
        boolean z;
        float f2;
        boolean z2;
        double d;
        float f3;
        float f4;
        float f5;
        float fSin;
        float f6;
        xnc1 xnc1Var = null;
        float fM347a = m347a(f, null);
        int i = this.f694E;
        if (i != -1) {
            float f7 = 1.0f / i;
            float fFloor = ((float) Math.floor(fM347a / f7)) * f7;
            float f8 = (fM347a % f7) / f7;
            if (!Float.isNaN(this.f695F)) {
                f8 = (f8 + this.f695F) % 1.0f;
            }
            Interpolator interpolator = this.f696G;
            fM347a = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + fFloor;
        }
        HashMap map = this.f722y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((mlc1) it.next()).mo51010c(view, fM347a);
            }
        }
        HashMap map2 = this.f721x;
        if (map2 != null) {
            xnc1 xnc1Var2 = null;
            zMo86039d = false;
            for (znc1 znc1Var : map2.values()) {
                if (znc1Var instanceof xnc1) {
                    xnc1Var2 = (xnc1) znc1Var;
                } else {
                    zMo86039d |= znc1Var.mo86039d(fM347a, j, view, iew0Var);
                }
            }
            xnc1Var = xnc1Var2;
        } else {
            zMo86039d = false;
        }
        hkf1[] hkf1VarArr = this.f707j;
        p1i0 p1i0Var = this.f703f;
        if (hkf1VarArr != null) {
            double d2 = fM347a;
            hkf1VarArr[0].mo25151r(d2, this.f713p);
            this.f707j[0].mo25153t(d2, this.f714q);
            ii5 ii5Var = this.f708k;
            if (ii5Var != null) {
                double[] dArr = this.f713p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    ii5Var.mo25151r(d2, dArr);
                    this.f708k.mo25153t(d2, this.f714q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.f697H) {
                z2 = zMo86039d;
                d = d2;
                f3 = 2.0f;
            } else {
                int[] iArr = this.f712o;
                double[] dArr2 = this.f713p;
                f3 = 2.0f;
                double[] dArr3 = this.f714q;
                boolean z3 = this.f701d;
                float f9 = p1i0Var.f173103e;
                float fCos = p1i0Var.f173104f;
                float f10 = p1i0Var.f173105g;
                int i2 = 1;
                float f11 = p1i0Var.f173106h;
                if (iArr.length != 0) {
                    f4 = f10;
                    if (p1i0Var.f173094N0.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        p1i0Var.f173094N0 = new double[i3];
                        p1i0Var.f173095O0 = new double[i3];
                    }
                } else {
                    f4 = f10;
                }
                Arrays.fill(p1i0Var.f173094N0, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = p1i0Var.f173094N0;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    p1i0Var.f173095O0[i5] = dArr3[i4];
                }
                float f12 = Float.NaN;
                float f13 = f2;
                float f14 = f13;
                float f15 = f14;
                float f16 = f15;
                int i6 = 0;
                while (true) {
                    double[] dArr5 = p1i0Var.f173094N0;
                    f5 = f11;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f6 = f9;
                    } else {
                        f6 = f9;
                        float f17 = (float) (Double.isNaN(p1i0Var.f173094N0[i6]) ? 0.0d : p1i0Var.f173094N0[i6] + 0.0d);
                        float f18 = (float) p1i0Var.f173095O0[i6];
                        if (i6 == i2) {
                            f14 = f18;
                            f11 = f5;
                            f9 = f17;
                        } else if (i6 == 2) {
                            f13 = f18;
                            f9 = f6;
                            f11 = f5;
                            fCos = f17;
                        } else if (i6 == 3) {
                            f15 = f18;
                            f9 = f6;
                            f11 = f5;
                            f4 = f17;
                        } else if (i6 == 4) {
                            f16 = f18;
                            f9 = f6;
                            f11 = f17;
                        } else if (i6 == 5) {
                            f9 = f6;
                            f11 = f5;
                            f12 = f17;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f9 = f6;
                    f11 = f5;
                    i6++;
                    i2 = 1;
                }
                float f19 = f9;
                C0043a c0043a = p1i0Var.f173098Z;
                if (c0043a != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    c0043a.m348b(d2, fArr, fArr2);
                    float f20 = fArr[0];
                    float f21 = fArr[1];
                    float f22 = fArr2[0];
                    float f23 = fArr2[1];
                    z2 = zMo86039d;
                    d = d2;
                    double d3 = f19;
                    double d4 = fCos;
                    fSin = (float) (((Math.sin(d4) * d3) + ((double) f20)) - ((double) (f4 / 2.0f)));
                    fCos = (float) ((((double) f21) - (Math.cos(d4) * d3)) - ((double) (f5 / 2.0f)));
                    double d5 = f14;
                    double d6 = f13;
                    float fCos2 = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + ((double) f22));
                    float fSin2 = (float) ((Math.sin(d4) * d3 * d6) + (((double) f23) - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f12)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f12)));
                    }
                } else {
                    fSin = f19;
                    z2 = zMo86039d;
                    d = d2;
                    if (!Float.isNaN(f12)) {
                        view.setRotation(f12 + ((float) Math.toDegrees(Math.atan2((f16 / 2.0f) + f13, (f15 / 2.0f) + f14))) + f2);
                    }
                }
                float f24 = fSin + 0.5f;
                int i7 = (int) f24;
                float f25 = fCos + 0.5f;
                int i8 = (int) f25;
                int i9 = (int) (f24 + f4);
                int i10 = (int) (f25 + f5);
                int i11 = i9 - i7;
                int i12 = i10 - i8;
                if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z3) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                }
                view.layout(i7, i8, i9, i10);
                this.f701d = false;
            }
            if (this.f692C != -1) {
                if (this.f693D == null) {
                    this.f693D = ((View) view.getParent()).findViewById(this.f692C);
                }
                View view2 = this.f693D;
                if (view2 != null) {
                    float bottom = (this.f693D.getBottom() + view2.getTop()) / f3;
                    float right = (this.f693D.getRight() + this.f693D.getLeft()) / f3;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top);
                    }
                }
            }
            HashMap map3 = this.f722y;
            if (map3 != null) {
                for (mlc1 mlc1Var : map3.values()) {
                    if (mlc1Var instanceof klc1) {
                        double[] dArr6 = this.f714q;
                        if (dArr6.length > 1) {
                            view.setRotation(((klc1) mlc1Var).m62203a(fM347a) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (xnc1Var != 0) {
                double[] dArr7 = this.f714q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                xnc1 xnc1Var3 = xnc1Var;
                view.setRotation(xnc1Var3.m96589b(fM347a, j, view, iew0Var) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z = z2 | xnc1Var3.f284475h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                hkf1[] hkf1VarArr2 = this.f707j;
                if (i13 >= hkf1VarArr2.length) {
                    break;
                }
                hkf1 hkf1Var = hkf1VarArr2[i13];
                float[] fArr3 = this.f717t;
                hkf1Var.mo25152s(d, fArr3);
                alf1.m26342y((d6j) p1i0Var.f173092L0.get(this.f715r[i13 - 1]), view, fArr3);
                i13++;
            }
            c1i0 c1i0Var = this.f705h;
            if (c1i0Var.f33135b == 0) {
                if (fM347a <= f2) {
                    view.setVisibility(c1i0Var.f33136c);
                } else {
                    c1i0 c1i0Var2 = this.f706i;
                    if (fM347a >= 1065353216) {
                        view.setVisibility(c1i0Var2.f33136c);
                    } else if (c1i0Var2.f33136c != c1i0Var.f33136c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.f690A != null) {
                int i14 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.f690A;
                    if (i14 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i14].m324g(view, fM347a);
                    i14++;
                }
            }
        } else {
            boolean z4 = zMo86039d;
            float f26 = p1i0Var.f173103e;
            p1i0 p1i0Var2 = this.f704g;
            float fM38555d = edb.m38555d(p1i0Var2.f173103e, f26, fM347a, f26);
            float f27 = p1i0Var.f173104f;
            float fM38555d2 = edb.m38555d(p1i0Var2.f173104f, f27, fM347a, f27);
            float f28 = p1i0Var.f173105g;
            float f29 = p1i0Var2.f173105g;
            float fM38555d3 = edb.m38555d(f29, f28, fM347a, f28);
            float f30 = p1i0Var.f173106h;
            float f31 = p1i0Var2.f173106h;
            float f32 = fM38555d + 0.5f;
            int i15 = (int) f32;
            float f33 = fM38555d2 + 0.5f;
            int i16 = (int) f33;
            int i17 = (int) (f32 + fM38555d3);
            int iM38555d = (int) (f33 + edb.m38555d(f31, f30, fM347a, f30));
            int i18 = i17 - i15;
            int i19 = iM38555d - i16;
            if (f29 != f28 || f31 != f30 || this.f701d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f701d = false;
            }
            view.layout(i15, i16, i17, iM38555d);
            z = z4;
        }
        HashMap map4 = this.f723z;
        if (map4 != null) {
            for (zjc1 zjc1Var : map4.values()) {
                if (zjc1Var instanceof xjc1) {
                    double[] dArr8 = this.f714q;
                    view.setRotation(((xjc1) zjc1Var).m96234a(fM347a) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    zjc1Var.mo85750d(view, fM347a);
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m351e(p1i0 p1i0Var) {
        p1i0Var.m68818d((int) this.f699b.getX(), (int) this.f699b.getY(), this.f699b.getWidth(), this.f699b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:278:0x0828 A[PHI: r1 r11 r12
      0x0828: PHI (r1v67 java.lang.String) = (r1v64 java.lang.String), (r1v65 java.lang.String), (r1v66 java.lang.String), (r1v69 java.lang.String) binds: [B:277:0x0826, B:273:0x07f9, B:268:0x07c7, B:264:0x07b4] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r11v38 java.lang.String) = (r11v35 java.lang.String), (r11v36 java.lang.String), (r11v37 java.lang.String), (r11v40 java.lang.String) binds: [B:277:0x0826, B:273:0x07f9, B:268:0x07c7, B:264:0x07b4] A[DONT_GENERATE, DONT_INLINE]
      0x0828: PHI (r12v25 java.lang.String) = (r12v22 java.lang.String), (r12v23 java.lang.String), (r12v24 java.lang.String), (r12v27 java.lang.String) binds: [B:277:0x0826, B:273:0x07f9, B:268:0x07c7, B:264:0x07b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:383:0x0be1  */
    /* JADX WARN: Code duplicated, block: B:452:0x0d0c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:434:0x0c8f. Please report as an issue. */
    /* JADX INFO: renamed from: g */
    public final void m352g(int i, long j, int i2) {
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        HashSet hashSet2;
        HashSet<String> hashSet3;
        p1i0 p1i0Var;
        Object obj2;
        String str7;
        ArrayList arrayList2;
        p1i0 p1i0Var2;
        Object obj3;
        String str8;
        int i3;
        String str9;
        int i4;
        d6j d6jVar;
        HashSet hashSet4;
        String str10;
        HashMap map;
        Iterator it;
        String str11;
        Object obj4;
        Object obj5;
        byte b;
        byte b2;
        znc1 vnc1Var;
        wnc1 wnc1Var;
        znc1 znc1Var;
        d6j d6jVar2;
        Integer num;
        HashSet hashSet5;
        String str12;
        String str13;
        String str14;
        String str15;
        HashSet hashSet6;
        String str16;
        ArrayList arrayList3;
        Object obj6;
        Iterator it2;
        String str17;
        HashSet hashSet7;
        Object obj7;
        p1i0 p1i0Var3;
        Object obj8;
        p1i0 p1i0Var4;
        byte b3;
        byte b4;
        byte b5;
        ilc1 ilc1Var;
        mlc1 ilc1Var2;
        d6j d6jVar3;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        float fMin;
        float fM38555d;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap map2 = new HashMap();
        int i5 = this.f691B;
        p1i0 p1i0Var5 = this.f703f;
        if (i5 != -1) {
            p1i0Var5.f173108t = i5;
        }
        c1i0 c1i0Var = this.f705h;
        float f = c1i0Var.f33138e;
        c1i0 c1i0Var2 = this.f706i;
        if (c1i0.m31264b(f, c1i0Var2.f33138e)) {
            hashSet9.add("alpha");
        }
        String str23 = "elevation";
        if (c1i0.m31264b(c1i0Var.f33139f, c1i0Var2.f33139f)) {
            hashSet9.add("elevation");
        }
        int i6 = c1i0Var.f33136c;
        int i7 = c1i0Var2.f33136c;
        if (i6 != i7 && c1i0Var.f33135b == 0 && (i6 == 0 || i7 == 0)) {
            hashSet9.add("alpha");
        }
        String str24 = "rotation";
        if (c1i0.m31264b(c1i0Var.f33140g, c1i0Var2.f33140g)) {
            hashSet9.add("rotation");
        }
        String str25 = "transitionPathRotate";
        if (!Float.isNaN(c1i0Var.f33129N0) || !Float.isNaN(c1i0Var2.f33129N0)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(c1i0Var.f33130O0) || !Float.isNaN(c1i0Var2.f33130O0)) {
            hashSet9.add("progress");
        }
        if (c1i0.m31264b(c1i0Var.f33141h, c1i0Var2.f33141h)) {
            hashSet9.add("rotationX");
        }
        if (c1i0.m31264b(c1i0Var.f33134a, c1i0Var2.f33134a)) {
            hashSet9.add("rotationY");
        }
        Object obj9 = "rotationX";
        if (c1i0.m31264b(c1i0Var.f33131X, c1i0Var2.f33131X)) {
            hashSet9.add("transformPivotX");
        }
        if (c1i0.m31264b(c1i0Var.f33132Y, c1i0Var2.f33132Y)) {
            hashSet9.add("transformPivotY");
        }
        String str26 = "scaleX";
        if (c1i0.m31264b(c1i0Var.f33142i, c1i0Var2.f33142i)) {
            hashSet9.add("scaleX");
        }
        Object obj10 = "rotationY";
        String str27 = "scaleY";
        if (c1i0.m31264b(c1i0Var.f33143t, c1i0Var2.f33143t)) {
            hashSet9.add("scaleY");
        }
        Object obj11 = "progress";
        if (c1i0.m31264b(c1i0Var.f33133Z, c1i0Var2.f33133Z)) {
            hashSet9.add("translationX");
        }
        Object obj12 = "translationX";
        String str28 = "translationY";
        if (c1i0.m31264b(c1i0Var.f33127L0, c1i0Var2.f33127L0)) {
            hashSet9.add("translationY");
        }
        if (c1i0.m31264b(c1i0Var.f33128M0, c1i0Var2.f33128M0)) {
            hashSet9.add("translationZ");
        }
        p1i0 p1i0Var6 = this.f704g;
        ArrayList arrayList4 = this.f718u;
        ArrayList<pt60> arrayList5 = this.f720w;
        if (arrayList5 != null) {
            ArrayList arrayList6 = null;
            for (pt60 pt60Var : arrayList5) {
                String str29 = str28;
                if (pt60Var instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) pt60Var;
                    p1i0 p1i0Var7 = new p1i0();
                    str22 = str26;
                    p1i0Var7.f173100b = 0;
                    p1i0Var7.f173107i = Float.NaN;
                    p1i0Var7.f173108t = -1;
                    p1i0Var7.f173096X = -1;
                    p1i0Var7.f173097Y = Float.NaN;
                    p1i0Var7.f173098Z = null;
                    p1i0Var7.f173092L0 = new LinkedHashMap();
                    p1i0Var7.f173093M0 = 0;
                    str18 = str27;
                    p1i0Var7.f173094N0 = new double[18];
                    p1i0Var7.f173095O0 = new double[18];
                    if (p1i0Var5.f173096X != -1) {
                        float f2 = keyPosition.f181053a / 100.0f;
                        p1i0Var7.f173101c = f2;
                        p1i0Var7.f173100b = keyPosition.f588h;
                        p1i0Var7.f173093M0 = keyPosition.f595o;
                        float f3 = Float.isNaN(keyPosition.f589i) ? f2 : keyPosition.f589i;
                        str20 = str24;
                        float f4 = Float.isNaN(keyPosition.f590j) ? f2 : keyPosition.f590j;
                        str19 = str23;
                        float f5 = p1i0Var6.f173105g;
                        float f6 = p1i0Var5.f173105g;
                        float f7 = f5 - f6;
                        float f8 = p1i0Var6.f173106h;
                        float f9 = p1i0Var5.f173106h;
                        p1i0Var7.f173102d = p1i0Var7.f173101c;
                        p1i0Var7.f173105g = (int) ((f7 * f3) + f6);
                        p1i0Var7.f173106h = (int) (((f8 - f9) * f4) + f9);
                        str21 = str25;
                        if (keyPosition.f595o != 2) {
                            float f10 = Float.isNaN(keyPosition.f591k) ? f2 : keyPosition.f591k;
                            float f11 = p1i0Var6.f173103e;
                            float f12 = p1i0Var5.f173103e;
                            p1i0Var7.f173103e = edb.m38555d(f11, f12, f10, f12);
                            if (!Float.isNaN(keyPosition.f592l)) {
                                f2 = keyPosition.f592l;
                            }
                            float f13 = p1i0Var6.f173104f;
                            float f14 = p1i0Var5.f173104f;
                            p1i0Var7.f173104f = edb.m38555d(f13, f14, f2, f14);
                        } else {
                            if (Float.isNaN(keyPosition.f591k)) {
                                float f15 = p1i0Var6.f173103e;
                                float f16 = p1i0Var5.f173103e;
                                fMin = edb.m38555d(f15, f16, f2, f16);
                            } else {
                                fMin = keyPosition.f591k * Math.min(f4, f3);
                            }
                            p1i0Var7.f173103e = fMin;
                            if (Float.isNaN(keyPosition.f592l)) {
                                float f17 = p1i0Var6.f173104f;
                                float f18 = p1i0Var5.f173104f;
                                fM38555d = edb.m38555d(f17, f18, f2, f18);
                            } else {
                                fM38555d = keyPosition.f592l;
                            }
                            p1i0Var7.f173104f = fM38555d;
                        }
                        p1i0Var7.f173096X = p1i0Var5.f173096X;
                        p1i0Var7.f173099a = aqs.m26892e(keyPosition.f586f);
                        p1i0Var7.f173108t = keyPosition.f587g;
                    } else {
                        str19 = str23;
                        str20 = str24;
                        str21 = str25;
                        int i8 = keyPosition.f595o;
                        if (i8 == 1) {
                            float f19 = keyPosition.f181053a / 100.0f;
                            p1i0Var7.f173101c = f19;
                            p1i0Var7.f173100b = keyPosition.f588h;
                            float f20 = Float.isNaN(keyPosition.f589i) ? f19 : keyPosition.f589i;
                            float f21 = Float.isNaN(keyPosition.f590j) ? f19 : keyPosition.f590j;
                            float f22 = p1i0Var6.f173105g - p1i0Var5.f173105g;
                            float f23 = f19;
                            float f24 = p1i0Var6.f173106h - p1i0Var5.f173106h;
                            p1i0Var7.f173102d = p1i0Var7.f173101c;
                            if (!Float.isNaN(keyPosition.f591k)) {
                                f23 = keyPosition.f591k;
                            }
                            float f25 = p1i0Var5.f173103e;
                            float f26 = p1i0Var5.f173105g;
                            float f27 = (f26 / 2.0f) + f25;
                            float f28 = p1i0Var5.f173104f;
                            float f29 = p1i0Var5.f173106h;
                            float f30 = ((p1i0Var6.f173105g / 2.0f) + p1i0Var6.f173103e) - f27;
                            float f31 = ((p1i0Var6.f173106h / 2.0f) + p1i0Var6.f173104f) - ((f29 / 2.0f) + f28);
                            float f32 = f30 * f23;
                            float f33 = f22 * f20;
                            float f34 = f33 / 2.0f;
                            p1i0Var7.f173103e = (int) ((f25 + f32) - f34);
                            float f35 = f23 * f31;
                            float f36 = f24 * f21;
                            float f37 = f36 / 2.0f;
                            p1i0Var7.f173104f = (int) ((f28 + f35) - f37);
                            p1i0Var7.f173105g = (int) (f26 + f33);
                            p1i0Var7.f173106h = (int) (f29 + f36);
                            float f38 = Float.isNaN(keyPosition.f592l) ? 0.0f : keyPosition.f592l;
                            float f39 = (-f31) * f38;
                            float f40 = f30 * f38;
                            p1i0Var7.f173093M0 = 1;
                            float f41 = (int) ((p1i0Var5.f173103e + f32) - f34);
                            float f42 = (int) ((p1i0Var5.f173104f + f35) - f37);
                            p1i0Var7.f173103e = f41 + f39;
                            p1i0Var7.f173104f = f42 + f40;
                            p1i0Var7.f173096X = p1i0Var7.f173096X;
                            p1i0Var7.f173099a = aqs.m26892e(keyPosition.f586f);
                            p1i0Var7.f173108t = keyPosition.f587g;
                        } else if (i8 == 2) {
                            float f43 = keyPosition.f181053a / 100.0f;
                            p1i0Var7.f173101c = f43;
                            p1i0Var7.f173100b = keyPosition.f588h;
                            float f44 = Float.isNaN(keyPosition.f589i) ? f43 : keyPosition.f589i;
                            float f45 = Float.isNaN(keyPosition.f590j) ? f43 : keyPosition.f590j;
                            float f46 = p1i0Var6.f173105g;
                            float f47 = p1i0Var5.f173105g;
                            float f48 = f46 - f47;
                            float f49 = p1i0Var6.f173106h;
                            float f50 = p1i0Var5.f173106h;
                            float f51 = f49 - f50;
                            p1i0Var7.f173102d = p1i0Var7.f173101c;
                            float f52 = p1i0Var5.f173103e;
                            float f53 = (f47 / 2.0f) + f52;
                            float f54 = p1i0Var5.f173104f;
                            float f55 = (f46 / 2.0f) + p1i0Var6.f173103e;
                            float f56 = ((f49 / 2.0f) + p1i0Var6.f173104f) - ((f50 / 2.0f) + f54);
                            float f57 = f48 * f44;
                            p1i0Var7.f173103e = (int) ((((f55 - f53) * f43) + f52) - (f57 / 2.0f));
                            float f58 = f51 * f45;
                            p1i0Var7.f173104f = (int) (((f56 * f43) + f54) - (f58 / 2.0f));
                            p1i0Var7.f173105g = (int) (f47 + f57);
                            p1i0Var7.f173106h = (int) (f50 + f58);
                            p1i0Var7.f173093M0 = 2;
                            if (!Float.isNaN(keyPosition.f591k)) {
                                p1i0Var7.f173103e = (int) (keyPosition.f591k * (i - ((int) p1i0Var7.f173105g)));
                            }
                            if (!Float.isNaN(keyPosition.f592l)) {
                                p1i0Var7.f173104f = (int) (keyPosition.f592l * (i2 - ((int) p1i0Var7.f173106h)));
                            }
                            p1i0Var7.f173096X = p1i0Var7.f173096X;
                            p1i0Var7.f173099a = aqs.m26892e(keyPosition.f586f);
                            p1i0Var7.f173108t = keyPosition.f587g;
                        } else if (i8 != 3) {
                            float f59 = keyPosition.f181053a / 100.0f;
                            p1i0Var7.f173101c = f59;
                            p1i0Var7.f173100b = keyPosition.f588h;
                            float f60 = Float.isNaN(keyPosition.f589i) ? f59 : keyPosition.f589i;
                            float f61 = Float.isNaN(keyPosition.f590j) ? f59 : keyPosition.f590j;
                            float f62 = p1i0Var6.f173105g;
                            float f63 = p1i0Var5.f173105g;
                            float f64 = f62 - f63;
                            float f65 = p1i0Var6.f173106h;
                            float f66 = p1i0Var5.f173106h;
                            float f67 = f65 - f66;
                            p1i0Var7.f173102d = p1i0Var7.f173101c;
                            float f68 = p1i0Var5.f173103e;
                            float f69 = (f63 / 2.0f) + f68;
                            float f70 = p1i0Var5.f173104f;
                            float f71 = ((f62 / 2.0f) + p1i0Var6.f173103e) - f69;
                            float f72 = ((f65 / 2.0f) + p1i0Var6.f173104f) - ((f66 / 2.0f) + f70);
                            float f73 = f64 * f60;
                            float f74 = f73 / 2.0f;
                            p1i0Var7.f173103e = (int) (((f71 * f59) + f68) - f74);
                            float f75 = f67 * f61;
                            float f76 = f75 / 2.0f;
                            p1i0Var7.f173104f = (int) (((f72 * f59) + f70) - f76);
                            p1i0Var7.f173105g = (int) (f63 + f73);
                            p1i0Var7.f173106h = (int) (f66 + f75);
                            float f77 = Float.isNaN(keyPosition.f591k) ? f59 : keyPosition.f591k;
                            float f78 = Float.isNaN(keyPosition.f594n) ? 0.0f : keyPosition.f594n;
                            float f79 = f77;
                            float f80 = Float.isNaN(keyPosition.f592l) ? f59 : keyPosition.f592l;
                            float f81 = Float.isNaN(keyPosition.f593m) ? 0.0f : keyPosition.f593m;
                            p1i0Var7.f173093M0 = 0;
                            p1i0Var7.f173103e = (int) (((f81 * f72) + ((f79 * f71) + p1i0Var5.f173103e)) - f74);
                            p1i0Var7.f173104f = (int) (((f72 * f80) + ((f71 * f78) + p1i0Var5.f173104f)) - f76);
                            p1i0Var7.f173099a = aqs.m26892e(keyPosition.f586f);
                            p1i0Var7.f173108t = keyPosition.f587g;
                        } else {
                            float f82 = keyPosition.f181053a / 100.0f;
                            p1i0Var7.f173101c = f82;
                            p1i0Var7.f173100b = keyPosition.f588h;
                            float f83 = Float.isNaN(keyPosition.f589i) ? f82 : keyPosition.f589i;
                            float f84 = Float.isNaN(keyPosition.f590j) ? f82 : keyPosition.f590j;
                            float f85 = p1i0Var6.f173105g;
                            float f86 = p1i0Var5.f173105g;
                            float f87 = f85 - f86;
                            float f88 = p1i0Var6.f173106h;
                            float f89 = p1i0Var5.f173106h;
                            float f90 = f88 - f89;
                            p1i0Var7.f173102d = p1i0Var7.f173101c;
                            float f91 = p1i0Var5.f173103e;
                            float f92 = (f86 / 2.0f) + f91;
                            float f93 = p1i0Var5.f173104f;
                            float f94 = (f89 / 2.0f) + f93;
                            float f95 = (f85 / 2.0f) + p1i0Var6.f173103e;
                            float f96 = (f88 / 2.0f) + p1i0Var6.f173104f;
                            if (f92 > f95) {
                                f92 = f95;
                                f95 = f92;
                            }
                            if (f94 <= f96) {
                                f94 = f96;
                                f96 = f94;
                            }
                            float f97 = f95 - f92;
                            float f98 = f94 - f96;
                            float f99 = f87 * f83;
                            float f100 = f99 / 2.0f;
                            p1i0Var7.f173103e = (int) (((f97 * f82) + f91) - f100);
                            float f101 = f90 * f84;
                            float f102 = f101 / 2.0f;
                            p1i0Var7.f173104f = (int) (((f98 * f82) + f93) - f102);
                            p1i0Var7.f173105g = (int) (f86 + f99);
                            p1i0Var7.f173106h = (int) (f89 + f101);
                            float f103 = Float.isNaN(keyPosition.f591k) ? f82 : keyPosition.f591k;
                            float f104 = Float.isNaN(keyPosition.f594n) ? 0.0f : keyPosition.f594n;
                            float f105 = f103;
                            float f106 = Float.isNaN(keyPosition.f592l) ? f82 : keyPosition.f592l;
                            float f107 = Float.isNaN(keyPosition.f593m) ? 0.0f : keyPosition.f593m;
                            p1i0Var7.f173093M0 = 0;
                            p1i0Var7.f173103e = (int) (((f107 * f98) + ((f105 * f97) + p1i0Var5.f173103e)) - f100);
                            p1i0Var7.f173104f = (int) (((f98 * f106) + ((f97 * f104) + p1i0Var5.f173104f)) - f102);
                            p1i0Var7.f173099a = aqs.m26892e(keyPosition.f586f);
                            p1i0Var7.f173108t = keyPosition.f587g;
                        }
                    }
                    arrayList4.add((-Collections.binarySearch(arrayList4, p1i0Var7)) - 1, p1i0Var7);
                    int i9 = keyPosition.f596e;
                    if (i9 != -1) {
                        this.f702e = i9;
                    }
                } else {
                    str18 = str27;
                    str19 = str23;
                    str20 = str24;
                    str21 = str25;
                    str22 = str26;
                    if (pt60Var instanceof KeyCycle) {
                        pt60Var.mo318d(hashSet10);
                    } else if (pt60Var instanceof KeyTimeCycle) {
                        pt60Var.mo318d(hashSet8);
                    } else if (pt60Var instanceof KeyTrigger) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        ArrayList arrayList7 = arrayList6;
                        arrayList7.add((KeyTrigger) pt60Var);
                        arrayList6 = arrayList7;
                    } else {
                        pt60Var.mo320f(map2);
                        pt60Var.mo318d(hashSet9);
                    }
                }
                str28 = str29;
                str26 = str22;
                str27 = str18;
                str24 = str20;
                str23 = str19;
                str25 = str21;
            }
            str = str27;
            arrayList = arrayList6;
        } else {
            str = "scaleY";
            arrayList = null;
        }
        String str30 = str23;
        String str31 = str24;
        String str32 = str25;
        String str33 = str28;
        String str34 = str26;
        if (arrayList != null) {
            this.f690A = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        String str35 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            obj = obj10;
            str2 = str33;
            str3 = str;
            str4 = str31;
            str5 = str30;
            str6 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            p1i0Var = p1i0Var6;
            obj2 = obj12;
            str7 = str34;
            arrayList2 = arrayList4;
            p1i0Var2 = p1i0Var5;
            obj3 = obj11;
        } else {
            this.f722y = new HashMap();
            Iterator it3 = hashSet9.iterator();
            while (it3.hasNext()) {
                String str36 = (String) it3.next();
                if (!str36.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (str36.hashCode()) {
                        case -1249320806:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            p1i0Var3 = p1i0Var5;
                            obj8 = obj10;
                            p1i0Var4 = p1i0Var6;
                            obj9 = obj9;
                            b3 = str36.equals(obj9) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            p1i0Var3 = p1i0Var5;
                            obj8 = obj10;
                            if (str36.equals(obj8)) {
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 1;
                            } else {
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1225497657:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            if (str36.equals(obj7)) {
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 2;
                            } else {
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1225497656:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            if (str36.equals(str17)) {
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 3;
                            } else {
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1225497655:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            if (str36.equals("translationZ")) {
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 4;
                            } else {
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -1001078227:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            if (str36.equals(obj6)) {
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 5;
                            } else {
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -908189618:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            if (str36.equals(str16)) {
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 6;
                            } else {
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -908189617:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals(str12)) {
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 7;
                            } else {
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -797520672:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals("waveVariesBy")) {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 8;
                            } else {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -760884510:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals("transformPivotX")) {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 9;
                            } else {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case -760884509:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals("transformPivotY")) {
                                b4 = 10;
                                String str37 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = b4;
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str37;
                            }
                            str12 = str;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            p1i0Var3 = p1i0Var5;
                            obj8 = obj10;
                            p1i0Var4 = p1i0Var6;
                            obj9 = obj9;
                            break;
                        case -40300674:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals(str13)) {
                                b4 = 11;
                                String str38 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = b4;
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str38;
                            }
                            str12 = str;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            p1i0Var3 = p1i0Var5;
                            obj8 = obj10;
                            p1i0Var4 = p1i0Var6;
                            obj9 = obj9;
                            break;
                        case -4379043:
                            str14 = str30;
                            str15 = str32;
                            if (str36.equals(str14)) {
                                str12 = str;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 12;
                                str13 = str31;
                            } else {
                                str12 = str;
                                str13 = str31;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case 37232917:
                            str15 = str32;
                            if (str36.equals(str15)) {
                                str12 = str;
                                str13 = str31;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = 13;
                                str14 = str30;
                            } else {
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                            }
                            break;
                        case 92909918:
                            if (str36.equals("alpha")) {
                                b5 = 14;
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = b5;
                                str15 = str32;
                            }
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            p1i0Var3 = p1i0Var5;
                            obj8 = obj10;
                            p1i0Var4 = p1i0Var6;
                            obj9 = obj9;
                            break;
                        case 156108012:
                            if (str36.equals("waveOffset")) {
                                b5 = 15;
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                hashSet6 = hashSet10;
                                str16 = str34;
                                arrayList3 = arrayList4;
                                obj6 = obj11;
                                it2 = it3;
                                str17 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj12;
                                p1i0Var3 = p1i0Var5;
                                obj8 = obj10;
                                p1i0Var4 = p1i0Var6;
                                obj9 = obj9;
                                b3 = b5;
                                str15 = str32;
                            }
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            p1i0Var3 = p1i0Var5;
                            obj8 = obj10;
                            p1i0Var4 = p1i0Var6;
                            obj9 = obj9;
                            break;
                        default:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            hashSet6 = hashSet10;
                            str16 = str34;
                            arrayList3 = arrayList4;
                            obj6 = obj11;
                            it2 = it3;
                            str17 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj12;
                            p1i0Var3 = p1i0Var5;
                            obj8 = obj10;
                            p1i0Var4 = p1i0Var6;
                            obj9 = obj9;
                            break;
                    }
                    switch (b3) {
                        case 0:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(5);
                            break;
                        case 1:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(6);
                            break;
                        case 2:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(9);
                            break;
                        case 3:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(10);
                            break;
                        case 4:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(11);
                            break;
                        case 5:
                            obj8 = obj8;
                            obj9 = obj9;
                            llc1 llc1Var = new llc1();
                            llc1Var.f134617f = false;
                            ilc1Var2 = llc1Var;
                            break;
                        case 6:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(7);
                            break;
                        case 7:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(8);
                            break;
                        case 8:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(0);
                            break;
                        case 9:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(2);
                            break;
                        case 10:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(3);
                            break;
                        case 11:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(4);
                            break;
                        case 12:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new ilc1(1);
                            break;
                        case 13:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = new klc1();
                            break;
                        case 14:
                            ilc1Var = new ilc1(0);
                            ilc1Var2 = ilc1Var;
                            break;
                        case 15:
                            ilc1Var = new ilc1(0);
                            ilc1Var2 = ilc1Var;
                            break;
                        default:
                            obj8 = obj8;
                            obj9 = obj9;
                            ilc1Var2 = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str36.split(",")[1];
                    for (pt60 pt60Var2 : arrayList5) {
                        HashSet hashSet11 = hashSet8;
                        HashMap map3 = pt60Var2.f181056d;
                        if (map3 != null && (d6jVar3 = (d6j) map3.get(str39)) != null) {
                            sparseArray.append(pt60Var2.f181053a, d6jVar3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    jlc1 jlc1Var = new jlc1();
                    String str40 = str36.split(",")[1];
                    jlc1Var.f113581f = sparseArray;
                    obj8 = obj10;
                    str12 = str;
                    str13 = str31;
                    str14 = str30;
                    hashSet6 = hashSet10;
                    p1i0Var4 = p1i0Var6;
                    str16 = str34;
                    arrayList3 = arrayList4;
                    obj6 = obj11;
                    it2 = it3;
                    str17 = str33;
                    hashSet7 = hashSet9;
                    obj7 = obj12;
                    p1i0Var3 = p1i0Var5;
                    ilc1Var2 = jlc1Var;
                    str15 = str32;
                }
                if (ilc1Var2 != null) {
                    ilc1Var2.f144815e = str36;
                    this.f722y.put(str36, ilc1Var2);
                }
                str32 = str15;
                str30 = str14;
                str31 = str13;
                p1i0Var6 = p1i0Var4;
                p1i0Var5 = p1i0Var3;
                obj10 = obj8;
                hashSet8 = hashSet5;
                obj12 = obj7;
                hashSet9 = hashSet7;
                str33 = str17;
                it3 = it2;
                obj11 = obj6;
                arrayList4 = arrayList3;
                str34 = str16;
                hashSet10 = hashSet6;
                str = str12;
            }
            hashSet = hashSet8;
            obj = obj10;
            str2 = str33;
            str3 = str;
            str4 = str31;
            str5 = str30;
            str6 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            p1i0Var = p1i0Var6;
            obj2 = obj12;
            str7 = str34;
            arrayList2 = arrayList4;
            p1i0Var2 = p1i0Var5;
            obj3 = obj11;
            if (arrayList5 != null) {
                for (pt60 pt60Var3 : arrayList5) {
                    if (pt60Var3 instanceof KeyAttributes) {
                        pt60Var3.mo316a(this.f722y);
                    }
                }
            }
            c1i0Var.m31265a(this.f722y, 0);
            c1i0Var2.m31265a(this.f722y, 100);
            Iterator it4 = this.f722y.keySet().iterator();
            while (it4.hasNext()) {
                String str41 = (String) it4.next();
                int iIntValue = (!map2.containsKey(str41) || (num = (Integer) map2.get(str41)) == null) ? 0 : num.intValue();
                Iterator it5 = it4;
                mlc1 mlc1Var = (mlc1) this.f722y.get(str41);
                if (mlc1Var != null) {
                    mlc1Var.mo53672d(iIntValue);
                }
                it4 = it5;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
        } else {
            if (this.f721x == null) {
                this.f721x = new HashMap();
            }
            Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String str42 = (String) it6.next();
                if (!this.f721x.containsKey(str42)) {
                    if (str42.startsWith(str35)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it6;
                        String str43 = str42.split(",")[1];
                        for (pt60 pt60Var4 : arrayList5) {
                            String str44 = str35;
                            HashMap map4 = map2;
                            HashMap map5 = pt60Var4.f181056d;
                            if (map5 != null && (d6jVar2 = (d6j) map5.get(str43)) != null) {
                                sparseArray2.append(pt60Var4.f181053a, d6jVar2);
                            }
                            map2 = map4;
                            str35 = str44;
                        }
                        map = map2;
                        str11 = str35;
                        wnc1 wnc1Var2 = new wnc1();
                        wnc1Var2.f253152m = new SparseArray();
                        wnc1Var2.f253150k = str42.split(",")[1];
                        wnc1Var2.f253151l = sparseArray2;
                        wnc1Var = wnc1Var2;
                        obj4 = obj9;
                        obj5 = obj;
                    } else {
                        map = map2;
                        it = it6;
                        str11 = str35;
                        switch (str42.hashCode()) {
                            case -1249320806:
                                obj4 = obj9;
                                obj5 = obj;
                                b = str42.equals(obj4) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj5 = obj;
                                if (str42.equals(obj5)) {
                                    obj4 = obj9;
                                    b = 1;
                                } else {
                                    obj4 = obj9;
                                }
                                break;
                            case -1225497657:
                                if (str42.equals(obj2)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 2;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497656:
                                if (str42.equals(str2)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 3;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497655:
                                if (str42.equals("translationZ")) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 4;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -1001078227:
                                if (str42.equals(obj3)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 5;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -908189618:
                                if (str42.equals(str7)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 6;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -908189617:
                                if (str42.equals(str3)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 7;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -40300674:
                                if (str42.equals(str4)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 8;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case -4379043:
                                if (str42.equals(str5)) {
                                    obj4 = obj9;
                                    obj5 = obj;
                                    b = 9;
                                } else {
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                break;
                            case 37232917:
                                if (str42.equals(str6)) {
                                    b2 = 10;
                                    b = b2;
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                obj4 = obj9;
                                obj5 = obj;
                                break;
                            case 92909918:
                                if (str42.equals("alpha")) {
                                    b2 = 11;
                                    b = b2;
                                    obj4 = obj9;
                                    obj5 = obj;
                                }
                                obj4 = obj9;
                                obj5 = obj;
                                break;
                            default:
                                obj4 = obj9;
                                obj5 = obj;
                                break;
                        }
                        switch (b) {
                            case 0:
                                vnc1Var = new vnc1(3);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 1:
                                vnc1Var = new vnc1(4);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 2:
                                vnc1Var = new vnc1(7);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 3:
                                vnc1Var = new vnc1(8);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 4:
                                vnc1Var = new vnc1(9);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 5:
                                ync1 ync1Var = new ync1();
                                ync1Var.f274434k = false;
                                vnc1Var = ync1Var;
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 6:
                                vnc1Var = new vnc1(5);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 7:
                                vnc1Var = new vnc1(6);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 8:
                                vnc1Var = new vnc1(2);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 9:
                                vnc1Var = new vnc1(1);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 10:
                                vnc1Var = new xnc1();
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            case 11:
                                vnc1Var = new vnc1(0);
                                str6 = str6;
                                obj2 = obj2;
                                vnc1Var.f284476i = j;
                                znc1Var = vnc1Var;
                                break;
                            default:
                                wnc1Var = null;
                                break;
                        }
                        if (znc1Var != null) {
                            znc1Var.f284473f = str42;
                            this.f721x.put(str42, znc1Var);
                        }
                        obj9 = obj4;
                        obj = obj5;
                        obj2 = obj2;
                        it6 = it;
                        map2 = map;
                        str35 = str11;
                        str6 = str6;
                    }
                    znc1Var = wnc1Var;
                    if (znc1Var != null) {
                        znc1Var.f284473f = str42;
                        this.f721x.put(str42, znc1Var);
                    }
                    obj9 = obj4;
                    obj = obj5;
                    obj2 = obj2;
                    it6 = it;
                    map2 = map;
                    str35 = str11;
                    str6 = str6;
                }
            }
            HashMap map6 = map2;
            str8 = str35;
            if (arrayList5 != null) {
                for (pt60 pt60Var5 : arrayList5) {
                    if (pt60Var5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) pt60Var5).m322g(this.f721x);
                    }
                }
            }
            for (String str45 : this.f721x.keySet()) {
                HashMap map7 = map6;
                ((znc1) this.f721x.get(str45)).mo88594e(map7.containsKey(str45) ? ((Integer) map7.get(str45)).intValue() : 0);
                map6 = map7;
            }
        }
        int size = arrayList2.size();
        int i10 = size + 2;
        p1i0[] p1i0VarArr = new p1i0[i10];
        p1i0VarArr[0] = p1i0Var2;
        p1i0VarArr[size + 1] = p1i0Var;
        if (arrayList2.size() > 0 && this.f702e == -1) {
            this.f702e = 0;
        }
        Iterator it7 = arrayList2.iterator();
        int i11 = 1;
        while (it7.hasNext()) {
            p1i0VarArr[i11] = (p1i0) it7.next();
            i11++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str46 : p1i0Var.f173092L0.keySet()) {
            p1i0 p1i0Var8 = p1i0Var2;
            if (p1i0Var8.f173092L0.containsKey(str46)) {
                str10 = str8;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str10 + str46)) {
                    hashSet12.add(str46);
                }
            } else {
                hashSet4 = hashSet2;
                str10 = str8;
            }
            p1i0Var2 = p1i0Var8;
            str8 = str10;
            hashSet2 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.f715r = strArr;
        this.f716s = new int[strArr.length];
        int i12 = 0;
        while (true) {
            String[] strArr2 = this.f715r;
            if (i12 < strArr2.length) {
                String str47 = strArr2[i12];
                this.f716s[i12] = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    if (p1i0VarArr[i13].f173092L0.containsKey(str47) && (d6jVar = (d6j) p1i0VarArr[i13].f173092L0.get(str47)) != null) {
                        int[] iArr = this.f716s;
                        iArr[i12] = d6jVar.m35120d() + iArr[i12];
                        break;
                    }
                }
                i12++;
            } else {
                boolean z = p1i0VarArr[0].f173108t != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i14 = 1; i14 < i10; i14++) {
                    p1i0 p1i0Var9 = p1i0VarArr[i14];
                    p1i0 p1i0Var10 = p1i0VarArr[i14 - 1];
                    boolean zM68814b = p1i0.m68814b(p1i0Var9.f173103e, p1i0Var10.f173103e);
                    boolean zM68814b2 = p1i0.m68814b(p1i0Var9.f173104f, p1i0Var10.f173104f);
                    zArr[0] = zArr[0] | p1i0.m68814b(p1i0Var9.f173102d, p1i0Var10.f173102d);
                    boolean z2 = zM68814b | zM68814b2 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | p1i0.m68814b(p1i0Var9.f173105g, p1i0Var10.f173105g);
                    zArr[4] = p1i0.m68814b(p1i0Var9.f173106h, p1i0Var10.f173106h) | zArr[4];
                }
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        i15++;
                    }
                }
                this.f712o = new int[i15];
                int iMax = Math.max(2, i15);
                this.f713p = new double[iMax];
                this.f714q = new double[iMax];
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        this.f712o[i17] = i18;
                        i17++;
                    }
                }
                int[] iArr2 = {i10, this.f712o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i10];
                int i19 = 0;
                while (i19 < i10) {
                    p1i0 p1i0Var11 = p1i0VarArr[i19];
                    double[] dArr3 = dArr[i19];
                    int[] iArr3 = this.f712o;
                    p1i0[] p1i0VarArr2 = p1i0VarArr;
                    int i20 = 6;
                    float[] fArr = {p1i0Var11.f173102d, p1i0Var11.f173103e, p1i0Var11.f173104f, p1i0Var11.f173105g, p1i0Var11.f173106h, p1i0Var11.f173107i};
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < iArr3.length) {
                        int i23 = iArr3[i21];
                        if (i23 < i20) {
                            dArr3[i22] = fArr[i23];
                            i22++;
                        }
                        i21++;
                        i20 = 6;
                    }
                    dArr2[i19] = p1i0VarArr2[i19].f173101c;
                    i19++;
                    p1i0VarArr = p1i0VarArr2;
                }
                p1i0[] p1i0VarArr3 = p1i0VarArr;
                int i24 = 0;
                while (true) {
                    int[] iArr4 = this.f712o;
                    if (i24 < iArr4.length) {
                        if (iArr4[i24] < 6) {
                            String strM36616p = dq60.m36616p(p1i0.f173091P0[this.f712o[i24]], " [", new StringBuilder());
                            for (int i25 = 0; i25 < i10; i25++) {
                                StringBuilder sbM36620t = dq60.m36620t(strM36616p);
                                sbM36620t.append(dArr[i25][i24]);
                                strM36616p = sbM36620t.toString();
                            }
                        }
                        i24++;
                    } else {
                        this.f707j = new hkf1[this.f715r.length + 1];
                        int i26 = 0;
                        while (true) {
                            String[] strArr3 = this.f715r;
                            if (i26 >= strArr3.length) {
                                this.f707j[0] = hkf1.m47806n(this.f702e, dArr2, dArr);
                                if (p1i0VarArr3[0].f173108t != -1) {
                                    int[] iArr5 = new int[i10];
                                    double[] dArr4 = new double[i10];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i10, 2);
                                    for (int i27 = 0; i27 < i10; i27++) {
                                        p1i0 p1i0Var12 = p1i0VarArr3[i27];
                                        iArr5[i27] = p1i0Var12.f173108t;
                                        dArr4[i27] = p1i0Var12.f173101c;
                                        double[] dArr6 = dArr5[i27];
                                        dArr6[0] = p1i0Var12.f173103e;
                                        dArr6[1] = p1i0Var12.f173104f;
                                    }
                                    this.f708k = new ii5(iArr5, dArr4, dArr5);
                                }
                                this.f723z = new HashMap();
                                if (arrayList5 != null) {
                                    float fM349c = Float.NaN;
                                    for (String str48 : hashSet3) {
                                        zjc1 zjc1VarM96233b = zjc1.m96233b(str48);
                                        if (zjc1VarM96233b != null) {
                                            if (zjc1VarM96233b.f283420e == 1 && Float.isNaN(fM349c)) {
                                                fM349c = m349c();
                                            }
                                            zjc1VarM96233b.f283417b = str48;
                                            this.f723z.put(str48, zjc1VarM96233b);
                                        }
                                    }
                                    for (pt60 pt60Var6 : arrayList5) {
                                        if (pt60Var6 instanceof KeyCycle) {
                                            ((KeyCycle) pt60Var6).m321g(this.f723z);
                                        }
                                    }
                                    Iterator it8 = this.f723z.values().iterator();
                                    while (it8.hasNext()) {
                                        ((zjc1) it8.next()).m96235e();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str49 = strArr3[i26];
                            int i28 = 0;
                            int i29 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i28 < i10) {
                                if (p1i0VarArr3[i28].f173092L0.containsKey(str49)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i10];
                                        d6j d6jVar4 = (d6j) p1i0VarArr3[i28].f173092L0.get(str49);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i10, d6jVar4 == null ? 0 : d6jVar4.m35120d());
                                    }
                                    p1i0 p1i0Var13 = p1i0VarArr3[i28];
                                    dArr7[i29] = p1i0Var13.f173101c;
                                    double[] dArr9 = dArr8[i29];
                                    d6j d6jVar5 = (d6j) p1i0Var13.f173092L0.get(str49);
                                    if (d6jVar5 != null) {
                                        if (d6jVar5.m35120d() == 1) {
                                            dArr9[0] = d6jVar5.m35118b();
                                        } else {
                                            int iM35120d = d6jVar5.m35120d();
                                            float[] fArr2 = new float[iM35120d];
                                            d6jVar5.m35119c(fArr2);
                                            int i30 = 0;
                                            int i31 = 0;
                                            while (i30 < iM35120d) {
                                                dArr9[i31] = fArr2[i30];
                                                i30++;
                                                str49 = str49;
                                                i31++;
                                                i26 = i26;
                                                i28 = i28;
                                            }
                                        }
                                    }
                                    i3 = i26;
                                    str9 = str49;
                                    i4 = i28;
                                    i29++;
                                } else {
                                    i3 = i26;
                                    str9 = str49;
                                    i4 = i28;
                                }
                                i28 = i4 + 1;
                                str49 = str9;
                                i26 = i3;
                            }
                            int i32 = i26;
                            double[] dArrCopyOf = Arrays.copyOf(dArr7, i29);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i29);
                            int i33 = i32 + 1;
                            this.f707j[i33] = hkf1.m47806n(this.f702e, dArrCopyOf, dArr10);
                            i26 = i33;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        p1i0 p1i0Var = this.f703f;
        sb.append(p1i0Var.f173103e);
        sb.append(" y: ");
        sb.append(p1i0Var.f173104f);
        sb.append(" end: x: ");
        p1i0 p1i0Var2 = this.f704g;
        sb.append(p1i0Var2.f173103e);
        sb.append(" y: ");
        sb.append(p1i0Var2.f173104f);
        return sb.toString();
    }
}
