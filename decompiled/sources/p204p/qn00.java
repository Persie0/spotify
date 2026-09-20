package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class qn00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rn00 f190447a;

    public qn00(rn00 rn00Var) {
        this.f190447a = rn00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        pn00 pn00Var;
        Object ym00Var;
        if (ibkVar instanceof pn00) {
            pn00Var = (pn00) ibkVar;
            int i = pn00Var.f179275b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn00Var.f179275b = i - Integer.MIN_VALUE;
            } else {
                pn00Var = new pn00(this, ibkVar);
            }
        } else {
            pn00Var = new pn00(this, ibkVar);
        }
        Object obj2 = pn00Var.f179274a;
        int i2 = pn00Var.f179275b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            try {
                Iterable<gmr0> iterable = (Iterable) this.f190447a.f200682e.m86362e(((nm00) obj).f155211c).firstOrError().blockingGet();
                ArrayList arrayList = new ArrayList(i6f.m49804T(iterable, 10));
                for (gmr0 gmr0Var : iterable) {
                    arrayList.add(new bn00(gmr0Var.f81450a, gmr0Var.f81451b, gmr0Var.f81455f));
                }
                ym00Var = new ym00(arrayList);
            } catch (Exception unused) {
                ym00Var = xm00.f263261a;
            }
            pn00Var.f179275b = 1;
            Object objMo30229d = bqz0Var.mo30229d(ym00Var, pn00Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
