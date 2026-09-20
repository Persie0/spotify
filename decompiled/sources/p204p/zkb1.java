package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class zkb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ clb1 f283710a;

    public zkb1(clb1 clb1Var) {
        this.f283710a = clb1Var;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, p.th00] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        brr brrVar = (brr) obj;
        clb1 clb1Var = this.f283710a;
        om0.m67310a(clb1Var.f39242h, qm0.DISMISSED, brrVar.f30162a.f69506a, null, null, null, 124);
        Object objInvoke = clb1Var.f39237c.invoke(new so0(brrVar.f30162a.f69506a), ibkVar);
        return objInvoke == yuk.f276404a ? objInvoke : w2a1.f247311a;
    }
}
