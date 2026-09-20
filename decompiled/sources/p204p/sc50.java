package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class sc50 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z9j0 f207650a;

    public sc50(z9j0 z9j0Var) {
        this.f207650a = z9j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rc50 rc50Var;
        if (ibkVar instanceof rc50) {
            rc50Var = (rc50) ibkVar;
            int i = rc50Var.f197735b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rc50Var.f197735b = i - Integer.MIN_VALUE;
            } else {
                rc50Var = new rc50(this, ibkVar);
            }
        } else {
            rc50Var = new rc50(this, ibkVar);
        }
        Object obj2 = rc50Var.f197734a;
        int i2 = rc50Var.f197735b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ((pet) obj).getClass();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        this.f207650a.mo47344d(gn80.CHAT_INTERCEPTOR);
        return w2a1.f247311a;
    }
}
