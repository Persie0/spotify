package p204p;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;

/* JADX INFO: loaded from: classes2.dex */
public enum ntx implements od50 {
    UNKNOWN_EXTENSION(0),
    CANVAZ(1),
    STORYLINES(2),
    PODCAST_TOPICS(3),
    PODCAST_SEGMENTS(4),
    AUDIO_FILES(5),
    TRACK_DESCRIPTOR(6),
    PODCAST_COUNTER(7),
    ARTIST_V4(8),
    ALBUM_V4(9),
    TRACK_V4(10),
    SHOW_V4(11),
    EPISODE_V4(12),
    PODCAST_HTML_DESCRIPTION(13),
    PODCAST_QUOTES(14),
    USER_PROFILE(15),
    CANVAS_V1(16),
    SHOW_V4_BASE(17),
    SHOW_V4_EPISODES_ASSOC(18),
    TRACK_DESCRIPTOR_SIGNATURES(19),
    PODCAST_AD_SEGMENTS(20),
    EPISODE_TRANSCRIPTS(21),
    PODCAST_SUBSCRIPTIONS(22),
    EXTRACTED_COLOR(23),
    PODCAST_VIRALITY(24),
    IMAGE_SPARKLES_HACK(25),
    PODCAST_POPULARITY_HACK(26),
    AUTOMIX_MODE(27),
    CUEPOINTS(28),
    PODCAST_POLL(29),
    EPISODE_ACCESS(30),
    SHOW_ACCESS(31),
    PODCAST_QNA(32),
    CLIPS(33),
    SHOW_V5(34),
    EPISODE_V5(35),
    PODCAST_CTA_CARDS(36),
    PODCAST_RATING(37),
    DISPLAY_SEGMENTS(38),
    GREENROOM(39),
    USER_CREATED(40),
    SHOW_DESCRIPTION(41),
    SHOW_HTML_DESCRIPTION(42),
    SHOW_PLAYABILITY(43),
    EPISODE_DESCRIPTION(44),
    EPISODE_HTML_DESCRIPTION(45),
    EPISODE_PLAYABILITY(46),
    SHOW_EPISODES_ASSOC(47),
    CLIENT_CONFIG(48),
    PLAYLISTABILITY(49),
    AUDIOBOOK_V5(50),
    CHAPTER_V5(51),
    AUDIOBOOK_SPECIFICS(52),
    EPISODE_RANKING(53),
    HTML_DESCRIPTION(54),
    CREATOR_CHANNEL(55),
    AUDIOBOOK_PROVIDERS(56),
    PLAY_TRAIT(57),
    CONTENT_WARNING(58),
    IMAGE_CUE(59),
    STREAM_COUNT(60),
    AUDIO_ATTRIBUTES(61),
    NAVIGABLE_TRAIT(62),
    NEXT_BEST_EPISODE(63),
    AUDIOBOOK_PRICE(64),
    EXPRESSIVE_PLAYLISTS(65),
    DYNAMIC_SHOW_EPISODE(66),
    LIVE(67),
    SKIP_PLAYED(68),
    AD_BREAK_FREE_PODCASTS(69),
    ASSOCIATIONS(70),
    PLAYLIST_EVALUATION(71),
    CACHE_INVALIDATIONS(72),
    LIVESTREAM_ENTITY(73),
    SINGLE_TAP_REACTIONS(74),
    USER_COMMENTS(75),
    CLIENT_RESTRICTIONS(76),
    PODCAST_GUEST(77),
    PLAYABILITY(78),
    COVER_IMAGE(79),
    SHARE_TRAIT(80),
    INSTANCE_SHARING(81),
    ARTIST_TOUR(82),
    AUDIOBOOK_GENRE(83),
    CONCEPT(84),
    ORIGINAL_VIDEO(85),
    SMART_SHUFFLE(86),
    LIVE_EVENTS(87),
    AUDIOBOOK_RELATIONS(88),
    HOME_POC_BASECARD(89),
    AUDIOBOOK_SUPPLEMENTS(90),
    PAID_PODCAST_BANNER(91),
    FEWER_ADS(92),
    WATCH_FEED_SHOW_EXPLORER(93),
    TRACK_EXTRA_DESCRIPTORS(94),
    TRACK_EXTRA_AUDIO_ATTRIBUTES(95),
    TRACK_EXTENDED_CREDITS(96),
    SIMPLE_TRAIT(97),
    AUDIO_ASSOCIATIONS(98),
    VIDEO_ASSOCIATIONS(99),
    PLAYLIST_TUNER(100),
    ARTIST_VIDEOS_ENTRYPOINT(101),
    ALBUM_PRERELEASE(102),
    CONTENT_ALTERNATIVES(103),
    SNAPSHOT_SHARING(105),
    DISPLAY_SEGMENTS_COUNT(Error.INVALID_COUNTRY_FIELD_NUMBER),
    PODCAST_FEATURED_EPISODE(Error.TOO_YOUNG_FIELD_NUMBER),
    PODCAST_SPONSORED_CONTENT(108),
    PODCAST_EPISODE_TOPICS_LLM(109),
    PODCAST_EPISODE_TOPICS_KG(110),
    EPISODE_RANKING_POPULARITY(ContentType.SHORT_FORM_ON_DEMAND),
    MERCH(ContentType.LONG_FORM_ON_DEMAND),
    COMPANION_CONTENT(ContentType.LIVE),
    WATCH_FEED_ENTITY_EXPLORER(114),
    ANCHOR_CARD_TRAIT(115),
    AUDIO_PREVIEW_PLAYBACK_TRAIT(116),
    VIDEO_PREVIEW_STILL_TRAIT(117),
    PREVIEW_CARD_TRAIT(118),
    SHORTCUTS_CARD_TRAIT(119),
    VIDEO_PREVIEW_PLAYBACK_TRAIT(120),
    COURSE_SPECIFICS(ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND),
    CONCERT(ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND),
    CONCERT_LOCATION(ContentType.USER_GENERATED_LIVE),
    CONCERT_MARKETING(124),
    CONCERT_PERFORMERS(125),
    TRACK_PAIR_TRANSITION(126),
    CONTENT_TYPE_TRAIT(127),
    NAME_TRAIT(128),
    ARTWORK_TRAIT(129),
    RELEASE_DATE_TRAIT(130),
    CREDITS_TRAIT(131),
    RELEASE_URI_TRAIT(132),
    ENTITY_CAPPING(133),
    LESSON_SPECIFICS(134),
    CONCERT_OFFERS(135),
    TRANSITION_MAPS(136),
    ARTIST_HAS_CONCERTS(137),
    PRERELEASE(138),
    PLAYLIST_ATTRIBUTES_V2(139),
    LIST_ATTRIBUTES_V2(140),
    LIST_METADATA(141),
    LIST_TUNER_AUDIO_ANALYSIS(142),
    LIST_TUNER_CUEPOINTS(143),
    CONTENT_RATING_TRAIT(144),
    COPYRIGHT_TRAIT(145),
    SUPPORTED_BADGES(146),
    BADGES(147),
    PREVIEW_TRAIT(148),
    ROOTLISTABILITY_TRAIT(149),
    LOCAL_CONCERTS(150),
    RECOMMENDED_PLAYLISTS(151),
    POPULAR_RELEASES(152),
    RELATED_RELEASES(153),
    SHARE_RESTRICTIONS(154),
    CONCERT_OFFER(155),
    CONCERT_OFFER_PROVIDER(156),
    ENTITY_BOOKMARKS(157),
    PRIVACY_TRAIT(158),
    DUPLICATE_ITEMS_TRAIT(159),
    REORDERING_TRAIT(160),
    PODCAST_RESUMPTION_SEGMENTS(161),
    ARTIST_EXPRESSION_VIDEO(162),
    PRERELEASE_VIDEO(163),
    GATED_ENTITY_RELATIONS(164),
    RELATED_CREATORS_SECTION(165),
    CREATORS_APPEARS_ON_SECTION(166),
    PROMO_V1_TRAIT(167),
    SPEECHLESS_SHARE_CARD(168),
    TOP_PLAYABLES_SECTION(169),
    AUTO_LENS(170),
    PROMO_V3_TRAIT(171),
    TRACK_CONTENT_FILTER(172),
    HIGHLIGHTABILITY(173),
    LINK_CARD_WITH_IMAGE_TRAIT(174),
    TRACK_CLOUD_SECTION(175),
    EPISODE_TOPICS(176),
    VIDEO_THUMBNAIL(177),
    IDENTITY_TRAIT(178),
    VISUAL_IDENTITY_TRAIT(179),
    CONTENT_TYPE_V2_TRAIT(180),
    PREVIEW_PLAYBACK_TRAIT(181),
    CONSUMPTION_EXPERIENCE_TRAIT(182),
    PUBLISHING_METADATA_TRAIT(183),
    DETAILED_EVALUATION_TRAIT(184),
    ON_PLATFORM_REPUTATION_TRAIT(185),
    CREDITS_V2_TRAIT(186),
    HIGHLIGHT_PLAYABILITY_TRAIT(187),
    SHOW_EPISODE_LIST(188),
    AVAILABLE_RELEASES(189),
    PLAYLIST_DESCRIPTORS(190),
    LINK_CARD_WITH_ANIMATIONS_TRAIT(191),
    RECAP(192),
    AUDIOBOOK_COMPANION_CONTENT(193),
    THREE_OH_THREE_PLAY_TRAIT(194),
    ARTIST_WRAPPED_2024_VIDEO(195),
    CONTAINED_CONTENT_TYPES(196),
    CONTENT_CLASSIFICATION(197),
    CHAPTER_SPECIFICS(198),
    CREATOR_FAN_FUNDING(ContentType.BUMPER),
    CREATOR_PLAYLISTS_SECTION(200),
    CREATOR_PINNED_ITEM(201),
    PODCAST_POLL_V2(202),
    CREATOR_APPEARS_ON_SECTION(203),
    ARTIST_CONCERTS(204),
    LIST_METADATA_V2(205),
    ARTIST_HEADLINE(206),
    EPISODE_AD_PLACEMENTS(207),
    VIDEO_SOCIAL_PROOF_POC_TRAIT(208),
    ARTIST_MUSIC_VIDEOS(209),
    ARTIST_LISTENING_PARTY(210),
    CONTENT_BY_OR_ABOUT(AdvertisementType.ON_DEMAND_PRE_ROLL),
    PLAYBACK_TRAIT(AdvertisementType.ON_DEMAND_MID_ROLL),
    ARTIST_MUSIC_VIDEOS_UNMAPPED(AdvertisementType.ON_DEMAND_POST_ROLL),
    ENTITY_CONNECTIONS(214),
    USER_PROFILE_V2(215),
    VIDEO_RELATIONS(216),
    BEATS(217),
    VOCAL_ACTIVITY(218),
    MIXABILITY(219),
    ENTITY_TYPE_TRAIT(220),
    CHAT_SHARE_PREVIEW(AdvertisementType.LIVE),
    AUDIO_ATTRIBUTES_V2(222),
    WATCH_FEED_CATEGORIES_TRAIT(223),
    VENUE_ARTISTS_PREVIEW(224),
    MIX_STATE(225),
    WATCH_FEED_SEED_ITEM_TRAIT(226),
    SONG_DNA_ELIGIBILITY(227),
    LEARNING_MATERIAL(228),
    BANNER_WITH_ANIMATIONS(229),
    VENUE_LOCATION(230),
    TRANSCRIPT_SEARCH(AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL),
    SONGDNA_CREDITS(AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL),
    AUDIOBOOK_TO_PHYSICAL_BOOK_MAPPING(AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL),
    ARTIST_WRAPPED_2025_VIDEO(AdvertisementType.BRANDED_AS_CONTENT),
    MIXABILITY_TRAIT(AdvertisementType.BRANDED_DURING_LIVE),
    SONGDNA_ARTIST_FACTS(236),
    THREEBAND_WAVEFORMS(237),
    AUDIOBOOK_PARTNER_SALES(238),
    CONTENT_CAPABILITY_TRAIT(239),
    CONCERT_CAMPAIGN(240),
    CONCERT_CAMPAIGN_USER_STATE(241),
    CONCERT_CAMPAIGN_STRINGS(242),
    CONCERT_CAMPAIGN_ROUTINGS(243),
    TRANSITION_DATA(244),
    CHAT_RICH_MEDIA(245),
    CURATION_EXPERIENCE_TRAIT(246),
    COMMON_TRANSITION_POINT(247),
    PLAY_LINK_CARD_TRAIT(248),
    CONTENT_EXPERIENCE_TRAIT(249),
    TRACK_ALTERNATIVE_VERSIONS(250),
    LICENSING_IDENTIFIERS_TRAIT(251),
    SPONSORSHIP(252),
    AUDIOBOOK_DIRECT_SALES(253),
    ALBUM_MUSIC_VIDEOS(254),
    CREATOR_ARTIST_FACTS(255),
    PLAYBACK_EXPERIENCE_TRAIT(256),
    SPEEDABILITY(257),
    CONTENT_MARKERS(258),
    TRACK_AUDIO_FOUNDATIONS(259),
    AD_PLACEMENTS_BETA(260),
    TRACK_SECTIONS(261),
    SHARE_CARD_CONFIG(262),
    PLAYBACK_TRAIT_V2(263),
    TARGETED_OFFER_BANNER(264),
    RESUMPTION_BOUNDARIES(265),
    AD_LOCATIONS(266),
    CONTENT_ACCESS_EXPERIMENTAL(267),
    AUDIO_LAYERABILITY_TRAIT(268),
    READER_ENCODING_EXTENSION(269),
    FRESH_FINDS_FORWARD(270),
    YOUR_ARTIST_MESSAGES(271),
    RELATED_READERS(272),
    NPV_CONTROLS_EXPERIMENT(273),
    SEEKPANEL_TRAIT(274),
    BYOM_ELIGIBILITY(275),
    SPEECHLESS_TASTE_MATCH_CARD(276),
    EXPRESSION_PREVIEW_MANIFEST(277),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f158443a;

