package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequestJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ActiveJoinRequestJsonAdapter extends hk60<ActiveJoinRequest> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4674a = xl60.C2578b.m91389a("username", "playback_device_info", "playback_control");

    /* JADX INFO: renamed from: b */
    public final hk60 f4675b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4676c;

    public ActiveJoinRequestJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4675b = p0i0Var.m68706f(String.class, gbuVar, "userName");
        this.f4676c = p0i0Var.m68706f(SessionDeviceInfo.class, gbuVar, "playbackDeviceInfo");
    }

    @Override // p204p.hk60
    public final ActiveJoinRequest fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        SessionDeviceInfo sessionDeviceInfo = null;
        String str2 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4674a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4675b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("userName", "username", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    sessionDeviceInfo = (SessionDeviceInfo) this.f4676c.fromJson(xl60Var);
                    if (sessionDeviceInfo == null) {
                        throw f0b1.m40470x("playbackDeviceInfo", "playback_device_info", xl60Var);
                    }
                } else if (iMo51071K == 2 && (str2 = (String) hk60Var.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("rawPlaybackControl", "playback_control", xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("userName", "username", xl60Var);
        }
        if (sessionDeviceInfo == null) {
            throw f0b1.m40461o("playbackDeviceInfo", "playback_device_info", xl60Var);
        }
        if (str2 != null) {
            return new ActiveJoinRequest(str, sessionDeviceInfo, str2);
        }
        throw f0b1.m40461o("rawPlaybackControl", "playback_control", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ActiveJoinRequest activeJoinRequest) {
        ActiveJoinRequest activeJoinRequest2 = activeJoinRequest;
        if (activeJoinRequest2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("username");
        String str = activeJoinRequest2.userName;
        hk60 hk60Var = this.f4675b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("playback_device_info");
        this.f4676c.toJson(rm60Var, activeJoinRequest2.playbackDeviceInfo);
        rm60Var.mo56894s("playback_control");
        hk60Var.toJson(rm60Var, activeJoinRequest2.rawPlaybackControl);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(39, "GeneratedJsonAdapter(ActiveJoinRequest)");
    }
}
