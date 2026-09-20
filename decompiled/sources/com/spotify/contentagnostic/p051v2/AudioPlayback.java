package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioPlayback extends AbstractC0269h implements sre0 {
    private static final AudioPlayback DEFAULT_INSTANCE;
    public static final int HOSTED_FIELD_NUMBER = 2;
    public static final int OFFSETS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PASS_THROUGH_FIELD_NUMBER = 1;
    public static final int REPORTING_URI_FIELD_NUMBER = 3;
    private int bitField0_;
    private AudioHosted hosted_;
    private PlaybackOffsets offsets_;
    private AudioPassThrough passThrough_;
    private String reportingUri_ = "";

    static {
        AudioPlayback audioPlayback = new AudioPlayback();
        DEFAULT_INSTANCE = audioPlayback;
        AbstractC0269h.registerDefaultInstance(AudioPlayback.class, audioPlayback);
    }

    private AudioPlayback() {
    }

    /* JADX INFO: renamed from: n */
    public static AudioPlayback m7772n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"bitField0_", "passThrough_", "hosted_", "reportingUri_", "offsets_"});
        }
        if (iOrdinal == 3) {
            return new AudioPlayback();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 20);
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
        synchronized (AudioPlayback.class) {
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
    public final AudioHosted m7773o() {
        AudioHosted audioHosted = this.hosted_;
        return audioHosted == null ? AudioHosted.m7763o() : audioHosted;
    }

    /* JADX INFO: renamed from: p */
    public final PlaybackOffsets m7774p() {
        PlaybackOffsets playbackOffsets = this.offsets_;
        return playbackOffsets == null ? PlaybackOffsets.m7899n() : playbackOffsets;
    }

    /* JADX INFO: renamed from: q */
    public final AudioPassThrough m7775q() {
        AudioPassThrough audioPassThrough = this.passThrough_;
        return audioPassThrough == null ? AudioPassThrough.m7770n() : audioPassThrough;
    }

    /* JADX INFO: renamed from: r */
    public final String m7776r() {
        return this.reportingUri_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7777s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7778t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7779u() {
        return (this.bitField0_ & 1) != 0;
    }
}
