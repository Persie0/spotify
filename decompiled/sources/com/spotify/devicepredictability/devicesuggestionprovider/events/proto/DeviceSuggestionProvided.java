package com.spotify.devicepredictability.devicesuggestionprovider.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ncr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DeviceSuggestionProvided extends AbstractC0269h implements sre0 {
    public static final int CONFIDENCE_LEVEL_FIELD_NUMBER = 3;
    private static final DeviceSuggestionProvided DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 5;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 4;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SUGGESTION_ID_FIELD_NUMBER = 1;
    public static final int SUGGESTION_PROVIDER_FIELD_NUMBER = 2;
    private int bitField0_;
    private String suggestionId_ = "";
    private String suggestionProvider_ = "";
    private String confidenceLevel_ = "";
    private String deviceType_ = "";
    private String deviceId_ = "";
    private ae50 featureIdentifier_ = AbstractC0269h.emptyProtobufList();

    static {
        DeviceSuggestionProvided deviceSuggestionProvided = new DeviceSuggestionProvided();
        DEFAULT_INSTANCE = deviceSuggestionProvided;
        AbstractC0269h.registerDefaultInstance(DeviceSuggestionProvided.class, deviceSuggestionProvided);
    }

    private DeviceSuggestionProvided() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9260n(DeviceSuggestionProvided deviceSuggestionProvided, List list) {
        ae50 ae50Var = deviceSuggestionProvided.featureIdentifier_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            deviceSuggestionProvided.featureIdentifier_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, deviceSuggestionProvided.featureIdentifier_);
    }

    /* JADX INFO: renamed from: o */
    public static void m9261o(DeviceSuggestionProvided deviceSuggestionProvided, String str) {
        deviceSuggestionProvided.getClass();
        deviceSuggestionProvided.bitField0_ |= 4;
        deviceSuggestionProvided.confidenceLevel_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9262p(DeviceSuggestionProvided deviceSuggestionProvided, String str) {
        deviceSuggestionProvided.getClass();
        str.getClass();
        deviceSuggestionProvided.bitField0_ |= 16;
        deviceSuggestionProvided.deviceId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9263q(DeviceSuggestionProvided deviceSuggestionProvided, String str) {
        deviceSuggestionProvided.getClass();
        deviceSuggestionProvided.bitField0_ |= 8;
        deviceSuggestionProvided.deviceType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9264r(DeviceSuggestionProvided deviceSuggestionProvided, String str) {
        deviceSuggestionProvided.getClass();
        str.getClass();
        deviceSuggestionProvided.bitField0_ |= 1;
        deviceSuggestionProvided.suggestionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m9265s(DeviceSuggestionProvided deviceSuggestionProvided, String str) {
        deviceSuggestionProvided.getClass();
        deviceSuggestionProvided.bitField0_ |= 2;
        deviceSuggestionProvided.suggestionProvider_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static ncr m9266t() {
        return (ncr) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006\u001a", new Object[]{"bitField0_", "suggestionId_", "suggestionProvider_", "confidenceLevel_", "deviceType_", "deviceId_", "featureIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new DeviceSuggestionProvided();
        }
        if (iOrdinal == 4) {
            return new ncr(DEFAULT_INSTANCE);
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
        synchronized (DeviceSuggestionProvided.class) {
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
