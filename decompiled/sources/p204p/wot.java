package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class wot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tpt f253569a;

    public wot(tpt tptVar) {
        this.f253569a = tptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        tot totVar;
        fiz yskVar;
        if (ibkVar instanceof tot) {
            totVar = (tot) ibkVar;
            int i = totVar.f222317b;
            if ((i & Integer.MIN_VALUE) != 0) {
                totVar.f222317b = i - Integer.MIN_VALUE;
            } else {
                totVar = new tot(this, ibkVar);
            }
        } else {
            totVar = new tot(this, ibkVar);
        }
        Object obj2 = totVar.f222316a;
        int i2 = totVar.f222317b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ia70 ia70Var = this.f253569a.f222597e;
            pgo pgoVar = (pgo) ia70Var.f100166b;
            String str = ((zft) obj).f282398a;
            if (hf41.m47326b(str)) {
                fbk fbkVar = null;
                int i3 = 3;
                yskVar = hf41.m47327c(str) ? new vjz(new am90(new dts(fag1.m41173v(pgoVar, ez80.f64302a, str), 28), ia70Var, 2), new ga2(i3, 19, fbkVar), 2) : new vjz(new rc10(new dts(fag1.m41173v(pgoVar, szj.f215602a, str), 26), 12), new ga2(i3, 17, fbkVar), 2);
            } else {
                yskVar = new ysk(yla1.f273969a, 27);
            }
            d6i d6iVar = new d6i(bqz0Var, 18);
            totVar.f222317b = 1;
            Object objCollect = yskVar.collect(d6iVar, totVar);
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
