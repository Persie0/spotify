package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.ok60;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b \u0010!¨\u0006#"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/JamStatus;", "", "Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;", "deviceBroadcastStatus", "Lcom/spotify/jam/internal/socialconnect/models/Session;", "session", "Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "activeJoinRequest", "Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;", "requestQueue", "<init>", "(Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;Lcom/spotify/jam/internal/socialconnect/models/Session;Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;)V", "copy", "(Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;Lcom/spotify/jam/internal/socialconnect/models/Session;Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;)Lcom/spotify/jam/internal/socialconnect/models/JamStatus;", "a", "Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;", "getDeviceBroadcastStatus", "()Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;", "getDeviceBroadcastStatus$annotations", "()V", "b", "Lcom/spotify/jam/internal/socialconnect/models/Session;", "getSession", "()Lcom/spotify/jam/internal/socialconnect/models/Session;", "getSession$annotations", "c", "Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "getActiveJoinRequest", "()Lcom/spotify/jam/internal/socialconnect/models/ActiveJoinRequest;", "getActiveJoinRequest$annotations", "d", "Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;", "getRequestQueue", "()Lcom/spotify/jam/internal/socialconnect/models/RequestQueue;", "getRequestQueue$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class JamStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final DeviceBroadcastStatus deviceBroadcastStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Session session;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final ActiveJoinRequest activeJoinRequest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final RequestQueue requestQueue;

    public JamStatus(@gk60(name = "device_broadcast_status") DeviceBroadcastStatus deviceBroadcastStatus, @gk60(name = "session") Session session, @gk60(name = "active_join_request") ActiveJoinRequest activeJoinRequest, @gk60(name = "request_queue") RequestQueue requestQueue) {
        this.deviceBroadcastStatus = deviceBroadcastStatus;
        this.session = session;
        this.activeJoinRequest = activeJoinRequest;
        this.requestQueue = requestQueue;
    }

    @gk60(name = "active_join_request")
    public static /* synthetic */ void getActiveJoinRequest$annotations() {
    }

    @gk60(name = "device_broadcast_status")
    public static /* synthetic */ void getDeviceBroadcastStatus$annotations() {
    }

    @gk60(name = "request_queue")
    public static /* synthetic */ void getRequestQueue$annotations() {
    }

    @gk60(name = "session")
    public static /* synthetic */ void getSession$annotations() {
    }

    public final JamStatus copy(@gk60(name = "device_broadcast_status") DeviceBroadcastStatus deviceBroadcastStatus, @gk60(name = "session") Session session, @gk60(name = "active_join_request") ActiveJoinRequest activeJoinRequest, @gk60(name = "request_queue") RequestQueue requestQueue) {
        return new JamStatus(deviceBroadcastStatus, session, activeJoinRequest, requestQueue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JamStatus)) {
            return false;
        }
        JamStatus jamStatus = (JamStatus) obj;
        return wj50.m88271j(this.deviceBroadcastStatus, jamStatus.deviceBroadcastStatus) && wj50.m88271j(this.session, jamStatus.session) && wj50.m88271j(this.activeJoinRequest, jamStatus.activeJoinRequest) && wj50.m88271j(this.requestQueue, jamStatus.requestQueue);
    }

    public final int hashCode() {
        int iHashCode = this.deviceBroadcastStatus.hashCode() * 31;
        Session session = this.session;
        int iHashCode2 = (iHashCode + (session == null ? 0 : session.hashCode())) * 31;
        ActiveJoinRequest activeJoinRequest = this.activeJoinRequest;
        int iHashCode3 = (iHashCode2 + (activeJoinRequest == null ? 0 : activeJoinRequest.hashCode())) * 31;
        RequestQueue requestQueue = this.requestQueue;
        return iHashCode3 + (requestQueue != null ? requestQueue.hashCode() : 0);
    }

    public /* synthetic */ JamStatus(DeviceBroadcastStatus deviceBroadcastStatus, Session session, ActiveJoinRequest activeJoinRequest, RequestQueue requestQueue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceBroadcastStatus, (i & 2) != 0 ? null : session, (i & 4) != 0 ? null : activeJoinRequest, (i & 8) != 0 ? null : requestQueue);
    }
}
