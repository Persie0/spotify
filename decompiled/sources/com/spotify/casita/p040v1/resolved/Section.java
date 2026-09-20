package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.i2z0;
import p204p.mrx0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Section extends AbstractC0269h implements sre0 {
    public static final int ACTION_CARD_CAROUSEL_FIELD_NUMBER = 15;
    public static final int ANCHORS_FIELD_NUMBER = 7;
    public static final int ASSOCIATED_PREVIEW_FIELD_NUMBER = 27;
    public static final int AUDIO_PROMO_FIELD_NUMBER = 33;
    public static final int AUDIO_SPOTLIGHT_FIELD_NUMBER = 36;
    public static final int BANNER_FIELD_NUMBER = 19;
    public static final int BANNER_WITH_ANIMATIONS_FIELD_NUMBER = 28;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 9;
    public static final int CAMPAIGN_LINK_CAROUSEL_FIELD_NUMBER = 23;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 38;
    public static final int CONTENT_EVALUATION_LIST_FIELD_NUMBER = 8;
    private static final Section DEFAULT_INSTANCE;
    public static final int FULL_BLEED_BANNER_FIELD_NUMBER = 26;
    public static final int IMAGE_BRAND_AD_FIELD_NUMBER = 21;
    public static final int IMAGE_LINK_FIELD_NUMBER = 3;
    public static final int IMMERSIVE_PREVIEW_FIELD_NUMBER = 6;
    public static final int INLINE_CARD_FIELD_NUMBER = 34;
    public static final int INTERACTIVE_ENTRYPOINT_FIELD_NUMBER = 30;
    public static final int LIVE_EVENT_FIELD_NUMBER = 16;
    public static final int NARRATIVE_FIELD_NUMBER = 29;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_LINK_PROMO_FIELD_NUMBER = 35;
    public static final int PRERELEASE_PREVIEW_FIELD_NUMBER = 44;
    public static final int PREVIEW_CAROUSEL_FIELD_NUMBER = 37;
    public static final int PREVIEW_FIELD_NUMBER = 4;
    public static final int PREVIEW_PROMOTION_CAROUSEL_FIELD_NUMBER = 39;
    public static final int PROMOTION_V1_FIELD_NUMBER = 12;
    public static final int PROMOTION_V3_FIELD_NUMBER = 13;
    public static final int PROMPTABLE_SECTION_FIELD_NUMBER = 32;
    public static final int PROMPTED_WORLDS_SHELF_FIELD_NUMBER = 40;
    public static final int RECENTS_SHELF_FIELD_NUMBER = 10;
    public static final int REFLECTION_FIELD_NUMBER = 41;
    public static final int SECTION_INFO_FIELD_NUMBER = 1;
    public static final int SHORTCUTS_FIELD_NUMBER = 2;
    public static final int SHOWCASE_FIELD_NUMBER = 17;
    public static final int TOP_STORY_CAROUSEL_FIELD_NUMBER = 31;
    public static final int USER_PROMPTED_WORLD_ENTRYPOINT_FIELD_NUMBER = 42;
    public static final int VERTICAL_SINGLE_ENTRY_FIELD_NUMBER = 24;
    public static final int VIDEO_BRAND_AD_FIELD_NUMBER = 20;
    public static final int VIDEO_CAROUSEL_FIELD_NUMBER = 25;
    public static final int VIDEO_PROMO_FIELD_NUMBER = 18;
    public static final int WATCH_FEED_FIELD_NUMBER = 11;
    private int bitField0_;
    private int featureTypeCase_ = 0;
    private Object featureType_;
    private SectionInfo sectionInfo_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
    }

    /* JADX INFO: renamed from: d0 */
    public static Section m5784d0(gva gvaVar) {
        return (Section) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final FullBleedBanner m5786A() {
        return this.featureTypeCase_ == 26 ? (FullBleedBanner) this.featureType_ : FullBleedBanner.m5642q();
    }

    /* JADX INFO: renamed from: B */
    public final ImageBrandAd m5787B() {
        return this.featureTypeCase_ == 21 ? (ImageBrandAd) this.featureType_ : ImageBrandAd.m5669q();
    }

    /* JADX INFO: renamed from: C */
    public final ImageLink m5788C() {
        return this.featureTypeCase_ == 3 ? (ImageLink) this.featureType_ : ImageLink.m5673p();
    }

    /* JADX INFO: renamed from: D */
    public final ImmersivePreview m5789D() {
        return this.featureTypeCase_ == 6 ? (ImmersivePreview) this.featureType_ : ImmersivePreview.m5679o();
    }

    /* JADX INFO: renamed from: E */
    public final InlineCard m5790E() {
        return this.featureTypeCase_ == 34 ? (InlineCard) this.featureType_ : InlineCard.m5683o();
    }

    /* JADX INFO: renamed from: F */
    public final InteractiveEntrypoint m5791F() {
        return this.featureTypeCase_ == 30 ? (InteractiveEntrypoint) this.featureType_ : InteractiveEntrypoint.m5686o();
    }

    /* JADX INFO: renamed from: G */
    public final LiveEvent m5792G() {
        return this.featureTypeCase_ == 16 ? (LiveEvent) this.featureType_ : LiveEvent.m5700o();
    }

    /* JADX INFO: renamed from: H */
    public final Narrative m5793H() {
        return this.featureTypeCase_ == 29 ? (Narrative) this.featureType_ : Narrative.m5705o();
    }

    /* JADX INFO: renamed from: I */
    public final PlayLinkPromo m5794I() {
        return this.featureTypeCase_ == 35 ? (PlayLinkPromo) this.featureType_ : PlayLinkPromo.m5713p();
    }

    /* JADX INFO: renamed from: J */
    public final PrereleasePreview m5795J() {
        return this.featureTypeCase_ == 44 ? (PrereleasePreview) this.featureType_ : PrereleasePreview.m5718n();
    }

    /* JADX INFO: renamed from: K */
    public final Preview m5796K() {
        return this.featureTypeCase_ == 4 ? (Preview) this.featureType_ : Preview.m5722o();
    }

    /* JADX INFO: renamed from: L */
    public final PreviewCarousel m5797L() {
        return this.featureTypeCase_ == 37 ? (PreviewCarousel) this.featureType_ : PreviewCarousel.m5726o();
    }

    /* JADX INFO: renamed from: M */
    public final PreviewPromotionCarousel m5798M() {
        return this.featureTypeCase_ == 39 ? (PreviewPromotionCarousel) this.featureType_ : PreviewPromotionCarousel.m5729p();
    }

    /* JADX INFO: renamed from: N */
    public final PromotionV1 m5799N() {
        return this.featureTypeCase_ == 12 ? (PromotionV1) this.featureType_ : PromotionV1.m5736p();
    }

    /* JADX INFO: renamed from: O */
    public final PromotionV3 m5800O() {
        return this.featureTypeCase_ == 13 ? (PromotionV3) this.featureType_ : PromotionV3.m5742p();
    }

    /* JADX INFO: renamed from: P */
    public final PromptableSection m5801P() {
        return this.featureTypeCase_ == 32 ? (PromptableSection) this.featureType_ : PromptableSection.m5746o();
    }

    /* JADX INFO: renamed from: Q */
    public final PromptedWorldsShelf m5802Q() {
        return this.featureTypeCase_ == 40 ? (PromptedWorldsShelf) this.featureType_ : PromptedWorldsShelf.m5752o();
    }

    /* JADX INFO: renamed from: R */
    public final RecentsShelf m5803R() {
        return this.featureTypeCase_ == 10 ? (RecentsShelf) this.featureType_ : RecentsShelf.m5758o();
    }

    /* JADX INFO: renamed from: S */
    public final Reflection m5804S() {
        return this.featureTypeCase_ == 41 ? (Reflection) this.featureType_ : Reflection.m5763o();
    }

    /* JADX INFO: renamed from: T */
    public final SectionInfo m5805T() {
        SectionInfo sectionInfo = this.sectionInfo_;
        return sectionInfo == null ? SectionInfo.m5828o() : sectionInfo;
    }

    /* JADX INFO: renamed from: U */
    public final Shortcuts m5806U() {
        return this.featureTypeCase_ == 2 ? (Shortcuts) this.featureType_ : Shortcuts.m5831o();
    }

    /* JADX INFO: renamed from: V */
    public final Showcase m5807V() {
        return this.featureTypeCase_ == 17 ? (Showcase) this.featureType_ : Showcase.m5835q();
    }

    /* JADX INFO: renamed from: W */
    public final TopStoryCarousel m5808W() {
        return this.featureTypeCase_ == 31 ? (TopStoryCarousel) this.featureType_ : TopStoryCarousel.m5854o();
    }

    /* JADX INFO: renamed from: X */
    public final UserPromptedWorldEntrypoint m5809X() {
        return this.featureTypeCase_ == 42 ? (UserPromptedWorldEntrypoint) this.featureType_ : UserPromptedWorldEntrypoint.m5856n();
    }

    /* JADX INFO: renamed from: Y */
    public final VerticalSingleEntry m5810Y() {
        return this.featureTypeCase_ == 24 ? (VerticalSingleEntry) this.featureType_ : VerticalSingleEntry.m5860p();
    }

    /* JADX INFO: renamed from: Z */
    public final VideoBrandAd m5811Z() {
        return this.featureTypeCase_ == 20 ? (VideoBrandAd) this.featureType_ : VideoBrandAd.m5866q();
    }

    /* JADX INFO: renamed from: a0 */
    public final VideoCarousel m5812a0() {
        return this.featureTypeCase_ == 25 ? (VideoCarousel) this.featureType_ : VideoCarousel.m5870o();
    }

    /* JADX INFO: renamed from: b0 */
    public final VideoPromo m5813b0() {
        return this.featureTypeCase_ == 18 ? (VideoPromo) this.featureType_ : VideoPromo.m5873p();
    }

    /* JADX INFO: renamed from: c0 */
    public final WatchFeed m5814c0() {
        return this.featureTypeCase_ == 11 ? (WatchFeed) this.featureType_ : WatchFeed.m5879o();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000(\u0001\u0001\u0001,(\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000(<\u0000)<\u0000*<\u0000,<\u0000", new Object[]{"featureType_", "featureTypeCase_", "bitField0_", "sectionInfo_", Shortcuts.class, ImageLink.class, Preview.class, ImmersivePreview.class, Anchors.class, ContentEvaluationList.class, CallToAction.class, RecentsShelf.class, WatchFeed.class, PromotionV1.class, PromotionV3.class, ActionCardCarousel.class, LiveEvent.class, Showcase.class, VideoPromo.class, Banner.class, VideoBrandAd.class, ImageBrandAd.class, CampaignLinkCarousel.class, VerticalSingleEntry.class, VideoCarousel.class, FullBleedBanner.class, AssociatedPreview.class, BannerWithAnimations.class, Narrative.class, InteractiveEntrypoint.class, TopStoryCarousel.class, PromptableSection.class, AudioPromo.class, InlineCard.class, PlayLinkPromo.class, AudioSpotlight.class, PreviewCarousel.class, ConcertCampaign.class, PreviewPromotionCarousel.class, PromptedWorldsShelf.class, Reflection.class, UserPromptedWorldEntrypoint.class, PrereleasePreview.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(9);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ActionCardCarousel m5815o() {
        return this.featureTypeCase_ == 15 ? (ActionCardCarousel) this.featureType_ : ActionCardCarousel.m5563o();
    }

    /* JADX INFO: renamed from: p */
    public final Anchors m5816p() {
        return this.featureTypeCase_ == 7 ? (Anchors) this.featureType_ : Anchors.m5566o();
    }

    /* JADX INFO: renamed from: q */
    public final AssociatedPreview m5817q() {
        return this.featureTypeCase_ == 27 ? (AssociatedPreview) this.featureType_ : AssociatedPreview.m5569o();
    }

    /* JADX INFO: renamed from: r */
    public final AudioPromo m5818r() {
        return this.featureTypeCase_ == 33 ? (AudioPromo) this.featureType_ : AudioPromo.m5573p();
    }

    /* JADX INFO: renamed from: s */
    public final AudioSpotlight m5819s() {
        return this.featureTypeCase_ == 36 ? (AudioSpotlight) this.featureType_ : AudioSpotlight.m5579p();
    }

    /* JADX INFO: renamed from: t */
    public final Banner m5820t() {
        return this.featureTypeCase_ == 19 ? (Banner) this.featureType_ : Banner.m5585p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final BannerWithAnimations m5821u() {
        return this.featureTypeCase_ == 28 ? (BannerWithAnimations) this.featureType_ : BannerWithAnimations.m5589p();
    }

    /* JADX INFO: renamed from: v */
    public final CallToAction m5822v() {
        return this.featureTypeCase_ == 9 ? (CallToAction) this.featureType_ : CallToAction.m5593o();
    }

    /* JADX INFO: renamed from: w */
    public final CampaignLinkCarousel m5823w() {
        return this.featureTypeCase_ == 23 ? (CampaignLinkCarousel) this.featureType_ : CampaignLinkCarousel.m5599p();
    }

    /* JADX INFO: renamed from: x */
    public final ConcertCampaign m5824x() {
        return this.featureTypeCase_ == 38 ? (ConcertCampaign) this.featureType_ : ConcertCampaign.m5604p();
    }

    /* JADX INFO: renamed from: y */
    public final ContentEvaluationList m5825y() {
        return this.featureTypeCase_ == 8 ? (ContentEvaluationList) this.featureType_ : ContentEvaluationList.m5607o();
    }

    /* JADX INFO: renamed from: z */
    public final int m5826z() {
        return mrx0.m62647a(this.featureTypeCase_);
    }
}
