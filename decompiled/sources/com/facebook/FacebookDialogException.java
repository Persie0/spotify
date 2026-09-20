package com.facebook;

import kotlin.Metadata;
import p204p.dq60;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "facebook-common_release"}, m24213k = 1, m24214mv = {1, 8, 0}, m24216xi = 48)
public final class FacebookDialogException extends FacebookException {

    /* JADX INFO: renamed from: b */
    public final int f1658b;

    /* JADX INFO: renamed from: c */
    public final String f1659c;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f1658b = i;
        this.f1659c = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.f1658b);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return dq60.m36616p(this.f1659c, "}", sb);
    }
}
