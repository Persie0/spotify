package com.spotify.notifications.models.registration;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/notifications/models/registration/PushUnregisterTokenBody;", "", "", "platform", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/notifications/models/registration/PushUnregisterTokenBody;", "a", "Ljava/lang/String;", "getPlatform", "()Ljava/lang/String;", "getPlatform$annotations", "()V", "b", "getToken", "getToken$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class PushUnregisterTokenBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String platform;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String token;

    public PushUnregisterTokenBody(@gk60(name = "platform") String str, @gk60(name = "token") String str2) {
        this.platform = str;
        this.token = str2;
    }

    @gk60(name = "platform")
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public final PushUnregisterTokenBody copy(@gk60(name = "platform") String platform, @gk60(name = "token") String token) {
        return new PushUnregisterTokenBody(platform, token);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushUnregisterTokenBody)) {
            return false;
        }
        PushUnregisterTokenBody pushUnregisterTokenBody = (PushUnregisterTokenBody) obj;
        return wj50.m88271j(this.platform, pushUnregisterTokenBody.platform) && wj50.m88271j(this.token, pushUnregisterTokenBody.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (this.platform.hashCode() * 31);
    }
}
