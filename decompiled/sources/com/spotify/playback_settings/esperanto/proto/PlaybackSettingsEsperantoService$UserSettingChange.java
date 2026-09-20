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
public final class PlaybackSettingsEsperantoService$UserSettingChange extends AbstractC0269h implements sre0 {
    public static final int AUDIO_LANGUAGE_FIELD_NUMBER = 22;
    public static final int CROSSFADE_DURATION_MS_FIELD_NUMBER = 11;
    public static final int CROSSFADE_FIELD_NUMBER = 10;
    private static final PlaybackSettingsEsperantoService$UserSettingChange DEFAULT_INSTANCE;
    public static final int DISABLE_SMART_SHUFFLE_FIELD_NUMBER = 6;
    public static final int GAPLESS_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_LANGUAGE_FIELD_NUMBER = 23;
    private int fieldCase_ = 0;
    private Object field_;

    static {
        PlaybackSettingsEsperantoService$UserSettingChange playbackSettingsEsperantoService$UserSettingChange = new PlaybackSettingsEsperantoService$UserSettingChange();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$UserSettingChange;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$UserSettingChange.class, playbackSettingsEsperantoService$UserSettingChange);
    }

    private PlaybackSettingsEsperantoService$UserSettingChange() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PlaybackSettingsEsperantoService$UserSettingChange m17619q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0006\u0017\u0006\u0000\u0000\u0000\u0006:\u0000\t:\u0000\n:\u0000\u000b7\u0000\u0016Ȼ\u0000\u0017Ȼ\u0000", new Object[]{"field_", "fieldCase_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$UserSettingChange();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 12);
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
        synchronized (PlaybackSettingsEsperantoService$UserSettingChange.class) {
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
    public final String m17620n() {
        return this.fieldCase_ == 22 ? (String) this.field_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17621o() {
        if (this.fieldCase_ == 10) {
            return ((Boolean) this.field_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final int m17622p() {
        if (this.fieldCase_ == 11) {
            return ((Integer) this.field_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17623r() {
        if (this.fieldCase_ == 6) {
            return ((Boolean) this.field_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m17624s() {
        if (this.fieldCase_ == 9) {
            return ((Boolean) this.field_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17625t() {
        return this.fieldCase_ == 10;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m17626u() {
        return this.fieldCase_ == 11;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m17627v() {
        return this.fieldCase_ == 6;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17628w() {
        return this.fieldCase_ == 9;
    }
}
