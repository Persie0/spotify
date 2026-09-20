package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class wab1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xab1 f249440a;

    public wab1(xab1 xab1Var) {
        this.f249440a = xab1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r1.mo30229d(r3, r2) == r6) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        vab1 vab1Var;
        bqz0 bqz0Var2;
        Object objM89557A;
        if (ibkVar instanceof vab1) {
            vab1Var = (vab1) ibkVar;
            int i = vab1Var.f239177b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vab1Var.f239177b = i - Integer.MIN_VALUE;
            } else {
                vab1Var = new vab1(this, ibkVar);
            }
        } else {
            vab1Var = new vab1(this, ibkVar);
        }
        Object obj2 = vab1Var.f239176a;
        int i2 = vab1Var.f239177b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0 bqz0Var3 = vab1Var.f239179d;
                bga.m29073P(obj2);
                objM89557A = obj2;
                bqz0Var2 = bqz0Var3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        pab1 pab1Var = (pab1) obj;
        String str = pab1Var.f175464a;
        String str2 = pab1Var.f175465b;
        int i3 = pab1Var.f175466c;
        long j = pab1Var.f175467d;
        bqz0Var2 = bqz0Var;
        vab1Var.f239179d = bqz0Var2;
        vab1Var.f239177b = 1;
        xab1 xab1Var = this.f249440a;
        objM89557A = x0h1.m89557A(xab1Var.f259649a, new C2004j6(xab1Var, i3, j, str, str2, (fbk) null), vab1Var);
        if (objM89557A != yukVar) {
        }
        return yukVar;
        vab1Var.f239179d = null;
        vab1Var.f239177b = 2;
    }
}
