package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class WatchFeedCard extends AbstractC0269h implements sre0 {
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 8;
    private static final WatchFeedCard DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 7;
    public static final int OVERLINE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private String uri_ = "";
    private String firstItemUri_ = "";
    private String overline_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String thumbnailImageUrl_ = "";
    private String navigationUri_ = "";
    private String coverImageUrl_ = "";

    static {
        WatchFeedCard watchFeedCard = new WatchFeedCard();
        DEFAULT_INSTANCE = watchFeedCard;
        AbstractC0269h.registerDefaultInstance(WatchFeedCard.class, watchFeedCard);
    }

    private WatchFeedCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ለ\u0000\u0007Ȉ\bለ\u0001", new Object[]{"bitField0_", "uri_", "firstItemUri_", "overline_", "title_", "subtitle_", "thumbnailImageUrl_", "navigationUri_", "coverImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedCard();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 12);
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
        synchronized (WatchFeedCard.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16341n() {
        return this.coverImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16342o() {
        return this.firstItemUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16343p() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m16344q() {
        return this.overline_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16345r() {
        return this.thumbnailImageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16346s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16347t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
