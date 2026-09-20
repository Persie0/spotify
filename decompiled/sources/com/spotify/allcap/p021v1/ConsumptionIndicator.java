package com.spotify.allcap.p021v1;

import com.google.protobuf.AbstractC0269h;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class ConsumptionIndicator extends AbstractC0269h implements sre0 {
    private static final ConsumptionIndicator DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_BAR_FIELD_NUMBER = 1;
    private int variantCase_ = 0;
    private Object variant_;

    static {
        ConsumptionIndicator consumptionIndicator = new ConsumptionIndicator();
        DEFAULT_INSTANCE = consumptionIndicator;
        AbstractC0269h.registerDefaultInstance(ConsumptionIndicator.class, consumptionIndicator);
    }

    private ConsumptionIndicator() {
    }

    /* JADX INFO: renamed from: n */
    public static ConsumptionIndicator m3231n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"variant_", "variantCase_", ProgressBar.class});
        }
        if (iOrdinal == 3) {
            return new ConsumptionIndicator();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 29);
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
        synchronized (ConsumptionIndicator.class) {
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
    public final ProgressBar m3232o() {
        return this.variantCase_ == 1 ? (ProgressBar) this.variant_ : ProgressBar.m3240n();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3233p() {
        return this.variantCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
