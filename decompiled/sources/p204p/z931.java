package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z931 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f280654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f280655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ olv0 f280656c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f280657d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f280658e;

    public /* synthetic */ z931(float f, olv0 olv0Var, Object obj, Object obj2, int i) {
        this.f280654a = i;
        this.f280655b = f;
        this.f280656c = olv0Var;
        this.f280657d = obj;
        this.f280658e = obj2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        float fMo42170f;
        switch (this.f280654a) {
            case 0:
                nly0 nly0Var = (nly0) this.f280657d;
                gh00 gh00Var = (gh00) this.f280658e;
                l05 l05Var = (l05) obj;
                yum0 yum0Var = l05Var.f128299e;
                float fAbs = Math.abs(((Number) yum0Var.getValue()).floatValue());
                float f = this.f280655b;
                float fAbs2 = Math.abs(f);
                olv0 olv0Var = this.f280656c;
                if (fAbs >= fAbs2) {
                    float fM31992d = ca31.m31992d(((Number) yum0Var.getValue()).floatValue(), f);
                    ca31.m31991c(l05Var, nly0Var, gh00Var, fM31992d - olv0Var.f166933a);
                    l05Var.m57785a();
                    olv0Var.f166933a = fM31992d;
                } else {
                    ca31.m31991c(l05Var, nly0Var, gh00Var, ((Number) yum0Var.getValue()).floatValue() - olv0Var.f166933a);
                    olv0Var.f166933a = ((Number) yum0Var.getValue()).floatValue();
                }
                break;
            case 1:
                nly0 nly0Var2 = (nly0) this.f280657d;
                gh00 gh00Var2 = (gh00) this.f280658e;
                l05 l05Var2 = (l05) obj;
                float fM31992d2 = ca31.m31992d(((Number) l05Var2.f128299e.getValue()).floatValue(), this.f280655b);
                olv0 olv0Var2 = this.f280656c;
                float f2 = fM31992d2 - olv0Var2.f166933a;
                try {
                    fMo42170f = nly0Var2.mo42170f(f2);
                } catch (CancellationException unused) {
                    l05Var2.m57785a();
                    fMo42170f = 0.0f;
                }
                gh00Var2.invoke(Float.valueOf(fMo42170f));
                if (Math.abs(f2 - fMo42170f) > 0.5f || fM31992d2 != ((Number) l05Var2.f128299e.getValue()).floatValue()) {
                    l05Var2.m57785a();
                }
                olv0Var2.f166933a += fMo42170f;
                break;
            default:
                ms3 ms3Var = (ms3) this.f280657d;
                olv0 olv0Var3 = (olv0) this.f280658e;
                l05 l05Var3 = (l05) obj;
                yum0 yum0Var2 = l05Var3.f128299e;
                float fFloatValue = ((Number) yum0Var2.getValue()).floatValue();
                float f3 = this.f280655b;
                olv0 olv0Var4 = this.f280656c;
                if ((fFloatValue >= f3 || olv0Var4.f166933a <= f3) && (((Number) yum0Var2.getValue()).floatValue() <= f3 || olv0Var4.f166933a >= f3)) {
                    ms3Var.m62695a(((Number) yum0Var2.getValue()).floatValue(), ((Number) l05Var3.m57786b()).floatValue());
                    olv0Var3.f166933a = ((Number) l05Var3.m57786b()).floatValue();
                    olv0Var4.f166933a = ((Number) yum0Var2.getValue()).floatValue();
                } else {
                    float fFloatValue2 = ((Number) yum0Var2.getValue()).floatValue();
                    if (f3 == 0.0f) {
                        f3 = 0.0f;
                    } else if (f3 <= 0.0f ? fFloatValue2 >= f3 : fFloatValue2 <= f3) {
                        f3 = fFloatValue2;
                    }
                    ms3Var.m62695a(f3, ((Number) l05Var3.m57786b()).floatValue());
                    olv0Var3.f166933a = Float.isNaN(((Number) l05Var3.m57786b()).floatValue()) ? 0.0f : ((Number) l05Var3.m57786b()).floatValue();
                    olv0Var4.f166933a = f3;
                    l05Var3.m57785a();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
