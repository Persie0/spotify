package com.spotify.smartshuffle.signalsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f221;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SignalPayloadProto$SignalPayload extends AbstractC0269h implements sre0 {
    public static final int CURATION_DISABLED_FIELD_NUMBER = 3;
    private static final SignalPayloadProto$SignalPayload DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_HISTORY_FIELD_NUMBER = 1;
    public static final int SIGNAL_REFERENCE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean curationDisabled_;
    private SignalPayloadProto$PlayHistory playHistory_;
    private String signalReference_ = "";

    static {
        SignalPayloadProto$SignalPayload signalPayloadProto$SignalPayload = new SignalPayloadProto$SignalPayload();
        DEFAULT_INSTANCE = signalPayloadProto$SignalPayload;
        AbstractC0269h.registerDefaultInstance(SignalPayloadProto$SignalPayload.class, signalPayloadProto$SignalPayload);
    }

    private SignalPayloadProto$SignalPayload() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21442n(SignalPayloadProto$SignalPayload signalPayloadProto$SignalPayload, boolean z) {
        signalPayloadProto$SignalPayload.bitField0_ |= 4;
        signalPayloadProto$SignalPayload.curationDisabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m21443o(SignalPayloadProto$SignalPayload signalPayloadProto$SignalPayload, SignalPayloadProto$PlayHistory signalPayloadProto$PlayHistory) {
        signalPayloadProto$SignalPayload.getClass();
        signalPayloadProto$PlayHistory.getClass();
        signalPayloadProto$SignalPayload.playHistory_ = signalPayloadProto$PlayHistory;
        signalPayloadProto$SignalPayload.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static f221 m21444p() {
        return (f221) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "playHistory_", "signalReference_", "curationDisabled_"});
        }
        if (iOrdinal == 3) {
            return new SignalPayloadProto$SignalPayload();
        }
        if (iOrdinal == 4) {
            return new f221(DEFAULT_INSTANCE);
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
        synchronized (SignalPayloadProto$SignalPayload.class) {
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
