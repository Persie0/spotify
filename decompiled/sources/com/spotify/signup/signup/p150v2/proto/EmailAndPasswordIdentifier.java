package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tyt;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class EmailAndPasswordIdentifier extends AbstractC0269h implements sre0 {
    private static final EmailAndPasswordIdentifier DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    private String email_ = "";
    private String password_ = "";

    static {
        EmailAndPasswordIdentifier emailAndPasswordIdentifier = new EmailAndPasswordIdentifier();
        DEFAULT_INSTANCE = emailAndPasswordIdentifier;
        AbstractC0269h.registerDefaultInstance(EmailAndPasswordIdentifier.class, emailAndPasswordIdentifier);
    }

    private EmailAndPasswordIdentifier() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21354n(EmailAndPasswordIdentifier emailAndPasswordIdentifier, String str) {
        emailAndPasswordIdentifier.getClass();
        str.getClass();
        emailAndPasswordIdentifier.email_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21355o(EmailAndPasswordIdentifier emailAndPasswordIdentifier, String str) {
        emailAndPasswordIdentifier.getClass();
        str.getClass();
        emailAndPasswordIdentifier.password_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static EmailAndPasswordIdentifier m21356p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static tyt m21357q() {
        return (tyt) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"email_", "password_"});
        }
        if (iOrdinal == 3) {
            return new EmailAndPasswordIdentifier();
        }
        if (iOrdinal == 4) {
            return new tyt(DEFAULT_INSTANCE);
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
        synchronized (EmailAndPasswordIdentifier.class) {
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
