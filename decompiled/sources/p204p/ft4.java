package p204p;

import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes11.dex */
public final class ft4 extends UploadDataSink {

    /* JADX INFO: renamed from: a */
    public final android.net.http.UploadDataSink f73106a;

    public ft4(android.net.http.UploadDataSink uploadDataSink) {
        this.f73106a = uploadDataSink;
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        this.f73106a.onReadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        this.f73106a.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        this.f73106a.onRewindError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        this.f73106a.onRewindSucceeded();
    }
}
