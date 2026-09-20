package p204p;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.view.View;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.comscore.streaming.AdvertisementDeliveryType;
import com.comscore.streaming.AdvertisementOwner;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import com.comscore.streaming.ContentDeliveryComposition;
import com.comscore.streaming.ContentDeliverySubscriptionType;
import com.comscore.streaming.ContentDistributionModel;
import com.comscore.streaming.ContentFeedType;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.WindowState;
import com.spotify.casita.p040v1.resolved.ResolvedHome;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.music.R;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.Entity;
import com.spotify.signup.signup.p150v2.proto.Error;
import com.spotify.watchfeed.component.layout.p186v1.proto.WatchFeedTwoColumnsLayout;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.p203bp.temporal.UnsupportedTemporalTypeException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xgg1 implements bz61 {

    /* JADX INFO: renamed from: a */
    public static final qub1 f261318a = new qub1(2);

    /* JADX INFO: renamed from: b */
    public static sd40 f261319b;

    /* JADX INFO: renamed from: c */
    public static sd40 f261320c;

    /* JADX INFO: renamed from: A */
    public static final String m90569A(String str, String str2, String str3, boolean z) {
        Set set = dd41.f47702f;
        String strM35694A = r46.m74726U("spotify:internal:prompted-playlist:refine:".concat(r46.m74726U(str).m35710h())).m35694A();
        if (strM35694A == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        if (str2 != null) {
            ro80VarM44508o.add("session_id=".concat(str2));
        }
        if (str3 != null) {
            ro80VarM44508o.add("refinement_session_id=".concat(str3));
        }
        if (z) {
            ro80VarM44508o.add("has_completed_refinement=true");
        }
        ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
        return !ro80VarM44506m.isEmpty() ? klh.m56834f(strM35694A, "?", g6f.m43753y0(ro80VarM44506m, "&", null, null, null, 62)) : strM35694A;
    }

    /* JADX INFO: renamed from: A0 */
    public static cbm0 m90570A0() {
        return m90662N1("CHAT_EDIT_GROUP_DETAILS", "chat/edit-group-details", 311, "chat");
    }

    /* JADX INFO: renamed from: A1 */
    public static cbm0 m90571A1() {
        return m90662N1("DOWNLOAD_OVER_CELLULAR", "download-over-cellular", 485, "download-over-cellular");
    }

    /* JADX INFO: renamed from: A2 */
    public static cbm0 m90572A2() {
        return m90662N1("LISTENINGPARTY_CHAT", "listeningparty/chat", 894, "listeningparty");
    }

    /* JADX INFO: renamed from: A3 */
    public static cbm0 m90573A3() {
        return m90662N1("PARENTAL_CONTROL_UPDATE_NAME", "parental-control/update-name", 1368, "parental-control");
    }

    /* JADX INFO: renamed from: A4 */
    public static cbm0 m90574A4() {
        return m90662N1("PROMPTABLE_SECTION_INPUT", "promptable-section-input", 1538, "promptable-section-input");
    }

    /* JADX INFO: renamed from: A5 */
    public static cbm0 m90575A5() {
        return m90662N1("SUBTITLES_SELECTOR", "subtitles-selector", 1929, "subtitles-selector");
    }

    /* JADX INFO: renamed from: B */
    public static cbm0 m90576B() {
        return m90662N1("ACCOUNTSWITCHING_ADDACCOUNT", "accountswitching/addaccount", 4, "accountswitching");
    }

    /* JADX INFO: renamed from: B0 */
    public static cbm0 m90577B0() {
        return m90662N1("CHAT_ENTITY_PICKER", "chat/entity-picker", 312, "chat");
    }

    /* JADX INFO: renamed from: B1 */
    public static cbm0 m90578B1() {
        return m90662N1("ENTITYSEGMENTS", "entitysegments", 501, "entitysegments");
    }

    /* JADX INFO: renamed from: B2 */
    public static cbm0 m90579B2() {
        return m90662N1("LISTENINGSTATS", "listeningstats", 900, "listeningstats");
    }

    /* JADX INFO: renamed from: B3 */
    public static cbm0 m90580B3() {
        return m90662N1("PERMISSIONS_LOCATION_REQUEST", "permissions/location/request", 1380, "permissions");
    }

    /* JADX INFO: renamed from: B4 */
    public static cbm0 m90581B4() {
        return m90662N1("PUFFIN_PIGEON_ONBOARDING", "puffin/pigeon-onboarding", 1546, "puffin");
    }

    /* JADX INFO: renamed from: B5 */
    public static cbm0 m90582B5() {
        return m90662N1("TASTEPROFILE", "tasteprofile", 1965, "tasteprofile");
    }

    /* JADX INFO: renamed from: C */
    public static cbm0 m90583C() {
        return m90662N1("ACCOUNTSWITCHING_ADDACCOUNTTYPESELECTION", "accountswitching/addaccounttypeselection", 5, "accountswitching");
    }

    /* JADX INFO: renamed from: C0 */
    public static cbm0 m90584C0() {
        return m90662N1("CHAT_GIF_PICKER", "chat/gif-picker", 313, "chat");
    }

    /* JADX INFO: renamed from: C1 */
    public static cbm0 m90585C1() {
        return m90662N1("ENTITYSEGMENTS_CHAPTERSELECTOR", "entitysegments/chapterselector", 502, "entitysegments");
    }

    /* JADX INFO: renamed from: C2 */
    public static cbm0 m90586C2() {
        return m90662N1("LISTENINGSTATS_DETAILS", "listeningstats/details", ContentDistributionModel.TV_AND_ONLINE, "listeningstats");
    }

    /* JADX INFO: renamed from: C3 */
    public static cbm0 m90587C3() {
        return m90662N1("PHONENUMBER_CHECKERROR", "phonenumber/checkerror", 1384, "phonenumber");
    }

    /* JADX INFO: renamed from: C4 */
    public static cbm0 m90588C4() {
        return m90662N1("QUIZ_FEEDBACK", "quiz/feedback", 1551, "quiz");
    }

    /* JADX INFO: renamed from: C5 */
    public static cbm0 m90589C5() {
        return m90662N1("TRACK_CREDITS_CREDITS", "track-credits/credits", 1975, "track-credits");
    }

    /* JADX INFO: renamed from: D */
    public static cbm0 m90590D() {
        return m90662N1("ADAPTIVEAUTHENTICATION_START", "adaptiveauthentication/start", 11, "adaptiveauthentication");
    }

    /* JADX INFO: renamed from: D0 */
    public static cbm0 m90591D0() {
        return m90662N1("CHAT_INTERCEPTOR", "chat/interceptor", 314, "chat");
    }

    /* JADX INFO: renamed from: D1 */
    public static cbm0 m90592D1() {
        return m90662N1("ENTITYSEGMENTS_CLIP_EDIT", "entitysegments/clip/edit", 504, "entitysegments");
    }

    /* JADX INFO: renamed from: D2 */
    public static cbm0 m90593D2() {
        return m90662N1("LISTENINGSTATS_HIGHLIGHT_DETAILS", "listeningstats/highlight-details", ContentDistributionModel.EXCLUSIVELY_ONLINE, "listeningstats");
    }

    /* JADX INFO: renamed from: D3 */
    public static cbm0 m90594D3() {
        return m90662N1("PIN_GATE", "pin-gate", 1392, "pin-gate");
    }

    /* JADX INFO: renamed from: D4 */
    public static cbm0 m90595D4() {
        return m90662N1("QUIZ_GAMEPLAY", "quiz/gameplay", 1552, "quiz");
    }

    /* JADX INFO: renamed from: D5 */
    public static cbm0 m90596D5() {
        return m90662N1("UNBOXING_FEATURE_FLOW", "unboxing/feature-flow", 1989, "unboxing");
    }

    /* JADX INFO: renamed from: E */
    public static cbm0 m90597E() {
        return m90662N1("ADAPTIVEAUTHENTICATION_ERROR", "adaptiveauthentication/error", 10, "adaptiveauthentication");
    }

    /* JADX INFO: renamed from: E0 */
    public static cbm0 m90598E0() {
        return m90662N1("CHAT_LIST", "chat/list", 316, "chat");
    }

    /* JADX INFO: renamed from: E1 */
    public static cbm0 m90599E1() {
        return m90662N1("EXPERIMENTAL", "experimental", 514, "experimental");
    }

    /* JADX INFO: renamed from: E2 */
    public static cbm0 m90600E2() {
        return m90662N1("LISTENINGSTATS_SUMMARY", "listeningstats/summary", 903, "listeningstats");
    }

    /* JADX INFO: renamed from: E3 */
    public static cbm0 m90601E3() {
        return m90662N1("PLAN_DETAILS", "plan-details", 1393, "plan-details");
    }

    /* JADX INFO: renamed from: E4 */
    public static cbm0 m90602E4() {
        return m90662N1("QUIZ_QUESTION_SOURCES", "quiz/question-sources", 1553, "quiz");
    }

    /* JADX INFO: renamed from: E5 */
    public static cbm0 m90603E5() {
        return m90662N1("UNKNOWN", "unknown", 1992, "unknown");
    }

    /* JADX INFO: renamed from: F */
    public static cbm0 m90604F() {
        return m90662N1("ADD_CHILD_ACCOUNT_NUDGE", "add-child-account-nudge", 13, "add-child-account-nudge");
    }

    /* JADX INFO: renamed from: F0 */
    public static cbm0 m90605F0() {
        return m90662N1("CHAT_LYRICS_STICKERS_PICKER", "chat/lyrics-stickers-picker", 317, "chat");
    }

    /* JADX INFO: renamed from: F1 */
    public static cbm0 m90606F1() {
        return m90662N1("EXTERNAL_CREDENTIALSMANAGER", "external/credentialsmanager", 521, "external");
    }

    /* JADX INFO: renamed from: F2 */
    public static cbm0 m90607F2() {
        return m90662N1("LIVE_ENTITY", "live/entity", 905, "live");
    }

    /* JADX INFO: renamed from: F3 */
    public static cbm0 m90608F3() {
        return m90662N1("PLAN_MEMBER_INVITATION", "plan-member-invitation", 1394, "plan-member-invitation");
    }

    /* JADX INFO: renamed from: F4 */
    public static cbm0 m90609F4() {
        return m90662N1("QUIZ_RECOMMENDATIONS", "quiz/recommendations", 1554, "quiz");
    }

    /* JADX INFO: renamed from: F5 */
    public static cbm0 m90610F5() {
        return m90662N1("UNKNOWN_UNCOVERED", "unknown/uncovered", 1995, "unknown");
    }

    /* JADX INFO: renamed from: G */
    public static cbm0 m90611G() {
        return m90662N1("ADD_CHILD_PLAN_MEMBER", "add-child-plan-member", 14, "add-child-plan-member");
    }

    /* JADX INFO: renamed from: G0 */
    public static cbm0 m90612G0() {
        return m90662N1("CHAT_MEMBERS", "chat/members", 318, "chat");
    }

    /* JADX INFO: renamed from: G1 */
    public static cbm0 m90613G1() {
        return m90662N1("EXTERNAL_FACEBOOK", "external/facebook", 522, "external");
    }

    /* JADX INFO: renamed from: G2 */
    public static cbm0 m90614G2() {
        return m90662N1("LOGIN_DIALOG_OFFLINE_ERROR", "login/dialog/offline-error", 923, "login");
    }

    /* JADX INFO: renamed from: G3 */
    public static cbm0 m90615G3() {
        return m90662N1("PLAN_OVERVIEW", "plan-overview", 1395, "plan-overview");
    }

    /* JADX INFO: renamed from: G4 */
    public static cbm0 m90616G4() {
        return m90662N1("QUIZ_RESULTS", "quiz/results", 1555, "quiz");
    }

    /* JADX INFO: renamed from: G5 */
    public static cbm0 m90617G5() {
        return m90662N1("UPCOMINGRELEASES", "upcomingreleases", 1996, "upcomingreleases");
    }

    /* JADX INFO: renamed from: H */
    public static cbm0 m90618H() {
        return m90662N1("ADD_ON_MANAGEMENT", "add-on-management", 16, "add-on-management");
    }

    /* JADX INFO: renamed from: H0 */
    public static cbm0 m90619H0() {
        return m90662N1("CHAT_MUTE", "chat/mute", 319, "chat");
    }

    /* JADX INFO: renamed from: H1 */
    public static cbm0 m90620H1() {
        return m90662N1("EXTERNAL_GOOGLE", "external/google", 523, "external");
    }

    /* JADX INFO: renamed from: H2 */
    public static cbm0 m90621H2() {
        return m90662N1("LOGIN_DIALOG_PASSKEY_LOGIN_FAILED", "login/dialog/passkey-login-failed", 924, "login");
    }

    /* JADX INFO: renamed from: H3 */
    public static cbm0 m90622H3() {
        return m90662N1("PLAYBACK_TIMEOUT", "playback-timeout", 1396, "playback-timeout");
    }

    /* JADX INFO: renamed from: H4 */
    public static cbm0 m90623H4() {
        return m90662N1("RADIO", "radio", 1556, "radio");
    }

    /* JADX INFO: renamed from: H5 */
    public static cbm0 m90624H5() {
        return m90662N1("UPSELL", "upsell", 1998, "upsell");
    }

    /* JADX INFO: renamed from: I */
    public static cbm0 m90625I() {
        return m90662N1("ADDRESS", "address", 17, "address");
    }

    /* JADX INFO: renamed from: I0 */
    public static cbm0 m90626I0() {
        return m90662N1("CHAT_SETTINGS", "chat/settings", 321, "chat");
    }

    /* JADX INFO: renamed from: I1 */
    public static cbm0 m90627I1() {
        return m90662N1("FAST_TRACK_PAGE_1", "fast-track/page-1", 536, "fast-track");
    }

    /* JADX INFO: renamed from: I2 */
    public static cbm0 m90628I2() {
        return m90662N1("LOGIN_DIALOG_PASSKEY_NOT_FOUND", "login/dialog/passkey-not-found", 925, "login");
    }

    /* JADX INFO: renamed from: I3 */
    public static cbm0 m90629I3() {
        return m90662N1("PLAYLIST", "playlist", 1397, "playlist");
    }

    /* JADX INFO: renamed from: I4 */
    public static cbm0 m90630I4() {
        return m90662N1("REACTION_SHEET", "reaction-sheet", 1569, "reaction-sheet");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: I5 */
    public static cbm0 m90631I5(String str) {
        cbm0 cbm0VarM90638J5;
        switch (str.hashCode() & 15) {
            case 0:
                cbm0VarM90638J5 = m90638J5(str);
                break;
            case 1:
                cbm0VarM90638J5 = m90645K5(str);
                break;
            case 2:
                cbm0VarM90638J5 = m90687Q5(str);
                break;
            case 3:
                cbm0VarM90638J5 = m90694R5(str);
                break;
            case 4:
                cbm0VarM90638J5 = m90701S5(str);
                break;
            case 5:
                cbm0VarM90638J5 = m90708T5(str);
                break;
            case 6:
                cbm0VarM90638J5 = m90715U5(str);
                break;
            case 7:
                cbm0VarM90638J5 = m90722V5(str);
                break;
            case 8:
                cbm0VarM90638J5 = m90729W5(str);
                break;
            case 9:
                cbm0VarM90638J5 = m90736X5(str);
                break;
            case 10:
                cbm0VarM90638J5 = m90652L5(str);
                break;
            case 11:
                cbm0VarM90638J5 = m90659M5(str);
                break;
            case 12:
                cbm0VarM90638J5 = m90666N5(str);
                break;
            case 13:
                cbm0VarM90638J5 = m90673O5(str);
                break;
            case 14:
                cbm0VarM90638J5 = m90680P5(str);
                break;
            case 15:
                switch (str.hashCode()) {
                    case -2096615345:
                        if (str.equals("ADSTUDIO_SBL_STOP_SURVEY")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_SBL_STOP_SURVEY", "adstudio/sbl/stop-survey", 114, "adstudio");
                            break;
                        }
                        break;
                    case -2095788065:
                        if (str.equals("LYRICS_REPORT")) {
                            cbm0VarM90638J5 = m90662N1("LYRICS_REPORT", "lyrics/report", 944, "lyrics");
                            break;
                        }
                        break;
                    case -2082274593:
                        if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_PARENTALSETTINGS")) {
                            cbm0VarM90638J5 = m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_PARENTALSETTINGS", "www-account-pages/parental-settings/parentalsettings", 2148, "www-account-pages");
                            break;
                        }
                        break;
                    case -2061843921:
                        if (str.equals("QUIZ_FEEDBACK")) {
                            cbm0VarM90638J5 = m90588C4();
                            break;
                        }
                        break;
                    case -2052689329:
                        if (str.equals("ADSTUDIO_AD_SET_DETAILS")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_AD_SET_DETAILS", "adstudio/ad-set/details", 34, "adstudio");
                            break;
                        }
                        break;
                    case -2048337793:
                        if (str.equals("EXPRESSIVE_PLAYLISTS_EDIT")) {
                            cbm0VarM90638J5 = m90662N1("EXPRESSIVE_PLAYLISTS_EDIT", "expressive-playlists-edit", 519, "expressive-playlists-edit");
                            break;
                        }
                        break;
                    case -2047231889:
                        if (str.equals("HOMETHING_ACTIVATION_ERROR")) {
                            cbm0VarM90638J5 = m90662N1("HOMETHING_ACTIVATION_ERROR", "homething/activation/error", ContentDeliveryAdvertisementCapability.DYNAMIC_LOAD, "homething");
                            break;
                        }
                        break;
                    case -2046058129:
                        if (str.equals("GOLDENPATH_VALERIIL")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_VALERIIL", "goldenpath/valeriil", 737, "goldenpath");
                            break;
                        }
                        break;
                    case -2026200673:
                        if (str.equals("RUNNING")) {
                            cbm0VarM90638J5 = m90662N1("RUNNING", "running", 1603, "running");
                            break;
                        }
                        break;
                    case -2022254017:
                        if (str.equals("MADE_FOR_YOU")) {
                            cbm0VarM90638J5 = m90656M2();
                            break;
                        }
                        break;
                    case -2019352257:
                        if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS")) {
                            cbm0VarM90638J5 = m90818j4();
                            break;
                        }
                        break;
                    case -1920503873:
                        if (str.equals("EMBED_MCP_UI")) {
                            cbm0VarM90638J5 = m90662N1("EMBED_MCP_UI", "embed-mcp-ui", 496, "embed-mcp-ui");
                            break;
                        }
                        break;
                    case -1884837025:
                        if (str.equals("ARTIST_ARTIST_ATTRIBUTION")) {
                            cbm0VarM90638J5 = m90730X();
                            break;
                        }
                        break;
                    case -1857005313:
                        if (str.equals("LIVE_AUDIO_ENTITY")) {
                            cbm0VarM90638J5 = m90662N1("LIVE_AUDIO_ENTITY", "live-audio/entity", 904, "live-audio");
                            break;
                        }
                        break;
                    case -1849594657:
                        if (str.equals("INTERIMSHARE")) {
                            cbm0VarM90638J5 = m90662N1("INTERIMSHARE", "interimshare", 823, "interimshare");
                            break;
                        }
                        break;
                    case -1776064513:
                        if (str.equals("ADSTUDIO_BILLING_CENTER")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_BILLING_CENTER", "adstudio/billing-center", 50, "adstudio");
                            break;
                        }
                        break;
                    case -1754815313:
                        if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_ADD_DETAILS")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_ADD_DETAILS", "mrkt/artist/campaigns/marquee-and-showcase/create/flights/add-details", 1027, "mrkt");
                            break;
                        }
                        break;
                    case -1710923073:
                        if (str.equals("COMMENTS_REACTIONS")) {
                            cbm0VarM90638J5 = m90662N1("COMMENTS_REACTIONS", "comments/reactions", 369, "comments");
                            break;
                        }
                        break;
                    case -1698931585:
                        if (str.equals("GOLDENPATH_MAXR")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_MAXR", "goldenpath/maxr", 680, "goldenpath");
                            break;
                        }
                        break;
                    case -1664121553:
                        if (str.equals("SHOWS_RESOLVER")) {
                            cbm0VarM90638J5 = m90662N1("SHOWS_RESOLVER", "shows/resolver", 1819, "shows");
                            break;
                        }
                        break;
                    case -1640662657:
                        if (str.equals("SUPPORT_SITE_OLD_HOME")) {
                            cbm0VarM90638J5 = m90662N1("SUPPORT_SITE_OLD_HOME", "support-site/old/home", 1958, "support-site");
                            break;
                        }
                        break;
                    case -1563240385:
                        if (str.equals("PARENTAL_CONTROL_ACCOUNT_DETAILS_PROFILE_VISIBILITY_SETTINGS")) {
                            cbm0VarM90638J5 = m90662N1("PARENTAL_CONTROL_ACCOUNT_DETAILS_PROFILE_VISIBILITY_SETTINGS", "parental-control/account-details/profile-visibility-settings", 1350, "parental-control");
                            break;
                        }
                        break;
                    case -1541419825:
                        if (str.equals("FOLLOWFEED")) {
                            cbm0VarM90638J5 = m90662N1("FOLLOWFEED", "followfeed", 543, "followfeed");
                            break;
                        }
                        break;
                    case -1488525457:
                        if (str.equals("PREMIUM_WWW")) {
                            cbm0VarM90638J5 = m90662N1("PREMIUM_WWW", "premium-www", 1503, "premium-www");
                            break;
                        }
                        break;
                    case -1481967425:
                        if (str.equals("PROFILE_FRIENDS")) {
                            cbm0VarM90638J5 = m90662N1("PROFILE_FRIENDS", "profile/friends", 1528, "profile");
                            break;
                        }
                        break;
                    case -1349980641:
                        if (str.equals("AUTHOR_BIOGRAPHY")) {
                            cbm0VarM90638J5 = m90662N1("AUTHOR_BIOGRAPHY", "author/biography", 205, "author");
                            break;
                        }
                        break;
                    case -1299749425:
                        if (str.equals("SEARCH_VIDEOS")) {
                            cbm0VarM90638J5 = m90662N1("SEARCH_VIDEOS", "search/videos", 1744, "search");
                            break;
                        }
                        break;
                    case -1273532961:
                        if (str.equals("SHARE_MENU")) {
                            cbm0VarM90638J5 = m90662N1("SHARE_MENU", "share-menu", 1795, "share-menu");
                            break;
                        }
                        break;
                    case -1190082897:
                        if (str.equals("ADSTUDIO_REPORT_EDIT")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_REPORT_EDIT", "adstudio/report/edit", 108, "adstudio");
                            break;
                        }
                        break;
                    case -1185699585:
                        if (str.equals("WEAR_SEARCH_RESULTS")) {
                            cbm0VarM90638J5 = m90662N1("WEAR_SEARCH_RESULTS", "wear/search/results", 2077, "wear");
                            break;
                        }
                        break;
                    case -1153523777:
                        if (str.equals("YOUR_ADDONS")) {
                            cbm0VarM90638J5 = m90662N1("YOUR_ADDONS", "your-addons", 2170, "your-addons");
                            break;
                        }
                        break;
                    case -1152863233:
                        if (str.equals("EXTERNAL_YOTI")) {
                            cbm0VarM90638J5 = m90662N1("EXTERNAL_YOTI", "external/yoti", 525, "external");
                            break;
                        }
                        break;
                    case -1012530785:
                        if (str.equals("ADSTUDIO_EDIT_CAMPAIGN")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_EDIT_CAMPAIGN", "adstudio/edit/campaign", 95, "adstudio");
                            break;
                        }
                        break;
                    case -1010037681:
                        if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_MERCH_AND_LIVE")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_FRONTDOOR_FAN_STUDY_MERCH_AND_LIVE", "mrkt/frontdoor/fan-study/merch-and-live", 1208, "mrkt");
                            break;
                        }
                        break;
                    case -1008064881:
                        if (str.equals("SEARCH_EPISODES")) {
                            cbm0VarM90638J5 = m90662N1("SEARCH_EPISODES", "search/episodes", 1730, "search");
                            break;
                        }
                        break;
                    case -991067857:
                        if (str.equals("MRKT_ARTIST_MUSIC_UPCOMING_MANAGE_RELEASE")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_ARTIST_MUSIC_UPCOMING_MANAGE_RELEASE", "mrkt/artist/music/upcoming/manage-release", 1060, "mrkt");
                            break;
                        }
                        break;
                    case -981898001:
                        if (str.equals("GOLDENPATH_MARKUSK")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_MARKUSK", "goldenpath/markusk", 676, "goldenpath");
                            break;
                        }
                        break;
                    case -977922289:
                        if (str.equals("MRKT_LEGAL_TERMS_AND_CONDITIONS")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_LEGAL_TERMS_AND_CONDITIONS", "mrkt/legal/terms-and-conditions", 1239, "mrkt");
                            break;
                        }
                        break;
                    case -976449921:
                        if (str.equals("MRKT_VIDEO_EDIT")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_VIDEO_EDIT", "mrkt/video/edit", 1280, "mrkt");
                            break;
                        }
                        break;
                    case -941134545:
                        if (str.equals("TERMS_TERMSOFSERVICE")) {
                            cbm0VarM90638J5 = m90662N1("TERMS_TERMSOFSERVICE", "terms/termsofservice", 1970, "terms");
                            break;
                        }
                        break;
                    case -916921041:
                        if (str.equals("COLLECTION_FOLDER")) {
                            cbm0VarM90638J5 = m90662N1("COLLECTION_FOLDER", "collection/folder", 343, "collection");
                            break;
                        }
                        break;
                    case -911274705:
                        if (str.equals("WATCHAPP_ONBOARDING_DOWNLOAD_ON_WATCH")) {
                            cbm0VarM90638J5 = m90662N1("WATCHAPP_ONBOARDING_DOWNLOAD_ON_WATCH", "watchapp/onboarding-download-on-watch", 2036, "watchapp");
                            break;
                        }
                        break;
                    case -902540657:
                        if (str.equals("SETTINGS_NOTIFICATIONS_CATEGORIES")) {
                            cbm0VarM90638J5 = m90819j5();
                            break;
                        }
                        break;
                    case -897067953:
                        if (str.equals("PODCAST_SHOW_SEARCH")) {
                            cbm0VarM90638J5 = m90741Y3();
                            break;
                        }
                        break;
                    case -830029633:
                        if (str.equals("BOOTCAMP_TOPCOUNTRYPLAYLIST")) {
                            cbm0VarM90638J5 = m90662N1("BOOTCAMP_TOPCOUNTRYPLAYLIST", "bootcamp/topcountryplaylist", 242, "bootcamp");
                            break;
                        }
                        break;
                    case -819194689:
                        if (str.equals("SHARE_SHEET")) {
                            cbm0VarM90638J5 = m90662N1("SHARE_SHEET", "share-sheet", 1797, "share-sheet");
                            break;
                        }
                        break;
                    case -799472929:
                        if (str.equals("GOLDENPATH_ERICKR")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_ERICKR", "goldenpath/erickr", 629, "goldenpath");
                            break;
                        }
                        break;
                    case -729160625:
                        if (str.equals("GOLDENPATH_HAMIDM")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_HAMIDM", "goldenpath/hamidm", 638, "goldenpath");
                            break;
                        }
                        break;
                    case -722442417:
                        if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ROOT")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ROOT", "mrkt/artist/video/other-videos/root", 1134, "mrkt");
                            break;
                        }
                        break;
                    case -714321681:
                        if (str.equals("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_WIFI_STREAMING")) {
                            cbm0VarM90638J5 = m90662N1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_WIFI_STREAMING", "wear/settings/audio_quality_settings/wifi_streaming", 2085, "wear");
                            break;
                        }
                        break;
                    case -691591729:
                        if (str.equals("SARABANDA")) {
                            cbm0VarM90638J5 = m90662N1("SARABANDA", "sarabanda", 1719, "sarabanda");
                            break;
                        }
                        break;
                    case -650492817:
                        if (str.equals("S4P_SHOWS_VIEW_IN_BROWSER")) {
                            cbm0VarM90638J5 = m90662N1("S4P_SHOWS_VIEW_IN_BROWSER", "s4p/shows/view-in-browser", 1710, "s4p");
                            break;
                        }
                        break;
                    case -608254529:
                        if (str.equals("S4P_SETTINGS_ORGANIZATION")) {
                            cbm0VarM90638J5 = m90662N1("S4P_SETTINGS_ORGANIZATION", "s4p/settings/organization", 1688, "s4p");
                            break;
                        }
                        break;
                    case -605590337:
                        if (str.equals("PROFILE_FOLLOWERS")) {
                            cbm0VarM90638J5 = m90662N1("PROFILE_FOLLOWERS", "profile/followers", 1526, "profile");
                            break;
                        }
                        break;
                    case -598905953:
                        if (str.equals("SEARCH_SHOWS")) {
                            cbm0VarM90638J5 = m90662N1("SEARCH_SHOWS", "search/shows", 1742, "search");
                            break;
                        }
                        break;
                    case -581806769:
                        if (str.equals("WEAR_YOUR_LIBRARY")) {
                            cbm0VarM90638J5 = m90662N1("WEAR_YOUR_LIBRARY", "wear/your_library", 2095, "wear");
                            break;
                        }
                        break;
                    case -522703073:
                        if (str.equals("FREE_TIER_PROFILE")) {
                            cbm0VarM90638J5 = m90662N1("FREE_TIER_PROFILE", "free-tier-profile", 560, "free-tier-profile");
                            break;
                        }
                        break;
                    case -513623537:
                        if (str.equals("ARTIST_ABOUT_WEBVIEW")) {
                            cbm0VarM90638J5 = m90662N1("ARTIST_ABOUT_WEBVIEW", "artist/about/webview", 156, "artist");
                            break;
                        }
                        break;
                    case -512023361:
                        if (str.equals("BUNDLING")) {
                            cbm0VarM90638J5 = m90662N1("BUNDLING", "bundling", 250, "bundling");
                            break;
                        }
                        break;
                    case -454912481:
                        if (str.equals("KID_ACCOUNT_CREATION_LEGAL_CONSENT")) {
                            cbm0VarM90638J5 = m90662N1("KID_ACCOUNT_CREATION_LEGAL_CONSENT", "kid-account-creation/legal-consent", 855, "kid-account-creation");
                            break;
                        }
                        break;
                    case -444677297:
                        if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD_SET")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD_SET", "adstudio/duplicate-ad-set-with-ads/ad-set", 89, "adstudio");
                            break;
                        }
                        break;
                    case -443117329:
                        if (str.equals("WWW_ACCOUNT_PAGES_HERO")) {
                            cbm0VarM90638J5 = m90662N1("WWW_ACCOUNT_PAGES_HERO", "www-account-pages/hero", 2130, "www-account-pages");
                            break;
                        }
                        break;
                    case -429809105:
                        if (str.equals("GOLDENPATH_ROQUEB")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_ROQUEB", "goldenpath/roqueb", 720, "goldenpath");
                            break;
                        }
                        break;
                    case -421587633:
                        if (str.equals("MRKT_ARTIST_MUSIC_APPROVALS")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_ARTIST_MUSIC_APPROVALS", "mrkt/artist/music/approvals", 1053, "mrkt");
                            break;
                        }
                        break;
                    case -395224465:
                        if (str.equals("HIFI_TOGGLE")) {
                            cbm0VarM90638J5 = m90662N1("HIFI_TOGGLE", "hifi/toggle", 773, "hifi");
                            break;
                        }
                        break;
                    case -375878817:
                        if (str.equals("GOLDENPATH_DAVIDEA")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_DAVIDEA", "goldenpath/davidea", 615, "goldenpath");
                            break;
                        }
                        break;
                    case -342769633:
                        if (str.equals("WATCHAPP_TESTING_TOOLS")) {
                            cbm0VarM90638J5 = m90662N1("WATCHAPP_TESTING_TOOLS", "watchapp/testing-tools", Entity.SERP_METADATA_FIELD_NUMBER, "watchapp");
                            break;
                        }
                        break;
                    case -327887441:
                        if (str.equals("PUFFIN_PIGEON_ONBOARDING")) {
                            cbm0VarM90638J5 = m90581B4();
                            break;
                        }
                        break;
                    case -280881473:
                        if (str.equals("LIST_CREATIONMENU")) {
                            cbm0VarM90638J5 = m90662N1("LIST_CREATIONMENU", "list/creationmenu", 885, "list");
                            break;
                        }
                        break;
                    case -219426001:
                        if (str.equals("YOURLIBRARY_EPISODES")) {
                            cbm0VarM90638J5 = m90799g6();
                            break;
                        }
                        break;
                    case -196802481:
                        if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_BILLING")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_BILLING", "mrkt/artist/campaigns/marquee-and-showcase/update/billing", 1035, "mrkt");
                            break;
                        }
                        break;
                    case -187459377:
                        if (str.equals("BLEND_TASTE_MATCH")) {
                            cbm0VarM90638J5 = m90840n0();
                            break;
                        }
                        break;
                    case -137838913:
                        if (str.equals("WWW_ACCOUNT_PAGES_ADDRESS")) {
                            cbm0VarM90638J5 = m90662N1("WWW_ACCOUNT_PAGES_ADDRESS", "www-account-pages/address", 2108, "www-account-pages");
                            break;
                        }
                        break;
                    case -132017409:
                        if (str.equals("EPISODECHAPTERS_EPISODECHAPTER_CONTEXTMENU")) {
                            cbm0VarM90638J5 = m90662N1("EPISODECHAPTERS_EPISODECHAPTER_CONTEXTMENU", "episodechapters/episodechapter/contextmenu", 509, "episodechapters");
                            break;
                        }
                        break;
                    case -89789201:
                        if (str.equals("S4P_HOME")) {
                            cbm0VarM90638J5 = m90662N1("S4P_HOME", "s4p/home", 1656, "s4p");
                            break;
                        }
                        break;
                    case -79004657:
                        if (str.equals("AUDIOBOOK_TOPUP_PRODUCTPAGE")) {
                            cbm0VarM90638J5 = m90662N1("AUDIOBOOK_TOPUP_PRODUCTPAGE", "audiobook/topup/productpage", 202, "audiobook");
                            break;
                        }
                        break;
                    case -44957793:
                        if (str.equals("LOGIN_DIALOG_UNKNOWNERROR")) {
                            cbm0VarM90638J5 = m90662N1("LOGIN_DIALOG_UNKNOWNERROR", "login/dialog/unknownerror", 927, "login");
                            break;
                        }
                        break;
                    case -44418017:
                        if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VISIBLEONPROFILE")) {
                            cbm0VarM90638J5 = m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VISIBLEONPROFILE", "www-account-pages/parental-settings/visibleonprofile", 2151, "www-account-pages");
                            break;
                        }
                        break;
                    case 82415:
                        if (str.equals("SSO")) {
                            cbm0VarM90638J5 = m90662N1("SSO", "sso", 1910, "sso");
                            break;
                        }
                        break;
                    case 88063:
                        if (str.equals("YOU")) {
                            cbm0VarM90638J5 = m90662N1("YOU", "you", 2169, "you");
                            break;
                        }
                        break;
                    case 2223327:
                        if (str.equals("HOME")) {
                            cbm0VarM90638J5 = m90725W1();
                            break;
                        }
                        break;
                    case 6638175:
                        if (str.equals("PLAYLISTS_EDIT_PROFILE_VISIBILITY")) {
                            cbm0VarM90638J5 = m90720V3();
                            break;
                        }
                        break;
                    case 62359119:
                        if (str.equals("ALBUM")) {
                            cbm0VarM90638J5 = m90695S();
                            break;
                        }
                        break;
                    case 78862271:
                        if (str.equals("SHARE")) {
                            cbm0VarM90638J5 = m90662N1("SHARE", "share", 1794, "share");
                            break;
                        }
                        break;
                    case 80008463:
                        if (str.equals("TOPIC")) {
                            cbm0VarM90638J5 = m90662N1("TOPIC", "topic", 1973, "topic");
                            break;
                        }
                        break;
                    case 81556047:
                        if (str.equals("VENUE")) {
                            cbm0VarM90638J5 = m90743Y5();
                            break;
                        }
                        break;
                    case 122751903:
                        if (str.equals("SPONSORED_RECOMMENDATION")) {
                            cbm0VarM90638J5 = m90662N1("SPONSORED_RECOMMENDATION", "sponsored-recommendation", 1868, "sponsored-recommendation");
                            break;
                        }
                        break;
                    case 124984303:
                        if (str.equals("PROMPTABLE_SECTION_INPUT")) {
                            cbm0VarM90638J5 = m90574A4();
                            break;
                        }
                        break;
                    case 145435983:
                        if (str.equals("VIDEO_DEBUG")) {
                            cbm0VarM90638J5 = m90662N1("VIDEO_DEBUG", "video/debug", 2006, "video");
                            break;
                        }
                        break;
                    case 263009375:
                        if (str.equals("PLAYLIST_OVERLAP_EDIT_PAGE")) {
                            cbm0VarM90638J5 = m90662N1("PLAYLIST_OVERLAP_EDIT_PAGE", "playlist/overlap-edit-page", 1417, "playlist");
                            break;
                        }
                        break;
                    case 326259119:
                        if (str.equals("REINVENTFREE_TIME_CAP_UPSELL_PREVIEW")) {
                            cbm0VarM90638J5 = m90662N1("REINVENTFREE_TIME_CAP_UPSELL_PREVIEW", "reinventfree-time-cap-upsell-preview", 1590, "reinventfree-time-cap-upsell-preview");
                            break;
                        }
                        break;
                    case 411302607:
                        if (str.equals("INAPPMESSAGE_FULLSCREEN")) {
                            cbm0VarM90638J5 = m90830l2();
                            break;
                        }
                        break;
                    case 417638943:
                        if (str.equals("ADS_REPORT_AD")) {
                            cbm0VarM90638J5 = m90662N1("ADS_REPORT_AD", "ads/report-ad", 24, "ads");
                            break;
                        }
                        break;
                    case 448019471:
                        if (str.equals("MRKT_ROSTER_RELEASES")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_ROSTER_RELEASES", "mrkt/roster/releases", 1254, "mrkt");
                            break;
                        }
                        break;
                    case 488143535:
                        if (str.equals("S4P_PODCAST_EPISODE_OPTIONS")) {
                            cbm0VarM90638J5 = m90662N1("S4P_PODCAST_EPISODE_OPTIONS", "s4p/podcast/episode/options", 1677, "s4p");
                            break;
                        }
                        break;
                    case 503954767:
                        if (str.equals("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT_SEARCH")) {
                            cbm0VarM90638J5 = m90662N1("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT_SEARCH", "parental-control/manage-blocked-content/search", 1361, "parental-control");
                            break;
                        }
                        break;
                    case 526260639:
                        if (str.equals("MRKT_FRONTDOOR_GET_STARTED")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_FRONTDOOR_GET_STARTED", "mrkt/frontdoor/get-started", 1213, "mrkt");
                            break;
                        }
                        break;
                    case 552863215:
                        if (str.equals("MRKT_BULK_CAMPAIGNS_FORECAST_SUBMITTED")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_BULK_CAMPAIGNS_FORECAST_SUBMITTED", "mrkt/bulk-campaigns/forecast/submitted", 1148, "mrkt");
                            break;
                        }
                        break;
                    case 580287455:
                        if (str.equals("PUFFIN_MANUAL_SELECT_REDUCED")) {
                            cbm0VarM90638J5 = m90662N1("PUFFIN_MANUAL_SELECT_REDUCED", "puffin/manual-select-reduced", 1544, "puffin");
                            break;
                        }
                        break;
                    case 598216495:
                        if (str.equals("ACTIVATION_AUTO_TRIAL")) {
                            cbm0VarM90638J5 = m90662N1("ACTIVATION_AUTO_TRIAL", "activation/auto-trial", 7, "activation");
                            break;
                        }
                        break;
                    case 613040063:
                        if (str.equals("CHECKOUT_UNIFIEDCHECKOUT")) {
                            cbm0VarM90638J5 = m90662N1("CHECKOUT_UNIFIEDCHECKOUT", "checkout/unifiedcheckout", 330, "checkout");
                            break;
                        }
                        break;
                    case 627167007:
                        if (str.equals("ADSTUDIO_COLD_START_CAMPAIGN_RESERVED_BOOKING")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_COLD_START_CAMPAIGN_RESERVED_BOOKING", "adstudio/cold-start/campaign/reserved-booking", 73, "adstudio");
                            break;
                        }
                        break;
                    case 628872015:
                        if (str.equals("HOMETHING")) {
                            cbm0VarM90638J5 = m90662N1("HOMETHING", "homething", 799, "homething");
                            break;
                        }
                        break;
                    case 629042847:
                        if (str.equals("PODCASTCLIPS")) {
                            cbm0VarM90638J5 = m90662N1("PODCASTCLIPS", "podcastclips", 1459, "podcastclips");
                            break;
                        }
                        break;
                    case 659593119:
                        if (str.equals("PLAYLIST_OVERLAP_MESSAGING")) {
                            cbm0VarM90638J5 = m90692R3();
                            break;
                        }
                        break;
                    case 758543631:
                        if (str.equals("CHAT_CONTRIBUTION_MEDIA_GALLERY")) {
                            cbm0VarM90638J5 = m90915y0();
                            break;
                        }
                        break;
                    case 790131455:
                        if (str.equals("WEB3_NFTSHOWCASEPREVIEW")) {
                            cbm0VarM90638J5 = m90662N1("WEB3_NFTSHOWCASEPREVIEW", "web3/nftshowcasepreview", 2098, "web3");
                            break;
                        }
                        break;
                    case 802000751:
                        if (str.equals("SUPPORT_HOME")) {
                            cbm0VarM90638J5 = m90662N1("SUPPORT_HOME", "support/home", 1963, "support");
                            break;
                        }
                        break;
                    case 818422927:
                        if (str.equals("MRKT_LICENSOR_DISCOVERYMODE_CREATE")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_LICENSOR_DISCOVERYMODE_CREATE", "mrkt/licensor/discoverymode/create", 1242, "mrkt");
                            break;
                        }
                        break;
                    case 910550591:
                        if (str.equals("ADSTUDIO_DASHBOARD_ADS")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_DASHBOARD_ADS", "adstudio/dashboard/ads", 79, "adstudio");
                            break;
                        }
                        break;
                    case 1068601215:
                        if (str.equals("LOGIN_PIN")) {
                            cbm0VarM90638J5 = m90662N1("LOGIN_PIN", "login/pin", 936, "login");
                            break;
                        }
                        break;
                    case 1071493487:
                        if (str.equals("ADD_CHILD_PLAN_MEMBER")) {
                            cbm0VarM90638J5 = m90611G();
                            break;
                        }
                        break;
                    case 1104145967:
                        if (str.equals("PERMISSIONS_BLUETOOTH_INFO_BOTTOMSHEET")) {
                            cbm0VarM90638J5 = m90662N1("PERMISSIONS_BLUETOOTH_INFO_BOTTOMSHEET", "permissions/bluetooth/info/bottomsheet", 1376, "permissions");
                            break;
                        }
                        break;
                    case 1113254415:
                        if (str.equals("PHONENUMBERSIGNUP_CALLINGCODEPICKER")) {
                            cbm0VarM90638J5 = m90662N1("PHONENUMBERSIGNUP_CALLINGCODEPICKER", "phonenumbersignup/callingcodepicker", 1388, "phonenumbersignup");
                            break;
                        }
                        break;
                    case 1133129599:
                        if (str.equals("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT")) {
                            cbm0VarM90638J5 = m90662N1("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT", "parental-control/manage-approved-content", 1358, "parental-control");
                            break;
                        }
                        break;
                    case 1256796719:
                        if (str.equals("WWW_ACCOUNT_PAGES_SAVEDPAYMENTCARDS")) {
                            cbm0VarM90638J5 = m90662N1("WWW_ACCOUNT_PAGES_SAVEDPAYMENTCARDS", "www-account-pages/savedpaymentcards", 2162, "www-account-pages");
                            break;
                        }
                        break;
                    case 1258543391:
                        if (str.equals("SEARCH_AUTOCOMPLETE")) {
                            cbm0VarM90638J5 = m90662N1("SEARCH_AUTOCOMPLETE", "search/autocomplete", 1729, "search");
                            break;
                        }
                        break;
                    case 1323202079:
                        if (str.equals("GOLDENPATH_ADAMPSB")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_ADAMPSB", "goldenpath/adampsb", 596, "goldenpath");
                            break;
                        }
                        break;
                    case 1394133535:
                        if (str.equals("FREE_TIER_SEARCH_PLAYLIST")) {
                            cbm0VarM90638J5 = m90662N1("FREE_TIER_SEARCH_PLAYLIST", "free-tier-search-playlist", 561, "free-tier-search-playlist");
                            break;
                        }
                        break;
                    case 1397251343:
                        if (str.equals("PLAYLIST_COVER_ART_SNAKE")) {
                            cbm0VarM90638J5 = m90650L3();
                            break;
                        }
                        break;
                    case 1408036975:
                        if (str.equals("WRAPPED_DATASTORIES")) {
                            cbm0VarM90638J5 = m90662N1("WRAPPED_DATASTORIES", "wrapped/datastories", 2101, "wrapped");
                            break;
                        }
                        break;
                    case 1443808495:
                        if (str.equals("WEAR_CONNECT_VOLUME")) {
                            cbm0VarM90638J5 = m90662N1("WEAR_CONNECT_VOLUME", "wear/connect_volume", 2060, "wear");
                            break;
                        }
                        break;
                    case 1456019279:
                        if (str.equals("WEB3_NFTSHOWCASEGRID")) {
                            cbm0VarM90638J5 = m90662N1("WEB3_NFTSHOWCASEGRID", "web3/nftshowcasegrid", 2097, "web3");
                            break;
                        }
                        break;
                    case 1516353551:
                        if (str.equals("UBI_SHOWCASE_TEST_CONTEXTUAL")) {
                            cbm0VarM90638J5 = m90662N1("UBI_SHOWCASE_TEST_CONTEXTUAL", "ubi/showcase-test-contextual", 1987, "ubi");
                            break;
                        }
                        break;
                    case 1518256719:
                        if (str.equals("GOLDENPATH_DHOROWITZ")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_DHOROWITZ", "goldenpath/dhorowitz", 616, "goldenpath");
                            break;
                        }
                        break;
                    case 1542004047:
                        if (str.equals("HOME_PODCASTS")) {
                            cbm0VarM90638J5 = m90760b2();
                            break;
                        }
                        break;
                    case 1581214367:
                        if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS")) {
                            cbm0VarM90638J5 = m90662N1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS", "mrkt/artist/video/other-videos/manage-associations", 1131, "mrkt");
                            break;
                        }
                        break;
                    case 1601319903:
                        if (str.equals("RESETPASSWORD_EMAILSENT")) {
                            cbm0VarM90638J5 = m90662N1("RESETPASSWORD_EMAILSENT", "resetpassword/emailsent", 1601, "resetpassword");
                            break;
                        }
                        break;
                    case 1640303055:
                        if (str.equals("PLAN_OVERVIEW")) {
                            cbm0VarM90638J5 = m90615G3();
                            break;
                        }
                        break;
                    case 1655825823:
                        if (str.equals("WEAR_HOME")) {
                            cbm0VarM90638J5 = m90662N1("WEAR_HOME", "wear/home", 2069, "wear");
                            break;
                        }
                        break;
                    case 1663258175:
                        if (str.equals("SETTINGS_STORAGE")) {
                            cbm0VarM90638J5 = m90662N1("SETTINGS_STORAGE", "settings/storage", 1788, "settings");
                            break;
                        }
                        break;
                    case 1752966415:
                        if (str.equals("SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE")) {
                            cbm0VarM90638J5 = m90662N1("SETTINGS_NOTIFICATIONS_LANGUAGE_PREFERENCE", "settings/notifications/language-preference", 1781, "settings");
                            break;
                        }
                        break;
                    case 1868301055:
                        if (str.equals("YOURLIBRARY_SHOWS")) {
                            cbm0VarM90638J5 = m90662N1("YOURLIBRARY_SHOWS", "yourlibrary/shows", 2188, "yourlibrary");
                            break;
                        }
                        break;
                    case 1877057631:
                        if (str.equals("ADSTUDIO_EVENTS")) {
                            cbm0VarM90638J5 = m90662N1("ADSTUDIO_EVENTS", "adstudio/events", 98, "adstudio");
                            break;
                        }
                        break;
                    case 1991626639:
                        if (str.equals("GOLDENPATH_POLINAKIM")) {
                            cbm0VarM90638J5 = m90662N1("GOLDENPATH_POLINAKIM", "goldenpath/polinakim", 713, "goldenpath");
                            break;
                        }
                        break;
                    case 2058983919:
                        if (str.equals("PHONENUMBERSIGNUP")) {
                            cbm0VarM90638J5 = m90662N1("PHONENUMBERSIGNUP", "phonenumbersignup", 1387, "phonenumbersignup");
                            break;
                        }
                        break;
                    case 2070311471:
                        if (str.equals("GRADUATION_REJECTED")) {
                            cbm0VarM90638J5 = m90697S1();
                            break;
                        }
                        break;
                    case 2076524927:
                        if (str.equals("S4P_CREATION_AUDIO_TRIMMER")) {
                            cbm0VarM90638J5 = m90662N1("S4P_CREATION_AUDIO_TRIMMER", "s4p/creation/audio-trimmer", 1638, "s4p");
                            break;
                        }
                        break;
                    case 2079564991:
                        if (str.equals("YOURLIBRARY_SEARCH")) {
                            cbm0VarM90638J5 = m90813i6();
                            break;
                        }
                        break;
                    case 2096855519:
                        if (str.equals("CANVAS_NOWPLAYING")) {
                            cbm0VarM90638J5 = m90662N1("CANVAS_NOWPLAYING", "canvas/nowplaying", 263, "canvas");
                            break;
                        }
                        break;
                    case 2123330831:
                        if (str.equals("MAGICLINK_ALREADYAUTHENTICATED")) {
                            cbm0VarM90638J5 = m90663N2();
                            break;
                        }
                        break;
                }
            default:
                cbm0VarM90638J5 = null;
                break;
        }
        if (cbm0VarM90638J5 != null) {
            return cbm0VarM90638J5;
        }
        throw new IllegalArgumentException("No page identifier named ".concat(str));
    }

    /* JADX INFO: renamed from: J */
    public static cbm0 m90632J() {
        return m90662N1("ADS_AD_ON_APP_OPEN", "ads/ad-on-app-open", 19, "ads");
    }

    /* JADX INFO: renamed from: J0 */
    public static cbm0 m90633J0() {
        return m90662N1("CHAT_SHARE", "chat/share", 322, "chat");
    }

    /* JADX INFO: renamed from: J1 */
    public static cbm0 m90634J1() {
        return m90662N1("FAST_TRACK_PAGE_2", "fast-track/page-2", 537, "fast-track");
    }

    /* JADX INFO: renamed from: J2 */
    public static cbm0 m90635J2() {
        return m90662N1("LOGIN_SOMETHINGWENTWRONG", "login/somethingwentwrong", 938, "login");
    }

    /* JADX INFO: renamed from: J3 */
    public static cbm0 m90636J3() {
        return m90662N1("PLAYLIST_ADDTOPLAYLIST", "playlist/addtoplaylist", 1398, "playlist");
    }

    /* JADX INFO: renamed from: J4 */
    public static cbm0 m90637J4() {
        return m90662N1("READALONG_FULLSCREEN", "readalong/fullscreen", 1572, "readalong");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: J5 */
    public static cbm0 m90638J5(String str) {
        switch (str.hashCode()) {
            case -2120814208:
                if (str.equals("AUTHOR_RELEASES")) {
                    return m90662N1("AUTHOR_RELEASES", "author/releases", 206, "author");
                }
                return null;
            case -2103785360:
                if (str.equals("ADS_SPLIT_VIDEO_BROWSER")) {
                    return m90662N1("ADS_SPLIT_VIDEO_BROWSER", "ads/split-video-browser", 26, "ads");
                }
                return null;
            case -2082108064:
                if (str.equals("PODCAST_IMPORT")) {
                    return m90662N1("PODCAST_IMPORT", "podcast/import", 1435, "podcast");
                }
                return null;
            case -2063380384:
                if (str.equals("KID_ACCOUNT_CREATION_NAME")) {
                    return m90662N1("KID_ACCOUNT_CREATION_NAME", "kid-account-creation/name", 856, "kid-account-creation");
                }
                return null;
            case -2012940192:
                if (str.equals("YOURLIBRARY_AUDIOBOOK_PROGRESS_NUDGE")) {
                    return m90662N1("YOURLIBRARY_AUDIOBOOK_PROGRESS_NUDGE", "yourlibrary/audiobook-progress-nudge", 2177, "yourlibrary");
                }
                return null;
            case -2010547760:
                if (str.equals("QUIZ_RECOMMENDATIONS")) {
                    return m90609F4();
                }
                return null;
            case -1975868976:
                if (str.equals("CHAT_INVITE")) {
                    return m90662N1("CHAT_INVITE", "chat/invite", 315, "chat");
                }
                return null;
            case -1964624496:
                if (str.equals("HOMEMIX_ABOUTVIDEO")) {
                    return m90662N1("HOMEMIX_ABOUTVIDEO", "homemix/aboutvideo", 792, "homemix");
                }
                return null;
            case -1960301680:
                if (str.equals("NOWPLAYING_NOWPLAYINGSIDEBAREMPTY")) {
                    return m90817j3();
                }
                return null;
            case -1945036592:
                if (str.equals("WEAR_EXTERNAL_INTENT")) {
                    return m90662N1("WEAR_EXTERNAL_INTENT", "wear/external_intent", 2068, "wear");
                }
                return null;
            case -1932288576:
                if (str.equals("CHILD_LED_SIGNUP_SHARE_PARENTAL_CONSENT")) {
                    return m90662N1("CHILD_LED_SIGNUP_SHARE_PARENTAL_CONSENT", "child-led-signup/share-parental-consent", 333, "child-led-signup");
                }
                return null;
            case -1926908304:
                if (str.equals("PLAYLIST_HISTORY_PREVIEW")) {
                    return m90662N1("PLAYLIST_HISTORY_PREVIEW", "playlist/history-preview", 1412, "playlist");
                }
                return null;
            case -1919228032:
                if (str.equals("SIGNUP_TERMS")) {
                    return m90662N1("SIGNUP_TERMS", "signup/terms", 1838, "signup");
                }
                return null;
            case -1853197568:
                if (str.equals("PUFFIN_CLOUD")) {
                    return m90662N1("PUFFIN_CLOUD", "puffin/cloud", 1540, "puffin");
                }
                return null;
            case -1840794464:
                if (str.equals("SHARE_SHEET_COMPOSER")) {
                    return m90662N1("SHARE_SHEET_COMPOSER", "share-sheet/composer", 1798, "share-sheet");
                }
                return null;
            case -1832934176:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOAD")) {
                    return m90682Q0();
                }
                return null;
            case -1826628160:
                if (str.equals("ADAPTIVEAUTHENTICATION_WEBCHALLENGE")) {
                    return m90662N1("ADAPTIVEAUTHENTICATION_WEBCHALLENGE", "adaptiveauthentication/webchallenge", 12, "adaptiveauthentication");
                }
                return null;
            case -1801631808:
                if (str.equals("RADIO_DAILY_MIXES")) {
                    return m90662N1("RADIO_DAILY_MIXES", "radio/daily-mixes", 1558, "radio");
                }
                return null;
            case -1778864608:
                if (str.equals("SHOWS_FORMAT_SHARE")) {
                    return m90662N1("SHOWS_FORMAT_SHARE", "shows/format/share", 1816, "shows");
                }
                return null;
            case -1776335824:
                if (str.equals("ADSTUDIO_DASHBOARD_CAMPAIGN_DRAFTS")) {
                    return m90662N1("ADSTUDIO_DASHBOARD_CAMPAIGN_DRAFTS", "adstudio/dashboard/campaign-drafts", 80, "adstudio");
                }
                return null;
            case -1774252288:
                if (str.equals("MRKT_ARTIST_LISTENING_PARTY_CREATE")) {
                    return m90662N1("MRKT_ARTIST_LISTENING_PARTY_CREATE", "mrkt/artist/listening-party/create", 1047, "mrkt");
                }
                return null;
            case -1758903120:
                if (str.equals("RADIO_STATION")) {
                    return m90662N1("RADIO_STATION", "radio/station", 1560, "radio");
                }
                return null;
            case -1733143312:
                if (str.equals("SHOWS_AUDIO_SKIP_FINISHED_EPISODES_DIALOG")) {
                    return m90662N1("SHOWS_AUDIO_SKIP_FINISHED_EPISODES_DIALOG", "shows/audio/skip-finished-episodes-dialog", 1811, "shows");
                }
                return null;
            case -1711264128:
                if (str.equals("LISTENINGPARTY_HYPE_ROOM")) {
                    return m90662N1("LISTENINGPARTY_HYPE_ROOM", "listeningparty/hype-room", 896, "listeningparty");
                }
                return null;
            case -1705541600:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_REQUESTEMAIL")) {
                    return m90662N1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAIL", "login/accountrecovery/requestemail", 914, "login");
                }
                return null;
            case -1689855152:
                if (str.equals("ENTITYSEGMENTS_CHAPTERSELECTOR")) {
                    return m90585C1();
                }
                return null;
            case -1628115536:
                if (str.equals("AGE_SIGNAL_SIGNUP_CONFIRM_AGE")) {
                    return m90662N1("AGE_SIGNAL_SIGNUP_CONFIRM_AGE", "age-signal/signup/confirm-age", 134, "age-signal");
                }
                return null;
            case -1572230448:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSKEYS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSKEYS", "www-account-pages/login-methods-v2-passkeys", 2135, "www-account-pages");
                }
                return null;
            case -1480702560:
                if (str.equals("NOWPLAYING_VIDEOSETTINGS_VIDEOQUALITYSELECTION")) {
                    return m90662N1("NOWPLAYING_VIDEOSETTINGS_VIDEOQUALITYSELECTION", "nowplaying/videosettings/videoqualityselection", 1317, "nowplaying");
                }
                return null;
            case -1360550384:
                if (str.equals("GOLDENPATH_WSANTOSBARBOSA")) {
                    return m90662N1("GOLDENPATH_WSANTOSBARBOSA", "goldenpath/wsantosbarbosa", 741, "goldenpath");
                }
                return null;
            case -1341705872:
                if (str.equals("S4P_PODCAST_EPISODE")) {
                    return m90662N1("S4P_PODCAST_EPISODE", "s4p/podcast/episode", 1672, "s4p");
                }
                return null;
            case -1329990896:
                if (str.equals("PROFILE_PRIVACY_SETTINGS")) {
                    return m90912x4();
                }
                return null;
            case -1313005488:
                if (str.equals("RESETPASSWORD_EMAILLANDING")) {
                    return m90662N1("RESETPASSWORD_EMAILLANDING", "resetpassword/emaillanding", 1600, "resetpassword");
                }
                return null;
            case -1261303264:
                if (str.equals("PODCAST_EPISODE_TIMELINE")) {
                    return m90662N1("PODCAST_EPISODE_TIMELINE", "podcast/episode/timeline", 1433, "podcast");
                }
                return null;
            case -1209281984:
                if (str.equals("CHARTS_UNKNOWN")) {
                    return m90662N1("CHARTS_UNKNOWN", "charts/unknown", ContentFeedType.WEST_HD, "charts");
                }
                return null;
            case -1178841392:
                if (str.equals("WATCHAPP_SETTINGS")) {
                    return m90662N1("WATCHAPP_SETTINGS", "watchapp/settings", 2043, "watchapp");
                }
                return null;
            case -1140786336:
                if (str.equals("LOGIN_CONTINUEWITH_EMAIL")) {
                    return m90662N1("LOGIN_CONTINUEWITH_EMAIL", "login/continuewith/email", 920, "login");
                }
                return null;
            case -1138064464:
                if (str.equals("GOLDENPATH_AKOSO")) {
                    return m90662N1("GOLDENPATH_AKOSO", "goldenpath/akoso", 598, "goldenpath");
                }
                return null;
            case -1087139392:
                if (str.equals("S4P_ANALYTICS_NOTIFICATION_CHARTS")) {
                    return m90662N1("S4P_ANALYTICS_NOTIFICATION_CHARTS", "s4p/analytics/notification/charts", 1615, "s4p");
                }
                return null;
            case -1079486592:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_RELEASE")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_RELEASE", "mrkt/artist/video/clips/create/select-release", 1113, "mrkt");
                }
                return null;
            case -991327488:
                if (str.equals("GOLDENPATH_MAHEENK")) {
                    return m90662N1("GOLDENPATH_MAHEENK", "goldenpath/maheenk", 671, "goldenpath");
                }
                return null;
            case -913842176:
                if (str.equals("GOLDENPATH_ARNAVA")) {
                    return m90662N1("GOLDENPATH_ARNAVA", "goldenpath/arnava", ContentDeliverySubscriptionType.SUBSCRIPTION, "goldenpath");
                }
                return null;
            case -893331920:
                if (str.equals("GOLDENPATH_HITSTER")) {
                    return m90662N1("GOLDENPATH_HITSTER", "goldenpath/hitster", 639, "goldenpath");
                }
                return null;
            case -859799968:
                if (str.equals("MRKT_ACTIVITY")) {
                    return m90662N1("MRKT_ACTIVITY", "mrkt/activity", 997, "mrkt");
                }
                return null;
            case -852534560:
                if (str.equals("REINVENTFREE_BACKSKIP_UPSELL")) {
                    return m90658M4();
                }
                return null;
            case -832176640:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_DELETEMANAGEDACCOUNT")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_DELETEMANAGEDACCOUNT", "www-account-pages/parental-settings/deletemanagedaccount", 2143, "www-account-pages");
                }
                return null;
            case -776225872:
                if (str.equals("DIALOG_CONNECT_PLAYBACK_ERROR")) {
                    return m90923z1();
                }
                return null;
            case -764918288:
                if (str.equals("HOMETHING_ACTIVATION_CONNECTED")) {
                    return m90662N1("HOMETHING_ACTIVATION_CONNECTED", "homething/activation/connected", CtaType.CTA_SHARE_FIELD_NUMBER, "homething");
                }
                return null;
            case -724691200:
                if (str.equals("PROFILE_EDIT")) {
                    return m90884t4();
                }
                return null;
            case -705485440:
                if (str.equals("WATCHAPP_ESDK_DEBUG_COUNTERS")) {
                    return m90662N1("WATCHAPP_ESDK_DEBUG_COUNTERS", "watchapp/esdk-debug-counters", 2028, "watchapp");
                }
                return null;
            case -683246960:
                if (str.equals("STATIONSPROMO")) {
                    return m90662N1("STATIONSPROMO", "stationspromo", 1916, "stationspromo");
                }
                return null;
            case -674662800:
                if (str.equals("COLLECTION_PODCASTS")) {
                    return m90662N1("COLLECTION_PODCASTS", "collection/podcasts", 346, "collection");
                }
                return null;
            case -655294704:
                if (str.equals("PARENTAL_CONTROL_MAKE_ALLOWLISTING_REQUEST")) {
                    return m90662N1("PARENTAL_CONTROL_MAKE_ALLOWLISTING_REQUEST", "parental-control/make-allowlisting-request", 1357, "parental-control");
                }
                return null;
            case -636677760:
                if (str.equals("PUFFIN_MANUAL_SELECT")) {
                    return m90662N1("PUFFIN_MANUAL_SELECT", "puffin/manual-select", 1543, "puffin");
                }
                return null;
            case -620849584:
                if (str.equals("WEAR_ACCOUNT_WELCOME")) {
                    return m90662N1("WEAR_ACCOUNT_WELCOME", "wear/account_welcome", 2052, "wear");
                }
                return null;
            case -596154224:
                if (str.equals("SUPERBIRD_SETUP_TESTSOUND")) {
                    return m90662N1("SUPERBIRD_SETUP_TESTSOUND", "superbird/setup/testsound", 1946, "superbird");
                }
                return null;
            case -595080672:
                if (str.equals("MRKT_LEGAL_PRIVACY_POLICY")) {
                    return m90662N1("MRKT_LEGAL_PRIVACY_POLICY", "mrkt/legal/privacy-policy", 1238, "mrkt");
                }
                return null;
            case -591364992:
                if (str.equals("SUPERBIRD_SETUP_MOUNTSELECTION")) {
                    return m90662N1("SUPERBIRD_SETUP_MOUNTSELECTION", "superbird/setup/mountselection", 1942, "superbird");
                }
                return null;
            case -576782960:
                if (str.equals("ABOUTENTITY")) {
                    return m90907x();
                }
                return null;
            case -573323600:
                if (str.equals("GOLDENPATH_MOEING")) {
                    return m90662N1("GOLDENPATH_MOEING", "goldenpath/moeing", 691, "goldenpath");
                }
                return null;
            case -553427360:
                if (str.equals("PERMISSIONS_LOCATION_REQUEST")) {
                    return m90580B3();
                }
                return null;
            case -528749568:
                if (str.equals("WATCHAPP_ALBUM_ENTITY")) {
                    return m90662N1("WATCHAPP_ALBUM_ENTITY", "watchapp/album-entity", 2017, "watchapp");
                }
                return null;
            case -513708544:
                if (str.equals("CHECKOUT_GPB")) {
                    return m90662N1("CHECKOUT_GPB", "checkout/gpb", 328, "checkout");
                }
                return null;
            case -506402832:
                if (str.equals("S4P_INTERACT_COMMENTS_INSIGHTS_DETAILS")) {
                    return m90662N1("S4P_INTERACT_COMMENTS_INSIGHTS_DETAILS", "s4p/interact/comments-insights-details", 1660, "s4p");
                }
                return null;
            case -484731248:
                if (str.equals("HOMEMIX_TASTEONBOARDING")) {
                    return m90662N1("HOMEMIX_TASTEONBOARDING", "homemix/tasteonboarding", 797, "homemix");
                }
                return null;
            case -425898464:
                if (str.equals("GOLDENPATH_MPASOTTI")) {
                    return m90662N1("GOLDENPATH_MPASOTTI", "goldenpath/mpasotti", 694, "goldenpath");
                }
                return null;
            case -417523760:
                if (str.equals("MRKT_VIDEO_WRAPPED")) {
                    return m90662N1("MRKT_VIDEO_WRAPPED", "mrkt/video/wrapped", 1282, "mrkt");
                }
                return null;
            case -410631504:
                if (str.equals("GOLDENPATH_SEJMAK")) {
                    return m90662N1("GOLDENPATH_SEJMAK", "goldenpath/sejmak", 728, "goldenpath");
                }
                return null;
            case -409331968:
                if (str.equals("ADS_SENSITIVE_AD_CATEGORIES")) {
                    return m90662N1("ADS_SENSITIVE_AD_CATEGORIES", "ads/sensitive-ad-categories", 25, "ads");
                }
                return null;
            case -398659792:
                if (str.equals("CAR_MODE_HOME")) {
                    return m90662N1("CAR_MODE_HOME", "car-mode/home", 267, "car-mode");
                }
                return null;
            case -394502304:
                if (str.equals("SUPPORT_SITE_OLD_CONTACT")) {
                    return m90662N1("SUPPORT_SITE_OLD_CONTACT", "support-site/old/contact", 1957, "support-site");
                }
                return null;
            case -379973376:
                if (str.equals("GOLDENPATH_MAREIKEK")) {
                    return m90662N1("GOLDENPATH_MAREIKEK", "goldenpath/mareikek", 675, "goldenpath");
                }
                return null;
            case -375297120:
                if (str.equals("MRKT_ARTIST_MUSIC_PLAYLISTS")) {
                    return m90662N1("MRKT_ARTIST_MUSIC_PLAYLISTS", "mrkt/artist/music/playlists", 1055, "mrkt");
                }
                return null;
            case -372721680:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS", "mrkt/debug/hubs/component-reference/page-headers", 1163, "mrkt");
                }
                return null;
            case -332786176:
                if (str.equals("MRKT_WAITING_ROOM_HOME")) {
                    return m90662N1("MRKT_WAITING_ROOM_HOME", "mrkt/waiting-room/home", 1284, "mrkt");
                }
                return null;
            case -305430112:
                if (str.equals("PODCAST_EPISODE_AUDIOBOOK")) {
                    return m90662N1("PODCAST_EPISODE_AUDIOBOOK", "podcast/episode/audiobook", 1429, "podcast");
                }
                return null;
            case -295274256:
                if (str.equals("GOLDENPATH_DIEGOALFREDOR")) {
                    return m90662N1("GOLDENPATH_DIEGOALFREDOR", "goldenpath/diegoalfredor", 617, "goldenpath");
                }
                return null;
            case -263995872:
                if (str.equals("SIGNUP_BASICUSERINFO")) {
                    return m90662N1("SIGNUP_BASICUSERINFO", "signup/basicuserinfo", 1826, "signup");
                }
                return null;
            case -244944992:
                if (str.equals("WATCHAPP_SIRI_ERROR_ALERT")) {
                    return m90662N1("WATCHAPP_SIRI_ERROR_ALERT", "watchapp/siri-error-alert", 2045, "watchapp");
                }
                return null;
            case -129753872:
                if (str.equals("CONTRIBUTION_NOTES_MANAGEMENT")) {
                    return m90860q1();
                }
                return null;
            case -42064992:
                if (str.equals("MRKT_CANVAS_EDIT")) {
                    return m90662N1("MRKT_CANVAS_EDIT", "mrkt/canvas/edit", 1153, "mrkt");
                }
                return null;
            case -22687664:
                if (str.equals("WWW_ACCOUNT_PAGES_AUTHENTICATIONSETTINGS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_AUTHENTICATIONSETTINGS", "www-account-pages/authenticationsettings", 2110, "www-account-pages");
                }
                return null;
            case -20510512:
                if (str.equals("CHAT_GIF_PICKER")) {
                    return m90584C0();
                }
                return null;
            case 64656:
                if (str.equals("ADS")) {
                    return m90662N1("ADS", "ads", 18, "ads");
                }
                return null;
            case 18658800:
                if (str.equals("EXPERIMENTAL_LISTENINGHISTORY")) {
                    return m90662N1("EXPERIMENTAL_LISTENINGHISTORY", "experimental/listeninghistory", 517, "experimental");
                }
                return null;
            case 34537008:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_DETAILS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_DETAILS", "spotify-for-authors/audiobook/details", 1873, "spotify-for-authors");
                }
                return null;
            case 40103472:
                if (str.equals("WATCHAPP_AUDIOBOOK_ENTITY")) {
                    return m90662N1("WATCHAPP_AUDIOBOOK_ENTITY", "watchapp/audiobook-entity", 2021, "watchapp");
                }
                return null;
            case 47539136:
                if (str.equals("CONTEXTMENU_DJSUBMITFEEDBACK_REPORT_CONCERN")) {
                    return m90662N1("CONTEXTMENU_DJSUBMITFEEDBACK_REPORT_CONCERN", "contextmenu/djsubmitfeedback/report-concern", 414, "contextmenu");
                }
                return null;
            case 78838864:
                if (str.equals("ENTERPRISEPODCASTS")) {
                    return m90662N1("ENTERPRISEPODCASTS", "enterprisepodcasts", CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, "enterprisepodcasts");
                }
                return null;
            case 120896032:
                if (str.equals("GOLDENPATH_NICOLAM")) {
                    return m90662N1("GOLDENPATH_NICOLAM", "goldenpath/nicolam", 704, "goldenpath");
                }
                return null;
            case 141086368:
                if (str.equals("CHAT_MUTE")) {
                    return m90619H0();
                }
                return null;
            case 157534560:
                if (str.equals("INAPPMESSAGE_BOTTOMSHEET")) {
                    return m90823k2();
                }
                return null;
            case 236758064:
                if (str.equals("GOLDENPATH_SHEROZN")) {
                    return m90662N1("GOLDENPATH_SHEROZN", "goldenpath/sherozn", 731, "goldenpath");
                }
                return null;
            case 265520896:
                if (str.equals("GOLDENPATH_JMAKINDA")) {
                    return m90662N1("GOLDENPATH_JMAKINDA", "goldenpath/jmakinda", 650, "goldenpath");
                }
                return null;
            case 389980032:
                if (str.equals("SHARE_MENU_COMPOSER")) {
                    return m90662N1("SHARE_MENU_COMPOSER", "share-menu/composer", 1796, "share-menu");
                }
                return null;
            case 421995568:
                if (str.equals("BLUEJAY_QUESTION_PICKER")) {
                    return m90662N1("BLUEJAY_QUESTION_PICKER", "bluejay/question-picker", 230, "bluejay");
                }
                return null;
            case 431950768:
                if (str.equals("WWW_ACCOUNT_PAGES_RECEIPTS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_RECEIPTS", "www-account-pages/receipts", 2158, "www-account-pages");
                }
                return null;
            case 438694480:
                if (str.equals("MRKT_APP_SETTINGS_PUSH_NOTIFICATIONS")) {
                    return m90662N1("MRKT_APP_SETTINGS_PUSH_NOTIFICATIONS", "mrkt/app-settings/push-notifications", 1000, "mrkt");
                }
                return null;
            case 449979168:
                if (str.equals("KID_ACCOUNT_CREATION_COPPA")) {
                    return m90662N1("KID_ACCOUNT_CREATION_COPPA", "kid-account-creation/coppa", 852, "kid-account-creation");
                }
                return null;
            case 457884976:
                if (str.equals("AGE_ASSURANCE_START")) {
                    return m90662N1("AGE_ASSURANCE_START", "age-assurance/start", 126, "age-assurance");
                }
                return null;
            case 546991680:
                if (str.equals("DIALOG_SHOW_VIDEOUNAVAILABLE")) {
                    return m90662N1("DIALOG_SHOW_VIDEOUNAVAILABLE", "dialog/show/videounavailable", 477, "dialog");
                }
                return null;
            case 548719040:
                if (str.equals("ADSDISPLAY_CTAWIDGETNPV_SEEALL")) {
                    return m90662N1("ADSDISPLAY_CTAWIDGETNPV_SEEALL", "adsdisplay/ctawidgetnpv/seeall", 27, "adsdisplay");
                }
                return null;
            case 558436704:
                if (str.equals("MRKT_PROFILE_PROTECTION")) {
                    return m90662N1("MRKT_PROFILE_PROTECTION", "mrkt/profile-protection", 1250, "mrkt");
                }
                return null;
            case 575513072:
                if (str.equals("NOWPLAYING_QUEUE_PEEK")) {
                    return m90662N1("NOWPLAYING_QUEUE_PEEK", "nowplaying/queue/peek", 1314, "nowplaying");
                }
                return null;
            case 589840592:
                if (str.equals("LISTENINGACTIVITY_ONBOARDING")) {
                    return m90924z2();
                }
                return null;
            case 656303312:
                if (str.equals("QUIZ_GAMEPLAY")) {
                    return m90595D4();
                }
                return null;
            case 664264800:
                if (str.equals("MRKT_ARTIST_EVENTS")) {
                    return m90662N1("MRKT_ARTIST_EVENTS", "mrkt/artist/events", 1043, "mrkt");
                }
                return null;
            case 691172032:
                if (str.equals("SETTINGS_VIDEOQUALITY")) {
                    return m90662N1("SETTINGS_VIDEOQUALITY", "settings/videoquality", 1791, "settings");
                }
                return null;
            case 699396112:
                if (str.equals("PUFFIN_ONBOARDING")) {
                    return m90662N1("PUFFIN_ONBOARDING", "puffin/onboarding", 1545, "puffin");
                }
                return null;
            case 703650688:
                if (str.equals("PODCAST_EPISODE")) {
                    return m90727W3();
                }
                return null;
            case 708675856:
                if (str.equals("S4P_PODCAST_CLIP_BETAMAX_PLAYER")) {
                    return m90662N1("S4P_PODCAST_CLIP_BETAMAX_PLAYER", "s4p/podcast/clip/betamax-player", 1670, "s4p");
                }
                return null;
            case 713810080:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUTHORS_PROFILE")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_AUTHORS_PROFILE", "spotify-for-authors/authors/profile", 1876, "spotify-for-authors");
                }
                return null;
            case 747596832:
                if (str.equals("PREMIUM_SIGNUP")) {
                    return m90850o4();
                }
                return null;
            case 764725504:
                if (str.equals("KID_ACCOUNT_CREATION_PIN")) {
                    return m90662N1("KID_ACCOUNT_CREATION_PIN", "kid-account-creation/pin", 858, "kid-account-creation");
                }
                return null;
            case 776117424:
                if (str.equals("AGE_ASSURANCE_WELCOME")) {
                    return m90662N1("AGE_ASSURANCE_WELCOME", "age-assurance/welcome", 129, "age-assurance");
                }
                return null;
            case 791621664:
                if (str.equals("UBI_SHOWCASE_TEST_ROOT")) {
                    return m90662N1("UBI_SHOWCASE_TEST_ROOT", "ubi/showcase-test-root", 1988, "ubi");
                }
                return null;
            case 833460320:
                if (str.equals("AGE_SIGNAL_SIGNUP_ASK_PARENT")) {
                    return m90662N1("AGE_SIGNAL_SIGNUP_ASK_PARENT", "age-signal/signup/ask-parent", 133, "age-signal");
                }
                return null;
            case 867300672:
                if (str.equals("S4P_WEB_VIEW_HOW_TO_INSERT_AD_BREAKS")) {
                    return m90662N1("S4P_WEB_VIEW_HOW_TO_INSERT_AD_BREAKS", "s4p/web-view/how-to-insert-ad-breaks", 1716, "s4p");
                }
                return null;
            case 884980880:
                if (str.equals("BOOTCAMP_MASHUP")) {
                    return m90662N1("BOOTCAMP_MASHUP", "bootcamp/mashup", 238, "bootcamp");
                }
                return null;
            case 917548864:
                if (str.equals("WATCHAPP_ERROR_LOG")) {
                    return m90662N1("WATCHAPP_ERROR_LOG", "watchapp/error-log", 2027, "watchapp");
                }
                return null;
            case 1050183824:
                if (str.equals("PORTAL_SEARCH_PLATFORMS_AND_TOOLS")) {
                    return m90662N1("PORTAL_SEARCH_PLATFORMS_AND_TOOLS", "portal/search-platforms-and-tools", 1480, "portal");
                }
                return null;
            case 1128244016:
                if (str.equals("S4P_SETUP_SHOW_PLATFORM_SELECTION")) {
                    return m90662N1("S4P_SETUP_SHOW_PLATFORM_SELECTION", "s4p/setup-show/platform-selection", 1702, "s4p");
                }
                return null;
            case 1153594880:
                if (str.equals("CHALLENGE_AUTH_CALLBACK")) {
                    return m90662N1("CHALLENGE_AUTH_CALLBACK", "challenge/auth-callback", 282, "challenge");
                }
                return null;
            case 1241660928:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_REMOVEPLAYED")) {
                    return m90662N1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEPLAYED", "collection/yourepisodes/settings/removeplayed", 363, "collection");
                }
                return null;
            case 1273264128:
                if (str.equals("CHARTS_VIRAL")) {
                    return m90662N1("CHARTS_VIRAL", "charts/viral", ContentFeedType.EAST_SD, "charts");
                }
                return null;
            case 1312098304:
                if (str.equals("S4P_WEB_VIEW_HOW_TO_GROW_AN_AUDIENCE")) {
                    return m90662N1("S4P_WEB_VIEW_HOW_TO_GROW_AN_AUDIENCE", "s4p/web-view/how-to-grow-an-audience", 1715, "s4p");
                }
                return null;
            case 1312439344:
                if (str.equals("MRKT_DM_MANAGED_SERVICE")) {
                    return m90662N1("MRKT_DM_MANAGED_SERVICE", "mrkt/dm-managed-service", 1186, "mrkt");
                }
                return null;
            case 1353952272:
                if (str.equals("MRKT_TEAM_MANAGEMENT_BILLING")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_BILLING", "mrkt/team-management/billing", 1261, "mrkt");
                }
                return null;
            case 1402102816:
                if (str.equals("KID_PARENTAL_BLOCKING_ARTIST")) {
                    return m90662N1("KID_PARENTAL_BLOCKING_ARTIST", "kid-parental-blocking/artist", 876, "kid-parental-blocking");
                }
                return null;
            case 1425762816:
                if (str.equals("JAM_LISTENINGALONGINPUTSHEET")) {
                    return m90662N1("JAM_LISTENINGALONGINPUTSHEET", "jam/listeningalonginputsheet", 842, "jam");
                }
                return null;
            case 1437220656:
                if (str.equals("MRKT_TEAM_LABEL_ARTISTS")) {
                    return m90662N1("MRKT_TEAM_LABEL_ARTISTS", "mrkt/team/label/artists", 1274, "mrkt");
                }
                return null;
            case 1592705856:
                if (str.equals("OFFLINE_SYNC_ERROR")) {
                    return m90662N1("OFFLINE_SYNC_ERROR", "offline-sync/error", 1326, "offline-sync");
                }
                return null;
            case 1594307056:
                if (str.equals("WWW_ACCOUNT_PAGES_CONSUMPTION_TRACKING")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_CONSUMPTION_TRACKING", "www-account-pages/consumption-tracking", 2117, "www-account-pages");
                }
                return null;
            case 1606653136:
                if (str.equals("PLAYLIST_CREATE_EUTERPE")) {
                    return m90664N3();
                }
                return null;
            case 1618956896:
                if (str.equals("RESETPASSWORD_CHANGEPASSWORD")) {
                    return m90662N1("RESETPASSWORD_CHANGEPASSWORD", "resetpassword/changepassword", 1599, "resetpassword");
                }
                return null;
            case 1689484272:
                if (str.equals("FREETIER_TASTEONBOARDING_UPDATETASTE")) {
                    return m90662N1("FREETIER_TASTEONBOARDING_UPDATETASTE", "freetier/tasteonboarding/updatetaste", 573, "freetier");
                }
                return null;
            case 1739470448:
                if (str.equals("SRC_RIGHTSHOLDER_DISPUTES")) {
                    return m90662N1("SRC_RIGHTSHOLDER_DISPUTES", "src/rightsholder/disputes", 1906, "src");
                }
                return null;
            case 1771249920:
                if (str.equals("MRKT_ARTIST_RELEASE_STATS")) {
                    return m90662N1("MRKT_ARTIST_RELEASE_STATS", "mrkt/artist/release/stats", 1097, "mrkt");
                }
                return null;
            case 1823154912:
                if (str.equals("MRKT_ARTIST_AUDIENCE_COUNTRIES")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_COUNTRIES", "mrkt/artist/audience/countries", 1007, "mrkt");
                }
                return null;
            case 1836387664:
                if (str.equals("CHAT_ADD_FRIENDS")) {
                    return m90901w0();
                }
                return null;
            case 1837080592:
                if (str.equals("MRKT_ARTIST_PROFILE_ABOUT")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_ABOUT", "mrkt/artist/profile/about", 1073, "mrkt");
                }
                return null;
            case 1898983520:
                if (str.equals("COLLECTION_PLAYLISTS")) {
                    return m90662N1("COLLECTION_PLAYLISTS", "collection/playlists", 345, "collection");
                }
                return null;
            case 1909422064:
                if (str.equals("GIFT_SHARE")) {
                    return m90662N1("GIFT_SHARE", "gift-share", 588, "gift-share");
                }
                return null;
            case 1915870784:
                if (str.equals("WWW_ACCOUNT_PAGES_SIGNEDOUT_CANCEL_SUBSCRIPTION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_SIGNEDOUT_CANCEL_SUBSCRIPTION", "www-account-pages/signedout-cancel-subscription", 2163, "www-account-pages");
                }
                return null;
            case 1915887888:
                if (str.equals("CHILD_LED_SIGNUP_REQUEST_PARENTAL_CONSENT")) {
                    return m90662N1("CHILD_LED_SIGNUP_REQUEST_PARENTAL_CONSENT", "child-led-signup/request-parental-consent", 332, "child-led-signup");
                }
                return null;
            case 1918319264:
                if (str.equals("MRKT_FRONTDOOR_CAMPAIGN_KIT")) {
                    return m90662N1("MRKT_FRONTDOOR_CAMPAIGN_KIT", "mrkt/frontdoor/campaign-kit", 1197, "mrkt");
                }
                return null;
            case 2053390560:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_DETAILS", "mrkt/artist/video/music-videos/details", 1119, "mrkt");
                }
                return null;
            case 2121208784:
                if (str.equals("KID_ACCOUNT_CREATION_AGE_VERIFICATION")) {
                    return m90882t2();
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: K */
    public static cbm0 m90639K() {
        return m90662N1("ADS_FEEDBACK", "ads/feedback", 21, "ads");
    }

    /* JADX INFO: renamed from: K0 */
    public static cbm0 m90640K0() {
        return m90662N1("CHECKOUT_COUNTRYPICKER", "checkout/countrypicker", 327, "checkout");
    }

    /* JADX INFO: renamed from: K1 */
    public static cbm0 m90641K1() {
        return m90662N1("FAST_TRACK_PAGE_3", "fast-track/page-3", 538, "fast-track");
    }

    /* JADX INFO: renamed from: K2 */
    public static cbm0 m90642K2() {
        return m90662N1("LOGIN_WRONGEMAILORPASSWORD", "login/wrongemailorpassword", 940, "login");
    }

    /* JADX INFO: renamed from: K3 */
    public static cbm0 m90643K3() {
        return m90662N1("PLAYLIST_ALLSONGS", "playlist/allsongs", 1400, "playlist");
    }

    /* JADX INFO: renamed from: K4 */
    public static cbm0 m90644K4() {
        return m90662N1("RECENTS", "recents", 1576, "recents");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: K5 */
    public static cbm0 m90645K5(String str) {
        switch (str.hashCode()) {
            case -2139850287:
                if (str.equals("MRKT_FRONTDOOR_GET_READY_FOR_WRAPPED")) {
                    return m90662N1("MRKT_FRONTDOOR_GET_READY_FOR_WRAPPED", "mrkt/frontdoor/get-ready-for-wrapped", 1212, "mrkt");
                }
                return null;
            case -2124290175:
                if (str.equals("MRKT_EXPRESSION_VIDEO_YOUR_ARTIST_MESSAGE")) {
                    return m90662N1("MRKT_EXPRESSION_VIDEO_YOUR_ARTIST_MESSAGE", "mrkt/expression-video/your-artist-message", 1192, "mrkt");
                }
                return null;
            case -2109967311:
                if (str.equals("MRKT_VIDEO_CREATE")) {
                    return m90662N1("MRKT_VIDEO_CREATE", "mrkt/video/create", 1279, "mrkt");
                }
                return null;
            case -2080380207:
                if (str.equals("CHALLENGE_TRANSITION")) {
                    return m90662N1("CHALLENGE_TRANSITION", "challenge/transition", 293, "challenge");
                }
                return null;
            case -2053631551:
                if (str.equals("LANGUAGEPICKER_NOSKIPDIALOG")) {
                    return m90910x2();
                }
                return null;
            case -2036674511:
                if (str.equals("MRKT_ARTIST_SONG_COUNTRIES")) {
                    return m90662N1("MRKT_ARTIST_SONG_COUNTRIES", "mrkt/artist/song/countries", AdvertisementDeliveryType.LOCAL, "mrkt");
                }
                return null;
            case -2036164751:
                if (str.equals("CARS_MEDIASERVICE")) {
                    return m90662N1("CARS_MEDIASERVICE", "cars/mediaservice", 276, "cars");
                }
                return null;
            case -2001759119:
                if (str.equals("S4P_ANALYTICSWIDGET_CONFIGURATION")) {
                    return m90662N1("S4P_ANALYTICSWIDGET_CONFIGURATION", "s4p/analyticswidget-configuration", 1617, "s4p");
                }
                return null;
            case -1989559455:
                if (str.equals("LOGIN_DIALOG_FACEBOOKERROR")) {
                    return m90662N1("LOGIN_DIALOG_FACEBOOKERROR", "login/dialog/facebookerror", 921, "login");
                }
                return null;
            case -1932690975:
                if (str.equals("PAGE_MATCH_INBOUND_SCANNING")) {
                    return m90662N1("PAGE_MATCH_INBOUND_SCANNING", "page-match/inbound-scanning", 1342, "page-match");
                }
                return null;
            case -1924753935:
                if (str.equals("SETTINGS_ACCOUNT")) {
                    return m90770c5();
                }
                return null;
            case -1878425535:
                if (str.equals("FREE_TIER_TRACK")) {
                    return m90655M1();
                }
                return null;
            case -1866339423:
                if (str.equals("MRKT_ARTIST_AUDIENCE_SEGMENTS_NO_ARTIST_REDIRECT")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_SEGMENTS_NO_ARTIST_REDIRECT", "mrkt/artist/audience/segments/no-artist-redirect", ContentMediaFormat.PARTIAL_CONTENT_PODCAST, "mrkt");
                }
                return null;
            case -1846178591:
                if (str.equals("PLAYLIST_ADDTOPLAYLIST")) {
                    return m90636J3();
                }
                return null;
            case -1790183983:
                if (str.equals("BLUEJAY_ERROR_SHEET")) {
                    return m90662N1("BLUEJAY_ERROR_SHEET", "bluejay/error-sheet", 227, "bluejay");
                }
                return null;
            case -1776611247:
                if (str.equals("FACEBOOK_CONNECT")) {
                    return m90662N1("FACEBOOK_CONNECT", "facebook/connect", 526, "facebook");
                }
                return null;
            case -1763403007:
                if (str.equals("STUDIO_LANGUAGE_SETTINGS")) {
                    return m90662N1("STUDIO_LANGUAGE_SETTINGS", "studio/language-settings", 1921, "studio");
                }
                return null;
            case -1710227775:
                if (str.equals("PODCAST_LOADING")) {
                    return m90662N1("PODCAST_LOADING", "podcast/loading", 1436, "podcast");
                }
                return null;
            case -1698561183:
                if (str.equals("GOLDENPATH_YOGA")) {
                    return m90662N1("GOLDENPATH_YOGA", "goldenpath/yoga", 743, "goldenpath");
                }
                return null;
            case -1624548543:
                if (str.equals("SETTINGS_IMPORT")) {
                    return m90662N1("SETTINGS_IMPORT", "settings/import", 1763, "settings");
                }
                return null;
            case -1615448831:
                if (str.equals("RATINGS_AND_REVIEWS_RATINGS_AUDIOBOOK")) {
                    return m90662N1("RATINGS_AND_REVIEWS_RATINGS_AUDIOBOOK", "ratings-and-reviews/ratings/audiobook", 1568, "ratings-and-reviews");
                }
                return null;
            case -1568930943:
                if (str.equals("HOME_PODCASTS_FOLLOWING")) {
                    return m90767c2();
                }
                return null;
            case -1524127359:
                if (str.equals("BLUEJAY_LOCATION_PICKER")) {
                    return m90662N1("BLUEJAY_LOCATION_PICKER", "bluejay/location-picker", 228, "bluejay");
                }
                return null;
            case -1515666815:
                if (str.equals("GOLDENPATH_CAMPBANDITS")) {
                    return m90662N1("GOLDENPATH_CAMPBANDITS", "goldenpath/campbandits", 608, "goldenpath");
                }
                return null;
            case -1508897567:
                if (str.equals("S4P_SETUP_SHOW_TABLE_OF_CONTENTS")) {
                    return m90662N1("S4P_SETUP_SHOW_TABLE_OF_CONTENTS", "s4p/setup-show/table-of-contents", 1704, "s4p");
                }
                return null;
            case -1503717071:
                if (str.equals("BOOTCAMP_TOPTRACKS")) {
                    return m90662N1("BOOTCAMP_TOPTRACKS", "bootcamp/toptracks", 243, "bootcamp");
                }
                return null;
            case -1502698735:
                if (str.equals("WEAR_YOUR_LIBRARY_YOUR_LIBRARY_DETAIL")) {
                    return m90662N1("WEAR_YOUR_LIBRARY_YOUR_LIBRARY_DETAIL", "wear/your_library/your_library_detail", 2096, "wear");
                }
                return null;
            case -1427972591:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_ERRORS")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_UPLOAD_ERRORS", "mrkt/bulk-campaigns/upload/errors", 1149, "mrkt");
                }
                return null;
            case -1377382239:
                if (str.equals("SEARCH_PROFILES")) {
                    return m90662N1("SEARCH_PROFILES", "search/profiles", 1740, "search");
                }
                return null;
            case -1369918559:
                if (str.equals("MRKT_ARTIST_NOTIFICATIONS")) {
                    return m90662N1("MRKT_ARTIST_NOTIFICATIONS", "mrkt/artist/notifications", 1065, "mrkt");
                }
                return null;
            case -1307129327:
                if (str.equals("SUPERBIRD_SETUP_MOUNTINSTRUCTIONS")) {
                    return m90662N1("SUPERBIRD_SETUP_MOUNTINSTRUCTIONS", "superbird/setup/mountinstructions", 1941, "superbird");
                }
                return null;
            case -1278134767:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_EMAIL")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_EMAIL", "www-account-pages/login-methods-v2-email", 2134, "www-account-pages");
                }
                return null;
            case -1252827039:
                if (str.equals("ADSTUDIO_REPORT_CREATE")) {
                    return m90662N1("ADSTUDIO_REPORT_CREATE", "adstudio/report/create", Error.INVALID_COUNTRY_FIELD_NUMBER, "adstudio");
                }
                return null;
            case -1227559535:
                if (str.equals("SHARE_MISSINGUSER")) {
                    return m90662N1("SHARE_MISSINGUSER", "share/missinguser", 1805, "share");
                }
                return null;
            case -1129676863:
                if (str.equals("GOLDENPATH_JNASH")) {
                    return m90662N1("GOLDENPATH_JNASH", "goldenpath/jnash", 652, "goldenpath");
                }
                return null;
            case -1129643039:
                if (str.equals("GOLDENPATH_JOEYK")) {
                    return m90662N1("GOLDENPATH_JOEYK", "goldenpath/joeyk", 654, "goldenpath");
                }
                return null;
            case -1018323535:
                if (str.equals("PODCAST_CREATOR")) {
                    return m90662N1("PODCAST_CREATOR", "podcast/creator", 1426, "podcast");
                }
                return null;
            case -998412015:
                if (str.equals("COURSE_UPSELL")) {
                    return m90662N1("COURSE_UPSELL", "course/upsell", 447, "course");
                }
                return null;
            case -941625279:
                if (str.equals("OURSONG_SHARE")) {
                    return m90662N1("OURSONG_SHARE", "oursong/share", 1337, "oursong");
                }
                return null;
            case -907458399:
                if (str.equals("HOME_PODCASTS_FOLLOW")) {
                    return m90662N1("HOME_PODCASTS_FOLLOW", "home/podcasts-follow", 784, "home");
                }
                return null;
            case -884181151:
                if (str.equals("HOMEMIX_USERTOGGLE")) {
                    return m90662N1("HOMEMIX_USERTOGGLE", "homemix/usertoggle", 798, "homemix");
                }
                return null;
            case -872410671:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGE_GALLERY")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_IMAGE_GALLERY", "mrkt/artist/profile/image-gallery", 1088, "mrkt");
                }
                return null;
            case -807078927:
                if (str.equals("CHECKOUT_CODEREDEMPTION")) {
                    return m90662N1("CHECKOUT_CODEREDEMPTION", "checkout/coderedemption", 326, "checkout");
                }
                return null;
            case -801785135:
                if (str.equals("GOLDENPATH_EMITSUISHI")) {
                    return m90662N1("GOLDENPATH_EMITSUISHI", "goldenpath/emitsuishi", 625, "goldenpath");
                }
                return null;
            case -791687743:
                if (str.equals("WEAR_NOW_PLAYING_VIEW_DEFAULT")) {
                    return m90662N1("WEAR_NOW_PLAYING_VIEW_DEFAULT", "wear/now_playing_view_default", 2072, "wear");
                }
                return null;
            case -778906799:
                if (str.equals("FULLSCREEN_STORY")) {
                    return m90662N1("FULLSCREEN_STORY", "fullscreen-story", 583, "fullscreen-story");
                }
                return null;
            case -761024351:
                if (str.equals("CHECKOUT_SPOTIFY")) {
                    return m90662N1("CHECKOUT_SPOTIFY", "checkout/spotify", 329, "checkout");
                }
                return null;
            case -661166847:
                if (str.equals("GOLDENPATH_JMATIC")) {
                    return m90662N1("GOLDENPATH_JMATIC", "goldenpath/jmatic", 651, "goldenpath");
                }
                return null;
            case -650767839:
                if (str.equals("LOGIN_PHONENUMBER")) {
                    return m90662N1("LOGIN_PHONENUMBER", "login/phonenumber", 934, "login");
                }
                return null;
            case -650578511:
                if (str.equals("FRIENDSHOME_FINDFRIENDS")) {
                    return m90662N1("FRIENDSHOME_FINDFRIENDS", "friendshome/findfriends", 580, "friendshome");
                }
                return null;
            case -621378047:
                if (str.equals("S4P_ANALYTICS_IMPRESSIONS")) {
                    return m90662N1("S4P_ANALYTICS_IMPRESSIONS", "s4p/analytics/impressions", 1611, "s4p");
                }
                return null;
            case -602431983:
                if (str.equals("FREE_TIER_LIKES_SONGS")) {
                    return m90662N1("FREE_TIER_LIKES_SONGS", "free-tier-likes/songs", 556, "free-tier-likes");
                }
                return null;
            case -518490527:
                if (str.equals("HOMEMIX_GENRESPAGE")) {
                    return m90662N1("HOMEMIX_GENRESPAGE", "homemix/genrespage", 796, "homemix");
                }
                return null;
            case -493364191:
                if (str.equals("STUDIO_CHAT")) {
                    return m90662N1("STUDIO_CHAT", "studio/chat", 1920, "studio");
                }
                return null;
            case -487837807:
                if (str.equals("JAM_MANAGEPARTICIPANTSSHEET")) {
                    return m90662N1("JAM_MANAGEPARTICIPANTSSHEET", "jam/manageparticipantssheet", 843, "jam");
                }
                return null;
            case -444237887:
                if (str.equals("PROFILE_RECENTLY_PLAYED_ARTISTS")) {
                    return m90662N1("PROFILE_RECENTLY_PLAYED_ARTISTS", "profile/recently-played-artists", 1534, "profile");
                }
                return null;
            case -406338639:
                if (str.equals("BLEND_ENTITY")) {
                    return m90814j0();
                }
                return null;
            case -394825199:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS")) {
                    return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS", "premium-account-management/regular-member-sub-account-details", 1493, "premium-account-management");
                }
                return null;
            case -312419887:
                if (str.equals("REFRESHEDPROFILE_FOLLOW_SUGGESTIONS")) {
                    return m90662N1("REFRESHEDPROFILE_FOLLOW_SUGGESTIONS", "refreshedprofile/follow-suggestions", 1579, "refreshedprofile");
                }
                return null;
            case -206765439:
                if (str.equals("QUICKPLAY")) {
                    return m90662N1("QUICKPLAY", "quickplay", 1550, "quickplay");
                }
                return null;
            case -200523727:
                if (str.equals("WEAR_QUEUE")) {
                    return m90662N1("WEAR_QUEUE", "wear/queue", 2074, "wear");
                }
                return null;
            case -196324431:
                if (str.equals("AD_STANDALONE_MOBILE_OVERLAY")) {
                    return m90662N1("AD_STANDALONE_MOBILE_OVERLAY", "ad-standalone-mobile-overlay", 9, "ad-standalone-mobile-overlay");
                }
                return null;
            case -195845983:
                if (str.equals("REINVENTFREE_TIME_CAP_PIVOT_MUSIC_VIDEO_UPSELL")) {
                    return m90700S4();
                }
                return null;
            case -126777839:
                if (str.equals("MANAGED_ACCOUNT_LINKING_INVITE_OPTIONS")) {
                    return m90662N1("MANAGED_ACCOUNT_LINKING_INVITE_OPTIONS", "managed-account-linking/invite-options", 974, "managed-account-linking");
                }
                return null;
            case -125505583:
                if (str.equals("OAUTH_PAIR_ENTER_CODE")) {
                    return m90662N1("OAUTH_PAIR_ENTER_CODE", "oauth/pair/enter-code", 1322, "oauth");
                }
                return null;
            case -115812543:
                if (str.equals("INAPPUSERFEEDBACK_BOTTOMSHEET")) {
                    return m90861q2();
                }
                return null;
            case -8184271:
                if (str.equals("MRKT_TEAM_ACCESS_ARTIST")) {
                    return m90662N1("MRKT_TEAM_ACCESS_ARTIST", "mrkt/team/access/artist", 1270, "mrkt");
                }
                return null;
            case 37523121:
                if (str.equals("PROFILE_MESSAGE_SHEET")) {
                    return m90662N1("PROFILE_MESSAGE_SHEET", "profile-message-sheet", 1516, "profile-message-sheet");
                }
                return null;
            case 43060561:
                if (str.equals("FULLSCREEN_STORY_SHARE")) {
                    return m90662N1("FULLSCREEN_STORY_SHARE", "fullscreen-story-share", 584, "fullscreen-story-share");
                }
                return null;
            case 79114129:
                if (str.equals("SPOTS")) {
                    return m90662N1("SPOTS", "spots", 1903, "spots");
                }
                return null;
            case 103407969:
                if (str.equals("FREE_TIER_ARTIST_SUBPAGE")) {
                    return m90662N1("FREE_TIER_ARTIST_SUBPAGE", "free-tier-artist/subpage", 550, "free-tier-artist");
                }
                return null;
            case 236259537:
                if (str.equals("MRKT_ARTIST_AUDIENCE_DEMOGRAPHIC")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_DEMOGRAPHIC", "mrkt/artist/audience/demographic", 1008, "mrkt");
                }
                return null;
            case 344812097:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_SPOTIFY_PLAYLISTS")) {
                    return m90662N1("MRKT_FRONTDOOR_FAN_STUDY_SPOTIFY_PLAYLISTS", "mrkt/frontdoor/fan-study/spotify-playlists", 1210, "mrkt");
                }
                return null;
            case 346401521:
                if (str.equals("DIALOG_DISKALMOSTFULL")) {
                    return m90662N1("DIALOG_DISKALMOSTFULL", "dialog/diskalmostfull", 467, "dialog");
                }
                return null;
            case 349350257:
                if (str.equals("YOURLIBRARY_PROONBOARDING")) {
                    return m90662N1("YOURLIBRARY_PROONBOARDING", "yourlibrary/proonboarding", 2186, "yourlibrary");
                }
                return null;
            case 362958769:
                if (str.equals("MRKT_FRONTDOOR_CANVAS")) {
                    return m90662N1("MRKT_FRONTDOOR_CANVAS", "mrkt/frontdoor/canvas", 1198, "mrkt");
                }
                return null;
            case 559358033:
                if (str.equals("WWW_ACCOUNT_PAGES_YOURPLAN")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_YOURPLAN", "www-account-pages/yourplan", 2166, "www-account-pages");
                }
                return null;
            case 622424913:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_LOGINOPTIONS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_LOGINOPTIONS", "www-account-pages/genalpha/loginoptions", 2126, "www-account-pages");
                }
                return null;
            case 641180561:
                if (str.equals("TRAVEL_WITH_MUSIC")) {
                    return m90662N1("TRAVEL_WITH_MUSIC", "travel-with-music", 1976, "travel-with-music");
                }
                return null;
            case 716703441:
                if (str.equals("LOGIN_PASSWORD")) {
                    return m90662N1("LOGIN_PASSWORD", "login/password", 933, "login");
                }
                return null;
            case 720836481:
                if (str.equals("PARENTAL_CONTROL_MY_ALLOWLISTING_REQUESTS")) {
                    return m90911x3();
                }
                return null;
            case 729851553:
                if (str.equals("TRACK_CREDITS_CREDITS")) {
                    return m90589C5();
                }
                return null;
            case 812365985:
                if (str.equals("SETTINGS_DEVICES")) {
                    return m90662N1("SETTINGS_DEVICES", "settings/devices", 1758, "settings");
                }
                return null;
            case 901896257:
                if (str.equals("PORTAL_DATA_HOME")) {
                    return m90662N1("PORTAL_DATA_HOME", "portal/data-home", 1470, "portal");
                }
                return null;
            case 913986993:
                if (str.equals("MRKT_FRONTDOOR_VIDEOS")) {
                    return m90662N1("MRKT_FRONTDOOR_VIDEOS", "mrkt/frontdoor/videos", 1231, "mrkt");
                }
                return null;
            case 927656145:
                if (str.equals("FORCEUPGRADE")) {
                    return m90662N1("FORCEUPGRADE", "forceupgrade", 544, "forceupgrade");
                }
                return null;
            case 947875217:
                if (str.equals("SUPPORT_SITE_INTELLIGENT_HELP")) {
                    return m90662N1("SUPPORT_SITE_INTELLIGENT_HELP", "support-site/intelligent-help", 1954, "support-site");
                }
                return null;
            case 973013217:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_OVERVIEW")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_OVERVIEW", "mrkt/artist/campaigns/marquee-and-showcase/update/flights/overview", 1038, "mrkt");
                }
                return null;
            case 981687761:
                if (str.equals("MRKT_WELCOME")) {
                    return m90662N1("MRKT_WELCOME", "mrkt/welcome", 1288, "mrkt");
                }
                return null;
            case 1042548801:
                if (str.equals("S4P_SETTINGS_PERSONAL_INFO")) {
                    return m90662N1("S4P_SETTINGS_PERSONAL_INFO", "s4p/settings/personal-info", 1689, "s4p");
                }
                return null;
            case 1045155329:
                if (str.equals("WEAR_SECONDARY_CONTROLS")) {
                    return m90662N1("WEAR_SECONDARY_CONTROLS", "wear/secondary_controls", 2078, "wear");
                }
                return null;
            case 1072769841:
                if (str.equals("ADAPTIVEAUTHENTICATION_START")) {
                    return m90590D();
                }
                return null;
            case 1089677329:
                if (str.equals("ADSTUDIO_USER_SETTINGS")) {
                    return m90662N1("ADSTUDIO_USER_SETTINGS", "adstudio/user-settings", 116, "adstudio");
                }
                return null;
            case 1093609505:
                if (str.equals("ASSISTED_CURATION_SEARCH_SHOW_ENTITY")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_SHOW_ENTITY", "assisted-curation/search/show-entity", 186, "assisted-curation");
                }
                return null;
            case 1167101937:
                if (str.equals("S4P_SUBMITTED_SHOW")) {
                    return m90662N1("S4P_SUBMITTED_SHOW", "s4p/submitted-show", 1711, "s4p");
                }
                return null;
            case 1170727617:
                if (str.equals("S4P_POLL_DETAIL")) {
                    return m90662N1("S4P_POLL_DETAIL", "s4p/poll-detail", 1682, "s4p");
                }
                return null;
            case 1262264497:
                if (str.equals("SIGNUP_SIGNUPUNAVAILABLE")) {
                    return m90878s5();
                }
                return null;
            case 1270963473:
                if (str.equals("WEAR_SETTINGS_ABOUT")) {
                    return m90662N1("WEAR_SETTINGS_ABOUT", "wear/settings/about", 2081, "wear");
                }
                return null;
            case 1294422881:
                if (str.equals("ADSTUDIO_WRAPPED_2025")) {
                    return m90662N1("ADSTUDIO_WRAPPED_2025", "adstudio/wrapped/2025", 117, "adstudio");
                }
                return null;
            case 1346720641:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD_SET")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD_SET", "adstudio/add-to-existing-campaign/ad-set", 45, "adstudio");
                }
                return null;
            case 1354968817:
                if (str.equals("FREE_TIER_ARTIST")) {
                    return m90662N1("FREE_TIER_ARTIST", "free-tier-artist", 549, "free-tier-artist");
                }
                return null;
            case 1366343681:
                if (str.equals("OAUTH_AUTHORIZE")) {
                    return m90662N1("OAUTH_AUTHORIZE", "oauth/authorize", 1319, "oauth");
                }
                return null;
            case 1371312865:
                if (str.equals("HIFI_REMOTE_SHEET")) {
                    return m90662N1("HIFI_REMOTE_SHEET", "hifi/remote-sheet", 770, "hifi");
                }
                return null;
            case 1419840337:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_REVIEW")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_REVIEW", "mrkt/artist/campaigns/marquee-and-showcase/create/review", 1030, "mrkt");
                }
                return null;
            case 1463899217:
                if (str.equals("SETTINGS_ABOUT")) {
                    return m90662N1("SETTINGS_ABOUT", "settings/about", 1746, "settings");
                }
                return null;
            case 1479060017:
                if (str.equals("CUSTOM_REACTIONS_PICKER")) {
                    return m90902w1();
                }
                return null;
            case 1497699425:
                if (str.equals("KID_ACCOUNT_SELECTION")) {
                    return m90662N1("KID_ACCOUNT_SELECTION", "kid-account-selection", 862, "kid-account-selection");
                }
                return null;
            case 1536119217:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIENCE_AFFINITY")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_AUDIENCE_AFFINITY", "spotify-for-authors/audience/affinity", 1870, "spotify-for-authors");
                }
                return null;
            case 1558148241:
                if (str.equals("SEARCH_AUTHORS")) {
                    return m90662N1("SEARCH_AUTHORS", "search/authors", 1728, "search");
                }
                return null;
            case 1656403185:
                if (str.equals("PLAYLISTS_EDIT_PRIVACY")) {
                    return m90713U3();
                }
                return null;
            case 1774265377:
                if (str.equals("RATINGS_AND_REVIEWS_RATINGS")) {
                    return m90662N1("RATINGS_AND_REVIEWS_RATINGS", "ratings-and-reviews/ratings", 1567, "ratings-and-reviews");
                }
                return null;
            case 1826168049:
                if (str.equals("MRKT_FRONTDOOR_UNKNOWN")) {
                    return m90662N1("MRKT_FRONTDOOR_UNKNOWN", "mrkt/frontdoor/unknown", 1229, "mrkt");
                }
                return null;
            case 1835728753:
                if (str.equals("S4P_ANALYTICSWIDGET_PIN_FALLBACK")) {
                    return m90662N1("S4P_ANALYTICSWIDGET_PIN_FALLBACK", "s4p/analyticswidget-pin-fallback", 1618, "s4p");
                }
                return null;
            case 1896127153:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_EDIT")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CLIPS_EDIT", "mrkt/artist/video/clips/edit", 1116, "mrkt");
                }
                return null;
            case 1936639857:
                if (str.equals("PORTAL_AIKA")) {
                    return m90662N1("PORTAL_AIKA", "portal/aika", 1468, "portal");
                }
                return null;
            case 1939347409:
                if (str.equals("ALLBOARDING_PLACEHOLDER")) {
                    return m90662N1("ALLBOARDING_PLACEHOLDER", "allboarding/placeholder", 147, kc3.f121351b);
                }
                return null;
            case 1967452689:
                if (str.equals("APPRATER")) {
                    return m90662N1("APPRATER", "apprater", 152, "apprater");
                }
                return null;
            case 1969703697:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_REVIEW")) {
                    return m90662N1("MRKT_BTC_BOOKING_UPLOAD_REVIEW", "mrkt/btc/booking/upload/review", 1141, "mrkt");
                }
                return null;
            case 2002672097:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_DRAFTS")) {
                    return m90662N1("MRKT_DM_MANAGED_SERVICE_DRAFTS", "mrkt/dm-managed-service/drafts", 1187, "mrkt");
                }
                return null;
            case 2055142897:
                if (str.equals("ADSTUDIO_BUSINESS_SIGNUP")) {
                    return m90662N1("ADSTUDIO_BUSINESS_SIGNUP", "adstudio/business/signup", 60, "adstudio");
                }
                return null;
            case 2057341073:
                if (str.equals("HOMETHING_ACTIVATION_CONNECTING")) {
                    return m90662N1("HOMETHING_ACTIVATION_CONNECTING", "homething/activation/connecting", ContentDeliveryAdvertisementCapability.NONE, "homething");
                }
                return null;
            case 2076544545:
                if (str.equals("CONCERTS_MULTIEVENTBOTTOMSHEET")) {
                    return m90752a1();
                }
                return null;
            case 2089582673:
                if (str.equals("YOURSPOTIFY_PROFILE")) {
                    return m90662N1("YOURSPOTIFY_PROFILE", "yourspotify/profile", 2194, "yourspotify");
                }
                return null;
            case 2116024305:
                if (str.equals("FREE_TIER_ALL_SONGS_DIALOG")) {
                    return m90662N1("FREE_TIER_ALL_SONGS_DIALOG", "free-tier-all-songs-dialog", 548, "free-tier-all-songs-dialog");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static cbm0 m90646L() {
        return m90662N1("AGE_ASSURANCE", "age-assurance", 119, "age-assurance");
    }

    /* JADX INFO: renamed from: L0 */
    public static cbm0 m90647L0() {
        return m90662N1("CHILDACCOUNTCLOSURE", "childaccountclosure", 334, "childaccountclosure");
    }

    /* JADX INFO: renamed from: L1 */
    public static cbm0 m90648L1() {
        return m90662N1("FILTERANDSORT", "filterandsort", 539, "filterandsort");
    }

    /* JADX INFO: renamed from: L2 */
    public static cbm0 m90649L2() {
        return m90662N1("LYRICS_FULLSCREEN", "lyrics/fullscreen", 942, "lyrics");
    }

    /* JADX INFO: renamed from: L3 */
    public static cbm0 m90650L3() {
        return m90662N1("PLAYLIST_COVER_ART_SNAKE", "playlist/cover-art-snake", 1401, "playlist");
    }

    /* JADX INFO: renamed from: L4 */
    public static cbm0 m90651L4() {
        return m90662N1("REFLECTION", "reflection", 1578, "reflection");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: L5 */
    public static cbm0 m90652L5(String str) {
        switch (str.hashCode()) {
            case -2128839382:
                if (str.equals("GOLDENPATH_MIRELLYSD")) {
                    return m90662N1("GOLDENPATH_MIRELLYSD", "goldenpath/mirellysd", 687, "goldenpath");
                }
                return null;
            case -2083146022:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOW")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOW", "www-account-pages/genalpha/childaccountcreationflow", 2124, "www-account-pages");
                }
                return null;
            case -2077452966:
                if (str.equals("SUPPORT_SITE_OLD_CHILDCATEGORY")) {
                    return m90662N1("SUPPORT_SITE_OLD_CHILDCATEGORY", "support-site/old/childcategory", 1956, "support-site");
                }
                return null;
            case -2061101958:
                if (str.equals("ADSTUDIO_REPORT")) {
                    return m90662N1("ADSTUDIO_REPORT", "adstudio/report", 105, "adstudio");
                }
                return null;
            case -2046057942:
                if (str.equals("GOLDENPATH_VALERIOM")) {
                    return m90662N1("GOLDENPATH_VALERIOM", "goldenpath/valeriom", 738, "goldenpath");
                }
                return null;
            case -2035850422:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_SUCCESS")) {
                    return m90662N1("MRKT_BTC_BOOKING_UPLOAD_SUCCESS", "mrkt/btc/booking/upload/success", 1143, "mrkt");
                }
                return null;
            case -2015328310:
                if (str.equals("ADSTUDIO_AD_REPORT")) {
                    return m90662N1("ADSTUDIO_AD_REPORT", "adstudio/ad/report", 38, "adstudio");
                }
                return null;
            case -1975246614:
                if (str.equals("ALLBOARDING_HOST")) {
                    return m90709U();
                }
                return null;
            case -1974928694:
                if (str.equals("ALLBOARDING_SEND")) {
                    return m90662N1("ALLBOARDING_SEND", "allboarding/send", 149, kc3.f121351b);
                }
                return null;
            case -1937648022:
                if (str.equals("SIGNUP_PARENTALCONSENTEDUCATION")) {
                    return m90662N1("SIGNUP_PARENTALCONSENTEDUCATION", "signup/parentalconsenteducation", 1834, "signup");
                }
                return null;
            case -1931603382:
                if (str.equals("YOURLIBRARY_PLAYLISTS")) {
                    return m90662N1("YOURLIBRARY_PLAYLISTS", "yourlibrary/playlists", 2185, "yourlibrary");
                }
                return null;
            case -1899746598:
                if (str.equals("KID_ACCOUNT_TRANSITION_AGE_VERIFICATION")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_AGE_VERIFICATION", "kid-account-transition/age-verification", 863, "kid-account-transition");
                }
                return null;
            case -1890215254:
                if (str.equals("S4P_SETUP_SHOW_ZERO_STATE")) {
                    return m90662N1("S4P_SETUP_SHOW_ZERO_STATE", "s4p/setup-show/zero-state", 1705, "s4p");
                }
                return null;
            case -1871131014:
                if (str.equals("JAM_GUESTCONTROLSSHEET")) {
                    return m90662N1("JAM_GUESTCONTROLSSHEET", "jam/guestcontrolssheet", 836, "jam");
                }
                return null;
            case -1840010038:
                if (str.equals("PLAYLIST_ALLSONGS")) {
                    return m90643K3();
                }
                return null;
            case -1813600198:
                if (str.equals("GOLDENPATH_JTOMLINSON")) {
                    return m90662N1("GOLDENPATH_JTOMLINSON", "goldenpath/jtomlinson", 660, "goldenpath");
                }
                return null;
            case -1806700598:
                if (str.equals("WEAR_AMBIENT_MODE")) {
                    return m90662N1("WEAR_AMBIENT_MODE", "wear/ambient_mode", 2054, "wear");
                }
                return null;
            case -1783454758:
                if (str.equals("WEAR_VOLUME")) {
                    return m90662N1("WEAR_VOLUME", "wear/volume", 2093, "wear");
                }
                return null;
            case -1744362662:
                if (str.equals("BLUEJAY_SHOW_GENERATION_LIST_SHEET")) {
                    return m90662N1("BLUEJAY_SHOW_GENERATION_LIST_SHEET", "bluejay/show-generation-list-sheet", AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, "bluejay");
                }
                return null;
            case -1740894774:
                if (str.equals("DRIVINGMODE")) {
                    return m90662N1("DRIVINGMODE", "drivingmode", 489, "drivingmode");
                }
                return null;
            case -1653298902:
                if (str.equals("SPOTIFY_FOR_AUTHORS_SIGNUP")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_SIGNUP", "spotify-for-authors/signup", 1890, "spotify-for-authors");
                }
                return null;
            case -1653197142:
                if (str.equals("MRKT_TEAM_ACCESS_LABEL")) {
                    return m90662N1("MRKT_TEAM_ACCESS_LABEL", "mrkt/team/access/label", 1272, "mrkt");
                }
                return null;
            case -1650437398:
                if (str.equals("S4P_ANALYTICS_STREAMS")) {
                    return m90662N1("S4P_ANALYTICS_STREAMS", "s4p/analytics/streams", 1616, "s4p");
                }
                return null;
            case -1642614198:
                if (str.equals("HACKWEEK2023_PRERELEASE_EVENT")) {
                    return m90662N1("HACKWEEK2023_PRERELEASE_EVENT", "hackweek2023/prerelease-event", 761, "hackweek2023");
                }
                return null;
            case -1641419574:
                if (str.equals("GRADUATION_FORCED")) {
                    return m90662N1("GRADUATION_FORCED", "graduation/forced", WatchFeedTwoColumnsLayout.CONFIGURATION_FIELD_NUMBER, "graduation");
                }
                return null;
            case -1622308806:
                if (str.equals("ADSTUDIO_SBL_DETAILS")) {
                    return m90662N1("ADSTUDIO_SBL_DETAILS", "adstudio/sbl/details", ContentType.SHORT_FORM_ON_DEMAND, "adstudio");
                }
                return null;
            case -1603921446:
                if (str.equals("S4P_DEBUG_EXPERIMENTS")) {
                    return m90662N1("S4P_DEBUG_EXPERIMENTS", "s4p/debug/experiments", 1644, "s4p");
                }
                return null;
            case -1578400742:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_SET")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_SET", "adstudio/duplicate-ad-set-only/ad-set", 86, "adstudio");
                }
                return null;
            case -1503043510:
                if (str.equals("SPEED_CONTROL_MESSAGING")) {
                    return m90662N1("SPEED_CONTROL_MESSAGING", "speed-control/messaging", 1867, "speed-control");
                }
                return null;
            case -1467913366:
                if (str.equals("EMAILAUTHENTICATION_VALIDATEOTP")) {
                    return m90662N1("EMAILAUTHENTICATION_VALIDATEOTP", "emailauthentication/validateotp", 495, "emailauthentication");
                }
                return null;
            case -1441590774:
                if (str.equals("CONTEXTMENU_EPISODE")) {
                    return m90801h1();
                }
                return null;
            case -1347096502:
                if (str.equals("GRADUATION_INITIATE")) {
                    return m90690R1();
                }
                return null;
            case -1299310470:
                if (str.equals("S4P_POLL_EDIT")) {
                    return m90662N1("S4P_POLL_EDIT", "s4p/poll/edit", 1683, "s4p");
                }
                return null;
            case -1286262774:
                if (str.equals("SETTINGS_INFO_SHEET")) {
                    return m90662N1("SETTINGS_INFO_SHEET", "settings/info-sheet", 1764, "settings");
                }
                return null;
            case -1267781430:
                if (str.equals("RESETPASSWORD")) {
                    return m90662N1("RESETPASSWORD", "resetpassword", 1598, "resetpassword");
                }
                return null;
            case -1231756102:
                if (str.equals("PAGE_MATCH_BARCODE_SCANNING")) {
                    return m90662N1("PAGE_MATCH_BARCODE_SCANNING", "page-match/barcode-scanning", 1340, "page-match");
                }
                return null;
            case -1211564966:
                if (str.equals("FREETIER_DATASAVER")) {
                    return m90662N1("FREETIER_DATASAVER", "freetier/datasaver", 564, "freetier");
                }
                return null;
            case -1185166118:
                if (str.equals("MRKT_VIDEO_UPLOAD_CLIPS_THANKYOU")) {
                    return m90662N1("MRKT_VIDEO_UPLOAD_CLIPS_THANKYOU", "mrkt/video/upload/clips/thankyou", 1281, "mrkt");
                }
                return null;
            case -1113634438:
                if (str.equals("WWW_ACCOUNT_PAGES_UPDATEPAYMENTDETAILS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_UPDATEPAYMENTDETAILS", "www-account-pages/updatepaymentdetails", 2165, "www-account-pages");
                }
                return null;
            case -1094681830:
                if (str.equals("FAST_TRACK_PAGE_3")) {
                    return m90641K1();
                }
                return null;
            case -980318102:
                if (str.equals("ARTIST_WORKS")) {
                    return m90662N1("ARTIST_WORKS", "artist/works", 175, "artist");
                }
                return null;
            case -949720998:
                if (str.equals("S4P_SETTINGS_EMAIL_NOTIFICATION")) {
                    return m90662N1("S4P_SETTINGS_EMAIL_NOTIFICATION", "s4p/settings/email-notification", 1687, "s4p");
                }
                return null;
            case -910825206:
                if (str.equals("MAGPIE_PROMPT")) {
                    return m90712U2();
                }
                return null;
            case -850436694:
                if (str.equals("PODCAST_SHOW_MEMBERSHIPUPSELL")) {
                    return m90662N1("PODCAST_SHOW_MEMBERSHIPUPSELL", "podcast/show/membershipupsell", 1446, "podcast");
                }
                return null;
            case -838880390:
                if (str.equals("CHALLENGE_EMAIL_VERIFICATION")) {
                    return m90662N1("CHALLENGE_EMAIL_VERIFICATION", "challenge/email-verification", 285, "challenge");
                }
                return null;
            case -817382550:
                if (str.equals("PODCAST_PEPAREPISODE")) {
                    return m90662N1("PODCAST_PEPAREPISODE", "podcast/peparepisode", 1437, "podcast");
                }
                return null;
            case -779747046:
                if (str.equals("GOLDENPATH_TKREUGER")) {
                    return m90662N1("GOLDENPATH_TKREUGER", "goldenpath/tkreuger", 735, "goldenpath");
                }
                return null;
            case -699379638:
                if (str.equals("CONTEXTMENU_SHOWSCANNABLECODE")) {
                    return m90662N1("CONTEXTMENU_SHOWSCANNABLECODE", "contextmenu/showscannablecode", 428, "contextmenu");
                }
                return null;
            case -684999078:
                if (str.equals("PROACTIVE_PLATFORMS_NPV_WIDGET")) {
                    return m90870r4();
                }
                return null;
            case -609604886:
                if (str.equals("SEARCH_PLAYLISTS")) {
                    return m90662N1("SEARCH_PLAYLISTS", "search/playlists", 1736, "search");
                }
                return null;
            case -585830038:
                if (str.equals("GOLDENPATH_MASONW")) {
                    return m90662N1("GOLDENPATH_MASONW", "goldenpath/masonw", 678, "goldenpath");
                }
                return null;
            case -461026630:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_METADATA")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_METADATA", "spotify-for-authors/dvn-creation/metadata", 1880, "spotify-for-authors");
                }
                return null;
            case -435158614:
                if (str.equals("MRKT_ARTIST_SETTINGS")) {
                    return m90662N1("MRKT_ARTIST_SETTINGS", "mrkt/artist/settings", 1099, "mrkt");
                }
                return null;
            case -369784982:
                if (str.equals("WEAR_UNKNOWN")) {
                    return m90662N1("WEAR_UNKNOWN", "wear/unknown", 2090, "wear");
                }
                return null;
            case -366660982:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_AUDIO")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_UPLOAD_AUDIO", "spotify-for-authors/upload/audio", 1891, "spotify-for-authors");
                }
                return null;
            case -298142038:
                if (str.equals("GOLDENPATH_RTOLMAN")) {
                    return m90662N1("GOLDENPATH_RTOLMAN", "goldenpath/rtolman", 721, "goldenpath");
                }
                return null;
            case -296015110:
                if (str.equals("COLLECTION_RADIO")) {
                    return m90662N1("COLLECTION_RADIO", "collection/radio", 354, "collection");
                }
                return null;
            case -292082822:
                if (str.equals("COLLECTION_VIDEO")) {
                    return m90662N1("COLLECTION_VIDEO", "collection/video", 358, "collection");
                }
                return null;
            case -280287638:
                if (str.equals("KID_ACCOUNT_TRANSITION_NAME")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_NAME", "kid-account-transition/name", 870, "kid-account-transition");
                }
                return null;
            case -261989654:
                if (str.equals("JAM_STORIES")) {
                    return m90662N1("JAM_STORIES", "jam/stories", 849, "jam");
                }
                return null;
            case -207687926:
                if (str.equals("MRKT_ARTIST_PROFILE_CONCERTS")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_CONCERTS", "mrkt/artist/profile/concerts", 1084, "mrkt");
                }
                return null;
            case -182886038:
                if (str.equals("ADSTUDIO_ACCOUNT_DETAILS")) {
                    return m90662N1("ADSTUDIO_ACCOUNT_DETAILS", "adstudio/account-details", 29, "adstudio");
                }
                return null;
            case -163566774:
                if (str.equals("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT_NO_ARTIST_REDIRECT")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT_NO_ARTIST_REDIRECT", "mrkt/artist/audience/release-engagement/no-artist-redirect", ContentMediaFormat.EXTRA_MOVIE, "mrkt");
                }
                return null;
            case -155696134:
                if (str.equals("GOLDENPATH_DILVANG")) {
                    return m90662N1("GOLDENPATH_DILVANG", "goldenpath/dilvang", 618, "goldenpath");
                }
                return null;
            case 92472970:
                if (str.equals("NOWPLAYING_QUEUE")) {
                    return m90662N1("NOWPLAYING_QUEUE", "nowplaying/queue", 1313, "nowplaying");
                }
                return null;
            case 133025290:
                if (str.equals("WEAR_APP_IN_BACKGROUND")) {
                    return m90662N1("WEAR_APP_IN_BACKGROUND", "wear/app_in_background", 2055, "wear");
                }
                return null;
            case 136109866:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_DOWNLOAD")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_DOWNLOAD", "mrkt/discovery-mode/unified-buying/create/csv/download", 1174, "mrkt");
                }
                return null;
            case 139951290:
                if (str.equals("EXTERNAL_FACEBOOK")) {
                    return m90613G1();
                }
                return null;
            case 191957706:
                if (str.equals("MANAGE_PARTNER_OVERVIEW")) {
                    return m90662N1("MANAGE_PARTNER_OVERVIEW", "manage/partner-overview", 969, "manage");
                }
                return null;
            case 246238474:
                if (str.equals("LYRICS_LANGUAGE_PICKER")) {
                    return m90662N1("LYRICS_LANGUAGE_PICKER", "lyrics/language-picker", 943, "lyrics");
                }
                return null;
            case 302034954:
                if (str.equals("LYRICS_SHARE_SELECTOR")) {
                    return m90662N1("LYRICS_SHARE_SELECTOR", "lyrics/share-selector", 946, "lyrics");
                }
                return null;
            case 316842810:
                if (str.equals("FANDOMCOLLECTIBLES_STORIES")) {
                    return m90662N1("FANDOMCOLLECTIBLES_STORIES", "fandomcollectibles/stories", 534, "fandomcollectibles");
                }
                return null;
            case 368678186:
                if (str.equals("CHAT_SETTINGS")) {
                    return m90626I0();
                }
                return null;
            case 368960442:
                if (str.equals("ADSTUDIO_COLD_START_AD_QUICK_AUDIO")) {
                    return m90662N1("ADSTUDIO_COLD_START_AD_QUICK_AUDIO", "adstudio/cold-start/ad-quick-audio", 67, "adstudio");
                }
                return null;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return m90603E5();
                }
                return null;
            case 468698218:
                if (str.equals("ALLBOARDING_SEARCH")) {
                    return m90662N1("ALLBOARDING_SEARCH", "allboarding/search", 148, kc3.f121351b);
                }
                return null;
            case 524559450:
                if (str.equals("FRIENDSACTIVITY_STORY")) {
                    return m90662N1("FRIENDSACTIVITY_STORY", "friendsactivity/story", 577, "friendsactivity");
                }
                return null;
            case 566287658:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GUARDIANDETAILS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GUARDIANDETAILS", "www-account-pages/parental-settings/guardiandetails", 2145, "www-account-pages");
                }
                return null;
            case 653883642:
                if (str.equals("CACHED_FILES")) {
                    return m90880t0();
                }
                return null;
            case 660480170:
                if (str.equals("EXPRESSIVE_PLAYLISTS")) {
                    return m90662N1("EXPRESSIVE_PLAYLISTS", "expressive-playlists", 518, "expressive-playlists");
                }
                return null;
            case 747199066:
                if (str.equals("FANDOM_ARTISTBLEND")) {
                    return m90662N1("FANDOM_ARTISTBLEND", "fandom/artistblend", 530, "fandom");
                }
                return null;
            case 771595258:
                if (str.equals("MRKT_TEAM_MANAGEMENT_ACTIVITY")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_ACTIVITY", "mrkt/team-management/activity", 1260, "mrkt");
                }
                return null;
            case 777747386:
                if (str.equals("MISSEDCONNECTIONS")) {
                    return m90662N1("MISSEDCONNECTIONS", "missedconnections", 994, "missedconnections");
                }
                return null;
            case 851977530:
                if (str.equals("AGE_SIGNAL_BLOCKED_ASK_PARENT")) {
                    return m90662N1("AGE_SIGNAL_BLOCKED_ASK_PARENT", "age-signal/blocked/ask-parent", 130, "age-signal");
                }
                return null;
            case 863206602:
                if (str.equals("HOME_UNKNOWN")) {
                    return m90788f2();
                }
                return null;
            case 866407434:
                if (str.equals("WEAR_CONNECT")) {
                    return m90662N1("WEAR_CONNECT", "wear/connect", 2059, "wear");
                }
                return null;
            case 875792810:
                if (str.equals("DISCOVERWEEKLY")) {
                    return m90662N1("DISCOVERWEEKLY", "discoverweekly", 482, "discoverweekly");
                }
                return null;
            case 920243866:
                if (str.equals("MRKT_LEGAL_THIRD_PARTY_LICENSES")) {
                    return m90662N1("MRKT_LEGAL_THIRD_PARTY_LICENSES", "mrkt/legal/third-party-licenses", 1240, "mrkt");
                }
                return null;
            case 924450714:
                if (str.equals("ASSISTED_CURATION_SEARCH_SONGS")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_SONGS", "assisted-curation/search/songs", 188, "assisted-curation");
                }
                return null;
            case 976149178:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GRADUATIONREQUEST")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_GRADUATIONREQUEST", "www-account-pages/parental-settings/graduationrequest", 2144, "www-account-pages");
                }
                return null;
            case 1062337754:
                if (str.equals("GUILTYPLEASURE_LIST")) {
                    return m90662N1("GUILTYPLEASURE_LIST", "guiltypleasure/list", 760, "guiltypleasure");
                }
                return null;
            case 1085621818:
                if (str.equals("ARTIST_GALLERY")) {
                    return m90662N1("ARTIST_GALLERY", "artist/gallery", 165, "artist");
                }
                return null;
            case 1100934346:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES_DARK")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES_DARK", "mrkt/debug/hubs/component-reference/tiles-dark", 1170, "mrkt");
                }
                return null;
            case 1207415082:
                if (str.equals("PODCASTMIX_ENTITY")) {
                    return m90662N1("PODCASTMIX_ENTITY", "podcastmix/entity", 1465, "podcastmix");
                }
                return null;
            case 1218792314:
                if (str.equals("COMMENTS_SECTION")) {
                    return m90662N1("COMMENTS_SECTION", "comments/section", 370, "comments");
                }
                return null;
            case 1233610682:
                if (str.equals("WRAPPED_RETRIEVAL")) {
                    return m90662N1("WRAPPED_RETRIEVAL", "wrapped/retrieval", 2105, "wrapped");
                }
                return null;
            case 1238860026:
                if (str.equals("VOTING_ROOT")) {
                    return m90757a6();
                }
                return null;
            case 1245251242:
                if (str.equals("WWW_ACCOUNT_PAGES_ACTIVATIONHUB")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_ACTIVATIONHUB", "www-account-pages/activationhub", 2107, "www-account-pages");
                }
                return null;
            case 1277669034:
                if (str.equals("PARENTAL_CONSENT_WEBVIEW")) {
                    return m90662N1("PARENTAL_CONSENT_WEBVIEW", "parental-consent/webview", 1348, "parental-consent");
                }
                return null;
            case 1282946234:
                if (str.equals("EXPERIMENTAL_AUDIOPLAYBACK")) {
                    return m90662N1("EXPERIMENTAL_AUDIOPLAYBACK", "experimental/audioplayback", 515, "experimental");
                }
                return null;
            case 1308492058:
                if (str.equals("CONTEXTMENU_TRACK")) {
                    return m90662N1("CONTEXTMENU_TRACK", "contextmenu/track", 429, "contextmenu");
                }
                return null;
            case 1310221658:
                if (str.equals("COMMENTS_NOTIFICATION_OPT_IN")) {
                    return m90696S0();
                }
                return null;
            case 1320794970:
                if (str.equals("GOLDENPATH_LENNARTS")) {
                    return m90662N1("GOLDENPATH_LENNARTS", "goldenpath/lennarts", 669, "goldenpath");
                }
                return null;
            case 1335862202:
                if (str.equals("MANAGE_ORG_UNITS")) {
                    return m90662N1("MANAGE_ORG_UNITS", "manage/org-units", 968, "manage");
                }
                return null;
            case 1372688842:
                if (str.equals("GOLDENPATH_MAXIMILIANF")) {
                    return m90662N1("GOLDENPATH_MAXIMILIANF", "goldenpath/maximilianf", 679, "goldenpath");
                }
                return null;
            case 1397504394:
                if (str.equals("MRKT_FRONTDOOR_CLIPS")) {
                    return m90662N1("MRKT_FRONTDOOR_CLIPS", "mrkt/frontdoor/clips", 1200, "mrkt");
                }
                return null;
            case 1420399130:
                if (str.equals("S4P_PODCAST_CLIP_OPTIONS")) {
                    return m90662N1("S4P_PODCAST_CLIP_OPTIONS", "s4p/podcast/clip/options", 1671, "s4p");
                }
                return null;
            case 1440662042:
                if (str.equals("ADSTUDIO_DASHBOARD_AD_SET_DRAFTS")) {
                    return m90662N1("ADSTUDIO_DASHBOARD_AD_SET_DRAFTS", "adstudio/dashboard/ad-set-drafts", 77, "adstudio");
                }
                return null;
            case 1454425866:
                if (str.equals("GOLDENPATH_MTANNENBERG")) {
                    return m90662N1("GOLDENPATH_MTANNENBERG", "goldenpath/mtannenberg", 697, "goldenpath");
                }
                return null;
            case 1462071498:
                if (str.equals("ACCOUNTSWITCHING_ADDACCOUNT")) {
                    return m90576B();
                }
                return null;
            case 1590753482:
                if (str.equals("ARTIST_MUSIC_VIDEOS")) {
                    return m90662N1("ARTIST_MUSIC_VIDEOS", "artist/music-videos", 166, "artist");
                }
                return null;
            case 1650873610:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_ALL_PLANS")) {
                    return m90804h4();
                }
                return null;
            case 1663597386:
                if (str.equals("REACTIONS")) {
                    return m90662N1("REACTIONS", "reactions", 1570, "reactions");
                }
                return null;
            case 1714818666:
                if (str.equals("NEWRELEASESFEED")) {
                    return m90662N1("NEWRELEASESFEED", "newreleasesfeed", 1299, "newreleasesfeed");
                }
                return null;
            case 1752111370:
                if (str.equals("PODCAST_SHOW_SETTINGS")) {
                    return m90748Z3();
                }
                return null;
            case 1768512330:
                if (str.equals("VOICETIPS")) {
                    return m90662N1("VOICETIPS", "voicetips", 2011, "voicetips");
                }
                return null;
            case 1789165930:
                if (str.equals("MOMENTS_CATEGORY")) {
                    return m90662N1("MOMENTS_CATEGORY", "moments/category", 996, "moments");
                }
                return null;
            case 1810045802:
                if (str.equals("CHILDACCOUNTCLOSURE")) {
                    return m90647L0();
                }
                return null;
            case 1960162442:
                if (str.equals("REINVENTFREE_WEAR_DOWNLOAD_UPSELL")) {
                    return m90721V4();
                }
                return null;
            case 1967692426:
                if (str.equals("BROWSE")) {
                    return m90662N1("BROWSE", "browse", 244, "browse");
                }
                return null;
            case 2004673770:
                if (str.equals("S4P_INCOMPLETE_HOSTING_SWITCH")) {
                    return m90662N1("S4P_INCOMPLETE_HOSTING_SWITCH", "s4p/incomplete-hosting-switch", 1657, "s4p");
                }
                return null;
            case 2116336218:
                if (str.equals("GOLDENPATH_RICARDOQ")) {
                    return m90662N1("GOLDENPATH_RICARDOQ", "goldenpath/ricardoq", 718, "goldenpath");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: M */
    public static cbm0 m90653M() {
        return m90662N1("AGE_ASSURANCE_REQUEST_PARENTAL_CONSENT", "age-assurance/request-parental-consent", ContentType.USER_GENERATED_LIVE, "age-assurance");
    }

    /* JADX INFO: renamed from: M0 */
    public static cbm0 m90654M0() {
        return m90662N1("CHURNLOCK", "churnlock", 335, "churnlock");
    }

    /* JADX INFO: renamed from: M1 */
    public static cbm0 m90655M1() {
        return m90662N1("FREE_TIER_TRACK", "free-tier-track", 562, "free-tier-track");
    }

    /* JADX INFO: renamed from: M2 */
    public static cbm0 m90656M2() {
        return m90662N1("MADE_FOR_YOU", "made-for-you", 948, "made-for-you");
    }

    /* JADX INFO: renamed from: M3 */
    public static cbm0 m90657M3() {
        return m90662N1("PLAYLIST_CREATE", "playlist/create", 1402, "playlist");
    }

    /* JADX INFO: renamed from: M4 */
    public static cbm0 m90658M4() {
        return m90662N1("REINVENTFREE_BACKSKIP_UPSELL", "reinventfree-backskip-upsell", 1580, "reinventfree-backskip-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M5 */
    public static cbm0 m90659M5(String str) {
        switch (str.hashCode()) {
            case -2135340165:
                if (str.equals("PLAYLIST_FOLDER")) {
                    return m90662N1("PLAYLIST_FOLDER", "playlist/folder", 1410, "playlist");
                }
                return null;
            case -2117036437:
                if (str.equals("MRKT_FRONTDOOR_MUSIC_VIDEOS")) {
                    return m90662N1("MRKT_FRONTDOOR_MUSIC_VIDEOS", "mrkt/frontdoor/music-videos", 1219, "mrkt");
                }
                return null;
            case -2113547701:
                if (str.equals("PORTAL_DATA_DISCOVER")) {
                    return m90662N1("PORTAL_DATA_DISCOVER", "portal/data-discover", 1469, "portal");
                }
                return null;
            case -1898235301:
                if (str.equals("SEARCH_ALBUMS")) {
                    return m90662N1("SEARCH_ALBUMS", "search/albums", 1724, "search");
                }
                return null;
            case -1885113269:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_OFFLINE")) {
                    return m90662N1("COLLECTION_PODCASTS_EPISODES_OFFLINE", "collection/podcasts/episodes/offline", 349, "collection");
                }
                return null;
            case -1838488133:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_CUSTOMIZE")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_CUSTOMIZE", "mrkt/artist/campaigns/marquee-and-showcase/update/flights/customize", 1037, "mrkt");
                }
                return null;
            case -1740606597:
                if (str.equals("STUDIO_PERMISSIONS")) {
                    return m90662N1("STUDIO_PERMISSIONS", "studio/permissions", 1922, "studio");
                }
                return null;
            case -1720323365:
                if (str.equals("YOURLIBRARY_HIDDEN_CONTENT")) {
                    return m90662N1("YOURLIBRARY_HIDDEN_CONTENT", "yourlibrary/hidden-content", 2182, "yourlibrary");
                }
                return null;
            case -1698745509:
                if (str.equals("GOLDENPATH_SIMA")) {
                    return m90662N1("GOLDENPATH_SIMA", "goldenpath/sima", 732, "goldenpath");
                }
                return null;
            case -1622052069:
                if (str.equals("IRONCHEF_EDIT")) {
                    return m90662N1("IRONCHEF_EDIT", "ironchef/edit", 827, "ironchef");
                }
                return null;
            case -1615518581:
                if (str.equals("MAGPIE_CADENCE")) {
                    return m90677P2();
                }
                return null;
            case -1576585045:
                if (str.equals("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS")) {
                    return m90662N1("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS", "mrkt/third-party-agency/campaigns", 1275, "mrkt");
                }
                return null;
            case -1542968837:
                if (str.equals("RECENTLYPLAYED")) {
                    return m90662N1("RECENTLYPLAYED", "recentlyplayed", 1575, "recentlyplayed");
                }
                return null;
            case -1524705221:
                if (str.equals("CHAT_DETAILS")) {
                    return m90922z0();
                }
                return null;
            case -1489235429:
                if (str.equals("SETTINGS_NEARBY")) {
                    return m90662N1("SETTINGS_NEARBY", "settings/nearby", 1773, "settings");
                }
                return null;
            case -1478807461:
                if (str.equals("CULTURALMOMENTS_UPSELL")) {
                    return m90895v1();
                }
                return null;
            case -1467221381:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_VIDEO_CREATE")) {
                    return m90662N1("MRKT_ARTIST_PRE_RELEASE_VIDEO_CREATE", "mrkt/artist/pre-release/video/create", 1071, "mrkt");
                }
                return null;
            case -1443513669:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOADLIMIT")) {
                    return m90689R0();
                }
                return null;
            case -1402988613:
                if (str.equals("KID_ACCOUNT_TRANSITION_CONSENT")) {
                    return m90896v2();
                }
                return null;
            case -1321140629:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_TILES", "mrkt/debug/hubs/component-reference/tiles", 1169, "mrkt");
                }
                return null;
            case -1276024597:
                if (str.equals("PHONENUMBERSIGNUP_PHONENUMBERENTRY")) {
                    return m90662N1("PHONENUMBERSIGNUP_PHONENUMBERENTRY", "phonenumbersignup/phonenumberentry", 1389, "phonenumbersignup");
                }
                return null;
            case -1215514933:
                if (str.equals("STUDIO_SKILLS")) {
                    return m90662N1("STUDIO_SKILLS", "studio/skills", 1925, "studio");
                }
                return null;
            case -1196751285:
                if (str.equals("GOLDENPATH_SBASUTKAR")) {
                    return m90662N1("GOLDENPATH_SBASUTKAR", "goldenpath/sbasutkar", 727, "goldenpath");
                }
                return null;
            case -1168643365:
                if (str.equals("CONNECT_OUTPUTSWITCHERDEVICEPICKER")) {
                    return m90662N1("CONNECT_OUTPUTSWITCHERDEVICEPICKER", "connect/outputSwitcherDevicePicker", 386, "connect");
                }
                return null;
            case -1138342421:
                if (str.equals("GOLDENPATH_ABELD")) {
                    return m90662N1("GOLDENPATH_ABELD", "goldenpath/abeld", 591, "goldenpath");
                }
                return null;
            case -1134533861:
                if (str.equals("ARTIST_FEATURING")) {
                    return m90662N1("ARTIST_FEATURING", "artist/featuring", 164, "artist");
                }
                return null;
            case -1134308357:
                if (str.equals("GOLDENPATH_EMREG")) {
                    return m90662N1("GOLDENPATH_EMREG", "goldenpath/emreg", 626, "goldenpath");
                }
                return null;
            case -1107941445:
                if (str.equals("WEAR_SEARCH_ENTRY")) {
                    return m90662N1("WEAR_SEARCH_ENTRY", "wear/search/entry", 2076, "wear");
                }
                return null;
            case -1088835301:
                if (str.equals("S4P_SETUP_SHOW_NAME")) {
                    return m90662N1("S4P_SETUP_SHOW_NAME", "s4p/setup-show/name", 1701, "s4p");
                }
                return null;
            case -1047306181:
                if (str.equals("SOCIAL_LISTENING_PARTICIPANTLIST")) {
                    return m90662N1("SOCIAL_LISTENING_PARTICIPANTLIST", "social-listening/participantlist", 1852, "social-listening");
                }
                return null;
            case -998886389:
                if (str.equals("ARTIST_CLIPS")) {
                    return m90662N1("ARTIST_CLIPS", "artist/clips", 161, "artist");
                }
                return null;
            case -997228949:
                if (str.equals("BLEND_ENTITY_MEMBERS")) {
                    return m90828l0();
                }
                return null;
            case -984600101:
                if (str.equals("ADSTUDIO_ACCOUNT_SETTINGS")) {
                    return m90662N1("ADSTUDIO_ACCOUNT_SETTINGS", "adstudio/account-settings", 31, "adstudio");
                }
                return null;
            case -982279765:
                if (str.equals("INAPPMESSAGE")) {
                    return m90662N1("INAPPMESSAGE", "inappmessage", ContentDeliveryAdvertisementCapability.LINEAR_7DAY, "inappmessage");
                }
                return null;
            case -957395589:
                if (str.equals("AGE_VERIFICATION")) {
                    return m90662N1("AGE_VERIFICATION", "age-verification", 136, "age-verification");
                }
                return null;
            case -956171333:
                if (str.equals("SETTINGS_INTEGRATIONS")) {
                    return m90662N1("SETTINGS_INTEGRATIONS", "settings/integrations", 1765, "settings");
                }
                return null;
            case -952436213:
                if (str.equals("MRKT_TEAM_MANAGEMENT_BULK_INVITE")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_BULK_INVITE", "mrkt/team-management/bulk-invite", 1262, "mrkt");
                }
                return null;
            case -928618165:
                if (str.equals("COLLECTION_FILEPICKER")) {
                    return m90662N1("COLLECTION_FILEPICKER", "collection/filepicker", 342, "collection");
                }
                return null;
            case -921966373:
                if (str.equals("CONTRIBUTION_NOTES_MANAGE_PICKER")) {
                    return m90853p1();
                }
                return null;
            case -894161013:
                if (str.equals("MRKT_ARTIST_AUDIENCE")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE", "mrkt/artist/audience", 1002, "mrkt");
                }
                return null;
            case -886007173:
                if (str.equals("SETTINGS_CONTENTPREFERENCES")) {
                    return m90662N1("SETTINGS_CONTENTPREFERENCES", "settings/contentpreferences", 1757, "settings");
                }
                return null;
            case -881207253:
                if (str.equals("REFLECTION")) {
                    return m90651L4();
                }
                return null;
            case -847267781:
                if (str.equals("PROFILE_EDIT_SOCIAL_HANDLE")) {
                    return m90898v4();
                }
                return null;
            case -826455589:
                if (str.equals("EPISODE")) {
                    return m90662N1("EPISODE", "episode", 507, "episode");
                }
                return null;
            case -773690021:
                if (str.equals("MRKT_ARTIST_AUDIENCE_SOURCE_OF_STREAMS")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_SOURCE_OF_STREAMS", "mrkt/artist/audience/source-of-streams", 1016, "mrkt");
                }
                return null;
            case -754130661:
                if (str.equals("WWW_ACCOUNT_PAGES_ACCOUNTSETTINGS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_ACCOUNTSETTINGS", "www-account-pages/accountsettings", 2106, "www-account-pages");
                }
                return null;
            case -747472789:
                if (str.equals("FACEBOOK_PERMISSIONS")) {
                    return m90662N1("FACEBOOK_PERMISSIONS", "facebook/permissions", 527, "facebook");
                }
                return null;
            case -743279125:
                if (str.equals("AGE_ASSURANCE_PARENTAL_CONSENT_EDUCATION")) {
                    return m90662N1("AGE_ASSURANCE_PARENTAL_CONSENT_EDUCATION", "age-assurance/parental-consent-education", ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, "age-assurance");
                }
                return null;
            case -735071205:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CLIPS_DETAILS", "mrkt/artist/video/clips/details", 1115, "mrkt");
                }
                return null;
            case -722950661:
                if (str.equals("CAPPED_ONDEMAND_DIALOG")) {
                    return m90662N1("CAPPED_ONDEMAND_DIALOG", "capped-ondemand/dialog", 265, "capped-ondemand");
                }
                return null;
            case -671905701:
                if (str.equals("GOLDENPATH_JAMESN")) {
                    return m90662N1("GOLDENPATH_JAMESN", "goldenpath/jamesn", 645, "goldenpath");
                }
                return null;
            case -653461781:
                if (str.equals("GOLDENPATH_JULIAS")) {
                    return m90662N1("GOLDENPATH_JULIAS", "goldenpath/julias", 662, "goldenpath");
                }
                return null;
            case -605586629:
                if (str.equals("PROFILE_FOLLOWING")) {
                    return m90662N1("PROFILE_FOLLOWING", "profile/following", 1527, "profile");
                }
                return null;
            case -576718293:
                if (str.equals("PORTAL_SEARCH_BATCH_WORKFLOWS")) {
                    return m90662N1("PORTAL_SEARCH_BATCH_WORKFLOWS", "portal/search-batch-workflows", 1474, "portal");
                }
                return null;
            case -570178005:
                if (str.equals("YOUR_PREMIUM")) {
                    return m90827k6();
                }
                return null;
            case -551032021:
                if (str.equals("SETTINGS_YOUR_LIBRARY")) {
                    return m90845n5();
                }
                return null;
            case -520370085:
                if (str.equals("MRKT_ARTIST_MERCH_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_MERCH_DETAILS", "mrkt/artist/merch/details", 1050, "mrkt");
                }
                return null;
            case -500245253:
                if (str.equals("BLUEJAY_CONNECTOR_APPS")) {
                    return m90852p0();
                }
                return null;
            case -487043029:
                if (str.equals("YOURLIBRARY_AUDIOBOOKS")) {
                    return m90662N1("YOURLIBRARY_AUDIOBOOKS", "yourlibrary/audiobooks", 2178, "yourlibrary");
                }
                return null;
            case -478510149:
                if (str.equals("PORTAL_DATA_MY_DATA")) {
                    return m90662N1("PORTAL_DATA_MY_DATA", "portal/data-my-data", 1471, "portal");
                }
                return null;
            case -444462629:
                if (str.equals("ASSISTED_CURATION_NAMING")) {
                    return m90662N1("ASSISTED_CURATION_NAMING", "assisted-curation/naming", 178, "assisted-curation");
                }
                return null;
            case -438362181:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_RESOLVECONTENTREQUEST")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_RESOLVECONTENTREQUEST", "www-account-pages/parental-settings/resolvecontentrequest", 2149, "www-account-pages");
                }
                return null;
            case -415047077:
                if (str.equals("ADSTUDIO_COLD_START_AD_QUICK_AI_AUDIO")) {
                    return m90662N1("ADSTUDIO_COLD_START_AD_QUICK_AI_AUDIO", "adstudio/cold-start/ad-quick-ai-audio", 66, "adstudio");
                }
                return null;
            case -412267973:
                if (str.equals("DIALOG_FINDFRIENDS_CONFIRMALL")) {
                    return m90662N1("DIALOG_FINDFRIENDS_CONFIRMALL", "dialog/findfriends/confirmall", 468, "dialog");
                }
                return null;
            case -396643349:
                if (str.equals("ALLBOARDING_SINGLEITEMPICKER")) {
                    return m90662N1("ALLBOARDING_SINGLEITEMPICKER", "allboarding/singleitempicker", 150, kc3.f121351b);
                }
                return null;
            case -306381397:
                if (str.equals("MRKT_TEAM_MANAGEMENT_TEAM_DETAILS")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_TEAM_DETAILS", "mrkt/team-management/team-details", 1267, "mrkt");
                }
                return null;
            case -305845909:
                if (str.equals("CHAT_AI_DISCLAIMER")) {
                    return m90662N1("CHAT_AI_DISCLAIMER", "chat-ai-disclaimer", 306, "chat-ai-disclaimer");
                }
                return null;
            case -297971973:
                if (str.equals("ASSISTED_CURATION_SEARCH")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH", "assisted-curation/search", 179, "assisted-curation");
                }
                return null;
            case -182671765:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE_DETAIL")) {
                    return m90662N1("MEMBERSHIP_CONSUMER_MANAGE_DETAIL", "membership/consumer/manage/detail", 990, "membership");
                }
                return null;
            case -176534997:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_REPORTING")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_REPORTING", "mrkt/artist/campaigns/reporting", 1041, "mrkt");
                }
                return null;
            case -155443765:
                if (str.equals("WWW_ACCOUNT_PAGES_CANCELLATIONOFFLINE")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_CANCELLATIONOFFLINE", "www-account-pages/cancellationoffline", 2113, "www-account-pages");
                }
                return null;
            case -81219397:
                if (str.equals("CONNECT_TUTORIALBLUETOOTH")) {
                    return m90662N1("CONNECT_TUTORIALBLUETOOTH", "connect/tutorialbluetooth", 391, "connect");
                }
                return null;
            case 37412651:
                if (str.equals("GOLDENPATH_SAFWANH")) {
                    return m90662N1("GOLDENPATH_SAFWANH", "goldenpath/safwanh", 722, "goldenpath");
                }
                return null;
            case 77732827:
                if (str.equals("RADIO")) {
                    return m90623H4();
                }
                return null;
            case 80083243:
                if (str.equals("TRACK")) {
                    return m90662N1("TRACK", "track", 1974, "track");
                }
                return null;
            case 83950523:
                if (str.equals("REINVENTFREE_TIME_CAP_PIVOT_TRACK_RADIO_UPSELL")) {
                    return m90707T4();
                }
                return null;
            case 115459067:
                if (str.equals("S4P_DEBUG_MENU")) {
                    return m90662N1("S4P_DEBUG_MENU", "s4p/debug/menu", 1646, "s4p");
                }
                return null;
            case 120057931:
                if (str.equals("EVENTSENDER_ITGC_DEBUG")) {
                    return m90662N1("EVENTSENDER_ITGC_DEBUG", "eventsender/itgc/debug", 513, "eventsender");
                }
                return null;
            case 162538539:
                if (str.equals("GOLDENPATH_SERGEIG")) {
                    return m90662N1("GOLDENPATH_SERGEIG", "goldenpath/sergeig", 729, "goldenpath");
                }
                return null;
            case 198813547:
                if (str.equals("RADIO_STATION_CREATE")) {
                    return m90662N1("RADIO_STATION_CREATE", "radio/station/create", 1561, "radio");
                }
                return null;
            case 204000331:
                if (str.equals("MRKT_FRONTDOOR_DISCOVERY_MODE")) {
                    return m90662N1("MRKT_FRONTDOOR_DISCOVERY_MODE", "mrkt/frontdoor/discovery-mode", AdvertisementOwner.ORIGINATOR, "mrkt");
                }
                return null;
            case 257684667:
                if (str.equals("CONTRIBUTOR")) {
                    return m90662N1("CONTRIBUTOR", "contributor", 441, "contributor");
                }
                return null;
            case 309923403:
                if (str.equals("PLAYLIST_NOTLOADED")) {
                    return m90662N1("PLAYLIST_NOTLOADED", "playlist/notloaded", 1415, "playlist");
                }
                return null;
            case 475896347:
                if (str.equals("REINVENTFREE_TIME_CAP_PIVOT_MULTI_SONG_UPSELL")) {
                    return m90693R4();
                }
                return null;
            case 570440107:
                if (str.equals("HOMEMIX_ABOUT")) {
                    return m90662N1("HOMEMIX_ABOUT", "homemix/about", 791, "homemix");
                }
                return null;
            case 577219787:
                if (str.equals("S4P_PODCAST_EPISODE_RICH_TEXT_EDITOR")) {
                    return m90662N1("S4P_PODCAST_EPISODE_RICH_TEXT_EDITOR", "s4p/podcast/episode/rich-text-editor", 1681, "s4p");
                }
                return null;
            case 593976523:
                if (str.equals("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_RELEASE_ENGAGEMENT", "mrkt/artist/audience/release-engagement", ContentMediaFormat.EXTRA_EPISODE, "mrkt");
                }
                return null;
            case 659528443:
                if (str.equals("CHAT_CONTENT_PICKER")) {
                    return m90908x0();
                }
                return null;
            case 689771131:
                if (str.equals("SETTINGS_ACCOUNT_UPSELL")) {
                    return m90662N1("SETTINGS_ACCOUNT_UPSELL", "settings/account/upsell", 1748, "settings");
                }
                return null;
            case 796711691:
                if (str.equals("LISTENINGSTATS_SUMMARY")) {
                    return m90600E2();
                }
                return null;
            case 814170379:
                if (str.equals("S4P_SETUP_SHOW_COVER_ART")) {
                    return m90662N1("S4P_SETUP_SHOW_COVER_ART", "s4p/setup-show/cover-art", 1697, "s4p");
                }
                return null;
            case 822181051:
                if (str.equals("COLLECTION_ARTISTS_ARTIST")) {
                    return m90668O0();
                }
                return null;
            case 833885531:
                if (str.equals("MAGPIE_SOURCE_WEBVIEW")) {
                    return m90662N1("MAGPIE_SOURCE_WEBVIEW", "magpie/source-webview", 959, "magpie");
                }
                return null;
            case 841039787:
                if (str.equals("CHARTS_WEEKLY")) {
                    return m90662N1("CHARTS_WEEKLY", "charts/weekly", ContentFeedType.WEST_SD, "charts");
                }
                return null;
            case 876335163:
                if (str.equals("MRKT_FRONTDOOR_BLOG")) {
                    return m90662N1("MRKT_FRONTDOOR_BLOG", "mrkt/frontdoor/blog", 1195, "mrkt");
                }
                return null;
            case 878945819:
                if (str.equals("JAM_PREMIUMGATEDSTARTUPSELLSHEET")) {
                    return m90662N1("JAM_PREMIUMGATEDSTARTUPSELLSHEET", "jam/premiumgatedstartupsellsheet", 847, "jam");
                }
                return null;
            case 879168091:
                if (str.equals("DIALOG_PAYWALL")) {
                    return m90662N1("DIALOG_PAYWALL", "dialog/paywall", 473, "dialog");
                }
                return null;
            case 880842539:
                if (str.equals("GUEST_LIBRARYTABWALL")) {
                    return m90662N1("GUEST_LIBRARYTABWALL", "guest/librarytabwall", 758, "guest");
                }
                return null;
            case 911071467:
                if (str.equals("LOGIN_DIALOG_OFFLINE_ERROR")) {
                    return m90614G2();
                }
                return null;
            case 917198827:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM_REVIEW")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_DM_REVIEW", "mrkt/artist/campaigns/dm/review", 1024, "mrkt");
                }
                return null;
            case 936594507:
                if (str.equals("CHECKOUT_COUNTRYPICKER")) {
                    return m90640K0();
                }
                return null;
            case 1011240347:
                if (str.equals("ADS_AD_ON_APP_OPEN")) {
                    return m90632J();
                }
                return null;
            case 1011656187:
                if (str.equals("RADIO_DASHBOARD_MIXES")) {
                    return m90662N1("RADIO_DASHBOARD_MIXES", "radio/dashboard/mixes", 1559, "radio");
                }
                return null;
            case 1013066011:
                if (str.equals("ALIGNED_CURATION_FIRST_SAVE")) {
                    return m90702T();
                }
                return null;
            case 1020302907:
                if (str.equals("AGE_ASSURANCE_UNDERAGE_BLOCKING")) {
                    return m90667O();
                }
                return null;
            case 1026823035:
                if (str.equals("SONG_DNA_ABOUT")) {
                    return m90662N1("SONG_DNA_ABOUT", "song-dna-about", 1857, "song-dna-about");
                }
                return null;
            case 1056189643:
                if (str.equals("REINVENTFREE_SKIP_LIMIT_UPSELL")) {
                    return m90686Q4();
                }
                return null;
            case 1057636747:
                if (str.equals("PROFILE_PLAYLISTS")) {
                    return m90662N1("PROFILE_PLAYLISTS", "profile/playlists", 1531, "profile");
                }
                return null;
            case 1082669627:
                if (str.equals("DIALOG_AGELIMITDIALOG")) {
                    return m90662N1("DIALOG_AGELIMITDIALOG", "dialog/agelimitdialog", 460, "dialog");
                }
                return null;
            case 1191009275:
                if (str.equals("ADSTUDIO_ACCOUNT_MANAGEMENT")) {
                    return m90662N1("ADSTUDIO_ACCOUNT_MANAGEMENT", "adstudio/account-management", 30, "adstudio");
                }
                return null;
            case 1220049867:
                if (str.equals("MRKT_FRONTDOOR_VIDEOS_CONTENT")) {
                    return m90662N1("MRKT_FRONTDOOR_VIDEOS_CONTENT", "mrkt/frontdoor/videos/content", 1232, "mrkt");
                }
                return null;
            case 1231315115:
                if (str.equals("WEAR_ENTITY_PAGE")) {
                    return m90662N1("WEAR_ENTITY_PAGE", "wear/entity_page", 2064, "wear");
                }
                return null;
            case 1239693131:
                if (str.equals("CONTEXTMENU_EPISODE_SPEEDCONTROL")) {
                    return m90662N1("CONTEXTMENU_EPISODE_SPEEDCONTROL", "contextmenu/episode/speedcontrol", 418, "contextmenu");
                }
                return null;
            case 1247801371:
                if (str.equals("S4P_SETUP_SHOW_AUTHOR")) {
                    return m90662N1("S4P_SETUP_SHOW_AUTHOR", "s4p/setup-show/author", 1694, "s4p");
                }
                return null;
            case 1257056779:
                if (str.equals("TERMS_TERMSOFSERVICE_REACCEPT")) {
                    return m90662N1("TERMS_TERMSOFSERVICE_REACCEPT", "terms/termsofservice/reaccept", 1971, "terms");
                }
                return null;
            case 1285806091:
                if (str.equals("WEAR_DOWNLOADS")) {
                    return m90662N1("WEAR_DOWNLOADS", "wear/downloads", 2062, "wear");
                }
                return null;
            case 1304790907:
                if (str.equals("CONSUMPTION")) {
                    return m90766c1();
                }
                return null;
            case 1316542827:
                if (str.equals("GOLDENPATH_MCOMISSO")) {
                    return m90662N1("GOLDENPATH_MCOMISSO", "goldenpath/mcomisso", 683, "goldenpath");
                }
                return null;
            case 1329881515:
                if (str.equals("VERSIONSUNSETTING_DIALOG")) {
                    return m90750Z5();
                }
                return null;
            case 1502163451:
                if (str.equals("CATEGORIES_ONBOARDING_LOADING")) {
                    return m90662N1("CATEGORIES_ONBOARDING_LOADING", "categories/onboarding/loading", 280, "categories");
                }
                return null;
            case 1544265803:
                if (str.equals("START_RETRY")) {
                    return m90662N1("START_RETRY", "start/retry", 1915, "start");
                }
                return null;
            case 1570737915:
                if (str.equals("YOURLIBRARY_ALBUMS")) {
                    return m90662N1("YOURLIBRARY_ALBUMS", "yourlibrary/albums", 2175, "yourlibrary");
                }
                return null;
            case 1591105867:
                if (str.equals("COLLECTION_ARTISTS")) {
                    return m90662N1("COLLECTION_ARTISTS", "collection/artists", 339, "collection");
                }
                return null;
            case 1628997611:
                if (str.equals("MRKT_BULK_CAMPAIGNS_FORECAST_RULES")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_FORECAST_RULES", "mrkt/bulk-campaigns/forecast/rules", 1147, "mrkt");
                }
                return null;
            case 1641254395:
                if (str.equals("GOLDENPATH_YUHANGZ")) {
                    return m90662N1("GOLDENPATH_YUHANGZ", "goldenpath/yuhangz", 744, "goldenpath");
                }
                return null;
            case 1714429547:
                if (str.equals("CONTEXTMENU_DJNARRATION")) {
                    return m90662N1("CONTEXTMENU_DJNARRATION", "contextmenu/djnarration", 412, "contextmenu");
                }
                return null;
            case 1749341947:
                if (str.equals("MRKT_ARTIST_PROFILE_ARTISTPICK_PICK")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_ARTISTPICK_PICK", "mrkt/artist/profile/artistpick/pick", 1077, "mrkt");
                }
                return null;
            case 1756630587:
                if (str.equals("INAPPMESSAGE_HTML_FULLSCREEN")) {
                    return m90836m2();
                }
                return null;
            case 1770662539:
                if (str.equals("WATCHAPP_PODCAST_ENTITY")) {
                    return m90662N1("WATCHAPP_PODCAST_ENTITY", "watchapp/podcast-entity", 2038, "watchapp");
                }
                return null;
            case 1773632475:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_METADATA")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_UPLOAD_METADATA", "spotify-for-authors/upload/metadata", 1893, "spotify-for-authors");
                }
                return null;
            case 1792515499:
                if (str.equals("ADS_PREFERRED_AD_CATEGORIES")) {
                    return m90662N1("ADS_PREFERRED_AD_CATEGORIES", "ads/preferred-ad-categories", 23, "ads");
                }
                return null;
            case 1840204683:
                if (str.equals("SEARCH_AUDIOBOOKS")) {
                    return m90662N1("SEARCH_AUDIOBOOKS", "search/audiobooks", 1726, "search");
                }
                return null;
            case 1849092203:
                if (str.equals("JAM_JOINJAMPROACTIVEPROMPTSHEET")) {
                    return m90662N1("JAM_JOINJAMPROACTIVEPROMPTSHEET", "jam/joinjamproactivepromptsheet", 841, "jam");
                }
                return null;
            case 1855046747:
                if (str.equals("CREATEMENU")) {
                    return m90881t1();
                }
                return null;
            case 1891813035:
                if (str.equals("ANCHORFUNNEL")) {
                    return m90662N1("ANCHORFUNNEL", "anchorfunnel", 151, "anchorfunnel");
                }
                return null;
            case 1901414619:
                if (str.equals("PORTAL_SEARCH")) {
                    return m90662N1("PORTAL_SEARCH", "portal/search", 1473, "portal");
                }
                return null;
            case 1905536299:
                if (str.equals("LOGIN_DIALOG_SAMSUNGEFFORTLESSLOGIN")) {
                    return m90662N1("LOGIN_DIALOG_SAMSUNGEFFORTLESSLOGIN", "login/dialog/samsungeffortlesslogin", 926, "login");
                }
                return null;
            case 1909853179:
                if (str.equals("HIFI_NON_METERED_SHEET")) {
                    return m90662N1("HIFI_NON_METERED_SHEET", "hifi/non-metered-sheet", 768, "hifi");
                }
                return null;
            case 1912769515:
                if (str.equals("PARENTAL_CONTROL_MANAGE_CONTENT")) {
                    return m90904w3();
                }
                return null;
            case 1941043915:
                if (str.equals("S4P_PODCAST_EPISODE_OPTIONS_VIDEO")) {
                    return m90662N1("S4P_PODCAST_EPISODE_OPTIONS_VIDEO", "s4p/podcast/episode/options/video", 1679, "s4p");
                }
                return null;
            case 1941968267:
                if (str.equals("AUTHOR")) {
                    return m90793g0();
                }
                return null;
            case 1993724955:
                if (str.equals("COURSE")) {
                    return m90662N1("COURSE", "course", 442, "course");
                }
                return null;
            case 2088336507:
                if (str.equals("JAM_PERMISSIONUPGRADESHEET")) {
                    return m90662N1("JAM_PERMISSIONUPGRADESHEET", "jam/permissionupgradesheet", 846, "jam");
                }
                return null;
            case 2122072347:
                if (str.equals("PREMIUM_MINI_DOWNLOADED_ENTITY")) {
                    return m90662N1("PREMIUM_MINI_DOWNLOADED_ENTITY", "premium-mini/downloaded-entity", 1500, "premium-mini");
                }
                return null;
            case 2131921227:
                if (str.equals("S4P_EPISODES_SELECT_POLL")) {
                    return m90662N1("S4P_EPISODES_SELECT_POLL", "s4p/episodes/select/poll", 1653, "s4p");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: N */
    public static cbm0 m90660N() {
        return m90662N1("AGE_ASSURANCE_SHARE_PARENTAL_CONSENT", "age-assurance/share-parental-consent", 125, "age-assurance");
    }

    /* JADX INFO: renamed from: N0 */
    public static final View m90661N0(View view) {
        View view2 = view.getParent() instanceof ConstraintLayout ? view : null;
        if (view2 != null) {
            return view2;
        }
        Object parent = view.getParent();
        View view3 = parent instanceof View ? (View) parent : null;
        if (view3 != null) {
            return m90661N0(view3);
        }
        return null;
    }

    /* JADX INFO: renamed from: N1 */
    public static cbm0 m90662N1(String str, String str2, int i, String str3) {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0Var = (cbm0) atomicReferenceArray.get(i);
        if (cbm0Var != null) {
            return cbm0Var;
        }
        cbm0 cbm0Var2 = new cbm0(str, str2, i, str3);
        while (!atomicReferenceArray.compareAndSet(i, null, cbm0Var2)) {
            if (atomicReferenceArray.get(i) != null) {
                Object obj = cbm0.f36163e.get(i);
                wj50.m88279p(obj);
                return (cbm0) obj;
            }
        }
        return cbm0Var2;
    }

    /* JADX INFO: renamed from: N2 */
    public static cbm0 m90663N2() {
        return m90662N1("MAGICLINK_ALREADYAUTHENTICATED", "magiclink/alreadyauthenticated", 949, "magiclink");
    }

    /* JADX INFO: renamed from: N3 */
    public static cbm0 m90664N3() {
        return m90662N1("PLAYLIST_CREATE_EUTERPE", "playlist/create/euterpe", 1403, "playlist");
    }

    /* JADX INFO: renamed from: N4 */
    public static cbm0 m90665N4() {
        return m90662N1("REINVENTFREE_DOWNLOAD_UPSELL", "reinventfree-download-upsell", 1581, "reinventfree-download-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: N5 */
    public static cbm0 m90666N5(String str) {
        switch (str.hashCode()) {
            case -2142243204:
                if (str.equals("IRONCHEF_CHOOSEKIND")) {
                    return m90662N1("IRONCHEF_CHOOSEKIND", "ironchef/choosekind", 825, "ironchef");
                }
                return null;
            case -2130891364:
                if (str.equals("PLAYLIST_PERMISSIONS_CLAIMDIALOG")) {
                    return m90706T3();
                }
                return null;
            case -2129819812:
                if (str.equals("BLUEJAY_SKIP_FORWARD")) {
                    return m90866r0();
                }
                return null;
            case -2105145316:
                if (str.equals("PROMODISCLOSURE")) {
                    return m90926z4();
                }
                return null;
            case -2072291508:
                if (str.equals("S4P_SETUP_SHOW_DESCRIPTION")) {
                    return m90662N1("S4P_SETUP_SHOW_DESCRIPTION", "s4p/setup-show/description", 1699, "s4p");
                }
                return null;
            case -2067779972:
                if (str.equals("MRKT_ARTIST_NMS_EDIT")) {
                    return m90662N1("MRKT_ARTIST_NMS_EDIT", "mrkt/artist/nms/edit", 1064, "mrkt");
                }
                return null;
            case -2054302452:
                if (str.equals("S4P_MODERATION_SETTINGS")) {
                    return m90662N1("S4P_MODERATION_SETTINGS", "s4p/moderation-settings", 1663, "s4p");
                }
                return null;
            case -2028249092:
                if (str.equals("S4P_CLAIM_PODCAST_ADD_EXISTING_PODCAST")) {
                    return m90662N1("S4P_CLAIM_PODCAST_ADD_EXISTING_PODCAST", "s4p/claim-podcast/add-existing-podcast", 1628, "s4p");
                }
                return null;
            case -1960579332:
                if (str.equals("PICKINSIGHTS")) {
                    return m90662N1("PICKINSIGHTS", "pickinsights", 1391, "pickinsights");
                }
                return null;
            case -1957586388:
                if (str.equals("CONTRIBUTION_NOTES_REPORT_PICKER")) {
                    return m90874s1();
                }
                return null;
            case -1901251700:
                if (str.equals("GOLDENPATH_RMALMLING")) {
                    return m90662N1("GOLDENPATH_RMALMLING", "goldenpath/rmalmling", 719, "goldenpath");
                }
                return null;
            case -1882516916:
                if (str.equals("ADSTUDIO_AD_DETAILS")) {
                    return m90662N1("ADSTUDIO_AD_DETAILS", "adstudio/ad/details", 37, "adstudio");
                }
                return null;
            case -1744055604:
                if (str.equals("LEGACYSHARE_SENDTO")) {
                    return m90662N1("LEGACYSHARE_SENDTO", "legacyshare/sendto", 883, "legacyshare");
                }
                return null;
            case -1727953572:
                if (str.equals("FRIENDRECOMMENDATIONS")) {
                    return m90662N1("FRIENDRECOMMENDATIONS", "friendrecommendations", 574, "friendrecommendations");
                }
                return null;
            case -1698753188:
                if (str.equals("GOLDENPATH_SAMJ")) {
                    return m90662N1("GOLDENPATH_SAMJ", "goldenpath/samj", 723, "goldenpath");
                }
                return null;
            case -1595186196:
                if (str.equals("QUIZ_RESULTS")) {
                    return m90616G4();
                }
                return null;
            case -1570838212:
                if (str.equals("S4P_SETUP_SHOW_CROP_COVER_ART")) {
                    return m90662N1("S4P_SETUP_SHOW_CROP_COVER_ART", "s4p/setup-show/crop-cover-art", 1698, "s4p");
                }
                return null;
            case -1452428884:
                if (str.equals("SETTINGS_NOTIFICATIONS")) {
                    return m90662N1("SETTINGS_NOTIFICATIONS", "settings/notifications", 1774, "settings");
                }
                return null;
            case -1419391892:
                if (str.equals("S4P_SHARING_SHARE")) {
                    return m90662N1("S4P_SHARING_SHARE", "s4p/sharing/share", 1706, "s4p");
                }
                return null;
            case -1410360068:
                if (str.equals("ADSTUDIO_AD_ACCOUNTS")) {
                    return m90662N1("ADSTUDIO_AD_ACCOUNTS", "adstudio/ad-accounts", 32, "adstudio");
                }
                return null;
            case -1389595780:
                if (str.equals("EXTERNAL_NAVER")) {
                    return m90662N1("EXTERNAL_NAVER", "external/naver", 524, "external");
                }
                return null;
            case -1377493204:
                if (str.equals("ADSTUDIO_BUSINESS_AD_ACCOUNTS_DETAILS")) {
                    return m90662N1("ADSTUDIO_BUSINESS_AD_ACCOUNTS_DETAILS", "adstudio/business/ad-accounts/details", 52, "adstudio");
                }
                return null;
            case -1270000644:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_ADD_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_FLIGHTS_ADD_DETAILS", "mrkt/artist/campaigns/marquee-and-showcase/update/flights/add-details", 1036, "mrkt");
                }
                return null;
            case -1250149972:
                if (str.equals("MRKT_ARTIST_SONG_SOURCE_OF_STREAMS")) {
                    return m90662N1("MRKT_ARTIST_SONG_SOURCE_OF_STREAMS", "mrkt/artist/song/source-of-streams", 1106, "mrkt");
                }
                return null;
            case -1195558052:
                if (str.equals("COMMENTS_TERMS")) {
                    return m90703T0();
                }
                return null;
            case -1188200804:
                if (str.equals("ASSISTED_CURATION_SEARCH_EPISODES")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_EPISODES", "assisted-curation/search/episodes", 184, "assisted-curation");
                }
                return null;
            case -1166229748:
                if (str.equals("PODCAST_SPEED")) {
                    return m90662N1("PODCAST_SPEED", "podcast/speed", 1451, "podcast");
                }
                return null;
            case -1115286132:
                if (str.equals("GOLDENPATH_ZACKL")) {
                    return m90662N1("GOLDENPATH_ZACKL", "goldenpath/zackl", 745, "goldenpath");
                }
                return null;
            case -1104338660:
                if (str.equals("MRKT_BULK_CAMPAIGNS_DASHBOARD")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_DASHBOARD", "mrkt/bulk-campaigns/dashboard", 1144, "mrkt");
                }
                return null;
            case -1095177428:
                if (str.equals("PROFILE_TOP_ARTISTS")) {
                    return m90662N1("PROFILE_TOP_ARTISTS", "profile/top-artists", 1535, "profile");
                }
                return null;
            case -1094365188:
                if (str.equals("COURSE_REVIEW")) {
                    return m90662N1("COURSE_REVIEW", "course/review", 446, "course");
                }
                return null;
            case -1079989220:
                if (str.equals("AUDIOBOOK_CONSIDERATION")) {
                    return m90765c0();
                }
                return null;
            case -1071849956:
                if (str.equals("MRKT_ROSTER")) {
                    return m90662N1("MRKT_ROSTER", "mrkt/roster", 1253, "mrkt");
                }
                return null;
            case -1048256660:
                if (str.equals("SPOTIFLY")) {
                    return m90662N1("SPOTIFLY", "spotifly", 1869, "spotifly");
                }
                return null;
            case -967978596:
                if (str.equals("PARENTAL_CONTROL_LOGIN_OPTIONS")) {
                    return m90662N1("PARENTAL_CONTROL_LOGIN_OPTIONS", "parental-control/login-options", 1356, "parental-control");
                }
                return null;
            case -958169124:
                if (str.equals("ARTIST_ALBUMS")) {
                    return m90662N1("ARTIST_ALBUMS", "artist/albums", 157, "artist");
                }
                return null;
            case -940209972:
                if (str.equals("GOLDENPATH_MCAPANO")) {
                    return m90662N1("GOLDENPATH_MCAPANO", "goldenpath/mcapano", 682, "goldenpath");
                }
                return null;
            case -927601284:
                if (str.equals("SUPERBIRD_SETUP_CHECKFORUPDATES")) {
                    return m90662N1("SUPERBIRD_SETUP_CHECKFORUPDATES", "superbird/setup/checkforupdates", 1932, "superbird");
                }
                return null;
            case -910969108:
                if (str.equals("S4P_COMMENTS_DETAIL")) {
                    return m90662N1("S4P_COMMENTS_DETAIL", "s4p/comments-detail", 1636, "s4p");
                }
                return null;
            case -902500484:
                if (str.equals("MRKT_DEBUG_S4P_COMPONENT_REFERENCE")) {
                    return m90662N1("MRKT_DEBUG_S4P_COMPONENT_REFERENCE", "mrkt/debug/s4p/component-reference", 1172, "mrkt");
                }
                return null;
            case -881311620:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD_PREVIEW")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD_PREVIEW", "mrkt/artist/profile/image-gallery/add/preview", 1090, "mrkt");
                }
                return null;
            case -864757012:
                if (str.equals("UBI_DEBUG_MONITOR_JOURNEY")) {
                    return m90662N1("UBI_DEBUG_MONITOR_JOURNEY", "ubi/debug-monitor/journey", 1984, "ubi");
                }
                return null;
            case -848914404:
                if (str.equals("STUDIO_SANDBOX_SETUP")) {
                    return m90662N1("STUDIO_SANDBOX_SETUP", "studio/sandbox-setup", 1924, "studio");
                }
                return null;
            case -799753476:
                if (str.equals("SUPERBIRD_SETUP_CONNECTTOCAR")) {
                    return m90662N1("SUPERBIRD_SETUP_CONNECTTOCAR", "superbird/setup/connecttocar", 1934, "superbird");
                }
                return null;
            case -757236340:
                if (str.equals("CHALLENGE_DUMMY")) {
                    return m90662N1("CHALLENGE_DUMMY", "challenge/dummy", 284, "challenge");
                }
                return null;
            case -709714004:
                if (str.equals("NOTIFICATIONS_CENTER")) {
                    return m90789f3();
                }
                return null;
            case -666553972:
                if (str.equals("ENTITYSEGMENTS_CLIP")) {
                    return m90662N1("ENTITYSEGMENTS_CLIP", "entitysegments/clip", 503, "entitysegments");
                }
                return null;
            case -637840340:
                if (str.equals("CONNECT_TUTORIALCHROMECAST")) {
                    return m90662N1("CONNECT_TUTORIALCHROMECAST", "connect/tutorialchromecast", 392, "connect");
                }
                return null;
            case -630880244:
                if (str.equals("MRKT_LICENSOR_DISCOVERYMODE")) {
                    return m90662N1("MRKT_LICENSOR_DISCOVERYMODE", "mrkt/licensor/discoverymode", 1241, "mrkt");
                }
                return null;
            case -578358612:
                if (str.equals("GOLDENPATH_MIVICO")) {
                    return m90662N1("GOLDENPATH_MIVICO", "goldenpath/mivico", 689, "goldenpath");
                }
                return null;
            case -556786964:
                if (str.equals("PODCASTONBOARDING_SENDTOPICS")) {
                    return m90662N1("PODCASTONBOARDING_SENDTOPICS", "podcastonboarding/sendtopics", 1466, "podcastonboarding");
                }
                return null;
            case -546073108:
                if (str.equals("DYNAMIC_SESSION_ENTITY")) {
                    return m90662N1("DYNAMIC_SESSION_ENTITY", "dynamic-session/entity", 490, "dynamic-session");
                }
                return null;
            case -527867476:
                if (str.equals("ASSISTED_CURATION_SEARCH_PLAYLIST_ENTITY")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_PLAYLIST_ENTITY", "assisted-curation/search/playlist-entity", 185, "assisted-curation");
                }
                return null;
            case -497604980:
                if (str.equals("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT_RESERVED_BOOKING")) {
                    return m90662N1("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT_RESERVED_BOOKING", "adstudio/cold-start/review-and-submit/reserved-booking", 75, "adstudio");
                }
                return null;
            case -497469796:
                if (str.equals("UBI_DEBUG_MONITOR_EVENTDETAILS")) {
                    return m90662N1("UBI_DEBUG_MONITOR_EVENTDETAILS", "ubi/debug-monitor/eventdetails", 1982, "ubi");
                }
                return null;
            case -484675828:
                if (str.equals("PLAN_DETAILS")) {
                    return m90601E3();
                }
                return null;
            case -477800628:
                if (str.equals("CONNECT_PERMISSIONOVERLAY")) {
                    return m90662N1("CONNECT_PERMISSIONOVERLAY", "connect/permissionoverlay", 390, "connect");
                }
                return null;
            case -458770740:
                if (str.equals("MRKT_ARTIST_SONG_CITIES")) {
                    return m90662N1("MRKT_ARTIST_SONG_CITIES", "mrkt/artist/song/cities", AdvertisementDeliveryType.NATIONAL, "mrkt");
                }
                return null;
            case -437155076:
                if (str.equals("FREE_TIER_PLAYLIST")) {
                    return m90662N1("FREE_TIER_PLAYLIST", "free-tier-playlist", 558, "free-tier-playlist");
                }
                return null;
            case -410109268:
                if (str.equals("MRKT_ADD_TEAM")) {
                    return m90662N1("MRKT_ADD_TEAM", "mrkt/add-team", 998, "mrkt");
                }
                return null;
            case -330370388:
                if (str.equals("ADSTUDIO_EDIT_AD_SET_RESERVED_BOOKING")) {
                    return m90662N1("ADSTUDIO_EDIT_AD_SET_RESERVED_BOOKING", "adstudio/edit/ad-set/reserved-booking", 94, "adstudio");
                }
                return null;
            case -280067364:
                if (str.equals("PREMIUM_MESSAGING")) {
                    return m90662N1("PREMIUM_MESSAGING", "premium-messaging", 1499, "premium-messaging");
                }
                return null;
            case -265170276:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AUDIO")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AUDIO", "adstudio/duplicate-ad-set-only/ad-quick-audio", 85, "adstudio");
                }
                return null;
            case -262273732:
                if (str.equals("FITNESS_WORKOUT_SETTINGS")) {
                    return m90662N1("FITNESS_WORKOUT_SETTINGS", "fitness/workout-settings", 542, "fitness");
                }
                return null;
            case -165417460:
                if (str.equals("WATCHAPP_HOME")) {
                    return m90662N1("WATCHAPP_HOME", "watchapp/home", 2031, "watchapp");
                }
                return null;
            case -152925780:
                if (str.equals("LISTENINGHISTORY_PLAYSFROMCONTEXT")) {
                    return m90662N1("LISTENINGHISTORY_PLAYSFROMCONTEXT", "listeninghistory/playsfromcontext", 893, "listeninghistory");
                }
                return null;
            case -144213556:
                if (str.equals("MAGPIE_CAP")) {
                    return m90684Q2();
                }
                return null;
            case -89431172:
                if (str.equals("DIALOG_TERMS_TERMSCHANGED")) {
                    return m90662N1("DIALOG_TERMS_TERMSCHANGED", "dialog/terms/termschanged", 478, "dialog");
                }
                return null;
            case -37187108:
                if (str.equals("HARMONYPLAYER_NPV")) {
                    return m90662N1("HARMONYPLAYER_NPV", "harmonyplayer/npv", 763, "harmonyplayer");
                }
                return null;
            case -13579300:
                if (str.equals("SUPERBIRD_SETUP_CONNECTED")) {
                    return m90662N1("SUPERBIRD_SETUP_CONNECTED", "superbird/setup/connected", 1933, "superbird");
                }
                return null;
            case 2644956:
                if (str.equals("VTEC")) {
                    return m90771c6();
                }
                return null;
            case 44248364:
                if (str.equals("GOLDENPATH_SANDORD")) {
                    return m90662N1("GOLDENPATH_SANDORD", "goldenpath/sandord", 724, "goldenpath");
                }
                return null;
            case 63688380:
                if (str.equals("WEAR_ENTITY_PAGE_DEVICE_LIMIT_ERROR_SCREEN")) {
                    return m90662N1("WEAR_ENTITY_PAGE_DEVICE_LIMIT_ERROR_SCREEN", "wear/entity_page/device_limit_error_screen", 2065, "wear");
                }
                return null;
            case 80428684:
                if (str.equals("MRKT_ARTIST_SONG_ABOUT_THE_SONG_FEEDBACK")) {
                    return m90662N1("MRKT_ARTIST_SONG_ABOUT_THE_SONG_FEEDBACK", "mrkt/artist/song/about-the-song/feedback", 1100, "mrkt");
                }
                return null;
            case 149283628:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_RESETPASSWORDCONFIRMATION")) {
                    return m90662N1("LOGIN_ACCOUNTRECOVERY_RESETPASSWORDCONFIRMATION", "login/accountrecovery/resetpasswordconfirmation", 917, "login");
                }
                return null;
            case 202503324:
                if (str.equals("GOLDENPATH_BOOTGLAMP")) {
                    return m90662N1("GOLDENPATH_BOOTGLAMP", "goldenpath/bootglamp", 607, "goldenpath");
                }
                return null;
            case 219509068:
                if (str.equals("CONNECT_TUTORIALSPEAKER")) {
                    return m90662N1("CONNECT_TUTORIALSPEAKER", "connect/tutorialspeaker", 395, "connect");
                }
                return null;
            case 254904556:
                if (str.equals("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE_NO_ARTIST_REDIRECT")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE_NO_ARTIST_REDIRECT", "mrkt/artist/audience/active-audience/no-artist-redirect", 1005, "mrkt");
                }
                return null;
            case 274231388:
                if (str.equals("MANAGE_CREATE_INVITE_PAGE")) {
                    return m90662N1("MANAGE_CREATE_INVITE_PAGE", "manage/create-invite-page", 965, "manage");
                }
                return null;
            case 289450220:
                if (str.equals("CONTRIBUTION_NOTES_MANAGE_MENU")) {
                    return m90847o1();
                }
                return null;
            case 401399484:
                if (str.equals("BUNDLING_OFFER")) {
                    return m90662N1("BUNDLING_OFFER", "bundling/offer", 251, "bundling");
                }
                return null;
            case 406583324:
                if (str.equals("WATCHAPP_END_SONGS_LIMIT_REACHED")) {
                    return m90662N1("WATCHAPP_END_SONGS_LIMIT_REACHED", "watchapp/end-songs-limit-reached", 2026, "watchapp");
                }
                return null;
            case 430071148:
                if (str.equals("MRKT_ARTIST_RELEASE_STATS_PRE_RELEASE")) {
                    return m90662N1("MRKT_ARTIST_RELEASE_STATS_PRE_RELEASE", "mrkt/artist/release/stats/pre-release", 1098, "mrkt");
                }
                return null;
            case 447200748:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_WELCOME")) {
                    return m90662N1("SPOTIFYBUTTON_ACTIVATION_WELCOME", "spotifybutton/activation/welcome", 1898, "spotifybutton");
                }
                return null;
            case 556378012:
                if (str.equals("OFFLINE_PLAYABLE_ARTIST")) {
                    return m90662N1("OFFLINE_PLAYABLE_ARTIST", "offline-playable-artist", 1325, "offline-playable-artist");
                }
                return null;
            case 584279004:
                if (str.equals("RADIO_STATION_CREATE_TRACKS")) {
                    return m90662N1("RADIO_STATION_CREATE_TRACKS", "radio/station/create/tracks", 1566, "radio");
                }
                return null;
            case 646232812:
                if (str.equals("ADSTUDIO_COLD_START_AD_RESERVED_BOOKING")) {
                    return m90662N1("ADSTUDIO_COLD_START_AD_RESERVED_BOOKING", "adstudio/cold-start/ad/reserved-booking", 70, "adstudio");
                }
                return null;
            case 681209052:
                if (str.equals("PROACTIVE_PLATFORMS_TRANSSION_NPV_WIDGET")) {
                    return m90662N1("PROACTIVE_PLATFORMS_TRANSSION_NPV_WIDGET", "proactive-platforms/transsion-npv-widget", 1513, "proactive-platforms");
                }
                return null;
            case 724050332:
                if (str.equals("OVERLAY_SHUFFLEPLAYLIST")) {
                    return m90662N1("OVERLAY_SHUFFLEPLAYLIST", "overlay/shuffleplaylist", 1339, "overlay");
                }
                return null;
            case 724219292:
                if (str.equals("FINDFRIENDS")) {
                    return m90662N1("FINDFRIENDS", "findfriends", 541, "findfriends");
                }
                return null;
            case 759268028:
                if (str.equals("MRKT_TEAM_SWITCHER_DEBUG_SETTINGS")) {
                    return m90662N1("MRKT_TEAM_SWITCHER_DEBUG_SETTINGS", "mrkt/team-switcher/debug-settings", 1269, "mrkt");
                }
                return null;
            case 789511244:
                if (str.equals("CARS_BMW")) {
                    return m90662N1("CARS_BMW", "cars/bmw", 272, "cars");
                }
                return null;
            case 818195980:
                if (str.equals("GOLDENPATH_JROULEAU")) {
                    return m90662N1("GOLDENPATH_JROULEAU", "goldenpath/jrouleau", 658, "goldenpath");
                }
                return null;
            case 819683900:
                if (str.equals("BLUEJAY_CONNECTOR_APPS_AUTHENTICATION")) {
                    return m90859q0();
                }
                return null;
            case 834291532:
                if (str.equals("AGE_ASSURANCE_CANCEL")) {
                    return m90662N1("AGE_ASSURANCE_CANCEL", "age-assurance/cancel", ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, "age-assurance");
                }
                return null;
            case 855185420:
                if (str.equals("LISTENINGPARTY_CHAT")) {
                    return m90572A2();
                }
                return null;
            case 959090972:
                if (str.equals("ADSTUDIO_DASHBOARD_AD_SETS")) {
                    return m90662N1("ADSTUDIO_DASHBOARD_AD_SETS", "adstudio/dashboard/ad-sets", 78, "adstudio");
                }
                return null;
            case 1070340556:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_AD", "adstudio/duplicate-ad-set-with-ads/ad", 88, "adstudio");
                }
                return null;
            case 1094647516:
                if (str.equals("KID_ACCOUNT_TRANSITION_BIRTHDAY")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_BIRTHDAY", "kid-account-transition/birthday", 864, "kid-account-transition");
                }
                return null;
            case 1139109132:
                if (str.equals("FORMATLISTPLATFORM_OFFLINE")) {
                    return m90662N1("FORMATLISTPLATFORM_OFFLINE", "formatlistplatform/offline", 546, "formatlistplatform");
                }
                return null;
            case 1142446284:
                if (str.equals("WEAR_OUTPUT_PICKER")) {
                    return m90662N1("WEAR_OUTPUT_PICKER", "wear/output_picker", 2073, "wear");
                }
                return null;
            case 1154063084:
                if (str.equals("JAM_JOINJAMDEVICESELECTIONSHEET")) {
                    return m90662N1("JAM_JOINJAMDEVICESELECTIONSHEET", "jam/joinjamdeviceselectionsheet", 838, "jam");
                }
                return null;
            case 1203849292:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_UPLOAD")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_UPLOAD", "spotify-for-authors/dvn-creation/upload", 1883, "spotify-for-authors");
                }
                return null;
            case 1213515084:
                if (str.equals("S4P_ANALYTICS_GEO_LOCATION")) {
                    return m90662N1("S4P_ANALYTICS_GEO_LOCATION", "s4p/analytics/geo-location", 1610, "s4p");
                }
                return null;
            case 1349375516:
                if (str.equals("COLLECTION_PODCASTSONLY")) {
                    return m90662N1("COLLECTION_PODCASTSONLY", "collection/podcastsonly", 353, "collection");
                }
                return null;
            case 1355508812:
                if (str.equals("LOGIN_WELCOME")) {
                    return m90662N1("LOGIN_WELCOME", "login/welcome", 939, "login");
                }
                return null;
            case 1367935868:
                if (str.equals("CONTEXTMENU_AUTHOR")) {
                    return m90780e1();
                }
                return null;
            case 1415057068:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_REVIEW_AND_SUBMIT")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_REVIEW_AND_SUBMIT", "adstudio/add-to-existing-campaign/review-and-submit", 46, "adstudio");
                }
                return null;
            case 1419692556:
                if (str.equals("CONTEXTMENU_COURSE")) {
                    return m90662N1("CONTEXTMENU_COURSE", "contextmenu/course", 410, "contextmenu");
                }
                return null;
            case 1462643292:
                if (str.equals("AIDJ_INTERACTIVITY_CONTAINER")) {
                    return m90681Q();
                }
                return null;
            case 1562909260:
                if (str.equals("ASSISTED_CURATION")) {
                    return m90737Y();
                }
                return null;
            case 1612335884:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_DM", "mrkt/artist/campaigns/dm", 1021, "mrkt");
                }
                return null;
            case 1621174060:
                if (str.equals("MANAGED_ACCOUNT_LINKING_TEEN_EDUCATION")) {
                    return m90662N1("MANAGED_ACCOUNT_LINKING_TEEN_EDUCATION", "managed-account-linking/teen-education", 980, "managed-account-linking");
                }
                return null;
            case 1651592716:
                if (str.equals("ONBOARDING_OVERLAY")) {
                    return m90662N1("ONBOARDING_OVERLAY", "onboarding/overlay", 1330, "onboarding");
                }
                return null;
            case 1660978636:
                if (str.equals("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS_COLLAPSED")) {
                    return m90662N1("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS_COLLAPSED", "settings/notifications/category-details-collapsed", 1777, "settings");
                }
                return null;
            case 1781578444:
                if (str.equals("START_CHOOSESIGNUP")) {
                    return m90662N1("START_CHOOSESIGNUP", "start/choosesignup", 1914, "start");
                }
                return null;
            case 1791813900:
                if (str.equals("CONTEXTMENU_POSTTO")) {
                    return m90662N1("CONTEXTMENU_POSTTO", "contextmenu/postto", 423, "contextmenu");
                }
                return null;
            case 1794945516:
                if (str.equals("LOCALFILES")) {
                    return m90662N1("LOCALFILES", "localfiles", 909, "localfiles");
                }
                return null;
            case 1797507724:
                if (str.equals("OAUTH_PAIR_CONNECTED")) {
                    return m90662N1("OAUTH_PAIR_CONNECTED", "oauth/pair/connected", 1320, "oauth");
                }
                return null;
            case 1798957196:
                if (str.equals("PERSONALISED_SET")) {
                    return m90662N1("PERSONALISED_SET", "personalised-set", 1382, "personalised-set");
                }
                return null;
            case 1822177036:
                if (str.equals("COLLECTION_YOUREPISODES")) {
                    return m90662N1("COLLECTION_YOUREPISODES", "collection/yourepisodes", 359, "collection");
                }
                return null;
            case 1916580540:
                if (str.equals("LISTENINGSTATS_HIGHLIGHT_DETAILS")) {
                    return m90593D2();
                }
                return null;
            case 1928779692:
                if (str.equals("MRKT_BTC_BOOKING_BTC")) {
                    return m90662N1("MRKT_BTC_BOOKING_BTC", "mrkt/btc/booking/btc", 1137, "mrkt");
                }
                return null;
            case 1939949724:
                if (str.equals("MRKT_ARTIST_SONG_STATS")) {
                    return m90662N1("MRKT_ARTIST_SONG_STATS", "mrkt/artist/song/stats", 1107, "mrkt");
                }
                return null;
            case 1964346876:
                if (str.equals("S4P_INTERACT_SETTINGS")) {
                    return m90662N1("S4P_INTERACT_SETTINGS", "s4p/interact/settings", 1661, "s4p");
                }
                return null;
            case 2021288252:
                if (str.equals("SUPPORT_SITE_CONTACT_US_ARTICLE")) {
                    return m90662N1("SUPPORT_SITE_CONTACT_US_ARTICLE", "support-site/contact-us-article", 1952, "support-site");
                }
                return null;
            case 2054155852:
                if (str.equals("ATV_PIN_ENTRY")) {
                    return m90662N1("ATV_PIN_ENTRY", "atv-pin-entry", 189, "atv-pin-entry");
                }
                return null;
            case 2067658284:
                if (str.equals("SETTINGS_THIRD_PARTY_LIBRARIES")) {
                    return m90839m5();
                }
                return null;
            case 2096410044:
                if (str.equals("COLLECTION_RECENTLYPLAYED")) {
                    return m90662N1("COLLECTION_RECENTLYPLAYED", "collection/recentlyplayed", 355, "collection");
                }
                return null;
            case 2129298844:
                if (str.equals("TV_DIALOG_EXIT_CONFIRMATION")) {
                    return m90662N1("TV_DIALOG_EXIT_CONFIRMATION", "tv/dialog/exit-confirmation", 1979, "tv");
                }
                return null;
            case 2131530972:
                if (str.equals("S4P_EPISODES_SELECT_CLIP")) {
                    return m90662N1("S4P_EPISODES_SELECT_CLIP", "s4p/episodes/select/clip", 1652, "s4p");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: O */
    public static cbm0 m90667O() {
        return m90662N1("AGE_ASSURANCE_UNDERAGE_BLOCKING", "age-assurance/underage/blocking", 127, "age-assurance");
    }

    /* JADX INFO: renamed from: O0 */
    public static cbm0 m90668O0() {
        return m90662N1("COLLECTION_ARTISTS_ARTIST", "collection/artists/artist", 340, "collection");
    }

    /* JADX INFO: renamed from: O1 */
    public static z900 m90669O1(oyz oyzVar, SQLiteDatabase sQLiteDatabase) {
        z900 z900Var = (z900) oyzVar.f171916b;
        if (z900Var != null && z900Var.f280635a.equals(sQLiteDatabase)) {
            return z900Var;
        }
        z900 z900Var2 = new z900(sQLiteDatabase);
        oyzVar.f171916b = z900Var2;
        return z900Var2;
    }

    /* JADX INFO: renamed from: O2 */
    public static cbm0 m90670O2() {
        return m90662N1("MAGPIE_ASSISTANCE", "magpie/assistance", 950, "magpie");
    }

    /* JADX INFO: renamed from: O3 */
    public static cbm0 m90671O3() {
        return m90662N1("PLAYLIST_CREATE_EUTERPE_REPORT_A_PROBLEM", "playlist/create/euterpe-report-a-problem", 1404, "playlist");
    }

    /* JADX INFO: renamed from: O4 */
    public static cbm0 m90672O4() {
        return m90662N1("REINVENTFREE_FMA_UPSELL", "reinventfree-fma-upsell", 1582, "reinventfree-fma-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: O5 */
    public static cbm0 m90673O5(String str) {
        switch (str.hashCode()) {
            case -2126728339:
                if (str.equals("ADSTUDIO_CHANGE_HISTORY_ALL")) {
                    return m90662N1("ADSTUDIO_CHANGE_HISTORY_ALL", "adstudio/change-history/all", 62, "adstudio");
                }
                return null;
            case -2075076035:
                if (str.equals("PODCASTMIX_CONTROLS")) {
                    return m90662N1("PODCASTMIX_CONTROLS", "podcastmix/controls", 1461, "podcastmix");
                }
                return null;
            case -2059278499:
                if (str.equals("FREETIER_TASTEONBOARDING_LIKEDARTISTS")) {
                    return m90662N1("FREETIER_TASTEONBOARDING_LIKEDARTISTS", "freetier/tasteonboarding/likedartists", 570, "freetier");
                }
                return null;
            case -2027237747:
                if (str.equals("MRKT_ARTIST_MUSIC_RELEASES")) {
                    return m90662N1("MRKT_ARTIST_MUSIC_RELEASES", "mrkt/artist/music/releases", 1056, "mrkt");
                }
                return null;
            case -1977365587:
                if (str.equals("AGE_ASSURANCE")) {
                    return m90646L();
                }
                return null;
            case -1975741747:
                if (str.equals("SONG_DNA")) {
                    return m90662N1("SONG_DNA", "song-dna", 1856, "song-dna");
                }
                return null;
            case -1951118835:
                if (str.equals("SUPERBIRD_SETUP_SEARCHING")) {
                    return m90662N1("SUPERBIRD_SETUP_SEARCHING", "superbird/setup/searching", 1945, "superbird");
                }
                return null;
            case -1923625043:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTDETAILS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTDETAILS", "www-account-pages/parental-settings/managedaccountdetails", 2147, "www-account-pages");
                }
                return null;
            case -1862564211:
                if (str.equals("JAM_PENDINGREQUESTSSHEET")) {
                    return m90875s2();
                }
                return null;
            case -1842429523:
                if (str.equals("SPOTIT")) {
                    return m90662N1("SPOTIT", "spotit", 1899, "spotit");
                }
                return null;
            case -1832567171:
                if (str.equals("GUEST_LOGINTABWALL")) {
                    return m90662N1("GUEST_LOGINTABWALL", "guest/logintabwall", 759, "guest");
                }
                return null;
            case -1788495155:
                if (str.equals("WATCHFEED")) {
                    return m90778d6();
                }
                return null;
            case -1785066387:
                if (str.equals("UPSELL")) {
                    return m90624H5();
                }
                return null;
            case -1707761635:
                if (str.equals("SRC_CREATOR_DISPUTES")) {
                    return m90662N1("SRC_CREATOR_DISPUTES", "src/creator/disputes", 1904, "src");
                }
                return null;
            case -1705662979:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_SUCCESS")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_UPLOAD_SUCCESS", "mrkt/bulk-campaigns/upload/success", 1152, "mrkt");
                }
                return null;
            case -1701024467:
                if (str.equals("WWW_ACCOUNT_PAGES_CANCEL_SUBSCRIPTION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_CANCEL_SUBSCRIPTION", "www-account-pages/cancel-subscription", 2112, "www-account-pages");
                }
                return null;
            case -1639447363:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT")) {
                    return m90797g4();
                }
                return null;
            case -1592174035:
                if (str.equals("OURSONG_RECEIVER")) {
                    return m90662N1("OURSONG_RECEIVER", "oursong/receiver", 1336, "oursong");
                }
                return null;
            case -1561301923:
                if (str.equals("MANAGE_TEAM_MEMBERS_PAGE")) {
                    return m90662N1("MANAGE_TEAM_MEMBERS_PAGE", "manage/team-members-page", 972, "manage");
                }
                return null;
            case -1558630291:
                if (str.equals("AUDIOBOOK_SUPPLEMENTARYCONTENTREADER")) {
                    return m90662N1("AUDIOBOOK_SUPPLEMENTARYCONTENTREADER", "audiobook/supplementarycontentreader", 200, "audiobook");
                }
                return null;
            case -1538646915:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_DOWNLOAD")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_DOWNLOAD", "mrkt/discovery-mode/unified-buying/update/csv/download", 1180, "mrkt");
                }
                return null;
            case -1530889987:
                if (str.equals("WRAPPED_ENTITY")) {
                    return m90662N1("WRAPPED_ENTITY", "wrapped/entity", 2102, "wrapped");
                }
                return null;
            case -1505783699:
                if (str.equals("YOURLIBRARY_MESSAGING")) {
                    return m90806h6();
                }
                return null;
            case -1484279299:
                if (str.equals("WATCHAPP_ALIGNED_CURATION")) {
                    return m90662N1("WATCHAPP_ALIGNED_CURATION", "watchapp/aligned-curation", 2018, "watchapp");
                }
                return null;
            case -1453977795:
                if (str.equals("ADSTUDIO_AD_SET_ADS")) {
                    return m90662N1("ADSTUDIO_AD_SET_ADS", "adstudio/ad-set/ads", 33, "adstudio");
                }
                return null;
            case -1421664243:
                if (str.equals("S4P_INTERACT_COMMENTS_INSIGHTS")) {
                    return m90662N1("S4P_INTERACT_COMMENTS_INSIGHTS", "s4p/interact/comments-insights", 1659, "s4p");
                }
                return null;
            case -1348837187:
                if (str.equals("WWW_ACCOUNT_PAGES_SAMPLEINAPP")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_SAMPLEINAPP", "www-account-pages/sampleinapp", 2161, "www-account-pages");
                }
                return null;
            case -1299615907:
                if (str.equals("PODCAST_EPISODE_LOADING")) {
                    return m90662N1("PODCAST_EPISODE_LOADING", "podcast/episode/loading", 1432, "podcast");
                }
                return null;
            case -1297157683:
                if (str.equals("S4P_BLOCKED_WORDS_COMMENTS")) {
                    return m90662N1("S4P_BLOCKED_WORDS_COMMENTS", "s4p/blocked-words-comments", 1626, "s4p");
                }
                return null;
            case -1274957891:
                if (str.equals("NOWPLAYING_NOWPLAYINGSIDEBAR")) {
                    return m90810i3();
                }
                return null;
            case -1166971043:
                if (str.equals("S4P_ANALYTICS_MILESTONE_FOLLOWERS")) {
                    return m90662N1("S4P_ANALYTICS_MILESTONE_FOLLOWERS", "s4p/analytics/milestone/followers", 1613, "s4p");
                }
                return null;
            case -1136101571:
                if (str.equals("GOLDENPATH_COLES")) {
                    return m90662N1("GOLDENPATH_COLES", "goldenpath/coles", 613, "goldenpath");
                }
                return null;
            case -1110300963:
                if (str.equals("JAM_ADSDISCLAIMERSHEET")) {
                    return m90662N1("JAM_ADSDISCLAIMERSHEET", "jam/adsdisclaimersheet", 832, "jam");
                }
                return null;
            case -1081868979:
                if (str.equals("KID_ACCOUNT_CREATION_WELCOME")) {
                    return m90662N1("KID_ACCOUNT_CREATION_WELCOME", "kid-account-creation/welcome", 861, "kid-account-creation");
                }
                return null;
            case -1056025651:
                if (str.equals("NOWPLAYING_HISTORY")) {
                    return m90662N1("NOWPLAYING_HISTORY", "nowplaying/history", 1307, "nowplaying");
                }
                return null;
            case -1022820755:
                if (str.equals("S4P_FORCED_UPGRADES")) {
                    return m90662N1("S4P_FORCED_UPGRADES", "s4p/forced-upgrades", 1655, "s4p");
                }
                return null;
            case -982148019:
                if (str.equals("GOLDENPATH_MARCINH")) {
                    return m90662N1("GOLDENPATH_MARCINH", "goldenpath/marcinh", 674, "goldenpath");
                }
                return null;
            case -962810179:
                if (str.equals("YOURSPOTIFY_DISCOVEREDFEATURES")) {
                    return m90662N1("YOURSPOTIFY_DISCOVEREDFEATURES", "yourspotify/discoveredfeatures", 2192, "yourspotify");
                }
                return null;
            case -924137955:
                if (str.equals("PODCASTONBOARDING_TOPICPICKER")) {
                    return m90662N1("PODCASTONBOARDING_TOPICPICKER", "podcastonboarding/topicpicker", 1467, "podcastonboarding");
                }
                return null;
            case -912692947:
                if (str.equals("GOLDENPATH_BELLERINAH")) {
                    return m90662N1("GOLDENPATH_BELLERINAH", "goldenpath/bellerinah", ContentDeliverySubscriptionType.PREMIUM, "goldenpath");
                }
                return null;
            case -889038035:
                if (str.equals("WWW_ACCOUNT_PAGES_PREMIUM_SUBSCRIPTION_MANAGEMENT_COMPONENTS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PREMIUM_SUBSCRIPTION_MANAGEMENT_COMPONENTS", "www-account-pages/premium-subscription-management-components", 2154, "www-account-pages");
                }
                return null;
            case -881387155:
                if (str.equals("SRC_RIGHTSHOLDER_TRACK_DETAILS")) {
                    return m90662N1("SRC_RIGHTSHOLDER_TRACK_DETAILS", "src/rightsholder/track/details", 1909, "src");
                }
                return null;
            case -837776675:
                if (str.equals("GRADUATION_POSTPONED")) {
                    return m90662N1("GRADUATION_POSTPONED", "graduation/postponed", 752, "graduation");
                }
                return null;
            case -764583379:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AUDIO")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AUDIO", "adstudio/add-to-existing-ad-set/ad-quick-audio", 42, "adstudio");
                }
                return null;
            case -705723603:
                if (str.equals("SHOWS_AUDIO")) {
                    return m90851o5();
                }
                return null;
            case -700116867:
                if (str.equals("MRKT_PLAYLIST_REPORTER")) {
                    return m90662N1("MRKT_PLAYLIST_REPORTER", "mrkt/playlist-reporter", 1249, "mrkt");
                }
                return null;
            case -677190035:
                if (str.equals("CONTEXTMENU_VIDEOSETTINGS")) {
                    return m90662N1("CONTEXTMENU_VIDEOSETTINGS", "contextmenu/videosettings", 430, "contextmenu");
                }
                return null;
            case -664954083:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_DEVICESCANNING")) {
                    return m90662N1("SPOTIFYBUTTON_ACTIVATION_DEVICESCANNING", "spotifybutton/activation/devicescanning", 1895, "spotifybutton");
                }
                return null;
            case -619574403:
                if (str.equals("MRKT_ARTIST_MERCH_NO_ARTIST_REDIRECT")) {
                    return m90662N1("MRKT_ARTIST_MERCH_NO_ARTIST_REDIRECT", "mrkt/artist/merch/no-artist-redirect", 1051, "mrkt");
                }
                return null;
            case -619208611:
                if (str.equals("OAUTH_PAIR_CONSENT")) {
                    return m90662N1("OAUTH_PAIR_CONSENT", "oauth/pair/consent", 1321, "oauth");
                }
                return null;
            case -550292899:
                if (str.equals("GOLDENPATH_NICKYB")) {
                    return m90662N1("GOLDENPATH_NICKYB", "goldenpath/nickyb", 703, "goldenpath");
                }
                return null;
            case -490290483:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_RESPONDTOGRADUATIONREQUEST")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_RESPONDTOGRADUATIONREQUEST", "www-account-pages/genalpha/respondtograduationrequest", 2128, "www-account-pages");
                }
                return null;
            case -477143619:
                if (str.equals("MRKT_FRONTDOOR_COUNTDOWN_PAGES")) {
                    return m90662N1("MRKT_FRONTDOOR_COUNTDOWN_PAGES", "mrkt/frontdoor/countdown-pages", AdvertisementOwner.DISTRIBUTOR, "mrkt");
                }
                return null;
            case -428581459:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REPORTS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REPORTS", "spotify-for-authors/audiobook/reports", 1875, "spotify-for-authors");
                }
                return null;
            case -411670275:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS", "mrkt/artist/video/music-videos", 1117, "mrkt");
                }
                return null;
            case -373732339:
                if (str.equals("INAPPMESSAGE_HTML_MODAL")) {
                    return m90842n2();
                }
                return null;
            case -335354995:
                if (str.equals("LISTENINGACTIVITY_DETAILS")) {
                    return m90662N1("LISTENINGACTIVITY_DETAILS", "listeningactivity/details", 887, "listeningactivity");
                }
                return null;
            case -329916403:
                if (str.equals("PHONENUMBER_VALIDATEOTP")) {
                    return m90662N1("PHONENUMBER_VALIDATEOTP", "phonenumber/validateotp", 1386, "phonenumber");
                }
                return null;
            case -315477715:
                if (str.equals("EXTERNAL_GOOGLE")) {
                    return m90620H1();
                }
                return null;
            case -294664963:
                if (str.equals("COLLECTION_SONGS")) {
                    return m90662N1("COLLECTION_SONGS", "collection/songs", 357, "collection");
                }
                return null;
            case -277586371:
                if (str.equals("GOLDENPATH_FEDERICAC")) {
                    return m90662N1("GOLDENPATH_FEDERICAC", "goldenpath/federicac", 630, "goldenpath");
                }
                return null;
            case -254627699:
                if (str.equals("CACHED_FILES_SEARCH")) {
                    return m90662N1("CACHED_FILES_SEARCH", "cached-files/search", 258, "cached-files");
                }
                return null;
            case -237995411:
                if (str.equals("MRKT_FRONTDOOR_ANALYTICS")) {
                    return m90662N1("MRKT_FRONTDOOR_ANALYTICS", "mrkt/frontdoor/analytics", 1193, "mrkt");
                }
                return null;
            case -227080499:
                if (str.equals("FREE_TIER_PLAYLIST_ONDEMAND")) {
                    return m90662N1("FREE_TIER_PLAYLIST_ONDEMAND", "free-tier-playlist/ondemand", 559, "free-tier-playlist");
                }
                return null;
            case -226391731:
                if (str.equals("S4P_ANALYTICS_WIDGET")) {
                    return m90662N1("S4P_ANALYTICS_WIDGET", "s4p/analytics-widget", 1609, "s4p");
                }
                return null;
            case -203937843:
                if (str.equals("MRKT_TEAM_ACCESS_PENDING")) {
                    return m90662N1("MRKT_TEAM_ACCESS_PENDING", "mrkt/team/access/pending", 1273, "mrkt");
                }
                return null;
            case -169247139:
                if (str.equals("MRKT_ARTIST_MUSIC_UPCOMING")) {
                    return m90662N1("MRKT_ARTIST_MUSIC_UPCOMING", "mrkt/artist/music/upcoming", 1059, "mrkt");
                }
                return null;
            case -109010595:
                if (str.equals("FILTERANDSORT")) {
                    return m90648L1();
                }
                return null;
            case -93298003:
                if (str.equals("ENHANCED_SESSION")) {
                    return m90662N1("ENHANCED_SESSION", "enhanced-session", 498, "enhanced-session");
                }
                return null;
            case -92656035:
                if (str.equals("GOLDENPATH_NATHANB")) {
                    return m90662N1("GOLDENPATH_NATHANB", "goldenpath/nathanb", ContentDeliveryComposition.CLEAN, "goldenpath");
                }
                return null;
            case -1595507:
                if (str.equals("NOWPLAYING_LIVEROOMNOWPLAYINGBAR")) {
                    return m90662N1("NOWPLAYING_LIVEROOMNOWPLAYINGBAR", "nowplaying/liveroomnowplayingbar", 1308, "nowplaying");
                }
                return null;
            case 11477261:
                if (str.equals("DIALOG_CONNECTXAUTH")) {
                    return m90662N1("DIALOG_CONNECTXAUTH", "dialog/connectxauth", 466, "dialog");
                }
                return null;
            case 13325245:
                if (str.equals("RUNNING_SETUP")) {
                    return m90662N1("RUNNING_SETUP", "running/setup", 1605, "running");
                }
                return null;
            case 29621021:
                if (str.equals("PLAYBACK_TIMEOUT")) {
                    return m90622H3();
                }
                return null;
            case 43022717:
                if (str.equals("FREE_TIER_EDIT_PLAYLIST")) {
                    return m90662N1("FREE_TIER_EDIT_PLAYLIST", "free-tier-edit-playlist", 552, "free-tier-edit-playlist");
                }
                return null;
            case 88691165:
                if (str.equals("MRKT_APP_SETTINGS_SELECT_ARTIST")) {
                    return m90662N1("MRKT_APP_SETTINGS_SELECT_ARTIST", "mrkt/app-settings/select-artist", 1001, "mrkt");
                }
                return null;
            case 106845501:
                if (str.equals("JAM_CANCELJOINREQUESTSHEET")) {
                    return m90662N1("JAM_CANCELJOINREQUESTSHEET", "jam/canceljoinrequestsheet", 833, "jam");
                }
                return null;
            case 161791581:
                if (str.equals("MRKT_LICENSOR_DISCOVERYMODE_EDIT")) {
                    return m90662N1("MRKT_LICENSOR_DISCOVERYMODE_EDIT", "mrkt/licensor/discoverymode/edit", 1243, "mrkt");
                }
                return null;
            case 198425565:
                if (str.equals("ONLYYOU_DATASTORIES")) {
                    return m90662N1("ONLYYOU_DATASTORIES", "onlyyou/datastories", 1332, "onlyyou");
                }
                return null;
            case 199608973:
                if (str.equals("CONCERTS")) {
                    return m90717V0();
                }
                return null;
            case 236626381:
                if (str.equals("IRONCHEF_CREATE")) {
                    return m90662N1("IRONCHEF_CREATE", "ironchef/create", 826, "ironchef");
                }
                return null;
            case 242815389:
                if (str.equals("PODCAST_EPISODE_DESCRIPTION")) {
                    return m90662N1("PODCAST_EPISODE_DESCRIPTION", "podcast/episode/description", 1431, "podcast");
                }
                return null;
            case 246310989:
                if (str.equals("STUDIO_RESEARCH_PREVIEW")) {
                    return m90662N1("STUDIO_RESEARCH_PREVIEW", "studio/research-preview", 1923, "studio");
                }
                return null;
            case 286621645:
                if (str.equals("MRKT_BILLING_DETAILS")) {
                    return m90662N1("MRKT_BILLING_DETAILS", "mrkt/billing/details", 1135, "mrkt");
                }
                return null;
            case 288597357:
                if (str.equals("SIGNUP_AGECONFIRMATION")) {
                    return m90662N1("SIGNUP_AGECONFIRMATION", "signup/ageconfirmation", 1825, "signup");
                }
                return null;
            case 428323053:
                if (str.equals("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DRAFT")) {
                    return m90662N1("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DRAFT", "mrkt/third-party-agency/campaigns/draft", 1277, "mrkt");
                }
                return null;
            case 433120333:
                if (str.equals("VOTING_CONFIRMATION")) {
                    return m90662N1("VOTING_CONFIRMATION", "voting/confirmation", 2012, "voting");
                }
                return null;
            case 444235693:
                if (str.equals("SHOWCASE")) {
                    return m90662N1("SHOWCASE", "showcase", 1808, "showcase");
                }
                return null;
            case 451800349:
                if (str.equals("KID_ACCOUNT_CREATION_ENTRY")) {
                    return m90662N1("KID_ACCOUNT_CREATION_ENTRY", "kid-account-creation/entry", 854, "kid-account-creation");
                }
                return null;
            case 451829997:
                if (str.equals("RADIO_STATION_CREATE_PLAYLISTS")) {
                    return m90662N1("RADIO_STATION_CREATE_PLAYLISTS", "radio/station/create/playlists", 1564, "radio");
                }
                return null;
            case 476993517:
                if (str.equals("KID_ACCOUNT_CREATION_USER_INFO")) {
                    return m90662N1("KID_ACCOUNT_CREATION_USER_INFO", "kid-account-creation/user-info", 860, "kid-account-creation");
                }
                return null;
            case 479397085:
                if (str.equals("ENTITYSEGMENTS_CLIP_EDIT")) {
                    return m90592D1();
                }
                return null;
            case 485394573:
                if (str.equals("HIFI_METERED_SHEET")) {
                    return m90662N1("HIFI_METERED_SHEET", "hifi/metered-sheet", 767, "hifi");
                }
                return null;
            case 496599581:
                if (str.equals("SHOWS_FORMAT_LIST")) {
                    return m90662N1("SHOWS_FORMAT_LIST", "shows/format/list", 1814, "shows");
                }
                return null;
            case 528814557:
                if (str.equals("BOOKMARKS")) {
                    return m90662N1("BOOKMARKS", "bookmarks", AdvertisementType.BRANDED_AS_CONTENT, "bookmarks");
                }
                return null;
            case 546412989:
                if (str.equals("TERMS_TERMSINFO")) {
                    return m90662N1("TERMS_TERMSINFO", "terms/termsinfo", 1969, "terms");
                }
                return null;
            case 552323997:
                if (str.equals("EMAIL_EDIT_SSO")) {
                    return m90662N1("EMAIL_EDIT_SSO", "email/edit/sso", 493, "email");
                }
                return null;
            case 588159533:
                if (str.equals("PARENTAL_CONTROL_REVIEW_ALLOWLISTING_REQUESTS")) {
                    return m90918y3();
                }
                return null;
            case 596430045:
                if (str.equals("MEDIA_TRIMMER")) {
                    return m90740Y2();
                }
                return null;
            case 613070269:
                if (str.equals("CHALLENGE_HASHCASH")) {
                    return m90662N1("CHALLENGE_HASHCASH", "challenge/hashcash", 288, "challenge");
                }
                return null;
            case 733922797:
                if (str.equals("MRKT_FRONTDOOR_DISPLAY_CAMPAIGNS")) {
                    return m90662N1("MRKT_FRONTDOOR_DISPLAY_CAMPAIGNS", "mrkt/frontdoor/display-campaigns", AdvertisementOwner.MULTIPLE, "mrkt");
                }
                return null;
            case 759414125:
                if (str.equals("LISTENINGACTIVITY_GROUP_DETAILS")) {
                    return m90662N1("LISTENINGACTIVITY_GROUP_DETAILS", "listeningactivity/group/details", 889, "listeningactivity");
                }
                return null;
            case 791908989:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY_CREATE")) {
                    return m90662N1("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY_CREATE", "mrkt/dm-managed-service/eligibility/create", 1190, "mrkt");
                }
                return null;
            case 832990957:
                if (str.equals("PORTAL_SEARCH_DATA_ENDPOINTS")) {
                    return m90662N1("PORTAL_SEARCH_DATA_ENDPOINTS", "portal/search-data-endpoints", 1475, "portal");
                }
                return null;
            case 845715501:
                if (str.equals("PLAYLIST_MIXING_LATER_IN_PLAYLIST")) {
                    return m90662N1("PLAYLIST_MIXING_LATER_IN_PLAYLIST", "playlist/mixing-later-in-playlist", 1413, "playlist");
                }
                return null;
            case 856952109:
                if (str.equals("SPOTIFY_FOR_AUTHORS_ONBOARDING")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_ONBOARDING", "spotify-for-authors/onboarding", 1886, "spotify-for-authors");
                }
                return null;
            case 978049229:
                if (str.equals("SUPERBIRD_SETUP_CONNECTTOWIFI")) {
                    return m90662N1("SUPERBIRD_SETUP_CONNECTTOWIFI", "superbird/setup/connecttowifi", 1935, "superbird");
                }
                return null;
            case 1009386941:
                if (str.equals("WEAR_ENTITY_PAGE_SUGGEST_TO_ENABLE_CELLULAR_DOWNLOADS")) {
                    return m90662N1("WEAR_ENTITY_PAGE_SUGGEST_TO_ENABLE_CELLULAR_DOWNLOADS", "wear/entity_page/suggest_to_enable_cellular_downloads", 2067, "wear");
                }
                return null;
            case 1015050541:
                if (str.equals("MRKT_SONG_DNA_REPORTING")) {
                    return m90662N1("MRKT_SONG_DNA_REPORTING", "mrkt/song-dna-reporting", 1255, "mrkt");
                }
                return null;
            case 1027645501:
                if (str.equals("MRKT_ARTIST_MUSIC_SONGS")) {
                    return m90662N1("MRKT_ARTIST_MUSIC_SONGS", "mrkt/artist/music/songs", 1058, "mrkt");
                }
                return null;
            case 1038665437:
                if (str.equals("GOLDENPATH_TBREITZMAN")) {
                    return m90662N1("GOLDENPATH_TBREITZMAN", "goldenpath/tbreitzman", 734, "goldenpath");
                }
                return null;
            case 1048759725:
                if (str.equals("GOLDENPATH_DANIELLEV")) {
                    return m90662N1("GOLDENPATH_DANIELLEV", "goldenpath/daniellev", 614, "goldenpath");
                }
                return null;
            case 1071664685:
                if (str.equals("CONCERTS_GROUP")) {
                    return m90662N1("CONCERTS_GROUP", "concerts/group", 381, "concerts");
                }
                return null;
            case 1149962813:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_STATUS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_STATUS", "spotify-for-authors/dvn-creation/status", 1882, "spotify-for-authors");
                }
                return null;
            case 1157450973:
                if (str.equals("AUDIOBOOK_CHAPTERPLAYBACKCONFIRMATION")) {
                    return m90751a0();
                }
                return null;
            case 1194561133:
                if (str.equals("SUPERBIRD_SETUP_DOWNLOADING")) {
                    return m90662N1("SUPERBIRD_SETUP_DOWNLOADING", "superbird/setup/downloading", 1939, "superbird");
                }
                return null;
            case 1243496589:
                if (str.equals("MRKT_ARTIST_NMS")) {
                    return m90662N1("MRKT_ARTIST_NMS", "mrkt/artist/nms", 1062, "mrkt");
                }
                return null;
            case 1270057741:
                if (str.equals("FANDOM_TOPTRACKS")) {
                    return m90662N1("FANDOM_TOPTRACKS", "fandom/toptracks", 533, "fandom");
                }
                return null;
            case 1277088413:
                if (str.equals("S4P_SETTINGS_THEME")) {
                    return m90662N1("S4P_SETTINGS_THEME", "s4p/settings/theme", 1693, "s4p");
                }
                return null;
            case 1302925373:
                if (str.equals("AGE_SIGNAL_SIGNUP_MANAGED_ACCOUNT")) {
                    return m90662N1("AGE_SIGNAL_SIGNUP_MANAGED_ACCOUNT", "age-signal/signup/managed-account", 135, "age-signal");
                }
                return null;
            case 1306164205:
                if (str.equals("LOGIN_PHONENUMBER_OTP")) {
                    return m90662N1("LOGIN_PHONENUMBER_OTP", "login/phonenumber/otp", 935, "login");
                }
                return null;
            case 1379410077:
                if (str.equals("AUDIO_LANGUAGE_SELECTOR")) {
                    return m90744Z();
                }
                return null;
            case 1403656877:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_READY")) {
                    return m90662N1("SPOTIFYBUTTON_ACTIVATION_READY", "spotifybutton/activation/ready", 1896, "spotifybutton");
                }
                return null;
            case 1484169549:
                if (str.equals("FREETIER_TASTEONBOARDING_ARTISTSEARCH")) {
                    return m90662N1("FREETIER_TASTEONBOARDING_ARTISTSEARCH", "freetier/tasteonboarding/artistsearch", 569, "freetier");
                }
                return null;
            case 1497168509:
                if (str.equals("MRKT_ARTIST_AUDIENCE_CITIES")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_CITIES", "mrkt/artist/audience/cities", 1006, "mrkt");
                }
                return null;
            case 1503207053:
                if (str.equals("CONTEXTDISPATCH_OFFLINE")) {
                    return m90662N1("CONTEXTDISPATCH_OFFLINE", "contextdispatch/offline", WindowState.MINIMIZED, "contextdispatch");
                }
                return null;
            case 1507349277:
                if (str.equals("SOCIAL_LISTENING_JOINCONFIRMATIONDIALOG")) {
                    return m90662N1("SOCIAL_LISTENING_JOINCONFIRMATIONDIALOG", "social-listening/joinconfirmationdialog", 1849, "social-listening");
                }
                return null;
            case 1527640237:
                if (str.equals("KID_ACCOUNT_CREATION_SUBMIT")) {
                    return m90889u2();
                }
                return null;
            case 1568726253:
                if (str.equals("PLAYLIST_PARTICIPANTS")) {
                    return m90699S3();
                }
                return null;
            case 1574680413:
                if (str.equals("WEAR_SECONDARY_CONTROLS_PLAYBACK_SPEED_SELECTOR")) {
                    return m90662N1("WEAR_SECONDARY_CONTROLS_PLAYBACK_SPEED_SELECTOR", "wear/secondary_controls/playback_speed_selector", 2079, "wear");
                }
                return null;
            case 1580655405:
                if (str.equals("ARTIST_UNMAPPED_MUSIC_VIDEOS")) {
                    return m90662N1("ARTIST_UNMAPPED_MUSIC_VIDEOS", "artist/unmapped-music-videos", 174, "artist");
                }
                return null;
            case 1598694253:
                if (str.equals("LISTENINGPARTY_MAIN_ROOM")) {
                    return m90662N1("LISTENINGPARTY_MAIN_ROOM", "listeningparty/main-room", 897, "listeningparty");
                }
                return null;
            case 1621215085:
                if (str.equals("INAPPUSERFEEDBACK_JOURNEY")) {
                    return m90868r2();
                }
                return null;
            case 1636782637:
                if (str.equals("DISCOVERNOW")) {
                    return m90662N1("DISCOVERNOW", "discovernow", 480, "discovernow");
                }
                return null;
            case 1692655533:
                if (str.equals("PAGE_MATCH_LANDING")) {
                    return m90849o3();
                }
                return null;
            case 1808937693:
                if (str.equals("WEAR_SLEEP_TIMER")) {
                    return m90662N1("WEAR_SLEEP_TIMER", "wear/sleep_timer", 2089, "wear");
                }
                return null;
            case 1832884461:
                if (str.equals("EMAIL_EDIT")) {
                    return m90662N1("EMAIL_EDIT", "email/edit", 491, "email");
                }
                return null;
            case 1897566509:
                if (str.equals("THESTAGE")) {
                    return m90662N1("THESTAGE", "thestage", 1972, "thestage");
                }
                return null;
            case 1929904461:
                if (str.equals("PODCAST_PREVIEW")) {
                    return m90662N1("PODCAST_PREVIEW", "podcast/preview", 1438, "podcast");
                }
                return null;
            case 1947429469:
                if (str.equals("TV_ENTITY_DESCRIPTION")) {
                    return m90662N1("TV_ENTITY_DESCRIPTION", "tv/entity-description", 1981, "tv");
                }
                return null;
            case 1949703693:
                if (str.equals("MRKT_ARTIST_PROFILE_FANS_ALSO_LIKE")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_FANS_ALSO_LIKE", "mrkt/artist/profile/fans-also-like", 1086, "mrkt");
                }
                return null;
            case 1963373645:
                if (str.equals("CAMPAIGNS_DATASTORIES")) {
                    return m90662N1("CAMPAIGNS_DATASTORIES", "campaigns/datastories", 262, "campaigns");
                }
                return null;
            case 2115486717:
                if (str.equals("HOME_DRILLDOWN")) {
                    return m90662N1("HOME_DRILLDOWN", "home/drilldown", 779, "home");
                }
                return null;
            case 2122589069:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_LISTENLATER")) {
                    return m90662N1("COLLECTION_PODCASTS_EPISODES_LISTENLATER", "collection/podcasts/episodes/listenlater", 348, "collection");
                }
                return null;
            case 2132602813:
                if (str.equals("GRADUATION_REQUESTED")) {
                    return m90662N1("GRADUATION_REQUESTED", "graduation/requested", 754, "graduation");
                }
                return null;
            case 2145415421:
                if (str.equals("ADSTUDIO_DASHBOARD_AD_DRAFTS")) {
                    return m90662N1("ADSTUDIO_DASHBOARD_AD_DRAFTS", "adstudio/dashboard/ad-drafts", 76, "adstudio");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: P */
    public static cbm0 m90674P() {
        return m90662N1("AI_DISCLOSURE", "ai-disclosure", 137, "ai-disclosure");
    }

    /* JADX INFO: renamed from: P0 */
    public static cbm0 m90675P0() {
        return m90662N1("COLLECTION_YOUREPISODES_SETTINGS", "collection/yourepisodes/settings", 360, "collection");
    }

    /* JADX INFO: renamed from: P1 */
    public static cbm0 m90676P1() {
        return m90662N1("GRADUATION_APPROVED", "graduation/approved", 748, "graduation");
    }

    /* JADX INFO: renamed from: P2 */
    public static cbm0 m90677P2() {
        return m90662N1("MAGPIE_CADENCE", "magpie/cadence", 951, "magpie");
    }

    /* JADX INFO: renamed from: P3 */
    public static cbm0 m90678P3() {
        return m90662N1("PLAYLIST_EDIT_COVERART", "playlist/edit-coverart", 1405, "playlist");
    }

    /* JADX INFO: renamed from: P4 */
    public static cbm0 m90679P4() {
        return m90662N1("REINVENTFREE_SCRUB_UPSELL", "reinventfree-scrub-upsell", 1584, "reinventfree-scrub-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: P5 */
    public static cbm0 m90680P5(String str) {
        switch (str.hashCode()) {
            case -2080009970:
                if (str.equals("MRKT_ARTIST_LISTENING_PARTY_EDIT")) {
                    return m90662N1("MRKT_ARTIST_LISTENING_PARTY_EDIT", "mrkt/artist/listening-party/edit", 1048, "mrkt");
                }
                return null;
            case -2060669506:
                if (str.equals("OFFLINE_USER_MIX_ENTITY")) {
                    return m90662N1("OFFLINE_USER_MIX_ENTITY", "offline-user-mix/entity", 1327, "offline-user-mix");
                }
                return null;
            case -2038258722:
                if (str.equals("VOTING_FAQ")) {
                    return m90662N1("VOTING_FAQ", "voting/faq", 2013, "voting");
                }
                return null;
            case -2037767298:
                if (str.equals("CONTRIBUTION_NOTES_DETAIL")) {
                    return m90841n1();
                }
                return null;
            case -2036299890:
                if (str.equals("SUPPORT_CATEGORY")) {
                    return m90662N1("SUPPORT_CATEGORY", "support/category", 1962, "support");
                }
                return null;
            case -1924631586:
                if (str.equals("PARENTAL_CONTROL_LOGIN_DIFFERENT_DEVICE")) {
                    return m90897v3();
                }
                return null;
            case -1921881922:
                if (str.equals("CHALLENGE_TOTP_BACKUP_CODE")) {
                    return m90662N1("CHALLENGE_TOTP_BACKUP_CODE", "challenge/totp-backup-code", 292, "challenge");
                }
                return null;
            case -1903644626:
                if (str.equals("WEAR_SETTINGS_LICENSES")) {
                    return m90662N1("WEAR_SETTINGS_LICENSES", "wear/settings/licenses", 2087, "wear");
                }
                return null;
            case -1897492178:
                if (str.equals("CONTEXTMENU_SHOW")) {
                    return m90829l1();
                }
                return null;
            case -1833795522:
                if (str.equals("WRAPPED_RECEIPT")) {
                    return m90662N1("WRAPPED_RECEIPT", "wrapped/receipt", 2104, "wrapped");
                }
                return null;
            case -1753879282:
                if (str.equals("SETTINGS_APPS")) {
                    return m90662N1("SETTINGS_APPS", "settings/apps", 1751, "settings");
                }
                return null;
            case -1750402338:
                if (str.equals("SIGNUP_PARENTALCONSENT")) {
                    return m90662N1("SIGNUP_PARENTALCONSENT", "signup/parentalconsent", 1833, "signup");
                }
                return null;
            case -1736922018:
                if (str.equals("GOLDENPATH_JACKWEBB")) {
                    return m90662N1("GOLDENPATH_JACKWEBB", "goldenpath/jackwebb", 643, "goldenpath");
                }
                return null;
            case -1727573746:
                if (str.equals("TV_DIALOG_PREMIUM_ONLY")) {
                    return m90662N1("TV_DIALOG_PREMIUM_ONLY", "tv/dialog/premium-only", 1980, "tv");
                }
                return null;
            case -1716140162:
                if (str.equals("MRKT_WAITING_ROOM_STATS")) {
                    return m90662N1("MRKT_WAITING_ROOM_STATS", "mrkt/waiting-room/stats", 1287, "mrkt");
                }
                return null;
            case -1683343458:
                if (str.equals("PUFFIN_SETUP_UNSUPPORTED")) {
                    return m90662N1("PUFFIN_SETUP_UNSUPPORTED", "puffin/setup-unsupported", 1547, "puffin");
                }
                return null;
            case -1485393298:
                if (str.equals("SUPPORT_SITE_ARTICLE")) {
                    return m90662N1("SUPPORT_SITE_ARTICLE", "support-site/article", 1949, "support-site");
                }
                return null;
            case -1479372450:
                if (str.equals("COLLECTION_SAVEDEPISODES")) {
                    return m90662N1("COLLECTION_SAVEDEPISODES", "collection/savedepisodes", 356, "collection");
                }
                return null;
            case -1463302082:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIENCE_LOCATION")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_AUDIENCE_LOCATION", "spotify-for-authors/audience/location", 1872, "spotify-for-authors");
                }
                return null;
            case -1457106402:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_REVIEW_AND_SUBMIT")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_WITH_ADS_REVIEW_AND_SUBMIT", "adstudio/duplicate-ad-set-with-ads/review-and-submit", 90, "adstudio");
                }
                return null;
            case -1304999026:
                if (str.equals("BOOTCAMP_QUADRAPHONICS_NATTOP50")) {
                    return m90662N1("BOOTCAMP_QUADRAPHONICS_NATTOP50", "bootcamp/quadraphonics/natTop50", 239, "bootcamp");
                }
                return null;
            case -1290360978:
                if (str.equals("SETTINGS_SIRIINTENTS")) {
                    return m90662N1("SETTINGS_SIRIINTENTS", "settings/siriintents", 1786, "settings");
                }
                return null;
            case -1267526322:
                if (str.equals("WATCHAPP_ARTIST_ENTITY")) {
                    return m90662N1("WATCHAPP_ARTIST_ENTITY", "watchapp/artist-entity", 2020, "watchapp");
                }
                return null;
            case -1261741282:
                if (str.equals("REMOTEDOWNLOADS_ONBOARDING_EDUCATION")) {
                    return m90735X4();
                }
                return null;
            case -1256220002:
                if (str.equals("COLLECTION")) {
                    return m90662N1("COLLECTION", "collection", 336, "collection");
                }
                return null;
            case -1210040418:
                if (str.equals("CHAT_INTERCEPTOR")) {
                    return m90591D0();
                }
                return null;
            case -1196856658:
                if (str.equals("PROACTIVE_PLATFORMS_LOCK_SCREEN_WIDGET")) {
                    return m90662N1("PROACTIVE_PLATFORMS_LOCK_SCREEN_WIDGET", "proactive-platforms/lock-screen-widget", 1509, "proactive-platforms");
                }
                return null;
            case -1195747378:
                if (str.equals("AUDIOBOOK_CHAPTERSBOTTOMSHEET")) {
                    return m90758b0();
                }
                return null;
            case -1152525730:
                if (str.equals("SETTINGS_NOTIFICATIONS_IMPORTANT_PUBLIC_NOTICE")) {
                    return m90662N1("SETTINGS_NOTIFICATIONS_IMPORTANT_PUBLIC_NOTICE", "settings/notifications/important-public-notice", 1780, "settings");
                }
                return null;
            case -1136182034:
                if (str.equals("GOLDENPATH_CLUNA")) {
                    return m90662N1("GOLDENPATH_CLUNA", "goldenpath/cluna", 612, "goldenpath");
                }
                return null;
            case -1130054962:
                if (str.equals("GOLDENPATH_JAKEP")) {
                    return m90662N1("GOLDENPATH_JAKEP", "goldenpath/jakep", 644, "goldenpath");
                }
                return null;
            case -1127277746:
                if (str.equals("GOLDENPATH_MARCD")) {
                    return m90662N1("GOLDENPATH_MARCD", "goldenpath/marcd", 673, "goldenpath");
                }
                return null;
            case -1124076178:
                if (str.equals("CONCERTS_CONCERT_WEBVIEW")) {
                    return m90662N1("CONCERTS_CONCERT_WEBVIEW", "concerts/concert/webview", 380, "concerts");
                }
                return null;
            case -1118731378:
                if (str.equals("GOLDENPATH_VINIM")) {
                    return m90662N1("GOLDENPATH_VINIM", "goldenpath/vinim", 740, "goldenpath");
                }
                return null;
            case -1077213394:
                if (str.equals("JAM_STARTJAMWITHUSER")) {
                    return m90662N1("JAM_STARTJAMWITHUSER", "jam/startjamwithuser", 848, "jam");
                }
                return null;
            case -1067686402:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_REVIEW")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_UPLOAD_REVIEW", "mrkt/bulk-campaigns/upload/review", 1150, "mrkt");
                }
                return null;
            case -1060156450:
                if (str.equals("MANAGE_INVITES_PAGE")) {
                    return m90662N1("MANAGE_INVITES_PAGE", "manage/invites-page", 966, "manage");
                }
                return null;
            case -1048619410:
                if (str.equals("SIGNUP_ACCOUNTALREADYEXISTS")) {
                    return m90864q5();
                }
                return null;
            case -1025106258:
                if (str.equals("FRIENDSHOME_ENTITY")) {
                    return m90662N1("FRIENDSHOME_ENTITY", "friendshome/entity", 579, "friendshome");
                }
                return null;
            case -995299074:
                if (str.equals("DOWNLOAD_OVER_CELLULAR")) {
                    return m90571A1();
                }
                return null;
            case -960172450:
                if (str.equals("MRKT_ARTIST_SONG_PLAYLISTS")) {
                    return m90662N1("MRKT_ARTIST_SONG_PLAYLISTS", "mrkt/artist/song/playlists", 1105, "mrkt");
                }
                return null;
            case -950689250:
                if (str.equals("WATCHAPP_ESDK_TOOLS")) {
                    return m90662N1("WATCHAPP_ESDK_TOOLS", "watchapp/esdk-tools", 2029, "watchapp");
                }
                return null;
            case -950337010:
                if (str.equals("S4P_EMAIL_VERIFICATION")) {
                    return m90662N1("S4P_EMAIL_VERIFICATION", "s4p/email-verification", 1650, "s4p");
                }
                return null;
            case -923103890:
                if (str.equals("GOLDENPATH_AHMEDB")) {
                    return m90662N1("GOLDENPATH_AHMEDB", "goldenpath/ahmedb", 597, "goldenpath");
                }
                return null;
            case -900660834:
                if (str.equals("ARTIST_ARTIST_LIST")) {
                    return m90662N1("ARTIST_ARTIST_LIST", "artist/artist-list", 160, "artist");
                }
                return null;
            case -847101650:
                if (str.equals("BACKGROUND")) {
                    return m90800h0();
                }
                return null;
            case -842483826:
                if (str.equals("LOGIN_DIALOG_GOOGLEERROR")) {
                    return m90662N1("LOGIN_DIALOG_GOOGLEERROR", "login/dialog/googleerror", 922, "login");
                }
                return null;
            case -839787442:
                if (str.equals("SCANNABLES_IMAGEPICKERCONTROLLER")) {
                    return m90662N1("SCANNABLES_IMAGEPICKERCONTROLLER", "scannables/imagepickercontroller", 1721, "scannables");
                }
                return null;
            case -802241570:
                if (str.equals("HIFI_SETTINGS_SHEET_QUALITY")) {
                    return m90662N1("HIFI_SETTINGS_SHEET_QUALITY", "hifi/settings-sheet/quality", 772, "hifi");
                }
                return null;
            case -800707618:
                if (str.equals("MAGPIE_ASSISTANCE")) {
                    return m90670O2();
                }
                return null;
            case -762579202:
                if (str.equals("REINVENTFREE_DOWNLOAD_UPSELL")) {
                    return m90665N4();
                }
                return null;
            case -758213506:
                if (str.equals("GOLDENPATH_SYDNEYNICOLEACHINGER")) {
                    return m90662N1("GOLDENPATH_SYDNEYNICOLEACHINGER", "goldenpath/sydneynicoleachinger", 733, "goldenpath");
                }
                return null;
            case -693393554:
                if (str.equals("WEAR_SETTINGS_LOGOUT_CONFIRMATION")) {
                    return m90662N1("WEAR_SETTINGS_LOGOUT_CONFIRMATION", "wear/settings/logout_confirmation", 2088, "wear");
                }
                return null;
            case -640278130:
                if (str.equals("FREETIER_TASTEONBOARDING_ARTISTPICKERCONTAINER")) {
                    return m90662N1("FREETIER_TASTEONBOARDING_ARTISTPICKERCONTAINER", "freetier/tasteonboarding/artistpickercontainer", 568, "freetier");
                }
                return null;
            case -625031538:
                if (str.equals("CONNECT_OVERLAY_SWITCHDEVICE")) {
                    return m90662N1("CONNECT_OVERLAY_SWITCHDEVICE", "connect/overlay/switchdevice", 388, "connect");
                }
                return null;
            case -619664322:
                if (str.equals("ARTIST_DISCOVERED_ON")) {
                    return m90662N1("ARTIST_DISCOVERED_ON", "artist/discovered-on", 163, "artist");
                }
                return null;
            case -604056402:
                if (str.equals("SEARCH_MUSIC")) {
                    return m90662N1("SEARCH_MUSIC", "search/music", 1735, "search");
                }
                return null;
            case -597811522:
                if (str.equals("READALONG_LANGUAGEPICKER")) {
                    return m90662N1("READALONG_LANGUAGEPICKER", "readalong/languagepicker", 1573, "readalong");
                }
                return null;
            case -516416866:
                if (str.equals("UNBOXING_MAIN_HUB")) {
                    return m90662N1("UNBOXING_MAIN_HUB", "unboxing/main-hub", 1991, "unboxing");
                }
                return null;
            case -509317858:
                if (str.equals("MRKT_SUBMISSION_CREATE")) {
                    return m90662N1("MRKT_SUBMISSION_CREATE", "mrkt/submission/create", 1257, "mrkt");
                }
                return null;
            case -499552738:
                if (str.equals("CONNECT_OVERLAY_VOLUME")) {
                    return m90662N1("CONNECT_OVERLAY_VOLUME", "connect/overlay/volume", 389, "connect");
                }
                return null;
            case -497280482:
                if (str.equals("GOLDENPATH_PDOZSA")) {
                    return m90662N1("GOLDENPATH_PDOZSA", "goldenpath/pdozsa", 712, "goldenpath");
                }
                return null;
            case -491553490:
                if (str.equals("DATASAVERMODE")) {
                    return m90662N1("DATASAVERMODE", "datasavermode", 457, "datasavermode");
                }
                return null;
            case -474827746:
                if (str.equals("GOLDENPATH_MSIMSEK")) {
                    return m90662N1("GOLDENPATH_MSIMSEK", "goldenpath/msimsek", 696, "goldenpath");
                }
                return null;
            case -450494978:
                if (str.equals("SEARCH_PODCASTS_AND_EPISODES_VIDEOS")) {
                    return m90662N1("SEARCH_PODCASTS_AND_EPISODES_VIDEOS", "search/podcasts_and_episodes/videos", 1739, "search");
                }
                return null;
            case -440065394:
                if (str.equals("BUNDLING_PLACEBO_WEBVIEW")) {
                    return m90662N1("BUNDLING_PLACEBO_WEBVIEW", "bundling/placebo/webview", 254, "bundling");
                }
                return null;
            case -436986850:
                if (str.equals("CATEGORIES_ONBOARDING")) {
                    return m90662N1("CATEGORIES_ONBOARDING", "categories/onboarding", 279, "categories");
                }
                return null;
            case -385449458:
                if (str.equals("COMMENTS_SETTINGS")) {
                    return m90662N1("COMMENTS_SETTINGS", "comments/settings", 371, "comments");
                }
                return null;
            case -378376274:
                if (str.equals("DIALOG_COLLECTION_INSUFFICIENTSTORAGE")) {
                    return m90662N1("DIALOG_COLLECTION_INSUFFICIENTSTORAGE", "dialog/collection/insufficientstorage", 461, "dialog");
                }
                return null;
            case -332628610:
                if (str.equals("UPDATE_DIALOG")) {
                    return m90662N1("UPDATE_DIALOG", "update-dialog", 1997, "update-dialog");
                }
                return null;
            case -329811282:
                if (str.equals("FREE_TIER_OTHER_USER_PROFILE")) {
                    return m90662N1("FREE_TIER_OTHER_USER_PROFILE", "free-tier-other-user-profile", 557, "free-tier-other-user-profile");
                }
                return null;
            case -263243410:
                if (str.equals("RESETPASSWORD_SUCCESS")) {
                    return m90662N1("RESETPASSWORD_SUCCESS", "resetpassword/success", 1602, "resetpassword");
                }
                return null;
            case -219279058:
                if (str.equals("MRKT_BILLING_OVERVIEW")) {
                    return m90662N1("MRKT_BILLING_OVERVIEW", "mrkt/billing/overview", 1136, "mrkt");
                }
                return null;
            case -181957458:
                if (str.equals("MRKT_FRONTDOOR_VIDEO_AND_VISUALS")) {
                    return m90662N1("MRKT_FRONTDOOR_VIDEO_AND_VISUALS", "mrkt/frontdoor/video-and-visuals", 1230, "mrkt");
                }
                return null;
            case -180893906:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_CUSTOMIZE")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_CUSTOMIZE", "mrkt/artist/campaigns/marquee-and-showcase/create/flights/customize", 1028, "mrkt");
                }
                return null;
            case -157203602:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_CONTENT")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_CONTENT", "spotify-for-authors/dvn-creation/content", 1877, "spotify-for-authors");
                }
                return null;
            case -95757538:
                if (str.equals("GOLDENPATH_PABLOMARTIN")) {
                    return m90662N1("GOLDENPATH_PABLOMARTIN", "goldenpath/pablomartin", 709, "goldenpath");
                }
                return null;
            case -65512530:
                if (str.equals("HOMETHING_ACTIVATION_WIFI")) {
                    return m90662N1("HOMETHING_ACTIVATION_WIFI", "homething/activation/wifi", ContentDeliveryAdvertisementCapability.LINEAR_2DAY, "homething");
                }
                return null;
            case -59534914:
                if (str.equals("SONG_DNA_UNAVAILABLE")) {
                    return m90913x5();
                }
                return null;
            case 20271214:
                if (str.equals("DIALOG_MARKETOPPORTUNITIES_SHOWCASE")) {
                    return m90662N1("DIALOG_MARKETOPPORTUNITIES_SHOWCASE", "dialog/marketopportunities/showcase", 472, "dialog");
                }
                return null;
            case 62296830:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_CAMPAIGN_AD", "adstudio/add-to-existing-campaign/ad", 44, "adstudio");
                }
                return null;
            case 169677582:
                if (str.equals("WWW_ACCOUNT_PAGES_ORDER_HISTORY")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_ORDER_HISTORY", "www-account-pages/order-history", 2140, "www-account-pages");
                }
                return null;
            case 217583374:
                if (str.equals("CHARTS_ALBUMS")) {
                    return m90662N1("CHARTS_ALBUMS", "charts/albums", 297, "charts");
                }
                return null;
            case 253353694:
                if (str.equals("PERMISSIONS_MIC_REQUEST_FULLSCREEN")) {
                    return m90662N1("PERMISSIONS_MIC_REQUEST_FULLSCREEN", "permissions/mic/request/fullscreen", 1381, "permissions");
                }
                return null;
            case 274408878:
                if (str.equals("VOICE_LISTENING")) {
                    return m90662N1("VOICE_LISTENING", "voice/listening", 2009, "voice");
                }
                return null;
            case 277480398:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS_DARK")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS_DARK", "mrkt/debug/hubs/component-reference/buttons-dark", 1161, "mrkt");
                }
                return null;
            case 346764590:
                if (str.equals("SPOTIFY_FOR_AUTHORS_ORGANIZATIONS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_ORGANIZATIONS", "spotify-for-authors/organizations", 1887, "spotify-for-authors");
                }
                return null;
            case 445641566:
                if (str.equals("CARS_ANDROIDAUTO")) {
                    return m90662N1("CARS_ANDROIDAUTO", "cars/androidauto", 270, "cars");
                }
                return null;
            case 450207646:
                if (str.equals("RUNNING_CATEGORY")) {
                    return m90662N1("RUNNING_CATEGORY", "running/category", 1604, "running");
                }
                return null;
            case 465155822:
                if (str.equals("LOGIN_MULTIUSER")) {
                    return m90662N1("LOGIN_MULTIUSER", "login/multiuser", 931, "login");
                }
                return null;
            case 472294670:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_OVERVIEW")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_FLIGHTS_OVERVIEW", "mrkt/artist/campaigns/marquee-and-showcase/create/flights/overview", 1029, "mrkt");
                }
                return null;
            case 476936238:
                if (str.equals("ACCOUNTSWITCHING_PICKACCOUNT")) {
                    return m90662N1("ACCOUNTSWITCHING_PICKACCOUNT", "accountswitching/pickaccount", 6, "accountswitching");
                }
                return null;
            case 498022910:
                if (str.equals("BROWSE_DISCOVER")) {
                    return m90662N1("BROWSE_DISCOVER", "browse/discover", 245, "browse");
                }
                return null;
            case 578572302:
                if (str.equals("S4P_CREATION_RECORDER")) {
                    return m90662N1("S4P_CREATION_RECORDER", "s4p/creation/recorder", 1641, "s4p");
                }
                return null;
            case 597356126:
                if (str.equals("YOURLIBRARY_FILTERS_SETTINGS")) {
                    return m90662N1("YOURLIBRARY_FILTERS_SETTINGS", "yourlibrary/filters-settings", 2181, "yourlibrary");
                }
                return null;
            case 983191134:
                if (str.equals("CHALLENGE_CAPTCHA")) {
                    return m90662N1("CHALLENGE_CAPTCHA", "challenge/captcha", 283, "challenge");
                }
                return null;
            case 998630878:
                if (str.equals("MRKT_ARTIST_MUSIC")) {
                    return m90662N1("MRKT_ARTIST_MUSIC", "mrkt/artist/music", 1052, "mrkt");
                }
                return null;
            case 999959342:
                if (str.equals("DISCOVERYFEED")) {
                    return m90662N1("DISCOVERYFEED", "discoveryfeed", 484, "discoveryfeed");
                }
                return null;
            case 1017013054:
                if (str.equals("SETTINGS_VOICE_ASSISTANTS")) {
                    return m90662N1("SETTINGS_VOICE_ASSISTANTS", "settings/voice-assistants", 1792, "settings");
                }
                return null;
            case 1052105998:
                if (str.equals("GOLDENPATH_JOSEPHN")) {
                    return m90662N1("GOLDENPATH_JOSEPHN", "goldenpath/josephn", 655, "goldenpath");
                }
                return null;
            case 1054789454:
                if (str.equals("MRKT_FRONTDOOR_SONGWRITING")) {
                    return m90662N1("MRKT_FRONTDOOR_SONGWRITING", "mrkt/frontdoor/songwriting", 1225, "mrkt");
                }
                return null;
            case 1060339518:
                if (str.equals("PREMIUMHUB")) {
                    return m90662N1("PREMIUMHUB", "premiumhub", 1504, "premiumhub");
                }
                return null;
            case 1135470878:
                if (str.equals("PAGE_MATCH_ERROR")) {
                    return m90662N1("PAGE_MATCH_ERROR", "page-match/error", 1341, "page-match");
                }
                return null;
            case 1161532750:
                if (str.equals("VOICE_ALTERNATIVESEARCHRESULTS")) {
                    return m90662N1("VOICE_ALTERNATIVESEARCHRESULTS", "voice/alternativesearchresults", 2008, "voice");
                }
                return null;
            case 1229803214:
                if (str.equals("WATCHAPP_REMOTE_CONFIG")) {
                    return m90662N1("WATCHAPP_REMOTE_CONFIG", "watchapp/remote-config", 2041, "watchapp");
                }
                return null;
            case 1290767934:
                if (str.equals("CONTEXTMENU_ALBUM")) {
                    return m90662N1("CONTEXTMENU_ALBUM", "contextmenu/album", 404, "contextmenu");
                }
                return null;
            case 1301656462:
                if (str.equals("CONTEXTMENU_MERCH")) {
                    return m90662N1("CONTEXTMENU_MERCH", "contextmenu/merch", 420, "contextmenu");
                }
                return null;
            case 1307271086:
                if (str.equals("CONTEXTMENU_SHARE")) {
                    return m90662N1("CONTEXTMENU_SHARE", "contextmenu/share", 426, "contextmenu");
                }
                return null;
            case 1361961758:
                if (str.equals("PARENTAL_CONTROL_LOGIN_CURRENT_DEVICE")) {
                    return m90890u3();
                }
                return null;
            case 1365055902:
                if (str.equals("WEAR_SETTINGS_DOWNLOAD_SETTINGS")) {
                    return m90662N1("WEAR_SETTINGS_DOWNLOAD_SETTINGS", "wear/settings/download_settings", 2086, "wear");
                }
                return null;
            case 1369408254:
                if (str.equals("ON_DEMAND_TRIAL_OPT_IN_UPSELL")) {
                    return m90837m3();
                }
                return null;
            case 1388841198:
                if (str.equals("MRKT_ARTIST_NMS_CREATE")) {
                    return m90662N1("MRKT_ARTIST_NMS_CREATE", "mrkt/artist/nms/create", 1063, "mrkt");
                }
                return null;
            case 1405488526:
                if (str.equals("OVERLAY_DATASAVERPLAYLIST")) {
                    return m90662N1("OVERLAY_DATASAVERPLAYLIST", "overlay/datasaverplaylist", 1338, "overlay");
                }
                return null;
            case 1413465726:
                if (str.equals("PAYMENT_CALLBACK")) {
                    return m90662N1("PAYMENT_CALLBACK", "payment/callback", 1373, "payment");
                }
                return null;
            case 1414520078:
                if (str.equals("CARS_MYSPIN")) {
                    return m90662N1("CARS_MYSPIN", "cars/myspin", 277, "cars");
                }
                return null;
            case 1416488494:
                if (str.equals("GOLDENPATH_NATALIAA")) {
                    return m90662N1("GOLDENPATH_NATALIAA", "goldenpath/nataliaa", CtaType.SEE_ALL_SHOWS_FIELD_NUMBER, "goldenpath");
                }
                return null;
            case 1441019630:
                if (str.equals("YOURSPOTIFY_FORYOU")) {
                    return m90662N1("YOURSPOTIFY_FORYOU", "yourspotify/foryou", 2193, "yourspotify");
                }
                return null;
            case 1484988350:
                if (str.equals("SKIP_LIMIT_PIVOT")) {
                    return m90662N1("SKIP_LIMIT_PIVOT", "skip-limit-pivot", 1839, "skip-limit-pivot");
                }
                return null;
            case 1491106894:
                if (str.equals("WATCHAPP_PODCAST_SPEED_PICKER")) {
                    return m90662N1("WATCHAPP_PODCAST_SPEED_PICKER", "watchapp/podcast-speed-picker", 2039, "watchapp");
                }
                return null;
            case 1494600158:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY")) {
                    return m90662N1("MRKT_DM_MANAGED_SERVICE_ELIGIBILITY", "mrkt/dm-managed-service/eligibility", 1189, "mrkt");
                }
                return null;
            case 1528325726:
                if (str.equals("WATCHAPP_LOGGED_OUT")) {
                    return m90662N1("WATCHAPP_LOGGED_OUT", "watchapp/logged-out", 2034, "watchapp");
                }
                return null;
            case 1529010734:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_COUNTDOWN")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_COUNTDOWN", "mrkt/artist/campaigns/countdown", 1019, "mrkt");
                }
                return null;
            case 1534884206:
                if (str.equals("MRKT_FRONTDOOR_ROYALTIES_GUIDE")) {
                    return m90662N1("MRKT_FRONTDOOR_ROYALTIES_GUIDE", "mrkt/frontdoor/royalties-guide", 1223, "mrkt");
                }
                return null;
            case 1540914942:
                if (str.equals("UBI_DEBUG_MONITOR_RAWDATA")) {
                    return m90662N1("UBI_DEBUG_MONITOR_RAWDATA", "ubi/debug-monitor/rawdata", 1985, "ubi");
                }
                return null;
            case 1550221710:
                if (str.equals("MRKT_ARTIST_MUSIC_KALLAX")) {
                    return m90662N1("MRKT_ARTIST_MUSIC_KALLAX", "mrkt/artist/music/kallax", 1054, "mrkt");
                }
                return null;
            case 1614792430:
                if (str.equals("GOLDENPATH_ANGELOM")) {
                    return m90662N1("GOLDENPATH_ANGELOM", "goldenpath/angelom", ContentDeliverySubscriptionType.VIRTUAL_MVPD, "goldenpath");
                }
                return null;
            case 1636808910:
                if (str.equals("BLEND_DATA_STORY")) {
                    return m90662N1("BLEND_DATA_STORY", "blend/data-story", AdvertisementType.ON_DEMAND_PRE_ROLL, "blend");
                }
                return null;
            case 1651524542:
                if (str.equals("REINVENTFREE_TRACK_PREVIEW_UPSELL")) {
                    return m90662N1("REINVENTFREE_TRACK_PREVIEW_UPSELL", "reinventfree-track-preview-upsell", 1591, "reinventfree-track-preview-upsell");
                }
                return null;
            case 1707105662:
                if (str.equals("WATCHFEEDPIVOTS")) {
                    return m90785e6();
                }
                return null;
            case 1744471118:
                if (str.equals("WATCHAPP_LIBRARY")) {
                    return m90662N1("WATCHAPP_LIBRARY", "watchapp/library", 2032, "watchapp");
                }
                return null;
            case 1756099246:
                if (str.equals("PODCAST_STORYLINE")) {
                    return m90662N1("PODCAST_STORYLINE", "podcast/storyline", 1453, "podcast");
                }
                return null;
            case 1770791918:
                if (str.equals("WWW_ACCOUNT_PAGES_OVERVIEW")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_OVERVIEW", "www-account-pages/overview", 2141, "www-account-pages");
                }
                return null;
            case 1832330590:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_PITCH")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_PITCH", "mrkt/artist/video/music-videos/pitch", 1120, "mrkt");
                }
                return null;
            case 1899432894:
                if (str.equals("WATCHAPP_DOWNLOADS")) {
                    return m90662N1("WATCHAPP_DOWNLOADS", "watchapp/downloads", 2025, "watchapp");
                }
                return null;
            case 1901205950:
                if (str.equals("STUDIO_TERMS")) {
                    return m90662N1("STUDIO_TERMS", "studio/terms", 1926, "studio");
                }
                return null;
            case 1906317150:
                if (str.equals("MRKT_CHARTS_VIEW")) {
                    return m90662N1("MRKT_CHARTS_VIEW", "mrkt/charts/view", 1157, "mrkt");
                }
                return null;
            case 1909321118:
                if (str.equals("IMAGERECS")) {
                    return m90662N1("IMAGERECS", "imagerecs", ContentDeliveryAdvertisementCapability.LINEAR_6DAY, "imagerecs");
                }
                return null;
            case 1951936334:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_PLAN_DETAILS")) {
                    return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_PLAN_DETAILS", "premium-account-management/plan-details", 1492, "premium-account-management");
                }
                return null;
            case 2032639006:
                if (str.equals("PUSHOPTIN")) {
                    return m90662N1("PUSHOPTIN", "pushoptin", 1549, "pushoptin");
                }
                return null;
            case 2050846574:
                if (str.equals("CONTEXTMENU")) {
                    return m90835m1();
                }
                return null;
            case 2093758414:
                if (str.equals("PROFILE_EPISODES")) {
                    return m90662N1("PROFILE_EPISODES", "profile/episodes", 1524, "profile");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static cbm0 m90681Q() {
        return m90662N1("AIDJ_INTERACTIVITY_CONTAINER", "aidj/interactivity-container", 139, "aidj");
    }

    /* JADX INFO: renamed from: Q0 */
    public static cbm0 m90682Q0() {
        return m90662N1("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOAD", "collection/yourepisodes/settings/autodownload", 361, "collection");
    }

    /* JADX INFO: renamed from: Q1 */
    public static cbm0 m90683Q1() {
        return m90662N1("GRADUATION_EDUCATION", "graduation/education", 749, "graduation");
    }

    /* JADX INFO: renamed from: Q2 */
    public static cbm0 m90684Q2() {
        return m90662N1("MAGPIE_CAP", "magpie/cap", 952, "magpie");
    }

    /* JADX INFO: renamed from: Q3 */
    public static cbm0 m90685Q3() {
        return m90662N1("PLAYLIST_EDITORS_PICKER", "playlist/editors/picker", 1408, "playlist");
    }

    /* JADX INFO: renamed from: Q4 */
    public static cbm0 m90686Q4() {
        return m90662N1("REINVENTFREE_SKIP_LIMIT_UPSELL", "reinventfree-skip-limit-upsell", 1585, "reinventfree-skip-limit-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: Q5 */
    public static cbm0 m90687Q5(String str) {
        switch (str.hashCode()) {
            case -2133545198:
                if (str.equals("CHAT_MEMBERS")) {
                    return m90612G0();
                }
                return null;
            case -1975173678:
                if (str.equals("KID_ACCOUNT_CREATION_BIRTHDAY")) {
                    return m90662N1("KID_ACCOUNT_CREATION_BIRTHDAY", "kid-account-creation/birthday", 851, "kid-account-creation");
                }
                return null;
            case -1968552142:
                if (str.equals("SNOOZE_RECOMMENDATION")) {
                    return m90906w5();
                }
                return null;
            case -1963798942:
                if (str.equals("OPEN_ACCESS_PREVIEW")) {
                    return m90662N1("OPEN_ACCESS_PREVIEW", "open-access-preview", 1333, "open-access-preview");
                }
                return null;
            case -1905776142:
                if (str.equals("AUDIOBOOK_HYDE")) {
                    return m90662N1("AUDIOBOOK_HYDE", "audiobook/hyde", 198, "audiobook");
                }
                return null;
            case -1894040302:
                if (str.equals("SOCIAL_LISTENING_EDUCATION")) {
                    return m90662N1("SOCIAL_LISTENING_EDUCATION", "social-listening/education", 1845, "social-listening");
                }
                return null;
            case -1886072142:
                if (str.equals("FREE_TIER_LIKES")) {
                    return m90662N1("FREE_TIER_LIKES", "free-tier-likes", 555, "free-tier-likes");
                }
                return null;
            case -1815863822:
                if (str.equals("SUPERBIRD_SETUP_CONTROLOTHERMEDIADECLINED")) {
                    return m90662N1("SUPERBIRD_SETUP_CONTROLOTHERMEDIADECLINED", "superbird/setup/controlothermediadeclined", 1937, "superbird");
                }
                return null;
            case -1801318718:
                if (str.equals("YOURLIBRARY_IMPORT_MUSIC")) {
                    return m90662N1("YOURLIBRARY_IMPORT_MUSIC", "yourlibrary/import-music", 2183, "yourlibrary");
                }
                return null;
            case -1758899470:
                if (str.equals("ADSTUDIO_SBL_EDIT")) {
                    return m90662N1("ADSTUDIO_SBL_EDIT", "adstudio/sbl/edit", ContentType.LIVE, "adstudio");
                }
                return null;
            case -1710023934:
                if (str.equals("S4P_CREATION_ENTRY")) {
                    return m90662N1("S4P_CREATION_ENTRY", "s4p/creation/entry", 1639, "s4p");
                }
                return null;
            case -1708475614:
                if (str.equals("BLUEJAY_NOTIFICATION_SHEET")) {
                    return m90662N1("BLUEJAY_NOTIFICATION_SHEET", "bluejay/notification-sheet", 229, "bluejay");
                }
                return null;
            case -1698902414:
                if (str.equals("GOLDENPATH_NADR")) {
                    return m90662N1("GOLDENPATH_NADR", "goldenpath/nadr", 698, "goldenpath");
                }
                return null;
            case -1661181966:
                if (str.equals("MRKT_TEAM_ACCESS_CLAIM")) {
                    return m90662N1("MRKT_TEAM_ACCESS_CLAIM", "mrkt/team/access/claim", 1271, "mrkt");
                }
                return null;
            case -1659530926:
                if (str.equals("MEDIAPICKER")) {
                    return m90747Z2();
                }
                return null;
            case -1654670254:
                if (str.equals("DAILYMIXHUB")) {
                    return m90662N1("DAILYMIXHUB", "dailymixhub", 455, "dailymixhub");
                }
                return null;
            case -1642397918:
                if (str.equals("WATCHAPP_VERSION_MISMATCH")) {
                    return m90662N1("WATCHAPP_VERSION_MISMATCH", "watchapp/version-mismatch", 2048, "watchapp");
                }
                return null;
            case -1641235022:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_AVAILABLE_PLANS")) {
                    return m90811i4();
                }
                return null;
            case -1632865838:
                if (str.equals("PLAYLIST")) {
                    return m90629I3();
                }
                return null;
            case -1561298574:
                if (str.equals("NAVIGATION_NORMAL")) {
                    return m90662N1("NAVIGATION_NORMAL", "navigation/normal", 1297, d6n0.f45729b);
                }
                return null;
            case -1493205070:
                if (str.equals("GRADUATION_SUPERVISION")) {
                    return m90704T1();
                }
                return null;
            case -1477637710:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS", "mrkt/artist/video/other-videos", 1128, "mrkt");
                }
                return null;
            case -1438313566:
                if (str.equals("ALLBOARDING_CAROUSEL")) {
                    return m90662N1("ALLBOARDING_CAROUSEL", "allboarding/carousel", 143, kc3.f121351b);
                }
                return null;
            case -1417989934:
                if (str.equals("SEARCH_RECENT")) {
                    return m90662N1("SEARCH_RECENT", "search/recent", 1741, "search");
                }
                return null;
            case -1373100414:
                if (str.equals("WEAR_VISUAL_MODE")) {
                    return m90662N1("WEAR_VISUAL_MODE", "wear/visual_mode", 2092, "wear");
                }
                return null;
            case -1300352670:
                if (str.equals("AGE_ASSURANCE_SHARE_PARENTAL_CONSENT")) {
                    return m90660N();
                }
                return null;
            case -1253576014:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM_CREATION")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_DM_CREATION", "mrkt/artist/campaigns/dm/creation", 1022, "mrkt");
                }
                return null;
            case -1211800030:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS_DARK")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS_DARK", "mrkt/debug/hubs/component-reference/rows-dark", 1166, "mrkt");
                }
                return null;
            case -1201933646:
                if (str.equals("MANAGE_TEAMS_PAGE")) {
                    return m90662N1("MANAGE_TEAMS_PAGE", "manage/teams-page", 973, "manage");
                }
                return null;
            case -1173625038:
                if (str.equals("GOLDENPATH_JAWAUNEL")) {
                    return m90662N1("GOLDENPATH_JAWAUNEL", "goldenpath/jawaunel", 648, "goldenpath");
                }
                return null;
            case -1147915902:
                if (str.equals("MAGPIE_ERROR")) {
                    return m90691R2();
                }
                return null;
            case -1136393598:
                if (str.equals("GOLDENPATH_CERIL")) {
                    return m90662N1("GOLDENPATH_CERIL", "goldenpath/ceril", 610, "goldenpath");
                }
                return null;
            case -1131478094:
                if (str.equals("GOLDENPATH_HORIA")) {
                    return m90662N1("GOLDENPATH_HORIA", "goldenpath/horia", 640, "goldenpath");
                }
                return null;
            case -1089119726:
                if (str.equals("S4P_SETUP_SHOW_DONE")) {
                    return m90662N1("S4P_SETUP_SHOW_DONE", "s4p/setup-show/done", 1700, "s4p");
                }
                return null;
            case -1039359070:
                if (str.equals("MRKT_BULK_CAMPAIGNS_UPLOAD_SELECT")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_UPLOAD_SELECT", "mrkt/bulk-campaigns/upload/select", 1151, "mrkt");
                }
                return null;
            case -1017922126:
                if (str.equals("MRKT_CHARTS_OVERVIEW")) {
                    return m90662N1("MRKT_CHARTS_OVERVIEW", "mrkt/charts/overview", 1156, "mrkt");
                }
                return null;
            case -985309774:
                if (str.equals("GOLDENPATH_MANUELE")) {
                    return m90662N1("GOLDENPATH_MANUELE", "goldenpath/manuele", 672, "goldenpath");
                }
                return null;
            case -870065230:
                if (str.equals("ADSTUDIO_DASHBOARD_CAMPAIGNS")) {
                    return m90662N1("ADSTUDIO_DASHBOARD_CAMPAIGNS", "adstudio/dashboard/campaigns", 81, "adstudio");
                }
                return null;
            case -814846494:
                if (str.equals("PODCASTCHARTS_CATEGORIES")) {
                    return m90776d4();
                }
                return null;
            case -811512638:
                if (str.equals("ADSTUDIO_EVENTS_PIXEL_INSTALL")) {
                    return m90662N1("ADSTUDIO_EVENTS_PIXEL_INSTALL", "adstudio/events/pixel/install", 103, "adstudio");
                }
                return null;
            case -791298190:
                if (str.equals("BLUEJAY_BRIEF_PRESET_PICKER")) {
                    return m90662N1("BLUEJAY_BRIEF_PRESET_PICKER", "bluejay/brief-preset-picker", 220, "bluejay");
                }
                return null;
            case -762143886:
                if (str.equals("MRKT_APP_SETTINGS")) {
                    return m90662N1("MRKT_APP_SETTINGS", "mrkt/app-settings", ResolvedHome.ONDEMAND_SET_FIELD_NUMBER, "mrkt");
                }
                return null;
            case -694979758:
                if (str.equals("SHOWS_MIXED")) {
                    return m90662N1("SHOWS_MIXED", "shows/mixed", 1817, "shows");
                }
                return null;
            case -686687278:
                if (str.equals("SHOWS_VIDEO")) {
                    return m90662N1("SHOWS_VIDEO", "shows/video", 1820, "shows");
                }
                return null;
            case -679062478:
                if (str.equals("AGE_ASSURANCE_REQUEST_PARENTAL_CONSENT")) {
                    return m90653M();
                }
                return null;
            case -671879902:
                if (str.equals("GOLDENPATH_JANANU")) {
                    return m90662N1("GOLDENPATH_JANANU", "goldenpath/jananu", 647, "goldenpath");
                }
                return null;
            case -585892926:
                if (str.equals("GOLDENPATH_MOMENTS")) {
                    return m90662N1("GOLDENPATH_MOMENTS", "goldenpath/moments", 693, "goldenpath");
                }
                return null;
            case -572852670:
                if (str.equals("ADSTUDIO_EVENTS_DETAILS")) {
                    return m90662N1("ADSTUDIO_EVENTS_DETAILS", "adstudio/events/details", 101, "adstudio");
                }
                return null;
            case -548644062:
                if (str.equals("S4P_SETTINGS_PODCAST_PROFILE")) {
                    return m90662N1("S4P_SETTINGS_PODCAST_PROFILE", "s4p/settings/podcast/profile", 1691, "s4p");
                }
                return null;
            case -500085838:
                if (str.equals("HIFI_SESSION_INFO")) {
                    return m90662N1("HIFI_SESSION_INFO", "hifi/session-info", 771, "hifi");
                }
                return null;
            case -499866686:
                if (str.equals("GOLDENPATH_PAVANC")) {
                    return m90662N1("GOLDENPATH_PAVANC", "goldenpath/pavanc", 711, "goldenpath");
                }
                return null;
            case -466347982:
                if (str.equals("CONSIDERATION_PAGE")) {
                    return m90662N1("CONSIDERATION_PAGE", "consideration/page", 397, "consideration");
                }
                return null;
            case -457744990:
                if (str.equals("FRIENDSHOME_SEARCHFRIENDS")) {
                    return m90662N1("FRIENDSHOME_SEARCHFRIENDS", "friendshome/searchfriends", 582, "friendshome");
                }
                return null;
            case -424684878:
                if (str.equals("KID_ACCOUNT_TRANSITION_PARENTAL_CONTROL")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_PARENTAL_CONTROL", "kid-account-transition/parental-control", 871, "kid-account-transition");
                }
                return null;
            case -371296414:
                if (str.equals("GOLDENPATH_MARNUSHK")) {
                    return m90662N1("GOLDENPATH_MARNUSHK", "goldenpath/marnushk", 677, "goldenpath");
                }
                return null;
            case -352884430:
                if (str.equals("KID_PARENTAL_BLOCKING_TRACK")) {
                    return m90662N1("KID_PARENTAL_BLOCKING_TRACK", "kid-parental-blocking/track", 877, "kid-parental-blocking");
                }
                return null;
            case -309844430:
                if (str.equals("SOCIAL_LISTENING_IPLONBOARDINGDIALOG")) {
                    return m90662N1("SOCIAL_LISTENING_IPLONBOARDINGDIALOG", "social-listening/iplonboardingdialog", 1847, "social-listening");
                }
                return null;
            case -228298814:
                if (str.equals("PODCAST_SHOW_COMMUNITY")) {
                    return m90662N1("PODCAST_SHOW_COMMUNITY", "podcast/show/community", 1441, "podcast");
                }
                return null;
            case -220417262:
                if (str.equals("MRKT_HELP")) {
                    return m90662N1("MRKT_HELP", "mrkt/help", 1234, "mrkt");
                }
                return null;
            case -211412798:
                if (str.equals("SHARECARD_PLAYLIST")) {
                    return m90662N1("SHARECARD_PLAYLIST", "sharecard/playlist", 1807, "sharecard");
                }
                return null;
            case -144405118:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_BILLING")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_CREATE_BILLING", "mrkt/artist/campaigns/marquee-and-showcase/create/billing", 1026, "mrkt");
                }
                return null;
            case -120906974:
                if (str.equals("RADIO_STATION_CREATE_SHOWS")) {
                    return m90662N1("RADIO_STATION_CREATE_SHOWS", "radio/station/create/shows", 1565, "radio");
                }
                return null;
            case -86411598:
                if (str.equals("S4P_WEB_VIEW_HOW_TO_GET_DISCOVERED_ON_SPOTIFY")) {
                    return m90662N1("S4P_WEB_VIEW_HOW_TO_GET_DISCOVERED_ON_SPOTIFY", "s4p/web-view/how-to-get-discovered-on-spotify", 1714, "s4p");
                }
                return null;
            case -56147982:
                if (str.equals("LIVE_ERROR_DIALOG")) {
                    return m90662N1("LIVE_ERROR_DIALOG", "live/error-dialog", 906, "live");
                }
                return null;
            case -15087006:
                if (str.equals("MAGPIE_NOTIFICATIONS")) {
                    return m90698S2();
                }
                return null;
            case 82450:
                if (str.equals("STS")) {
                    return m90662N1("STS", "sts", 1917, "sts");
                }
                return null;
            case 50719698:
                if (str.equals("BLUEJAY_VOICE_PICKER")) {
                    return m90873s0();
                }
                return null;
            case 75408130:
                if (str.equals("WATCHAPP_DOWNLOAD_DEVICES_LIMIT_REACHED")) {
                    return m90662N1("WATCHAPP_DOWNLOAD_DEVICES_LIMIT_REACHED", "watchapp/download-devices-limit-reached", 2024, "watchapp");
                }
                return null;
            case 75571378:
                if (str.equals("OURDJ")) {
                    return m90662N1("OURDJ", "ourdj", 1334, "ourdj");
                }
                return null;
            case 79219778:
                if (str.equals("START")) {
                    return m90662N1("START", "start", 1912, "start");
                }
                return null;
            case 81848594:
                if (str.equals("VOICE")) {
                    return m90662N1("VOICE", "voice", 2007, "voice");
                }
                return null;
            case 82781042:
                if (str.equals("WORLD")) {
                    return m90662N1("WORLD", "world", 2100, "world");
                }
                return null;
            case 85419922:
                if (str.equals("TV_ABOUT_ENTITY")) {
                    return m90662N1("TV_ABOUT_ENTITY", "tv/about-entity", 1978, "tv");
                }
                return null;
            case 115176866:
                if (str.equals("JAM_JOINJAMLINKSHEET")) {
                    return m90662N1("JAM_JOINJAMLINKSHEET", "jam/joinjamlinksheet", 839, "jam");
                }
                return null;
            case 167567026:
                if (str.equals("ON_DEMAND_TRIAL_PLAN_OVERVIEW")) {
                    return m90843n3();
                }
                return null;
            case 184447778:
                if (str.equals("MRKT_ARTIST_PROFILE")) {
                    return m90662N1("MRKT_ARTIST_PROFILE", "mrkt/artist/profile", 1072, "mrkt");
                }
                return null;
            case 218825538:
                if (str.equals("OFFLINE_MIX_ENTITY")) {
                    return m90662N1("OFFLINE_MIX_ENTITY", "offline-mix/entity", 1324, "offline-mix");
                }
                return null;
            case 300457634:
                if (str.equals("SHARE_SNAPCHAT")) {
                    return m90662N1("SHARE_SNAPCHAT", "share/snapchat", 1806, "share");
                }
                return null;
            case 325972130:
                if (str.equals("S4P_AUTHENTICATION_ABOUT_SPOTITY_ACCOUNTS")) {
                    return m90662N1("S4P_AUTHENTICATION_ABOUT_SPOTITY_ACCOUNTS", "s4p/authentication/about-spotity-accounts", 1620, "s4p");
                }
                return null;
            case 340599026:
                if (str.equals("JAM_PARTICIPANTSETTINGSSHEET")) {
                    return m90662N1("JAM_PARTICIPANTSETTINGSSHEET", "jam/participantsettingssheet", 844, "jam");
                }
                return null;
            case 390453666:
                if (str.equals("ADSTUDIO_COLD_START_CAMPAIGN")) {
                    return m90662N1("ADSTUDIO_COLD_START_CAMPAIGN", "adstudio/cold-start/campaign", 71, "adstudio");
                }
                return null;
            case 395526130:
                if (str.equals("CONNECT_TUTORIALGAMECONSOLE")) {
                    return m90662N1("CONNECT_TUTORIALGAMECONSOLE", "connect/tutorialgameconsole", 394, "connect");
                }
                return null;
            case 418986930:
                if (str.equals("ADSTUDIO_COLD_START_CAMPAIGN_CONFIRMATION")) {
                    return m90662N1("ADSTUDIO_COLD_START_CAMPAIGN_CONFIRMATION", "adstudio/cold-start/campaign/confirmation", 72, "adstudio");
                }
                return null;
            case 439335794:
                if (str.equals("MRKT_FRONTDOOR_EVENTS")) {
                    return m90662N1("MRKT_FRONTDOOR_EVENTS", "mrkt/frontdoor/events", AdvertisementOwner.NONE, "mrkt");
                }
                return null;
            case 441162066:
                if (str.equals("MRKT_ARTIST_FAN_ENGAGEMENT")) {
                    return m90662N1("MRKT_ARTIST_FAN_ENGAGEMENT", "mrkt/artist/fan-engagement", 1045, "mrkt");
                }
                return null;
            case 453278578:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS", "mrkt/debug/hubs/component-reference/section-headers", 1167, "mrkt");
                }
                return null;
            case 496520338:
                if (str.equals("SHOWS_FORMAT_ITEM")) {
                    return m90662N1("SHOWS_FORMAT_ITEM", "shows/format/item", 1813, "shows");
                }
                return null;
            case 526780178:
                if (str.equals("SHARE_INSTAGRAM")) {
                    return m90662N1("SHARE_INSTAGRAM", "share/instagram", 1802, "share");
                }
                return null;
            case 551356722:
                if (str.equals("CONTEXTDISPATCH_ERROR")) {
                    return m90662N1("CONTEXTDISPATCH_ERROR", "contextdispatch/error", WindowState.FULL_SCREEN, "contextdispatch");
                }
                return null;
            case 562510866:
                if (str.equals("PROFILE_ACTIVITY_REPLAYS")) {
                    return m90662N1("PROFILE_ACTIVITY_REPLAYS", "profile/activity/replays", 1518, "profile");
                }
                return null;
            case 632694258:
                if (str.equals("CONTEXTMENU_EXPRESSIONVIDEO")) {
                    return m90662N1("CONTEXTMENU_EXPRESSIONVIDEO", "contextMenu/expressionvideo", 400, "contextMenu");
                }
                return null;
            case 642831826:
                if (str.equals("MRKT_TEAM_SWITCHER")) {
                    return m90662N1("MRKT_TEAM_SWITCHER", "mrkt/team-switcher", 1268, "mrkt");
                }
                return null;
            case 667627314:
                if (str.equals("HOMEMIX_GENREDETAIL")) {
                    return m90662N1("HOMEMIX_GENREDETAIL", "homemix/genredetail", 795, "homemix");
                }
                return null;
            case 677175586:
                if (str.equals("MRKT_TEAM_MANAGEMENT_PAYOUTS")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_PAYOUTS", "mrkt/team-management/payouts", 1265, "mrkt");
                }
                return null;
            case 689260226:
                if (str.equals("S4P_DEBUG_S4P_COMPONENTS")) {
                    return m90662N1("S4P_DEBUG_S4P_COMPONENTS", "s4p/debug/s4p-components", 1648, "s4p");
                }
                return null;
            case 712726066:
                if (str.equals("DATADOWNLOAD")) {
                    return m90909x1();
                }
                return null;
            case 770931698:
                if (str.equals("MRKT_FRONTDOOR_YOUR_WRAPPED")) {
                    return m90662N1("MRKT_FRONTDOOR_YOUR_WRAPPED", "mrkt/frontdoor/your-wrapped", 1233, "mrkt");
                }
                return null;
            case 824501890:
                if (str.equals("CONCERTS_CAMPAIGN")) {
                    return m90731X0();
                }
                return null;
            case 835769122:
                if (str.equals("MRKT_BTC_BOOKING_CAMPAIGNS_SUCCESS")) {
                    return m90662N1("MRKT_BTC_BOOKING_CAMPAIGNS_SUCCESS", "mrkt/btc/booking/campaigns-success", 1139, "mrkt");
                }
                return null;
            case 924243634:
                if (str.equals("ASSISTED_CURATION_SEARCH_SHOWS")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_SHOWS", "assisted-curation/search/shows", 187, "assisted-curation");
                }
                return null;
            case 943178114:
                if (str.equals("MERCH_DETAILS")) {
                    return m90662N1("MERCH_DETAILS", "merch-details", 991, "merch-details");
                }
                return null;
            case 957701346:
                if (str.equals("WWW_ACCOUNT_PAGES_LANDING")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_LANDING", "www-account-pages/landing", 2131, "www-account-pages");
                }
                return null;
            case 976433042:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_REVIEW")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_REVIEW", "mrkt/discovery-mode/unified-buying/review", 1178, "mrkt");
                }
                return null;
            case 1030514898:
                if (str.equals("SHUFFLE_TOGGLE_UPSELL")) {
                    return m90857p5();
                }
                return null;
            case 1041750562:
                if (str.equals("PARENTAL_CONTROL_ACCOUNT_DETAILS_VIDEO_SETTINGS")) {
                    return m90869r3();
                }
                return null;
            case 1056083202:
                if (str.equals("SONG_DNA_HISTORY")) {
                    return m90662N1("SONG_DNA_HISTORY", "song-dna-history", 1861, "song-dna-history");
                }
                return null;
            case 1059661938:
                if (str.equals("CONTEXTMENU_DJLANGUAGESETTINGS")) {
                    return m90787f1();
                }
                return null;
            case 1117847746:
                if (str.equals("ADSTUDIO_EDIT_CAMPAIGN_RESERVED_BOOKING")) {
                    return m90662N1("ADSTUDIO_EDIT_CAMPAIGN_RESERVED_BOOKING", "adstudio/edit/campaign/reserved-booking", 97, "adstudio");
                }
                return null;
            case 1148299026:
                if (str.equals("PODCAST_SHOW_GATEDACCESSEDUCATION")) {
                    return m90662N1("PODCAST_SHOW_GATEDACCESSEDUCATION", "podcast/show/gatedaccesseducation", 1442, "podcast");
                }
                return null;
            case 1185606962:
                if (str.equals("TASTEPROFILE")) {
                    return m90582B5();
                }
                return null;
            case 1196568066:
                if (str.equals("SETTINGS_CONTENT_PERSONALIZATION")) {
                    return m90662N1("SETTINGS_CONTENT_PERSONALIZATION", "settings/content-personalization", 1756, "settings");
                }
                return null;
            case 1216579762:
                if (str.equals("GOLDENPATH_ABHIROOPKISHOREP")) {
                    return m90662N1("GOLDENPATH_ABHIROOPKISHOREP", "goldenpath/abhiroopkishorep", 593, "goldenpath");
                }
                return null;
            case 1280356834:
                if (str.equals("SIGNUP_PASSWORD")) {
                    return m90662N1("SIGNUP_PASSWORD", "signup/password", 1836, "signup");
                }
                return null;
            case 1306230802:
                if (str.equals("IMAGE_PICKER")) {
                    return m90809i2();
                }
                return null;
            case 1381773474:
                if (str.equals("ADSTUDIO_BUSINESS_BILLING")) {
                    return m90662N1("ADSTUDIO_BUSINESS_BILLING", "adstudio/business/billing", 53, "adstudio");
                }
                return null;
            case 1402036674:
                if (str.equals("PAYMENTFAILURE_RESUBSCRIPTIONMODAL")) {
                    return m90662N1("PAYMENTFAILURE_RESUBSCRIPTIONMODAL", "paymentfailure/resubscriptionmodal", 1374, "paymentfailure");
                }
                return null;
            case 1442790770:
                if (str.equals("WWW_ACCOUNT_PAGES_RECOVERPLAYLISTS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_RECOVERPLAYLISTS", "www-account-pages/recoverplaylists", 2159, "www-account-pages");
                }
                return null;
            case 1494617282:
                if (str.equals("CONTEXTMENU_ALBUMPRERELEASE")) {
                    return m90662N1("CONTEXTMENU_ALBUMPRERELEASE", "contextmenu/albumprerelease", 405, "contextmenu");
                }
                return null;
            case 1497788146:
                if (str.equals("REINVENTFREE_INDIA_EDUCATION_UPSELL")) {
                    return m90662N1("REINVENTFREE_INDIA_EDUCATION_UPSELL", "reinventfree-india-education-upsell", 1583, "reinventfree-india-education-upsell");
                }
                return null;
            case 1512388146:
                if (str.equals("HOME_MUSIC_VIDEOS")) {
                    return m90753a2();
                }
                return null;
            case 1531961490:
                if (str.equals("MRKT_DISTRIBUTOR_INVITE")) {
                    return m90662N1("MRKT_DISTRIBUTOR_INVITE", "mrkt/distributor-invite", 1185, "mrkt");
                }
                return null;
            case 1557427202:
                if (str.equals("MARQUEE")) {
                    return m90719V2();
                }
                return null;
            case 1587669746:
                if (str.equals("PODCAST_SHOW_AUDIOBOOK_GATEDACCESSEDUCATION")) {
                    return m90662N1("PODCAST_SHOW_AUDIOBOOK_GATEDACCESSEDUCATION", "podcast/show/audiobook/gatedaccesseducation", 1440, "podcast");
                }
                return null;
            case 1608881794:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_VIDEO_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_VIDEO_DETAILS", "mrkt/artist/video/music-videos/upload/video-details", 1127, "mrkt");
                }
                return null;
            case 1711947202:
                if (str.equals("TERMS_PRIVACYPOLICY")) {
                    return m90662N1("TERMS_PRIVACYPOLICY", "terms/privacypolicy", 1968, "terms");
                }
                return null;
            case 1724306466:
                if (str.equals("WWW_ACCOUNT_PAGES_MANAGE_SUBSCRIPTION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_MANAGE_SUBSCRIPTION", "www-account-pages/manage-subscription", 2137, "www-account-pages");
                }
                return null;
            case 1732016898:
                if (str.equals("PROFILE_PRONOUNS")) {
                    return m90919y4();
                }
                return null;
            case 1770599186:
                if (str.equals("PROFILE_COMPLETION_SHEET")) {
                    return m90662N1("PROFILE_COMPLETION_SHEET", "profile-completion-sheet", 1515, "profile-completion-sheet");
                }
                return null;
            case 1779511602:
                if (str.equals("DRIVING_DRIVINGMODE")) {
                    return m90662N1("DRIVING_DRIVINGMODE", "driving/drivingMode", 488, "driving");
                }
                return null;
            case 1823901826:
                if (str.equals("MAGPIE_PRIVACY")) {
                    return m90705T2();
                }
                return null;
            case 1830659698:
                if (str.equals("GOLDENPATH_HRICHARDSON")) {
                    return m90662N1("GOLDENPATH_HRICHARDSON", "goldenpath/hrichardson", 641, "goldenpath");
                }
                return null;
            case 1832569282:
                if (str.equals("BOOTCAMP_TFB_TOPTRACKS")) {
                    return m90662N1("BOOTCAMP_TFB_TOPTRACKS", "bootcamp/tfb/toptracks", 240, "bootcamp");
                }
                return null;
            case 1842769906:
                if (str.equals("ADSTUDIO_EDIT_AD")) {
                    return m90662N1("ADSTUDIO_EDIT_AD", "adstudio/edit/ad", 92, "adstudio");
                }
                return null;
            case 1848254530:
                if (str.equals("MRKT_ARTIST_PROFILE_MERCH")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_MERCH", "mrkt/artist/profile/merch", 1092, "mrkt");
                }
                return null;
            case 1878718450:
                if (str.equals("AGE_SIGNAL_BLOCKED_PARENT_SETUP")) {
                    return m90662N1("AGE_SIGNAL_BLOCKED_PARENT_SETUP", "age-signal/blocked/parent-setup", 132, "age-signal");
                }
                return null;
            case 1891663442:
                if (str.equals("CONNECT_OVERLAY_NEWDEVICE")) {
                    return m90662N1("CONNECT_OVERLAY_NEWDEVICE", "connect/overlay/newdevice", 387, "connect");
                }
                return null;
            case 1936854226:
                if (str.equals("PORTAL_HOME")) {
                    return m90662N1("PORTAL_HOME", "portal/home", 1472, "portal");
                }
                return null;
            case 1967708146:
                if (str.equals("TASTEPROFILE_FEEDBACK")) {
                    return m90662N1("TASTEPROFILE_FEEDBACK", "tasteprofile/feedback", 1966, "tasteprofile");
                }
                return null;
            case 2017963842:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_REVIEW_AND_SUBMIT")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_REVIEW_AND_SUBMIT", "adstudio/add-to-existing-ad-set/review-and-submit", 43, "adstudio");
                }
                return null;
            case 2037021538:
                if (str.equals("CONNECT_EDUCATIONPAGE")) {
                    return m90662N1("CONNECT_EDUCATIONPAGE", "connect/educationpage", 385, "connect");
                }
                return null;
            case 2046568290:
                if (str.equals("COLLECTION_PODCASTS_FOLLOWING")) {
                    return m90662N1("COLLECTION_PODCASTS_FOLLOWING", "collection/podcasts/following", 352, "collection");
                }
                return null;
            case 2050617522:
                if (str.equals("CARS_DJSUGGESTEDPROMPTS")) {
                    return m90662N1("CARS_DJSUGGESTEDPROMPTS", "cars/djsuggestedprompts", 273, "cars");
                }
                return null;
            case 2092150178:
                if (str.equals("HOMEMIX_FACEPILEDETAIL")) {
                    return m90662N1("HOMEMIX_FACEPILEDETAIL", "homemix/facepiledetail", 794, "homemix");
                }
                return null;
            case 2117707330:
                if (str.equals("SETTINGS_LANGUAGES_ROOT")) {
                    return m90662N1("SETTINGS_LANGUAGES_ROOT", "settings/languages/root", 1770, "settings");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: R */
    public static cbm0 m90688R() {
        return m90662N1("AIDJ_MIC_PERMISSION", "aidj/mic-permission", 140, "aidj");
    }

    /* JADX INFO: renamed from: R0 */
    public static cbm0 m90689R0() {
        return m90662N1("COLLECTION_YOUREPISODES_SETTINGS_AUTODOWNLOADLIMIT", "collection/yourepisodes/settings/autodownloadlimit", 362, "collection");
    }

    /* JADX INFO: renamed from: R1 */
    public static cbm0 m90690R1() {
        return m90662N1("GRADUATION_INITIATE", "graduation/initiate", 751, "graduation");
    }

    /* JADX INFO: renamed from: R2 */
    public static cbm0 m90691R2() {
        return m90662N1("MAGPIE_ERROR", "magpie/error", 953, "magpie");
    }

    /* JADX INFO: renamed from: R3 */
    public static cbm0 m90692R3() {
        return m90662N1("PLAYLIST_OVERLAP_MESSAGING", "playlist/overlap-messaging", 1418, "playlist");
    }

    /* JADX INFO: renamed from: R4 */
    public static cbm0 m90693R4() {
        return m90662N1("REINVENTFREE_TIME_CAP_PIVOT_MULTI_SONG_UPSELL", "reinventfree-time-cap-pivot-multi-song-upsell", 1586, "reinventfree-time-cap-pivot-multi-song-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: R5 */
    public static cbm0 m90694R5(String str) {
        switch (str.hashCode()) {
            case -2120488989:
                if (str.equals("S4P_ONBOARDING_LANDING")) {
                    return m90662N1("S4P_ONBOARDING_LANDING", "s4p/onboarding/landing", 1666, "s4p");
                }
                return null;
            case -2118018157:
                if (str.equals("BLEND_ENTITY_TRACKAFFILIATION")) {
                    return m90662N1("BLEND_ENTITY_TRACKAFFILIATION", "blend/entity/trackaffiliation", 215, "blend");
                }
                return null;
            case -2114437645:
                if (str.equals("ADSTUDIO_PIXELS")) {
                    return m90662N1("ADSTUDIO_PIXELS", "adstudio/pixels", 104, "adstudio");
                }
                return null;
            case -2111023837:
                if (str.equals("CHAT_REACTIONS_SHEET")) {
                    return m90662N1("CHAT_REACTIONS_SHEET", "chat/reactions-sheet", 320, "chat");
                }
                return null;
            case -2096543949:
                if (str.equals("S4P_EPISODES_SELECT")) {
                    return m90662N1("S4P_EPISODES_SELECT", "s4p/episodes/select", 1651, "s4p");
                }
                return null;
            case -2088553517:
                if (str.equals("S4P_SHOW_SWITCHER")) {
                    return m90662N1("S4P_SHOW_SWITCHER", "s4p/show-switcher", 1707, "s4p");
                }
                return null;
            case -2078658733:
                if (str.equals("JAM_FREEUSERUPSELLSHUFFLESHEET")) {
                    return m90662N1("JAM_FREEUSERUPSELLSHUFFLESHEET", "jam/freeuserupsellshufflesheet", 834, "jam");
                }
                return null;
            case -2077709277:
                if (str.equals("SETTINGS")) {
                    return m90763b5();
                }
                return null;
            case -2027965325:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_REVIEW_AND_SUBMIT")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_REVIEW_AND_SUBMIT", "adstudio/duplicate-ad-set-only/review-and-submit", 87, "adstudio");
                }
                return null;
            case -1966007901:
                if (str.equals("USERPLAYLISTRESOLVER")) {
                    return m90662N1("USERPLAYLISTRESOLVER", "userplaylistresolver", 2001, "userplaylistresolver");
                }
                return null;
            case -1922536685:
                if (str.equals("ARTIST_RELATED")) {
                    return m90662N1("ARTIST_RELATED", "artist/related", 169, "artist");
                }
                return null;
            case -1905108253:
                if (str.equals("HIFI_DOWNLOAD_SHEET")) {
                    return m90662N1("HIFI_DOWNLOAD_SHEET", "hifi/download-sheet", 766, "hifi");
                }
                return null;
            case -1843786221:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_ROWS", "mrkt/debug/hubs/component-reference/rows", 1165, "mrkt");
                }
                return null;
            case -1803105565:
                if (str.equals("MRKT_MOBILE_STATS_LATEST_ALBUM")) {
                    return m90662N1("MRKT_MOBILE_STATS_LATEST_ALBUM", "mrkt/mobile-stats/latest-album", 1246, "mrkt");
                }
                return null;
            case -1789374205:
                if (str.equals("PROFILE_IMAGEPREVIEW")) {
                    return m90662N1("PROFILE_IMAGEPREVIEW", "profile/imagepreview", 1530, "profile");
                }
                return null;
            case -1730851453:
                if (str.equals("PARTNERACCOUNTLINKING")) {
                    return m90662N1("PARTNERACCOUNTLINKING", "partneraccountlinking", 1371, "partneraccountlinking");
                }
                return null;
            case -1701587405:
                if (str.equals("WWW_ACCOUNT_PAGES_EMAIL_VERIFICATION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_EMAIL_VERIFICATION", "www-account-pages/email-verification", 2119, "www-account-pages");
                }
                return null;
            case -1651629005:
                if (str.equals("S4P_SETTINGS")) {
                    return m90662N1("S4P_SETTINGS", "s4p/settings", 1686, "s4p");
                }
                return null;
            case -1617341581:
                if (str.equals("GOLDENPATH_GOKTUGG")) {
                    return m90662N1("GOLDENPATH_GOKTUGG", "goldenpath/goktugg", 633, "goldenpath");
                }
                return null;
            case -1598815309:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SETUP")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SETUP", "mrkt/artist/campaigns/marquee-and-showcase/setup", 1032, "mrkt");
                }
                return null;
            case -1547976525:
                if (str.equals("CHALLENGE_TOTP")) {
                    return m90662N1("CHALLENGE_TOTP", "challenge/totp", 291, "challenge");
                }
                return null;
            case -1481285917:
                if (str.equals("MANAGE_ORG_INFO")) {
                    return m90662N1("MANAGE_ORG_INFO", "manage/org-info", 967, "manage");
                }
                return null;
            case -1448248189:
                if (str.equals("ENTITYSEGMENTS")) {
                    return m90578B1();
                }
                return null;
            case -1414710557:
                if (str.equals("AD_BASED_ON_DEMAND")) {
                    return m90662N1("AD_BASED_ON_DEMAND", "ad-based-on-demand", 8, "ad-based-on-demand");
                }
                return null;
            case -1284460653:
                if (str.equals("CHARTS_MERCHCOLLECTION")) {
                    return m90662N1("CHARTS_MERCHCOLLECTION", "charts/merchcollection", 300, "charts");
                }
                return null;
            case -1279287309:
                if (str.equals("ADSTUDIO_EVENTS_CAPI_INSTALL")) {
                    return m90662N1("ADSTUDIO_EVENTS_CAPI_INSTALL", "adstudio/events/capi/install", 100, "adstudio");
                }
                return null;
            case -1247778173:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA", "www-account-pages/genalpha", 2121, "www-account-pages");
                }
                return null;
            case -1198635805:
                if (str.equals("WEAR_SETTINGS")) {
                    return m90662N1("WEAR_SETTINGS", "wear/settings", 2080, "wear");
                }
                return null;
            case -1136511501:
                if (str.equals("GOLDENPATH_CASSB")) {
                    return m90662N1("GOLDENPATH_CASSB", "goldenpath/cassb", 609, "goldenpath");
                }
                return null;
            case -1132324797:
                if (str.equals("GOLDENPATH_GREGA")) {
                    return m90662N1("GOLDENPATH_GREGA", "goldenpath/grega", 635, "goldenpath");
                }
                return null;
            case -1127035389:
                if (str.equals("GOLDENPATH_MIVIC")) {
                    return m90662N1("GOLDENPATH_MIVIC", "goldenpath/mivic", 688, "goldenpath");
                }
                return null;
            case -1122533341:
                if (str.equals("GOLDENPATH_REZAN")) {
                    return m90662N1("GOLDENPATH_REZAN", "goldenpath/rezan", 717, "goldenpath");
                }
                return null;
            case -1121389821:
                if (str.equals("KID_ACCOUNT_TRANSITION_WELCOME")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_WELCOME", "kid-account-transition/welcome", 875, "kid-account-transition");
                }
                return null;
            case -1090286749:
                if (str.equals("DIALOG_PROFILE_ACTIVITY_ONDEMANDUNAVAILABLE")) {
                    return m90662N1("DIALOG_PROFILE_ACTIVITY_ONDEMANDUNAVAILABLE", "dialog/profile/activity/ondemandunavailable", 474, "dialog");
                }
                return null;
            case -999992605:
                if (str.equals("TASTE_ONBOARDING")) {
                    return m90662N1("TASTE_ONBOARDING", "taste-onboarding", 1964, "taste-onboarding");
                }
                return null;
            case -990074397:
                if (str.equals("YOUR_SOUND")) {
                    return m90662N1("YOUR_SOUND", "your-sound", 2173, "your-sound");
                }
                return null;
            case -952308461:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_IMAGE_GALLERY_ADD", "mrkt/artist/profile/image-gallery/add", 1089, "mrkt");
                }
                return null;
            case -938231181:
                if (str.equals("SHARE_MESSENGER")) {
                    return m90662N1("SHARE_MESSENGER", "share/messenger", 1803, "share");
                }
                return null;
            case -916469197:
                if (str.equals("SETTINGS_NOTIFICATIONS_CHANNEL_DETAILS")) {
                    return m90662N1("SETTINGS_NOTIFICATIONS_CHANNEL_DETAILS", "settings/notifications/channel-details", 1778, "settings");
                }
                return null;
            case -865844717:
                if (str.equals("MAGPIE_REFINE")) {
                    return m90662N1("MAGPIE_REFINE", "magpie/refine", 957, "magpie");
                }
                return null;
            case -863195197:
                if (str.equals("CHAT_ENTITY_PICKER")) {
                    return m90577B0();
                }
                return null;
            case -830934061:
                if (str.equals("GOLDENPATH_DOGANK")) {
                    return m90662N1("GOLDENPATH_DOGANK", "goldenpath/dogank", 619, "goldenpath");
                }
                return null;
            case -830629437:
                if (str.equals("OFFLINE")) {
                    return m90662N1("OFFLINE", "offline", 1323, "offline");
                }
                return null;
            case -804055917:
                if (str.equals("READALONG_FULLSCREEN")) {
                    return m90637J4();
                }
                return null;
            case -747406301:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS_DARK")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_SECTION_HEADERS_DARK", "mrkt/debug/hubs/component-reference/section-headers-dark", 1168, "mrkt");
                }
                return null;
            case -696911933:
                if (str.equals("MRKT_ARTIST_VIDEO_CANVAS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CANVAS", "mrkt/artist/video/canvas", 1109, "mrkt");
                }
                return null;
            case -688279277:
                if (str.equals("MRKT_FRONTDOOR_LIVE_EVENTS")) {
                    return m90662N1("MRKT_FRONTDOOR_LIVE_EVENTS", "mrkt/frontdoor/live-events", 1215, "mrkt");
                }
                return null;
            case -679885645:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_OVERVIEW")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_OVERVIEW", "mrkt/debug/hubs/component-reference/overview", 1162, "mrkt");
                }
                return null;
            case -642488541:
                if (str.equals("EVENTSENDER_DEBUG")) {
                    return m90662N1("EVENTSENDER_DEBUG", "eventsender/debug", 512, "eventsender");
                }
                return null;
            case -609297645:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_SELECTION")) {
                    return m90662N1("MRKT_BTC_BOOKING_UPLOAD_SELECTION", "mrkt/btc/booking/upload/selection", 1142, "mrkt");
                }
                return null;
            case -607483757:
                if (str.equals("CHAT_LYRICS_STICKERS_PICKER")) {
                    return m90605F0();
                }
                return null;
            case -519888813:
                if (str.equals("SETTINGS_CONNECTIVITY")) {
                    return m90662N1("SETTINGS_CONNECTIVITY", "settings/connectivity", 1754, "settings");
                }
                return null;
            case -510361565:
                if (str.equals("MRKT_SONGWRITER_PROFILE")) {
                    return m90662N1("MRKT_SONGWRITER_PROFILE", "mrkt/songwriter/profile", 1256, "mrkt");
                }
                return null;
            case -500451885:
                if (str.equals("GOLDENPATH_PABLOV")) {
                    return m90662N1("GOLDENPATH_PABLOV", "goldenpath/pablov", 710, "goldenpath");
                }
                return null;
            case -498596717:
                if (str.equals("SETTINGS_APP_ICON")) {
                    return m90784e5();
                }
                return null;
            case -443006285:
                if (str.equals("GOLDENPATH_RAHULR")) {
                    return m90662N1("GOLDENPATH_RAHULR", "goldenpath/rahulr", 714, "goldenpath");
                }
                return null;
            case -423615485:
                if (str.equals("LOGIN_WRONGEMAILORPASSWORD")) {
                    return m90642K2();
                }
                return null;
            case -414210253:
                if (str.equals("GOLDENPATH_SANIAZ")) {
                    return m90662N1("GOLDENPATH_SANIAZ", "goldenpath/saniaz", 725, "goldenpath");
                }
                return null;
            case -408508333:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_FULL_SERVICE_AUDIO")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_FULL_SERVICE_AUDIO", "adstudio/add-to-existing-ad-set/ad-full-service-audio", 40, "adstudio");
                }
                return null;
            case -364030733:
                if (str.equals("WATCHFEED_WRAPPED")) {
                    return m90792f6();
                }
                return null;
            case -338968477:
                if (str.equals("SUBTITLES_SELECTOR")) {
                    return m90575A5();
                }
                return null;
            case -294163757:
                if (str.equals("DIALOG_LOCALFILESIMPORT_OK")) {
                    return m90662N1("DIALOG_LOCALFILESIMPORT_OK", "dialog/localfilesimport/ok", 470, "dialog");
                }
                return null;
            case -220109645:
                if (str.equals("MRKT_ROOT")) {
                    return m90662N1("MRKT_ROOT", "mrkt/root", 1252, "mrkt");
                }
                return null;
            case -217316845:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_ERROR")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_ERROR", "mrkt/discovery-mode/unified-buying/update/csv/error", 1181, "mrkt");
                }
                return null;
            case -182520109:
                if (str.equals("KID_ACCOUNT_CREATION_EDUCATION")) {
                    return m90662N1("KID_ACCOUNT_CREATION_EDUCATION", "kid-account-creation/education", 853, "kid-account-creation");
                }
                return null;
            case -181295165:
                if (str.equals("YOURLIBRARY_TAG")) {
                    return m90662N1("YOURLIBRARY_TAG", "yourlibrary/tag", 2189, "yourlibrary");
                }
                return null;
            case -176298365:
                if (str.equals("S4P_UNIVERSAL_CREATION")) {
                    return m90662N1("S4P_UNIVERSAL_CREATION", "s4p/universal-creation", 1713, "s4p");
                }
                return null;
            case -112673805:
                if (str.equals("LIVE_LEGALDISCLOSURE")) {
                    return m90662N1("LIVE_LEGALDISCLOSURE", "live/legaldisclosure", 907, "live");
                }
                return null;
            case -106899373:
                if (str.equals("KID_ACCOUNT_TRANSITION_ENTRY")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_ENTRY", "kid-account-transition/entry", 868, "kid-account-transition");
                }
                return null;
            case -101833933:
                if (str.equals("SSO_PARTNERACCOUNTLINKING")) {
                    return m90920y5();
                }
                return null;
            case -96219965:
                if (str.equals("SETTINGS_QUALITY")) {
                    return m90662N1("SETTINGS_QUALITY", "settings/quality", 1784, "settings");
                }
                return null;
            case -89102045:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_UPLOAD")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_UPLOAD", "mrkt/discovery-mode/unified-buying/create/csv/upload", 1176, "mrkt");
                }
                return null;
            case -55688365:
                if (str.equals("PORTAL_SEARCH_STREAMING_WORKFLOWS")) {
                    return m90662N1("PORTAL_SEARCH_STREAMING_WORKFLOWS", "portal/search-streaming-workflows", 1482, "portal");
                }
                return null;
            case -54287117:
                if (str.equals("SIGNUP_PARENTALCONSENTLOGINOPTIONS")) {
                    return m90662N1("SIGNUP_PARENTALCONSENTLOGINOPTIONS", "signup/parentalconsentloginoptions", 1835, "signup");
                }
                return null;
            case -27094317:
                if (str.equals("PARTNERSCOPESCONSENT")) {
                    return m90662N1("PARTNERSCOPESCONSENT", "partnerscopesconsent", 1372, "partnerscopesconsent");
                }
                return null;
            case 24888995:
                if (str.equals("UNKNOWN_NOTLOADED")) {
                    return m90662N1("UNKNOWN_NOTLOADED", "unknown/notloaded", 1994, "unknown");
                }
                return null;
            case 64921139:
                if (str.equals("DEBUG")) {
                    return m90916y1();
                }
                return null;
            case 67703139:
                if (str.equals("GENRE")) {
                    return m90662N1("GENRE", "genre", 587, "genre");
                }
                return null;
            case 126057075:
                if (str.equals("SETTINGS_LANGUAGE_SETTINGS_ROOT")) {
                    return m90662N1("SETTINGS_LANGUAGE_SETTINGS_ROOT", "settings/language-settings-root", 1766, "settings");
                }
                return null;
            case 136435059:
                if (str.equals("MRKT_ARTIST_AUDIENCE_ENGAGEMENT")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_ENGAGEMENT", "mrkt/artist/audience/engagement", 1009, "mrkt");
                }
                return null;
            case 157276499:
                if (str.equals("MUTUAL_FOLLOW_SEND_MESSAGE_SHEET")) {
                    return m90775d3();
                }
                return null;
            case 162056307:
                if (str.equals("MANAGE_AGREEMENT_DETAILS")) {
                    return m90662N1("MANAGE_AGREEMENT_DETAILS", "manage/agreement-details", 964, "manage");
                }
                return null;
            case 212931539:
                if (str.equals("PODCAST_EPISODE_COMMENTS")) {
                    return m90662N1("PODCAST_EPISODE_COMMENTS", "podcast/episode/comments", 1430, "podcast");
                }
                return null;
            case 256281763:
                if (str.equals("GOLDENPATH_RBEAZLEY")) {
                    return m90662N1("GOLDENPATH_RBEAZLEY", "goldenpath/rbeazley", 715, "goldenpath");
                }
                return null;
            case 321959171:
                if (str.equals("SETTINGS_NOTIFICATIONS_CHANNELS")) {
                    return m90662N1("SETTINGS_NOTIFICATIONS_CHANNELS", "settings/notifications/channels", 1779, "settings");
                }
                return null;
            case 387005411:
                if (str.equals("REINVENTFREE_SCRUB_UPSELL")) {
                    return m90679P4();
                }
                return null;
            case 409704899:
                if (str.equals("GOLDENPATH_JRAMBHIA")) {
                    return m90662N1("GOLDENPATH_JRAMBHIA", "goldenpath/jrambhia", 657, "goldenpath");
                }
                return null;
            case 530023331:
                if (str.equals("WATCHAPP_PLAYLIST_ENTITY")) {
                    return m90662N1("WATCHAPP_PLAYLIST_ENTITY", "watchapp/playlist-entity", 2037, "watchapp");
                }
                return null;
            case 540437283:
                if (str.equals("LOGIN_CONTINUEWITH")) {
                    return m90662N1("LOGIN_CONTINUEWITH", "login/continuewith", 919, "login");
                }
                return null;
            case 594277827:
                if (str.equals("PHONENUMBER_PHONENUMBERENTRY")) {
                    return m90662N1("PHONENUMBER_PHONENUMBERENTRY", "phonenumber/phonenumberentry", 1385, "phonenumber");
                }
                return null;
            case 600623747:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_UNFINISHED")) {
                    return m90662N1("COLLECTION_PODCASTS_EPISODES_UNFINISHED", "collection/podcasts/episodes/unfinished", 350, "collection");
                }
                return null;
            case 605043939:
                if (str.equals("BOOTCAMP_CHORDS")) {
                    return m90662N1("BOOTCAMP_CHORDS", "bootcamp/chords", 236, "bootcamp");
                }
                return null;
            case 693049651:
                if (str.equals("GOLDENPATH_SFERGUSON")) {
                    return m90662N1("GOLDENPATH_SFERGUSON", "goldenpath/sferguson", 730, "goldenpath");
                }
                return null;
            case 695023235:
                if (str.equals("ALLBOARDING_CONTEXTUALAUDIO")) {
                    return m90662N1("ALLBOARDING_CONTEXTUALAUDIO", "allboarding/contextualaudio", 145, kc3.f121351b);
                }
                return null;
            case 695354963:
                if (str.equals("WWW_ACCOUNT_PAGES_PRIVACY")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PRIVACY", "www-account-pages/privacy", 2156, "www-account-pages");
                }
                return null;
            case 737531139:
                if (str.equals("S4P_WEB_VIEW_SUBSCRIPTION_ANALYTICS")) {
                    return m90662N1("S4P_WEB_VIEW_SUBSCRIPTION_ANALYTICS", "s4p/web-view/subscription-analytics", 1717, "s4p");
                }
                return null;
            case 759834483:
                if (str.equals("WWW_ACCOUNT_PAGES_NOTIFICATIONS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_NOTIFICATIONS", "www-account-pages/notifications", 2139, "www-account-pages");
                }
                return null;
            case 772779907:
                if (str.equals("CONTEXTMENU_PLAYLIST")) {
                    return m90815j1();
                }
                return null;
            case 838864307:
                if (str.equals("BLUEJAY_CREATE")) {
                    return m90662N1("BLUEJAY_CREATE", "bluejay/create", 225, "bluejay");
                }
                return null;
            case 903803939:
                if (str.equals("GOLDENPATH_OENGLOF")) {
                    return m90662N1("GOLDENPATH_OENGLOF", "goldenpath/oenglof", 707, "goldenpath");
                }
                return null;
            case 923149811:
                if (str.equals("BILLING_PAGE")) {
                    return m90807i0();
                }
                return null;
            case 949366003:
                if (str.equals("JAM_FREEUSERUPSELLSKIPSHEET")) {
                    return m90662N1("JAM_FREEUSERUPSELLSKIPSHEET", "jam/freeuserupsellskipsheet", 835, "jam");
                }
                return null;
            case 991259219:
                if (str.equals("MRKT_ARTIST_EVENT")) {
                    return m90662N1("MRKT_ARTIST_EVENT", "mrkt/artist/event", 1042, "mrkt");
                }
                return null;
            case 993848147:
                if (str.equals("SRC_RIGHTSHOLDER_DISPUTES_DETAILS")) {
                    return m90662N1("SRC_RIGHTSHOLDER_DISPUTES_DETAILS", "src/rightsholder/disputes/details", 1907, "src");
                }
                return null;
            case 1067596771:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_CREATE")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CLIPS_CREATE", "mrkt/artist/video/clips/create", 1112, "mrkt");
                }
                return null;
            case 1108095395:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_REVIEW")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_REVIEW", "spotify-for-authors/dvn-creation/review", 1881, "spotify-for-authors");
                }
                return null;
            case 1117056899:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD", "mrkt/artist/video/music-videos/upload", 1122, "mrkt");
                }
                return null;
            case 1152170019:
                if (str.equals("KID_ACCOUNT_TRANSITION_USER_INFO")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_USER_INFO", "kid-account-transition/user-info", 874, "kid-account-transition");
                }
                return null;
            case 1230590739:
                if (str.equals("HOMETHING_SETTINGS")) {
                    return m90662N1("HOMETHING_SETTINGS", "homething/settings", ContentDeliveryAdvertisementCapability.LINEAR_3DAY, "homething");
                }
                return null;
            case 1397496483:
                if (str.equals("MRKT_FRONTDOOR_CLAIM")) {
                    return m90662N1("MRKT_FRONTDOOR_CLAIM", "mrkt/frontdoor/claim", 1199, "mrkt");
                }
                return null;
            case 1402029107:
                if (str.equals("FREETIER_TASTEONBOARDING_ARTISTPICKER")) {
                    return m90662N1("FREETIER_TASTEONBOARDING_ARTISTPICKER", "freetier/tasteonboarding/artistpicker", 567, "freetier");
                }
                return null;
            case 1402914915:
                if (str.equals("BLEND_ENTITY_EDITNAME")) {
                    return m90821k0();
                }
                return null;
            case 1418802883:
                if (str.equals("PARENTAL_CONTROL_LOGIN_CHOICE")) {
                    return m90883t3();
                }
                return null;
            case 1439542467:
                if (str.equals("SPOTIFY_FOR_AUTHORS_NAVIGATION_ELEMENT")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_NAVIGATION_ELEMENT", "spotify-for-authors/navigation/element", 1885, "spotify-for-authors");
                }
                return null;
            case 1478676867:
                if (str.equals("PODCASTMIX_CONTROLS_MUSIC")) {
                    return m90662N1("PODCASTMIX_CONTROLS_MUSIC", "podcastmix/controls/music", 1462, "podcastmix");
                }
                return null;
            case 1519238403:
                if (str.equals("S4P_ORG_EPISODES")) {
                    return m90662N1("S4P_ORG_EPISODES", "s4p/org-episodes", 1668, "s4p");
                }
                return null;
            case 1534060195:
                if (str.equals("GOLDENPATH_KANAKOA")) {
                    return m90662N1("GOLDENPATH_KANAKOA", "goldenpath/kanakoa", 663, "goldenpath");
                }
                return null;
            case 1548467619:
                if (str.equals("S4P_AUTHENTICATION_ACCOUNT_INFORMATION")) {
                    return m90662N1("S4P_AUTHENTICATION_ACCOUNT_INFORMATION", "s4p/authentication/account-information", 1621, "s4p");
                }
                return null;
            case 1596865123:
                if (str.equals("GOLDENPATH_ACESHIGH")) {
                    return m90662N1("GOLDENPATH_ACESHIGH", "goldenpath/aceshigh", 595, "goldenpath");
                }
                return null;
            case 1640749331:
                if (str.equals("GOLDENPATH_DORA_EXPLORER")) {
                    return m90662N1("GOLDENPATH_DORA_EXPLORER", "goldenpath/dora_explorer", 620, "goldenpath");
                }
                return null;
            case 1715973731:
                if (str.equals("MARTINI_HISTORY")) {
                    return m90662N1("MARTINI_HISTORY", "martini/history", 986, "martini");
                }
                return null;
            case 1793703539:
                if (str.equals("COLLECTION_YOURHIGHLIGHTS")) {
                    return m90662N1("COLLECTION_YOURHIGHLIGHTS", "collection/yourhighlights", 365, "collection");
                }
                return null;
            case 1800435251:
                if (str.equals("BLEND_INVITATION_GROUPBLENDSJOIN")) {
                    return m90662N1("BLEND_INVITATION_GROUPBLENDSJOIN", "blend/invitation/groupblendsjoin", 217, "blend");
                }
                return null;
            case 1800791587:
                if (str.equals("MRKT_REQUEST_ACCESS_MOBILE_LAUNCHER")) {
                    return m90662N1("MRKT_REQUEST_ACCESS_MOBILE_LAUNCHER", "mrkt/request-access/mobile-launcher", 1251, "mrkt");
                }
                return null;
            case 1856105507:
                if (str.equals("CONTEXTMENU_EPISODE_SLEEPTIMER")) {
                    return m90808i1();
                }
                return null;
            case 1913054451:
                if (str.equals("PODCAST_SHOW_RECOMMENDATIONS")) {
                    return m90662N1("PODCAST_SHOW_RECOMMENDATIONS", "podcast/show/recommendations", 1447, "podcast");
                }
                return null;
            case 1926378275:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_REVIEW_SUBMIT")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_REVIEW_SUBMIT", "mrkt/artist/video/music-videos/upload/review-submit", 1125, "mrkt");
                }
                return null;
            case 1952314515:
                if (str.equals("LISTENINGPARTY_END_ROOM")) {
                    return m90662N1("LISTENINGPARTY_END_ROOM", "listeningparty/end-room", 895, "listeningparty");
                }
                return null;
            case 1953253971:
                if (str.equals("MOMENTS")) {
                    return m90662N1("MOMENTS", "moments", 995, "moments");
                }
                return null;
            case 2080049043:
                if (str.equals("MRKT_ARTIST_PROFILE_AVATAR_EDIT")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_AVATAR_EDIT", "mrkt/artist/profile/avatar/edit", 1079, "mrkt");
                }
                return null;
            case 2086770419:
                if (str.equals("GOLDENPATH_ZEYNEPO")) {
                    return m90662N1("GOLDENPATH_ZEYNEPO", "goldenpath/zeynepo", 746, "goldenpath");
                }
                return null;
            case 2113724179:
                if (str.equals("PROACTIVE_PLATFORMS_MIUI_NPV_WIDGET")) {
                    return m90662N1("PROACTIVE_PLATFORMS_MIUI_NPV_WIDGET", "proactive-platforms/miui-npv-widget", 1510, "proactive-platforms");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public static cbm0 m90695S() {
        return m90662N1("ALBUM", "album", 141, "album");
    }

    /* JADX INFO: renamed from: S0 */
    public static cbm0 m90696S0() {
        return m90662N1("COMMENTS_NOTIFICATION_OPT_IN", "comments/notification-opt-in", 367, "comments");
    }

    /* JADX INFO: renamed from: S1 */
    public static cbm0 m90697S1() {
        return m90662N1("GRADUATION_REJECTED", "graduation/rejected", 753, "graduation");
    }

    /* JADX INFO: renamed from: S2 */
    public static cbm0 m90698S2() {
        return m90662N1("MAGPIE_NOTIFICATIONS", "magpie/notifications", 954, "magpie");
    }

    /* JADX INFO: renamed from: S3 */
    public static cbm0 m90699S3() {
        return m90662N1("PLAYLIST_PARTICIPANTS", "playlist/participants", 1419, "playlist");
    }

    /* JADX INFO: renamed from: S4 */
    public static cbm0 m90700S4() {
        return m90662N1("REINVENTFREE_TIME_CAP_PIVOT_MUSIC_VIDEO_UPSELL", "reinventfree-time-cap-pivot-music-video-upsell", 1587, "reinventfree-time-cap-pivot-music-video-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: S5 */
    public static cbm0 m90701S5(String str) {
        switch (str.hashCode()) {
            case -2141454556:
                if (str.equals("CULTURALMOMENTSHUB")) {
                    return m90888u1();
                }
                return null;
            case -2110631404:
                if (str.equals("S4P_AUDIENCE")) {
                    return m90662N1("S4P_AUDIENCE", "s4p/audience", 1619, "s4p");
                }
                return null;
            case -2107929884:
                if (str.equals("PROACTIVE_PLATFORMS_COVER_SCREEN_WIDGET")) {
                    return m90863q4();
                }
                return null;
            case -2096580956:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ANALYTICS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ANALYTICS", "mrkt/artist/video/music-videos/analytics", 1118, "mrkt");
                }
                return null;
            case -2085701516:
                if (str.equals("SETTINGS_LANGUAGES_CONTENT_SEEALL")) {
                    return m90662N1("SETTINGS_LANGUAGES_CONTENT_SEEALL", "settings/languages/content/seeAll", 1768, "settings");
                }
                return null;
            case -2084872204:
                if (str.equals("HOME_AUDIOBOOKS")) {
                    return m90732X1();
                }
                return null;
            case -2040358604:
                if (str.equals("NOWPLAYINGV2")) {
                    return m90662N1("NOWPLAYINGV2", "nowplayingv2", 1318, "nowplayingv2");
                }
                return null;
            case -2034443276:
                if (str.equals("LYRICS")) {
                    return m90662N1("LYRICS", "lyrics", 941, "lyrics");
                }
                return null;
            case -1961106604:
                if (str.equals("MANAGED_ACCOUNT_LINKING_PARENT_ACCEPT_INVITE")) {
                    return m90662N1("MANAGED_ACCOUNT_LINKING_PARENT_ACCEPT_INVITE", "managed-account-linking/parent-accept-invite", 977, "managed-account-linking");
                }
                return null;
            case -1947764636:
                if (str.equals("BLUEJAY_DISCLOSURE_SHEET")) {
                    return m90662N1("BLUEJAY_DISCLOSURE_SHEET", "bluejay/disclosure-sheet", 226, "bluejay");
                }
                return null;
            case -1940850396:
                if (str.equals("COLLECTION_PODCASTS_EPISODES_UNPLAYED")) {
                    return m90662N1("COLLECTION_PODCASTS_EPISODES_UNPLAYED", "collection/podcasts/episodes/unplayed", 351, "collection");
                }
                return null;
            case -1936165724:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REDEMPTION_CODES")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_AUDIOBOOK_REDEMPTION_CODES", "spotify-for-authors/audiobook/redemption-codes", 1874, "spotify-for-authors");
                }
                return null;
            case -1901128556:
                if (str.equals("SUPERBIRD_SETUP_DOWNLOADED")) {
                    return m90662N1("SUPERBIRD_SETUP_DOWNLOADED", "superbird/setup/downloaded", 1938, "superbird");
                }
                return null;
            case -1889875500:
                if (str.equals("SEARCH_AUDIOS")) {
                    return m90662N1("SEARCH_AUDIOS", "search/audios", 1727, "search");
                }
                return null;
            case -1867722828:
                if (str.equals("LYRICS_SHARE")) {
                    return m90662N1("LYRICS_SHARE", "lyrics/share", 945, "lyrics");
                }
                return null;
            case -1867719372:
                if (str.equals("LYRICS_SHEET")) {
                    return m90662N1("LYRICS_SHEET", "lyrics/sheet", 947, "lyrics");
                }
                return null;
            case -1864941532:
                if (str.equals("PREMIUM_MINI_REWARDS")) {
                    return m90662N1("PREMIUM_MINI_REWARDS", "premium-mini/rewards", 1501, "premium-mini");
                }
                return null;
            case -1838447148:
                if (str.equals("MRKT_ARTIST_AUDIENCE_SEGMENTS")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_SEGMENTS", "mrkt/artist/audience/segments", ContentMediaFormat.FULL_CONTENT_PODCAST, "mrkt");
                }
                return null;
            case -1820543516:
                if (str.equals("LEGACYSHARE_POSTTO")) {
                    return m90662N1("LEGACYSHARE_POSTTO", "legacyshare/postto", 882, "legacyshare");
                }
                return null;
            case -1793502060:
                if (str.equals("AUDIOBOOK_TOPUP_SUCCESS")) {
                    return m90662N1("AUDIOBOOK_TOPUP_SUCCESS", "audiobook/topup/success", 203, "audiobook");
                }
                return null;
            case -1769228796:
                if (str.equals("WWW_ACCOUNT_PAGES_DYNAMICHERO")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_DYNAMICHERO", "www-account-pages/dynamichero", 2118, "www-account-pages");
                }
                return null;
            case -1721634556:
                if (str.equals("MRKT_WAITING_ROOM_MUSIC")) {
                    return m90662N1("MRKT_WAITING_ROOM_MUSIC", "mrkt/waiting-room/music", 1285, "mrkt");
                }
                return null;
            case -1684633244:
                if (str.equals("LOGIN_DIALOG_PASSKEY_NOT_FOUND")) {
                    return m90628I2();
                }
                return null;
            case -1658207804:
                if (str.equals("S4P_DEBUG_TEST_ACCOUNT_SWITCHER")) {
                    return m90662N1("S4P_DEBUG_TEST_ACCOUNT_SWITCHER", "s4p/debug/test-account-switcher", 1649, "s4p");
                }
                return null;
            case -1632946364:
                if (str.equals("WEAR_DOWNLOAD_UPSELL")) {
                    return m90662N1("WEAR_DOWNLOAD_UPSELL", "wear/download_upsell", 2061, "wear");
                }
                return null;
            case -1611975004:
                if (str.equals("SUPERBIRD_SETUP_BLUETOOTHSETTINGS")) {
                    return m90662N1("SUPERBIRD_SETUP_BLUETOOTHSETTINGS", "superbird/setup/bluetoothsettings", 1931, "superbird");
                }
                return null;
            case -1584801772:
                if (str.equals("MRKT_CHARTS_ONBOARDING")) {
                    return m90662N1("MRKT_CHARTS_ONBOARDING", "mrkt/charts/onboarding", 1155, "mrkt");
                }
                return null;
            case -1542908700:
                if (str.equals("BROWSE_TOPPODCAST")) {
                    return m90662N1("BROWSE_TOPPODCAST", "browse/toppodcast", 249, "browse");
                }
                return null;
            case -1493192396:
                if (str.equals("SMARTSHUFFLE_PLAYMODEPICKER")) {
                    return m90892u5();
                }
                return null;
            case -1442050444:
                if (str.equals("SETTINGS_ADS")) {
                    return m90777d5();
                }
                return null;
            case -1430649660:
                if (str.equals("LISTENINGSTATS")) {
                    return m90579B2();
                }
                return null;
            case -1346089660:
                if (str.equals("SETTINGS_SEARCH")) {
                    return m90833l5();
                }
                return null;
            case -1258873548:
                if (str.equals("S4P_DEBUG_CONSOLE_LOGGER")) {
                    return m90662N1("S4P_DEBUG_CONSOLE_LOGGER", "s4p/debug/console-logger", 1643, "s4p");
                }
                return null;
            case -1236453324:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTALLOWLISTINGREQUESTS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_MANAGEDACCOUNTALLOWLISTINGREQUESTS", "www-account-pages/parental-settings/managedaccountallowlistingrequests", 2146, "www-account-pages");
                }
                return null;
            case -1127220668:
                if (str.equals("GOLDENPATH_MCOOK")) {
                    return m90662N1("GOLDENPATH_MCOOK", "goldenpath/mcook", 684, "goldenpath");
                }
                return null;
            case -1116723772:
                if (str.equals("CONTENT_FEED")) {
                    return m90662N1("CONTENT_FEED", "content-feed", 399, "content-feed");
                }
                return null;
            case -1069963820:
                if (str.equals("FREETIER_DATASAVER_LEARNMORE")) {
                    return m90662N1("FREETIER_DATASAVER_LEARNMORE", "freetier/datasaver/learnmore", 565, "freetier");
                }
                return null;
            case -1055156540:
                if (str.equals("MRKT_BULK_CAMPAIGNS_FORECAST_REVIEW")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_FORECAST_REVIEW", "mrkt/bulk-campaigns/forecast/review", 1146, "mrkt");
                }
                return null;
            case -1045867500:
                if (str.equals("DATASAVERMODE_SETTINGS")) {
                    return m90662N1("DATASAVERMODE_SETTINGS", "datasavermode/settings", 458, "datasavermode");
                }
                return null;
            case -1039543452:
                if (str.equals("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION")) {
                    return m90662N1("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION", "s4p/claim-podcast/podcast-verification", 1631, "s4p");
                }
                return null;
            case -946566668:
                if (str.equals("CAR_MODE_ENTITY")) {
                    return m90662N1("CAR_MODE_ENTITY", "car-mode/entity", 266, "car-mode");
                }
                return null;
            case -869956988:
                if (str.equals("MRKT_ARTIST_PROFILE_CATALOG_RELEASE")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_CATALOG_RELEASE", "mrkt/artist/profile/catalog/release", 1082, "mrkt");
                }
                return null;
            case -864836716:
                if (str.equals("PODCAST_SPONSORS")) {
                    return m90762b4();
                }
                return null;
            case -824490652:
                if (str.equals("WATCHAPP_QUEUE")) {
                    return m90662N1("WATCHAPP_QUEUE", "watchapp/queue", 2040, "watchapp");
                }
                return null;
            case -789663212:
                if (str.equals("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS")) {
                    return m90826k5();
                }
                return null;
            case -762145692:
                if (str.equals("MRKT_LABS_ARTIST_HISTORY")) {
                    return m90662N1("MRKT_LABS_ARTIST_HISTORY", "mrkt/labs/artist-history", 1237, "mrkt");
                }
                return null;
            case -757521356:
                if (str.equals("GOLDENPATH_GAVIND")) {
                    return m90662N1("GOLDENPATH_GAVIND", "goldenpath/gavind", 632, "goldenpath");
                }
                return null;
            case -753597324:
                if (str.equals("CONTEXTMENU_REMOTEDOWNLOADS")) {
                    return m90822k1();
                }
                return null;
            case -744002492:
                if (str.equals("GOLDENPATH_ODIMITROV")) {
                    return m90662N1("GOLDENPATH_ODIMITROV", "goldenpath/odimitrov", 706, "goldenpath");
                }
                return null;
            case -735641644:
                if (str.equals("FRIENDSHOME")) {
                    return m90662N1("FRIENDSHOME", "friendshome", 578, "friendshome");
                }
                return null;
            case -731229644:
                if (str.equals("PROACTIVE_PLATFORMS_RECOMMENDATIONS_WIDGET")) {
                    return m90662N1("PROACTIVE_PLATFORMS_RECOMMENDATIONS_WIDGET", "proactive-platforms/recommendations-widget", 1512, "proactive-platforms");
                }
                return null;
            case -714889724:
                if (str.equals("ADSTUDIO_SBL_DOWNLOAD_CHARTS")) {
                    return m90662N1("ADSTUDIO_SBL_DOWNLOAD_CHARTS", "adstudio/sbl/download-charts", ContentType.LONG_FORM_ON_DEMAND, "adstudio");
                }
                return null;
            case -705422764:
                if (str.equals("CONTEXTMENU_DJSUBMITFEEDBACK")) {
                    return m90662N1("CONTEXTMENU_DJSUBMITFEEDBACK", "contextmenu/djsubmitfeedback", 413, "contextmenu");
                }
                return null;
            case -643672876:
                if (str.equals("S4P_PODCAST")) {
                    return m90662N1("S4P_PODCAST", "s4p/podcast", 1669, "s4p");
                }
                return null;
            case -606254908:
                if (str.equals("BOOTCAMP_EASTEREGGS")) {
                    return m90662N1("BOOTCAMP_EASTEREGGS", "bootcamp/eastereggs", 237, "bootcamp");
                }
                return null;
            case -592396652:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2", "www-account-pages/login-methods-v2", 2133, "www-account-pages");
                }
                return null;
            case -582274476:
                if (str.equals("ADS_FEEDBACK")) {
                    return m90639K();
                }
                return null;
            case -521702876:
                if (str.equals("WWW_ACCOUNT_PAGES_PAYMENT_METHODS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PAYMENT_METHODS", "www-account-pages/payment-methods", 2153, "www-account-pages");
                }
                return null;
            case -517982140:
                if (str.equals("AAA_CON")) {
                    return m90886u();
                }
                return null;
            case -463710892:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DETAIL")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_DETAIL", "mrkt/artist/campaigns/detail", 1020, "mrkt");
                }
                return null;
            case -462240060:
                if (str.equals("FREETIER_TASTEONBOARDING_SWIPETRACKS")) {
                    return m90662N1("FREETIER_TASTEONBOARDING_SWIPETRACKS", "freetier/tasteonboarding/swipetracks", 572, "freetier");
                }
                return null;
            case -454901996:
                if (str.equals("CHAT_EDIT_GROUP_DETAILS")) {
                    return m90570A0();
                }
                return null;
            case -429709356:
                if (str.equals("ADDRESS")) {
                    return m90625I();
                }
                return null;
            case -425984668:
                if (str.equals("EPISODECHAPTERS_NPV_FULLSCREEN")) {
                    return m90662N1("EPISODECHAPTERS_NPV_FULLSCREEN", "episodechapters/npv/fullscreen", 511, "episodechapters");
                }
                return null;
            case -346283260:
                if (str.equals("PARENTAL_CONTROL_ACCOUNT_DETAILS")) {
                    return m90862q3();
                }
                return null;
            case -298340604:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_TRACK")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CLIPS_CREATE_SELECT_TRACK", "mrkt/artist/video/clips/create/select-track", 1114, "mrkt");
                }
                return null;
            case -264791340:
                if (str.equals("CONCERTS_CONCERT")) {
                    return m90745Z0();
                }
                return null;
            case -209782908:
                if (str.equals("ADSTUDIO_EVENTS_CAPI_CREATE")) {
                    return m90662N1("ADSTUDIO_EVENTS_CAPI_CREATE", "adstudio/events/capi/create", 99, "adstudio");
                }
                return null;
            case -205387212:
                if (str.equals("PLAYLIST_EDIT_COVERART")) {
                    return m90678P3();
                }
                return null;
            case -147487452:
                if (str.equals("PRERELEASE_AUDIOBOOK")) {
                    return m90662N1("PRERELEASE_AUDIOBOOK", "prerelease/audiobook", 1506, "prerelease");
                }
                return null;
            case -146998316:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_INFO")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_INFO", "mrkt/debug/hubs/component-info", 1159, "mrkt");
                }
                return null;
            case -55289900:
                if (str.equals("REINVENTFREE_UPNEXT")) {
                    return m90662N1("REINVENTFREE_UPNEXT", "reinventfree-upnext", 1592, "reinventfree-upnext");
                }
                return null;
            case 3165572:
                if (str.equals("DIALOG_CONNECTOAUTH")) {
                    return m90662N1("DIALOG_CONNECTOAUTH", "dialog/connectoauth", 465, "dialog");
                }
                return null;
            case 39151668:
                if (str.equals("GOLDENPATH_MBOWALLIUS")) {
                    return m90662N1("GOLDENPATH_MBOWALLIUS", "goldenpath/mbowallius", 681, "goldenpath");
                }
                return null;
            case 139653972:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_DENOMINATION_SELECTION")) {
                    return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_DENOMINATION_SELECTION", "premium-account-management/denomination-selection", 1488, "premium-account-management");
                }
                return null;
            case 180211188:
                if (str.equals("COMMENTS")) {
                    return m90662N1("COMMENTS", "comments", 366, "comments");
                }
                return null;
            case 184054596:
                if (str.equals("ADSTUDIO_BUSINESS_PARTNERS")) {
                    return m90662N1("ADSTUDIO_BUSINESS_PARTNERS", "adstudio/business/partners", 56, "adstudio");
                }
                return null;
            case 212493172:
                if (str.equals("BUNDLING_SURVEY_WEBVIEW")) {
                    return m90662N1("BUNDLING_SURVEY_WEBVIEW", "bundling/survey/webview", 255, "bundling");
                }
                return null;
            case 215512676:
                if (str.equals("SOCIAL_LISTENING_MARACASDIALOG")) {
                    return m90662N1("SOCIAL_LISTENING_MARACASDIALOG", "social-listening/maracasdialog", 1850, "social-listening");
                }
                return null;
            case 234616868:
                if (str.equals("ARTISTS_DNA")) {
                    return m90662N1("ARTISTS_DNA", "artists-dna", 176, "artists-dna");
                }
                return null;
            case 252438516:
                if (str.equals("BUNDLING_PLACEBO")) {
                    return m90662N1("BUNDLING_PLACEBO", "bundling/placebo", 253, "bundling");
                }
                return null;
            case 281520196:
                if (str.equals("SETTINGS_PARENTAL_CONTROLS")) {
                    return m90662N1("SETTINGS_PARENTAL_CONTROLS", "settings/parental-controls", 1782, "settings");
                }
                return null;
            case 290645172:
                if (str.equals("IRONCHEF_ENTITY")) {
                    return m90662N1("IRONCHEF_ENTITY", "ironchef/entity", 828, "ironchef");
                }
                return null;
            case 312413924:
                if (str.equals("PODCAST")) {
                    return m90662N1("PODCAST", "podcast", 1424, "podcast");
                }
                return null;
            case 329690372:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_FULL_SERVICE_AUDIO")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_FULL_SERVICE_AUDIO", "adstudio/duplicate-ad-set-only/ad-full-service-audio", 83, "adstudio");
                }
                return null;
            case 340333268:
                if (str.equals("INAPPMESSAGE_EXTERNAL_WEB")) {
                    return m90662N1("INAPPMESSAGE_EXTERNAL_WEB", "inappmessage/external-web", 812, "inappmessage");
                }
                return null;
            case 426046980:
                if (str.equals("ARTIST_RELATED_VIDEOS")) {
                    return m90662N1("ARTIST_RELATED_VIDEOS", "artist/related-videos", 170, "artist");
                }
                return null;
            case 434231668:
                if (str.equals("MAGPIE_REPORT_WEBVIEW")) {
                    return m90662N1("MAGPIE_REPORT_WEBVIEW", "magpie/report-webview", 958, "magpie");
                }
                return null;
            case 440774756:
                if (str.equals("XRPROJECTED_NOW_PLAYING")) {
                    return m90662N1("XRPROJECTED_NOW_PLAYING", "xrprojected/now_playing", 2168, "xrprojected");
                }
                return null;
            case 446663844:
                if (str.equals("WATCHAPP_LOCKED_AUDIOBOOK_POPUP")) {
                    return m90662N1("WATCHAPP_LOCKED_AUDIOBOOK_POPUP", "watchapp/locked-audiobook-popup", 2033, "watchapp");
                }
                return null;
            case 459940308:
                if (str.equals("MRKT_ARTIST_PROFILE_IMAGES_EDIT")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_IMAGES_EDIT", "mrkt/artist/profile/images/edit", 1091, "mrkt");
                }
                return null;
            case 473239652:
                if (str.equals("PARROT_ONBOARDING")) {
                    return m90662N1("PARROT_ONBOARDING", "parrot/onboarding", 1370, "parrot");
                }
                return null;
            case 478324612:
                if (str.equals("WWW_ACCOUNT_PAGES_PRICECHANGE")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PRICECHANGE", "www-account-pages/pricechange", 2155, "www-account-pages");
                }
                return null;
            case 534046532:
                if (str.equals("ARTIST_RELEASES")) {
                    return m90662N1("ARTIST_RELEASES", "artist/releases", 171, "artist");
                }
                return null;
            case 537108484:
                if (str.equals("BROWSE_PODCASTS")) {
                    return m90662N1("BROWSE_PODCASTS", "browse/podcasts", 248, "browse");
                }
                return null;
            case 546993028:
                if (str.equals("FRIENDSACTIVITY")) {
                    return m90662N1("FRIENDSACTIVITY", "friendsactivity", 575, "friendsactivity");
                }
                return null;
            case 669598772:
                if (str.equals("LISTENINGPARTY_TEST_ROOM")) {
                    return m90662N1("LISTENINGPARTY_TEST_ROOM", "listeningparty/test-room", 898, "listeningparty");
                }
                return null;
            case 711805700:
                if (str.equals("MRKT_ARTIST_AUDIENCE_WEB_VIEW")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_WEB_VIEW", "mrkt/artist/audience-web-view", 1003, "mrkt");
                }
                return null;
            case 734462836:
                if (str.equals("MRKT_LICENSOR_DISCOVERYMODE_TERMS")) {
                    return m90662N1("MRKT_LICENSOR_DISCOVERYMODE_TERMS", "mrkt/licensor/discoverymode/terms", 1244, "mrkt");
                }
                return null;
            case 801488388:
                if (str.equals("GOLDENPATH_EHAMALAINEN")) {
                    return m90662N1("GOLDENPATH_EHAMALAINEN", "goldenpath/ehamalainen", 621, "goldenpath");
                }
                return null;
            case 960789092:
                if (str.equals("AI_DISCLOSURE")) {
                    return m90674P();
                }
                return null;
            case 1006570548:
                if (str.equals("MRKT_ARTIST_VIDEO")) {
                    return m90662N1("MRKT_ARTIST_VIDEO", "mrkt/artist/video", 1108, "mrkt");
                }
                return null;
            case 1073760724:
                if (str.equals("LOGIN_CONNECT")) {
                    return m90662N1("LOGIN_CONNECT", "login/connect", 918, "login");
                }
                return null;
            case 1079817220:
                if (str.equals("PRERELEASE")) {
                    return m90856p4();
                }
                return null;
            case 1108976772:
                if (str.equals("GOLDENPATH_ALISHERS")) {
                    return m90662N1("GOLDENPATH_ALISHERS", "goldenpath/alishers", CtaType.BUY_TICKETS_FIELD_NUMBER, "goldenpath");
                }
                return null;
            case 1132747204:
                if (str.equals("SIGNUP_BIRTHDAY")) {
                    return m90662N1("SIGNUP_BIRTHDAY", "signup/birthday", 1827, "signup");
                }
                return null;
            case 1136510724:
                if (str.equals("SEARCH_LOADING_INSTANT_MIX")) {
                    return m90756a5();
                }
                return null;
            case 1179464676:
                if (str.equals("MRKT_ARTIST_PROFILE_PLAYLISTS")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_PLAYLISTS", "mrkt/artist/profile/playlists", 1094, "mrkt");
                }
                return null;
            case 1196553156:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_STATS")) {
                    return m90662N1("MRKT_ARTIST_PRE_RELEASE_STATS", "mrkt/artist/pre-release/stats", 1070, "mrkt");
                }
                return null;
            case 1246929492:
                if (str.equals("YOURLIBRARY_DOWNLOADS")) {
                    return m90662N1("YOURLIBRARY_DOWNLOADS", "yourlibrary/downloads", 2179, "yourlibrary");
                }
                return null;
            case 1255671636:
                if (str.equals("CHARTS_CHART")) {
                    return m90662N1("CHARTS_CHART", "charts/chart", 298, "charts");
                }
                return null;
            case 1302680548:
                if (str.equals("SEARCH_LAST_24_HOURS")) {
                    return m90662N1("SEARCH_LAST_24_HOURS", "search/last_24_hours", 1732, "search");
                }
                return null;
            case 1343024516:
                if (str.equals("PODCAST_SHOW_INTERACTIVEAUDIOBOOK")) {
                    return m90662N1("PODCAST_SHOW_INTERACTIVEAUDIOBOOK", "podcast/show/interactiveaudiobook", 1443, "podcast");
                }
                return null;
            case 1344095988:
                if (str.equals("MRKT_WRAPPED")) {
                    return m90662N1("MRKT_WRAPPED", "mrkt/wrapped", 1289, "mrkt");
                }
                return null;
            case 1363441124:
                if (str.equals("SHARE_FACEBOOKFEED")) {
                    return m90662N1("SHARE_FACEBOOKFEED", "share/facebookfeed", 1801, "share");
                }
                return null;
            case 1377694068:
                if (str.equals("CONTEXTMENU_ENTITYSEGMENTS")) {
                    return m90794g1();
                }
                return null;
            case 1422973188:
                if (str.equals("FACEBOOK_WEBVIEWPERMISSIONS")) {
                    return m90662N1("FACEBOOK_WEBVIEWPERMISSIONS", "facebook/webviewpermissions", 528, "facebook");
                }
                return null;
            case 1483827316:
                if (str.equals("PODCASTMIX_CONTROLS_SHOWS")) {
                    return m90662N1("PODCASTMIX_CONTROLS_SHOWS", "podcastmix/controls/shows", 1463, "podcastmix");
                }
                return null;
            case 1492856420:
                if (str.equals("GOLDENPATH_GONZALOC")) {
                    return m90662N1("GOLDENPATH_GONZALOC", "goldenpath/gonzaloc", 634, "goldenpath");
                }
                return null;
            case 1497854532:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_SUB_ACCOUNT_ALLOCATION_REQUEST_DIALOG")) {
                    return m90838m4();
                }
                return null;
            case 1499400516:
                if (str.equals("BLUEJAY_BRIEF_PRESET_PREVIEW")) {
                    return m90662N1("BLUEJAY_BRIEF_PRESET_PREVIEW", "bluejay/brief-preset-preview", AdvertisementType.LIVE, "bluejay");
                }
                return null;
            case 1512231796:
                if (str.equals("MANAGE_ACTIVITY_FEED")) {
                    return m90662N1("MANAGE_ACTIVITY_FEED", "manage/activity-feed", 963, "manage");
                }
                return null;
            case 1557571572:
                if (str.equals("MRKT_INVITE_TOKEN")) {
                    return m90662N1("MRKT_INVITE_TOKEN", "mrkt/invite/token", 1235, "mrkt");
                }
                return null;
            case 1579450644:
                if (str.equals("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_DOWNLOADS")) {
                    return m90662N1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_DOWNLOADS", "wear/settings/audio_quality_settings/downloads", 2084, "wear");
                }
                return null;
            case 1609417508:
                if (str.equals("MRKT_BTC_BOOKING_UPLOAD_ERRORS")) {
                    return m90662N1("MRKT_BTC_BOOKING_UPLOAD_ERRORS", "mrkt/btc/booking/upload/errors", 1140, "mrkt");
                }
                return null;
            case 1619006564:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY")) {
                    return m90662N1("MRKT_FRONTDOOR_FAN_STUDY", "mrkt/frontdoor/fan-study", 1205, "mrkt");
                }
                return null;
            case 1623116020:
                if (str.equals("CELEBRITYBLEND_ENTITY")) {
                    return m90662N1("CELEBRITYBLEND_ENTITY", "celebrityblend/entity", 281, "celebrityblend");
                }
                return null;
            case 1650968964:
                if (str.equals("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_CELLULAR_STREAMING")) {
                    return m90662N1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS_CELLULAR_STREAMING", "wear/settings/audio_quality_settings/cellular_streaming", 2083, "wear");
                }
                return null;
            case 1676429188:
                if (str.equals("REMOTECONFIGURATION_DEBUG")) {
                    return m90662N1("REMOTECONFIGURATION_DEBUG", "remoteconfiguration/debug", 1594, "remoteconfiguration");
                }
                return null;
            case 1693982404:
                if (str.equals("CONTEXTMENU_YOURUPDATES_NOTIFICATION")) {
                    return m90662N1("CONTEXTMENU_YOURUPDATES_NOTIFICATION", "contextmenu/yourupdates/notification", 433, "contextmenu");
                }
                return null;
            case 1707342868:
                if (str.equals("SPOTIFY_FOR_AUTHORS_PAYMENT")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_PAYMENT", "spotify-for-authors/payment", 1888, "spotify-for-authors");
                }
                return null;
            case 1711767796:
                if (str.equals("NOWPLAYING_NOWPLAYINGBAR")) {
                    return m90803h3();
                }
                return null;
            case 1746926596:
                if (str.equals("COVERIMAGE")) {
                    return m90662N1("COVERIMAGE", "coverimage", 448, "coverimage");
                }
                return null;
            case 1749009636:
                if (str.equals("MRKT_ARTIST_PROFILE_ARTISTPICK_EDIT")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_ARTISTPICK_EDIT", "mrkt/artist/profile/artistpick/edit", 1076, "mrkt");
                }
                return null;
            case 1780651236:
                if (str.equals("S4P_SETTINGS_PUSH_NOTIFICATION")) {
                    return m90662N1("S4P_SETTINGS_PUSH_NOTIFICATION", "s4p/settings/push-notification", 1692, "s4p");
                }
                return null;
            case 1868301812:
                if (str.equals("CONTEXTMENU_SENDTO")) {
                    return m90662N1("CONTEXTMENU_SENDTO", "contextmenu/sendto", 425, "contextmenu");
                }
                return null;
            case 1870260196:
                if (str.equals("ADSTUDIO_SBL_CREATE")) {
                    return m90662N1("ADSTUDIO_SBL_CREATE", "adstudio/sbl/create", 110, "adstudio");
                }
                return null;
            case 1875115204:
                if (str.equals("MRKT_FRONTDOOR_NEW_RELEASES")) {
                    return m90662N1("MRKT_FRONTDOOR_NEW_RELEASES", "mrkt/frontdoor/new-releases", 1220, "mrkt");
                }
                return null;
            case 1902907348:
                if (str.equals("CONTRIBUTION_NOTES_REPORT_ACTION")) {
                    return m90867r1();
                }
                return null;
            case 1911560884:
                if (str.equals("MRKT_TEAM_MANAGEMENT_INVITE")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_INVITE", "mrkt/team-management/invite", 1264, "mrkt");
                }
                return null;
            case 1944073668:
                if (str.equals("SUPERBIRD_SETUP_CONTROLOTHERMEDIA")) {
                    return m90662N1("SUPERBIRD_SETUP_CONTROLOTHERMEDIA", "superbird/setup/controlothermedia", 1936, "superbird");
                }
                return null;
            case 1972339428:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_REVIEW")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_UPDATE_REVIEW", "mrkt/artist/campaigns/marquee-and-showcase/update/review", 1039, "mrkt");
                }
                return null;
            case 1990866692:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_REVIEW")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_UPLOAD_REVIEW", "spotify-for-authors/upload/review", 1894, "spotify-for-authors");
                }
                return null;
            case 2016112820:
                if (str.equals("ADS_IN_APP_WEB_BROWSER")) {
                    return m90662N1("ADS_IN_APP_WEB_BROWSER", "ads/in-app-web-browser", 22, "ads");
                }
                return null;
            case 2065893716:
                if (str.equals("COMMENTS_REACTION_SHEET")) {
                    return m90662N1("COMMENTS_REACTION_SHEET", "comments/reaction-sheet", 368, "comments");
                }
                return null;
            case 2093818740:
                if (str.equals("FRIENDSHOME_LISTENERS")) {
                    return m90662N1("FRIENDSHOME_LISTENERS", "friendshome/listeners", 581, "friendshome");
                }
                return null;
            case 2101448884:
                if (str.equals("PREMIUM_CONSIDERATION")) {
                    return m90662N1("PREMIUM_CONSIDERATION", "premium-consideration", 1496, "premium-consideration");
                }
                return null;
            case 2102661044:
                if (str.equals("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION_COMPLETE")) {
                    return m90662N1("S4P_CLAIM_PODCAST_PODCAST_VERIFICATION_COMPLETE", "s4p/claim-podcast/podcast-verification-complete", 1632, "s4p");
                }
                return null;
            case 2110700660:
                if (str.equals("PLAYLIST_EDITORS_PICKER")) {
                    return m90685Q3();
                }
                return null;
            case 2127858420:
                if (str.equals("MRKT_TEAM_MANAGEMENT")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT", "mrkt/team-management", 1258, "mrkt");
                }
                return null;
            case 2137382628:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ROOT")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_ROOT", "mrkt/artist/video/music-videos/root", 1121, "mrkt");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: T */
    public static cbm0 m90702T() {
        return m90662N1("ALIGNED_CURATION_FIRST_SAVE", "aligned-curation/first-save", 142, "aligned-curation");
    }

    /* JADX INFO: renamed from: T0 */
    public static cbm0 m90703T0() {
        return m90662N1("COMMENTS_TERMS", "comments/terms", 372, "comments");
    }

    /* JADX INFO: renamed from: T1 */
    public static cbm0 m90704T1() {
        return m90662N1("GRADUATION_SUPERVISION", "graduation/supervision", 755, "graduation");
    }

    /* JADX INFO: renamed from: T2 */
    public static cbm0 m90705T2() {
        return m90662N1("MAGPIE_PRIVACY", "magpie/privacy", 955, "magpie");
    }

    /* JADX INFO: renamed from: T3 */
    public static cbm0 m90706T3() {
        return m90662N1("PLAYLIST_PERMISSIONS_CLAIMDIALOG", "playlist/permissions/claimdialog", 1420, "playlist");
    }

    /* JADX INFO: renamed from: T4 */
    public static cbm0 m90707T4() {
        return m90662N1("REINVENTFREE_TIME_CAP_PIVOT_TRACK_RADIO_UPSELL", "reinventfree-time-cap-pivot-track-radio-upsell", 1588, "reinventfree-time-cap-pivot-track-radio-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: T5 */
    public static cbm0 m90708T5(String str) {
        switch (str.hashCode()) {
            case -2140865915:
                if (str.equals("PLAYLIST_FILTER")) {
                    return m90662N1("PLAYLIST_FILTER", "playlist/filter", 1409, "playlist");
                }
                return null;
            case -1978607691:
                if (str.equals("S4P_QNA_EDIT")) {
                    return m90662N1("S4P_QNA_EDIT", "s4p/qna/edit", 1685, "s4p");
                }
                return null;
            case -1971276075:
                if (str.equals("ADSTUDIO_EDIT_CAMPAIGN_CONFIRMATION")) {
                    return m90662N1("ADSTUDIO_EDIT_CAMPAIGN_CONFIRMATION", "adstudio/edit/campaign/confirmation", 96, "adstudio");
                }
                return null;
            case -1932858987:
                if (str.equals("SIGNUP_EMAIL")) {
                    return m90871r5();
                }
                return null;
            case -1929971707:
                if (str.equals("NOWPLAYING_PLAYBACKSETTINGS")) {
                    return m90824k3();
                }
                return null;
            case -1896149659:
                if (str.equals("FREE_TIER_ALBUM")) {
                    return m90662N1("FREE_TIER_ALBUM", "free-tier-album", 547, "free-tier-album");
                }
                return null;
            case -1888478443:
                if (str.equals("START_CHOOSELOGIN")) {
                    return m90927z5();
                }
                return null;
            case -1831391931:
                if (str.equals("INAPPMESSAGE_WEBVIEW")) {
                    return m90854p2();
                }
                return null;
            case -1830276555:
                if (str.equals("COLLECTION_ALBUMS_ALBUM")) {
                    return m90662N1("COLLECTION_ALBUMS_ALBUM", "collection/albums/album", 338, "collection");
                }
                return null;
            case -1730409339:
                if (str.equals("PERMISSIONS_LOCATION_ALREADY_GRANTED")) {
                    return m90662N1("PERMISSIONS_LOCATION_ALREADY_GRANTED", "permissions/location/already-granted", 1379, "permissions");
                }
                return null;
            case -1671396523:
                if (str.equals("PARENTAL_CONTROL_UPDATE_NAME")) {
                    return m90573A3();
                }
                return null;
            case -1670278011:
                if (str.equals("HOME_TRENDING")) {
                    return m90781e2();
                }
                return null;
            case -1659903323:
                if (str.equals("HOME_MUSIC")) {
                    return m90739Y1();
                }
                return null;
            case -1645884139:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_MUSIC_AND_RIGHTS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_MUSIC_AND_RIGHTS", "mrkt/artist/video/music-videos/upload/music-and-rights", 1124, "mrkt");
                }
                return null;
            case -1636233659:
                if (str.equals("MANAGE_PARTNERS")) {
                    return m90662N1("MANAGE_PARTNERS", "manage/partners", 970, "manage");
                }
                return null;
            case -1561651963:
                if (str.equals("NOWPLAYING_GENIUSCARDS")) {
                    return m90662N1("NOWPLAYING_GENIUSCARDS", "nowplaying/geniuscards", 1306, "nowplaying");
                }
                return null;
            case -1553442779:
                if (str.equals("WWW_ACCOUNT_PAGES_FAMILYDUO")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_FAMILYDUO", "www-account-pages/familyduo", 2120, "www-account-pages");
                }
                return null;
            case -1551411963:
                if (str.equals("HOME_WRAPPED")) {
                    return m90802h2();
                }
                return null;
            case -1493336379:
                if (str.equals("PLAYLIST_CREATE_EUTERPE_REPORT_A_PROBLEM")) {
                    return m90671O3();
                }
                return null;
            case -1448222699:
                if (str.equals("MRKT_TEAM_MANAGEMENT_ACCEPT_INVITE")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_ACCEPT_INVITE", "mrkt/team-management/accept-invite", 1259, "mrkt");
                }
                return null;
            case -1430655067:
                if (str.equals("S4P_BLOCKED_USERS")) {
                    return m90662N1("S4P_BLOCKED_USERS", "s4p/blocked-users", 1624, "s4p");
                }
                return null;
            case -1410148795:
                if (str.equals("LINGO_HOME")) {
                    return m90662N1("LINGO_HOME", "lingo/home", 884, "lingo");
                }
                return null;
            case -1385774139:
                if (str.equals("SHOWS_NETWORK")) {
                    return m90662N1("SHOWS_NETWORK", "shows/network", 1818, "shows");
                }
                return null;
            case -1381827995:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_COLLECTEMAIL")) {
                    return m90662N1("LOGIN_ACCOUNTRECOVERY_COLLECTEMAIL", "login/accountrecovery/collectemail", 913, "login");
                }
                return null;
            case -1357663499:
                if (str.equals("S4P_CREATION_IMPORT")) {
                    return m90662N1("S4P_CREATION_IMPORT", "s4p/creation/import", 1640, "s4p");
                }
                return null;
            case -1349778923:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE", "mrkt/artist/campaigns/marquee-and-showcase", 1025, "mrkt");
                }
                return null;
            case -1318152811:
                if (str.equals("NOWPLAYING_UPNEXT")) {
                    return m90662N1("NOWPLAYING_UPNEXT", "nowplaying/upnext", 1315, "nowplaying");
                }
                return null;
            case -1307605691:
                if (str.equals("USERS_NEARBY_CHECK_IN")) {
                    return m90662N1("USERS_NEARBY_CHECK_IN", "users_nearby_check_in", 2003, "users_nearby_check_in");
                }
                return null;
            case -1294340971:
                if (str.equals("CARS_WAZE")) {
                    return m90662N1("CARS_WAZE", "cars/waze", 278, "cars");
                }
                return null;
            case -1153625947:
                if (str.equals("MRKT_FRONTDOOR_SPOTIFY_MUSIC_STUDIOS")) {
                    return m90662N1("MRKT_FRONTDOOR_SPOTIFY_MUSIC_STUDIOS", "mrkt/frontdoor/spotify-music-studios", 1227, "mrkt");
                }
                return null;
            case -1140409419:
                if (str.equals("YOUR_PLAN")) {
                    return m90662N1("YOUR_PLAN", "your-plan", 2171, "your-plan");
                }
                return null;
            case -1132095883:
                if (str.equals("ADSTUDIO_EDIT_AD_SET")) {
                    return m90662N1("ADSTUDIO_EDIT_AD_SET", "adstudio/edit/ad-set", 93, "adstudio");
                }
                return null;
            case -1129657595:
                if (str.equals("GOLDENPATH_MOHANNAZ")) {
                    return m90662N1("GOLDENPATH_MOHANNAZ", "goldenpath/mohannaz", 692, "goldenpath");
                }
                return null;
            case -1129517931:
                if (str.equals("PORTAL_SEARCH_GROUPS_AND_ACCOUNTS")) {
                    return m90662N1("PORTAL_SEARCH_GROUPS_AND_ACCOUNTS", "portal/search-groups-and-accounts", 1479, "portal");
                }
                return null;
            case -1083460379:
                if (str.equals("GOLDENPATH_EPORTELA")) {
                    return m90662N1("GOLDENPATH_EPORTELA", "goldenpath/eportela", 627, "goldenpath");
                }
                return null;
            case -1063118683:
                if (str.equals("COLLECTION_ALBUMS")) {
                    return m90662N1("COLLECTION_ALBUMS", "collection/albums", 337, "collection");
                }
                return null;
            case -1054635083:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS_REMOVE_MEMBER")) {
                    return m90825k4();
                }
                return null;
            case -1017671739:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_REPORTING")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_REPORTING", "mrkt/discovery-mode/unified-reporting", 1184, "mrkt");
                }
                return null;
            case -1001025419:
                if (str.equals("ARTIST_ABOUT")) {
                    return m90723W();
                }
                return null;
            case -975277979:
                if (str.equals("SOULSEEKER_SIMILAR_PROFILES")) {
                    return m90662N1("SOULSEEKER_SIMILAR_PROFILES", "soulseeker-similar-profiles", 1865, "soulseeker-similar-profiles");
                }
                return null;
            case -915167595:
                if (str.equals("LOGIN_SOMETHINGWENTWRONG")) {
                    return m90635J2();
                }
                return null;
            case -913644331:
                if (str.equals("GOLDENPATH_ARTURD")) {
                    return m90662N1("GOLDENPATH_ARTURD", "goldenpath/arturd", ContentDeliverySubscriptionType.ADVERTISING, "goldenpath");
                }
                return null;
            case -893287803:
                if (str.equals("WATCHAPP_SKIP_LIMIT_ALERT")) {
                    return m90662N1("WATCHAPP_SKIP_LIMIT_ALERT", "watchapp/skip-limit-alert", Entity.AUTOCOMPLETE_FIELD_NUMBER, "watchapp");
                }
                return null;
            case -871468219:
                if (str.equals("DOWNLOAD_DESKTOP")) {
                    return m90662N1("DOWNLOAD_DESKTOP", "download/desktop", 486, "download");
                }
                return null;
            case -850606267:
                if (str.equals("DIALOG_SEARCH_FEEDBACK")) {
                    return m90662N1("DIALOG_SEARCH_FEEDBACK", "dialog/search/feedback", 476, "dialog");
                }
                return null;
            case -799619915:
                if (str.equals("GOLDENPATH_ERDEMC")) {
                    return m90662N1("GOLDENPATH_ERDEMC", "goldenpath/erdemc", 628, "goldenpath");
                }
                return null;
            case -748882731:
                if (str.equals("ADSTUDIO_EVENTS_PIXEL_CREATE")) {
                    return m90662N1("ADSTUDIO_EVENTS_PIXEL_CREATE", "adstudio/events/pixel/create", 102, "adstudio");
                }
                return null;
            case -710742443:
                if (str.equals("MULTI_USER_PLAN_VERIFICATION_VERIFY")) {
                    return m90768c3();
                }
                return null;
            case -696838027:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_REVERTTRANSITION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_REVERTTRANSITION", "www-account-pages/genalpha/reverttransition", 2129, "www-account-pages");
                }
                return null;
            case -654877083:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS_DARK")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_PAGE_HEADERS_DARK", "mrkt/debug/hubs/component-reference/page-headers-dark", 1164, "mrkt");
                }
                return null;
            case -590449115:
                if (str.equals("GOLDENPATH_IBRAAHEEMR")) {
                    return m90662N1("GOLDENPATH_IBRAAHEEMR", "goldenpath/ibraaheemr", 642, "goldenpath");
                }
                return null;
            case -549067659:
                if (str.equals("S4P_AUTHENTICATION_SELECTION")) {
                    return m90662N1("S4P_AUTHENTICATION_SELECTION", "s4p/authentication/selection", 1622, "s4p");
                }
                return null;
            case -532313947:
                if (str.equals("FREETIER_TASTEONBOARDING_SKIPDIALOG")) {
                    return m90662N1("FREETIER_TASTEONBOARDING_SKIPDIALOG", "freetier/tasteonboarding/skipdialog", 571, "freetier");
                }
                return null;
            case -504228619:
                if (str.equals("CONNECT_TUTORIALTV")) {
                    return m90662N1("CONNECT_TUTORIALTV", "connect/tutorialtv", 396, "connect");
                }
                return null;
            case -494907339:
                if (str.equals("GOLDENPATH_SATURNINOC")) {
                    return m90662N1("GOLDENPATH_SATURNINOC", "goldenpath/saturninoc", 726, "goldenpath");
                }
                return null;
            case -492712843:
                if (str.equals("TRENDING_NEAR_YOU_LOCATION_SEARCH")) {
                    return m90662N1("TRENDING_NEAR_YOU_LOCATION_SEARCH", "trending-near-you/location-search", 1977, "trending-near-you");
                }
                return null;
            case -442832827:
                if (str.equals("SMARTSHUFFLE_NPVRECOMMENDATIONS_FULLSCREEN")) {
                    return m90899v5();
                }
                return null;
            case -278573115:
                if (str.equals("CONCERTS_CITYSEARCH")) {
                    return m90738Y0();
                }
                return null;
            case -262191611:
                if (str.equals("CULTURALMOMENTS_STORIES")) {
                    return m90662N1("CULTURALMOMENTS_STORIES", "culturalmoments/stories", 451, "culturalmoments");
                }
                return null;
            case -253816603:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_PITCHING")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_PITCHING", "mrkt/artist/campaigns/pitching", 1040, "mrkt");
                }
                return null;
            case -253328347:
                if (str.equals("WEAR_ENTITY_PAGE_REMOVE_DOWNLOAD_CONFIRMATION")) {
                    return m90662N1("WEAR_ENTITY_PAGE_REMOVE_DOWNLOAD_CONFIRMATION", "wear/entity_page/remove_download_confirmation", 2066, "wear");
                }
                return null;
            case -91981979:
                if (str.equals("ADD_ON_MANAGEMENT")) {
                    return m90618H();
                }
                return null;
            case -79554299:
                if (str.equals("NAVIGATION_OVERLAY")) {
                    return m90662N1("NAVIGATION_OVERLAY", "navigation/overlay", 1298, d6n0.f45729b);
                }
                return null;
            case -58538459:
                if (str.equals("EXTERNAL_CREDENTIALSMANAGER")) {
                    return m90606F1();
                }
                return null;
            case -53096507:
                if (str.equals("CHANGEPIN")) {
                    return m90887u0();
                }
                return null;
            case -23241579:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_DETAILS", "mrkt/artist/video/other-videos/details", 1130, "mrkt");
                }
                return null;
            case -10302395:
                if (str.equals("DISCOVERWEEKLY_SWIPE")) {
                    return m90662N1("DISCOVERWEEKLY_SWIPE", "discoverweekly/swipe", 483, "discoverweekly");
                }
                return null;
            case 8195125:
                if (str.equals("MERCH_HUB")) {
                    return m90662N1("MERCH_HUB", "merch-hub", 992, "merch-hub");
                }
                return null;
            case 31069573:
                if (str.equals("CALIFORNIA_NOARGS")) {
                    return m90662N1("CALIFORNIA_NOARGS", "california/noargs", 260, "california");
                }
                return null;
            case 40580965:
                if (str.equals("MEMBERSHIP_CONSUMER_MANAGE")) {
                    return m90662N1("MEMBERSHIP_CONSUMER_MANAGE", "membership/consumer/manage", 989, "membership");
                }
                return null;
            case 54586373:
                if (str.equals("CALLING_CODE_PICKER")) {
                    return m90662N1("CALLING_CODE_PICKER", "calling-code-picker", 261, "calling-code-picker");
                }
                return null;
            case 73725445:
                if (str.equals("MUSIC")) {
                    return m90662N1("MUSIC", "music", 1293, "music");
                }
                return null;
            case 94086805:
                if (str.equals("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT")) {
                    return m90662N1("ADSTUDIO_COLD_START_REVIEW_AND_SUBMIT", "adstudio/cold-start/review-and-submit", 74, "adstudio");
                }
                return null;
            case 94660389:
                if (str.equals("S4P_BETAMAXPLAYER")) {
                    return m90662N1("S4P_BETAMAXPLAYER", "s4p/betamaxplayer", 1623, "s4p");
                }
                return null;
            case 112631493:
                if (str.equals("FAN_EVENTS_REDEMPTION")) {
                    return m90662N1("FAN_EVENTS_REDEMPTION", "fan-events/redemption", 529, "fan-events");
                }
                return null;
            case 119283269:
                if (str.equals("SOULSEEKER_PROFILE_TRACKS")) {
                    return m90662N1("SOULSEEKER_PROFILE_TRACKS", "soulseeker-profile-tracks", 1864, "soulseeker-profile-tracks");
                }
                return null;
            case 134819285:
                if (str.equals("PODCAST_EPISODE_TRANSCRIPT")) {
                    return m90662N1("PODCAST_EPISODE_TRANSCRIPT", "podcast/episode/transcript", 1434, "podcast");
                }
                return null;
            case 141045029:
                if (str.equals("CHAT_LIST")) {
                    return m90598E0();
                }
                return null;
            case 143458629:
                if (str.equals("MRKT_CONTENT_MISMATCH")) {
                    return m90662N1("MRKT_CONTENT_MISMATCH", "mrkt/content-mismatch", 1158, "mrkt");
                }
                return null;
            case 166325077:
                if (str.equals("KID_ACCOUNT_TRANSITION_LEGAL_CONSENT")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_LEGAL_CONSENT", "kid-account-transition/legal-consent", 869, "kid-account-transition");
                }
                return null;
            case 204293685:
                if (str.equals("ADSTUDIO_COLD_START_AD")) {
                    return m90662N1("ADSTUDIO_COLD_START_AD", "adstudio/cold-start/ad", 64, "adstudio");
                }
                return null;
            case 252953493:
                if (str.equals("WATCHAPP_SEARCH")) {
                    return m90662N1("WATCHAPP_SEARCH", "watchapp/search", 2042, "watchapp");
                }
                return null;
            case 260880965:
                if (str.equals("LOGIN_EMAILOTP")) {
                    return m90662N1("LOGIN_EMAILOTP", "login/emailotp", 929, "login");
                }
                return null;
            case 377153877:
                if (str.equals("PIN_GATE")) {
                    return m90594D3();
                }
                return null;
            case 381667941:
                if (str.equals("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DETAIL")) {
                    return m90662N1("MRKT_THIRD_PARTY_AGENCY_CAMPAIGNS_DETAIL", "mrkt/third-party-agency/campaigns/detail", 1276, "mrkt");
                }
                return null;
            case 388910933:
                if (str.equals("REMOTEDOWNLOADS_ONBOARDING")) {
                    return m90728W4();
                }
                return null;
            case 424429029:
                if (str.equals("ADSDISPLAY_DSA")) {
                    return m90662N1("ADSDISPLAY_DSA", "adsdisplay/dsa", 28, "adsdisplay");
                }
                return null;
            case 466334789:
                if (str.equals("MANAGE_ACCEPT_INVITE_WELCOME_PAGE")) {
                    return m90662N1("MANAGE_ACCEPT_INVITE_WELCOME_PAGE", "manage/accept-invite/welcome-page", 962, "manage");
                }
                return null;
            case 480341669:
                if (str.equals("BROWSE_GENRES")) {
                    return m90662N1("BROWSE_GENRES", "browse/genres", 246, "browse");
                }
                return null;
            case 502327429:
                if (str.equals("ARTIST_CONCERTS")) {
                    return m90662N1("ARTIST_CONCERTS", "artist/concerts", 162, "artist");
                }
                return null;
            case 523216021:
                if (str.equals("MRKT_ARTIST_SONG_PLAYLIST")) {
                    return m90662N1("MRKT_ARTIST_SONG_PLAYLIST", "mrkt/artist/song/playlist", 1104, "mrkt");
                }
                return null;
            case 545540389:
                if (str.equals("MRKT_ARTIST_PROFILE_ARTISTPICK")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_ARTISTPICK", "mrkt/artist/profile/artistpick", 1075, "mrkt");
                }
                return null;
            case 623986517:
                if (str.equals("PODCAST_SHOW_LOADING")) {
                    return m90662N1("PODCAST_SHOW_LOADING", "podcast/show/loading", 1444, "podcast");
                }
                return null;
            case 629510501:
                if (str.equals("HOMEMIX_ENTITY")) {
                    return m90662N1("HOMEMIX_ENTITY", "homemix/entity", 793, "homemix");
                }
                return null;
            case 716555349:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION")) {
                    return m90662N1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION", "login/accountrecovery/requestemailconfirmation", 915, "login");
                }
                return null;
            case 748473237:
                if (str.equals("ADSTUDIO_COLD_START_AB_TEST_NEW_CONFIRMATION")) {
                    return m90662N1("ADSTUDIO_COLD_START_AB_TEST_NEW_CONFIRMATION", "adstudio/cold-start/ab-test/new/confirmation", 63, "adstudio");
                }
                return null;
            case 780420693:
                if (str.equals("WATCHAPP_CONNECT_DEVICE_PICKER")) {
                    return m90662N1("WATCHAPP_CONNECT_DEVICE_PICKER", "watchapp/connect-device-picker", 2022, "watchapp");
                }
                return null;
            case 800828709:
                if (str.equals("ALLBOARDING_CONTENTPICKER")) {
                    return m90662N1("ALLBOARDING_CONTENTPICKER", "allboarding/contentpicker", 144, kc3.f121351b);
                }
                return null;
            case 826236069:
                if (str.equals("LOGIN_DIALOG_PASSKEY_LOGIN_FAILED")) {
                    return m90621H2();
                }
                return null;
            case 858723301:
                if (str.equals("PHONENUMBERSIGNUP_VALIDATEOTP")) {
                    return m90662N1("PHONENUMBERSIGNUP_VALIDATEOTP", "phonenumbersignup/validateotp", 1390, "phonenumbersignup");
                }
                return null;
            case 862370181:
                if (str.equals("MRKT_ARTIST_PROFILE_PLAYLISTS_EDIT")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_PLAYLISTS_EDIT", "mrkt/artist/profile/playlists/edit", 1095, "mrkt");
                }
                return null;
            case 869450277:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_EDIT")) {
                    return m90662N1("MRKT_ARTIST_PRE_RELEASE_EDIT", "mrkt/artist/pre-release/edit", 1069, "mrkt");
                }
                return null;
            case 920837541:
                if (str.equals("FREETIER_CHARTS_CHART")) {
                    return m90662N1("FREETIER_CHARTS_CHART", "freetier/charts/chart", 563, "freetier");
                }
                return null;
            case 963197749:
                if (str.equals("ADTRANSPARENCYTRACKINGPREPROMPT")) {
                    return m90662N1("ADTRANSPARENCYTRACKINGPREPROMPT", "adtransparencytrackingpreprompt", 118, "adtransparencytrackingpreprompt");
                }
                return null;
            case 1023506357:
                if (str.equals("XRPROJECTED_LYRICS")) {
                    return m90662N1("XRPROJECTED_LYRICS", "xrprojected/lyrics", 2167, "xrprojected");
                }
                return null;
            case 1061214277:
                if (str.equals("PORTAL_SEARCH_SOFTWARE_CATALOG")) {
                    return m90662N1("PORTAL_SEARCH_SOFTWARE_CATALOG", "portal/search-software-catalog", 1481, "portal");
                }
                return null;
            case 1070737669:
                if (str.equals("PROFILE_ACTIVITY")) {
                    return m90662N1("PROFILE_ACTIVITY", "profile/activity", 1517, "profile");
                }
                return null;
            case 1091707637:
                if (str.equals("MRKT_TEAM_MANAGEMENT_SELECT_TEAM")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_SELECT_TEAM", "mrkt/team-management/select-team", 1266, "mrkt");
                }
                return null;
            case 1108783429:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING", "mrkt/discovery-mode/unified-buying", 1173, "mrkt");
                }
                return null;
            case 1112982213:
                if (str.equals("MRKT_MOBILE_STATS_OVERVIEW")) {
                    return m90662N1("MRKT_MOBILE_STATS_OVERVIEW", "mrkt/mobile-stats/overview", 1247, "mrkt");
                }
                return null;
            case 1127043749:
                if (str.equals("FANDOM_ARTISTMIX")) {
                    return m90662N1("FANDOM_ARTISTMIX", "fandom/artistmix", 531, "fandom");
                }
                return null;
            case 1133676533:
                if (str.equals("PROACTIVE_PLATFORMS_HOME_SCREEN_CARD_WIDGET")) {
                    return m90662N1("PROACTIVE_PLATFORMS_HOME_SCREEN_CARD_WIDGET", "proactive-platforms/home-screen-card-widget", 1508, "proactive-platforms");
                }
                return null;
            case 1137930469:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_FAN_CONNECTION")) {
                    return m90662N1("MRKT_FRONTDOOR_FAN_STUDY_FAN_CONNECTION", "mrkt/frontdoor/fan-study/fan-connection", 1206, "mrkt");
                }
                return null;
            case 1139427845:
                if (str.equals("MRKT_FRONTDOOR_STREAM_ON")) {
                    return m90662N1("MRKT_FRONTDOOR_STREAM_ON", "mrkt/frontdoor/stream-on", 1228, "mrkt");
                }
                return null;
            case 1173654933:
                if (str.equals("MRKT_ARTIST_EVENTS_NO_ARTIST_REDIRECT")) {
                    return m90662N1("MRKT_ARTIST_EVENTS_NO_ARTIST_REDIRECT", "mrkt/artist/events/no-artist-redirect", 1044, "mrkt");
                }
                return null;
            case 1219982501:
                if (str.equals("SETTINGS_LANGUAGES_MUSIC")) {
                    return m90812i5();
                }
                return null;
            case 1231281093:
                if (str.equals("CONTEXTMENU_ARTISTCONCERTS")) {
                    return m90662N1("CONTEXTMENU_ARTISTCONCERTS", "contextmenu/artistconcerts", 407, "contextmenu");
                }
                return null;
            case 1253944805:
                if (str.equals("CHARTS_ALBUM")) {
                    return m90662N1("CHARTS_ALBUM", "charts/album", 296, "charts");
                }
                return null;
            case 1256034549:
                if (str.equals("SUPERBIRD_SETUP_WELCOME")) {
                    return m90662N1("SUPERBIRD_SETUP_WELCOME", "superbird/setup/welcome", 1947, "superbird");
                }
                return null;
            case 1264833333:
                if (str.equals("CHARTS_MERCH")) {
                    return m90662N1("CHARTS_MERCH", "charts/merch", 299, "charts");
                }
                return null;
            case 1284844549:
                if (str.equals("ENTITYSEGMENTS_PODCASTCHAPTER")) {
                    return m90662N1("ENTITYSEGMENTS_PODCASTCHAPTER", "entitysegments/podcastchapter", 506, "entitysegments");
                }
                return null;
            case 1415355797:
                if (str.equals("S4P_COMMON_WEBVIEW")) {
                    return m90662N1("S4P_COMMON_WEBVIEW", "s4p/common-webview", 1637, "s4p");
                }
                return null;
            case 1416202917:
                if (str.equals("MRKT_WAITING_ROOM_AUDIENCE")) {
                    return m90662N1("MRKT_WAITING_ROOM_AUDIENCE", "mrkt/waiting-room/audience", 1283, "mrkt");
                }
                return null;
            case 1439970229:
                if (str.equals("SPOTIFY_FOR_AUTHORS_SETTINGS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_SETTINGS", "spotify-for-authors/settings", 1889, "spotify-for-authors");
                }
                return null;
            case 1443032485:
                if (str.equals("MRKT_NOT_FOUND")) {
                    return m90662N1("MRKT_NOT_FOUND", "mrkt/not-found", 1248, "mrkt");
                }
                return null;
            case 1470241685:
                if (str.equals("S4P_CLAIM_PODCAST_PAYOUTS_CONFIRMATION")) {
                    return m90662N1("S4P_CLAIM_PODCAST_PAYOUTS_CONFIRMATION", "s4p/claim-podcast/payouts-confirmation", 1629, "s4p");
                }
                return null;
            case 1472294485:
                if (str.equals("SEARCH_ARTISTS")) {
                    return m90662N1("SEARCH_ARTISTS", "search/artists", 1725, "search");
                }
                return null;
            case 1483666661:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_AD")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_AD", "adstudio/duplicate-ad/ad", 91, "adstudio");
                }
                return null;
            case 1605316053:
                if (str.equals("ADSTUDIO_BUSINESS_CREATE")) {
                    return m90662N1("ADSTUDIO_BUSINESS_CREATE", "adstudio/business/create", 54, "adstudio");
                }
                return null;
            case 1636281781:
                if (str.equals("YOURLIBRARY_ARTISTS")) {
                    return m90662N1("YOURLIBRARY_ARTISTS", "yourlibrary/artists", 2176, "yourlibrary");
                }
                return null;
            case 1647711333:
                if (str.equals("MRKT_ARTIST_PROFILE_BANNER_IMAGE")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_BANNER_IMAGE", "mrkt/artist/profile/banner-image", 1080, "mrkt");
                }
                return null;
            case 1661051045:
                if (str.equals("GOOGLEASSISTANT")) {
                    return m90662N1("GOOGLEASSISTANT", "googleassistant", 747, "googleassistant");
                }
                return null;
            case 1679244693:
                if (str.equals("GATEDCONTENT_BOTTOMSHEET")) {
                    return m90662N1("GATEDCONTENT_BOTTOMSHEET", "gatedcontent/bottomsheet", 586, "gatedcontent");
                }
                return null;
            case 1749623781:
                if (str.equals("PARENTAL_CONTROL_DELETE_ACCOUNT")) {
                    return m90876s3();
                }
                return null;
            case 1761083029:
                if (str.equals("REQUESTPERMISSIONS")) {
                    return m90662N1("REQUESTPERMISSIONS", "requestpermissions", 1597, "requestpermissions");
                }
                return null;
            case 1771999765:
                if (str.equals("S4P_TERMS_OF_SERVICE")) {
                    return m90662N1("S4P_TERMS_OF_SERVICE", "s4p/terms-of-service", 1712, "s4p");
                }
                return null;
            case 1871981589:
                if (str.equals("SOCIAL_LISTENING_SHAREOPTIONS")) {
                    return m90662N1("SOCIAL_LISTENING_SHAREOPTIONS", "social-listening/shareoptions", 1854, "social-listening");
                }
                return null;
            case 1881679013:
                if (str.equals("PAGE_MATCH_ONBOARDING")) {
                    return m90855p3();
                }
                return null;
            case 1907782005:
                if (str.equals("S4P_ACTIVITY_CENTER")) {
                    return m90662N1("S4P_ACTIVITY_CENTER", "s4p/activity-center", 1607, "s4p");
                }
                return null;
            case 1940858965:
                if (str.equals("SOCIAL_LISTENING_IPLSESSIONSHARING")) {
                    return m90662N1("SOCIAL_LISTENING_IPLSESSIONSHARING", "social-listening/iplsessionsharing", 1848, "social-listening");
                }
                return null;
            case 1986664533:
                if (str.equals("CHARTS")) {
                    return m90662N1("CHARTS", "charts", 295, "charts");
                }
                return null;
            case 1993205749:
                if (str.equals("CAREPACKAGE")) {
                    return m90662N1("CAREPACKAGE", "carepackage", 269, "carepackage");
                }
                return null;
            case 2135149653:
                if (str.equals("MRKT_FRONTDOOR_BLOG_CONTENT")) {
                    return m90662N1("MRKT_FRONTDOOR_BLOG_CONTENT", "mrkt/frontdoor/blog/content", 1196, "mrkt");
                }
                return null;
            case 2138894197:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS_VIDEO_SETTINGS")) {
                    return m90832l4();
                }
                return null;
            case 2145575717:
                if (str.equals("MRKT_ARTIST_PROFILE_MERCH_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_MERCH_DETAILS", "mrkt/artist/profile/merch/details", 1093, "mrkt");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: U */
    public static cbm0 m90709U() {
        return m90662N1("ALLBOARDING_HOST", "allboarding/host", 146, kc3.f121351b);
    }

    /* JADX INFO: renamed from: U0 */
    public static cbm0 m90710U0() {
        return m90662N1("CONCERT_GALLERY", "concert-gallery", 374, "concert-gallery");
    }

    /* JADX INFO: renamed from: U1 */
    public static cbm0 m90711U1() {
        return m90662N1("GRADUATION_TERMS", "graduation/terms", 756, "graduation");
    }

    /* JADX INFO: renamed from: U2 */
    public static cbm0 m90712U2() {
        return m90662N1("MAGPIE_PROMPT", "magpie/prompt", 956, "magpie");
    }

    /* JADX INFO: renamed from: U3 */
    public static cbm0 m90713U3() {
        return m90662N1("PLAYLISTS_EDIT_PRIVACY", "playlists/edit-privacy", 1422, "playlists");
    }

    /* JADX INFO: renamed from: U4 */
    public static cbm0 m90714U4() {
        return m90662N1("REINVENTFREE_TIME_CAP_UPSELL", "reinventfree-time-cap-upsell", 1589, "reinventfree-time-cap-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: U5 */
    public static cbm0 m90715U5(String str) {
        switch (str.hashCode()) {
            case -2093542906:
                if (str.equals("GOLDENPATH_JAMIELEE1")) {
                    return m90662N1("GOLDENPATH_JAMIELEE1", "goldenpath/jamielee1", 646, "goldenpath");
                }
                return null;
            case -2078406602:
                if (str.equals("SUPPORT_SITE_OLD_ARTICLE")) {
                    return m90662N1("SUPPORT_SITE_OLD_ARTICLE", "support-site/old/article", 1955, "support-site");
                }
                return null;
            case -2038734106:
                if (str.equals("SONG_DNA_REPORT")) {
                    return m90662N1("SONG_DNA_REPORT", "song-dna-report", 1862, "song-dna-report");
                }
                return null;
            case -2004896634:
                if (str.equals("BOOKSHELFTOAUDIOBOOKRECS")) {
                    return m90662N1("BOOKSHELFTOAUDIOBOOKRECS", "bookshelftoaudiobookrecs", AdvertisementType.BRANDED_DURING_LIVE, "bookshelftoaudiobookrecs");
                }
                return null;
            case -1985814730:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_UPLOAD")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_CSV_UPLOAD", "mrkt/discovery-mode/unified-buying/update/csv/upload", 1182, "mrkt");
                }
                return null;
            case -1975435962:
                if (str.equals("CHECKOUT")) {
                    return m90662N1("CHECKOUT", "checkout", 323, "checkout");
                }
                return null;
            case -1922548298:
                if (str.equals("STS_LOCAL_FILES")) {
                    return m90662N1("STS_LOCAL_FILES", "sts/local-files", 1919, "sts");
                }
                return null;
            case -1818130842:
                if (str.equals("SUPPORT_SITE_CATEGORY")) {
                    return m90662N1("SUPPORT_SITE_CATEGORY", "support-site/category", 1950, "support-site");
                }
                return null;
            case -1794725882:
                if (str.equals("USERHIGHLIGHT_LOADING")) {
                    return m90662N1("USERHIGHLIGHT_LOADING", "userHighlight/loading", AudioEpisode.SHOW_URI_FIELD_NUMBER, "userHighlight");
                }
                return null;
            case -1759381594:
                if (str.equals("CHECKOUT_CHOICESCREEN")) {
                    return m90662N1("CHECKOUT_CHOICESCREEN", "checkout/choicescreen", 324, "checkout");
                }
                return null;
            case -1747043050:
                if (str.equals("GOLDENPATH_AWELANDER")) {
                    return m90662N1("GOLDENPATH_AWELANDER", "goldenpath/awelander", ContentDeliverySubscriptionType.TRANSACTIONAL, "goldenpath");
                }
                return null;
            case -1687834906:
                if (str.equals("MULTI_USER_PLAN_VERIFICATION_START")) {
                    return m90761b3();
                }
                return null;
            case -1662801498:
                if (str.equals("MRKT_ARTIST_VIDEO_CANVAS_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CANVAS_DETAILS", "mrkt/artist/video/canvas/details", 1110, "mrkt");
                }
                return null;
            case -1614235338:
                if (str.equals("PROFILE_ARTISTS")) {
                    return m90662N1("PROFILE_ARTISTS", "profile/artists", 1519, "profile");
                }
                return null;
            case -1600741914:
                if (str.equals("LANGUAGEPICKER")) {
                    return m90662N1("LANGUAGEPICKER", "languagepicker", 878, "languagepicker");
                }
                return null;
            case -1571863578:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSWORD")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_LOGIN_METHODS_V2_PASSWORD", "www-account-pages/login-methods-v2-password", 2136, "www-account-pages");
                }
                return null;
            case -1501078666:
                if (str.equals("MARTINI_FEEDBACK")) {
                    return m90733X2();
                }
                return null;
            case -1496919722:
                if (str.equals("BUNDLING_OFFER_WEBVIEW")) {
                    return m90662N1("BUNDLING_OFFER_WEBVIEW", "bundling/offer/webview", 252, "bundling");
                }
                return null;
            case -1488067066:
                if (str.equals("WEAR_WHAT_IS_NEW")) {
                    return m90662N1("WEAR_WHAT_IS_NEW", "wear/what_is_new", 2094, "wear");
                }
                return null;
            case -1428915130:
                if (str.equals("S4P_BLOCKED_WORDS")) {
                    return m90662N1("S4P_BLOCKED_WORDS", "s4p/blocked-words", 1625, "s4p");
                }
                return null;
            case -1425790634:
                if (str.equals("GRADUATION_TERMS")) {
                    return m90711U1();
                }
                return null;
            case -1403058554:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_ERROR")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_CSV_ERROR", "mrkt/discovery-mode/unified-buying/create/csv/error", 1175, "mrkt");
                }
                return null;
            case -1401160250:
                if (str.equals("EXTERNAL_APPLE")) {
                    return m90662N1("EXTERNAL_APPLE", "external/apple", 520, "external");
                }
                return null;
            case -1360982010:
                if (str.equals("GRADUATION_VIEW_REQUEST")) {
                    return m90718V1();
                }
                return null;
            case -1342224170:
                if (str.equals("SPOTIT_ERROR")) {
                    return m90662N1("SPOTIT_ERROR", "spotit/error", 1900, "spotit");
                }
                return null;
            case -1232216634:
                if (str.equals("GOLDENPATH_KAPILESHT")) {
                    return m90662N1("GOLDENPATH_KAPILESHT", "goldenpath/kapilesht", 664, "goldenpath");
                }
                return null;
            case -1210883738:
                if (str.equals("PODCASTMIX_CONTROLS_TOPICS")) {
                    return m90662N1("PODCASTMIX_CONTROLS_TOPICS", "podcastmix/controls/topics", 1464, "podcastmix");
                }
                return null;
            case -1198614906:
                if (str.equals("WEAR_CHAPTERS")) {
                    return m90662N1("WEAR_CHAPTERS", "wear/chapters", 2058, "wear");
                }
                return null;
            case -1183995146:
                if (str.equals("S4P_SETUP_SHOW_SUMMARY")) {
                    return m90662N1("S4P_SETUP_SHOW_SUMMARY", "s4p/setup-show/summary", 1703, "s4p");
                }
                return null;
            case -1128596874:
                if (str.equals("GOLDENPATH_KSIMS")) {
                    return m90662N1("GOLDENPATH_KSIMS", "goldenpath/ksims", 668, "goldenpath");
                }
                return null;
            case -1100516154:
                if (str.equals("LISTENINGACTIVITY_GROUP_AUDIENCE_SELECTION")) {
                    return m90662N1("LISTENINGACTIVITY_GROUP_AUDIENCE_SELECTION", "listeningactivity/group/audience-selection", 888, "listeningactivity");
                }
                return null;
            case -1054082026:
                if (str.equals("AGE_SIGNAL_BLOCKED_CONFIRM_AGE")) {
                    return m90662N1("AGE_SIGNAL_BLOCKED_CONFIRM_AGE", "age-signal/blocked/confirm-age", 131, "age-signal");
                }
                return null;
            case -995797466:
                if (str.equals("SEARCH_LAST_WEEK")) {
                    return m90662N1("SEARCH_LAST_WEEK", "search/last_week", 1733, "search");
                }
                return null;
            case -969634042:
                if (str.equals("S4P_ONBOARDING_HOSTING")) {
                    return m90662N1("S4P_ONBOARDING_HOSTING", "s4p/onboarding/hosting", 1665, "s4p");
                }
                return null;
            case -961126330:
                if (str.equals("SEARCH_PODCASTS_AND_EPISODES_UPLOAD_DATE")) {
                    return m90662N1("SEARCH_PODCASTS_AND_EPISODES_UPLOAD_DATE", "search/podcasts_and_episodes/upload_date", 1738, "search");
                }
                return null;
            case -953841002:
                if (str.equals("LIVE_ENTITY")) {
                    return m90607F2();
                }
                return null;
            case -953101322:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS")) {
                    return m90675P0();
                }
                return null;
            case -931290106:
                if (str.equals("PLAYLIST_ADDTOPLAYLIST_SORTING")) {
                    return m90662N1("PLAYLIST_ADDTOPLAYLIST_SORTING", "playlist/addtoplaylist/sorting", 1399, "playlist");
                }
                return null;
            case -869292794:
                if (str.equals("WWW_ACCOUNT_PAGES_STUDENT")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_STUDENT", "www-account-pages/student", 2164, "www-account-pages");
                }
                return null;
            case -863089466:
                if (str.equals("MANAGE_ACCEPT_INVITE")) {
                    return m90662N1("MANAGE_ACCEPT_INVITE", "manage/accept-invite", 961, "manage");
                }
                return null;
            case -782754026:
                if (str.equals("GOLDENPATH_FELIXA")) {
                    return m90662N1("GOLDENPATH_FELIXA", "goldenpath/felixa", 631, "goldenpath");
                }
                return null;
            case -766826410:
                if (str.equals("GOLDENPATH_MICHALS")) {
                    return m90662N1("GOLDENPATH_MICHALS", "goldenpath/michals", 686, "goldenpath");
                }
                return null;
            case -746691594:
                if (str.equals("WWW_ACCOUNT_PAGES_AVAILABLEPLANS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_AVAILABLEPLANS", "www-account-pages/availableplans", 2111, "www-account-pages");
                }
                return null;
            case -729227594:
                if (str.equals("GOLDENPATH_HAKAND")) {
                    return m90662N1("GOLDENPATH_HAKAND", "goldenpath/hakand", 637, "goldenpath");
                }
                return null;
            case -638412090:
                if (str.equals("UNBOXING_FEATURE_FLOW")) {
                    return m90596D5();
                }
                return null;
            case -608391178:
                if (str.equals("WATCHAPP_SHUFFLE_RESTRICTION_ALERT")) {
                    return m90662N1("WATCHAPP_SHUFFLE_RESTRICTION_ALERT", "watchapp/shuffle-restriction-alert", 2044, "watchapp");
                }
                return null;
            case -602203146:
                if (str.equals("SUPERBIRD_SETUP_READY")) {
                    return m90662N1("SUPERBIRD_SETUP_READY", "superbird/setup/ready", 1943, "superbird");
                }
                return null;
            case -572153626:
                if (str.equals("LYRICS_FULLSCREEN")) {
                    return m90649L2();
                }
                return null;
            case -550302970:
                if (str.equals("WWW_ACCOUNT_PAGES_PAYMENT_HISTORY")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PAYMENT_HISTORY", "www-account-pages/payment-history", 2152, "www-account-pages");
                }
                return null;
            case -538357178:
                if (str.equals("ARTIST_PATRON")) {
                    return m90662N1("ARTIST_PATRON", "artist/patron", 167, "artist");
                }
                return null;
            case -403347322:
                if (str.equals("SETTINGS_EMPLOYEE_TOOLS")) {
                    return m90798g5();
                }
                return null;
            case -241185338:
                if (str.equals("CONTEXTMENU_YOURUPDATES")) {
                    return m90662N1("CONTEXTMENU_YOURUPDATES", "contextmenu/yourupdates", 432, "contextmenu");
                }
                return null;
            case -224787338:
                if (str.equals("AUDIOBOOK_SUPPLEMENTARYMATERIAL")) {
                    return m90786f0();
                }
                return null;
            case -198910618:
                if (str.equals("MRKT_USER_SETTINGS")) {
                    return m90662N1("MRKT_USER_SETTINGS", "mrkt/user-settings", 1278, "mrkt");
                }
                return null;
            case -193542778:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_INTERACTIVE")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_UPDATE_INTERACTIVE", "mrkt/discovery-mode/unified-buying/update/interactive", 1183, "mrkt");
                }
                return null;
            case -182725242:
                if (str.equals("SIGNUP_DISPLAYNAME")) {
                    return m90662N1("SIGNUP_DISPLAYNAME", "signup/displayname", 1829, "signup");
                }
                return null;
            case -182033002:
                if (str.equals("SETTINGS_EQUALIZER")) {
                    return m90805h5();
                }
                return null;
            case -160320522:
                if (str.equals("AUDIOBOOK_DIRECTSALES_INAPPWEBCHECKOUTOVERLAY")) {
                    return m90779e0();
                }
                return null;
            case -124279370:
                if (str.equals("PERMISSIONS_NOTIFICATIONS_PROMPT")) {
                    return m90662N1("PERMISSIONS_NOTIFICATIONS_PROMPT", "permissions-notifications-prompt", 1375, "permissions-notifications-prompt");
                }
                return null;
            case -121668666:
                if (str.equals("CAPPED_OFFLINE_DIALOG")) {
                    return m90662N1("CAPPED_OFFLINE_DIALOG", "capped-offline/dialog", 264, "capped-offline");
                }
                return null;
            case -117946282:
                if (str.equals("HOME_FUNKIS")) {
                    return m90662N1("HOME_FUNKIS", "home-funkis", 776, "home-funkis");
                }
                return null;
            case -108720554:
                if (str.equals("KID_ACCOUNT_TRANSITION_COPPA")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_COPPA", "kid-account-transition/coppa", 866, "kid-account-transition");
                }
                return null;
            case -106488346:
                if (str.equals("MRKT_ARTIST_HOME")) {
                    return m90662N1("MRKT_ARTIST_HOME", "mrkt/artist/home", 1046, "mrkt");
                }
                return null;
            case -67835354:
                if (str.equals("UNBOXING_HUB")) {
                    return m90662N1("UNBOXING_HUB", "unboxing/hub", 1990, "unboxing");
                }
                return null;
            case -15427626:
                if (str.equals("ARSENAL")) {
                    return m90662N1("ARSENAL", "arsenal", 153, "arsenal");
                }
                return null;
            case -5511786:
                if (str.equals("LEGACYSHARE")) {
                    return m90662N1("LEGACYSHARE", "legacyshare", 881, "legacyshare");
                }
                return null;
            case 77494:
                if (str.equals("NOW")) {
                    return m90662N1("NOW", "now", 1304, "now");
                }
                return null;
            case 38768822:
                if (str.equals("USERS_NEARBY")) {
                    return m90662N1("USERS_NEARBY", "users_nearby", AudioEpisode.VIDEO_FORMAT_FIELD_NUMBER, "users_nearby");
                }
                return null;
            case 61098150:
                if (str.equals("NOTIFICATIONS_ACTIVITY")) {
                    return m90662N1("NOTIFICATIONS_ACTIVITY", "notifications/activity", 1303, "notifications");
                }
                return null;
            case 62030774:
                if (str.equals("AAA_T")) {
                    return m90900w();
                }
                return null;
            case 69806694:
                if (str.equals("INBOX")) {
                    return m90662N1("INBOX", "inbox", 820, "inbox");
                }
                return null;
            case 78676534:
                if (str.equals("SAYIT")) {
                    return m90662N1("SAYIT", "sayit", 1720, "sayit");
                }
                return null;
            case 78740022:
                if (str.equals("SUPPORT_SITE_PREMIUM_CLOSE_ACCOUNT")) {
                    return m90662N1("SUPPORT_SITE_PREMIUM_CLOSE_ACCOUNT", "support-site/premium-close-account", 1959, "support-site");
                }
                return null;
            case 78875894:
                if (str.equals("SHOWS")) {
                    return m90662N1("SHOWS", "shows", 1809, "shows");
                }
                return null;
            case 113828166:
                if (str.equals("REINVENTFREE_TIME_CAP_UPSELL")) {
                    return m90714U4();
                }
                return null;
            case 200027558:
                if (str.equals("WWW_ACCOUNT_PAGES_COLLECT_ACCOUNT_DETAILS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_COLLECT_ACCOUNT_DETAILS", "www-account-pages/collect-account-details", 2115, "www-account-pages");
                }
                return null;
            case 309040422:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_NEW_RELEASES")) {
                    return m90662N1("MRKT_FRONTDOOR_FAN_STUDY_NEW_RELEASES", "mrkt/frontdoor/fan-study/new-releases", 1209, "mrkt");
                }
                return null;
            case 326308998:
                if (str.equals("GOLDENPATH_ABELTRAMI")) {
                    return m90662N1("GOLDENPATH_ABELTRAMI", "goldenpath/abeltrami", 592, "goldenpath");
                }
                return null;
            case 353586374:
                if (str.equals("MRKT_ARTIST_PROFILE_FAN_SUPPORT")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_FAN_SUPPORT", "mrkt/artist/profile/fan-support", 1085, "mrkt");
                }
                return null;
            case 486135542:
                if (str.equals("MRKT_FRONTDOOR_SPOTIFY_FOR_ARTISTS_MARKETING_AWARDS")) {
                    return m90662N1("MRKT_FRONTDOOR_SPOTIFY_FOR_ARTISTS_MARKETING_AWARDS", "mrkt/frontdoor/spotify-for-artists-marketing-awards", 1226, "mrkt");
                }
                return null;
            case 513190726:
                if (str.equals("SHARE_FACEBOOK")) {
                    return m90662N1("SHARE_FACEBOOK", "share/facebook", 1800, "share");
                }
                return null;
            case 514467926:
                if (str.equals("CONTEXTMENU_VIEWARTISTS")) {
                    return m90662N1("CONTEXTMENU_VIEWARTISTS", "contextmenu/viewartists", 431, "contextmenu");
                }
                return null;
            case 519249238:
                if (str.equals("DIALOG_TERMS_TERMSPOSTPONED")) {
                    return m90662N1("DIALOG_TERMS_TERMSPOSTPONED", "dialog/terms/termspostponed", 479, "dialog");
                }
                return null;
            case 564081894:
                if (str.equals("GOLDENPATH_KNIFESQUAD")) {
                    return m90662N1("GOLDENPATH_KNIFESQUAD", "goldenpath/knifesquad", 666, "goldenpath");
                }
                return null;
            case 674282662:
                if (str.equals("GOLDENPATH_MRIBEIROMEIRELES")) {
                    return m90662N1("GOLDENPATH_MRIBEIROMEIRELES", "goldenpath/mribeiromeireles", 695, "goldenpath");
                }
                return null;
            case 678376390:
                if (str.equals("MRKT_FRONTDOOR_SHOWCASE")) {
                    return m90662N1("MRKT_FRONTDOOR_SHOWCASE", "mrkt/frontdoor/showcase", 1224, "mrkt");
                }
                return null;
            case 715120422:
                if (str.equals("MRKT_ARTIST_MUSIC_UPCOMING_PRERELEASE")) {
                    return m90662N1("MRKT_ARTIST_MUSIC_UPCOMING_PRERELEASE", "mrkt/artist/music/upcoming/prerelease", 1061, "mrkt");
                }
                return null;
            case 715350582:
                if (str.equals("EPISODECHAPTERS_NPV")) {
                    return m90662N1("EPISODECHAPTERS_NPV", "episodechapters/npv", 510, "episodechapters");
                }
                return null;
            case 726108246:
                if (str.equals("MRKT_FRONTDOOR_FEATURES")) {
                    return m90662N1("MRKT_FRONTDOOR_FEATURES", "mrkt/frontdoor/features", 1211, "mrkt");
                }
                return null;
            case 749821206:
                if (str.equals("MRKT_FRONTDOOR_ARTIFICIAL_STREAMING")) {
                    return m90662N1("MRKT_FRONTDOOR_ARTIFICIAL_STREAMING", "mrkt/frontdoor/artificial-streaming", 1194, "mrkt");
                }
                return null;
            case 779329398:
                if (str.equals("ADSTUDIO_CAMPAIGNS_REPORT")) {
                    return m90662N1("ADSTUDIO_CAMPAIGNS_REPORT", "adstudio/campaigns/report", 61, "adstudio");
                }
                return null;
            case 796083798:
                if (str.equals("RECOMMENDED_MUSIC_VIDEOS")) {
                    return m90662N1("RECOMMENDED_MUSIC_VIDEOS", "recommended-music-videos", 1577, "recommended-music-videos");
                }
                return null;
            case 817413670:
                if (str.equals("ADSTUDIO_COLD_START_AD_FULL_SERVICE_AUDIO")) {
                    return m90662N1("ADSTUDIO_COLD_START_AD_FULL_SERVICE_AUDIO", "adstudio/cold-start/ad-full-service-audio", 65, "adstudio");
                }
                return null;
            case 822087926:
                if (str.equals("WWW_ACCOUNT_PAGES_MANAGEYOURPLAN")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_MANAGEYOURPLAN", "www-account-pages/manageyourplan", 2138, "www-account-pages");
                }
                return null;
            case 877000166:
                if (str.equals("PREMIUM_DESTINATION")) {
                    return m90844n4();
                }
                return null;
            case 898866022:
                if (str.equals("ADSTUDIO_REPORT_DUPLICATE")) {
                    return m90662N1("ADSTUDIO_REPORT_DUPLICATE", "adstudio/report/duplicate", Error.TOO_YOUNG_FIELD_NUMBER, "adstudio");
                }
                return null;
            case 967283750:
                if (str.equals("ADSTUDIO_ASSET_LIBRARY")) {
                    return m90662N1("ADSTUDIO_ASSET_LIBRARY", "adstudio/asset-library", 49, "adstudio");
                }
                return null;
            case 968715142:
                if (str.equals("S4P_PODCAST_EPISODE_EDIT_THUMBNAIL")) {
                    return m90662N1("S4P_PODCAST_EPISODE_EDIT_THUMBNAIL", "s4p/podcast/episode/edit-thumbnail", 1675, "s4p");
                }
                return null;
            case 1132975382:
                if (str.equals("MRKT_ARTIST_PROFILE_AVATAR")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_AVATAR", "mrkt/artist/profile/avatar", 1078, "mrkt");
                }
                return null;
            case 1148120678:
                if (str.equals("MARKETOPPORTUNITIES_PRECACHING")) {
                    return m90662N1("MARKETOPPORTUNITIES_PRECACHING", "marketopportunities/precaching", 981, "marketopportunities");
                }
                return null;
            case 1215970214:
                if (str.equals("SHARE_MESSENGER_COMPOSE")) {
                    return m90662N1("SHARE_MESSENGER_COMPOSE", "share/messenger/compose", 1804, "share");
                }
                return null;
            case 1266600198:
                if (str.equals("WWW_ACCOUNT_PAGES_AUDIOBOOK_LISTENING_TIME")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_AUDIOBOOK_LISTENING_TIME", "www-account-pages/audiobook-listening-time", 2109, "www-account-pages");
                }
                return null;
            case 1397929542:
                if (str.equals("CHALLENGE_MFA_SMS")) {
                    return m90662N1("CHALLENGE_MFA_SMS", "challenge/mfa-sms", 289, "challenge");
                }
                return null;
            case 1406539302:
                if (str.equals("MRKT_FRONTDOOR_MERCH")) {
                    return m90662N1("MRKT_FRONTDOOR_MERCH", "mrkt/frontdoor/merch", 1217, "mrkt");
                }
                return null;
            case 1417164118:
                if (str.equals("S4P_ANALYTICS")) {
                    return m90662N1("S4P_ANALYTICS", "s4p/analytics", 1608, "s4p");
                }
                return null;
            case 1496782614:
                if (str.equals("CHALLENGE_EMAIL_PASSWORDLESSLOGIN")) {
                    return m90662N1("CHALLENGE_EMAIL_PASSWORDLESSLOGIN", "challenge/email/passwordlesslogin", 286, "challenge");
                }
                return null;
            case 1521454822:
                if (str.equals("S4P_SHOWS")) {
                    return m90662N1("S4P_SHOWS", "s4p/shows", 1708, "s4p");
                }
                return null;
            case 1569922454:
                if (str.equals("BOOTCAMP_TOP50PLAYLIST")) {
                    return m90662N1("BOOTCAMP_TOP50PLAYLIST", "bootcamp/top50playlist", 241, "bootcamp");
                }
                return null;
            case 1603636550:
                if (str.equals("UPSELLS_SHEET")) {
                    return m90662N1("UPSELLS_SHEET", "upsells/sheet", 1999, "upsells");
                }
                return null;
            case 1665436278:
                if (str.equals("GOLDENPATH_CHRISTINAD")) {
                    return m90662N1("GOLDENPATH_CHRISTINAD", "goldenpath/christinad", 611, "goldenpath");
                }
                return null;
            case 1683776518:
                if (str.equals("UBI_DEBUG_MONITOR_RECENTEVENTSLIST")) {
                    return m90662N1("UBI_DEBUG_MONITOR_RECENTEVENTSLIST", "ubi/debug-monitor/recenteventslist", 1986, "ubi");
                }
                return null;
            case 1709529942:
                if (str.equals("PAGE_MATCH_OUTBOUND_SCANNING")) {
                    return m90662N1("PAGE_MATCH_OUTBOUND_SCANNING", "page-match/outbound-scanning", 1345, "page-match");
                }
                return null;
            case 1735759638:
                if (str.equals("GOLDENPATH_EHENRIKSSON")) {
                    return m90662N1("GOLDENPATH_EHENRIKSSON", "goldenpath/ehenriksson", 622, "goldenpath");
                }
                return null;
            case 1767031270:
                if (str.equals("S4P_COMMENT_USER_REACTIONS")) {
                    return m90662N1("S4P_COMMENT_USER_REACTIONS", "s4p/comment-user-reactions", 1635, "s4p");
                }
                return null;
            case 1779105350:
                if (str.equals("S4P_INTERACT")) {
                    return m90662N1("S4P_INTERACT", "s4p/interact", 1658, "s4p");
                }
                return null;
            case 1875087910:
                if (str.equals("LOCKSTATE")) {
                    return m90662N1("LOCKSTATE", "lockstate", 910, "lockstate");
                }
                return null;
            case 1886767318:
                if (str.equals("LIVESTREAMING")) {
                    return m90662N1("LIVESTREAMING", "livestreaming", 908, "livestreaming");
                }
                return null;
            case 1971252294:
                if (str.equals("SUPPORT_ARTICLE")) {
                    return m90662N1("SUPPORT_ARTICLE", "support/article", 1961, "support");
                }
                return null;
            case 1987758006:
                if (str.equals("HIFI_ONBOARDING")) {
                    return m90662N1("HIFI_ONBOARDING", "hifi/onboarding", 769, "hifi");
                }
                return null;
            case 1987974070:
                if (str.equals("ENTITYSEGMENTS_CLIP_NOTE_CREATE")) {
                    return m90662N1("ENTITYSEGMENTS_CLIP_NOTE_CREATE", "entitysegments/clip/note/create", 505, "entitysegments");
                }
                return null;
            case 1993669174:
                if (str.equals("PORTAL_SEARCH_DOCUMENTATION")) {
                    return m90662N1("PORTAL_SEARCH_DOCUMENTATION", "portal/search-documentation", 1476, "portal");
                }
                return null;
            case 2045093878:
                if (str.equals("SPOTIFY_FOR_AUTHORS_UPLOAD_DETAILS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_UPLOAD_DETAILS", "spotify-for-authors/upload/details", 1892, "spotify-for-authors");
                }
                return null;
            case 2069170614:
                if (str.equals("KID_ACCOUNT_TRANSITION_PIN")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_PIN", "kid-account-transition/pin", 872, "kid-account-transition");
                }
                return null;
            case 2089849238:
                if (str.equals("HACKWEEK2023_SYNC_LIGHTS")) {
                    return m90662N1("HACKWEEK2023_SYNC_LIGHTS", "hackweek2023/sync-lights", 762, "hackweek2023");
                }
                return null;
            case 2104453702:
                if (str.equals("LOGIN_EMAILNOTLINKED")) {
                    return m90662N1("LOGIN_EMAILNOTLINKED", "login/emailnotlinked", 928, "login");
                }
                return null;
            case 2142380742:
                if (str.equals("SPOTIT_STRONGRESULT")) {
                    return m90662N1("SPOTIT_STRONGRESULT", "spotit/strongresult", 1901, "spotit");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: V */
    public static cbm0 m90716V() {
        return m90662N1("ARTIST", "artist", 154, "artist");
    }

    /* JADX INFO: renamed from: V0 */
    public static cbm0 m90717V0() {
        return m90662N1("CONCERTS", "concerts", 375, "concerts");
    }

    /* JADX INFO: renamed from: V1 */
    public static cbm0 m90718V1() {
        return m90662N1("GRADUATION_VIEW_REQUEST", "graduation/view-request", 757, "graduation");
    }

    /* JADX INFO: renamed from: V2 */
    public static cbm0 m90719V2() {
        return m90662N1("MARQUEE", "marquee", 982, "marquee");
    }

    /* JADX INFO: renamed from: V3 */
    public static cbm0 m90720V3() {
        return m90662N1("PLAYLISTS_EDIT_PROFILE_VISIBILITY", "playlists/edit-profile-visibility", 1423, "playlists");
    }

    /* JADX INFO: renamed from: V4 */
    public static cbm0 m90721V4() {
        return m90662N1("REINVENTFREE_WEAR_DOWNLOAD_UPSELL", "reinventfree-wear-download-upsell", 1593, "reinventfree-wear-download-upsell");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: V5 */
    public static cbm0 m90722V5(String str) {
        switch (str.hashCode()) {
            case -2097816057:
                if (str.equals("S4P_PODCAST_EPISODE_PREVIEW_PLAYER")) {
                    return m90662N1("S4P_PODCAST_EPISODE_PREVIEW_PLAYER", "s4p/podcast/episode/preview-player", 1680, "s4p");
                }
                return null;
            case -2072591433:
                if (str.equals("SETTINGS_UPDATE_EMAIL_ADDRESS")) {
                    return m90662N1("SETTINGS_UPDATE_EMAIL_ADDRESS", "settings/update-email-address", 1790, "settings");
                }
                return null;
            case -2054204249:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_ENTRY")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_ENTRY", "spotify-for-authors/dvn-creation/entry", 1879, "spotify-for-authors");
                }
                return null;
            case -2038485657:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_VOICE")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_VOICE", "spotify-for-authors/dvn-creation/voice", 1884, "spotify-for-authors");
                }
                return null;
            case -2021370281:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_CREATE")) {
                    return m90662N1("MRKT_ARTIST_PRE_RELEASE_CREATE", "mrkt/artist/pre-release/create", 1067, "mrkt");
                }
                return null;
            case -2003769305:
                if (str.equals("MRKT_ARTIST_PRE_RELEASE_DETAILS")) {
                    return m90662N1("MRKT_ARTIST_PRE_RELEASE_DETAILS", "mrkt/artist/pre-release/details", 1068, "mrkt");
                }
                return null;
            case -1995688473:
                if (str.equals("DIALOG_LOCALFILESIMPORT_DISCARD")) {
                    return m90662N1("DIALOG_LOCALFILESIMPORT_DISCARD", "dialog/localfilesimport/discard", 469, "dialog");
                }
                return null;
            case -1976883801:
                if (str.equals("S4P_ANALYTICS_MILESTONE")) {
                    return m90662N1("S4P_ANALYTICS_MILESTONE", "s4p/analytics/milestone", 1612, "s4p");
                }
                return null;
            case -1965419145:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VIDEOSETTINGS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS_VIDEOSETTINGS", "www-account-pages/parental-settings/videosettings", 2150, "www-account-pages");
                }
                return null;
            case -1963807113:
                if (str.equals("CARS_LOCKSCREEN")) {
                    return m90662N1("CARS_LOCKSCREEN", "cars/lockscreen", 275, "cars");
                }
                return null;
            case -1932835401:
                if (str.equals("MANAGE_SUBSCRIPTION")) {
                    return m90662N1("MANAGE_SUBSCRIPTION", "manage-subscription", 960, "manage-subscription");
                }
                return null;
            case -1902864825:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_REVIEW")) {
                    return m90662N1("MRKT_DM_MANAGED_SERVICE_REVIEW", "mrkt/dm-managed-service/review", 1191, "mrkt");
                }
                return null;
            case -1847592137:
                if (str.equals("PUFFIN_INTRO")) {
                    return m90662N1("PUFFIN_INTRO", "puffin/intro", 1541, "puffin");
                }
                return null;
            case -1843968521:
                if (str.equals("MULTI_USER_PLAN_VERIFICATION_ONBOARDING")) {
                    return m90754a3();
                }
                return null;
            case -1833275001:
                if (str.equals("WEAR_ENTITY_PAGE_EPISODE_PAGE")) {
                    return m90662N1("WEAR_ENTITY_PAGE_EPISODE_PAGE", "wear/entity-page/episode_page", 2063, "wear");
                }
                return null;
            case -1772783369:
                if (str.equals("LEARNINGHUB")) {
                    return m90662N1("LEARNINGHUB", "learninghub", 880, "learninghub");
                }
                return null;
            case -1732570681:
                if (str.equals("SEARCH_GENRES")) {
                    return m90662N1("SEARCH_GENRES", "search/genres", 1731, "search");
                }
                return null;
            case -1725436857:
                if (str.equals("ONETAPBROWSE")) {
                    return m90662N1("ONETAPBROWSE", "onetapbrowse", 1331, "onetapbrowse");
                }
                return null;
            case -1720716121:
                if (str.equals("RADIO_DAILY_MIX_SURVEY")) {
                    return m90662N1("RADIO_DAILY_MIX_SURVEY", "radio/daily-mix-survey", 1557, "radio");
                }
                return null;
            case -1698330665:
                if (str.equals("SONG_DNA_ARTIST_ROLES")) {
                    return m90662N1("SONG_DNA_ARTIST_ROLES", "song-dna-artist-roles", 1858, "song-dna-artist-roles");
                }
                return null;
            case -1695310457:
                if (str.equals("DIALOG_LOCALFILESIMPORT_SONGS")) {
                    return m90662N1("DIALOG_LOCALFILESIMPORT_SONGS", "dialog/localfilesimport/songs", 471, "dialog");
                }
                return null;
            case -1677496137:
                if (str.equals("PLAYLIST_ONDEMAND")) {
                    return m90662N1("PLAYLIST_ONDEMAND", "playlist/ondemand", 1416, "playlist");
                }
                return null;
            case -1668655081:
                if (str.equals("STS_EDIT")) {
                    return m90662N1("STS_EDIT", "sts/edit", 1918, "sts");
                }
                return null;
            case -1643428361:
                if (str.equals("MRKT_FRONTDOOR_FAN_STUDY_GLOBAL_TRENDS")) {
                    return m90662N1("MRKT_FRONTDOOR_FAN_STUDY_GLOBAL_TRENDS", "mrkt/frontdoor/fan-study/global-trends", 1207, "mrkt");
                }
                return null;
            case -1612299561:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_DRAFT")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_DRAFT", "mrkt/artist/campaigns/marquee-and-showcase/draft", 1031, "mrkt");
                }
                return null;
            case -1561466169:
                if (str.equals("COLLECTION_PODCASTS_EPISODES")) {
                    return m90662N1("COLLECTION_PODCASTS_EPISODES", "collection/podcasts/episodes", 347, "collection");
                }
                return null;
            case -1560022841:
                if (str.equals("JAM_INVITESLEARNMORESHEET")) {
                    return m90662N1("JAM_INVITESLEARNMORESHEET", "jam/inviteslearnmoresheet", 837, "jam");
                }
                return null;
            case -1523622793:
                if (str.equals("MARTINI_CONTENT_STORY_SOURCES")) {
                    return m90662N1("MARTINI_CONTENT_STORY_SOURCES", "martini/content-story-sources", 984, "martini");
                }
                return null;
            case -1505690201:
                if (str.equals("AUDIOBOOK_DIRECTSALES_SUCCESS")) {
                    return m90662N1("AUDIOBOOK_DIRECTSALES_SUCCESS", "audiobook/directsales/success", 197, "audiobook");
                }
                return null;
            case -1497930985:
                if (str.equals("AUDIOBOOK_SERIES")) {
                    return m90662N1("AUDIOBOOK_SERIES", "audiobook-series", 191, "audiobook-series");
                }
                return null;
            case -1490299481:
                if (str.equals("FREE_TIER_HOME_DRILLDOWN")) {
                    return m90662N1("FREE_TIER_HOME_DRILLDOWN", "free-tier-home/drilldown", 554, "free-tier-home");
                }
                return null;
            case -1453766505:
                if (str.equals("AGE_ASSURANCE_CALLBACK")) {
                    return m90662N1("AGE_ASSURANCE_CALLBACK", "age-assurance/callback", 120, "age-assurance");
                }
                return null;
            case -1436693129:
                if (str.equals("CREATORFOLLOW_SLATE")) {
                    return m90662N1("CREATORFOLLOW_SLATE", "creatorfollow/slate", 450, "creatorfollow");
                }
                return null;
            case -1415442729:
                if (str.equals("MRKT_BULK_CAMPAIGNS_FORECAST_ERRORS")) {
                    return m90662N1("MRKT_BULK_CAMPAIGNS_FORECAST_ERRORS", "mrkt/bulk-campaigns/forecast/errors", 1145, "mrkt");
                }
                return null;
            case -1354436457:
                if (str.equals("BROWSE_NEWRELEASES")) {
                    return m90662N1("BROWSE_NEWRELEASES", "browse/newreleases", 247, "browse");
                }
                return null;
            case -1315860633:
                if (str.equals("SPOTIT_WEAKRESULT")) {
                    return m90662N1("SPOTIT_WEAKRESULT", "spotit/weakresult", 1902, "spotit");
                }
                return null;
            case -1300516329:
                if (str.equals("MRKT_CANVAS_UPLOAD")) {
                    return m90662N1("MRKT_CANVAS_UPLOAD", "mrkt/canvas/upload", 1154, "mrkt");
                }
                return null;
            case -1282089977:
                if (str.equals("PODCAST_SHOW_MEMBERSHIPSUCCESSMODAL")) {
                    return m90662N1("PODCAST_SHOW_MEMBERSHIPSUCCESSMODAL", "podcast/show/membershipsuccessmodal", 1445, "podcast");
                }
                return null;
            case -1273463849:
                if (str.equals("MRKT_TEAM_MANAGEMENT_DETAILS")) {
                    return m90662N1("MRKT_TEAM_MANAGEMENT_DETAILS", "mrkt/team-management/details", 1263, "mrkt");
                }
                return null;
            case -1272281561:
                if (str.equals("SHOWS_CATEGORY")) {
                    return m90662N1("SHOWS_CATEGORY", "shows/category", 1812, "shows");
                }
                return null;
            case -1246781737:
                if (str.equals("PERMISSIONS_BLUETOOTH_REQUEST_FULLSCREEN")) {
                    return m90662N1("PERMISSIONS_BLUETOOTH_REQUEST_FULLSCREEN", "permissions/bluetooth/request/fullscreen", 1378, "permissions");
                }
                return null;
            case -1159924153:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_TEAM")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_TEAM", "mrkt/artist/campaigns/marquee-and-showcase/team", 1034, "mrkt");
                }
                return null;
            case -1138014921:
                if (str.equals("GOLDENPATH_AMEET")) {
                    return m90662N1("GOLDENPATH_AMEET", "goldenpath/ameet", ContentDeliverySubscriptionType.TRADITIONAL_MVPD, "goldenpath");
                }
                return null;
            case -1129643449:
                if (str.equals("GOLDENPATH_JOELD")) {
                    return m90662N1("GOLDENPATH_JOELD", "goldenpath/joeld", 653, "goldenpath");
                }
                return null;
            case -1044605721:
                if (str.equals("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS")) {
                    return m90662N1("MRKT_DEBUG_HUBS_COMPONENT_REFERENCE_BUTTONS", "mrkt/debug/hubs/component-reference/buttons", 1160, "mrkt");
                }
                return null;
            case -1036912585:
                if (str.equals("PHONENUMBER_CALLINGCODEPICKER")) {
                    return m90662N1("PHONENUMBER_CALLINGCODEPICKER", "phonenumber/callingcodepicker", 1383, "phonenumber");
                }
                return null;
            case -1029379977:
                if (str.equals("MRKT_FRONTDOOR_MERCH_LIVE_AND_MORE")) {
                    return m90662N1("MRKT_FRONTDOOR_MERCH_LIVE_AND_MORE", "mrkt/frontdoor/merch-live-and-more", 1218, "mrkt");
                }
                return null;
            case -952691673:
                if (str.equals("ADSTUDIO_BUSINESS_PARTNERS_DETAILS")) {
                    return m90662N1("ADSTUDIO_BUSINESS_PARTNERS_DETAILS", "adstudio/business/partners/details", 57, "adstudio");
                }
                return null;
            case -869673225:
                if (str.equals("AUDIOBOOK_CONSUMPTIONCAP")) {
                    return m90772d0();
                }
                return null;
            case -802288985:
                if (str.equals("WATCHAPP_DEBUG_INFO")) {
                    return m90662N1("WATCHAPP_DEBUG_INFO", "watchapp/debug-info", 2023, "watchapp");
                }
                return null;
            case -770721209:
                if (str.equals("SUPPORT_SITE_HOME")) {
                    return m90662N1("SUPPORT_SITE_HOME", "support-site/home", 1953, "support-site");
                }
                return null;
            case -712562809:
                if (str.equals("MRKT_ARTIST_CAMPAIGN_ADMIN")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGN_ADMIN", "mrkt/artist/campaign-admin", 1017, "mrkt");
                }
                return null;
            case -664925321:
                if (str.equals("FREETIER_DATASAVER_STATUS")) {
                    return m90662N1("FREETIER_DATASAVER_STATUS", "freetier/datasaver/status", 566, "freetier");
                }
                return null;
            case -647123545:
                if (str.equals("MRKT_ARTIST_PROFILE_CATALOG_ALBUMS")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_CATALOG_ALBUMS", "mrkt/artist/profile/catalog/albums", 1081, "mrkt");
                }
                return null;
            case -598698873:
                if (str.equals("SEARCH_SONGS")) {
                    return m90662N1("SEARCH_SONGS", "search/songs", 1743, "search");
                }
                return null;
            case -559423097:
                if (str.equals("MRKT_ARTIST_PROFILE_FUNDRAISING")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_FUNDRAISING", "mrkt/artist/profile/fundraising", 1087, "mrkt");
                }
                return null;
            case -556995385:
                if (str.equals("GOLDENPATH_NAZLIZ")) {
                    return m90662N1("GOLDENPATH_NAZLIZ", "goldenpath/nazliz", ContentDeliveryComposition.EMBED, "goldenpath");
                }
                return null;
            case -555720265:
                if (str.equals("PROFILE_FOLLOW_SUGGESTIONS")) {
                    return m90662N1("PROFILE_FOLLOW_SUGGESTIONS", "profile/follow-suggestions", 1525, "profile");
                }
                return null;
            case -526892201:
                if (str.equals("MRKT_ARTIST_AUDIENCE_RELATED")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_RELATED", "mrkt/artist/audience/related", CollectionItemdata$ItemData.YL_FILTER_ITEM_DATA_FIELD_NUMBER, "mrkt");
                }
                return null;
            case -482848585:
                if (str.equals("SONG_DNA_FEEDBACK")) {
                    return m90662N1("SONG_DNA_FEEDBACK", "song-dna-feedback", 1860, "song-dna-feedback");
                }
                return null;
            case -475997081:
                if (str.equals("PODCAST_SHOW_SETTINGS_MARKASPLAYED")) {
                    return m90755a4();
                }
                return null;
            case -395112921:
                if (str.equals("PROFILE_BLOCKED_LIST")) {
                    return m90662N1("PROFILE_BLOCKED_LIST", "profile/blocked-list", 1520, "profile");
                }
                return null;
            case -351205529:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CARDVERIFICATION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_CARDVERIFICATION", "www-account-pages/genalpha/cardverification", 2122, "www-account-pages");
                }
                return null;
            case -330018457:
                if (str.equals("INVITE_HAVEINVITE")) {
                    return m90662N1("INVITE_HAVEINVITE", "invite/haveinvite", 824, "invite");
                }
                return null;
            case -309697801:
                if (str.equals("S4P_ONBOARDING_PUSH_NOTIFICATIONS")) {
                    return m90662N1("S4P_ONBOARDING_PUSH_NOTIFICATIONS", "s4p/onboarding/push-notifications", 1667, "s4p");
                }
                return null;
            case -303624681:
                if (str.equals("PLAYLIST_EDIT_METADATA")) {
                    return m90662N1("PLAYLIST_EDIT_METADATA", "playlist/edit-metadata", 1407, "playlist");
                }
                return null;
            case -297105353:
                if (str.equals("CONTEXTMENU_NOTINTERESTEDFOLLOWUP")) {
                    return m90662N1("CONTEXTMENU_NOTINTERESTEDFOLLOWUP", "contextmenu/notinterestedfollowup", 421, "contextmenu");
                }
                return null;
            case -267998441:
                if (str.equals("ADSTUDIO_AD_AD_SETS")) {
                    return m90662N1("ADSTUDIO_AD_AD_SETS", "adstudio/ad/ad-sets", 36, "adstudio");
                }
                return null;
            case -249343321:
                if (str.equals("VOTING_SHARE")) {
                    return m90764b6();
                }
                return null;
            case -220302249:
                if (str.equals("MRKT_LABS")) {
                    return m90662N1("MRKT_LABS", "mrkt/labs", 1236, "mrkt");
                }
                return null;
            case -219702425:
                if (str.equals("ADSTUDIO_AD_SET_REPORT")) {
                    return m90662N1("ADSTUDIO_AD_SET_REPORT", "adstudio/ad-set/report", 35, "adstudio");
                }
                return null;
            case -178090569:
                if (str.equals("CHALLENGE_EMAIL_SIGNUP")) {
                    return m90662N1("CHALLENGE_EMAIL_SIGNUP", "challenge/email/signup", 287, "challenge");
                }
                return null;
            case -160852217:
                if (str.equals("PLAYLIST_HISTORY")) {
                    return m90662N1("PLAYLIST_HISTORY", "playlist/history", 1411, "playlist");
                }
                return null;
            case -137995673:
                if (str.equals("DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE")) {
                    return m90662N1("DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE", "dialog/requestpermissions/showrationale", 475, "dialog");
                }
                return null;
            case -82893401:
                if (str.equals("LISTENINGSTATS_DETAILS")) {
                    return m90586C2();
                }
                return null;
            case -76529433:
                if (str.equals("HOMETHING_ACTIVATION_SCANDEVICES")) {
                    return m90662N1("HOMETHING_ACTIVATION_SCANDEVICES", "homething/activation/scandevices", ContentDeliveryAdvertisementCapability.DYNAMIC_REPLACEMENT, "homething");
                }
                return null;
            case 79712615:
                if (str.equals("TERMS")) {
                    return m90662N1("TERMS", "terms", 1967, "terms");
                }
                return null;
            case 118666903:
                if (str.equals("UNKNOWN_LEGACYHUB")) {
                    return m90662N1("UNKNOWN_LEGACYHUB", "unknown/legacyhub", 1993, "unknown");
                }
                return null;
            case 154192247:
                if (str.equals("SPOTIFY_FOR_AUTHORS_AUDIENCE_DEMOGRAPHICS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_AUDIENCE_DEMOGRAPHICS", "spotify-for-authors/audience/demographics", 1871, "spotify-for-authors");
                }
                return null;
            case 183517879:
                if (str.equals("SETTINGS_PLAYBACK")) {
                    return m90662N1("SETTINGS_PLAYBACK", "settings/playback", 1783, "settings");
                }
                return null;
            case 275855447:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_DROPZONE")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_DROPZONE", "mrkt/artist/video/music-videos/upload/dropzone", 1123, "mrkt");
                }
                return null;
            case 296335463:
                if (str.equals("BLEND_INVITATION")) {
                    return m90834m0();
                }
                return null;
            case 323086311:
                if (str.equals("SRC_RIGHTSHOLDER_MATCH_DETAILS")) {
                    return m90662N1("SRC_RIGHTSHOLDER_MATCH_DETAILS", "src/rightsholder/match/details", 1908, "src");
                }
                return null;
            case 352102903:
                if (str.equals("MRKT_FRONTDOOR_PLAYLISTING")) {
                    return m90662N1("MRKT_FRONTDOOR_PLAYLISTING", "mrkt/frontdoor/playlisting", 1221, "mrkt");
                }
                return null;
            case 399530551:
                if (str.equals("PREMIUM")) {
                    return m90662N1("PREMIUM", "premium", 1483, "premium");
                }
                return null;
            case 426265271:
                if (str.equals("MANAGED_ACCOUNT_LINKING_INVITE_PARENT")) {
                    return m90662N1("MANAGED_ACCOUNT_LINKING_INVITE_PARENT", "managed-account-linking/invite-parent", 975, "managed-account-linking");
                }
                return null;
            case 434384823:
                if (str.equals("WWW_ACCOUNT_PAGES_CHANGE_SUBSCRIPTION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_CHANGE_SUBSCRIPTION", "www-account-pages/change-subscription", 2114, "www-account-pages");
                }
                return null;
            case 448987447:
                if (str.equals("SPOTIFY_FOR_AUTHORS_DVN_CREATION_DETAILS")) {
                    return m90662N1("SPOTIFY_FOR_AUTHORS_DVN_CREATION_DETAILS", "spotify-for-authors/dvn-creation/details", 1878, "spotify-for-authors");
                }
                return null;
            case 462780951:
                if (str.equals("NOWPLAYING_VIDEOSETTINGS")) {
                    return m90831l3();
                }
                return null;
            case 526971543:
                if (str.equals("ASSISTED_CURATION_SEARCH_ALBUM_ENTITY")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_ALBUM_ENTITY", "assisted-curation/search/album-entity", 180, "assisted-curation");
                }
                return null;
            case 577539079:
                if (str.equals("SCANNABLES_SCANNER")) {
                    return m90742Y4();
                }
                return null;
            case 594254535:
                if (str.equals("OURSONG_INVITE")) {
                    return m90662N1("OURSONG_INVITE", "oursong/invite", 1335, "oursong");
                }
                return null;
            case 638296567:
                if (str.equals("CHURNLOCK")) {
                    return m90654M0();
                }
                return null;
            case 645142087:
                if (str.equals("SETTINGS_LOCAL_FILES")) {
                    return m90662N1("SETTINGS_LOCAL_FILES", "settings/local-files", 1771, "settings");
                }
                return null;
            case 676359767:
                if (str.equals("WEAR_CAPPING_RECOVERY_DIALOG")) {
                    return m90662N1("WEAR_CAPPING_RECOVERY_DIALOG", "wear/capping_recovery_dialog", 2057, "wear");
                }
                return null;
            case 681757319:
                if (str.equals("EXPERIMENTAL_COUNTRYTOPTEN")) {
                    return m90662N1("EXPERIMENTAL_COUNTRYTOPTEN", "experimental/countrytopten", 516, "experimental");
                }
                return null;
            case 739981911:
                if (str.equals("WEAR_LOGIN_ACCOUNT")) {
                    return m90662N1("WEAR_LOGIN_ACCOUNT", "wear/login_account", 2071, "wear");
                }
                return null;
            case 767442247:
                if (str.equals("AGE_ASSURANCE_WEBVIEW")) {
                    return m90662N1("AGE_ASSURANCE_WEBVIEW", "age-assurance/webview", 128, "age-assurance");
                }
                return null;
            case 768507655:
                if (str.equals("PUFFIN_AUTODETECT")) {
                    return m90662N1("PUFFIN_AUTODETECT", "puffin/autodetect", 1539, "puffin");
                }
                return null;
            case 780440919:
                if (str.equals("HOME_MUSIC_FOLLOWING")) {
                    return m90746Z1();
                }
                return null;
            case 831055159:
                if (str.equals("WEAR_BLUETOOTH_PAIRING")) {
                    return m90662N1("WEAR_BLUETOOTH_PAIRING", "wear/bluetooth_pairing", 2056, "wear");
                }
                return null;
            case 917026247:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_DM_REPORT")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_DM_REPORT", "mrkt/artist/campaigns/dm/report", 1023, "mrkt");
                }
                return null;
            case 942663111:
                if (str.equals("SPEED_CONTROL_EDITOR")) {
                    return m90662N1("SPEED_CONTROL_EDITOR", "speed-control/editor", 1866, "speed-control");
                }
                return null;
            case 943041879:
                if (str.equals("COURSE_HOME_ONBOARDING")) {
                    return m90662N1("COURSE_HOME_ONBOARDING", "course/home/onboarding", 443, "course");
                }
                return null;
            case 949205431:
                if (str.equals("GOLDENPATH_OGALLON")) {
                    return m90662N1("GOLDENPATH_OGALLON", "goldenpath/ogallon", 708, "goldenpath");
                }
                return null;
            case 961931639:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_RESETPASSWORD")) {
                    return m90662N1("LOGIN_ACCOUNTRECOVERY_RESETPASSWORD", "login/accountrecovery/resetpassword", 916, "login");
                }
                return null;
            case 1052116999:
                if (str.equals("FANDOM_TOPARTISTS")) {
                    return m90662N1("FANDOM_TOPARTISTS", "fandom/topartists", 532, "fandom");
                }
                return null;
            case 1054574999:
                if (str.equals("IMAGEGALLERY")) {
                    return m90816j2();
                }
                return null;
            case 1059797207:
                if (str.equals("ADAPTIVEAUTHENTICATION_ERROR")) {
                    return m90597E();
                }
                return null;
            case 1109802327:
                if (str.equals("MRKT_DEBUG_KAIZEN_COMPONENT_REFERENCE")) {
                    return m90662N1("MRKT_DEBUG_KAIZEN_COMPONENT_REFERENCE", "mrkt/debug/kaizen/component-reference", 1171, "mrkt");
                }
                return null;
            case 1147912183:
                if (str.equals("GRADUATION_EDUCATION")) {
                    return m90683Q1();
                }
                return null;
            case 1152841751:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD", "adstudio/duplicate-ad-set-only/ad", 82, "adstudio");
                }
                return null;
            case 1182599159:
                if (str.equals("PLAYLIST_SORTING")) {
                    return m90662N1("PLAYLIST_SORTING", "playlist/sorting", 1421, "playlist");
                }
                return null;
            case 1187955959:
                if (str.equals("WWW_ACCOUNT_PAGES_PRODUCT_CONSIDERATION")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PRODUCT_CONSIDERATION", "www-account-pages/product-consideration", 2157, "www-account-pages");
                }
                return null;
            case 1313756055:
                if (str.equals("SUPERBOARDING")) {
                    return m90662N1("SUPERBOARDING", "superboarding", 1948, "superboarding");
                }
                return null;
            case 1339484567:
                if (str.equals("CAR_MODE_YOURLIBRARY")) {
                    return m90662N1("CAR_MODE_YOURLIBRARY", "car-mode/yourLibrary", 268, "car-mode");
                }
                return null;
            case 1371997159:
                if (str.equals("READALONG_SHARE")) {
                    return m90662N1("READALONG_SHARE", "readalong/share", 1574, "readalong");
                }
                return null;
            case 1387818039:
                if (str.equals("KID_ACCOUNT_TRANSITION_SUBMIT")) {
                    return m90903w2();
                }
                return null;
            case 1395057047:
                if (str.equals("ASSISTED_CURATION_SEARCH_ARTIST_ENTITY")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_ARTIST_ENTITY", "assisted-curation/search/artist-entity", 182, "assisted-curation");
                }
                return null;
            case 1404599175:
                if (str.equals("SPOTIFYBUTTON_ACTIVATION_SETUP")) {
                    return m90662N1("SPOTIFYBUTTON_ACTIVATION_SETUP", "spotifybutton/activation/setup", 1897, "spotifybutton");
                }
                return null;
            case 1421763943:
                if (str.equals("S4P_QNA_RESPONSES")) {
                    return m90662N1("S4P_QNA_RESPONSES", "s4p/qna-responses", 1684, "s4p");
                }
                return null;
            case 1493182343:
                if (str.equals("MANAGED_ACCOUNT_LINKING_SHARE_INVITE_LINK")) {
                    return m90662N1("MANAGED_ACCOUNT_LINKING_SHARE_INVITE_LINK", "managed-account-linking/share-invite-link", 978, "managed-account-linking");
                }
                return null;
            case 1521400583:
                if (str.equals("YOURSPOTIFY")) {
                    return m90662N1("YOURSPOTIFY", "yourspotify", 2191, "yourspotify");
                }
                return null;
            case 1524040151:
                if (str.equals("ADSTUDIO_SIGN_UP")) {
                    return m90662N1("ADSTUDIO_SIGN_UP", "adstudio/sign-up", 115, "adstudio");
                }
                return null;
            case 1644604967:
                if (str.equals("GOLDENPATH_KEIWANM")) {
                    return m90662N1("GOLDENPATH_KEIWANM", "goldenpath/keiwanm", 665, "goldenpath");
                }
                return null;
            case 1653330647:
                if (str.equals("SHOWS_FORMAT_NOWPLAYING")) {
                    return m90662N1("SHOWS_FORMAT_NOWPLAYING", "shows/format/nowplaying", 1815, "shows");
                }
                return null;
            case 1674768999:
                if (str.equals("READALONG")) {
                    return m90662N1("READALONG", "readalong", 1571, "readalong");
                }
                return null;
            case 1711000407:
                if (str.equals("S4P_PODCAST_EPISODE_ANALYTICS")) {
                    return m90662N1("S4P_PODCAST_EPISODE_ANALYTICS", "s4p/podcast/episode/analytics", 1674, "s4p");
                }
                return null;
            case 1725103879:
                if (str.equals("CHALLENGE_MFA_SWITCH")) {
                    return m90662N1("CHALLENGE_MFA_SWITCH", "challenge/mfa-switch", 290, "challenge");
                }
                return null;
            case 1730259543:
                if (str.equals("ADSTUDIO_SBL")) {
                    return m90662N1("ADSTUDIO_SBL", "adstudio/sbl", 109, "adstudio");
                }
                return null;
            case 1744148295:
                if (str.equals("WWW_ACCOUNT_PAGES_LOGIN_METHODS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_LOGIN_METHODS", "www-account-pages/login-methods", 2132, "www-account-pages");
                }
                return null;
            case 1774504983:
                if (str.equals("COLLECTION_EPISODES_REMOVEALL")) {
                    return m90662N1("COLLECTION_EPISODES_REMOVEALL", "collection/episodes/removeall", 341, "collection");
                }
                return null;
            case 1784494919:
                if (str.equals("IRONCHEF_PREVIEWSONGS")) {
                    return m90662N1("IRONCHEF_PREVIEWSONGS", "ironchef/previewsongs", 830, "ironchef");
                }
                return null;
            case 1834177287:
                if (str.equals("S4P_ANALYTICS_MILESTONE_PLAYS")) {
                    return m90662N1("S4P_ANALYTICS_MILESTONE_PLAYS", "s4p/analytics/milestone/plays", 1614, "s4p");
                }
                return null;
            case 1921895335:
                if (str.equals("SUPPORT_SITE_SEARCH_RESULTS")) {
                    return m90662N1("SUPPORT_SITE_SEARCH_RESULTS", "support-site/search-results", 1960, "support-site");
                }
                return null;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    return m90716V();
                }
                return null;
            case 2033577543:
                if (str.equals("PARENTAL_CONTROL_UPDATE_BIRTHDAY")) {
                    return m90925z3();
                }
                return null;
            case 2034970407:
                if (str.equals("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_SUCCESS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_MUSIC_VIDEOS_UPLOAD_SUCCESS", "mrkt/artist/video/music-videos/upload/success", 1126, "mrkt");
                }
                return null;
            case 2036137495:
                if (str.equals("LISTENINGACTIVITY_AUDIENCESETTING")) {
                    return m90917y2();
                }
                return null;
            case 2043907527:
                if (str.equals("CHECKOUT_CHOICESCREEN_UC")) {
                    return m90662N1("CHECKOUT_CHOICESCREEN_UC", "checkout/choicescreen-uc", 325, "checkout");
                }
                return null;
            case 2048506263:
                if (str.equals("PODCASTINTERACTIVITY_POLL")) {
                    return m90662N1("PODCASTINTERACTIVITY_POLL", "podcastinteractivity/poll", 1460, "podcastinteractivity");
                }
                return null;
            case 2130135351:
                if (str.equals("GOLDENPATH_JENNALEE")) {
                    return m90662N1("GOLDENPATH_JENNALEE", "goldenpath/jennalee", 649, "goldenpath");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: W */
    public static cbm0 m90723W() {
        return m90662N1("ARTIST_ABOUT", "artist/about", 155, "artist");
    }

    /* JADX INFO: renamed from: W0 */
    public static cbm0 m90724W0() {
        return m90662N1("CONCERTS_ARTIST", "concerts/artist", 376, "concerts");
    }

    /* JADX INFO: renamed from: W1 */
    public static cbm0 m90725W1() {
        return m90662N1("HOME", "home", 775, "home");
    }

    /* JADX INFO: renamed from: W2 */
    public static cbm0 m90726W2() {
        return m90662N1("MARTINI_CHAT", "martini/chat", 983, "martini");
    }

    /* JADX INFO: renamed from: W3 */
    public static cbm0 m90727W3() {
        return m90662N1("PODCAST_EPISODE", "podcast/episode", 1428, "podcast");
    }

    /* JADX INFO: renamed from: W4 */
    public static cbm0 m90728W4() {
        return m90662N1("REMOTEDOWNLOADS_ONBOARDING", "remotedownloads/onboarding", 1595, "remotedownloads");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: W5 */
    public static cbm0 m90729W5(String str) {
        switch (str.hashCode()) {
            case -2119734712:
                if (str.equals("S4P_DEBUG_PERMISSIONS")) {
                    return m90662N1("S4P_DEBUG_PERMISSIONS", "s4p/debug/permissions", 1647, "s4p");
                }
                return null;
            case -2103385192:
                if (str.equals("WEAR_ADD_TO_PLAYLIST")) {
                    return m90662N1("WEAR_ADD_TO_PLAYLIST", "wear/add_to_playlist", 2053, "wear");
                }
                return null;
            case -2062950984:
                if (str.equals("WATCHAPP_NOW_PLAYING")) {
                    return m90662N1("WATCHAPP_NOW_PLAYING", "watchapp/now-playing", 2035, "watchapp");
                }
                return null;
            case -1973070696:
                if (str.equals("NOWPLAYING")) {
                    return m90796g3();
                }
                return null;
            case -1925238360:
                if (str.equals("ASSISTED_CURATION_SEARCH_ALBUMS")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_ALBUMS", "assisted-curation/search/albums", 181, "assisted-curation");
                }
                return null;
            case -1878908312:
                if (str.equals("WEAR_SEARCH")) {
                    return m90662N1("WEAR_SEARCH", "wear/search", 2075, "wear");
                }
                return null;
            case -1876269224:
                if (str.equals("FRIENDSACTIVITY_FRIENDSLIST")) {
                    return m90662N1("FRIENDSACTIVITY_FRIENDSLIST", "friendsactivity/friendslist", 576, "friendsactivity");
                }
                return null;
            case -1853007448:
                if (str.equals("SEARCH")) {
                    return m90749Z4();
                }
                return null;
            case -1849137896:
                if (str.equals("SIGNUP")) {
                    return m90662N1("SIGNUP", "signup", 1823, "signup");
                }
                return null;
            case -1847251128:
                if (str.equals("PROFILE_TOP_TRACKS")) {
                    return m90662N1("PROFILE_TOP_TRACKS", "profile/top-tracks", 1536, "profile");
                }
                return null;
            case -1846648200:
                if (str.equals("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT")) {
                    return m90662N1("PARENTAL_CONTROL_MANAGE_BLOCKED_CONTENT", "parental-control/manage-blocked-content", 1360, "parental-control");
                }
                return null;
            case -1821542984:
                if (str.equals("PLAYLIST_EDIT_ITEMS")) {
                    return m90662N1("PLAYLIST_EDIT_ITEMS", "playlist/edit-items", 1406, "playlist");
                }
                return null;
            case -1729017784:
                if (str.equals("WATCHAPP_APPLICATION_LOG")) {
                    return m90662N1("WATCHAPP_APPLICATION_LOG", "watchapp/application-log", 2019, "watchapp");
                }
                return null;
            case -1608152472:
                if (str.equals("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT_SEARCH")) {
                    return m90662N1("PARENTAL_CONTROL_MANAGE_APPROVED_CONTENT_SEARCH", "parental-control/manage-approved-content/search", 1359, "parental-control");
                }
                return null;
            case -1503149448:
                if (str.equals("PODCAST_NEW_EPISODE_NOTIFICATIONS_SETTINGS")) {
                    return m90734X3();
                }
                return null;
            case -1442048616:
                if (str.equals("SETTINGS_CAR")) {
                    return m90662N1("SETTINGS_CAR", "settings/car", 1753, "settings");
                }
                return null;
            case -1416170472:
                if (str.equals("LISTENINGACTIVITY_SETTINGS")) {
                    return m90662N1("LISTENINGACTIVITY_SETTINGS", "listeningactivity/settings", 891, "listeningactivity");
                }
                return null;
            case -1415849208:
                if (str.equals("PROFILE_IMAGE_PICKER")) {
                    return m90905w4();
                }
                return null;
            case -1397440040:
                if (str.equals("JAM_JOINJAMLISTENINGACTIVITYSHEET")) {
                    return m90662N1("JAM_JOINJAMLISTENINGACTIVITYSHEET", "jam/joinjamlisteningactivitysheet", 840, "jam");
                }
                return null;
            case -1337051752:
                if (str.equals("SRC_RIGHTSHOLDER_CATALOG")) {
                    return m90662N1("SRC_RIGHTSHOLDER_CATALOG", "src/rightsholder/catalog", 1905, "src");
                }
                return null;
            case -1138326824:
                if (str.equals("GOLDENPATH_ABUSH")) {
                    return m90662N1("GOLDENPATH_ABUSH", "goldenpath/abush", 594, "goldenpath");
                }
                return null;
            case -1134344040:
                if (str.equals("GOLDENPATH_ELLAE")) {
                    return m90662N1("GOLDENPATH_ELLAE", "goldenpath/ellae", 623, "goldenpath");
                }
                return null;
            case -1134316792:
                if (str.equals("GOLDENPATH_EMILD")) {
                    return m90662N1("GOLDENPATH_EMILD", "goldenpath/emild", 624, "goldenpath");
                }
                return null;
            case -1121701320:
                if (str.equals("PUFFIN_MANAGEMENT")) {
                    return m90662N1("PUFFIN_MANAGEMENT", "puffin/management", 1542, "puffin");
                }
                return null;
            case -1094681832:
                if (str.equals("FAST_TRACK_PAGE_1")) {
                    return m90627I1();
                }
                return null;
            case -1091488632:
                if (str.equals("FORMATLISTPLATFORM")) {
                    return m90662N1("FORMATLISTPLATFORM", "formatlistplatform", 545, "formatlistplatform");
                }
                return null;
            case -1072008696:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_PREVIEW")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_PREVIEW", "mrkt/artist/video/other-videos/manage-associations/preview", 1132, "mrkt");
                }
                return null;
            case -1042897656:
                if (str.equals("ADSTUDIO_BUSINESS_PEOPLE_DETAIL")) {
                    return m90662N1("ADSTUDIO_BUSINESS_PEOPLE_DETAIL", "adstudio/business/people/detail", 59, "adstudio");
                }
                return null;
            case -1042103064:
                if (str.equals("PODCAST_CREATOR_SHOWS")) {
                    return m90662N1("PODCAST_CREATOR_SHOWS", "podcast/creator/shows", 1427, "podcast");
                }
                return null;
            case -1039606088:
                if (str.equals("S4P_EPISODES_SELECT_QNA")) {
                    return m90662N1("S4P_EPISODES_SELECT_QNA", "s4p/episodes/select/qna", 1654, "s4p");
                }
                return null;
            case -981241352:
                if (str.equals("S4P_WRAPPED_PRIMARY")) {
                    return m90662N1("S4P_WRAPPED_PRIMARY", "s4p/wrapped-primary", 1718, "s4p");
                }
                return null;
            case -936669336:
                if (str.equals("VOICE_ONBOARDING")) {
                    return m90662N1("VOICE_ONBOARDING", "voice/onboarding", 2010, "voice");
                }
                return null;
            case -879084808:
                if (str.equals("AUDIOBOOK_HYDE_GATE")) {
                    return m90662N1("AUDIOBOOK_HYDE_GATE", "audiobook/hyde/gate", ContentType.BUMPER, "audiobook");
                }
                return null;
            case -841145080:
                if (str.equals("SIDEDRAWER")) {
                    return m90662N1("SIDEDRAWER", "sidedrawer", 1822, "sidedrawer");
                }
                return null;
            case -806094600:
                if (str.equals("EMAIL_EDIT_RESETPASSWORD")) {
                    return m90662N1("EMAIL_EDIT_RESETPASSWORD", "email/edit/resetpassword", 492, "email");
                }
                return null;
            case -800553144:
                if (str.equals("S4P_CLAIM_PODCAST_PODCAST_SEARCH_RESULTS")) {
                    return m90662N1("S4P_CLAIM_PODCAST_PODCAST_SEARCH_RESULTS", "s4p/claim-podcast/podcast-search-results", 1630, "s4p");
                }
                return null;
            case -698696792:
                if (str.equals("KID_ACCOUNT_CREATION_PARENTAL_CONTROL")) {
                    return m90662N1("KID_ACCOUNT_CREATION_PARENTAL_CONTROL", "kid-account-creation/parental-control", 857, "kid-account-creation");
                }
                return null;
            case -660437400:
                if (str.equals("SHARE_SHEET_ERROR")) {
                    return m90662N1("SHARE_SHEET_ERROR", "share-sheet/error", 1799, "share-sheet");
                }
                return null;
            case -608634616:
                if (str.equals("YOURLIBRARY")) {
                    return m90662N1("YOURLIBRARY", "yourlibrary", 2174, "yourlibrary");
                }
                return null;
            case -606313640:
                if (str.equals("ARTIST_SAVED_TRACKS")) {
                    return m90662N1("ARTIST_SAVED_TRACKS", "artist/saved-tracks", 172, "artist");
                }
                return null;
            case -561304744:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_NEMO_CONSIDERATION")) {
                    return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_NEMO_CONSIDERATION", "premium-account-management/nemo-consideration", 1491, "premium-account-management");
                }
                return null;
            case -515011768:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_SEARCH")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_MANAGE_ASSOCIATIONS_SEARCH", "mrkt/artist/video/other-videos/manage-associations/search", 1133, "mrkt");
                }
                return null;
            case -455178168:
                if (str.equals("HOME_PODCASTS_VIDEOS")) {
                    return m90774d2();
                }
                return null;
            case -438967048:
                if (str.equals("EPISODECHAPTERS_CONTENTS")) {
                    return m90662N1("EPISODECHAPTERS_CONTENTS", "episodechapters/contents", 508, "episodechapters");
                }
                return null;
            case -430914456:
                if (str.equals("GRADUATION_APPROVED")) {
                    return m90676P1();
                }
                return null;
            case -366196024:
                if (str.equals("PLAN_MEMBER_INVITATION")) {
                    return m90608F3();
                }
                return null;
            case -338802744:
                if (str.equals("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS")) {
                    return m90662N1("WEAR_SETTINGS_AUDIO_QUALITY_SETTINGS", "wear/settings/audio_quality_settings", 2082, "wear");
                }
                return null;
            case -242285880:
                if (str.equals("GOLDENPATH_YASIRK")) {
                    return m90662N1("GOLDENPATH_YASIRK", "goldenpath/yasirk", 742, "goldenpath");
                }
                return null;
            case -134547752:
                if (str.equals("S4P_SETTINGS_PODCAST")) {
                    return m90662N1("S4P_SETTINGS_PODCAST", "s4p/settings/podcast", 1690, "s4p");
                }
                return null;
            case -110445528:
                if (str.equals("WWW_ACCOUNT_PAGES_RESUBSCRIPTIONMODAL")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_RESUBSCRIPTIONMODAL", "www-account-pages/resubscriptionmodal", 2160, "www-account-pages");
                }
                return null;
            case -86170408:
                if (str.equals("S4P_COMMENT_REPLIES")) {
                    return m90662N1("S4P_COMMENT_REPLIES", "s4p/comment-replies", 1634, "s4p");
                }
                return null;
            case -49929496:
                if (str.equals("ACCOUNTSWITCHING_ADDACCOUNTTYPESELECTION")) {
                    return m90583C();
                }
                return null;
            case -49548616:
                if (str.equals("CALIFORNIA")) {
                    return m90662N1("CALIFORNIA", "california", 259, "california");
                }
                return null;
            case -33300424:
                if (str.equals("PODCASTCHARTS_CHART")) {
                    return m90783e4();
                }
                return null;
            case -24347800:
                if (str.equals("SIGNUP_OTT")) {
                    return m90662N1("SIGNUP_OTT", "signup/ott", 1832, "signup");
                }
                return null;
            case 2067288:
                if (str.equals("CHAT")) {
                    return m90894v0();
                }
                return null;
            case 34831160:
                if (str.equals("RADIO_STATION_CREATE_ALBUMS")) {
                    return m90662N1("RADIO_STATION_CREATE_ALBUMS", "radio/station/create/albums", 1562, "radio");
                }
                return null;
            case 54162008:
                if (str.equals("PUFFIN_WIRED_MANAGEMENT")) {
                    return m90662N1("PUFFIN_WIRED_MANAGEMENT", "puffin/wired-management", 1548, "puffin");
                }
                return null;
            case 83846168:
                if (str.equals("CHAT_SHARE")) {
                    return m90633J0();
                }
                return null;
            case 93629640:
                if (str.equals("NOTIFICATIONS")) {
                    return m90662N1("NOTIFICATIONS", "notifications", 1301, "notifications");
                }
                return null;
            case 133980072:
                if (str.equals("MRKT_ARTIST_PROFILE_CATALOG_SINGLES")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_CATALOG_SINGLES", "mrkt/artist/profile/catalog/singles", 1083, "mrkt");
                }
                return null;
            case 187798328:
                if (str.equals("ADSTUDIO_COLD_START_AD_SET")) {
                    return m90662N1("ADSTUDIO_COLD_START_AD_SET", "adstudio/cold-start/ad-set", 68, "adstudio");
                }
                return null;
            case 198511000:
                if (str.equals("SUPPORT_SITE_CONTACT")) {
                    return m90662N1("SUPPORT_SITE_CONTACT", "support-site/contact", 1951, "support-site");
                }
                return null;
            case 215946968:
                if (str.equals("COURSE_LESSON_QUIZ")) {
                    return m90662N1("COURSE_LESSON_QUIZ", "course/lesson/quiz", 444, "course");
                }
                return null;
            case 261166024:
                if (str.equals("SIGNUP_GENDER")) {
                    return m90662N1("SIGNUP_GENDER", "signup/gender", 1831, "signup");
                }
                return null;
            case 296527448:
                if (str.equals("PERMISSIONS_BLUETOOTH_REQUEST_BOTTOMSHEET")) {
                    return m90662N1("PERMISSIONS_BLUETOOTH_REQUEST_BOTTOMSHEET", "permissions/bluetooth/request/bottomsheet", 1377, "permissions");
                }
                return null;
            case 306538088:
                if (str.equals("UPCOMINGRELEASES")) {
                    return m90617G5();
                }
                return null;
            case 311888248:
                if (str.equals("CONTEXTMENU_LIVEROOM")) {
                    return m90662N1("CONTEXTMENU_LIVEROOM", "contextmenu/liveroom", 419, "contextmenu");
                }
                return null;
            case 328734392:
                if (str.equals("HOME_VIDEOS")) {
                    return m90795g2();
                }
                return null;
            case 389832712:
                if (str.equals("ADS_EMBEDDED_NPV_FULLSCREEN_VIDEO")) {
                    return m90662N1("ADS_EMBEDDED_NPV_FULLSCREEN_VIDEO", "ads/embedded-npv/fullscreen-video", 20, "ads");
                }
                return null;
            case 406312312:
                if (str.equals("DIALOG_CONNECT_NOMUSIC")) {
                    return m90662N1("DIALOG_CONNECT_NOMUSIC", "dialog/connect/nomusic", 462, "dialog");
                }
                return null;
            case 469238344:
                if (str.equals("LOGIN_MAGICLINKAUTOSEND")) {
                    return m90662N1("LOGIN_MAGICLINKAUTOSEND", "login/magiclinkautosend", 930, "login");
                }
                return null;
            case 544785016:
                if (str.equals("MRKT_ARTIST_SONG_LOCATION")) {
                    return m90662N1("MRKT_ARTIST_SONG_LOCATION", "mrkt/artist/song/location", AdvertisementDeliveryType.SYNDICATION, "mrkt");
                }
                return null;
            case 568620936:
                if (str.equals("FAST_TRACK")) {
                    return m90662N1("FAST_TRACK", "fast-track", 535, "fast-track");
                }
                return null;
            case 635199656:
                if (str.equals("ASSISTED_CURATION_SEARCH_ARTISTS")) {
                    return m90662N1("ASSISTED_CURATION_SEARCH_ARTISTS", "assisted-curation/search/artists", 183, "assisted-curation");
                }
                return null;
            case 694721560:
                if (str.equals("ADD_MEMBER")) {
                    return m90662N1("ADD_MEMBER", "add-member", 15, "add-member");
                }
                return null;
            case 699590632:
                if (str.equals("UNKNOWN_UNCOVERED")) {
                    return m90610F5();
                }
                return null;
            case 761293896:
                if (str.equals("SETTINGS_MEDIA_QUALITY")) {
                    return m90662N1("SETTINGS_MEDIA_QUALITY", "settings/media-quality", 1772, "settings");
                }
                return null;
            case 809125688:
                if (str.equals("MRKT_ARTIST_VIDEO_CLIPS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_CLIPS", "mrkt/artist/video/clips", 1111, "mrkt");
                }
                return null;
            case 876516728:
                if (str.equals("MRKT_FRONTDOOR_HOME")) {
                    return m90662N1("MRKT_FRONTDOOR_HOME", "mrkt/frontdoor/home", 1214, "mrkt");
                }
                return null;
            case 966493496:
                if (str.equals("BLEND_PARTY")) {
                    return m90662N1("BLEND_PARTY", "blend/party", 218, "blend");
                }
                return null;
            case 967006200:
                if (str.equals("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_PARENTAL_SETTINGS", "www-account-pages/parental-settings", 2142, "www-account-pages");
                }
                return null;
            case 994893304:
                if (str.equals("MUSIC_CATEGORY")) {
                    return m90662N1("MUSIC_CATEGORY", "music/category", 1294, "music");
                }
                return null;
            case 996910728:
                if (str.equals("GOLDENPATH_JOSHUAKELLY")) {
                    return m90662N1("GOLDENPATH_JOSHUAKELLY", "goldenpath/joshuakelly", 656, "goldenpath");
                }
                return null;
            case 998153080:
                if (str.equals("MRKT_ARTIST_MERCH")) {
                    return m90662N1("MRKT_ARTIST_MERCH", "mrkt/artist/merch", 1049, "mrkt");
                }
                return null;
            case 1033677640:
                if (str.equals("SIGNUP_CHALLENGE_CALLBACK")) {
                    return m90662N1("SIGNUP_CHALLENGE_CALLBACK", "signup/challenge/callback", 1828, "signup");
                }
                return null;
            case 1058384904:
                if (str.equals("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION_OPENEMAIL")) {
                    return m90662N1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAILCONFIRMATION_OPENEMAIL", "login/accountRecovery/requestemailconfirmation/openemail", 912, "login");
                }
                return null;
            case 1059507128:
                if (str.equals("GOLDENPATH_MHANSSON")) {
                    return m90662N1("GOLDENPATH_MHANSSON", "goldenpath/mhansson", 685, "goldenpath");
                }
                return null;
            case 1060367688:
                if (str.equals("HOLIDAYCAMPAIGN")) {
                    return m90662N1("HOLIDAYCAMPAIGN", "holidaycampaign", 774, "holidaycampaign");
                }
                return null;
            case 1065554248:
                if (str.equals("FREE_TIER_COLLECTION")) {
                    return m90662N1("FREE_TIER_COLLECTION", "free-tier-collection", 551, "free-tier-collection");
                }
                return null;
            case 1137023064:
                if (str.equals("ARTIST_APPEARS_ON")) {
                    return m90662N1("ARTIST_APPEARS_ON", "artist/appears-on", 158, "artist");
                }
                return null;
            case 1137280440:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_BILLING")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_BILLING", "mrkt/artist/campaigns/billing", 1018, "mrkt");
                }
                return null;
            case 1225644200:
                if (str.equals("S4P_SHOWS_ALL")) {
                    return m90662N1("S4P_SHOWS_ALL", "s4p/shows/all", 1709, "s4p");
                }
                return null;
            case 1252563240:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD", "adstudio/add-to-existing-ad-set/ad", 39, "adstudio");
                }
                return null;
            case 1267812632:
                if (str.equals("RADIO_STATION_CREATE_ARTISTS")) {
                    return m90662N1("RADIO_STATION_CREATE_ARTISTS", "radio/station/create/artists", 1563, "radio");
                }
                return null;
            case 1279202632:
                if (str.equals("PARENTALCONTROL")) {
                    return m90662N1("PARENTALCONTROL", "parentalcontrol", 1369, "parentalcontrol");
                }
                return null;
            case 1349355400:
                if (str.equals("S4P_SETUP_SHOW_CLAIM_BLOCKING")) {
                    return m90662N1("S4P_SETUP_SHOW_CLAIM_BLOCKING", "s4p/setup-show/claim-blocking", 1696, "s4p");
                }
                return null;
            case 1365166392:
                if (str.equals("CONTEXTMENU_ARTIST")) {
                    return m90773d1();
                }
                return null;
            case 1439578488:
                if (str.equals("PORTAL_SEARCH_GABITO_EVENTS")) {
                    return m90662N1("PORTAL_SEARCH_GABITO_EVENTS", "portal/search-gabito-events", 1477, "portal");
                }
                return null;
            case 1440562072:
                if (str.equals("PODCAST_SHOW_AUDIOBOOK")) {
                    return m90662N1("PODCAST_SHOW_AUDIOBOOK", "podcast/show/audiobook", 1439, "podcast");
                }
                return null;
            case 1458584184:
                if (str.equals("EMAIL_VERIFY_BLOCKING")) {
                    return m90662N1("EMAIL_VERIFY_BLOCKING", "email/verify/blocking", 494, "email");
                }
                return null;
            case 1479590600:
                if (str.equals("INTERACTIVEDJ")) {
                    return m90662N1("INTERACTIVEDJ", "interactivedj", 822, "interactivedj");
                }
                return null;
            case 1508829960:
                if (str.equals("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AI_AUDIO")) {
                    return m90662N1("ADSTUDIO_ADD_TO_EXISTING_AD_SET_AD_QUICK_AI_AUDIO", "adstudio/add-to-existing-ad-set/ad-quick-ai-audio", 41, "adstudio");
                }
                return null;
            case 1513373528:
                if (str.equals("SUPERBIRD_SETUP_RECONNECTING")) {
                    return m90662N1("SUPERBIRD_SETUP_RECONNECTING", "superbird/setup/reconnecting", 1944, "superbird");
                }
                return null;
            case 1526367976:
                if (str.equals("GOLDENPATH_JSIMFORS")) {
                    return m90662N1("GOLDENPATH_JSIMFORS", "goldenpath/jsimfors", 659, "goldenpath");
                }
                return null;
            case 1594096824:
                if (str.equals("REINVENTFREE_FMA_UPSELL")) {
                    return m90672O4();
                }
                return null;
            case 1644448968:
                if (str.equals("MRKT_WAITING_ROOM_PROFILE")) {
                    return m90662N1("MRKT_WAITING_ROOM_PROFILE", "mrkt/waiting-room/profile", 1286, "mrkt");
                }
                return null;
            case 1691343560:
                if (str.equals("CONTRIBUTION_NOTES_ONBOARDING")) {
                    return m90662N1("CONTRIBUTION_NOTES_ONBOARDING", "contribution/notes-onboarding", 438, "contribution");
                }
                return null;
            case 1760986520:
                if (str.equals("MRKT_LOGIN")) {
                    return m90662N1("MRKT_LOGIN", "mrkt/login", 1245, "mrkt");
                }
                return null;
            case 1800278360:
                if (str.equals("RECENTS")) {
                    return m90644K4();
                }
                return null;
            case 1875397928:
                if (str.equals("PHONENUMBER_CHECKERROR")) {
                    return m90587C3();
                }
                return null;
            case 1882015368:
                if (str.equals("RUNNING_SETUP_MANUAL")) {
                    return m90662N1("RUNNING_SETUP_MANUAL", "running/setup/manual", 1606, "running");
                }
                return null;
            case 1908064376:
                if (str.equals("FULLSCREEN_VIDEOPLAYER")) {
                    return m90662N1("FULLSCREEN_VIDEOPLAYER", "fullscreen/videoplayer", 585, "fullscreen");
                }
                return null;
            case 1912718568:
                if (str.equals("EXPERIMENTAL")) {
                    return m90599E1();
                }
                return null;
            case 1952244424:
                if (str.equals("CONTEXTMENU_AUDIOSETTINGS")) {
                    return m90662N1("CONTEXTMENU_AUDIOSETTINGS", "contextmenu/audiosettings", 408, "contextmenu");
                }
                return null;
            case 1953985928:
                if (str.equals("ADD_CHILD_ACCOUNT_NUDGE")) {
                    return m90604F();
                }
                return null;
            case 1964024984:
                if (str.equals("AIDJ_MIC_PERMISSION")) {
                    return m90688R();
                }
                return null;
            case 1965801320:
                if (str.equals("ADSTUDIO_BUSINESS_PEOPLE")) {
                    return m90662N1("ADSTUDIO_BUSINESS_PEOPLE", "adstudio/business/people", 58, "adstudio");
                }
                return null;
            case 1994066088:
                if (str.equals("S4P_PODCAST_EPISODE_MONETIZE")) {
                    return m90662N1("S4P_PODCAST_EPISODE_MONETIZE", "s4p/podcast/episode/monetize", 1676, "s4p");
                }
                return null;
            case 2041226664:
                if (str.equals("CARS_INTERACTIVEDJ")) {
                    return m90662N1("CARS_INTERACTIVEDJ", "cars/interactivedj", 274, "cars");
                }
                return null;
            case 2097915704:
                if (str.equals("ADSTUDIO_APPS")) {
                    return m90662N1("ADSTUDIO_APPS", "adstudio/apps", 48, "adstudio");
                }
                return null;
            case 2105996344:
                if (str.equals("HOME_COURSES")) {
                    return m90662N1("HOME_COURSES", "home/courses", 778, "home");
                }
                return null;
            case 2120415224:
                if (str.equals("DISCOVERNOWMUSIC")) {
                    return m90662N1("DISCOVERNOWMUSIC", "discovernowmusic", 481, "discovernowmusic");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: X */
    public static cbm0 m90730X() {
        return m90662N1("ARTIST_ARTIST_ATTRIBUTION", "artist/artist-attribution", 159, "artist");
    }

    /* JADX INFO: renamed from: X0 */
    public static cbm0 m90731X0() {
        return m90662N1("CONCERTS_CAMPAIGN", "concerts/campaign", 377, "concerts");
    }

    /* JADX INFO: renamed from: X1 */
    public static cbm0 m90732X1() {
        return m90662N1("HOME_AUDIOBOOKS", "home/audiobooks", 777, "home");
    }

    /* JADX INFO: renamed from: X2 */
    public static cbm0 m90733X2() {
        return m90662N1("MARTINI_FEEDBACK", "martini/feedback", 985, "martini");
    }

    /* JADX INFO: renamed from: X3 */
    public static cbm0 m90734X3() {
        return m90662N1("PODCAST_NEW_EPISODE_NOTIFICATIONS_SETTINGS", "podcast-new-episode-notifications/settings", 1425, "podcast-new-episode-notifications");
    }

    /* JADX INFO: renamed from: X4 */
    public static cbm0 m90735X4() {
        return m90662N1("REMOTEDOWNLOADS_ONBOARDING_EDUCATION", "remotedownloads/onboarding/education", 1596, "remotedownloads");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: X5 */
    public static cbm0 m90736X5(String str) {
        switch (str.hashCode()) {
            case -2036282551:
                if (str.equals("LISTENINGPARTY_USER_PROFILE_SHEET")) {
                    return m90662N1("LISTENINGPARTY_USER_PROFILE_SHEET", "listeningparty/user-profile-sheet", 899, "listeningparty");
                }
                return null;
            case -1986309927:
                if (str.equals("SETTINGS_FEATURES")) {
                    return m90662N1("SETTINGS_FEATURES", "settings/features", 1761, "settings");
                }
                return null;
            case -1978438599:
                if (str.equals("PODCASTCHARTS")) {
                    return m90769c4();
                }
                return null;
            case -1935692935:
                if (str.equals("LISTENINGHISTORY")) {
                    return m90662N1("LISTENINGHISTORY", "listeninghistory", 892, "listeninghistory");
                }
                return null;
            case -1877704695:
                if (str.equals("HOMETHING_ACTIVATION_WELCOME")) {
                    return m90662N1("HOMETHING_ACTIVATION_WELCOME", "homething/activation/welcome", ContentDeliveryAdvertisementCapability.LINEAR_1DAY, "homething");
                }
                return null;
            case -1850625479:
                if (str.equals("STUDIO_VOICE_SETTINGS")) {
                    return m90662N1("STUDIO_VOICE_SETTINGS", "studio/voice-settings", 1927, "studio");
                }
                return null;
            case -1811417719:
                if (str.equals("WEAR_UPDATE")) {
                    return m90662N1("WEAR_UPDATE", "wear/update", 2091, "wear");
                }
                return null;
            case -1779325399:
                if (str.equals("SUPERBIRD_SETUP_BLUETOOTHCONNECT")) {
                    return m90662N1("SUPERBIRD_SETUP_BLUETOOTHCONNECT", "superbird/setup/bluetoothconnect", 1930, "superbird");
                }
                return null;
            case -1704634087:
                if (str.equals("NFT_MIX")) {
                    return m90662N1("NFT_MIX", "nft-mix", 1300, "nft-mix");
                }
                return null;
            case -1701918087:
                if (str.equals("CONCERT_GALLERY")) {
                    return m90710U0();
                }
                return null;
            case -1646729495:
                if (str.equals("GOLDENPATH_JUANANTONIOL")) {
                    return m90662N1("GOLDENPATH_JUANANTONIOL", "goldenpath/juanantoniol", 661, "goldenpath");
                }
                return null;
            case -1634441847:
                if (str.equals("GOLDENPATH_GUSTAVOC")) {
                    return m90662N1("GOLDENPATH_GUSTAVOC", "goldenpath/gustavoc", 636, "goldenpath");
                }
                return null;
            case -1589899815:
                if (str.equals("PODCASTCHARTS_REGIONS")) {
                    return m90790f4();
                }
                return null;
            case -1524991687:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_INTERACTIVE")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_CREATE_INTERACTIVE", "mrkt/discovery-mode/unified-buying/create/interactive", 1177, "mrkt");
                }
                return null;
            case -1502489015:
                if (str.equals("PORTAL_SEARCH_GCP_PROJECTS")) {
                    return m90662N1("PORTAL_SEARCH_GCP_PROJECTS", "portal/search-gcp-projects", 1478, "portal");
                }
                return null;
            case -1476974999:
                if (str.equals("MESSAGE_STORE")) {
                    return m90662N1("MESSAGE_STORE", "message-store", 993, "message-store");
                }
                return null;
            case -1440404775:
                if (str.equals("PARENTAL_CONTROL_REMOVE_PARENT")) {
                    return m90662N1("PARENTAL_CONTROL_REMOVE_PARENT", "parental-control/remove-parent", 1365, "parental-control");
                }
                return null;
            case -1418437671:
                if (str.equals("MANAGED_ACCOUNT_LINKING_LEARN_MORE")) {
                    return m90662N1("MANAGED_ACCOUNT_LINKING_LEARN_MORE", "managed-account-linking/learn-more", 976, "managed-account-linking");
                }
                return null;
            case -1393479367:
                if (str.equals("S4P_PODCAST_EPISODE_ADDITIONAL_DETAILS")) {
                    return m90662N1("S4P_PODCAST_EPISODE_ADDITIONAL_DETAILS", "s4p/podcast/episode/additional-details", 1673, "s4p");
                }
                return null;
            case -1392572327:
                if (str.equals("SEARCH_PODCASTS_AND_EPISODES")) {
                    return m90662N1("SEARCH_PODCASTS_AND_EPISODES", "search/podcasts_and_episodes", 1737, "search");
                }
                return null;
            case -1364084103:
                if (str.equals("SETTINGS_CONTENT_LANGUAGES")) {
                    return m90662N1("SETTINGS_CONTENT_LANGUAGES", "settings/content-languages", 1755, "settings");
                }
                return null;
            case -1361468567:
                if (str.equals("GOLDENPATH_VIKTORY")) {
                    return m90662N1("GOLDENPATH_VIKTORY", "goldenpath/viktory", 739, "goldenpath");
                }
                return null;
            case -1344513847:
                if (str.equals("MRKT_FRONTDOOR_MARQUEE")) {
                    return m90662N1("MRKT_FRONTDOOR_MARQUEE", "mrkt/frontdoor/marquee", 1216, "mrkt");
                }
                return null;
            case -1336803575:
                if (str.equals("SETTINGS_SOCIAL")) {
                    return m90662N1("SETTINGS_SOCIAL", "settings/social", 1787, "settings");
                }
                return null;
            case -1324361127:
                if (str.equals("MANAGED_ACCOUNT_LINKING_SHARE_PARENTAL_CONSENT")) {
                    return m90662N1("MANAGED_ACCOUNT_LINKING_SHARE_PARENTAL_CONSENT", "managed-account-linking/share-parental-consent", 979, "managed-account-linking");
                }
                return null;
            case -1309770439:
                if (str.equals("CONCERTS_ARTIST")) {
                    return m90724W0();
                }
                return null;
            case -1289348535:
                if (str.equals("SONG_DNA_CONTRIBUTOR")) {
                    return m90662N1("SONG_DNA_CONTRIBUTOR", "song-dna-contributor", 1859, "song-dna-contributor");
                }
                return null;
            case -1262342903:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CHANGEPIN")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_CHANGEPIN", "www-account-pages/genalpha/changepin", 2123, "www-account-pages");
                }
                return null;
            case -1245642647:
                if (str.equals("ADSTUDIO_BUSINESS_DETAILS")) {
                    return m90662N1("ADSTUDIO_BUSINESS_DETAILS", "adstudio/business/details", 55, "adstudio");
                }
                return null;
            case -1211482695:
                if (str.equals("YOURLIBRARYTAGS_YOURTAGSPAGE")) {
                    return m90820j6();
                }
                return null;
            case -1205406855:
                if (str.equals("CONNECT_CONTEXTMENU")) {
                    return m90662N1("CONNECT_CONTEXTMENU", "connect/contextmenu", 383, "connect");
                }
                return null;
            case -1202114359:
                if (str.equals("PODCASTCHAPTER")) {
                    return m90662N1("PODCASTCHAPTER", "podcastchapter", 1454, "podcastchapter");
                }
                return null;
            case -1194959447:
                if (str.equals("S4P_DEBUG_KAIZEN_COMPONENTS")) {
                    return m90662N1("S4P_DEBUG_KAIZEN_COMPONENTS", "s4p/debug/kaizen-components", 1645, "s4p");
                }
                return null;
            case -1179481143:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOWSUCCESS")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_CHILDACCOUNTCREATIONFLOWSUCCESS", "www-account-pages/genalpha/childaccountcreationflowsuccess", 2125, "www-account-pages");
                }
                return null;
            case -1095125943:
                if (str.equals("ADSTUDIO_COLD_START_AD_SET_RESERVED_BOOKING")) {
                    return m90662N1("ADSTUDIO_COLD_START_AD_SET_RESERVED_BOOKING", "adstudio/cold-start/ad-set/reserved-booking", 69, "adstudio");
                }
                return null;
            case -1094681831:
                if (str.equals("FAST_TRACK_PAGE_2")) {
                    return m90634J1();
                }
                return null;
            case -993272343:
                if (str.equals("MRKT_ARTIST_AUDIENCE_LOCATION")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_LOCATION", "mrkt/artist/audience/location", ContentMediaFormat.EXTRA_GENERIC, "mrkt");
                }
                return null;
            case -983865911:
                if (str.equals("ARTIST_STORE")) {
                    return m90662N1("ARTIST_STORE", "artist/store", 173, "artist");
                }
                return null;
            case -948331831:
                if (str.equals("SUPERBIRD_SETUP_EVERYTHINGCONNECTED")) {
                    return m90662N1("SUPERBIRD_SETUP_EVERYTHINGCONNECTED", "superbird/setup/everythingconnected", 1940, "superbird");
                }
                return null;
            case -939688567:
                if (str.equals("WWW_ACCOUNT_PAGES_CONSENT_CAPTURING")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_CONSENT_CAPTURING", "www-account-pages/consent-capturing", 2116, "www-account-pages");
                }
                return null;
            case -928897511:
                if (str.equals("GOLDENPATH_ABDULB")) {
                    return m90662N1("GOLDENPATH_ABDULB", "goldenpath/abdulb", 590, "goldenpath");
                }
                return null;
            case -919908119:
                if (str.equals("QUIZ_QUESTION_SOURCES")) {
                    return m90602E4();
                }
                return null;
            case -798161287:
                if (str.equals("CARS_APPPROTOCOL")) {
                    return m90662N1("CARS_APPPROTOCOL", "cars/appprotocol", 271, "cars");
                }
                return null;
            case -782200919:
                if (str.equals("REACTION_SHEET")) {
                    return m90630I4();
                }
                return null;
            case -662311399:
                if (str.equals("PARENTAL_CONSENT_EDUCATION")) {
                    return m90662N1("PARENTAL_CONSENT_EDUCATION", "parental-consent/education", 1347, "parental-consent");
                }
                return null;
            case -641189271:
                if (str.equals("MRKT_ARTIST_PROFILE_SOCIALS")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_SOCIALS", "mrkt/artist/profile/socials", 1096, "mrkt");
                }
                return null;
            case -612289031:
                if (str.equals("WATCHAPP_EVENT_SENDER_STATE")) {
                    return m90662N1("WATCHAPP_EVENT_SENDER_STATE", "watchapp/event-sender-state", 2030, "watchapp");
                }
                return null;
            case -611295255:
                if (str.equals("BLEND_DNA")) {
                    return m90662N1("BLEND_DNA", "blend-dna", 210, "blend-dna");
                }
                return null;
            case -601475943:
                if (str.equals("GOLDENPATH_LOUISD")) {
                    return m90662N1("GOLDENPATH_LOUISD", "goldenpath/louisd", 670, "goldenpath");
                }
                return null;
            case -595915655:
                if (str.equals("WRAPPED_HOME")) {
                    return m90662N1("WRAPPED_HOME", "wrapped/home", 2103, "wrapped");
                }
                return null;
            case -584050951:
                if (str.equals("SETTINGS_LANGUAGES_CONTENT")) {
                    return m90662N1("SETTINGS_LANGUAGES_CONTENT", "settings/languages/content", 1767, "settings");
                }
                return null;
            case -580273895:
                if (str.equals("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ANALYTICS")) {
                    return m90662N1("MRKT_ARTIST_VIDEO_OTHER_VIDEOS_ANALYTICS", "mrkt/artist/video/other-videos/analytics", 1129, "mrkt");
                }
                return null;
            case -557321639:
                if (str.equals("GOLDENPATH_NAOMYP")) {
                    return m90662N1("GOLDENPATH_NAOMYP", "goldenpath/naomyp", 699, "goldenpath");
                }
                return null;
            case -537669559:
                if (str.equals("NAVIGATION_BOTTOMSHEET")) {
                    return m90782e3();
                }
                return null;
            case -509828759:
                if (str.equals("CONNECT_TUTORIALDESKTOP")) {
                    return m90662N1("CONNECT_TUTORIALDESKTOP", "connect/tutorialdesktop", 393, "connect");
                }
                return null;
            case -439301207:
                if (str.equals("GOLDENPATH_REIAZG")) {
                    return m90662N1("GOLDENPATH_REIAZG", "goldenpath/reiazg", 716, "goldenpath");
                }
                return null;
            case -318156647:
                if (str.equals("GOLDENPATH_NIKOLAYM")) {
                    return m90662N1("GOLDENPATH_NIKOLAYM", "goldenpath/nikolaym", 705, "goldenpath");
                }
                return null;
            case -219380503:
                if (str.equals("GOLDENPATH_AADESALU")) {
                    return m90662N1("GOLDENPATH_AADESALU", "goldenpath/aadesalu", 589, "goldenpath");
                }
                return null;
            case -205318519:
                if (str.equals("WEAR_LOGIN")) {
                    return m90662N1("WEAR_LOGIN", "wear/login", 2070, "wear");
                }
                return null;
            case -187165447:
                if (str.equals("GOLDENPATH_TOLSSONWIKLUND")) {
                    return m90662N1("GOLDENPATH_TOLSSONWIKLUND", "goldenpath/tolssonwiklund", 736, "goldenpath");
                }
                return null;
            case -177364935:
                if (str.equals("DOWNLOAD_MOBILE")) {
                    return m90662N1("DOWNLOAD_MOBILE", "download/mobile", 487, "download");
                }
                return null;
            case -122362471:
                if (str.equals("PAGE_MATCH_SUCCESS")) {
                    return m90662N1("PAGE_MATCH_SUCCESS", "page-match/success", 1346, "page-match");
                }
                return null;
            case -24701351:
                if (str.equals("BIRTHDAYS_GIFT")) {
                    return m90662N1("BIRTHDAYS_GIFT", "birthdays/gift", 209, "birthdays");
                }
                return null;
            case 2158009:
                if (str.equals("FIND")) {
                    return m90662N1("FIND", "find", 540, "find");
                }
                return null;
            case 9684825:
                if (str.equals("MRKT_ARTIST_PLAYLIST")) {
                    return m90662N1("MRKT_ARTIST_PLAYLIST", "mrkt/artist/playlist", 1066, "mrkt");
                }
                return null;
            case 35047209:
                if (str.equals("PROFILE_EDIT_BIO")) {
                    return m90891u4();
                }
                return null;
            case 49247161:
                if (str.equals("CONNECT_DEVICEPICKER")) {
                    return m90759b1();
                }
                return null;
            case 58170281:
                if (str.equals("SOCIAL_LISTENING_NOTIFICATIONDIALOG")) {
                    return m90662N1("SOCIAL_LISTENING_NOTIFICATIONDIALOG", "social-listening/notificationdialog", 1851, "social-listening");
                }
                return null;
            case 59520473:
                if (str.equals("STUDIO_WELCOME")) {
                    return m90662N1("STUDIO_WELCOME", "studio/welcome", 1928, "studio");
                }
                return null;
            case 72611657:
                if (str.equals("LOGIN")) {
                    return m90662N1("LOGIN", "login", 911, "login");
                }
                return null;
            case 108009369:
                if (str.equals("HIFI_DOWNLOAD_OVER_CELLULAR_SHEET")) {
                    return m90662N1("HIFI_DOWNLOAD_OVER_CELLULAR_SHEET", "hifi/download-over-cellular-sheet", 765, "hifi");
                }
                return null;
            case 157552841:
                if (str.equals("BLUEJAY_CONFIRM")) {
                    return m90846o0();
                }
                return null;
            case 203137017:
                if (str.equals("PARENTAL_CONTROL_PARENT_DETAILS")) {
                    return m90662N1("PARENTAL_CONTROL_PARENT_DETAILS", "parental-control/parent-details", 1364, "parental-control");
                }
                return null;
            case 257510617:
                if (str.equals("PREMIUM_ACCOUNT_MANAGEMENT_BILLING")) {
                    return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_BILLING", "premium-account-management/billing", 1487, "premium-account-management");
                }
                return null;
            case 263893977:
                if (str.equals("ADSTUDIO_APPROVE_CAMPAIGN_RESERVED_BOOKING")) {
                    return m90662N1("ADSTUDIO_APPROVE_CAMPAIGN_RESERVED_BOOKING", "adstudio/approve/campaign/reserved-booking", 47, "adstudio");
                }
                return null;
            case 274533721:
                if (str.equals("SOCIAL_LISTENING_SETTINGS")) {
                    return m90662N1("SOCIAL_LISTENING_SETTINGS", "social-listening/settings", 1853, "social-listening");
                }
                return null;
            case 277282809:
                if (str.equals("ENHANCED_SHARE_CARD")) {
                    return m90662N1("ENHANCED_SHARE_CARD", "enhanced-share-card", 499, "enhanced-share-card");
                }
                return null;
            case 297216553:
                if (str.equals("ENDLESS_FEED")) {
                    return m90662N1("ENDLESS_FEED", "endless-feed", 497, "endless-feed");
                }
                return null;
            case 317600233:
                if (str.equals("S4P_CATALOG")) {
                    return m90662N1("S4P_CATALOG", "s4p/catalog", 1627, "s4p");
                }
                return null;
            case 332974665:
                if (str.equals("WWW_ACCOUNT_PAGES_GENALPHA_PARENTALCONSENT")) {
                    return m90662N1("WWW_ACCOUNT_PAGES_GENALPHA_PARENTALCONSENT", "www-account-pages/genalpha/parentalconsent", 2127, "www-account-pages");
                }
                return null;
            case 408556937:
                if (str.equals("PROFILE")) {
                    return m90877s4();
                }
                return null;
            case 428643081:
                if (str.equals("GOLDENPATH_MLENEHAN")) {
                    return m90662N1("GOLDENPATH_MLENEHAN", "goldenpath/mlenehan", 690, "goldenpath");
                }
                return null;
            case 435372825:
                if (str.equals("AAA_CON_T")) {
                    return m90893v();
                }
                return null;
            case 484026681:
                if (str.equals("COLLECTION_OFFLINELIBRARY")) {
                    return m90662N1("COLLECTION_OFFLINELIBRARY", "collection/offlinelibrary", 344, "collection");
                }
                return null;
            case 492656393:
                if (str.equals("KID_ACCOUNT_TRANSITION_EDUCATION")) {
                    return m90662N1("KID_ACCOUNT_TRANSITION_EDUCATION", "kid-account-transition/education", 867, "kid-account-transition");
                }
                return null;
            case 493234953:
                if (str.equals("FREE_TIER_HOME")) {
                    return m90662N1("FREE_TIER_HOME", "free-tier-home", 553, "free-tier-home");
                }
                return null;
            case 517859753:
                if (str.equals("SETTINGS_BUSINESS_INFORMATION")) {
                    return m90791f5();
                }
                return null;
            case 525451273:
                if (str.equals("PLAYLIST_MIXING_REORDER_OVERVIEW")) {
                    return m90662N1("PLAYLIST_MIXING_REORDER_OVERVIEW", "playlist/mixing-reorder-overview", 1414, "playlist");
                }
                return null;
            case 536093017:
                if (str.equals("IRONCHEF_NAMING")) {
                    return m90662N1("IRONCHEF_NAMING", "ironchef/naming", 829, "ironchef");
                }
                return null;
            case 625861353:
                if (str.equals("SETTINGS_IGNORED_IN_RECOMMENDATIONS")) {
                    return m90662N1("SETTINGS_IGNORED_IN_RECOMMENDATIONS", "settings/ignored-in-recommendations", 1762, "settings");
                }
                return null;
            case 682583673:
                if (str.equals("IRONCHEF_SEARCH")) {
                    return m90662N1("IRONCHEF_SEARCH", "ironchef/search", 831, "ironchef");
                }
                return null;
            case 716758729:
                if (str.equals("CHARTS_REGIONAL")) {
                    return m90662N1("CHARTS_REGIONAL", "charts/regional", ContentFeedType.EAST_HD, "charts");
                }
                return null;
            case 781573273:
                if (str.equals("DIALOG_CONNECTFACEBOOK")) {
                    return m90662N1("DIALOG_CONNECTFACEBOOK", "dialog/connectfacebook", 464, "dialog");
                }
                return null;
            case 823425065:
                if (str.equals("SKIP_LIMIT_PIVOT_TRACKS")) {
                    return m90662N1("SKIP_LIMIT_PIVOT_TRACKS", "skip-limit-pivot-tracks", 1840, "skip-limit-pivot-tracks");
                }
                return null;
            case 864339401:
                if (str.equals("HARMONYPLAYER_PLAYLISTS")) {
                    return m90662N1("HARMONYPLAYER_PLAYLISTS", "harmonyplayer/playlists", 764, "harmonyplayer");
                }
                return null;
            case 876208841:
                if (str.equals("S4P_MONETIZE")) {
                    return m90662N1("S4P_MONETIZE", "s4p/monetize", 1664, "s4p");
                }
                return null;
            case 907450249:
                if (str.equals("MRKT_FRONTDOOR_PROVIDERS")) {
                    return m90662N1("MRKT_FRONTDOOR_PROVIDERS", "mrkt/frontdoor/providers", 1222, "mrkt");
                }
                return null;
            case 934348889:
                if (str.equals("LOGIN_SETTINGS")) {
                    return m90662N1("LOGIN_SETTINGS", "login/settings", 937, "login");
                }
                return null;
            case 954520313:
                if (str.equals("INAPPMESSAGE_MODAL")) {
                    return m90848o2();
                }
                return null;
            case 999520601:
                if (str.equals("GOLDENPATH_ALEXWALL")) {
                    return m90662N1("GOLDENPATH_ALEXWALL", "goldenpath/alexwall", 599, "goldenpath");
                }
                return null;
            case 1001990617:
                if (str.equals("GOLDENPATH_KRISTINAC")) {
                    return m90662N1("GOLDENPATH_KRISTINAC", "goldenpath/kristinac", 667, "goldenpath");
                }
                return null;
            case 1068600601:
                if (str.equals("LOGIN_OTT")) {
                    return m90662N1("LOGIN_OTT", "login/ott", 932, "login");
                }
                return null;
            case 1074725049:
                if (str.equals("MRKT_DM_MANAGED_SERVICE_EDIT")) {
                    return m90662N1("MRKT_DM_MANAGED_SERVICE_EDIT", "mrkt/dm-managed-service/edit", 1188, "mrkt");
                }
                return null;
            case 1091350121:
                if (str.equals("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE")) {
                    return m90662N1("MRKT_ARTIST_AUDIENCE_ACTIVE_AUDIENCE", "mrkt/artist/audience/active-audience", 1004, "mrkt");
                }
                return null;
            case 1102060617:
                if (str.equals("S4P_CLAIM_PODCAST_WEB_MIGRATION_REQUIRED")) {
                    return m90662N1("S4P_CLAIM_PODCAST_WEB_MIGRATION_REQUIRED", "s4p/claim-podcast/web-migration-required", 1633, "s4p");
                }
                return null;
            case 1110039449:
                if (str.equals("AI_SHARED_USAGE_LIMITS")) {
                    return m90662N1("AI_SHARED_USAGE_LIMITS", "ai-shared/usage-limits", 138, "ai-shared");
                }
                return null;
            case 1113541833:
                if (str.equals("AGE_ASSURANCE_SELF_INPUT")) {
                    return m90662N1("AGE_ASSURANCE_SELF_INPUT", "age-assurance/self/input", 124, "age-assurance");
                }
                return null;
            case 1136831433:
                if (str.equals("MARTINI_CHAT")) {
                    return m90726W2();
                }
                return null;
            case 1181570457:
                if (str.equals("SOCIAL_LISTENING_ENDSESSIONDIALOG")) {
                    return m90662N1("SOCIAL_LISTENING_ENDSESSIONDIALOG", "social-listening/endsessiondialog", 1846, "social-listening");
                }
                return null;
            case 1322818153:
                if (str.equals("COMMUNITY_LISTENING_ACTIVITY")) {
                    return m90662N1("COMMUNITY_LISTENING_ACTIVITY", "community/listening-activity", 373, "community");
                }
                return null;
            case 1337643481:
                if (str.equals("SLEEP_TIMER_NUDGE")) {
                    return m90885t5();
                }
                return null;
            case 1361088585:
                if (str.equals("WEB3_TOKENENABLED_PLAYLIST")) {
                    return m90662N1("WEB3_TOKENENABLED_PLAYLIST", "web3/tokenenabled/playlist", 2099, "web3");
                }
                return null;
            case 1365727145:
                if (str.equals("PREMIUM_DESTINATION_PREMIUM_PLANS")) {
                    return m90662N1("PREMIUM_DESTINATION_PREMIUM_PLANS", "premium-destination/premium-plans", 1498, "premium-destination");
                }
                return null;
            case 1374488793:
                if (str.equals("MRKT_ARTIST_PROFILE_ABOUT_EDIT")) {
                    return m90662N1("MRKT_ARTIST_PROFILE_ABOUT_EDIT", "mrkt/artist/profile/about/edit", 1074, "mrkt");
                }
                return null;
            case 1378898761:
                if (str.equals("ADSTUDIO_BUSINESS_AD_ACCOUNTS")) {
                    return m90662N1("ADSTUDIO_BUSINESS_AD_ACCOUNTS", "adstudio/business/ad-accounts", 51, "adstudio");
                }
                return null;
            case 1508147257:
                if (str.equals("MRKT_BTC_BOOKING_CAMPAIGNS_REVIEW")) {
                    return m90662N1("MRKT_BTC_BOOKING_CAMPAIGNS_REVIEW", "mrkt/btc/booking/campaigns-review", 1138, "mrkt");
                }
                return null;
            case 1515190585:
                if (str.equals("S4P_LOGIN")) {
                    return m90662N1("S4P_LOGIN", "s4p/login", 1662, "s4p");
                }
                return null;
            case 1532497641:
                if (str.equals("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_SUCCESS")) {
                    return m90662N1("MRKT_DISCOVERY_MODE_UNIFIED_BUYING_SUCCESS", "mrkt/discovery-mode/unified-buying/success", 1179, "mrkt");
                }
                return null;
            case 1551702681:
                if (str.equals("COLLECTION_YOUREPISODES_SETTINGS_REMOVEUNPLAYED")) {
                    return m90662N1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEUNPLAYED", "collection/yourepisodes/settings/removeunplayed", 364, "collection");
                }
                return null;
            case 1578602425:
                if (str.equals("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SUCCESS")) {
                    return m90662N1("MRKT_ARTIST_CAMPAIGNS_MARQUEE_AND_SHOWCASE_SUCCESS", "mrkt/artist/campaigns/marquee-and-showcase/success", 1033, "mrkt");
                }
                return null;
            case 1715104201:
                if (str.equals("ARTIST_PLAYLISTS")) {
                    return m90662N1("ARTIST_PLAYLISTS", "artist/playlists", 168, "artist");
                }
                return null;
            case 1726821801:
                if (str.equals("S4P_PODCAST_EPISODE_OPTIONS_NON_HOSTED")) {
                    return m90662N1("S4P_PODCAST_EPISODE_OPTIONS_NON_HOSTED", "s4p/podcast/episode/options/non-hosted", 1678, "s4p");
                }
                return null;
            case 1754615001:
                if (str.equals("MRKT_ARTIST_MUSIC_REVIEW")) {
                    return m90662N1("MRKT_ARTIST_MUSIC_REVIEW", "mrkt/artist/music/review", 1057, "mrkt");
                }
                return null;
            case 1757868089:
                if (str.equals("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AI_AUDIO")) {
                    return m90662N1("ADSTUDIO_DUPLICATE_AD_SET_ONLY_AD_QUICK_AI_AUDIO", "adstudio/duplicate-ad-set-only/ad-quick-ai-audio", 84, "adstudio");
                }
                return null;
            case 1788760105:
                if (str.equals("S4P_CREATION_RECORDING_TERMS")) {
                    return m90662N1("S4P_CREATION_RECORDING_TERMS", "s4p/creation/recording-terms", 1642, "s4p");
                }
                return null;
            case 1889069737:
                if (str.equals("UBI_DEBUG_MONITOR_EVENTGROUPDETAILS")) {
                    return m90662N1("UBI_DEBUG_MONITOR_EVENTGROUPDETAILS", "ubi/debug-monitor/eventgroupdetails", 1983, "ubi");
                }
                return null;
            case 1914238153:
                if (str.equals("MANAGE_TEAM_MEMBER_DETAILS_PAGE")) {
                    return m90662N1("MANAGE_TEAM_MEMBER_DETAILS_PAGE", "manage/team-member-details-page", 971, "manage");
                }
                return null;
            case 1922990921:
                if (str.equals("CHILD_LED_SIGNUP_PARENTAL_CONSENT_EDUCATION")) {
                    return m90662N1("CHILD_LED_SIGNUP_PARENTAL_CONSENT_EDUCATION", "child-led-signup/parental-consent-education", 331, "child-led-signup");
                }
                return null;
            case 1926607081:
                if (str.equals("S4P_SETUP_SHOW_CATEGORY_LANGUAGE")) {
                    return m90662N1("S4P_SETUP_SHOW_CATEGORY_LANGUAGE", "s4p/setup-show/category-language", 1695, "s4p");
                }
                return null;
            case 1937376153:
                if (str.equals("INSPIRECREATION")) {
                    return m90662N1("INSPIRECREATION", "inspirecreation", 821, "inspirecreation");
                }
                return null;
            case 1971086425:
                if (str.equals("BUNDLING_WEBVIEW")) {
                    return m90662N1("BUNDLING_WEBVIEW", "bundling/webview", 256, "bundling");
                }
                return null;
            case 2070915625:
                if (str.equals("SOCIAL_LISTENING_TAPTOQUEUE")) {
                    return m90662N1("SOCIAL_LISTENING_TAPTOQUEUE", "social-listening/taptoqueue", 1855, "social-listening");
                }
                return null;
            case 2076299273:
                if (str.equals("PLAYLIST_CREATE")) {
                    return m90657M3();
                }
                return null;
            case 2099402745:
                if (str.equals("COURSE_QUIZ")) {
                    return m90662N1("COURSE_QUIZ", "course/quiz", 445, "course");
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static cbm0 m90737Y() {
        return m90662N1("ASSISTED_CURATION", "assisted-curation", 177, "assisted-curation");
    }

    /* JADX INFO: renamed from: Y0 */
    public static cbm0 m90738Y0() {
        return m90662N1("CONCERTS_CITYSEARCH", "concerts/citysearch", 378, "concerts");
    }

    /* JADX INFO: renamed from: Y1 */
    public static cbm0 m90739Y1() {
        return m90662N1("HOME_MUSIC", "home/music", 780, "home");
    }

    /* JADX INFO: renamed from: Y2 */
    public static cbm0 m90740Y2() {
        return m90662N1("MEDIA_TRIMMER", "media-trimmer", 987, "media-trimmer");
    }

    /* JADX INFO: renamed from: Y3 */
    public static cbm0 m90741Y3() {
        return m90662N1("PODCAST_SHOW_SEARCH", "podcast/show/search", 1448, "podcast");
    }

    /* JADX INFO: renamed from: Y4 */
    public static cbm0 m90742Y4() {
        return m90662N1("SCANNABLES_SCANNER", "scannables/scanner", 1722, "scannables");
    }

    /* JADX INFO: renamed from: Y5 */
    public static cbm0 m90743Y5() {
        return m90662N1("VENUE", "venue", 2004, "venue");
    }

    /* JADX INFO: renamed from: Z */
    public static cbm0 m90744Z() {
        return m90662N1("AUDIO_LANGUAGE_SELECTOR", "audio-language-selector", 190, "audio-language-selector");
    }

    /* JADX INFO: renamed from: Z0 */
    public static cbm0 m90745Z0() {
        return m90662N1("CONCERTS_CONCERT", "concerts/concert", 379, "concerts");
    }

    /* JADX INFO: renamed from: Z1 */
    public static cbm0 m90746Z1() {
        return m90662N1("HOME_MUSIC_FOLLOWING", "home/music-following", 781, "home");
    }

    /* JADX INFO: renamed from: Z2 */
    public static cbm0 m90747Z2() {
        return m90662N1("MEDIAPICKER", "mediapicker", 988, "mediapicker");
    }

    /* JADX INFO: renamed from: Z3 */
    public static cbm0 m90748Z3() {
        return m90662N1("PODCAST_SHOW_SETTINGS", "podcast/show/settings", 1449, "podcast");
    }

    /* JADX INFO: renamed from: Z4 */
    public static cbm0 m90749Z4() {
        return m90662N1("SEARCH", "search", 1723, "search");
    }

    /* JADX INFO: renamed from: Z5 */
    public static cbm0 m90750Z5() {
        return m90662N1("VERSIONSUNSETTING_DIALOG", "versionsunsetting/dialog", 2005, "versionsunsetting");
    }

    /* JADX INFO: renamed from: a0 */
    public static cbm0 m90751a0() {
        return m90662N1("AUDIOBOOK_CHAPTERPLAYBACKCONFIRMATION", "audiobook/chapterplaybackconfirmation", 192, "audiobook");
    }

    /* JADX INFO: renamed from: a1 */
    public static cbm0 m90752a1() {
        return m90662N1("CONCERTS_MULTIEVENTBOTTOMSHEET", "concerts/multieventbottomsheet", 382, "concerts");
    }

    /* JADX INFO: renamed from: a2 */
    public static cbm0 m90753a2() {
        return m90662N1("HOME_MUSIC_VIDEOS", "home/music-videos", 782, "home");
    }

    /* JADX INFO: renamed from: a3 */
    public static cbm0 m90754a3() {
        return m90662N1("MULTI_USER_PLAN_VERIFICATION_ONBOARDING", "multi-user-plan-verification/onboarding", 1290, "multi-user-plan-verification");
    }

    /* JADX INFO: renamed from: a4 */
    public static cbm0 m90755a4() {
        return m90662N1("PODCAST_SHOW_SETTINGS_MARKASPLAYED", "podcast/show/settings/markasplayed", 1450, "podcast");
    }

    /* JADX INFO: renamed from: a5 */
    public static cbm0 m90756a5() {
        return m90662N1("SEARCH_LOADING_INSTANT_MIX", "search/loading_instant_mix", 1734, "search");
    }

    /* JADX INFO: renamed from: a6 */
    public static cbm0 m90757a6() {
        return m90662N1("VOTING_ROOT", "voting/root", 2014, "voting");
    }

    /* JADX INFO: renamed from: b0 */
    public static cbm0 m90758b0() {
        return m90662N1("AUDIOBOOK_CHAPTERSBOTTOMSHEET", "audiobook/chaptersbottomsheet", 193, "audiobook");
    }

    /* JADX INFO: renamed from: b1 */
    public static cbm0 m90759b1() {
        return m90662N1("CONNECT_DEVICEPICKER", "connect/devicepicker", 384, "connect");
    }

    /* JADX INFO: renamed from: b2 */
    public static cbm0 m90760b2() {
        return m90662N1("HOME_PODCASTS", "home/podcasts", 783, "home");
    }

    /* JADX INFO: renamed from: b3 */
    public static cbm0 m90761b3() {
        return m90662N1("MULTI_USER_PLAN_VERIFICATION_START", "multi-user-plan-verification/start", 1291, "multi-user-plan-verification");
    }

    /* JADX INFO: renamed from: b4 */
    public static cbm0 m90762b4() {
        return m90662N1("PODCAST_SPONSORS", "podcast/sponsors", 1452, "podcast");
    }

    /* JADX INFO: renamed from: b5 */
    public static cbm0 m90763b5() {
        return m90662N1("SETTINGS", "settings", 1745, "settings");
    }

    /* JADX INFO: renamed from: b6 */
    public static cbm0 m90764b6() {
        return m90662N1("VOTING_SHARE", "voting/share", 2015, "voting");
    }

    /* JADX INFO: renamed from: c0 */
    public static cbm0 m90765c0() {
        return m90662N1("AUDIOBOOK_CONSIDERATION", "audiobook/consideration", 194, "audiobook");
    }

    /* JADX INFO: renamed from: c1 */
    public static cbm0 m90766c1() {
        return m90662N1("CONSUMPTION", "consumption", 398, "consumption");
    }

    /* JADX INFO: renamed from: c2 */
    public static cbm0 m90767c2() {
        return m90662N1("HOME_PODCASTS_FOLLOWING", "home/podcasts-following", 785, "home");
    }

    /* JADX INFO: renamed from: c3 */
    public static cbm0 m90768c3() {
        return m90662N1("MULTI_USER_PLAN_VERIFICATION_VERIFY", "multi-user-plan-verification/verify", 1292, "multi-user-plan-verification");
    }

    /* JADX INFO: renamed from: c4 */
    public static cbm0 m90769c4() {
        return m90662N1("PODCASTCHARTS", "podcastcharts", 1455, "podcastcharts");
    }

    /* JADX INFO: renamed from: c5 */
    public static cbm0 m90770c5() {
        return m90662N1("SETTINGS_ACCOUNT", "settings/account", 1747, "settings");
    }

    /* JADX INFO: renamed from: c6 */
    public static cbm0 m90771c6() {
        return m90662N1("VTEC", "vtec", 2016, "vtec");
    }

    /* JADX INFO: renamed from: d0 */
    public static cbm0 m90772d0() {
        return m90662N1("AUDIOBOOK_CONSUMPTIONCAP", "audiobook/consumptioncap", 195, "audiobook");
    }

    /* JADX INFO: renamed from: d1 */
    public static cbm0 m90773d1() {
        return m90662N1("CONTEXTMENU_ARTIST", "contextmenu/artist", 406, "contextmenu");
    }

    /* JADX INFO: renamed from: d2 */
    public static cbm0 m90774d2() {
        return m90662N1("HOME_PODCASTS_VIDEOS", "home/podcasts-videos", 786, "home");
    }

    /* JADX INFO: renamed from: d3 */
    public static cbm0 m90775d3() {
        return m90662N1("MUTUAL_FOLLOW_SEND_MESSAGE_SHEET", "mutual-follow-send-message-sheet", 1295, "mutual-follow-send-message-sheet");
    }

    /* JADX INFO: renamed from: d4 */
    public static cbm0 m90776d4() {
        return m90662N1("PODCASTCHARTS_CATEGORIES", "podcastcharts/categories", 1456, "podcastcharts");
    }

    /* JADX INFO: renamed from: d5 */
    public static cbm0 m90777d5() {
        return m90662N1("SETTINGS_ADS", "settings/ads", 1749, "settings");
    }

    /* JADX INFO: renamed from: d6 */
    public static cbm0 m90778d6() {
        return m90662N1("WATCHFEED", "watchfeed", 2049, "watchfeed");
    }

    /* JADX INFO: renamed from: e0 */
    public static cbm0 m90779e0() {
        return m90662N1("AUDIOBOOK_DIRECTSALES_INAPPWEBCHECKOUTOVERLAY", "audiobook/directsales/inappwebcheckoutoverlay", 196, "audiobook");
    }

    /* JADX INFO: renamed from: e1 */
    public static cbm0 m90780e1() {
        return m90662N1("CONTEXTMENU_AUTHOR", "contextmenu/author", 409, "contextmenu");
    }

    /* JADX INFO: renamed from: e2 */
    public static cbm0 m90781e2() {
        return m90662N1("HOME_TRENDING", "home/trending", 787, "home");
    }

    /* JADX INFO: renamed from: e3 */
    public static cbm0 m90782e3() {
        return m90662N1("NAVIGATION_BOTTOMSHEET", "navigation/bottomsheet", 1296, d6n0.f45729b);
    }

    /* JADX INFO: renamed from: e4 */
    public static cbm0 m90783e4() {
        return m90662N1("PODCASTCHARTS_CHART", "podcastcharts/chart", 1457, "podcastcharts");
    }

    /* JADX INFO: renamed from: e5 */
    public static cbm0 m90784e5() {
        return m90662N1("SETTINGS_APP_ICON", "settings/app-icon", 1750, "settings");
    }

    /* JADX INFO: renamed from: e6 */
    public static cbm0 m90785e6() {
        return m90662N1("WATCHFEEDPIVOTS", "watchfeedpivots", 2051, "watchfeedpivots");
    }

    /* JADX INFO: renamed from: f0 */
    public static cbm0 m90786f0() {
        return m90662N1("AUDIOBOOK_SUPPLEMENTARYMATERIAL", "audiobook/supplementarymaterial", 201, "audiobook");
    }

    /* JADX INFO: renamed from: f1 */
    public static cbm0 m90787f1() {
        return m90662N1("CONTEXTMENU_DJLANGUAGESETTINGS", "contextmenu/djlanguagesettings", 411, "contextmenu");
    }

    /* JADX INFO: renamed from: f2 */
    public static cbm0 m90788f2() {
        return m90662N1("HOME_UNKNOWN", "home/unknown", 788, "home");
    }

    /* JADX INFO: renamed from: f3 */
    public static cbm0 m90789f3() {
        return m90662N1("NOTIFICATIONS_CENTER", "notifications-center", 1302, "notifications-center");
    }

    /* JADX INFO: renamed from: f4 */
    public static cbm0 m90790f4() {
        return m90662N1("PODCASTCHARTS_REGIONS", "podcastcharts/regions", 1458, "podcastcharts");
    }

    /* JADX INFO: renamed from: f5 */
    public static cbm0 m90791f5() {
        return m90662N1("SETTINGS_BUSINESS_INFORMATION", "settings/business-information", 1752, "settings");
    }

    /* JADX INFO: renamed from: f6 */
    public static cbm0 m90792f6() {
        return m90662N1("WATCHFEED_WRAPPED", "watchfeed-wrapped", 2050, "watchfeed-wrapped");
    }

    /* JADX INFO: renamed from: g0 */
    public static cbm0 m90793g0() {
        return m90662N1("AUTHOR", "author", 204, "author");
    }

    /* JADX INFO: renamed from: g1 */
    public static cbm0 m90794g1() {
        return m90662N1("CONTEXTMENU_ENTITYSEGMENTS", "contextmenu/entitysegments", 415, "contextmenu");
    }

    /* JADX INFO: renamed from: g2 */
    public static cbm0 m90795g2() {
        return m90662N1("HOME_VIDEOS", "home/videos", 789, "home");
    }

    /* JADX INFO: renamed from: g3 */
    public static cbm0 m90796g3() {
        return m90662N1("NOWPLAYING", "nowplaying", 1305, "nowplaying");
    }

    /* JADX INFO: renamed from: g4 */
    public static cbm0 m90797g4() {
        return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT", "premium-account-management", 1484, "premium-account-management");
    }

    /* JADX INFO: renamed from: g5 */
    public static cbm0 m90798g5() {
        return m90662N1("SETTINGS_EMPLOYEE_TOOLS", "settings/employee-tools", 1759, "settings");
    }

    /* JADX INFO: renamed from: g6 */
    public static cbm0 m90799g6() {
        return m90662N1("YOURLIBRARY_EPISODES", "yourlibrary/episodes", 2180, "yourlibrary");
    }

    /* JADX INFO: renamed from: h0 */
    public static cbm0 m90800h0() {
        return m90662N1("BACKGROUND", "background", 207, "background");
    }

    /* JADX INFO: renamed from: h1 */
    public static cbm0 m90801h1() {
        return m90662N1("CONTEXTMENU_EPISODE", "contextmenu/episode", 416, "contextmenu");
    }

    /* JADX INFO: renamed from: h2 */
    public static cbm0 m90802h2() {
        return m90662N1("HOME_WRAPPED", "home/wrapped", 790, "home");
    }

    /* JADX INFO: renamed from: h3 */
    public static cbm0 m90803h3() {
        return m90662N1("NOWPLAYING_NOWPLAYINGBAR", "nowplaying/nowplayingbar", 1309, "nowplaying");
    }

    /* JADX INFO: renamed from: h4 */
    public static cbm0 m90804h4() {
        return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_ALL_PLANS", "premium-account-management/all-plans", 1485, "premium-account-management");
    }

    /* JADX INFO: renamed from: h5 */
    public static cbm0 m90805h5() {
        return m90662N1("SETTINGS_EQUALIZER", "settings/equalizer", 1760, "settings");
    }

    /* JADX INFO: renamed from: h6 */
    public static cbm0 m90806h6() {
        return m90662N1("YOURLIBRARY_MESSAGING", "yourlibrary/messaging", 2184, "yourlibrary");
    }

    /* JADX INFO: renamed from: i0 */
    public static cbm0 m90807i0() {
        return m90662N1("BILLING_PAGE", "billing-page", 208, "billing-page");
    }

    /* JADX INFO: renamed from: i1 */
    public static cbm0 m90808i1() {
        return m90662N1("CONTEXTMENU_EPISODE_SLEEPTIMER", "contextmenu/episode/sleeptimer", 417, "contextmenu");
    }

    /* JADX INFO: renamed from: i2 */
    public static cbm0 m90809i2() {
        return m90662N1("IMAGE_PICKER", "image-picker", ContentDeliveryAdvertisementCapability.LINEAR_4DAY, "image-picker");
    }

    /* JADX INFO: renamed from: i3 */
    public static cbm0 m90810i3() {
        return m90662N1("NOWPLAYING_NOWPLAYINGSIDEBAR", "nowplaying/nowplayingsidebar", 1310, "nowplaying");
    }

    /* JADX INFO: renamed from: i4 */
    public static cbm0 m90811i4() {
        return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_AVAILABLE_PLANS", "premium-account-management/available-plans", 1486, "premium-account-management");
    }

    /* JADX INFO: renamed from: i5 */
    public static cbm0 m90812i5() {
        return m90662N1("SETTINGS_LANGUAGES_MUSIC", "settings/languages/music", 1769, "settings");
    }

    /* JADX INFO: renamed from: i6 */
    public static cbm0 m90813i6() {
        return m90662N1("YOURLIBRARY_SEARCH", "yourlibrary/search", 2187, "yourlibrary");
    }

    /* JADX INFO: renamed from: j0 */
    public static cbm0 m90814j0() {
        return m90662N1("BLEND_ENTITY", "blend/entity", AdvertisementType.ON_DEMAND_MID_ROLL, "blend");
    }

    /* JADX INFO: renamed from: j1 */
    public static cbm0 m90815j1() {
        return m90662N1("CONTEXTMENU_PLAYLIST", "contextmenu/playlist", 422, "contextmenu");
    }

    /* JADX INFO: renamed from: j2 */
    public static cbm0 m90816j2() {
        return m90662N1("IMAGEGALLERY", "imagegallery", ContentDeliveryAdvertisementCapability.LINEAR_5DAY, "imagegallery");
    }

    /* JADX INFO: renamed from: j3 */
    public static cbm0 m90817j3() {
        return m90662N1("NOWPLAYING_NOWPLAYINGSIDEBAREMPTY", "nowplaying/nowplayingsidebarempty", 1311, "nowplaying");
    }

    /* JADX INFO: renamed from: j4 */
    public static cbm0 m90818j4() {
        return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS", "premium-account-management/member-details", 1489, "premium-account-management");
    }

    /* JADX INFO: renamed from: j5 */
    public static cbm0 m90819j5() {
        return m90662N1("SETTINGS_NOTIFICATIONS_CATEGORIES", "settings/notifications/categories", 1775, "settings");
    }

    /* JADX INFO: renamed from: j6 */
    public static cbm0 m90820j6() {
        return m90662N1("YOURLIBRARYTAGS_YOURTAGSPAGE", "yourlibrarytags/yourtagspage", 2190, "yourlibrarytags");
    }

    /* JADX INFO: renamed from: k0 */
    public static cbm0 m90821k0() {
        return m90662N1("BLEND_ENTITY_EDITNAME", "blend/entity/editname", AdvertisementType.ON_DEMAND_POST_ROLL, "blend");
    }

    /* JADX INFO: renamed from: k1 */
    public static cbm0 m90822k1() {
        return m90662N1("CONTEXTMENU_REMOTEDOWNLOADS", "contextmenu/remotedownloads", 424, "contextmenu");
    }

    /* JADX INFO: renamed from: k2 */
    public static cbm0 m90823k2() {
        return m90662N1("INAPPMESSAGE_BOTTOMSHEET", "inappmessage/bottomsheet", 811, "inappmessage");
    }

    /* JADX INFO: renamed from: k3 */
    public static cbm0 m90824k3() {
        return m90662N1("NOWPLAYING_PLAYBACKSETTINGS", "nowplaying/playbacksettings", 1312, "nowplaying");
    }

    /* JADX INFO: renamed from: k4 */
    public static cbm0 m90825k4() {
        return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_MEMBER_DETAILS_REMOVE_MEMBER", "premium-account-management/member-details/remove-member", 1490, "premium-account-management");
    }

    /* JADX INFO: renamed from: k5 */
    public static cbm0 m90826k5() {
        return m90662N1("SETTINGS_NOTIFICATIONS_CATEGORY_DETAILS", "settings/notifications/category-details", 1776, "settings");
    }

    /* JADX INFO: renamed from: k6 */
    public static cbm0 m90827k6() {
        return m90662N1("YOUR_PREMIUM", "your-premium", 2172, "your-premium");
    }

    /* JADX INFO: renamed from: l0 */
    public static cbm0 m90828l0() {
        return m90662N1("BLEND_ENTITY_MEMBERS", "blend/entity/members", 214, "blend");
    }

    /* JADX INFO: renamed from: l1 */
    public static cbm0 m90829l1() {
        return m90662N1("CONTEXTMENU_SHOW", "contextmenu/show", 427, "contextmenu");
    }

    /* JADX INFO: renamed from: l2 */
    public static cbm0 m90830l2() {
        return m90662N1("INAPPMESSAGE_FULLSCREEN", "inappmessage/fullscreen", 813, "inappmessage");
    }

    /* JADX INFO: renamed from: l3 */
    public static cbm0 m90831l3() {
        return m90662N1("NOWPLAYING_VIDEOSETTINGS", "nowplaying/videosettings", 1316, "nowplaying");
    }

    /* JADX INFO: renamed from: l4 */
    public static cbm0 m90832l4() {
        return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_REGULAR_MEMBER_SUB_ACCOUNT_DETAILS_VIDEO_SETTINGS", "premium-account-management/regular-member-sub-account-details/video-settings", 1494, "premium-account-management");
    }

    /* JADX INFO: renamed from: l5 */
    public static cbm0 m90833l5() {
        return m90662N1("SETTINGS_SEARCH", "settings/search", 1785, "settings");
    }

    /* JADX INFO: renamed from: m0 */
    public static cbm0 m90834m0() {
        return m90662N1("BLEND_INVITATION", "blend/invitation", 216, "blend");
    }

    /* JADX INFO: renamed from: m1 */
    public static cbm0 m90835m1() {
        return m90662N1("CONTEXTMENU", "contextmenu", WindowState.MAXIMIZED, "contextmenu");
    }

    /* JADX INFO: renamed from: m2 */
    public static cbm0 m90836m2() {
        return m90662N1("INAPPMESSAGE_HTML_FULLSCREEN", "inappmessage/html-fullscreen", 814, "inappmessage");
    }

    /* JADX INFO: renamed from: m3 */
    public static cbm0 m90837m3() {
        return m90662N1("ON_DEMAND_TRIAL_OPT_IN_UPSELL", "on-demand-trial/opt-in-upsell", 1328, "on-demand-trial");
    }

    /* JADX INFO: renamed from: m4 */
    public static cbm0 m90838m4() {
        return m90662N1("PREMIUM_ACCOUNT_MANAGEMENT_SUB_ACCOUNT_ALLOCATION_REQUEST_DIALOG", "premium-account-management/sub-account-allocation-request-dialog", 1495, "premium-account-management");
    }

    /* JADX INFO: renamed from: m5 */
    public static cbm0 m90839m5() {
        return m90662N1("SETTINGS_THIRD_PARTY_LIBRARIES", "settings/third-party-libraries", 1789, "settings");
    }

    /* JADX INFO: renamed from: n0 */
    public static cbm0 m90840n0() {
        return m90662N1("BLEND_TASTE_MATCH", "blend/taste-match", 219, "blend");
    }

    /* JADX INFO: renamed from: n1 */
    public static cbm0 m90841n1() {
        return m90662N1("CONTRIBUTION_NOTES_DETAIL", "contribution/notes-detail", 434, "contribution");
    }

    /* JADX INFO: renamed from: n2 */
    public static cbm0 m90842n2() {
        return m90662N1("INAPPMESSAGE_HTML_MODAL", "inappmessage/html-modal", 815, "inappmessage");
    }

    /* JADX INFO: renamed from: n3 */
    public static cbm0 m90843n3() {
        return m90662N1("ON_DEMAND_TRIAL_PLAN_OVERVIEW", "on-demand-trial/plan-overview", 1329, "on-demand-trial");
    }

    /* JADX INFO: renamed from: n4 */
    public static cbm0 m90844n4() {
        return m90662N1("PREMIUM_DESTINATION", "premium-destination", 1497, "premium-destination");
    }

    /* JADX INFO: renamed from: n5 */
    public static cbm0 m90845n5() {
        return m90662N1("SETTINGS_YOUR_LIBRARY", "settings/your-library", 1793, "settings");
    }

    /* JADX INFO: renamed from: o0 */
    public static cbm0 m90846o0() {
        return m90662N1("BLUEJAY_CONFIRM", "bluejay/confirm", 222, "bluejay");
    }

    /* JADX INFO: renamed from: o1 */
    public static cbm0 m90847o1() {
        return m90662N1("CONTRIBUTION_NOTES_MANAGE_MENU", "contribution/notes-manage-menu", 435, "contribution");
    }

    /* JADX INFO: renamed from: o2 */
    public static cbm0 m90848o2() {
        return m90662N1("INAPPMESSAGE_MODAL", "inappmessage/modal", 816, "inappmessage");
    }

    /* JADX INFO: renamed from: o3 */
    public static cbm0 m90849o3() {
        return m90662N1("PAGE_MATCH_LANDING", "page-match/landing", 1343, "page-match");
    }

    /* JADX INFO: renamed from: o4 */
    public static cbm0 m90850o4() {
        return m90662N1("PREMIUM_SIGNUP", "premium-signup", 1502, "premium-signup");
    }

    /* JADX INFO: renamed from: o5 */
    public static cbm0 m90851o5() {
        return m90662N1("SHOWS_AUDIO", "shows/audio", 1810, "shows");
    }

    /* JADX INFO: renamed from: p0 */
    public static cbm0 m90852p0() {
        return m90662N1("BLUEJAY_CONNECTOR_APPS", "bluejay/connector-apps", 223, "bluejay");
    }

    /* JADX INFO: renamed from: p1 */
    public static cbm0 m90853p1() {
        return m90662N1("CONTRIBUTION_NOTES_MANAGE_PICKER", "contribution/notes-manage-picker", 436, "contribution");
    }

    /* JADX INFO: renamed from: p2 */
    public static cbm0 m90854p2() {
        return m90662N1("INAPPMESSAGE_WEBVIEW", "inappmessage/webview", 817, "inappmessage");
    }

    /* JADX INFO: renamed from: p3 */
    public static cbm0 m90855p3() {
        return m90662N1("PAGE_MATCH_ONBOARDING", "page-match/onboarding", 1344, "page-match");
    }

    /* JADX INFO: renamed from: p4 */
    public static cbm0 m90856p4() {
        return m90662N1("PRERELEASE", "prerelease", 1505, "prerelease");
    }

    /* JADX INFO: renamed from: p5 */
    public static cbm0 m90857p5() {
        return m90662N1("SHUFFLE_TOGGLE_UPSELL", "shuffle-toggle-upsell", 1821, "shuffle-toggle-upsell");
    }

    /* JADX INFO: renamed from: q */
    public static final void m90858q(int i, int i2, fyf fyfVar, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        xq00 xq00Var2;
        xq00Var.m91775k0(1721507927);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            if (i4 != 0) {
                fxh0Var = cxh0Var;
            }
            xq00Var2 = xq00Var;
            iyg1.m51914a(mi21.m61822f(1.0f, cxh0Var), d7f0.f46168f, rkk.m75772x(-1353905875, new eib(11, fxh0Var, fyfVar), xq00Var), xq00Var2, 3072, 4);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new eaf(i, i2, 0, fyfVar, fxh0Var);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static cbm0 m90859q0() {
        return m90662N1("BLUEJAY_CONNECTOR_APPS_AUTHENTICATION", "bluejay/connector-apps-authentication", 224, "bluejay");
    }

    /* JADX INFO: renamed from: q1 */
    public static cbm0 m90860q1() {
        return m90662N1("CONTRIBUTION_NOTES_MANAGEMENT", "contribution/notes-management", 437, "contribution");
    }

    /* JADX INFO: renamed from: q2 */
    public static cbm0 m90861q2() {
        return m90662N1("INAPPUSERFEEDBACK_BOTTOMSHEET", "inappuserfeedback/bottomsheet", 818, "inappuserfeedback");
    }

    /* JADX INFO: renamed from: q3 */
    public static cbm0 m90862q3() {
        return m90662N1("PARENTAL_CONTROL_ACCOUNT_DETAILS", "parental-control/account-details", 1349, "parental-control");
    }

    /* JADX INFO: renamed from: q4 */
    public static cbm0 m90863q4() {
        return m90662N1("PROACTIVE_PLATFORMS_COVER_SCREEN_WIDGET", "proactive-platforms/cover-screen-widget", 1507, "proactive-platforms");
    }

    /* JADX INFO: renamed from: q5 */
    public static cbm0 m90864q5() {
        return m90662N1("SIGNUP_ACCOUNTALREADYEXISTS", "signup/accountalreadyexists", 1824, "signup");
    }

    /* JADX INFO: renamed from: r */
    public static final void m90865r(int i, j4m0 j4m0Var, qf40 qf40Var, izb izbVar, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        boolean z;
        xq00Var.m91775k0(-2077989135);
        ug5 ug5Var = xq00Var.f264811a;
        int i3 = i2 | (xq00Var.m91762e(edb.m38547C(i)) ? 4 : 2) | (xq00Var.m91766g(j4m0Var) ? 32 : 16) | (xq00Var.m91766g(qf40Var) ? 256 : 128) | (xq00Var.m91766g(izbVar) ? 2048 : 1024) | (xq00Var.m91770i(gh00Var) ? 16384 : 8192) | 196608;
        if (xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            f4j0 f4j0Var = new f4j0(qf40Var, j4m0Var, izbVar, gh00Var);
            int iM38547C = edb.m38547C(i);
            cxh0 cxh0Var = cxh0.f43038a;
            if (iM38547C == 0) {
                xq00Var.m91771i0(1865141008);
                View viewM90661N0 = m90661N0((View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f));
                if (viewM90661N0 == null || viewM90661N0.getLayoutParams().width == -1) {
                    z = false;
                    xq00Var.m91771i0(1865769812);
                    sgg1.m78059c(f4j0Var, p271.m68916s(1, mi21.m61822f(1.0f, cxh0Var)), xq00Var, 0);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1865878808);
                    fxh0 fxh0VarM68916s = p271.m68916s(1, mi21.m61822f(1.0f, cxh0Var));
                    irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46141L0, xq00Var, 0);
                    int iHashCode = Long.hashCode(xq00Var.f264809T);
                    wpn0 wpn0VarM91778m = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM68916s);
                    soh.f211194A.getClass();
                    C2087le c2087le = roh.f201257b;
                    if (ug5Var == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(c2087le);
                    } else {
                        xq00Var.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
                    zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                    zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                    zsf1.m96833D(roh.f201266k, xq00Var);
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                    if (1.0f <= 0.0d) {
                        kt40.m57301a("invalid weight; must be greater than zero");
                    }
                    f4j0Var.m40733a(rkk.m75772x(-510494686, new d9i0(new cr70(1.0f, true), 11), xq00Var), xq00Var, 6);
                    xq00Var.m91788r(true);
                    z = false;
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(z);
            } else {
                if (iM38547C != 1) {
                    throw lq51.m59703i(-909671122, xq00Var, false);
                }
                xq00Var.m91771i0(-909670880);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarM61822f);
                soh.f211194A.getClass();
                C2087le c2087le2 = roh.f201257b;
                if (ug5Var == null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le2);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var);
                f4j0Var.m40733a(zvg.f286705a, xq00Var, 6);
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
            }
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vy40(i, j4m0Var, qf40Var, izbVar, gh00Var, fxh0Var2, i2);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static cbm0 m90866r0() {
        return m90662N1("BLUEJAY_SKIP_FORWARD", "bluejay/skip-forward", AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, "bluejay");
    }

    /* JADX INFO: renamed from: r1 */
    public static cbm0 m90867r1() {
        return m90662N1("CONTRIBUTION_NOTES_REPORT_ACTION", "contribution/notes-report-action", 439, "contribution");
    }

    /* JADX INFO: renamed from: r2 */
    public static cbm0 m90868r2() {
        return m90662N1("INAPPUSERFEEDBACK_JOURNEY", "inappuserfeedback/journey", 819, "inappuserfeedback");
    }

    /* JADX INFO: renamed from: r3 */
    public static cbm0 m90869r3() {
        return m90662N1("PARENTAL_CONTROL_ACCOUNT_DETAILS_VIDEO_SETTINGS", "parental-control/account-details/video-settings", 1351, "parental-control");
    }

    /* JADX INFO: renamed from: r4 */
    public static cbm0 m90870r4() {
        return m90662N1("PROACTIVE_PLATFORMS_NPV_WIDGET", "proactive-platforms/npv-widget", 1511, "proactive-platforms");
    }

    /* JADX INFO: renamed from: r5 */
    public static cbm0 m90871r5() {
        return m90662N1("SIGNUP_EMAIL", "signup/email", 1830, "signup");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    /* JADX WARN: Code duplicated, block: B:75:0x0164  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX INFO: renamed from: s */
    public static final void m90872s(String str, boolean z, boolean z2, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        int i2;
        int i3;
        String strM12k;
        int i4;
        int i5;
        String strM54977L;
        String strM54977L2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object susVar;
        String str2;
        String str3;
        float f;
        float f2;
        float f3;
        j4m0 j4m0Var;
        float f4;
        float f5;
        float f6;
        float f7;
        String str4 = str;
        boolean z8 = z2;
        xq00Var.m91775k0(1219926411);
        int i6 = i | (xq00Var.m91766g(str4) ? 4 : 2) | (xq00Var.m91768h(z) ? 32 : 16) | (xq00Var.m91768h(z8) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var2) ? 16384 : 8192) | 196608;
        if (xq00Var.m91752Y(i6 & 1, (74899 & i6) != 74898)) {
            if (z8) {
                i2 = -176781758;
                i3 = R.string.bluejay_location_your_location;
            } else {
                if (str4 != null) {
                    xq00Var.m91771i0(-176779016);
                    xq00Var.m91788r(false);
                    strM12k = str4;
                } else {
                    i2 = -176778084;
                    i3 = R.string.bluejay_location_not_set;
                }
                if (z8) {
                    i4 = -176774268;
                    i5 = R.string.bluejay_location_finding_current;
                } else if (z) {
                    i4 = -176771578;
                    i5 = R.string.bluejay_location_selected_location;
                } else {
                    i4 = -176769211;
                    i5 = R.string.bluejay_location_current_location;
                }
                String strM12k2 = AbstractC0000a.m12k(xq00Var, i4, i5, xq00Var, false);
                strM54977L = k0e1.m54977L(R.string.bluejay_location_clear, xq00Var);
                strM54977L2 = k0e1.m54977L(R.string.bluejay_location_use_current, xq00Var);
                cxh0 cxh0Var = cxh0.f43038a;
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                if ((i6 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i6 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean zM91766g = z3 | z4 | xq00Var.m91766g(strM54977L2);
                if ((i6 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zM91766g2 = zM91766g | z5 | xq00Var.m91766g(strM54977L);
                if ((i6 & 57344) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zM91766g2 | z6;
                Object objM91750T = xq00Var.m91750T();
                if (!z7 || objM91750T == t6x0.f217647t) {
                    str2 = strM54977L;
                    str3 = strM54977L2;
                    susVar = new sus(z8, str4, str3, str2, eh00Var, eh00Var2, 3);
                    xq00Var.m91793t0(susVar);
                } else {
                    susVar = objM91750T;
                    str2 = strM54977L;
                    str3 = strM54977L2;
                }
                fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM61822f, true, (gh00) susVar);
                vju vjuVar = vju.f242057e;
                f = leu.m58816b(xq00Var).f117230b.f224759b;
                f2 = leu.m58816b(xq00Var).f117230b.f224762e;
                f3 = leu.m58816b(xq00Var).f117230b.f224761d;
                float f8 = leu.m58816b(xq00Var).f117230b.f224762e;
                j4m0Var = new j4m0(f8, f8, f8, f8);
                f4 = leu.m58816b(xq00Var).f117230b.f224758a;
                if ((30 & 1) != 0) {
                    f5 = f;
                } else {
                    f5 = f4;
                }
                if ((30 & 2) != 0) {
                    f6 = f2;
                } else {
                    f6 = 0.0f;
                }
                if ((30 & 4) != 0) {
                    f7 = f3;
                } else {
                    f7 = 0.0f;
                }
                if ((30 & 8) == 0) {
                    j4m0Var = null;
                }
                str4 = str;
                z8 = z2;
                s800.m77433g(fxh0VarM96644b, vjuVar, new nhu(f5, f6, f7, j4m0Var, khu.f122729a), null, null, null, null, null, null, null, y6h.f269785a, null, rkk.m75772x(-1424216270, new ylm0(strM12k2, 23), xq00Var), rkk.m75772x(-417293581, new xs1(4, str4, str3, str2, eh00Var, eh00Var2, z2), xq00Var), null, null, rkk.m75772x(-1691492810, new msx(strM12k, str4, z8), xq00Var), xq00Var, 12583424, 1576326, 52088);
                fxh0Var2 = cxh0Var;
            }
            strM12k = AbstractC0000a.m12k(xq00Var, i2, i3, xq00Var, false);
            if (z8) {
                i4 = -176774268;
                i5 = R.string.bluejay_location_finding_current;
            } else if (z) {
                i4 = -176771578;
                i5 = R.string.bluejay_location_selected_location;
            } else {
                i4 = -176769211;
                i5 = R.string.bluejay_location_current_location;
            }
            String strM12k3 = AbstractC0000a.m12k(xq00Var, i4, i5, xq00Var, false);
            strM54977L = k0e1.m54977L(R.string.bluejay_location_clear, xq00Var);
            strM54977L2 = k0e1.m54977L(R.string.bluejay_location_use_current, xq00Var);
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61822f2 = mi21.m61822f(1.0f, cxh0Var2);
            if ((i6 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i6 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zM91766g3 = z3 | z4 | xq00Var.m91766g(strM54977L2);
            if ((i6 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zM91766g4 = zM91766g3 | z5 | xq00Var.m91766g(strM54977L);
            if ((i6 & 57344) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zM91766g4 | z6;
            Object objM91750T2 = xq00Var.m91750T();
            if (z7) {
                str2 = strM54977L;
                str3 = strM54977L2;
                susVar = new sus(z8, str4, str3, str2, eh00Var, eh00Var2, 3);
                xq00Var.m91793t0(susVar);
            } else {
                str2 = strM54977L;
                str3 = strM54977L2;
                susVar = new sus(z8, str4, str3, str2, eh00Var, eh00Var2, 3);
                xq00Var.m91793t0(susVar);
            }
            fxh0 fxh0VarM96644b2 = zoz0.m96644b(fxh0VarM61822f2, true, (gh00) susVar);
            vju vjuVar2 = vju.f242057e;
            f = leu.m58816b(xq00Var).f117230b.f224759b;
            f2 = leu.m58816b(xq00Var).f117230b.f224762e;
            f3 = leu.m58816b(xq00Var).f117230b.f224761d;
            float f9 = leu.m58816b(xq00Var).f117230b.f224762e;
            j4m0Var = new j4m0(f9, f9, f9, f9);
            f4 = leu.m58816b(xq00Var).f117230b.f224758a;
            if ((30 & 1) != 0) {
                f5 = f;
            } else {
                f5 = f4;
            }
            if ((30 & 2) != 0) {
                f6 = f2;
            } else {
                f6 = 0.0f;
            }
            if ((30 & 4) != 0) {
                f7 = f3;
            } else {
                f7 = 0.0f;
            }
            if ((30 & 8) == 0) {
                j4m0Var = null;
            }
            str4 = str;
            z8 = z2;
            s800.m77433g(fxh0VarM96644b2, vjuVar2, new nhu(f5, f6, f7, j4m0Var, khu.f122729a), null, null, null, null, null, null, null, y6h.f269785a, null, rkk.m75772x(-1424216270, new ylm0(strM12k3, 23), xq00Var), rkk.m75772x(-417293581, new xs1(4, str4, str3, str2, eh00Var, eh00Var2, z2), xq00Var), null, null, rkk.m75772x(-1691492810, new msx(strM12k, str4, z8), xq00Var), xq00Var, 12583424, 1576326, 52088);
            fxh0Var2 = cxh0Var2;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tkz0(str4, z, z8, eh00Var, eh00Var2, fxh0Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static cbm0 m90873s0() {
        return m90662N1("BLUEJAY_VOICE_PICKER", "bluejay/voice-picker", AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, "bluejay");
    }

    /* JADX INFO: renamed from: s1 */
    public static cbm0 m90874s1() {
        return m90662N1("CONTRIBUTION_NOTES_REPORT_PICKER", "contribution/notes-report-picker", 440, "contribution");
    }

    /* JADX INFO: renamed from: s2 */
    public static cbm0 m90875s2() {
        return m90662N1("JAM_PENDINGREQUESTSSHEET", "jam/pendingrequestssheet", 845, "jam");
    }

    /* JADX INFO: renamed from: s3 */
    public static cbm0 m90876s3() {
        return m90662N1("PARENTAL_CONTROL_DELETE_ACCOUNT", "parental-control/delete-account", 1352, "parental-control");
    }

    /* JADX INFO: renamed from: s4 */
    public static cbm0 m90877s4() {
        return m90662N1("PROFILE", "profile", 1514, "profile");
    }

    /* JADX INFO: renamed from: s5 */
    public static cbm0 m90878s5() {
        return m90662N1("SIGNUP_SIGNUPUNAVAILABLE", "signup/signupunavailable", 1837, "signup");
    }

    /* JADX INFO: renamed from: t */
    public static final void m90879t(o6b1 o6b1Var, gh00 gh00Var, fxh0 fxh0Var, dl90 dl90Var, xre xreVar, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(444809690);
        int i2 = i | (xq00Var.m91766g(o6b1Var) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | 384 | (xq00Var.m91770i(dl90Var) ? 2048 : 1024) | (xq00Var.m91766g(xreVar) ? 16384 : 8192);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            boolean z = ((i2 & 57344) == 16384) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ho7(gh00Var, xreVar, 4);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0Var2 = cxh0Var;
            p711.m69222a(fxh0VarM61822f, new kyu(0, null, 3, new j4m0(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224761d, 0, leu.m58816b(xq00Var).f117230b.f224761d), null, jyu.m54818a(frz0.m42535t(1, 3, xq00Var), leu.m58816b(xq00Var).f117230b.f224758a, 0.0f, 6), null, 1, null, 339), null, false, null, null, new peu(u40.f226523c, (eh00) objM91750T), null, null, rkk.m75772x(-597138799, new q6b1(o6b1Var, 0), xq00Var), null, rkk.m75772x(-785907438, new q6b1(o6b1Var, 1), xq00Var), rkk.m75772x(704661267, new o781(6, dl90Var, o6b1Var), xq00Var), null, null, rkk.m75772x(881400086, new q6b1(o6b1Var, 2), xq00Var), xq00Var, 805306432, 197040, 26044);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lpa1(o6b1Var, gh00Var, fxh0Var2, dl90Var, xreVar, i);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static cbm0 m90880t0() {
        return m90662N1("CACHED_FILES", "cached-files", 257, "cached-files");
    }

    /* JADX INFO: renamed from: t1 */
    public static cbm0 m90881t1() {
        return m90662N1("CREATEMENU", "createmenu", 449, "createmenu");
    }

    /* JADX INFO: renamed from: t2 */
    public static cbm0 m90882t2() {
        return m90662N1("KID_ACCOUNT_CREATION_AGE_VERIFICATION", "kid-account-creation/age-verification", 850, "kid-account-creation");
    }

    /* JADX INFO: renamed from: t3 */
    public static cbm0 m90883t3() {
        return m90662N1("PARENTAL_CONTROL_LOGIN_CHOICE", "parental-control/login-choice", 1353, "parental-control");
    }

    /* JADX INFO: renamed from: t4 */
    public static cbm0 m90884t4() {
        return m90662N1("PROFILE_EDIT", "profile/edit", 1521, "profile");
    }

    /* JADX INFO: renamed from: t5 */
    public static cbm0 m90885t5() {
        return m90662N1("SLEEP_TIMER_NUDGE", "sleep-timer-nudge", 1841, "sleep-timer-nudge");
    }

    /* JADX INFO: renamed from: u */
    public static cbm0 m90886u() {
        return m90662N1("AAA_CON", "aaa/con", 0, "aaa");
    }

    /* JADX INFO: renamed from: u0 */
    public static cbm0 m90887u0() {
        return m90662N1("CHANGEPIN", "changepin", 294, "changepin");
    }

    /* JADX INFO: renamed from: u1 */
    public static cbm0 m90888u1() {
        return m90662N1("CULTURALMOMENTSHUB", "culturalmomentshub", 453, "culturalmomentshub");
    }

    /* JADX INFO: renamed from: u2 */
    public static cbm0 m90889u2() {
        return m90662N1("KID_ACCOUNT_CREATION_SUBMIT", "kid-account-creation/submit", 859, "kid-account-creation");
    }

    /* JADX INFO: renamed from: u3 */
    public static cbm0 m90890u3() {
        return m90662N1("PARENTAL_CONTROL_LOGIN_CURRENT_DEVICE", "parental-control/login-current-device", 1354, "parental-control");
    }

    /* JADX INFO: renamed from: u4 */
    public static cbm0 m90891u4() {
        return m90662N1("PROFILE_EDIT_BIO", "profile/edit/bio", 1522, "profile");
    }

    /* JADX INFO: renamed from: u5 */
    public static cbm0 m90892u5() {
        return m90662N1("SMARTSHUFFLE_PLAYMODEPICKER", "smartshuffle/playmodepicker", 1843, "smartshuffle");
    }

    /* JADX INFO: renamed from: v */
    public static cbm0 m90893v() {
        return m90662N1("AAA_CON_T", "aaa/con/t", 1, "aaa");
    }

    /* JADX INFO: renamed from: v0 */
    public static cbm0 m90894v0() {
        return m90662N1("CHAT", "chat", 305, "chat");
    }

    /* JADX INFO: renamed from: v1 */
    public static cbm0 m90895v1() {
        return m90662N1("CULTURALMOMENTS_UPSELL", "culturalmoments/upsell", 452, "culturalmoments");
    }

    /* JADX INFO: renamed from: v2 */
    public static cbm0 m90896v2() {
        return m90662N1("KID_ACCOUNT_TRANSITION_CONSENT", "kid-account-transition/consent", 865, "kid-account-transition");
    }

    /* JADX INFO: renamed from: v3 */
    public static cbm0 m90897v3() {
        return m90662N1("PARENTAL_CONTROL_LOGIN_DIFFERENT_DEVICE", "parental-control/login-different-device", 1355, "parental-control");
    }

    /* JADX INFO: renamed from: v4 */
    public static cbm0 m90898v4() {
        return m90662N1("PROFILE_EDIT_SOCIAL_HANDLE", "profile/edit/social-handle", 1523, "profile");
    }

    /* JADX INFO: renamed from: v5 */
    public static cbm0 m90899v5() {
        return m90662N1("SMARTSHUFFLE_NPVRECOMMENDATIONS_FULLSCREEN", "smartshuffle/npvrecommendations/fullscreen", 1842, "smartshuffle");
    }

    /* JADX INFO: renamed from: w */
    public static cbm0 m90900w() {
        return m90662N1("AAA_T", "aaa/t", 2, "aaa");
    }

    /* JADX INFO: renamed from: w0 */
    public static cbm0 m90901w0() {
        return m90662N1("CHAT_ADD_FRIENDS", "chat/add-friends", 307, "chat");
    }

    /* JADX INFO: renamed from: w1 */
    public static cbm0 m90902w1() {
        return m90662N1("CUSTOM_REACTIONS_PICKER", "custom-reactions-picker", 454, "custom-reactions-picker");
    }

    /* JADX INFO: renamed from: w2 */
    public static cbm0 m90903w2() {
        return m90662N1("KID_ACCOUNT_TRANSITION_SUBMIT", "kid-account-transition/submit", 873, "kid-account-transition");
    }

    /* JADX INFO: renamed from: w3 */
    public static cbm0 m90904w3() {
        return m90662N1("PARENTAL_CONTROL_MANAGE_CONTENT", "parental-control/manage-content", 1362, "parental-control");
    }

    /* JADX INFO: renamed from: w4 */
    public static cbm0 m90905w4() {
        return m90662N1("PROFILE_IMAGE_PICKER", "profile/image-picker", 1529, "profile");
    }

    /* JADX INFO: renamed from: w5 */
    public static cbm0 m90906w5() {
        return m90662N1("SNOOZE_RECOMMENDATION", "snooze-recommendation", 1844, "snooze-recommendation");
    }

    /* JADX INFO: renamed from: x */
    public static cbm0 m90907x() {
        return m90662N1("ABOUTENTITY", "aboutEntity", 3, "aboutEntity");
    }

    /* JADX INFO: renamed from: x0 */
    public static cbm0 m90908x0() {
        return m90662N1("CHAT_CONTENT_PICKER", "chat/content-picker", 308, "chat");
    }

    /* JADX INFO: renamed from: x1 */
    public static cbm0 m90909x1() {
        return m90662N1("DATADOWNLOAD", "datadownload", 456, "datadownload");
    }

    /* JADX INFO: renamed from: x2 */
    public static cbm0 m90910x2() {
        return m90662N1("LANGUAGEPICKER_NOSKIPDIALOG", "languagepicker/noskipdialog", 879, "languagepicker");
    }

    /* JADX INFO: renamed from: x3 */
    public static cbm0 m90911x3() {
        return m90662N1("PARENTAL_CONTROL_MY_ALLOWLISTING_REQUESTS", "parental-control/my-allowlisting-requests", 1363, "parental-control");
    }

    /* JADX INFO: renamed from: x4 */
    public static cbm0 m90912x4() {
        return m90662N1("PROFILE_PRIVACY_SETTINGS", "profile/privacy-settings", 1532, "profile");
    }

    /* JADX INFO: renamed from: x5 */
    public static cbm0 m90913x5() {
        return m90662N1("SONG_DNA_UNAVAILABLE", "song-dna-unavailable", 1863, "song-dna-unavailable");
    }

    /* JADX INFO: renamed from: y */
    public static final void m90914y(String str, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1259168681);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91766g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = ek41.f60367X0;
                xq00Var.m91793t0(objM91750T);
            }
            sgu sguVar = new sgu(0, null, null, (th00) objM91750T, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148188d), 7);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            float fM59890l = ltf1.m59890l(R.dimen.suggested_prompt_container_width, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM68893C = p271.m68893C(2, mi21.m61818b(cxh0Var, fM59890l, 0.0f, 2));
            boolean z = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 14) == 4);
            Object objM91750T2 = xq00Var.m91750T();
            if (z || objM91750T2 == ia7Var) {
                objM91750T2 = new myc(gh00Var, str, 11);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var = (eh00) objM91750T2;
            if (wl51.m88460J0(str)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            dyu.m37371c(new peu(new t40(str), eh00Var), sguVar, fxh0VarM68893C, null, null, j4m0Var, null, null, null, null, rkk.m75772x(2126488854, new od21(str, 10), xq00Var), xq00Var, 0, 48, 1976);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new kpb(str, gh00Var, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static cbm0 m90915y0() {
        return m90662N1("CHAT_CONTRIBUTION_MEDIA_GALLERY", "chat/contribution-media-gallery", 309, "chat");
    }

    /* JADX INFO: renamed from: y1 */
    public static cbm0 m90916y1() {
        return m90662N1("DEBUG", "debug", 459, "debug");
    }

    /* JADX INFO: renamed from: y2 */
    public static cbm0 m90917y2() {
        return m90662N1("LISTENINGACTIVITY_AUDIENCESETTING", "listeningactivity/audiencesetting", 886, "listeningactivity");
    }

    /* JADX INFO: renamed from: y3 */
    public static cbm0 m90918y3() {
        return m90662N1("PARENTAL_CONTROL_REVIEW_ALLOWLISTING_REQUESTS", "parental-control/review-allowlisting-requests", 1366, "parental-control");
    }

    /* JADX INFO: renamed from: y4 */
    public static cbm0 m90919y4() {
        return m90662N1("PROFILE_PRONOUNS", "profile/pronouns", 1533, "profile");
    }

    /* JADX INFO: renamed from: y5 */
    public static cbm0 m90920y5() {
        return m90662N1("SSO_PARTNERACCOUNTLINKING", "sso/partneraccountlinking", 1911, "sso");
    }

    /* JADX INFO: renamed from: z */
    public static final void m90921z(int i, String str, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(2141699044);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            float f = leu.m58816b(xq00Var).f117235g.f159608f;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM75068p = r9g1.m75068p(mi21.m61834r(f, cxh0Var), hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b));
            Uri uri = Uri.parse(str);
            xyu xyuVarM55216r = k2z0.m55216r(aru.f19145c, 0L, 0L, xq00Var, aru.f19146d, 30);
            l0y0.m57821c(uri, qgj.f188480a, fxh0VarM75068p, null, null, null, null, null, null, new cxu(xyuVarM55216r, xyuVarM55216r), false, false, xq00Var, 1073766448, 0, 3560);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new w941(str, fxh0Var2, i, 5);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static cbm0 m90922z0() {
        return m90662N1("CHAT_DETAILS", "chat/details", 310, "chat");
    }

    /* JADX INFO: renamed from: z1 */
    public static cbm0 m90923z1() {
        return m90662N1("DIALOG_CONNECT_PLAYBACK_ERROR", "dialog/connect/playback/error", 463, "dialog");
    }

    /* JADX INFO: renamed from: z2 */
    public static cbm0 m90924z2() {
        return m90662N1("LISTENINGACTIVITY_ONBOARDING", "listeningactivity/onboarding", 890, "listeningactivity");
    }

    /* JADX INFO: renamed from: z3 */
    public static cbm0 m90925z3() {
        return m90662N1("PARENTAL_CONTROL_UPDATE_BIRTHDAY", "parental-control/update-birthday", 1367, "parental-control");
    }

    /* JADX INFO: renamed from: z4 */
    public static cbm0 m90926z4() {
        return m90662N1("PROMODISCLOSURE", "promodisclosure", 1537, "promodisclosure");
    }

    /* JADX INFO: renamed from: z5 */
    public static cbm0 m90927z5() {
        return m90662N1("START_CHOOSELOGIN", "start/chooselogin", 1913, "start");
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: h */
    public int mo30952h(dz61 dz61Var) {
        return mo30953j(dz61Var).m24689a(mo26517g(dz61Var), dz61Var);
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: j */
    public a4b1 mo30953j(dz61 dz61Var) {
        if (!(dz61Var instanceof dce)) {
            return dz61Var.mo35642c(this);
        }
        if (mo26516d(dz61Var)) {
            return ((dce) dz61Var).f47538b;
        }
        throw new UnsupportedTemporalTypeException(klh.m56836h("Unsupported field: ", dz61Var));
    }

    @Override // p204p.bz61
    /* JADX INFO: renamed from: k */
    public Object mo26518k(fz61 fz61Var) {
        if (fz61Var == ez61.f64285a || fz61Var == ez61.f64286b || fz61Var == ez61.f64287c) {
            return null;
        }
        return fz61Var.mo24968w(this);
    }
}
