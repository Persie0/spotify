package com.spotify.thestage.vtec.logic;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage_ShareRequestedJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$ShareRequested;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecWebToAndroidMessage_ShareRequestedJsonAdapter extends hk60<VtecWebToAndroidMessage$ShareRequested> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6862a = xl60.C2578b.m91389a("requestId", "url", "imageUrl", "imageData", "message", "destinations", "linkPreviewUrl", "linkPreviewData", "allowAudioAttachment", "audioPreviewEntityUri");

    /* JADX INFO: renamed from: b */
    public final hk60 f6863b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6864c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6865d;

    /* JADX INFO: renamed from: e */
    public final hk60 f6866e;

    /* JADX INFO: renamed from: f */
    public final hk60 f6867f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor f6868g;

    public VtecWebToAndroidMessage_ShareRequestedJsonAdapter(p0i0 p0i0Var) {
        Class cls = Integer.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f6863b = p0i0Var.m68706f(cls, gbuVar, "requestId");
        this.f6864c = p0i0Var.m68706f(String.class, gbuVar, "url");
        this.f6865d = p0i0Var.m68706f(String.class, gbuVar, "imageData");
        this.f6866e = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbuVar, "destinations");
        this.f6867f = p0i0Var.m68706f(Boolean.class, gbuVar, "allowAudioAttachment");
    }

    @Override // p204p.hk60
    public final VtecWebToAndroidMessage$ShareRequested fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        String str7 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f6862a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    num = (Integer) this.f6863b.fromJson(xl60Var);
                    if (num == null) {
                        throw f0b1.m40470x("requestId", "requestId", xl60Var);
                    }
                    break;
                    break;
                case 1:
                    str = (String) this.f6864c.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("url", "url", xl60Var);
                    }
                    break;
                    break;
                case 2:
                    str2 = (String) this.f6864c.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("imageUrl", "imageUrl", xl60Var);
                    }
                    break;
                    break;
                case 3:
                    str3 = (String) this.f6865d.fromJson(xl60Var);
                    i &= -17;
                    break;
                case 4:
                    str4 = (String) this.f6865d.fromJson(xl60Var);
                    break;
                case 5:
                    list = (List) this.f6866e.fromJson(xl60Var);
                    i &= -65;
                    break;
                case 6:
                    str5 = (String) this.f6865d.fromJson(xl60Var);
                    i &= -129;
                    break;
                case 7:
                    str6 = (String) this.f6865d.fromJson(xl60Var);
                    i &= -257;
                    break;
                case 8:
                    bool = (Boolean) this.f6867f.fromJson(xl60Var);
                    i &= -513;
                    break;
                case 9:
                    str7 = (String) this.f6865d.fromJson(xl60Var);
                    i &= -1025;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -2001) {
            String str8 = str4;
            String str9 = str;
            if (num == null) {
                throw f0b1.m40461o("requestId", "requestId", xl60Var);
            }
            String str10 = str3;
            int iIntValue = num.intValue();
            if (str9 == null) {
                throw f0b1.m40461o("url", "url", xl60Var);
            }
            if (str2 == null) {
                throw f0b1.m40461o("imageUrl", "imageUrl", xl60Var);
            }
            return new VtecWebToAndroidMessage$ShareRequested(null, iIntValue, str9, str2, str10, str8, list, str5, str6, bool, str7, 1, null);
        }
        String str11 = str3;
        String str12 = str4;
        String str13 = str;
        List list2 = list;
        String str14 = str2;
        Constructor declaredConstructor = this.f6868g;
        if (declaredConstructor == null) {
            Class<?> cls = f0b1.f64588c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = VtecWebToAndroidMessage$ShareRequested.class.getDeclaredConstructor(String.class, cls2, String.class, String.class, String.class, String.class, List.class, String.class, String.class, Boolean.class, String.class, cls2, cls);
            this.f6868g = declaredConstructor;
        }
        if (num == null) {
            throw f0b1.m40461o("requestId", "requestId", xl60Var);
        }
        if (str13 == null) {
            throw f0b1.m40461o("url", "url", xl60Var);
        }
        if (str14 == null) {
            throw f0b1.m40461o("imageUrl", "imageUrl", xl60Var);
        }
        return (VtecWebToAndroidMessage$ShareRequested) declaredConstructor.newInstance(null, num, str13, str14, str11, str12, list2, str5, str6, bool, str7, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested) {
        VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested2 = vtecWebToAndroidMessage$ShareRequested;
        if (vtecWebToAndroidMessage$ShareRequested2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("requestId");
        this.f6863b.toJson(rm60Var, Integer.valueOf(vtecWebToAndroidMessage$ShareRequested2.f6824b));
        rm60Var.mo56894s("url");
        String str = vtecWebToAndroidMessage$ShareRequested2.f6825c;
        hk60 hk60Var = this.f6864c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("imageUrl");
        hk60Var.toJson(rm60Var, vtecWebToAndroidMessage$ShareRequested2.f6826d);
        rm60Var.mo56894s("imageData");
        String str2 = vtecWebToAndroidMessage$ShareRequested2.f6827e;
        hk60 hk60Var2 = this.f6865d;
        hk60Var2.toJson(rm60Var, str2);
        rm60Var.mo56894s("message");
        hk60Var2.toJson(rm60Var, vtecWebToAndroidMessage$ShareRequested2.f6828f);
        rm60Var.mo56894s("destinations");
        this.f6866e.toJson(rm60Var, vtecWebToAndroidMessage$ShareRequested2.f6829g);
        rm60Var.mo56894s("linkPreviewUrl");
        hk60Var2.toJson(rm60Var, vtecWebToAndroidMessage$ShareRequested2.f6830h);
        rm60Var.mo56894s("linkPreviewData");
        hk60Var2.toJson(rm60Var, vtecWebToAndroidMessage$ShareRequested2.f6831i);
        rm60Var.mo56894s("allowAudioAttachment");
        this.f6867f.toJson(rm60Var, vtecWebToAndroidMessage$ShareRequested2.f6832j);
        rm60Var.mo56894s("audioPreviewEntityUri");
        hk60Var2.toJson(rm60Var, vtecWebToAndroidMessage$ShareRequested2.f6833k);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(60, "GeneratedJsonAdapter(VtecWebToAndroidMessage.ShareRequested)");
    }
}
