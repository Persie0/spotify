package com.spotify.stream_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.f4p0;
import p204p.jac1;
import p204p.ni51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamProgressRequestOuterClass$StreamProgressRequest extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FORMAT_FIELD_NUMBER = 12;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int CONTENT_IS_DOWNLOADED_FIELD_NUMBER = 11;
    public static final int CONTENT_URI_FIELD_NUMBER = 13;
    public static final int CURRENT_POSITION_FIELD_NUMBER = 2;
    private static final StreamProgressRequestOuterClass$StreamProgressRequest DEFAULT_INSTANCE;
    public static final int IS_AUDIO_ON_FIELD_NUMBER = 16;
    public static final int IS_BACKGROUND_FIELD_NUMBER = 6;
    public static final int IS_EXTERNAL_FIELD_NUMBER = 8;
    public static final int IS_FULLSCREEN_FIELD_NUMBER = 7;
    public static final int IS_OVERLAPPING_FIELD_NUMBER = 5;
    public static final int IS_PAUSED_FIELD_NUMBER = 3;
    public static final int IS_PLAYING_VIDEO_FIELD_NUMBER = 4;
    public static final int MEDIA_ID_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 9;
    public static final int PLAYBACK_STATE_FIELD_NUMBER = 15;
    public static final int STREAM_HANDLE_FIELD_NUMBER = 1;
    public static final int VIDEO_SURFACE_V2_FIELD_NUMBER = 18;
    private int audioFormat_;
    private int bitField0_;
    private Timestamp clientTimestamp_;
    private boolean contentIsDownloaded_;
    private long currentPosition_;
    private boolean isAudioOn_;
    private boolean isBackground_;
    private boolean isExternal_;
    private boolean isFullscreen_;
    private boolean isOverlapping_;
    private boolean isPaused_;
    private boolean isPlayingVideo_;
    private double playbackSpeed_;
    private int playbackState_;
    private StreamHandleOuterClass$StreamHandle streamHandle_;
    private int videoSurfaceV2_;
    private String mediaId_ = "";
    private String contentUri_ = "";

    static {
        StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest = new StreamProgressRequestOuterClass$StreamProgressRequest();
        DEFAULT_INSTANCE = streamProgressRequestOuterClass$StreamProgressRequest;
        AbstractC0269h.registerDefaultInstance(StreamProgressRequestOuterClass$StreamProgressRequest.class, streamProgressRequestOuterClass$StreamProgressRequest);
    }

    private StreamProgressRequestOuterClass$StreamProgressRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21638n(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, Timestamp timestamp) {
        streamProgressRequestOuterClass$StreamProgressRequest.getClass();
        streamProgressRequestOuterClass$StreamProgressRequest.clientTimestamp_ = timestamp;
        streamProgressRequestOuterClass$StreamProgressRequest.bitField0_ |= 64;
    }

    /* JADX INFO: renamed from: o */
    public static void m21639o(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, long j) {
        streamProgressRequestOuterClass$StreamProgressRequest.currentPosition_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m21640p(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, boolean z) {
        streamProgressRequestOuterClass$StreamProgressRequest.bitField0_ |= 128;
        streamProgressRequestOuterClass$StreamProgressRequest.isAudioOn_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21641q(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, boolean z) {
        streamProgressRequestOuterClass$StreamProgressRequest.bitField0_ |= 2;
        streamProgressRequestOuterClass$StreamProgressRequest.isBackground_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m21642r(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, boolean z) {
        streamProgressRequestOuterClass$StreamProgressRequest.isFullscreen_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static void m21643s(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, boolean z) {
        streamProgressRequestOuterClass$StreamProgressRequest.isPaused_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m21644t(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, boolean z) {
        streamProgressRequestOuterClass$StreamProgressRequest.isPlayingVideo_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m21645u(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, double d) {
        streamProgressRequestOuterClass$StreamProgressRequest.playbackSpeed_ = d;
    }

    /* JADX INFO: renamed from: v */
    public static void m21646v(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, f4p0 f4p0Var) {
        streamProgressRequestOuterClass$StreamProgressRequest.getClass();
        streamProgressRequestOuterClass$StreamProgressRequest.playbackState_ = f4p0Var.getNumber();
    }

    /* JADX INFO: renamed from: w */
    public static void m21647w(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle) {
        streamProgressRequestOuterClass$StreamProgressRequest.getClass();
        streamHandleOuterClass$StreamHandle.getClass();
        streamProgressRequestOuterClass$StreamProgressRequest.streamHandle_ = streamHandleOuterClass$StreamHandle;
        streamProgressRequestOuterClass$StreamProgressRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: x */
    public static void m21648x(StreamProgressRequestOuterClass$StreamProgressRequest streamProgressRequestOuterClass$StreamProgressRequest, jac1 jac1Var) {
        streamProgressRequestOuterClass$StreamProgressRequest.getClass();
        streamProgressRequestOuterClass$StreamProgressRequest.videoSurfaceV2_ = jac1Var.getNumber();
        streamProgressRequestOuterClass$StreamProgressRequest.bitField0_ |= 256;
    }

    /* JADX INFO: renamed from: y */
    public static ni51 m21649y() {
        return (ni51) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003\u0007\u0004\u0007\u0005\u0007\u0006ဇ\u0001\u0007\u0007\b\u0007\t\u0000\nለ\u0002\u000bဇ\u0003\fဌ\u0004\rለ\u0005\u000eဉ\u0006\u000f\f\u0010ဇ\u0007\u0012ဌ\b", new Object[]{"bitField0_", "streamHandle_", "currentPosition_", "isPaused_", "isPlayingVideo_", "isOverlapping_", "isBackground_", "isFullscreen_", "isExternal_", "playbackSpeed_", "mediaId_", "contentIsDownloaded_", "audioFormat_", "contentUri_", "clientTimestamp_", "playbackState_", "isAudioOn_", "videoSurfaceV2_"});
        }
        if (iOrdinal == 3) {
            return new StreamProgressRequestOuterClass$StreamProgressRequest();
        }
        if (iOrdinal == 4) {
            return new ni51(DEFAULT_INSTANCE);
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
        synchronized (StreamProgressRequestOuterClass$StreamProgressRequest.class) {
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
