package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ymy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cny f274350a;

    public ymy(cny cnyVar) {
        this.f274350a = cnyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xmy xmyVar;
        if (ibkVar instanceof xmy) {
            xmyVar = (xmy) ibkVar;
            int i = xmyVar.f263465b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmyVar.f263465b = i - Integer.MIN_VALUE;
            } else {
                xmyVar = new xmy(this, ibkVar);
            }
        } else {
            xmyVar = new xmy(this, ibkVar);
        }
        Object obj2 = xmyVar.f263464a;
        int i2 = xmyVar.f263465b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        nuu0 nuu0Var = this.f274350a.f40126d.f253612b;
        zax zaxVar = new zax(bqz0Var, 12);
        xmyVar.f263465b = 1;
        Object objCollect = nuu0Var.f158717a.collect(new efx(zaxVar, 19), xmyVar);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
