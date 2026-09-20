package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class TimelineDate extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DATE_FIELD_NUMBER = 3;
    public static final int DATE_PARAGRAPH_FIELD_NUMBER = 4;
    public static final int DATE_SUBTITLE_FIELD_NUMBER = 6;
    private static final TimelineDate DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int YEAR_FIELD_NUMBER = 2;
    private int bitField0_;
    private Paragraph dateParagraph_;
    private Paragraph dateSubtitle_;
    private Timestamp date_;
    private String month_ = "";
    private String year_ = "";
    private String accessibilityDescription_ = "";

    static {
        TimelineDate timelineDate = new TimelineDate();
        DEFAULT_INSTANCE = timelineDate;
        AbstractC0269h.registerDefaultInstance(TimelineDate.class, timelineDate);
    }

    private TimelineDate() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static TimelineDate m11455q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006ဉ\u0002", new Object[]{"bitField0_", "month_", "year_", "date_", "dateParagraph_", "accessibilityDescription_", "dateSubtitle_"});
        }
        if (iOrdinal == 3) {
            return new TimelineDate();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 6);
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
        synchronized (TimelineDate.class) {
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
    public final String m11456n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Paragraph m11457o() {
        Paragraph paragraph = this.dateParagraph_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: p */
    public final Paragraph m11458p() {
        Paragraph paragraph = this.dateSubtitle_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: r */
    public final String m11459r() {
        return this.month_;
    }

    /* JADX INFO: renamed from: s */
    public final String m11460s() {
        return this.year_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m11461t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m11462u() {
        return (this.bitField0_ & 4) != 0;
    }
}
