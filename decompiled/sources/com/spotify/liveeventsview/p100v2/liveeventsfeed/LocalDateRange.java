package com.spotify.liveeventsview.p100v2.liveeventsfeed;

import com.google.protobuf.AbstractC0269h;
import p204p.kba0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalDateRange extends AbstractC0269h implements sre0 {
    private static final LocalDateRange DEFAULT_INSTANCE;
    public static final int LOCAL_END_FIELD_NUMBER = 2;
    public static final int LOCAL_START_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String localStart_ = "";
    private String localEnd_ = "";

    static {
        LocalDateRange localDateRange = new LocalDateRange();
        DEFAULT_INSTANCE = localDateRange;
        AbstractC0269h.registerDefaultInstance(LocalDateRange.class, localDateRange);
    }

    private LocalDateRange() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13061n(LocalDateRange localDateRange, String str) {
        localDateRange.getClass();
        localDateRange.localEnd_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13062o(LocalDateRange localDateRange, String str) {
        localDateRange.getClass();
        localDateRange.localStart_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static kba0 m13063r() {
        return (kba0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"localStart_", "localEnd_"});
        }
        if (iOrdinal == 3) {
            return new LocalDateRange();
        }
        if (iOrdinal == 4) {
            return new kba0(DEFAULT_INSTANCE);
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
        synchronized (LocalDateRange.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m13064p() {
        return this.localEnd_;
    }

    /* JADX INFO: renamed from: q */
    public final String m13065q() {
        return this.localStart_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
