package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH&¢\u0006\u0004\b\u0016\u0010\rJ\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010,J)\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J)\u00103\u001a\u0004\u0018\u0001022\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00104J'\u0010:\u001a\u0004\u0018\u0001092\f\u00107\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00108\u001a\u00020-H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b<\u0010=ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006>À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsBridgeDelegate;", "", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "trace", "Lp/w2a1;", "traceDidStart", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;", "traceDidStop", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;)V", "Ljava/util/UUID;", "traceId", "traceDidCancel", "(Ljava/util/UUID;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "scenario", "scenarioDidStart", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;", "scenarioDidStop", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;)V", "scenarioViewId", "scenarioDidCancel", "", "yieldKey", "claimYieldedScenario", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "claimYieldedTrace", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedTrace;", "yieldedTrace", "traceDidYield", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedTrace;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedObservationView;", "yieldedScenario", "scenarioDidYield", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedObservationView;)V", "key", "unit", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "createCounter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "createGauge", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "", "pollPtr", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "createObservableGauge", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "createObservableCounter", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppMetricDefinition;", "metrics", "callbackPtr", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "registerBatchMetrics", "(Ljava/util/List;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "unregisterObservableMetric", "(Ljava/lang/String;)V", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface OopsBridgeDelegate {
    default OopsStartedObservationView claimYieldedScenario(String yieldKey) {
        return null;
    }

    default OopsStartedTrace claimYieldedTrace(String yieldKey) {
        return null;
    }

    default OopsCppCounter createCounter(String key, String unit) {
        return null;
    }

    default OopsCppGauge createGauge(String key, String unit) {
        return null;
    }

    default OopsCppObservableCounter createObservableCounter(String key, String unit, long pollPtr) {
        return null;
    }

    default OopsCppObservableGauge createObservableGauge(String key, String unit, long pollPtr) {
        return null;
    }

    default OopsCppBatchObservableInstrument registerBatchMetrics(List<OopsCppMetricDefinition> metrics, long callbackPtr) {
        return null;
    }

    void scenarioDidCancel(UUID scenarioViewId);

    void scenarioDidStart(OopsStartedObservationView scenario);

    void scenarioDidStop(OopsEndedObservationView scenario);

    default void scenarioDidYield(OopsYieldedObservationView yieldedScenario) {
    }

    void traceDidCancel(UUID traceId);

    void traceDidStart(OopsStartedTrace trace);

    void traceDidStop(OopsEndedTrace trace);

    default void traceDidYield(OopsYieldedTrace yieldedTrace) {
    }

    default void unregisterObservableMetric(String key) {
    }
}
