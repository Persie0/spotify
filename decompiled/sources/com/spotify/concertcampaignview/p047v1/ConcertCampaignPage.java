package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ConcertCampaignPage extends AbstractC0269h implements sre0 {
    public static final int CONCERT_CAMPAIGN_URI_FIELD_NUMBER = 1;
    private static final ConcertCampaignPage DEFAULT_INSTANCE;
    public static final int LEGAL_TEXT_FIELD_NUMBER = 5;
    public static final int NEARBY_CONCERT_LOCATION_FIELD_NUMBER = 2;
    public static final int NEARBY_ROUTINGS_FIELD_NUMBER = 3;
    public static final int NEARBY_SECTION_SUBTITLE_FIELD_NUMBER = 7;
    public static final int NEARBY_SECTION_TITLE_FIELD_NUMBER = 6;
    public static final int OTHER_ROUTINGS_FIELD_NUMBER = 4;
    public static final int OTHER_SECTION_SUBTITLE_FIELD_NUMBER = 9;
    public static final int OTHER_SECTION_TITLE_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String concertCampaignUri_ = "";
    private String nearbyConcertLocation_ = "";
    private ae50 nearbyRoutings_ = AbstractC0269h.emptyProtobufList();
    private ae50 otherRoutings_ = AbstractC0269h.emptyProtobufList();
    private String legalText_ = "";
    private String nearbySectionTitle_ = "";
    private String nearbySectionSubtitle_ = "";
    private String otherSectionTitle_ = "";
    private String otherSectionSubtitle_ = "";

    static {
        ConcertCampaignPage concertCampaignPage = new ConcertCampaignPage();
        DEFAULT_INSTANCE = concertCampaignPage;
        AbstractC0269h.registerDefaultInstance(ConcertCampaignPage.class, concertCampaignPage);
    }

    private ConcertCampaignPage() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002ለ\u0000\u0003\u001b\u0004\u001b\u0005Ȉ\u0006ለ\u0001\u0007ለ\u0002\bለ\u0003\tለ\u0004", new Object[]{"bitField0_", "concertCampaignUri_", "nearbyConcertLocation_", "nearbyRoutings_", CampaignRoutingWithStatus.class, "otherRoutings_", CampaignRoutingWithStatus.class, "legalText_", "nearbySectionTitle_", "nearbySectionSubtitle_", "otherSectionTitle_", "otherSectionSubtitle_"});
        }
        if (iOrdinal == 3) {
            return new ConcertCampaignPage();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 1);
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
        synchronized (ConcertCampaignPage.class) {
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
    public final String m6969n() {
        return this.legalText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m6970o() {
        return this.nearbyConcertLocation_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m6971p() {
        return this.nearbyRoutings_;
    }

    /* JADX INFO: renamed from: q */
    public final String m6972q() {
        return this.nearbySectionSubtitle_;
    }

    /* JADX INFO: renamed from: r */
    public final String m6973r() {
        return this.nearbySectionTitle_;
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m6974s() {
        return this.otherRoutings_;
    }

    /* JADX INFO: renamed from: t */
    public final String m6975t() {
        return this.otherSectionSubtitle_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m6976u() {
        return this.otherSectionTitle_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6977v() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m6978w() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m6979x() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m6980y() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m6981z() {
        return (this.bitField0_ & 8) != 0;
    }
}
