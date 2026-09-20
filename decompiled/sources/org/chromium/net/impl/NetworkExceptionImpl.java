package org.chromium.net.impl;

import org.chromium.net.NetworkException;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkExceptionImpl extends NetworkException {

    /* JADX INFO: renamed from: a */
    public final int f10953a;

    /* JADX INFO: renamed from: b */
    public final int f10954b;

    public NetworkExceptionImpl() {
        super("Network bound to request not found", null);
        this.f10953a = 9;
        this.f10954b = -4;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.f10954b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.f10953a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.f10953a);
        int i = this.f10954b;
        if (i != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(i);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.f10953a;
        return i == 3 || i == 4 || i == 5 || i == 6 || i == 8;
    }
}
