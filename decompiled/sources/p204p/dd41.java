package p204p;

import android.content.UriMatcher;
import android.net.Uri;
import com.comscore.streaming.AdvertisementType;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.player.model.command.SignalCommand;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class dd41 {

    /* JADX INFO: renamed from: f */
    public static final Set f47702f;

    /* JADX INFO: renamed from: g */
    public static final LinkedHashSet f47703g;

    /* JADX INFO: renamed from: h */
    public static final UriMatcher f47704h;

    /* JADX INFO: renamed from: i */
    public static final Pattern f47705i;

    /* JADX INFO: renamed from: j */
    public static final Map f47706j;

    /* JADX INFO: renamed from: a */
    public final Uri f47707a;

    /* JADX INFO: renamed from: b */
    public final String f47708b;

    /* JADX INFO: renamed from: c */
    public final gn80 f47709c;

    /* JADX INFO: renamed from: d */
    public final he41 f47710d;

    /* JADX INFO: renamed from: e */
    public final String f47711e;

    static {
        new r46(26);
        Set setM77310m0 = s601.m77310m0(bvp0.f31412e, dvp0.f53500f, evp0.f63295f, cvp0.f42505f, jvp0.f116441f, lvp0.f137370g, mvp0.f147627g, kvp0.f126919g);
        f47702f = setM77310m0;
        f47703g = s601.m77309l0(setM77310m0, s601.m77310m0(avp0.f20242e, ivp0.f106258f));
        f47704h = nf41.f153245b;
        f47705i = Pattern.compile("user:([^:]+)");
        f47706j = n1h1.m63506p();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:73:0x0180  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00b9, please report this as an issue */
    public dd41(String str) {
        String strReplaceFirst;
        String str2;
        String strSubstring;
        String str3;
        he41 he41VarM58838a;
        int iMatch;
        gn80 gn80VarM80427m;
        List list;
        List listM88477a1;
        int length;
        if (str == null) {
            this.f47707a = Uri.EMPTY;
            this.f47709c = gn80.DUMMY;
            this.f47711e = null;
            this.f47708b = null;
            this.f47710d = null;
            return;
        }
        if (bm51.m29803n0(str, "spotify://", false)) {
            this.f47711e = "spotify://";
        } else if (bm51.m29803n0(str, "spotify:", false)) {
            this.f47711e = "spotify:";
        } else if (bm51.m29803n0(str, "http://open.spotify.com/", false)) {
            this.f47711e = "http://open.spotify.com/";
        } else {
            if (!bm51.m29803n0(str, "https://open.spotify.com/", false)) {
                if (bm51.m29803n0(str, "https://r.spotify.com/", false)) {
                    int iM88458H0 = wl51.m88458H0(str, "/app_android/", 0, false, 6);
                    if (iM88458H0 > 0) {
                        strReplaceFirst = Pattern.compile("([^/?]+).*").matcher(str.substring(iM88458H0 + 13)).replaceFirst("$1");
                        str = str.substring(0, iM88458H0);
                    } else {
                        strReplaceFirst = null;
                    }
                    this.f47711e = "https://r.spotify.com/";
                } else {
                    this.f47711e = null;
                }
                this.f47708b = strReplaceFirst;
                str2 = this.f47711e;
                if (str2 == null) {
                    this.f47707a = Uri.EMPTY;
                    this.f47709c = gn80.DUMMY;
                    this.f47710d = null;
                    return;
                }
                strSubstring = str.substring(str2.length());
                if (bm51.m29803n0(strSubstring, "intl-", false)) {
                    listM88477a1 = wl51.m88477a1(strSubstring, new String[]{"/"}, 0, 6);
                    if (listM88477a1.size() == 1 || bm51.m29796g0(strSubstring, "/", false)) {
                        length = (listM88477a1.get(0) + "/").length();
                    } else {
                        length = ((String) listM88477a1.get(0)).length();
                    }
                    if (strSubstring.length() >= length) {
                        strSubstring = strSubstring.substring(length);
                    }
                }
                if (wj50.m88271j(strSubstring, "?")) {
                    this.f47707a = Uri.EMPTY;
                    this.f47709c = gn80.DUMMY;
                    this.f47710d = null;
                    return;
                }
                String strReplaceAll = ef41.f58935h.matcher(strSubstring).replaceAll("/");
                Uri uri = Uri.parse(strReplaceAll);
                this.f47707a = uri == null ? Uri.EMPTY : uri;
                wj50.m88279p(strReplaceAll);
                str3 = ef41.f58936i.split(strReplaceAll, 0)[0];
                he41VarM58838a = lf41.m58838a(str);
                if (he41VarM58838a != null) {
                    this.f47710d = he41VarM58838a;
                    this.f47709c = gn80.NOT_SET;
                    return;
                }
                this.f47710d = null;
                Uri uri2 = Uri.parse(str3);
                Uri uri3 = Uri.EMPTY;
                WeakHashMap weakHashMap = e0b1.f54934a;
                iMatch = f47704h.match(uri2 == null ? uri3 : uri2);
                if (iMatch != -1) {
                    wj50.m88279p(str3);
                    String str4 = ef41.f58937j.split(str3, 0)[0];
                    wj50.m88279p(str4);
                    List listM88477a2 = wl51.m88477a1(str4, new String[]{"/"}, 0, 6);
                    gn80.f82152a.getClass();
                    ef41 ef41VarM64319a = nf41.m64319a(tc5.m80427m(iMatch));
                    list = ef41VarM64319a != null ? ef41VarM64319a.f58941c : null;
                    if (list != null || list.isEmpty()) {
                        gn80VarM80427m = gn80.DUMMY;
                    } else {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (kvf1.m57482t((String) it.next(), listM88477a2)) {
                                gn80.f82152a.getClass();
                                gn80VarM80427m = tc5.m80427m(iMatch);
                            }
                        }
                        gn80VarM80427m = gn80.DUMMY;
                    }
                } else {
                    gn80VarM80427m = gn80.DUMMY;
                }
                this.f47709c = gn80VarM80427m;
            }
            this.f47711e = "https://open.spotify.com/";
        }
        strReplaceFirst = null;
        this.f47708b = strReplaceFirst;
        str2 = this.f47711e;
        if (str2 == null) {
            this.f47707a = Uri.EMPTY;
            this.f47709c = gn80.DUMMY;
            this.f47710d = null;
            return;
        }
        strSubstring = str.substring(str2.length());
        if (bm51.m29803n0(strSubstring, "intl-", false)) {
            listM88477a1 = wl51.m88477a1(strSubstring, new String[]{"/"}, 0, 6);
            if (listM88477a1.size() == 1) {
                length = (listM88477a1.get(0) + "/").length();
            } else {
                length = (listM88477a1.get(0) + "/").length();
            }
            if (strSubstring.length() >= length) {
                strSubstring = strSubstring.substring(length);
            }
        }
        if (wj50.m88271j(strSubstring, "?")) {
            this.f47707a = Uri.EMPTY;
            this.f47709c = gn80.DUMMY;
            this.f47710d = null;
            return;
        }
        String strReplaceAll2 = ef41.f58935h.matcher(strSubstring).replaceAll("/");
        Uri uri4 = Uri.parse(strReplaceAll2);
        this.f47707a = uri4 == null ? Uri.EMPTY : uri4;
        wj50.m88279p(strReplaceAll2);
        str3 = ef41.f58936i.split(strReplaceAll2, 0)[0];
        he41VarM58838a = lf41.m58838a(str);
        if (he41VarM58838a != null) {
            this.f47710d = he41VarM58838a;
            this.f47709c = gn80.NOT_SET;
            return;
        }
        this.f47710d = null;
        Uri uri5 = Uri.parse(str3);
        Uri uri6 = Uri.EMPTY;
        WeakHashMap weakHashMap2 = e0b1.f54934a;
        iMatch = f47704h.match(uri5 == null ? uri6 : uri5);
        if (iMatch != -1) {
            wj50.m88279p(str3);
            String str5 = ef41.f58937j.split(str3, 0)[0];
            wj50.m88279p(str5);
            List listM88477a3 = wl51.m88477a1(str5, new String[]{"/"}, 0, 6);
            gn80.f82152a.getClass();
            ef41 ef41VarM64319a2 = nf41.m64319a(tc5.m80427m(iMatch));
            if (ef41VarM64319a2 != null) {
            }
            if (list != null) {
                gn80VarM80427m = gn80.DUMMY;
            } else {
                gn80VarM80427m = gn80.DUMMY;
            }
        } else {
            gn80VarM80427m = gn80.DUMMY;
        }
        this.f47709c = gn80VarM80427m;
    }

    /* JADX INFO: renamed from: A */
    public final String m35694A() {
        String encodedPath;
        Uri uri = Uri.EMPTY;
        Uri uri2 = this.f47707a;
        String strReplace = null;
        if (wj50.m88271j(uri2, uri)) {
            return null;
        }
        if (uri2 != null && (encodedPath = uri2.getEncodedPath()) != null) {
            strReplace = encodedPath.replace('/', ':');
        }
        return edb.m38564m("spotify:", strReplace);
    }

    /* JADX INFO: renamed from: B */
    public final String m35695B(String str) {
        StringBuilder sb = new StringBuilder("spotify:");
        Uri uri = this.f47707a;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        if (pathSegments != null) {
            int size = pathSegments.size();
            for (int i = 0; i < size; i++) {
                if (sb.charAt(sb.length() - 1) != ':') {
                    sb.append(':');
                }
                if (i == 0) {
                    sb.append(str);
                } else {
                    sb.append(Uri.encode(pathSegments.get(i)));
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public final String m35696C(String str) {
        he41 he41Var = this.f47710d;
        if (he41Var != null) {
            fka1 type = he41Var.getType();
            if (type.equals(avp0.f20242e) || type.equals(ivp0.f106258f)) {
                return m35702I(str);
            }
        }
        int iOrdinal = this.f47709c.ordinal();
        return (iOrdinal == 30 || iOrdinal == 42) ? m35702I(str) : m35694A();
    }

    /* JADX INFO: renamed from: D */
    public final String m35697D(String str) {
        return cd41.f36804a[this.f47709c.ordinal()] == 7 ? edb.m38566o("spotify:user:", str, ":collection:artist:", m35710h()) : m35694A();
    }

    /* JADX INFO: renamed from: E */
    public final String m35698E() {
        String encodedPath;
        Uri uri = Uri.EMPTY;
        Uri uri2 = this.f47707a;
        String str = null;
        if (wj50.m88271j(uri2, uri)) {
            return null;
        }
        String strReplace = (uri2 == null || (encodedPath = uri2.getEncodedPath()) == null) ? null : encodedPath.replace('/', ':');
        String strM38564m = edb.m38564m("?", uri2 != null ? uri2.getEncodedQuery() : null);
        String encodedQuery = uri2 != null ? uri2.getEncodedQuery() : null;
        if (encodedQuery != null && !wl51.m88460J0(encodedQuery)) {
            str = strM38564m;
        }
        if (str == null) {
            str = "";
        }
        return s571.m77251j("spotify:", strReplace, str);
    }

    /* JADX INFO: renamed from: F */
    public final String m35699F() {
        String strM38564m;
        String strM35701H;
        ad41 ad41VarM35727y = m35727y();
        if (ad41VarM35727y == null) {
            strM38564m = null;
        } else if (ad41VarM35727y.m25520d() != null) {
            strM38564m = edb.m38566o("spotify:user:", Uri.encode(ad41VarM35727y.m25520d()), ":playlist:", ad41VarM35727y.m25518b());
        } else {
            strM38564m = edb.m38564m("spotify:playlist:", ad41VarM35727y.m25518b());
        }
        if (strM38564m != null) {
            return strM38564m;
        }
        int iOrdinal = this.f47709c.ordinal();
        if (iOrdinal == 31) {
            String strM35717o = m35717o(3);
            strM35701H = (wj50.m88271j(strM35717o, "episode") || wj50.m88271j(strM35717o, "track")) ? m35701H(2, 4) : null;
            return (strM35701H == null || strM35701H.length() == 0) ? m35701H(2, 3) : strM35701H;
        }
        if (iOrdinal == 48) {
            String strM35717o2 = m35717o(3);
            strM35701H = (wj50.m88271j(strM35717o2, "episode") || wj50.m88271j(strM35717o2, "track")) ? m35701H(2, 4) : null;
            return (strM35701H == null || strM35701H.length() == 0) ? m35701H(2, 3) : strM35701H;
        }
        if (iOrdinal == 316) {
            return m35701H(2, 2);
        }
        if (iOrdinal == 341) {
            return m35701H(7, 9);
        }
        if (iOrdinal == 345) {
            return m35701H(7, 9);
        }
        if (iOrdinal != 926) {
            return (iOrdinal == 846 || iOrdinal == 847) ? m35701H(0, 2) : m35694A();
        }
        return m35701H(2, 2);
    }

    /* JADX INFO: renamed from: G */
    public final String m35700G() {
        int iOrdinal = this.f47709c.ordinal();
        if (iOrdinal != 174) {
            return iOrdinal != 176 ? m35694A() : "spotify:artist:".concat(m35710h());
        }
        return "spotify:album:".concat(m35710h());
    }

    /* JADX INFO: renamed from: H */
    public final String m35701H(int i, int i2) {
        StringBuilder sb = new StringBuilder("spotify:");
        Uri uri = this.f47707a;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        if (pathSegments != null) {
            int size = pathSegments.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i > i3 || i3 > i2) {
                    if (wl51.m88461K0(sb) != ':') {
                        sb.append(':');
                    }
                    sb.append(Uri.encode(pathSegments.get(i3)));
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: I */
    public final String m35702I(String str) {
        StringBuilder sb = new StringBuilder();
        String strM35699F = m35699F();
        if (strM35699F != null) {
            sb.append(strM35699F);
        }
        sb.append(":play:");
        sb.append(bm51.m29801l0(str, "spotify:", ""));
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m35703a() {
        String queryParameter;
        Uri uri;
        Uri uri2 = this.f47707a;
        String queryParameter2 = uri2 != null ? uri2.getQueryParameter("prid") : null;
        if (queryParameter2 != null && queryParameter2.length() != 0) {
            return queryParameter2;
        }
        if (uri2 == null || (queryParameter = uri2.getQueryParameter("target_url")) == null || (uri = Uri.parse(queryParameter)) == null || !uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter("prid");
    }

    /* JADX INFO: renamed from: b */
    public final String m35704b() {
        int iOrdinal = this.f47709c.ordinal();
        if (iOrdinal == 42) {
            return m35694A();
        }
        Uri uri = this.f47707a;
        if (iOrdinal != 43 && iOrdinal != 45 && iOrdinal != 46) {
            if (iOrdinal == 48) {
                return m35699F();
            }
            if (iOrdinal != 49 && iOrdinal != 51 && iOrdinal != 52 && iOrdinal != 55 && iOrdinal != 66) {
                switch (iOrdinal) {
                    case 61:
                    case 62:
                    case 63:
                        break;
                    default:
                        throw new UnsupportedOperationException("URI \"" + uri + "\" is not artist related");
                }
            }
        }
        String strM35694A = m35694A();
        if (strM35694A == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
        return lastPathSegment != null ? strM35694A.substring(0, wl51.m88463M0(strM35694A, lastPathSegment, 0, 6) - 1) : strM35694A;
    }

    /* JADX INFO: renamed from: c */
    public final String m35705c(int i) {
        String strM35717o = m35717o(i);
        if (strM35717o == null || strM35717o.length() == 0) {
            return null;
        }
        return edb.m38564m("spotify:episode:", Uri.encode(strM35717o));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX INFO: renamed from: d */
    public final String m35706d() {
        String strM38564m;
        ad41 ad41VarM35727y = m35727y();
        if (ad41VarM35727y == null) {
            strM38564m = null;
        } else if (ad41VarM35727y.m25519c() != null) {
            strM38564m = edb.m38564m("spotify:track:", ad41VarM35727y.m25519c());
        } else if (ad41VarM35727y.m25517a() != null) {
            strM38564m = edb.m38564m("spotify:episode:", ad41VarM35727y.m25517a());
        } else {
            strM38564m = null;
        }
        if (strM38564m != null) {
            return strM38564m;
        }
        int iOrdinal = this.f47709c.ordinal();
        if (iOrdinal == 31) {
            String strM35713k = m35713k();
            return (strM35713k == null || strM35713k.length() == 0) ? m35707e(3) : strM35713k;
        }
        if (iOrdinal == 48) {
            String strM35713k2 = m35713k();
            return (strM35713k2 == null || strM35713k2.length() == 0) ? m35707e(3) : strM35713k2;
        }
        if (iOrdinal == 316) {
            return m35705c(5);
        }
        if (iOrdinal != 341) {
            return null;
        }
        return m35707e(9);
    }

    /* JADX INFO: renamed from: e */
    public final String m35707e(int i) {
        String strM35717o = m35717o(i);
        if (strM35717o == null || strM35717o.length() == 0) {
            return null;
        }
        return edb.m38564m("spotify:track:", Uri.encode(strM35717o));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd41)) {
            return false;
        }
        dd41 dd41Var = (dd41) obj;
        return wj50.m88271j(this.f47707a, dd41Var.f47707a) && wj50.m88271j(this.f47708b, dd41Var.f47708b);
    }

    /* JADX INFO: renamed from: f */
    public final String m35708f() {
        he41 he41Var = this.f47710d;
        nvp0 nvp0Var = he41Var instanceof nvp0 ? (nvp0) he41Var : null;
        if (nvp0Var != null) {
            return nvp0Var.f158940b;
        }
        if (this.f47709c == gn80.COLLECTION_PLAYLIST_FOLDER) {
            return m35717o(3);
        }
        throw new IllegalArgumentException(("URI \"" + this.f47707a + "\" is not a folder").toString());
    }

    /* JADX INFO: renamed from: g */
    public final dd41 m35709g() {
        String str;
        Uri uri = this.f47707a;
        String queryParameter = uri != null ? uri.getQueryParameter("context") : null;
        String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        if (pathSegments == null || pathSegments.isEmpty()) {
            str = "";
        } else {
            Object objM43741q0 = g6f.m43741q0(pathSegments);
            String str2 = (String) objM43741q0;
            if (!wj50.m88271j(str2, "episode") && !wj50.m88271j(str2, "track")) {
                objM43741q0 = null;
            }
            str = (String) objM43741q0;
        }
        if (queryParameter == null) {
            return null;
        }
        String strReplaceAll = ef41.f58938k.matcher(queryParameter).replaceAll(":");
        if (str != null && str.length() != 0) {
            lastPathSegment = klh.m56834f(str, ":", lastPathSegment);
        }
        String strM56834f = klh.m56834f(strReplaceAll, ":play:", lastPathSegment);
        String queryParameter2 = uri != null ? uri.getQueryParameter("t") : null;
        String queryParameter3 = uri != null ? uri.getQueryParameter("he") : null;
        if (queryParameter2 != null) {
            strM56834f = klh.m56834f(strM56834f, ":", queryParameter2);
        }
        if (queryParameter3 != null) {
            strM56834f = klh.m56834f(strM56834f, "&he=", queryParameter3);
        }
        return r46.m74726U(strM56834f);
    }

    /* JADX INFO: renamed from: h */
    public final String m35710h() {
        String lastPathSegment;
        List<String> pathSegments;
        String str;
        List<String> pathSegments2;
        String str2;
        List<String> pathSegments3;
        String str3;
        List<String> pathSegments4;
        String str4;
        String str5;
        int iOrdinal = this.f47709c.ordinal();
        Uri uri = this.f47707a;
        switch (iOrdinal) {
            case 9:
            case 30:
            case 42:
            case 58:
            case 68:
            case 93:
            case 95:
            case 131:
            case 132:
            case 169:
            case 174:
            case 176:
            case 204:
            case 228:
            case AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL /* 232 */:
            case 311:
            case 372:
            case 374:
            case 544:
            case 566:
            case 567:
            case 624:
            case 625:
            case CtaType.SEE_ALL_SHOWS_FIELD_NUMBER /* 700 */:
            case 845:
            case 861:
            case 925:
            case 926:
            case 966:
                if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null) {
                    return lastPathSegment;
                }
                throw new UnsupportedOperationException("URI \"" + uri + "\" does not contain an ID");
            case 31:
            case 43:
            case 48:
            case 62:
            case 850:
            case 860:
            case 886:
                if (uri != null && (pathSegments = uri.getPathSegments()) != null && (str = (String) g6f.m43747t0(1, pathSegments)) != null) {
                    return str;
                }
                throw new UnsupportedOperationException("URI \"" + uri + "\" does not contain an ID");
            case 217:
                if (uri != null && (pathSegments2 = uri.getPathSegments()) != null && (str2 = (String) g6f.m43747t0(uri.getPathSegments().size() - 2, pathSegments2)) != null) {
                    return str2;
                }
                throw new UnsupportedOperationException("URI \"" + uri + "\" does not contain an ID");
            case 218:
            case 223:
                if (uri != null && (pathSegments3 = uri.getPathSegments()) != null && (str3 = (String) g6f.m43747t0(4, pathSegments3)) != null) {
                    return str3;
                }
                throw new UnsupportedOperationException("URI \"" + uri + "\" does not contain an ID");
            case 225:
                if (uri != null && (pathSegments4 = uri.getPathSegments()) != null && (str4 = (String) g6f.m43747t0(uri.getPathSegments().size() - 3, pathSegments4)) != null) {
                    return str4;
                }
                throw new UnsupportedOperationException("URI \"" + uri + "\" does not contain an ID");
            case 596:
                he41 he41Var = this.f47710d;
                if (he41Var != null) {
                    if (he41Var instanceof kup0) {
                        str5 = ((kup0) he41Var).f126652a;
                    } else if (he41Var instanceof oup0) {
                        str5 = ((oup0) he41Var).f170334a;
                    } else if (he41Var instanceof wup0) {
                        str5 = ((wup0) he41Var).f255247a;
                    } else {
                        str5 = he41Var instanceof zup0 ? ((zup0) he41Var).f286497a : null;
                    }
                    if (str5 != null) {
                        return str5;
                    }
                }
                String lastPathSegment2 = uri != null ? uri.getLastPathSegment() : null;
                if (lastPathSegment2 != null) {
                    return lastPathSegment2;
                }
                throw new UnsupportedOperationException("URI \"" + uri + "\" does not contain an ID");
            default:
                throw new UnsupportedOperationException("URI \"" + uri + "\" does not contain an ID");
        }
    }

    public final int hashCode() {
        return h6f.m46715L(this.f47707a, this.f47708b).hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m35711i(int i) {
        Uri uri = this.f47707a;
        if (uri == null) {
            return null;
        }
        if ((f47704h.match(uri) == -1 && this.f47710d == null) || i < 0 || i >= uri.getPathSegments().size()) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        wj50.m88279p(encodedPath);
        List listM88477a1 = wl51.m88477a1(encodedPath, new String[]{"/"}, 0, 6);
        return g6f.m43753y0(listM88477a1.subList(i, listM88477a1.size()), ":", null, null, m541.f140098M0, 30);
    }

    /* JADX INFO: renamed from: j */
    public final String m35712j() {
        Uri uri = this.f47707a;
        if (uri != null) {
            return uri.getLastPathSegment();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final String m35713k() {
        String strM35717o = m35717o(3);
        if (strM35717o == null || strM35717o.length() == 0) {
            return null;
        }
        if (strM35717o.equals("episode")) {
            return m35705c(4);
        }
        if (strM35717o.equals("track")) {
            return m35707e(4);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final String m35714l() {
        return "https://open.spotify.com/" + this.f47707a;
    }

    /* JADX INFO: renamed from: m */
    public final String m35715m() {
        String queryParameter;
        Uri uri;
        String str;
        Uri uri2 = this.f47707a;
        String queryParameter2 = uri2 != null ? uri2.getQueryParameter("pt") : null;
        if (queryParameter2 != null && queryParameter2.length() != 0) {
            return queryParameter2;
        }
        List<String> pathSegments = uri2 != null ? uri2.getPathSegments() : null;
        if (pathSegments != null && wj50.m88271j(g6f.m43747t0(3, pathSegments), "invite") && (str = (String) g6f.m43747t0(4, pathSegments)) != null && str.length() != 0) {
            return str;
        }
        if (uri2 == null || (queryParameter = uri2.getQueryParameter("target_url")) == null || (uri = Uri.parse(queryParameter)) == null || !uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter("pt");
    }

    /* JADX INFO: renamed from: n */
    public final String m35716n(String str) {
        String queryParameter;
        Uri uri = this.f47707a;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return null;
        }
        return ef41.f58938k.matcher(queryParameter).replaceAll(":");
    }

    /* JADX INFO: renamed from: o */
    public final String m35717o(int i) {
        Uri uri = this.f47707a;
        if (uri == null) {
            return null;
        }
        if ((f47704h.match(uri) == -1 && this.f47710d == null) || i < 0 || i >= uri.getPathSegments().size()) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        wj50.m88279p(encodedPath);
        return qfc1.m72697g((String) wl51.m88477a1(encodedPath, new String[]{"/"}, 0, 6).get(i), vuc.f244913a);
    }

    /* JADX INFO: renamed from: p */
    public final int m35718p() {
        List<String> pathSegments;
        Uri uri = this.f47707a;
        if (uri == null || (pathSegments = uri.getPathSegments()) == null) {
            return 0;
        }
        return pathSegments.size();
    }

    /* JADX INFO: renamed from: q */
    public final bd41 m35719q() {
        String queryParameter;
        Uri uri;
        String queryParameter2;
        Uri uri2 = this.f47707a;
        String queryParameter3 = uri2 != null ? uri2.getQueryParameter(SignalCommand.ENDPOINT_NAME) : null;
        if (queryParameter3 != null && queryParameter3.length() != 0) {
            return new bd41(queryParameter3, uri2.getQueryParameter("signal_data"));
        }
        if (uri2 == null || (queryParameter = uri2.getQueryParameter("target_url")) == null || (uri = Uri.parse(queryParameter)) == null || !uri.isHierarchical() || (queryParameter2 = uri.getQueryParameter(SignalCommand.ENDPOINT_NAME)) == null || queryParameter2.length() == 0) {
            return null;
        }
        return new bd41(queryParameter2, uri.getQueryParameter("signal_data"));
    }

    /* JADX INFO: renamed from: r */
    public final String m35720r() {
        int iOrdinal = this.f47709c.ordinal();
        Uri uri = this.f47707a;
        if (iOrdinal != 886 && iOrdinal != 927) {
            throw new UnsupportedOperationException("URI \"" + uri + "\" is not track related");
        }
        String strM35694A = m35694A();
        if (strM35694A == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
        return lastPathSegment != null ? strM35694A.substring(0, wl51.m88463M0(strM35694A, lastPathSegment, 0, 6) - 1) : strM35694A;
    }

    /* JADX INFO: renamed from: s */
    public final String m35721s() {
        String strM35694A = m35694A();
        if (strM35694A == null) {
            return null;
        }
        Matcher matcher = f47705i.matcher(strM35694A);
        if (matcher.find()) {
            return Uri.decode(matcher.group(1));
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m35722t() {
        Uri uri = this.f47707a;
        String queryParameter = uri != null ? uri.getQueryParameter("context") : null;
        return !(queryParameter == null || queryParameter.length() == 0);
    }

    public final String toString() {
        return String.valueOf(this.f47707a);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m35723u() {
        String str = this.f47711e;
        return wj50.m88271j(str, "http://open.spotify.com/") || wj50.m88271j(str, "https://open.spotify.com/") || wj50.m88271j(str, "spotify://");
    }

    /* JADX INFO: renamed from: v */
    public final boolean m35724v() {
        return this.f47709c == gn80.TRACK && wj50.m88271j(m35717o(0), "local");
    }

    /* JADX INFO: renamed from: w */
    public final boolean m35725w() {
        Uri uri = this.f47707a;
        String queryParameter = uri != null ? uri.getQueryParameter("si") : null;
        return !(queryParameter == null || queryParameter.length() == 0);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m35726x() {
        int iOrdinal = this.f47709c.ordinal();
        return iOrdinal == 210 || iOrdinal == 211;
    }

    /* JADX INFO: renamed from: y */
    public final ad41 m35727y() {
        he41 he41Var = this.f47710d;
        if (he41Var instanceof bvp0) {
            return new ad41(14, ((bvp0) he41Var).f31413a, null, null, null);
        }
        if (he41Var instanceof dvp0) {
            dvp0 dvp0Var = (dvp0) he41Var;
            return new ad41(10, dvp0Var.f53501a, null, dvp0Var.f53502b, null);
        }
        if (he41Var instanceof evp0) {
            evp0 evp0Var = (evp0) he41Var;
            return new ad41(10, evp0Var.f63296a, null, evp0Var.f63297b, null);
        }
        if (he41Var instanceof cvp0) {
            cvp0 cvp0Var = (cvp0) he41Var;
            return new ad41(6, cvp0Var.f42506a, null, null, cvp0Var.f42507b);
        }
        if (he41Var instanceof jvp0) {
            jvp0 jvp0Var = (jvp0) he41Var;
            return new ad41(12, jvp0Var.f116443b, jvp0Var.f116442a, null, null);
        }
        if (he41Var instanceof lvp0) {
            lvp0 lvp0Var = (lvp0) he41Var;
            return new ad41(8, lvp0Var.f137372b, lvp0Var.f137371a, lvp0Var.f137373c, null);
        }
        if (he41Var instanceof mvp0) {
            mvp0 mvp0Var = (mvp0) he41Var;
            return new ad41(8, mvp0Var.f147629b, mvp0Var.f147628a, mvp0Var.f147630c, null);
        }
        if (!(he41Var instanceof kvp0)) {
            return null;
        }
        kvp0 kvp0Var = (kvp0) he41Var;
        return new ad41(4, kvp0Var.f126921b, kvp0Var.f126920a, null, kvp0Var.f126922c);
    }

    /* JADX INFO: renamed from: z */
    public final String m35728z() {
        Uri uri = Uri.EMPTY;
        Uri uri2 = this.f47707a;
        if (wj50.m88271j(uri2, uri)) {
            return null;
        }
        return edb.m38564m("https://open.spotify.com/", uri2 != null ? uri2.getEncodedPath() : null);
    }
}
