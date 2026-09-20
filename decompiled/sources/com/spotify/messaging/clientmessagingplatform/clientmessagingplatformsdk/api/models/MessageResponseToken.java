package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0018\u001a\u00060\u0006j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006)"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "Landroid/os/Parcelable;", "", "requestId", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "messageRequest", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageData;", "messageData", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "component3", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "copy", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageResponseToken;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestId", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "getMessageRequest", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Message$CreativeMessage;", "getMessageData", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class MessageResponseToken implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MessageResponseToken> CREATOR = new Creator();
    private final Message.CreativeMessage messageData;
    private final MessageRequest messageRequest;
    private final String requestId;

    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageResponseToken> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageResponseToken createFromParcel(Parcel parcel) {
            return new MessageResponseToken(parcel.readString(), MessageRequest.CREATOR.createFromParcel(parcel), Message.CreativeMessage.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageResponseToken[] newArray(int i) {
            return new MessageResponseToken[i];
        }
    }

    public MessageResponseToken(String str, MessageRequest messageRequest, Message.CreativeMessage creativeMessage) {
        this.requestId = str;
        this.messageRequest = messageRequest;
        this.messageData = creativeMessage;
    }

    public static /* synthetic */ MessageResponseToken copy$default(MessageResponseToken messageResponseToken, String str, MessageRequest messageRequest, Message.CreativeMessage creativeMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageResponseToken.requestId;
        }
        if ((i & 2) != 0) {
            messageRequest = messageResponseToken.messageRequest;
        }
        if ((i & 4) != 0) {
            creativeMessage = messageResponseToken.messageData;
        }
        return messageResponseToken.copy(str, messageRequest, creativeMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageRequest getMessageRequest() {
        return this.messageRequest;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Message.CreativeMessage getMessageData() {
        return this.messageData;
    }

    public final MessageResponseToken copy(String requestId, MessageRequest messageRequest, Message.CreativeMessage messageData) {
        return new MessageResponseToken(requestId, messageRequest, messageData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageResponseToken)) {
            return false;
        }
        MessageResponseToken messageResponseToken = (MessageResponseToken) other;
        return wj50.m88271j(this.requestId, messageResponseToken.requestId) && wj50.m88271j(this.messageRequest, messageResponseToken.messageRequest) && wj50.m88271j(this.messageData, messageResponseToken.messageData);
    }

    public final Message.CreativeMessage getMessageData() {
        return this.messageData;
    }

    public final MessageRequest getMessageRequest() {
        return this.messageRequest;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.messageData.hashCode() + ((this.messageRequest.hashCode() + (this.requestId.hashCode() * 31)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.requestId);
        this.messageRequest.writeToParcel(dest, flags);
        this.messageData.writeToParcel(dest, flags);
    }
}
