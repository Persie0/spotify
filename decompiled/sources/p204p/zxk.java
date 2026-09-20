package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class zxk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p0p0 f287336a;

    public zxk(p0p0 p0p0Var) {
        this.f287336a = p0p0Var;
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
        yxk yxkVar;
        if (ibkVar instanceof yxk) {
            yxkVar = (yxk) ibkVar;
            int i = yxkVar.f277265b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxkVar.f277265b = i - Integer.MIN_VALUE;
            } else {
                yxkVar = new yxk(this, ibkVar);
            }
        } else {
            yxkVar = new yxk(this, ibkVar);
        }
        Object objM68723a = yxkVar.f277264a;
        int i2 = yxkVar.f277265b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = yxkVar.f277267d;
                bga.m29073P(objM68723a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM68723a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM68723a);
        yxkVar.f277267d = bqz0Var;
        yxkVar.f277265b = 1;
        objM68723a = this.f287336a.m68723a((pxk) obj, yxkVar);
        if (objM68723a != yukVar) {
        }
        return yukVar;
        yxkVar.f277267d = null;
        yxkVar.f277265b = 2;
    }
}
