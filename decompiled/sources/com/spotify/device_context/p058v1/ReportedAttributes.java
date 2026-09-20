package com.spotify.device_context.p058v1;

import com.google.protobuf.AbstractC0269h;
import p204p.gtw0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ReportedAttributes extends AbstractC0269h implements sre0 {
    private static final ReportedAttributes DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 1;
    public static final int IS_PARTNER_EXPLICIT_CONTENT_FILTERING_ENABLED_FIELD_NUMBER = 4;
    public static final int IS_VOICE_ENABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUPPORTED_CONTENT_TYPES_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean isPartnerExplicitContentFilteringEnabled_;
    private boolean isVoiceEnabled_;
    private String deviceType_ = "";
    private String supportedContentTypes_ = "";

    static {
        ReportedAttributes reportedAttributes = new ReportedAttributes();
        DEFAULT_INSTANCE = reportedAttributes;
        AbstractC0269h.registerDefaultInstance(ReportedAttributes.class, reportedAttributes);
    }

    private ReportedAttributes() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9218n(ReportedAttributes reportedAttributes, String str) {
        reportedAttributes.getClass();
        str.getClass();
        reportedAttributes.bitField0_ |= 1;
        reportedAttributes.deviceType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static gtw0 m9219o() {
        return (gtw0) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "deviceType_", "isVoiceEnabled_", "supportedContentTypes_", "isPartnerExplicitContentFilteringEnabled_"});
        }
        if (iOrdinal == 3) {
            return new ReportedAttributes();
        }
        if (iOrdinal == 4) {
            return new gtw0(DEFAULT_INSTANCE);
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
        synchronized (ReportedAttributes.class) {
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
