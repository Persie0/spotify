package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class aw61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ew61 f20415a;

    public aw61(ew61 ew61Var) {
        this.f20415a = ew61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        zv61 zv61Var;
        if (ibkVar instanceof zv61) {
            zv61Var = (zv61) ibkVar;
            int i = zv61Var.f286632b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv61Var.f286632b = i - Integer.MIN_VALUE;
            } else {
                zv61Var = new zv61(this, ibkVar);
            }
        } else {
            zv61Var = new zv61(this, ibkVar);
        }
        Object obj2 = zv61Var.f286631a;
        int i2 = zv61Var.f286632b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        luu0 luu0Var = this.f20415a.f63443b.f214350b;
        aeq0 aeq0Var = new aeq0(bqz0Var, 25);
        zv61Var.f286632b = 1;
        Object objCollect = luu0Var.f137156a.collect(new b941(aeq0Var, 26), zv61Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
