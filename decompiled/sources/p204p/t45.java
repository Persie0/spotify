package p204p;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t45 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f216911b;

    public /* synthetic */ t45(int i, eh00 eh00Var) {
        this.f216910a = i;
        this.f216911b = eh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f216910a) {
            case 0:
                ((fdx0) obj).m41380b(((Number) this.f216911b.invoke()).floatValue());
                return w2a1.f247311a;
            case 1:
                DrawScope.m277h0((DrawScope) obj, ((n6f) this.f216911b.invoke()).f150873a, 0L, 0L, 0.0f, null, null, 126);
                return w2a1.f247311a;
            case 2:
                this.f216911b.invoke();
                return w2a1.f247311a;
            case 3:
                this.f216911b.invoke();
                return w2a1.f247311a;
            case 4:
                this.f216911b.invoke();
                return w2a1.f247311a;
            case 5:
                mpz0 mpz0Var = (mpz0) obj;
                Object objInvoke = this.f216911b.invoke();
                if (Float.isNaN(((Number) objInvoke).floatValue())) {
                    objInvoke = null;
                }
                Float f = (Float) objInvoke;
                jpz0.m54006t(mpz0Var, new i4s0(f != null ? f.floatValue() : 0.0f, new ete(0.0f, 1.0f), 0));
                return w2a1.f247311a;
            case 6:
                mpz0 mpz0Var2 = (mpz0) obj;
                Object objInvoke2 = this.f216911b.invoke();
                if (Float.isNaN(((Number) objInvoke2).floatValue())) {
                    objInvoke2 = null;
                }
                Float f2 = (Float) objInvoke2;
                jpz0.m54006t(mpz0Var2, new i4s0(f2 != null ? f2.floatValue() : 0.0f, new ete(0.0f, 1.0f), 0));
                return w2a1.f247311a;
            case 7:
                return this.f216911b.invoke();
            case 8:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) this.f216911b.invoke()).floatValue());
            default:
                return (Offset) this.f216911b.invoke();
        }
    }
}
