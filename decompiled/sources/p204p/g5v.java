package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class g5v implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i2v f76772a;

    public g5v(i2v i2vVar) {
        this.f76772a = i2vVar;
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
        f5v f5vVar;
        if (ibkVar instanceof f5v) {
            f5vVar = (f5v) ibkVar;
            int i = f5vVar.f66179b;
            if ((i & Integer.MIN_VALUE) != 0) {
                f5vVar.f66179b = i - Integer.MIN_VALUE;
            } else {
                f5vVar = new f5v(this, ibkVar);
            }
        } else {
            f5vVar = new f5v(this, ibkVar);
        }
        Object objM49522r = f5vVar.f66178a;
        int i2 = f5vVar.f66179b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = f5vVar.f66181d;
                bga.m29073P(objM49522r);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM49522r);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM49522r);
        f5vVar.f66181d = bqz0Var;
        f5vVar.f66179b = 1;
        objM49522r = this.f76772a.m49522r(f5vVar);
        if (objM49522r != yukVar) {
        }
        return yukVar;
        f5vVar.f66181d = null;
        f5vVar.f66179b = 2;
    }
}
