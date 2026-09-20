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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/JoinOptionJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/JoinOption;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class JoinOptionJsonAdapter extends hk60<JoinOption> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4774a = xl60.C2578b.m91389a("playback_control", "host_approval");

    /* JADX INFO: renamed from: b */
    public final hk60 f4775b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4776c;

    public JoinOptionJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4775b = p0i0Var.m68706f(String.class, gbuVar, "rawPlaybackControl");
        this.f4776c = p0i0Var.m68706f(HostApproval.class, gbuVar, "hostApproval");
    }

    @Override // p204p.hk60
    public final JoinOption fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        HostApproval hostApproval = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4774a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4775b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("rawPlaybackControl", "playback_control", xl60Var);
                }
            } else if (iMo51071K == 1 && (hostApproval = (HostApproval) this.f4776c.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("hostApproval", "host_approval", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("rawPlaybackControl", "playback_control", xl60Var);
        }
        if (hostApproval != null) {
            return new JoinOption(str, hostApproval);
        }
        throw f0b1.m40461o("hostApproval", "host_approval", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, JoinOption joinOption) {
        JoinOption joinOption2 = joinOption;
        if (joinOption2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("playback_control");
        this.f4775b.toJson(rm60Var, joinOption2.getRawPlaybackControl());
        rm60Var.mo56894s("host_approval");
        this.f4776c.toJson(rm60Var, joinOption2.getHostApproval());
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(32, "GeneratedJsonAdapter(JoinOption)");
    }
}
