package com.spotify.runtime_consumption.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ConsumptionRecord extends AbstractC0269h implements sre0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final ConsumptionRecord DEFAULT_INSTANCE;
    public static final int MS_PLAYED_FIELD_NUMBER = 2;
    public static final int MS_PLAYED_NOMINAL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int WALL_TIMESTAMP_SECONDS_FIELD_NUMBER = 4;
    private String contentUri_ = "";
    private long msPlayedNominal_;
    private long msPlayed_;
    private long wallTimestampSeconds_;

    static {
        ConsumptionRecord consumptionRecord = new ConsumptionRecord();
        DEFAULT_INSTANCE = consumptionRecord;
        AbstractC0269h.registerDefaultInstance(ConsumptionRecord.class, consumptionRecord);
    }

    private ConsumptionRecord() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"contentUri_", "msPlayed_", "msPlayedNominal_", "wallTimestampSeconds_"});
        }
        if (iOrdinal == 3) {
            return new ConsumptionRecord();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 0);
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
        synchronized (ConsumptionRecord.class) {
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
    public final String m20418n() {
        return this.contentUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m20419o() {
        return this.msPlayed_;
    }

    /* JADX INFO: renamed from: p */
    public final long m20420p() {
        return this.wallTimestampSeconds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
