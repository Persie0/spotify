package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class a8e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r7e1 f13272a;

    public a8e1(r7e1 r7e1Var) {
        this.f13272a = r7e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        z7e1 z7e1Var;
        if (ibkVar instanceof z7e1) {
            z7e1Var = (z7e1) ibkVar;
            int i = z7e1Var.f280186b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z7e1Var.f280186b = i - Integer.MIN_VALUE;
            } else {
                z7e1Var = new z7e1(this, ibkVar);
            }
        } else {
            z7e1Var = new z7e1(this, ibkVar);
        }
        Object objM74901d = z7e1Var.f280185a;
        int i2 = z7e1Var.f280186b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = z7e1Var.f280188d;
                bga.m29073P(objM74901d);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM74901d);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM74901d);
        l7e1 l7e1Var = (l7e1) obj;
        String str = l7e1Var.f130634e;
        String str2 = l7e1Var.f130635f;
        z7e1Var.f280188d = bqz0Var;
        z7e1Var.f280186b = 1;
        objM74901d = this.f13272a.m74901d(str, str2, z7e1Var);
        if (objM74901d != yukVar) {
        }
        return yukVar;
        z7e1Var.f280188d = null;
        z7e1Var.f280186b = 2;
    }
}
