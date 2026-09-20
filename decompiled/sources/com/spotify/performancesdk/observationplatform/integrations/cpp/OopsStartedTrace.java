package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.UUID;
import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "", "traceId", "Ljava/util/UUID;", "key", "", "startTimestampNanos", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;J)V", "getTraceId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getStartTimestampNanos", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class OopsStartedTrace {
    private final String key;
    private final long startTimestampNanos;
    private final UUID traceId;

    public OopsStartedTrace(UUID uuid, String str, long j) {
        this.traceId = uuid;
        this.key = str;
        this.startTimestampNanos = j;
    }

    public static /* synthetic */ OopsStartedTrace copy$default(OopsStartedTrace oopsStartedTrace, UUID uuid, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = oopsStartedTrace.traceId;
        }
        if ((i & 2) != 0) {
            str = oopsStartedTrace.key;
        }
        if ((i & 4) != 0) {
            j = oopsStartedTrace.startTimestampNanos;
        }
        return oopsStartedTrace.copy(uuid, str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getTraceId() {
        return this.traceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTimestampNanos() {
        return this.startTimestampNanos;
    }

    public final OopsStartedTrace copy(UUID traceId, String key, long startTimestampNanos) {
        return new OopsStartedTrace(traceId, key, startTimestampNanos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OopsStartedTrace)) {
            return false;
        }
        OopsStartedTrace oopsStartedTrace = (OopsStartedTrace) other;
        return wj50.m88271j(this.traceId, oopsStartedTrace.traceId) && wj50.m88271j(this.key, oopsStartedTrace.key) && this.startTimestampNanos == oopsStartedTrace.startTimestampNanos;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getStartTimestampNanos() {
        return this.startTimestampNanos;
    }

    public final UUID getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return Long.hashCode(this.startTimestampNanos) + s571.m77243b(this.traceId.hashCode() * 31, 31, this.key);
    }

    public String toString() {
        return super.toString();
    }
}
