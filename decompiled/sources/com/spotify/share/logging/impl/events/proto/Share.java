package com.spotify.share.logging.impl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mi01;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Share extends AbstractC0269h implements sre0 {
    public static final int AUDIO_PREVIEW_FIELD_NUMBER = 11;
    public static final int CAPABILITY_FIELD_NUMBER = 8;
    public static final int CREATOR_URI_FIELD_NUMBER = 6;
    private static final Share DEFAULT_INSTANCE;
    public static final int DESTINATION_ID_FIELD_NUMBER = 2;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int FULL_URL_FIELD_NUMBER = 14;
    public static final int INTEGRATION_FIELD_NUMBER = 9;
    public static final int INTERACTION_ID_FIELD_NUMBER = 12;
    public static final int INTERNAL_SHARE_ID_FIELD_NUMBER = 15;
    public static final int IS_OFFLINE_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int PRESELECTED_SHAREFORMAT_ID_FIELD_NUMBER = 17;
    public static final int SHAREFORMAT_ID_FIELD_NUMBER = 13;
    public static final int SHARE_ID_FIELD_NUMBER = 3;
    public static final int SHARE_URL_FIELD_NUMBER = 10;
    public static final int SOURCE_PAGE_FIELD_NUMBER = 5;
    public static final int SOURCE_PAGE_URI_FIELD_NUMBER = 4;
    public static final int SYSTEM_DESTINATION_FIELD_NUMBER = 7;
    private boolean audioPreview_;
    private int bitField0_;
    private boolean isOffline_;
    private String entityUri_ = "";
    private String destinationId_ = "";
    private String shareId_ = "";
    private String sourcePageUri_ = "";
    private String sourcePage_ = "";
    private String creatorUri_ = "";
    private String systemDestination_ = "";
    private String capability_ = "";
    private String integration_ = "";
    private String shareUrl_ = "";
    private String interactionId_ = "";
    private String shareformatId_ = "";
    private String fullUrl_ = "";
    private String internalShareId_ = "";
    private String preselectedShareformatId_ = "";

    static {
        Share share = new Share();
        DEFAULT_INSTANCE = share;
        AbstractC0269h.registerDefaultInstance(Share.class, share);
    }

    private Share() {
    }

    /* JADX INFO: renamed from: A */
    public static void m21075A(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 8;
        share.sourcePageUri_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m21076B(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 64;
        share.systemDestination_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static mi01 m21077C() {
        return (mi01) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m21078n(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 128;
        share.capability_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21079o(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 2;
        share.destinationId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21080p(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 1;
        share.entityUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21081q(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 8192;
        share.fullUrl_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21082r(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 256;
        share.integration_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m21083s(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 2048;
        share.interactionId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m21084t(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 16384;
        share.internalShareId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m21085u(Share share, boolean z) {
        share.bitField0_ |= 32768;
        share.isOffline_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m21086v(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 65536;
        share.preselectedShareformatId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m21087w(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 4;
        share.shareId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m21088x(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 512;
        share.shareUrl_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m21089y(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 4096;
        share.shareformatId_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m21090z(Share share, String str) {
        share.getClass();
        str.getClass();
        share.bitField0_ |= 16;
        share.sourcePage_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဇ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e\u0010ဇ\u000f\u0011ဈ\u0010", new Object[]{"bitField0_", "entityUri_", "destinationId_", "shareId_", "sourcePageUri_", "sourcePage_", "creatorUri_", "systemDestination_", "capability_", "integration_", "shareUrl_", "audioPreview_", "interactionId_", "shareformatId_", "fullUrl_", "internalShareId_", "isOffline_", "preselectedShareformatId_"});
        }
        if (iOrdinal == 3) {
            return new Share();
        }
        if (iOrdinal == 4) {
            return new mi01(DEFAULT_INSTANCE);
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
        synchronized (Share.class) {
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
