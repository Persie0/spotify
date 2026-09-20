package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class s61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f205973a;

    public s61(x61 x61Var) {
        this.f205973a = x61Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r12.mo30229d(r13, r7) == r9) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        r61 r61Var;
        if (ibkVar instanceof r61) {
            r61Var = (r61) ibkVar;
            int i = r61Var.f196157b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r61Var.f196157b = i - Integer.MIN_VALUE;
            } else {
                r61Var = new r61(this, ibkVar);
            }
        } else {
            r61Var = new r61(this, ibkVar);
        }
        r61 r61Var2 = r61Var;
        Object objM24833e = r61Var2.f196156a;
        int i2 = r61Var2.f196157b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = r61Var2.f196159d;
                bga.m29073P(objM24833e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM24833e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM24833e);
        q51 q51Var = (q51) obj;
        a61 a61Var = this.f205973a.f258554a;
        String str = q51Var.f185369b;
        String str2 = q51Var.f185370c;
        ss8 ss8Var = q51Var.f185371d;
        ss8 ss8Var2 = q51Var.f185372e;
        boolean z = q51Var.f185373f;
        r61Var2.f196159d = bqz0Var;
        r61Var2.f196157b = 1;
        objM24833e = a61Var.m24833e(str, str2, ss8Var, ss8Var2, z, r61Var2);
        if (objM24833e != yukVar) {
        }
        return yukVar;
        r61Var2.f196159d = null;
        r61Var2.f196157b = 2;
    }
}
