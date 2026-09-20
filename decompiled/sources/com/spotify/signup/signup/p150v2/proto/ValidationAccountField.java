package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.duy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2b1;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ValidationAccountField extends AbstractC0269h implements sre0 {
    private static final ValidationAccountField DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int field_;
    private String value_ = "";

    static {
        ValidationAccountField validationAccountField = new ValidationAccountField();
        DEFAULT_INSTANCE = validationAccountField;
        AbstractC0269h.registerDefaultInstance(ValidationAccountField.class, validationAccountField);
    }

    private ValidationAccountField() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21415n(ValidationAccountField validationAccountField, duy duyVar) {
        validationAccountField.getClass();
        validationAccountField.field_ = duyVar.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m21416o(ValidationAccountField validationAccountField, String str) {
        validationAccountField.getClass();
        str.getClass();
        validationAccountField.value_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static r2b1 m21417p() {
        return (r2b1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"field_", "value_"});
        }
        if (iOrdinal == 3) {
            return new ValidationAccountField();
        }
        if (iOrdinal == 4) {
            return new r2b1(DEFAULT_INSTANCE);
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
        synchronized (ValidationAccountField.class) {
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
