package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoPlayback extends AbstractC0269h implements sre0 {
    private static final VideoPlayback DEFAULT_INSTANCE;
    public static final int HOSTED_FIELD_NUMBER = 1;
    public static final int OFFSETS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REPORTING_URI_FIELD_NUMBER = 2;
    private Object asset_;
    private int bitField0_;
    private PlaybackOffsets offsets_;
    private int assetCase_ = 0;
    private String reportingUri_ = "";

    static {
        VideoPlayback videoPlayback = new VideoPlayback();
        DEFAULT_INSTANCE = videoPlayback;
        AbstractC0269h.registerDefaultInstance(VideoPlayback.class, videoPlayback);
    }

    private VideoPlayback() {
    }

    /* JADX INFO: renamed from: n */
    public static VideoPlayback m7967n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002Ȉ\u0003ဉ\u0000", new Object[]{"asset_", "assetCase_", "bitField0_", VideoHosted.class, "reportingUri_", "offsets_"});
        }
        if (iOrdinal == 3) {
            return new VideoPlayback();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 22);
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
        synchronized (VideoPlayback.class) {
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
    public final VideoHosted m7968o() {
        return this.assetCase_ == 1 ? (VideoHosted) this.asset_ : VideoHosted.m7965n();
    }

    /* JADX INFO: renamed from: p */
    public final PlaybackOffsets m7969p() {
        PlaybackOffsets playbackOffsets = this.offsets_;
        return playbackOffsets == null ? PlaybackOffsets.m7899n() : playbackOffsets;
    }

    /* JADX INFO: renamed from: q */
    public final String m7970q() {
        return this.reportingUri_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m7971r() {
        return this.assetCase_ == 1;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7972s() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
