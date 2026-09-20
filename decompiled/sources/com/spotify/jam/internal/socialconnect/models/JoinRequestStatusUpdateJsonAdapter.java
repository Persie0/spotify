package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.s160;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/JoinRequestStatusUpdateJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/JoinRequestStatusUpdate;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class JoinRequestStatusUpdateJsonAdapter extends hk60<JoinRequestStatusUpdate> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4779a = xl60.C2578b.m91389a("request_status", "request_queue");

    /* JADX INFO: renamed from: b */
    public final hk60 f4780b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4781c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4782d;

    public JoinRequestStatusUpdateJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4780b = p0i0Var.m68706f(s160.class, gbuVar, "status");
        this.f4781c = p0i0Var.m68706f(RequestQueue.class, gbuVar, "requestQueue");
    }

    @Override // p204p.hk60
    public final JoinRequestStatusUpdate fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        s160 s160Var = null;
        RequestQueue requestQueue = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4779a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                s160Var = (s160) this.f4780b.fromJson(xl60Var);
                if (s160Var == null) {
                    throw f0b1.m40470x("status", "request_status", xl60Var);
                }
            } else if (iMo51071K == 1) {
                requestQueue = (RequestQueue) this.f4781c.fromJson(xl60Var);
                i = -3;
            }
        }
        xl60Var.mo51078f();
        if (i == -3) {
            if (s160Var != null) {
                return new JoinRequestStatusUpdate(s160Var, requestQueue);
            }
            throw f0b1.m40461o("status", "request_status", xl60Var);
        }
        Constructor declaredConstructor = this.f4782d;
        if (declaredConstructor == null) {
            declaredConstructor = JoinRequestStatusUpdate.class.getDeclaredConstructor(s160.class, RequestQueue.class, Integer.TYPE, f0b1.f64588c);
            this.f4782d = declaredConstructor;
        }
        if (s160Var != null) {
            return (JoinRequestStatusUpdate) declaredConstructor.newInstance(s160Var, requestQueue, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("status", "request_status", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, JoinRequestStatusUpdate joinRequestStatusUpdate) {
        JoinRequestStatusUpdate joinRequestStatusUpdate2 = joinRequestStatusUpdate;
        if (joinRequestStatusUpdate2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("request_status");
        this.f4780b.toJson(rm60Var, joinRequestStatusUpdate2.status);
        rm60Var.mo56894s("request_queue");
        this.f4781c.toJson(rm60Var, joinRequestStatusUpdate2.requestQueue);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(45, "GeneratedJsonAdapter(JoinRequestStatusUpdate)");
    }
}
