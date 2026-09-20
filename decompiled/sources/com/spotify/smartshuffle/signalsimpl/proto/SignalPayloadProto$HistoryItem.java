package com.spotify.smartshuffle.signalsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d221;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SignalPayloadProto$HistoryItem extends AbstractC0269h implements sre0 {
    private static final SignalPayloadProto$HistoryItem DEFAULT_INSTANCE;
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
        SignalPayloadProto$HistoryItem signalPayloadProto$HistoryItem = new SignalPayloadProto$HistoryItem();
        DEFAULT_INSTANCE = signalPayloadProto$HistoryItem;
        AbstractC0269h.registerDefaultInstance(SignalPayloadProto$HistoryItem.class, signalPayloadProto$HistoryItem);
    }

    private SignalPayloadProto$HistoryItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21433n(SignalPayloadProto$HistoryItem signalPayloadProto$HistoryItem, gva gvaVar) {
        signalPayloadProto$HistoryItem.getClass();
        signalPayloadProto$HistoryItem.itemId_ = gvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m21434o(SignalPayloadProto$HistoryItem signalPayloadProto$HistoryItem, long j) {
        signalPayloadProto$HistoryItem.bitField0_ |= 1;
        signalPayloadProto$HistoryItem.startTimestamp_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m21435p(SignalPayloadProto$HistoryItem signalPayloadProto$HistoryItem, long j) {
        signalPayloadProto$HistoryItem.bitField0_ |= 2;
        signalPayloadProto$HistoryItem.timePlayedMs_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21436q(SignalPayloadProto$HistoryItem signalPayloadProto$HistoryItem, long j) {
        signalPayloadProto$HistoryItem.bitField0_ |= 4;
        signalPayloadProto$HistoryItem.trackLengthMs_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m21437r(SignalPayloadProto$HistoryItem signalPayloadProto$HistoryItem, String str) {
        signalPayloadProto$HistoryItem.getClass();
        str.getClass();
        signalPayloadProto$HistoryItem.uri_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static d221 m21438s() {
        return (d221) DEFAULT_INSTANCE.createBuilder();
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
            return new SignalPayloadProto$HistoryItem();
        }
        if (iOrdinal == 4) {
            return new d221(DEFAULT_INSTANCE);
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
        synchronized (SignalPayloadProto$HistoryItem.class) {
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
