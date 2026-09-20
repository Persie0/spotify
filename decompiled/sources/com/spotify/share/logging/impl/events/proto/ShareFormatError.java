package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tr01;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareFormatError extends AbstractC0269h implements sre0 {
    private static final ShareFormatError DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ERROR_STACKTRACE_FIELD_NUMBER = 5;
    public static final int IS_OFFLINE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_FORMAT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int errorCode_;
    private boolean isOffline_;
    private String shareFormatId_ = "";
    private String entityUri_ = "";
    private String errorDescription_ = "";
    private String errorStacktrace_ = "";

    static {
        ShareFormatError shareFormatError = new ShareFormatError();
        DEFAULT_INSTANCE = shareFormatError;
        AbstractC0269h.registerDefaultInstance(ShareFormatError.class, shareFormatError);
    }

    private ShareFormatError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21108n(ShareFormatError shareFormatError, String str) {
        shareFormatError.getClass();
        str.getClass();
        shareFormatError.bitField0_ |= 2;
        shareFormatError.entityUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21109o(ShareFormatError shareFormatError, int i) {
        shareFormatError.bitField0_ |= 4;
        shareFormatError.errorCode_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m21110p(ShareFormatError shareFormatError, String str) {
        shareFormatError.getClass();
        str.getClass();
        shareFormatError.bitField0_ |= 8;
        shareFormatError.errorDescription_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21111q(ShareFormatError shareFormatError, String str) {
        shareFormatError.getClass();
        shareFormatError.bitField0_ |= 16;
        shareFormatError.errorStacktrace_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21112r(ShareFormatError shareFormatError, boolean z) {
        shareFormatError.bitField0_ |= 32;
        shareFormatError.isOffline_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m21113s(ShareFormatError shareFormatError, String str) {
        shareFormatError.getClass();
        str.getClass();
        shareFormatError.bitField0_ |= 1;
        shareFormatError.shareFormatId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static tr01 m21114t() {
        return (tr01) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "shareFormatId_", "entityUri_", "errorCode_", "errorDescription_", "errorStacktrace_", "isOffline_"});
        }
        if (iOrdinal == 3) {
            return new ShareFormatError();
        }
        if (iOrdinal == 4) {
            return new tr01(DEFAULT_INSTANCE);
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
        synchronized (ShareFormatError.class) {
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
