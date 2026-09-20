package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class pjd0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ujd0 f178228a;

    public pjd0(ujd0 ujd0Var) {
        this.f178228a = ujd0Var;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v7, types: [p.eh00, p.qe70] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        int iOrdinal = ((cid0) obj).f38282a.ordinal();
        ujd0 ujd0Var = this.f178228a;
        if (iOrdinal == 0) {
            ujd0Var.f230975e.invoke();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ujd0Var.f230976f.invoke();
        }
        return w2a1.f247311a;
    }
}
