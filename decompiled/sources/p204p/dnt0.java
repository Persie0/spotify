package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class dnt0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tey f50880a;

    public dnt0(tey teyVar) {
        this.f50880a = teyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        cnt0 cnt0Var;
        if (ibkVar instanceof cnt0) {
            cnt0Var = (cnt0) ibkVar;
            int i = cnt0Var.f40088b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cnt0Var.f40088b = i - Integer.MIN_VALUE;
            } else {
                cnt0Var = new cnt0(this, ibkVar);
            }
        } else {
            cnt0Var = new cnt0(this, ibkVar);
        }
        Object obj2 = cnt0Var.f40087a;
        int i2 = cnt0Var.f40088b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            tey teyVar = this.f50880a;
            vjz vjzVar = new vjz(new j5t0(new vjz(new C2481v3(((mb80) ((nh61) teyVar.f219808b).f153884b).f141817b.current(), 24), new ysl(teyVar, (fbk) null, 27), 2), 7), new yzb0(3, 14, null), 2);
            aeq0 aeq0Var = new aeq0(bqz0Var, 4);
            cnt0Var.f40088b = 1;
            Object objCollect = vjzVar.collect(aeq0Var, cnt0Var);
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
