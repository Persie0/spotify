package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage_DidCreatePlaylistJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$DidCreatePlaylist;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecAndroidToWebMessage_DidCreatePlaylistJsonAdapter extends hk60<VtecAndroidToWebMessage$DidCreatePlaylist> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6779a = xl60.C2578b.m91389a("requestId", "playlistUri", "error");

    /* JADX INFO: renamed from: b */
    public final hk60 f6780b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6781c;

    public VtecAndroidToWebMessage_DidCreatePlaylistJsonAdapter(p0i0 p0i0Var) {
        Class cls = Integer.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f6780b = p0i0Var.m68706f(cls, gbuVar, "requestId");
        this.f6781c = p0i0Var.m68706f(String.class, gbuVar, "playlistUri");
    }

    @Override // p204p.hk60
    public final VtecAndroidToWebMessage$DidCreatePlaylist fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Integer num = null;
        String str = null;
        String str2 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6779a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K != 0) {
                hk60 hk60Var = this.f6781c;
                if (iMo51071K == 1) {
                    str = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                num = (Integer) this.f6780b.fromJson(xl60Var);
                if (num == null) {
                    throw f0b1.m40470x("requestId", "requestId", xl60Var);
                }
            }
        }
        xl60Var.mo51078f();
        if (num != null) {
            return new VtecAndroidToWebMessage$DidCreatePlaylist(num.intValue(), str, str2);
        }
        throw f0b1.m40461o("requestId", "requestId", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecAndroidToWebMessage$DidCreatePlaylist vtecAndroidToWebMessage$DidCreatePlaylist) {
        VtecAndroidToWebMessage$DidCreatePlaylist vtecAndroidToWebMessage$DidCreatePlaylist2 = vtecAndroidToWebMessage$DidCreatePlaylist;
        if (vtecAndroidToWebMessage$DidCreatePlaylist2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("requestId");
        this.f6780b.toJson(rm60Var, Integer.valueOf(vtecAndroidToWebMessage$DidCreatePlaylist2.f6750c));
        rm60Var.mo56894s("playlistUri");
        String str = vtecAndroidToWebMessage$DidCreatePlaylist2.f6751d;
        hk60 hk60Var = this.f6781c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("error");
        hk60Var.toJson(rm60Var, vtecAndroidToWebMessage$DidCreatePlaylist2.f6752e);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(63, "GeneratedJsonAdapter(VtecAndroidToWebMessage.DidCreatePlaylist)");
    }
}
