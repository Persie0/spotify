package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.o2p0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$ContentSettingUpdate extends AbstractC0269h implements sre0 {
    public static final int CONTENT_ID_FIELD_NUMBER = 1;
    private static final PlaybackSettingsEsperantoService$ContentSettingUpdate DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private String contentId_ = "";
    private ae50 fields_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaybackSettingsEsperantoService$ContentSettingUpdate playbackSettingsEsperantoService$ContentSettingUpdate = new PlaybackSettingsEsperantoService$ContentSettingUpdate();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$ContentSettingUpdate;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$ContentSettingUpdate.class, playbackSettingsEsperantoService$ContentSettingUpdate);
    }

    private PlaybackSettingsEsperantoService$ContentSettingUpdate() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17561n(PlaybackSettingsEsperantoService$ContentSettingUpdate playbackSettingsEsperantoService$ContentSettingUpdate, PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate) {
        playbackSettingsEsperantoService$ContentSettingUpdate.getClass();
        playbackSettingsEsperantoService$FieldUpdate.getClass();
        ae50 ae50Var = playbackSettingsEsperantoService$ContentSettingUpdate.fields_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playbackSettingsEsperantoService$ContentSettingUpdate.fields_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        playbackSettingsEsperantoService$ContentSettingUpdate.fields_.add(playbackSettingsEsperantoService$FieldUpdate);
    }

    /* JADX INFO: renamed from: o */
    public static void m17562o(PlaybackSettingsEsperantoService$ContentSettingUpdate playbackSettingsEsperantoService$ContentSettingUpdate, String str) {
        playbackSettingsEsperantoService$ContentSettingUpdate.getClass();
        str.getClass();
        playbackSettingsEsperantoService$ContentSettingUpdate.contentId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static o2p0 m17563p() {
        return (o2p0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"contentId_", "fields_", PlaybackSettingsEsperantoService$FieldUpdate.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$ContentSettingUpdate();
        }
        if (iOrdinal == 4) {
            return new o2p0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$ContentSettingUpdate.class) {
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
