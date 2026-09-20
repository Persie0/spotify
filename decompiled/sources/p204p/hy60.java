package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class hy60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f96475a;

    public hy60(iy60 iy60Var) {
        this.f96475a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r8.mo30229d(r7, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        gy60 gy60Var;
        if (ibkVar instanceof gy60) {
            gy60Var = (gy60) ibkVar;
            int i = gy60Var.f85482b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy60Var.f85482b = i - Integer.MIN_VALUE;
            } else {
                gy60Var = new gy60(this, ibkVar);
            }
        } else {
            gy60Var = new gy60(this, ibkVar);
        }
        Object objM86755t = gy60Var.f85481a;
        int i2 = gy60Var.f85482b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = gy60Var.f85484d;
                bga.m29073P(objM86755t);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM86755t);
        wv60 wv60Var = this.f96475a.f106870d;
        int i3 = 6;
        e560 e560Var = new e560(i3, wv60Var.f255424c, ((ax60) obj).f20772a);
        gy60Var.f85484d = bqz0Var;
        gy60Var.f85482b = 1;
        objM86755t = vyf1.m86755t(e560Var, gy60Var);
        if (objM86755t != yukVar) {
        }
        return yukVar;
        gw60 gw60Var = new gw60((String) objM86755t);
        gy60Var.f85484d = null;
        gy60Var.f85482b = 2;
    }
}
