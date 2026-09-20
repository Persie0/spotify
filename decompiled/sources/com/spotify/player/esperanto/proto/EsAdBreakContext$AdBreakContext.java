package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsAdBreakContext$AdBreakContext extends AbstractC0269h implements sre0 {
    private static final EsAdBreakContext$AdBreakContext DEFAULT_INSTANCE;
    public static final int MAX_SECONDS_REMAINING_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_IN_CURRENT_AD_BREAK_FIELD_NUMBER = 2;
    public static final int TOTAL_ADS_IN_BREAK_ESTIMATE_FIELD_NUMBER = 3;
    private long maxSecondsRemaining_;
    private long positionInCurrentAdBreak_;
    private long totalAdsInBreakEstimate_;

    static {
        EsAdBreakContext$AdBreakContext esAdBreakContext$AdBreakContext = new EsAdBreakContext$AdBreakContext();
        DEFAULT_INSTANCE = esAdBreakContext$AdBreakContext;
        AbstractC0269h.registerDefaultInstance(EsAdBreakContext$AdBreakContext.class, esAdBreakContext$AdBreakContext);
    }

    private EsAdBreakContext$AdBreakContext() {
    }

    /* JADX INFO: renamed from: o */
    public static EsAdBreakContext$AdBreakContext m17656o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003", new Object[]{"maxSecondsRemaining_", "positionInCurrentAdBreak_", "totalAdsInBreakEstimate_"});
        }
        if (iOrdinal == 3) {
            return new EsAdBreakContext$AdBreakContext();
        }
        if (iOrdinal == 4) {
            return new dbw(18);
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
        synchronized (EsAdBreakContext$AdBreakContext.class) {
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
    public final long m17657p() {
        return this.maxSecondsRemaining_;
    }

    /* JADX INFO: renamed from: q */
    public final long m17658q() {
        return this.positionInCurrentAdBreak_;
    }

    /* JADX INFO: renamed from: r */
    public final long m17659r() {
        return this.totalAdsInBreakEstimate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
