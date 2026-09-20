package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponse;", "", "<init>", "()V", "request", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "getRequest", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "messageRequestId", "", "getMessageRequestId", "()Ljava/lang/String;", "isSuccessful", "", "Success", "Failure", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponse$Failure;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponse$Success;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class MessageResponse {
    public static final int $stable = 0;

    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponse$Failure;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponse;", "request", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "messageRequestId", "", "discardReason", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;)V", "getRequest", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "getMessageRequestId", "()Ljava/lang/String;", "getDiscardReason", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DiscardReason;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Failure extends MessageResponse {
        public static final int $stable = 8;
        private final DiscardReason discardReason;
        private final String messageRequestId;
        private final MessageRequest request;

        public Failure(MessageRequest messageRequest, String str, DiscardReason discardReason) {
            super(null);
            this.request = messageRequest;
            this.messageRequestId = str;
            this.discardReason = discardReason;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, MessageRequest messageRequest, String str, DiscardReason discardReason, int i, Object obj) {
            if ((i & 1) != 0) {
                messageRequest = failure.request;
            }
            if ((i & 2) != 0) {
                str = failure.messageRequestId;
            }
            if ((i & 4) != 0) {
                discardReason = failure.discardReason;
            }
            return failure.copy(messageRequest, str, discardReason);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageRequest getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessageRequestId() {
            return this.messageRequestId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DiscardReason getDiscardReason() {
            return this.discardReason;
        }

        public final Failure copy(MessageRequest request, String messageRequestId, DiscardReason discardReason) {
            return new Failure(request, messageRequestId, discardReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return wj50.m88271j(this.request, failure.request) && wj50.m88271j(this.messageRequestId, failure.messageRequestId) && wj50.m88271j(this.discardReason, failure.discardReason);
        }

        public final DiscardReason getDiscardReason() {
            return this.discardReason;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse
        public String getMessageRequestId() {
            return this.messageRequestId;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse
        public MessageRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            return this.discardReason.hashCode() + s571.m77243b(this.request.hashCode() * 31, 31, this.messageRequestId);
        }

        public String toString() {
            return super.toString();
        }
    }

    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponse$Success;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponse;", "request", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "messageRequestId", "", "token", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "<init>", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;)V", "getRequest", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "getMessageRequestId", "()Ljava/lang/String;", "getToken", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class Success extends MessageResponse {
        public static final int $stable = 8;
        private final String messageRequestId;
        private final MessageRequest request;
        private final MessageResponseToken token;

        public Success(MessageRequest messageRequest, String str, MessageResponseToken messageResponseToken) {
            super(null);
            this.request = messageRequest;
            this.messageRequestId = str;
            this.token = messageResponseToken;
        }

        public static /* synthetic */ Success copy$default(Success success, MessageRequest messageRequest, String str, MessageResponseToken messageResponseToken, int i, Object obj) {
            if ((i & 1) != 0) {
                messageRequest = success.request;
            }
            if ((i & 2) != 0) {
                str = success.messageRequestId;
            }
            if ((i & 4) != 0) {
                messageResponseToken = success.token;
            }
            return success.copy(messageRequest, str, messageResponseToken);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MessageRequest getRequest() {
            return this.request;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessageRequestId() {
            return this.messageRequestId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MessageResponseToken getToken() {
            return this.token;
        }

        public final Success copy(MessageRequest request, String messageRequestId, MessageResponseToken token) {
            return new Success(request, messageRequestId, token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return wj50.m88271j(this.request, success.request) && wj50.m88271j(this.messageRequestId, success.messageRequestId) && wj50.m88271j(this.token, success.token);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse
        public String getMessageRequestId() {
            return this.messageRequestId;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse
        public MessageRequest getRequest() {
            return this.request;
        }

        public final MessageResponseToken getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode() + s571.m77243b(this.request.hashCode() * 31, 31, this.messageRequestId);
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ MessageResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getMessageRequestId();

    public abstract MessageRequest getRequest();

    public final boolean isSuccessful() {
        return this instanceof Success;
    }

    private MessageResponse() {
    }
}
