package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class n3u implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u4u f150127a;

    public n3u(u4u u4uVar) {
        this.f150127a = u4uVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        gpc1 gpc1Var = (gpc1) obj;
        long j = gpc1Var.f83169b;
        int i = (int) (4294967295L & j);
        u4u.m82365b(this.f150127a, 8, gpc1Var.f83168a, Collections.singletonMap("container_ratio", String.valueOf(i == 0 ? Float.NaN : ((int) (j >> 32)) / i)), null, 8);
        return w2a1.f247311a;
    }
}
