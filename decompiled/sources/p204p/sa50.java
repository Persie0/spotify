package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class sa50 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wa50 f207142a;

    public sa50(wa50 wa50Var) {
        this.f207142a = wa50Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        aa50 aa50Var = (aa50) obj;
        try {
            nb50 nb50Var = this.f207142a.f249392b;
            int i = aa50Var.f13766a;
            d850 d850Var = aa50Var.f13767b;
            nb50Var.m64065a(i, d850Var != null ? d850Var.f46380a : null);
        } catch (Exception e) {
            na6.m63972t("Effect handling failed for " + aa50Var, e);
        }
        return w2a1.f247311a;
    }
}
