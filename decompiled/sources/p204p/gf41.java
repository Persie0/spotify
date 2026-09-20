package p204p;

import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.signup.signup.p150v2.proto.Error;
import io.ably.lib.rest.Auth;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.msgpack.core.MessagePack;
import p196j$.net.URLEncoder;

/* JADX INFO: loaded from: classes.dex */
public final class gf41 implements Comparable {

    /* JADX INFO: renamed from: N0 */
    public static final HashSet f79262N0 = new HashSet(Arrays.asList("albums", "appears-on", "appears_on", "playlists", "related", "related-videos", "releases", "singles", "popular-tracks", "play_button"));

    /* JADX INFO: renamed from: L0 */
    public final String f79263L0;

    /* JADX INFO: renamed from: M0 */
    public final String f79264M0;

    /* JADX INFO: renamed from: X */
    public final df41 f79265X;

    /* JADX INFO: renamed from: Y */
    public final List f79266Y;

    /* JADX INFO: renamed from: Z */
    public final String f79267Z;

    /* JADX INFO: renamed from: a */
    public final boolean f79268a;

    /* JADX INFO: renamed from: b */
    public final String f79269b;

    /* JADX INFO: renamed from: c */
    public final df41 f79270c;

    /* JADX INFO: renamed from: d */
    public final String f79271d;

    /* JADX INFO: renamed from: e */
    public final String f79272e;

    /* JADX INFO: renamed from: f */
    public final String f79273f;

    /* JADX INFO: renamed from: g */
    public final String f79274g;

    /* JADX INFO: renamed from: h */
    public final String f79275h;

    /* JADX INFO: renamed from: i */
    public final long f79276i;

    /* JADX INFO: renamed from: t */
    public final String f79277t;

