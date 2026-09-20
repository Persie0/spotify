package p204p;

import android.media.MediaRouter;

/* JADX INFO: loaded from: classes.dex */
public final class fnd0 extends MediaRouter.VolumeCallback {

    /* JADX INFO: renamed from: a */
    public final ido0 f71265a;

    public fnd0(ido0 ido0Var) {
        this.f71265a = ido0Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f71265a.getClass();
        ldo0 ldo0VarM50351n = ido0.m50351n(routeInfo);
        if (ldo0VarM50351n != null) {
            ldo0VarM50351n.f132314a.m88562i(i);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f71265a.getClass();
        ldo0 ldo0VarM50351n = ido0.m50351n(routeInfo);
        if (ldo0VarM50351n != null) {
            ldo0VarM50351n.f132314a.m88563j(i);
        }
    }
}
