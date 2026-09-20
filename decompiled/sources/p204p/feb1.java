package p204p;

import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class feb1 extends UrlRequest.StatusListener {

    /* JADX INFO: renamed from: a */
    public final UrlRequest.StatusListener f68739a;

    public feb1(UrlRequest.StatusListener statusListener) {
        this.f68739a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.f68739a.onStatus(i);
    }
}
