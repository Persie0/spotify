package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/LookupTokenRequest;", "", "", "username", "discoveryMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/LookupTokenRequest;", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "getUsername$annotations", "()V", "b", "getDiscoveryMethod", "getDiscoveryMethod$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class LookupTokenRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String username;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String discoveryMethod;

    public LookupTokenRequest(@gk60(name = "username") String str, @gk60(name = "discovery_method") String str2) {
        this.username = str;
        this.discoveryMethod = str2;
    }

    @gk60(name = "discovery_method")
    public static /* synthetic */ void getDiscoveryMethod$annotations() {
    }

    @gk60(name = "username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    public final LookupTokenRequest copy(@gk60(name = "username") String username, @gk60(name = "discovery_method") String discoveryMethod) {
        return new LookupTokenRequest(username, discoveryMethod);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LookupTokenRequest)) {
            return false;
        }
        LookupTokenRequest lookupTokenRequest = (LookupTokenRequest) obj;
        return wj50.m88271j(this.username, lookupTokenRequest.username) && wj50.m88271j(this.discoveryMethod, lookupTokenRequest.discoveryMethod);
    }

    public final int hashCode() {
        return this.discoveryMethod.hashCode() + (this.username.hashCode() * 31);
    }
}
