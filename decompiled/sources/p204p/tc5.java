package p204p;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.spotify.base.java.logging.Logger;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutContentContainerView;
import com.spotify.music.R;
import com.spotify.playability.esperanto.proto.EsPlayability$GetLocallyPlayableResponse;
import com.spotify.playability.esperanto.proto.EsPlayability$LocallyPlayable;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class tc5 implements dn01, yh00, Function, fz61, i5w0, BiFunction, qmk0, ab01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f219024a;

    public /* synthetic */ tc5(int i) {
        this.f219024a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final void m80423c(File file) {
        if (file.exists()) {
            if (file.delete()) {
                return;
            }
            Logger.m3966b("Failed to delete old (possibly stale) native library", new Object[0]);
            throw new UnsatisfiedLinkError("Failed to delete old (possibly stale) native library");
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (parentFile.exists()) {
            if (parentFile.isDirectory()) {
                return;
            }
            Logger.m3966b("Unexpected file where native lib dir expected!", new Object[0]);
            throw new UnsatisfiedLinkError("Unexpected file where native lib dir expected!");
        }
        if (parentFile.mkdirs()) {
            return;
        }
        Logger.m3966b("Failed to create directory for native library extraction", new Object[0]);
        throw new UnsatisfiedLinkError("Failed to create directory for native library extraction");
    }

    /* JADX INFO: renamed from: g */
    public static final float m80424g(TypedArray typedArray, int i) {
        int i2 = MainLayoutContentContainerView.f5410T0;
        return typedArray.getDimension(i, 0.0f) / typedArray.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public static final void m80425h(HashMap map, String str, String str2) {
        List listM44518y;
        HashMap map2 = gbf0.f78293e;
        switch (str.hashCode()) {
            case 3585:
                if (str.equals("r3")) {
                    str2 = (!bm51.m29803n0(str2, "m", false) && !bm51.m29803n0(str2, "b", false) && !bm51.m29803n0(str2, "ge", false)) ? "f" : "m";
                }
                break;
            case 3586:
                if (str.equals("r4")) {
                    str2 = dq60.m36614n("[^a-z]+", str2, "");
                }
                break;
            case 3587:
                if (str.equals("r5")) {
                    str2 = dq60.m36614n("[^a-z]+", str2, "");
                }
                break;
            case 3588:
                if (str.equals("r6") && wl51.m88496t0(str2, "-", false)) {
                    Pattern patternCompile = Pattern.compile("-");
                    wl51.m88474X0(0);
                    Matcher matcher = patternCompile.matcher(str2);
                    if (matcher.find()) {
                        ArrayList arrayList = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList.add(str2.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList.add(str2.subSequence(iEnd, str2.length()).toString());
                        listM44518y = arrayList;
                    } else {
                        listM44518y = geg1.m44518y(str2.toString());
                    }
                    str2 = ((String[]) listM44518y.toArray(new String[0]))[0];
                }
                break;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: l */
    public static lfq m80426l(Context context, pzz pzzVar) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{pzzVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return ozz.m68671a(context, Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: m */
    public static gn80 m80427m(int i) {
        return gn80.f82173b[i];
    }

    /* JADX INFO: renamed from: p */
    public static int m80428p(lk51 lk51Var) {
        switch (lk51Var.ordinal()) {
            case 0:
                throw new IllegalArgumentException("Cannot provide bitrate for Unknown");
            case 1:
                return R.string.lossless_streaming_quality_low_bitrate;
            case 2:
                return R.string.lossless_streaming_quality_normal_bitrate;
            case 3:
                return R.string.lossless_streaming_quality_high_bitrate;
            case 4:
                return R.string.lossless_streaming_quality_very_high_bitrate;
            case 5:
                return R.string.lossless_streaming_quality_lossless_16_bitrate;
            case 6:
                return R.string.lossless_streaming_quality_lossless_24_bitrate;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m80429q(lk51 lk51Var) {
        switch (lk51Var.ordinal()) {
            case 0:
                return R.string.lossless_streaming_quality_unknown;
            case 1:
                return R.string.lossless_streaming_quality_low;
            case 2:
                return R.string.lossless_streaming_quality_normal;
            case 3:
                return R.string.lossless_streaming_quality_high;
            case 4:
                return R.string.lossless_streaming_quality_very_high;
            case 5:
                return R.string.lossless_streaming_quality_lossless_16;
            case 6:
                return R.string.lossless_streaming_quality_lossless_24;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: r */
    public static int m80430r(PlayerState playerState) {
        String strM38000d0;
        Integer numM29807r0;
        ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
        boolean z = false;
        if (((contextTrack == null || (strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_ITERATION)) == null || (numM29807r0 = bm51.m29807r0(strM38000d0)) == null) ? 0 : numM29807r0.intValue()) > 0) {
            return 3;
        }
        if (!playerState.isPaused() && (!playerState.playbackSpeed().mo49279c() || wj50.m88267h((Double) playerState.playbackSpeed().mo49278b(), 0.0d))) {
            z = true;
        }
        return z ? 2 : 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m80431s(Activity activity) {
        View viewM38205j;
        int iHashCode = activity.hashCode();
        HashMap map = null;
        if (!p2l.f173365a.contains(gbf0.class)) {
            try {
                map = gbf0.f78293e;
            } catch (Throwable th) {
                p2l.m68953a(gbf0.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object gbf0Var = map.get(numValueOf);
        if (gbf0Var == null) {
            gbf0Var = new gbf0(activity);
            map.put(numValueOf, gbf0Var);
        }
        gbf0 gbf0Var2 = (gbf0) gbf0Var;
        Set set = p2l.f173365a;
        if (set.contains(gbf0.class)) {
            return;
        }
        try {
            if (set.contains(gbf0Var2)) {
                return;
            }
            try {
                if (!gbf0Var2.f78297d.getAndSet(true) && (viewM38205j = e95.m38205j((Activity) gbf0Var2.f78296c.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM38205j.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(gbf0Var2);
                        return;
                    }
                    return;
                    p2l.m68953a(gbf0.class, th);
                }
            } catch (Throwable th2) {
                p2l.m68953a(gbf0Var2, th2);
            }
        } catch (Throwable th3) {
            p2l.m68953a(gbf0.class, th3);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m80432u(Context context, qzz qzzVar) {
        context.getContentResolver().unregisterContentObserver(qzzVar);
    }

    @Override // p204p.dn01
    /* JADX INFO: renamed from: a */
    public Object mo36439a(qm01 qm01Var) {
        xn8 xn8Var;
        icr0 hcr0Var;
        t0u0 t0u0Var;
        switch (this.f219024a) {
            case 1:
                z0c z0cVar = qm01Var.f190003a.f166207c;
                v0c v0cVar = z0cVar instanceof v0c ? (v0c) z0cVar : null;
                if (v0cVar == null || (xn8Var = v0cVar.f235958a) == null) {
                    throw new IllegalArgumentException("Expected BackgroundWithSticker card data");
                }
                am8 am8Var = xn8Var.f263557a;
                String str = am8Var.f17059b;
                List listM88477a1 = wl51.m88477a1(str, new String[]{":"}, 0, 6);
                if (listM88477a1.size() != 2) {
                    throw new IllegalArgumentException("Invalid aspect ratio format: ".concat(str).toString());
                }
                Float fM29806q0 = bm51.m29806q0((String) listM88477a1.get(0));
                Float fM29806q1 = bm51.m29806q0((String) listM88477a1.get(1));
                if (fM29806q0 == null || Math.abs(fM29806q0.floatValue()) > Float.MAX_VALUE || fM29806q0.floatValue() <= 0.0f) {
                    throw new IllegalArgumentException(klh.m56833e(listM88477a1.get(0), "Invalid aspect ratio width: ").toString());
                }
                if (fM29806q1 == null || Math.abs(fM29806q1.floatValue()) > Float.MAX_VALUE || fM29806q1.floatValue() <= 0.0f) {
                    throw new IllegalArgumentException(klh.m56833e(listM88477a1.get(1), "Invalid aspect ratio height: ").toString());
                }
                float fFloatValue = fM29806q0.floatValue() / fM29806q1.floatValue();
                if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
                    throw new IllegalArgumentException("Invalid aspect ratio: ".concat(str).toString());
                }
                jm8 jm8Var = am8Var.f17058a;
                if (jm8Var instanceof gm8) {
                    gm8 gm8Var = (gm8) jm8Var;
                    String str2 = gm8Var.f81329a;
                    String str3 = gm8Var.f81330b;
                    if (str3 == null) {
                        str3 = str2;
                    }
                    hcr0Var = new fcr0(str2, str3, "");
                } else if (jm8Var instanceof hm8) {
                    hcr0Var = new gcr0(((hm8) jm8Var).f92856a, "");
                } else {
                    if (!(jm8Var instanceof im8)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hcr0Var = new hcr0(((im8) jm8Var).f103639a, 0L, 0L, true, true, 2, "");
                }
                hm8 hm8Var = xn8Var.f263558b;
                return new yn8(hcr0Var, fFloatValue, hm8Var != null ? new gcr0(hm8Var.f92856a, "") : null);
            default:
                ok01 ok01Var = qm01Var.f190003a;
                z0c z0cVar2 = ok01Var.f166207c;
                w0c w0cVar = z0cVar2 instanceof w0c ? (w0c) z0cVar2 : null;
                if (w0cVar == null || (t0u0Var = w0cVar.f246695a) == null) {
                    throw new IllegalArgumentException("Expected Quote card data");
                }
                String strM35694A = ok01Var.f166206b.m35694A();
                if (strM35694A != null) {
                    return new g271(strM35694A, t0u0Var.f215990c, t0u0Var.f215991d);
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // p204p.yh00
    public Object apply(Object obj) {
        switch (this.f219024a) {
            case 3:
                return nee.f152978h.get(obj);
            case 4:
                upk0 upk0Var = (upk0) obj;
                int i = upk0Var.f232717c;
                long jM33187f = cks.m33187f(upk0Var.f232718d);
                ee7 ee7Var = upk0Var.f232716b;
                long j = ee7Var != null ? ee7Var.f58692e : 0L;
                if (i >= 100) {
                    return oh20.f165315a;
                }
                return jM33187f > 0 ? new ph20(8, jM33187f, j) : new qh20(j);
            case 9:
                return ktr.f126383h.get(obj);
            case 20:
                List<EsPlayability$LocallyPlayable> itemsList = ((EsPlayability$GetLocallyPlayableResponse) obj).getItemsList();
                ArrayList arrayList = new ArrayList(i6f.m49804T(itemsList, 10));
                for (EsPlayability$LocallyPlayable esPlayability$LocallyPlayable : itemsList) {
                    arrayList.add(new dto0(esPlayability$LocallyPlayable.getUri(), esPlayability$LocallyPlayable.getLocallyPlayable()));
                }
                return new eto0(arrayList);
            case 22:
                throw ei6.m39072i(obj);
            case 24:
                ry21 ry21Var = (ry21) obj;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                return new ez21(new l031(ry21Var.f203802a, ry21Var.f203803b + jElapsedRealtime), jElapsedRealtime);
            default:
                throw ei6.m39072i(obj);
        }
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        throw new IllegalStateException("Dummy element used only for data declarations");
    }

    @Override // p204p.ab01
    /* JADX INFO: renamed from: d */
    public y601 mo25305d(iq3 iq3Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        xhy0 xhy0Var = jSONObject.has("session") ? new xhy0(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new xhy0(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        uz6 uz6Var = new uz6(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new y601(jCurrentTimeMillis, xhy0Var, uz6Var, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // p204p.dn01
    /* JADX INFO: renamed from: e */
    public Object mo36440e(pm01 pm01Var) {
        switch (this.f219024a) {
            case 1:
                throw new UnsupportedOperationException("Chat preview input not supported for background with sticker cards");
            default:
                throw new UnsupportedOperationException("Chat preview input not supported for text content cards");
        }
    }

    @Override // p204p.dn01
    /* JADX INFO: renamed from: f */
    public Object mo36441f(rm01 rm01Var) {
        switch (this.f219024a) {
            case 1:
                throw new UnsupportedOperationException("URI input not supported for background with sticker cards");
            default:
                throw new UnsupportedOperationException("URI input not supported for text content cards");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m80433i(l25 l25Var, l25 l25Var2) {
        HashSet hashSet = new HashSet();
        Iterator it = l25Var.iterator();
        while (it.hasNext()) {
            hashSet.add(((y15) it.next()).mo51608b());
        }
        Iterator it2 = l25Var2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((y15) it2.next()).mo51608b());
        }
    }

    /* JADX INFO: renamed from: j */
    public jd21 m80434j(x4b x4bVar, gn91 gn91Var, boolean z, int i, boolean z2) {
        l25 l25Var;
        gn91 gn91VarM78988c;
        char c;
        cn91 cn91Var = (cn91) x4bVar.f258038c;
        ho91 ho91VarM80435k = m80435k(new io91(1, ((syq) cn91Var).m79712J1()), x4bVar, null, i);
        jd21 jd21VarM53267e = jg31.m53267e(ho91VarM80435k.mo48023b());
        if (qug1.m73946p(jd21VarM53267e)) {
            return jd21VarM53267e;
        }
        ho91VarM80435k.mo48022a();
        l25 annotations = jd21VarM53267e.getAnnotations();
        char c2 = 0;
        o25 o25Var = (o25) p25.f173246b.m97257o(gn91Var, p25.f173245a[0]);
        if (o25Var == null || (l25Var = o25Var.f160933a) == null) {
            l25Var = e370.f55667h;
        }
        m80433i(annotations, l25Var);
        if (!qug1.m73946p(jd21VarM53267e)) {
            if (qug1.m73946p(jd21VarM53267e)) {
                gn91VarM78988c = jd21VarM53267e.mo36062B0();
            } else {
                gn91 gn91VarMo36062B0 = jd21VarM53267e.mo36062B0();
                sr31 sr31Var = gn91.f82663b;
                if (gn91Var.isEmpty() && gn91VarMo36062B0.isEmpty()) {
                    gn91VarM78988c = gn91Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ConcurrentHashMap) sr31Var.f213224b).values().iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        o25 o25Var2 = (o25) gn91Var.f146194a.get(iIntValue);
                        o25 o25Var3 = (o25) gn91VarMo36062B0.f146194a.get(iIntValue);
                        if (o25Var2 != null) {
                            c = c2;
                            if (o25Var3 != null) {
                                l25 n25Var = o25Var2.f160933a;
                                l25 l25Var2 = o25Var3.f160933a;
                                if (n25Var.isEmpty()) {
                                    n25Var = l25Var2;
                                } else if (!l25Var2.isEmpty()) {
                                    l25[] l25VarArr = new l25[2];
                                    l25VarArr[c] = n25Var;
                                    l25VarArr[1] = l25Var2;
                                    n25Var = new n25(l25VarArr);
                                }
                                o25Var2 = new o25(n25Var);
                            }
                            o25Var3 = o25Var2;
                        } else if (o25Var3 == null) {
                            c = c2;
                            o25Var3 = null;
                        } else if (o25Var2 == null) {
                            c = c2;
                        } else {
                            l25 n25Var2 = o25Var3.f160933a;
                            l25 l25Var3 = o25Var2.f160933a;
                            if (n25Var2.isEmpty()) {
                                c = c2;
                                n25Var2 = l25Var3;
                            } else if (l25Var3.isEmpty()) {
                                c = c2;
                            } else {
                                c = c2;
                                l25[] l25VarArr2 = new l25[2];
                                l25VarArr2[c] = n25Var2;
                                l25VarArr2[1] = l25Var3;
                                n25Var2 = new n25(l25VarArr2);
                            }
                            o25Var3 = new o25(n25Var2);
                        }
                        ceg1.m32571j(arrayList, o25Var3);
                        c2 = c;
                    }
                    gn91VarM78988c = sr31.m78988c(arrayList);
                }
            }
            jd21VarM53267e = jg31.m53283v(jd21VarM53267e, null, gn91VarM78988c, 1);
        }
        jd21 jd21VarM78638i = so91.m78638i(jd21VarM53267e, z);
        return z2 ? frz0.m42536u(jd21VarM78638i, pug1.m71085q((List) x4bVar.f258039d, afe0.f15137b, gn91Var, ((syq) cn91Var).f215321i, z)) : jd21VarM78638i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public ho91 m80435k(ho91 ho91Var, x4b x4bVar, bo91 bo91Var, int i) {
        int iMo27374C;
        d15 d15Var = (cn91) x4bVar.f258038c;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((pqo) d15Var).getName());
        }
        if (ho91Var.mo48024c()) {
            wj50.m88279p(bo91Var);
            return so91.m78639j(bo91Var);
        }
        gd70 gd70VarMo48023b = ho91Var.mo48023b();
        qge qgeVarMo25169G = gd70VarMo48023b.mo36063C0().mo25169G();
        ho91 ho91Var2 = qgeVarMo25169G instanceof bo91 ? (ho91) ((Map) x4bVar.f258040e).get(qgeVarMo25169G) : null;
        if (ho91Var2 == null) {
            jd21 jd21VarM53267e = jg31.m53267e(ho91Var.mo48023b().mo35108F0());
            if (!qug1.m73946p(jd21VarM53267e) && so91.m78632c(jd21VarM53267e, sn91.f210864h, null)) {
                jn91 jn91VarMo36063C0 = jd21VarM53267e.mo36063C0();
                qge qgeVarMo25169G2 = jn91VarMo36063C0.mo25169G();
                jn91VarMo36063C0.mo25171e().size();
                jd21VarM53267e.mo36061A0().size();
                if (!(qgeVarMo25169G2 instanceof bo91)) {
                    if (!(qgeVarMo25169G2 instanceof cn91)) {
                        int i2 = 0;
                        jd21 jd21VarM80438t = m80438t(jd21VarM53267e, x4bVar, i);
                        oo91.m67458d(jd21VarM80438t);
                        for (Object obj : jd21VarM80438t.mo36061A0()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                h6f.m46722S();
                                throw null;
                            }
                            ho91 ho91Var3 = (ho91) obj;
                            if (!ho91Var3.mo48024c() && !so91.m78632c(ho91Var3.mo48023b(), sn91.f210863g, null)) {
                            }
                            i2 = i3;
                        }
                        return new io91(ho91Var.mo48022a(), jd21VarM80438t);
                    }
                    cn91 cn91Var = (cn91) qgeVarMo25169G2;
                    if (x4bVar.m89852B(cn91Var)) {
                        return new io91(1, ehw.m39006b(chw.RECURSIVE_TYPE_ALIAS, ((pqo) cn91Var).getName().f192387a));
                    }
                    List listMo36061A0 = jd21VarM53267e.mo36061A0();
                    int i4 = 0;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(listMo36061A0, 10));
                    for (Object obj2 : listMo36061A0) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        arrayList.add(m80435k((ho91) obj2, x4bVar, (bo91) jn91VarMo36063C0.mo25171e().get(i4), i + 1));
                        i4 = i5;
                    }
                    List listMo25171e = ((syq) cn91Var).f215321i.mo25171e();
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(listMo25171e, 10));
                    Iterator it = listMo25171e.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((bo91) it.next()).mo27377a());
                    }
                    return new io91(ho91Var.mo48022a(), frz0.m42536u(m80434j(new x4b(x4bVar, cn91Var, arrayList, kkc0.m56705r0(g6f.m43746s1(arrayList2, arrayList)), 22), jd21VarM53267e.mo36062B0(), jd21VarM53267e.mo36064D0(), i + 1, false), m80438t(jd21VarM53267e, x4bVar, i)));
                }
            }
            return ho91Var;
        }
        if (ho91Var2.mo48024c()) {
            wj50.m88279p(bo91Var);
            return so91.m78639j(bo91Var);
        }
        d6a1 d6a1VarMo35108F0 = ho91Var2.mo48023b().mo35108F0();
        int iMo48022a = ho91Var2.mo48022a();
        int iMo48022a2 = ho91Var.mo48022a();
        if (iMo48022a2 != iMo48022a && iMo48022a2 != 1 && iMo48022a == 1) {
            iMo48022a = iMo48022a2;
        }
        if (bo91Var == null || (iMo27374C = bo91Var.mo27374C()) == 0) {
            iMo27374C = 1;
        }
        if (iMo27374C != iMo48022a && iMo27374C != 1 && iMo48022a == 1) {
            iMo48022a = 1;
        }
        m80433i(gd70VarMo48023b.getAnnotations(), d6a1VarMo35108F0.getAnnotations());
        jd21 jd21VarM78638i = so91.m78638i(jg31.m53267e(d6a1VarMo35108F0), gd70VarMo48023b.mo36064D0());
        gn91 gn91VarMo36062B0 = gd70VarMo48023b.mo36062B0();
        if (!qug1.m73946p(jd21VarM78638i)) {
            if (qug1.m73946p(jd21VarM78638i)) {
                gn91VarMo36062B0 = jd21VarM78638i.mo36062B0();
            } else {
                gn91 gn91VarMo36062B1 = jd21VarM78638i.mo36062B0();
                sr31 sr31Var = gn91.f82663b;
                if (!gn91VarMo36062B0.isEmpty() || !gn91VarMo36062B1.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = ((ConcurrentHashMap) sr31Var.f213224b).values().iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        o25 o25Var = (o25) gn91VarMo36062B0.f146194a.get(iIntValue);
                        o25 o25Var2 = (o25) gn91VarMo36062B1.f146194a.get(iIntValue);
                        if (o25Var != null) {
                            if (o25Var2 != null) {
                                l25 n25Var = o25Var.f160933a;
                                l25 l25Var = o25Var2.f160933a;
                                if (n25Var.isEmpty()) {
                                    n25Var = l25Var;
                                } else if (!l25Var.isEmpty()) {
                                    n25Var = new n25(new l25[]{n25Var, l25Var});
                                }
                                o25Var = new o25(n25Var);
                            }
                            o25Var2 = o25Var;
                        } else if (o25Var2 == null) {
                            o25Var2 = null;
                        } else if (o25Var != null) {
                            l25 n25Var2 = o25Var2.f160933a;
                            l25 l25Var2 = o25Var.f160933a;
                            if (n25Var2.isEmpty()) {
                                n25Var2 = l25Var2;
                            } else if (!l25Var2.isEmpty()) {
                                n25Var2 = new n25(new l25[]{n25Var2, l25Var2});
                            }
                            o25Var2 = new o25(n25Var2);
                        }
                        ceg1.m32571j(arrayList3, o25Var2);
                    }
                    gn91VarMo36062B0 = sr31.m78988c(arrayList3);
                }
            }
            jd21VarM78638i = jg31.m53283v(jd21VarM78638i, null, gn91VarMo36062B0, 1);
        }
        return new io91(iMo48022a, jd21VarM78638i);
    }

    /* JADX INFO: renamed from: n */
    public String m80436n() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: o */
    public int m80437o(d0w d0wVar, int i, a5x0 a5x0Var) {
        if (a5x0Var.m24821a(i)) {
            return 2;
        }
        return !d0wVar.f44083o ? 1 : 3;
    }

    /* JADX INFO: renamed from: t */
    public jd21 m80438t(jd21 jd21Var, x4b x4bVar, int i) {
        jn91 jn91VarMo36063C0 = jd21Var.mo36063C0();
        List listMo36061A0 = jd21Var.mo36061A0();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listMo36061A0, 10));
        int i2 = 0;
        for (Object obj : listMo36061A0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            ho91 ho91Var = (ho91) obj;
            ho91 ho91VarM80435k = m80435k(ho91Var, x4bVar, (bo91) jn91VarMo36063C0.mo25171e().get(i2), i + 1);
            if (!ho91VarM80435k.mo48024c()) {
                ho91VarM80435k = new io91(ho91VarM80435k.mo48022a(), so91.m78637h(ho91VarM80435k.mo48023b(), ho91Var.mo48023b().mo36064D0()));
            }
            arrayList.add(ho91VarM80435k);
            i2 = i3;
        }
        return jg31.m53283v(jd21Var, arrayList, null, 2);
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        gze1 gze1Var = (gze1) bz61Var.mo26518k(ez61.f64285a);
        if (gze1Var == null || (gze1Var instanceof hze1)) {
            return null;
        }
        return gze1Var;
    }

    public /* synthetic */ tc5(int i, Object obj, Object obj2) {
        this.f219024a = i;
    }

    public /* synthetic */ tc5(Object obj, int i) {
        this.f219024a = i;
    }

    public /* synthetic */ tc5(boolean z) {
        this.f219024a = 14;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        boolean z;
        ty80 ty80Var = (ty80) obj;
        if (((Boolean) obj2).booleanValue() || !ty80Var.f224877f.f271278w.f156638b) {
            z = false;
        } else {
            if (g0b1.m43270l(ty80Var.f224881j, (in80[]) Arrays.copyOf(new in80[]{in80.f103923d, in80.f103927h}, 2)) || ty80Var.m81955a()) {
                z = true;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
