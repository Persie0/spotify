package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class bz81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fz81 f32441a;

    public bz81(fz81 fz81Var) {
        this.f32441a = fz81Var;
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
        az81 az81Var;
        if (ibkVar instanceof az81) {
            az81Var = (az81) ibkVar;
            int i = az81Var.f21456b;
            if ((i & Integer.MIN_VALUE) != 0) {
                az81Var.f21456b = i - Integer.MIN_VALUE;
            } else {
                az81Var = new az81(this, ibkVar);
            }
        } else {
            az81Var = new az81(this, ibkVar);
        }
        Object objM43176a = az81Var.f21455a;
        int i2 = az81Var.f21456b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = az81Var.f21458d;
                bga.m29073P(objM43176a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM43176a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM43176a);
        az81Var.f21458d = bqz0Var;
        az81Var.f21456b = 1;
        objM43176a = fz81.m43176a(this.f32441a, (hz81) obj, az81Var);
        if (objM43176a != yukVar) {
        }
        return yukVar;
        az81Var.f21458d = null;
        az81Var.f21456b = 2;
    }
}
