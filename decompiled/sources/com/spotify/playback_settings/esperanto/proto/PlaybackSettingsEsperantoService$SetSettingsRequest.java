package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2p0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$SetSettingsRequest extends AbstractC0269h implements sre0 {
    public static final int CONTENT_SETTINGS_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$SetSettingsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USER_SETTINGS_FIELD_NUMBER = 1;
    private ae50 userSettings_ = AbstractC0269h.emptyProtobufList();
    private ae50 contentSettings_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest = new PlaybackSettingsEsperantoService$SetSettingsRequest();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$SetSettingsRequest;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$SetSettingsRequest.class, playbackSettingsEsperantoService$SetSettingsRequest);
    }

    private PlaybackSettingsEsperantoService$SetSettingsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17597n(PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest, ArrayList arrayList) {
        ae50 ae50Var = playbackSettingsEsperantoService$SetSettingsRequest.userSettings_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playbackSettingsEsperantoService$SetSettingsRequest.userSettings_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, playbackSettingsEsperantoService$SetSettingsRequest.userSettings_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17598o(PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest, PlaybackSettingsEsperantoService$ContentSettingUpdate playbackSettingsEsperantoService$ContentSettingUpdate) {
        playbackSettingsEsperantoService$SetSettingsRequest.getClass();
        playbackSettingsEsperantoService$ContentSettingUpdate.getClass();
        ae50 ae50Var = playbackSettingsEsperantoService$SetSettingsRequest.contentSettings_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playbackSettingsEsperantoService$SetSettingsRequest.contentSettings_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        playbackSettingsEsperantoService$SetSettingsRequest.contentSettings_.add(playbackSettingsEsperantoService$ContentSettingUpdate);
    }

    /* JADX INFO: renamed from: p */
    public static void m17599p(PlaybackSettingsEsperantoService$SetSettingsRequest playbackSettingsEsperantoService$SetSettingsRequest, PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate) {
        playbackSettingsEsperantoService$SetSettingsRequest.getClass();
        playbackSettingsEsperantoService$FieldUpdate.getClass();
        ae50 ae50Var = playbackSettingsEsperantoService$SetSettingsRequest.userSettings_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playbackSettingsEsperantoService$SetSettingsRequest.userSettings_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        playbackSettingsEsperantoService$SetSettingsRequest.userSettings_.add(playbackSettingsEsperantoService$FieldUpdate);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static x2p0 m17600q() {
        return (x2p0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"userSettings_", PlaybackSettingsEsperantoService$FieldUpdate.class, "contentSettings_", PlaybackSettingsEsperantoService$ContentSettingUpdate.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$SetSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new x2p0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$SetSettingsRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
