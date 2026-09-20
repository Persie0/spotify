package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class bw9 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f31585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jw9 f31586b;

    public bw9(Consumer consumer, jw9 jw9Var) {
        this.f31585a = consumer;
        this.f31586b = jw9Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        bv9 bv9Var = (bv9) obj;
        String str = bv9Var.f31308a;
        String str2 = bv9Var.f31309b;
        this.f31585a.accept(this.f31586b.f116609b.f193860a.m49745g() ? new fy9(new g0b0(str, str2), rk7.f200002M0) : new fy9(new j0b0(str, str2), rk7.f200007a));
        return w2a1.f247311a;
    }
}
