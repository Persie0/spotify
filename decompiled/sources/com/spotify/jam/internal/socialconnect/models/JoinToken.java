package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\n¨\u0006\r"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/JoinToken;", "", "", "token", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/JoinToken;", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getToken$annotations", "()V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class JoinToken {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String token;

    public JoinToken(@gk60(name = "token") String str) {
        this.token = str;
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final JoinToken copy(@gk60(name = "token") String token) {
        return new JoinToken(token);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JoinToken) && wj50.m88271j(this.token, ((JoinToken) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }
}
