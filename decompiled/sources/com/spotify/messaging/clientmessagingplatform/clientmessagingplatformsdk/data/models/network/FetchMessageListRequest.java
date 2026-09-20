package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network;

import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageListRequest;", "", "locale", "", "<init>", "(Ljava/lang/String;)V", "getLocale", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class FetchMessageListRequest {
    public static final int $stable = 0;
    private final String locale;

    public FetchMessageListRequest(String str) {
        this.locale = str;
    }

    public static /* synthetic */ FetchMessageListRequest copy$default(FetchMessageListRequest fetchMessageListRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchMessageListRequest.locale;
        }
        return fetchMessageListRequest.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final FetchMessageListRequest copy(String locale) {
        return new FetchMessageListRequest(locale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FetchMessageListRequest) && wj50.m88271j(this.locale, ((FetchMessageListRequest) other).locale);
    }

    public final String getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