    /* JADX WARN: Code duplicated, block: B:1453:0x1a04  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public gf41(String str) {
        byte b;
        String strM61612e;
        String strM61609b;
        df41 df41Var;
        String strM61609b2;
        df41 df41Var2;
        ?? r10;
        String strM61612e2;
        ?? r11;
        String strM61609b3;
        ?? r12;
        String strM61609b4;
        ?? r13;
        String strM61609b5;
        String strM61609b6;
        long j;
        String str2;
        String str3;
        String str4;
        ?? r14;
        String strM61612e3;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        long j2;
        String strM61612e4;
        ?? r110;
        ?? r111;
        ?? r112;
        this.f79268a = true;
        this.f79269b = str;
        mf41 mf41Var = new mf41(str);
        String str5 = mf41Var.f142958d;
        this.f79264M0 = str5;
        if (mf41Var.m61608a()) {
            this.f79270c = df41.ACTIVATE;
            this.f79272e = null;
            this.f79271d = null;
            this.f79274g = null;
            this.f79273f = null;
            this.f79275h = null;
            this.f79276i = -1L;
            this.f79265X = df41.UNKNOWN;
            this.f79266Y = Collections.EMPTY_LIST;
            this.f79267Z = null;
            this.f79263L0 = null;
            this.f79277t = null;
            return;
        }
        String strM61609b7 = mf41Var.m61609b();
        df41 df41Var3 = df41.UNKNOWN;
        ?? arrayList = Collections.EMPTY_LIST;
        strM61609b7.getClass();
        switch (strM61609b7) {
            case "anthology":
                b = 0;
                break;
            case "data-download":
                b = 1;
                break;
            case "only-you":
                b = 2;
                break;
            case "followfeed":
                b = 3;
                break;
            case "concert-campaign":
                b = 4;
                break;
            case "activitycenter":
                b = 5;
                break;
            case "station":
                b = 6;
                break;
            case "lex-experiments":
                b = 7;
                break;
            case "contributor":
                b = 8;
                break;
            case "playlists":
                b = 9;
                break;
            case "age-assurance":
                b = 10;
                break;
            case "fandomcollectible":
                b = 11;
                break;
            case "expression":
                b = 12;
                break;
            case "collection":
                b = 13;
                break;
            case "transcript":
                b = 14;
                break;
            case "transition":
                b = 15;
                break;
            case "b2b-party":
                b = 16;
                break;
            case "fandom-collectibles":
                b = 17;
                break;
            case "episode":
                b = 18;
                break;
            case "artist":
                b = 19;
                break;
            case "author":
                b = 20;
                break;
            case "canvas":
                b = 21;
                break;
            case "course":
                b = 22;
                break;
            case "chat-message":
                b = 23;
                break;
            case "presents":
                b = 24;
                break;
            case "folder":
                b = 25;
                break;
            case "discovery-feed":
                b = 26;
                break;
            case "made-for-you":
                b = 27;
                break;
            case "together":
                b = 28;
                break;
            case "birthdays":
                b = 29;
                break;
            case "socialsession":
                b = 30;
                break;
            case "episode-set":
                b = 31;
                break;
            case "question":
                b = 32;
                break;
            case "kallax":
                b = 33;
                break;
            case "adspace":
                b = 34;
                break;
            case "s4a-third-party":
                b = 35;
                break;
            case "mosaic":
                b = 36;
                break;
            case "songwriter":
                b = 37;
                break;
            case "promoter":
                b = 38;
                break;
            case "prompt":
                b = 39;
                break;
            case "s4dapp":
                b = 40;
                break;
            case "sample":
                b = 41;
                break;
            case "search":
                b = 42;
                break;
            case "imageset":
                b = 43;
                break;
            case "personalized-set":
                b = 44;
                break;
            case "previewcatalog":
                b = 45;
                break;
            case "upsell":
                b = 46;
                break;
            case "voting":
                b = 47;
                break;
            case "podcastcharts":
                b = 48;
                break;
            case "promotion":
                b = 49;
                break;
            case "audiobook-licensor":
                b = 50;
                break;
            case "internal-organization":
                b = 51;
                break;
            case "account-management":
                b = 52;
                break;
            case "descriptor":
                b = 53;
                break;
            case "entityset":
                b = 54;
                break;
            case "chat-share-preview":
                b = 55;
                break;
            case "datastories":
                b = 56;
                break;
            case "referral":
                b = 57;
                break;
            case "commercial-partner":
                b = 58;
                break;
            case "concerts":
                b = 59;
                break;
            case "forever-favorites":
                b = 60;
                break;
            case "sitemodal":
                b = 61;
                break;
            case "merchhub":
                b = 62;
                break;
            case "zerotap":
                b = 63;
                break;
            case "response":
                b = 64;
                break;
            case "clip-video-chapter":
                b = 65;
                break;
            case "interruption":
                b = 66;
                break;
            case "watch-feed":
                b = 67;
                break;
            case "cultural-moment":
                b = 68;
                break;
            case "devicepreset":
                b = 69;
                break;
            case "experience":
                b = 70;
                break;
            case "ad":
                b = 71;
                break;
            case "app":
                b = 72;
                break;
            case "jam":
                b = 73;
                break;
            case "chat":
                b = 74;
                break;
            case "clip":
                b = 75;
                break;
            case "home":
                b = 76;
                break;
            case "link":
                b = 77;
                break;
            case "list":
                b = 78;
                break;
            case "live":
                b = 79;
                break;
            case "page":
                b = 80;
                break;
            case "poll":
                b = 81;
                break;
            case "quiz":
                b = 82;
                break;
            case "room":
                b = 83;
                break;
            case "show":
                b = 84;
                break;
            case "site":
                b = 85;
                break;
            case "song":
                b = 86;
                break;
            case "tour":
                b = 87;
                break;
            case "user":
                b = 88;
                break;
            case "work":
                b = 89;
                break;
            case "onboarding":
                b = 90;
                break;
            case "album":
                b = 91;
                break;
            case "audio":
                b = 92;
                break;
            case "blend":
                b = 93;
                break;
            case "chart":
                b = 94;
                break;
            case "genre":
                b = 95;
                break;
            case "image":
                b = 96;
                break;
            case "label":
                b = 97;
                break;
            case "local":
                b = 98;
                break;
            case "media":
                b = 99;
                break;
            case "merch":
                b = 100;
                break;
            case "party":
                b = 101;
                break;
            case "radio":
                b = 102;
                break;
            case "space":
                b = 103;
                break;
            case "topic":
                b = 104;
                break;
            case "track":
                b = 105;
                break;
            case "venue":
                b = 106;
                break;
            case "video":
                b = 107;
                break;
            case "xlink":
                b = 108;
                break;
            case "connect-device-picker":
                b = 109;
                break;
            case "premium-destination":
                b = 110;
                break;
            case "audiobook":
                b = 111;
                break;
            case "festival":
                b = 112;
                break;
            case "cached-files":
                b = 113;
                break;
            case "concert-gallery":
                b = 114;
                break;
            case "concert-offer":
                b = 115;
                break;
            case "local-files":
                b = 116;
                break;
            case "chat-invite":
                b = 117;
                break;
            case "ai-session":
                b = 118;
                break;
            case "sectionset":
                b = 119;
                break;
            case "ai-playlist":
                b = 120;
                break;
            case "end-group":
                b = 121;
                break;
            case "watch-feed-pivots":
                b = 122;
                break;
            case "dynamic-playlist-session":
                b = 123;
                break;
            case "internal":
                b = 124;
                break;
            case "s4dperson":
                b = 125;
                break;
            case "prerelease":
                b = 126;
                break;
            case "graduation":
                b = 127;
                break;
            case "upcoming-releases":
                b = 128;
                break;
            case "promotion-item":
                b = 129;
                break;
            case "podcast-chapter":
                b = 130;
                break;
            case "listeningstats":
                b = 131;
                break;
            case "findaway-content":
                b = 132;
                break;
            case "audiobrowse":
                b = 133;
                break;
            case "licensor":
                b = 134;
                break;
            case "supplementarymaterial":
                b = 135;
                break;
            case "comment":
                b = 136;
                break;
            case "concept":
                b = 137;
                break;
            case "concert":
                b = 138;
                break;
            case "recording":
                b = 139;
                break;
            case "liveradio":
                b = 140;
                break;
            case "creator":
                b = 141;
                break;
            case "amazon-ad":
                b = 142;
                break;
            case "trackset":
                b = 143;
                break;
            case "playlist-format":
                b = MessagePack.Code.FIXARRAY_PREFIX;
                break;
            case "wrapped-2021":
                b = 145;
                break;
            case "wrapped-2022":
                b = 146;
                break;
            case "start-group":
                b = 147;
                break;
            case "artist-music-videos":
                b = 148;
                break;
            case "challenge":
                b = 149;
                break;
            case "licensor-label":
                b = 150;
                break;
            case "settings":
                b = 151;
                break;
            case "publisher":
                b = 152;
                break;
            case "dailymix":
                b = 153;
                break;
            case "running":
                b = 154;
                break;
            case "chat-list":
                b = 155;
                break;
            case "learning":
                b = 156;
                break;
            case "wrapped":
                b = 157;
                break;
            case "watch-feed-category":
                b = 158;
                break;
            case "quickstart":
                b = 159;
                break;
            case "concert-offer-provider":
                b = MessagePack.Code.FIXSTR_PREFIX;
                break;
            case "wrapped-party":
                b = 161;
                break;
            case "enhanced":
                b = 162;
                break;
            case "wrapped-share":
                b = 163;
                break;
            case "playlist":
                b = 164;
                break;
            case "section":
                b = 165;
                break;
            case "user-highlight":
                b = 166;
                break;
            default:
                b = -1;
                break;
        }
        String strM61612e5 = "";
        switch (b) {
            case 0:
                this.f79270c = df41.ANTHOLOGY;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 1:
                this.f79270c = df41.DATA_DOWNLOAD;
                if (!mf41Var.m61608a()) {
                    throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 2:
                this.f79270c = df41.ONLYYOU_SHARE;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 3:
                this.f79270c = df41.FOLLOWFEED;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 4:
                this.f79270c = df41.CONCERT_CAMPAIGN;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 5:
                this.f79270c = df41.ACTIVITY_CENTER;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 6:
                strM61609b = mf41Var.m61609b();
                if (mf41Var.m61608a()) {
                    df41Var3 = df41.CUSTOM_STATION;
                    this.f79270c = df41Var3;
                    if (!mx8.m63086b(strM61609b)) {
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                    }
                    strM61609b4 = strM61609b;
                    df41Var3 = df41Var3;
                    strM61612e3 = null;
                    r112 = arrayList;
                    strM61609b2 = null;
                    r17 = r112;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    r15 = r17;
                    j = -1;
                    r111 = r15;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                this.f79270c = df41.STATION;
                strM61609b.getClass();
                switch (strM61609b) {
                    case "artist":
                        df41Var = df41.ARTIST;
                        r11 = arrayList;
                        if (mf41Var.m61611d().contains(":related-videos:")) {
                            df41Var = df41.ARTIST_RELATED_VIDEO;
                            ArrayList arrayList2 = new ArrayList();
                            String[] strArrSplit = mf41Var.m61612e().split(":");
                            if (strArrSplit.length != 3) {
                                throw new SpotifyUriParserException("Invalid ARTIST_RELATED_VIDEO format", true);
                            }
                            arrayList2.add(strArrSplit[0]);
                            arrayList2.add(strArrSplit[2]);
                            r11 = arrayList2;
                        }
                        df41Var3 = df41Var;
                        strM61609b2 = null;
                        r10 = r11;
                        r18 = r10;
                        if (df41Var3 != df41.ARTIST_RELATED_VIDEO) {
                            strM61612e2 = mf41Var.m61612e();
                            r16 = r10;
                            strM61609b4 = strM61612e2;
                            df41Var3 = df41Var3;
                            r17 = r16;
                            strM61612e3 = null;
                            str4 = null;
                            strM61609b5 = null;
                            strM61609b6 = null;
                            r15 = r17;
                            j = -1;
                            r111 = r15;
                            str2 = null;
                            str3 = null;
                            r110 = r111;
                            this.f79272e = strM61609b4;
                            this.f79271d = strM61609b2;
                            this.f79273f = strM61612e3;
                            this.f79274g = strM61609b5;
                            this.f79275h = str4;
                            this.f79276i = j;
                            this.f79265X = df41Var3;
                            this.f79266Y = r110;
                            this.f79267Z = strM61609b6;
                            this.f79263L0 = str2;
                            this.f79277t = str3;
                            return;
                        }
                        df41Var3 = df41Var3;
                        r19 = r18;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        j = -1;
                        strM61609b4 = null;
                        r111 = r19;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "user":
                        strM61609b2 = mf41Var.m61609b();
                        String strM61609b8 = mf41Var.m61609b();
                        if ("playlist".equals(strM61609b8)) {
                            df41Var2 = df41.PLAYLIST;
                        } else {
                            if (!"cluster".equals(strM61609b8)) {
                                throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                            }
                            df41Var2 = df41.CLUSTER;
                        }
                        df41Var3 = df41Var2;
                        r10 = arrayList;
                        r18 = r10;
                        if (df41Var3 != df41.ARTIST_RELATED_VIDEO) {
                            strM61612e2 = mf41Var.m61612e();
                            r16 = r10;
                            strM61609b4 = strM61612e2;
                            df41Var3 = df41Var3;
                            r17 = r16;
                            strM61612e3 = null;
                            str4 = null;
                            strM61609b5 = null;
                            strM61609b6 = null;
                            r15 = r17;
                            j = -1;
                            r111 = r15;
                            str2 = null;
                            str3 = null;
                            r110 = r111;
                            this.f79272e = strM61609b4;
                            this.f79271d = strM61609b2;
                            this.f79273f = strM61612e3;
                            this.f79274g = strM61609b5;
                            this.f79275h = str4;
                            this.f79276i = j;
                            this.f79265X = df41Var3;
                            this.f79266Y = r110;
                            this.f79267Z = strM61609b6;
                            this.f79263L0 = str2;
                            this.f79277t = str3;
                            return;
                        }
                        df41Var3 = df41Var3;
                        r19 = r18;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        j = -1;
                        strM61609b4 = null;
                        r111 = r19;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "album":
                        df41Var = df41.ALBUM;
                        r11 = arrayList;
                        df41Var3 = df41Var;
                        strM61609b2 = null;
                        r10 = r11;
                        r18 = r10;
                        if (df41Var3 != df41.ARTIST_RELATED_VIDEO) {
                            strM61612e2 = mf41Var.m61612e();
                            r16 = r10;
                            strM61609b4 = strM61612e2;
                            df41Var3 = df41Var3;
                            r17 = r16;
                            strM61612e3 = null;
                            str4 = null;
                            strM61609b5 = null;
                            strM61609b6 = null;
                            r15 = r17;
                            j = -1;
                            r111 = r15;
                            str2 = null;
                            str3 = null;
                            r110 = r111;
                            this.f79272e = strM61609b4;
                            this.f79271d = strM61609b2;
                            this.f79273f = strM61612e3;
                            this.f79274g = strM61609b5;
                            this.f79275h = str4;
                            this.f79276i = j;
                            this.f79265X = df41Var3;
                            this.f79266Y = r110;
                            this.f79267Z = strM61609b6;
                            this.f79263L0 = str2;
                            this.f79277t = str3;
                            return;
                        }
                        df41Var3 = df41Var3;
                        r19 = r18;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        j = -1;
                        strM61609b4 = null;
                        r111 = r19;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "genre":
                        df41Var = df41.GENRE;
                        r11 = arrayList;
                        df41Var3 = df41Var;
                        strM61609b2 = null;
                        r10 = r11;
                        r18 = r10;
                        if (df41Var3 != df41.ARTIST_RELATED_VIDEO) {
                            strM61612e2 = mf41Var.m61612e();
                            r16 = r10;
                            strM61609b4 = strM61612e2;
                            df41Var3 = df41Var3;
                            r17 = r16;
                            strM61612e3 = null;
                            str4 = null;
                            strM61609b5 = null;
                            strM61609b6 = null;
                            r15 = r17;
                            j = -1;
                            r111 = r15;
                            str2 = null;
                            str3 = null;
                            r110 = r111;
                            this.f79272e = strM61609b4;
                            this.f79271d = strM61609b2;
                            this.f79273f = strM61612e3;
                            this.f79274g = strM61609b5;
                            this.f79275h = str4;
                            this.f79276i = j;
                            this.f79265X = df41Var3;
                            this.f79266Y = r110;
                            this.f79267Z = strM61609b6;
                            this.f79263L0 = str2;
                            this.f79277t = str3;
                            return;
                        }
                        df41Var3 = df41Var3;
                        r19 = r18;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        j = -1;
                        strM61609b4 = null;
                        r111 = r19;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "track":
                        df41Var = df41.TRACK;
                        r11 = arrayList;
                        df41Var3 = df41Var;
                        strM61609b2 = null;
                        r10 = r11;
                        r18 = r10;
                        if (df41Var3 != df41.ARTIST_RELATED_VIDEO) {
                            strM61612e2 = mf41Var.m61612e();
                            r16 = r10;
                            strM61609b4 = strM61612e2;
                            df41Var3 = df41Var3;
                            r17 = r16;
                            strM61612e3 = null;
                            str4 = null;
                            strM61609b5 = null;
                            strM61609b6 = null;
                            r15 = r17;
                            j = -1;
                            r111 = r15;
                            str2 = null;
                            str3 = null;
                            r110 = r111;
                            this.f79272e = strM61609b4;
                            this.f79271d = strM61609b2;
                            this.f79273f = strM61612e3;
                            this.f79274g = strM61609b5;
                            this.f79275h = str4;
                            this.f79276i = j;
                            this.f79265X = df41Var3;
                            this.f79266Y = r110;
                            this.f79267Z = strM61609b6;
                            this.f79263L0 = str2;
                            this.f79277t = str3;
                            return;
                        }
                        df41Var3 = df41Var3;
                        r19 = r18;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        j = -1;
                        strM61609b4 = null;
                        r111 = r19;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "playlist":
                        df41Var = df41.PLAYLIST_V2;
                        r11 = arrayList;
                        df41Var3 = df41Var;
                        strM61609b2 = null;
                        r10 = r11;
                        r18 = r10;
                        if (df41Var3 != df41.ARTIST_RELATED_VIDEO) {
                            strM61612e2 = mf41Var.m61612e();
                            r16 = r10;
                            strM61609b4 = strM61612e2;
                            df41Var3 = df41Var3;
                            r17 = r16;
                            strM61612e3 = null;
                            str4 = null;
                            strM61609b5 = null;
                            strM61609b6 = null;
                            r15 = r17;
                            j = -1;
                            r111 = r15;
                            str2 = null;
                            str3 = null;
                            r110 = r111;
                            this.f79272e = strM61609b4;
                            this.f79271d = strM61609b2;
                            this.f79273f = strM61612e3;
                            this.f79274g = strM61609b5;
                            this.f79275h = str4;
                            this.f79276i = j;
                            this.f79265X = df41Var3;
                            this.f79266Y = r110;
                            this.f79267Z = strM61609b6;
                            this.f79263L0 = str2;
                            this.f79277t = str3;
                            return;
                        }
                        df41Var3 = df41Var3;
                        r19 = r18;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        j = -1;
                        strM61609b4 = null;
                        r111 = r19;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    default:
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
            case 7:
                this.f79270c = df41.LEX_EXPERIMENTS;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 8:
                this.f79270c = df41.CONTRIBUTOR;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 9:
                this.f79270c = df41.PLAYLISTS;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 10:
                this.f79270c = df41.AGE_ASSURANCE;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 11:
                if (!"share".equals(mf41Var.m61609b())) {
                    throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                this.f79270c = df41.FANDOM_COLLECTIBLE_SHARE;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 12:
                this.f79270c = df41.EXPRESSION;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 13:
                if (mf41Var.m61608a()) {
                    this.f79270c = df41.COLLECTION;
                    df41Var3 = df41Var3;
                    r19 = arrayList;
                    strM61612e3 = null;
                    strM61609b2 = null;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    j = -1;
                    strM61609b4 = null;
                    r111 = r19;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                if (!mf41Var.m61611d().startsWith("tag:")) {
                    strM61612e = mf41Var.m61612e();
                    strM61612e.getClass();
                    switch (strM61612e) {
                        case "your-episodes":
                            this.f79270c = df41.COLLECTION_YOUR_EPISODES;
                            strM61612e = null;
                            break;
                        case "tags":
                            this.f79270c = df41.COLLECTION_TAGS;
                            strM61612e = null;
                            break;
                        case "podcasts:episodes":
                            this.f79270c = df41.COLLECTION_NEW_EPISODES;
                            strM61612e = null;
                            break;
                        default:
                            this.f79270c = df41.COLLECTION;
                            break;
                    }
                } else {
                    mf41Var.m61609b();
                    this.f79270c = df41.COLLECTION_TAG_DETAIL;
                    strM61612e = mf41Var.m61612e();
                }
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 14:
                this.f79270c = df41.TRANSCRIPT;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 15:
                this.f79270c = df41.TRANSITION;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 16:
                this.f79270c = df41.B2B_PARTY;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 17:
                if (!"stories".equals(mf41Var.m61609b())) {
                    throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                this.f79270c = df41.FANDOM_COLLECTIBLES_STORIES;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 18:
                this.f79270c = df41.EPISODE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 19:
                strM61609b = mf41Var.m61609b();
                if (mf41Var.m61608a()) {
                    this.f79270c = df41.ARTIST;
                    strM61609b4 = strM61609b;
                    df41Var3 = df41Var3;
                    strM61612e3 = null;
                    r112 = arrayList;
                    strM61609b2 = null;
                    r17 = r112;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    r15 = r17;
                    j = -1;
                    r111 = r15;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                String strM61609b9 = mf41Var.m61609b();
                if ("dna".equals(strM61609b9)) {
                    if (!mf41Var.m61608a() && "blend".equals(mf41Var.m61609b())) {
                        this.f79270c = df41.BLEND_DNA;
                        strM61609b3 = mf41Var.m61609b();
                        r14 = arrayList;
                    } else {
                        this.f79270c = df41.ARTIST_DNA;
                        strM61609b3 = null;
                        r14 = arrayList;
                    }
                    strM61609b9 = null;
                    r12 = r14;
                } else if ("concerts".equals(strM61609b9)) {
                    if (mf41Var.m61608a()) {
                        this.f79270c = df41.ARTIST_CONCERTS;
                    } else {
                        if (!"all".equals(mf41Var.m61609b())) {
                            throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                        }
                        this.f79270c = df41.ARTIST_CONCERTS_ALL;
                    }
                    strM61609b3 = null;
                    r14 = arrayList;
                    strM61609b9 = null;
                    r12 = r14;
                } else if ("related-videos".equals(strM61609b9) && !mf41Var.m61608a()) {
                    this.f79270c = df41.ARTIST_RELATED_VIDEO;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(strM61609b);
                    arrayList3.add(mf41Var.m61609b());
                    strM61609b3 = null;
                    strM61609b = null;
                    r14 = arrayList3;
                    strM61609b9 = null;
                    r12 = r14;
                } else {
                    if (!f79262N0.contains(strM61609b9)) {
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                    }
                    this.f79270c = df41.ARTIST;
                    strM61609b3 = null;
                    r12 = arrayList;
                }
                strM61609b4 = strM61609b;
                r13 = r12;
                strM61609b2 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                str2 = null;
                str3 = strM61609b9;
                str4 = strM61609b3;
                strM61612e3 = null;
                r110 = r13;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 20:
                this.f79270c = df41.AUTHOR;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 21:
                this.f79270c = df41.CANVAS;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 22:
                this.f79270c = df41.COURSE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 23:
                this.f79270c = df41.CHAT_MESSAGE;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 24:
                this.f79270c = df41.PRESENTS;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 25:
                this.f79270c = df41.FOLDER;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 26:
                this.f79270c = df41.DISCOVERY_FEED;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 27:
                this.f79270c = df41.MADE_FOR_YOU;
                if (!mf41Var.m61608a()) {
                    throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 28:
                this.f79270c = df41.TOGETHER;
                strM61609b2 = mf41Var.m61609b();
                r18 = arrayList;
                df41Var3 = df41Var3;
                r19 = r18;
                strM61612e3 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 29:
                this.f79270c = df41.BIRTHDAYS;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 30:
                this.f79270c = df41.SOCIALSESSION;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 31:
                this.f79270c = df41.EPISODE_SET;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 32:
                this.f79270c = df41.QUESTION;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 33:
                this.f79270c = df41.KALLAX;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 34:
                this.f79270c = df41.ADSPACE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 35:
                this.f79270c = df41.S4A_THIRD_PARTY;
                strM61612e = mf41Var.m61612e();
                if (!mx8.m63086b(strM61612e)) {
                    throw new SpotifyUriParserException(edb.m38564m("Not a valid base 62 id string ", strM61612e), true);
                }
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 36:
                this.f79270c = df41.MOSAIC;
                arrayList = new ArrayList();
                while (!mf41Var.m61608a()) {
                    arrayList.add(mf41Var.m61609b());
                }
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 37:
                this.f79270c = df41.SONGWRITER;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 38:
                this.f79270c = df41.PROMOTER;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 39:
                this.f79270c = df41.PROMPT;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 40:
                this.f79270c = df41.S4DAPP;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 41:
                this.f79270c = df41.SAMPLE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 42:
                this.f79270c = df41.SEARCH;
                if (!mf41Var.m61608a()) {
                    strM61612e = mf41Var.m61612e();
                    strM61609b4 = strM61612e;
                    df41Var3 = df41Var3;
                    strM61612e3 = null;
                    r112 = arrayList;
                    strM61609b2 = null;
                    r17 = r112;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    r15 = r17;
                    j = -1;
                    r111 = r15;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 43:
                this.f79270c = df41.IMAGESET;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 44:
                this.f79270c = df41.PERSONALIZED_SET;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 45:
                this.f79270c = df41.PREVIEW_CATALOG;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 46:
                this.f79270c = df41.UPSELL;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 47:
                String strM61609b10 = mf41Var.m61609b();
                strM61609b10.getClass();
                switch (strM61609b10) {
                    case "root":
                        this.f79270c = df41.VOTING_ROOT;
                        strM61612e = mf41Var.m61612e();
                        break;
                    case "share":
                        this.f79270c = df41.VOTING_SHARE;
                        strM61612e = mf41Var.m61612e();
                        break;
                    case "confirmation":
                        this.f79270c = df41.VOTING_CONFIRMATION;
                        strM61612e = mf41Var.m61612e();
                        break;
                    default:
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 48:
                this.f79270c = df41.PODCASTCHARTS;
                if (!mf41Var.m61608a()) {
                    strM61612e5 = mf41Var.m61612e();
                }
                df41Var3 = df41Var3;
                strM61609b4 = strM61612e5;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 49:
                this.f79270c = df41.PROMOTION;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 50:
                strM61609b = mf41Var.m61609b();
                if (mf41Var.m61608a()) {
                    this.f79270c = df41.AUDIOBOOK_LICENSOR;
                } else {
                    if (!"catalog".equals(mf41Var.m61609b())) {
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                    }
                    this.f79270c = df41.AUDIOBOOK_LICENSOR_CATALOG;
                }
                strM61609b4 = strM61609b;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 51:
                this.f79270c = df41.INTERNAL_ORGANIZATION;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 52:
                String strM61609b11 = mf41Var.m61609b();
                strM61609b11.getClass();
                switch (strM61609b11) {
                    case "available-plans":
                        this.f79270c = df41.ACCOUNT_MANAGEMENT_AVAILABLE_PLANS;
                        strM61612e = m44572g(str5, "tab");
                        strM61609b4 = strM61612e;
                        df41Var3 = df41Var3;
                        strM61612e3 = null;
                        r112 = arrayList;
                        strM61609b2 = null;
                        r17 = r112;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "aom":
                        this.f79270c = df41.ACCOUNT_MANAGEMENT_ADDON_MANAGEMENT;
                        strM61612e = m44572g(str5, "type");
                        strM61609b4 = strM61612e;
                        df41Var3 = df41Var3;
                        strM61612e3 = null;
                        r112 = arrayList;
                        strM61609b2 = null;
                        r17 = r112;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "plan-details":
                        this.f79270c = df41.ACCOUNT_MANAGEMENT_PLAN_DETAILS;
                        strM61612e = mf41Var.m61609b();
                        strM61609b4 = strM61612e;
                        df41Var3 = df41Var3;
                        strM61612e3 = null;
                        r112 = arrayList;
                        strM61609b2 = null;
                        r17 = r112;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "plan-overview-legacy":
                        this.f79270c = df41.ACCOUNT_MANAGEMENT_PLAN_OVERVIEW_LEGACY;
                        strM61612e = null;
                        strM61609b4 = strM61612e;
                        df41Var3 = df41Var3;
                        strM61612e3 = null;
                        r112 = arrayList;
                        strM61609b2 = null;
                        r17 = r112;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "plan-overview":
                        this.f79270c = df41.ACCOUNT_MANAGEMENT_PLAN_OVERVIEW;
                        strM61612e = null;
                        strM61609b4 = strM61612e;
                        df41Var3 = df41Var3;
                        strM61612e3 = null;
                        r112 = arrayList;
                        strM61609b2 = null;
                        r17 = r112;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    default:
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
            case 53:
                this.f79270c = df41.DESCRIPTOR;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 54:
                this.f79270c = df41.ENTITY_SET;
                String strM61609b12 = mf41Var.m61609b();
                ArrayList arrayList4 = new ArrayList();
                while (!mf41Var.m61608a()) {
                    arrayList4.add(mf41Var.m61609b());
                }
                r13 = arrayList4;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                str3 = null;
                str2 = strM61609b12;
                strM61612e3 = null;
                r110 = r13;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 55:
                this.f79270c = df41.CHAT_SHARE_PREVIEW;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 56:
                this.f79270c = df41.DATASTORIES;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 57:
                this.f79270c = df41.REFERRAL;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 58:
                this.f79270c = df41.COMMERCIAL_PARTNER;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                this.f79270c = df41.CONCERTS;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 60:
                if (!mf41Var.m61608a()) {
                    throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                this.f79270c = df41.FOREVER_FAVORITES;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 61:
                this.f79270c = df41.SITEMODAL;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 62:
                this.f79270c = df41.MERCH_HUB;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 63:
                this.f79270c = df41.ZEROTAP;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 64:
                this.f79270c = df41.RESPONSE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 65:
                this.f79270c = df41.CLIP_VIDEO_CHAPTER;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 66:
                this.f79270c = df41.INTERRUPTION;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 67:
                strM61612e = mf41Var.m61609b();
                if ("discovery-feed".equals(strM61612e)) {
                    this.f79270c = df41.DISCOVERY_FEED_NAVIGATION;
                    strM61612e = mf41Var.m61612e();
                } else if ("music-videos-feed".equals(strM61612e)) {
                    this.f79270c = df41.MUSIC_VIDEOS_FEED_NAVIGATION;
                    strM61612e = mf41Var.m61612e();
                } else {
                    this.f79270c = df41.WATCH_FEED;
                    if (!mf41Var.m61608a()) {
                        strM61612e = klh.m56834f(strM61612e, ":", mf41Var.m61612e());
                    }
                }
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 68:
                String strM61609b13 = mf41Var.m61609b();
                strM61609b13.getClass();
                if (strM61609b13.equals("stories")) {
                    this.f79270c = df41.CULTURAL_MOMENT_STORIES;
                    strM61612e = mf41Var.m61612e();
                } else {
                    if (!strM61609b13.equals("hub")) {
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                    }
                    this.f79270c = df41.CULTURAL_MOMENT;
                    strM61612e = mf41Var.m61612e();
                }
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 69:
                this.f79270c = df41.DEVICEPRESET;
                strM61609b6 = mf41Var.m61609b();
                strM61609b4 = mf41Var.m61609b();
                df41Var3 = df41Var3;
                r15 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 70:
                this.f79270c = df41.EXPERIENCE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 71:
                this.f79270c = df41.AD;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 72:
                this.f79270c = df41.APPLICATION;
                strM61612e = mf41Var.m61612e();
                for (int i = 0; i < strM61612e.length(); i++) {
                    char cCharAt = strM61612e.charAt(i);
                    if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == '/' || cCharAt == '.' || cCharAt == ':'))) {
                        throw new SpotifyUriParserException("Invalid Spotify application id: ".concat(strM61612e), this.f79268a);
                    }
                }
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 73:
                if (mf41Var.m61608a()) {
                    this.f79270c = df41.JAM;
                    df41Var3 = df41Var3;
                    strM61609b4 = strM61612e5;
                    strM61612e3 = null;
                    r112 = arrayList;
                    strM61609b2 = null;
                    r17 = r112;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    r15 = r17;
                    j = -1;
                    r111 = r15;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                String strM61609b14 = mf41Var.m61609b();
                strM61609b14.getClass();
                switch (strM61609b14) {
                    case "artist":
                        this.f79270c = df41.JAM_ARTIST;
                        strM61612e = mf41Var.m61612e();
                        break;
                    case "play":
                        this.f79270c = df41.JAM;
                        strM61612e = "play";
                        break;
                    case "album":
                        this.f79270c = df41.JAM_ALBUM;
                        strM61612e = mf41Var.m61612e();
                        break;
                    case "playlist":
                        this.f79270c = df41.JAM_PLAYLIST;
                        strM61612e = mf41Var.m61612e();
                        break;
                    default:
                        throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 74:
                this.f79270c = df41.CHAT;
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 75:
                this.f79270c = df41.CLIP;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 76:
                this.f79270c = df41.HOME;
                df41Var3 = df41Var3;
                r19 = arrayList;
                strM61612e3 = null;
                strM61609b2 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                strM61609b4 = null;
                r111 = r19;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 77:
                this.f79270c = df41.LINK;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 78:
                this.f79270c = df41.LIST;
                String strM61609b15 = mf41Var.m61609b();
                String strM61609b16 = mf41Var.m61609b();
                if (!mf41Var.m61608a()) {
                    throw new SpotifyUriParserException("List uri with too many components: ".concat(str), true);
                }
                strM61609b4 = strM61609b16;
                strM61612e3 = null;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                j = -1;
                str3 = null;
                str2 = strM61609b15;
                strM61609b2 = null;
                r110 = arrayList;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 79:
                this.f79270c = df41.LIVE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 80:
                this.f79270c = df41.PAGE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 81:
                this.f79270c = df41.POLL;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 82:
                if (mf41Var.m61608a()) {
                    this.f79270c = df41.QUIZ;
                    df41Var3 = df41Var3;
                    r19 = arrayList;
                    strM61612e3 = null;
                    strM61609b2 = null;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    j = -1;
                    strM61609b4 = null;
                    r111 = r19;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                if (!"music".equals(mf41Var.m61609b())) {
                    throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                this.f79270c = df41.QUIZ_MUSIC;
                if (mf41Var.m61608a()) {
                    throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), true);
                }
                strM61612e = mf41Var.m61609b();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 83:
                this.f79270c = df41.ROOM;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 84:
                this.f79270c = df41.SHOW;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 85:
                this.f79270c = df41.SITE;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                this.f79270c = df41.SONG;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case 87:
                this.f79270c = df41.TOUR;
                strM61612e = mf41Var.m61612e();
                strM61609b4 = strM61612e;
                df41Var3 = df41Var3;
                strM61612e3 = null;
                r112 = arrayList;
                strM61609b2 = null;
                r17 = r112;
                str4 = null;
                strM61609b5 = null;
                strM61609b6 = null;
                r15 = r17;
                j = -1;
                r111 = r15;
                str2 = null;
                str3 = null;
                r110 = r111;
                this.f79272e = strM61609b4;
                this.f79271d = strM61609b2;
                this.f79273f = strM61612e3;
                this.f79274g = strM61609b5;
                this.f79275h = str4;
                this.f79276i = j;
                this.f79265X = df41Var3;
                this.f79266Y = r110;
                this.f79267Z = strM61609b6;
                this.f79263L0 = str2;
                this.f79277t = str3;
                return;
            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                strM61609b2 = mf41Var.m61609b();
                if (!"facebook".equals(strM61609b2) || mf41Var.m61608a()) {
                    j2 = 0;
                } else {
                    try {
                        j2 = Long.parseLong(mf41Var.m61611d());
                    } catch (NumberFormatException unused) {
                        j2 = 0;
                    }
                }
                if (j2 > 0) {
                    this.f79270c = df41.FACEBOOK_USER;
                    strM61612e = mf41Var.m61611d();
                    strM61609b4 = strM61612e;
                    df41Var3 = df41Var3;
                    strM61612e3 = null;
                    r112 = arrayList;
                    strM61609b2 = null;
                    r17 = r112;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    r15 = r17;
                    j = -1;
                    r111 = r15;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                if (mf41Var.m61608a()) {
                    this.f79270c = df41.USER;
                    r18 = arrayList;
                    df41Var3 = df41Var3;
                    r19 = r18;
                    strM61612e3 = null;
                    str4 = null;
                    strM61609b5 = null;
                    strM61609b6 = null;
                    j = -1;
                    strM61609b4 = null;
                    r111 = r19;
                    str2 = null;
                    str3 = null;
                    r110 = r111;
                    this.f79272e = strM61609b4;
                    this.f79271d = strM61609b2;
                    this.f79273f = strM61612e3;
                    this.f79274g = strM61609b5;
                    this.f79275h = str4;
                    this.f79276i = j;
                    this.f79265X = df41Var3;
                    this.f79266Y = r110;
                    this.f79267Z = strM61609b6;
                    this.f79263L0 = str2;
                    this.f79277t = str3;
                    return;
                }
                String strM61609b17 = mf41Var.m61609b();
                strM61609b17.getClass();
                switch (strM61609b17) {
                    case "followfeed":
                        this.f79270c = df41.FOLLOWFEED;
                        if (mf41Var.m61608a()) {
                            strM61612e2 = null;
                            r16 = arrayList;
                        } else {
                            if (!"album".equals(mf41Var.m61609b())) {
                                throw new SpotifyUriParserException("Malformed Spotify uri: ".concat(str), this.f79268a);
                            }
                            strM61612e2 = mf41Var.m61609b();
                            r16 = arrayList;
                        }
                        strM61609b4 = strM61612e2;
                        df41Var3 = df41Var3;
                        r17 = r16;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "starred":
                        this.f79270c = df41.STARRED;
                        strM61612e2 = null;
                        r16 = arrayList;
                        strM61609b4 = strM61612e2;
                        df41Var3 = df41Var3;
                        r17 = r16;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "collectionrootlist":
                        this.f79270c = df41.COLLECTION_ROOT;
                        strM61612e2 = null;
                        r16 = arrayList;
                        strM61609b4 = strM61612e2;
                        df41Var3 = df41Var3;
                        r17 = r16;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "playlists":
                        this.f79270c = df41.USER_PLAYLISTS;
                        strM61612e2 = null;
                        r16 = arrayList;
                        strM61609b4 = strM61612e2;
                        df41Var3 = df41Var3;
                        r17 = r16;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "purchaselist":
                        this.f79270c = df41.PURCHASE_PLAYLIST;
                        strM61612e2 = null;
                        r16 = arrayList;
                        strM61609b4 = strM61612e2;
                        df41Var3 = df41Var3;
                        r17 = r16;
                        strM61612e3 = null;
                        str4 = null;
                        strM61609b5 = null;
                        strM61609b6 = null;
                        r15 = r17;
                        j = -1;
                        r111 = r15;
                        str2 = null;
                        str3 = null;
                        r110 = r111;
                        this.f79272e = strM61609b4;
                        this.f79271d = strM61609b2;
                        this.f79273f = strM61612e3;
                        this.f79274g = strM61609b5;
                        this.f79275h = str4;
                        this.f79276i = j;
                        this.f79265X = df41Var3;
                        this.f79266Y = r110;
                        this.f79267Z = strM61609b6;
                        this.f79263L0 = str2;
                        this.f79277t = str3;
                        return;
                    case "collection":
                        if (mf41Var.m61608a()) {
                            this.f79270c = df41.COLLECTION;
                        } else {
                            String strM61609b18 = mf41Var.m61609b();
                            strM61609b18.getClass();
                            switch (strM61609b18.hashCode()) {
                                case -1409097913:
                                    if (strM61609b18.equals("artist")) {
                                    }
                                    break;
                                case -780378574:
                                    if (strM61609b18.equals("your-episodes")) {
                                    }
                                    break;
                                case 92896879:
                                    if (strM61609b18.equals("album")) {
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                */
                            /*
                                Method dump skipped, instruction units count: 8114
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p204p.gf41.<init>(java.lang.String):void");
                        }

                        /* JADX INFO: renamed from: a */
                        public static gf41 m44569a(String str) {
                            return new gf41(df41.ALBUM, str, 0);
                        }

