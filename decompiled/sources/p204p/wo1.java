package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class wo1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g4b f253334a;

    public wo1(g4b g4bVar) {
        this.f253334a = g4bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vo1 vo1Var;
        if (ibkVar instanceof vo1) {
            vo1Var = (vo1) ibkVar;
            int i = vo1Var.f243301b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vo1Var.f243301b = i - Integer.MIN_VALUE;
            } else {
                vo1Var = new vo1(this, ibkVar);
            }
        } else {
            vo1Var = new vo1(this, ibkVar);
        }
        Object objM43523a = vo1Var.f243300a;
        int i2 = vo1Var.f243301b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = vo1Var.f243303d;
                bga.m29073P(objM43523a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM43523a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM43523a);
        vo1Var.f243303d = bqz0Var;
        vo1Var.f243301b = 1;
        objM43523a = this.f253334a.m43523a((an1) obj, vo1Var);
        if (objM43523a != yukVar) {
        }
        return yukVar;
        vo1Var.f243303d = null;
        vo1Var.f243301b = 2;
    }
}
