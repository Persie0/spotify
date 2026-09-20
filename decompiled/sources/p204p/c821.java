package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class c821 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gc41 f35085a;

    public c821(gc41 gc41Var) {
        this.f35085a = gc41Var;
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
        b821 b821Var;
        if (ibkVar instanceof b821) {
            b821Var = (b821) ibkVar;
            int i = b821Var.f24461b;
            if ((i & Integer.MIN_VALUE) != 0) {
                b821Var.f24461b = i - Integer.MIN_VALUE;
            } else {
                b821Var = new b821(this, ibkVar);
            }
        } else {
            b821Var = new b821(this, ibkVar);
        }
        Object objM44291g = b821Var.f24460a;
        int i2 = b821Var.f24461b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = b821Var.f24463d;
                bga.m29073P(objM44291g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM44291g);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM44291g);
        b821Var.f24463d = bqz0Var;
        b821Var.f24461b = 1;
        objM44291g = this.f35085a.m44291g((s721) obj, b821Var);
        if (objM44291g != yukVar) {
        }
        return yukVar;
        b821Var.f24463d = null;
        b821Var.f24461b = 2;
    }
}
