package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class rj61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x6j0 f199726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ daj0 f199727b;

    public rj61(x6j0 x6j0Var, daj0 daj0Var) {
        this.f199726a = x6j0Var;
        this.f199727b = daj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qj61 qj61Var;
        hj61 hj61Var;
        if (ibkVar instanceof qj61) {
            qj61Var = (qj61) ibkVar;
            int i = qj61Var.f189166b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qj61Var.f189166b = i - Integer.MIN_VALUE;
            } else {
                qj61Var = new qj61(this, ibkVar);
            }
        } else {
            qj61Var = new qj61(this, ibkVar);
        }
        Object obj2 = qj61Var.f189165a;
        int i2 = qj61Var.f189166b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                hj61Var = qj61Var.f189169e;
                bqz0Var = qj61Var.f189168d;
                bga.m29073P(obj2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        hj61Var = (hj61) obj;
        this.f199726a.m90096c(hj61Var.f91974b.getUri());
        j1j0 j1j0Var = hj61Var.f91974b;
        s9j0 s9j0Var = new s9j0(hj61Var.f91973a);
        qj61Var.f189168d = bqz0Var;
        qj61Var.f189169e = hj61Var;
        qj61Var.f189166b = 1;
        if (this.f199727b.m35490e(j1j0Var, s9j0Var, qj61Var) != yukVar) {
        }
        return yukVar;
        gk61 gk61Var = new gk61(hj61Var.f91974b);
        qj61Var.f189168d = null;
        qj61Var.f189169e = null;
        qj61Var.f189166b = 2;
    }
}
