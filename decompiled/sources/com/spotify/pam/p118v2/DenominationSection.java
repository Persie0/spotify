package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uro;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class DenominationSection extends AbstractC0269h implements sre0 {
    public static final int CLICKABLE_FIELD_NUMBER = 2;
    private static final DenominationSection DEFAULT_INSTANCE;
    public static final int DESCRIPTIVE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int sectionCase_ = 0;
    private Object section_;

    static {
        DenominationSection denominationSection = new DenominationSection();
        DEFAULT_INSTANCE = denominationSection;
        AbstractC0269h.registerDefaultInstance(DenominationSection.class, denominationSection);
    }

    private DenominationSection() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"section_", "sectionCase_", DescriptiveSection.class, ClickableSection.class});
        }
        if (iOrdinal == 3) {
            return new DenominationSection();
        }
        if (iOrdinal == 4) {
            return new uro(DEFAULT_INSTANCE, 13);
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
        synchronized (DenominationSection.class) {
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
    public final ClickableSection m16431n() {
        return this.sectionCase_ == 2 ? (ClickableSection) this.section_ : ClickableSection.m16422n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DescriptiveSection m16432o() {
        return this.sectionCase_ == 1 ? (DescriptiveSection) this.section_ : DescriptiveSection.m16438n();
    }

    /* JADX INFO: renamed from: p */
    public final int m16433p() {
        int i = this.sectionCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
