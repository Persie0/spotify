package com.spotify.venueview.p179v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PageHeader extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int BADGE_FIELD_NUMBER = 9;
    public static final int CONCEPTS_FIELD_NUMBER = 8;
    private static final PageHeader DEFAULT_INSTANCE;
    public static final int FOLLOWERS_COUNT_FIELD_NUMBER = 7;
    public static final int LOGO_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHORT_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int SUBTITLE_FIELD_NUMBER = 6;
    public static final int VENUE_NAME_FIELD_NUMBER = 4;
    public static final int VENUE_URI_FIELD_NUMBER = 1;
    private Badge badge_;
    private int bitField0_;
    private long followersCount_;
    private String venueUri_ = "";
    private String backgroundColor_ = "";
    private String logoUrl_ = "";
    private String venueName_ = "";
    private String shortDescription_ = "";
    private String subtitle_ = "";
    private ae50 concepts_ = AbstractC0269h.emptyProtobufList();

    static {
        PageHeader pageHeader = new PageHeader();
        DEFAULT_INSTANCE = pageHeader;
        AbstractC0269h.registerDefaultInstance(PageHeader.class, pageHeader);
    }

    private PageHeader() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PageHeader m22313q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ለ\u0000\u0006Ȉ\u0007ဂ\u0001\b\u001b\tဉ\u0002", new Object[]{"bitField0_", "venueUri_", "backgroundColor_", "logoUrl_", "venueName_", "shortDescription_", "subtitle_", "followersCount_", "concepts_", HeaderConcept.class, "badge_"});
        }
        if (iOrdinal == 3) {
            return new PageHeader();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 18);
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
        synchronized (PageHeader.class) {
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
    public final String m22314n() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Badge m22315o() {
        Badge badge = this.badge_;
        return badge == null ? Badge.m22276n() : badge;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m22316p() {
        return this.concepts_;
    }

    /* JADX INFO: renamed from: r */
    public final long m22317r() {
        return this.followersCount_;
    }

    /* JADX INFO: renamed from: s */
    public final String m22318s() {
        return this.logoUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final String m22319t() {
        return this.shortDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m22320u() {
        return this.venueName_;
    }

    /* JADX INFO: renamed from: v */
    public final String m22321v() {
        return this.venueUri_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22322w() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m22323x() {
        return (this.bitField0_ & 2) != 0;
    }
}
