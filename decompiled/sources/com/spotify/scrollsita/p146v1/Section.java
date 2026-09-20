package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.o5z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u5z0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Section extends AbstractC0269h implements sre0 {
    public static final int AI_DUBBING_FIELD_NUMBER = 18;
    public static final int ALBUM_INFO_FIELD_NUMBER = 37;
    public static final int BYOM_SCROLL_CARD_FIELD_NUMBER = 39;
    public static final int CHAPTERS_FIELD_NUMBER = 16;
    public static final int COMMENTS_FIELD_NUMBER = 1;
    public static final int COMPANION_CONTENT_FIELD_NUMBER = 19;
    public static final int CONCERT_CAMPAIGN_FIELD_NUMBER = 31;
    public static final int CONTENT_STORY_FIELD_NUMBER = 25;
    public static final int CREATOR_BIO_FIELD_NUMBER = 2;
    public static final int CREDITS_FIELD_NUMBER = 4;
    public static final int CULTURAL_MOMENTS_FIELD_NUMBER = 8;
    private static final Section DEFAULT_INSTANCE;
    public static final int DISCOVERY_FEED_FIELD_NUMBER = 3;
    public static final int EPISODE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int EXTRAS_FIELD_NUMBER = 17;
    public static final int E_READER_FIELD_NUMBER = 35;
    public static final int GATED_CONTENT_FIELD_NUMBER = 22;
    public static final int IMAGE_BRAND_AD_FIELD_NUMBER = 30;
    public static final int KALLAXDETAILS_FIELD_NUMBER = 29;
    public static final int LEAVEBEHINDS_FIELD_NUMBER = 36;
    public static final int LISTENING_PARTY_FIELD_NUMBER = 13;
    public static final int LIVE_EVENTS_FIELD_NUMBER = 11;
    public static final int LIVE_UPSELL_FIELD_NUMBER = 15;
    public static final int LPM_SHELF_FIELD_NUMBER = 38;
    public static final int LYRICS_FIELD_NUMBER = 5;
    public static final int MARTINI_ENTRY_POINT_FIELD_NUMBER = 32;
    public static final int MERCH_FIELD_NUMBER = 6;
    public static final int NOTES_FIELD_NUMBER = 33;
    private static volatile r2n0 PARSER = null;
    public static final int POLLS_FIELD_NUMBER = 21;
    public static final int PRE_RELEASE_FIELD_NUMBER = 12;
    public static final int QUEUE_FIELD_NUMBER = 34;
    public static final int QUIZ_FIELD_NUMBER = 28;
    public static final int RELATED_CONTENT_FIELD_NUMBER = 26;
    public static final int SECTION_INFO_FIELD_NUMBER = 23;
    public static final int SHOW_DESCRIPTION_FIELD_NUMBER = 9;
    public static final int SMART_SHUFFLE_FIELD_NUMBER = 7;
    public static final int SONG_DNA_FIELD_NUMBER = 27;
    public static final int TRANSCRIPT_FIELD_NUMBER = 20;
    public static final int UNMAPPED_RELATED_AUDIO_FIELD_NUMBER = 24;
    public static final int VIDEO_CAROUSEL_FIELD_NUMBER = 14;
    private int bitField0_;
    private SectionInfo sectionInfo_;
    private int sectionTypeCase_ = 0;
    private Object sectionType_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
    }

    /* JADX INFO: renamed from: A */
    public static void m20586A(Section section, PreRelease preRelease) {
        section.getClass();
        preRelease.getClass();
        section.sectionType_ = preRelease;
        section.sectionTypeCase_ = 12;
    }

    /* JADX INFO: renamed from: B */
    public static void m20587B(Section section, ShowDescription showDescription) {
        section.getClass();
        showDescription.getClass();
        section.sectionType_ = showDescription;
        section.sectionTypeCase_ = 9;
    }

    /* JADX INFO: renamed from: C */
    public static void m20588C(Section section, SmartShuffle smartShuffle) {
        section.getClass();
        smartShuffle.getClass();
        section.sectionType_ = smartShuffle;
        section.sectionTypeCase_ = 7;
    }

    /* JADX INFO: renamed from: D */
    public static void m20589D(Section section, Transcript transcript) {
        section.getClass();
        transcript.getClass();
        section.sectionType_ = transcript;
        section.sectionTypeCase_ = 20;
    }

    /* JADX INFO: renamed from: I0 */
    public static o5z0 m20590I0() {
        return (o5z0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m20591n(Section section, Chapters chapters) {
        section.getClass();
        chapters.getClass();
        section.sectionType_ = chapters;
        section.sectionTypeCase_ = 16;
    }

    /* JADX INFO: renamed from: o */
    public static void m20592o(Section section, Comments comments) {
        section.getClass();
        comments.getClass();
        section.sectionType_ = comments;
        section.sectionTypeCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m20593p(Section section, CompanionContent companionContent) {
        section.getClass();
        companionContent.getClass();
        section.sectionType_ = companionContent;
        section.sectionTypeCase_ = 19;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20594q(Section section, CreatorBio creatorBio) {
        section.getClass();
        creatorBio.getClass();
        section.sectionType_ = creatorBio;
        section.sectionTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: r */
    public static void m20595r(Section section, Credits credits) {
        section.getClass();
        credits.getClass();
        section.sectionType_ = credits;
        section.sectionTypeCase_ = 4;
    }

    /* JADX INFO: renamed from: s */
    public static void m20596s(Section section, CulturalMoments culturalMoments) {
        section.getClass();
        culturalMoments.getClass();
        section.sectionType_ = culturalMoments;
        section.sectionTypeCase_ = 8;
    }

    /* JADX INFO: renamed from: t */
    public static void m20597t(Section section, EpisodeDescription episodeDescription) {
        section.getClass();
        episodeDescription.getClass();
        section.sectionType_ = episodeDescription;
        section.sectionTypeCase_ = 10;
    }

    /* JADX INFO: renamed from: u */
    public static void m20598u(Section section, GatedContent gatedContent) {
        section.getClass();
        gatedContent.getClass();
        section.sectionType_ = gatedContent;
        section.sectionTypeCase_ = 22;
    }

    /* JADX INFO: renamed from: v */
    public static void m20599v(Section section, ListeningParty listeningParty) {
        section.getClass();
        listeningParty.getClass();
        section.sectionType_ = listeningParty;
        section.sectionTypeCase_ = 13;
    }

    /* JADX INFO: renamed from: w */
    public static void m20600w(Section section, LiveEvents liveEvents) {
        section.getClass();
        liveEvents.getClass();
        section.sectionType_ = liveEvents;
        section.sectionTypeCase_ = 11;
    }

    /* JADX INFO: renamed from: x */
    public static void m20601x(Section section, Lyrics lyrics) {
        section.getClass();
        lyrics.getClass();
        section.sectionType_ = lyrics;
        section.sectionTypeCase_ = 5;
    }

    /* JADX INFO: renamed from: y */
    public static void m20602y(Section section, Merch merch) {
        section.getClass();
        merch.getClass();
        section.sectionType_ = merch;
        section.sectionTypeCase_ = 6;
    }

    /* JADX INFO: renamed from: z */
    public static void m20603z(Section section, Polls polls) {
        section.getClass();
        polls.getClass();
        section.sectionType_ = polls;
        section.sectionTypeCase_ = 21;
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m20604A0() {
        return this.sectionTypeCase_ == 28;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m20605B0() {
        return this.sectionTypeCase_ == 26;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m20606C0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m20607D0() {
        return this.sectionTypeCase_ == 9;
    }

    /* JADX INFO: renamed from: E */
    public final BYOMScrollCard m20608E() {
        return this.sectionTypeCase_ == 39 ? (BYOMScrollCard) this.sectionType_ : BYOMScrollCard.m20447n();
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m20609E0() {
        return this.sectionTypeCase_ == 27;
    }

    /* JADX INFO: renamed from: F */
    public final Chapters m20610F() {
        return this.sectionTypeCase_ == 16 ? (Chapters) this.sectionType_ : Chapters.m20452o();
    }

    /* JADX INFO: renamed from: F0 */
    public final boolean m20611F0() {
        return this.sectionTypeCase_ == 20;
    }

    /* JADX INFO: renamed from: G */
    public final ConcertCampaign m20612G() {
        return this.sectionTypeCase_ == 31 ? (ConcertCampaign) this.sectionType_ : ConcertCampaign.m20459o();
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m20613G0() {
        return this.sectionTypeCase_ == 24;
    }

    /* JADX INFO: renamed from: H */
    public final ContentStory m20614H() {
        return this.sectionTypeCase_ == 25 ? (ContentStory) this.sectionType_ : ContentStory.m20461n();
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m20615H0() {
        return this.sectionTypeCase_ == 14;
    }

    /* JADX INFO: renamed from: I */
    public final CreatorBio m20616I() {
        return this.sectionTypeCase_ == 2 ? (CreatorBio) this.sectionType_ : CreatorBio.m20465q();
    }

    /* JADX INFO: renamed from: J */
    public final Credits m20617J() {
        return this.sectionTypeCase_ == 4 ? (Credits) this.sectionType_ : Credits.m20470q();
    }

    /* JADX INFO: renamed from: K */
    public final CulturalMoments m20618K() {
        return this.sectionTypeCase_ == 8 ? (CulturalMoments) this.sectionType_ : CulturalMoments.m20474n();
    }

    /* JADX INFO: renamed from: L */
    public final DiscoveryFeed m20619L() {
        return this.sectionTypeCase_ == 3 ? (DiscoveryFeed) this.sectionType_ : DiscoveryFeed.m20477n();
    }

    /* JADX INFO: renamed from: M */
    public final EReader m20620M() {
        return this.sectionTypeCase_ == 35 ? (EReader) this.sectionType_ : EReader.m20483n();
    }

    /* JADX INFO: renamed from: N */
    public final EpisodeDescription m20621N() {
        return this.sectionTypeCase_ == 10 ? (EpisodeDescription) this.sectionType_ : EpisodeDescription.m20503p();
    }

    /* JADX INFO: renamed from: O */
    public final ImageBrandAd m20622O() {
        return this.sectionTypeCase_ == 30 ? (ImageBrandAd) this.sectionType_ : ImageBrandAd.m20519p();
    }

    /* JADX INFO: renamed from: P */
    public final Leavebehinds m20623P() {
        return this.sectionTypeCase_ == 36 ? (Leavebehinds) this.sectionType_ : Leavebehinds.m20522n();
    }

    /* JADX INFO: renamed from: Q */
    public final LiveEvents m20624Q() {
        return this.sectionTypeCase_ == 11 ? (LiveEvents) this.sectionType_ : LiveEvents.m20525o();
    }

    /* JADX INFO: renamed from: R */
    public final LiveUpsell m20625R() {
        return this.sectionTypeCase_ == 15 ? (LiveUpsell) this.sectionType_ : LiveUpsell.m20528n();
    }

    /* JADX INFO: renamed from: S */
    public final LpmShelf m20626S() {
        return this.sectionTypeCase_ == 38 ? (LpmShelf) this.sectionType_ : LpmShelf.m20530n();
    }

    /* JADX INFO: renamed from: T */
    public final MartiniEntryPoint m20627T() {
        return this.sectionTypeCase_ == 32 ? (MartiniEntryPoint) this.sectionType_ : MartiniEntryPoint.m20534n();
    }

    /* JADX INFO: renamed from: U */
    public final Merch m20628U() {
        return this.sectionTypeCase_ == 6 ? (Merch) this.sectionType_ : Merch.m20536n();
    }

    /* JADX INFO: renamed from: V */
    public final Notes m20629V() {
        return this.sectionTypeCase_ == 33 ? (Notes) this.sectionType_ : Notes.m20540n();
    }

    /* JADX INFO: renamed from: W */
    public final PreRelease m20630W() {
        return this.sectionTypeCase_ == 12 ? (PreRelease) this.sectionType_ : PreRelease.m20552n();
    }

    /* JADX INFO: renamed from: X */
    public final Quiz m20631X() {
        return this.sectionTypeCase_ == 28 ? (Quiz) this.sectionType_ : Quiz.m20555p();
    }

    /* JADX INFO: renamed from: Y */
    public final RelatedContent m20632Y() {
        return this.sectionTypeCase_ == 26 ? (RelatedContent) this.sectionType_ : RelatedContent.m20579n();
    }

    /* JADX INFO: renamed from: Z */
    public final SectionInfo m20633Z() {
        SectionInfo sectionInfo = this.sectionInfo_;
        return sectionInfo == null ? SectionInfo.m20660n() : sectionInfo;
    }

    /* JADX INFO: renamed from: a0 */
    public final u5z0 m20634a0() {
        switch (this.sectionTypeCase_) {
            case 0:
                return u5z0.f227177k1;
            case 1:
                return u5z0.f227158a;
            case 2:
                return u5z0.f227160b;
            case 3:
                return u5z0.f227162c;
            case 4:
                return u5z0.f227164d;
            case 5:
                return u5z0.f227166e;
            case 6:
                return u5z0.f227168f;
            case 7:
                return u5z0.f227170g;
            case 8:
                return u5z0.f227172h;
            case 9:
                return u5z0.f227174i;
            case 10:
                return u5z0.f227179t;
            case 11:
                return u5z0.f227152X;
            case 12:
                return u5z0.f227154Y;
            case 13:
                return u5z0.f227156Z;
            case 14:
                return u5z0.f227140L0;
            case 15:
                return u5z0.f227141M0;
            case 16:
                return u5z0.f227142N0;
            case 17:
                return u5z0.f227143O0;
            case 18:
                return u5z0.f227144P0;
            case 19:
                return u5z0.f227145Q0;
            case 20:
                return u5z0.f227146R0;
            case 21:
                return u5z0.f227147S0;
            case 22:
                return u5z0.f227148T0;
            case 23:
            default:
                return null;
            case 24:
                return u5z0.f227149U0;
            case 25:
                return u5z0.f227150V0;
            case 26:
                return u5z0.f227151W0;
            case 27:
                return u5z0.f227153X0;
            case 28:
                return u5z0.f227155Y0;
            case 29:
                return u5z0.f227157Z0;
            case 30:
                return u5z0.f227159a1;
            case 31:
                return u5z0.f227161b1;
            case 32:
                return u5z0.f227163c1;
            case 33:
                return u5z0.f227165d1;
            case 34:
                return u5z0.f227167e1;
            case 35:
                return u5z0.f227169f1;
            case 36:
                return u5z0.f227171g1;
            case 37:
                return u5z0.f227173h1;
            case 38:
                return u5z0.f227175i1;
            case 39:
                return u5z0.f227176j1;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final ShowDescription m20635b0() {
        return this.sectionTypeCase_ == 9 ? (ShowDescription) this.sectionType_ : ShowDescription.m20665p();
    }

    /* JADX INFO: renamed from: c0 */
    public final SongDNA m20636c0() {
        return this.sectionTypeCase_ == 27 ? (SongDNA) this.sectionType_ : SongDNA.m20670n();
    }

    /* JADX INFO: renamed from: d0 */
    public final Transcript m20637d0() {
        return this.sectionTypeCase_ == 20 ? (Transcript) this.sectionType_ : Transcript.m20676n();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000'\u0001\u0001\u0001''\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017ဉ\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000'<\u0000", new Object[]{"sectionType_", "sectionTypeCase_", "bitField0_", Comments.class, CreatorBio.class, DiscoveryFeed.class, Credits.class, Lyrics.class, Merch.class, SmartShuffle.class, CulturalMoments.class, ShowDescription.class, EpisodeDescription.class, LiveEvents.class, PreRelease.class, ListeningParty.class, VideoCarousel.class, LiveUpsell.class, Chapters.class, Extras.class, AIDubbing.class, CompanionContent.class, Transcript.class, Polls.class, GatedContent.class, "sectionInfo_", UnmappedRelatedAudio.class, ContentStory.class, RelatedContent.class, SongDNA.class, Quiz.class, KallaxDetails.class, ImageBrandAd.class, ConcertCampaign.class, MartiniEntryPoint.class, Notes.class, Queue.class, EReader.class, Leavebehinds.class, AlbumInfo.class, LpmShelf.class, BYOMScrollCard.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new o5z0(DEFAULT_INSTANCE);
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

    /* JADX INFO: renamed from: e0 */
    public final UnmappedRelatedAudio m20638e0() {
        return this.sectionTypeCase_ == 24 ? (UnmappedRelatedAudio) this.sectionType_ : UnmappedRelatedAudio.m20679n();
    }

    /* JADX INFO: renamed from: f0 */
    public final VideoCarousel m20639f0() {
        return this.sectionTypeCase_ == 14 ? (VideoCarousel) this.sectionType_ : VideoCarousel.m20685n();
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m20640g0() {
        return this.sectionTypeCase_ == 39;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m20641h0() {
        return this.sectionTypeCase_ == 16;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m20642i0() {
        return this.sectionTypeCase_ == 31;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m20643j0() {
        return this.sectionTypeCase_ == 25;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m20644k0() {
        return this.sectionTypeCase_ == 2;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m20645l0() {
        return this.sectionTypeCase_ == 4;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m20646m0() {
        return this.sectionTypeCase_ == 8;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m20647n0() {
        return this.sectionTypeCase_ == 3;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m20648o0() {
        return this.sectionTypeCase_ == 35;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m20649p0() {
        return this.sectionTypeCase_ == 10;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m20650q0() {
        return this.sectionTypeCase_ == 30;
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m20651r0() {
        return this.sectionTypeCase_ == 36;
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m20652s0() {
        return this.sectionTypeCase_ == 11;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m20653t0() {
        return this.sectionTypeCase_ == 15;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m20654u0() {
        return this.sectionTypeCase_ == 38;
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m20655v0() {
        return this.sectionTypeCase_ == 32;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m20656w0() {
        return this.sectionTypeCase_ == 6;
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m20657x0() {
        return this.sectionTypeCase_ == 33;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m20658y0() {
        return this.sectionTypeCase_ == 12;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m20659z0() {
        return this.sectionTypeCase_ == 34;
    }
}
