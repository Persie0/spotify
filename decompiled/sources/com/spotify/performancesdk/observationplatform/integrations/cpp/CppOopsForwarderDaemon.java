package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import p204p.hgm;
import p204p.i6f;
import p204p.jwk;
import p204p.pa81;
import p204p.qw00;
import p204p.tnk0;
import p204p.udy0;
import p204p.unk0;
import p204p.v49;
import p204p.zbf0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J!\u00101\u001a\u0004\u0018\u0001002\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020 H\u0016¢\u0006\u0004\b1\u00102J!\u00104\u001a\u0004\u0018\u0001032\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020 H\u0016¢\u0006\u0004\b4\u00105J)\u00109\u001a\u0004\u0018\u0001082\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J)\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b<\u0010=J'\u0010B\u001a\u0004\u0018\u00010A2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00052\u0006\u0010@\u001a\u000206H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\n2\u0006\u0010.\u001a\u00020 H\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010\u0004R\"\u0010H\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u0010PR \u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020T0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020V0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010S¨\u0006X"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/CppOopsForwarderDaemon;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsBridgeDelegate;", "Lp/hgm;", "<init>", "()V", "", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsSpan;", "spans", "Lp/pa81;", "trace", "Lp/w2a1;", "applySpans", "(Ljava/util/List;Lp/pa81;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "traceDidStart", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;)V", "Ljava/util/UUID;", "traceId", "traceDidCancel", "(Ljava/util/UUID;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;", "traceDidStop", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "scenario", "scenarioDidStart", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;", "scenarioDidStop", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;)V", "scenarioViewId", "scenarioDidCancel", "", "yieldKey", "claimYieldedScenario", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "claimYieldedTrace", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedTrace;", "yieldedTrace", "traceDidYield", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedTrace;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedObservationView;", "yieldedScenario", "scenarioDidYield", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedObservationView;)V", "key", "unit", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "createCounter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "createGauge", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "", "pollPtr", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "createObservableGauge", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "createObservableCounter", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppMetricDefinition;", "metrics", "callbackPtr", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "registerBatchMetrics", "(Ljava/util/List;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "unregisterObservableMetric", "(Ljava/lang/String;)V", "shutdown", "Lp/unk0;", "observationPlatform", "Lp/unk0;", "getObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder", "()Lp/unk0;", "setObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder", "(Lp/unk0;)V", "", "metricsEnabled", "Z", "Ljava/util/concurrent/ConcurrentHashMap;", "ongoingTraces", "Ljava/util/concurrent/ConcurrentHashMap;", "Lp/udy0;", "ongoingScenarios", "", "observableHandles", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CppOopsForwarderDaemon implements OopsBridgeDelegate, hgm {
    private final ConcurrentHashMap<String, Object> observableHandles;
    private final ConcurrentHashMap<UUID, udy0> ongoingScenarios;
    private unk0 observationPlatform = tnk0.f221995a;
    private final boolean metricsEnabled = BuildConfig.INTERNAL;
    private final ConcurrentHashMap<UUID, pa81> ongoingTraces = new ConcurrentHashMap<>();

    public CppOopsForwarderDaemon() {
        OopsBridge.INSTANCE.setDelegate(this);
        this.ongoingScenarios = new ConcurrentHashMap<>();
        this.observableHandles = new ConcurrentHashMap<>();
    }

    private final void applySpans(List<OopsSpan> spans, pa81 trace) {
        for (OopsSpan oopsSpan : spans) {
            long j = 1000;
            trace.mo51104e(oopsSpan.getStartTimestampNanos() / j, oopsSpan.getKey(), oopsSpan.getEndTimestampNanos() / j);
        }
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsStartedObservationView claimYieldedScenario(String yieldKey) {
        udy0 udy0VarMo75868i = this.observationPlatform.mo75868i(yieldKey);
        if (udy0VarMo75868i == null) {
            return null;
        }
        this.ongoingScenarios.put(udy0VarMo75868i.getId(), udy0VarMo75868i);
        return new OopsStartedObservationView(udy0VarMo75868i.getId(), udy0VarMo75868i.getKey(), udy0VarMo75868i.mo33386b() * ((long) 1000));
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsStartedTrace claimYieldedTrace(String yieldKey) {
        pa81 pa81VarMo75872n = this.observationPlatform.mo75872n(yieldKey);
        if (pa81VarMo75872n == null) {
            return null;
        }
        this.ongoingTraces.put(pa81VarMo75872n.getId(), pa81VarMo75872n);
        return new OopsStartedTrace(pa81VarMo75872n.getId(), pa81VarMo75872n.getKey(), pa81VarMo75872n.mo51101b() * ((long) 1000));
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppCounter createCounter(String key, String unit) {
        if (!this.metricsEnabled) {
            return null;
        }
        final jwk jwkVarMo75865f = this.observationPlatform.mo75865f(key, CppOopsForwarderDaemonKt.parseUnit(unit));
        return new OopsCppCounter() { // from class: com.spotify.performancesdk.observationplatform.integrations.cpp.CppOopsForwarderDaemon.createCounter.1
            @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppCounter
            public void increment(double delta) {
                jwkVarMo75865f.increment(delta);
            }
        };
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppGauge createGauge(String key, String unit) {
        if (!this.metricsEnabled) {
            return null;
        }
        final qw00 qw00VarMo75874q = this.observationPlatform.mo75874q(key, CppOopsForwarderDaemonKt.parseUnit(unit));
        return new OopsCppGauge() { // from class: com.spotify.performancesdk.observationplatform.integrations.cpp.CppOopsForwarderDaemon.createGauge.1
            @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppGauge
            public void record(double value) {
                qw00VarMo75874q.record(value);
            }
        };
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppObservableCounter createObservableCounter(String key, String unit, long pollPtr) {
        if (!this.metricsEnabled) {
            return null;
        }
        this.observableHandles.put(key, this.observationPlatform.mo75864e(key, CppOopsForwarderDaemonKt.parseUnit(unit), new CppOopsForwarderDaemon$createObservableCounter$handle$1(pollPtr)));
        return new OopsCppObservableCounter() { // from class: com.spotify.performancesdk.observationplatform.integrations.cpp.CppOopsForwarderDaemon.createObservableCounter.1
        };
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppObservableGauge createObservableGauge(String key, String unit, long pollPtr) {
        if (!this.metricsEnabled) {
            return null;
        }
        this.observableHandles.put(key, this.observationPlatform.mo75864e(key, CppOopsForwarderDaemonKt.parseUnit(unit), new CppOopsForwarderDaemon$createObservableGauge$handle$1(pollPtr)));
        return new OopsCppObservableGauge() { // from class: com.spotify.performancesdk.observationplatform.integrations.cpp.CppOopsForwarderDaemon.createObservableGauge.1
        };
    }

    /* JADX INFO: renamed from: getObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder, reason: from getter */
    public final unk0 getObservationPlatform() {
        return this.observationPlatform;
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppBatchObservableInstrument registerBatchMetrics(List<OopsCppMetricDefinition> metrics, long callbackPtr) {
        if (!this.metricsEnabled) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i6f.m49804T(metrics, 10));
        for (OopsCppMetricDefinition oopsCppMetricDefinition : metrics) {
            arrayList.add(new zbf0(oopsCppMetricDefinition.getKey(), CppOopsForwarderDaemonKt.parseInstrument(oopsCppMetricDefinition.getInstrument()), CppOopsForwarderDaemonKt.parseUnit(oopsCppMetricDefinition.getUnit())));
        }
        final v49 v49VarMo75870k = this.observationPlatform.mo75870k(arrayList, new CppOopsForwarderDaemon$registerBatchMetrics$handle$1(callbackPtr));
        return new OopsCppBatchObservableInstrument() { // from class: com.spotify.performancesdk.observationplatform.integrations.cpp.CppOopsForwarderDaemon.registerBatchMetrics.1
            @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppBatchObservableInstrument
            public void unregister() {
                v49VarMo75870k.unregister();
            }
        };
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidCancel(UUID scenarioViewId) {
        scenarioViewId.toString();
        udy0 udy0VarRemove = this.ongoingScenarios.remove(scenarioViewId);
        if (udy0VarRemove == null) {
            return;
        }
        udy0VarRemove.cancel();
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidStart(OopsStartedObservationView scenario) {
        scenario.getKey();
        udy0 udy0VarMo75866g = this.observationPlatform.mo75866g(scenario.getKey(), scenario.getViewId());
        udy0VarMo75866g.mo33388d(scenario.getStartTimestampNanos() / ((long) 1000));
        this.ongoingScenarios.put(scenario.getViewId(), udy0VarMo75866g);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidStop(OopsEndedObservationView scenario) {
        scenario.getKey();
        udy0 udy0VarRemove = this.ongoingScenarios.remove(scenario.getViewId());
        if (udy0VarRemove == null) {
            return;
        }
        long j = 1000;
        udy0VarRemove.mo33387c(scenario.getAttributes()).mo33388d(scenario.getStartTimestampNanos() / j);
        udy0VarRemove.mo33385a(scenario.getEndTimestampNanos() / j);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidYield(OopsYieldedObservationView yieldedScenario) {
        udy0 udy0VarRemove = this.ongoingScenarios.remove(yieldedScenario.getViewId());
        if (udy0VarRemove == null) {
            return;
        }
        udy0VarRemove.mo33387c(yieldedScenario.getAttributes());
        this.observationPlatform.mo75862b(udy0VarRemove, yieldedScenario.getYieldKey());
    }

    /* JADX INFO: renamed from: setObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder */
    public final void m17319x8fefbaf5(unk0 unk0Var) {
        this.observationPlatform = unk0Var;
    }

    @Override // p204p.hgm
    public void shutdown() {
        Iterator<String> it = this.observableHandles.keySet().iterator();
        while (it.hasNext()) {
            this.observationPlatform.unregisterObservableMetric(it.next());
        }
        this.observableHandles.clear();
        OopsBridge.INSTANCE.setDelegate(null);
        this.ongoingTraces.clear();
        this.ongoingScenarios.clear();
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidCancel(UUID traceId) {
        this.ongoingTraces.remove(traceId);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidStart(OopsStartedTrace trace) {
        this.ongoingTraces.put(trace.getTraceId(), this.observationPlatform.mo75871l(trace.getKey(), trace.getTraceId(), Long.valueOf(trace.getStartTimestampNanos() / ((long) 1000))));
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidStop(OopsEndedTrace trace) {
        pa81 pa81VarRemove = this.ongoingTraces.remove(trace.getTraceId());
        if (pa81VarRemove == null) {
            return;
        }
        for (Map.Entry<String, String> entry : trace.getAttributes().entrySet()) {
            pa81VarRemove.setAttribute(entry.getKey(), entry.getValue());
        }
        applySpans(trace.getSpans(), pa81VarRemove);
        pa81VarRemove.stop();
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidYield(OopsYieldedTrace yieldedTrace) {
        pa81 pa81VarRemove = this.ongoingTraces.remove(yieldedTrace.getTraceId());
        if (pa81VarRemove == null) {
            return;
        }
        for (Map.Entry<String, String> entry : yieldedTrace.getAttributes().entrySet()) {
            pa81VarRemove.setAttribute(entry.getKey(), entry.getValue());
        }
        applySpans(yieldedTrace.getSpans(), pa81VarRemove);
        this.observationPlatform.mo75863c(pa81VarRemove, yieldedTrace.getYieldKey());
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void unregisterObservableMetric(String key) {
        if (this.metricsEnabled) {
            this.observableHandles.remove(key);
            this.observationPlatform.unregisterObservableMetric(key);
        }
    }
}
