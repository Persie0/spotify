package com.facebook;

import kotlin.Metadata;
import p204p.e8y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class FacebookServiceException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final e8y f1662b;

    public FacebookServiceException(e8y e8yVar, String str) {
        super(str);
        this.f1662b = e8yVar;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        e8y e8yVar = this.f1662b;
        sb.append(e8yVar.f57304a);
        sb.append(", facebookErrorCode: ");
        sb.append(e8yVar.f57305b);
        sb.append(", facebookErrorType: ");
        sb.append(e8yVar.f57307d);
        sb.append(", message: ");
        sb.append(e8yVar.m38132c());
        sb.append("}");
        return sb.toString();
    }
}
