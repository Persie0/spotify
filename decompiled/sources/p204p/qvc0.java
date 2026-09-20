package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class qvc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tvc0 f192967a;

    public qvc0(tvc0 tvc0Var) {
        this.f192967a = tvc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        pvc0 pvc0Var;
        if (ibkVar instanceof pvc0) {
            pvc0Var = (pvc0) ibkVar;
            int i = pvc0Var.f181686b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pvc0Var.f181686b = i - Integer.MIN_VALUE;
            } else {
                pvc0Var = new pvc0(this, ibkVar);
            }
        } else {
            pvc0Var = new pvc0(this, ibkVar);
        }
        Object obj2 = pvc0Var.f181685a;
        int i2 = pvc0Var.f181686b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Object wvc0Var = new wvc0(((ktc0) obj).f126241a, lzj.m60353c(this.f192967a.f224124Q0.f22920a, "android.permission.RECORD_AUDIO") == 0);
            pvc0Var.f181686b = 1;
            Object objMo30229d = bqz0Var.mo30229d(wvc0Var, pvc0Var);
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
