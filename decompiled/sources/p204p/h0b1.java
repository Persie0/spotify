package p204p;

import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.car.app.model.Alert;
import androidx.media3.common.ParserException;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p196j$.util.DesugarTimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0b1 {

    /* JADX INFO: renamed from: a */
    public static final String f86200a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f86201b;

    /* JADX INFO: renamed from: c */
    public static final long[] f86202c;

    /* JADX INFO: renamed from: d */
    public static final Pattern f86203d;

    /* JADX INFO: renamed from: e */
    public static final Pattern f86204e;

    /* JADX INFO: renamed from: f */
    public static final Pattern f86205f;

    /* JADX INFO: renamed from: g */
    public static HashMap f86206g;

    /* JADX INFO: renamed from: h */
    public static final String[] f86207h;

    /* JADX INFO: renamed from: i */
    public static final String[] f86208i;

    /* JADX INFO: renamed from: j */
    public static final int[] f86209j;

    /* JADX INFO: renamed from: k */
    public static final int[] f86210k;

    /* JADX INFO: renamed from: l */
    public static final int[] f86211l;

    static {
        int i = Build.VERSION.SDK_INT;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        f86200a = s571.m77248g(i, ", ", sb);
        f86201b = new byte[0];
        f86202c = new long[0];
        f86203d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f86204e = Pattern.compile("%([A-Fa-f0-9]{2})");
        f86205f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f86207h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f86208i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f86209j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f86210k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f86211l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, ContentType.LONG_FORM_ON_DEMAND, 119, 126, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, 108, Error.TOO_YOUNG_FIELD_NUMBER, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL, 238, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, ContentType.BUMPER, 192, 201, 206, 219, 220, AdvertisementType.ON_DEMAND_POST_ROLL, 210, 255, 248, 241, 246, 227, 228, 237, AdvertisementType.BRANDED_AS_CONTENT, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, ContentType.SHORT_FORM_ON_DEMAND, 104, 97, 102, 115, 116, 125, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, AdvertisementType.BRANDED_DURING_LIVE, 236, 193, 198, 207, 200, AdvertisementType.LIVE, 218, AdvertisementType.ON_DEMAND_PRE_ROLL, AdvertisementType.ON_DEMAND_MID_ROLL, 105, 110, 103, 96, 117, 114, ContentType.USER_GENERATED_LIVE, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, ContentType.LIVE, 120, 127, Error.INVALID_COUNTRY_FIELD_NUMBER, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, AdvertisementType.BRANDED_ON_DEMAND_MID_ROLL, 239, 250, 253, 244, 243};
    }

    /* JADX INFO: renamed from: A */
    public static int m46273A(int i, String str) {
        int i2 = 0;
        for (String str2 : m46318j0(str)) {
            if (i == def0.m35792i(def0.m35788e(str2))) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: B */
    public static String m46274B(int i, String str) {
        String[] strArrM46318j0 = m46318j0(str);
        if (strArrM46318j0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrM46318j0) {
            if (i == def0.m35792i(def0.m35788e(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static Point m46275C(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m46292T(context)) {
            String strM46283K = Build.VERSION.SDK_INT < 28 ? m46283K("sys.display-size") : m46283K("vendor.display-size");
            if (!TextUtils.isEmpty(strM46283K)) {
                try {
                    String[] strArrSplit = strM46283K.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                yif1.m93808r("Invalid display size: " + strM46283K);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    /* JADX INFO: renamed from: D */
    public static Looper m46276D() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: E */
    public static int m46277E(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX INFO: renamed from: F */
    public static int m46278F(String str) {
        String[] strArrSplit;
        int length;
        int i = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* JADX INFO: renamed from: G */
    public static int m46279G(int i, ByteOrder byteOrder) {
        if (i == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    /* JADX INFO: renamed from: H */
    public static long m46280H(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    /* JADX INFO: renamed from: I */
    public static int m46281I(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    /* JADX INFO: renamed from: J */
    public static long m46282J(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    /* JADX INFO: renamed from: K */
    public static String m46283K(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            yif1.m93810s("Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static String m46284L(int i) {
        switch (i) {
            case SplitInstallErrorCode.MODULE_UNAVAILABLE /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i >= 10000 ? edb.m38563l("custom (", i, ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    /* JADX INFO: renamed from: M */
    public static boolean m46285M(g7p0 g7p0Var) {
        boolean z = false;
        if (g7p0Var == null) {
            return false;
        }
        int playbackState = g7p0Var.getPlaybackState();
        if (playbackState != 1 || !g7p0Var.mo43865W(2)) {
            if (playbackState == 4 && g7p0Var.mo43865W(4)) {
                g7p0Var.mo43916y();
            }
            if (g7p0Var.mo43865W(1)) {
                return z;
            }
            g7p0Var.mo43885g();
            return true;
        }
        g7p0Var.mo43875b();
        z = true;
        if (g7p0Var.mo43865W(1)) {
            return z;
        }
        g7p0Var.mo43885g();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[RETURN] */
    /* JADX INFO: renamed from: N */
    public static int m46286N(Uri uri, String str) {
        int i;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme == null || (!vie1.m85628j("rtsp", scheme) && !vie1.m85628j("rtspt", scheme))) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    String strM85612A = vie1.m85612A(lastPathSegment.substring(iLastIndexOf + 1));
                    strM85612A.getClass();
                    switch (strM85612A.hashCode()) {
                        case 104579:
                            if (strM85612A.equals("ism")) {
                            }
                            break;
                        case 108321:
                            if (strM85612A.equals("mpd")) {
                            }
                            break;
                        case 3242057:
                            if (strM85612A.equals("isml")) {
                            }
                            break;
                        case 3299913:
                            if (strM85612A.equals("m3u8")) {
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                        Method dump skipped, instruction units count: 286
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p204p.h0b1.m46286N(android.net.Uri, java.lang.String):int");
                }

                /* JADX INFO: renamed from: O */
                public static boolean m46287O(l2n0 l2n0Var, l2n0 l2n0Var2, Inflater inflater) {
                    if (l2n0Var.m57932a() == 0) {
                        return false;
                    }
                    if (l2n0Var2.m57933b() < l2n0Var.m57932a()) {
                        l2n0Var2.m57934d(l2n0Var.m57932a() * 2);
                    }
                    if (inflater == null) {
                        inflater = new Inflater();
                    }
                    inflater.setInput(l2n0Var.m57935e(), l2n0Var.m57936f(), l2n0Var.m57932a());
                    int iInflate = 0;
                    while (true) {
                        try {
                            iInflate += inflater.inflate(l2n0Var2.m57935e(), iInflate, l2n0Var2.m57933b() - iInflate);
                            if (inflater.finished()) {
                                l2n0Var2.m57929Q(iInflate);
                                inflater.reset();
                                return true;
                            }
                            if (!inflater.needsDictionary() && !inflater.needsInput()) {
                                if (iInflate == l2n0Var2.m57933b()) {
                                    l2n0Var2.m57934d(l2n0Var2.m57933b() * 2);
                                }
                            }
                            inflater.reset();
                            return false;
                        } catch (DataFormatException unused) {
                            inflater.reset();
                            return false;
                        } catch (Throwable th) {
                            inflater.reset();
                            throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: P */
                public static boolean m46288P(int i) {
                    return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1895825408 || i == 1879048192 || i == 1912602624;
                }

                /* JADX INFO: renamed from: Q */
                public static boolean m46289Q(Context context) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                        return true;
                    }
                    if (i == 30) {
                        String str = Build.MODEL;
                        if (vie1.m85628j(str, "moto g(20)") || vie1.m85628j(str, "rmx3231")) {
                            return true;
                        }
                    }
                    return i == 34 && vie1.m85628j(Build.MODEL, "sm-x200");
                }

                /* JADX INFO: renamed from: R */
                public static boolean m46290R(int i) {
                    return i == 10 || i == 13;
                }

                /* JADX INFO: renamed from: S */
                public static boolean m46291S() {
                    String strM85612A = vie1.m85612A(Build.DEVICE);
                    return strM85612A.contains("emulator") || strM85612A.contains("emu64a") || strM85612A.contains("emu64x") || strM85612A.contains("generic") || strM85612A.contains("vsoc");
                }

                /* JADX INFO: renamed from: T */
                public static boolean m46292T(Context context) {
                    UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                    return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
                }

                /* JADX INFO: renamed from: U */
                public static String m46293U(Context context, int i) {
                    InputStream inputStreamOpenRawResource = null;
                    try {
                        inputStreamOpenRawResource = context.getResources().openRawResource(i);
                        return m46334v(rua.m76430b(inputStreamOpenRawResource));
                    } finally {
                        m46313h(inputStreamOpenRawResource);
                    }
                }

                /* JADX INFO: renamed from: V */
                public static void m46294V(int i, int i2, int i3, ArrayList arrayList) {
                    ArrayDeque arrayDeque = new ArrayDeque();
                    for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
                        arrayDeque.addFirst(arrayList.remove(i + i4));
                    }
                    arrayList.addAll(Math.min(i3, arrayList.size()), arrayDeque);
                }

                /* JADX INFO: renamed from: W */
                public static long m46295W(long j) {
                    return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
                }

                /* JADX INFO: renamed from: X */
                public static String m46296X(String str) {
                    if (str == null) {
                        return null;
                    }
                    String strReplace = str.replace('_', '-');
                    if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                        str = strReplace;
                    }
                    String strM85612A = vie1.m85612A(str);
                    int i = 0;
                    String str2 = strM85612A.split("-", 2)[0];
                    if (f86206g == null) {
                        String[] iSOLanguages = Locale.getISOLanguages();
                        int length = iSOLanguages.length;
                        String[] strArr = f86207h;
                        HashMap map = new HashMap(length + strArr.length);
                        for (String str3 : iSOLanguages) {
                            try {
                                String iSO3Language = new Locale(str3).getISO3Language();
                                if (!TextUtils.isEmpty(iSO3Language)) {
                                    map.put(iSO3Language, str3);
                                }
                            } catch (MissingResourceException unused) {
                            }
                        }
                        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                            map.put(strArr[i2], strArr[i2 + 1]);
                        }
                        f86206g = map;
                    }
                    String str4 = (String) f86206g.get(str2);
                    if (str4 != null) {
                        StringBuilder sbM36620t = dq60.m36620t(str4);
                        sbM36620t.append(strM85612A.substring(str2.length()));
                        strM85612A = sbM36620t.toString();
                        str2 = str4;
                    }
                    if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                        return strM85612A;
                    }
                    while (true) {
                        String[] strArr2 = f86208i;
                        if (i >= strArr2.length) {
                            return strM85612A;
                        }
                        if (strM85612A.startsWith(strArr2[i])) {
                            return strArr2[i + 1] + strM85612A.substring(strArr2[i].length());
                        }
                        i += 2;
                    }
                }

                /* JADX INFO: renamed from: Y */
                public static Object[] m46297Y(int i, Object[] objArr) {
                    c95.m31843i(i <= objArr.length);
                    return Arrays.copyOf(objArr, i);
                }

                /* JADX INFO: renamed from: Z */
                public static long m46298Z(String str) throws ParserException {
                    Matcher matcher = f86203d.matcher(str);
                    if (!matcher.matches()) {
                        throw ParserException.m752a(null, "Invalid date/time format: " + str);
                    }
                    int i = 0;
                    if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                        int i2 = Integer.parseInt(matcher.group(12)) * 60;
                        String strGroup = matcher.group(13);
                        i = strGroup != null ? Integer.parseInt(strGroup) + i2 : i2;
                        if ("-".equals(matcher.group(11))) {
                            i *= -1;
                        }
                    }
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                    gregorianCalendar.clear();
                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                    if (!TextUtils.isEmpty(matcher.group(8))) {
                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                    }
                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                    return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
                }

                /* JADX INFO: renamed from: a */
                public static long m46299a(long j, long j2) {
                    long jM61856I = mif1.m61856I(j, j2);
                    if ((jM61856I != Long.MIN_VALUE || j + j2 == Long.MIN_VALUE) && (jM61856I != Long.MAX_VALUE || j + j2 == Long.MAX_VALUE)) {
                        return jM61856I;
                    }
                    return Long.MAX_VALUE;
                }

                /* JADX INFO: renamed from: a0 */
                public static float m46300a0(long j, long j2) {
                    if (j2 == 0 || j != j2) {
                        return (j / j2) * 100.0f;
                    }
                    return 100.0f;
                }

                /* JADX INFO: renamed from: b */
                public static int m46301b(long[] jArr, long j, boolean z) {
                    int i;
                    int iBinarySearch = Arrays.binarySearch(jArr, j);
                    if (iBinarySearch < 0) {
                        return ~iBinarySearch;
                    }
                    while (true) {
                        i = iBinarySearch + 1;
                        if (i >= jArr.length || jArr[i] != j) {
                            break;
                        }
                        iBinarySearch = i;
                    }
                    return z ? iBinarySearch : i;
                }

                /* JADX INFO: renamed from: b0 */
                public static int m46302b0(long j, long j2) {
                    long jM61857J = mif1.m61857J(j, 100L);
                    return k0e1.m54974I((jM61857J == Long.MAX_VALUE || jM61857J == Long.MIN_VALUE) ? j / (j2 / 100) : jM61857J / j2);
                }

                /* JADX INFO: renamed from: c */
                public static int m46303c(List list, Comparable comparable, boolean z) {
                    int i;
                    int iBinarySearch = Collections.binarySearch(list, comparable);
                    if (iBinarySearch < 0) {
                        i = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i2 = iBinarySearch - 1;
                            if (i2 < 0 || ((Comparable) list.get(i2)).compareTo(comparable) != 0) {
                                break;
                            }
                            iBinarySearch = i2;
                        }
                        i = iBinarySearch;
                    }
                    return z ? Math.max(0, i) : i;
                }

                /* JADX INFO: renamed from: c0 */
                public static void m46304c0(Handler handler, Runnable runnable) {
                    Looper looper = handler.getLooper();
                    if (looper.getThread().isAlive()) {
                        if (looper == Looper.myLooper()) {
                            runnable.run();
                        } else {
                            handler.post(runnable);
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public static int m46305d(w1b0 w1b0Var, long j) {
                    int iM86993k = w1b0Var.m86993k() - 1;
                    int i = 0;
                    while (i <= iM86993k) {
                        int i2 = (i + iM86993k) >>> 1;
                        if (w1b0Var.m86987e(i2) < j) {
                            i = i2 + 1;
                        } else {
                            iM86993k = i2 - 1;
                        }
                    }
                    int i3 = iM86993k + 1;
                    if (i3 < w1b0Var.m86993k() && w1b0Var.m86987e(i3) == j) {
                        return i3;
                    }
                    if (iM86993k == -1) {
                        return 0;
                    }
                    return iM86993k;
                }

                /* JADX INFO: renamed from: d0 */
                public static void m46306d0(int i, int i2, List list) {
                    if (i < 0 || i2 > list.size() || i > i2) {
                        throw new IllegalArgumentException();
                    }
                    if (i != i2) {
                        list.subList(i, i2).clear();
                    }
                }

                /* JADX INFO: renamed from: e */
                public static int m46307e(int[] iArr, int i, boolean z, boolean z2) {
                    int i2;
                    int i3;
                    int iBinarySearch = Arrays.binarySearch(iArr, i);
                    if (iBinarySearch < 0) {
                        i3 = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            i2 = iBinarySearch - 1;
                            if (i2 < 0 || iArr[i2] != i) {
                                break;
                            }
                            iBinarySearch = i2;
                        }
                        i3 = z ? iBinarySearch : i2;
                    }
                    return z2 ? Math.max(0, i3) : i3;
                }

                /* JADX INFO: renamed from: e0 */
                public static long m46308e0(int i, long j) {
                    return m46312g0(j, 1000000L, i, RoundingMode.DOWN);
                }

                /* JADX INFO: renamed from: f */
                public static int m46309f(long[] jArr, long j, boolean z) {
                    int i;
                    int iBinarySearch = Arrays.binarySearch(jArr, j);
                    if (iBinarySearch < 0) {
                        i = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i2 = iBinarySearch - 1;
                            if (i2 < 0 || jArr[i2] != j) {
                                break;
                            }
                            iBinarySearch = i2;
                        }
                        i = iBinarySearch;
                    }
                    return z ? Math.max(0, i) : i;
                }

                /* JADX INFO: renamed from: f0 */
                public static void m46310f0(long[] jArr, long j) {
                    long j2;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int i = 0;
                    if (j >= 1000000 && j % 1000000 == 0) {
                        long jM61879n = mif1.m61879n(j, 1000000L, RoundingMode.UNNECESSARY);
                        while (i < jArr.length) {
                            jArr[i] = mif1.m61879n(jArr[i], jM61879n, roundingMode);
                            i++;
                        }
                        return;
                    }
                    if (j < 1000000 && 1000000 % j == 0) {
                        long jM61879n2 = mif1.m61879n(1000000L, j, RoundingMode.UNNECESSARY);
                        while (i < jArr.length) {
                            jArr[i] = mif1.m61857J(jArr[i], jM61879n2);
                            i++;
                        }
                        return;
                    }
                    int i2 = 0;
                    while (i2 < jArr.length) {
                        long j3 = jArr[i2];
                        if (j3 != 0) {
                            if (j >= j3 && j % j3 == 0) {
                                jArr[i2] = mif1.m61879n(1000000L, mif1.m61879n(j, j3, RoundingMode.UNNECESSARY), roundingMode);
                            } else if (j >= j3 || j3 % j != 0) {
                                j2 = j;
                                jArr[i2] = m46314h0(j3, 1000000L, j2, roundingMode);
                            } else {
                                jArr[i2] = mif1.m61857J(1000000L, mif1.m61879n(j3, j, RoundingMode.UNNECESSARY));
                            }
                            j2 = j;
                        } else {
                            j2 = j;
                        }
                        i2++;
                        j = j2;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static int m46311g(int i, int i2) {
                    return ((i + i2) - 1) / i2;
                }

                /* JADX INFO: renamed from: g0 */
                public static long m46312g0(long j, long j2, long j3, RoundingMode roundingMode) {
                    if (j == 0 || j2 == 0) {
                        return 0L;
                    }
                    if (j3 >= j2 && j3 % j2 == 0) {
                        return mif1.m61879n(j, mif1.m61879n(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
                    }
                    if (j3 < j2 && j2 % j3 == 0) {
                        return mif1.m61857J(j, mif1.m61879n(j2, j3, RoundingMode.UNNECESSARY));
                    }
                    if (j3 < j || j3 % j != 0) {
                        return (j3 >= j || j % j3 != 0) ? m46314h0(j, j2, j3, roundingMode) : mif1.m61857J(j2, mif1.m61879n(j, j3, RoundingMode.UNNECESSARY));
                    }
                    return mif1.m61879n(j2, mif1.m61879n(j3, j, RoundingMode.UNNECESSARY), roundingMode);
                }

                /* JADX INFO: renamed from: h */
                public static void m46313h(Closeable closeable) {
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (IOException unused) {
                        }
                    }
                }

                /* JADX INFO: renamed from: h0 */
                public static long m46314h0(long j, long j2, long j3, RoundingMode roundingMode) {
                    long jM61857J = mif1.m61857J(j, j2);
                    if (jM61857J != Long.MAX_VALUE && jM61857J != Long.MIN_VALUE) {
                        return mif1.m61879n(jM61857J, j3, roundingMode);
                    }
                    long jM61882q = mif1.m61882q(Math.abs(j2), Math.abs(j3));
                    RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                    long jM61879n = mif1.m61879n(j2, jM61882q, roundingMode2);
                    long jM61879n2 = mif1.m61879n(j3, jM61882q, roundingMode2);
                    long jM61882q2 = mif1.m61882q(Math.abs(j), Math.abs(jM61879n2));
                    long jM61879n3 = mif1.m61879n(j, jM61882q2, roundingMode2);
                    long jM61879n4 = mif1.m61879n(jM61879n2, jM61882q2, roundingMode2);
                    long jM61857J2 = mif1.m61857J(jM61879n3, jM61879n);
                    if (jM61857J2 != Long.MAX_VALUE && jM61857J2 != Long.MIN_VALUE) {
                        return mif1.m61879n(jM61857J2, jM61879n4, roundingMode);
                    }
                    double d = jM61879n3 * (jM61879n / jM61879n4);
                    if (d > 9.223372036854776E18d) {
                        return Long.MAX_VALUE;
                    }
                    if (d < -9.223372036854776E18d) {
                        return Long.MIN_VALUE;
                    }
                    return f2s.m40625d(d, roundingMode);
                }

                /* JADX INFO: renamed from: i */
                public static float m46315i(float f, float f2, float f3) {
                    return Math.max(f2, Math.min(f, f3));
                }

                /* JADX INFO: renamed from: i0 */
                public static boolean m46316i0(g7p0 g7p0Var, boolean z) {
                    return g7p0Var == null || !g7p0Var.mo43899o() || g7p0Var.getPlaybackState() == 1 || g7p0Var.getPlaybackState() == 4 || !(!z || g7p0Var.mo43873a0() == 0 || g7p0Var.mo43873a0() == 4);
                }

                /* JADX INFO: renamed from: j */
                public static int m46317j(int i, int i2, int i3) {
                    return Math.max(i2, Math.min(i, i3));
                }

                /* JADX INFO: renamed from: j0 */
                public static String[] m46318j0(String str) {
                    return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
                }

                /* JADX INFO: renamed from: k */
                public static long m46319k(long j, long j2, long j3) {
                    return Math.max(j2, Math.min(j, j3));
                }

                /* JADX INFO: renamed from: k0 */
                public static boolean m46320k0(SQLiteDatabase sQLiteDatabase, String str) {
                    return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
                }

                /* JADX INFO: renamed from: l */
                public static boolean m46321l(SparseArray sparseArray, int i) {
                    return sparseArray.indexOfKey(i) >= 0;
                }

                /* JADX INFO: renamed from: l0 */
                public static byte[] m46322l0(int... iArr) {
                    byte[] bArr = new byte[iArr.length * 4];
                    int i = 0;
                    for (int i2 : iArr) {
                        bArr[i] = (byte) (i2 >> 24);
                        bArr[i + 1] = (byte) (i2 >> 16);
                        int i3 = i + 3;
                        bArr[i + 2] = (byte) (i2 >> 8);
                        i += 4;
                        bArr[i3] = (byte) i2;
                    }
                    return bArr;
                }

                /* JADX INFO: renamed from: m */
                public static boolean m46323m(Object[] objArr, Object obj) {
                    for (Object obj2 : objArr) {
                        if (Objects.equals(obj2, obj)) {
                            return true;
                        }
                    }
                    return false;
                }

                /* JADX INFO: renamed from: m0 */
                public static t601 m46324m0(u790 u790Var, hm6 hm6Var) {
                    t601 t601VarM80149y = t601.m80149y();
                    igd0 igd0Var = new igd0(t601VarM80149y, u790Var, 1);
                    ckr ckrVar = ckr.f39074a;
                    t601VarM80149y.mo28322a(igd0Var, ckrVar);
                    u790Var.mo28322a(new kgd0(u790Var, t601VarM80149y, hm6Var, 18), ckrVar);
                    return t601VarM80149y;
                }

                /* JADX INFO: renamed from: n */
                public static boolean m46325n(SparseArray sparseArray, SparseArray sparseArray2) {
                    if (sparseArray == null) {
                        return sparseArray2 == null;
                    }
                    if (sparseArray2 == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentEquals(sparseArray2);
                    }
                    int size = sparseArray.size();
                    if (size != sparseArray2.size()) {
                        return false;
                    }
                    for (int i = 0; i < size; i++) {
                        if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                            return false;
                        }
                    }
                    return true;
                }

                /* JADX INFO: renamed from: n0 */
                public static long m46326n0(long j) {
                    return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
                }

                /* JADX INFO: renamed from: o */
                public static int m46327o(SparseArray sparseArray) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        return sparseArray.contentHashCode();
                    }
                    int iHashCode = 17;
                    for (int i = 0; i < sparseArray.size(); i++) {
                        iHashCode = Objects.hashCode(sparseArray.valueAt(i)) + ((sparseArray.keyAt(i) + (iHashCode * 31)) * 31);
                    }
                    return iHashCode;
                }

                /* JADX INFO: renamed from: p */
                public static Bundle m46328p(Bundle bundle) {
                    if (bundle == null) {
                        return null;
                    }
                    ClassLoader classLoader = h0b1.class.getClassLoader();
                    classLoader.getClass();
                    bundle.setClassLoader(classLoader);
                    try {
                        bundle.isEmpty();
                        return bundle;
                    } catch (RuntimeException e) {
                        yif1.m93810s("Ignoring invalid bundle", e);
                        return null;
                    }
                }

                /* JADX INFO: renamed from: q */
                public static int m46329q(int i, byte[] bArr, int i2, int i3) {
                    while (i < i2) {
                        i3 = f86209j[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
                        i++;
                    }
                    return i3;
                }

                /* JADX INFO: renamed from: r */
                public static Handler m46330r(cbd0 cbd0Var) {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    return new Handler(looperMyLooper, cbd0Var);
                }

                /* JADX INFO: renamed from: s */
                public static Handler m46331s(Handler.Callback callback) {
                    return new Handler(m46276D(), callback);
                }

                /* JADX INFO: renamed from: t */
                public static long m46332t(int i, long j) {
                    return m46312g0(j, i, 1000000L, RoundingMode.UP);
                }

                /* JADX INFO: renamed from: u */
                public static void m46333u(NotificationManager notificationManager, String str) {
                    if (Build.VERSION.SDK_INT < 26 || notificationManager.getNotificationChannel("default_channel_id") != null) {
                        return;
                    }
                    fz6.m43152h(notificationManager, str);
                }

                /* JADX INFO: renamed from: v */
                public static String m46334v(byte[] bArr) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }

                /* JADX INFO: renamed from: w */
                public static int m46335w(int i) {
                    switch (i) {
                        case 2:
                        case 3:
                            return 3;
                        case 4:
                        case 5:
                        case 6:
                            return 21;
                        case 7:
                        case 8:
                            return 23;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            return 28;
                        case 13:
                        case 19:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        default:
                            return Alert.DURATION_SHOW_INDEFINITELY;
                        case 14:
                            return 25;
                        case 20:
                            return 30;
                        case 21:
                        case 22:
                            return 31;
                        case 30:
                        case 31:
                            return 34;
                    }
                }

                /* JADX INFO: renamed from: x */
                public static int m46336x(int i) {
                    if (i == 10) {
                        return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
                    }
                    if (i == 16) {
                        return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
                    }
                    if (i == 24) {
                        return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
                    }
                    switch (i) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            switch (i) {
                                case 12:
                                    return 743676;
                                case 13:
                                    return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                                case 14:
                                    return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                                default:
                                    return 0;
                            }
                    }
                }

                /* JADX INFO: renamed from: y */
                public static int m46337y(r300 r300Var) {
                    int i = r300Var.f195361K;
                    return i != -1 ? i : m46336x(r300Var.f195360J);
                }

                /* JADX INFO: renamed from: z */
                public static int m46338z(int i) {
                    if (i != 2) {
                        if (i == 3) {
                            return 1;
                        }
                        if (i != 4) {
                            if (i != 21) {
                                if (i != 22) {
                                    if (i != 268435456) {
                                        if (i != 1342177280) {
                                            if (i != 1610612736) {
                                                if (i == 1879048192) {
                                                    return 8;
                                                }
                                                if (i != 1895825408) {
                                                    if (i == 1912602624) {
                                                        return 8;
                                                    }
                                                    throw new IllegalArgumentException();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return 3;
                        }
                        return 4;
                    }
                    return 2;
                }
            }
