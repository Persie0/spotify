package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/DiscoveredToken;", "", "", "username", "token", "discoveryMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/DiscoveredToken;", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "getUsername$annotations", "()V", "b", "getToken", "getToken$annotations", "c", "getDiscoveryMethod", "getDiscoveryMethod$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class DiscoveredToken {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String username;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String token;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String discoveryMethod;

    public DiscoveredToken(@gk60(name = "username") String str, @gk60(name = "token") String str2, @gk60(name = "discovery_method") String str3) {
        this.username = str;
        this.token = str2;
        this.discoveryMethod = str3;
    }

    @gk60(name = "discovery_method")
    public static /* synthetic */ void getDiscoveryMethod$annotations() {
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @gk60(name = "username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    public final DiscoveredToken copy(@gk60(name = "username") String username, @gk60(name = "token") String token, @gk60(name = "discovery_method") String discoveryMethod) {
        return new DiscoveredToken(username, token, discoveryMethod);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveredToken)) {
            return false;
        }
        DiscoveredToken discoveredToken = (DiscoveredToken) obj;
        return wj50.m88271j(this.username, discoveredToken.username) && wj50.m88271j(this.token, discoveredToken.token) && wj50.m88271j(this.discoveryMethod, discoveredToken.discoveryMethod);
    }

    public final int hashCode() {
        int iHashCode = this.username.hashCode() * 31;
        String str = this.token;
        return this.discoveryMethod.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ DiscoveredToken(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3);
    }
}
