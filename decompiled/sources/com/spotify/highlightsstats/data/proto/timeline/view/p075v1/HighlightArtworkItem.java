package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.es20;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class HighlightArtworkItem extends AbstractC0269h implements sre0 {
    public static final int COVER_ART_FIELD_NUMBER = 1;
    private static final HighlightArtworkItem DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 2;
    private String coverArt_ = "";
    private int style_;

    static {
        HighlightArtworkItem highlightArtworkItem = new HighlightArtworkItem();
        DEFAULT_INSTANCE = highlightArtworkItem;
        AbstractC0269h.registerDefaultInstance(HighlightArtworkItem.class, highlightArtworkItem);
    }

    private HighlightArtworkItem() {
    }

    /* JADX INFO: renamed from: o */
    public static HighlightArtworkItem m11356o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"coverArt_", "style_"});
        }
        if (iOrdinal == 3) {
            return new HighlightArtworkItem();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 17);
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
        synchronized (HighlightArtworkItem.class) {
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
    public final String m11357n() {
        return this.coverArt_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final es20 m11358p() {
        es20 es20Var;
        int i = this.style_;
        if (i == 0) {
            es20Var = es20.UNSPECIFIED_STYLE;
        } else if (i == 1) {
            es20Var = es20.ARTIST;
        } else if (i == 2) {
            es20Var = es20.TRACK;
        } else if (i != 3) {
            es20Var = i != 5 ? null : es20.MOOD;
        } else {
            es20Var = es20.PLAYLIST;
        }
        return es20Var == null ? es20.UNRECOGNIZED : es20Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
