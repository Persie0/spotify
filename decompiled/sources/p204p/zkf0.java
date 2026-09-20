package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class zkf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ glf0 f283740a;

    public zkf0(glf0 glf0Var) {
        this.f283740a = glf0Var;
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
        ykf0 ykf0Var;
        if (ibkVar instanceof ykf0) {
            ykf0Var = (ykf0) ibkVar;
            int i = ykf0Var.f273687b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykf0Var.f273687b = i - Integer.MIN_VALUE;
            } else {
                ykf0Var = new ykf0(this, ibkVar);
            }
        } else {
            ykf0Var = new ykf0(this, ibkVar);
        }
        Object objM89891a = ykf0Var.f273686a;
        int i2 = ykf0Var.f273687b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ykf0Var.f273689d;
                bga.m29073P(objM89891a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89891a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89891a);
        x4j0 x4j0Var = this.f283740a.f81067a;
        ykf0Var.f273689d = bqz0Var;
        ykf0Var.f273687b = 1;
        objM89891a = x4j0Var.m89891a((zlf0) obj, ykf0Var);
        if (objM89891a != yukVar) {
        }
        return yukVar;
        ykf0Var.f273689d = null;
        ykf0Var.f273687b = 2;
    }
}
