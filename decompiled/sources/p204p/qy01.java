package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class qy01 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ okj0 f193781a;

    public qy01(okj0 okj0Var) {
        this.f193781a = okj0Var;
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
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        py01 py01Var;
        if (ibkVar instanceof py01) {
            py01Var = (py01) ibkVar;
            int i = py01Var.f183287b;
            if ((i & Integer.MIN_VALUE) != 0) {
                py01Var.f183287b = i - Integer.MIN_VALUE;
            } else {
                py01Var = new py01(this, ibkVar);
            }
        } else {
            py01Var = new py01(this, ibkVar);
        }
        Object objM67250s = py01Var.f183286a;
        int i2 = py01Var.f183287b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = py01Var.f183289d;
                bga.m29073P(objM67250s);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67250s);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM67250s);
        py01Var.f183289d = bqz0Var;
        py01Var.f183287b = 1;
        objM67250s = this.f193781a.m67250s((yz01) obj, py01Var);
        if (objM67250s != yukVar) {
        }
        return yukVar;
        py01Var.f183289d = null;
        py01Var.f183287b = 2;
    }
}
