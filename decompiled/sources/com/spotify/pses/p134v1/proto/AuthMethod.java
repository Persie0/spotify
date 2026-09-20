package com.spotify.pses.p134v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.th7;
import p204p.vh7;
import p204p.wh7;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthMethod extends AbstractC0269h implements sre0 {
    public static final int AUTH_PROVIDER_FIELD_NUMBER = 1;
    private static final AuthMethod DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 3;
    private int authProvider_;
    private String name_ = "";
    private int state_;

    static {
        AuthMethod authMethod = new AuthMethod();
        DEFAULT_INSTANCE = authMethod;
        AbstractC0269h.registerDefaultInstance(AuthMethod.class, authMethod);
    }

    private AuthMethod() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19937n(AuthMethod authMethod, vh7 vh7Var) {
        authMethod.getClass();
        authMethod.authProvider_ = vh7Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m19938o(AuthMethod authMethod, wh7 wh7Var) {
        authMethod.getClass();
        authMethod.state_ = wh7Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static th7 m19940s() {
        return (th7) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f", new Object[]{"authProvider_", "name_", "state_"});
        }
        if (iOrdinal == 3) {
            return new AuthMethod();
        }
        if (iOrdinal == 4) {
            return new th7();
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
        synchronized (AuthMethod.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final vh7 m19941q() {
        vh7 vh7VarM85513a = vh7.m85513a(this.authProvider_);
        return vh7VarM85513a == null ? vh7.UNRECOGNIZED : vh7VarM85513a;
    }

    /* JADX INFO: renamed from: r */
    public final wh7 m19942r() {
        wh7 wh7VarM88115a = wh7.m88115a(this.state_);
        return wh7VarM88115a == null ? wh7.UNRECOGNIZED : wh7VarM88115a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
