package com.spotify.smartshuffle.signalsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.e221;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SignalPayloadProto$PlayHistory extends AbstractC0269h implements sre0 {
    public static final int CURRENT_FIELD_NUMBER = 1;
    private static final SignalPayloadProto$PlayHistory DEFAULT_INSTANCE;
    public static final int HISTORY_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private SignalPayloadProto$CurrentItem current_;
    private ae50 history_ = AbstractC0269h.emptyProtobufList();

    static {
        SignalPayloadProto$PlayHistory signalPayloadProto$PlayHistory = new SignalPayloadProto$PlayHistory();
        DEFAULT_INSTANCE = signalPayloadProto$PlayHistory;
        AbstractC0269h.registerDefaultInstance(SignalPayloadProto$PlayHistory.class, signalPayloadProto$PlayHistory);
    }

    private SignalPayloadProto$PlayHistory() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21439n(SignalPayloadProto$PlayHistory signalPayloadProto$PlayHistory, ArrayList arrayList) {
        ae50 ae50Var = signalPayloadProto$PlayHistory.history_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            signalPayloadProto$PlayHistory.history_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, signalPayloadProto$PlayHistory.history_);
    }

    /* JADX INFO: renamed from: o */
    public static void m21440o(SignalPayloadProto$PlayHistory signalPayloadProto$PlayHistory, SignalPayloadProto$CurrentItem signalPayloadProto$CurrentItem) {
        signalPayloadProto$PlayHistory.getClass();
        signalPayloadProto$CurrentItem.getClass();
        signalPayloadProto$PlayHistory.current_ = signalPayloadProto$CurrentItem;
        signalPayloadProto$PlayHistory.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static e221 m21441p() {
        return (e221) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "current_", "history_", SignalPayloadProto$HistoryItem.class});
        }
        if (iOrdinal == 3) {
            return new SignalPayloadProto$PlayHistory();
        }
        if (iOrdinal == 4) {
            return new e221(DEFAULT_INSTANCE);
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
        synchronized (SignalPayloadProto$PlayHistory.class) {
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
