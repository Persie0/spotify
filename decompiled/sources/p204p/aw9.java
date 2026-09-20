package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class aw9 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f20435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jw9 f20436b;

    public aw9(Consumer consumer, jw9 jw9Var) {
        this.f20435a = consumer;
        this.f20436b = jw9Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        String str = ((av9) obj).f20127a;
        this.f20435a.accept(this.f20436b.f116609b.f193860a.m49744f() ? new fy9(new f0b0(str), rk7.f200002M0) : new gy9(str));
        return w2a1.f247311a;
    }
}
