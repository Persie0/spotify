package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AvailableJamJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/AvailableJam;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AvailableJamJsonAdapter extends hk60<AvailableJam> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4694a = xl60.C2578b.m91389a("join_token", "available_members", "playback_device_info", "capabilities");

    /* JADX INFO: renamed from: b */
    public final hk60 f4695b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4696c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4697d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4698e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor f4699f;

    public AvailableJamJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4695b = p0i0Var.m68706f(JoinToken.class, gbuVar, "joinToken");
        this.f4696c = p0i0Var.m68706f(mp91.m62457j(List.class, AvailableMember.class), gbuVar, "members");
        this.f4697d = p0i0Var.m68706f(SessionDeviceInfo.class, gbuVar, "playbackInfo");
        this.f4698e = p0i0Var.m68706f(AvailableJamCapabilities.class, gbuVar, "capabilities");
    }

    @Override // p204p.hk60
    public final AvailableJam fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        JoinToken joinToken = null;
        List list = null;
        SessionDeviceInfo sessionDeviceInfo = null;
        AvailableJamCapabilities availableJamCapabilities = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4694a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                joinToken = (JoinToken) this.f4695b.fromJson(xl60Var);
                if (joinToken == null) {
                    throw f0b1.m40470x("joinToken", "join_token", xl60Var);
                }
            } else if (iMo51071K == 1) {
                list = (List) this.f4696c.fromJson(xl60Var);
                if (list == null) {
                    throw f0b1.m40470x("members", "available_members", xl60Var);
                }
                i &= -3;
            } else if (iMo51071K == 2) {
                sessionDeviceInfo = (SessionDeviceInfo) this.f4697d.fromJson(xl60Var);
                i &= -5;
            } else if (iMo51071K == 3) {
                availableJamCapabilities = (AvailableJamCapabilities) this.f4698e.fromJson(xl60Var);
                if (availableJamCapabilities == null) {
                    throw f0b1.m40470x("capabilities", "capabilities", xl60Var);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        xl60Var.mo51078f();
        if (i == -15) {
            if (joinToken != null) {
                return new AvailableJam(joinToken, list, sessionDeviceInfo, availableJamCapabilities);
            }
            throw f0b1.m40461o("joinToken", "join_token", xl60Var);
        }
        Constructor declaredConstructor = this.f4699f;
        if (declaredConstructor == null) {
            declaredConstructor = AvailableJam.class.getDeclaredConstructor(JoinToken.class, List.class, SessionDeviceInfo.class, AvailableJamCapabilities.class, Integer.TYPE, f0b1.f64588c);
            this.f4699f = declaredConstructor;
        }
        if (joinToken != null) {
            return (AvailableJam) declaredConstructor.newInstance(joinToken, list, sessionDeviceInfo, availableJamCapabilities, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("joinToken", "join_token", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AvailableJam availableJam) {
        AvailableJam availableJam2 = availableJam;
        if (availableJam2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("join_token");
        this.f4695b.toJson(rm60Var, availableJam2.getJoinToken());
        rm60Var.mo56894s("available_members");
        this.f4696c.toJson(rm60Var, availableJam2.getMembers());
        rm60Var.mo56894s("playback_device_info");
        this.f4697d.toJson(rm60Var, availableJam2.getPlaybackInfo());
        rm60Var.mo56894s("capabilities");
        this.f4698e.toJson(rm60Var, availableJam2.getCapabilities());
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(AvailableJam)");
    }
}
