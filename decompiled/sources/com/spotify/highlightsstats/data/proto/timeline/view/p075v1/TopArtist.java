package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.highlightsstats.Artist;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.ore0;
import p204p.pre0;
import p204p.qm71;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class TopArtist extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int ARTIST_FIELD_NUMBER = 3;
    private static final TopArtist DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_CHANGE_LABEL_FIELD_NUMBER = 2;
    public static final int TIME_AT_TOP_FIELD_NUMBER = 5;
    public static final int TIME_LISTENED_FIELD_NUMBER = 4;
    private String accessibilityDescription_ = "";
    private Artist artist_;
    private int bitField0_;
    private PositionChangeLabel positionChangeLabel_;
    private Paragraph timeAtTop_;
    private Paragraph timeListened_;

    static {
        TopArtist topArtist = new TopArtist();
        DEFAULT_INSTANCE = topArtist;
        AbstractC0269h.registerDefaultInstance(TopArtist.class, topArtist);
    }

    private TopArtist() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "positionChangeLabel_", "artist_", "timeListened_", "timeAtTop_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new TopArtist();
        }
        if (iOrdinal == 4) {
            return new qm71(DEFAULT_INSTANCE, 21);
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
        synchronized (TopArtist.class) {
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
    public final String m11463n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Artist m11464o() {
        Artist artist = this.artist_;
        return artist == null ? Artist.m11279o() : artist;
    }

    /* JADX INFO: renamed from: p */
    public final PositionChangeLabel m11465p() {
        PositionChangeLabel positionChangeLabel = this.positionChangeLabel_;
        return positionChangeLabel == null ? PositionChangeLabel.m11398o() : positionChangeLabel;
    }

    /* JADX INFO: renamed from: q */
    public final Paragraph m11466q() {
        Paragraph paragraph = this.timeAtTop_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
