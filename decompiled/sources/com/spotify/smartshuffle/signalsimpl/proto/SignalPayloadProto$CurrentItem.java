package com.spotify.smartshuffle.signalsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c221;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SignalPayloadProto$CurrentItem extends AbstractC0269h implements sre0 {
    private static final SignalPayloadProto$CurrentItem DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int TIME_PLAYED_MS_FIELD_NUMBER = 4;
    public static final int TRACK_LENGTH_MS_FIELD_NUMBER = 5;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long startTimestamp_;
    private long timePlayedMs_;
    private long trackLengthMs_;
    private String uri_ = "";
    private gva itemId_ = gva.f84678b;

    static {
        SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem = new SignalPayloadProto$CurrentItem();
        DEFAULT_INSTANCE = signalPayloadProto$CurrentItem;
        AbstractC0269h.registerDefaultInstance(SignalPayloadProto$CurrentItem.class, signalPayloadProto$CurrentItem);
    }

    private SignalPayloadProto$CurrentItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21427n(SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem, gva gvaVar) {
        signalPayloadProto$CurrentItem.getClass();
        signalPayloadProto$CurrentItem.itemId_ = gvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m21428o(SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem, long j) {
        signalPayloadProto$CurrentItem.bitField0_ |= 1;
        signalPayloadProto$CurrentItem.startTimestamp_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m21429p(SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem, long j) {
        signalPayloadProto$CurrentItem.bitField0_ |= 2;
        signalPayloadProto$CurrentItem.timePlayedMs_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21430q(SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem, long j) {
        signalPayloadProto$CurrentItem.bitField0_ |= 4;
        signalPayloadProto$CurrentItem.trackLengthMs_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m21431r(SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem, String str) {
        signalPayloadProto$CurrentItem.getClass();
        str.getClass();
        signalPayloadProto$CurrentItem.uri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static c221 m21432s() {
        return (c221) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003ဂ\u0000\u0004ဂ\u0001\u0005ဂ\u0002", new Object[]{"bitField0_", "uri_", "itemId_", "startTimestamp_", "timePlayedMs_", "trackLengthMs_"});
        }
        if (iOrdinal == 3) {
            return new SignalPayloadProto$CurrentItem();
        }
        if (iOrdinal == 4) {
            return new c221(DEFAULT_INSTANCE);
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
        synchronized (SignalPayloadProto$CurrentItem.class) {
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
