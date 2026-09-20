package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import com.spotify.wrapped.p194v1.proto.Paragraph;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PeriodSection extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DATE_FIELD_NUMBER = 1;
    private static final PeriodSection DEFAULT_INSTANCE;
    public static final int LAST_UPDATED_MESSAGE_FIELD_NUMBER = 4;
    public static final int NON_SHAREABLE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_SUBTITLE_FIELD_NUMBER = 3;
    public static final int SECTION_TITLE_FIELD_NUMBER = 2;
    public static final int SHAREABLE_FIELD_NUMBER = 6;
    private int bitField0_;
    private Timestamp date_;
    private Paragraph sectionSubtitle_;
    private Paragraph sectionTitle_;
    private Object shareability_;
    private int shareabilityCase_ = 0;
    private String lastUpdatedMessage_ = "";
    private String accessibilityDescription_ = "";

    static {
        PeriodSection periodSection = new PeriodSection();
        DEFAULT_INSTANCE = periodSection;
        AbstractC0269h.registerDefaultInstance(PeriodSection.class, periodSection);
    }

    private PeriodSection() {
    }

    /* JADX INFO: renamed from: o */
    public static PeriodSection m11576o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ለ\u0003\u0005Ȉ\u0006<\u0000\u0007<\u0000", new Object[]{"shareability_", "shareabilityCase_", "bitField0_", "date_", "sectionTitle_", "sectionSubtitle_", "lastUpdatedMessage_", "accessibilityDescription_", Shareable.class, NonShareable.class});
        }
        if (iOrdinal == 3) {
            return new PeriodSection();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 28);
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
        synchronized (PeriodSection.class) {
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

    public final Timestamp getDate() {
        Timestamp timestamp = this.date_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: n */
    public final String m11577n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m11578p() {
        return this.lastUpdatedMessage_;
    }

    /* JADX INFO: renamed from: q */
    public final NonShareable m11579q() {
        return this.shareabilityCase_ == 7 ? (NonShareable) this.shareability_ : NonShareable.m11558o();
    }

    /* JADX INFO: renamed from: r */
    public final Paragraph m11580r() {
        Paragraph paragraph = this.sectionSubtitle_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: s */
    public final Paragraph m11581s() {
        Paragraph paragraph = this.sectionTitle_;
        return paragraph == null ? Paragraph.m23150p() : paragraph;
    }

    /* JADX INFO: renamed from: t */
    public final int m11582t() {
        int i = this.shareabilityCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 6) {
            return i != 7 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Shareable m11583u() {
        return this.shareabilityCase_ == 6 ? (Shareable) this.shareability_ : Shareable.m11603n();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11584v() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11585w() {
        return (this.bitField0_ & 4) != 0;
    }
}
