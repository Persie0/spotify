package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class aio0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dio0 f16069a;

    public aio0(dio0 dio0Var) {
        this.f16069a = dio0Var;
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
        zho0 zho0Var;
        if (ibkVar instanceof zho0) {
            zho0Var = (zho0) ibkVar;
            int i = zho0Var.f282994b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zho0Var.f282994b = i - Integer.MIN_VALUE;
            } else {
                zho0Var = new zho0(this, ibkVar);
            }
        } else {
            zho0Var = new zho0(this, ibkVar);
        }
        Object objM36126a = zho0Var.f282993a;
        int i2 = zho0Var.f282994b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = zho0Var.f282996d;
                bga.m29073P(objM36126a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM36126a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM36126a);
        zho0Var.f282996d = bqz0Var;
        zho0Var.f282994b = 1;
        objM36126a = dio0.m36126a(this.f16069a, (lho0) obj, zho0Var);
        if (objM36126a != yukVar) {
        }
        return yukVar;
        zho0Var.f282996d = null;
        zho0Var.f282994b = 2;
    }
}
