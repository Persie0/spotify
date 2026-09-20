package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes5.dex */
public final class cue implements fac1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eue f42100a;

    public cue(eue eueVar) {
        this.f42100a = eueVar;
    }

    @Override // p204p.fac1
    /* JADX INFO: renamed from: a */
    public final void mo33898a(VideoSurfaceView videoSurfaceView) {
        eue eueVar = this.f42100a;
        eueVar.m40056b(videoSurfaceView);
        eueVar.m40059e(true);
    }

    @Override // p204p.fac1
    /* JADX INFO: renamed from: b */
    public final void mo33899b() {
        this.f42100a.m40059e(true);
    }

    @Override // p204p.fac1
    /* JADX INFO: renamed from: c */
    public final void mo33900c(VideoSurfaceView videoSurfaceView) {
        eue eueVar = this.f42100a;
        eueVar.m40058d(videoSurfaceView);
        if (videoSurfaceView == eueVar.f62958e) {
            eueVar.m40055a();
        }
        eueVar.m40059e(true);
    }
}
