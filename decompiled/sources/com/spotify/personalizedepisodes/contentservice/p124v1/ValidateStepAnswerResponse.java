package com.spotify.personalizedepisodes.contentservice.p124v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ValidateStepAnswerResponse extends AbstractC0269h implements sre0 {
    public static final int ACCEPTED_FIELD_NUMBER = 1;
    private static final ValidateStepAnswerResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REJECTION_REASON_FIELD_NUMBER = 2;
    private boolean accepted_;
    private int bitField0_;
    private String rejectionReason_ = "";

    static {
        ValidateStepAnswerResponse validateStepAnswerResponse = new ValidateStepAnswerResponse();
        DEFAULT_INSTANCE = validateStepAnswerResponse;
        AbstractC0269h.registerDefaultInstance(ValidateStepAnswerResponse.class, validateStepAnswerResponse);
    }

    private ValidateStepAnswerResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ለ\u0000", new Object[]{"bitField0_", "accepted_", "rejectionReason_"});
        }
        if (iOrdinal == 3) {
            return new ValidateStepAnswerResponse();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 2);
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
        synchronized (ValidateStepAnswerResponse.class) {
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
    public final boolean m17545n() {
        return this.accepted_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m17546o() {
        return this.rejectionReason_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m17547p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
