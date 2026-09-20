package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class q5e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w221 f185517a;

    public q5e1(w221 w221Var) {
        this.f185517a = w221Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        p5e1 p5e1Var;
        if (ibkVar instanceof p5e1) {
            p5e1Var = (p5e1) ibkVar;
            int i = p5e1Var.f174157b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p5e1Var.f174157b = i - Integer.MIN_VALUE;
            } else {
                p5e1Var = new p5e1(this, ibkVar);
            }
        } else {
            p5e1Var = new p5e1(this, ibkVar);
        }
        Object obj2 = p5e1Var.f174156a;
        int i2 = p5e1Var.f174157b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            z4e1 z4e1Var = (z4e1) obj;
            try {
                ((ow6) ((m3n) this.f185517a.f247211b).f139686b).mo68157f();
            } catch (Exception unused) {
            }
            Object k6e1Var = new k6e1(z4e1Var.f279227a);
            p5e1Var.f174157b = 1;
            Object objMo30229d = bqz0Var.mo30229d(k6e1Var, p5e1Var);
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
