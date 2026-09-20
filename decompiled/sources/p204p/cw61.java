package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class cw61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ew61 f42657a;

    public cw61(ew61 ew61Var) {
        this.f42657a = ew61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        bw61 bw61Var;
        ew61 ew61Var = this.f42657a;
        tq4 tq4Var = ew61Var.f63445d;
        if (ibkVar instanceof bw61) {
            bw61Var = (bw61) ibkVar;
            int i = bw61Var.f31567b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bw61Var.f31567b = i - Integer.MIN_VALUE;
            } else {
                bw61Var = new bw61(this, ibkVar);
            }
        } else {
            bw61Var = new bw61(this, ibkVar);
        }
        Object obj2 = bw61Var.f31566a;
        int i2 = bw61Var.f31567b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new fw61(tq4Var.m81301e(), tq4Var.m81300d(), ew61Var.f63443b, null));
            aeq0 aeq0Var = new aeq0(bqz0Var, 26);
            bw61Var.f31567b = 1;
            Object objCollect = nzx0Var.collect(aeq0Var, bw61Var);
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
