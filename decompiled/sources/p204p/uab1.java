package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class uab1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        tab1 tab1Var;
        if (ibkVar instanceof tab1) {
            tab1Var = (tab1) ibkVar;
            int i = tab1Var.f218534b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tab1Var.f218534b = i - Integer.MIN_VALUE;
            } else {
                tab1Var = new tab1(this, ibkVar);
            }
        } else {
            tab1Var = new tab1(this, ibkVar);
        }
        Object obj2 = tab1Var.f218533a;
        int i2 = tab1Var.f218534b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new mri0(2, 28, null));
            foa1 foa1Var = new foa1(bqz0Var, 4);
            tab1Var.f218534b = 1;
            Object objCollect = nzx0Var.collect(foa1Var, tab1Var);
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