                        /* JADX INFO: renamed from: d */
                        public static String m44570d(String str) {
                            try {
                                String strEncode = URLEncoder.encode(str, "utf-8");
                                return strEncode.indexOf(42) != -1 ? strEncode.replace(Auth.WILDCARD_CLIENTID, "%2A") : strEncode;
                            } catch (UnsupportedEncodingException e) {
                                throw new RuntimeException(e);
                            }
                        }

                        /* JADX INFO: renamed from: e */
                        public static String m44571e(String str) {
                            try {
                                String strEncode = URLEncoder.encode(str, "utf-8");
                                if (strEncode.indexOf(42) != -1) {
                                    strEncode = strEncode.replace(Auth.WILDCARD_CLIENTID, "%2A");
                                }
                                return strEncode.contains("%7E") ? strEncode.replace("%7E", "~") : strEncode;
                            } catch (UnsupportedEncodingException e) {
                                throw new RuntimeException(e);
                            }
                        }

                        /* JADX INFO: renamed from: g */
                        public static String m44572g(String str, String str2) {
                            if (str == null) {
                                return "0";
                            }
                            Matcher matcher = Pattern.compile("[?&]" + str2 + "=(\\d+)").matcher(str);
                            return matcher.find() ? matcher.group(1) : "0";
                        }

