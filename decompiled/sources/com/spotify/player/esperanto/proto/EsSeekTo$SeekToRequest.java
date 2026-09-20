package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iow;
import p204p.jow;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSeekTo$SeekToRequest extends AbstractC0269h implements sre0 {
    public static final int CREATOR_TIMESTAMP_POSITION_MS_FIELD_NUMBER = 5;
    private static final EsSeekTo$SeekToRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int RELATIVE_FIELD_NUMBER = 4;
    private int bitField0_;
    private EsOptional$OptionalInt64 creatorTimestampPositionMs_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private long position_;
    private int relative_;

    static {
        EsSeekTo$SeekToRequest esSeekTo$SeekToRequest = new EsSeekTo$SeekToRequest();
        DEFAULT_INSTANCE = esSeekTo$SeekToRequest;
        AbstractC0269h.registerDefaultInstance(EsSeekTo$SeekToRequest.class, esSeekTo$SeekToRequest);
    }

    private EsSeekTo$SeekToRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17954n(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, EsOptional$OptionalInt64 esOptional$OptionalInt64) {
        esSeekTo$SeekToRequest.getClass();
        esOptional$OptionalInt64.getClass();
        esSeekTo$SeekToRequest.creatorTimestampPositionMs_ = esOptional$OptionalInt64;
        esSeekTo$SeekToRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m17955o(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSeekTo$SeekToRequest.getClass();
        esSeekTo$SeekToRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSeekTo$SeekToRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m17956p(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSeekTo$SeekToRequest.getClass();
        esSeekTo$SeekToRequest.options_ = esCommandOptions$CommandOptions;
        esSeekTo$SeekToRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17957q(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, long j) {
        esSeekTo$SeekToRequest.position_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m17958r(EsSeekTo$SeekToRequest esSeekTo$SeekToRequest, jow jowVar) {
        esSeekTo$SeekToRequest.getClass();
        esSeekTo$SeekToRequest.relative_ = jowVar.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static iow m17959s() {
        return (iow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0002\u0004\f\u0005ဉ\u0002", new Object[]{"bitField0_", "options_", "loggingParams_", "position_", "relative_", "creatorTimestampPositionMs_"});
        }
        if (iOrdinal == 3) {
            return new EsSeekTo$SeekToRequest();
        }
        if (iOrdinal == 4) {
            return new iow(DEFAULT_INSTANCE);
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
        synchronized (EsSeekTo$SeekToRequest.class) {
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
