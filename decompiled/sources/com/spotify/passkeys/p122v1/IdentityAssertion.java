package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class IdentityAssertion extends AbstractC0269h implements sre0 {
    private static final IdentityAssertion DEFAULT_INSTANCE;
    public static final int IDENTITY_ASSERTION_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private gva identityAssertion_ = gva.f84678b;

    static {
        IdentityAssertion identityAssertion = new IdentityAssertion();
        DEFAULT_INSTANCE = identityAssertion;
        AbstractC0269h.registerDefaultInstance(IdentityAssertion.class, identityAssertion);
    }

    private IdentityAssertion() {
    }

    /* JADX INFO: renamed from: n */
    public static IdentityAssertion m16660n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"identityAssertion_"});
        }
        if (iOrdinal == 3) {
            return new IdentityAssertion();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 21);
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
        synchronized (IdentityAssertion.class) {
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
    public final gva m16661o() {
        return this.identityAssertion_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
