package com.spotify.notifications.models.message;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/notifications/models/message/Avatar;", "", "", "url", "fallbackBackgroundColor", "fallbackFontColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/notifications/models/message/Avatar;", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getUrl$annotations", "()V", "b", "getFallbackBackgroundColor", "getFallbackBackgroundColor$annotations", "c", "getFallbackFontColor", "getFallbackFontColor$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Avatar {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String fallbackBackgroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String fallbackFontColor;

    public Avatar(@gk60(name = "avatar_url") String str, @gk60(name = "fallback_background_color") String str2, @gk60(name = "fallback_font_color") String str3) {
        this.url = str;
        this.fallbackBackgroundColor = str2;
        this.fallbackFontColor = str3;
    }

    @gk60(name = "fallback_background_color")
    public static /* synthetic */ void getFallbackBackgroundColor$annotations() {
    }

    @gk60(name = "fallback_font_color")
    public static /* synthetic */ void getFallbackFontColor$annotations() {
    }

    @gk60(name = "avatar_url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    public final Avatar copy(@gk60(name = "avatar_url") String url, @gk60(name = "fallback_background_color") String fallbackBackgroundColor, @gk60(name = "fallback_font_color") String fallbackFontColor) {
        return new Avatar(url, fallbackBackgroundColor, fallbackFontColor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return wj50.m88271j(this.url, avatar.url) && wj50.m88271j(this.fallbackBackgroundColor, avatar.fallbackBackgroundColor) && wj50.m88271j(this.fallbackFontColor, avatar.fallbackFontColor);
    }

    public final int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fallbackBackgroundColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fallbackFontColor;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ Avatar(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
