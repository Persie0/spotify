package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class sh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ai0 f208966a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ om0 f208967b;

    public sh0(ai0 ai0Var, om0 om0Var) {
        this.f208966a = ai0Var;
        this.f208967b = om0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        rh0 rh0Var;
        drr drrVar;
        if (ibkVar instanceof rh0) {
            rh0Var = (rh0) ibkVar;
            int i = rh0Var.f199074b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rh0Var.f199074b = i - Integer.MIN_VALUE;
            } else {
                rh0Var = new rh0(this, ibkVar);
            }
        } else {
            rh0Var = new rh0(this, ibkVar);
        }
        Object obj2 = rh0Var.f199073a;
        int i2 = rh0Var.f199074b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            drr drrVar2 = (drr) obj;
            vas vasVar = this.f208966a.f15842a.f282753a;
            rh0Var.f199076d = drrVar2;
            rh0Var.f199074b = 1;
            vasVar.invoke(rh0Var);
            yuk yukVar = yuk.f276404a;
            if (w2a1Var == yukVar) {
                return yukVar;
            }
            drrVar = drrVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drrVar = rh0Var.f199076d;
            bga.m29073P(obj2);
        }
        om0.m67310a(this.f208967b, qm0.DISMISSED, drrVar.f52380a, null, null, null, 124);
        om0.m67310a(this.f208967b, qm0.UNLOADED, drrVar.f52380a, null, null, null, 124);
        return w2a1Var;
    }
}
