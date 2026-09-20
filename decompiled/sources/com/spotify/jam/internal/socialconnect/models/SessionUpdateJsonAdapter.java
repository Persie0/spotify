package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.w301;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionUpdateJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/SessionUpdate;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SessionUpdateJsonAdapter extends hk60<SessionUpdate> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4929a = xl60.C2578b.m91389a("session", "reason", "update_session_members");

    /* JADX INFO: renamed from: b */
    public final hk60 f4930b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4931c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4932d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f4933e;

    public SessionUpdateJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4930b = p0i0Var.m68706f(Session.class, gbuVar, "session");
        this.f4931c = p0i0Var.m68706f(w301.class, gbuVar, "reason");
        this.f4932d = p0i0Var.m68706f(mp91.m62457j(List.class, SessionMember.class), gbuVar, "updateSessionMembers");
    }

    @Override // p204p.hk60
    public final SessionUpdate fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        Session session = null;
        w301 w301Var = null;
        List list = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4929a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                session = (Session) this.f4930b.fromJson(xl60Var);
                i &= -2;
            } else if (iMo51071K == 1) {
                w301Var = (w301) this.f4931c.fromJson(xl60Var);
                i &= -3;
            } else if (iMo51071K == 2) {
                list = (List) this.f4932d.fromJson(xl60Var);
                i &= -5;
            }
        }
        xl60Var.mo51078f();
        if (i == -8) {
            return new SessionUpdate(session, w301Var, list);
        }
        Constructor declaredConstructor = this.f4933e;
        if (declaredConstructor == null) {
            declaredConstructor = SessionUpdate.class.getDeclaredConstructor(Session.class, w301.class, List.class, Integer.TYPE, f0b1.f64588c);
            this.f4933e = declaredConstructor;
        }
        return (SessionUpdate) declaredConstructor.newInstance(session, w301Var, list, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, SessionUpdate sessionUpdate) {
        SessionUpdate sessionUpdate2 = sessionUpdate;
        if (sessionUpdate2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("session");
        this.f4930b.toJson(rm60Var, sessionUpdate2.session);
        rm60Var.mo56894s("reason");
        this.f4931c.toJson(rm60Var, sessionUpdate2.reason);
        rm60Var.mo56894s("update_session_members");
        this.f4932d.toJson(rm60Var, sessionUpdate2.updateSessionMembers);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(35, "GeneratedJsonAdapter(SessionUpdate)");
    }
}
