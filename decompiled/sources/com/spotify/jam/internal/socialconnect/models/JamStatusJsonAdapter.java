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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/JamStatusJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/JamStatus;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class JamStatusJsonAdapter extends hk60<JamStatus> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4765a = xl60.C2578b.m91389a("device_broadcast_status", "session", "active_join_request", "request_queue");

    /* JADX INFO: renamed from: b */
    public final hk60 f4766b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4767c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4768d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4769e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor f4770f;

    public JamStatusJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4766b = p0i0Var.m68706f(DeviceBroadcastStatus.class, gbuVar, "deviceBroadcastStatus");
        this.f4767c = p0i0Var.m68706f(Session.class, gbuVar, "session");
        this.f4768d = p0i0Var.m68706f(ActiveJoinRequest.class, gbuVar, "activeJoinRequest");
        this.f4769e = p0i0Var.m68706f(RequestQueue.class, gbuVar, "requestQueue");
    }

    @Override // p204p.hk60
    public final JamStatus fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        DeviceBroadcastStatus deviceBroadcastStatus = null;
        Session session = null;
        ActiveJoinRequest activeJoinRequest = null;
        RequestQueue requestQueue = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4765a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                deviceBroadcastStatus = (DeviceBroadcastStatus) this.f4766b.fromJson(xl60Var);
                if (deviceBroadcastStatus == null) {
                    throw f0b1.m40470x("deviceBroadcastStatus", "device_broadcast_status", xl60Var);
                }
            } else if (iMo51071K == 1) {
                session = (Session) this.f4767c.fromJson(xl60Var);
                i &= -3;
            } else if (iMo51071K == 2) {
                activeJoinRequest = (ActiveJoinRequest) this.f4768d.fromJson(xl60Var);
                i &= -5;
            } else if (iMo51071K == 3) {
                requestQueue = (RequestQueue) this.f4769e.fromJson(xl60Var);
                i &= -9;
            }
        }
        xl60Var.mo51078f();
        if (i == -15) {
            if (deviceBroadcastStatus != null) {
                return new JamStatus(deviceBroadcastStatus, session, activeJoinRequest, requestQueue);
            }
            throw f0b1.m40461o("deviceBroadcastStatus", "device_broadcast_status", xl60Var);
        }
        Constructor declaredConstructor = this.f4770f;
        if (declaredConstructor == null) {
            declaredConstructor = JamStatus.class.getDeclaredConstructor(DeviceBroadcastStatus.class, Session.class, ActiveJoinRequest.class, RequestQueue.class, Integer.TYPE, f0b1.f64588c);
            this.f4770f = declaredConstructor;
        }
        if (deviceBroadcastStatus != null) {
            return (JamStatus) declaredConstructor.newInstance(deviceBroadcastStatus, session, activeJoinRequest, requestQueue, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("deviceBroadcastStatus", "device_broadcast_status", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, JamStatus jamStatus) {
        JamStatus jamStatus2 = jamStatus;
        if (jamStatus2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("device_broadcast_status");
        this.f4766b.toJson(rm60Var, jamStatus2.deviceBroadcastStatus);
        rm60Var.mo56894s("session");
        this.f4767c.toJson(rm60Var, jamStatus2.session);
        rm60Var.mo56894s("active_join_request");
        this.f4768d.toJson(rm60Var, jamStatus2.activeJoinRequest);
        rm60Var.mo56894s("request_queue");
        this.f4769e.toJson(rm60Var, jamStatus2.requestQueue);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(31, "GeneratedJsonAdapter(JamStatus)");
    }
}
