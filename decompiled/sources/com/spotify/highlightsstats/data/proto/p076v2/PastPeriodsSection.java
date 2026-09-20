package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import p204p.ae50;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PastPeriodsSection extends AbstractC0269h implements sre0 {
    private static final PastPeriodsSection DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAST_PERIODS_FIELD_NUMBER = 2;
    public static final int SECTION_TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 pastPeriods_ = AbstractC0269h.emptyProtobufList();
    private Paragraph sectionTitle_;

    static {
        PastPeriodsSection pastPeriodsSection = new PastPeriodsSection();
        DEFAULT_INSTANCE = pastPeriodsSection;
        AbstractC0269h.registerDefaultInstance(PastPeriodsSection.class, pastPeriodsSection);
    }

    private PastPeriodsSection() {
    }

    /* JADX INFO: renamed from: n */
    public static PastPeriodsSection m11573n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "sectionTitle_", "pastPeriods_", PastPeriods.class});
        }
        if (iOrdinal == 3) {
            return new PastPeriodsSection();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 8);
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
        synchronized (PastPeriodsSection.class) {
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
    public final ae50 m11574o() {
        return this.pastPeriods_;
    }

    /* JADX INFO: renamed from: p */
    public final Paragraph m11575p() {
        Paragraph paragraph = this.sectionTitle_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
