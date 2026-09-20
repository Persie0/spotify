package com.spotify.playlistmixing.extensions.mixthreebandwaveforms.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ThreeBandWaveforms extends AbstractC0269h implements sre0 {
    private static final ThreeBandWaveforms DEFAULT_INSTANCE;
    public static final int HIGHS_FIELD_NUMBER = 5;
    public static final int LOWS_FIELD_NUMBER = 3;
    public static final int MIDS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 1;
    public static final int SAMPLE_WINDOW_SIZE_MS_FIELD_NUMBER = 2;
    private int sampleRate_;
    private int sampleWindowSizeMs_;
    private int lowsMemoizedSerializedSize = -1;
    private int midsMemoizedSerializedSize = -1;
    private int highsMemoizedSerializedSize = -1;
    private ud50 lows_ = AbstractC0269h.emptyIntList();
    private ud50 mids_ = AbstractC0269h.emptyIntList();
    private ud50 highs_ = AbstractC0269h.emptyIntList();

    static {
        ThreeBandWaveforms threeBandWaveforms = new ThreeBandWaveforms();
        DEFAULT_INSTANCE = threeBandWaveforms;
        AbstractC0269h.registerDefaultInstance(ThreeBandWaveforms.class, threeBandWaveforms);
    }

    private ThreeBandWaveforms() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static ThreeBandWaveforms m19356s(byte[] bArr) {
        return (ThreeBandWaveforms) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0004\u0002\u0004\u0003'\u0004'\u0005'", new Object[]{"sampleRate_", "sampleWindowSizeMs_", "lows_", "mids_", "highs_"});
        }
        if (iOrdinal == 3) {
            return new ThreeBandWaveforms();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 21);
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
        synchronized (ThreeBandWaveforms.class) {
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

    /* JADX INFO: renamed from: n */
    public final ud50 m19357n() {
        return this.highs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ud50 m19358o() {
        return this.lows_;
    }

    /* JADX INFO: renamed from: p */
    public final ud50 m19359p() {
        return this.mids_;
    }

    /* JADX INFO: renamed from: q */
    public final int m19360q() {
        return this.sampleRate_;
    }

    /* JADX INFO: renamed from: r */
    public final int m19361r() {
        return this.sampleWindowSizeMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
