package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class a0k0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c0k0 f11097a;

    public a0k0(c0k0 c0k0Var) {
        this.f11097a = c0k0Var;
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
        zzj0 zzj0Var;
        if (ibkVar instanceof zzj0) {
            zzj0Var = (zzj0) ibkVar;
            int i = zzj0Var.f288008b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzj0Var.f288008b = i - Integer.MIN_VALUE;
            } else {
                zzj0Var = new zzj0(this, ibkVar);
            }
        } else {
            zzj0Var = new zzj0(this, ibkVar);
        }
        Object objM31183a = zzj0Var.f288007a;
        int i2 = zzj0Var.f288008b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = zzj0Var.f288010d;
                bga.m29073P(objM31183a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM31183a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM31183a);
        String str = ((nzj0) obj).f160099a;
        zzj0Var.f288010d = bqz0Var;
        zzj0Var.f288008b = 1;
        objM31183a = c0k0.m31183a(this.f11097a, str, zzj0Var);
        if (objM31183a != yukVar) {
        }
        return yukVar;
        zzj0Var.f288010d = null;
        zzj0Var.f288008b = 2;
    }
}
