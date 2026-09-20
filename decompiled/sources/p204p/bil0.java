package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class bil0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kil0 f27510a;

    public bil0(kil0 kil0Var) {
        this.f27510a = kil0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ail0 ail0Var;
        if (ibkVar instanceof ail0) {
            ail0Var = (ail0) ibkVar;
            int i = ail0Var.f16010b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ail0Var.f16010b = i - Integer.MIN_VALUE;
            } else {
                ail0Var = new ail0(this, ibkVar);
            }
        } else {
            ail0Var = new ail0(this, ibkVar);
        }
        Object objM88079b = ail0Var.f16009a;
        int i2 = ail0Var.f16010b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ail0Var.f16012d;
                bga.m29073P(objM88079b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM88079b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM88079b);
        wgw0 wgw0Var = this.f27510a.f123009a;
        ail0Var.f16012d = bqz0Var;
        ail0Var.f16010b = 1;
        objM88079b = wgw0Var.m88079b((nhl0) obj, ail0Var);
        if (objM88079b != yukVar) {
        }
        return yukVar;
        ail0Var.f16012d = null;
        ail0Var.f16010b = 2;
    }
}
