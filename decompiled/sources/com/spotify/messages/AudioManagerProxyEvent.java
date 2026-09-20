package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.iz6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class AudioManagerProxyEvent extends AbstractC0269h implements sre0 {
    public static final int ACCEPTS_DELAYED_FOCUS_GAIN_FIELD_NUMBER = 9;
    public static final int AUDIO_USAGE_FIELD_NUMBER = 8;
    public static final int COMPONENT_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 7;
    private static final AudioManagerProxyEvent DEFAULT_INSTANCE;
    public static final int FOCUS_CHANGE_FIELD_NUMBER = 5;
    public static final int FOCUS_GAIN_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_RESULT_FIELD_NUMBER = 3;
    public static final int SEND_REASON_FIELD_NUMBER = 2;
    public static final int STREAM_TYPE_FIELD_NUMBER = 6;
    private boolean acceptsDelayedFocusGain_;
    private int bitField0_;
    private String componentIdentifier_ = "";
    private String sendReason_ = "";
    private String requestResult_ = "";
    private String focusGain_ = "";
    private String focusChange_ = "";
    private String streamType_ = "";
    private String contentType_ = "";
    private String audioUsage_ = "";

    static {
        AudioManagerProxyEvent audioManagerProxyEvent = new AudioManagerProxyEvent();
        DEFAULT_INSTANCE = audioManagerProxyEvent;
        AbstractC0269h.registerDefaultInstance(AudioManagerProxyEvent.class, audioManagerProxyEvent);
    }

    private AudioManagerProxyEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13572n(AudioManagerProxyEvent audioManagerProxyEvent, boolean z) {
        audioManagerProxyEvent.bitField0_ |= 256;
        audioManagerProxyEvent.acceptsDelayedFocusGain_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m13573o(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        str.getClass();
        audioManagerProxyEvent.bitField0_ |= 128;
        audioManagerProxyEvent.audioUsage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13574p(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        str.getClass();
        audioManagerProxyEvent.bitField0_ |= 1;
        audioManagerProxyEvent.componentIdentifier_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13575q(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        str.getClass();
        audioManagerProxyEvent.bitField0_ |= 64;
        audioManagerProxyEvent.contentType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13576r(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        str.getClass();
        audioManagerProxyEvent.bitField0_ |= 16;
        audioManagerProxyEvent.focusChange_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13577s(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        str.getClass();
        audioManagerProxyEvent.bitField0_ |= 8;
        audioManagerProxyEvent.focusGain_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m13578t(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        str.getClass();
        audioManagerProxyEvent.bitField0_ |= 4;
        audioManagerProxyEvent.requestResult_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m13579u(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        audioManagerProxyEvent.bitField0_ |= 2;
        audioManagerProxyEvent.sendReason_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m13580v(AudioManagerProxyEvent audioManagerProxyEvent, String str) {
        audioManagerProxyEvent.getClass();
        str.getClass();
        audioManagerProxyEvent.bitField0_ |= 32;
        audioManagerProxyEvent.streamType_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static iz6 m13581w() {
        return (iz6) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b", new Object[]{"bitField0_", "componentIdentifier_", "sendReason_", "requestResult_", "focusGain_", "focusChange_", "streamType_", "contentType_", "audioUsage_", "acceptsDelayedFocusGain_"});
        }
        if (iOrdinal == 3) {
            return new AudioManagerProxyEvent();
        }
        if (iOrdinal == 4) {
            return new iz6(DEFAULT_INSTANCE);
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
        synchronized (AudioManagerProxyEvent.class) {
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
