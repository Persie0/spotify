package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Section extends AbstractC0269h implements sre0 {
    public static final int BENEFITS_HEADER_FIELD_NUMBER = 6;
    public static final int CAROUSEL_FIELD_NUMBER = 4;
    private static final Section DEFAULT_INSTANCE;
    public static final int LISTENING_STATS_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int SECTION_ID_FIELD_NUMBER = 1;
    public static final int SHORTCUTS_FIELD_NUMBER = 3;
    public static final int SONG_DNA_FIELD_NUMBER = 9;
    public static final int SUBSCRIPTION_CARD_FIELD_NUMBER = 2;
    public static final int VIDEO_CAROUSEL_FIELD_NUMBER = 5;
    public static final int WATCH_FEED_FIELD_NUMBER = 8;
    private Object content_;
    private int contentCase_ = 0;
    private String sectionId_ = "";

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"content_", "contentCase_", "sectionId_", SubscriptionCardProto.class, ShortcutsSection.class, CarouselSection.class, VideoCarouselSection.class, BenefitsHeaderSection.class, ListeningStatsSection.class, WatchFeedSection.class, SongDNASection.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 14);
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
        synchronized (Section.class) {
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
    public final BenefitsHeaderSection m16290n() {
        return this.contentCase_ == 6 ? (BenefitsHeaderSection) this.content_ : BenefitsHeaderSection.m16270n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CarouselSection m16291o() {
        return this.contentCase_ == 4 ? (CarouselSection) this.content_ : CarouselSection.m16277n();
    }

    /* JADX INFO: renamed from: p */
    public final int m16292p() {
        int i = this.contentCase_;
        if (i == 0) {
            return 9;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: q */
    public final ListeningStatsSection m16293q() {
        return this.contentCase_ == 7 ? (ListeningStatsSection) this.content_ : ListeningStatsSection.m16285o();
    }

    /* JADX INFO: renamed from: r */
    public final String m16294r() {
        return this.sectionId_;
    }

    /* JADX INFO: renamed from: s */
    public final ShortcutsSection m16295s() {
        return this.contentCase_ == 3 ? (ShortcutsSection) this.content_ : ShortcutsSection.m16301n();
    }

    /* JADX INFO: renamed from: t */
    public final SongDNASection m16296t() {
        return this.contentCase_ == 9 ? (SongDNASection) this.content_ : SongDNASection.m16314o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final SubscriptionCardProto m16297u() {
        return this.contentCase_ == 2 ? (SubscriptionCardProto) this.content_ : SubscriptionCardProto.m16324n();
    }

    /* JADX INFO: renamed from: v */
    public final VideoCarouselSection m16298v() {
        return this.contentCase_ == 5 ? (VideoCarouselSection) this.content_ : VideoCarouselSection.m16334o();
    }

    /* JADX INFO: renamed from: w */
    public final WatchFeedSection m16299w() {
        return this.contentCase_ == 8 ? (WatchFeedSection) this.content_ : WatchFeedSection.m16348o();
    }
}
