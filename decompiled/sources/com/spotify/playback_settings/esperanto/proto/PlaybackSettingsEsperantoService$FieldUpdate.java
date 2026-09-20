package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q2p0;
import p204p.r110;
import p204p.r2n0;
import p204p.r2p0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$FieldUpdate extends AbstractC0269h implements sre0 {
    private static final PlaybackSettingsEsperantoService$FieldUpdate DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int id_;
    private PlaybackSettingsEsperantoService$FieldValue value_;

    static {
        PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate = new PlaybackSettingsEsperantoService$FieldUpdate();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$FieldUpdate;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$FieldUpdate.class, playbackSettingsEsperantoService$FieldUpdate);
    }

    private PlaybackSettingsEsperantoService$FieldUpdate() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17572n(PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate, q2p0 q2p0Var) {
        playbackSettingsEsperantoService$FieldUpdate.getClass();
        playbackSettingsEsperantoService$FieldUpdate.id_ = q2p0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m17573o(PlaybackSettingsEsperantoService$FieldUpdate playbackSettingsEsperantoService$FieldUpdate, PlaybackSettingsEsperantoService$FieldValue playbackSettingsEsperantoService$FieldValue) {
        playbackSettingsEsperantoService$FieldUpdate.getClass();
        playbackSettingsEsperantoService$FieldValue.getClass();
        playbackSettingsEsperantoService$FieldUpdate.value_ = playbackSettingsEsperantoService$FieldValue;
        playbackSettingsEsperantoService$FieldUpdate.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static r2p0 m17574p() {
        return (r2p0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "id_", "value_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$FieldUpdate();
        }
        if (iOrdinal == 4) {
            return new r2p0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$FieldUpdate.class) {
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
