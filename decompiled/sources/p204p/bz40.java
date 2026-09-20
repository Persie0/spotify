package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class bz40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cz40 f32405a;

    public bz40(cz40 cz40Var) {
        this.f32405a = cz40Var;
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
        az40 az40Var;
        if (ibkVar instanceof az40) {
            az40Var = (az40) ibkVar;
            int i = az40Var.f21423b;
            if ((i & Integer.MIN_VALUE) != 0) {
                az40Var.f21423b = i - Integer.MIN_VALUE;
            } else {
                az40Var = new az40(this, ibkVar);
            }
        } else {
            az40Var = new az40(this, ibkVar);
        }
        Object objM57479q = az40Var.f21422a;
        int i2 = az40Var.f21423b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = az40Var.f21425d;
                bga.m29073P(objM57479q);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM57479q);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM57479q);
        fs9 fs9Var = this.f32405a.f43468a;
        String str = ((xy40) obj).f267214a;
        az40Var.f21425d = bqz0Var;
        az40Var.f21423b = 1;
        objM57479q = kvf1.m57479q(fs9Var, str, az40Var);
        if (objM57479q != yukVar) {
        }
        return yukVar;
        az40Var.f21425d = null;
        az40Var.f21423b = 2;
    }
}
