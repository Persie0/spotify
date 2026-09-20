package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: renamed from: p.b5 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1692b5 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1729c5 f23437a;

    public C1692b5(C1729c5 c1729c5) {
        this.f23437a = c1729c5;
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
        C1655a5 c1655a5;
        if (ibkVar instanceof C1655a5) {
            c1655a5 = (C1655a5) ibkVar;
            int i = c1655a5.f12358b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1655a5.f12358b = i - Integer.MIN_VALUE;
            } else {
                c1655a5 = new C1655a5(this, ibkVar);
            }
        } else {
            c1655a5 = new C1655a5(this, ibkVar);
        }
        Object objM31450e = c1655a5.f12357a;
        int i2 = c1655a5.f12358b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = c1655a5.f12360d;
                bga.m29073P(objM31450e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM31450e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM31450e);
        String str = ((C2039k4) obj).f119033a;
        c1655a5.f12360d = bqz0Var;
        c1655a5.f12358b = 1;
        objM31450e = C1729c5.m31450e(this.f23437a, str, c1655a5);
        if (objM31450e != yukVar) {
        }
        return yukVar;
        c1655a5.f12360d = null;
        c1655a5.f12358b = 2;
    }
}
