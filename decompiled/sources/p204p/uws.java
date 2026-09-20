package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class uws implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oge0 f234730a;

    public uws(oge0 oge0Var) {
        this.f234730a = oge0Var;
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
        tws twsVar;
        if (ibkVar instanceof tws) {
            twsVar = (tws) ibkVar;
            int i = twsVar.f224472b;
            if ((i & Integer.MIN_VALUE) != 0) {
                twsVar.f224472b = i - Integer.MIN_VALUE;
            } else {
                twsVar = new tws(this, ibkVar);
            }
        } else {
            twsVar = new tws(this, ibkVar);
        }
        Object objM66885f = twsVar.f224471a;
        int i2 = twsVar.f224472b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = twsVar.f224474d;
                bga.m29073P(objM66885f);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM66885f);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM66885f);
        twsVar.f224474d = bqz0Var;
        twsVar.f224472b = 1;
        objM66885f = this.f234730a.m66885f((cws) obj, twsVar);
        if (objM66885f != yukVar) {
        }
        return yukVar;
        twsVar.f224474d = null;
        twsVar.f224472b = 2;
    }
}
