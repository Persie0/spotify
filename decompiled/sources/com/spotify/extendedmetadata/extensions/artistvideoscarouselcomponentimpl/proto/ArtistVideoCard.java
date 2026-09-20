package com.spotify.extendedmetadata.extensions.artistvideoscarouselcomponentimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ArtistVideoCard extends AbstractC0269h implements sre0 {
    public static final int ALBUM_URI_FIELD_NUMBER = 12;
    public static final int ARTIST_URI_FIELD_NUMBER = 11;
    public static final int DECISION_ID_FIELD_NUMBER = 13;
    private static final ArtistVideoCard DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 10;
    public static final int IS_19PLUS_FIELD_NUMBER = 4;
    public static final int IS_ANIMATED_FIELD_NUMBER = 2;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 3;
    public static final int MANIFEST_ID_FIELD_NUMBER = 5;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLACEHOLDER_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int SUBTITLE_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 8;
    public static final int VIDEO_URI_FIELD_NUMBER = 1;
    private int index_;
    private boolean is19Plus_;
    private boolean isAnimated_;
    private boolean isExplicit_;
    private String videoUri_ = "";
    private String manifestId_ = "";
    private String placeholderImageUrl_ = "";
    private String navigationUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String artistUri_ = "";
    private String albumUri_ = "";
    private String decisionId_ = "";

    static {
        ArtistVideoCard artistVideoCard = new ArtistVideoCard();
        DEFAULT_INSTANCE = artistVideoCard;
        AbstractC0269h.registerDefaultInstance(ArtistVideoCard.class, artistVideoCard);
    }

    private ArtistVideoCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\n\u0004\u000bȈ\fȈ\rȈ", new Object[]{"videoUri_", "isAnimated_", "isExplicit_", "is19Plus_", "manifestId_", "placeholderImageUrl_", "navigationUri_", "title_", "subtitle_", "index_", "artistUri_", "albumUri_", "decisionId_"});
        }
        if (iOrdinal == 3) {
            return new ArtistVideoCard();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 6);
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
        synchronized (ArtistVideoCard.class) {
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

    public final int getIndex() {
        return this.index_;
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final String getManifestId() {
        return this.manifestId_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m9832n() {
        return this.albumUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9833o() {
        return this.artistUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9834p() {
        return this.decisionId_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m9835q() {
        return this.is19Plus_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9836r() {
        return this.isAnimated_;
    }

    /* JADX INFO: renamed from: s */
    public final String m9837s() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: t */
    public final String m9838t() {
        return this.placeholderImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m9839u() {
        return this.videoUri_;
    }
}
