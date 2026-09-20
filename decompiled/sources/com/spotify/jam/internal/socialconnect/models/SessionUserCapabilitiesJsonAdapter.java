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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilitiesJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SessionUserCapabilitiesJsonAdapter extends hk60<SessionUserCapabilities> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4938a = xl60.C2578b.m91389a("invite", "remove_participants", "manage_participant_settings", "ask_to_upgrade");

    /* JADX INFO: renamed from: b */
    public final hk60 f4939b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f4940c;

    public SessionUserCapabilitiesJsonAdapter(p0i0 p0i0Var) {
        this.f4939b = p0i0Var.m68706f(Boolean.TYPE, gbu.f78413a, "invite");
    }

    @Override // p204p.hk60
    public final SessionUserCapabilities fromJson(xl60 xl60Var) throws NoSuchMethodException {
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4938a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                bool2 = (Boolean) this.f4939b.fromJson(xl60Var);
                if (bool2 == null) {
                    throw f0b1.m40470x("invite", "invite", xl60Var);
                }
                i &= -2;
            } else if (iMo51071K == 1) {
                bool3 = (Boolean) this.f4939b.fromJson(xl60Var);
                if (bool3 == null) {
                    throw f0b1.m40470x("removeParticipants", "remove_participants", xl60Var);
                }
                i &= -3;
            } else if (iMo51071K == 2) {
                bool4 = (Boolean) this.f4939b.fromJson(xl60Var);
                if (bool4 == null) {
                    throw f0b1.m40470x("manageParticipantSettings", "manage_participant_settings", xl60Var);
                }
                i &= -5;
            } else if (iMo51071K == 3) {
                bool5 = (Boolean) this.f4939b.fromJson(xl60Var);
                if (bool5 == null) {
                    throw f0b1.m40470x("askToUpgrade", "ask_to_upgrade", xl60Var);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        xl60Var.mo51078f();
        if (i == -16) {
            return new SessionUserCapabilities(bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
        }
        Constructor declaredConstructor = this.f4940c;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = f0b1.f64588c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = SessionUserCapabilities.class.getDeclaredConstructor(cls3, cls3, cls3, cls3, cls, cls2);
            this.f4940c = declaredConstructor;
        }
        return (SessionUserCapabilities) declaredConstructor.newInstance(bool2, bool3, bool4, bool5, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, SessionUserCapabilities sessionUserCapabilities) {
        SessionUserCapabilities sessionUserCapabilities2 = sessionUserCapabilities;
        if (sessionUserCapabilities2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("invite");
        boolean z = sessionUserCapabilities2.invite;
        hk60 hk60Var = this.f4939b;
        ydj.m93455n(z, hk60Var, rm60Var, "remove_participants");
        ydj.m93455n(sessionUserCapabilities2.removeParticipants, hk60Var, rm60Var, "manage_participant_settings");
        ydj.m93455n(sessionUserCapabilities2.manageParticipantSettings, hk60Var, rm60Var, "ask_to_upgrade");
        hk60Var.toJson(rm60Var, Boolean.valueOf(sessionUserCapabilities2.askToUpgrade));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(45, "GeneratedJsonAdapter(SessionUserCapabilities)");
    }
}
