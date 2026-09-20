package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.er01;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareError extends AbstractC0269h implements sre0 {
    public static final int CAPABILITY_FIELD_NUMBER = 3;
    private static final ShareError DEFAULT_INSTANCE;
    public static final int DESTINATION_ID_FIELD_NUMBER = 2;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ERROR_CODE_FIELD_NUMBER = 7;
    public static final int ERROR_IS_RECOVERABLE_FIELD_NUMBER = 10;
    public static final int ERROR_LONG_DESCRIPTION_FIELD_NUMBER = 9;
    public static final int ERROR_SHORT_DESCRIPTION_FIELD_NUMBER = 8;
    public static final int INTEGRATION_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 12;
    public static final int IS_OFFLINE_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int SEVERITY_LEVEL_FIELD_NUMBER = 11;
    public static final int SOURCE_PAGE_FIELD_NUMBER = 6;
    public static final int SOURCE_PAGE_URI_FIELD_NUMBER = 5;
    private int bitField0_;
    private int errorCode_;
    private boolean errorIsRecoverable_;
    private boolean isOffline_;
    private int severityLevel_;
    private String entityUri_ = "";
    private String destinationId_ = "";
    private String capability_ = "";
    private String integration_ = "";
    private String sourcePageUri_ = "";
    private String sourcePage_ = "";
    private String errorShortDescription_ = "";
    private String errorLongDescription_ = "";
    private String interactionId_ = "";

    static {
        ShareError shareError = new ShareError();
        DEFAULT_INSTANCE = shareError;
        AbstractC0269h.registerDefaultInstance(ShareError.class, shareError);
    }

    private ShareError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21095n(ShareError shareError, String str) {
        shareError.getClass();
        shareError.bitField0_ |= 4;
        shareError.capability_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21096o(ShareError shareError, String str) {
        shareError.getClass();
        shareError.bitField0_ |= 2;
        shareError.destinationId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21097p(ShareError shareError, String str) {
        shareError.getClass();
        shareError.bitField0_ |= 1;
        shareError.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21098q(ShareError shareError, int i) {
        shareError.bitField0_ |= 64;
        shareError.errorCode_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m21099r(ShareError shareError, boolean z) {
        shareError.bitField0_ |= 512;
        shareError.errorIsRecoverable_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m21100s(ShareError shareError, String str) {
        shareError.getClass();
        shareError.bitField0_ |= 256;
        shareError.errorLongDescription_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m21101t(ShareError shareError, String str) {
        shareError.getClass();
        str.getClass();
        shareError.bitField0_ |= 128;
        shareError.errorShortDescription_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m21102u(ShareError shareError, String str) {
        shareError.getClass();
        shareError.bitField0_ |= 8;
        shareError.integration_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m21103v(ShareError shareError, boolean z) {
        shareError.bitField0_ |= 4096;
        shareError.isOffline_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static void m21104w(ShareError shareError, int i) {
        shareError.bitField0_ |= 1024;
        shareError.severityLevel_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m21105x(ShareError shareError, String str) {
        shareError.getClass();
        shareError.bitField0_ |= 32;
        shareError.sourcePage_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m21106y(ShareError shareError, String str) {
        shareError.getClass();
        shareError.bitField0_ |= 16;
        shareError.sourcePageUri_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static er01 m21107z() {
        return (er01) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bင\n\fဈ\u000b\rဇ\f", new Object[]{"bitField0_", "entityUri_", "destinationId_", "capability_", "integration_", "sourcePageUri_", "sourcePage_", "errorCode_", "errorShortDescription_", "errorLongDescription_", "errorIsRecoverable_", "severityLevel_", "interactionId_", "isOffline_"});
        }
        if (iOrdinal == 3) {
            return new ShareError();
        }
        if (iOrdinal == 4) {
            return new er01(DEFAULT_INSTANCE);
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
        synchronized (ShareError.class) {
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
