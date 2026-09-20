package p204p;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* JADX INFO: loaded from: classes.dex */
public final class jld0 extends MediaRouter2$ControllerCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ old0 f113584a;

    public jld0(old0 old0Var) {
        this.f113584a = old0Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) throws Throwable {
        this.f113584a.m67289m(routingController);
    }
}
