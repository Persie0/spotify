package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class o440 implements ila1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161548a;

    /* JADX INFO: renamed from: b */
    public final lpi0 f161549b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o440(int i) {
        this(lpi0.m59671t(), 0);
        this.f161548a = i;
        switch (i) {
            case 1:
                this(lpi0.m59671t(), 1);
                break;
            default:
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public g4r0 m66233a() {
        i5r0 i5r0Var = new i5r0(jvl0.m54384j(this.f161549b));
        y940.m93144s(i5r0Var);
        g4r0 g4r0Var = new g4r0(i5r0Var);
        g4r0Var.f76508p = g4r0.f76506w;
        return g4r0Var;
    }

    @Override // p204p.qox
    /* JADX INFO: renamed from: f */
    public final ioi0 mo25090f() {
        switch (this.f161548a) {
            case 0:
                break;
        }
        return this.f161549b;
    }

    @Override // p204p.ila1
    /* JADX INFO: renamed from: i */
    public final jla1 mo51006i() {
        switch (this.f161548a) {
            case 0:
                return new t440(jvl0.m54384j(this.f161549b));
            default:
                return new i5r0(jvl0.m54384j(this.f161549b));
        }
    }

    public o440(lpi0 lpi0Var, int i) {
        Object objMo39828c;
        Object objMo39828c2;
        this.f161548a = i;
        switch (i) {
            case 1:
                this.f161549b = lpi0Var;
                Object objMo39828c3 = null;
                try {
                    objMo39828c = lpi0Var.mo39828c(nu61.f158520u0);
                    break;
                } catch (IllegalArgumentException unused) {
                    objMo39828c = null;
                }
                Class cls = (Class) objMo39828c;
                if (cls != null && !cls.equals(g4r0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.f161549b.m59673v(jla1.f113569F0, lla1.f134600b);
                lpi0 lpi0Var2 = this.f161549b;
                lpi0Var2.m59673v(nu61.f158520u0, g4r0.class);
                try {
                    objMo39828c3 = lpi0Var2.mo39828c(nu61.f158519t0);
                    break;
                } catch (IllegalArgumentException unused2) {
                }
                if (objMo39828c3 == null) {
                    this.f161549b.m59673v(nu61.f158519t0, g4r0.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                Object objMo39828c4 = -1;
                try {
                    objMo39828c4 = lpi0Var.mo39828c(y940.f270500R);
                    break;
                } catch (IllegalArgumentException unused3) {
                }
                if (((Integer) objMo39828c4).intValue() == -1) {
                    lpi0Var.m59673v(y940.f270500R, 2);
                    return;
                }
                return;
            default:
                this.f161549b = lpi0Var;
                Object objMo39828c5 = null;
                try {
                    objMo39828c2 = lpi0Var.mo39828c(nu61.f158520u0);
                    break;
                } catch (IllegalArgumentException unused4) {
                    objMo39828c2 = null;
                }
                Class cls2 = (Class) objMo39828c2;
                if (cls2 != null && !cls2.equals(s440.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.f161549b.m59673v(jla1.f113569F0, lla1.f134599a);
                lpi0 lpi0Var3 = this.f161549b;
                lpi0Var3.m59673v(nu61.f158520u0, s440.class);
                try {
                    objMo39828c5 = lpi0Var3.mo39828c(nu61.f158519t0);
                    break;
                } catch (IllegalArgumentException unused5) {
                }
                if (objMo39828c5 == null) {
                    this.f161549b.m59673v(nu61.f158519t0, s440.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