                        /* JADX INFO: renamed from: h */
                        public static gf41 m44573h(String str) {
                            return new gf41(df41.IMAGE, str, 0);
                        }

                        /* JADX INFO: renamed from: j */
                        public static int m44574j(String str, String str2) {
                            if (str == str2) {
                                return 0;
                            }
                            if (str == null) {
                                return -1;
                            }
                            if (str2 == null) {
                                return 1;
                            }
                            return str.compareTo(str2);
                        }

                        /* JADX INFO: renamed from: l */
                        public static gf41 m44575l(String str) {
                            return new gf41(df41.TRACK, str, 0);
                        }

                        /* JADX WARN: Code duplicated, block: B:439:0x07ba  */
                        /* JADX INFO: renamed from: b */
                        public final StringBuilder m44576b() {
                            char c;
                            StringBuilder sb = new StringBuilder("spotify:");
                            df41 df41Var = this.f79270c;
                            int iOrdinal = df41Var.ordinal();
                            String str = this.f79263L0;
                            String str2 = this.f79273f;
                            String str3 = this.f79277t;
                            List<String> list = this.f79266Y;
                            String str4 = this.f79271d;
                            String str5 = this.f79272e;
                            switch (iOrdinal) {
                                case 1:
                                    sb.append("age-assurance:web:collect");
                                    return sb;
                                case 2:
                                    sb.append("artist:");
                                    sb.append(str5);
                                    if (str3 != null) {
                                        sb.append(":");
                                        sb.append(str3);
                                    }
                                    return sb;
                                case 3:
                                    sb.append("artist:");
                                    sb.append((String) list.get(0));
                                    sb.append(":related-videos:");
                                    sb.append((String) list.get(1));
                                    return sb;
                                case 4:
                                    sb.append("artist:");
                                    sb.append(str5);
                                    sb.append(":concerts");
                                    return sb;
                                case 5:
                                    sb.append("artist:");
                                    sb.append(str5);
                                    sb.append(":concerts:all");
                                    return sb;
                                case 6:
                                    sb.append("album:");
                                    sb.append(str5);
                                    if (str3 != null) {
                                        sb.append(":");
                                        sb.append(str3);
                                        return sb;
                                    }
                                    return sb;
                                case 7:
                                    if (str5 == null) {
                                        sb.append("search");
                                        return sb;
                                    }
                                    sb.append("search:");
                                    sb.append(m44571e(str5));
                                    return sb;
                                case 8:
                                    sb.append("track:");
                                    sb.append(str5);
                                    return sb;
                                case 9:
                                    sb.append("audio:");
                                    sb.append(str5);
                                    return sb;
                                case 10:
                                    sb.append("work:");
                                    sb.append(str5);
                                    return sb;
                                case 11:
                                    sb.append("genre:");
                                    sb.append(str5);
                                    return sb;
                                case 12:
                                    sb.append("user:");
                                    sb.append(m44571e(str4));
                                    sb.append(":playlist:");
                                    sb.append(str5);
                                    return sb;
                                case 13:
                                    sb.append("playlist:");
                                    sb.append(str5);
                                    if (str3 != null) {
                                        sb.append(":");
                                        sb.append(str3);
                                        return sb;
                                    }
                                    return sb;
                                case 14:
                                    sb.append("playlist-format:");
                                    sb.append(str5);
                                    return sb;
                                case 15:
                                    sb.append("playlists");
                                    return sb;
                                case 16:
                                    sb.append("activate");
                                    return sb;
                                case 17:
                                case 32:
                                case 34:
                                case 35:
                                case 53:
                                case 60:
                                default:
                                    throw new RuntimeException("Unknown Spotify uri kind: ".concat(String.valueOf(df41Var)));
                                case 18:
                                    sb.append("internal:");
                                    sb.append(str5);
                                    return sb;
                                case 19:
                                    sb.append("local:");
                                    sb.append(m44570d(str2));
                                    sb.append(":");
                                    sb.append(m44570d(this.f79274g));
                                    sb.append(":");
                                    sb.append(m44570d(str5));
                                    long j = this.f79276i;
                                    if (j >= 0) {
                                        sb.append(":");
                                        sb.append(j);
                                        return sb;
                                    }
                                    if (j != -1) {
                                        sb.append(":");
                                        return sb;
                                    }
                                    return sb;
                                case 20:
                                    sb.append("local-files");
                                    return sb;
                                case 21:
                                    sb.append("cached-files");
                                    return sb;
                                case 22:
                                    sb.append("user:");
                                    sb.append(m44571e(str4));
                                    return sb;
                                case 23:
                                    a831.m25017i(sb, "user:", str4, ":starred");
                                    return sb;
                                case 24:
                                    sb.append("ad:");
                                    sb.append(str5);
                                    return sb;
                                case 25:
                                    sb.append("amazon-ad:");
                                    sb.append(str5);
                                    return sb;
                                case 26:
                                    sb.append("interruption:");
                                    sb.append(str5);
                                    return sb;
                                case 27:
                                    a831.m25017i(sb, "user:", str4, ":toplist");
                                    return sb;
                                case 28:
                                    a831.m25017i(sb, "user:", str4, ":recent");
                                    return sb;
                                case 29:
                                    sb.append("radio");
                                    for (String str6 : list) {
                                        sb.append(":");
                                        sb.append(m44571e(str6));
                                    }
                                    return sb;
                                case 30:
                                    sb.append("station:");
                                    df41 df41Var2 = this.f79265X;
                                    int iOrdinal2 = df41Var2.ordinal();
                                    if (iOrdinal2 == 2) {
                                        sb.append(df41Var2.f48461a);
                                        sb.append(':');
                                    } else if (iOrdinal2 == 3) {
                                        sb.append("artist:");
                                        sb.append((String) list.get(0));
                                        sb.append(":related-videos:");
                                        sb.append((String) list.get(1));
                                    } else if (iOrdinal2 == 6 || iOrdinal2 == 8) {
                                        sb.append(df41Var2.f48461a);
                                        sb.append(':');
                                    } else if (iOrdinal2 != 69) {
                                        switch (iOrdinal2) {
                                            case 11:
                                                sb.append(df41Var2.f48461a);
                                                sb.append(':');
                                                break;
                                            case 12:
                                                a831.m25017i(sb, "user:", str4, ":playlist:");
                                                break;
                                            case 13:
                                                sb.append("playlist:");
                                                break;
                                            default:
                                                throw new RuntimeException("unexpected station kind ".concat(String.valueOf(df41Var2)));
                                        }
                                    } else {
                                        a831.m25017i(sb, "user:", str4, ":cluster:");
                                    }
                                    if (df41Var2 != df41.ARTIST_RELATED_VIDEO) {
                                        sb.append(str5);
                                        return sb;
                                    }
                                    return sb;
                                case 31:
                                    sb.append("image:");
                                    sb.append(str5);
                                    return sb;
                                case 33:
                                    sb.append("trackset:");
                                    sb.append(m44571e(str5));
                                    return sb;
                                case 36:
                                    sb.append("app:");
                                    sb.append(str5);
                                    return sb;
                                case 37:
                                    sb.append("user:facebook:");
                                    sb.append(str5);
                                    return sb;
                                case 38:
                                    a831.m25017i(sb, "user:", str4, ":collectionrootlist");
                                    return sb;
                                case 39:
                                    sb.append("user:");
                                    sb.append(m44571e(str4));
                                    sb.append(":collectiontracklist:");
                                    sb.append(str5);
                                    return sb;
                                case 40:
                                    a831.m25017i(sb, "user:", str4, ":publishedrootlist");
                                    return sb;
                                case 41:
                                    a831.m25017i(sb, "user:", str4, ":profilecontainer");
                                    return sb;
                                case 42:
                                    a831.m25017i(sb, "user:", str4, ":inbox");
                                    return sb;
                                case 43:
                                    a831.m25017i(sb, "user:", str4, ":rootlist");
                                    return sb;
                                case 44:
                                    a831.m25017i(sb, "user:", str4, ":purchaselist");
                                    return sb;
                                case 45:
                                    a831.m25017i(sb, "user:", str4, ":publishedstarred");
                                    return sb;
                                case 46:
                                    a831.m25017i(sb, "user:", str4, ":maskedstarred");
                                    return sb;
                                case 47:
                                    a831.m25017i(sb, "user:", str4, ":topfriends");
                                    return sb;
                                case 48:
                                    a831.m25017i(sb, "user:", str4, ":followers");
                                    return sb;
                                case 49:
                                    a831.m25017i(sb, "user:", str4, ":following");
                                    return sb;
                                case 50:
                                    a831.m25017i(sb, "user:", str4, ":playlists");
                                    return sb;
                                case 51:
                                    a831.m25017i(sb, "user:", str4, ":maskedtoplist");
                                    return sb;
                                case 52:
                                    a831.m25017i(sb, "user:", str4, ":outbox");
                                    return sb;
                                case 54:
                                    sb.append("start-group:");
                                    sb.append(str5);
                                    if (str2 != null) {
                                        sb.append(":");
                                        sb.append(m44571e(str2));
                                        return sb;
                                    }
                                    return sb;
                                case 55:
                                    sb.append("end-group:");
                                    sb.append(str5);
                                    return sb;
                                case 56:
                                    sb.append("connect-device-picker");
                                    return sb;
                                case 57:
                                    sb.append("video:");
                                    sb.append(str5);
                                    return sb;
                                case 58:
                                    sb.append("recording:");
                                    sb.append(str5);
                                    return sb;
                                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                    sb.append("canvas:");
                                    sb.append(str5);
                                    return sb;
                                case 61:
                                    a831.m25017i(sb, "user:", str4, ":top:tracks");
                                    return sb;
                                case 62:
                                    sb.append("transition:");
                                    sb.append(str5);
                                    return sb;
                                case 63:
                                    sb.append("show:");
                                    sb.append(str5);
                                    return sb;
                                case 64:
                                    sb.append("episode:");
                                    sb.append(str5);
                                    return sb;
                                case 65:
                                    sb.append("adspace:");
                                    sb.append(str5);
                                    return sb;
                                case 66:
                                    sb.append("chart:");
                                    sb.append(str5);
                                    return sb;
                                case 67:
                                    sb.append("party:");
                                    sb.append(str5);
                                    return sb;
                                case 68:
                                    sb.append("running:");
                                    sb.append(str5);
                                    return sb;
                                case 69:
                                    sb.append("user:");
                                    sb.append(m44571e(str4));
                                    sb.append(":cluster:");
                                    sb.append(str5);
                                    return sb;
                                case 70:
                                    sb.append("dailymix:");
                                    sb.append(str5);
                                    return sb;
                                case 71:
                                    sb.append("link:");
                                    sb.append(str5);
                                    return sb;
                                case 72:
                                    sb.append("imageset:");
                                    sb.append(str5);
                                    return sb;
                                case 73:
                                    sb.append("space:");
                                    sb.append(str5);
                                    return sb;
                                case 74:
                                    sb.append("concert:");
                                    sb.append(str5);
                                    return sb;
                                case 75:
                                    sb.append("concerts");
                                    return sb;
                                case 76:
                                    sb.append("concert-campaign:");
                                    sb.append(str5);
                                    return sb;
                                case 77:
                                    sb.append("mosaic:");
                                    sb.append(a831.m25012d(list));
                                    return sb;
                                case 78:
                                    if (str4 != null) {
                                        sb.append("user:");
                                        sb.append(m44571e(str4));
                                        c = ':';
                                        sb.append(':');
                                    } else {
                                        c = ':';
                                    }
                                    sb.append("collection");
                                    if (str5 != null) {
                                        sb.append(c);
                                        sb.append(str5);
                                        return sb;
                                    }
                                    return sb;
                                case 79:
                                    sb.append("user:");
                                    sb.append(m44571e(str4));
                                    sb.append(":collection:album:");
                                    sb.append(str5);
                                    return sb;
                                case 80:
                                    sb.append("user:");
                                    sb.append(m44571e(str4));
                                    sb.append(":collection:artist:");
                                    sb.append(str5);
                                    return sb;
                                case 81:
                                    sb.append("collection:podcasts:episodes");
                                    return sb;
                                case 82:
                                    if (str4 != null) {
                                        a831.m25017i(sb, "user:", str4, ":");
                                    }
                                    sb.append("collection:your-episodes");
                                    return sb;
                                case 83:
                                    sb.append("collection:tag:");
                                    sb.append(str5);
                                    return sb;
                                case 84:
                                    sb.append("collection:tags");
                                    return sb;
                                case 85:
                                    sb.append("premium-destination");
                                    return sb;
                                case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                                    sb.append("upsell:");
                                    sb.append(str5);
                                    return sb;
                                case 87:
                                    sb.append("devicepreset:");
                                    sb.append(this.f79267Z);
                                    sb.append(":");
                                    sb.append(str5);
                                    return sb;
                                case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                                    sb.append("together:");
                                    sb.append(m44571e(str4));
                                    return sb;
                                case 89:
                                    sb.append("socialsession:");
                                    sb.append(str5);
                                    return sb;
                                case 90:
                                    sb.append("licensor:");
                                    sb.append(str5);
                                    return sb;
                                case 91:
                                    sb.append("audiobook-licensor:");
                                    sb.append(str5);
                                    return sb;
                                case 92:
                                    sb.append("audiobook-licensor:");
                                    sb.append(str5);
                                    sb.append(":catalog");
                                    return sb;
                                case 93:
                                    sb.append("findaway-content:");
                                    sb.append(str5);
                                    return sb;
                                case 94:
                                    sb.append("licensor-label:");
                                    sb.append(a831.m25012d(list));
                                    return sb;
                                case 95:
                                    sb.append("transcript:");
                                    sb.append(str5);
                                    return sb;
                                case 96:
                                    sb.append("station:");
                                    sb.append(str5);
                                    return sb;
                                case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                                    sb.append("zerotap:");
                                    sb.append(str5);
                                    return sb;
                                case 98:
                                    sb.append("home");
                                    return sb;
                                case 99:
                                    sb.append("song:");
                                    sb.append(str5);
                                    return sb;
                                case 100:
                                    if (str4 != null) {
                                        a831.m25017i(sb, "user:", str4, ":");
                                    }
                                    sb.append("folder:");
                                    sb.append(str5);
                                    return sb;
                                case 101:
                                    sb.append("datastories:");
                                    sb.append(str5);
                                    return sb;
                                case 102:
                                    if (str5 == null) {
                                        sb.append("wrapped");
                                        return sb;
                                    }
                                    sb.append("wrapped:");
                                    sb.append(str5);
                                    return sb;
                                case 103:
                                    sb.append("wrapped:share:");
                                    sb.append(str5);
                                    return sb;
                                case 104:
                                    sb.append("wrapped-2021:");
                                    sb.append(str5);
                                    return sb;
                                case 105:
                                    sb.append("wrapped-2022:");
                                    sb.append(str5);
                                    return sb;
                                case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                                    sb.append("only-you:");
                                    sb.append(str5);
                                    return sb;
                                case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                                    sb.append("blend");
                                    if (str5 != null && !str5.isEmpty()) {
                                        sb.append(":");
                                        sb.append(str5);
                                        return sb;
                                    }
                                    return sb;
                                case 108:
                                    sb.append("jam");
                                    if (str5 != null && !str5.isEmpty()) {
                                        sb.append(":");
                                        sb.append(str5);
                                        return sb;
                                    }
                                    return sb;
                                case 109:
                                    sb.append("jam:album:");
                                    sb.append(str5);
                                    return sb;
                                case 110:
                                    sb.append("jam:artist:");
                                    sb.append(str5);
                                    return sb;
                                case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                    sb.append("jam:playlist:");
                                    sb.append(str5);
                                    return sb;
                                case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                    sb.append("section:");
                                    sb.append(str5);
                                    return sb;
                                case ContentType.LIVE /* 113 */:
                                    sb.append("page:");
                                    sb.append(str5);
                                    return sb;
                                case 114:
                                    sb.append("topic:");
                                    sb.append(str5);
                                    return sb;
                                case 115:
                                    sb.append("label:");
                                    sb.append(str5);
                                    return sb;
                                case 116:
                                    sb.append("b2b-party:");
                                    sb.append(str5);
                                    return sb;
                                case 117:
                                    if (str4 != null) {
                                        sb.append("user:");
                                        sb.append(m44571e(str4));
                                        sb.append(':');
                                    }
                                    sb.append("followfeed");
                                    if (str5 != null) {
                                        sb.append(":album:");
                                        sb.append(str5);
                                        return sb;
                                    }
                                    return sb;
                                case 118:
                                    sb.append("creator:");
                                    sb.append(str5);
                                    return sb;
                                case 119:
                                    sb.append("podcastcharts");
                                    if (str5 != null && !str5.isEmpty()) {
                                        sb.append(":");
                                        sb.append(str5);
                                        return sb;
                                    }
                                    return sb;
                                case 120:
                                    sb.append("s4a-third-party:");
                                    sb.append(str5);
                                    return sb;
                                case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                    sb.append("internal-organization:");
                                    sb.append(str5);
                                    return sb;
                                case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                    sb.append("publisher:");
                                    sb.append(str5);
                                    return sb;
                                case ContentType.USER_GENERATED_LIVE /* 123 */:
                                    sb.append("forever-favorites");
                                    return sb;
                                case 124:
                                    sb.append("entityset:");
                                    sb.append(str);
                                    sb.append(":");
                                    sb.append(a831.m25012d(list));
                                    return sb;
                                case 125:
                                    sb.append("clip:");
                                    sb.append(str5);
                                    return sb;
                                case 126:
                                    sb.append("clip-video-chapter:");
                                    sb.append(str5);
                                    return sb;
                                case 127:
                                    sb.append("lex-experiments:");
                                    sb.append(str5);
                                    return sb;
                                case 128:
                                    sb.append("experience:");
                                    sb.append(str5);
                                    return sb;
                                case 129:
                                    sb.append("dynamic-playlist-session:");
                                    sb.append(str5);
                                    return sb;
                                case 130:
                                    sb.append("enhanced:playlist:");
                                    sb.append(str5);
                                    return sb;
                                case 131:
                                    sb.append("enhanced:collection:tracks");
                                    return sb;
                                case 132:
                                    sb.append("enhanced:spotifyset:");
                                    sb.append(str5);
                                    return sb;
                                case 133:
                                    sb.append("live:");
                                    sb.append(str5);
                                    return sb;
                                case 134:
                                    sb.append("room:");
                                    sb.append(str5);
                                    return sb;
                                case 135:
                                    a831.m25017i(sb, "user:", str4, ":top:artists");
                                    return sb;
                                case 136:
                                    sb.append("promotion:");
                                    sb.append(str5);
                                    return sb;
                                case 137:
                                    sb.append("promotion-item:");
                                    sb.append(str5);
                                    return sb;
                                case 138:
                                    sb.append("prerelease:");
                                    sb.append(str5);
                                    return sb;
                                case 139:
                                    sb.append("xlink:");
                                    sb.append(str5);
                                    return sb;
                                case 140:
                                    sb.append("site:");
                                    sb.append(str5);
                                    return sb;
                                case 141:
                                    sb.append("presents:");
                                    sb.append(str5);
                                    return sb;
                                case 142:
                                    sb.append("sitemodal:");
                                    sb.append(str5);
                                    return sb;
                                case 143:
                                    sb.append("anthology:");
                                    sb.append(str5);
                                    return sb;
                                case 144:
                                    sb.append("sectionset:");
                                    sb.append(str5);
                                    return sb;
                                case 145:
                                    sb.append("expression:");
                                    sb.append(str5);
                                    return sb;
                                case 146:
                                    sb.append("merch:");
                                    sb.append(str5);
                                    return sb;
                                case 147:
                                    sb.append("merchhub");
                                    return sb;
                                case 148:
                                    sb.append("descriptor:");
                                    sb.append(str5);
                                    return sb;
                                case 149:
                                    sb.append("comment:");
                                    sb.append(str5);
                                    return sb;
                                case 150:
                                    sb.append("cultural-moment:hub:");
                                    sb.append(str5);
                                    return sb;
                                case 151:
                                    sb.append("cultural-moment:stories:");
                                    sb.append(str5);
                                    return sb;
                                case 152:
                                    sb.append("songwriter:");
                                    sb.append(str5);
                                    return sb;
                                case 153:
                                    sb.append("watch-feed:");
                                    sb.append(str5);
                                    return sb;
                                case 154:
                                    sb.append("watch-feed-pivots:");
                                    sb.append(str5);
                                    return sb;
                                case 155:
                                    sb.append("watch-feed-category:");
                                    sb.append(str5);
                                    return sb;
                                case 156:
                                    sb.append("discovery-feed:");
                                    sb.append(str5);
                                    return sb;
                                case 157:
                                    sb.append("watch-feed:discovery-feed:");
                                    sb.append(str5);
                                    return sb;
                                case 158:
                                    sb.append("watch-feed:music-videos-feed:");
                                    sb.append(str5);
                                    return sb;
                                case 159:
                                    sb.append("episode-set:");
                                    sb.append(str5);
                                    return sb;
                                case 160:
                                    sb.append("poll:");
                                    sb.append(str5);
                                    return sb;
                                case 161:
                                    sb.append("question:");
                                    sb.append(str5);
                                    return sb;
                                case 162:
                                    sb.append("media:");
                                    sb.append(str5);
                                    return sb;
                                case 163:
                                    sb.append("quickstart:");
                                    sb.append(str5);
                                    return sb;
                                case 164:
                                    sb.append("concept:");
                                    sb.append(str5);
                                    return sb;
                                case 165:
                                    sb.append("personalized-set:");
                                    sb.append(str5);
                                    return sb;
                                case 166:
                                    sb.append("course:");
                                    sb.append(str5);
                                    return sb;
                                case 167:
                                    sb.append("s4dapp:");
                                    sb.append(str5);
                                    return sb;
                                case 168:
                                    sb.append("s4dperson:");
                                    sb.append(str5);
                                    return sb;
                                case 169:
                                    sb.append("audiobrowse:");
                                    sb.append(str5);
                                    return sb;
                                case 170:
                                    sb.append("commercial-partner:");
                                    sb.append(str5);
                                    return sb;
                                case 171:
                                    sb.append("response:");
                                    sb.append(str5);
                                    return sb;
                                case 172:
                                    sb.append("liveradio:");
                                    sb.append(str5);
                                    return sb;
                                case 173:
                                    sb.append("learning:creator:");
                                    sb.append(str5);
                                    return sb;
                                case 174:
                                    sb.append("learning:material:");
                                    sb.append(str5);
                                    return sb;
                                case 175:
                                    sb.append("quiz");
                                    return sb;
                                case 176:
                                    sb.append("quiz:music:");
                                    sb.append(str5);
                                    return sb;
                                case 177:
                                    sb.append("made-for-you");
                                    return sb;
                                case 178:
                                    sb.append("onboarding:language:");
                                    sb.append(str5);
                                    return sb;
                                case 179:
                                    sb.append("account-management:plan-details:");
                                    sb.append(str5);
                                    return sb;
                                case 180:
                                    sb.append("account-management:available-plans");
                                    return sb;
                                case 181:
                                    sb.append("audiobook:consideration");
                                    return sb;
                                case 182:
                                    sb.append("account-management:aom");
                                    return sb;
                                case 183:
                                    sb.append("listeningstats:share:");
                                    sb.append(str5);
                                    return sb;
                                case 184:
                                    sb.append("fandomcollectible:share:");
                                    sb.append(str5);
                                    return sb;
                                case 185:
                                    sb.append("fandom-collectibles:stories:");
                                    sb.append(str5);
                                    return sb;
                                case 186:
                                    sb.append("birthdays:");
                                    sb.append(str5);
                                    return sb;
                                case 187:
                                    sb.append("artist-music-videos:");
                                    sb.append(str5);
                                    return sb;
                                case 188:
                                    sb.append("list:");
                                    sb.append(str);
                                    sb.append(":");
                                    sb.append(m44570d(str5));
                                    return sb;
                                case 189:
                                    sb.append("referral:");
                                    sb.append(str5);
                                    return sb;
                                case 190:
                                    sb.append("concert-offer:");
                                    sb.append(str5);
                                    return sb;
                                case 191:
                                    sb.append("venue:");
                                    sb.append(str5);
                                    return sb;
                                case 192:
                                    sb.append("tour:");
                                    sb.append(str5);
                                    return sb;
                                case 193:
                                    sb.append("festival:");
                                    sb.append(str5);
                                    return sb;
                                case 194:
                                    sb.append("contributor:");
                                    sb.append(str5);
                                    return sb;
                                case 195:
                                    sb.append("promoter:");
                                    sb.append(str5);
                                    return sb;
                                case 196:
                                    sb.append("concert-offer-provider:");
                                    sb.append(str5);
                                    return sb;
                                case 197:
                                    sb.append("account-management:plan-overview");
                                    return sb;
                                case 198:
                                    sb.append("account-management:plan-overview-legacy");
                                    return sb;
                                case ContentType.BUMPER /* 199 */:
                                    sb.append("voting:root:");
                                    sb.append(str5);
                                    return sb;
                                case 200:
                                    sb.append("voting:share:");
                                    sb.append(str5);
                                    return sb;
                                case 201:
                                    sb.append("voting:confirmation:");
                                    sb.append(str5);
                                    return sb;
                                case 202:
                                    sb.append("previewcatalog:");
                                    sb.append(str5);
                                    return sb;
                                case 203:
                                    sb.append("activitycenter");
                                    return sb;
                                case 204:
                                    sb.append("user-highlight:");
                                    sb.append(str5);
                                    return sb;
                                case 205:
                                    sb.append("chat:");
                                    sb.append(str5);
                                    return sb;
                                case 206:
                                    sb.append("chat-invite:");
                                    sb.append(str5);
                                    return sb;
                                case 207:
                                    sb.append("chat-list");
                                    return sb;
                                case 208:
                                    sb.append("chat-message:");
                                    sb.append(str5);
                                    return sb;
                                case 209:
                                    sb.append("chat-share-preview:");
                                    sb.append(str5);
                                    return sb;
                                case 210:
                                    sb.append("author:");
                                    sb.append(str5);
                                    return sb;
                                case AdvertisementType.ON_DEMAND_PRE_ROLL /* 211 */:
                                    sb.append("ai-playlist:create");
                                    return sb;
                                case AdvertisementType.ON_DEMAND_MID_ROLL /* 212 */:
                                    sb.append("ai-session:generate");
                                    return sb;
                                case AdvertisementType.ON_DEMAND_POST_ROLL /* 213 */:
                                    sb.append("supplementarymaterial:");
                                    sb.append(str5);
                                    return sb;
                                case 214:
                                    sb.append("data-download");
                                    return sb;
                                case 215:
                                    sb.append("graduation:education");
                                    return sb;
                                case 216:
                                    sb.append("settings");
                                    return sb;
                                case 217:
                                    sb.append("settings:quality");
                                    return sb;
                                case 218:
                                    sb.append("concert-gallery:");
                                    sb.append(str5);
                                    return sb;
                                case 219:
                                    sb.append("upcoming-releases");
                                    return sb;
                                case 220:
                                    sb.append("wrapped-share:" + str5);
                                    return sb;
                                case AdvertisementType.LIVE /* 221 */:
                                    sb.append("podcast-chapter:");
                                    sb.append(str5);
                                    return sb;
                                case 222:
                                    sb.append("challenge:");
                                    sb.append(str5);
                                    return sb;
                                case 223:
                                    sb.append("kallax:");
                                    sb.append(str5);
                                    return sb;
                                case 224:
                                    sb.append("sample:");
                                    sb.append(str5);
                                    return sb;
                                case 225:
                                    sb.append("prompt:");
                                    sb.append(str5);
                                    return sb;
                                case 226:
                                    sb.append("artist:");
                                    sb.append(str5);
                                    sb.append(":dna");
                                    return sb;
                                case 227:
                                    sb.append("artist:");
                                    sb.append(str5);
                                    sb.append(":dna:blend:");
                                    sb.append(this.f79275h);
                                    return sb;
                                case 228:
                                    sb.append("wrapped-party:");
                                    sb.append(str5);
                                    return sb;
                            }
                        }

