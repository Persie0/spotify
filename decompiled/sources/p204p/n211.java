package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class n211 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ou01 f149604a;

    public n211(ou01 ou01Var) {
        this.f149604a = ou01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        m211 m211Var;
        if (ibkVar instanceof m211) {
            m211Var = (m211) ibkVar;
            int i = m211Var.f139186b;
            if ((i & Integer.MIN_VALUE) != 0) {
                m211Var.f139186b = i - Integer.MIN_VALUE;
            } else {
                m211Var = new m211(this, ibkVar);
            }
        } else {
            m211Var = new m211(this, ibkVar);
        }
        Object obj2 = m211Var.f139185a;
        int i2 = m211Var.f139186b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Object s211Var = new s211(this.f149604a.f170130a.mo48717l(ou01.f170129b, 0) > 0);
            m211Var.f139186b = 1;
            Object objMo30229d = bqz0Var.mo30229d(s211Var, m211Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
