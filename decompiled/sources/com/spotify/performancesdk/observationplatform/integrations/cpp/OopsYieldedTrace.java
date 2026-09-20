package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedTrace;", "", "traceId", "Ljava/util/UUID;", "key", "", "yieldKey", "spans", "", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsSpan;", "attributes", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getTraceId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getYieldKey", "getSpans", "()Ljava/util/List;", "getAttributes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class OopsYieldedTrace {
    private final Map<String, String> attributes;
    private final String key;
    private final List<OopsSpan> spans;
    private final UUID traceId;
    private final String yieldKey;

    public OopsYieldedTrace(UUID uuid, String str, String str2, List<OopsSpan> list, Map<String, String> map) {
        this.traceId = uuid;
        this.key = str;
        this.yieldKey = str2;
        this.spans = list;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OopsYieldedTrace copy$default(OopsYieldedTrace oopsYieldedTrace, UUID uuid, String str, String str2, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = oopsYieldedTrace.traceId;
        }
        if ((i & 2) != 0) {
            str = oopsYieldedTrace.key;
        }
        if ((i & 4) != 0) {
            str2 = oopsYieldedTrace.yieldKey;
        }
        if ((i & 8) != 0) {
            list = oopsYieldedTrace.spans;
        }
        if ((i & 16) != 0) {
            map = oopsYieldedTrace.attributes;
        }
        Map map2 = map;
        String str3 = str2;
        return oopsYieldedTrace.copy(uuid, str, str3, list, map2);
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
    public final String getYieldKey() {
        return this.yieldKey;
    }

    public final List<OopsSpan> component4() {
        return this.spans;
    }

    public final Map<String, String> component5() {
        return this.attributes;
    }

    public final OopsYieldedTrace copy(UUID traceId, String key, String yieldKey, List<OopsSpan> spans, Map<String, String> attributes) {
        return new OopsYieldedTrace(traceId, key, yieldKey, spans, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OopsYieldedTrace)) {
            return false;
        }
        OopsYieldedTrace oopsYieldedTrace = (OopsYieldedTrace) other;
        return wj50.m88271j(this.traceId, oopsYieldedTrace.traceId) && wj50.m88271j(this.key, oopsYieldedTrace.key) && wj50.m88271j(this.yieldKey, oopsYieldedTrace.yieldKey) && wj50.m88271j(this.spans, oopsYieldedTrace.spans) && wj50.m88271j(this.attributes, oopsYieldedTrace.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final String getKey() {
        return this.key;
    }

    public final List<OopsSpan> getSpans() {
        return this.spans;
    }

    public final UUID getTraceId() {
        return this.traceId;
    }

    public final String getYieldKey() {
        return this.yieldKey;
    }

    public int hashCode() {
        return this.attributes.hashCode() + s571.m77244c(s571.m77243b(s571.m77243b(this.traceId.hashCode() * 31, 31, this.key), 31, this.yieldKey), 31, this.spans);
    }

    public String toString() {
        return super.toString();
    }
}
