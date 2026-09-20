package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class pj61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xyx f178188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x6j0 f178189b;

    public pj61(xyx xyxVar, x6j0 x6j0Var) {
        this.f178188a = xyxVar;
        this.f178189b = x6j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        oj61 oj61Var;
        if (ibkVar instanceof oj61) {
            oj61Var = (oj61) ibkVar;
            int i = oj61Var.f165980b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oj61Var.f165980b = i - Integer.MIN_VALUE;
            } else {
                oj61Var = new oj61(this, ibkVar);
            }
        } else {
            oj61Var = new oj61(this, ibkVar);
        }
        Object obj2 = oj61Var.f165979a;
        int i2 = oj61Var.f165980b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            String str = ((dj61) obj).f49603a;
            x6j0 x6j0Var = this.f178189b;
            vjz vjzVar = new vjz(new vj61(this.f178188a.m92433k(str), str, x6j0Var, 0), new zf01(x6j0Var, str, (fbk) null), 2);
            aeq0 aeq0Var = new aeq0(bqz0Var, 24);
            oj61Var.f165980b = 1;
            Object objCollect = vjzVar.collect(aeq0Var, oj61Var);
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
