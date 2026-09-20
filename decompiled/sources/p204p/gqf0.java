package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class gqf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqf0 f83467a;

    public gqf0(hqf0 hqf0Var) {
        this.f83467a = hqf0Var;
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
        fqf0 fqf0Var;
        if (ibkVar instanceof fqf0) {
            fqf0Var = (fqf0) ibkVar;
            int i = fqf0Var.f72168b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqf0Var.f72168b = i - Integer.MIN_VALUE;
            } else {
                fqf0Var = new fqf0(this, ibkVar);
            }
        } else {
            fqf0Var = new fqf0(this, ibkVar);
        }
        Object objM61126g = fqf0Var.f72167a;
        int i2 = fqf0Var.f72168b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = fqf0Var.f72170d;
                bga.m29073P(objM61126g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61126g);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM61126g);
        m8p0 m8p0Var = this.f83467a.f94171c;
        fqf0Var.f72170d = bqz0Var;
        fqf0Var.f72168b = 1;
        objM61126g = m8p0Var.m61126g((aqf0) obj, fqf0Var);
        if (objM61126g != yukVar) {
        }
        return yukVar;
        fqf0Var.f72170d = null;
        fqf0Var.f72168b = 2;
    }
}
