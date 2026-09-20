package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.hiq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PreloadStatusErrorNonAuth extends AbstractC0269h implements sre0 {
    private static final PreloadStatusErrorNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int ERROR_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String errorType_ = "";
    private String errorMessage_ = "";

    static {
        PreloadStatusErrorNonAuth preloadStatusErrorNonAuth = new PreloadStatusErrorNonAuth();
        DEFAULT_INSTANCE = preloadStatusErrorNonAuth;
        AbstractC0269h.registerDefaultInstance(PreloadStatusErrorNonAuth.class, preloadStatusErrorNonAuth);
    }

    private PreloadStatusErrorNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14343n(PreloadStatusErrorNonAuth preloadStatusErrorNonAuth, String str) {
        preloadStatusErrorNonAuth.getClass();
        str.getClass();
        preloadStatusErrorNonAuth.bitField0_ |= 2;
        preloadStatusErrorNonAuth.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14344o(PreloadStatusErrorNonAuth preloadStatusErrorNonAuth, String str) {
        preloadStatusErrorNonAuth.getClass();
        str.getClass();
        preloadStatusErrorNonAuth.bitField0_ |= 1;
        preloadStatusErrorNonAuth.errorType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static hiq0 m14345p() {
        return (hiq0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "errorType_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new PreloadStatusErrorNonAuth();
        }
        if (iOrdinal == 4) {
            return new hiq0(DEFAULT_INSTANCE);
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
        synchronized (PreloadStatusErrorNonAuth.class) {
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
