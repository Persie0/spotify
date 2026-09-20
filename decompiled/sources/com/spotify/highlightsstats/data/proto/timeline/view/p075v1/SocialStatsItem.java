package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.ae50;
import p204p.k051;
import p204p.ne21;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialStatsItem extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 6;
    public static final int CHANGE_PREVIOUS_PERIOD_LABEL_FIELD_NUMBER = 7;
    public static final int CURRENT_LOOK_BACK_FIELD_NUMBER = 1;
    private static final SocialStatsItem DEFAULT_INSTANCE;
    public static final int FALLBACK_IMAGE_URL_FIELD_NUMBER = 9;
    public static final int HEADER_FIELD_NUMBER = 3;
    public static final int IMAGE_URLS_FIELD_NUMBER = 10;
    public static final int IMAGE_URL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SOCIAL_DATA_INFO_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private PositionChangeLabel changePreviousPeriodLabel_;
    private int currentLookBack_;
    private SocialDataInfo socialDataInfo_;
    private Paragraph title_;
    private int type_;
    private String header_ = "";
    private String imageUrl_ = "";
    private String accessibilityDescription_ = "";
    private String fallbackImageUrl_ = "";
    private ae50 imageUrls_ = AbstractC0269h.emptyProtobufList();

    static {
        SocialStatsItem socialStatsItem = new SocialStatsItem();
        DEFAULT_INSTANCE = socialStatsItem;
        AbstractC0269h.registerDefaultInstance(SocialStatsItem.class, socialStatsItem);
    }

    private SocialStatsItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006Ȉ\u0007ဉ\u0001\bဉ\u0002\tȈ\nȚ", new Object[]{"bitField0_", "currentLookBack_", "type_", "header_", "title_", "imageUrl_", "accessibilityDescription_", "changePreviousPeriodLabel_", "socialDataInfo_", "fallbackImageUrl_", "imageUrls_"});
        }
        if (iOrdinal == 3) {
            return new SocialStatsItem();
        }
        if (iOrdinal == 4) {
            return new ne21(DEFAULT_INSTANCE, 16);
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
        synchronized (SocialStatsItem.class) {
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
    public final String m11409n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PositionChangeLabel m11410o() {
        PositionChangeLabel positionChangeLabel = this.changePreviousPeriodLabel_;
        return positionChangeLabel == null ? PositionChangeLabel.m11398o() : positionChangeLabel;
    }

    /* JADX INFO: renamed from: p */
    public final String m11411p() {
        return this.fallbackImageUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final String m11412q() {
        return this.header_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m11413r() {
        return this.imageUrls_;
    }

    /* JADX INFO: renamed from: s */
    public final SocialDataInfo m11414s() {
        SocialDataInfo socialDataInfo = this.socialDataInfo_;
        return socialDataInfo == null ? SocialDataInfo.m11405n() : socialDataInfo;
    }

    /* JADX INFO: renamed from: t */
    public final Paragraph m11415t() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final k051 m11416u() {
        k051 k051VarM54930a = k051.m54930a(this.type_);
        return k051VarM54930a == null ? k051.UNRECOGNIZED : k051VarM54930a;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m11417v() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11418w() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m11419x() {
        return (this.bitField0_ & 1) != 0;
    }
}
