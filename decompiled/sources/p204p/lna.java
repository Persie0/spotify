package p204p;

import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class lna implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pz90 f135124a;

    public lna(pz90 pz90Var) {
        this.f135124a = pz90Var;
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
        kna knaVar;
        if (ibkVar instanceof kna) {
            knaVar = (kna) ibkVar;
            int i = knaVar.f124365b;
            if ((i & Integer.MIN_VALUE) != 0) {
                knaVar.f124365b = i - Integer.MIN_VALUE;
            } else {
                knaVar = new kna(this, ibkVar);
            }
        } else {
            knaVar = new kna(this, ibkVar);
        }
        Object objM71697a = knaVar.f124364a;
        int i2 = knaVar.f124365b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = knaVar.f124367d;
                bga.m29073P(objM71697a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM71697a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM71697a);
        knaVar.f124367d = bqz0Var;
        knaVar.f124365b = 1;
        objM71697a = this.f135124a.m71697a((BrowseEffect.Load) obj, knaVar);
        if (objM71697a != yukVar) {
        }
        return yukVar;
        knaVar.f124367d = null;
        knaVar.f124365b = 2;
    }
}
