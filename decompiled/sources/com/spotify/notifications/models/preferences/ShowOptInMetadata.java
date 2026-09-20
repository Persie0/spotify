package com.spotify.notifications.models.preferences;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0010R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0012\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m24212d2 = {"Lcom/spotify/notifications/models/preferences/ShowOptInMetadata;", "", "", "showUri", ContextTrack.Metadata.KEY_TITLE, "publisher", "showImageId", "", "optedIn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/spotify/notifications/models/preferences/ShowOptInMetadata;", "a", "Ljava/lang/String;", "getShowUri", "()Ljava/lang/String;", "getShowUri$annotations", "()V", "b", "getTitle", "getTitle$annotations", "c", "getPublisher", "getPublisher$annotations", "d", "getShowImageId", "getShowImageId$annotations", "e", "Z", "getOptedIn", "()Z", "getOptedIn$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ShowOptInMetadata {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String showUri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String publisher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String showImageId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean optedIn;

    public ShowOptInMetadata(@gk60(name = "showUri") String str, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String str2, @gk60(name = "publisher") String str3, @gk60(name = "showImageId") String str4, @gk60(name = "optedIn") boolean z) {
        this.showUri = str;
        this.title = str2;
        this.publisher = str3;
        this.showImageId = str4;
        this.optedIn = z;
    }

    @gk60(name = "optedIn")
    public static /* synthetic */ void getOptedIn$annotations() {
    }

    @gk60(name = "publisher")
    public static /* synthetic */ void getPublisher$annotations() {
    }

    @gk60(name = "showImageId")
    public static /* synthetic */ void getShowImageId$annotations() {
    }

    @gk60(name = "showUri")
    public static /* synthetic */ void getShowUri$annotations() {
    }

    @gk60(name = ContextTrack.Metadata.KEY_TITLE)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public final ShowOptInMetadata copy(@gk60(name = "showUri") String showUri, @gk60(name = ContextTrack.Metadata.KEY_TITLE) String title, @gk60(name = "publisher") String publisher, @gk60(name = "showImageId") String showImageId, @gk60(name = "optedIn") boolean optedIn) {
        return new ShowOptInMetadata(showUri, title, publisher, showImageId, optedIn);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowOptInMetadata)) {
            return false;
        }
        ShowOptInMetadata showOptInMetadata = (ShowOptInMetadata) obj;
        return wj50.m88271j(this.showUri, showOptInMetadata.showUri) && wj50.m88271j(this.title, showOptInMetadata.title) && wj50.m88271j(this.publisher, showOptInMetadata.publisher) && wj50.m88271j(this.showImageId, showOptInMetadata.showImageId) && this.optedIn == showOptInMetadata.optedIn;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.optedIn) + s571.m77243b(s571.m77243b(s571.m77243b(this.showUri.hashCode() * 31, 31, this.title), 31, this.publisher), 31, this.showImageId);
    }
}
