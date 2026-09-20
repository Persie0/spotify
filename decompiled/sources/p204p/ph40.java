package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ph40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sh40 f177469a;

    public ph40(sh40 sh40Var) {
        this.f177469a = sh40Var;
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
        oh40 oh40Var;
        if (ibkVar instanceof oh40) {
            oh40Var = (oh40) ibkVar;
            int i = oh40Var.f165334b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oh40Var.f165334b = i - Integer.MIN_VALUE;
            } else {
                oh40Var = new oh40(this, ibkVar);
            }
        } else {
            oh40Var = new oh40(this, ibkVar);
        }
        Object objM89676n = oh40Var.f165333a;
        int i2 = oh40Var.f165334b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = oh40Var.f165336d;
                bga.m29073P(objM89676n);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89676n);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89676n);
        x1p0 x1p0Var = this.f177469a.f209087b;
        oh40Var.f165336d = bqz0Var;
        oh40Var.f165334b = 1;
        objM89676n = x1p0Var.m89676n((gh40) obj, oh40Var);
        if (objM89676n != yukVar) {
        }
        return yukVar;
        oh40Var.f165336d = null;
        oh40Var.f165334b = 2;
    }
}
