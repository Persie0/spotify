package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class b8t implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q140 f24655a;

    public b8t(q140 q140Var) {
        this.f24655a = q140Var;
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
        a8t a8tVar;
        if (ibkVar instanceof a8t) {
            a8tVar = (a8t) ibkVar;
            int i = a8tVar.f13372b;
            if ((i & Integer.MIN_VALUE) != 0) {
                a8tVar.f13372b = i - Integer.MIN_VALUE;
            } else {
                a8tVar = new a8t(this, ibkVar);
            }
        } else {
            a8tVar = new a8t(this, ibkVar);
        }
        Object objM53192o = a8tVar.f13371a;
        int i2 = a8tVar.f13372b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = a8tVar.f13374d;
                bga.m29073P(objM53192o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM53192o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM53192o);
        a8tVar.f13374d = bqz0Var;
        a8tVar.f13372b = 1;
        objM53192o = jfg1.m53192o(this.f24655a, (x7t) obj, a8tVar);
        if (objM53192o != yukVar) {
        }
        return yukVar;
        a8tVar.f13374d = null;
        a8tVar.f13372b = 2;
    }
}
