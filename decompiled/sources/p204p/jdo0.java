package p204p;

import android.media.MediaRouter;

/* JADX INFO: loaded from: classes.dex */
public final class jdo0 extends amd0 {

    /* JADX INFO: renamed from: a */
    public final MediaRouter.RouteInfo f111378a;

    public jdo0(MediaRouter.RouteInfo routeInfo) {
        this.f111378a = routeInfo;
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: g */
    public final void mo26394g(int i) {
        this.f111378a.requestSetVolume(i);
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: j */
    public final void mo26397j(int i) {
        this.f111378a.requestUpdateVolume(i);
    }
}
