package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class s1c1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bya0 f204683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9r0 f204684b;

    public s1c1(bya0 bya0Var, z9r0 z9r0Var) {
        this.f204683a = bya0Var;
        this.f204684b = z9r0Var;
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
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        r1c1 r1c1Var;
        if (ibkVar instanceof r1c1) {
            r1c1Var = (r1c1) ibkVar;
            int i = r1c1Var.f194820b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r1c1Var.f194820b = i - Integer.MIN_VALUE;
            } else {
                r1c1Var = new r1c1(this, ibkVar);
            }
        } else {
            r1c1Var = new r1c1(this, ibkVar);
        }
        Object objM89632b = r1c1Var.f194819a;
        int i2 = r1c1Var.f194820b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = r1c1Var.f194822d;
                bga.m29073P(objM89632b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89632b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89632b);
        r1c1Var.f194822d = bqz0Var;
        r1c1Var.f194820b = 1;
        objM89632b = x1c1.m89632b(this.f204683a, this.f204684b, r1c1Var);
        if (objM89632b != yukVar) {
        }
        return yukVar;
        r1c1Var.f194822d = null;
        r1c1Var.f194820b = 2;
    }
}
