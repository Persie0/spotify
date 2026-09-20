package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class ny20 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uy20 f159683a;

    public ny20(uy20 uy20Var) {
        this.f159683a = uy20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        my20 my20Var;
        if (ibkVar instanceof my20) {
            my20Var = (my20) ibkVar;
            int i = my20Var.f148296b;
            if ((i & Integer.MIN_VALUE) != 0) {
                my20Var.f148296b = i - Integer.MIN_VALUE;
            } else {
                my20Var = new my20(this, ibkVar);
            }
        } else {
            my20Var = new my20(this, ibkVar);
        }
        Object obj2 = my20Var.f148295a;
        int i2 = my20Var.f148296b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            yab yabVarM65827f = nxf1.m65827f(new f620(this.f159683a, null, 7));
            zax zaxVar = new zax(bqz0Var, 16);
            my20Var.f148296b = 1;
            Object objCollect = yabVarM65827f.collect(zaxVar, my20Var);
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
