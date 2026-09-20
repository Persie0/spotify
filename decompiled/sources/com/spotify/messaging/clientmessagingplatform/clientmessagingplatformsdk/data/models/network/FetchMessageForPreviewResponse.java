package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.InAppMessage;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/network/FetchMessageForPreviewResponse;", "", "inAppMessage", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;)V", "getInAppMessage", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class FetchMessageForPreviewResponse {
    public static final int $stable = 0;
    private final InAppMessage inAppMessage;

    public FetchMessageForPreviewResponse(InAppMessage inAppMessage) {
        this.inAppMessage = inAppMessage;
    }

    public static /* synthetic */ FetchMessageForPreviewResponse copy$default(FetchMessageForPreviewResponse fetchMessageForPreviewResponse, InAppMessage inAppMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            inAppMessage = fetchMessageForPreviewResponse.inAppMessage;
        }
        return fetchMessageForPreviewResponse.copy(inAppMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public final FetchMessageForPreviewResponse copy(InAppMessage inAppMessage) {
        return new FetchMessageForPreviewResponse(inAppMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FetchMessageForPreviewResponse) && wj50.m88271j(this.inAppMessage, ((FetchMessageForPreviewResponse) other).inAppMessage);
    }

    public final InAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public int hashCode() {
        InAppMessage inAppMessage = this.inAppMessage;
        if (inAppMessage == null) {
            return 0;
        }
        return inAppMessage.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
