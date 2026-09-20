package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class mqt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xqt f146351a;

    public mqt(xqt xqtVar) {
        this.f146351a = xqtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        lqt lqtVar;
        if (ibkVar instanceof lqt) {
            lqtVar = (lqt) ibkVar;
            int i = lqtVar.f136127b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lqtVar.f136127b = i - Integer.MIN_VALUE;
            } else {
                lqtVar = new lqt(this, ibkVar);
            }
        } else {
            lqtVar = new lqt(this, ibkVar);
        }
        Object obj2 = lqtVar.f136126a;
        int i2 = lqtVar.f136127b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new sqt((fet) obj, this.f146351a, (fbk) null, 0));
            d6i d6iVar = new d6i(bqz0Var, 21);
            lqtVar.f136127b = 1;
            Object objCollect = nzx0Var.collect(d6iVar, lqtVar);
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
