package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PastPeriods extends AbstractC0269h implements sre0 {
    private static final PastPeriods DEFAULT_INSTANCE;
    public static final int EMPTY_PERIOD_FIELD_NUMBER = 3;
    public static final int INDIVIDUAL_AVAILABLE_PERIOD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SOCIAL_AVAILABLE_PERIOD_FIELD_NUMBER = 2;
    private int periodsCase_ = 0;
    private Object periods_;

    static {
        PastPeriods pastPeriods = new PastPeriods();
        DEFAULT_INSTANCE = pastPeriods;
        AbstractC0269h.registerDefaultInstance(PastPeriods.class, pastPeriods);
    }

    private PastPeriods() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"periods_", "periodsCase_", AvailablePeriod.class, SocialAvailablePeriod.class, EmptyPeriod.class});
        }
        if (iOrdinal == 3) {
            return new PastPeriods();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 7);
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
        synchronized (PastPeriods.class) {
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
    public final EmptyPeriod m11569n() {
        return this.periodsCase_ == 3 ? (EmptyPeriod) this.periods_ : EmptyPeriod.m11516o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AvailablePeriod m11570o() {
        return this.periodsCase_ == 1 ? (AvailablePeriod) this.periods_ : AvailablePeriod.m11511p();
    }

    /* JADX INFO: renamed from: p */
    public final int m11571p() {
        int i = this.periodsCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final SocialAvailablePeriod m11572q() {
        return this.periodsCase_ == 2 ? (SocialAvailablePeriod) this.periods_ : SocialAvailablePeriod.m11620p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
