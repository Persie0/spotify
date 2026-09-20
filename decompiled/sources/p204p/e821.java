package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class e821 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x610 f57049a;

    public e821(x610 x610Var) {
        this.f57049a = x610Var;
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
        d821 d821Var;
        if (ibkVar instanceof d821) {
            d821Var = (d821) ibkVar;
            int i = d821Var.f46336b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d821Var.f46336b = i - Integer.MIN_VALUE;
            } else {
                d821Var = new d821(this, ibkVar);
            }
        } else {
            d821Var = new d821(this, ibkVar);
        }
        Object objM90066o = d821Var.f46335a;
        int i2 = d821Var.f46336b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = d821Var.f46338d;
                bga.m29073P(objM90066o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM90066o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM90066o);
        d821Var.f46338d = bqz0Var;
        d821Var.f46336b = 1;
        objM90066o = this.f57049a.m90066o((m721) obj, d821Var);
        if (objM90066o != yukVar) {
        }
        return yukVar;
        d821Var.f46338d = null;
        d821Var.f46336b = 2;
    }
}
