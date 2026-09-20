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
public final class PlaybackSettingsEsperantoService$ContentSettingChange extends AbstractC0269h implements sre0 {
    public static final int CONTENT_ID_FIELD_NUMBER = 1;
    public static final int CONTEXT_ENHANCEMENT_FIELD_NUMBER = 5;
    private static final PlaybackSettingsEsperantoService$ContentSettingChange DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER = 3;
    public static final int SHUFFLE_FIELD_NUMBER = 4;
    public static final int SKIP_FINISHED_EPISODES_FIELD_NUMBER = 8;
    public static final int TRANSLATION_LANGUAGE_FIELD_NUMBER = 21;
    private Object field_;
    private int fieldCase_ = 0;
    private String contentId_ = "";

    static {
        PlaybackSettingsEsperantoService$ContentSettingChange playbackSettingsEsperantoService$ContentSettingChange = new PlaybackSettingsEsperantoService$ContentSettingChange();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$ContentSettingChange;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$ContentSettingChange.class, playbackSettingsEsperantoService$ContentSettingChange);
    }

    private PlaybackSettingsEsperantoService$ContentSettingChange() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaybackSettingsEsperantoService$ContentSettingChange m17558o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0015\u0006\u0000\u0000\u0000\u0001Ȉ\u00034\u0000\u0004:\u0000\u0005?\u0000\b:\u0000\u0015Ȼ\u0000", new Object[]{"field_", "fieldCase_", "contentId_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$ContentSettingChange();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 5);
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
        synchronized (PlaybackSettingsEsperantoService$ContentSettingChange.class) {
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
    public final String m17559n() {
        return this.contentId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m17560p() {
        return this.fieldCase_ == 21 ? (String) this.field_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
