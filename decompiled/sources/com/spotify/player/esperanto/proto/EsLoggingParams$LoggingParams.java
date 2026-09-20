package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ilw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsLoggingParams$LoggingParams extends AbstractC0269h implements sre0 {
    public static final int COMMAND_ID_FIELD_NUMBER = 6;
    public static final int COMMAND_INITIATED_TIME_FIELD_NUMBER = 1;
    public static final int COMMAND_RECEIVED_TIME_FIELD_NUMBER = 2;
    private static final EsLoggingParams$LoggingParams DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int INTERACTION_IDS_FIELD_NUMBER = 4;
    public static final int PAGE_INSTANCE_IDS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EsOptional$OptionalInt64 commandInitiatedTime_;
    private EsOptional$OptionalInt64 commandReceivedTime_;
    private ae50 pageInstanceIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 interactionIds_ = AbstractC0269h.emptyProtobufList();
    private String deviceIdentifier_ = "";
    private String commandId_ = "";

    static {
        EsLoggingParams$LoggingParams esLoggingParams$LoggingParams = new EsLoggingParams$LoggingParams();
        DEFAULT_INSTANCE = esLoggingParams$LoggingParams;
        AbstractC0269h.registerDefaultInstance(EsLoggingParams$LoggingParams.class, esLoggingParams$LoggingParams);
    }

    private EsLoggingParams$LoggingParams() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17763n(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, String str) {
        esLoggingParams$LoggingParams.getClass();
        str.getClass();
        ae50 ae50Var = esLoggingParams$LoggingParams.interactionIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esLoggingParams$LoggingParams.interactionIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        esLoggingParams$LoggingParams.interactionIds_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m17764o(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, String str) {
        esLoggingParams$LoggingParams.getClass();
        str.getClass();
        ae50 ae50Var = esLoggingParams$LoggingParams.pageInstanceIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esLoggingParams$LoggingParams.pageInstanceIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        esLoggingParams$LoggingParams.pageInstanceIds_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m17765p(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, String str) {
        esLoggingParams$LoggingParams.getClass();
        str.getClass();
        esLoggingParams$LoggingParams.bitField0_ |= 4;
        esLoggingParams$LoggingParams.commandId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17766q(EsLoggingParams$LoggingParams esLoggingParams$LoggingParams, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esLoggingParams$LoggingParams.getClass();
        esOptional$OptionalInt64.getClass();
        esLoggingParams$LoggingParams.commandInitiatedTime_ = esOptional$OptionalInt64;
        esLoggingParams$LoggingParams.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static EsLoggingParams$LoggingParams m17767r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static ilw m17768t() {
        return (ilw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ț\u0004Ț\u0005Ȉ\u0006ለ\u0002", new Object[]{"bitField0_", "commandInitiatedTime_", "commandReceivedTime_", "pageInstanceIds_", "interactionIds_", "deviceIdentifier_", "commandId_"});
        }
        if (iOrdinal == 3) {
            return new EsLoggingParams$LoggingParams();
        }
        if (iOrdinal == 4) {
            return new ilw(DEFAULT_INSTANCE);
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
        synchronized (EsLoggingParams$LoggingParams.class) {
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

    /* JADX INFO: renamed from: s */
    public final ae50 m17769s() {
        return this.interactionIds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
