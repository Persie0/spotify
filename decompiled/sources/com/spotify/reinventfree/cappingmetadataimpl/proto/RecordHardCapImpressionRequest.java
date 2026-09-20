package com.spotify.reinventfree.cappingmetadataimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ahv0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zgv0;

/* JADX INFO: loaded from: classes2.dex */
public final class RecordHardCapImpressionRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    private static final RecordHardCapImpressionRequest DEFAULT_INSTANCE;
    public static final int IMPRESSION_SOURCE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_URI_FIELD_NUMBER = 3;
    private int impressionSource_;
    private String contextUri_ = "";
    private String trackUri_ = "";

    static {
        RecordHardCapImpressionRequest recordHardCapImpressionRequest = new RecordHardCapImpressionRequest();
        DEFAULT_INSTANCE = recordHardCapImpressionRequest;
        AbstractC0269h.registerDefaultInstance(RecordHardCapImpressionRequest.class, recordHardCapImpressionRequest);
    }

    private RecordHardCapImpressionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20378n(RecordHardCapImpressionRequest recordHardCapImpressionRequest, String str) {
        recordHardCapImpressionRequest.getClass();
        str.getClass();
        recordHardCapImpressionRequest.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20379o(RecordHardCapImpressionRequest recordHardCapImpressionRequest, ahv0 ahv0Var) {
        recordHardCapImpressionRequest.getClass();
        recordHardCapImpressionRequest.impressionSource_ = ahv0Var.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m20380p(RecordHardCapImpressionRequest recordHardCapImpressionRequest, String str) {
        recordHardCapImpressionRequest.getClass();
        recordHardCapImpressionRequest.trackUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static zgv0 m20382r() {
        return (zgv0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"impressionSource_", "contextUri_", "trackUri_"});
        }
        if (iOrdinal == 3) {
            return new RecordHardCapImpressionRequest();
        }
        if (iOrdinal == 4) {
            return new zgv0();
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
        synchronized (RecordHardCapImpressionRequest.class) {
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
