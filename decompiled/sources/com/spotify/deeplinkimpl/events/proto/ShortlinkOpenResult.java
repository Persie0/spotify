package com.spotify.deeplinkimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zi11;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortlinkOpenResult extends AbstractC0269h implements sre0 {
    private static final ShortlinkOpenResult DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 6;
    public static final int ORIGINAL_LINK_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RESOLVED_URL_FIELD_NUMBER = 3;
    public static final int SHORTLINK_SESSION_ID_FIELD_NUMBER = 1;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private int errorCode_;
    private boolean success_;
    private String shortlinkSessionId_ = "";
    private String resolvedUrl_ = "";
    private String originalLink_ = "";
    private String errorMessage_ = "";

    static {
        ShortlinkOpenResult shortlinkOpenResult = new ShortlinkOpenResult();
        DEFAULT_INSTANCE = shortlinkOpenResult;
        AbstractC0269h.registerDefaultInstance(ShortlinkOpenResult.class, shortlinkOpenResult);
    }

    private ShortlinkOpenResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m9197n(ShortlinkOpenResult shortlinkOpenResult, int i) {
        shortlinkOpenResult.bitField0_ |= 16;
        shortlinkOpenResult.errorCode_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m9198o(ShortlinkOpenResult shortlinkOpenResult, String str) {
        shortlinkOpenResult.getClass();
        shortlinkOpenResult.bitField0_ |= 32;
        shortlinkOpenResult.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m9199p(ShortlinkOpenResult shortlinkOpenResult, String str) {
        shortlinkOpenResult.getClass();
        str.getClass();
        shortlinkOpenResult.bitField0_ |= 8;
        shortlinkOpenResult.originalLink_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m9200q(ShortlinkOpenResult shortlinkOpenResult, String str) {
        shortlinkOpenResult.getClass();
        shortlinkOpenResult.bitField0_ |= 4;
        shortlinkOpenResult.resolvedUrl_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m9201r(ShortlinkOpenResult shortlinkOpenResult, String str) {
        shortlinkOpenResult.getClass();
        shortlinkOpenResult.bitField0_ |= 1;
        shortlinkOpenResult.shortlinkSessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m9202s(ShortlinkOpenResult shortlinkOpenResult, boolean z) {
        shortlinkOpenResult.bitField0_ |= 2;
        shortlinkOpenResult.success_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static zi11 m9203t() {
        return (zi11) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "shortlinkSessionId_", "success_", "resolvedUrl_", "originalLink_", "errorCode_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new ShortlinkOpenResult();
        }
        if (iOrdinal == 4) {
            return new zi11(DEFAULT_INSTANCE);
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
        synchronized (ShortlinkOpenResult.class) {
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
