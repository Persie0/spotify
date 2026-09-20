package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ts10;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GraduationIdentifier extends AbstractC0269h implements sre0 {
    private static final GraduationIdentifier DEFAULT_INSTANCE;
    public static final int EMAIL_AND_PASSWORD_IDENTIFIER_FIELD_NUMBER = 101;
    public static final int GRADUATION_TOKEN_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private Object identifier_;
    private int identifierCase_ = 0;
    private String graduationToken_ = "";

    static {
        GraduationIdentifier graduationIdentifier = new GraduationIdentifier();
        DEFAULT_INSTANCE = graduationIdentifier;
        AbstractC0269h.registerDefaultInstance(GraduationIdentifier.class, graduationIdentifier);
    }

    private GraduationIdentifier() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21386n(GraduationIdentifier graduationIdentifier, EmailAndPasswordIdentifier emailAndPasswordIdentifier) {
        graduationIdentifier.getClass();
        emailAndPasswordIdentifier.getClass();
        graduationIdentifier.identifier_ = emailAndPasswordIdentifier;
        graduationIdentifier.identifierCase_ = 101;
    }

    /* JADX INFO: renamed from: o */
    public static void m21387o(GraduationIdentifier graduationIdentifier, String str) {
        graduationIdentifier.getClass();
        str.getClass();
        graduationIdentifier.graduationToken_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static ts10 m21388p() {
        return (ts10) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001e\u0002\u0000\u0000\u0000\u0001Ȉe<\u0000", new Object[]{"identifier_", "identifierCase_", "graduationToken_", EmailAndPasswordIdentifier.class});
        }
        if (iOrdinal == 3) {
            return new GraduationIdentifier();
        }
        if (iOrdinal == 4) {
            return new ts10(DEFAULT_INSTANCE);
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
        synchronized (GraduationIdentifier.class) {
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
