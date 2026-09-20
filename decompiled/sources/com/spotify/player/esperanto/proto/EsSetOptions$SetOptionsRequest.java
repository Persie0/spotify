package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.pow;
import p204p.pre0;
import p204p.qow;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSetOptions$SetOptionsRequest extends AbstractC0269h implements sre0 {
    private static final EsSetOptions$SetOptionsRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 5;
    public static final int MODES_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 6;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER = 2;
    public static final int REPEATING_TRACK_FIELD_NUMBER = 1;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private ihc0 modes_ = ihc0.f102235b;
    private EsCommandOptions$CommandOptions options_;
    private float playbackSpeed_;
    private EsOptional$OptionalBoolean repeatingContext_;
    private EsOptional$OptionalBoolean repeatingTrack_;
    private EsOptional$OptionalBoolean shufflingContext_;

    static {
        EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest = new EsSetOptions$SetOptionsRequest();
        DEFAULT_INSTANCE = esSetOptions$SetOptionsRequest;
        AbstractC0269h.registerDefaultInstance(EsSetOptions$SetOptionsRequest.class, esSetOptions$SetOptionsRequest);
    }

    private EsSetOptions$SetOptionsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m17961n(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest) {
        ihc0 ihc0Var = esSetOptions$SetOptionsRequest.modes_;
        if (!ihc0Var.f102236a) {
            esSetOptions$SetOptionsRequest.modes_ = ihc0Var.m50613h();
        }
        return esSetOptions$SetOptionsRequest.modes_;
    }

    /* JADX INFO: renamed from: o */
    public static void m17962o(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSetOptions$SetOptionsRequest.getClass();
        esSetOptions$SetOptionsRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSetOptions$SetOptionsRequest.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: p */
    public static void m17963p(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSetOptions$SetOptionsRequest.getClass();
        esSetOptions$SetOptionsRequest.options_ = esCommandOptions$CommandOptions;
        esSetOptions$SetOptionsRequest.bitField0_ |= 8;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17964q(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, float f) {
        esSetOptions$SetOptionsRequest.bitField0_ |= 32;
        esSetOptions$SetOptionsRequest.playbackSpeed_ = f;
    }

    /* JADX INFO: renamed from: r */
    public static void m17965r(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esSetOptions$SetOptionsRequest.getClass();
        esOptional$OptionalBoolean.getClass();
        esSetOptions$SetOptionsRequest.repeatingContext_ = esOptional$OptionalBoolean;
        esSetOptions$SetOptionsRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: s */
    public static void m17966s(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esSetOptions$SetOptionsRequest.getClass();
        esOptional$OptionalBoolean.getClass();
        esSetOptions$SetOptionsRequest.repeatingTrack_ = esOptional$OptionalBoolean;
        esSetOptions$SetOptionsRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: t */
    public static void m17967t(EsSetOptions$SetOptionsRequest esSetOptions$SetOptionsRequest, EsOptional$OptionalBoolean esOptional$OptionalBoolean) {
        esSetOptions$SetOptionsRequest.getClass();
        esOptional$OptionalBoolean.getClass();
        esSetOptions$SetOptionsRequest.shufflingContext_ = esOptional$OptionalBoolean;
        esSetOptions$SetOptionsRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: u */
    public static pow m17968u() {
        return (pow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ခ\u0005\u00072", new Object[]{"bitField0_", "repeatingTrack_", "repeatingContext_", "shufflingContext_", "options_", "loggingParams_", "playbackSpeed_", "modes_", qow.f191073a});
        }
        if (iOrdinal == 3) {
            return new EsSetOptions$SetOptionsRequest();
        }
        if (iOrdinal == 4) {
            return new pow(DEFAULT_INSTANCE);
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
        synchronized (EsSetOptions$SetOptionsRequest.class) {
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
