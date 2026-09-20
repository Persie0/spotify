package com.spotify.metadata.classic.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.n5f0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class Metadata$Date extends AbstractC0269h implements sre0 {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Metadata$Date DEFAULT_INSTANCE;
    public static final int HOUR_FIELD_NUMBER = 4;
    public static final int MINUTE_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int bitField0_;
    private int day_;
    private int hour_;
    private int minute_;
    private int month_;
    private int year_;

    static {
        Metadata$Date metadata$Date = new Metadata$Date();
        DEFAULT_INSTANCE = metadata$Date;
        AbstractC0269h.registerDefaultInstance(Metadata$Date.class, metadata$Date);
    }

    private Metadata$Date() {
    }

    /* JADX INFO: renamed from: o */
    public static Metadata$Date m15360o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ဏ\u0003\u0005ဏ\u0004", new Object[]{"bitField0_", "year_", "month_", "day_", "hour_", "minute_"});
        }
        if (iOrdinal == 3) {
            return new Metadata$Date();
        }
        if (iOrdinal == 4) {
            return new n5f0(DEFAULT_INSTANCE, 17);
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
        synchronized (Metadata$Date.class) {
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

    public final int getYear() {
        return this.year_;
    }

    /* JADX INFO: renamed from: n */
    public final int m15361n() {
        return this.day_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m15362p() {
        return this.hour_;
    }

    /* JADX INFO: renamed from: q */
    public final int m15363q() {
        return this.minute_;
    }

    /* JADX INFO: renamed from: r */
    public final int m15364r() {
        return this.month_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
