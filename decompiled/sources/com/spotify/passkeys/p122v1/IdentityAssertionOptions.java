package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.n140;
import p204p.o140;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class IdentityAssertionOptions extends AbstractC0269h implements sre0 {
    public static final int AUDIENCE_FIELD_NUMBER = 1;
    private static final IdentityAssertionOptions DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    private int audience_;
    private gva state_ = gva.f84678b;

    static {
        IdentityAssertionOptions identityAssertionOptions = new IdentityAssertionOptions();
        DEFAULT_INSTANCE = identityAssertionOptions;
        AbstractC0269h.registerDefaultInstance(IdentityAssertionOptions.class, identityAssertionOptions);
    }

    private IdentityAssertionOptions() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16662n(IdentityAssertionOptions identityAssertionOptions) {
        identityAssertionOptions.getClass();
        identityAssertionOptions.audience_ = n140.AUDIENCE_LOGIN5.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m16663o(IdentityAssertionOptions identityAssertionOptions, cva cvaVar) {
        identityAssertionOptions.getClass();
        identityAssertionOptions.state_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static o140 m16664p() {
        return (o140) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"audience_", "state_"});
        }
        if (iOrdinal == 3) {
            return new IdentityAssertionOptions();
        }
        if (iOrdinal == 4) {
            return new o140(DEFAULT_INSTANCE);
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
        synchronized (IdentityAssertionOptions.class) {
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
