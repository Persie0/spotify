package com.spotify.notifications.models.message;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/notifications/models/message/Person;", "", "", "userName", "displayName", "Lcom/spotify/notifications/models/message/Avatar;", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/notifications/models/message/Avatar;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/notifications/models/message/Avatar;)Lcom/spotify/notifications/models/message/Person;", "a", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "getUserName$annotations", "()V", "b", "getDisplayName", "getDisplayName$annotations", "c", "Lcom/spotify/notifications/models/message/Avatar;", "getAvatar", "()Lcom/spotify/notifications/models/message/Avatar;", "getAvatar$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Person {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String userName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Avatar avatar;

    public Person(@gk60(name = "username") String str, @gk60(name = "display_name") String str2, @gk60(name = "avatar") Avatar avatar) {
        this.userName = str;
        this.displayName = str2;
        this.avatar = avatar;
    }

    @gk60(name = "avatar")
    public static /* synthetic */ void getAvatar$annotations() {
    }

    @gk60(name = "display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @gk60(name = "username")
    public static /* synthetic */ void getUserName$annotations() {
    }

    public final Person copy(@gk60(name = "username") String userName, @gk60(name = "display_name") String displayName, @gk60(name = "avatar") Avatar avatar) {
        return new Person(userName, displayName, avatar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return wj50.m88271j(this.userName, person.userName) && wj50.m88271j(this.displayName, person.displayName) && wj50.m88271j(this.avatar, person.avatar);
    }

    public final int hashCode() {
        int iHashCode = this.userName.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Avatar avatar = this.avatar;
        return iHashCode2 + (avatar != null ? avatar.hashCode() : 0);
    }

    public /* synthetic */ Person(String str, String str2, Avatar avatar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : avatar);
    }
}
