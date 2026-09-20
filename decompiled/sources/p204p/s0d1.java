package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes11.dex */
public final class s0d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v0d1 f204362a;

    public s0d1(v0d1 v0d1Var) {
        this.f204362a = v0d1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r9.mo30229d(r10, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        r0d1 r0d1Var;
        if (ibkVar instanceof r0d1) {
            r0d1Var = (r0d1) ibkVar;
            int i = r0d1Var.f194470b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0d1Var.f194470b = i - Integer.MIN_VALUE;
            } else {
                r0d1Var = new r0d1(this, ibkVar);
            }
        } else {
            r0d1Var = new r0d1(this, ibkVar);
        }
        Object objM89557A = r0d1Var.f194469a;
        int i2 = r0d1Var.f194470b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = r0d1Var.f194472d;
                bga.m29073P(objM89557A);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89557A);
        r0d1Var.f194472d = bqz0Var;
        r0d1Var.f194470b = 1;
        v0d1 v0d1Var = this.f204362a;
        objM89557A = x0h1.m89557A(v0d1Var.f235974e, new w9a1((k0d1) obj, v0d1Var, fbkVar, 19), r0d1Var);
        if (objM89557A != yukVar) {
        }
        return yukVar;
        r0d1Var.f194472d = null;
        r0d1Var.f194470b = 2;
    }
}
