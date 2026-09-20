package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$DeviceSettings extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$DeviceSettings DEFAULT_INSTANCE;
    public static final int EQUALIZER_ENABLED_FIELD_NUMBER = 14;
    public static final int EQUALIZER_HIGH_MID_PEAK_GAIN_FIELD_NUMBER = 18;
    public static final int EQUALIZER_HIGH_PEAK_GAIN_FIELD_NUMBER = 19;
    public static final int EQUALIZER_HIGH_SHELF_GAIN_FIELD_NUMBER = 20;
    public static final int EQUALIZER_LOW_MID_PEAK_GAIN_FIELD_NUMBER = 17;
    public static final int EQUALIZER_LOW_PEAK_GAIN_FIELD_NUMBER = 16;
    public static final int EQUALIZER_LOW_SHELF_GAIN_FIELD_NUMBER = 15;
    public static final int MEDIA_MODE_FIELD_NUMBER = 7;
    public static final int NORMALIZE_FIELD_NUMBER = 12;
    public static final int NORMALIZE_LEVEL_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int STREAM_QUALITY_FIELD_NUMBER = 1;
    private int bitField0_;
    private DeviceCapabilities capabilities_;
    private boolean equalizerEnabled_;
    private float equalizerHighMidPeakGain_;
    private float equalizerHighPeakGain_;
    private float equalizerHighShelfGain_;
    private float equalizerLowMidPeakGain_;
    private float equalizerLowPeakGain_;
    private float equalizerLowShelfGain_;
    private int mediaMode_;
    private int normalizeLevel_;
    private boolean normalize_;
    private int streamQuality_;

    public static final class DeviceCapabilities extends AbstractC0269h implements sre0 {
        private static final DeviceCapabilities DEFAULT_INSTANCE;
        public static final int MAX_SUPPORTED_STREAM_QUALITY_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int maxSupportedStreamQuality_;

        static {
            DeviceCapabilities deviceCapabilities = new DeviceCapabilities();
            DEFAULT_INSTANCE = deviceCapabilities;
            AbstractC0269h.registerDefaultInstance(DeviceCapabilities.class, deviceCapabilities);
        }

        private DeviceCapabilities() {
        }

        /* JADX INFO: renamed from: n */
        public static DeviceCapabilities m17570n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"maxSupportedStreamQuality_"});
            }
            if (iOrdinal == 3) {
                return new DeviceCapabilities();
            }
            if (iOrdinal == 4) {
                return new C1159b(DEFAULT_INSTANCE);
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
            synchronized (DeviceCapabilities.class) {
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
        public final int m17571o() {
            return this.maxSupportedStreamQuality_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PlaybackSettingsEsperantoService$DeviceSettings playbackSettingsEsperantoService$DeviceSettings = new PlaybackSettingsEsperantoService$DeviceSettings();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$DeviceSettings;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$DeviceSettings.class, playbackSettingsEsperantoService$DeviceSettings);
    }

    private PlaybackSettingsEsperantoService$DeviceSettings() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaybackSettingsEsperantoService$DeviceSettings m17567o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\u0014\f\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0007\f\f\u0007\r\u0004\u000e\u0007\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001", new Object[]{"bitField0_", "streamQuality_", "capabilities_", "mediaMode_", "normalize_", "normalizeLevel_", "equalizerEnabled_", "equalizerLowShelfGain_", "equalizerLowPeakGain_", "equalizerLowMidPeakGain_", "equalizerHighMidPeakGain_", "equalizerHighPeakGain_", "equalizerHighShelfGain_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$DeviceSettings();
        }
        if (iOrdinal == 4) {
            return new C1158a(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$DeviceSettings.class) {
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
    public final DeviceCapabilities m17568n() {
        DeviceCapabilities deviceCapabilities = this.capabilities_;
        return deviceCapabilities == null ? DeviceCapabilities.m17570n() : deviceCapabilities;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m17569p() {
        return this.streamQuality_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
