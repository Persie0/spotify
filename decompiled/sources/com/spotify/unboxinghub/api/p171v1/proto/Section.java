package com.spotify.unboxinghub.api.p171v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Section extends AbstractC0269h implements sre0 {
    public static final int CARD_GROUP_FIELD_NUMBER = 3;
    private static final Section DEFAULT_INSTANCE;
    public static final int GRID_FIELD_NUMBER = 2;
    public static final int HERO_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRESENTATION_FIELD_NUMBER = 4;
    public static final int PROGRESS_TRACKER_FIELD_NUMBER = 5;
    private int sectionCase_ = 0;
    private Object section_;

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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"section_", "sectionCase_", BenefitsHero.class, Grid.class, CardGroup.class, GridPresentation.class, ProgressTracker.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 4);
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
    public final CardGroup m21997n() {
        return this.sectionCase_ == 3 ? (CardGroup) this.section_ : CardGroup.m21965o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Grid m21998o() {
        return this.sectionCase_ == 2 ? (Grid) this.section_ : Grid.m21970n();
    }

    /* JADX INFO: renamed from: p */
    public final BenefitsHero m21999p() {
        return this.sectionCase_ == 1 ? (BenefitsHero) this.section_ : BenefitsHero.m21954o();
    }

    /* JADX INFO: renamed from: q */
    public final GridPresentation m22000q() {
        return this.sectionCase_ == 4 ? (GridPresentation) this.section_ : GridPresentation.m21980o();
    }

    /* JADX INFO: renamed from: r */
    public final ProgressTracker m22001r() {
        return this.sectionCase_ == 5 ? (ProgressTracker) this.section_ : ProgressTracker.m21995n();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22002s() {
        return this.sectionCase_ == 3;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m22003t() {
        return this.sectionCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22004u() {
        return this.sectionCase_ == 1;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22005v() {
        return this.sectionCase_ == 4;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22006w() {
        return this.sectionCase_ == 5;
    }
}
