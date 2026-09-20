package p204p;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class h591 {

    /* JADX INFO: renamed from: a */
    public final Matrix f87774a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f87775b;

    /* JADX INFO: renamed from: c */
    public final Matrix f87776c;

    /* JADX INFO: renamed from: d */
    public final Matrix f87777d;

    /* JADX INFO: renamed from: e */
    public final float[] f87778e;

    /* JADX INFO: renamed from: f */
    public mz8 f87779f;

    /* JADX INFO: renamed from: g */
    public mz8 f87780g;

    /* JADX INFO: renamed from: h */
    public mz8 f87781h;

    /* JADX INFO: renamed from: i */
    public mz8 f87782i;

    /* JADX INFO: renamed from: j */
    public mz8 f87783j;

    /* JADX INFO: renamed from: k */
    public whz f87784k;

    /* JADX INFO: renamed from: l */
    public whz f87785l;

    /* JADX INFO: renamed from: m */
    public mz8 f87786m;

    /* JADX INFO: renamed from: n */
    public mz8 f87787n;

    /* JADX INFO: renamed from: o */
    public final boolean f87788o;

    public h591(ow4 ow4Var) {
        jw4 jw4Var = ow4Var.f170629a;
        this.f87779f = jw4Var == null ? null : jw4Var.mo48914j0();
        qw4 qw4Var = ow4Var.f170630b;
        this.f87780g = qw4Var == null ? null : qw4Var.mo48914j0();
        hw4 hw4Var = ow4Var.f170631c;
        this.f87781h = hw4Var == null ? null : hw4Var.mo48914j0();
        iw4 iw4Var = ow4Var.f170632d;
        this.f87782i = iw4Var == null ? null : iw4Var.mo48914j0();
        iw4 iw4Var2 = ow4Var.f170634f;
        whz whzVar = iw4Var2 == null ? null : (whz) iw4Var2.mo48914j0();
        this.f87784k = whzVar;
        this.f87788o = ow4Var.f170638j;
        if (whzVar != null) {
            this.f87775b = new Matrix();
            this.f87776c = new Matrix();
            this.f87777d = new Matrix();
            this.f87778e = new float[9];
        } else {
            this.f87775b = null;
            this.f87776c = null;
            this.f87777d = null;
            this.f87778e = null;
        }
        iw4 iw4Var3 = ow4Var.f170635g;
        this.f87785l = iw4Var3 == null ? null : (whz) iw4Var3.mo48914j0();
        hw4 hw4Var2 = ow4Var.f170633e;
        if (hw4Var2 != null) {
            this.f87783j = hw4Var2.mo48914j0();
        }
        iw4 iw4Var4 = ow4Var.f170636h;
        if (iw4Var4 != null) {
            this.f87786m = iw4Var4.mo48914j0();
        } else {
            this.f87786m = null;
        }
        iw4 iw4Var5 = ow4Var.f170637i;
        if (iw4Var5 != null) {
            this.f87787n = iw4Var5.mo48914j0();
        } else {
            this.f87787n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m46673a(oz8 oz8Var) {
        oz8Var.m68627e(this.f87783j);
        oz8Var.m68627e(this.f87786m);
        oz8Var.m68627e(this.f87787n);
        oz8Var.m68627e(this.f87779f);
        oz8Var.m68627e(this.f87780g);
        oz8Var.m68627e(this.f87781h);
        oz8Var.m68627e(this.f87782i);
        oz8Var.m68627e(this.f87784k);
        oz8Var.m68627e(this.f87785l);
    }

    /* JADX INFO: renamed from: b */
    public final void m46674b(jz8 jz8Var) {
        mz8 mz8Var = this.f87783j;
        if (mz8Var != null) {
            mz8Var.m63235a(jz8Var);
        }
        mz8 mz8Var2 = this.f87786m;
        if (mz8Var2 != null) {
            mz8Var2.m63235a(jz8Var);
        }
        mz8 mz8Var3 = this.f87787n;
        if (mz8Var3 != null) {
            mz8Var3.m63235a(jz8Var);
        }
        mz8 mz8Var4 = this.f87779f;
        if (mz8Var4 != null) {
            mz8Var4.m63235a(jz8Var);
        }
        mz8 mz8Var5 = this.f87780g;
        if (mz8Var5 != null) {
            mz8Var5.m63235a(jz8Var);
        }
        mz8 mz8Var6 = this.f87781h;
        if (mz8Var6 != null) {
            mz8Var6.m63235a(jz8Var);
        }
        mz8 mz8Var7 = this.f87782i;
        if (mz8Var7 != null) {
            mz8Var7.m63235a(jz8Var);
        }
        whz whzVar = this.f87784k;
        if (whzVar != null) {
            whzVar.m63235a(jz8Var);
        }
        whz whzVar2 = this.f87785l;
        if (whzVar2 != null) {
            whzVar2.m63235a(jz8Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m46675c(Object obj, xh70 xh70Var) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == bab0.f25146a) {
            mz8 mz8Var = this.f87779f;
            if (mz8Var == null) {
                this.f87779f = new h3b1(new PointF(), xh70Var);
                return true;
            }
            mz8Var.m63238j(xh70Var);
            return true;
        }
        if (obj == bab0.f25147b) {
            mz8 mz8Var2 = this.f87780g;
            if (mz8Var2 == null) {
                this.f87780g = new h3b1(new PointF(), xh70Var);
                return true;
            }
            mz8Var2.m63238j(xh70Var);
            return true;
        }
        if (obj == bab0.f25148c) {
            mz8 mz8Var3 = this.f87780g;
            if (mz8Var3 instanceof x641) {
                ((x641) mz8Var3).m90074l(xh70Var);
                return true;
            }
        }
        if (obj == bab0.f25149d) {
            mz8 mz8Var4 = this.f87780g;
            if (mz8Var4 instanceof x641) {
                ((x641) mz8Var4).m90075m(xh70Var);
                return true;
            }
        }
        if (obj == bab0.f25155j) {
            mz8 mz8Var5 = this.f87781h;
            if (mz8Var5 == null) {
                this.f87781h = new h3b1(new eby0(), xh70Var);
                return true;
            }
            mz8Var5.m63238j(xh70Var);
            return true;
        }
        if (obj == bab0.f25156k) {
            mz8 mz8Var6 = this.f87782i;
            if (mz8Var6 == null) {
                this.f87782i = new h3b1(fValueOf2, xh70Var);
                return true;
            }
            mz8Var6.m63238j(xh70Var);
            return true;
        }
        if (obj == 3) {
            mz8 mz8Var7 = this.f87783j;
            if (mz8Var7 == null) {
                this.f87783j = new h3b1(100, xh70Var);
                return true;
            }
            mz8Var7.m63238j(xh70Var);
            return true;
        }
        if (obj == bab0.f25169x) {
            mz8 mz8Var8 = this.f87786m;
            if (mz8Var8 == null) {
                this.f87786m = new h3b1(fValueOf, xh70Var);
                return true;
            }
            mz8Var8.m63238j(xh70Var);
            return true;
        }
        if (obj == bab0.f25170y) {
            mz8 mz8Var9 = this.f87787n;
            if (mz8Var9 == null) {
                this.f87787n = new h3b1(fValueOf, xh70Var);
                return true;
            }
            mz8Var9.m63238j(xh70Var);
            return true;
        }
        if (obj == bab0.f25157l) {
            if (this.f87784k == null) {
                this.f87784k = new whz(Collections.singletonList(new wz60(fValueOf2)));
            }
            this.f87784k.m63238j(xh70Var);
            return true;
        }
        if (obj != bab0.f25158m) {
            return false;
        }
        if (this.f87785l == null) {
            this.f87785l = new whz(Collections.singletonList(new wz60(fValueOf2)));
        }
        this.f87785l.m63238j(xh70Var);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m46676d() {
        for (int i = 0; i < 9; i++) {
            this.f87778e[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Matrix m46677e() {
        PointF pointF;
        eby0 eby0Var;
        PointF pointF2;
        Matrix matrix = this.f87774a;
        matrix.reset();
        mz8 mz8Var = this.f87780g;
        if (mz8Var != null && (pointF2 = (PointF) mz8Var.mo46515e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.f87788o) {
            mz8 mz8Var2 = this.f87782i;
            if (mz8Var2 != null) {
                float fFloatValue = mz8Var2 instanceof h3b1 ? ((Float) mz8Var2.mo46515e()).floatValue() : ((whz) mz8Var2).m88179k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (mz8Var != null) {
            float f2 = mz8Var.f148645d;
            PointF pointF3 = (PointF) mz8Var.mo46515e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            mz8Var.mo46517i(1.0E-4f + f2);
            PointF pointF4 = (PointF) mz8Var.mo46515e();
            mz8Var.mo46517i(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        whz whzVar = this.f87784k;
        if (whzVar != null) {
            whz whzVar2 = this.f87785l;
            float fCos = whzVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-whzVar2.m88179k()) + 90.0f));
            whz whzVar3 = this.f87785l;
            float fSin = whzVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-whzVar3.m88179k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(whzVar.m88179k()));
            m46676d();
            float[] fArr = this.f87778e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f87775b;
            matrix2.setValues(fArr);
            m46676d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f87776c;
            matrix3.setValues(fArr);
            m46676d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f87777d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        mz8 mz8Var3 = this.f87781h;
        if (mz8Var3 != null && (eby0Var = (eby0) mz8Var3.mo46515e()) != null) {
            float f6 = eby0Var.f58158a;
            if (f6 != 1.0f || eby0Var.f58159b != 1.0f) {
                matrix.preScale(f6, eby0Var.f58159b);
            }
        }
        mz8 mz8Var4 = this.f87779f;
        if (mz8Var4 != null && (pointF = (PointF) mz8Var4.mo46515e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix;
    }

    /* JADX INFO: renamed from: f */
    public final Matrix m46678f(float f) {
        mz8 mz8Var = this.f87780g;
        PointF pointF = mz8Var == null ? null : (PointF) mz8Var.mo46515e();
        mz8 mz8Var2 = this.f87781h;
        eby0 eby0Var = mz8Var2 == null ? null : (eby0) mz8Var2.mo46515e();
        Matrix matrix = this.f87774a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (eby0Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(eby0Var.f58158a, d), (float) Math.pow(eby0Var.f58159b, d));
        }
        mz8 mz8Var3 = this.f87782i;
        if (mz8Var3 != null) {
            float fFloatValue = ((Float) mz8Var3.mo46515e()).floatValue();
            mz8 mz8Var4 = this.f87779f;
            PointF pointF2 = mz8Var4 != null ? (PointF) mz8Var4.mo46515e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
