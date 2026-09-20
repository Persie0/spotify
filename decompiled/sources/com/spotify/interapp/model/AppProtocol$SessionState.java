package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.e301;
import p204p.g0j;
import p204p.gk60;
import p204p.ok60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u000b\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0004\u0010\f\"\u0004\b\u0012\u0010\u000eR*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u000b\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0005\u0010\f\"\u0004\b\u0015\u0010\u000eR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$SessionState", "Lcom/spotify/interapp/model/a;", "", "isOffline", "isInForcedOfflineMode", "isLoggedIn", "", "connectionType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setOffline", "(Ljava/lang/Boolean;)V", "isOffline$annotations", "()V", "d", "setInForcedOfflineMode", "isInForcedOfflineMode$annotations", "e", "setLoggedIn", "isLoggedIn$annotations", "f", "Ljava/lang/String;", "getConnectionType", "()Ljava/lang/String;", "setConnectionType", "(Ljava/lang/String;)V", "getConnectionType$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$SessionState extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Boolean isOffline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Boolean isInForcedOfflineMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Boolean isLoggedIn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String connectionType;

    public AppProtocol$SessionState(@gk60(name = "is_offline") Boolean bool, @gk60(name = "is_in_forced_offline_mode") Boolean bool2, @gk60(name = "is_logged_in") Boolean bool3, @gk60(name = "connection_type") String str) {
        this.isOffline = bool;
        this.isInForcedOfflineMode = bool2;
        this.isLoggedIn = bool3;
        this.connectionType = str;
    }

    @gk60(name = "connection_type")
    public static /* synthetic */ void getConnectionType$annotations() {
    }

    @gk60(name = "is_in_forced_offline_mode")
    public static /* synthetic */ void isInForcedOfflineMode$annotations() {
    }

    @gk60(name = "is_logged_in")
    public static /* synthetic */ void isLoggedIn$annotations() {
    }

    @gk60(name = "is_offline")
    public static /* synthetic */ void isOffline$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppProtocol$SessionState(e301 e301Var, boolean z, g0j g0jVar) {
        String str;
        Boolean boolValueOf = Boolean.valueOf(!(e301Var != null ? e301Var.f55578h : true));
        Boolean boolValueOf2 = Boolean.valueOf(!(e301Var != null ? e301Var.f55578h : false) && z);
        Boolean boolValueOf3 = Boolean.valueOf((e301Var != null ? e301Var.f55572b : false) && !e301Var.f55574d);
        switch (g0jVar.ordinal()) {
            case 1:
                str = "none";
                break;
            case 2:
                str = "gprs";
                break;
            case 3:
                str = "edge";
                break;
            case 4:
                str = "3g";
                break;
            case 5:
                str = "4g";
                break;
            case 6:
                str = "wlan";
                break;
            case 7:
                str = "ethernet";
                break;
            default:
                str = "unknown";
                break;
        }
        this(boolValueOf, boolValueOf2, boolValueOf3, str);
    }
}
