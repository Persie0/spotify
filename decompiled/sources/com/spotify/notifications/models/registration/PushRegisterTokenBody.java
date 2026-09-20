package com.spotify.notifications.models.registration;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJL\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0010R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0010R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u000e\u0012\u0004\b!\u0010\u0012\u001a\u0004\b \u0010\u0010¨\u0006\""}, m24212d2 = {"Lcom/spotify/notifications/models/registration/PushRegisterTokenBody;", "", "", "platform", "token", "environment", "appId", "osVersion", "appVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/notifications/models/registration/PushRegisterTokenBody;", "a", "Ljava/lang/String;", "getPlatform", "()Ljava/lang/String;", "getPlatform$annotations", "()V", "b", "getToken", "getToken$annotations", "c", "getEnvironment", "getEnvironment$annotations", "d", "getAppId", "getAppId$annotations", "e", "getOsVersion", "getOsVersion$annotations", "f", "getAppVersion", "getAppVersion$annotations", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class PushRegisterTokenBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String platform;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String token;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String environment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String appId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String osVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String appVersion;

    public PushRegisterTokenBody(@gk60(name = "platform") String str, @gk60(name = "token") String str2, @gk60(name = "environment") String str3, @gk60(name = "appId") String str4, @gk60(name = "osVersion") String str5, @gk60(name = "appVersion") String str6) {
        this.platform = str;
        this.token = str2;
        this.environment = str3;
        this.appId = str4;
        this.osVersion = str5;
        this.appVersion = str6;
    }

    @gk60(name = "appId")
    public static /* synthetic */ void getAppId$annotations() {
    }

    @gk60(name = "appVersion")
    public static /* synthetic */ void getAppVersion$annotations() {
    }

    @gk60(name = "environment")
    public static /* synthetic */ void getEnvironment$annotations() {
    }

    @gk60(name = "osVersion")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    @gk60(name = "platform")
    public static /* synthetic */ void getPlatform$annotations() {
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    public final PushRegisterTokenBody copy(@gk60(name = "platform") String platform, @gk60(name = "token") String token, @gk60(name = "environment") String environment, @gk60(name = "appId") String appId, @gk60(name = "osVersion") String osVersion, @gk60(name = "appVersion") String appVersion) {
        return new PushRegisterTokenBody(platform, token, environment, appId, osVersion, appVersion);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushRegisterTokenBody)) {
            return false;
        }
        PushRegisterTokenBody pushRegisterTokenBody = (PushRegisterTokenBody) obj;
        return wj50.m88271j(this.platform, pushRegisterTokenBody.platform) && wj50.m88271j(this.token, pushRegisterTokenBody.token) && wj50.m88271j(this.environment, pushRegisterTokenBody.environment) && wj50.m88271j(this.appId, pushRegisterTokenBody.appId) && wj50.m88271j(this.osVersion, pushRegisterTokenBody.osVersion) && wj50.m88271j(this.appVersion, pushRegisterTokenBody.appVersion);
    }

    public final int hashCode() {
        return this.appVersion.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.platform.hashCode() * 31, 31, this.token), 31, this.environment), 31, this.appId), 31, this.osVersion);
    }
}
