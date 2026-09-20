package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage_CreatePlaylistRequestedJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$CreatePlaylistRequested;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecWebToAndroidMessage_CreatePlaylistRequestedJsonAdapter extends hk60<VtecWebToAndroidMessage$CreatePlaylistRequested> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6845a = xl60.C2578b.m91389a("requestId", "name", "imageUrl", "description", "trackUris");

    /* JADX INFO: renamed from: b */
    public final hk60 f6846b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6847c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6848d;

    public VtecWebToAndroidMessage_CreatePlaylistRequestedJsonAdapter(p0i0 p0i0Var) {
        Class cls = Integer.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f6846b = p0i0Var.m68706f(cls, gbuVar, "requestId");
        this.f6847c = p0i0Var.m68706f(String.class, gbuVar, "name");
        this.f6848d = p0i0Var.m68706f(mp91.m62449b(String.class), gbuVar, "trackUris");
    }

    @Override // p204p.hk60
    public final VtecWebToAndroidMessage$CreatePlaylistRequested fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String[] strArr = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6845a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K != 0) {
                hk60 hk60Var = this.f6847c;
                if (iMo51071K == 1) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("name", "name", xl60Var);
                    }
                } else if (iMo51071K == 2) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("imageUrl", "imageUrl", xl60Var);
                    }
                } else if (iMo51071K == 3) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("description", "description", xl60Var);
                    }
                } else if (iMo51071K == 4 && (strArr = (String[]) this.f6848d.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("trackUris", "trackUris", xl60Var);
                }
            } else {
                num = (Integer) this.f6846b.fromJson(xl60Var);
                if (num == null) {
                    throw f0b1.m40470x("requestId", "requestId", xl60Var);
                }
            }
        }
        xl60Var.mo51078f();
        if (num == null) {
            throw f0b1.m40461o("requestId", "requestId", xl60Var);
        }
        int iIntValue = num.intValue();
        if (str == null) {
            throw f0b1.m40461o("name", "name", xl60Var);
        }
        if (str2 == null) {
            throw f0b1.m40461o("imageUrl", "imageUrl", xl60Var);
        }
        if (str3 == null) {
            throw f0b1.m40461o("description", "description", xl60Var);
        }
        if (strArr != null) {
            return new VtecWebToAndroidMessage$CreatePlaylistRequested(null, iIntValue, str, str2, str3, strArr, 1, null);
        }
        throw f0b1.m40461o("trackUris", "trackUris", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecWebToAndroidMessage$CreatePlaylistRequested vtecWebToAndroidMessage$CreatePlaylistRequested) {
        VtecWebToAndroidMessage$CreatePlaylistRequested vtecWebToAndroidMessage$CreatePlaylistRequested2 = vtecWebToAndroidMessage$CreatePlaylistRequested;
        if (vtecWebToAndroidMessage$CreatePlaylistRequested2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("requestId");
        this.f6846b.toJson(rm60Var, Integer.valueOf(vtecWebToAndroidMessage$CreatePlaylistRequested2.f6804b));
        rm60Var.mo56894s("name");
        String str = vtecWebToAndroidMessage$CreatePlaylistRequested2.f6805c;
        hk60 hk60Var = this.f6847c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("imageUrl");
        hk60Var.toJson(rm60Var, vtecWebToAndroidMessage$CreatePlaylistRequested2.f6806d);
        rm60Var.mo56894s("description");
        hk60Var.toJson(rm60Var, vtecWebToAndroidMessage$CreatePlaylistRequested2.f6807e);
        rm60Var.mo56894s("trackUris");
        this.f6848d.toJson(rm60Var, vtecWebToAndroidMessage$CreatePlaylistRequested2.f6808f);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(69, "GeneratedJsonAdapter(VtecWebToAndroidMessage.CreatePlaylistRequested)");
    }
}
