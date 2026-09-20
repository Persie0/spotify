package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class kxm0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lxm0 f127524a;

    public kxm0(lxm0 lxm0Var) {
        this.f127524a = lxm0Var;
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
        jxm0 jxm0Var;
        if (ibkVar instanceof jxm0) {
            jxm0Var = (jxm0) ibkVar;
            int i = jxm0Var.f117156b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jxm0Var.f117156b = i - Integer.MIN_VALUE;
            } else {
                jxm0Var = new jxm0(this, ibkVar);
            }
        } else {
            jxm0Var = new jxm0(this, ibkVar);
        }
        Object objM35424v = jxm0Var.f117155a;
        int i2 = jxm0Var.f117156b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = jxm0Var.f117158d;
                bga.m29073P(objM35424v);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM35424v);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM35424v);
        da80 da80Var = this.f127524a.f137841a;
        jxm0Var.f117158d = bqz0Var;
        jxm0Var.f117156b = 1;
        objM35424v = da80Var.m35424v(jxm0Var);
        if (objM35424v != yukVar) {
        }
        return yukVar;
        jxm0Var.f117158d = null;
        jxm0Var.f117156b = 2;
    }
}
