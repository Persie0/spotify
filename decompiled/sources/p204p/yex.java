package p204p;

import com.spotify.home.evopage.mobius.C0788e;
import com.spotify.home.evopage.mobius.Effect;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class yex implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0788e f272070a;

    public yex(C0788e c0788e) {
        this.f272070a = c0788e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xex xexVar;
        if (ibkVar instanceof xex) {
            xexVar = (xex) ibkVar;
            int i = xexVar.f260783b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xexVar.f260783b = i - Integer.MIN_VALUE;
            } else {
                xexVar = new xex(this, ibkVar);
            }
        } else {
            xexVar = new xex(this, ibkVar);
        }
        Object objM66106a = xexVar.f260782a;
        int i2 = xexVar.f260783b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = xexVar.f260785d;
                bga.m29073P(objM66106a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM66106a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM66106a);
        k2a0 k2a0Var = (k2a0) this.f272070a.f4167k.get();
        xexVar.f260785d = bqz0Var;
        xexVar.f260783b = 1;
        objM66106a = ((o2a0) k2a0Var).m66106a((Effect.LoadMoreHomeStructure) obj, xexVar);
        if (objM66106a != yukVar) {
        }
        return yukVar;
        xexVar.f260785d = null;
        xexVar.f260783b = 2;
    }
}
