package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.d6t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PubKeyCredParam extends AbstractC0269h implements sre0 {
    public static final int ALG_FIELD_NUMBER = 2;
    private static final PubKeyCredParam DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int alg_;
    private int type_;

    static {
        PubKeyCredParam pubKeyCredParam = new PubKeyCredParam();
        DEFAULT_INSTANCE = pubKeyCredParam;
        AbstractC0269h.registerDefaultInstance(PubKeyCredParam.class, pubKeyCredParam);
    }

    private PubKeyCredParam() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"type_", "alg_"});
        }
        if (iOrdinal == 3) {
            return new PubKeyCredParam();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 0);
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
        synchronized (PubKeyCredParam.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m16668n() {
        return this.alg_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final d6t0 m16669o() {
        d6t0 d6t0Var;
        int i = this.type_;
        if (i != 0) {
            d6t0Var = i != 1 ? null : d6t0.PUBLIC_KEY_CREDENTIAL_TYPE_PUBLIC_KEY;
        } else {
            d6t0Var = d6t0.PUBLIC_KEY_CREDENTIAL_TYPE_UNSPECIFIED;
        }
        return d6t0Var == null ? d6t0.UNRECOGNIZED : d6t0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
