package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class bg2 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eg2 f26817a;

    public bg2(eg2 eg2Var) {
        this.f26817a = eg2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ag2 ag2Var;
        if (ibkVar instanceof ag2) {
            ag2Var = (ag2) ibkVar;
            int i = ag2Var.f15271b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag2Var.f15271b = i - Integer.MIN_VALUE;
            } else {
                ag2Var = new ag2(this, ibkVar);
            }
        } else {
            ag2Var = new ag2(this, ibkVar);
        }
        Object objM56001m = ag2Var.f15270a;
        int i2 = ag2Var.f15271b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ag2Var.f15273d;
                bga.m29073P(objM56001m);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56001m);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56001m);
        df2 df2Var = (df2) obj;
        kc5 kc5Var = this.f26817a.f59200a;
        adb1 adb1Var = df2Var.f48219a;
        String str = df2Var.f48220b;
        int i3 = df2Var.f48221c;
        ag2Var.f15273d = bqz0Var;
        ag2Var.f15271b = 1;
        objM56001m = kc5Var.m56001m(adb1Var, str, i3, ag2Var);
        if (objM56001m != yukVar) {
        }
        return yukVar;
        ag2Var.f15273d = null;
        ag2Var.f15271b = 2;
    }
}
