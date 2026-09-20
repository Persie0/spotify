package com.spotify.carapplibrary.app.instrumentation.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g7b;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CalImageLoadingError extends AbstractC0269h implements sre0 {
    private static final CalImageLoadingError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
    public static final int EXTRAS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private String type_ = "";
    private String uri_ = "";
    private String errorMessage_ = "";
    private String extras_ = "";

    static {
        CalImageLoadingError calImageLoadingError = new CalImageLoadingError();
        DEFAULT_INSTANCE = calImageLoadingError;
        AbstractC0269h.registerDefaultInstance(CalImageLoadingError.class, calImageLoadingError);
    }

    private CalImageLoadingError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5536n(CalImageLoadingError calImageLoadingError, String str) {
        calImageLoadingError.getClass();
        str.getClass();
        calImageLoadingError.bitField0_ |= 4;
        calImageLoadingError.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m5537o(CalImageLoadingError calImageLoadingError, String str) {
        calImageLoadingError.getClass();
        str.getClass();
        calImageLoadingError.bitField0_ |= 2;
        calImageLoadingError.uri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static g7b m5538p() {
        return (g7b) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "type_", "uri_", "errorMessage_", "extras_"});
        }
        if (iOrdinal == 3) {
            return new CalImageLoadingError();
        }
        if (iOrdinal == 4) {
            return new g7b(DEFAULT_INSTANCE);
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
        synchronized (CalImageLoadingError.class) {
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
