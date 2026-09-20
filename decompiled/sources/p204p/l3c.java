package p204p;

import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;

/* JADX INFO: loaded from: classes5.dex */
public final class l3c extends e4p0 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ px6 f129289X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3c(yzo0 yzo0Var, noo0 noo0Var, px6 px6Var) {
        super(yzo0Var, noo0Var);
        this.f129289X = px6Var;
    }

    @Override // p204p.e4p0, p204p.ozo0
    /* JADX INFO: renamed from: I */
    public final void mo25535I(BetamaxException betamaxException, long j, long j2) {
        super.mo25535I(betamaxException, j, j2);
        ((eh00) this.f129289X.f182220b).invoke();
    }

    @Override // p204p.e4p0, p204p.ozo0
    /* JADX INFO: renamed from: O */
    public final void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        super.mo25536O(betamaxPlaybackException, j, j2);
        ((eh00) this.f129289X.f182220b).invoke();
    }
}
