package p204p;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class tsd0 {

    /* JADX INFO: renamed from: a */
    public volatile Handler f223288a;

    /* JADX INFO: renamed from: a */
    public final Handler m81411a() {
        Handler handler = this.f223288a;
        if (handler != null) {
            return handler;
        }
        throw new IllegalStateException("MediaSession worker thread not started");
    }
}
