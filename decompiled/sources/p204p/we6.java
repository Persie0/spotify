package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class we6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xe6 f250454a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mg6 f250455b;

    public we6(xe6 xe6Var, mg6 mg6Var) {
        this.f250454a = xe6Var;
        this.f250455b = mg6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ve6 ve6Var;
        if (ibkVar instanceof ve6) {
            ve6Var = (ve6) ibkVar;
            int i = ve6Var.f240625b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve6Var.f240625b = i - Integer.MIN_VALUE;
            } else {
                ve6Var = new ve6(this, ibkVar);
            }
        } else {
            ve6Var = new ve6(this, ibkVar);
        }
        Object obj2 = ve6Var.f240624a;
        int i2 = ve6Var.f240625b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new C1977ig((td6) obj, this.f250455b, this.f250454a.f260645d, (fbk) null, 6));
            h61 h61Var = new h61(bqz0Var, 13);
            ve6Var.f240625b = 1;
            Object objCollect = nzx0Var.collect(h61Var, ve6Var);
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
