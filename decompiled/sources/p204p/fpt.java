package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class fpt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt f71998a;

    public fpt(spt sptVar) {
        this.f71998a = sptVar;
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
        dpt dptVar;
        if (ibkVar instanceof dpt) {
            dptVar = (dpt) ibkVar;
            int i = dptVar.f51741b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dptVar.f51741b = i - Integer.MIN_VALUE;
            } else {
                dptVar = new dpt(this, ibkVar);
            }
        } else {
            dptVar = new dpt(this, ibkVar);
        }
        Object objM48689k = dptVar.f51740a;
        int i2 = dptVar.f51741b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = dptVar.f51743d;
                bga.m29073P(objM48689k);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM48689k);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM48689k);
        hun0 hun0Var = this.f71998a.f212942b;
        dptVar.f51743d = bqz0Var;
        dptVar.f51741b = 1;
        objM48689k = hun0Var.m48689k((mit) obj, dptVar);
        if (objM48689k != yukVar) {
        }
        return yukVar;
        dptVar.f51743d = null;
        dptVar.f51741b = 2;
    }
}
