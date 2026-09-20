package p204p;

import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;

/* JADX INFO: loaded from: classes11.dex */
public final class c1c1 implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d1c1 f33052a;

    public c1c1(d1c1 d1c1Var) {
        this.f33052a = d1c1Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: I */
    public final void mo25535I(BetamaxException betamaxException, long j, long j2) {
        i0c1 i0c1Var = this.f33052a.f44233g;
        if (i0c1Var != null) {
            i0c1Var.mo26765b();
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: O */
    public final void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        i0c1 i0c1Var = this.f33052a.f44233g;
        if (i0c1Var != null) {
            i0c1Var.mo26765b();
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: R */
    public final void mo29151R(long j, long j2) {
        i0c1 i0c1Var = this.f33052a.f44233g;
        if (i0c1Var != null) {
            i0c1Var.mo26766c();
        }
    }
}
