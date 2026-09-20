package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class cjb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hjb1 f38558a;

    public cjb1(hjb1 hjb1Var) {
        this.f38558a = hjb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        bjb1 bjb1Var;
        if (ibkVar instanceof bjb1) {
            bjb1Var = (bjb1) ibkVar;
            int i = bjb1Var.f27657b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bjb1Var.f27657b = i - Integer.MIN_VALUE;
            } else {
                bjb1Var = new bjb1(this, ibkVar);
            }
        } else {
            bjb1Var = new bjb1(this, ibkVar);
        }
        Object obj2 = bjb1Var.f27656a;
        int i2 = bjb1Var.f27657b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vhb1 vhb1Var = (vhb1) obj;
            hjb1 hjb1Var = this.f38558a;
            xjz0 xjz0Var = new xjz0(cyf1.m34370f(hjb1Var.f92022d.m89669P(n5h1.m63737m(hjb1Var.f92023e), vhb1Var.f241464a, vhb1Var.f241465b)), 21);
            foa1 foa1Var = new foa1(bqz0Var, 5);
            bjb1Var.f27657b = 1;
            Object objCollect = xjz0Var.collect(foa1Var, bjb1Var);
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
