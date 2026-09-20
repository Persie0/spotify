package com.spotify.thestage.vtec.logic;

import com.spotify.player.model.Context;
import java.util.Map;
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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/CapabilitiesJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/Capabilities;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CapabilitiesJsonAdapter extends hk60<Capabilities> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6736a = xl60.C2578b.m91389a("playback", "checkout", "detectScreenshot", "localPrefs", "createPlaylist", "links", "toolbarVis", "presentEditProfile", "sharing", Context.Metadata.LICENSE_ON_DEMAND_WHEN_FREE);

    /* JADX INFO: renamed from: b */
    public final hk60 f6737b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6738c;

    public CapabilitiesJsonAdapter(p0i0 p0i0Var) {
        Class cls = Integer.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f6737b = p0i0Var.m68706f(cls, gbuVar, "playback");
        this.f6738c = p0i0Var.m68706f(mp91.m62457j(Map.class, String.class, Integer.class), gbuVar, Context.Metadata.LICENSE_ON_DEMAND_WHEN_FREE);
    }

    @Override // p204p.hk60
    public final Capabilities fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Map map = null;
        while (true) {
            Integer num10 = num;
            Integer num11 = num2;
            Integer num12 = num3;
            Integer num13 = num4;
            Integer num14 = num5;
            if (!xl60Var.mo51079i()) {
                Integer num15 = num6;
                xl60Var.mo51078f();
                if (num10 == null) {
                    throw f0b1.m40461o("playback", "playback", xl60Var);
                }
                int iIntValue = num10.intValue();
                if (num11 == null) {
                    throw f0b1.m40461o("checkout", "checkout", xl60Var);
                }
                int iIntValue2 = num11.intValue();
                if (num12 == null) {
                    throw f0b1.m40461o("detectScreenshot", "detectScreenshot", xl60Var);
                }
                int iIntValue3 = num12.intValue();
                if (num13 == null) {
                    throw f0b1.m40461o("localPrefs", "localPrefs", xl60Var);
                }
                int iIntValue4 = num13.intValue();
                if (num14 == null) {
                    throw f0b1.m40461o("createPlaylist", "createPlaylist", xl60Var);
                }
                int iIntValue5 = num14.intValue();
                if (num15 == null) {
                    throw f0b1.m40461o("links", "links", xl60Var);
                }
                int iIntValue6 = num15.intValue();
                if (num7 == null) {
                    throw f0b1.m40461o("toolbarVis", "toolbarVis", xl60Var);
                }
                int iIntValue7 = num7.intValue();
                if (num8 == null) {
                    throw f0b1.m40461o("presentEditProfile", "presentEditProfile", xl60Var);
                }
                int iIntValue8 = num8.intValue();
                if (num9 != null) {
                    return new Capabilities(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, num9.intValue(), map);
                }
                throw f0b1.m40461o("sharing", "sharing", xl60Var);
            }
            int iMo51071K = xl60Var.mo51071K(this.f6736a);
            Integer num16 = num6;
            hk60 hk60Var = this.f6737b;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                case 0:
                    num = (Integer) hk60Var.fromJson(xl60Var);
                    if (num == null) {
                        throw f0b1.m40470x("playback", "playback", xl60Var);
                    }
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                case 1:
                    num2 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num2 == null) {
                        throw f0b1.m40470x("checkout", "checkout", xl60Var);
                    }
                    num = num10;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                    break;
                case 2:
                    num3 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num3 == null) {
                        throw f0b1.m40470x("detectScreenshot", "detectScreenshot", xl60Var);
                    }
                    num = num10;
                    num2 = num11;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                    break;
                case 3:
                    num4 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num4 == null) {
                        throw f0b1.m40470x("localPrefs", "localPrefs", xl60Var);
                    }
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num5 = num14;
                    num6 = num16;
                    break;
                    break;
                case 4:
                    num5 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num5 == null) {
                        throw f0b1.m40470x("createPlaylist", "createPlaylist", xl60Var);
                    }
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num6 = num16;
                    break;
                    break;
                case 5:
                    num6 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num6 == null) {
                        throw f0b1.m40470x("links", "links", xl60Var);
                    }
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    break;
                    break;
                case 6:
                    num7 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num7 == null) {
                        throw f0b1.m40470x("toolbarVis", "toolbarVis", xl60Var);
                    }
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                case 7:
                    num8 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num8 == null) {
                        throw f0b1.m40470x("presentEditProfile", "presentEditProfile", xl60Var);
                    }
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                case 8:
                    num9 = (Integer) hk60Var.fromJson(xl60Var);
                    if (num9 == null) {
                        throw f0b1.m40470x("sharing", "sharing", xl60Var);
                    }
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                case 9:
                    map = (Map) this.f6738c.fromJson(xl60Var);
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
                default:
                    num = num10;
                    num2 = num11;
                    num3 = num12;
                    num4 = num13;
                    num5 = num14;
                    num6 = num16;
                    break;
            }
        }
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Capabilities capabilities) {
        Capabilities capabilities2 = capabilities;
        if (capabilities2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("playback");
        Integer numValueOf = Integer.valueOf(capabilities2.f6726a);
        hk60 hk60Var = this.f6737b;
        hk60Var.toJson(rm60Var, numValueOf);
        rm60Var.mo56894s("checkout");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6727b));
        rm60Var.mo56894s("detectScreenshot");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6728c));
        rm60Var.mo56894s("localPrefs");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6729d));
        rm60Var.mo56894s("createPlaylist");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6730e));
        rm60Var.mo56894s("links");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6731f));
        rm60Var.mo56894s("toolbarVis");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6732g));
        rm60Var.mo56894s("presentEditProfile");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6733h));
        rm60Var.mo56894s("sharing");
        hk60Var.toJson(rm60Var, Integer.valueOf(capabilities2.f6734i));
        rm60Var.mo56894s(Context.Metadata.LICENSE_ON_DEMAND_WHEN_FREE);
        this.f6738c.toJson(rm60Var, capabilities2.f6735j);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(Capabilities)");
    }
}
