package p204p;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class lt4 implements UrlRequest$StatusListener {

    /* JADX INFO: renamed from: a */
    public final UrlRequest.StatusListener f136694a;

    public lt4(UrlRequest.StatusListener statusListener) {
        this.f136694a = statusListener;
    }

    public final void onStatus(int i) {
        this.f136694a.onStatus(i);
    }
}
