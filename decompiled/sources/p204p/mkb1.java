package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class mkb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ llb1 f144547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ om0 f144548b;

    public mkb1(llb1 llb1Var, om0 om0Var) {
        this.f144547a = llb1Var;
        this.f144548b = om0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        jkb1 jkb1Var;
        arr arrVar;
        if (ibkVar instanceof jkb1) {
            jkb1Var = (jkb1) ibkVar;
            int i = jkb1Var.f113277b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkb1Var.f113277b = i - Integer.MIN_VALUE;
            } else {
                jkb1Var = new jkb1(this, ibkVar);
            }
        } else {
            jkb1Var = new jkb1(this, ibkVar);
        }
        Object obj2 = jkb1Var.f113276a;
        int i2 = jkb1Var.f113277b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            arrVar = (arr) obj;
            uo5 uo5Var = this.f144547a.f134609a.f123854b;
            arrVar.f19131a.mo29280c();
            jkb1Var.f113279d = arrVar;
            jkb1Var.f113277b = 1;
            uo5Var.getClass();
            new uo5(uo5Var.f232333b, jkb1Var, 6).invokeSuspend(w2a1Var);
            yuk yukVar = yuk.f276404a;
            if (w2a1Var == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrVar = jkb1Var.f113279d;
            bga.m29073P(obj2);
        }
        if (arrVar.f19132b) {
            om0.m67310a(this.f144548b, qm0.DISMISSED, arrVar.f19131a.mo29280c(), null, null, null, 124);
        }
        return w2a1Var;
    }
}
