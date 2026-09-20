package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s2p0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$FieldValue extends AbstractC0269h implements sre0 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$FieldValue DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    static {
        PlaybackSettingsEsperantoService$FieldValue playbackSettingsEsperantoService$FieldValue = new PlaybackSettingsEsperantoService$FieldValue();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$FieldValue;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$FieldValue.class, playbackSettingsEsperantoService$FieldValue);
    }

    private PlaybackSettingsEsperantoService$FieldValue() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17575n(PlaybackSettingsEsperantoService$FieldValue playbackSettingsEsperantoService$FieldValue, boolean z) {
        playbackSettingsEsperantoService$FieldValue.valueCase_ = 2;
        playbackSettingsEsperantoService$FieldValue.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: o */
    public static void m17576o(PlaybackSettingsEsperantoService$FieldValue playbackSettingsEsperantoService$FieldValue, int i) {
        playbackSettingsEsperantoService$FieldValue.valueCase_ = 3;
        playbackSettingsEsperantoService$FieldValue.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: p */
    public static void m17577p(PlaybackSettingsEsperantoService$FieldValue playbackSettingsEsperantoService$FieldValue, String str) {
        playbackSettingsEsperantoService$FieldValue.getClass();
        str.getClass();
        playbackSettingsEsperantoService$FieldValue.valueCase_ = 1;
        playbackSettingsEsperantoService$FieldValue.value_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static s2p0 m17578q() {
        return (s2p0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00037\u0000\u00044\u0000", new Object[]{"value_", "valueCase_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$FieldValue();
        }
        if (iOrdinal == 4) {
            return new s2p0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$FieldValue.class) {
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
