package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class yzj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c0k0 f277835a;

    public yzj0(c0k0 c0k0Var) {
        this.f277835a = c0k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xzj0 xzj0Var;
        if (ibkVar instanceof xzj0) {
            xzj0Var = (xzj0) ibkVar;
            int i = xzj0Var.f267676b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xzj0Var.f267676b = i - Integer.MIN_VALUE;
            } else {
                xzj0Var = new xzj0(this, ibkVar);
            }
        } else {
            xzj0Var = new xzj0(this, ibkVar);
        }
        Object obj2 = xzj0Var.f267675a;
        int i2 = xzj0Var.f267676b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            c0k0 c0k0Var = this.f277835a;
            v1k0 v1k0Var = c0k0Var.f32807d;
            Object h0k0Var = new h0k0(v1k0Var.f236405a.m57999d(c0k0Var.f32804a));
            xzj0Var.f267676b = 1;
            Object objMo30229d = bqz0Var.mo30229d(h0k0Var, xzj0Var);
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
