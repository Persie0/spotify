package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/PendingJoinRequestJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/PendingJoinRequest;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PendingJoinRequestJsonAdapter extends hk60<PendingJoinRequest> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4806a = xl60.C2578b.m91389a("requester_username", "playback_control", "join_type");

    /* JADX INFO: renamed from: b */
    public final hk60 f4807b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4808c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4809d;

    public PendingJoinRequestJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4807b = p0i0Var.m68706f(String.class, gbuVar, "requestUserName");
        this.f4808c = p0i0Var.m68706f(String.class, gbuVar, "joinType");
    }

    @Override // p204p.hk60
    public final PendingJoinRequest fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4806a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4807b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("requestUserName", "requester_username", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str2 = (String) this.f4807b.fromJson(xl60Var);
                if (str2 == null) {
                    throw f0b1.m40470x("rawPlaybackControl", "playback_control", xl60Var);
                }
            } else if (iMo51071K == 2) {
                str3 = (String) this.f4808c.fromJson(xl60Var);
                i = -5;
            }
        }
        xl60Var.mo51078f();
        if (i == -5) {
            if (str == null) {
                throw f0b1.m40461o("requestUserName", "requester_username", xl60Var);
            }
            if (str2 != null) {
                return new PendingJoinRequest(str, str2, str3);
            }
            throw f0b1.m40461o("rawPlaybackControl", "playback_control", xl60Var);
        }
        Constructor declaredConstructor = this.f4809d;
        if (declaredConstructor == null) {
            declaredConstructor = PendingJoinRequest.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4809d = declaredConstructor;
        }
        if (str == null) {
            throw f0b1.m40461o("requestUserName", "requester_username", xl60Var);
        }
        if (str2 != null) {
            return (PendingJoinRequest) declaredConstructor.newInstance(str, str2, str3, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("rawPlaybackControl", "playback_control", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, PendingJoinRequest pendingJoinRequest) {
        PendingJoinRequest pendingJoinRequest2 = pendingJoinRequest;
        if (pendingJoinRequest2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("requester_username");
        String str = pendingJoinRequest2.requestUserName;
        hk60 hk60Var = this.f4807b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("playback_control");
        hk60Var.toJson(rm60Var, pendingJoinRequest2.rawPlaybackControl);
        rm60Var.mo56894s("join_type");
        this.f4808c.toJson(rm60Var, pendingJoinRequest2.joinType);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(40, "GeneratedJsonAdapter(PendingJoinRequest)");
    }
}
