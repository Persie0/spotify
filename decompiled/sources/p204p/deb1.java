package p204p;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class deb1 extends RequestFinishedInfo.Listener {

    /* JADX INFO: renamed from: a */
    public final RequestFinishedInfo.Listener f48050a;

    public deb1(RequestFinishedInfo.Listener listener) {
        super(listener.getExecutor());
        this.f48050a = listener;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final Executor getExecutor() {
        return this.f48050a.getExecutor();
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.f48050a.onRequestFinished(requestFinishedInfo);
    }
}
