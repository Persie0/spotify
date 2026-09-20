package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class ry20 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uy20 f203801a;

    public ry20(uy20 uy20Var) {
        this.f203801a = uy20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qy20 qy20Var;
        if (ibkVar instanceof qy20) {
            qy20Var = (qy20) ibkVar;
            int i = qy20Var.f193791b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy20Var.f193791b = i - Integer.MIN_VALUE;
            } else {
                qy20Var = new qy20(this, ibkVar);
            }
        } else {
            qy20Var = new qy20(this, ibkVar);
        }
        Object obj2 = qy20Var.f193790a;
        int i2 = qy20Var.f193791b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            yab yabVarM65827f = nxf1.m65827f(new ty20(this.f203801a, (xy20) obj, (fbk) null));
            zax zaxVar = new zax(bqz0Var, 18);
            qy20Var.f193791b = 1;
            Object objCollect = yabVarM65827f.collect(zaxVar, qy20Var);
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
