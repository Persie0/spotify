package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.p301;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/Session;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SessionJsonAdapter extends hk60<Session> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4895a = xl60.C2578b.m91389a("timestamp", "session_id", "join_session_token", "join_session_url", "session_owner_id", "session_members", "is_listening", "is_controlling", "initialSessionType", "hostActiveDeviceId", "maxMemberCount", "is_session_owner", "participantVolumeControl", "active", "queue_only_mode", "wifi_broadcast", "origin", "configuration", "host_device_info", "quick_blend", "is_paused", "user_capabilities", "is_jam_paused", "is_jam_capped", "session_config");

    /* JADX INFO: renamed from: b */
    public final hk60 f4896b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4897c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4898d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4899e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4900f;

    /* JADX INFO: renamed from: g */
    public final hk60 f4901g;

    /* JADX INFO: renamed from: h */
    public final hk60 f4902h;

    /* JADX INFO: renamed from: i */
    public final hk60 f4903i;

    /* JADX INFO: renamed from: j */
    public final hk60 f4904j;

    /* JADX INFO: renamed from: k */
    public final hk60 f4905k;

    /* JADX INFO: renamed from: l */
    public final hk60 f4906l;

    /* JADX INFO: renamed from: m */
    public final hk60 f4907m;

    /* JADX INFO: renamed from: n */
    public volatile Constructor f4908n;

    public SessionJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4896b = p0i0Var.m68706f(Long.class, gbuVar, "timestamp");
        this.f4897c = p0i0Var.m68706f(String.class, gbuVar, "sessionId");
        this.f4898d = p0i0Var.m68706f(mp91.m62457j(List.class, SessionMember.class), gbuVar, "sessionMembers");
        this.f4899e = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "isListening");
        this.f4900f = p0i0Var.m68706f(p301.class, gbuVar, "initialSessionType");
        this.f4901g = p0i0Var.m68706f(Integer.class, gbuVar, "maxMemberCount");
        this.f4902h = p0i0Var.m68706f(Boolean.class, gbuVar, "isSessionOwner");
        this.f4903i = p0i0Var.m68706f(SessionOrigin.class, gbuVar, "origin");
        this.f4904j = p0i0Var.m68706f(SessionConfiguration.class, gbuVar, "configuration");
        this.f4905k = p0i0Var.m68706f(SessionDeviceInfo.class, gbuVar, "hostDeviceInfo");
        this.f4906l = p0i0Var.m68706f(SessionUserCapabilities.class, gbuVar, "userCapabilities");
        this.f4907m = p0i0Var.m68706f(SessionConfig.class, gbuVar, "sessionConfig");
    }

    @Override // p204p.hk60
    public final Session fromJson(xl60 xl60Var) throws NoSuchMethodException {
        int i;
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        int i2 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        Boolean bool7 = bool6;
        Boolean bool8 = bool7;
        Boolean bool9 = bool8;
        Boolean bool10 = bool9;
        String str = null;
        Integer num = null;
        Boolean bool11 = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        p301 p301Var = null;
        SessionOrigin sessionOrigin = null;
        SessionConfiguration sessionConfiguration = null;
        SessionDeviceInfo sessionDeviceInfo = null;
        SessionUserCapabilities sessionUserCapabilities = null;
        SessionConfig sessionConfig = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f4895a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    continue;
                case 0:
                    l = (Long) this.f4896b.fromJson(xl60Var);
                    i2 &= -2;
                    continue;
                case 1:
                    str3 = (String) this.f4897c.fromJson(xl60Var);
                    i2 &= -3;
                    continue;
                case 2:
                    str4 = (String) this.f4897c.fromJson(xl60Var);
                    i2 &= -5;
                    continue;
                case 3:
                    str5 = (String) this.f4897c.fromJson(xl60Var);
                    i2 &= -9;
                    continue;
                case 4:
                    str6 = (String) this.f4897c.fromJson(xl60Var);
                    i2 &= -17;
                    continue;
                case 5:
                    list = (List) this.f4898d.fromJson(xl60Var);
                    i2 &= -33;
                    continue;
                case 6:
                    bool2 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("isListening", "is_listening", xl60Var);
                    }
                    i2 &= -65;
                    continue;
                    break;
                case 7:
                    bool3 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool3 == null) {
                        throw f0b1.m40470x("isControlling", "is_controlling", xl60Var);
                    }
                    i2 &= -129;
                    continue;
                    break;
                case 8:
                    p301Var = (p301) this.f4900f.fromJson(xl60Var);
                    i2 &= -257;
                    continue;
                case 9:
                    str = (String) this.f4897c.fromJson(xl60Var);
                    i2 &= -513;
                    continue;
                case 10:
                    num = (Integer) this.f4901g.fromJson(xl60Var);
                    i2 &= -1025;
                    continue;
                case 11:
                    bool11 = (Boolean) this.f4902h.fromJson(xl60Var);
                    i2 &= -2049;
                    continue;
                case 12:
                    str2 = (String) this.f4897c.fromJson(xl60Var);
                    i2 &= -4097;
                    continue;
                case 13:
                    bool4 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool4 == null) {
                        throw f0b1.m40470x("active", "active", xl60Var);
                    }
                    i2 &= -8193;
                    continue;
                    break;
                case 14:
                    bool5 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool5 == null) {
                        throw f0b1.m40470x("queueOnlyMode", "queue_only_mode", xl60Var);
                    }
                    i2 &= -16385;
                    continue;
                    break;
                case 15:
                    bool6 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool6 == null) {
                        throw f0b1.m40470x("wifiBroadcast", "wifi_broadcast", xl60Var);
                    }
                    i = -32769;
                    break;
                    break;
                case 16:
                    sessionOrigin = (SessionOrigin) this.f4903i.fromJson(xl60Var);
                    i = -65537;
                    break;
                case 17:
                    sessionConfiguration = (SessionConfiguration) this.f4904j.fromJson(xl60Var);
                    i = -131073;
                    break;
                case 18:
                    sessionDeviceInfo = (SessionDeviceInfo) this.f4905k.fromJson(xl60Var);
                    i = -262145;
                    break;
                case 19:
                    bool7 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool7 == null) {
                        throw f0b1.m40470x("mixedTastesEnabled", "quick_blend", xl60Var);
                    }
                    i = -524289;
                    break;
                    break;
                case 20:
                    bool8 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool8 == null) {
                        throw f0b1.m40470x("isPaused", "is_paused", xl60Var);
                    }
                    i = -1048577;
                    break;
                    break;
                case 21:
                    sessionUserCapabilities = (SessionUserCapabilities) this.f4906l.fromJson(xl60Var);
                    i = -2097153;
                    break;
                case 22:
                    bool9 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool9 == null) {
                        throw f0b1.m40470x("isJamPaused", "is_jam_paused", xl60Var);
                    }
                    i = -4194305;
                    break;
                    break;
                case 23:
                    bool10 = (Boolean) this.f4899e.fromJson(xl60Var);
                    if (bool10 == null) {
                        throw f0b1.m40470x("isJamCapped", "is_jam_capped", xl60Var);
                    }
                    i = -8388609;
                    break;
                    break;
                case 24:
                    sessionConfig = (SessionConfig) this.f4907m.fromJson(xl60Var);
                    i = -16777217;
                    break;
                default:
                    continue;
            }
            i2 &= i;
        }
        xl60Var.mo51078f();
        if (i2 == -33554432) {
            return new Session(l, str3, str4, str5, str6, list, bool2.booleanValue(), bool3.booleanValue(), p301Var, str, num, bool11, str2, bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), sessionOrigin, sessionConfiguration, sessionDeviceInfo, bool7.booleanValue(), bool8.booleanValue(), sessionUserCapabilities, bool9.booleanValue(), bool10.booleanValue(), sessionConfig);
        }
        Constructor declaredConstructor = this.f4908n;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = f0b1.f64588c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = Session.class.getDeclaredConstructor(Long.class, String.class, String.class, String.class, String.class, List.class, cls3, cls3, p301.class, String.class, Integer.class, Boolean.class, String.class, cls3, cls3, cls3, SessionOrigin.class, SessionConfiguration.class, SessionDeviceInfo.class, cls3, cls3, SessionUserCapabilities.class, cls3, cls3, SessionConfig.class, cls, cls2);
            this.f4908n = declaredConstructor;
        }
        return (Session) declaredConstructor.newInstance(l, str3, str4, str5, str6, list, bool2, bool3, p301Var, str, num, bool11, str2, bool4, bool5, bool6, sessionOrigin, sessionConfiguration, sessionDeviceInfo, bool7, bool8, sessionUserCapabilities, bool9, bool10, sessionConfig, Integer.valueOf(i2), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Session session) {
        Session session2 = session;
        if (session2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("timestamp");
        this.f4896b.toJson(rm60Var, session2.timestamp);
        rm60Var.mo56894s("session_id");
        String str = session2.sessionId;
        hk60 hk60Var = this.f4897c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("join_session_token");
        hk60Var.toJson(rm60Var, session2.joinSessionToken);
        rm60Var.mo56894s("join_session_url");
        hk60Var.toJson(rm60Var, session2.joinSessionUrl);
        rm60Var.mo56894s("session_owner_id");
        hk60Var.toJson(rm60Var, session2.sessionOwnerId);
        rm60Var.mo56894s("session_members");
        this.f4898d.toJson(rm60Var, session2.sessionMembers);
        rm60Var.mo56894s("is_listening");
        boolean z = session2.isListening;
        hk60 hk60Var2 = this.f4899e;
        ydj.m93455n(z, hk60Var2, rm60Var, "is_controlling");
        ydj.m93455n(session2.isControlling, hk60Var2, rm60Var, "initialSessionType");
        this.f4900f.toJson(rm60Var, session2.initialSessionType);
        rm60Var.mo56894s("hostActiveDeviceId");
        hk60Var.toJson(rm60Var, session2.hostActiveDeviceId);
        rm60Var.mo56894s("maxMemberCount");
        this.f4901g.toJson(rm60Var, session2.maxMemberCount);
        rm60Var.mo56894s("is_session_owner");
        this.f4902h.toJson(rm60Var, session2.isSessionOwner);
        rm60Var.mo56894s("participantVolumeControl");
        hk60Var.toJson(rm60Var, session2.participantVolumeControlRaw);
        rm60Var.mo56894s("active");
        ydj.m93455n(session2.active, hk60Var2, rm60Var, "queue_only_mode");
        ydj.m93455n(session2.queueOnlyMode, hk60Var2, rm60Var, "wifi_broadcast");
        ydj.m93455n(session2.wifiBroadcast, hk60Var2, rm60Var, "origin");
        this.f4903i.toJson(rm60Var, session2.origin);
        rm60Var.mo56894s("configuration");
        this.f4904j.toJson(rm60Var, session2.configuration);
        rm60Var.mo56894s("host_device_info");
        this.f4905k.toJson(rm60Var, session2.hostDeviceInfo);
        rm60Var.mo56894s("quick_blend");
        ydj.m93455n(session2.mixedTastesEnabled, hk60Var2, rm60Var, "is_paused");
        ydj.m93455n(session2.isPaused, hk60Var2, rm60Var, "user_capabilities");
        this.f4906l.toJson(rm60Var, session2.userCapabilities);
        rm60Var.mo56894s("is_jam_paused");
        ydj.m93455n(session2.isJamPaused, hk60Var2, rm60Var, "is_jam_capped");
        ydj.m93455n(session2.isJamCapped, hk60Var2, rm60Var, "session_config");
        this.f4907m.toJson(rm60Var, session2.sessionConfig);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(29, "GeneratedJsonAdapter(Session)");
    }
}
