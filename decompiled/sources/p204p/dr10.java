package p204p;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public final class dr10 extends b19 {

    /* JADX INFO: renamed from: A */
    public final d6q0 f52136A;

    /* JADX INFO: renamed from: B */
    public h3b1 f52137B;

    /* JADX INFO: renamed from: r */
    public final String f52138r;

    /* JADX INFO: renamed from: s */
    public final boolean f52139s;

    /* JADX INFO: renamed from: t */
    public final w2b0 f52140t;

    /* JADX INFO: renamed from: u */
    public final w2b0 f52141u;

    /* JADX INFO: renamed from: v */
    public final RectF f52142v;

    /* JADX INFO: renamed from: w */
    public final int f52143w;

    /* JADX INFO: renamed from: x */
    public final int f52144x;

    /* JADX INFO: renamed from: y */
    public final mq10 f52145y;

    /* JADX INFO: renamed from: z */
    public final d6q0 f52146z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dr10(r9b0 r9b0Var, oz8 oz8Var, cr10 cr10Var) {
        Paint.Join join;
        Paint.Join join2;
        int iM38547C = edb.m38547C(cr10Var.f41149h);
        Paint.Cap cap = iM38547C != 0 ? iM38547C != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iM38547C2 = edb.m38547C(cr10Var.f41150i);
        if (iM38547C2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iM38547C2 != 1) {
                if (iM38547C2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(r9b0Var, oz8Var, cap, join2, cr10Var.f41151j, cr10Var.f41145d, cr10Var.f41148g, cr10Var.f41152k, cr10Var.f41153l);
                this.f52140t = new w2b0((Object) null);
                this.f52141u = new w2b0((Object) null);
                this.f52142v = new RectF();
                this.f52138r = cr10Var.f41142a;
                this.f52143w = cr10Var.f41143b;
                this.f52139s = cr10Var.f41154m;
                this.f52144x = (int) (r9b0Var.f196988a.m82567b() / 32.0f);
                mz8 mz8VarMo48914j0 = cr10Var.f41144c.mo48914j0();
                this.f52145y = (mq10) mz8VarMo48914j0;
                mz8VarMo48914j0.m63235a(this);
                oz8Var.m68627e(mz8VarMo48914j0);
                mz8 mz8VarMo48914j1 = cr10Var.f41146e.mo48914j0();
                this.f52146z = (d6q0) mz8VarMo48914j1;
                mz8VarMo48914j1.m63235a(this);
                oz8Var.m68627e(mz8VarMo48914j1);
                mz8 mz8VarMo48914j2 = cr10Var.f41147f.mo48914j0();
                this.f52136A = (d6q0) mz8VarMo48914j2;
                mz8VarMo48914j2.m63235a(this);
                oz8Var.m68627e(mz8VarMo48914j2);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(r9b0Var, oz8Var, cap, join2, cr10Var.f41151j, cr10Var.f41145d, cr10Var.f41148g, cr10Var.f41152k, cr10Var.f41153l);
        this.f52140t = new w2b0((Object) null);
        this.f52141u = new w2b0((Object) null);
        this.f52142v = new RectF();
        this.f52138r = cr10Var.f41142a;
        this.f52143w = cr10Var.f41143b;
        this.f52139s = cr10Var.f41154m;
        this.f52144x = (int) (r9b0Var.f196988a.m82567b() / 32.0f);
        mz8 mz8VarMo48914j3 = cr10Var.f41144c.mo48914j0();
        this.f52145y = (mq10) mz8VarMo48914j3;
        mz8VarMo48914j3.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j3);
        mz8 mz8VarMo48914j4 = cr10Var.f41146e.mo48914j0();
        this.f52146z = (d6q0) mz8VarMo48914j4;
        mz8VarMo48914j4.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j4);
        mz8 mz8VarMo48914j5 = cr10Var.f41147f.mo48914j0();
        this.f52136A = (d6q0) mz8VarMo48914j5;
        mz8VarMo48914j5.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j5);
    }

    @Override // p204p.b19, p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        super.mo25332c(obj, xh70Var);
        if (obj == bab0.f25141G) {
            h3b1 h3b1Var = this.f52137B;
            oz8 oz8Var = this.f22251f;
            if (h3b1Var != null) {
                oz8Var.m68632o(h3b1Var);
            }
            if (xh70Var == null) {
                this.f52137B = null;
                return;
            }
            h3b1 h3b1Var2 = new h3b1(null, xh70Var);
            this.f52137B = h3b1Var2;
            h3b1Var2.m63235a(this);
            oz8Var.m68627e(this.f52137B);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m36692e(int[] iArr) {
        h3b1 h3b1Var = this.f52137B;
        if (h3b1Var != null) {
            Integer[] numArr = (Integer[]) h3b1Var.mo46515e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // p204p.b19, p204p.sgs
    /* JADX INFO: renamed from: g */
    public final void mo27898g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.f52139s) {
            return;
        }
        mo25333d(this.f52142v, matrix, false);
        int i2 = this.f52143w;
        mq10 mq10Var = this.f52145y;
        d6q0 d6q0Var = this.f52136A;
        d6q0 d6q0Var2 = this.f52146z;
        if (i2 == 1) {
            long jM36693h = m36693h();
            w2b0 w2b0Var = this.f52140t;
            shader = (LinearGradient) w2b0Var.m87067c(jM36693h);
            if (shader == null) {
                PointF pointF = (PointF) d6q0Var2.mo46515e();
                PointF pointF2 = (PointF) d6q0Var.mo46515e();
                lq10 lq10Var = (lq10) mq10Var.mo46515e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m36692e(lq10Var.f135928b), lq10Var.f135927a, Shader.TileMode.CLAMP);
                w2b0Var.m87070g(jM36693h, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jM36693h2 = m36693h();
            w2b0 w2b0Var2 = this.f52141u;
            shader = (RadialGradient) w2b0Var2.m87067c(jM36693h2);
            if (shader == null) {
                PointF pointF3 = (PointF) d6q0Var2.mo46515e();
                PointF pointF4 = (PointF) d6q0Var.mo46515e();
                lq10 lq10Var2 = (lq10) mq10Var.mo46515e();
                int[] iArrM36692e = m36692e(lq10Var2.f135928b);
                float[] fArr = lq10Var2.f135927a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArrM36692e, fArr, Shader.TileMode.CLAMP);
                w2b0Var2.m87070g(jM36693h2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.f22254i.setShader(shader);
        super.mo27898g(canvas, matrix, i);
    }

    @Override // p204p.hej
    public final String getName() {
        return this.f52138r;
    }

    /* JADX INFO: renamed from: h */
    public final int m36693h() {
        float f = this.f52146z.f148645d;
        float f2 = this.f52144x;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f52136A.f148645d * f2);
        int iRound3 = Math.round(this.f52145y.f148645d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
