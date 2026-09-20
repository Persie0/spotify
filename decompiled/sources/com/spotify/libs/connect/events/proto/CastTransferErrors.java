package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wbc;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CastTransferErrors extends AbstractC0269h implements sre0 {
    private static final CastTransferErrors DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int ERROR_TYPE_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int ROUTE_ID_FIELD_NUMBER = 1;
    public static final int TRANSFER_STATE_REACHED_FIELD_NUMBER = 3;
    private int bitField0_;
    private String routeId_ = "";
    private String interactionId_ = "";
    private String transferStateReached_ = "";
    private String errorType_ = "";
    private String errorMessage_ = "";

    static {
        CastTransferErrors castTransferErrors = new CastTransferErrors();
        DEFAULT_INSTANCE = castTransferErrors;
        AbstractC0269h.registerDefaultInstance(CastTransferErrors.class, castTransferErrors);
    }

    private CastTransferErrors() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12672n(CastTransferErrors castTransferErrors, String str) {
        castTransferErrors.getClass();
        castTransferErrors.bitField0_ |= 16;
        castTransferErrors.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12673o(CastTransferErrors castTransferErrors, String str) {
        castTransferErrors.getClass();
        castTransferErrors.bitField0_ |= 8;
        castTransferErrors.errorType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12674p(CastTransferErrors castTransferErrors, String str) {
        castTransferErrors.getClass();
        castTransferErrors.bitField0_ |= 2;
        castTransferErrors.interactionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12675q(CastTransferErrors castTransferErrors, String str) {
        castTransferErrors.getClass();
        castTransferErrors.bitField0_ |= 1;
        castTransferErrors.routeId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12676r(CastTransferErrors castTransferErrors, String str) {
        castTransferErrors.getClass();
        castTransferErrors.bitField0_ |= 4;
        castTransferErrors.transferStateReached_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static wbc m12677s() {
        return (wbc) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "routeId_", "interactionId_", "transferStateReached_", "errorType_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new CastTransferErrors();
        }
        if (iOrdinal == 4) {
            return new wbc(DEFAULT_INSTANCE);
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
        synchronized (CastTransferErrors.class) {
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
