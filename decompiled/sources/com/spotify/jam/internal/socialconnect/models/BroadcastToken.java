package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;", "", "", "token", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/BroadcastToken;", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getToken$annotations", "()V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class BroadcastToken {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String token;

    public BroadcastToken(@gk60(name = "token") String str) {
        this.token = str;
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public final BroadcastToken copy(@gk60(name = "token") String token) {
        return new BroadcastToken(token);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BroadcastToken) && wj50.m88271j(this.token, ((BroadcastToken) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }
}
