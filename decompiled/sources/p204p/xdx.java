package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class xdx implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zdx f260564a;

    public xdx(zdx zdxVar) {
        this.f260564a = zdxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wdx wdxVar;
        if (ibkVar instanceof wdx) {
            wdxVar = (wdx) ibkVar;
            int i = wdxVar.f250360b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wdxVar.f250360b = i - Integer.MIN_VALUE;
            } else {
                wdxVar = new wdx(this, ibkVar);
            }
        } else {
            wdxVar = new wdx(this, ibkVar);
        }
        Object obj2 = wdxVar.f250359a;
        int i2 = wdxVar.f250360b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            zdx zdxVar = this.f260564a;
            s2t s2tVar = new s2t(mvl0.m62953p(k0e1.m54985d(zdxVar.f281831a.mo59839a(zdxVar.f281832b.f183901a).mo74958b(((o9j) obj).f163045a))), 27);
            zax zaxVar = new zax(bqz0Var, 5);
            wdxVar.f250360b = 1;
            Object objCollect = s2tVar.collect(zaxVar, wdxVar);
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
