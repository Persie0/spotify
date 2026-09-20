package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class eek implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h6s f58807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bbs f58808b;

    public eek(h6s h6sVar, bbs bbsVar) {
        this.f58807a = h6sVar;
        this.f58808b = bbsVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ged0 ged0Var = (ged0) obj;
        int i = ged0Var.f79099d;
        String str = ged0Var.f79096a;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            this.f58807a.m46740c(Collections.singletonList(new q6s(str, ged0Var.f79097b, ged0Var.f79098c)));
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.f58808b.m28646c(Collections.singletonList(new kbs(str)));
        }
        return w2a1.f247311a;
    }
}
