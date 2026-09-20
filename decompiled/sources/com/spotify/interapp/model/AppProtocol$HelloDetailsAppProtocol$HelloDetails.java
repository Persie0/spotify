package com.spotify.interapp.model;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.sc5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001BU\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0001\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u0015\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010\u0015\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R6\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u0010\u0015\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$HelloDetails", "Lp/sc5;", "Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;", "roles", "Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Info;", "info", "", "", "authmethods", "authid", "", "extras", "<init>", "(Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Info;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "c", "Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;", "getRoles", "()Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;", "setRoles", "(Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Roles;)V", "getRoles$annotations", "()V", "d", "Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Info;", "getInfo", "()Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Info;", "setInfo", "(Lcom/spotify/interapp/model/AppProtocol$HelloDetailsAppProtocol$Info;)V", "getInfo$annotations", "e", "Ljava/util/List;", "getAuthmethods", "()Ljava/util/List;", "setAuthmethods", "(Ljava/util/List;)V", "getAuthmethods$annotations", "f", "Ljava/lang/String;", "getAuthid", "()Ljava/lang/String;", "setAuthid", "(Ljava/lang/String;)V", "getAuthid$annotations", "g", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "getExtras$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$HelloDetailsAppProtocol$HelloDetails extends sc5 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final AppProtocol$HelloDetailsAppProtocol$Roles roles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final AppProtocol$HelloDetailsAppProtocol$Info info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final List authmethods;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String authid;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final Map extras;

    public AppProtocol$HelloDetailsAppProtocol$HelloDetails(@gk60(name = "roles") AppProtocol$HelloDetailsAppProtocol$Roles appProtocol$HelloDetailsAppProtocol$Roles, @gk60(name = "info") AppProtocol$HelloDetailsAppProtocol$Info appProtocol$HelloDetailsAppProtocol$Info, @gk60(name = "authmethods") List<String> list, @gk60(name = "authid") String str, @gk60(name = "extras") Map<String, String> map) {
        this.roles = appProtocol$HelloDetailsAppProtocol$Roles;
        this.info = appProtocol$HelloDetailsAppProtocol$Info;
        this.authmethods = list;
        this.authid = str;
        this.extras = map;
    }

    @gk60(name = "authid")
    public static /* synthetic */ void getAuthid$annotations() {
    }

    @gk60(name = "authmethods")
    public static /* synthetic */ void getAuthmethods$annotations() {
    }

    @gk60(name = "extras")
    public static /* synthetic */ void getExtras$annotations() {
    }

    @gk60(name = "info")
    public static /* synthetic */ void getInfo$annotations() {
    }

    @gk60(name = "roles")
    public static /* synthetic */ void getRoles$annotations() {
    }
}
