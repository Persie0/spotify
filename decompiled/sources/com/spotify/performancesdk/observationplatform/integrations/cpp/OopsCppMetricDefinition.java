package com.spotify.performancesdk.observationplatform.integrations.cpp;

import kotlin.Metadata;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppMetricDefinition;", "", "key", "", "instrument", "unit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getInstrument", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class OopsCppMetricDefinition {
    private final String instrument;
    private final String key;
    private final String unit;

    public OopsCppMetricDefinition(String str, String str2, String str3) {
        this.key = str;
        this.instrument = str2;
        this.unit = str3;
    }

    public static /* synthetic */ OopsCppMetricDefinition copy$default(OopsCppMetricDefinition oopsCppMetricDefinition, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oopsCppMetricDefinition.key;
        }
        if ((i & 2) != 0) {
            str2 = oopsCppMetricDefinition.instrument;
        }
        if ((i & 4) != 0) {
            str3 = oopsCppMetricDefinition.unit;
        }
        return oopsCppMetricDefinition.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public final OopsCppMetricDefinition copy(String key, String instrument, String unit) {
        return new OopsCppMetricDefinition(key, instrument, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OopsCppMetricDefinition)) {
            return false;
        }
        OopsCppMetricDefinition oopsCppMetricDefinition = (OopsCppMetricDefinition) other;
        return wj50.m88271j(this.key, oopsCppMetricDefinition.key) && wj50.m88271j(this.instrument, oopsCppMetricDefinition.instrument) && wj50.m88271j(this.unit, oopsCppMetricDefinition.unit);
    }

    public final String getInstrument() {
        return this.instrument;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return this.unit.hashCode() + s571.m77243b(this.key.hashCode() * 31, 31, this.instrument);
    }

    public String toString() {
        return super.toString();
    }
}
