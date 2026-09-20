package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class zdo implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aeo f281773a;

    public zdo(aeo aeoVar) {
        this.f281773a = aeoVar;
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
        ydo ydoVar;
        if (ibkVar instanceof ydo) {
            ydoVar = (ydo) ibkVar;
            int i = ydoVar.f271792b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ydoVar.f271792b = i - Integer.MIN_VALUE;
            } else {
                ydoVar = new ydo(this, ibkVar);
            }
        } else {
            ydoVar = new ydo(this, ibkVar);
        }
        Object objM77869t = ydoVar.f271791a;
        int i2 = ydoVar.f271792b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ydoVar.f271794d;
                bga.m29073P(objM77869t);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM77869t);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM77869t);
        sdo sdoVar = this.f281773a.f14925a;
        ydoVar.f271794d = bqz0Var;
        ydoVar.f271792b = 1;
        objM77869t = sdoVar.m77869t(ydoVar);
        if (objM77869t != yukVar) {
        }
        return yukVar;
        ydoVar.f271794d = null;
        ydoVar.f271792b = 2;
    }
}
