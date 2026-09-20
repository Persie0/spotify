package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import kotlin.Metadata;
import p204p.gk60;
import p204p.ok60;
import p204p.xf40;
import p204p.xul0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u000b\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u0017\u0012\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006!"}, m24212d2 = {"com/spotify/interapp/model/AppProtocol$Saved", "Lcom/spotify/interapp/model/a;", "", "uri", "id", "", "saved", "canSave", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "c", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "getUri$annotations", "()V", "d", "getId", "setId", "getId$annotations", "e", "Ljava/lang/Boolean;", "getSaved", "()Ljava/lang/Boolean;", "setSaved", "(Ljava/lang/Boolean;)V", "getSaved$annotations", "f", "getCanSave", "setCanSave", "getCanSave$annotations", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final class AppProtocol$Saved extends AbstractC0800a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String uri;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String id;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Boolean saved;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Boolean canSave;

    public AppProtocol$Saved(@gk60(name = "uri") String str, @gk60(name = "id") String str2, @gk60(name = "saved") Boolean bool, @gk60(name = "can_save") Boolean bool2) {
        this.uri = str;
        this.id = str2;
        this.saved = bool;
        this.canSave = bool2;
    }

    @gk60(name = "can_save")
    public static /* synthetic */ void getCanSave$annotations() {
    }

    @gk60(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @gk60(name = "saved")
    public static /* synthetic */ void getSaved$annotations() {
    }

    @gk60(name = "uri")
    public static /* synthetic */ void getUri$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Illegal instructions before constructor call */
    public AppProtocol$Saved(PlayerState playerState) {
        String strUri;
        boolean z;
        ContextTrack contextTrack;
        xf40 xf40VarMetadata;
        String str;
        ContextTrack contextTrack2;
        xf40 xf40VarMetadata2;
        String str2;
        ContextTrack contextTrack3;
        if (playerState == null || (xul0VarTrack = playerState.track()) == null) {
            strUri = null;
        } else {
            xul0 xul0VarTrack = xul0VarTrack.mo49279c() ? xul0VarTrack : null;
            if (xul0VarTrack == null || (contextTrack3 = (ContextTrack) xul0VarTrack.mo49278b()) == null) {
                strUri = null;
            } else {
                strUri = contextTrack3.uri();
            }
        }
        boolean z2 = false;
        if (playerState == null || (xul0VarTrack = playerState.track()) == null) {
            z = false;
        } else {
            xul0 xul0VarTrack2 = xul0VarTrack2.mo49279c() ? xul0VarTrack2 : null;
            if (xul0VarTrack2 == null || (contextTrack2 = (ContextTrack) xul0VarTrack2.mo49278b()) == null || (xf40VarMetadata2 = contextTrack2.metadata()) == null || (str2 = (String) xf40VarMetadata2.get(ContextTrack.Metadata.KEY_COLLECTION_IN_COLLECTION)) == null) {
                z = false;
            } else {
                z = Boolean.parseBoolean(str2);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (playerState != null && (xul0VarTrack = playerState.track()) != null) {
            xul0 xul0VarTrack3 = xul0VarTrack3.mo49279c() ? xul0VarTrack3 : null;
            if (xul0VarTrack3 != null && (contextTrack = (ContextTrack) xul0VarTrack3.mo49278b()) != null && (xf40VarMetadata = contextTrack.metadata()) != null && (str = (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_COLLECTION_CAN_ADD)) != null) {
                z2 = Boolean.parseBoolean(str);
            }
        }
        this(strUri, null, boolValueOf, Boolean.valueOf(z2));
        if (playerState == null) {
            this.saved = Boolean.FALSE;
            return;
        }
        xul0 xul0VarTrack4 = playerState.track();
        if (!xul0VarTrack4.mo49279c()) {
            this.saved = Boolean.FALSE;
            return;
        }
        ContextTrack contextTrack4 = (ContextTrack) xul0VarTrack4.mo49278b();
        this.uri = contextTrack4.uri();
        this.saved = Boolean.valueOf(Boolean.parseBoolean((String) contextTrack4.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_IN_COLLECTION)));
        this.canSave = Boolean.valueOf(Boolean.parseBoolean((String) contextTrack4.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_CAN_ADD)));
    }
}
