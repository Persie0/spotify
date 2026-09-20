package com.spotify.nowplaying.scroll;

import androidx.annotation.Keep;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b#\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, m24212d2 = {"Lcom/spotify/nowplaying/scroll/ScrollCardType;", "", "DISPLAY_AD", "LEAVEBEHIND_ADS", "LIVE_UPSELL", "LYRICS", "MERCH", "PODCAST_CHAPTERS", "PODCAST_POLLS", "SHOW_DESCRIPTION", "SONG_DNA", "TRACK_CREDITS", "ON_TOUR", "MUSIC_VIDEOS", "EPISODE_DESCRIPTION", "WATCH_FEED", "PRERELEASE", "COMMENTS", "GATED_CONTENT", "COMPANION_CONTENT", "CREATOR_BIO", "FANDOM_HUB", "TRANSCRIPTS", "SMART_SHUFFLE_RECOMMENDATIONS", "RELATED_CONTENT_RECOMMENDATIONS", "RELATED_TRACK_CARD", "CONTENT_STORY", "ENTITY_SEGMENTS", "KALLAX_DETAILS", "KALLAX_REACTION_ROW", "CONCERT_CAMPAIGN", "MARTINI_CHAT_ENTRY_CARD", "LPM_SHELF", "E_READER", "QUEUE", "BYOM", "src_main_java_com_spotify_nowplaying_scroll-scroll"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ScrollCardType {

    @Keep
    public static final ScrollCardType BYOM;

    @Keep
    public static final ScrollCardType COMMENTS;

    @Keep
    public static final ScrollCardType COMPANION_CONTENT;

    @Keep
    public static final ScrollCardType CONCERT_CAMPAIGN;

    @Keep
    public static final ScrollCardType CONTENT_STORY;

    @Keep
    public static final ScrollCardType CREATOR_BIO;

    @Keep
    public static final ScrollCardType DISPLAY_AD;

    @Keep
    public static final ScrollCardType ENTITY_SEGMENTS;

    @Keep
    public static final ScrollCardType EPISODE_DESCRIPTION;

    @Keep
    public static final ScrollCardType E_READER;

    @Keep
    public static final ScrollCardType FANDOM_HUB;

    @Keep
    public static final ScrollCardType GATED_CONTENT;

    @Keep
    public static final ScrollCardType KALLAX_DETAILS;

    @Keep
    public static final ScrollCardType KALLAX_REACTION_ROW;

    @Keep
    public static final ScrollCardType LEAVEBEHIND_ADS;

    @Keep
    public static final ScrollCardType LIVE_UPSELL;

    @Keep
    public static final ScrollCardType LPM_SHELF;

    @Keep
    public static final ScrollCardType LYRICS;

    @Keep
    public static final ScrollCardType MARTINI_CHAT_ENTRY_CARD;

    @Keep
    public static final ScrollCardType MERCH;

    @Keep
    public static final ScrollCardType MUSIC_VIDEOS;

    @Keep
    public static final ScrollCardType ON_TOUR;

    @Keep
    public static final ScrollCardType PODCAST_CHAPTERS;

    @Keep
    public static final ScrollCardType PODCAST_POLLS;

    @Keep
    public static final ScrollCardType PRERELEASE;

    @Keep
    public static final ScrollCardType QUEUE;

    @Keep
    public static final ScrollCardType RELATED_CONTENT_RECOMMENDATIONS;

    @Keep
    public static final ScrollCardType RELATED_TRACK_CARD;

    @Keep
    public static final ScrollCardType SHOW_DESCRIPTION;

    @Keep
    public static final ScrollCardType SMART_SHUFFLE_RECOMMENDATIONS;

    @Keep
    public static final ScrollCardType SONG_DNA;

    @Keep
    public static final ScrollCardType TRACK_CREDITS;

    @Keep
    public static final ScrollCardType TRANSCRIPTS;

    @Keep
    public static final ScrollCardType WATCH_FEED;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ScrollCardType[] f6282a;

    static {
        ScrollCardType scrollCardType = new ScrollCardType("DISPLAY_AD", 0);
        DISPLAY_AD = scrollCardType;
        ScrollCardType scrollCardType2 = new ScrollCardType("LEAVEBEHIND_ADS", 1);
        LEAVEBEHIND_ADS = scrollCardType2;
        ScrollCardType scrollCardType3 = new ScrollCardType("LIVE_UPSELL", 2);
        LIVE_UPSELL = scrollCardType3;
        ScrollCardType scrollCardType4 = new ScrollCardType("LYRICS", 3);
        LYRICS = scrollCardType4;
        ScrollCardType scrollCardType5 = new ScrollCardType("MERCH", 4);
        MERCH = scrollCardType5;
        ScrollCardType scrollCardType6 = new ScrollCardType("PODCAST_CHAPTERS", 5);
        PODCAST_CHAPTERS = scrollCardType6;
        ScrollCardType scrollCardType7 = new ScrollCardType("PODCAST_POLLS", 6);
        PODCAST_POLLS = scrollCardType7;
        ScrollCardType scrollCardType8 = new ScrollCardType("SHOW_DESCRIPTION", 7);
        SHOW_DESCRIPTION = scrollCardType8;
        ScrollCardType scrollCardType9 = new ScrollCardType("SONG_DNA", 8);
        SONG_DNA = scrollCardType9;
        ScrollCardType scrollCardType10 = new ScrollCardType("TRACK_CREDITS", 9);
        TRACK_CREDITS = scrollCardType10;
        ScrollCardType scrollCardType11 = new ScrollCardType("ON_TOUR", 10);
        ON_TOUR = scrollCardType11;
        ScrollCardType scrollCardType12 = new ScrollCardType("MUSIC_VIDEOS", 11);
        MUSIC_VIDEOS = scrollCardType12;
        ScrollCardType scrollCardType13 = new ScrollCardType("EPISODE_DESCRIPTION", 12);
        EPISODE_DESCRIPTION = scrollCardType13;
        ScrollCardType scrollCardType14 = new ScrollCardType("WATCH_FEED", 13);
        WATCH_FEED = scrollCardType14;
        ScrollCardType scrollCardType15 = new ScrollCardType("PRERELEASE", 14);
        PRERELEASE = scrollCardType15;
        ScrollCardType scrollCardType16 = new ScrollCardType("COMMENTS", 15);
        COMMENTS = scrollCardType16;
        ScrollCardType scrollCardType17 = new ScrollCardType("GATED_CONTENT", 16);
        GATED_CONTENT = scrollCardType17;
        ScrollCardType scrollCardType18 = new ScrollCardType("COMPANION_CONTENT", 17);
        COMPANION_CONTENT = scrollCardType18;
        ScrollCardType scrollCardType19 = new ScrollCardType("CREATOR_BIO", 18);
        CREATOR_BIO = scrollCardType19;
        ScrollCardType scrollCardType20 = new ScrollCardType("FANDOM_HUB", 19);
        FANDOM_HUB = scrollCardType20;
        ScrollCardType scrollCardType21 = new ScrollCardType("TRANSCRIPTS", 20);
        TRANSCRIPTS = scrollCardType21;
        ScrollCardType scrollCardType22 = new ScrollCardType("SMART_SHUFFLE_RECOMMENDATIONS", 21);
        SMART_SHUFFLE_RECOMMENDATIONS = scrollCardType22;
        ScrollCardType scrollCardType23 = new ScrollCardType("RELATED_CONTENT_RECOMMENDATIONS", 22);
        RELATED_CONTENT_RECOMMENDATIONS = scrollCardType23;
        ScrollCardType scrollCardType24 = new ScrollCardType("RELATED_TRACK_CARD", 23);
        RELATED_TRACK_CARD = scrollCardType24;
        ScrollCardType scrollCardType25 = new ScrollCardType("CONTENT_STORY", 24);
        CONTENT_STORY = scrollCardType25;
        ScrollCardType scrollCardType26 = new ScrollCardType("ENTITY_SEGMENTS", 25);
        ENTITY_SEGMENTS = scrollCardType26;
        ScrollCardType scrollCardType27 = new ScrollCardType("KALLAX_DETAILS", 26);
        KALLAX_DETAILS = scrollCardType27;
        ScrollCardType scrollCardType28 = new ScrollCardType("KALLAX_REACTION_ROW", 27);
        KALLAX_REACTION_ROW = scrollCardType28;
        ScrollCardType scrollCardType29 = new ScrollCardType("CONCERT_CAMPAIGN", 28);
        CONCERT_CAMPAIGN = scrollCardType29;
        ScrollCardType scrollCardType30 = new ScrollCardType("MARTINI_CHAT_ENTRY_CARD", 29);
        MARTINI_CHAT_ENTRY_CARD = scrollCardType30;
        ScrollCardType scrollCardType31 = new ScrollCardType("LPM_SHELF", 30);
        LPM_SHELF = scrollCardType31;
        ScrollCardType scrollCardType32 = new ScrollCardType("E_READER", 31);
        E_READER = scrollCardType32;
        ScrollCardType scrollCardType33 = new ScrollCardType("QUEUE", 32);
        QUEUE = scrollCardType33;
        ScrollCardType scrollCardType34 = new ScrollCardType("BYOM", 33);
        BYOM = scrollCardType34;
        f6282a = new ScrollCardType[]{scrollCardType, scrollCardType2, scrollCardType3, scrollCardType4, scrollCardType5, scrollCardType6, scrollCardType7, scrollCardType8, scrollCardType9, scrollCardType10, scrollCardType11, scrollCardType12, scrollCardType13, scrollCardType14, scrollCardType15, scrollCardType16, scrollCardType17, scrollCardType18, scrollCardType19, scrollCardType20, scrollCardType21, scrollCardType22, scrollCardType23, scrollCardType24, scrollCardType25, scrollCardType26, scrollCardType27, scrollCardType28, scrollCardType29, scrollCardType30, scrollCardType31, scrollCardType32, scrollCardType33, scrollCardType34};
    }

    public static ScrollCardType valueOf(String str) {
        return (ScrollCardType) Enum.valueOf(ScrollCardType.class, str);
    }

    public static ScrollCardType[] values() {
        return (ScrollCardType[]) f6282a.clone();
    }
}
