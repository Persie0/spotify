package p204p;

import android.os.Parcelable;
import android.util.Patterns;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto$ReadResponse;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.PlayerState;
import com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerResponse;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p196j$.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class efy implements Function3, BiFunction, Function, c5a, Init, vja1, iuk, BiPredicate {

    /* JADX INFO: renamed from: c */
    public static Object f59160c;

    /* JADX INFO: renamed from: d */
    public static Object f59162d;

    /* JADX INFO: renamed from: e */
    public static Object f59164e;

    /* JADX INFO: renamed from: f */
    public static JSONObject f59166f;

    /* JADX INFO: renamed from: g */
    public static boolean f59168g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59173a;

    /* JADX INFO: renamed from: b */
    public static final efy f59158b = new efy(0);

    /* JADX INFO: renamed from: h */
    public static final efy f59170h = new efy(1);

    /* JADX INFO: renamed from: i */
    public static final efy f59171i = new efy(2);

    /* JADX INFO: renamed from: t */
    public static final efy f59172t = new efy(3);

    /* JADX INFO: renamed from: X */
    public static final efy f59151X = new efy(4);

    /* JADX INFO: renamed from: Y */
    public static final efy f59153Y = new efy(5);

    /* JADX INFO: renamed from: Z */
    public static final efy f59155Z = new efy(6);

    /* JADX INFO: renamed from: L0 */
    public static final efy f59139L0 = new efy(7);

    /* JADX INFO: renamed from: M0 */
    public static final efy f59140M0 = new efy(8);

    /* JADX INFO: renamed from: N0 */
    public static final efy f59141N0 = new efy(9);

    /* JADX INFO: renamed from: O0 */
    public static final efy f59142O0 = new efy(10);

    /* JADX INFO: renamed from: P0 */
    public static final efy f59143P0 = new efy(11);

    /* JADX INFO: renamed from: Q0 */
    public static final efy f59144Q0 = new efy(12);

    /* JADX INFO: renamed from: R0 */
    public static final efy f59145R0 = new efy(13);

    /* JADX INFO: renamed from: S0 */
    public static final efy f59146S0 = new efy(14);

    /* JADX INFO: renamed from: T0 */
    public static final efy f59147T0 = new efy(15);

    /* JADX INFO: renamed from: U0 */
    public static final efy f59148U0 = new efy(16);

    /* JADX INFO: renamed from: V0 */
    public static final efy f59149V0 = new efy(17);

    /* JADX INFO: renamed from: W0 */
    public static final efy f59150W0 = new efy(18);

    /* JADX INFO: renamed from: X0 */
    public static final /* synthetic */ efy f59152X0 = new efy(19);

    /* JADX INFO: renamed from: Y0 */
    public static final efy f59154Y0 = new efy(20);

    /* JADX INFO: renamed from: Z0 */
    public static final efy f59156Z0 = new efy(21);

    /* JADX INFO: renamed from: a1 */
    public static final efy f59157a1 = new efy(22);

    /* JADX INFO: renamed from: b1 */
    public static final efy f59159b1 = new efy(23);

    /* JADX INFO: renamed from: c1 */
    public static final efy f59161c1 = new efy(24);

    /* JADX INFO: renamed from: d1 */
    public static final efy f59163d1 = new efy(25);

    /* JADX INFO: renamed from: e1 */
    public static final efy f59165e1 = new efy(26);

    /* JADX INFO: renamed from: f1 */
    public static final efy f59167f1 = new efy(27);

    /* JADX INFO: renamed from: g1 */
    public static final efy f59169g1 = new efy(29);

    public /* synthetic */ efy(int i) {
        this.f59173a = i;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m38748b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((d0w) obj).f44070b;
            if (str == null || str.length() == 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m38749c(String str, JSONObject jSONObject) {
        if (!p2l.f173365a.contains(efy.class)) {
            try {
                if (f59168g) {
                    float[] fArr = new float[30];
                    for (int i = 0; i < 30; i++) {
                        fArr[i] = 0.0f;
                    }
                    try {
                        String lowerCase = str.toLowerCase();
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                        String strOptString = jSONObject.optString("screenname");
                        JSONArray jSONArray = new JSONArray();
                        efy efyVar = f59158b;
                        efyVar.m38758k(jSONObject2, jSONArray);
                        efyVar.m38761n(fArr, efyVar.m38757i(jSONObject2));
                        JSONObject jSONObjectM38754d = efyVar.m38754d(jSONObject2);
                        if (jSONObjectM38754d != null) {
                            efyVar.m38761n(fArr, efyVar.m38756h(jSONObjectM38754d, jSONArray, strOptString, jSONObject2.toString(), lowerCase));
                            return fArr;
                        }
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                p2l.m68953a(efy.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final String m38750e(String str, String str2, String str3) {
        if (p2l.f173365a.contains(efy.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            p2l.m68953a(efy.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m38751f(File file) {
        if (p2l.f173365a.contains(efy.class)) {
            return;
        }
        try {
            try {
                f59166f = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f59166f = new JSONObject(new String(bArr, vuc.f244913a));
                f59160c = kkc0.m56695h0(new pqm0("ENGLISH", "1"), new pqm0("GERMAN", "2"), new pqm0("SPANISH", "3"), new pqm0("JAPANESE", "4"));
                f59162d = kkc0.m56695h0(new pqm0("VIEW_CONTENT", "0"), new pqm0("SEARCH", "1"), new pqm0("ADD_TO_CART", "2"), new pqm0("ADD_TO_WISHLIST", "3"), new pqm0("INITIATE_CHECKOUT", "4"), new pqm0("ADD_PAYMENT_INFO", "5"), new pqm0("PURCHASE", "6"), new pqm0("LEAD", "7"), new pqm0("COMPLETE_REGISTRATION", "8"));
                f59164e = kkc0.m56695h0(new pqm0("BUTTON_TEXT", "1"), new pqm0("PAGE_TITLE", "2"), new pqm0("RESOLVED_DOCUMENT_LINK", "3"), new pqm0("BUTTON_ID", "4"));
                f59168g = true;
            } catch (Throwable th) {
                p2l.m68953a(efy.class, th);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList m38752o(voc1 voc1Var, d0w[] d0wVarArr) {
        String str;
        String str2;
        if (xoc1.f264024Y.m83613a(voc1Var.f243453a)) {
            List<d0w> listM43711Y0 = g6f.m43711Y0(m38748b(bk5.m29620k1(d0wVarArr)), new hwd(27));
            ArrayList arrayList = new ArrayList(i6f.m49804T(listM43711Y0, 10));
            for (d0w d0wVar : listM43711Y0) {
                String str3 = d0wVar.f44069a;
                xj11 xj11Var = d0wVar.f44094z;
                if (xj11Var == null || (str2 = xj11Var.f261996d) == null) {
                    str2 = "";
                }
                arrayList.add(new t5w(str3, str2));
            }
            return arrayList;
        }
        ArrayList<d0w> arrayListM38748b = m38748b(bk5.m29620k1(d0wVarArr));
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayListM38748b, 10));
        for (d0w d0wVar2 : arrayListM38748b) {
            String str4 = d0wVar2.f44069a;
            xj11 xj11Var2 = d0wVar2.f44094z;
            if (xj11Var2 == null || (str = xj11Var2.f261996d) == null) {
                str = "";
            }
            arrayList2.add(new t5w(str4, str));
        }
        return arrayList2;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        switch (this.f59173a) {
            case 1:
                xul0 xul0Var = (xul0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                wj50.m88279p(xul0Var);
                return new C1672am(zBooleanValue, xul0Var, (xul0) obj3);
            default:
                return new fat0((j8t0) obj, (f5b0) obj2, (String) obj3);
        }
    }

    /* JADX INFO: renamed from: a */
    public ejh0 m38753a(int i, String str, st91 st91Var) {
        return new ejh0(str, Integer.valueOf(i), st91Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f59173a) {
            case 3:
                return (List) ((pqm0) obj).f180351b;
            case 4:
                return Boolean.valueOf(dxf1.m37244s("is-euterpe", (Map) obj));
            case 5:
                return Observable.never();
            case 6:
            case 12:
            case 14:
            case 17:
            case 19:
            case 22:
            case 23:
            case 24:
            default:
                return w2a1.f247311a;
            case 7:
                return (dq50) ((br50) obj);
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return AudioSinkChainWrapperEsperanto$ReadResponse.m3396o(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto.ReadResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 9:
                return p1j0.f173119a;
            case 10:
                String strContextUri = ((PlayerState) obj).contextUri();
                return strContextUri == null ? "" : strContextUri;
            case 11:
                p2x0 p2x0Var = (p2x0) obj;
                if (p2x0Var instanceof k2x0) {
                    return MaybeEmpty.f8264a;
                }
                if (p2x0Var instanceof m2x0) {
                    return Maybe.m23363f(((qu80) ((m2x0) p2x0Var).f139474a).f192599e);
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                return Boolean.valueOf(dxf1.m37248x((Map) obj));
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionPlatformContextItemsResponse.m6869n(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 16:
                return new glf((daa0) obj);
            case 18:
                return Single.just(C2244p5.f174033a);
            case 20:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return DebugTracerResponse.m21625n(bArr3);
                } catch (Exception e3) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                }
            case 21:
                return ((spi) obj).f212883d;
            case 25:
                return Boolean.valueOf(((afa0) obj) == afa0.f15105a);
            case 26:
                return Boolean.valueOf(((v5t) obj).f237643w);
            case 27:
                return ((GetEntityResponse) obj).m15422n().m15411o().getName();
        }
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m38754d(JSONObject jSONObject) {
        if (!p2l.f173365a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return jSONObject;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectM38754d = m38754d(jSONArrayOptJSONArray.getJSONObject(i));
                        if (jSONObjectM38754d != null) {
                            return jSONObjectM38754d;
                        }
                    }
                }
            } catch (JSONException unused) {
            } catch (Throwable th) {
                p2l.m68953a(this, th);
            }
        }
        return null;
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((mgd) obj);
    }

    /* JADX INFO: renamed from: g */
    public boolean m38755g(String[] strArr, String[] strArr2) {
        if (!p2l.f173365a.contains(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (wl51.m88496t0(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                p2l.m68953a(this, th);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX INFO: renamed from: h */
    public float[] m38756h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        String str4;
        String string;
        String string2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float[] fArr2 = null;
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i = 0;
            while (true) {
                if (i >= 30) {
                    break;
                }
                fArr3[i] = 0.0f;
                i++;
                p2l.m68953a(this, th);
                return fArr;
            }
            int length = jSONArray.length();
            boolean z = true;
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i2 = 0;
                while (i2 < length2) {
                    fArr = fArr2;
                    try {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            boolean z2 = z;
                            if (!p2l.f173365a.contains(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th) {
                                    p2l.m68953a(this, th);
                                }
                            }
                            i2++;
                            fArr2 = fArr;
                            z = z2;
                        } catch (JSONException unused) {
                            fArr3[13] = -1.0f;
                            fArr3[14] = -1.0f;
                            str4 = str + '|' + str3;
                            StringBuilder sb = new StringBuilder();
                            StringBuilder sb2 = new StringBuilder();
                            m38762p(jSONObject, sb2, sb);
                            string = sb.toString();
                            string2 = sb2.toString();
                            if (m38760m("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            fArr3[15] = f;
                            if (m38760m("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                                f2 = 1.0f;
                            } else {
                                f2 = 0.0f;
                            }
                            fArr3[16] = f2;
                            if (m38760m("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            fArr3[17] = f3;
                            if (wl51.m88496t0(str2, "password", false)) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            fArr3[18] = f4;
                            if (m38759l("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            fArr3[19] = f5;
                            if (m38759l("(?i)(sign in)|login|signIn", str2)) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.0f;
                            }
                            fArr3[20] = f6;
                            if (m38759l("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fArr3[21] = f7;
                            if (m38760m("PURCHASE", "BUTTON_TEXT", string2)) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            fArr3[22] = f8;
                            if (m38760m("PURCHASE", "PAGE_TITLE", str4)) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            fArr3[24] = f9;
                            if (m38759l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fArr3[25] = f10;
                            if (m38759l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            fArr3[27] = f11;
                            if (m38760m("LEAD", "BUTTON_TEXT", string2)) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            fArr3[28] = f12;
                            fArr3[29] = m38760m("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
                            return fArr3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            str4 = str + '|' + str3;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            m38762p(jSONObject, sb4, sb3);
            string = sb3.toString();
            string2 = sb4.toString();
            if (m38760m("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            fArr3[15] = f;
            if (m38760m("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr3[16] = f2;
            if (m38760m("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr3[17] = f3;
            if (wl51.m88496t0(str2, "password", false)) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr3[18] = f4;
            if (m38759l("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr3[19] = f5;
            if (m38759l("(?i)(sign in)|login|signIn", str2)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr3[20] = f6;
            if (m38759l("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr3[21] = f7;
            if (m38760m("PURCHASE", "BUTTON_TEXT", string2)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr3[22] = f8;
            if (m38760m("PURCHASE", "PAGE_TITLE", str4)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr3[24] = f9;
            if (m38759l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr3[25] = f10;
            if (m38759l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr3[27] = f11;
            if (m38760m("LEAD", "BUTTON_TEXT", string2)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr3[28] = f12;
            fArr3[29] = m38760m("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public float[] m38757i(JSONObject jSONObject) {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m38755g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m38755g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (m38755g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (m38755g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (wl51.m88496t0(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (m38755g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (wl51.m88496t0(lowerCase3, "radio", false) && wl51.m88496t0(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    m38761n(fArr, m38757i(jSONArrayOptJSONArray.getJSONObject(i2)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3 = (String) linkedHashMap.get("identifier");
        if (str3 == null) {
            return null;
        }
        return new nwi(mec0Var, str3, str2, str);
    }

    /* JADX INFO: renamed from: k */
    public boolean m38758k(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (!p2l.f173365a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (jSONArrayOptJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i++;
                }
                boolean z2 = z;
                JSONArray jSONArray2 = new JSONArray();
                if (z) {
                    int length2 = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                    }
                    return z2;
                }
                int length3 = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    if (m38758k(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z2;
            } catch (JSONException unused) {
            } catch (Throwable th) {
                p2l.m68953a(this, th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m38759l(String str, String str2) {
        if (p2l.f173365a.contains(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: m */
    public boolean m38760m(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (!p2l.f173365a.contains(this)) {
            try {
                JSONObject jSONObject = f59166f;
                String strOptString = null;
                if (jSONObject == null) {
                    wj50.m88260d0("rules");
                    throw null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (jSONObjectOptJSONObject3 != null) {
                    ?? r4 = f59160c;
                    if (r4 == 0) {
                        wj50.m88260d0("languageInfo");
                        throw null;
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) r4.get("ENGLISH"));
                    if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        ?? r1 = f59162d;
                        if (r1 == 0) {
                            wj50.m88260d0("eventInfo");
                            throw null;
                        }
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) r1.get(str));
                        if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                            ?? r0 = f59164e;
                            if (r0 == 0) {
                                wj50.m88260d0("textTypeInfo");
                                throw null;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString((String) r0.get(str2));
                        }
                    }
                }
                if (strOptString != null) {
                    return m38759l(strOptString, str3);
                }
            } catch (Throwable th) {
                p2l.m68953a(this, th);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m38761n(float[] fArr, float[] fArr2) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = fArr[i] + fArr2[i];
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m38762p(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            String lowerCase = jSONObject.optString("text", "").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    m38762p(jSONArrayOptJSONArray.getJSONObject(i), sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX INFO: renamed from: q */
    public xfq m38763q(String str, String str2, String str3, int i, st91 st91Var) {
        return new xfq(new djh0(str, Integer.valueOf(i), str2, str3, st91Var));
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        to80 to80Var = (to80) obj;
        to80 to80Var2 = (to80) obj2;
        Parcelable parcelable = to80Var.f222199a;
        Parcelable parcelable2 = to80Var2.f222199a;
        if (!wj50.m88271j(to80Var.f222200b, to80Var2.f222200b)) {
            return false;
        }
        if (!(parcelable instanceof i6a0) || !(parcelable2 instanceof i6a0)) {
            return to80Var.equals(to80Var2);
        }
        i6a0 i6a0Var = (i6a0) parcelable;
        i6a0 i6a0Var2 = (i6a0) parcelable2;
        return wj50.m88271j(i6a0Var.mo27290g(), i6a0Var2.mo27290g()) && i6a0Var.getCount() == i6a0Var2.getCount() && wj50.m88271j(i6a0Var.getItems(), i6a0Var2.getItems()) && wj50.m88271j(i6a0Var.mo27291h(), i6a0Var2.mo27291h());
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0((Boolean) obj, (we40) obj2);
    }
}
