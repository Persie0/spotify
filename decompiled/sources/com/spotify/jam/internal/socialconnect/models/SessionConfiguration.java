package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "", "", "name", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "b", "getLogoUrl", "getLogoUrl$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SessionConfiguration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String logoUrl;

    public SessionConfiguration(@gk60(name = "integration_name") String str, @gk60(name = "integration_logo_url") String str2) {
        this.name = str;
        this.logoUrl = str2;
    }

    @gk60(name = "integration_logo_url")
    public static /* synthetic */ void getLogoUrl$annotations() {
    }

    @gk60(name = "integration_name")
    public static /* synthetic */ void getName$annotations() {
    }

    public final SessionConfiguration copy(@gk60(name = "integration_name") String name, @gk60(name = "integration_logo_url") String logoUrl) {
        return new SessionConfiguration(name, logoUrl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfiguration)) {
            return false;
        }
        SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
        return wj50.m88271j(this.name, sessionConfiguration.name) && wj50.m88271j(this.logoUrl, sessionConfiguration.logoUrl);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logoUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
