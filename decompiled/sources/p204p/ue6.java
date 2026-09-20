package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class ue6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xe6 f229411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mg6 f229412b;

    public ue6(xe6 xe6Var, mg6 mg6Var) {
        this.f229411a = xe6Var;
        this.f229412b = mg6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        te6 te6Var;
        if (ibkVar instanceof te6) {
            te6Var = (te6) ibkVar;
            int i = te6Var.f219587b;
            if ((i & Integer.MIN_VALUE) != 0) {
                te6Var.f219587b = i - Integer.MIN_VALUE;
            } else {
                te6Var = new te6(this, ibkVar);
            }
        } else {
            te6Var = new te6(this, ibkVar);
        }
        Object obj2 = te6Var.f219586a;
        int i2 = te6Var.f219587b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new uyf0((yd6) obj, this.f229412b, this.f229411a.f260646e, (fbk) null, 28));
            h61 h61Var = new h61(bqz0Var, 12);
            te6Var.f219587b = 1;
            Object objCollect = nzx0Var.collect(h61Var, te6Var);
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
