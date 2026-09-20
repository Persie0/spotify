package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class b8a1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c8a1 f24542a;

    public b8a1(c8a1 c8a1Var) {
        this.f24542a = c8a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        a8a1 a8a1Var;
        if (ibkVar instanceof a8a1) {
            a8a1Var = (a8a1) ibkVar;
            int i = a8a1Var.f13237b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a8a1Var.f13237b = i - Integer.MIN_VALUE;
            } else {
                a8a1Var = new a8a1(this, ibkVar);
            }
        } else {
            a8a1Var = new a8a1(this, ibkVar);
        }
        Object obj2 = a8a1Var.f13236a;
        int i2 = a8a1Var.f13237b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new nzx0(new oj71(this.f24542a, (r7a1) obj, fbkVar, 12)), new far0(3, 18, fbkVar), 2);
            aeq0 aeq0Var = new aeq0(bqz0Var, 28);
            a8a1Var.f13237b = 1;
            Object objCollect = vjzVar.collect(aeq0Var, a8a1Var);
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
