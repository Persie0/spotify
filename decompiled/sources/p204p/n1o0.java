package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class n1o0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o1o0 f149480a;

    public n1o0(o1o0 o1o0Var) {
        this.f149480a = o1o0Var;
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
        m1o0 m1o0Var;
        if (ibkVar instanceof m1o0) {
            m1o0Var = (m1o0) ibkVar;
            int i = m1o0Var.f139040b;
            if ((i & Integer.MIN_VALUE) != 0) {
                m1o0Var.f139040b = i - Integer.MIN_VALUE;
            } else {
                m1o0Var = new m1o0(this, ibkVar);
            }
        } else {
            m1o0Var = new m1o0(this, ibkVar);
        }
        Object objM34963d = m1o0Var.f139039a;
        int i2 = m1o0Var.f139040b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = m1o0Var.f139042d;
                bga.m29073P(objM34963d);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM34963d);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM34963d);
        d5a0 d5a0Var = this.f149480a.f160818a;
        int i3 = ((q0o0) obj).f184040a;
        m1o0Var.f139042d = bqz0Var;
        m1o0Var.f139040b = 1;
        objM34963d = d5a0Var.m34963d(i3, m1o0Var);
        if (objM34963d != yukVar) {
        }
        return yukVar;
        m1o0Var.f139042d = null;
        m1o0Var.f139040b = 2;
    }
}
