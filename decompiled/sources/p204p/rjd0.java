package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class rjd0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ujd0 f199795a;

    public rjd0(ujd0 ujd0Var) {
        this.f199795a = ujd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qjd0 qjd0Var;
        if (ibkVar instanceof qjd0) {
            qjd0Var = (qjd0) ibkVar;
            int i = qjd0Var.f189221b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qjd0Var.f189221b = i - Integer.MIN_VALUE;
            } else {
                qjd0Var = new qjd0(this, ibkVar);
            }
        } else {
            qjd0Var = new qjd0(this, ibkVar);
        }
        Object obj2 = qjd0Var.f189220a;
        int i2 = qjd0Var.f189221b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Object wid0Var = new wid0(this.f199795a.f230971a.m73833e(((bid0) obj).f27402a));
            qjd0Var.f189221b = 1;
            Object objMo30229d = bqz0Var.mo30229d(wid0Var, qjd0Var);
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
