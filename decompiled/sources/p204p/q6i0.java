package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class q6i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r6i0 f185828a;

    public q6i0(r6i0 r6i0Var) {
        this.f185828a = r6i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        p6i0 p6i0Var;
        if (ibkVar instanceof p6i0) {
            p6i0Var = (p6i0) ibkVar;
            int i = p6i0Var.f174404b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6i0Var.f174404b = i - Integer.MIN_VALUE;
            } else {
                p6i0Var = new p6i0(this, ibkVar);
            }
        } else {
            p6i0Var = new p6i0(this, ibkVar);
        }
        Object obj2 = p6i0Var.f174403a;
        int i2 = p6i0Var.f174404b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Object c6i0Var = new c6i0(lzj.m60353c(this.f185828a.f196291a, "android.permission.RECORD_AUDIO") == 0);
            p6i0Var.f174404b = 1;
            Object objMo30229d = bqz0Var.mo30229d(c6i0Var, p6i0Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
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
