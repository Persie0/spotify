package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u0016\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR*\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010\u0016\u0012\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR*\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010\u0016\u0012\u0004\b'\u0010\u0014\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR*\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010\u0016\u0012\u0004\b+\u0010\u0014\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR*\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010\u0016\u0012\u0004\b/\u0010\u0014\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001a¨\u00060"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$WelcomeDetails", "Lcom/spotify/interapp/model/a;", "Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;", "roles", "", "appversion", "authprovider", "authid", "authrole", "authmethod", "dateTime", "<init>", "(Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;", "getRoles", "()Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;", "setRoles", "(Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;)V", "getRoles$annotations", "()V", "d", "Ljava/lang/String;", "getAppversion", "()Ljava/lang/String;", "setAppversion", "(Ljava/lang/String;)V", "getAppversion$annotations", "e", "getAuthprovider", "setAuthprovider", "getAuthprovider$annotations", "f", "getAuthid", "setAuthid", "getAuthid$annotations", "g", "getAuthrole", "setAuthrole", "getAuthrole$annotations", "h", "getAuthmethod", "setAuthmethod", "getAuthmethod$annotations", "i", "getDateTime", "setDateTime", "getDateTime$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$WelcomeDetails extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final AppProtocol$HelloDetailsAppProtocol$Roles roles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String appversion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String authprovider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String authid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String authrole;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final String authmethod;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String dateTime;

    public AppProtocol$WelcomeDetails(@gk60(name = "roles") AppProtocol$HelloDetailsAppProtocol$Roles appProtocol$HelloDetailsAppProtocol$Roles, @gk60(name = "app_version") String str, @gk60(name = "authprovider") String str2, @gk60(name = "authid") String str3, @gk60(name = "authrole") String str4, @gk60(name = "authmethod") String str5, @gk60(name = "date_time") String str6) {
        this.roles = appProtocol$HelloDetailsAppProtocol$Roles;
        this.appversion = str;
        this.authprovider = str2;
        this.authid = str3;
        this.authrole = str4;
        this.authmethod = str5;
        this.dateTime = str6;
    }

    @gk60(name = "app_version")
    public static /* synthetic */ void getAppversion$annotations() {
    }

    @gk60(name = "authid")
    public static /* synthetic */ void getAuthid$annotations() {
    }

    @gk60(name = "authmethod")
    public static /* synthetic */ void getAuthmethod$annotations() {
    }

    @gk60(name = "authprovider")
    public static /* synthetic */ void getAuthprovider$annotations() {
    }

    @gk60(name = "authrole")
    public static /* synthetic */ void getAuthrole$annotations() {
    }

    @gk60(name = "date_time")
    public static /* synthetic */ void getDateTime$annotations() {
    }

    @gk60(name = "roles")
    public static /* synthetic */ void getRoles$annotations() {
    }
}
