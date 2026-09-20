package p204p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vq10 implements sgs, jz8, nu60 {

    /* JADX INFO: renamed from: a */
    public final String f243830a;

    /* JADX INFO: renamed from: b */
    public final boolean f243831b;

    /* JADX INFO: renamed from: c */
    public final oz8 f243832c;

    /* JADX INFO: renamed from: d */
    public final w2b0 f243833d = new w2b0((Object) null);

    /* JADX INFO: renamed from: e */
    public final w2b0 f243834e = new w2b0((Object) null);

    /* JADX INFO: renamed from: f */
    public final Path f243835f;

    /* JADX INFO: renamed from: g */
    public final zd70 f243836g;

    /* JADX INFO: renamed from: h */
    public final RectF f243837h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f243838i;

    /* JADX INFO: renamed from: j */
    public final int f243839j;

    /* JADX INFO: renamed from: k */
    public final mq10 f243840k;

    /* JADX INFO: renamed from: l */
    public final q7f f243841l;

    /* JADX INFO: renamed from: m */
    public final d6q0 f243842m;

    /* JADX INFO: renamed from: n */
    public final d6q0 f243843n;

    /* JADX INFO: renamed from: o */
    public h3b1 f243844o;

    /* JADX INFO: renamed from: p */
    public h3b1 f243845p;

    /* JADX INFO: renamed from: q */
    public final r9b0 f243846q;

    /* JADX INFO: renamed from: r */
    public final int f243847r;

    /* JADX INFO: renamed from: s */
    public mz8 f243848s;

    /* JADX INFO: renamed from: t */
    public float f243849t;

    /* JADX INFO: renamed from: u */
    public final whs f243850u;

    public vq10(r9b0 r9b0Var, u8b0 u8b0Var, oz8 oz8Var, uq10 uq10Var) {
        Path path = new Path();
        this.f243835f = path;
        this.f243836g = new zd70(1);
        this.f243837h = new RectF();
        this.f243838i = new ArrayList();
        this.f243849t = 0.0f;
        this.f243832c = oz8Var;
        this.f243830a = uq10Var.f232904g;
        this.f243831b = uq10Var.f232905h;
        this.f243846q = r9b0Var;
        this.f243839j = uq10Var.f232898a;
        path.setFillType(uq10Var.f232899b);
        this.f243847r = (int) (u8b0Var.m82567b() / 32.0f);
        mz8 mz8VarMo48914j0 = uq10Var.f232900c.mo48914j0();
        this.f243840k = (mq10) mz8VarMo48914j0;
        mz8VarMo48914j0.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j0);
        mz8 mz8VarMo48914j1 = uq10Var.f232901d.mo48914j0();
        this.f243841l = (q7f) mz8VarMo48914j1;
        mz8VarMo48914j1.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j1);
        mz8 mz8VarMo48914j2 = uq10Var.f232902e.mo48914j0();
        this.f243842m = (d6q0) mz8VarMo48914j2;
        mz8VarMo48914j2.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j2);
        mz8 mz8VarMo48914j3 = uq10Var.f232903f.mo48914j0();
        this.f243843n = (d6q0) mz8VarMo48914j3;
        mz8VarMo48914j3.m63235a(this);
        oz8Var.m68627e(mz8VarMo48914j3);
        if (oz8Var.mo66916k() != null) {
            mz8 mz8VarMo48914j4 = ((iw4) oz8Var.mo66916k().f182174b).mo48914j0();
            this.f243848s = mz8VarMo48914j4;
            mz8VarMo48914j4.m63235a(this);
            oz8Var.m68627e(this.f243848s);
        }
        if (oz8Var.mo66917l() != null) {
            this.f243850u = new whs(this, oz8Var, oz8Var.mo66917l());
        }
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        this.f243846q.invalidateSelf();
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            hej hejVar = (hej) list2.get(i);
            if (hejVar instanceof ybn0) {
                this.f243838i.add((ybn0) hejVar);
            }
        }
    }

    @Override // p204p.mu60
    /* JADX INFO: renamed from: c */
    public final void mo25332c(Object obj, xh70 xh70Var) {
        PointF pointF = bab0.f25146a;
        if (obj == 4) {
            this.f243841l.m63238j(xh70Var);
            return;
        }
        ColorFilter colorFilter = bab0.f25140F;
        oz8 oz8Var = this.f243832c;
        if (obj == colorFilter) {
            h3b1 h3b1Var = this.f243844o;
            if (h3b1Var != null) {
                oz8Var.m68632o(h3b1Var);
            }
            if (xh70Var == null) {
                this.f243844o = null;
                return;
            }
            h3b1 h3b1Var2 = new h3b1(null, xh70Var);
            this.f243844o = h3b1Var2;
            h3b1Var2.m63235a(this);
            oz8Var.m68627e(this.f243844o);
            return;
        }
        if (obj == bab0.f25141G) {
            h3b1 h3b1Var3 = this.f243845p;
            if (h3b1Var3 != null) {
                oz8Var.m68632o(h3b1Var3);
            }
            if (xh70Var == null) {
                this.f243845p = null;
                return;
            }
            this.f243833d.m87066b();
            this.f243834e.m87066b();
            h3b1 h3b1Var4 = new h3b1(null, xh70Var);
            this.f243845p = h3b1Var4;
            h3b1Var4.m63235a(this);
            oz8Var.m68627e(this.f243845p);
            return;
        }
        if (obj == bab0.f25150e) {
            mz8 mz8Var = this.f243848s;
            if (mz8Var != null) {
                mz8Var.m63238j(xh70Var);
                return;
            }
            h3b1 h3b1Var5 = new h3b1(null, xh70Var);
            this.f243848s = h3b1Var5;
            h3b1Var5.m63235a(this);
            oz8Var.m68627e(this.f243848s);
            return;
        }
        whs whsVar = this.f243850u;
        if (obj == 5 && whsVar != null) {
            whsVar.m88168c(xh70Var);
            return;
        }
        if (obj == bab0.f25136B && whsVar != null) {
            whsVar.m88171f(xh70Var);
            return;
        }
        if (obj == bab0.f25137C && whsVar != null) {
            whsVar.m88169d(xh70Var);
            return;
        }
        if (obj == bab0.f25138D && whsVar != null) {
            whsVar.m88170e(xh70Var);
        } else {
            if (obj != bab0.f25139E || whsVar == null) {
                return;
            }
            whsVar.m88172g(xh70Var);
        }
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: d */
    public final void mo25333d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f243835f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f243838i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((ybn0) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int[] m86178e(int[] iArr) {
        h3b1 h3b1Var = this.f243845p;
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

    @Override // p204p.mu60
    /* JADX INFO: renamed from: f */
    public final void mo27897f(lu60 lu60Var, int i, ArrayList arrayList, lu60 lu60Var2) {
        eff0.m38736f(lu60Var, i, arrayList, lu60Var2, this);
    }

    @Override // p204p.sgs
    /* JADX INFO: renamed from: g */
    public final void mo27898g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.f243831b) {
            return;
        }
        Path path = this.f243835f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f243838i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((ybn0) arrayList.get(i2)).getPath(), matrix);
            i2++;
        }
        path.computeBounds(this.f243837h, false);
        int i3 = this.f243839j;
        mq10 mq10Var = this.f243840k;
        d6q0 d6q0Var = this.f243843n;
        d6q0 d6q0Var2 = this.f243842m;
        if (i3 == 1) {
            long jM86179h = m86179h();
            w2b0 w2b0Var = this.f243833d;
            shader = (LinearGradient) w2b0Var.m87067c(jM86179h);
            if (shader == null) {
                PointF pointF = (PointF) d6q0Var2.mo46515e();
                PointF pointF2 = (PointF) d6q0Var.mo46515e();
                lq10 lq10Var = (lq10) mq10Var.mo46515e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, m86178e(lq10Var.f135928b), lq10Var.f135927a, Shader.TileMode.CLAMP);
                w2b0Var.m87070g(jM86179h, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jM86179h2 = m86179h();
            w2b0 w2b0Var2 = this.f243834e;
            shader = (RadialGradient) w2b0Var2.m87067c(jM86179h2);
            if (shader == null) {
                PointF pointF3 = (PointF) d6q0Var2.mo46515e();
                PointF pointF4 = (PointF) d6q0Var.mo46515e();
                lq10 lq10Var2 = (lq10) mq10Var.mo46515e();
                int[] iArrM86178e = m86178e(lq10Var2.f135928b);
                float[] fArr = lq10Var2.f135927a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrM86178e, fArr, Shader.TileMode.CLAMP);
                w2b0Var2.m87070g(jM86179h2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        zd70 zd70Var = this.f243836g;
        zd70Var.setShader(shader);
        h3b1 h3b1Var = this.f243844o;
        if (h3b1Var != null) {
            zd70Var.setColorFilter((ColorFilter) h3b1Var.mo46515e());
        }
        mz8 mz8Var = this.f243848s;
        if (mz8Var != null) {
            float fFloatValue = ((Float) mz8Var.mo46515e()).floatValue();
            if (fFloatValue == 0.0f) {
                zd70Var.setMaskFilter(null);
            } else if (fFloatValue != this.f243849t) {
                zd70Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f243849t = fFloatValue;
        }
        whs whsVar = this.f243850u;
        if (whsVar != null) {
            whsVar.m88167b(zd70Var);
        }
        int iIntValue = (int) ((((i / 255.0f) * ((Integer) this.f243841l.mo46515e()).intValue()) / 100.0f) * 255.0f);
        PointF pointF5 = eff0.f59045a;
        zd70Var.setAlpha(Math.max(0, Math.min(255, iIntValue)));
        canvas.drawPath(path, zd70Var);
    }

    @Override // p204p.hej
    public final String getName() {
        return this.f243830a;
    }

    /* JADX INFO: renamed from: h */
    public final int m86179h() {
        float f = this.f243842m.f148645d;
        float f2 = this.f243847r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.f243843n.f148645d * f2);
        int iRound3 = Math.round(this.f243840k.f148645d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
