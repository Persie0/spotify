package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pof;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CompleteAccountCreationErrorResponse extends AbstractC0269h implements sre0 {
    private static final CompleteAccountCreationErrorResponse DEFAULT_INSTANCE;
    public static final int ERROR_DETAILS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Error errorDetails_;

    static {
        CompleteAccountCreationErrorResponse completeAccountCreationErrorResponse = new CompleteAccountCreationErrorResponse();
        DEFAULT_INSTANCE = completeAccountCreationErrorResponse;
        AbstractC0269h.registerDefaultInstance(CompleteAccountCreationErrorResponse.class, completeAccountCreationErrorResponse);
    }

    private CompleteAccountCreationErrorResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static CompleteAccountCreationErrorResponse m21320n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "errorDetails_"});
        }
        if (iOrdinal == 3) {
            return new CompleteAccountCreationErrorResponse();
        }
        if (iOrdinal == 4) {
            return new pof(DEFAULT_INSTANCE, 12);
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
        synchronized (CompleteAccountCreationErrorResponse.class) {
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
    public final Error m21321o() {
        Error error = this.errorDetails_;
        return error == null ? Error.m21360p() : error;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
