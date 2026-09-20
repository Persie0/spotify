package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$UserSettings extends AbstractC0269h implements sre0 {
    public static final int AUDIO_LANGUAGE_FIELD_NUMBER = 22;
    public static final int CROSSFADE_DURATION_MS_FIELD_NUMBER = 11;
    public static final int CROSSFADE_FIELD_NUMBER = 10;
    private static final PlaybackSettingsEsperantoService$UserSettings DEFAULT_INSTANCE;
    public static final int DISABLE_SMART_SHUFFLE_FIELD_NUMBER = 6;
    public static final int GAPLESS_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 23;
    private int bitField0_;
    private int crossfadeDurationMs_;
    private boolean crossfade_;
    private boolean disableSmartShuffle_;
    private boolean gapless_;
    private String audioLanguage_ = "";
    private String subtitleLanguage_ = "";

    static {
        PlaybackSettingsEsperantoService$UserSettings playbackSettingsEsperantoService$UserSettings = new PlaybackSettingsEsperantoService$UserSettings();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$UserSettings;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$UserSettings.class, playbackSettingsEsperantoService$UserSettings);
    }

    private PlaybackSettingsEsperantoService$UserSettings() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PlaybackSettingsEsperantoService$UserSettings m17629q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0006\u0017\u0006\u0000\u0000\u0000\u0006ဇ\u0000\tဇ\u0001\nဇ\u0002\u000bင\u0003\u0016ለ\u0004\u0017ለ\u0005", new Object[]{"bitField0_", "disableSmartShuffle_", "gapless_", "crossfade_", "crossfadeDurationMs_", "audioLanguage_", "subtitleLanguage_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$UserSettings();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 13);
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
        synchronized (PlaybackSettingsEsperantoService$UserSettings.class) {
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
    public final String m17630n() {
        return this.audioLanguage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17631o() {
        return this.crossfade_;
    }

    /* JADX INFO: renamed from: p */
    public final int m17632p() {
        return this.crossfadeDurationMs_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17633r() {
        return this.disableSmartShuffle_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m17634s() {
        return this.gapless_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17635t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m17636u() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m17637v() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17638w() {
        return (this.bitField0_ & 2) != 0;
    }
}
