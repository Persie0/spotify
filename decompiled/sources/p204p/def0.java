package p204p;

import android.text.TextUtils;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class def0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f48083a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f48084b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static boolean m35784a(String str, String str2) {
        qr8 qr8VarM35790g;
        int iM73598e;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "application/vnd.dvb.ait":
            case "application/x-icy":
            case "application/x-camera-motion":
            case "application/id3":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "application/meta":
            case "audio/ac3":
            case "audio/raw":
            case "application/x-media3-cues":
            case "application/x-itut-t35":
            case "application/x-emsg":
            case "video/apv":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "application/x-scte35":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (qr8VarM35790g = m35790g(str2)) == null || (iM73598e = qr8VarM35790g.m73598e()) == 0 || iM73598e == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m35785b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : h0b1.m46318j0(str)) {
            String strM35788e = m35788e(str2);
            if (strM35788e != null && m35794k(strM35788e)) {
                return strM35788e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m35786c(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrM46318j0 = h0b1.m46318j0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrM46318j0) {
                if (str2.equals(m35788e(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m35787d(String str, String str2) {
        qr8 qr8VarM35790g;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (qr8VarM35790g = m35790g(str2)) == null) {
                    return 0;
                }
                return qr8VarM35790g.m73598e();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m35788e(String str) {
        qr8 qr8VarM35790g;
        String strM35789f = null;
        if (str != null) {
            String strM85612A = vie1.m85612A(str.trim());
            if (strM85612A.startsWith("avc1") || strM85612A.startsWith("avc3")) {
                return "video/avc";
            }
            if (strM85612A.startsWith("hev1") || strM85612A.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strM85612A.startsWith("vvc1") || strM85612A.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (strM85612A.startsWith("dvav") || strM85612A.startsWith("dva1") || strM85612A.startsWith("dvhe") || strM85612A.startsWith("dvh1") || strM85612A.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (strM85612A.startsWith("av01")) {
                return "video/av01";
            }
            if (strM85612A.startsWith("vp9") || strM85612A.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strM85612A.startsWith("vp8") || strM85612A.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strM85612A.startsWith("mp4a")) {
                if (strM85612A.startsWith("mp4a.") && (qr8VarM35790g = m35790g(strM85612A)) != null) {
                    strM35789f = m35789f(qr8VarM35790g.f191759a);
                }
                return strM35789f == null ? "audio/mp4a-latm" : strM35789f;
            }
            if (strM85612A.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strM85612A.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strM85612A.startsWith("ac-3") || strM85612A.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strM85612A.startsWith("ec-3") || strM85612A.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strM85612A.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strM85612A.startsWith("ac-4") || strM85612A.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strM85612A.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strM85612A.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strM85612A.startsWith("dtsh") || strM85612A.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strM85612A.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strM85612A.startsWith("opus")) {
                return "audio/opus";
            }
            if (strM85612A.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strM85612A.startsWith("flac")) {
                return "audio/flac";
            }
            if (strM85612A.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strM85612A.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strM85612A.contains("cea708")) {
                return "application/cea-708";
            }
            if (strM85612A.contains("eia608") || strM85612A.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f48083a;
            if (arrayList.size() > 0) {
                ikc0.m50942n(arrayList.get(0));
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m35789f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case Error.TOO_YOUNG_FIELD_NUMBER /* 107 */:
                return "audio/mpeg";
            case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: g */
    public static qr8 m35790g(String str) {
        Matcher matcher = f48084b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new qr8(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m35791h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: i */
    public static int m35792i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m35794k(str)) {
            return 1;
        }
        if (m35798o(str)) {
            return 2;
        }
        if (m35797n(str)) {
            return 3;
        }
        if (m35796m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f48083a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        ikc0.m50942n(arrayList.get(0));
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static String m35793j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : h0b1.m46318j0(str)) {
            String strM35788e = m35788e(str2);
            if (strM35788e != null && m35798o(strM35788e)) {
                return strM35788e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m35794k(String str) {
        return "audio".equals(m35791h(str));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m35795l(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m35796m(String str) {
        return "image".equals(m35791h(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m35797n(String str) {
        return "text".equals(m35791h(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m35798o(String str) {
        return "video".equals(m35791h(str));
    }

    /* JADX INFO: renamed from: p */
    public static String m35799p(String str) {
        if (str == null) {
            return null;
        }
        String strM85612A = vie1.m85612A(str);
        strM85612A.getClass();
        switch (strM85612A) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM85612A;
        }
    }
}
