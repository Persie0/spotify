package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Section extends AbstractC0269h implements sre0 {
    private static final Section DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_SHELF_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAST_PERIODS_FIELD_NUMBER = 4;
    public static final int PERIOD_FIELD_NUMBER = 2;
    public static final int TILES_FIELD_NUMBER = 3;
    private int contentCase_ = 0;
    private Object content_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"content_", "contentCase_", HighlightsShelfSection.class, PeriodSection.class, TilesSection.class, PastPeriodsSection.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 13);
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
        synchronized (Section.class) {
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
    public final int m11598n() {
        int i = this.contentCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final HighlightsShelfSection m11599o() {
        return this.contentCase_ == 1 ? (HighlightsShelfSection) this.content_ : HighlightsShelfSection.m11549n();
    }

    /* JADX INFO: renamed from: p */
    public final PastPeriodsSection m11600p() {
        return this.contentCase_ == 4 ? (PastPeriodsSection) this.content_ : PastPeriodsSection.m11573n();
    }

    /* JADX INFO: renamed from: q */
    public final PeriodSection m11601q() {
        return this.contentCase_ == 2 ? (PeriodSection) this.content_ : PeriodSection.m11576o();
    }

    /* JADX INFO: renamed from: r */
    public final TilesSection m11602r() {
        return this.contentCase_ == 3 ? (TilesSection) this.content_ : TilesSection.m11693o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
