package com.spotify.notifications.models.message;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJL\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0019\u0010\u000fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, m24212d2 = {"Lcom/spotify/notifications/models/message/RichPushFields;", "", "", "imageUrl", ContextTrack.Metadata.KEY_TITLE, ContextTrack.Metadata.KEY_SUBTITLE, "description", "durationMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/notifications/models/message/RichPushFields;", "a", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "getImageUrl$annotations", "()V", "b", "getTitle", "getTitle$annotations", "c", "getSubtitle", "getSubtitle$annotations", "d", "getDescription", "getDescription$annotations", "e", "getDurationMs", "getDurationMs$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class RichPushFields {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String imageUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String durationMs;

    public RichPushFields(@gk60(name = "image_url") String str, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str2, @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE) String str3, @gk60(name = "description") String str4, @gk60(name = "duration_ms") String str5) {
        this.imageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.description = str4;
        this.durationMs = str5;
    }

    @gk60(name = "description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @gk60(name = "duration_ms")
    public static /* synthetic */ void getDurationMs$annotations() {
    }

    @gk60(name = "image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE)
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_TITLE)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public final RichPushFields copy(@gk60(name = "image_url") String imageUrl, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String title, @gk60(name = ContextTrack.Metadata.KEY_SUBTITLE) String subtitle, @gk60(name = "description") String description, @gk60(name = "duration_ms") String durationMs) {
        return new RichPushFields(imageUrl, title, subtitle, description, durationMs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichPushFields)) {
            return false;
        }
        RichPushFields richPushFields = (RichPushFields) obj;
        return wj50.m88271j(this.imageUrl, richPushFields.imageUrl) && wj50.m88271j(this.title, richPushFields.title) && wj50.m88271j(this.subtitle, richPushFields.subtitle) && wj50.m88271j(this.description, richPushFields.description) && wj50.m88271j(this.durationMs, richPushFields.durationMs);
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.durationMs;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
