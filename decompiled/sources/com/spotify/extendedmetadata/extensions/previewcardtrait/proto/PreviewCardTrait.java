package com.spotify.extendedmetadata.extensions.previewcardtrait.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qw51;
import p204p.r110;
import p204p.r2n0;
import p204p.rr50;
import p204p.sre0;
import p204p.t3r0;
import p204p.v4x0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PreviewCardTrait extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_HEX_FIELD_NUMBER = 11;
    public static final int CONTENT_PARENT_FIELD_NUMBER = 17;
    public static final int CONTENT_TYPE_NAME_FIELD_NUMBER = 2;
    private static final PreviewCardTrait DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int DESCRIPTOR_TAGS_FIELD_NUMBER = 15;
    public static final int DURATION_FIELD_NUMBER = 9;
    public static final int ENTITY_IMAGE_URL_FIELD_NUMBER = 8;
    public static final int ENTITY_URI_FIELD_NUMBER = 5;
    public static final int ITEM_COUNT_UNIT_FIELD_NUMBER = 19;
    public static final int LABELS_FIELD_NUMBER = 14;
    public static final int LIKE_URI_FIELD_NUMBER = 7;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 6;
    public static final int NUMBER_OF_ITEMS_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_RESTRICTION_FIELD_NUMBER = 13;
    public static final int PUBLISH_TIME_FIELD_NUMBER = 10;
    public static final int SUBTITLE_SOURCE_FIELD_NUMBER = 18;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int WAVEFORM_COLOR_HEX_FIELD_NUMBER = 12;
    private int bitField0_;
    private ContentParent contentParent_;
    private Duration duration_;
    private int itemCountUnit_;
    private Labels labels_;
    private int numberOfItems_;
    private int previewRestriction_;
    private Timestamp publishTime_;
    private int subtitleSource_;
    private String title_ = "";
    private String contentTypeName_ = "";
    private String description_ = "";
    private String entityUri_ = "";
    private String navigateUri_ = "";
    private String likeUri_ = "";
    private String entityImageUrl_ = "";
    private String backgroundColorHex_ = "";
    private String waveformColorHex_ = "";
    private ae50 descriptorTags_ = AbstractC0269h.emptyProtobufList();

    static {
        PreviewCardTrait previewCardTrait = new PreviewCardTrait();
        DEFAULT_INSTANCE = previewCardTrait;
        AbstractC0269h.registerDefaultInstance(PreviewCardTrait.class, previewCardTrait);
    }

    private PreviewCardTrait() {
    }

    /* JADX INFO: renamed from: D */
    public static PreviewCardTrait m10301D(byte[] bArr) {
        return (PreviewCardTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final qw51 m10302A() {
        qw51 qw51Var;
        int i = this.subtitleSource_;
        if (i == 0) {
            qw51Var = qw51.SUBTITLE_SOURCE_UNKNOWN;
        } else if (i != 1) {
            qw51Var = i != 2 ? null : qw51.SUBTITLE_SOURCE_OPERATOR_AUTHORED;
        } else {
            qw51Var = qw51.SUBTITLE_SOURCE_GENERATED_METADATA;
        }
        return qw51Var == null ? qw51.UNRECOGNIZED : qw51Var;
    }

    /* JADX INFO: renamed from: B */
    public final String m10303B() {
        return this.waveformColorHex_;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m10304C() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0000\nဉ\u0001\u000bȈ\fȈ\r\f\u000eဉ\u0002\u000f\u001b\u0010\u0004\u0011ဉ\u0003\u0012\f\u0013\f", new Object[]{"bitField0_", "title_", "contentTypeName_", "description_", "entityUri_", "navigateUri_", "likeUri_", "entityImageUrl_", "duration_", "publishTime_", "backgroundColorHex_", "waveformColorHex_", "previewRestriction_", "labels_", "descriptorTags_", DescriptorTag.class, "numberOfItems_", "contentParent_", "subtitleSource_", "itemCountUnit_"});
        }
        if (iOrdinal == 3) {
            return new PreviewCardTrait();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 1);
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
        synchronized (PreviewCardTrait.class) {
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

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m10305n() {
        return this.backgroundColorHex_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ContentParent m10306o() {
        ContentParent contentParent = this.contentParent_;
        return contentParent == null ? ContentParent.m10297n() : contentParent;
    }

    /* JADX INFO: renamed from: p */
    public final String m10307p() {
        return this.contentTypeName_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m10308q() {
        return this.descriptorTags_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10309r() {
        return this.entityImageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m10310s() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: t */
    public final rr50 m10311t() {
        rr50 rr50Var;
        int i = this.itemCountUnit_;
        if (i == 0) {
            rr50Var = rr50.ITEM_COUNT_UNIT_UNKNOWN;
        } else if (i == 1) {
            rr50Var = rr50.ITEM_COUNT_UNIT_SONGS;
        } else if (i == 2) {
            rr50Var = rr50.ITEM_COUNT_UNIT_BOOKS;
        } else if (i != 3) {
            rr50Var = i != 4 ? null : rr50.ITEM_COUNT_UNIT_ITEMS;
        } else {
            rr50Var = rr50.ITEM_COUNT_UNIT_EPISODES;
        }
        return rr50Var == null ? rr50.UNRECOGNIZED : rr50Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Labels m10312u() {
        Labels labels = this.labels_;
        return labels == null ? Labels.m10298n() : labels;
    }

    /* JADX INFO: renamed from: v */
    public final String m10313v() {
        return this.likeUri_;
    }

    /* JADX INFO: renamed from: w */
    public final String m10314w() {
        return this.navigateUri_;
    }

    /* JADX INFO: renamed from: x */
    public final int m10315x() {
        return this.numberOfItems_;
    }

    /* JADX INFO: renamed from: y */
    public final v4x0 m10316y() {
        v4x0 v4x0Var;
        int i = this.previewRestriction_;
        if (i == 0) {
            v4x0Var = v4x0.NONE;
        } else if (i != 1) {
            v4x0Var = i != 2 ? null : v4x0.IS_19_PLUS;
        } else {
            v4x0Var = v4x0.IS_EXPLICIT;
        }
        return v4x0Var == null ? v4x0.UNRECOGNIZED : v4x0Var;
    }

    /* JADX INFO: renamed from: z */
    public final Timestamp m10317z() {
        Timestamp timestamp = this.publishTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }
}
