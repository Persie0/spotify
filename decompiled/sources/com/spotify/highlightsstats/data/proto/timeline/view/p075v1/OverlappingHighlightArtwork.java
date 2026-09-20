package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ds20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class OverlappingHighlightArtwork extends AbstractC0269h implements sre0 {
    public static final int BOTTOM_COVER_ART_FIELD_NUMBER = 2;
    private static final OverlappingHighlightArtwork DEFAULT_INSTANCE;
    public static final int OVERLAP_STYLE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TOP_COVER_ART_FIELD_NUMBER = 1;
    private int bitField0_;
    private HighlightArtworkItem bottomCoverArt_;
    private int overlapStyle_;
    private HighlightArtworkItem topCoverArt_;

    static {
        OverlappingHighlightArtwork overlappingHighlightArtwork = new OverlappingHighlightArtwork();
        DEFAULT_INSTANCE = overlappingHighlightArtwork;
        AbstractC0269h.registerDefaultInstance(OverlappingHighlightArtwork.class, overlappingHighlightArtwork);
    }

    private OverlappingHighlightArtwork() {
    }

    /* JADX INFO: renamed from: o */
    public static OverlappingHighlightArtwork m11393o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "topCoverArt_", "bottomCoverArt_", "overlapStyle_"});
        }
        if (iOrdinal == 3) {
            return new OverlappingHighlightArtwork();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 13);
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
        synchronized (OverlappingHighlightArtwork.class) {
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
    public final HighlightArtworkItem m11394n() {
        HighlightArtworkItem highlightArtworkItem = this.bottomCoverArt_;
        return highlightArtworkItem == null ? HighlightArtworkItem.m11356o() : highlightArtworkItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ds20 m11395p() {
        ds20 ds20Var;
        int i = this.overlapStyle_;
        if (i == 0) {
            ds20Var = ds20.UNSPECIFIED__OVERLAP_STYLE;
        } else if (i != 1) {
            ds20Var = i != 2 ? null : ds20.DIAGONAL;
        } else {
            ds20Var = ds20.LINEAR;
        }
        return ds20Var == null ? ds20.UNRECOGNIZED : ds20Var;
    }

    /* JADX INFO: renamed from: q */
    public final HighlightArtworkItem m11396q() {
        HighlightArtworkItem highlightArtworkItem = this.topCoverArt_;
        return highlightArtworkItem == null ? HighlightArtworkItem.m11356o() : highlightArtworkItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
