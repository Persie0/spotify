package com.spotify.performancesdk.observationplatform.integrations.cpp;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import p204p.a450;
import p204p.b450;
import p204p.bk5;
import p204p.bo40;
import p204p.c95;
import p204p.co40;
import p204p.do40;
import p204p.i6f;
import p204p.t350;
import p204p.tnk0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0081\u0001\u0010+\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0007¢\u0006\u0004\b+\u0010,JC\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0002¢\u0006\u0004\b/\u00100J7\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0002¢\u0006\u0004\b2\u00103J\u0081\u0001\u00105\u001a\u0002042\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0002¢\u0006\u0004\b5\u00106J/\u00109\u001a\u00020\u00062\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b9\u0010 J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00062\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0007¢\u0006\u0004\b<\u0010;JS\u0010=\u001a\u00020\u00062\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0007¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010?\u001a\u00020\u001cH\u0007¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010?\u001a\u00020\u001cH\u0007¢\u0006\u0004\bD\u0010EJy\u0010F\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0007¢\u0006\u0004\bF\u0010GJK\u0010H\u001a\u00020\u00062\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0007¢\u0006\u0004\bH\u0010IJS\u0010K\u001a\u00020J2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\"H\u0002¢\u0006\u0004\bK\u0010LJ!\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001cH\u0007¢\u0006\u0004\bO\u0010PJ!\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001cH\u0007¢\u0006\u0004\bR\u0010SJ)\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\bU\u0010VJ)\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\bX\u0010YJC\u0010_\u001a\u0004\u0018\u00010^2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u0010]\u001a\u00020\fH\u0007¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\ba\u0010bJ \u0010e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010d\u001a\u00020cH\u0083 ¢\u0006\u0004\be\u0010fJ\u0018\u0010g\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH\u0083 ¢\u0006\u0004\bg\u0010hJ \u0010k\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\f2\u0006\u0010j\u001a\u00020iH\u0087 ¢\u0006\u0004\bk\u0010lR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006r"}, m24212d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsBridge;", "", "<init>", "()V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsBridgeDelegate;", "delegate", "Lp/w2a1;", "setDelegate", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsBridgeDelegate;)V", "Ljava/nio/ByteBuffer;", "getEnabledTracesBuffer", "()Ljava/nio/ByteBuffer;", "", "getEnabledTracesSeqCounterAddress", "()J", "pollPtr", "", "pollNative", "(J)Ljava/lang/Double;", "buffer", "seqCounterAddress", "setEnabledTracesBuffer", "(Ljava/nio/ByteBuffer;J)V", "", "getInitialEnabled", "()Z", "traceIdMsb", "traceIdLsb", "", "key", "startTimestampNanos", "onTraceStarted", "(JJLjava/lang/String;J)V", "endTimestampNanos", "", "spanKeys", "", "spanIdsMsb", "spanIdsLsb", "spanStartTimestamps", "spanEndTimestamps", "attributeKeys", "attributeValues", "onTraceStopped", "(JJLjava/lang/String;JJ[Ljava/lang/String;[J[J[J[J[Ljava/lang/String;[Ljava/lang/String;)V", "", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsSpan;", "constructSpans", "([Ljava/lang/String;[J[J[J[J)Ljava/util/List;", "", "constructAttributes", "([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/Map;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;", "constructTrace", "(JJLjava/lang/String;JJ[Ljava/lang/String;[J[J[J[J[Ljava/lang/String;[Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;", "scenarioIdMsb", "scenarioIdLsb", "onScenarioStarted", "onTraceCancelled", "(JJ)V", "onScenarioCancelled", "onScenarioStopped", "(JJLjava/lang/String;JJ[Ljava/lang/String;[Ljava/lang/String;)V", "yieldKey", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "claimYieldedScenario", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "claimYieldedTrace", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "onTraceYielded", "(JJLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;[J[J[J[J[Ljava/lang/String;[Ljava/lang/String;)V", "onScenarioYielded", "(JJLjava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;", "constructObservationView", "(JJLjava/lang/String;JJ[Ljava/lang/String;[Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;", "unit", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "onCreateCounter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "onCreateGauge", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "onCreateObservableGauge", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "onCreateObservableCounter", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "keys", "instruments", "units", "callbackPtr", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "onRegisterBatchMetrics", "([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "onUnregisterObservableMetric", "(Ljava/lang/String;)V", "", "hasValue", "nativePoll", "(J[Z)D", "nativeReleasePoll", "(J)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObserver;", "observer", "nativeBatchCallback", "(JLcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObserver;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsBridgeDelegate;", "enabledTracesBuffer", "Ljava/nio/ByteBuffer;", "enabledTracesSeqCounterAddress", "J", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OopsBridge {
    public static final OopsBridge INSTANCE = new OopsBridge();
    private static volatile OopsBridgeDelegate delegate;
    private static volatile ByteBuffer enabledTracesBuffer;
    private static volatile long enabledTracesSeqCounterAddress;

    private OopsBridge() {
    }

    public static final OopsStartedObservationView claimYieldedScenario(String yieldKey) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            return oopsBridgeDelegate.claimYieldedScenario(yieldKey);
        }
        return null;
    }

    public static final OopsStartedTrace claimYieldedTrace(String yieldKey) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            return oopsBridgeDelegate.claimYieldedTrace(yieldKey);
        }
        return null;
    }

    private final Map<String, String> constructAttributes(String[] attributeKeys, String[] attributeValues) {
        co40 co40VarM29630p1 = bk5.m29630p1(attributeKeys);
        int iM31820L = c95.m31820L(i6f.m49804T(co40VarM29630p1, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        Iterator it = co40VarM29630p1.iterator();
        while (true) {
            do40 do40Var = (do40) it;
            if (!((Iterator) do40Var.f50936c).hasNext()) {
                return linkedHashMap;
            }
            bo40 bo40Var = (bo40) do40Var.next();
            linkedHashMap.put((String) bo40Var.f29009b, attributeValues[bo40Var.f29008a]);
        }
    }

    private final OopsEndedObservationView constructObservationView(long scenarioIdMsb, long scenarioIdLsb, String key, long startTimestampNanos, long endTimestampNanos, String[] attributeKeys, String[] attributeValues) {
        return new OopsEndedObservationView(new UUID(scenarioIdMsb, scenarioIdLsb), key, startTimestampNanos, endTimestampNanos, constructAttributes(attributeKeys, attributeValues));
    }

    private final List<OopsSpan> constructSpans(String[] spanKeys, long[] spanIdsMsb, long[] spanIdsLsb, long[] spanStartTimestamps, long[] spanEndTimestamps) {
        b450 b450Var = new b450(0, spanKeys.length - 1, 1);
        ArrayList arrayList = new ArrayList(i6f.m49804T(b450Var, 10));
        Iterator it = b450Var.iterator();
        while (((a450) it).f12141c) {
            int iNextInt = ((t350) it).nextInt();
            arrayList.add(new OopsSpan(new UUID(spanIdsMsb[iNextInt], spanIdsLsb[iNextInt]), spanKeys[iNextInt], spanStartTimestamps[iNextInt], spanEndTimestamps[iNextInt]));
        }
        return arrayList;
    }

    private final OopsEndedTrace constructTrace(long traceIdMsb, long traceIdLsb, String key, long startTimestampNanos, long endTimestampNanos, String[] spanKeys, long[] spanIdsMsb, long[] spanIdsLsb, long[] spanStartTimestamps, long[] spanEndTimestamps, String[] attributeKeys, String[] attributeValues) {
        return new OopsEndedTrace(new UUID(traceIdMsb, traceIdLsb), key, startTimestampNanos, endTimestampNanos, constructSpans(spanKeys, spanIdsMsb, spanIdsLsb, spanStartTimestamps, spanEndTimestamps), constructAttributes(attributeKeys, attributeValues));
    }

    public static final boolean getInitialEnabled() {
        tnk0 tnk0Var = tnk0.f221995a;
        return tnk0.m81179x();
    }

    public static final native void nativeBatchCallback(long callbackPtr, OopsCppBatchObserver observer);

    private static final native double nativePoll(long pollPtr, boolean[] hasValue);

    private static final native void nativeReleasePoll(long pollPtr);

    public static final OopsCppCounter onCreateCounter(String key, String unit) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            return oopsBridgeDelegate.createCounter(key, unit);
        }
        return null;
    }

    public static final OopsCppGauge onCreateGauge(String key, String unit) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            return oopsBridgeDelegate.createGauge(key, unit);
        }
        return null;
    }

    public static final OopsCppObservableCounter onCreateObservableCounter(String key, String unit, long pollPtr) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            return oopsBridgeDelegate.createObservableCounter(key, unit, pollPtr);
        }
        return null;
    }

    public static final OopsCppObservableGauge onCreateObservableGauge(String key, String unit, long pollPtr) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            return oopsBridgeDelegate.createObservableGauge(key, unit, pollPtr);
        }
        return null;
    }

    public static final OopsCppBatchObservableInstrument onRegisterBatchMetrics(String[] keys, String[] instruments, String[] units, long callbackPtr) {
        b450 b450Var = new b450(0, keys.length - 1, 1);
        ArrayList arrayList = new ArrayList(i6f.m49804T(b450Var, 10));
        Iterator it = b450Var.iterator();
        while (((a450) it).f12141c) {
            int iNextInt = ((t350) it).nextInt();
            arrayList.add(new OopsCppMetricDefinition(keys[iNextInt], instruments[iNextInt], units[iNextInt]));
        }
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            return oopsBridgeDelegate.registerBatchMetrics(arrayList, callbackPtr);
        }
        return null;
    }

    public static final void onScenarioCancelled(long scenarioIdMsb, long scenarioIdLsb) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.scenarioDidCancel(new UUID(scenarioIdMsb, scenarioIdLsb));
        }
    }

    public static final void onScenarioStarted(long scenarioIdMsb, long scenarioIdLsb, String key, long startTimestampNanos) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.scenarioDidStart(new OopsStartedObservationView(new UUID(scenarioIdMsb, scenarioIdLsb), key, startTimestampNanos));
        }
    }

    public static final void onScenarioStopped(long scenarioIdMsb, long scenarioIdLsb, String key, long startTimestampNanos, long endTimestampNanos, String[] attributeKeys, String[] attributeValues) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.scenarioDidStop(INSTANCE.constructObservationView(scenarioIdMsb, scenarioIdLsb, key, startTimestampNanos, endTimestampNanos, attributeKeys, attributeValues));
        }
    }

    public static final void onScenarioYielded(long scenarioIdMsb, long scenarioIdLsb, String key, String yieldKey, String[] attributeKeys, String[] attributeValues) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.scenarioDidYield(new OopsYieldedObservationView(new UUID(scenarioIdMsb, scenarioIdLsb), key, yieldKey, INSTANCE.constructAttributes(attributeKeys, attributeValues)));
        }
    }

    public static final void onTraceCancelled(long traceIdMsb, long traceIdLsb) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.traceDidCancel(new UUID(traceIdMsb, traceIdLsb));
        }
    }

    public static final void onTraceStarted(long traceIdMsb, long traceIdLsb, String key, long startTimestampNanos) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.traceDidStart(new OopsStartedTrace(new UUID(traceIdMsb, traceIdLsb), key, startTimestampNanos));
        }
    }

    public static final void onTraceStopped(long traceIdMsb, long traceIdLsb, String key, long startTimestampNanos, long endTimestampNanos, String[] spanKeys, long[] spanIdsMsb, long[] spanIdsLsb, long[] spanStartTimestamps, long[] spanEndTimestamps, String[] attributeKeys, String[] attributeValues) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.traceDidStop(INSTANCE.constructTrace(traceIdMsb, traceIdLsb, key, startTimestampNanos, endTimestampNanos, spanKeys, spanIdsMsb, spanIdsLsb, spanStartTimestamps, spanEndTimestamps, attributeKeys, attributeValues));
        }
    }

    public static final void onTraceYielded(long traceIdMsb, long traceIdLsb, String key, String yieldKey, String[] spanKeys, long[] spanIdsMsb, long[] spanIdsLsb, long[] spanStartTimestamps, long[] spanEndTimestamps, String[] attributeKeys, String[] attributeValues) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            UUID uuid = new UUID(traceIdMsb, traceIdLsb);
            OopsBridge oopsBridge = INSTANCE;
            oopsBridgeDelegate.traceDidYield(new OopsYieldedTrace(uuid, key, yieldKey, oopsBridge.constructSpans(spanKeys, spanIdsMsb, spanIdsLsb, spanStartTimestamps, spanEndTimestamps), oopsBridge.constructAttributes(attributeKeys, attributeValues)));
        }
    }

    public static final void onUnregisterObservableMetric(String key) {
        OopsBridgeDelegate oopsBridgeDelegate = delegate;
        if (oopsBridgeDelegate != null) {
            oopsBridgeDelegate.unregisterObservableMetric(key);
        }
    }

    public static final void setEnabledTracesBuffer(ByteBuffer buffer, long seqCounterAddress) {
        enabledTracesBuffer = buffer;
        enabledTracesSeqCounterAddress = seqCounterAddress;
    }

    public final ByteBuffer getEnabledTracesBuffer() {
        return enabledTracesBuffer;
    }

    public final long getEnabledTracesSeqCounterAddress() {
        return enabledTracesSeqCounterAddress;
    }

    public final Double pollNative(long pollPtr) {
        boolean[] zArr = {false};
        double dNativePoll = nativePoll(pollPtr, zArr);
        if (zArr[0]) {
            return Double.valueOf(dNativePoll);
        }
        return null;
    }

    public final synchronized void setDelegate(OopsBridgeDelegate delegate2) {
        delegate = delegate2;
    }
}