    ntx(int i) {
        this.f158443a = i;
    }

    /* JADX INFO: renamed from: b */
    public static ntx m65644b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EXTENSION;
            case 1:
                return CANVAZ;
            case 2:
                return STORYLINES;
            case 3:
                return PODCAST_TOPICS;
            case 4:
                return PODCAST_SEGMENTS;
            case 5:
                return AUDIO_FILES;
            case 6:
                return TRACK_DESCRIPTOR;
            case 7:
                return PODCAST_COUNTER;
            case 8:
                return ARTIST_V4;
            case 9:
                return ALBUM_V4;
            case 10:
                return TRACK_V4;
            case 11:
                return SHOW_V4;
            case 12:
                return EPISODE_V4;
            case 13:
                return PODCAST_HTML_DESCRIPTION;
            case 14:
                return PODCAST_QUOTES;
            case 15:
                return USER_PROFILE;
            case 16:
                return CANVAS_V1;
            case 17:
                return SHOW_V4_BASE;
            case 18:
                return SHOW_V4_EPISODES_ASSOC;
            case 19:
                return TRACK_DESCRIPTOR_SIGNATURES;
            case 20:
                return PODCAST_AD_SEGMENTS;
            case 21:
                return EPISODE_TRANSCRIPTS;
            case 22:
                return PODCAST_SUBSCRIPTIONS;
            case 23:
                return EXTRACTED_COLOR;
            case 24:
                return PODCAST_VIRALITY;
            case 25:
                return IMAGE_SPARKLES_HACK;
            case 26:
                return PODCAST_POPULARITY_HACK;
            case 27:
                return AUTOMIX_MODE;
            case 28:
                return CUEPOINTS;
            case 29:
                return PODCAST_POLL;
            case 30:
                return EPISODE_ACCESS;
            case 31:
                return SHOW_ACCESS;
            case 32:
                return PODCAST_QNA;
            case 33:
                return CLIPS;
            case 34:
                return SHOW_V5;
            case 35:
                return EPISODE_V5;
            case 36:
                return PODCAST_CTA_CARDS;
            case 37:
                return PODCAST_RATING;
            case 38:
                return DISPLAY_SEGMENTS;
            case 39:
                return GREENROOM;
            case 40:
                return USER_CREATED;
            case 41:
                return SHOW_DESCRIPTION;
            case 42:
                return SHOW_HTML_DESCRIPTION;
            case 43:
                return SHOW_PLAYABILITY;
            case 44:
                return EPISODE_DESCRIPTION;
            case 45:
                return EPISODE_HTML_DESCRIPTION;
            case 46:
                return EPISODE_PLAYABILITY;
            case 47:
                return SHOW_EPISODES_ASSOC;
            case 48:
                return CLIENT_CONFIG;
            case 49:
                return PLAYLISTABILITY;
            case 50:
                return AUDIOBOOK_V5;
            case 51:
                return CHAPTER_V5;
            case 52:
                return AUDIOBOOK_SPECIFICS;
            case 53:
                return EPISODE_RANKING;
            case 54:
                return HTML_DESCRIPTION;
            case 55:
                return CREATOR_CHANNEL;
            case 56:
                return AUDIOBOOK_PROVIDERS;
            case 57:
                return PLAY_TRAIT;
            case 58:
                return CONTENT_WARNING;
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                return IMAGE_CUE;
            case 60:
                return STREAM_COUNT;
            case 61:
                return AUDIO_ATTRIBUTES;
            case 62:
                return NAVIGABLE_TRAIT;
            case 63:
                return NEXT_BEST_EPISODE;
            case 64:
                return AUDIOBOOK_PRICE;
            case 65:
                return EXPRESSIVE_PLAYLISTS;
            case 66:
                return DYNAMIC_SHOW_EPISODE;
            case 67:
                return LIVE;
            case 68:
                return SKIP_PLAYED;
            case 69:
                return AD_BREAK_FREE_PODCASTS;
            case 70:
                return ASSOCIATIONS;
            case 71:
                return PLAYLIST_EVALUATION;
            case 72:
                return CACHE_INVALIDATIONS;
            case 73:
                return LIVESTREAM_ENTITY;
            case 74:
                return SINGLE_TAP_REACTIONS;
            case 75:
                return USER_COMMENTS;
            case 76:
                return CLIENT_RESTRICTIONS;
            case 77:
                return PODCAST_GUEST;
            case 78:
                return PLAYABILITY;
            case 79:
                return COVER_IMAGE;
            case 80:
                return SHARE_TRAIT;
            case 81:
                return INSTANCE_SHARING;
            case 82:
                return ARTIST_TOUR;
            case 83:
                return AUDIOBOOK_GENRE;
            case 84:
                return CONCEPT;
            case 85:
                return ORIGINAL_VIDEO;
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                return SMART_SHUFFLE;
            case 87:
                return LIVE_EVENTS;
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                return AUDIOBOOK_RELATIONS;
            case 89:
                return HOME_POC_BASECARD;
            case 90:
                return AUDIOBOOK_SUPPLEMENTS;
            case 91:
                return PAID_PODCAST_BANNER;
            case 92:
                return FEWER_ADS;
            case 93:
                return WATCH_FEED_SHOW_EXPLORER;
            case 94:
                return TRACK_EXTRA_DESCRIPTORS;
            case 95:
                return TRACK_EXTRA_AUDIO_ATTRIBUTES;
            case 96:
                return TRACK_EXTENDED_CREDITS;
            case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                return SIMPLE_TRAIT;
            case 98:
                return AUDIO_ASSOCIATIONS;
            case 99:
                return VIDEO_ASSOCIATIONS;
            case 100:
                return PLAYLIST_TUNER;
            case 101:
                return ARTIST_VIDEOS_ENTRYPOINT;
            case 102:
                return ALBUM_PRERELEASE;
            case 103:
                return CONTENT_ALTERNATIVES;
            case 104:
            default:
                return null;
            case 105:
                return SNAPSHOT_SHARING;
            case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                return DISPLAY_SEGMENTS_COUNT;
            case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                return PODCAST_FEATURED_EPISODE;
            case 108:
                return PODCAST_SPONSORED_CONTENT;
            case 109:
                return PODCAST_EPISODE_TOPICS_LLM;
            case 110:
                return PODCAST_EPISODE_TOPICS_KG;
            case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                return EPISODE_RANKING_POPULARITY;
            case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                return MERCH;
            case ContentType.LIVE /* 113 */:
                return COMPANION_CONTENT;
            case 114:
                return WATCH_FEED_ENTITY_EXPLORER;
            case 115:
                return ANCHOR_CARD_TRAIT;
            case 116:
                return AUDIO_PREVIEW_PLAYBACK_TRAIT;
            case 117:
                return VIDEO_PREVIEW_STILL_TRAIT;
            case 118:
                return PREVIEW_CARD_TRAIT;
            case 119:
                return SHORTCUTS_CARD_TRAIT;
            case 120:
                return VIDEO_PREVIEW_PLAYBACK_TRAIT;
            case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                return COURSE_SPECIFICS;
            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                return CONCERT;
            case ContentType.USER_GENERATED_LIVE /* 123 */:
                return CONCERT_LOCATION;
            case 124:
                return CONCERT_MARKETING;
            case 125:
                return CONCERT_PERFORMERS;
            case 126:
                return TRACK_PAIR_TRANSITION;
            case 127:
                return CONTENT_TYPE_TRAIT;
            case 128:
                return NAME_TRAIT;
            case 129:
                return ARTWORK_TRAIT;
            case 130:
                return RELEASE_DATE_TRAIT;
            case 131:
                return CREDITS_TRAIT;
            case 132:
                return RELEASE_URI_TRAIT;
            case 133:
                return ENTITY_CAPPING;
            case 134:
                return LESSON_SPECIFICS;
            case 135:
                return CONCERT_OFFERS;
            case 136:
                return TRANSITION_MAPS;
            case 137:
                return ARTIST_HAS_CONCERTS;
            case 138:
                return PRERELEASE;
            case 139:
                return PLAYLIST_ATTRIBUTES_V2;
            case 140:
                return LIST_ATTRIBUTES_V2;
            case 141:
                return LIST_METADATA;
            case 142:
                return LIST_TUNER_AUDIO_ANALYSIS;
            case 143:
                return LIST_TUNER_CUEPOINTS;
            case 144:
                return CONTENT_RATING_TRAIT;
            case 145:
                return COPYRIGHT_TRAIT;
            case 146:
                return SUPPORTED_BADGES;
            case 147:
                return BADGES;
            case 148:
                return PREVIEW_TRAIT;
            case 149:
                return ROOTLISTABILITY_TRAIT;
            case 150:
                return LOCAL_CONCERTS;
            case 151:
                return RECOMMENDED_PLAYLISTS;
            case 152:
                return POPULAR_RELEASES;
            case 153:
                return RELATED_RELEASES;
            case 154:
                return SHARE_RESTRICTIONS;
            case 155:
                return CONCERT_OFFER;
            case 156:
                return CONCERT_OFFER_PROVIDER;
            case 157:
                return ENTITY_BOOKMARKS;
            case 158:
                return PRIVACY_TRAIT;
            case 159:
                return DUPLICATE_ITEMS_TRAIT;
            case 160:
                return REORDERING_TRAIT;
            case 161:
                return PODCAST_RESUMPTION_SEGMENTS;
            case 162:
                return ARTIST_EXPRESSION_VIDEO;
            case 163:
                return PRERELEASE_VIDEO;
            case 164:
                return GATED_ENTITY_RELATIONS;
            case 165:
                return RELATED_CREATORS_SECTION;
            case 166:
                return CREATORS_APPEARS_ON_SECTION;
            case 167:
                return PROMO_V1_TRAIT;
            case 168:
                return SPEECHLESS_SHARE_CARD;
            case 169:
                return TOP_PLAYABLES_SECTION;
            case 170:
                return AUTO_LENS;
            case 171:
                return PROMO_V3_TRAIT;
            case 172:
                return TRACK_CONTENT_FILTER;
            case 173:
                return HIGHLIGHTABILITY;
            case 174:
                return LINK_CARD_WITH_IMAGE_TRAIT;
            case 175:
                return TRACK_CLOUD_SECTION;
            case 176:
                return EPISODE_TOPICS;
            case 177:
                return VIDEO_THUMBNAIL;
            case 178:
                return IDENTITY_TRAIT;
            case 179:
                return VISUAL_IDENTITY_TRAIT;
            case 180:
                return CONTENT_TYPE_V2_TRAIT;
            case 181:
                return PREVIEW_PLAYBACK_TRAIT;
            case 182:
                return CONSUMPTION_EXPERIENCE_TRAIT;
            case 183:
                return PUBLISHING_METADATA_TRAIT;
            case 184:
                return DETAILED_EVALUATION_TRAIT;
            case 185:
                return ON_PLATFORM_REPUTATION_TRAIT;
            case 186:
                return CREDITS_V2_TRAIT;
            case 187:
                return HIGHLIGHT_PLAYABILITY_TRAIT;
            case 188:
                return SHOW_EPISODE_LIST;
            case 189:
                return AVAILABLE_RELEASES;
            case 190:
                return PLAYLIST_DESCRIPTORS;
            case 191:
                return LINK_CARD_WITH_ANIMATIONS_TRAIT;
            case 192:
                return RECAP;
            case 193:
                return AUDIOBOOK_COMPANION_CONTENT;
            case 194:
                return THREE_OH_THREE_PLAY_TRAIT;
            case 195:
                return ARTIST_WRAPPED_2024_VIDEO;
            case 196:
                return CONTAINED_CONTENT_TYPES;
            case 197:
                return CONTENT_CLASSIFICATION;
            case 198:
                return CHAPTER_SPECIFICS;
            case ContentType.BUMPER /* 199 */:
                return CREATOR_FAN_FUNDING;
            case 200:
                return CREATOR_PLAYLISTS_SECTION;
            case 201:
                return CREATOR_PINNED_ITEM;
            case 202:
                return PODCAST_POLL_V2;
            case 203:
                return CREATOR_APPEARS_ON_SECTION;
            case 204:
                return ARTIST_CONCERTS;
            case 205:
                return LIST_METADATA_V2;
            case 206:
                return ARTIST_HEADLINE;
            case 207:
                return EPISODE_AD_PLACEMENTS;
            case 208:
                return VIDEO_SOCIAL_PROOF_POC_TRAIT;
            case 209:
                return ARTIST_MUSIC_VIDEOS;
            case 210:
                return ARTIST_LISTENING_PARTY;
            case AdvertisementType.ON_DEMAND_PRE_ROLL /* 211 */:
                return CONTENT_BY_OR_ABOUT;
            case AdvertisementType.ON_DEMAND_MID_ROLL /* 212 */:
                return PLAYBACK_TRAIT;
            case AdvertisementType.ON_DEMAND_POST_ROLL /* 213 */:
                return ARTIST_MUSIC_VIDEOS_UNMAPPED;
            case 214:
                return ENTITY_CONNECTIONS;
            case 215:
                return USER_PROFILE_V2;
            case 216:
                return VIDEO_RELATIONS;
            case 217:
                return BEATS;
            case 218:
                return VOCAL_ACTIVITY;
            case 219:
                return MIXABILITY;
            case 220:
                return ENTITY_TYPE_TRAIT;
            case AdvertisementType.LIVE /* 221 */:
                return CHAT_SHARE_PREVIEW;
            case 222:
                return AUDIO_ATTRIBUTES_V2;
            case 223:
                return WATCH_FEED_CATEGORIES_TRAIT;
            case 224:
                return VENUE_ARTISTS_PREVIEW;
            case 225:
                return MIX_STATE;
            case 226:
                return WATCH_FEED_SEED_ITEM_TRAIT;
            case 227:
                return SONG_DNA_ELIGIBILITY;
            case 228:
                return LEARNING_MATERIAL;
            case 229:
                return BANNER_WITH_ANIMATIONS;
            case 230:
                return VENUE_LOCATION;
            case AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL /* 231 */:
                return TRANSCRIPT_SEARCH;
            case AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL /* 232 */:
                return SONGDNA_CREDITS;
            case AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL /* 233 */:
                return AUDIOBOOK_TO_PHYSICAL_BOOK_MAPPING;
            case AdvertisementType.BRANDED_AS_CONTENT /* 234 */:
                return ARTIST_WRAPPED_2025_VIDEO;
            case AdvertisementType.BRANDED_DURING_LIVE /* 235 */:
                return MIXABILITY_TRAIT;
            case 236:
                return SONGDNA_ARTIST_FACTS;
            case 237:
                return THREEBAND_WAVEFORMS;
            case 238:
                return AUDIOBOOK_PARTNER_SALES;
            case 239:
                return CONTENT_CAPABILITY_TRAIT;
            case 240:
                return CONCERT_CAMPAIGN;
            case 241:
                return CONCERT_CAMPAIGN_USER_STATE;
            case 242:
                return CONCERT_CAMPAIGN_STRINGS;
            case 243:
                return CONCERT_CAMPAIGN_ROUTINGS;
            case 244:
                return TRANSITION_DATA;
            case 245:
                return CHAT_RICH_MEDIA;
            case 246:
                return CURATION_EXPERIENCE_TRAIT;
            case 247:
                return COMMON_TRANSITION_POINT;
            case 248:
                return PLAY_LINK_CARD_TRAIT;
            case 249:
                return CONTENT_EXPERIENCE_TRAIT;
            case 250:
                return TRACK_ALTERNATIVE_VERSIONS;
            case 251:
                return LICENSING_IDENTIFIERS_TRAIT;
            case 252:
                return SPONSORSHIP;
            case 253:
                return AUDIOBOOK_DIRECT_SALES;
            case 254:
                return ALBUM_MUSIC_VIDEOS;
            case 255:
                return CREATOR_ARTIST_FACTS;
            case 256:
                return PLAYBACK_EXPERIENCE_TRAIT;
            case 257:
                return SPEEDABILITY;
            case 258:
                return CONTENT_MARKERS;
            case 259:
                return TRACK_AUDIO_FOUNDATIONS;
            case 260:
                return AD_PLACEMENTS_BETA;
            case 261:
                return TRACK_SECTIONS;
            case 262:
                return SHARE_CARD_CONFIG;
            case 263:
                return PLAYBACK_TRAIT_V2;
            case 264:
                return TARGETED_OFFER_BANNER;
            case 265:
                return RESUMPTION_BOUNDARIES;
            case 266:
                return AD_LOCATIONS;
            case 267:
                return CONTENT_ACCESS_EXPERIMENTAL;
            case 268:
                return AUDIO_LAYERABILITY_TRAIT;
            case 269:
                return READER_ENCODING_EXTENSION;
            case 270:
                return FRESH_FINDS_FORWARD;
            case 271:
                return YOUR_ARTIST_MESSAGES;
            case 272:
                return RELATED_READERS;
            case 273:
                return NPV_CONTROLS_EXPERIMENT;
            case 274:
                return SEEKPANEL_TRAIT;
            case 275:
                return BYOM_ELIGIBILITY;
            case 276:
                return SPEECHLESS_TASTE_MATCH_CARD;
            case 277:
                return EXPRESSION_PREVIEW_MANIFEST;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f158443a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
