package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Verification extends AbstractC0269h implements sre0 {
    public static final int AI_PERSONA_FIELD_NUMBER = 3;
    private static final Verification DEFAULT_INSTANCE;
    public static final int IS_REGISTERED_FIELD_NUMBER = 1;
    public static final int IS_VERIFIED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private AiPersona aiPersona_;
    private int bitField0_;
    private boolean isRegistered_;
    private boolean isVerified_;

    static {
        Verification verification = new Verification();
        DEFAULT_INSTANCE = verification;
        AbstractC0269h.registerDefaultInstance(Verification.class, verification);
    }

    private Verification() {
    }

    /* JADX INFO: renamed from: p */
    public static Verification m7949p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000", new Object[]{"bitField0_", "isRegistered_", "isVerified_", "aiPersona_"});
        }
        if (iOrdinal == 3) {
            return new Verification();
        }
        if (iOrdinal == 4) {
            return new h2b1(15);
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
        synchronized (Verification.class) {
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
    public final AiPersona m7950o() {
        AiPersona aiPersona = this.aiPersona_;
        return aiPersona == null ? AiPersona.m7754p() : aiPersona;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7951q() {
        return this.isRegistered_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7952r() {
        return this.isVerified_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7953s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
