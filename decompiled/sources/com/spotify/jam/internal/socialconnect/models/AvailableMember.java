package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJF\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\r\u0010\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AvailableMember;", "", "", "username", "displayName", "imageUrl", "", "isHost", "isAnonymous", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/spotify/jam/internal/socialconnect/models/AvailableMember;", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getUsername$annotations", "()V", "b", "getDisplayName$annotations", "getImageUrl$annotations", "d", "Z", "e", "()Z", "isHost$annotations", "isAnonymous$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class AvailableMember {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String username;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String displayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isHost;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isAnonymous;

    public AvailableMember(@gk60(name = "username") String str, @gk60(name = "display_name") String str2, @gk60(name = "image_url") String str3, @gk60(name = "is_host") boolean z, @gk60(name = "is_anonymous") boolean z2) {
        this.username = str;
        this.displayName = str2;
        this.imageUrl = str3;
        this.isHost = z;
        this.isAnonymous = z2;
    }

    @gk60(name = "display_name")
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    @gk60(name = "image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @gk60(name = "username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @gk60(name = "is_anonymous")
    public static /* synthetic */ void isAnonymous$annotations() {
    }

    @gk60(name = "is_host")
    public static /* synthetic */ void isHost$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final AvailableMember copy(@gk60(name = "username") String username, @gk60(name = "display_name") String displayName, @gk60(name = "image_url") String imageUrl, @gk60(name = "is_host") boolean isHost, @gk60(name = "is_anonymous") boolean isAnonymous) {
        return new AvailableMember(username, displayName, imageUrl, isHost, isAnonymous);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsHost() {
        return this.isHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableMember)) {
            return false;
        }
        AvailableMember availableMember = (AvailableMember) obj;
        return wj50.m88271j(this.username, availableMember.username) && wj50.m88271j(this.displayName, availableMember.displayName) && wj50.m88271j(this.imageUrl, availableMember.imageUrl) && this.isHost == availableMember.isHost && this.isAnonymous == availableMember.isAnonymous;
    }

    public final int hashCode() {
        int iHashCode = this.username.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        return Boolean.hashCode(this.isAnonymous) + s571.m77245d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isHost);
    }

    public /* synthetic */ AvailableMember(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, z, (i & 16) != 0 ? false : z2);
    }
}
