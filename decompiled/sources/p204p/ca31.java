package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ca31 {

    /* JADX INFO: renamed from: a */
    public static final float f35714a = 400;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m31989a(nly0 nly0Var, float f, q05 q05Var, ypo ypoVar, gh00 gh00Var, ibk ibkVar) {
        aa31 aa31Var;
        float f2;
        olv0 olv0Var;
        if (ibkVar instanceof aa31) {
            aa31Var = (aa31) ibkVar;
            int i = aa31Var.f13753e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aa31Var.f13753e = i - Integer.MIN_VALUE;
            } else {
                aa31Var = new aa31(ibkVar);
            }
        } else {
            aa31Var = new aa31(ibkVar);
        }
        Object obj = aa31Var.f13752d;
        int i2 = aa31Var.f13753e;
        if (i2 == 0) {
            bga.m29073P(obj);
            olv0 olv0Var2 = new olv0();
            boolean z = ((Number) q05Var.m71791a()).floatValue() == 0.0f;
            z931 z931Var = new z931(f, olv0Var2, nly0Var, gh00Var, 0);
            aa31Var.f13750b = q05Var;
            aa31Var.f13751c = olv0Var2;
            aa31Var.f13749a = f;
            aa31Var.f13753e = 1;
            Object objM62152n = mkg1.m62152n(q05Var, ypoVar, !z, z931Var, aa31Var);
            yuk yukVar = yuk.f276404a;
            if (objM62152n == yukVar) {
                return yukVar;
            }
            f2 = f;
            olv0Var = olv0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = aa31Var.f13749a;
            olv0Var = aa31Var.f13751c;
            q05Var = aa31Var.f13750b;
            bga.m29073P(obj);
        }
        return new j05(qyg1.m74179I(f2 - olv0Var.f166933a), q05Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: b */
    public static final Object m31990b(nly0 nly0Var, float f, float f2, q05 q05Var, n05 n05Var, gh00 gh00Var, ibk ibkVar) {
        ba31 ba31Var;
        float f3;
        q05 q05Var2;
        float f4;
        olv0 olv0Var;
        if (ibkVar instanceof ba31) {
            ba31Var = (ba31) ibkVar;
            int i = ba31Var.f25082f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ba31Var.f25082f = i - Integer.MIN_VALUE;
            } else {
                ba31Var = new ba31(ibkVar);
            }
        } else {
            ba31Var = new ba31(ibkVar);
        }
        ba31 ba31Var2 = ba31Var;
        Object obj = ba31Var2.f25081e;
        int i2 = ba31Var2.f25082f;
        if (i2 == 0) {
            bga.m29073P(obj);
            olv0 olv0Var2 = new olv0();
            float fFloatValue = ((Number) q05Var.m71791a()).floatValue();
            Float fM74179I = qyg1.m74179I(f);
            boolean z = !(((Number) q05Var.m71791a()).floatValue() == 0.0f);
            z931 z931Var = new z931(f2, olv0Var2, nly0Var, gh00Var, 1);
            ba31Var2.f25079c = q05Var;
            ba31Var2.f25080d = olv0Var2;
            f3 = f;
            ba31Var2.f25077a = f3;
            ba31Var2.f25078b = fFloatValue;
            ba31Var2.f25082f = 1;
            Object objM62153o = mkg1.m62153o(q05Var, fM74179I, n05Var, z, z931Var, ba31Var2);
            yuk yukVar = yuk.f276404a;
            if (objM62153o == yukVar) {
                return yukVar;
            }
            q05Var2 = q05Var;
            f4 = fFloatValue;
            olv0Var = olv0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f4 = ba31Var2.f25078b;
            f3 = ba31Var2.f25077a;
            olv0Var = ba31Var2.f25080d;
            q05Var2 = ba31Var2.f25079c;
            bga.m29073P(obj);
        }
        return new j05(qyg1.m74179I(f3 - olv0Var.f166933a), el51.m39341k(q05Var2, 0.0f, m31992d(((Number) q05Var2.m71791a()).floatValue(), f4), 29));
    }

    /* JADX INFO: renamed from: c */
    public static final void m31991c(l05 l05Var, nly0 nly0Var, gh00 gh00Var, float f) {
        float fMo42170f;
        try {
            fMo42170f = nly0Var.mo42170f(f);
        } catch (CancellationException unused) {
            l05Var.m57785a();
            fMo42170f = 0.0f;
        }
        gh00Var.invoke(Float.valueOf(fMo42170f));
        if (Math.abs(f - fMo42170f) > 0.5f) {
            l05Var.m57785a();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final float m31992d(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }
}
