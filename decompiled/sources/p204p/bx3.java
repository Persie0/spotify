package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.datastore.core.CorruptionException;
import androidx.media3.common.ParserException;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class bx3 implements InterfaceC2207oa, Function, rem, tg11, yh00, InterfaceC1698bb, v2n0, s0y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31773a;

    public /* synthetic */ bx3(int i) {
        this.f31773a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final InputStream m30734a(String str) {
        return Runtime.getRuntime().exec(new String[]{"getprop", str}).getInputStream();
    }

    /* JADX INFO: renamed from: e */
    public static final rn10 m30735e(String str, String str2, String str3) {
        rn10 rn10Var = new rn10();
        Bundle bundleM93449h = ydj.m93449h(ContextTrack.Metadata.KEY_TITLE, str, "positive_button_text", str2);
        bundleM93449h.putString("negative_button_text", str3);
        rn10Var.m49706b1(bundleM93449h);
        return rn10Var;
    }

    /* JADX INFO: renamed from: g */
    public static av91 m30736g(int i, String str, st91 st91Var, ArrayList arrayList, String str2) {
        l0y l0yVar = (l0y) arrayList.remove(0);
        gag0 gag0Var = new gag0(1, str2, st91Var);
        Integer num = l0yVar.f128533d;
        String str3 = l0yVar.f128532c;
        cbg0 cbg0Var = new cbg0(gag0Var, num, str3);
        if (arrayList.size() > 0) {
            return m30736g(i, str, cbg0Var.mo24361d(), arrayList, str3);
        }
        if (i == 2) {
            return cbg0Var.m32157a(str);
        }
        if (!l0yVar.f128530a.equals("SHUFFLE_PLAY")) {
            return cbg0Var.m32158h(str);
        }
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("shuffle_play_item", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("shuffle_play", 1, Collections.singletonMap("context_to_be_played", string)), zt91VarM94607a, st91Var, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public static nfu m30737i(String str) {
        Object next;
        Iterator it = m30738j().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((nfu) next).f153427a, str));
        nfu nfuVar = (nfu) next;
        return nfuVar == null ? new zeu(str) : nfuVar;
    }

    /* JADX INFO: renamed from: j */
    public static List m30738j() {
        return h6f.m46715L(bfu.f26784b, cfu.f37441b, ffu.f69086b, ifu.f101828b, kfu.f122229b, mfu.f143187b, efu.f59123b, hfu.f90805b, dfu.f48649b, gfu.f79471b, jfu.f111968b, lfu.f133013b, afu.f15229b);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m30739k() {
        C2529wd c2529wd;
        wia wiaVarM88198i = wia.m88198i();
        if (wiaVarM88198i == null || (c2529wd = wiaVarM88198i.f251586b) == null) {
            return false;
        }
        return c2529wd.m87808z("bnc_instant_deep_linking_enabled");
    }

    /* JADX INFO: renamed from: m */
    public static av91 m30740m(int i, String str, exx exxVar) {
        ArrayList arrayList = new ArrayList(exxVar.f63870a);
        if (arrayList.size() < 2) {
            na6.m63958f("Too few locations", arrayList.toString());
            return null;
        }
        l0y l0yVar = (l0y) arrayList.remove(0);
        String str2 = l0yVar.f128530a;
        String str3 = l0yVar.f128531b;
        if (!str2.equals("TAB") || !wj50.m88271j(str3, "com.spotify.androidauto.home")) {
            if (l0yVar.f128530a.equals("TAB") && wj50.m88271j(str3, "com.spotify.browse")) {
                return null;
            }
            na6.m63958f("Invalid root", l0yVar.toString());
            return null;
        }
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-android-auto-home";
        yt91VarM50626j.f276052f = "7.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
        Collections.singletonList("home");
        l0y l0yVar2 = (l0y) arrayList.remove(0);
        String str4 = l0yVar2.f128530a;
        int iHashCode = str4.hashCode();
        if (iHashCode != -1606743355) {
            if (iHashCode != -77686849) {
                if (iHashCode == 529365700 && str4.equals("OFFLINE_STATUS_ITEM")) {
                    yt91 yt91VarM96903c = zt91VarM94607a.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("offline_status_item", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    zt91 zt91VarM94607a2 = yt91VarM96903c.m94607a();
                    if (!arrayList.isEmpty()) {
                        st91 st91Var = st91.f213865b;
                        return m30736g(i, str, new st91(fr0.m42467k(zt91VarM94607a2)), arrayList, null);
                    }
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = str != null ? str.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                }
            } else if (str4.equals("YOUR_DOWNLOADS")) {
                yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("your_downloads", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a3 = yt91VarM96903c2.m94607a();
                st91 st91Var2 = st91.f213865b;
                return m30736g(i, str, new st91(fr0.m42467k(zt91VarM94607a3)), arrayList, null);
            }
        } else if (str4.equals("SECTION")) {
            String str5 = l0yVar2.f128531b;
            Integer num = l0yVar2.f128533d;
            String str6 = l0yVar2.f128532c;
            yt91 yt91VarM96903c3 = zt91VarM94607a.m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("section", str5, num, str6, null));
            yt91VarM96903c3.f276056j = false;
            zt91 zt91VarM94607a4 = yt91VarM96903c3.m94607a();
            st91 st91Var3 = st91.f213865b;
            return m30736g(i, str, new st91(fr0.m42467k(zt91VarM94607a4)), arrayList, l0yVar2.f128532c);
        }
        na6.m63958f("Invalid section", l0yVar2.toString());
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static void m30741o(JsonReader jsonReader, jf40 jf40Var) throws IOException {
        jsonReader.beginArray();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                j151 j151Var = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if (strNextName.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        strNextString2 = jsonReader.nextString();
                    } else if (strNextName.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                        jsonReader.beginObject();
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        HashMap map3 = new HashMap();
                        String strNextString3 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            if (strNextName2.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                strNextString3 = jsonReader.nextString();
                                if (strNextString3.isEmpty()) {
                                    throw ParserException.m754c("The HOST string is present but empty");
                                }
                            } else if (strNextName2.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName3 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map.put(strNextName3, jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (strNextName2.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map2.put(strNextName4, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (strNextName2.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map3.put(strNextName5, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        j151Var = new j151(strNextString3, map, map2, map3);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString == null) {
                    throw ParserException.m754c("BASE-ID field is missing in a PATHWAY-CLONE object");
                }
                if (strNextString2 == null) {
                    throw ParserException.m754c("ID field is missing in a PATHWAY-CLONE object");
                }
                if (j151Var == null) {
                    throw ParserException.m754c("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object");
                }
                jf40Var.m28985c(new i151(strNextString, strNextString2, j151Var));
                z = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z) {
            throw ParserException.m754c("The PATHWAY-CLONES array is present but empty");
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m30742p(JsonReader jsonReader, jf40 jf40Var) throws IOException {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String strNextString = jsonReader.nextString();
                if (!hashSet.add(strNextString)) {
                    throw ParserException.m754c("The pathway ID (" + strNextString + ") appears more than once in the PATHWAY-PRIORITY array");
                }
                jf40Var.m28985c(strNextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw ParserException.m754c("The PATHWAY-PRIORITY array is present but empty");
        }
    }

    /* JADX INFO: renamed from: q */
    public static JSONObject m30743q() {
        C2529wd c2529wd;
        C2529wd c2529wd2;
        C2529wd c2529wd3;
        C2529wd c2529wd4;
        try {
            JSONObject jSONObject = new JSONObject();
            wia wiaVarM88198i = wia.m88198i();
            boolean zM87808z = false;
            jSONObject.put("expectDelayedSessionInitialization", (wiaVarM88198i == null || (c2529wd4 = wiaVarM88198i.f251586b) == null) ? false : c2529wd4.m87808z("bnc_delayed_session_init_used"));
            jSONObject.put("testMode", grl0.f83792c);
            jSONObject.put("instantDeepLinkingEnabled", m30739k());
            wia wiaVarM88198i2 = wia.m88198i();
            if (wiaVarM88198i2 != null && (c2529wd3 = wiaVarM88198i2.f251586b) != null) {
                zM87808z = c2529wd3.m87808z("bnc_defer_init_for_plugin_runtime");
            }
            jSONObject.put("deferInitForPluginRuntime", zM87808z);
            wia wiaVarM88198i3 = wia.m88198i();
            String strM87778I = null;
            String strM87778I2 = (wiaVarM88198i3 == null || (c2529wd2 = wiaVarM88198i3.f251586b) == null) ? null : c2529wd2.m87778I("bnc_branch_key_source");
            String str = "unknown";
            if (strM87778I2 == null) {
                strM87778I2 = "unknown";
            }
            jSONObject.put("branch_key_source", strM87778I2);
            wia wiaVarM88198i4 = wia.m88198i();
            if (wiaVarM88198i4 != null && (c2529wd = wiaVarM88198i4.f251586b) != null) {
                strM87778I = c2529wd.m87778I("bnc_branch_key_source");
            }
            if (strM87778I != null) {
                str = strM87778I;
            }
            jSONObject.put("branch_key_fallback_used", str.equals("branchKey"));
            return jSONObject;
        } catch (NullPointerException e) {
            syg1.m79704w("Error serializing configuration - null reference: " + e.getMessage());
            return new JSONObject();
        } catch (JSONException e2) {
            syg1.m79704w("Error serializing configuration - JSON error: " + e2.getMessage());
            return new JSONObject();
        } catch (Exception e3) {
            syg1.m79704w("Error serializing configuration - unexpected error: " + e3.getMessage());
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m30744r() {
        wia wiaVarM88198i = wia.m88198i();
        if (wiaVarM88198i != null) {
            ((SharedPreferences.Editor) wiaVarM88198i.f251586b.f250161b).putBoolean("bnc_delayed_session_init_used", true).apply();
        }
    }

    /* JADX INFO: renamed from: s */
    public static final int m30745s(int i, String str) {
        int i2 = 1;
        int iM96514B = 0;
        if (1 <= i) {
            while (true) {
                iM96514B += ((i + 2) - i2) * zn91.m96514B(str.charAt(i2 - 1));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i3 = (iM96514B * 10) % 11;
        if (i3 >= 10) {
            return 0;
        }
        return i3;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f31773a) {
            case 4:
                return ((ihi) obj).f102296c == u300.CONCERTS_NEAR_YOU;
            default:
                return true;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f31773a) {
            case 5:
                return n1m.f149470h.get(obj);
            default:
                return yui0.f276401h.get(obj);
        }
    }

    @Override // p204p.v2n0
    /* JADX INFO: renamed from: b */
    public Object mo30394b(Uri uri, ljo ljoVar) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(ljoVar));
        try {
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw ParserException.m754c("Steering manifest JSON should be an object at root");
            }
            jf40 jf40Var = new jf40(4);
            jf40 jf40Var2 = new jf40(4);
            jsonReader.beginObject();
            Uri uri2 = null;
            int iNextInt = 1;
            long jNextInt = -9223372036854775807L;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    iNextInt = jsonReader.nextInt();
                } else if (strNextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    jNextInt = ((long) jsonReader.nextInt()) * 1000;
                } else if (strNextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                    uri2 = Uri.parse(jsonReader.nextString());
                } else if (strNextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    m30742p(jsonReader, jf40Var);
                } else if (strNextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    m30741o(jsonReader, jf40Var2);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            wsv0 wsv0VarM53150g = jf40Var.m53150g();
            if (wsv0VarM53150g.isEmpty()) {
                throw ParserException.m754c("PATHWAY-PRIORITY field is missing");
            }
            k151 k151Var = new k151(iNextInt, jNextInt, uri2, wsv0VarM53150g, jf40Var2.m53150g());
            jsonReader.close();
            return k151Var;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // p204p.s0y
    /* JADX INFO: renamed from: c */
    public avt mo30746c(q0y q0yVar) {
        return new j2a1();
    }

    @Override // p204p.tg11
    /* JADX INFO: renamed from: d */
    public boolean mo30747d(String str) {
        String path;
        Uri uri = Uri.parse(str);
        if (uri.isHierarchical()) {
            String authority = uri.getAuthority();
            if (wj50.m88271j(authority != null ? authority.toLowerCase(Locale.ROOT) : null, "open.spotify.com") && (path = uri.getPath()) != null && bm51.m29803n0(path, "/s/", false) && path.length() > 3) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.rem
    /* JADX INFO: renamed from: f */
    public Iterable mo30748f(Object obj) {
        Collection collectionMo32019p;
        eab eabVar = (eab) obj;
        return (eabVar == null || (collectionMo32019p = eabVar.mo32019p()) == null) ? lau.f131415a : collectionMo32019p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public Object m30749h(Context context, ibk ibkVar) throws Exception {
        p9s0 p9s0Var;
        sef0 sef0Var;
        if (ibkVar instanceof p9s0) {
            p9s0Var = (p9s0) ibkVar;
            int i = p9s0Var.f175300d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9s0Var.f175300d = i - Integer.MIN_VALUE;
            } else {
                p9s0Var = new p9s0(this, ibkVar);
            }
        } else {
            p9s0Var = new p9s0(this, ibkVar);
        }
        Object obj = p9s0Var.f175298b;
        int i2 = p9s0Var.f175300d;
        if (i2 == 0) {
            bga.m29073P(obj);
            sef0 sef0Var2 = new sef0(context);
            p9s0Var.f175297a = sef0Var2;
            p9s0Var.f175300d = 1;
            Object objM77895m = sef0Var2.m77895m(p9s0Var);
            yuk yukVar = yuk.f276404a;
            if (objM77895m == yukVar) {
                return yukVar;
            }
            obj = objM77895m;
            sef0Var = sef0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sef0Var = p9s0Var.f175297a;
            bga.m29073P(obj);
        }
        try {
            qx30 qx30Var = (qx30) ((sx30) obj);
            return new q9s0(sef0Var, qx30Var, qx30Var.m74098C() ? Collections.singleton(o9s0.f163129a) : gbu.f78413a);
        } catch (Exception e) {
            sef0Var.m77897p();
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public Object m30750l(Context context, int i, ibk ibkVar) {
        ho70 ho70Var;
        iq70 iq70VarM51345n;
        if (ibkVar instanceof ho70) {
            ho70Var = (ho70) ibkVar;
            int i2 = ho70Var.f93476e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ho70Var.f93476e = i2 - Integer.MIN_VALUE;
            } else {
                ho70Var = new ho70(this, ibkVar);
            }
        } else {
            ho70Var = new ho70(this, ibkVar);
        }
        Object objM93517c = ho70Var.f93474c;
        int i3 = ho70Var.f93476e;
        try {
            if (i3 == 0) {
                bga.m29073P(objM93517c);
                ho70Var.f93472a = context;
                ho70Var.f93473b = i;
                ho70Var.f93476e = 1;
                objM93517c = ye10.f271888a.m93517c(context, yq70.f275159b, "appWidgetLayout-" + i, ho70Var);
                yuk yukVar = yuk.f276404a;
                if (objM93517c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = ho70Var.f93473b;
                context = ho70Var.f93472a;
                bga.m29073P(objM93517c);
            }
            iq70VarM51345n = (iq70) objM93517c;
        } catch (CorruptionException unused) {
            iq70VarM51345n = iq70.m51345n();
        } catch (IOException unused2) {
            iq70VarM51345n = iq70.m51345n();
        }
        Context context2 = context;
        int i4 = i;
        yd50<kq70> yd50VarM51347o = iq70VarM51345n.m51347o();
        int iM31820L = c95.m31820L(i6f.m49804T(yd50VarM51347o, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (kq70 kq70Var : yd50VarM51347o) {
            linkedHashMap.put(kq70Var.m57084m(), new Integer(kq70Var.m57085n()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        return new io70(context2, linkedHashMap2, iq70VarM51345n.m51348p(), i4, g6f.m43734m1(linkedHashMap2.values()));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public ArrayList m30751n(qb31 qb31Var) {
        ?? r5 = qb31Var.f186988a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(r5, 10));
        for (hfz0 hfz0Var : r5) {
            arrayList.add(new efz0(hfz0Var.f90968a, hfz0Var.f90969b));
        }
        return arrayList;
    }

    public /* synthetic */ bx3(son sonVar, otn otnVar, int i) {
        this.f31773a = i;
    }

    public /* synthetic */ bx3(boolean z, int i) {
        this.f31773a = i;
    }
}
