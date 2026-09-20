package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class lry0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d2n f136389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ px0 f136390b;

    public lry0(d2n d2nVar, px0 px0Var) {
        this.f136389a = d2nVar;
        this.f136390b = px0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        kry0 kry0Var;
        fiz bq0Var;
        if (ibkVar instanceof kry0) {
            kry0Var = (kry0) ibkVar;
            int i = kry0Var.f125750b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kry0Var.f125750b = i - Integer.MIN_VALUE;
            } else {
                kry0Var = new kry0(this, ibkVar);
            }
        } else {
            kry0Var = new kry0(this, ibkVar);
        }
        Object obj2 = kry0Var.f125749a;
        int i2 = kry0Var.f125750b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ery0 ery0Var = (ery0) obj;
            String str = ery0Var.f62223a;
            if (wl51.m88460J0(str)) {
                bq0Var = gau.f78095a;
            } else {
                d2n d2nVar = this.f136389a;
                fbk fbkVar = null;
                bq0Var = new bq0(new vjz(new ur0(mvl0.m62953p(new zux(new nzx0(new h5q(d2nVar, str, fbkVar, 29)), mvl0.m62953p(new luk0((fiz) d2nVar.f44591f, 21)), new utt(d2nVar, null), 1)), 4), new ktt(str, fbkVar, 1), 2), str, ery0Var, this.f136390b, 20);
            }
            aeq0 aeq0Var = new aeq0(bqz0Var, 10);
            kry0Var.f125750b = 1;
            Object objCollect = bq0Var.collect(aeq0Var, kry0Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
