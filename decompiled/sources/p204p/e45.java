package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.EventSenderStats2NonAuth;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e45 implements uq7, iuk, vd50, Function, vlr, iab, Init, u6m0, Predicate, fz61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55981a;

    public /* synthetic */ e45(int i) {
        this.f55981a = i;
    }

    /* JADX INFO: renamed from: e */
    public static final String m37736e(iva ivaVar, iva[] ivaVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        iva ivaVar2 = h6t0.f88248b;
        int iMo51747d = ivaVar.mo51747d();
        int i5 = 0;
        while (i5 < iMo51747d) {
            int i6 = (i5 + iMo51747d) / 2;
            while (i6 > -1 && ivaVar.mo51751i(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (ivaVar.mo51751i(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bMo51751i = ivaVarArr[i10].mo51751i(i11);
                    byte[] bArr = a0f1.f11072a;
                    int i13 = bMo51751i & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bMo51751i2 = ivaVar.mo51751i(i7 + i12);
                byte[] bArr2 = a0f1.f11072a;
                i4 = i3 - (bMo51751i2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (ivaVarArr[i10].mo51747d() != i11) {
                    z2 = z;
                } else {
                    if (i10 == ivaVarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iMo51747d2 = ivaVarArr[i10].mo51747d() - i11;
                    int length = ivaVarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iMo51747d2 += ivaVarArr[i15].mo51747d();
                    }
                    if (iMo51747d2 >= i14) {
                        if (iMo51747d2 <= i14) {
                            return ivaVar.mo51756n(i7, i9 + i7).mo51755m(vuc.f244913a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iMo51747d = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final u591 m37737h(u571 u571Var, u4g1 u4g1Var, foz0 foz0Var) {
        mir mirVar = new mir();
        t571 t571Var = new t571(u571Var, null, null, mirVar, 6);
        u4g1Var.getClass();
        int length = t571Var.f217234c.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            t571Var.m80101j(i, i2, "•");
            i = i2;
        }
        if (((qqi0) t571Var.m80094c().f35413b).f191610c == 0) {
            return null;
        }
        long jM37746x = m37746x(u571Var.f226936d, mirVar, foz0Var);
        ic71 ic71Var = u571Var.f226937e;
        return new u591(t571.m80091o(t571Var, jM37746x, ic71Var != null ? new ic71(m37746x(ic71Var.f100752a, mirVar, foz0Var)) : null, 4), mirVar);
    }

    /* JADX INFO: renamed from: l */
    public static final String m37738l(vre0 vre0Var) {
        if (vre0Var instanceof tre0) {
            return "appoperation";
        }
        if (vre0Var instanceof ure0) {
            return "none";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    public static final String m37739n(zre0 zre0Var) {
        if (zre0Var instanceof yre0) {
            return ((yre0) zre0Var).f275464a ? "userinteraction_immediate" : "userinteraction";
        }
        if (zre0Var instanceof wre0) {
            return ((wre0) zre0Var).f254346a ? "background_timesensitive" : "background";
        }
        if (zre0Var instanceof xre0) {
            return "unknown";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    public static final String m37740o(pte0 pte0Var) {
        if (pte0Var instanceof jte0) {
            return "banner";
        }
        if (pte0Var instanceof nte0) {
            return "snackbar";
        }
        if (pte0Var instanceof mte0) {
            return "promobar";
        }
        if (pte0Var instanceof kte0) {
            return "bottomsheet";
        }
        if (pte0Var instanceof lte0) {
            return "dialog";
        }
        if (pte0Var instanceof ote0) {
            return "tooltip";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    public static final whp m37741p(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            if (strOptString2.length() != 0 && !strOptString2.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -1309235419) {
                    if (iHashCode != 280295099) {
                        if (iHashCode == 568196142 && strOptString.equals("declined")) {
                            arrayList2.add(strOptString2);
                        }
                    } else if (strOptString.equals("granted")) {
                        arrayList.add(strOptString2);
                    }
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        whp whpVar = new whp();
        whpVar.f251419b = arrayList;
        whpVar.f251420c = arrayList2;
        whpVar.f251421d = arrayList3;
        return whpVar;
    }

    /* JADX INFO: renamed from: q */
    public static final long m37742q(long j, mir mirVar) {
        int i = ic71.f100751c;
        long jM61900c = mirVar.m61900c((int) (j >> 32), false);
        long jM61900c2 = ic71.m50236d(j) ? jM61900c : mirVar.m61900c((int) (4294967295L & j), false);
        int iMin = Math.min(ic71.m50239g(jM61900c), ic71.m50239g(jM61900c2));
        int iMax = Math.max(ic71.m50238f(jM61900c), ic71.m50238f(jM61900c2));
        return ic71.m50240h(j) ? dvg1.m37112n(iMax, iMin) : dvg1.m37112n(iMin, iMax);
    }

    /* JADX INFO: renamed from: r */
    public static x6j0 m37743r(am71 am71Var) {
        return new x6j0(am71Var, 0);
    }

    /* JADX INFO: renamed from: u */
    public static ApiException m37744u(Status status) {
        return uqe1.m83767f(status);
    }

    /* JADX INFO: renamed from: v */
    public static String m37745v(Map map) {
        String str = !map.containsKey("story_video_preview_video_url") ? null : (String) map.get("story_video_preview_video_url");
        if (str != null) {
            return str;
        }
        if (map.containsKey("story_video_preview_source_identifier")) {
            return (String) map.get("story_video_preview_source_identifier");
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static long m37746x(long j, mir mirVar, foz0 foz0Var) {
        long jM37112n;
        int i = ic71.f100751c;
        long jM61900c = mirVar.m61900c((int) (j >> 32), true);
        long jM61900c2 = ic71.m50236d(j) ? jM61900c : mirVar.m61900c((int) (j & 4294967295L), true);
        int i2 = 0;
        int i3 = foz0Var != null ? foz0Var.f71654a : 0;
        if (ic71.m50236d(j)) {
            i2 = i3;
        } else if (foz0Var != null) {
            i2 = foz0Var.f71655b;
        }
        if (i3 != 0 && !ic71.m50236d(jM61900c)) {
            int iM38547C = edb.m38547C(i3);
            if (iM38547C == 0) {
                int i4 = (int) (jM61900c >> 32);
                jM61900c = dvg1.m37112n(i4, i4);
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = (int) (jM61900c & 4294967295L);
                jM61900c = dvg1.m37112n(i5, i5);
            }
        }
        if (i2 != 0 && !ic71.m50236d(jM61900c2)) {
            int iM38547C2 = edb.m38547C(i2);
            if (iM38547C2 == 0) {
                int i6 = (int) (jM61900c2 >> 32);
                jM37112n = dvg1.m37112n(i6, i6);
            } else {
                if (iM38547C2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = (int) (jM61900c2 & 4294967295L);
                jM37112n = dvg1.m37112n(i7, i7);
            }
            jM61900c2 = jM37112n;
        }
        int iMin = Math.min(ic71.m50239g(jM61900c), ic71.m50239g(jM61900c2));
        int iMax = Math.max(ic71.m50238f(jM61900c), ic71.m50238f(jM61900c2));
        return ic71.m50240h(j) ? dvg1.m37112n(iMax, iMin) : dvg1.m37112n(iMin, iMax);
    }

    /* JADX WARN: Type inference failed for: r9v23, types: [p.eh00, p.ri00] */
    /* JADX INFO: renamed from: z */
    public static c8x m37747z(EventSenderStats2NonAuth eventSenderStats2NonAuth) {
        ArrayList arrayList = new ArrayList();
        if (eventSenderStats2NonAuth.m13887P() == eventSenderStats2NonAuth.m13879H()) {
            int i = 0;
            int i2 = 0;
            for (Object obj : eventSenderStats2NonAuth.m13888Q()) {
                int i3 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                gva gvaVar = (gva) obj;
                int iIntValue = ((Integer) ((n350) eventSenderStats2NonAuth.m13880I()).get(i)).intValue() + i2;
                while (i2 < iIntValue) {
                    String str = (String) eventSenderStats2NonAuth.m13877F().get(((Integer) ((n350) eventSenderStats2NonAuth.m13878G()).get(i2)).intValue());
                    Long l = (Long) ((y1b0) eventSenderStats2NonAuth.m13881J()).get(i2);
                    Long l2 = (Long) ((y1b0) eventSenderStats2NonAuth.m13882K()).get(i2);
                    Long l3 = (Long) ((y1b0) eventSenderStats2NonAuth.m13883L()).get(i2);
                    byte[] bArrM45891s = gvaVar.m45891s();
                    wj50.m88279p(bArrM45891s);
                    String strM94330k = yq20.m94330k(bArrM45891s, br20.f29945e);
                    wj50.m88279p(str);
                    arrayList.add(new v8x(str + "_" + strM94330k, str, bArrM45891s, strM94330k, l, l2.longValue(), l3.longValue()));
                    i2++;
                }
                i2 = iIntValue;
                i = i3;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 0;
        for (Object obj2 : eventSenderStats2NonAuth.m13886O()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                h6f.m46722S();
                throw null;
            }
            Integer num = (Integer) obj2;
            int size = eventSenderStats2NonAuth.m13877F().size();
            wj50.m88279p(num);
            int iIntValue2 = num.intValue();
            if (iIntValue2 >= 0 && iIntValue2 < size && eventSenderStats2NonAuth.m13884M() > i4) {
                linkedHashMap.put(eventSenderStats2NonAuth.m13877F().get(num.intValue()), Integer.valueOf((int) ((Number) ((y1b0) eventSenderStats2NonAuth.m13885N()).get(i4)).longValue()));
            }
            i4 = i5;
        }
        ArrayList arrayList2 = new ArrayList();
        if (eventSenderStats2NonAuth.m13893V() != 0) {
            arrayList2 = new ArrayList();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            Map mapM56695h0 = kkc0.m56695h0(new pqm0(q8x.ENTERED, new d8x(new hgl(0, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListEnteredCountsTotalList", "getStatesListEnteredCountsTotalList()Ljava/util/List;", 0, 0, 24))), new pqm0(q8x.REJECTED_CLIENT, new d8x(new hgl(i7, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListRejectedClientCountsTotalList", "getStatesListRejectedClientCountsTotalList()Ljava/util/List;", i8, i6, 25))), new pqm0(q8x.DROPPED, new d8x(new hgl(i7, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListDroppedCountsTotalList", "getStatesListDroppedCountsTotalList()Ljava/util/List;", i8, i6, 26))), new pqm0(q8x.PERSISTED, new d8x(new hgl(i7, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListPersistedCountsTotalList", "getStatesListPersistedCountsTotalList()Ljava/util/List;", i8, i6, 27))), new pqm0(q8x.REJECTED_BACKEND, new d8x(new hgl(i7, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListRejectedBackendCountsTotalList", "getStatesListRejectedBackendCountsTotalList()Ljava/util/List;", i8, i6, 28))), new pqm0(q8x.DELIVERED, new d8x(new hgl(i7, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListDeliveredCountsTotalList", "getStatesListDeliveredCountsTotalList()Ljava/util/List;", i8, i6, 29))), new pqm0(q8x.DELETED, new d8x(new e8x(i7, eventSenderStats2NonAuth, EventSenderStats2NonAuth.class, "getStatesListDeletedCountsTotalList", "getStatesListDeletedCountsTotalList()Ljava/util/List;", i8, i6, 0))));
            int i9 = 0;
            for (Object obj3 : eventSenderStats2NonAuth.m13894W()) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                Integer num2 = (Integer) obj3;
                ae50 ae50VarM13877F = eventSenderStats2NonAuth.m13877F();
                wj50.m88279p(num2);
                String str2 = (String) ae50VarM13877F.get(num2.intValue());
                for (Map.Entry entry : mapM56695h0.entrySet()) {
                    q8x q8xVar = (q8x) entry.getKey();
                    List list = (List) ((d8x) entry.getValue()).f46546a.invoke();
                    if (list.size() > i9 && ((Number) list.get(i9)).longValue() > 0) {
                        wj50.m88279p(str2);
                        arrayList2.add(new pis(str2, ((Number) list.get(i9)).longValue(), 0L, q8xVar));
                    }
                }
                i9 = i10;
            }
        }
        return new c8x(arrayList, linkedHashMap, arrayList2);
    }

    @Override // p204p.vlr
    /* JADX INFO: renamed from: a */
    public Object mo32439a(fbk fbkVar) {
        return w2a1.f247311a;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f55981a) {
            case 10:
                return f3v.f65598h.get(obj);
            default:
                return new ga80(dp50.f51184a, obj);
        }
    }

    @Override // p204p.vlr
    /* JADX INFO: renamed from: b */
    public fiz mo32440b() {
        return new ysk(Boolean.TRUE, 27);
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: c */
    public xul0 mo37748c(Uri uri, ar7 ar7Var) {
        return C2244p5.f174033a;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        switch (this.f55981a) {
            case 5:
                iey ieyVarM50403a = iey.m50403a(i);
                return ieyVarM50403a == null ? iey.UNRECOGNIZED : ieyVarM50403a;
            case 13:
                mnn0 mnn0VarM62359a = mnn0.m62359a(i);
                return mnn0VarM62359a == null ? mnn0.UNRECOGNIZED : mnn0VarM62359a;
            default:
                n70 n70VarM63788a = n70.m63788a(i);
                return n70VarM63788a == null ? n70.UNRECOGNIZED : n70VarM63788a;
        }
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: d */
    public Bundle mo37749d(String str, String str2, int i, String str3) {
        Bundle bundleM93449h = ydj.m93449h("ACCESS_TOKEN", str, "RESPONSE_TYPE", "token");
        bundleM93449h.putInt("EXPIRES_IN", i);
        bundleM93449h.putString("STATE", str2);
        bundleM93449h.putString("REDIRECT_URI", str3);
        return bundleM93449h;
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: f */
    public void mo31884f(y8b y8bVar, IOException iOException) {
        Logger.m3967c(iOException, edb.m38564m("Tracking request failed: ", iOException.getMessage()), new Object[0]);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15575c((w8o0) obj, Collections.singleton(i8o0.f99818a));
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: g */
    public Intent mo37750g(zew zewVar, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra(SearchEndpointResponseKt.RESULT_ERROR, zewVar.f282142a);
        intent.putExtra("STATE", str2);
        if (!kgg1.m56363z(str)) {
            intent.putExtra("ERROR_DESCRIPTION", str);
        }
        return intent;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: i */
    public Bundle mo37751i(String str, String str2, String str3) {
        Bundle bundleM93449h = ydj.m93449h("AUTHORIZATION_CODE", str, "RESPONSE_TYPE", "code");
        bundleM93449h.putString("STATE", str2);
        bundleM93449h.putString("REDIRECT_URI", str3);
        return bundleM93449h;
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: j */
    public Intent mo37752j(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("REPLY", bundle);
        return intent;
    }

    @Override // p204p.u6m0
    /* JADX INFO: renamed from: k */
    public t6m0 mo34969k(dcm0 dcm0Var, Bundle bundle) {
        return new ucj0(27);
    }

    @Override // p204p.uq7
    /* JADX INFO: renamed from: m */
    public xul0 mo37753m(Uri uri, zew zewVar, String str) {
        return C2244p5.f174033a;
    }

    /* JADX INFO: renamed from: s */
    public List mo37754s(Executor executor) {
        return Collections.singletonList(new k1p(executor));
    }

    /* JADX INFO: renamed from: t */
    public List mo37755t() {
        return Collections.EMPTY_LIST;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f55981a) {
            case 23:
                return ((dgv0) ((ty80) obj).f224877f.f271279x.mo30169a(dgv0.class)) != null;
            default:
                return ((List) obj) != lau.f131415a;
        }
    }

    @Override // p204p.fz61
    /* JADX INFO: renamed from: w */
    public Object mo24968w(bz61 bz61Var) {
        return (ice) bz61Var.mo26518k(this);
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: y */
    public void mo31897y(y8b y8bVar, n2x0 n2x0Var) {
        int i = n2x0Var.f149860d;
        if (200 > i || i >= 300) {
            Logger.m3966b("Tracking request failed: " + n2x0Var, new Object[0]);
        }
        try {
            n2x0Var.f149863g.close();
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ e45(son sonVar, otn otnVar, int i) {
        this.f55981a = i;
    }

    public e45(zrr0 zrr0Var) {
        this.f55981a = 23;
    }

    public e45() {
        this.f55981a = 24;
        String str = bna0.f28742d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }
}
