package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.ae50;
import p204p.lj90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListeningTimeGraph extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 7;
    public static final int AVERAGE_LISTENING_TIME_FIELD_NUMBER = 2;
    private static final ListeningTimeGraph DEFAULT_INSTANCE;
    public static final int MAX_VALUE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int X_AXIS_LABELS_FIELD_NUMBER = 4;
    private int averageListeningTime_;
    private int bitField0_;
    private int maxValue_;
    private Paragraph title_;
    private ae50 points_ = AbstractC0269h.emptyProtobufList();
    private ae50 xAxisLabels_ = AbstractC0269h.emptyProtobufList();
    private String accessibilityDescription_ = "";

    static {
        ListeningTimeGraph listeningTimeGraph = new ListeningTimeGraph();
        DEFAULT_INSTANCE = listeningTimeGraph;
        AbstractC0269h.registerDefaultInstance(ListeningTimeGraph.class, listeningTimeGraph);
    }

    private ListeningTimeGraph() {
    }

    /* JADX INFO: renamed from: p */
    public static ListeningTimeGraph m11373p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u0004\u0003\u001b\u0004Ț\u0006\u0004\u0007Ȉ", new Object[]{"bitField0_", "title_", "averageListeningTime_", "points_", GraphPoint.class, "xAxisLabels_", "maxValue_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new ListeningTimeGraph();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 2);
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
        synchronized (ListeningTimeGraph.class) {
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
    public final String m11374n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m11375o() {
        return this.averageListeningTime_;
    }

    /* JADX INFO: renamed from: q */
    public final int m11376q() {
        return this.maxValue_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m11377r() {
        return this.points_;
    }

    /* JADX INFO: renamed from: s */
    public final Paragraph m11378s() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m11379t() {
        return this.xAxisLabels_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
