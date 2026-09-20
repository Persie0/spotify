package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class vuj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wuj f244998a;

    public vuj(wuj wujVar) {
        this.f244998a = wujVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        uuj uujVar;
        if (ibkVar instanceof uuj) {
            uujVar = (uuj) ibkVar;
            int i = uujVar.f234209b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uujVar.f234209b = i - Integer.MIN_VALUE;
            } else {
                uujVar = new uuj(this, ibkVar);
            }
        } else {
            uujVar = new uuj(this, ibkVar);
        }
        Object objM31914m = uujVar.f234208a;
        int i2 = uujVar.f234209b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = uujVar.f234211d;
                bga.m29073P(objM31914m);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM31914m);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM31914m);
        c9a c9aVar = this.f244998a.f255211a;
        String str = ((yuj) obj).f276402a;
        uujVar.f234211d = bqz0Var;
        uujVar.f234209b = 1;
        objM31914m = c9aVar.m31914m(str, uujVar);
        if (objM31914m != yukVar) {
        }
        return yukVar;
        evj evjVar = new evj((qf40) objM31914m);
        uujVar.f234211d = null;
        uujVar.f234209b = 2;
    }
}