                        @Override // java.lang.Comparable
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public final int compareTo(gf41 gf41Var) {
                            int iCompare = 0;
                            if (this == gf41Var) {
                                return 0;
                            }
                            df41 df41Var = gf41Var.f79270c;
                            df41 df41Var2 = this.f79270c;
                            if (df41Var2 != df41Var) {
                                return df41Var2.compareTo(df41Var);
                            }
                            df41 df41Var3 = gf41Var.f79265X;
                            df41 df41Var4 = this.f79265X;
                            if (df41Var4 != df41Var3) {
                                return df41Var4.compareTo(df41Var3);
                            }
                            int iM44574j = m44574j(this.f79271d, gf41Var.f79271d);
                            if (iM44574j != 0) {
                                return iM44574j;
                            }
                            int iM44574j2 = m44574j(this.f79263L0, gf41Var.f79263L0);
                            if (iM44574j2 != 0) {
                                return iM44574j2;
                            }
                            int iM44574j3 = m44574j(this.f79267Z, gf41Var.f79267Z);
                            if (iM44574j3 != 0) {
                                return iM44574j3;
                            }
                            int iM44574j4 = m44574j(this.f79272e, gf41Var.f79272e);
                            if (iM44574j4 != 0) {
                                return iM44574j4;
                            }
                            List list = gf41Var.f79266Y;
                            List list2 = this.f79266Y;
                            if (list2 != list) {
                                int iMin = Math.min(list2.size(), list.size());
                                while (true) {
                                    if (iCompare >= iMin) {
                                        iCompare = Integer.compare(list2.size(), list.size());
                                        break;
                                    }
                                    int iM44574j5 = m44574j((String) list2.get(iCompare), (String) list.get(iCompare));
                                    if (iM44574j5 != 0) {
                                        iCompare = iM44574j5;
                                        break;
                                    }
                                    iCompare++;
                                }
                            }
                            if (iCompare != 0) {
                                return iCompare;
                            }
                            int iM44574j6 = m44574j(this.f79273f, gf41Var.f79273f);
                            if (iM44574j6 != 0) {
                                return iM44574j6;
                            }
                            int iM44574j7 = m44574j(this.f79274g, gf41Var.f79274g);
                            if (iM44574j7 != 0) {
                                return iM44574j7;
                            }
                            int iM44574j8 = m44574j(this.f79275h, gf41Var.f79275h);
                            if (iM44574j8 != 0) {
                                return iM44574j8;
                            }
                            int iCompare2 = Long.compare(this.f79276i, gf41Var.f79276i);
                            if (iCompare2 != 0) {
                                return iCompare2;
                            }
                            int iM44574j9 = m44574j(this.f79277t, gf41Var.f79277t);
                            return iM44574j9 != 0 ? iM44574j9 : m44574j(this.f79264M0, gf41Var.f79264M0);
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof gf41)) {
                                return false;
                            }
                            gf41 gf41Var = (gf41) obj;
                            return Objects.equals(this.f79272e, gf41Var.f79272e) && this.f79270c == gf41Var.f79270c && this.f79265X == gf41Var.f79265X && Objects.equals(this.f79266Y, gf41Var.f79266Y) && Objects.equals(this.f79271d, gf41Var.f79271d) && this.f79276i == gf41Var.f79276i && Objects.equals(this.f79274g, gf41Var.f79274g) && Objects.equals(this.f79273f, gf41Var.f79273f) && Objects.equals(this.f79275h, gf41Var.f79275h) && Objects.equals(this.f79277t, gf41Var.f79277t) && Objects.equals(this.f79267Z, gf41Var.f79267Z) && Objects.equals(this.f79263L0, gf41Var.f79263L0);
                        }

                        /* JADX INFO: renamed from: f */
                        public final String m44578f() {
                            String str = this.f79269b;
                            return str == null ? toString() : str;
                        }

                        public final int hashCode() {
                            return Objects.hashCode(this.f79267Z) + ((Objects.hashCode(this.f79263L0) + ((Objects.hashCode(this.f79277t) + dq60.m36605e((Objects.hashCode(this.f79266Y) + ((Objects.hashCode(this.f79275h) + ((Objects.hashCode(this.f79274g) + ((Objects.hashCode(this.f79273f) + ((Objects.hashCode(this.f79272e) + ((Objects.hashCode(this.f79271d) + ((this.f79265X.hashCode() + (this.f79270c.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.f79276i, 31)) * 31)) * 31);
                        }

                        /* JADX INFO: renamed from: i */
                        public final boolean m44579i(gf41 gf41Var) {
                            if (equals(gf41Var)) {
                                return true;
                            }
                            df41 df41Var = gf41Var.f79270c;
                            df41 df41Var2 = gf41Var.f79265X;
                            String str = gf41Var.f79272e;
                            df41 df41Var3 = df41.PLAYLIST;
                            String str2 = this.f79272e;
                            df41 df41Var4 = this.f79270c;
                            if ((df41Var4 == df41Var3 || df41Var4 == df41.PLAYLIST_V2) && (df41Var == df41Var3 || df41Var == df41.PLAYLIST_V2)) {
                                return Objects.equals(str2, str);
                            }
                            df41 df41Var5 = df41.STATION;
                            df41 df41Var6 = this.f79265X;
                            if (df41Var4 == df41Var5 && ((df41Var6 == df41Var3 || df41Var6 == df41.PLAYLIST_V2) && df41Var == df41Var5 && (df41Var2 == df41Var3 || df41Var2 == df41.PLAYLIST_V2))) {
                                return Objects.equals(str2, str);
                            }
                            df41 df41Var7 = df41.DAILYMIX;
                            if (df41Var4 != df41Var7 && (df41Var4 != df41Var5 || df41Var6 != df41.CLUSTER)) {
                                return false;
                            }
                            if (df41Var == df41Var7 || (df41Var == df41Var5 && df41Var2 == df41.CLUSTER)) {
                                return Objects.equals(str2, str);
                            }
                            return false;
                        }

                        /* JADX INFO: renamed from: k */
                        public final String m44580k() {
                            String strReplace = m44576b().toString().replaceFirst("^spotify", "").replace(":", "/");
                            String str = this.f79264M0;
                            String strM77251j = s571.m77251j("https://open.spotify.com", strReplace, (String) Optional.ofNullable(str).orElse(""));
                            switch (this.f79270c.ordinal()) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 18:
                                case 22:
                                case 24:
                                case 25:
                                case 30:
                                case 31:
                                case 36:
                                case 48:
                                case 49:
                                case 50:
                                case 56:
                                case 63:
                                case 64:
                                case 74:
                                case 75:
                                case 76:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                case 85:
                                case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                                case 89:
                                case 96:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                                case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                                case 108:
                                case 109:
                                case 110:
                                case ContentType.SHORT_FORM_ON_DEMAND /* 111 */:
                                case 118:
                                case 125:
                                case 126:
                                case 127:
                                case 128:
                                case 133:
                                case 134:
                                case 136:
                                case 137:
                                case 138:
                                case 140:
                                case 141:
                                case 142:
                                case 143:
                                case 147:
                                case 150:
                                case 151:
                                case 152:
                                case 153:
                                case 163:
                                case 164:
                                case 165:
                                case 166:
                                case 167:
                                case 168:
                                case 169:
                                case 170:
                                case 172:
                                case 173:
                                case 174:
                                case 175:
                                case 176:
                                case 177:
                                case 178:
                                case 179:
                                case 180:
                                case 181:
                                case 182:
                                case 183:
                                case 184:
                                case 185:
                                case 186:
                                case 189:
                                case 191:
                                case 192:
                                case 193:
                                case 194:
                                case 197:
                                case 198:
                                case ContentType.BUMPER /* 199 */:
                                case 200:
                                case 201:
                                case 202:
                                case 203:
                                case 204:
                                case 205:
                                case 206:
                                case 207:
                                case 208:
                                case 209:
                                case 210:
                                case AdvertisementType.ON_DEMAND_PRE_ROLL /* 211 */:
                                case AdvertisementType.ON_DEMAND_MID_ROLL /* 212 */:
                                case AdvertisementType.ON_DEMAND_POST_ROLL /* 213 */:
                                case 219:
                                case AdvertisementType.LIVE /* 221 */:
                                case 223:
                                case 224:
                                case 225:
                                case 226:
                                case 227:
                                    return strM77251j;
                                case 7:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                case 23:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 57:
                                case 58:
                                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                case 60:
                                case 61:
                                case 62:
                                case 65:
                                case 66:
                                case 67:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 77:
                                case 83:
                                case 84:
                                case 87:
                                case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                                case 90:
                                case 91:
                                case 92:
                                case 93:
                                case 94:
                                case 95:
                                case com.spotify.metadata.proto.Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                                case 99:
                                case 100:
                                case 101:
                                case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                                case ContentType.LIVE /* 113 */:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 119:
                                case 120:
                                case ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND /* 121 */:
                                case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                case ContentType.USER_GENERATED_LIVE /* 123 */:
                                case 124:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 135:
                                case 139:
                                case 144:
                                case 145:
                                case 146:
                                case 148:
                                case 149:
                                case 154:
                                case 155:
                                case 156:
                                case 157:
                                case 158:
                                case 159:
                                case 160:
                                case 161:
                                case 162:
                                case 171:
                                case 187:
                                case 188:
                                case 190:
                                case 195:
                                case 196:
                                case 214:
                                case 215:
                                case 216:
                                case 217:
                                case 218:
                                case 222:
                                default:
                                    throw new IllegalArgumentException(edb.m38564m("Unable to turn uri into string: ", strM77251j));
                                case 15:
                                    return strM77251j.replaceFirst("playlists", "collection/playlists");
                                case 68:
                                    return strM77251j.replaceFirst("original-content", "original");
                                case 98:
                                    return strM77251j.replaceFirst("home", "browse/featured");
                                case 220:
                                    return s571.m77251j("https://www.spotify.com/wrapped-share/", this.f79272e, (String) Optional.ofNullable(str).orElse(""));
                            }
                        }

                        public final String toString() {
                            StringBuilder sbM44576b = m44576b();
                            String str = this.f79264M0;
                            if (str != null) {
                                sbM44576b.append(str);
                            }
                            return sbM44576b.toString();
                        }

                        public gf41(df41 df41Var) {
                            this(df41Var, null, 0);
                        }

                        public gf41(df41 df41Var, String str, int i) {
                            df41 df41Var2 = df41.UNKNOWN;
                            List list = Collections.EMPTY_LIST;
                            this.f79268a = true;
                            this.f79270c = df41Var;
                            this.f79272e = str;
                            this.f79271d = null;
                            this.f79273f = null;
                            this.f79274g = null;
                            this.f79275h = null;
                            this.f79276i = -1L;
                            this.f79269b = null;
                            this.f79265X = df41Var2;
                            this.f79266Y = list;
                            this.f79267Z = null;
                            this.f79263L0 = null;
                            this.f79264M0 = null;
                            this.f79277t = null;
                        }
                    }
