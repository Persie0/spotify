package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class pot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt f179783a;

    public pot(spt sptVar) {
        this.f179783a = sptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        iot iotVar;
        if (ibkVar instanceof iot) {
            iotVar = (iot) ibkVar;
            int i = iotVar.f104285b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iotVar.f104285b = i - Integer.MIN_VALUE;
            } else {
                iotVar = new iot(this, ibkVar);
            }
        } else {
            iotVar = new iot(this, ibkVar);
        }
        Object obj2 = iotVar.f104284a;
        int i2 = iotVar.f104285b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vjz vjzVar = new vjz(new rc10(new f2a0(fag1.m41173v((pgo) this.f179783a.f212944d.f178196b, r6f0.f196258a, ((fgt) obj).f69397a), 1), 16), new ga2(3, 24, null), 2);
            d6i d6iVar = new d6i(bqz0Var, 14);
            iotVar.f104285b = 1;
            Object objCollect = vjzVar.collect(d6iVar, iotVar);
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
