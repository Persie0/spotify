package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedObservationView;", "", "viewId", "Ljava/util/UUID;", "key", "", "yieldKey", "attributes", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getViewId", "()Ljava/util/UUID;", "getKey", "()Ljava/lang/String;", "getYieldKey", "getAttributes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class OopsYieldedObservationView {
    private final Map<String, String> attributes;
    private final String key;
    private final UUID viewId;
    private final String yieldKey;

    public OopsYieldedObservationView(UUID uuid, String str, String str2, Map<String, String> map) {
        this.viewId = uuid;
        this.key = str;
        this.yieldKey = str2;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OopsYieldedObservationView copy$default(OopsYieldedObservationView oopsYieldedObservationView, UUID uuid, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = oopsYieldedObservationView.viewId;
        }
        if ((i & 2) != 0) {
            str = oopsYieldedObservationView.key;
        }
        if ((i & 4) != 0) {
            str2 = oopsYieldedObservationView.yieldKey;
        }
        if ((i & 8) != 0) {
            map = oopsYieldedObservationView.attributes;
        }
        return oopsYieldedObservationView.copy(uuid, str, str2, map);
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
    public final String getYieldKey() {
        return this.yieldKey;
    }

    public final Map<String, String> component4() {
        return this.attributes;
    }

    public final OopsYieldedObservationView copy(UUID viewId, String key, String yieldKey, Map<String, String> attributes) {
        return new OopsYieldedObservationView(viewId, key, yieldKey, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OopsYieldedObservationView)) {
            return false;
        }
        OopsYieldedObservationView oopsYieldedObservationView = (OopsYieldedObservationView) other;
        return wj50.m88271j(this.viewId, oopsYieldedObservationView.viewId) && wj50.m88271j(this.key, oopsYieldedObservationView.key) && wj50.m88271j(this.yieldKey, oopsYieldedObservationView.yieldKey) && wj50.m88271j(this.attributes, oopsYieldedObservationView.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final String getKey() {
        return this.key;
    }

    public final UUID getViewId() {
        return this.viewId;
    }

    public final String getYieldKey() {
        return this.yieldKey;
    }

    public int hashCode() {
        return this.attributes.hashCode() + s571.m77243b(s571.m77243b(this.viewId.hashCode() * 31, 31, this.key), 31, this.yieldKey);
    }

    public String toString() {
        return super.toString();
    }
}
