package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.b051;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class StatsAvailabilityDetails extends AbstractC0269h implements sre0 {
    private static final StatsAvailabilityDetails DEFAULT_INSTANCE;
    public static final int EMPTY_SHARE_CONTENT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int SUBTITLE_PARAGRAPH_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private EmptyShareContent emptyShareContent_;
    private int status_;
    private Paragraph subtitleParagraph_;
    private String title_ = "";
    private String subtitle_ = "";

    static {
        StatsAvailabilityDetails statsAvailabilityDetails = new StatsAvailabilityDetails();
        DEFAULT_INSTANCE = statsAvailabilityDetails;
        AbstractC0269h.registerDefaultInstance(StatsAvailabilityDetails.class, statsAvailabilityDetails);
    }

    private StatsAvailabilityDetails() {
    }

    /* JADX INFO: renamed from: n */
    public static StatsAvailabilityDetails m11426n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "status_", "title_", "subtitle_", "subtitleParagraph_", "emptyShareContent_"});
        }
        if (iOrdinal == 3) {
            return new StatsAvailabilityDetails();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 5);
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
        synchronized (StatsAvailabilityDetails.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EmptyShareContent m11427o() {
        EmptyShareContent emptyShareContent = this.emptyShareContent_;
        return emptyShareContent == null ? EmptyShareContent.m11330o() : emptyShareContent;
    }

    /* JADX INFO: renamed from: p */
    public final b051 m11428p() {
        b051 b051Var;
        int i = this.status_;
        if (i == 0) {
            b051Var = b051.STATS_AVAILABLE;
        } else if (i == 1) {
            b051Var = b051.STATS_EMPTY;
        } else if (i != 2) {
            b051Var = i != 3 ? null : b051.STATS_DATA_PROCESSING;
        } else {
            b051Var = b051.STATS_EMPTY_CURRENT_PERIOD;
        }
        return b051Var == null ? b051.UNRECOGNIZED : b051Var;
    }

    /* JADX INFO: renamed from: q */
    public final Paragraph m11429q() {
        Paragraph paragraph = this.subtitleParagraph_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11430r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
