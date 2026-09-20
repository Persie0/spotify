package com.spotify.musicquizservice.p113v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Result extends AbstractC0269h implements sre0 {
    public static final int COMPLETION_TIME_FIELD_NUMBER = 2;
    private static final Result DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Duration completionTime_;
    private Score score_;

    static {
        Result result = new Result();
        DEFAULT_INSTANCE = result;
        AbstractC0269h.registerDefaultInstance(Result.class, result);
    }

    private Result() {
    }

    /* JADX INFO: renamed from: o */
    public static Result m15916o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "score_", "completionTime_"});
        }
        if (iOrdinal == 3) {
            return new Result();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 2);
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
        synchronized (Result.class) {
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

    /* JADX INFO: renamed from: n */
    public final Duration m15917n() {
        Duration duration = this.completionTime_;
        return duration == null ? Duration.m1928p() : duration;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Score m15918p() {
        Score score = this.score_;
        return score == null ? Score.m15927n() : score;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m15919q() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
