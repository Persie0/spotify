package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$TokenResponse", "Lcom/spotify/interapp/model/a;", "", "status", "", "reason", "token", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "c", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "getStatus$annotations", "()V", "d", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "getReason$annotations", "e", "getToken", "setToken", "getToken$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$TokenResponse extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Integer status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String reason;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String token;

    public AppProtocol$TokenResponse(@gk60(name = "status") Integer num, @gk60(name = "reason") String str, @gk60(name = "token") String str2) {
        this.status = num;
        this.reason = str;
        this.token = str2;
    }

    @gk60(name = "reason")
    public static /* synthetic */ void getReason$annotations() {
    }

    @gk60(name = "status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }
}
