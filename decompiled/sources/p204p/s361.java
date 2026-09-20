package p204p;

import com.spotify.betamax.common.SunsetUpgradeRequiredException;
import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: classes5.dex */
public final class s361 implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final ya9 f205188a;

    public s361(ya9 ya9Var) {
        this.f205188a = ya9Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: I */
    public final void mo25535I(BetamaxException betamaxException, long j, long j2) {
        for (Throwable cause = betamaxException; cause != null; cause = cause.getCause()) {
            if (cause instanceof SunsetUpgradeRequiredException) {
                this.f205188a.f270843a.mo46962a(w2a1.f247311a);
                return;
            }
        }
    }
}
