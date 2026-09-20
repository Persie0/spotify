package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Empty;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Error extends AbstractC0269h implements sre0 {
    public static final int ALREADY_EXISTS_FIELD_NUMBER = 103;
    public static final int BODY_FIELD_NUMBER = 3;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Error DEFAULT_INSTANCE;
    public static final int INVALID_ARGUMENT_FIELD_NUMBER = 102;
    public static final int INVALID_COUNTRY_FIELD_NUMBER = 106;
    private static volatile r2n0 PARSER = null;
    public static final int PERMISSION_DENIED_FIELD_NUMBER = 105;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TOO_YOUNG_FIELD_NUMBER = 107;
    public static final int UNAVAILABLE_FIELD_NUMBER = 104;
    public static final int UNKNOWN_FIELD_NUMBER = 101;
    private int code_;
    private Object type_;
    private int typeCase_ = 0;
    private String title_ = "";
    private String body_ = "";

    static {
        Error error = new Error();
        DEFAULT_INSTANCE = error;
        AbstractC0269h.registerDefaultInstance(Error.class, error);
    }

    private Error() {
    }

    /* JADX INFO: renamed from: p */
    public static Error m21360p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001k\n\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000", new Object[]{"type_", "typeCase_", "code_", "title_", "body_", Empty.class, InvalidArgument.class, Empty.class, Empty.class, Empty.class, Empty.class, Empty.class});
        }
        if (iOrdinal == 3) {
            return new Error();
        }
        if (iOrdinal == 4) {
            return new dbw(DEFAULT_INSTANCE, 11);
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
        synchronized (Error.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m21361n() {
        return this.body_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m21362o() {
        return this.code_;
    }

    /* JADX INFO: renamed from: q */
    public final InvalidArgument m21363q() {
        return this.typeCase_ == 102 ? (InvalidArgument) this.type_ : InvalidArgument.m21395n();
    }

    /* JADX INFO: renamed from: r */
    public final int m21364r() {
        int i = this.typeCase_;
        if (i == 0) {
            return 8;
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
            case 105:
                return 5;
            case INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                return 6;
            case TOO_YOUNG_FIELD_NUMBER /* 107 */:
                return 7;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
