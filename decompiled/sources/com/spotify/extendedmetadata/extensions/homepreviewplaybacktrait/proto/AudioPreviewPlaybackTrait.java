package com.spotify.extendedmetadata.extensions.homepreviewplaybacktrait.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u4x0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioPreviewPlaybackTrait extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FILE_URL_FIELD_NUMBER = 1;
    private static final AudioPreviewPlaybackTrait DEFAULT_INSTANCE;
    public static final int DURATION_FROM_ORIGINAL_FIELD_NUMBER = 10;
    public static final int OFFSETS_FROM_ORIGINAL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_DURATION_FIELD_NUMBER = 7;
    public static final int PREVIEW_RESTRICTION_FIELD_NUMBER = 9;
    public static final int PREVIEW_STREAM_REPORTING_URI_FIELD_NUMBER = 8;
    public static final int TRANSCRIPT_URL_FIELD_NUMBER = 2;
    public static final int VIDEO_FILE_ID_FIELD_NUMBER = 4;
    public static final int VIDEO_PLACEHOLDER_IMAGE_URL_FIELD_NUMBER = 6;
    private int bitField0_;
    private Duration durationFromOriginal_;
    private Offsets offsetsFromOriginal_;
    private Duration previewDuration_;
    private int previewRestriction_;
    private String audioFileUrl_ = "";
    private String transcriptUrl_ = "";
    private String videoFileId_ = "";
    private String videoPlaceholderImageUrl_ = "";
    private String previewStreamReportingUri_ = "";

    static {
        AudioPreviewPlaybackTrait audioPreviewPlaybackTrait = new AudioPreviewPlaybackTrait();
        DEFAULT_INSTANCE = audioPreviewPlaybackTrait;
        AbstractC0269h.registerDefaultInstance(AudioPreviewPlaybackTrait.class, audioPreviewPlaybackTrait);
    }

    private AudioPreviewPlaybackTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: x */
    public static AudioPreviewPlaybackTrait m10158x(byte[] bArr) {
        return (AudioPreviewPlaybackTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006Ȉ\u0007ဉ\u0001\bȈ\t\f\nဉ\u0002", new Object[]{"bitField0_", "audioFileUrl_", "transcriptUrl_", "videoFileId_", "offsetsFromOriginal_", "videoPlaceholderImageUrl_", "previewDuration_", "previewStreamReportingUri_", "previewRestriction_", "durationFromOriginal_"});
        }
        if (iOrdinal == 3) {
            return new AudioPreviewPlaybackTrait();
        }
        if (iOrdinal == 4) {
            return new hr6(22);
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
        synchronized (AudioPreviewPlaybackTrait.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m10159o() {
        return this.audioFileUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final Duration m10160p() {
        Duration duration = this.durationFromOriginal_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: q */
    public final Offsets m10161q() {
        Offsets offsets = this.offsetsFromOriginal_;
        return offsets == null ? Offsets.m10169o() : offsets;
    }

    /* JADX INFO: renamed from: r */
    public final Duration m10162r() {
        Duration duration = this.previewDuration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: s */
    public final u4x0 m10163s() {
        u4x0 u4x0VarM82368a = u4x0.m82368a(this.previewRestriction_);
        return u4x0VarM82368a == null ? u4x0.UNRECOGNIZED : u4x0VarM82368a;
    }

    /* JADX INFO: renamed from: t */
    public final String m10164t() {
        return this.previewStreamReportingUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m10165u() {
        return this.transcriptUrl_;
    }

    /* JADX INFO: renamed from: v */
    public final String m10166v() {
        return this.videoFileId_;
    }

    /* JADX INFO: renamed from: w */
    public final String m10167w() {
        return this.videoPlaceholderImageUrl_;
    }
}
