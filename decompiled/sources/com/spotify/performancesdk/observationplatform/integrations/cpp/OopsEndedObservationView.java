package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import p204p.dq60;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;", "", "viewId", "Ljava/util/UUID;", "key", "", "startTimestampNanos", "", "endTimestampNanos", "attributes", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;JJLjava/util/Map;)V", "getViewId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getStartTimestampNanos", "()J", "getEndTimestampNanos", "getAttributes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class OopsEndedObservationView {
    private final Map<String, String> attributes;
    private final long endTimestampNanos;
    private final String key;
    private final long startTimestampNanos;
    private final UUID viewId;

    public OopsEndedObservationView(UUID uuid, String str, long j, long j2, Map<String, String> map) {
        this.viewId = uuid;
        this.key = str;
        this.startTimestampNanos = j;
        this.endTimestampNanos = j2;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OopsEndedObservationView copy$default(OopsEndedObservationView oopsEndedObservationView, UUID uuid, String str, long j, long j2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = oopsEndedObservationView.viewId;
        }
        if ((i & 2) != 0) {
            str = oopsEndedObservationView.key;
        }
        if ((i & 4) != 0) {
            j = oopsEndedObservationView.startTimestampNanos;
        }
        if ((i & 8) != 0) {
            j2 = oopsEndedObservationView.endTimestampNanos;
        }
        if ((i & 16) != 0) {
            map = oopsEndedObservationView.attributes;
        }
        Map map2 = map;
        long j3 = j2;
        return oopsEndedObservationView.copy(uuid, str, j, j3, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getViewId() {
        return this.viewId;
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

    public final Map<String, String> component5() {
        return this.attributes;
    }

    public final OopsEndedObservationView copy(UUID viewId, String key, long startTimestampNanos, long endTimestampNanos, Map<String, String> attributes) {
        return new OopsEndedObservationView(viewId, key, startTimestampNanos, endTimestampNanos, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OopsEndedObservationView)) {
            return false;
        }
        OopsEndedObservationView oopsEndedObservationView = (OopsEndedObservationView) other;
        return wj50.m88271j(this.viewId, oopsEndedObservationView.viewId) && wj50.m88271j(this.key, oopsEndedObservationView.key) && this.startTimestampNanos == oopsEndedObservationView.startTimestampNanos && this.endTimestampNanos == oopsEndedObservationView.endTimestampNanos && wj50.m88271j(this.attributes, oopsEndedObservationView.attributes);
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

    public final long getStartTimestampNanos() {
        return this.startTimestampNanos;
    }

    public final UUID getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        return this.attributes.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(this.viewId.hashCode() * 31, 31, this.key), this.startTimestampNanos, 31), this.endTimestampNanos, 31);
    }

    public String toString() {
        return super.toString();
    }
}
