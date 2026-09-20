package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class dlf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ glf0 f50202a;

    public dlf0(glf0 glf0Var) {
        this.f50202a = glf0Var;
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
        clf0 clf0Var;
        if (ibkVar instanceof clf0) {
            clf0Var = (clf0) ibkVar;
            int i = clf0Var.f39274b;
            if ((i & Integer.MIN_VALUE) != 0) {
                clf0Var.f39274b = i - Integer.MIN_VALUE;
            } else {
                clf0Var = new clf0(this, ibkVar);
            }
        } else {
            clf0Var = new clf0(this, ibkVar);
        }
        Object objM88157j = clf0Var.f39273a;
        int i2 = clf0Var.f39274b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = clf0Var.f39276d;
                bga.m29073P(objM88157j);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM88157j);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM88157j);
        whp whpVar = this.f50202a.f81077k;
        clf0Var.f39276d = bqz0Var;
        clf0Var.f39274b = 1;
        objM88157j = whpVar.m88157j((rlf0) obj, clf0Var);
        if (objM88157j != yukVar) {
        }
        return yukVar;
        clf0Var.f39276d = null;
        clf0Var.f39274b = 2;
    }
}
