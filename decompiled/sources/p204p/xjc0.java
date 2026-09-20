package p204p;

import android.widget.FrameLayout;
import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes.dex */
public final class xjc0 implements dut {

    /* JADX INFO: renamed from: a */
    public final qy8 f262099a;

    /* JADX INFO: renamed from: b */
    public final boolean f262100b;

    /* JADX INFO: renamed from: c */
    public final FrameLayout.LayoutParams f262101c;

    /* JADX INFO: renamed from: d */
    public final fxh0 f262102d;

    /* JADX INFO: renamed from: e */
    public final uut f262103e;

    /* JADX INFO: renamed from: f */
    public final avt f262104f;

    /* JADX INFO: renamed from: g */
    public final wjc0 f262105g = new wjc0(this);

    public xjc0(qy8 qy8Var, boolean z, FrameLayout.LayoutParams layoutParams, fxh0 fxh0Var) {
        this.f262099a = qy8Var;
        this.f262100b = z;
        this.f262101c = layoutParams;
        this.f262102d = fxh0Var;
        this.f262103e = qy8Var.getBehavior();
        this.f262104f = qy8Var.mo24358a();
    }

    /* JADX INFO: renamed from: e */
    public static final void m91216e(xjc0 xjc0Var, gh00 gh00Var, Object obj, qwt qwtVar, xq00 xq00Var, int i) {
        int i2;
        gh00 gh00Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(596562193);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(obj) : xq00Var.m91770i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(qwtVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(xjc0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zM91766g = xq00Var.m91766g(qwtVar);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == ia7Var) {
                objM91750T = new ext(qwtVar.f193419b, qwtVar.f193420c);
                xq00Var.m91793t0(objM91750T);
            }
            ext extVar = (ext) objM91750T;
            wpi0 wpi0Var = xwt.f266743a;
            fmu0 fmu0VarM69676b = pda0.m69676b(xq00Var);
            if (xjc0Var.f262100b) {
                xq00Var.m91771i0(-388547021);
                Object objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = xfc0.f260924i;
                    xq00Var.m91793t0(objM91750T2);
                }
                gh00Var2 = (gh00) objM91750T2;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-388450612);
                xq00Var.m91788r(false);
                gh00Var2 = null;
            }
            fxh0 fxh0Var = xjc0Var.f262102d;
            int i3 = i2 & 14;
            boolean zM91770i = xq00Var.m91770i(xjc0Var) | xq00Var.m91770i(fmu0VarM69676b) | (i3 == 4);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == ia7Var) {
                objM91750T3 = new x740(gh00Var, xjc0Var, fmu0VarM69676b, 29);
                xq00Var.m91793t0(objM91750T3);
            }
            gh00 gh00Var3 = (gh00) objM91750T3;
            boolean zM91770i2 = (i3 == 4) | xq00Var.m91770i(fmu0VarM69676b) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && xq00Var.m91770i(obj))) | xq00Var.m91770i(extVar);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T4 == ia7Var) {
                ee20 ee20Var = new ee20(fmu0VarM69676b, gh00Var, obj, extVar, 25);
                xq00Var.m91793t0(ee20Var);
                objM91750T4 = ee20Var;
            }
            g0b1.m43260a(gh00Var3, fxh0Var, gh00Var2, null, (gh00) objM91750T4, xq00Var, 0, 8);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vjc0(xjc0Var, gh00Var, obj, qwtVar, i, 0);
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f262104f;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: b */
    public final String mo29771b() {
        return this.f262099a.mo29380b();
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f262105g;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f262103e;
    }
}
