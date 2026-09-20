package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.aa9;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class BetamaxPlaybackErrorDevice extends AbstractC0269h implements sre0 {
    public static final int BACKGROUNDED_FIELD_NUMBER = 13;
    public static final int BITRATE_FIELD_NUMBER = 16;
    public static final int BUFFERING_FIELD_NUMBER = 12;
    private static final BetamaxPlaybackErrorDevice DEFAULT_INSTANCE;
    public static final int DESKTOP_UI_FIELD_NUMBER = 9;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ERROR_DOMAIN_FIELD_NUMBER = 4;
    public static final int ERROR_EXTRA1_FIELD_NUMBER = 7;
    public static final int ERROR_EXTRA2_FIELD_NUMBER = 8;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MEDIA_URL_FIELD_NUMBER = 2;
    public static final int MS_POSITION_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 17;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 15;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int SURFACE_IDENTIFIER_FIELD_NUMBER = 10;
    public static final int VIDEO_DISABLED_FIELD_NUMBER = 14;
    private boolean backgrounded_;
    private int bitField0_;
    private int bitrate_;
    private boolean buffering_;
    private int errorCode_;
    private long msPosition_;
    private float playbackSpeed_;
    private boolean videoDisabled_;
    private String featureIdentifier_ = "";
    private String mediaUrl_ = "";
    private String sessionId_ = "";
    private String errorDomain_ = "";
    private String errorDescription_ = "";
    private String errorExtra1_ = "";
    private String errorExtra2_ = "";
    private String desktopUi_ = "";
    private String surfaceIdentifier_ = "";
    private gva playbackId_ = gva.f84678b;

    static {
        BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice = new BetamaxPlaybackErrorDevice();
        DEFAULT_INSTANCE = betamaxPlaybackErrorDevice;
        AbstractC0269h.registerDefaultInstance(BetamaxPlaybackErrorDevice.class, betamaxPlaybackErrorDevice);
    }

    private BetamaxPlaybackErrorDevice() {
    }

    /* JADX INFO: renamed from: A */
    public static void m13617A(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 4;
        betamaxPlaybackErrorDevice.sessionId_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m13618B(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, boolean z) {
        betamaxPlaybackErrorDevice.bitField0_ |= 8192;
        betamaxPlaybackErrorDevice.videoDisabled_ = z;
    }

    /* JADX INFO: renamed from: C */
    public static aa9 m13619C() {
        return (aa9) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m13620n(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, boolean z) {
        betamaxPlaybackErrorDevice.bitField0_ |= 4096;
        betamaxPlaybackErrorDevice.backgrounded_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m13621o(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, int i) {
        betamaxPlaybackErrorDevice.bitField0_ |= 32768;
        betamaxPlaybackErrorDevice.bitrate_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m13622p(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, boolean z) {
        betamaxPlaybackErrorDevice.bitField0_ |= 2048;
        betamaxPlaybackErrorDevice.buffering_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13623q(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, int i) {
        betamaxPlaybackErrorDevice.bitField0_ |= 16;
        betamaxPlaybackErrorDevice.errorCode_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m13624r(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 32;
        betamaxPlaybackErrorDevice.errorDescription_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13625s(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 8;
        betamaxPlaybackErrorDevice.errorDomain_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13626t(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 64;
        betamaxPlaybackErrorDevice.errorExtra1_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13627u(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 128;
        betamaxPlaybackErrorDevice.errorExtra2_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13628v(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 1;
        betamaxPlaybackErrorDevice.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m13629w(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, String str) {
        betamaxPlaybackErrorDevice.getClass();
        str.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 2;
        betamaxPlaybackErrorDevice.mediaUrl_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m13630x(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, long j) {
        betamaxPlaybackErrorDevice.bitField0_ |= 1024;
        betamaxPlaybackErrorDevice.msPosition_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m13631y(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, cva cvaVar) {
        betamaxPlaybackErrorDevice.getClass();
        betamaxPlaybackErrorDevice.bitField0_ |= 65536;
        betamaxPlaybackErrorDevice.playbackId_ = cvaVar;
    }

    /* JADX INFO: renamed from: z */
    public static void m13632z(BetamaxPlaybackErrorDevice betamaxPlaybackErrorDevice, float f) {
        betamaxPlaybackErrorDevice.bitField0_ |= 16384;
        betamaxPlaybackErrorDevice.playbackSpeed_ = f;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fခ\u000e\u0010င\u000f\u0011ည\u0010", new Object[]{"bitField0_", "featureIdentifier_", "mediaUrl_", "sessionId_", "errorDomain_", "errorCode_", "errorDescription_", "errorExtra1_", "errorExtra2_", "desktopUi_", "surfaceIdentifier_", "msPosition_", "buffering_", "backgrounded_", "videoDisabled_", "playbackSpeed_", "bitrate_", "playbackId_"});
        }
        if (iOrdinal == 3) {
            return new BetamaxPlaybackErrorDevice();
        }
        if (iOrdinal == 4) {
            return new aa9(DEFAULT_INSTANCE);
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
        synchronized (BetamaxPlaybackErrorDevice.class) {
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
