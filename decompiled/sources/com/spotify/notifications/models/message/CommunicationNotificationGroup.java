package com.spotify.notifications.models.message;

import java.util.List;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;", "", "", "name", "Lcom/spotify/notifications/models/message/Avatar;", "avatar", "", "recipients", "<init>", "(Ljava/lang/String;Lcom/spotify/notifications/models/message/Avatar;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Lcom/spotify/notifications/models/message/Avatar;Ljava/util/List;)Lcom/spotify/notifications/models/message/CommunicationNotificationGroup;", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "b", "Lcom/spotify/notifications/models/message/Avatar;", "getAvatar", "()Lcom/spotify/notifications/models/message/Avatar;", "getAvatar$annotations", "c", "Ljava/util/List;", "getRecipients", "()Ljava/util/List;", "getRecipients$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class CommunicationNotificationGroup {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Avatar avatar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final List recipients;

    public CommunicationNotificationGroup(@gk60(name = "name") String str, @gk60(name = "avatar") Avatar avatar, @gk60(name = "recipients") List<String> list) {
        this.name = str;
        this.avatar = avatar;
        this.recipients = list;
    }

    @gk60(name = "avatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @gk60(name = "name")
    public static /* synthetic */ void getName$annotations() {
    }

    @gk60(name = "recipients")
    public static /* synthetic */ void getRecipients$annotations() {
    }

    public final CommunicationNotificationGroup copy(@gk60(name = "name") String name, @gk60(name = "avatar") Avatar avatar, @gk60(name = "recipients") List<String> recipients) {
        return new CommunicationNotificationGroup(name, avatar, recipients);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationNotificationGroup)) {
            return false;
        }
        CommunicationNotificationGroup communicationNotificationGroup = (CommunicationNotificationGroup) obj;
        return wj50.m88271j(this.name, communicationNotificationGroup.name) && wj50.m88271j(this.avatar, communicationNotificationGroup.avatar) && wj50.m88271j(this.recipients, communicationNotificationGroup.recipients);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Avatar avatar = this.avatar;
        int iHashCode2 = (iHashCode + (avatar == null ? 0 : avatar.hashCode())) * 31;
        List list = this.recipients;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
