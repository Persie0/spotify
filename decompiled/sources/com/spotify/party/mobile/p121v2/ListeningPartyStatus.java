package com.spotify.party.mobile.p121v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.g7n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ListeningPartyStatus extends AbstractC0269h implements sre0 {
    public static final int CLOSED_AT_FIELD_NUMBER = 4;
    public static final int CLOSED_AT_MILLIS_FIELD_NUMBER = 5;
    private static final ListeningPartyStatus DEFAULT_INSTANCE;
    public static final int LIVE_AT_FIELD_NUMBER = 2;
    public static final int LIVE_AT_MILLIS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long closedAtMillis_;
    private Timestamp closedAt_;
    private long liveAtMillis_;
    private Timestamp liveAt_;
    private int status_;

    static {
        ListeningPartyStatus listeningPartyStatus = new ListeningPartyStatus();
        DEFAULT_INSTANCE = listeningPartyStatus;
        AbstractC0269h.registerDefaultInstance(ListeningPartyStatus.class, listeningPartyStatus);
    }

    private ListeningPartyStatus() {
    }

    /* JADX INFO: renamed from: n */
    public static ListeningPartyStatus m16629n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003\u0002\u0004ဉ\u0001\u0005\u0002", new Object[]{"bitField0_", "status_", "liveAt_", "liveAtMillis_", "closedAt_", "closedAtMillis_"});
        }
        if (iOrdinal == 3) {
            return new ListeningPartyStatus();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 29);
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
        synchronized (ListeningPartyStatus.class) {
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

    /* JADX INFO: renamed from: o */
    public final g7n0 m16630o() {
        g7n0 g7n0Var;
        switch (this.status_) {
            case 0:
                g7n0Var = g7n0.UNKNOWN_PARTY_STATUS;
                break;
            case 1:
                g7n0Var = g7n0.SCHEDULED;
                break;
            case 2:
                g7n0Var = g7n0.UPCOMING;
                break;
            case 3:
                g7n0Var = g7n0.READY;
                break;
            case 4:
                g7n0Var = g7n0.LIVE;
                break;
            case 5:
                g7n0Var = g7n0.CLOSED;
                break;
            case 6:
                g7n0Var = g7n0.ARCHIVED;
                break;
            case 7:
                g7n0Var = g7n0.SCRAPPED;
                break;
            default:
                g7n0Var = null;
                break;
        }
        return g7n0Var == null ? g7n0.UNRECOGNIZED : g7n0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
