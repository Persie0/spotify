package com.spotify.devicepredictability.googledevicesuggestionsimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.har;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DevicePredictabilityIntentEngineSuggestion extends AbstractC0269h implements sre0 {
    public static final int CONFIDENCE_SCORE_FIELD_NUMBER = 2;
    private static final DevicePredictabilityIntentEngineSuggestion DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RECOMMENDATION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String recommendationId_ = "";
    private String confidenceScore_ = "";
    private String deviceId_ = "";

    static {
        DevicePredictabilityIntentEngineSuggestion devicePredictabilityIntentEngineSuggestion = new DevicePredictabilityIntentEngineSuggestion();
        DEFAULT_INSTANCE = devicePredictabilityIntentEngineSuggestion;
        AbstractC0269h.registerDefaultInstance(DevicePredictabilityIntentEngineSuggestion.class, devicePredictabilityIntentEngineSuggestion);
    }

    private DevicePredictabilityIntentEngineSuggestion() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9279n(DevicePredictabilityIntentEngineSuggestion devicePredictabilityIntentEngineSuggestion, String str) {
        devicePredictabilityIntentEngineSuggestion.getClass();
        str.getClass();
        devicePredictabilityIntentEngineSuggestion.bitField0_ |= 2;
        devicePredictabilityIntentEngineSuggestion.confidenceScore_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m9280o(DevicePredictabilityIntentEngineSuggestion devicePredictabilityIntentEngineSuggestion, String str) {
        devicePredictabilityIntentEngineSuggestion.getClass();
        str.getClass();
        devicePredictabilityIntentEngineSuggestion.bitField0_ |= 4;
        devicePredictabilityIntentEngineSuggestion.deviceId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9281p(DevicePredictabilityIntentEngineSuggestion devicePredictabilityIntentEngineSuggestion, String str) {
        devicePredictabilityIntentEngineSuggestion.getClass();
        str.getClass();
        devicePredictabilityIntentEngineSuggestion.bitField0_ |= 1;
        devicePredictabilityIntentEngineSuggestion.recommendationId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static har m9282q() {
        return (har) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "recommendationId_", "confidenceScore_", "deviceId_"});
        }
        if (iOrdinal == 3) {
            return new DevicePredictabilityIntentEngineSuggestion();
        }
        if (iOrdinal == 4) {
            return new har(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (DevicePredictabilityIntentEngineSuggestion.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
