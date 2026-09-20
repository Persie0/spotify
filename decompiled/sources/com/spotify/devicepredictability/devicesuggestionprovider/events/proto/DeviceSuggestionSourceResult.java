package com.spotify.devicepredictability.devicesuggestionprovider.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sfr;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceSuggestionSourceResult extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_DEVICE_COUNT_FIELD_NUMBER = 8;
    public static final int CONFIDENCE_FIELD_NUMBER = 6;
    public static final int CORRELATION_ID_FIELD_NUMBER = 1;
    private static final DeviceSuggestionSourceResult DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 4;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 5;
    public static final int IS_PRIMARY_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int SUGGESTION_ID_FIELD_NUMBER = 7;
    private int availableDeviceCount_;
    private int bitField0_;
    private boolean isPrimary_;
    private String correlationId_ = "";
    private String source_ = "";
    private String status_ = "";
    private String deviceId_ = "";
    private String deviceType_ = "";
    private String confidence_ = "";
    private String suggestionId_ = "";

    static {
        DeviceSuggestionSourceResult deviceSuggestionSourceResult = new DeviceSuggestionSourceResult();
        DEFAULT_INSTANCE = deviceSuggestionSourceResult;
        AbstractC0269h.registerDefaultInstance(DeviceSuggestionSourceResult.class, deviceSuggestionSourceResult);
    }

    private DeviceSuggestionSourceResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9267n(DeviceSuggestionSourceResult deviceSuggestionSourceResult, int i) {
        deviceSuggestionSourceResult.bitField0_ |= 128;
        deviceSuggestionSourceResult.availableDeviceCount_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m9268o(DeviceSuggestionSourceResult deviceSuggestionSourceResult, String str) {
        deviceSuggestionSourceResult.getClass();
        deviceSuggestionSourceResult.bitField0_ |= 32;
        deviceSuggestionSourceResult.confidence_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9269p(DeviceSuggestionSourceResult deviceSuggestionSourceResult, String str) {
        deviceSuggestionSourceResult.getClass();
        str.getClass();
        deviceSuggestionSourceResult.bitField0_ |= 1;
        deviceSuggestionSourceResult.correlationId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9270q(DeviceSuggestionSourceResult deviceSuggestionSourceResult, String str) {
        deviceSuggestionSourceResult.getClass();
        str.getClass();
        deviceSuggestionSourceResult.bitField0_ |= 8;
        deviceSuggestionSourceResult.deviceId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9271r(DeviceSuggestionSourceResult deviceSuggestionSourceResult, String str) {
        deviceSuggestionSourceResult.getClass();
        deviceSuggestionSourceResult.bitField0_ |= 16;
        deviceSuggestionSourceResult.deviceType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m9272s(DeviceSuggestionSourceResult deviceSuggestionSourceResult, boolean z) {
        deviceSuggestionSourceResult.bitField0_ |= 256;
        deviceSuggestionSourceResult.isPrimary_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m9273t(DeviceSuggestionSourceResult deviceSuggestionSourceResult, String str) {
        deviceSuggestionSourceResult.getClass();
        deviceSuggestionSourceResult.bitField0_ |= 2;
        deviceSuggestionSourceResult.source_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m9274u(DeviceSuggestionSourceResult deviceSuggestionSourceResult, String str) {
        deviceSuggestionSourceResult.getClass();
        str.getClass();
        deviceSuggestionSourceResult.bitField0_ |= 4;
        deviceSuggestionSourceResult.status_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m9275v(DeviceSuggestionSourceResult deviceSuggestionSourceResult, String str) {
        deviceSuggestionSourceResult.getClass();
        str.getClass();
        deviceSuggestionSourceResult.bitField0_ |= 64;
        deviceSuggestionSourceResult.suggestionId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static sfr m9276w() {
        return (sfr) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tဇ\b", new Object[]{"bitField0_", "correlationId_", "source_", "status_", "deviceId_", "deviceType_", "confidence_", "suggestionId_", "availableDeviceCount_", "isPrimary_"});
        }
        if (iOrdinal == 3) {
            return new DeviceSuggestionSourceResult();
        }
        if (iOrdinal == 4) {
            return new sfr(DEFAULT_INSTANCE);
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
        synchronized (DeviceSuggestionSourceResult.class) {
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
