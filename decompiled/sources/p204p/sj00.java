package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class sj00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u4l0 f209704a;

    public sj00(u4l0 u4l0Var) {
        this.f209704a = u4l0Var;
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
        rj00 rj00Var;
        if (ibkVar instanceof rj00) {
            rj00Var = (rj00) ibkVar;
            int i = rj00Var.f199674b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rj00Var.f199674b = i - Integer.MIN_VALUE;
            } else {
                rj00Var = new rj00(this, ibkVar);
            }
        } else {
            rj00Var = new rj00(this, ibkVar);
        }
        Object objM82354c = rj00Var.f199673a;
        int i2 = rj00Var.f199674b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = rj00Var.f199676d;
                bga.m29073P(objM82354c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM82354c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM82354c);
        rj00Var.f199676d = bqz0Var;
        rj00Var.f199674b = 1;
        objM82354c = this.f209704a.m82354c((yjt) obj, rj00Var);
        if (objM82354c != yukVar) {
        }
        return yukVar;
        rj00Var.f199676d = null;
        rj00Var.f199674b = 2;
    }
}
