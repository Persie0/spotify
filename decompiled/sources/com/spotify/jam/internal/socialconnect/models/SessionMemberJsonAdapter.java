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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionMemberJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/SessionMember;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SessionMemberJsonAdapter extends hk60<SessionMember> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4917a = xl60.C2578b.m91389a("joined_timestamp", "id", "username", "display_name", "image_url", "large_image_url", "listen_mode", "is_anonymous");

    /* JADX INFO: renamed from: b */
    public final hk60 f4918b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4919c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4920d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f4921e;

    public SessionMemberJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4918b = p0i0Var.m68706f(Long.class, gbuVar, "joinedTimestamp");
        this.f4919c = p0i0Var.m68706f(String.class, gbuVar, "id");
        this.f4920d = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "listenMode");
    }

    @Override // p204p.hk60
    public final SessionMember fromJson(xl60 xl60Var) throws NoSuchMethodException {
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        String str = null;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Long l = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = -1;
        String str5 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f4917a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    l = (Long) this.f4918b.fromJson(xl60Var);
                    i &= -2;
                    break;
                case 1:
                    str = (String) this.f4919c.fromJson(xl60Var);
                    i &= -3;
                    break;
                case 2:
                    str5 = (String) this.f4919c.fromJson(xl60Var);
                    i &= -5;
                    break;
                case 3:
                    str2 = (String) this.f4919c.fromJson(xl60Var);
                    i &= -9;
                    break;
                case 4:
                    str3 = (String) this.f4919c.fromJson(xl60Var);
                    i &= -17;
                    break;
                case 5:
                    str4 = (String) this.f4919c.fromJson(xl60Var);
                    i &= -33;
                    break;
                case 6:
                    bool2 = (Boolean) this.f4920d.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("listenMode", "listen_mode", xl60Var);
                    }
                    i &= -65;
                    break;
                    break;
                case 7:
                    bool3 = (Boolean) this.f4920d.fromJson(xl60Var);
                    if (bool3 == null) {
                        throw f0b1.m40470x("isAnonymous", "is_anonymous", xl60Var);
                    }
                    i &= -129;
                    break;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -256) {
            return new SessionMember(l, str, str5, str2, str3, str4, bool2.booleanValue(), bool3.booleanValue());
        }
        Constructor declaredConstructor = this.f4921e;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = f0b1.f64588c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = SessionMember.class.getDeclaredConstructor(Long.class, String.class, String.class, String.class, String.class, String.class, cls3, cls3, cls, cls2);
            this.f4921e = declaredConstructor;
        }
        return (SessionMember) declaredConstructor.newInstance(l, str, str5, str2, str3, str4, bool2, bool3, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, SessionMember sessionMember) {
        SessionMember sessionMember2 = sessionMember;
        if (sessionMember2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("joined_timestamp");
        this.f4918b.toJson(rm60Var, sessionMember2.joinedTimestamp);
        rm60Var.mo56894s("id");
        String str = sessionMember2.id;
        hk60 hk60Var = this.f4919c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("username");
        hk60Var.toJson(rm60Var, sessionMember2.username);
        rm60Var.mo56894s("display_name");
        hk60Var.toJson(rm60Var, sessionMember2.displayName);
        rm60Var.mo56894s("image_url");
        hk60Var.toJson(rm60Var, sessionMember2.imageUrl);
        rm60Var.mo56894s("large_image_url");
        hk60Var.toJson(rm60Var, sessionMember2.largeImageUrl);
        rm60Var.mo56894s("listen_mode");
        boolean z = sessionMember2.listenMode;
        hk60 hk60Var2 = this.f4920d;
        ydj.m93455n(z, hk60Var2, rm60Var, "is_anonymous");
        hk60Var2.toJson(rm60Var, Boolean.valueOf(sessionMember2.isAnonymous));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(35, "GeneratedJsonAdapter(SessionMember)");
    }
}
