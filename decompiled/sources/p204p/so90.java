package p204p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: classes8.dex */
public abstract class so90 {
    /* JADX INFO: renamed from: a */
    public static final void m78629a(MobiusLoop.Controller controller) {
        if (controller.isRunning()) {
            controller.stop();
            controller.disconnect();
        }
    }
}
