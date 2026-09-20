package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class kca1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mca1 f121420a;

    public kca1(mca1 mca1Var) {
        this.f121420a = mca1Var;
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
        jca1 jca1Var;
        if (ibkVar instanceof jca1) {
            jca1Var = (jca1) ibkVar;
            int i = jca1Var.f111037b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jca1Var.f111037b = i - Integer.MIN_VALUE;
            } else {
                jca1Var = new jca1(this, ibkVar);
            }
        } else {
            jca1Var = new jca1(this, ibkVar);
        }
        Object objM61459a = jca1Var.f111036a;
        int i2 = jca1Var.f111037b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = jca1Var.f111039d;
                bga.m29073P(objM61459a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61459a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM61459a);
        jca1Var.f111039d = bqz0Var;
        jca1Var.f111037b = 1;
        objM61459a = this.f121420a.m61459a((nca1) obj, jca1Var);
        if (objM61459a != yukVar) {
        }
        return yukVar;
        jca1Var.f111039d = null;
        jca1Var.f111037b = 2;
    }
}
