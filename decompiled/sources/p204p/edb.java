package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class edb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58492a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, Error.INVALID_COUNTRY_FIELD_NUMBER, Error.TOO_YOUNG_FIELD_NUMBER, 108, 109, 110, ContentType.SHORT_FORM_ON_DEMAND, ContentType.LONG_FORM_ON_DEMAND, ContentType.LIVE, 114, 115, 116, 117, 118, 119, 120, ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, ContentType.USER_GENERATED_LIVE, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178};

    /* JADX INFO: renamed from: A */
    public static void m38545A(String str, String str2, String str3) {
        na6.m63957e(str + str2 + str3);
    }

    /* JADX INFO: renamed from: B */
    public static void m38546B(JSONException jSONException, StringBuilder sb) {
        sb.append(jSONException.getMessage());
        syg1.m79704w(sb.toString());
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ int m38547C(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m38548D(int i) {
        switch (i) {
            case 1:
                return "AZTEC";
            case 2:
                return "CODABAR";
            case 3:
                return "CODE_39";
            case 4:
                return "CODE_93";
            case 5:
                return "CODE_128";
            case 6:
                return "DATA_MATRIX";
            case 7:
                return "EAN_8";
            case 8:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case 12:
                return "QR_CODE";
            case 13:
                return "RSS_14";
            case 14:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case 16:
                return "UPC_E";
            case 17:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m38549E(int i) {
        if (i == 1) {
            return "INITIALISED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "UNINITIALISED";
        }
        return "INITIALISING";
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ String m38550F(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ int[] m38551G(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f58492a, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m38552a(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m38553b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m38554c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static float m38555d(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: e */
    public static int m38556e(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    /* JADX INFO: renamed from: f */
    public static int m38557f(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: g */
    public static MobiusLoop.Builder m38558g(MobiusLoop.Builder builder) {
        return builder.mo15594f(new AndroidLogger());
    }

    /* JADX INFO: renamed from: h */
    public static Object m38559h(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    /* JADX INFO: renamed from: i */
    public static String m38560i(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    /* JADX INFO: renamed from: j */
    public static String m38561j(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: k */
    public static String m38562k(long j, String str, String str2) {
        return str + j + str2;
    }

    /* JADX INFO: renamed from: l */
    public static String m38563l(String str, int i, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m38564m(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: n */
    public static String m38565n(String str, String str2, int i) {
        return str + str2 + i;
    }

    /* JADX INFO: renamed from: o */
    public static String m38566o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: p */
    public static String m38567p(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m38568q(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m38569r(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    /* JADX INFO: renamed from: s */
    public static String m38570s(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static StringBuilder m38571t(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    /* JADX INFO: renamed from: u */
    public static StringBuilder m38572u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: v */
    public static StringBuilder m38573v(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: w */
    public static Set m38574w(Class cls) {
        return Collections.singleton(new fww0(cls));
    }

    /* JADX INFO: renamed from: x */
    public static KotlinNothingValueException m38575x(Object obj) {
        bga.m29073P(obj);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: y */
    public static KotlinNothingValueException m38576y(String str) {
        mt40.m62792d(str);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: z */
    public static c9k m38577z(luk lukVar) {
        return kk40.m56661c(opo.m67570t(njg1.m64613f(), lukVar));
    }
}
