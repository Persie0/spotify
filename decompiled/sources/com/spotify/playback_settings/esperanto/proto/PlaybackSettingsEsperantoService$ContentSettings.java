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
public final class PlaybackSettingsEsperantoService$ContentSettings extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_ENHANCEMENT_FIELD_NUMBER = 5;
    private static final PlaybackSettingsEsperantoService$ContentSettings DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 3;
    public static final int SHUFFLE_FIELD_NUMBER = 4;
    public static final int SKIP_FINISHED_EPISODES_FIELD_NUMBER = 8;
    public static final int TRANSLATION_LANGUAGE_FIELD_NUMBER = 21;
    private int bitField0_;
    private int contextEnhancement_;
    private float playbackSpeed_;
    private boolean shuffle_;
    private boolean skipFinishedEpisodes_;
    private String translationLanguage_ = "";

    static {
        PlaybackSettingsEsperantoService$ContentSettings playbackSettingsEsperantoService$ContentSettings = new PlaybackSettingsEsperantoService$ContentSettings();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$ContentSettings;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$ContentSettings.class, playbackSettingsEsperantoService$ContentSettings);
    }

    private PlaybackSettingsEsperantoService$ContentSettings() {
    }

    /* JADX INFO: renamed from: n */
    public static PlaybackSettingsEsperantoService$ContentSettings m17564n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0003\u0015\u0005\u0000\u0000\u0000\u0003\u0001\u0004\u0007\u0005\f\bဇ\u0000\u0015ለ\u0001", new Object[]{"bitField0_", "playbackSpeed_", "shuffle_", "contextEnhancement_", "skipFinishedEpisodes_", "translationLanguage_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$ContentSettings();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 6);
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
        synchronized (PlaybackSettingsEsperantoService$ContentSettings.class) {
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
    public final boolean m17565o() {
        return this.skipFinishedEpisodes_;
    }

    /* JADX INFO: renamed from: p */
    public final String m17566p() {
        return this.translationLanguage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
