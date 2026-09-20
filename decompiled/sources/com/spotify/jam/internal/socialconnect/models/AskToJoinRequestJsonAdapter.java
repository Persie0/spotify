package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AskToJoinRequestJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/AskToJoinRequest;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AskToJoinRequestJsonAdapter extends hk60<AskToJoinRequest> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4681a = xl60.C2578b.m91389a("join_token", "join_type", "playback_control", "join_attempt_id");

    /* JADX INFO: renamed from: b */
    public final hk60 f4682b;

    public AskToJoinRequestJsonAdapter(p0i0 p0i0Var) {
        this.f4682b = p0i0Var.m68706f(String.class, gbu.f78413a, "joinToken");
    }

    @Override // p204p.hk60
    public final AskToJoinRequest fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4681a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4682b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("joinToken", "join_token", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("joinType", "join_type", xl60Var);
                    }
                } else if (iMo51071K == 2) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("rawPlaybackControl", "playback_control", xl60Var);
                    }
                } else if (iMo51071K == 3 && (str4 = (String) hk60Var.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("joinAttemptId", "join_attempt_id", xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("joinToken", "join_token", xl60Var);
        }
        if (str2 == null) {
            throw f0b1.m40461o("joinType", "join_type", xl60Var);
        }
        if (str3 == null) {
            throw f0b1.m40461o("rawPlaybackControl", "playback_control", xl60Var);
        }
        if (str4 != null) {
            return new AskToJoinRequest(str, str2, str3, str4);
        }
        throw f0b1.m40461o("joinAttemptId", "join_attempt_id", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AskToJoinRequest askToJoinRequest) {
        AskToJoinRequest askToJoinRequest2 = askToJoinRequest;
        if (askToJoinRequest2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("join_token");
        String str = askToJoinRequest2.joinToken;
        hk60 hk60Var = this.f4682b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("join_type");
        hk60Var.toJson(rm60Var, askToJoinRequest2.joinType);
        rm60Var.mo56894s("playback_control");
        hk60Var.toJson(rm60Var, askToJoinRequest2.rawPlaybackControl);
        rm60Var.mo56894s("join_attempt_id");
        hk60Var.toJson(rm60Var, askToJoinRequest2.joinAttemptId);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(38, "GeneratedJsonAdapter(AskToJoinRequest)");
    }
}
