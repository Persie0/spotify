package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bvo0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z2p0;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaybackSettingsEsperantoService$GetDeviceSettingsResponse extends AbstractC0269h implements sre0 {
    private static final PlaybackSettingsEsperantoService$GetDeviceSettingsResponse DEFAULT_INSTANCE;
    public static final int DEVICE_SETTINGS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private PlaybackSettingsEsperantoService$DeviceSettings deviceSettings_;
    private int status_;

    static {
        PlaybackSettingsEsperantoService$GetDeviceSettingsResponse playbackSettingsEsperantoService$GetDeviceSettingsResponse = new PlaybackSettingsEsperantoService$GetDeviceSettingsResponse();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$GetDeviceSettingsResponse;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$GetDeviceSettingsResponse.class, playbackSettingsEsperantoService$GetDeviceSettingsResponse);
    }

    private PlaybackSettingsEsperantoService$GetDeviceSettingsResponse() {
    }

    /* JADX INFO: renamed from: p */
    public static PlaybackSettingsEsperantoService$GetDeviceSettingsResponse m17581p(byte[] bArr) {
        return (PlaybackSettingsEsperantoService$GetDeviceSettingsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "status_", "deviceSettings_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$GetDeviceSettingsResponse();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 7);
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
        synchronized (PlaybackSettingsEsperantoService$GetDeviceSettingsResponse.class) {
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
    public final PlaybackSettingsEsperantoService$DeviceSettings m17582n() {
        PlaybackSettingsEsperantoService$DeviceSettings playbackSettingsEsperantoService$DeviceSettings = this.deviceSettings_;
        return playbackSettingsEsperantoService$DeviceSettings == null ? PlaybackSettingsEsperantoService$DeviceSettings.m17567o() : playbackSettingsEsperantoService$DeviceSettings;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final z2p0 m17583o() {
        z2p0 z2p0VarM95229a = z2p0.m95229a(this.status_);
        return z2p0VarM95229a == null ? z2p0.UNRECOGNIZED : z2p0VarM95229a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
