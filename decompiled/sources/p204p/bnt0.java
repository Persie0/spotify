package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;

/* JADX INFO: loaded from: classes5.dex */
public final class bnt0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ po10 f28921a;

    public bnt0(po10 po10Var) {
        this.f28921a = po10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ant0 ant0Var;
        if (ibkVar instanceof ant0) {
            ant0Var = (ant0) ibkVar;
            int i = ant0Var.f17494b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ant0Var.f17494b = i - Integer.MIN_VALUE;
            } else {
                ant0Var = new ant0(this, ibkVar);
            }
        } else {
            ant0Var = new ant0(this, ibkVar);
        }
        Object obj2 = ant0Var.f17493a;
        int i2 = ant0Var.f17494b;
        int i3 = 1;
        if (i2 == 0) {
            bga.m29073P(obj2);
            po10 po10Var = this.f28921a;
            umn umnVar = (umn) po10Var.f179559b;
            onc oncVar = (onc) umnVar.f231917d;
            FlowableRefCount flowableRefCount = ((f0y) ((e0y) umnVar.f231918e)).f64742b.f115322c;
            d0k[] d0kVarArr = bmu0.f28619a;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new j5t0(mvl0.m62953p(new vjz(new zux(oncVar, new onc(flowableRefCount), new zp0(umnVar, fbkVar, 14), i3), new ysl(po10Var, fbkVar, 28), 2)), 6), new zyj0(3, 9, fbkVar), 2);
            aeq0 aeq0Var = new aeq0(bqz0Var, 3);
            ant0Var.f17494b = 1;
            Object objCollect = vjzVar.collect(aeq0Var, ant0Var);
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
