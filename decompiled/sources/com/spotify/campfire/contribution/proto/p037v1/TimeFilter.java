package com.spotify.campfire.contribution.proto.p037v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.pre0;
import p204p.ql71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TimeFilter extends AbstractC0269h implements sre0 {
    private static final TimeFilter DEFAULT_INSTANCE;
    public static final int MAX_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int MIN_TIMESTAMP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Timestamp maxTimestamp_;
    private Timestamp minTimestamp_;

    static {
        TimeFilter timeFilter = new TimeFilter();
        DEFAULT_INSTANCE = timeFilter;
        AbstractC0269h.registerDefaultInstance(TimeFilter.class, timeFilter);
    }

    private TimeFilter() {
    }

    /* JADX INFO: renamed from: n */
    public static void m4358n(TimeFilter timeFilter, Timestamp timestamp) {
        timeFilter.getClass();
        timestamp.getClass();
        timeFilter.maxTimestamp_ = timestamp;
        timeFilter.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m4359o(TimeFilter timeFilter, Timestamp timestamp) {
        timeFilter.getClass();
        timestamp.getClass();
        timeFilter.minTimestamp_ = timestamp;
        timeFilter.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static ql71 m4360p() {
        return (ql71) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "minTimestamp_", "maxTimestamp_"});
        }
        if (iOrdinal == 3) {
            return new TimeFilter();
        }
        if (iOrdinal == 4) {
            return new ql71(DEFAULT_INSTANCE);
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
        synchronized (TimeFilter.class) {
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
