package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.f710;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Heading extends AbstractC0269h implements sre0 {
    private static final Heading DEFAULT_INSTANCE;
    public static final int EMPTY_HEADING_FIELD_NUMBER = 1;
    public static final int ENRICHED_HEADING_FIELD_NUMBER = 3;
    public static final int HEADING_WITH_DESCRIPTION_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SPONSORED_HEADING_FIELD_NUMBER = 4;
    public static final int STATIC_ENRICHED_HEADING_FIELD_NUMBER = 6;
    public static final int TEXT_HEADING_FIELD_NUMBER = 2;
    private int headingCase_ = 0;
    private Object heading_;

    static {
        Heading heading = new Heading();
        DEFAULT_INSTANCE = heading;
        AbstractC0269h.registerDefaultInstance(Heading.class, heading);
    }

    private Heading() {
    }

    /* JADX INFO: renamed from: o */
    public static Heading m5646o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"heading_", "headingCase_", EmptyHeading.class, HeadingWithText.class, EnrichedHeading.class, SponsoredHeading.class, HeadingWithDescription.class, StaticEnrichedHeading.class});
        }
        if (iOrdinal == 3) {
            return new Heading();
        }
        if (iOrdinal == 4) {
            return new og20(4);
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
        synchronized (Heading.class) {
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
    public final EnrichedHeading m5647p() {
        return this.headingCase_ == 3 ? (EnrichedHeading) this.heading_ : EnrichedHeading.m5638p();
    }

    /* JADX INFO: renamed from: q */
    public final int m5648q() {
        return f710.m40933a(this.headingCase_);
    }

    /* JADX INFO: renamed from: r */
    public final HeadingWithDescription m5649r() {
        return this.headingCase_ == 5 ? (HeadingWithDescription) this.heading_ : HeadingWithDescription.m5656o();
    }

    /* JADX INFO: renamed from: s */
    public final SponsoredHeading m5650s() {
        return this.headingCase_ == 4 ? (SponsoredHeading) this.heading_ : SponsoredHeading.m5845o();
    }

    /* JADX INFO: renamed from: t */
    public final StaticEnrichedHeading m5651t() {
        return this.headingCase_ == 6 ? (StaticEnrichedHeading) this.heading_ : StaticEnrichedHeading.m5848o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final HeadingWithText m5652u() {
        return this.headingCase_ == 2 ? (HeadingWithText) this.heading_ : HeadingWithText.m5660o();
    }
}
