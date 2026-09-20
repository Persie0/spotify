package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import p204p.dq60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rHÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;", "", "traceId", "Ljava/util/UUID;", "key", "", "startTimestampNanos", "", "endTimestampNanos", "spans", "", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsSpan;", "attributes", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;JJLjava/util/List;Ljava/util/Map;)V", "getTraceId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getStartTimestampNanos", "()J", "getEndTimestampNanos", "getSpans", "()Ljava/util/List;", "getAttributes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class OopsEndedTrace {
    private final Map<String, String> attributes;
    private final long endTimestampNanos;
    private final String key;
    private final List<OopsSpan> spans;
    private final long startTimestampNanos;
    private final UUID traceId;

    public OopsEndedTrace(UUID uuid, String str, long j, long j2, List<OopsSpan> list, Map<String, String> map) {
        this.traceId = uuid;
        this.key = str;
        this.startTimestampNanos = j;
        this.endTimestampNanos = j2;
        this.spans = list;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OopsEndedTrace copy$default(OopsEndedTrace oopsEndedTrace, UUID uuid, String str, long j, long j2, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = oopsEndedTrace.traceId;
        }
        if ((i & 2) != 0) {
            str = oopsEndedTrace.key;
        }
        if ((i & 4) != 0) {
            j = oopsEndedTrace.startTimestampNanos;
        }
        if ((i & 8) != 0) {
            j2 = oopsEndedTrace.endTimestampNanos;
        }
        if ((i & 16) != 0) {
            list = oopsEndedTrace.spans;
        }
        if ((i & 32) != 0) {
            map = oopsEndedTrace.attributes;
        }
        long j3 = j2;
        long j4 = j;
        return oopsEndedTrace.copy(uuid, str, j4, j3, list, map);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTimestampNanos() {
        return this.endTimestampNanos;
    }

    public final List<OopsSpan> component5() {
        return this.spans;
    }

    public final Map<String, String> component6() {
        return this.attributes;
    }

    public final OopsEndedTrace copy(UUID traceId, String key, long startTimestampNanos, long endTimestampNanos, List<OopsSpan> spans, Map<String, String> attributes) {
        return new OopsEndedTrace(traceId, key, startTimestampNanos, endTimestampNanos, spans, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OopsEndedTrace)) {
            return false;
        }
        OopsEndedTrace oopsEndedTrace = (OopsEndedTrace) other;
        return wj50.m88271j(this.traceId, oopsEndedTrace.traceId) && wj50.m88271j(this.key, oopsEndedTrace.key) && this.startTimestampNanos == oopsEndedTrace.startTimestampNanos && this.endTimestampNanos == oopsEndedTrace.endTimestampNanos && wj50.m88271j(this.spans, oopsEndedTrace.spans) && wj50.m88271j(this.attributes, oopsEndedTrace.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final long getEndTimestampNanos() {
        return this.endTimestampNanos;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<OopsSpan> getSpans() {
        return this.spans;
    }

    public final long getStartTimestampNanos() {
        return this.startTimestampNanos;
    }

    public final UUID getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return this.attributes.hashCode() + s571.m77244c(dq60.m36605e(dq60.m36605e(s571.m77243b(this.traceId.hashCode() * 31, 31, this.key), this.startTimestampNanos, 31), this.endTimestampNanos, 31), 31, this.spans);
    }

    public String toString() {
        return super.toString();
    }
}
