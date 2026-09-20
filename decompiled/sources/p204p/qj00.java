package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class qj00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mqr f189117a;

    public qj00(mqr mqrVar) {
        this.f189117a = mqrVar;
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
        pj00 pj00Var;
        if (ibkVar instanceof pj00) {
            pj00Var = (pj00) ibkVar;
            int i = pj00Var.f178096b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pj00Var.f178096b = i - Integer.MIN_VALUE;
            } else {
                pj00Var = new pj00(this, ibkVar);
            }
        } else {
            pj00Var = new pj00(this, ibkVar);
        }
        Object objM62588i = pj00Var.f178095a;
        int i2 = pj00Var.f178096b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = pj00Var.f178098d;
                bga.m29073P(objM62588i);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM62588i);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM62588i);
        pj00Var.f178098d = bqz0Var;
        pj00Var.f178096b = 1;
        objM62588i = this.f189117a.m62588i((kft) obj, pj00Var);
        if (objM62588i != yukVar) {
        }
        return yukVar;
        pj00Var.f178098d = null;
        pj00Var.f178096b = 2;
    }
}
