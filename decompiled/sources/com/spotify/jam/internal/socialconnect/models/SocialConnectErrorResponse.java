package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SocialConnectErrorResponse;", "", "", "code", "", "message", "<init>", "(ILjava/lang/String;)V", "copy", "(ILjava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/SocialConnectErrorResponse;", "a", "I", "getCode", "()I", "getCode$annotations", "()V", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class SocialConnectErrorResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String message;

    public SocialConnectErrorResponse(@gk60(name = "code") int i, @gk60(name = "message") String str) {
        this.code = i;
        this.message = str;
    }

    @gk60(name = "code")
    public static /* synthetic */ void getCode$annotations() {
    }

    @gk60(name = "message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    public final SocialConnectErrorResponse copy(@gk60(name = "code") int code, @gk60(name = "message") String message) {
        return new SocialConnectErrorResponse(code, message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialConnectErrorResponse)) {
            return false;
        }
        SocialConnectErrorResponse socialConnectErrorResponse = (SocialConnectErrorResponse) obj;
        return this.code == socialConnectErrorResponse.code && wj50.m88271j(this.message, socialConnectErrorResponse.message);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ SocialConnectErrorResponse(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
