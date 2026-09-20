package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Empty;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ValidateAccountErrorResponse extends AbstractC0269h implements sre0 {
    public static final int ALREADY_EXISTS_FIELD_NUMBER = 103;
    private static final ValidateAccountErrorResponse DEFAULT_INSTANCE;
    public static final int INVALID_ARGUMENT_FIELD_NUMBER = 102;
    public static final int INVALID_COUNTRY_FIELD_NUMBER = 104;
    private static volatile r2n0 PARSER = null;
    public static final int UNKNOWN_FIELD_NUMBER = 101;
    private int typeCase_ = 0;
    private Object type_;

    static {
        ValidateAccountErrorResponse validateAccountErrorResponse = new ValidateAccountErrorResponse();
        DEFAULT_INSTANCE = validateAccountErrorResponse;
        AbstractC0269h.registerDefaultInstance(ValidateAccountErrorResponse.class, validateAccountErrorResponse);
    }

    private ValidateAccountErrorResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static ValidateAccountErrorResponse m21405n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000eh\u0004\u0000\u0000\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"type_", "typeCase_", Empty.class, InvalidArgument.class, Empty.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new ValidateAccountErrorResponse();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 28);
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
        synchronized (ValidateAccountErrorResponse.class) {
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
    public final InvalidArgument m21406o() {
        return this.typeCase_ == 102 ? (InvalidArgument) this.type_ : InvalidArgument.m21395n();
    }

    /* JADX INFO: renamed from: p */
    public final int m21407p() {
        int i = this.typeCase_;
        if (i == 0) {
            return 5;
        }
        switch (i) {
            case 101:
                return 1;
            case 102:
                return 2;
            case 103:
                return 3;
            case 104:
                return 4;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
