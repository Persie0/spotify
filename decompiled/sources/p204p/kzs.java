package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class kzs implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bxb f128185a;

    public kzs(bxb bxbVar) {
        this.f128185a = bxbVar;
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
        jzs jzsVar;
        if (ibkVar instanceof jzs) {
            jzsVar = (jzs) ibkVar;
            int i = jzsVar.f117782b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzsVar.f117782b = i - Integer.MIN_VALUE;
            } else {
                jzsVar = new jzs(this, ibkVar);
            }
        } else {
            jzsVar = new jzs(this, ibkVar);
        }
        Object objM30793g = jzsVar.f117781a;
        int i2 = jzsVar.f117782b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = jzsVar.f117784d;
                bga.m29073P(objM30793g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30793g);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM30793g);
        jzsVar.f117784d = bqz0Var;
        jzsVar.f117782b = 1;
        objM30793g = this.f128185a.m30793g((azs) obj, jzsVar);
        if (objM30793g != yukVar) {
        }
        return yukVar;
        jzsVar.f117784d = null;
        jzsVar.f117782b = 2;
    }
}
