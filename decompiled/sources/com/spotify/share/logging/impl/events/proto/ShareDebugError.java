package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.so01;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareDebugError extends AbstractC0269h implements sre0 {
    public static final int COMPRESSED_ERROR_DATA_FIELD_NUMBER = 5;
    private static final ShareDebugError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ERROR_STACKTRACE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 1;
    private int bitField0_;
    private int errorCode_;
    private String tag_ = "";
    private String errorDescription_ = "";
    private String errorStacktrace_ = "";
    private ae50 compressedErrorData_ = AbstractC0269h.emptyProtobufList();

    static {
        ShareDebugError shareDebugError = new ShareDebugError();
        DEFAULT_INSTANCE = shareDebugError;
        AbstractC0269h.registerDefaultInstance(ShareDebugError.class, shareDebugError);
    }

    private ShareDebugError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21091n(ShareDebugError shareDebugError, int i) {
        shareDebugError.bitField0_ |= 8;
        shareDebugError.errorCode_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m21092o(ShareDebugError shareDebugError, String str) {
        shareDebugError.getClass();
        str.getClass();
        shareDebugError.bitField0_ |= 2;
        shareDebugError.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21093p(ShareDebugError shareDebugError, String str) {
        shareDebugError.getClass();
        str.getClass();
        shareDebugError.bitField0_ |= 1;
        shareDebugError.tag_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static so01 m21094q() {
        return (so01) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005\u001c", new Object[]{"bitField0_", "tag_", "errorDescription_", "errorStacktrace_", "errorCode_", "compressedErrorData_"});
        }
        if (iOrdinal == 3) {
            return new ShareDebugError();
        }
        if (iOrdinal == 4) {
            return new so01(DEFAULT_INSTANCE);
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
        synchronized (ShareDebugError.class) {
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
