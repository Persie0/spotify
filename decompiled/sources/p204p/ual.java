package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class ual implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ val f228512a;

    public ual(val valVar) {
        this.f228512a = valVar;
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
        tal talVar;
        if (ibkVar instanceof tal) {
            talVar = (tal) ibkVar;
            int i = talVar.f218627b;
            if ((i & Integer.MIN_VALUE) != 0) {
                talVar.f218627b = i - Integer.MIN_VALUE;
            } else {
                talVar = new tal(this, ibkVar);
            }
        } else {
            talVar = new tal(this, ibkVar);
        }
        Object objM31913l = talVar.f218626a;
        int i2 = talVar.f218627b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = talVar.f218629d;
                bga.m29073P(objM31913l);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM31913l);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM31913l);
        c9a c9aVar = this.f228512a.f239295b;
        talVar.f218629d = bqz0Var;
        talVar.f218627b = 1;
        objM31913l = c9aVar.m31913l((wet) obj, talVar);
        if (objM31913l != yukVar) {
        }
        return yukVar;
        talVar.f218629d = null;
        talVar.f218627b = 2;
    }
}
