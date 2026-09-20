package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class boa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ doa0 f29059a;

    public boa0(doa0 doa0Var) {
        this.f29059a = doa0Var;
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
        aoa0 aoa0Var;
        if (ibkVar instanceof aoa0) {
            aoa0Var = (aoa0) ibkVar;
            int i = aoa0Var.f17624b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoa0Var.f17624b = i - Integer.MIN_VALUE;
            } else {
                aoa0Var = new aoa0(this, ibkVar);
            }
        } else {
            aoa0Var = new aoa0(this, ibkVar);
        }
        Object objM36526a = aoa0Var.f17623a;
        int i2 = aoa0Var.f17624b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = aoa0Var.f17626d;
                bga.m29073P(objM36526a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM36526a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM36526a);
        aoa0Var.f17626d = bqz0Var;
        aoa0Var.f17624b = 1;
        objM36526a = doa0.m36526a(this.f29059a, (rna0) obj, aoa0Var);
        if (objM36526a != yukVar) {
        }
        return yukVar;
        aoa0Var.f17626d = null;
        aoa0Var.f17624b = 2;
    }
}
