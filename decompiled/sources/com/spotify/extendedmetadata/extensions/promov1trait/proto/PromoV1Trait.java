package com.spotify.extendedmetadata.extensions.promov1trait.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.c8s0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.w4x0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PromoV1Trait extends AbstractC0269h implements sre0 {
    public static final int CONTENT_PARENT_NAME_FIELD_NUMBER = 8;
    public static final int CONTENT_TYPE_NAME_FIELD_NUMBER = 5;
    public static final int CREATORS_FIELD_NUMBER = 9;
    private static final PromoV1Trait DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 11;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int IS_SINGLE_RELEASE_FIELD_NUMBER = 15;
    public static final int ITEMS_DESCRIPTION_FIELD_NUMBER = 14;
    public static final int LABELS_FIELD_NUMBER = 6;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 13;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_URI_FIELD_NUMBER = 10;
    public static final int PREVIEW_RESTRICTION_FIELD_NUMBER = 12;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 7;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isSingleRelease_;
    private int numberOfItems_;
    private int previewRestriction_;
    private Timestamp publishTime_;
    private String title_ = "";
    private String subtitle_ = "";
    private String navigateUri_ = "";
    private String imageUrl_ = "";
    private String contentTypeName_ = "";
    private ae50 labels_ = AbstractC0269h.emptyProtobufList();
    private String contentParentName_ = "";
    private ae50 creators_ = AbstractC0269h.emptyProtobufList();
    private String playbackUri_ = "";
    private String description_ = "";
    private String itemsDescription_ = "";

    static {
        PromoV1Trait promoV1Trait = new PromoV1Trait();
        DEFAULT_INSTANCE = promoV1Trait;
        AbstractC0269h.registerDefaultInstance(PromoV1Trait.class, promoV1Trait);
    }

    private PromoV1Trait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: z */
    public static PromoV1Trait m10320z(byte[] bArr) {
        return (PromoV1Trait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b\u0007ဉ\u0000\bȈ\t\u001b\nȈ\u000bȈ\f\f\r\u0004\u000eȈ\u000f\u0007", new Object[]{"bitField0_", "title_", "subtitle_", "navigateUri_", "imageUrl_", "contentTypeName_", "labels_", Label.class, "publishTime_", "contentParentName_", "creators_", Creator.class, "playbackUri_", "description_", "previewRestriction_", "numberOfItems_", "itemsDescription_", "isSingleRelease_"});
        }
        if (iOrdinal == 3) {
            return new PromoV1Trait();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 1);
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
        synchronized (PromoV1Trait.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m10321n() {
        return this.contentParentName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10322o() {
        return this.contentTypeName_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m10323p() {
        return this.creators_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10324q() {
        return this.isSingleRelease_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10325r() {
        return this.itemsDescription_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m10326s() {
        return this.labels_;
    }

    /* JADX INFO: renamed from: t */
    public final String m10327t() {
        return this.navigateUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final int m10328u() {
        return this.numberOfItems_;
    }

    /* JADX INFO: renamed from: v */
    public final String m10329v() {
        return this.playbackUri_;
    }

    /* JADX INFO: renamed from: w */
    public final w4x0 m10330w() {
        w4x0 w4x0Var;
        int i = this.previewRestriction_;
        if (i == 0) {
            w4x0Var = w4x0.NONE;
        } else if (i != 1) {
            w4x0Var = i != 2 ? null : w4x0.IS_19_PLUS;
        } else {
            w4x0Var = w4x0.IS_EXPLICIT;
        }
        return w4x0Var == null ? w4x0.UNRECOGNIZED : w4x0Var;
    }

    /* JADX INFO: renamed from: x */
    public final Timestamp m10331x() {
        Timestamp timestamp = this.publishTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m10332y() {
        return (this.bitField0_ & 1) != 0;
    }
}
