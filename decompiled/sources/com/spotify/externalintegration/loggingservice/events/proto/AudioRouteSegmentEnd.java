package com.spotify.externalintegration.loggingservice.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s57;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class AudioRouteSegmentEnd extends AbstractC0269h implements sre0 {
    public static final int CURRENT_ROUTE_CAR_CONNECTION_TYPE_FIELD_NUMBER = 9;
    public static final int CURRENT_ROUTE_ID_FIELD_NUMBER = 3;
    public static final int CURRENT_ROUTE_NAME_FIELD_NUMBER = 4;
    public static final int CURRENT_ROUTE_TYPE_FIELD_NUMBER = 5;
    private static final AudioRouteSegmentEnd DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 1;
    public static final int PREVIOUS_ROUTE_CAR_CONNECTION_TYPE_FIELD_NUMBER = 10;
    public static final int PREVIOUS_ROUTE_ID_FIELD_NUMBER = 6;
    public static final int PREVIOUS_ROUTE_NAME_FIELD_NUMBER = 7;
    public static final int PREVIOUS_ROUTE_TYPE_FIELD_NUMBER = 8;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private int currentRouteCarConnectionType_;
    private int previousRouteCarConnectionType_;
    private String playbackId_ = "";
    private String reason_ = "";
    private String currentRouteId_ = "";
    private String currentRouteName_ = "";
    private String currentRouteType_ = "";
    private String previousRouteId_ = "";
    private String previousRouteName_ = "";
    private String previousRouteType_ = "";

    static {
        AudioRouteSegmentEnd audioRouteSegmentEnd = new AudioRouteSegmentEnd();
        DEFAULT_INSTANCE = audioRouteSegmentEnd;
        AbstractC0269h.registerDefaultInstance(AudioRouteSegmentEnd.class, audioRouteSegmentEnd);
    }

    private AudioRouteSegmentEnd() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10551n(AudioRouteSegmentEnd audioRouteSegmentEnd, int i) {
        audioRouteSegmentEnd.bitField0_ |= 256;
        audioRouteSegmentEnd.currentRouteCarConnectionType_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m10552o(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        str.getClass();
        audioRouteSegmentEnd.bitField0_ |= 4;
        audioRouteSegmentEnd.currentRouteId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m10553p(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        str.getClass();
        audioRouteSegmentEnd.bitField0_ |= 8;
        audioRouteSegmentEnd.currentRouteName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m10554q(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        audioRouteSegmentEnd.bitField0_ |= 16;
        audioRouteSegmentEnd.currentRouteType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m10555r(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        str.getClass();
        audioRouteSegmentEnd.bitField0_ |= 1;
        audioRouteSegmentEnd.playbackId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m10556s(AudioRouteSegmentEnd audioRouteSegmentEnd, int i) {
        audioRouteSegmentEnd.bitField0_ |= 512;
        audioRouteSegmentEnd.previousRouteCarConnectionType_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m10557t(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        str.getClass();
        audioRouteSegmentEnd.bitField0_ |= 32;
        audioRouteSegmentEnd.previousRouteId_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m10558u(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        str.getClass();
        audioRouteSegmentEnd.bitField0_ |= 64;
        audioRouteSegmentEnd.previousRouteName_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m10559v(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        audioRouteSegmentEnd.bitField0_ |= 128;
        audioRouteSegmentEnd.previousRouteType_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m10560w(AudioRouteSegmentEnd audioRouteSegmentEnd, String str) {
        audioRouteSegmentEnd.getClass();
        audioRouteSegmentEnd.bitField0_ |= 2;
        audioRouteSegmentEnd.reason_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static s57 m10561x() {
        return (s57) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nင\t", new Object[]{"bitField0_", "playbackId_", "reason_", "currentRouteId_", "currentRouteName_", "currentRouteType_", "previousRouteId_", "previousRouteName_", "previousRouteType_", "currentRouteCarConnectionType_", "previousRouteCarConnectionType_"});
        }
        if (iOrdinal == 3) {
            return new AudioRouteSegmentEnd();
        }
        if (iOrdinal == 4) {
            return new s57(DEFAULT_INSTANCE);
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
        synchronized (AudioRouteSegmentEnd.class) {
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
