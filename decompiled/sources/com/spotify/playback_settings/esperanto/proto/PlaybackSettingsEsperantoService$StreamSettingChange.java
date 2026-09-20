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
public final class PlaybackSettingsEsperantoService$StreamSettingChange extends AbstractC0269h implements sre0 {
    public static final int CONTENT_CHANGE_FIELD_NUMBER = 1;
    private static final PlaybackSettingsEsperantoService$StreamSettingChange DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USER_CHANGE_FIELD_NUMBER = 2;
    private int changeTypeCase_ = 0;
    private Object changeType_;

    static {
        PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = new PlaybackSettingsEsperantoService$StreamSettingChange();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$StreamSettingChange;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$StreamSettingChange.class, playbackSettingsEsperantoService$StreamSettingChange);
    }

    private PlaybackSettingsEsperantoService$StreamSettingChange() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PlaybackSettingsEsperantoService$StreamSettingChange m17612q(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$StreamSettingChange) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"changeType_", "changeTypeCase_", PlaybackSettingsEsperantoService$ContentSettingChange.class, PlaybackSettingsEsperantoService$UserSettingChange.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$StreamSettingChange();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 11);
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
        synchronized (PlaybackSettingsEsperantoService$StreamSettingChange.class) {
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
    public final PlaybackSettingsEsperantoService$ContentSettingChange m17613n() {
        return this.changeTypeCase_ == 1 ? (PlaybackSettingsEsperantoService$ContentSettingChange) this.changeType_ : PlaybackSettingsEsperantoService$ContentSettingChange.m17558o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PlaybackSettingsEsperantoService$UserSettingChange m17614o() {
        return this.changeTypeCase_ == 2 ? (PlaybackSettingsEsperantoService$UserSettingChange) this.changeType_ : PlaybackSettingsEsperantoService$UserSettingChange.m17619q();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m17615p() {
        return this.changeTypeCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
