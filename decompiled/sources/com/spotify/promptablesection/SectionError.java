package com.spotify.promptablesection;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z6z0;

/* JADX INFO: loaded from: classes10.dex */
public final class SectionError extends AbstractC0269h implements sre0 {
    private static final SectionError DEFAULT_INSTANCE;
    public static final int ERROR_PROMPT_FIELD_NUMBER = 3;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private int errorType_;
    private String reason_ = "";
    private String errorPrompt_ = "";

    static {
        SectionError sectionError = new SectionError();
        DEFAULT_INSTANCE = sectionError;
        AbstractC0269h.registerDefaultInstance(SectionError.class, sectionError);
    }

    private SectionError() {
    }

    /* JADX INFO: renamed from: n */
    public static SectionError m19924n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ለ\u0000", new Object[]{"bitField0_", "errorType_", "reason_", "errorPrompt_"});
        }
        if (iOrdinal == 3) {
            return new SectionError();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 22);
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
        synchronized (SectionError.class) {
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
    public final String m19925o() {
        return this.errorPrompt_;
    }

    /* JADX INFO: renamed from: p */
    public final z6z0 m19926p() {
        z6z0 z6z0Var;
        int i = this.errorType_;
        if (i == 0) {
            z6z0Var = z6z0.UNDEFINED;
        } else if (i != 1) {
            z6z0Var = i != 2 ? null : z6z0.GENERATION_ERROR;
        } else {
            z6z0Var = z6z0.VALIDATION_ERROR;
        }
        return z6z0Var == null ? z6z0.UNRECOGNIZED : z6z0Var;
    }

    /* JADX INFO: renamed from: q */
    public final String m19927q() {
        return this.reason_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
