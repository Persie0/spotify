package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.UUID;
import kotlin.Metadata;
import p204p.dq60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsSpan;", "", "spanId", "Ljava/util/UUID;", "key", "", "startTimestampNanos", "", "endTimestampNanos", "<init>", "(Ljava/util/UUID;Ljava/lang/String;JJ)V", "getSpanId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getStartTimestampNanos", "()J", "getEndTimestampNanos", "durationNanos", "getDurationNanos", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class OopsSpan {
    private final long endTimestampNanos;
    private final String key;
    private final UUID spanId;
    private final long startTimestampNanos;

    public OopsSpan(UUID uuid, String str, long j, long j2) {
        this.spanId = uuid;
        this.key = str;
        this.startTimestampNanos = j;
        this.endTimestampNanos = j2;
    }

    public static /* synthetic */ OopsSpan copy$default(OopsSpan oopsSpan, UUID uuid, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = oopsSpan.spanId;
        }
        if ((i & 2) != 0) {
            str = oopsSpan.key;
        }
        if ((i & 4) != 0) {
            j = oopsSpan.startTimestampNanos;
        }
        if ((i & 8) != 0) {
            j2 = oopsSpan.endTimestampNanos;
        }
        long j3 = j2;
        return oopsSpan.copy(uuid, str, j, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getSpanId() {
        return this.spanId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTimestampNanos() {
        return this.startTimestampNanos;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTimestampNanos() {
        return this.endTimestampNanos;
    }

    public final OopsSpan copy(UUID spanId, String key, long startTimestampNanos, long endTimestampNanos) {
        return new OopsSpan(spanId, key, startTimestampNanos, endTimestampNanos);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OopsSpan)) {
            return false;
        }
        OopsSpan oopsSpan = (OopsSpan) other;
        return wj50.m88271j(this.spanId, oopsSpan.spanId) && wj50.m88271j(this.key, oopsSpan.key) && this.startTimestampNanos == oopsSpan.startTimestampNanos && this.endTimestampNanos == oopsSpan.endTimestampNanos;
    }

    public final long getDurationNanos() {
        return this.endTimestampNanos - this.startTimestampNanos;
    }

    public final long getEndTimestampNanos() {
        return this.endTimestampNanos;
    }

    public final String getKey() {
        return this.key;
    }

    public final UUID getSpanId() {
        return this.spanId;
    }

    public final long getStartTimestampNanos() {
        return this.startTimestampNanos;
    }

    public int hashCode() {
        return Long.hashCode(this.endTimestampNanos) + dq60.m36605e(s571.m77243b(this.spanId.hashCode() * 31, 31, this.key), this.startTimestampNanos, 31);
    }

    public String toString() {
        return super.toString();
    }
}
