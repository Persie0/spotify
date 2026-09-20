package p204p;

import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontWeight;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class yds {
    /* JADX INFO: renamed from: A */
    public static void m93464A(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77943q(f, f2);
        sepVar.m77927D(f3);
        sepVar.m77942p(f4);
        sepVar.m77937k();
    }

    /* JADX INFO: renamed from: B */
    public static void m93465B(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77945s(f, f2);
        sepVar.m77942p(f3);
        sepVar.m77927D(f4);
    }

    /* JADX INFO: renamed from: C */
    public static void m93466C(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77943q(f, f2);
        sepVar.m77942p(f3);
        sepVar.m77927D(f4);
    }

    /* JADX INFO: renamed from: D */
    public static void m93467D(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77944r(f, f2);
        sepVar.m77944r(f3, f4);
        sepVar.m77937k();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m93468E(int i) {
        if (i == 1) {
            return "FilterRow";
        }
        if (i == 2) {
            return "ClearButton";
        }
        if (i == 3) {
            return "PrimaryFilter";
        }
        if (i == 4) {
            return "SecondaryFilter";
        }
        if (i == 5) {
            return "MoreFilters";
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ String m93469F(int i) {
        switch (i) {
            case 1:
                return "Base";
            case 2:
                return "Tinted";
            case 3:
                return "Elevated";
            case 4:
                return "BrightAccent";
            case 5:
                return "MutedAccent";
            case 6:
                return "Inverted";
            case 7:
                return "InvertedDark";
            case 8:
                return "InvertedLight";
            case 9:
                return "Negative";
            case 10:
                return "NegativeSubdued";
            case 11:
                return "Warning";
            case 12:
                return "WarningSubdued";
            case 13:
                return "Positive";
            case 14:
                return "PositiveSubdued";
            case 15:
                return "Announcement";
            case 16:
                return "AnnouncementSubdued";
            case 17:
                return "AppFrame";
            case 18:
                return "OverMedia";
            case 19:
                return "Inherit";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ int m93470G(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("SpotifyBrand")) {
            return 1;
        }
        if (str.equals("SpotifyBrandAlternate")) {
            return 2;
        }
        if (str.equals("SpotifyBrand2")) {
            return 3;
        }
        if (str.equals("SpotifyBrand2Alternate")) {
            return 4;
        }
        if (str.equals("SpotifyBrand3")) {
            return 5;
        }
        if (str.equals("SpotifyBrand3Alternate")) {
            return 6;
        }
        if (str.equals("Premium")) {
            return 7;
        }
        if (str.equals("PremiumAlternate")) {
            return 8;
        }
        if (str.equals("PremiumDuo")) {
            return 9;
        }
        if (str.equals("PremiumDuoAlternate")) {
            return 10;
        }
        if (str.equals("PremiumStudent")) {
            return 11;
        }
        if (str.equals("PremiumStudentAlternate")) {
            return 12;
        }
        if (str.equals("PremiumFamily")) {
            return 13;
        }
        if (str.equals("PremiumFamilyAlternate")) {
            return 14;
        }
        if (str.equals("BasicTier")) {
            return 15;
        }
        if (str.equals("BasicTierAlternate")) {
            return 16;
        }
        if (str.equals("AudiobooksAccessOnly")) {
            return 17;
        }
        if (str.equals("PremiumFallback")) {
            return 18;
        }
        if (str.equals("PremiumFallbackAlternate")) {
            return 19;
        }
        if (str.equals("SpotifyFree")) {
            return 20;
        }
        if (str.equals("SpotifyFreeAlternate")) {
            return 21;
        }
        if (str.equals("Astro")) {
            return 22;
        }
        if (str.equals("PremiumLiteGBB")) {
            return 23;
        }
        if (str.equals("PremiumLiteGBBAlternate")) {
            return 24;
        }
        if (str.equals("PremiumStandard")) {
            return 25;
        }
        if (str.equals("PremiumStandardAlternate")) {
            return 26;
        }
        if (str.equals("StandardStudent")) {
            return 27;
        }
        if (str.equals("StandardStudentAlternate")) {
            return 28;
        }
        if (str.equals("PremiumPlatinum")) {
            return 29;
        }
        if (str.equals("PremiumPlatinumAlternate")) {
            return 30;
        }
        if (str.equals("PremiumStandardTest")) {
            return 31;
        }
        if (str.equals("PremiumStandardTestAlternate")) {
            return 32;
        }
        if (str.equals("PremiumLiteGBBTest")) {
            return 33;
        }
        if (str.equals("PremiumLiteGBBTestAlternate")) {
            return 34;
        }
        if (str.equals("PremiumPlatinumTest")) {
            return 35;
        }
        if (str.equals("PremiumPlatinumTestAlternate")) {
            return 36;
        }
        if (str.equals("StandardStudentTest")) {
            return 37;
        }
        if (str.equals("StandardStudentTestAlternate")) {
            return 38;
        }
        if (str.equals("PremiumExperimental")) {
            return 39;
        }
        if (str.equals("PremiumExperimentalAlternate")) {
            return 40;
        }
        if (str.equals("PremiumDuoExperimental")) {
            return 41;
        }
        if (str.equals("PremiumDuoExperimentalAlternate")) {
            return 42;
        }
        if (str.equals("PremiumFamilyExperimental")) {
            return 43;
        }
        if (str.equals("PremiumFamilyExperimentalAlternate")) {
            return 44;
        }
        if (str.equals("PremiumStudentExperimental")) {
            return 45;
        }
        if (str.equals("PremiumStudentExperimentalAlternate")) {
            return 46;
        }
        if (str.equals("AudiobooksAccessOnlyExperimental")) {
            return 47;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.encore.theme.EncoreThemeCampaignColorSet.".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public static final float m93471a(int i, xq00 xq00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            xq00Var.m91771i0(484856357);
            float f = leu.m58816b(xq00Var).f117234f.f148185a;
            xq00Var.m91788r(false);
            return f;
        }
        if (iM38547C != 1 && iM38547C != 2) {
            throw lq51.m59703i(484854482, xq00Var, false);
        }
        xq00Var.m91771i0(484858690);
        float f2 = leu.m58816b(xq00Var).f117234f.f148186b;
        xq00Var.m91788r(false);
        return f2;
    }

    /* JADX INFO: renamed from: b */
    public static final float m93472b(int i, xq00 xq00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            xq00Var.m91771i0(1280269053);
            float f = leu.m58816b(xq00Var).f117230b.f224762e;
            xq00Var.m91788r(false);
            return f;
        }
        if (iM38547C == 1) {
            xq00Var.m91771i0(1280270746);
            float f2 = leu.m58816b(xq00Var).f117230b.f224763f;
            xq00Var.m91788r(false);
            return f2;
        }
        if (iM38547C != 2) {
            throw lq51.m59703i(1280267364, xq00Var, false);
        }
        xq00Var.m91771i0(1280272316);
        float f3 = leu.m58816b(xq00Var).f117230b.f224764g;
        xq00Var.m91788r(false);
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public static final float m93473c(int i, xq00 xq00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            xq00Var.m91771i0(1305436221);
            float f = leu.m58816b(xq00Var).f117235g.f159611i;
            xq00Var.m91788r(false);
            return f;
        }
        if (iM38547C == 1) {
            xq00Var.m91771i0(1305438428);
            float f2 = leu.m58816b(xq00Var).f117235g.f159612j;
            xq00Var.m91788r(false);
            return f2;
        }
        if (iM38547C == 2) {
            xq00Var.m91771i0(1305440633);
            float f3 = leu.m58816b(xq00Var).f117235g.f159613k;
            xq00Var.m91788r(false);
            return f3;
        }
        if (iM38547C == 3) {
            xq00Var.m91771i0(1305442715);
            float f4 = leu.m58816b(xq00Var).f117235g.f159614l;
            xq00Var.m91788r(false);
            return f4;
        }
        if (iM38547C == 4) {
            xq00Var.m91771i0(1305444892);
            float f5 = leu.m58816b(xq00Var).f117235g.f159615m;
            xq00Var.m91788r(false);
            return f5;
        }
        if (iM38547C != 5) {
            throw lq51.m59703i(1305434585, xq00Var, false);
        }
        xq00Var.m91771i0(1305447132);
        float f6 = leu.m58816b(xq00Var).f117235g.f159616n;
        xq00Var.m91788r(false);
        return f6;
    }

    /* JADX INFO: renamed from: d */
    public static final float m93474d(int i, xq00 xq00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            xq00Var.m91771i0(38187030);
            float f = leu.m58816b(xq00Var).f117232d.f137887c;
            xq00Var.m91788r(false);
            return f;
        }
        if (iM38547C != 1) {
            throw lq51.m59703i(38185080, xq00Var, false);
        }
        xq00Var.m91771i0(38188761);
        float f2 = leu.m58816b(xq00Var).f117232d.f137886b;
        xq00Var.m91788r(false);
        return f2;
    }

    /* JADX INFO: renamed from: e */
    public static final float m93475e(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 0.67f;
        }
        if (iM38547C == 1) {
            return 0.75f;
        }
        if (iM38547C == 2) {
            return 0.8f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public static final j4m0 m93476f(int i, xq00 xq00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            xq00Var.m91771i0(1312129964);
            j4m0 j4m0VarM96848h = zsf1.m96848h(leu.m58816b(xq00Var).f117230b.f224758a, 0.0f, 2);
            xq00Var.m91788r(false);
            return j4m0VarM96848h;
        }
        if (iM38547C != 1 && iM38547C != 2) {
            throw lq51.m59703i(1312129203, xq00Var, false);
        }
        xq00Var.m91771i0(1312133473);
        float f = leu.m58816b(xq00Var).f117230b.f224759b;
        float f2 = leu.m58816b(xq00Var).f117230b.f224758a;
        j4m0 j4m0Var = new j4m0(f, f2, f, f2);
        xq00Var.m91788r(false);
        return j4m0Var;
    }

    /* JADX INFO: renamed from: g */
    public static final float m93477g(int i, xq00 xq00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            xq00Var.m91771i0(162846642);
            float f = leu.m58816b(xq00Var).f117231c.f127592a;
            xq00Var.m91788r(false);
            return f;
        }
        if (iM38547C == 1) {
            xq00Var.m91771i0(162848498);
            float f2 = leu.m58816b(xq00Var).f117231c.f127592a;
            xq00Var.m91788r(false);
            return f2;
        }
        if (iM38547C == 2) {
            xq00Var.m91771i0(162850382);
            float f3 = leu.m58816b(xq00Var).f117231c.f127593b;
            xq00Var.m91788r(false);
            return f3;
        }
        if (iM38547C == 3) {
            xq00Var.m91771i0(162852110);
            float f4 = leu.m58816b(xq00Var).f117231c.f127593b;
            xq00Var.m91788r(false);
            return f4;
        }
        if (iM38547C == 4) {
            xq00Var.m91771i0(162853871);
            float f5 = leu.m58816b(xq00Var).f117231c.f127594c;
            xq00Var.m91788r(false);
            return f5;
        }
        if (iM38547C != 5) {
            throw lq51.m59703i(162844946, xq00Var, false);
        }
        xq00Var.m91771i0(162855695);
        float f6 = leu.m58816b(xq00Var).f117231c.f127594c;
        xq00Var.m91788r(false);
        return f6;
    }

    /* JADX INFO: renamed from: h */
    public static final if71 m93478h(int i, xq00 xq00Var) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            xq00Var.m91771i0(-1759890197);
            if71 if71VarM50418a = if71.m50418a(leu.m58818d(xq00Var).f64978n, 0L, epv0.m39702v(9), null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777213);
            xq00Var.m91788r(false);
            return if71VarM50418a;
        }
        if (iM38547C == 1) {
            xq00Var.m91771i0(-1759888350);
            if71 if71Var = leu.m58818d(xq00Var).f64978n;
            xq00Var.m91788r(false);
            return if71Var;
        }
        if (iM38547C != 2) {
            throw lq51.m59703i(-1759892013, xq00Var, false);
        }
        xq00Var.m91771i0(-1759886813);
        if71 if71Var2 = leu.m58818d(xq00Var).f64975k;
        xq00Var.m91788r(false);
        return if71Var2;
    }

    /* JADX INFO: renamed from: i */
    public static final jiu m93479i(int i) {
        switch (edb.m38547C(i)) {
            case 0:
                return ygu.f272648a.f209635a;
            case 1:
                return ygu.f272648a.f209636b;
            case 2:
                return ygu.f272648a.f209637c;
            case 3:
                return ygu.f272648a.f209638d;
            case 4:
                return ygu.f272648a.f209639e;
            case 5:
                return ygu.f272648a.f209640f;
            case 6:
                return ygu.f272648a.f209641g;
            case 7:
                return ygu.f272648a.f209642h;
            case 8:
                return ygu.f272648a.f209643i;
            case 9:
                return ygu.f272648a.f209644j;
            case 10:
                return ygu.f272648a.f209645k;
            case 11:
                return ygu.f272648a.f209646l;
            case 12:
                return ygu.f272648a.f209647m;
            case 13:
                return ygu.f272648a.f209648n;
            case 14:
                return ygu.f272648a.f209657w;
            case 15:
                return ygu.f272648a.f209658x;
            case 16:
                return ygu.f272648a.f209650p;
            case 17:
                return ygu.f272648a.f209651q;
            case 18:
                return ygu.f272648a.f209652r;
            case 19:
                return ygu.f272648a.f209653s;
            case 20:
                return ygu.f272648a.f209654t;
            case 21:
                return ygu.f272648a.f209655u;
            case 22:
                return ygu.f272648a.f209610A;
            case 23:
                return ygu.f272648a.f209611B;
            case 24:
                return ygu.f272648a.f209612C;
            case 25:
                return ygu.f272648a.f209613D;
            case 26:
                return ygu.f272648a.f209614E;
            case 27:
                return ygu.f272648a.f209615F;
            case 28:
                return ygu.f272648a.f209616G;
            case 29:
                return ygu.f272648a.f209617H;
            case 30:
                return ygu.f272648a.f209618I;
            case 31:
                return ygu.f272648a.f209619J;
            case 32:
                return ygu.f272648a.f209620K;
            case 33:
                return ygu.f272648a.f209621L;
            case 34:
                return ygu.f272648a.f209622M;
            case 35:
                return ygu.f272648a.f209623N;
            case 36:
                return ygu.f272648a.f209624O;
            case 37:
                return ygu.f272648a.f209625P;
            case 38:
                return ygu.f272648a.f209626Q;
            case 39:
                return ygu.f272648a.f209627R;
            case 40:
                return ygu.f272648a.f209628S;
            case 41:
                return ygu.f272648a.f209629T;
            case 42:
                return ygu.f272648a.f209630U;
            case 43:
                return ygu.f272648a.f209631V;
            case 44:
                return ygu.f272648a.f209632W;
            case 45:
                return ygu.f272648a.f209633X;
            case 46:
                return ygu.f272648a.f209634Y;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final jiu m93480j(int i, xq00 xq00Var) {
        riu riuVar = (riu) xq00Var.m91774k(y0v.f268089a);
        wy41 wy41Var = qiu.f189069a;
        jiu jiuVar = (jiu) xq00Var.m91774k(wy41Var);
        switch (edb.m38547C(i)) {
            case 0:
                xq00Var.m91771i0(-351896720);
                xq00Var.m91788r(false);
                return riuVar.f199616a;
            case 1:
                xq00Var.m91771i0(-351895404);
                xq00Var.m91788r(false);
                jiu jiuVar2 = riuVar.f199616a;
                ufu ufuVar = jiuVar2.f112823a;
                return jiu.m53470a(jiuVar2, ufu.m83024a(ufuVar, ufuVar.f229875b.m56535a(), ufuVar.f229875b.m56536b(), ufuVar.f229875b.m56537c()), null, 14);
            case 2:
                xq00Var.m91771i0(-351893898);
                xq00Var.m91788r(false);
                jiu jiuVar3 = riuVar.f199616a;
                ufu ufuVar2 = jiuVar3.f112823a;
                return jiu.m53470a(jiuVar3, ufu.m83024a(ufuVar2, ufuVar2.f229874a.m56535a(), ufuVar2.f229874a.m56536b(), ufuVar2.f229874a.m56537c()), null, 14);
            case 3:
                xq00Var.m91771i0(-351892360);
                xq00Var.m91788r(false);
                return riuVar.f199617b;
            case 4:
                xq00Var.m91771i0(-351890793);
                xq00Var.m91788r(false);
                return riuVar.f199624i;
            case 5:
                xq00Var.m91771i0(-351889330);
                xq00Var.m91788r(false);
                return ((double) rfg1.m75426A(jiuVar.f112824b.f138757a)) > 0.5d ? riuVar.f199623h : riuVar.f199622g;
            case 6:
                xq00Var.m91771i0(-351884072);
                xq00Var.m91788r(false);
                return riuVar.f199622g;
            case 7:
                xq00Var.m91771i0(-351882439);
                xq00Var.m91788r(false);
                return riuVar.f199623h;
            case 8:
                xq00Var.m91771i0(-351880940);
                xq00Var.m91788r(false);
                return riuVar.f199618c;
            case 9:
                xq00Var.m91771i0(-351879365);
                xq00Var.m91788r(false);
                return riuVar.f199628m;
            case 10:
                xq00Var.m91771i0(-351877837);
                xq00Var.m91788r(false);
                return riuVar.f199619d;
            case 11:
                xq00Var.m91771i0(-351876326);
                xq00Var.m91788r(false);
                return riuVar.f199629n;
            case 12:
                xq00Var.m91771i0(-351874796);
                xq00Var.m91788r(false);
                return riuVar.f199620e;
            case 13:
                xq00Var.m91771i0(-351873221);
                xq00Var.m91788r(false);
                return riuVar.f199630o;
            case 14:
                xq00Var.m91771i0(-351871528);
                xq00Var.m91788r(false);
                return riuVar.f199621f;
            case 15:
                xq00Var.m91771i0(-351869697);
                xq00Var.m91788r(false);
                return riuVar.f199627l;
            case 16:
                xq00Var.m91771i0(-351868012);
                xq00Var.m91788r(false);
                return riuVar.f199625j;
            case 17:
                xq00Var.m91771i0(-351866635);
                xq00Var.m91788r(false);
                return riuVar.f199626k;
            case 18:
                xq00Var.m91771i0(-351865069);
                jiu jiuVar4 = (jiu) xq00Var.m91774k(wy41Var);
                xq00Var.m91788r(false);
                return jiuVar4;
            default:
                throw lq51.m59703i(-351897053, xq00Var, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final FontFamily m93481k(int i, FontWeight fontWeight, int i2, xq00 xq00Var) {
        int i3;
        if (((Boolean) xq00Var.m91774k(pz40.f183596a)).booleanValue()) {
            xq00Var.m91771i0(249206358);
            xq00Var.m91788r(false);
            return i2 == 1 ? FontFamily.f512b : FontFamily.f514d;
        }
        xq00Var.m91771i0(249326917);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            i3 = R.font.spotify_mix_mono_regular;
        } else if (iM38547C == 1) {
            i3 = R.font.spotify_mix_ui_regular;
        } else if (iM38547C == 2) {
            i3 = R.font.spotify_mix_ui_bold;
        } else if (iM38547C == 3) {
            i3 = R.font.spotify_mix_ui_title_bold;
        } else {
            if (iM38547C != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R.font.spotify_mix_ui_title_extrabold;
        }
        FontFamily fontFamilyM42167a = fmu.m42167a(i3, fontWeight, i2, xq00Var);
        xq00Var.m91788r(false);
        return fontFamilyM42167a;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m93482l(int i) {
        switch (i) {
            case 1:
                return "embedded_start";
            case 2:
                return "embedded_end";
            case 3:
                return "expanded_start";
            case 4:
                return "expanded_end";
            case 5:
                return "embedded_loaded";
            case 6:
                return "npv_pause";
            case 7:
                return "npv_refresh";
            case 8:
                return "embedded_viewability";
            case 9:
                return "interrupt";
            case 10:
                return "lost_missing_required_views";
            case 11:
                return "lost_user_left_npv_early";
            case 12:
                return "no_demand_delay_completed";
            case 13:
                return "render_delay_start";
            case 14:
                return "render_delay_complete";
            case 15:
                return "npv_resume";
            case 16:
                return "terminated_on_resume";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m93483m(rcm0 rcm0Var, int i, int i2) {
        return (rcm0Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: n */
    public static Object m93484n(xq00 xq00Var, int i, boolean z, AbstractC1806e9 abstractC1806e9) {
        xq00Var.m91771i0(i);
        xq00Var.m91788r(z);
        return abstractC1806e9.mo38160Z0();
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList m93485o(Object obj) {
        bga.m29073P(obj);
        return new ArrayList();
    }

    /* JADX INFO: renamed from: p */
    public static sep m93486p(float f, float f2, float f3) {
        sep sepVar = new sep(3, false);
        sepVar.m77945s(f, f2);
        sepVar.m77927D(f3);
        return sepVar;
    }

    /* JADX INFO: renamed from: q */
    public static sep m93487q(float f, float f2, float f3, float f4) {
        sep sepVar = new sep(3, false);
        sepVar.m77946t(f, f2);
        sepVar.m77944r(f3, f4);
        return sepVar;
    }

    /* JADX INFO: renamed from: r */
    public static void m93488r(int i, vh00 vh00Var, pha phaVar, xq00 xq00Var, boolean z) {
        vh00Var.mo24510D0(phaVar, xq00Var, Integer.valueOf(i));
        xq00Var.m91788r(z);
    }

    /* JADX INFO: renamed from: s */
    public static void m93489s(sep sepVar, float f, float f2, float f3) {
        sepVar.m77943q(f, f2);
        sepVar.m77942p(f3);
        sepVar.m77937k();
    }

    /* JADX INFO: renamed from: t */
    public static void m93490t(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77937k();
        sepVar.m77945s(f, f2);
        sepVar.m77943q(f3, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m93491u(e9t e9tVar) throws Exception {
        boolean zIsTerminated;
        if (e9tVar instanceof AutoCloseable) {
            e9tVar.close();
            return;
        }
        if (!(e9tVar instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) e9tVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m93492v(sep sepVar, float f, float f2, float f3) {
        sepVar.m77942p(f);
        sepVar.m77937k();
        sepVar.m77945s(f2, f3);
    }

    /* JADX INFO: renamed from: w */
    public static void m93493w(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77942p(f);
        sepVar.m77943q(f2, f3);
        sepVar.m77942p(f4);
    }

    /* JADX INFO: renamed from: x */
    public static void m93494x(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77943q(f, f2);
        sepVar.m77937k();
        sepVar.m77945s(f3, f4);
    }

    /* JADX INFO: renamed from: y */
    public static void m93495y(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77942p(f);
        sepVar.m77937k();
        sepVar.m77945s(f2, f3);
        sepVar.m77942p(f4);
    }

    /* JADX INFO: renamed from: z */
    public static void m93496z(sep sepVar, float f, float f2, float f3, float f4) {
        sepVar.m77942p(f);
        sepVar.m77927D(f2);
        sepVar.m77943q(f3, f4);
    }
}
