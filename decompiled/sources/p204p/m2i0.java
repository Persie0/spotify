package p204p;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class m2i0 extends ioj0 {

    /* JADX INFO: renamed from: f */
    public final c730 f139356f;

    /* JADX INFO: renamed from: g */
    public final bqa f139357g;

    /* JADX INFO: renamed from: h */
    public di41 f139358h;

    public m2i0(nny0 nny0Var, c730 c730Var, kb7 kb7Var, yqq yqqVar) {
        super(nny0Var, kb7Var, yqqVar);
        this.f139356f = c730Var;
        this.f139357g = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r0v18, types: [p.qx0, p.th00] */
    /* JADX INFO: renamed from: c */
    public static final Object m60596c(m2i0 m2i0Var, nny0 nny0Var, h2i0 h2i0Var, float f, float f2, ibk ibkVar) {
        i2i0 i2i0Var;
        w2a1 w2a1Var;
        olv0 olv0Var;
        float f3;
        nny0 nny0Var2;
        long jM70524e;
        t7q t7qVar = m2i0Var.f104237e;
        if (ibkVar instanceof i2i0) {
            i2i0Var = (i2i0) ibkVar;
            int i = i2i0Var.f97853f;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2i0Var.f97853f = i - Integer.MIN_VALUE;
            } else {
                i2i0Var = new i2i0(m2i0Var, ibkVar);
            }
        } else {
            i2i0Var = new i2i0(m2i0Var, ibkVar);
        }
        i2i0 i2i0Var2 = i2i0Var;
        Object obj = i2i0Var2.f97851d;
        int i2 = i2i0Var2.f97853f;
        w2a1 w2a1Var2 = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            rlv0 rlv0VarM36622v = dq60.m36622v(obj);
            rlv0VarM36622v.f200373a = h2i0Var;
            long j = h2i0Var.f87010b;
            long j2 = h2i0Var.f87009a;
            w2a1Var = w2a1Var2;
            ((o5b1) t7qVar.f217871b).m66281a(j, Float.intBitsToFloat((int) (j2 >> 32)));
            ((o5b1) t7qVar.f217872c).m66281a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
            h2i0 h2i0VarM60598i = m60598i(m2i0Var.f139357g);
            if (h2i0VarM60598i != null) {
                long j3 = h2i0VarM60598i.f87010b;
                long j4 = h2i0VarM60598i.f87009a;
                ((o5b1) t7qVar.f217871b).m66281a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                ((o5b1) t7qVar.f217872c).m66281a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                rlv0VarM36622v.f200373a = ((h2i0) rlv0VarM36622v.f200373a).m46496a(h2i0VarM60598i);
            }
            olv0 olv0Var2 = new olv0();
            float fM65225g = nny0Var.m65225g(nny0Var.m65223e(((h2i0) rlv0VarM36622v.f200373a).f87009a));
            olv0Var2.f166933a = fM65225g;
            if (!n2i0.m63565a(fM65225g)) {
                rlv0 rlv0Var = new rlv0();
                rlv0Var.f200373a = el51.m39331a(0.0f, 0.0f, 30);
                th00 j2i0Var = new j2i0(olv0Var2, rlv0Var, rlv0VarM36622v, f, m2i0Var, f2, nny0Var, null);
                i2i0Var2.f97848a = nny0Var;
                i2i0Var2.f97849b = olv0Var2;
                i2i0Var2.f97850c = f2;
                i2i0Var2.f97853f = 1;
                if (m2i0Var.m51207b(j2i0Var, i2i0Var2) != obj2) {
                    olv0Var = olv0Var2;
                    f3 = f2;
                    nny0Var2 = nny0Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var2;
        }
        f3 = i2i0Var2.f97850c;
        olv0Var = i2i0Var2.f97849b;
        nny0Var2 = i2i0Var2.f97848a;
        bga.m29073P(obj);
        w2a1Var = w2a1Var2;
        long jM70524e2 = pp91.m70524e(((o5b1) t7qVar.f217871b).m66282b(Float.MAX_VALUE), ((o5b1) t7qVar.f217872c).m66282b(Float.MAX_VALUE));
        if (m5b1.m60853c(jM70524e2)) {
            float fM65222d = nny0Var2.m65222d(Math.signum(olv0Var.f166933a)) * Math.min(Math.abs(olv0Var.f166933a) / 100, f3) * 1000;
            if (fM65222d == 0.0f) {
                jM70524e = 0;
            } else {
                jM70524e = nny0Var2.f156522d == vvl0.f245249b ? pp91.m70524e(fM65222d, 0.0f) : pp91.m70524e(0.0f, fM65222d);
            }
            jM70524e2 = jM70524e;
        }
        ?? r0 = m2i0Var.f104234b;
        m5b1 m5b1Var = new m5b1(jM70524e2);
        i2i0Var2.f97848a = null;
        i2i0Var2.f97849b = null;
        i2i0Var2.f97853f = 2;
        return r0.invoke(m5b1Var, i2i0Var2) == obj2 ? obj2 : w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public static final Object m60597d(m2i0 m2i0Var, rlv0 rlv0Var, olv0 olv0Var, nny0 nny0Var, rlv0 rlv0Var2, long j, ibk ibkVar) {
        k2i0 k2i0Var;
        olv0 olv0Var2;
        nny0 nny0Var2;
        rlv0 rlv0Var3;
        boolean z;
        if (ibkVar instanceof k2i0) {
            k2i0Var = (k2i0) ibkVar;
            int i = k2i0Var.f118646g;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2i0Var.f118646g = i - Integer.MIN_VALUE;
            } else {
                k2i0Var = new k2i0(ibkVar);
            }
        } else {
            k2i0Var = new k2i0(ibkVar);
        }
        Object objM76980u = k2i0Var.f118645f;
        int i2 = k2i0Var.f118646g;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            if (j < 0) {
                return Boolean.FALSE;
            }
            l2i0 l2i0Var = new l2i0(m2i0Var, null, 0);
            k2i0Var.f118640a = m2i0Var;
            k2i0Var.f118641b = rlv0Var;
            k2i0Var.f118642c = olv0Var;
            k2i0Var.f118643d = nny0Var;
            k2i0Var.f118644e = rlv0Var2;
            k2i0Var.f118646g = 1;
            objM76980u = s1h1.m76980u(j, l2i0Var, k2i0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
            olv0Var2 = olv0Var;
            nny0Var2 = nny0Var;
            rlv0Var3 = rlv0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rlv0 rlv0Var4 = k2i0Var.f118644e;
            nny0 nny0Var3 = k2i0Var.f118643d;
            olv0Var2 = k2i0Var.f118642c;
            rlv0 rlv0Var5 = k2i0Var.f118641b;
            m2i0 m2i0Var2 = k2i0Var.f118640a;
            bga.m29073P(objM76980u);
            rlv0Var3 = rlv0Var4;
            nny0Var2 = nny0Var3;
            rlv0Var = rlv0Var5;
            m2i0Var = m2i0Var2;
        }
        h2i0 h2i0Var = (h2i0) objM76980u;
        if (h2i0Var != null) {
            boolean z2 = ((h2i0) rlv0Var.f200373a).f87011c;
            long j2 = h2i0Var.f87009a;
            rlv0Var.f200373a = new h2i0(j2, h2i0Var.f87010b, z2);
            olv0Var2.f166933a = nny0Var2.m65227i(nny0Var2.m65223e(j2));
            rlv0Var3.f200373a = el51.m39331a(0.0f, 0.0f, 30);
            t7q t7qVar = m2i0Var.f104237e;
            long j3 = h2i0Var.f87010b;
            long j4 = h2i0Var.f87009a;
            ((o5b1) t7qVar.f217871b).m66281a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((o5b1) t7qVar.f217872c).m66281a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            z = !n2i0.m63565a(olv0Var2.f166933a);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static h2i0 m60598i(bqa bqaVar) {
        h2i0 h2i0Var = null;
        vsz0 vsz0VarM43277s = g0b1.m43277s(new w100((Object) new g2i0(bqaVar, 0), (fbk) (0 == true ? 1 : 0), 2));
        while (vsz0VarM43277s.hasNext()) {
            h2i0 h2i0VarM46496a = (h2i0) vsz0VarM43277s.next();
            if (h2i0Var != null) {
                h2i0VarM46496a = h2i0Var.m46496a(h2i0VarM46496a);
            }
            h2i0Var = h2i0VarM46496a;
        }
        return h2i0Var;
    }

    /* JADX INFO: renamed from: e */
    public final float m60599e(mny0 mny0Var, float f) {
        nny0 nny0Var = this.f104233a;
        long jM65226h = nny0Var.m65226h(nny0Var.m65222d(f));
        nny0 nny0Var2 = mny0Var.f145503a;
        return nny0Var.m65225g(nny0Var.m65223e(nny0Var2.m65221c(nny0Var2.f156529k, jM65226h, 1)));
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final boolean m60600f(e6q0 e6q0Var) {
        long j;
        yqq yqqVar = this.f104235c;
        c730 c730Var = this.f139356f;
        ViewConfiguration viewConfiguration = (ViewConfiguration) c730Var.f34733b;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? fz6.m43167w(viewConfiguration) : yqqVar.mo35989Z0(64));
        float f2 = -(i > 26 ? fz6.m43166v(viewConfiguration) : yqqVar.mo35989Z0(64));
        ?? r2 = e6q0Var.f56704a;
        Offset offset = new Offset(0L);
        int size = r2.size();
        boolean zMo28417d = false;
        int i2 = 0;
        while (true) {
            j = offset.f493a;
            if (i2 >= size) {
                break;
            }
            offset = new Offset(Offset.m257g(j, ((k6q0) r2.get(i2)).f119819j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        nny0 nny0Var = this.f104233a;
        float fM65227i = nny0Var.m65227i(nny0Var.m65223e(jFloatToRawIntBits));
        if (fM65227i != 0.0f) {
            zMo28417d = fM65227i > 0.0f ? nny0Var.f156519a.mo28417d() : nny0Var.f156519a.mo28416c();
        }
        if (!zMo28417d) {
            return this.f104236d;
        }
        long j2 = ((k6q0) g6f.m43741q0(e6q0Var.f56704a)).f119811b;
        c730Var.getClass();
        return !(this.f139357g.mo30231j(new h2i0(jFloatToRawIntBits, j2, false)) instanceof tnc);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final void m60601g(e6q0 e6q0Var, f6q0 f6q0Var, long j) {
        if (e6q0Var.f56709f == 6) {
            ?? r5 = e6q0Var.f56704a;
            int size = r5.size();
            for (int i = 0; i < size; i++) {
                if (((k6q0) r5.get(i)).m55612l()) {
                    return;
                }
            }
            if (f6q0Var == f6q0.f66485a && this.f104236d) {
                m60600f(e6q0Var);
                ioj0.m51206a(e6q0Var);
            }
            if (f6q0Var == f6q0.f66486b && !this.f104236d && m60600f(e6q0Var)) {
                ioj0.m51206a(e6q0Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m60602h(xuk xukVar) {
        if (this.f139358h == null) {
            this.f139358h = x0h1.m89578u(xukVar, null, 0, new rph0(this, null, 2), 3);
        }
    }
}
