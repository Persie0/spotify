package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class p560 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tey f174084a;

    public p560(tey teyVar) {
        this.f174084a = teyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        o560 o560Var;
        if (ibkVar instanceof o560) {
            o560Var = (o560) ibkVar;
            int i = o560Var.f161895b;
            if ((i & Integer.MIN_VALUE) != 0) {
                o560Var.f161895b = i - Integer.MIN_VALUE;
            } else {
                o560Var = new o560(this, ibkVar);
            }
        } else {
            o560Var = new o560(this, ibkVar);
        }
        Object obj2 = o560Var.f161894a;
        int i2 = o560Var.f161895b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vjz vjzVar = new vjz(new qp20(this.f174084a.m80585h(), 18), new ic0(3, 27, null), 2);
            zax zaxVar = new zax(bqz0Var, 23);
            o560Var.f161895b = 1;
            Object objCollect = vjzVar.collect(zaxVar, o560Var);
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
