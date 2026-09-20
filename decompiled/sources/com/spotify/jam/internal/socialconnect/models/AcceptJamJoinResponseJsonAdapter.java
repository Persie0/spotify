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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/AcceptJamJoinResponseJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/AcceptJamJoinResponse;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AcceptJamJoinResponseJsonAdapter extends hk60<AcceptJamJoinResponse> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4667a = xl60.C2578b.m91389a("request_queue", "join_attempt_id");

    /* JADX INFO: renamed from: b */
    public final hk60 f4668b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4669c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4670d;

    public AcceptJamJoinResponseJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4668b = p0i0Var.m68706f(RequestQueue.class, gbuVar, "requestQueue");
        this.f4669c = p0i0Var.m68706f(String.class, gbuVar, "joinAttemptId");
    }

    @Override // p204p.hk60
    public final AcceptJamJoinResponse fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        RequestQueue requestQueue = null;
        String str = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4667a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                requestQueue = (RequestQueue) this.f4668b.fromJson(xl60Var);
                i &= -2;
            } else if (iMo51071K == 1) {
                str = (String) this.f4669c.fromJson(xl60Var);
                i &= -3;
            }
        }
        xl60Var.mo51078f();
        if (i == -4) {
            return new AcceptJamJoinResponse(requestQueue, str);
        }
        Constructor declaredConstructor = this.f4670d;
        if (declaredConstructor == null) {
            declaredConstructor = AcceptJamJoinResponse.class.getDeclaredConstructor(RequestQueue.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4670d = declaredConstructor;
        }
        return (AcceptJamJoinResponse) declaredConstructor.newInstance(requestQueue, str, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AcceptJamJoinResponse acceptJamJoinResponse) {
        AcceptJamJoinResponse acceptJamJoinResponse2 = acceptJamJoinResponse;
        if (acceptJamJoinResponse2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("request_queue");
        this.f4668b.toJson(rm60Var, acceptJamJoinResponse2.requestQueue);
        rm60Var.mo56894s("join_attempt_id");
        this.f4669c.toJson(rm60Var, acceptJamJoinResponse2.joinAttemptId);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(43, "GeneratedJsonAdapter(AcceptJamJoinResponse)");
    }
}
