package com.spotify.microsoftcontinuity.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rdf0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class MicrosoftContinuityError extends AbstractC0269h implements sre0 {
    private static final MicrosoftContinuityError DEFAULT_INSTANCE;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String errorType_ = "";
    private String errorDescription_ = "";

    static {
        MicrosoftContinuityError microsoftContinuityError = new MicrosoftContinuityError();
        DEFAULT_INSTANCE = microsoftContinuityError;
        AbstractC0269h.registerDefaultInstance(MicrosoftContinuityError.class, microsoftContinuityError);
    }

    private MicrosoftContinuityError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15456n(MicrosoftContinuityError microsoftContinuityError, String str) {
        microsoftContinuityError.getClass();
        microsoftContinuityError.bitField0_ |= 2;
        microsoftContinuityError.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m15457o(MicrosoftContinuityError microsoftContinuityError, String str) {
        microsoftContinuityError.getClass();
        microsoftContinuityError.bitField0_ |= 1;
        microsoftContinuityError.errorType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static rdf0 m15458p() {
        return (rdf0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "errorType_", "errorDescription_"});
        }
        if (iOrdinal == 3) {
            return new MicrosoftContinuityError();
        }
        if (iOrdinal == 4) {
            return new rdf0(DEFAULT_INSTANCE);
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
        synchronized (MicrosoftContinuityError.class) {
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
