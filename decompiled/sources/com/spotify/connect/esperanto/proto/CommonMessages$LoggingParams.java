package com.spotify.connect.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.gpf;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CommonMessages$LoggingParams extends AbstractC0269h implements sre0 {
    public static final int COMMAND_ID_FIELD_NUMBER = 5;
    public static final int COMMAND_INITIATED_TIME_FIELD_NUMBER = 1;
    public static final int COMMAND_RECEIVED_TIME_FIELD_NUMBER = 2;
    private static final CommonMessages$LoggingParams DEFAULT_INSTANCE;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 6;
    public static final int INTERACTION_IDS_FIELD_NUMBER = 4;
    public static final int PAGE_INSTANCE_IDS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private long commandInitiatedTime_;
    private long commandReceivedTime_;
    private ae50 pageInstanceIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 interactionIds_ = AbstractC0269h.emptyProtobufList();
    private String commandId_ = "";
    private String featureIdentifier_ = "";

    static {
        CommonMessages$LoggingParams commonMessages$LoggingParams = new CommonMessages$LoggingParams();
        DEFAULT_INSTANCE = commonMessages$LoggingParams;
        AbstractC0269h.registerDefaultInstance(CommonMessages$LoggingParams.class, commonMessages$LoggingParams);
    }

    private CommonMessages$LoggingParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7298n(CommonMessages$LoggingParams commonMessages$LoggingParams, String str) {
        commonMessages$LoggingParams.getClass();
        str.getClass();
        ae50 ae50Var = commonMessages$LoggingParams.interactionIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            commonMessages$LoggingParams.interactionIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        commonMessages$LoggingParams.interactionIds_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m7299o(CommonMessages$LoggingParams commonMessages$LoggingParams, String str) {
        commonMessages$LoggingParams.getClass();
        str.getClass();
        commonMessages$LoggingParams.bitField0_ |= 4;
        commonMessages$LoggingParams.commandId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static gpf m7300p() {
        return (gpf) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003Ț\u0004Ț\u0005ለ\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "commandInitiatedTime_", "commandReceivedTime_", "pageInstanceIds_", "interactionIds_", "commandId_", "featureIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new CommonMessages$LoggingParams();
        }
        if (iOrdinal == 4) {
            return new gpf(DEFAULT_INSTANCE);
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
        synchronized (CommonMessages$LoggingParams.class) {
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
