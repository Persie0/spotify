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
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/RequestQueueJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RequestQueueJsonAdapter extends hk60<RequestQueue> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4824a = xl60.C2578b.m91389a("pending_requests");

    /* JADX INFO: renamed from: b */
    public final hk60 f4825b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f4826c;

    public RequestQueueJsonAdapter(p0i0 p0i0Var) {
        this.f4825b = p0i0Var.m68706f(mp91.m62457j(List.class, PendingJoinRequest.class), gbu.f78413a, "requests");
    }

    @Override // p204p.hk60
    public final RequestQueue fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        List list = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4824a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                list = (List) this.f4825b.fromJson(xl60Var);
                i = -2;
            }
        }
        xl60Var.mo51078f();
        if (i == -2) {
            return new RequestQueue(list);
        }
        Constructor declaredConstructor = this.f4826c;
        if (declaredConstructor == null) {
            declaredConstructor = RequestQueue.class.getDeclaredConstructor(List.class, Integer.TYPE, f0b1.f64588c);
            this.f4826c = declaredConstructor;
        }
        return (RequestQueue) declaredConstructor.newInstance(list, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, RequestQueue requestQueue) {
        RequestQueue requestQueue2 = requestQueue;
        if (requestQueue2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("pending_requests");
        this.f4825b.toJson(rm60Var, requestQueue2.requests);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(RequestQueue)");
    }
}
