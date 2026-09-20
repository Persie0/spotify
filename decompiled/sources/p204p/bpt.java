package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class bpt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mpt f29603a;

    public bpt(mpt mptVar) {
        this.f29603a = mptVar;
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
        apt aptVar;
        if (ibkVar instanceof apt) {
            aptVar = (apt) ibkVar;
            int i = aptVar.f18008b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aptVar.f18008b = i - Integer.MIN_VALUE;
            } else {
                aptVar = new apt(this, ibkVar);
            }
        } else {
            aptVar = new apt(this, ibkVar);
        }
        Object objM76585h = aptVar.f18007a;
        int i2 = aptVar.f18008b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = aptVar.f18010d;
                bga.m29073P(objM76585h);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76585h);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM76585h);
        rwt0 rwt0Var = this.f29603a.f146087a;
        aptVar.f18010d = bqz0Var;
        aptVar.f18008b = 1;
        objM76585h = rwt0Var.m76585h((fjt) obj, aptVar);
        if (objM76585h != yukVar) {
        }
        return yukVar;
        aptVar.f18010d = null;
        aptVar.f18008b = 2;
    }
}
