package com.spotify.notifications.models.message;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0016\u0012\u0004\b&\u0010\u0014\u001a\u0004\b%\u0010\u0018¨\u0006'"}, m24212d2 = {"Lcom/spotify/notifications/models/message/CommunicationNotification;", "", "Lcom/spotify/notifications/models/message/Person;", "sender", "", "conversationId", "Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;", "group", "Lcom/spotify/notifications/models/message/CommunicationNotificationMediaAttachment;", "mediaAttachment", "messageUri", "<init>", "(Lcom/spotify/notifications/models/message/Person;Ljava/lang/String;Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;Lcom/spotify/notifications/models/message/CommunicationNotificationMediaAttachment;Ljava/lang/String;)V", "copy", "(Lcom/spotify/notifications/models/message/Person;Ljava/lang/String;Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;Lcom/spotify/notifications/models/message/CommunicationNotificationMediaAttachment;Ljava/lang/String;)Lcom/spotify/notifications/models/message/CommunicationNotification;", "a", "Lcom/spotify/notifications/models/message/Person;", "getSender", "()Lcom/spotify/notifications/models/message/Person;", "getSender$annotations", "()V", "b", "Ljava/lang/String;", "getConversationId", "()Ljava/lang/String;", "getConversationId$annotations", "c", "Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;", "getGroup", "()Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;", "getGroup$annotations", "d", "Lcom/spotify/notifications/models/message/CommunicationNotificationMediaAttachment;", "getMediaAttachment", "()Lcom/spotify/notifications/models/message/CommunicationNotificationMediaAttachment;", "getMediaAttachment$annotations", "e", "getMessageUri", "getMessageUri$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class CommunicationNotification {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Person sender;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String conversationId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final CommunicationNotificationGroup group;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final CommunicationNotificationMediaAttachment mediaAttachment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String messageUri;

    public CommunicationNotification(@gk60(name = "sender") Person person, @gk60(name = "conversation_id") String str, @gk60(name = "group") CommunicationNotificationGroup communicationNotificationGroup, @gk60(name = "media_attachment") CommunicationNotificationMediaAttachment communicationNotificationMediaAttachment, @gk60(name = "message_uri") String str2) {
        this.sender = person;
        this.conversationId = str;
        this.group = communicationNotificationGroup;
        this.mediaAttachment = communicationNotificationMediaAttachment;
        this.messageUri = str2;
    }

    @gk60(name = "conversation_id")
    public static /* synthetic */ void getConversationId$annotations() {
    }

    @gk60(name = "group")
    public static /* synthetic */ void getGroup$annotations() {
    }

    @gk60(name = "media_attachment")
    public static /* synthetic */ void getMediaAttachment$annotations() {
    }

    @gk60(name = "message_uri")
    public static /* synthetic */ void getMessageUri$annotations() {
    }

    @gk60(name = "sender")
    public static /* synthetic */ void getSender$annotations() {
    }

    public final CommunicationNotification copy(@gk60(name = "sender") Person sender, @gk60(name = "conversation_id") String conversationId, @gk60(name = "group") CommunicationNotificationGroup group, @gk60(name = "media_attachment") CommunicationNotificationMediaAttachment mediaAttachment, @gk60(name = "message_uri") String messageUri) {
        return new CommunicationNotification(sender, conversationId, group, mediaAttachment, messageUri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationNotification)) {
            return false;
        }
        CommunicationNotification communicationNotification = (CommunicationNotification) obj;
        return wj50.m88271j(this.sender, communicationNotification.sender) && wj50.m88271j(this.conversationId, communicationNotification.conversationId) && wj50.m88271j(this.group, communicationNotification.group) && wj50.m88271j(this.mediaAttachment, communicationNotification.mediaAttachment) && wj50.m88271j(this.messageUri, communicationNotification.messageUri);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.sender.hashCode() * 31, 31, this.conversationId);
        CommunicationNotificationGroup communicationNotificationGroup = this.group;
        int iHashCode = (iM77243b + (communicationNotificationGroup == null ? 0 : communicationNotificationGroup.hashCode())) * 31;
        CommunicationNotificationMediaAttachment communicationNotificationMediaAttachment = this.mediaAttachment;
        int iHashCode2 = (iHashCode + (communicationNotificationMediaAttachment == null ? 0 : communicationNotificationMediaAttachment.hashCode())) * 31;
        String str = this.messageUri;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ CommunicationNotification(Person person, String str, CommunicationNotificationGroup communicationNotificationGroup, CommunicationNotificationMediaAttachment communicationNotificationMediaAttachment, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(person, str, (i & 4) != 0 ? null : communicationNotificationGroup, (i & 8) != 0 ? null : communicationNotificationMediaAttachment, (i & 16) != 0 ? null : str2);
    }
}
