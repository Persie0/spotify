package com.spotify.contexts;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zxh0;

/* JADX INFO: loaded from: classes.dex */
public final class MonotonicClock extends AbstractC0269h implements sre0 {
    private static final MonotonicClock DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private long id_;
    private long value_;

    static {
        MonotonicClock monotonicClock = new MonotonicClock();
        DEFAULT_INSTANCE = monotonicClock;
        AbstractC0269h.registerDefaultInstance(MonotonicClock.class, monotonicClock);
    }

    private MonotonicClock() {
    }

    /* JADX INFO: renamed from: n */
    public static void m8020n(MonotonicClock monotonicClock, long j) {
        monotonicClock.bitField0_ |= 1;
        monotonicClock.id_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m8021o(MonotonicClock monotonicClock, long j) {
        monotonicClock.bitField0_ |= 2;
        monotonicClock.value_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static zxh0 m8022p() {
        return (zxh0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "id_", "value_"});
        }
        if (iOrdinal == 3) {
            return new MonotonicClock();
        }
        if (iOrdinal == 4) {
            return new zxh0(DEFAULT_INSTANCE);
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
        synchronized (MonotonicClock.class) {
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
