package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class r961 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jz6 f196925a;

    public r961(jz6 jz6Var) {
        this.f196925a = jz6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        q961 q961Var;
        if (ibkVar instanceof q961) {
            q961Var = (q961) ibkVar;
            int i = q961Var.f186512b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q961Var.f186512b = i - Integer.MIN_VALUE;
            } else {
                q961Var = new q961(this, ibkVar);
            }
        } else {
            q961Var = new q961(this, ibkVar);
        }
        Object obj2 = q961Var.f186511a;
        int i2 = q961Var.f186512b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            jz6.m54837f(this.f196925a, ((i961) obj).f99921a, "event_companion_viewed", null, null, 12);
            nzx0 nzx0Var = new nzx0(new xcy0(2, 10, null));
            aeq0 aeq0Var = new aeq0(bqz0Var, 22);
            q961Var.f186512b = 1;
            Object objCollect = nzx0Var.collect(aeq0Var, q961Var);
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
