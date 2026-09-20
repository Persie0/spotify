package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.auo;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class DeeplinkOpenError extends AbstractC0269h implements sre0 {
    private static final DeeplinkOpenError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int ERROR_IS_WARNING_FIELD_NUMBER = 5;
    public static final int ERROR_REASON_FIELD_NUMBER = 3;
    public static final int LINK_DESCRIPTION_FIELD_NUMBER = 2;
    public static final int LINK_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHORTLINK_SESSION_ID_FIELD_NUMBER = 6;
    private int bitField0_;
    private int errorCode_;
    private boolean errorIsWarning_;
    private String link_ = "";
    private String linkDescription_ = "";
    private String errorReason_ = "";
    private String shortlinkSessionId_ = "";

    static {
        DeeplinkOpenError deeplinkOpenError = new DeeplinkOpenError();
        DEFAULT_INSTANCE = deeplinkOpenError;
        AbstractC0269h.registerDefaultInstance(DeeplinkOpenError.class, deeplinkOpenError);
    }

    private DeeplinkOpenError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9173n(DeeplinkOpenError deeplinkOpenError, int i) {
        deeplinkOpenError.bitField0_ |= 8;
        deeplinkOpenError.errorCode_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m9174o(DeeplinkOpenError deeplinkOpenError) {
        deeplinkOpenError.bitField0_ |= 16;
        deeplinkOpenError.errorIsWarning_ = false;
    }

    /* JADX INFO: renamed from: p */
    public static void m9175p(DeeplinkOpenError deeplinkOpenError, String str) {
        deeplinkOpenError.getClass();
        str.getClass();
        deeplinkOpenError.bitField0_ |= 4;
        deeplinkOpenError.errorReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9176q(DeeplinkOpenError deeplinkOpenError, String str) {
        deeplinkOpenError.getClass();
        str.getClass();
        deeplinkOpenError.bitField0_ |= 1;
        deeplinkOpenError.link_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9177r(DeeplinkOpenError deeplinkOpenError, String str) {
        deeplinkOpenError.getClass();
        deeplinkOpenError.bitField0_ |= 2;
        deeplinkOpenError.linkDescription_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static auo m9178s() {
        return (auo) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "link_", "linkDescription_", "errorReason_", "errorCode_", "errorIsWarning_", "shortlinkSessionId_"});
        }
        if (iOrdinal == 3) {
            return new DeeplinkOpenError();
        }
        if (iOrdinal == 4) {
            return new auo(DEFAULT_INSTANCE);
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
        synchronized (DeeplinkOpenError.class) {
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
