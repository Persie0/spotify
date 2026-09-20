package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class frt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ltx0 f72661a;

    public frt(ltx0 ltx0Var) {
        this.f72661a = ltx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ert ertVar;
        if (ibkVar instanceof ert) {
            ertVar = (ert) ibkVar;
            int i = ertVar.f62202b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ertVar.f62202b = i - Integer.MIN_VALUE;
            } else {
                ertVar = new ert(this, ibkVar);
            }
        } else {
            ertVar = new ert(this, ibkVar);
        }
        Object obj2 = ertVar.f62201a;
        int i2 = ertVar.f62202b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            yab yabVarM65827f = nxf1.m65827f(new lmz0((ujt) obj, this.f72661a, (fbk) null, 15));
            d6i d6iVar = new d6i(bqz0Var, 22);
            ertVar.f62202b = 1;
            Object objCollect = yabVarM65827f.collect(d6iVar, ertVar);
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
