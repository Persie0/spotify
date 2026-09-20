package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.bvo0;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v2p0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackSettingsEsperantoService$GetSettingsResponse extends AbstractC0269h implements sre0 {
    public static final int CONTENT_SETTINGS_FIELD_NUMBER = 1;
    private static final PlaybackSettingsEsperantoService$GetSettingsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USER_SETTINGS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ihc0 contentSettings_ = ihc0.f102235b;
    private PlaybackSettingsEsperantoService$UserSettings userSettings_;

    static {
        PlaybackSettingsEsperantoService$GetSettingsResponse playbackSettingsEsperantoService$GetSettingsResponse = new PlaybackSettingsEsperantoService$GetSettingsResponse();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$GetSettingsResponse;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$GetSettingsResponse.class, playbackSettingsEsperantoService$GetSettingsResponse);
    }

    private PlaybackSettingsEsperantoService$GetSettingsResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static PlaybackSettingsEsperantoService$GetSettingsResponse m17590r(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$GetSettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဉ\u0000", new Object[]{"bitField0_", "contentSettings_", v2p0.f236708a, "userSettings_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$GetSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new bvo0(8);
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
        synchronized (PlaybackSettingsEsperantoService$GetSettingsResponse.class) {
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
    public final Map m17591o() {
        return Collections.unmodifiableMap(this.contentSettings_);
    }

    /* JADX INFO: renamed from: p */
    public final PlaybackSettingsEsperantoService$UserSettings m17592p() {
        PlaybackSettingsEsperantoService$UserSettings playbackSettingsEsperantoService$UserSettings = this.userSettings_;
        return playbackSettingsEsperantoService$UserSettings == null ? PlaybackSettingsEsperantoService$UserSettings.m17629q() : playbackSettingsEsperantoService$UserSettings;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17593q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
