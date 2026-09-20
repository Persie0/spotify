package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class mn00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rn00 f145292a;

    public mn00(rn00 rn00Var) {
        this.f145292a = rn00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ln00 ln00Var;
        Object objM56025h;
        if (ibkVar instanceof ln00) {
            ln00Var = (ln00) ibkVar;
            int i = ln00Var.f135066b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ln00Var.f135066b = i - Integer.MIN_VALUE;
            } else {
                ln00Var = new ln00(this, ibkVar);
            }
        } else {
            ln00Var = new ln00(this, ibkVar);
        }
        Object obj2 = ln00Var.f135065a;
        int i2 = ln00Var.f135066b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ln00Var.f135068d;
                bga.m29073P(obj2);
                objM56025h = ((s6x0) obj2).f206218a;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        kca kcaVar = this.f145292a.f200678a;
        String str = ((lm00) obj).f134732c;
        ln00Var.f135068d = bqz0Var;
        ln00Var.f135066b = 1;
        objM56025h = kcaVar.m56025h(str, ln00Var);
        if (objM56025h != yukVar) {
        }
        return yukVar;
        Object tm00Var = s6x0.m77348a(objM56025h) == null ? new tm00((String) objM56025h) : sm00.f210536a;
        ln00Var.f135068d = null;
        ln00Var.f135066b = 2;
    }
}
