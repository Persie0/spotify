package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzo0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PlaybackGrabbingResult extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_REMOTE_DEVICE_ID_FIELD_NUMBER = 2;
    public static final int ACTIVE_REMOTE_DEVICE_TYPE_FIELD_NUMBER = 8;
    public static final int APP_STATE_FIELD_NUMBER = 3;
    public static final int CURRENT_ACCESSORY_FIELD_NUMBER = 9;
    public static final int CURRENT_AUDIO_ROUTE_FIELD_NUMBER = 5;
    private static final PlaybackGrabbingResult DEFAULT_INSTANCE;
    public static final int GRABBING_EXCEPTIONS_RESULT_FIELD_NUMBER = 7;
    public static final int GRABBING_RESULT_FIELD_NUMBER = 1;
    public static final int GRABBING_TRIGGER_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String grabbingResult_ = "";
    private String activeRemoteDeviceId_ = "";
    private String appState_ = "";
    private String playbackState_ = "";
    private String currentAudioRoute_ = "";
    private String grabbingTrigger_ = "";
    private String grabbingExceptionsResult_ = "";
    private String activeRemoteDeviceType_ = "";
    private String currentAccessory_ = "";

    static {
        PlaybackGrabbingResult playbackGrabbingResult = new PlaybackGrabbingResult();
        DEFAULT_INSTANCE = playbackGrabbingResult;
        AbstractC0269h.registerDefaultInstance(PlaybackGrabbingResult.class, playbackGrabbingResult);
    }

    private PlaybackGrabbingResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12761n(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 2;
        playbackGrabbingResult.activeRemoteDeviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12762o(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 128;
        playbackGrabbingResult.activeRemoteDeviceType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12763p(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 4;
        playbackGrabbingResult.appState_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12764q(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 256;
        playbackGrabbingResult.currentAccessory_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12765r(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 16;
        playbackGrabbingResult.currentAudioRoute_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12766s(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 64;
        playbackGrabbingResult.grabbingExceptionsResult_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m12767t(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 1;
        playbackGrabbingResult.grabbingResult_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m12768u(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 32;
        playbackGrabbingResult.grabbingTrigger_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m12769v(PlaybackGrabbingResult playbackGrabbingResult, String str) {
        playbackGrabbingResult.getClass();
        str.getClass();
        playbackGrabbingResult.bitField0_ |= 8;
        playbackGrabbingResult.playbackState_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static wzo0 m12770w() {
        return (wzo0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "grabbingResult_", "activeRemoteDeviceId_", "appState_", "playbackState_", "currentAudioRoute_", "grabbingTrigger_", "grabbingExceptionsResult_", "activeRemoteDeviceType_", "currentAccessory_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackGrabbingResult();
        }
        if (iOrdinal == 4) {
            return new wzo0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackGrabbingResult.class) {
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
