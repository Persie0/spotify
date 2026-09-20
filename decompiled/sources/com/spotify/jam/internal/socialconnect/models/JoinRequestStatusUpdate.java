package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.s160;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/JoinRequestStatusUpdate;", "", "Lp/s160;", "status", "Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;", "requestQueue", "<init>", "(Lp/s160;Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;)V", "copy", "(Lp/s160;Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;)Lcom/spotify/jam/internal/socialconnect/models/JoinRequestStatusUpdate;", "a", "Lp/s160;", "getStatus", "()Lp/s160;", "getStatus$annotations", "()V", "b", "Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;", "getRequestQueue", "()Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;", "getRequestQueue$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class JoinRequestStatusUpdate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final s160 status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final RequestQueue requestQueue;

    public JoinRequestStatusUpdate(@gk60(name = "request_status") s160 s160Var, @gk60(name = "request_queue") RequestQueue requestQueue) {
        this.status = s160Var;
        this.requestQueue = requestQueue;
    }

    @gk60(name = "request_queue")
    public static /* synthetic */ void getRequestQueue$annotations() {
    }

    @gk60(name = "request_status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    public final JoinRequestStatusUpdate copy(@gk60(name = "request_status") s160 status, @gk60(name = "request_queue") RequestQueue requestQueue) {
        return new JoinRequestStatusUpdate(status, requestQueue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinRequestStatusUpdate)) {
            return false;
        }
        JoinRequestStatusUpdate joinRequestStatusUpdate = (JoinRequestStatusUpdate) obj;
        return this.status == joinRequestStatusUpdate.status && wj50.m88271j(this.requestQueue, joinRequestStatusUpdate.requestQueue);
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        RequestQueue requestQueue = this.requestQueue;
        return iHashCode + (requestQueue == null ? 0 : requestQueue.hashCode());
    }

    public /* synthetic */ JoinRequestStatusUpdate(s160 s160Var, RequestQueue requestQueue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(s160Var, (i & 2) != 0 ? null : requestQueue);
    }
}
