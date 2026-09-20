package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class pia0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oge0 f177879a;

    public pia0(oge0 oge0Var) {
        this.f177879a = oge0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        oia0 oia0Var;
        if (ibkVar instanceof oia0) {
            oia0Var = (oia0) ibkVar;
            int i = oia0Var.f165747b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oia0Var.f165747b = i - Integer.MIN_VALUE;
            } else {
                oia0Var = new oia0(this, ibkVar);
            }
        } else {
            oia0Var = new oia0(this, ibkVar);
        }
        Object obj2 = oia0Var.f165746a;
        int i2 = oia0Var.f165747b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new yyj0(this.f177879a, ((yha0) obj).f272797c, (fbk) null, 2));
            zax zaxVar = new zax(bqz0Var, 26);
            oia0Var.f165747b = 1;
            Object objCollect = nzx0Var.collect(zaxVar, oia0Var);
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
