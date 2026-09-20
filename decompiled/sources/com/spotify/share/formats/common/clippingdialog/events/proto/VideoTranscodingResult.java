package com.spotify.share.formats.common.clippingdialog.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ncc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoTranscodingResult extends AbstractC0269h implements sre0 {
    private static final VideoTranscodingResult DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ERROR_REASON_FIELD_NUMBER = 6;
    public static final int IS_SUCCESS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PROCESSING_TIME_MS_FIELD_NUMBER = 3;
    public static final int PROGRESS_FIELD_NUMBER = 4;
    public static final int TRANSCODING_ID_FIELD_NUMBER = 7;
    public static final int VIDEO_DURATION_MS_FIELD_NUMBER = 8;
    public static final int VIDEO_URI_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isSuccess_;
    private int processingTimeMs_;
    private int progress_;
    private int videoDurationMs_;
    private String entityUri_ = "";
    private String videoUri_ = "";
    private String errorReason_ = "";
    private String transcodingId_ = "";

    static {
        VideoTranscodingResult videoTranscodingResult = new VideoTranscodingResult();
        DEFAULT_INSTANCE = videoTranscodingResult;
        AbstractC0269h.registerDefaultInstance(VideoTranscodingResult.class, videoTranscodingResult);
    }

    private VideoTranscodingResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21001n(VideoTranscodingResult videoTranscodingResult, String str) {
        videoTranscodingResult.getClass();
        str.getClass();
        videoTranscodingResult.bitField0_ |= 1;
        videoTranscodingResult.entityUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21002o(VideoTranscodingResult videoTranscodingResult, String str) {
        videoTranscodingResult.getClass();
        str.getClass();
        videoTranscodingResult.bitField0_ |= 32;
        videoTranscodingResult.errorReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21003p(VideoTranscodingResult videoTranscodingResult, boolean z) {
        videoTranscodingResult.bitField0_ |= 16;
        videoTranscodingResult.isSuccess_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21004q(VideoTranscodingResult videoTranscodingResult, int i) {
        videoTranscodingResult.bitField0_ |= 4;
        videoTranscodingResult.processingTimeMs_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static void m21005r(VideoTranscodingResult videoTranscodingResult, int i) {
        videoTranscodingResult.bitField0_ |= 8;
        videoTranscodingResult.progress_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m21006s(VideoTranscodingResult videoTranscodingResult, String str) {
        videoTranscodingResult.getClass();
        str.getClass();
        videoTranscodingResult.bitField0_ |= 64;
        videoTranscodingResult.transcodingId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m21007t(VideoTranscodingResult videoTranscodingResult, int i) {
        videoTranscodingResult.bitField0_ |= 128;
        videoTranscodingResult.videoDurationMs_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m21008u(VideoTranscodingResult videoTranscodingResult, String str) {
        videoTranscodingResult.getClass();
        videoTranscodingResult.bitField0_ |= 2;
        videoTranscodingResult.videoUri_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static ncc1 m21009v() {
        return (ncc1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007", new Object[]{"bitField0_", "entityUri_", "videoUri_", "processingTimeMs_", "progress_", "isSuccess_", "errorReason_", "transcodingId_", "videoDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new VideoTranscodingResult();
        }
        if (iOrdinal == 4) {
            return new ncc1(DEFAULT_INSTANCE);
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
        synchronized (VideoTranscodingResult.class) {
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
