package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class tbx0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qqn f218966a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f218967b;

    public tbx0(qqn qqnVar, String str) {
        this.f218966a = qqnVar;
        this.f218967b = str;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        bbx0 bbx0Var = (bbx0) obj;
        this.f218966a.m73574a(bbx0Var.f25675b).m54031b(this.f218967b, bbx0Var.f25674a);
        return w2a1.f247311a;
    }
}
