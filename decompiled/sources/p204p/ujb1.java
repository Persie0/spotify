package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ujb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ flb1 f230965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ om0 f230966b;

    public ujb1(flb1 flb1Var, om0 om0Var) {
        this.f230965a = flb1Var;
        this.f230966b = om0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        tjb1 tjb1Var;
        zqr zqrVar;
        if (ibkVar instanceof tjb1) {
            tjb1Var = (tjb1) ibkVar;
            int i = tjb1Var.f220882b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjb1Var.f220882b = i - Integer.MIN_VALUE;
            } else {
                tjb1Var = new tjb1(this, ibkVar);
            }
        } else {
            tjb1Var = new tjb1(this, ibkVar);
        }
        Object obj2 = tjb1Var.f220881a;
        int i2 = tjb1Var.f220882b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            zqrVar = (zqr) obj;
            th00 th00Var = this.f230965a.f70748d.f50178b;
            so0 so0Var = new so0(zqrVar.f285437a.mo29280c());
            tjb1Var.f220884d = zqrVar;
            tjb1Var.f220882b = 1;
            Object objInvoke = th00Var.invoke(so0Var, tjb1Var);
            yuk yukVar = yuk.f276404a;
            if (objInvoke == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zqrVar = tjb1Var.f220884d;
            bga.m29073P(obj2);
        }
        if (zqrVar.f285438b) {
            om0.m67310a(this.f230966b, qm0.DISMISSED, zqrVar.f285437a.mo29280c(), null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}
