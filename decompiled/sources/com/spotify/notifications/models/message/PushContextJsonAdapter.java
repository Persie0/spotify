package com.spotify.notifications.models.message;

import java.lang.reflect.Constructor;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/notifications/models/message/PushContextJsonAdapter;", "Lp/hk60;", "Lcom/spotify/notifications/models/message/PushContext;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_notifications_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PushContextJsonAdapter extends hk60<PushContext> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6141a = xl60.C2578b.m91389a("opportunityId", "messageId", "appDeviceId", "collapse_key", "pushRequestId", "feature", "featureData");

    /* JADX INFO: renamed from: b */
    public final hk60 f6142b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6143c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6144d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f6145e;

    public PushContextJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6142b = p0i0Var.m68706f(String.class, gbuVar, "opportunityId");
        this.f6143c = p0i0Var.m68706f(String.class, gbuVar, "appDeviceId");
        this.f6144d = p0i0Var.m68706f(mp91.m62457j(Map.class, String.class, String.class), gbuVar, "featureData");
    }

    @Override // p204p.hk60
    public final PushContext fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Map map = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f6141a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) this.f6142b.fromJson(xl60Var);
                    i &= -2;
                    break;
                case 1:
                    str2 = (String) this.f6142b.fromJson(xl60Var);
                    i &= -3;
                    break;
                case 2:
                    str3 = (String) this.f6143c.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("appDeviceId", "appDeviceId", xl60Var);
                    }
                    break;
                    break;
                case 3:
                    str4 = (String) this.f6142b.fromJson(xl60Var);
                    i &= -9;
                    break;
                case 4:
                    str5 = (String) this.f6142b.fromJson(xl60Var);
                    i &= -17;
                    break;
                case 5:
                    str6 = (String) this.f6142b.fromJson(xl60Var);
                    i &= -33;
                    break;
                case 6:
                    map = (Map) this.f6144d.fromJson(xl60Var);
                    i &= -65;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -124) {
            Map map2 = map;
            String str7 = str6;
            String str8 = str5;
            String str9 = str4;
            String str10 = str3;
            String str11 = str2;
            String str12 = str;
            if (str10 != null) {
                return new PushContext(str12, str11, str10, str9, str8, str7, map2);
            }
            throw f0b1.m40461o("appDeviceId", "appDeviceId", xl60Var);
        }
        Map map3 = map;
        String str13 = str6;
        String str14 = str5;
        String str15 = str4;
        String str16 = str3;
        String str17 = str2;
        String str18 = str;
        Constructor declaredConstructor = this.f6145e;
        if (declaredConstructor == null) {
            declaredConstructor = PushContext.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Map.class, Integer.TYPE, f0b1.f64588c);
            this.f6145e = declaredConstructor;
        }
        if (str16 != null) {
            return (PushContext) declaredConstructor.newInstance(str18, str17, str16, str15, str14, str13, map3, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("appDeviceId", "appDeviceId", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, PushContext pushContext) {
        PushContext pushContext2 = pushContext;
        if (pushContext2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("opportunityId");
        String str = pushContext2.opportunityId;
        hk60 hk60Var = this.f6142b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("messageId");
        hk60Var.toJson(rm60Var, pushContext2.messageId);
        rm60Var.mo56894s("appDeviceId");
        this.f6143c.toJson(rm60Var, pushContext2.appDeviceId);
        rm60Var.mo56894s("collapse_key");
        hk60Var.toJson(rm60Var, pushContext2.collapseKey);
        rm60Var.mo56894s("pushRequestId");
        hk60Var.toJson(rm60Var, pushContext2.pushRequestId);
        rm60Var.mo56894s("feature");
        hk60Var.toJson(rm60Var, pushContext2.feature);
        rm60Var.mo56894s("featureData");
        this.f6144d.toJson(rm60Var, pushContext2.featureData);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(33, "GeneratedJsonAdapter(PushContext)");
    }
}
