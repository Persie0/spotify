package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class vot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt f243532a;

    public vot(spt sptVar) {
        this.f243532a = sptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        sot sotVar;
        fiz yskVar;
        if (ibkVar instanceof sot) {
            sotVar = (sot) ibkVar;
            int i = sotVar.f212650b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sotVar.f212650b = i - Integer.MIN_VALUE;
            } else {
                sotVar = new sot(this, ibkVar);
            }
        } else {
            sotVar = new sot(this, ibkVar);
        }
        Object obj2 = sotVar.f212649a;
        int i2 = sotVar.f212650b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            xh70 xh70Var = this.f243532a.f212945e;
            pgo pgoVar = (pgo) xh70Var.f261460b;
            String str = ((agt) obj).f15495a;
            if (hf41.m47326b(str)) {
                fbk fbkVar = null;
                int i3 = 3;
                yskVar = hf41.m47327c(str) ? new vjz(new am90(new dts(fag1.m41173v(pgoVar, fz80.f74941a, str), 29), xh70Var, 3), new ga2(i3, 20, fbkVar), 2) : new vjz(new rc10(new dts(fag1.m41173v(pgoVar, tzj.f225254a, str), 27), 13), new ga2(i3, 18, fbkVar), 2);
            } else {
                yskVar = new ysk(nqx.f157349a, 27);
            }
            d6i d6iVar = new d6i(bqz0Var, 17);
            sotVar.f212650b = 1;
            Object objCollect = yskVar.collect(d6iVar, sotVar);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
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
