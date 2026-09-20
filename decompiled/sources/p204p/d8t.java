package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class d8t implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q140 f46517a;

    public d8t(q140 q140Var) {
        this.f46517a = q140Var;
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
        c8t c8tVar;
        if (ibkVar instanceof c8t) {
            c8tVar = (c8t) ibkVar;
            int i = c8tVar.f35313b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8tVar.f35313b = i - Integer.MIN_VALUE;
            } else {
                c8tVar = new c8t(this, ibkVar);
            }
        } else {
            c8tVar = new c8t(this, ibkVar);
        }
        Object objM86340z = c8tVar.f35312a;
        int i2 = c8tVar.f35313b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = c8tVar.f35315d;
                bga.m29073P(objM86340z);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86340z);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM86340z);
        c8tVar.f35315d = bqz0Var;
        c8tVar.f35313b = 1;
        objM86340z = vsf1.m86340z(this.f46517a, (w7t) obj, c8tVar);
        if (objM86340z != yukVar) {
        }
        return yukVar;
        c8tVar.f35315d = null;
        c8tVar.f35313b = 2;
    }
}
