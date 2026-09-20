package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class n2e implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o2e f149748a;

    public n2e(o2e o2eVar) {
        this.f149748a = o2eVar;
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
        m2e m2eVar;
        if (ibkVar instanceof m2e) {
            m2eVar = (m2e) ibkVar;
            int i = m2eVar.f139324b;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2eVar.f139324b = i - Integer.MIN_VALUE;
            } else {
                m2eVar = new m2e(this, ibkVar);
            }
        } else {
            m2eVar = new m2e(this, ibkVar);
        }
        Object objM31892p = m2eVar.f139323a;
        int i2 = m2eVar.f139324b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = m2eVar.f139326d;
                bga.m29073P(objM31892p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM31892p);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM31892p);
        c97 c97Var = this.f149748a.f161035b;
        m2eVar.f139326d = bqz0Var;
        m2eVar.f139324b = 1;
        objM31892p = c97Var.m31892p(m2eVar);
        if (objM31892p != yukVar) {
        }
        return yukVar;
        m2eVar.f139326d = null;
        m2eVar.f139324b = 2;
    }
}
