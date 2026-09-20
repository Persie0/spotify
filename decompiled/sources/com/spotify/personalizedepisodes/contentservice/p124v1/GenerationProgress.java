package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.c310;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GenerationProgress extends AbstractC0269h implements sre0 {
    private static final GenerationProgress DEFAULT_INSTANCE;
    public static final int GENERATION_ID_FIELD_NUMBER = 1;
    public static final int LAST_UPDATED_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String generationId_ = "";
    private Timestamp lastUpdated_;
    private int status_;

    static {
        GenerationProgress generationProgress = new GenerationProgress();
        DEFAULT_INSTANCE = generationProgress;
        AbstractC0269h.registerDefaultInstance(GenerationProgress.class, generationProgress);
    }

    private GenerationProgress() {
    }

    /* JADX INFO: renamed from: n */
    public static GenerationProgress m17411n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"bitField0_", "generationId_", "status_", "lastUpdated_"});
        }
        if (iOrdinal == 3) {
            return new GenerationProgress();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 13);
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
        synchronized (GenerationProgress.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m17412o() {
        return this.generationId_;
    }

    /* JADX INFO: renamed from: p */
    public final Timestamp m17413p() {
        Timestamp timestamp = this.lastUpdated_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: q */
    public final c310 m17414q() {
        c310 c310Var;
        int i = this.status_;
        if (i == 0) {
            c310Var = c310.GENERATION_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            c310Var = c310.GENERATION_STATUS_GENERATING;
        } else if (i == 2) {
            c310Var = c310.GENERATION_STATUS_GENERATED;
        } else if (i == 3) {
            c310Var = c310.GENERATION_STATUS_READY;
        } else if (i != 4) {
            c310Var = i != 5 ? null : c310.GENERATION_STATUS_NO_CREDITS;
        } else {
            c310Var = c310.GENERATION_STATUS_FAILED;
        }
        return c310Var == null ? c310.UNRECOGNIZED : c310Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
