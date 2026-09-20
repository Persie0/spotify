package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class l1o0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o1o0 f128763a;

    public l1o0(o1o0 o1o0Var) {
        this.f128763a = o1o0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        k1o0 k1o0Var;
        if (ibkVar instanceof k1o0) {
            k1o0Var = (k1o0) ibkVar;
            int i = k1o0Var.f118401b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k1o0Var.f118401b = i - Integer.MIN_VALUE;
            } else {
                k1o0Var = new k1o0(this, ibkVar);
            }
        } else {
            k1o0Var = new k1o0(this, ibkVar);
        }
        Object objM34960A = k1o0Var.f118400a;
        int i2 = k1o0Var.f118401b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = k1o0Var.f118403d;
                bga.m29073P(objM34960A);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM34960A);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM34960A);
        d5a0 d5a0Var = this.f128763a.f160818a;
        String str = ((x0o0) obj).f256917a;
        k1o0Var.f118403d = bqz0Var;
        k1o0Var.f118401b = 1;
        objM34960A = d5a0Var.m34960A(str, k1o0Var);
        if (objM34960A != yukVar) {
        }
        return yukVar;
        k1o0Var.f118403d = null;
        k1o0Var.f118401b = 2;
    }
}
