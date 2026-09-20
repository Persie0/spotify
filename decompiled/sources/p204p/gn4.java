package p204p;

import org.chromium.net.QuicException;

/* JADX INFO: loaded from: classes11.dex */
public final class gn4 extends QuicException {

    /* JADX INFO: renamed from: a */
    public final oi4 f81557a;

    public gn4(android.net.http.QuicException quicException) {
        super(quicException.getMessage(), quicException);
        this.f81557a = new oi4(quicException, true);
    }

    @Override // org.chromium.net.QuicException
    public final int getConnectionCloseSource() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        this.f81557a.getClass();
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.f81557a.getErrorCode();
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return 0;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.f81557a.immediatelyRetryable();
    }
}
