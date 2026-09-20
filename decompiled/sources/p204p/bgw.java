package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;

/* JADX INFO: loaded from: classes4.dex */
public final class bgw implements ozo0 {

    /* JADX INFO: renamed from: a */
    public final et0 f27010a;

    /* JADX INFO: renamed from: b */
    public final pa9 f27011b;

    /* JADX INFO: renamed from: c */
    public BetamaxPlaybackException f27012c;

    /* JADX INFO: renamed from: d */
    public long f27013d;

    /* JADX INFO: renamed from: e */
    public boolean f27014e;

    /* JADX INFO: renamed from: f */
    public boolean f27015f;

    public bgw(et0 et0Var, pa9 pa9Var) {
        this.f27010a = et0Var;
        this.f27011b = pa9Var;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: G */
    public final void mo29149G(long j, long j2) {
        this.f27015f = false;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: M */
    public final void mo29150M(long j, long j2) {
        this.f27015f = true;
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: O */
    public final void mo25536O(BetamaxPlaybackException betamaxPlaybackException, long j, long j2) {
        BetamaxPlaybackException betamaxPlaybackException2 = this.f27012c;
        ahw ahwVar = betamaxPlaybackException2 != null ? betamaxPlaybackException2.f3084a : null;
        ahw ahwVar2 = betamaxPlaybackException.f3084a;
        pa9 pa9Var = this.f27011b;
        if (ahwVar == ahwVar2 && j == this.f27013d) {
            Logger.m3970f(betamaxPlaybackException, "Failed to recover from error; aborting playback.", new Object[0]);
            pa9Var.m69455u();
            return;
        }
        this.f27012c = betamaxPlaybackException;
        this.f27013d = j;
        if ((this.f27010a.f62536b.f156768c || this.f27014e) && !this.f27015f) {
            Logger.m3970f(betamaxPlaybackException, "Recoverable error occurred; attempting to resume playback.", new Object[0]);
            pa9Var.m69447l();
        }
    }

    @Override // p204p.ozo0
    /* JADX INFO: renamed from: R */
    public final void mo29151R(long j, long j2) {
        this.f27014e = true;
    }
}
