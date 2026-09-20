package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.ae50;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GraphSection extends AbstractC0269h implements sre0 {
    public static final int CHANGE_PREVIOUS_PERIOD_FIELD_NUMBER = 3;
    private static final GraphSection DEFAULT_INSTANCE;
    public static final int HIGHLIGHTED_ENTITY_HIGH_FIELD_NUMBER = 6;
    public static final int HIGHLIGHTED_ENTITY_LOW_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 4;
    public static final int RANGE_HIGHEST_VALUE_FIELD_NUMBER = 8;
    public static final int RANGE_LOWEST_VALUE_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int changePreviousPeriod_;
    private HighlightedEntity highlightedEntityHigh_;
    private HighlightedEntity highlightedEntityLow_;
    private Paragraph title_;
    private String subtitle_ = "";
    private ae50 points_ = AbstractC0269h.emptyProtobufList();
    private String rangeLowestValue_ = "";
    private String rangeHighestValue_ = "";

    static {
        GraphSection graphSection = new GraphSection();
        DEFAULT_INSTANCE = graphSection;
        AbstractC0269h.registerDefaultInstance(GraphSection.class, graphSection);
    }

    private GraphSection() {
    }

    /* JADX INFO: renamed from: o */
    public static GraphSection m11332o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u0004\u0004\u001b\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ", new Object[]{"bitField0_", "title_", "subtitle_", "changePreviousPeriod_", "points_", GraphPoint.class, "highlightedEntityLow_", "highlightedEntityHigh_", "rangeLowestValue_", "rangeHighestValue_"});
        }
        if (iOrdinal == 3) {
            return new GraphSection();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 4);
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
        synchronized (GraphSection.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    /* JADX INFO: renamed from: n */
    public final int m11333n() {
        return this.changePreviousPeriod_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final HighlightedEntity m11334p() {
        HighlightedEntity highlightedEntity = this.highlightedEntityHigh_;
        return highlightedEntity == null ? HighlightedEntity.m11361n() : highlightedEntity;
    }

    /* JADX INFO: renamed from: q */
    public final HighlightedEntity m11335q() {
        HighlightedEntity highlightedEntity = this.highlightedEntityLow_;
        return highlightedEntity == null ? HighlightedEntity.m11361n() : highlightedEntity;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m11336r() {
        return this.points_;
    }

    /* JADX INFO: renamed from: s */
    public final String m11337s() {
        return this.rangeHighestValue_;
    }

    /* JADX INFO: renamed from: t */
    public final String m11338t() {
        return this.rangeLowestValue_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Paragraph m11339u() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }
}
