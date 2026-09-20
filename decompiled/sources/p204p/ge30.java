package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ge30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        fe30 fe30Var;
        if (ibkVar instanceof fe30) {
            fe30Var = (fe30) ibkVar;
            int i = fe30Var.f68673b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fe30Var.f68673b = i - Integer.MIN_VALUE;
            } else {
                fe30Var = new fe30(this, ibkVar);
            }
        } else {
            fe30Var = new fe30(this, ibkVar);
        }
        Object obj2 = fe30Var.f68672a;
        int i2 = fe30Var.f68673b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new f3q(2, 19, null));
            zax zaxVar = new zax(bqz0Var, 19);
            fe30Var.f68673b = 1;
            Object objCollect = nzx0Var.collect(zaxVar, fe30Var);
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
