package com.facebook;

import kotlin.Metadata;
import p204p.e8y;
import p204p.gx10;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class FacebookGraphResponseException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final gx10 f1661b;

    public FacebookGraphResponseException(gx10 gx10Var, String str) {
        super(str);
        this.f1661b = gx10Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        gx10 gx10Var = this.f1661b;
        e8y e8yVar = gx10Var != null ? gx10Var.f85147c : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (e8yVar != null) {
            sb.append("httpResponseCode: ");
            sb.append(e8yVar.f57304a);
            sb.append(", facebookErrorCode: ");
            sb.append(e8yVar.f57305b);
            sb.append(", facebookErrorType: ");
            sb.append(e8yVar.f57307d);
            sb.append(", message: ");
            sb.append(e8yVar.m38132c());
            sb.append("}");
        }
        return sb.toString();
    }
}
