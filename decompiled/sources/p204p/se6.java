package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class se6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xe6 f208217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mg6 f208218b;

    public se6(xe6 xe6Var, mg6 mg6Var) {
        this.f208217a = xe6Var;
        this.f208218b = mg6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        re6 re6Var;
        if (ibkVar instanceof re6) {
            re6Var = (re6) ibkVar;
            int i = re6Var.f198289b;
            if ((i & Integer.MIN_VALUE) != 0) {
                re6Var.f198289b = i - Integer.MIN_VALUE;
            } else {
                re6Var = new re6(this, ibkVar);
            }
        } else {
            re6Var = new re6(this, ibkVar);
        }
        Object obj2 = re6Var.f198288a;
        int i2 = re6Var.f198289b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new nd0((sd6) obj, this.f208218b, this.f208217a.f260644c, (fbk) null, 1));
            h61 h61Var = new h61(bqz0Var, 11);
            re6Var.f198289b = 1;
            Object objCollect = nzx0Var.collect(h61Var, re6Var);
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
