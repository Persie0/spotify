package com.spotify.jam.internal.socialconnect.models;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.nau;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR,\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/DetectedToken;", "", "", "token", "discoveryMethod", "", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/spotify/jam/internal/socialconnect/models/DetectedToken;", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getToken$annotations", "()V", "b", "getDiscoveryMethod", "getDiscoveryMethod$annotations", "c", "Ljava/util/Map;", "getTags", "()Ljava/util/Map;", "getTags$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class DetectedToken {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String discoveryMethod;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Map tags;

    public DetectedToken(@gk60(name = "token") String str, @gk60(name = "discovery_method") String str2, @gk60(name = "tags") Map<String, String> map) {
        this.token = str;
        this.discoveryMethod = str2;
        this.tags = map;
    }

    @gk60(name = "discovery_method")
    public static /* synthetic */ void getDiscoveryMethod$annotations() {
    }

    @gk60(name = "tags")
    public static /* synthetic */ void getTags$annotations() {
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public final DetectedToken copy(@gk60(name = "token") String token, @gk60(name = "discovery_method") String discoveryMethod, @gk60(name = "tags") Map<String, String> tags) {
        return new DetectedToken(token, discoveryMethod, tags);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetectedToken)) {
            return false;
        }
        DetectedToken detectedToken = (DetectedToken) obj;
        return wj50.m88271j(this.token, detectedToken.token) && wj50.m88271j(this.discoveryMethod, detectedToken.discoveryMethod) && wj50.m88271j(this.tags, detectedToken.tags);
    }

    public final int hashCode() {
        return this.tags.hashCode() + s571.m77243b(this.token.hashCode() * 31, 31, this.discoveryMethod);
    }

    public /* synthetic */ DetectedToken(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? nau.f152117a : map);
    }
}
