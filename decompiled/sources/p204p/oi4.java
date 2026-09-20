package p204p;

import org.chromium.net.NetworkException;

/* JADX INFO: loaded from: classes11.dex */
public final class oi4 extends NetworkException {

    /* JADX INFO: renamed from: a */
    public final android.net.http.NetworkException f165695a;

    public oi4(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), networkException);
        this.f165695a = networkException;
        if (!z && px3.m71354k(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.f165695a.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.f165695a.isImmediatelyRetryable();
    }
}
