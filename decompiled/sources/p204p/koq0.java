package p204p;

import com.google.protobuf.Empty;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p196j$.util.Base64;
import spotify.your_library.esperanto.proto.PinResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class koq0 implements Function, yh00, Predicate, ega, vg31, BiFunction, wn71, mvt0, tn61, vja1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f124900a;

    /* JADX INFO: renamed from: b */
    public static final koq0 f124890b = new koq0(0);

    /* JADX INFO: renamed from: c */
    public static final koq0 f124892c = new koq0(1);

    /* JADX INFO: renamed from: d */
    public static final koq0 f124893d = new koq0(2);

    /* JADX INFO: renamed from: e */
    public static final koq0 f124894e = new koq0(3);

    /* JADX INFO: renamed from: f */
    public static final koq0 f124895f = new koq0(4);

    /* JADX INFO: renamed from: g */
    public static final koq0 f124896g = new koq0(5);

    /* JADX INFO: renamed from: h */
    public static final koq0 f124897h = new koq0(6);

    /* JADX INFO: renamed from: i */
    public static final koq0 f124898i = new koq0(7);

    /* JADX INFO: renamed from: t */
    public static final koq0 f124899t = new koq0(8);

    /* JADX INFO: renamed from: X */
    public static final koq0 f124883X = new koq0(9);

    /* JADX INFO: renamed from: Y */
    public static final koq0 f124885Y = new koq0(10);

    /* JADX INFO: renamed from: Z */
    public static final koq0 f124887Z = new koq0(11);

    /* JADX INFO: renamed from: L0 */
    public static final koq0 f124871L0 = new koq0(12);

    /* JADX INFO: renamed from: M0 */
    public static final koq0 f124872M0 = new koq0(13);

    /* JADX INFO: renamed from: N0 */
    public static final koq0 f124873N0 = new koq0(14);

    /* JADX INFO: renamed from: O0 */
    public static final koq0 f124874O0 = new koq0(15);

    /* JADX INFO: renamed from: P0 */
    public static final koq0 f124875P0 = new koq0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final koq0 f124876Q0 = new koq0(17);

    /* JADX INFO: renamed from: R0 */
    public static final koq0 f124877R0 = new koq0(18);

    /* JADX INFO: renamed from: S0 */
    public static final koq0 f124878S0 = new koq0(19);

    /* JADX INFO: renamed from: T0 */
    public static final koq0 f124879T0 = new koq0(20);

    /* JADX INFO: renamed from: U0 */
    public static final koq0 f124880U0 = new koq0(21);

    /* JADX INFO: renamed from: V0 */
    public static final koq0 f124881V0 = new koq0(22);

    /* JADX INFO: renamed from: W0 */
    public static final koq0 f124882W0 = new koq0(23);

    /* JADX INFO: renamed from: X0 */
    public static final koq0 f124884X0 = new koq0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final koq0 f124886Y0 = new koq0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final koq0 f124888Z0 = new koq0(26);

    /* JADX INFO: renamed from: a1 */
    public static final koq0 f124889a1 = new koq0(27);

    /* JADX INFO: renamed from: b1 */
    public static final koq0 f124891b1 = new koq0(28);

    public /* synthetic */ koq0(int i) {
        this.f124900a = i;
    }

    /* JADX INFO: renamed from: c */
    public static fh0 m57005c(koq0 koq0Var, String str, String str2, Map map, b7d0 b7d0Var, String str3, String str4, String str5, Format format, String str6, Map map2, int i) {
        b7d0 b7d0Var2;
        String str7 = (i & 1) != 0 ? "adId" : str;
        String str8 = (i & 4) != 0 ? "" : str2;
        String str9 = (i & 16) != 0 ? "" : "https://spotify.com";
        int i2 = i & 64;
        nau nauVar = nau.f152117a;
        Map map3 = i2 != 0 ? nauVar : map;
        if ((i & 128) != 0) {
            b7d0Var2 = new b7d0(6, Collections.singletonList(new h340(0, 0, new pa6("image_url"))), (List) null);
        } else {
            b7d0Var2 = b7d0Var;
        }
        return new fh0(str7, "", str8, "", str9, 1, map3, b7d0Var2, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, false, false, (i & 8192) != 0 ? Format.DUMMY : format, false, (List) lau.f131415a, (65536 & i) != 0 ? "" : str6, (i & 131072) != 0 ? nauVar : map2, 2);
    }

    @Override // p204p.ega
    /* JADX INFO: renamed from: a */
    public long mo38839a(int i, gx8 gx8Var) {
        return ((db71) gx8Var.f85221e).m35541l(i);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f124900a) {
            case 18:
                return (ec51) obj2;
            default:
                return new pqm0((PlayerState) obj, (Boolean) obj2);
        }
    }

    @Override // p204p.wn71
    /* JADX INFO: renamed from: b */
    public un71 mo57006b() {
        return new un71(dyh0.m37342a());
    }

    @Override // p204p.mvt0
    /* JADX INFO: renamed from: d */
    public boolean mo57007d(int i) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public long m57008e() {
        return dyh0.m37342a();
    }

    @Override // p204p.vja1
    /* JADX INFO: renamed from: j */
    public he41 mo24405j(String str, LinkedHashMap linkedHashMap, mec0 mec0Var, String str2) {
        String str3 = (String) linkedHashMap.get("slug");
        if (str3 == null) {
            return null;
        }
        return new hpd1(str3, mec0Var, str2, str);
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        gqx gqxVar = (gqx) obj;
        return gqxVar.mo45451c() || !((iqx) gqxVar).f104863f;
    }

    public String toString() {
        switch (this.f124900a) {
            case 19:
                int i = dyh0.f54354b;
                return "TimeSource(System.nanoTime())";
            default:
                return super.toString();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f124900a) {
            case 0:
                return new boq0(((Boolean) obj).booleanValue());
            case 1:
                return isr0.f105300a;
            case 2:
                mks0 mks0Var = (mks0) obj;
                return new pqm0(mks0Var.f144668a, Boolean.valueOf(mks0Var.f144674g));
            case 3:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new sot0(message);
            case 4:
                e291 e291Var = (e291) obj;
                return new pqm0(Boolean.valueOf(e291Var.f55408m), Integer.valueOf(e291Var.f55403h));
            case 5:
                List<fqx> listMo45450b = ((gqx) obj).mo45450b(ks81.class);
                int iM31820L = c95.m31820L(i6f.m49804T(listMo45450b, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (fqx fqxVar : listMo45450b) {
                    String str = fqxVar.f72300a;
                    ks81 ks81Var = (ks81) fqxVar.f72301b;
                    String str2 = ks81Var != null ? ks81Var.f125873e : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put(str, str2);
                }
                return linkedHashMap;
            case 6:
                return ((PlayerState) obj).restrictions().disallowSkippingNextReasons();
            case 7:
                xul0 xul0Var = (xul0) obj;
                if (xul0Var.mo49279c()) {
                    if (((ov0) xul0Var.mo49278b()).f170382c.f69506a.length() > 0 && ((ov0) xul0Var.mo49278b()).f170380a == 1) {
                        return new zqc0((ov0) xul0Var.mo49278b());
                    }
                    if (((ov0) xul0Var.mo49278b()).f170380a == 2) {
                        return xqc0.f264958a;
                    }
                    return new yqc0();
                }
                return new yqc0();
            case 8:
                Map map = ((w3y) obj).f247661a;
                if (map == null) {
                    return Single.error(new IOException("Wrong response"));
                }
                return Single.just(Boolean.valueOf(map.containsKey(d6n0.f45731d)));
            case 9:
            case 10:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            default:
                byte[] bArr = (byte[]) obj;
                try {
                    return PinResponse.m98133q(bArr);
                } catch (Exception e) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as spotify.your_library.esperanto.proto.PinResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                }
            case 11:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Empty.m1936q(bArr2);
                } catch (Exception e2) {
                    throw new RuntimeException(s571.m77251j("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                }
            case 12:
                if (wj50.m88271j(((tl11) obj).f221296a.f261992B.get(Context.Metadata.KEY_AUTOPLAY_CANDIDATE), "false")) {
                    return Collections.singletonMap(Context.Metadata.KEY_AUTOPLAY_CANDIDATE, "false");
                }
                return nau.f152117a;
            case 13:
                return ((n421) obj).f150177c;
            case 14:
                long j = ((cks) obj).f39083a;
                long jM33199r = cks.m33199r(j, ils.HOURS);
                int iM33189h = cks.m33189h(j);
                int iM33191j = cks.m33191j(j);
                cks.m33190i(j);
                return new uvk(jM33199r, iM33189h, iM33191j);
            case 15:
                return ((e301) obj).f55571a;
            case 17:
                ArrayList<pqm0> arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof pqm0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (pqm0 pqm0Var : arrayList) {
                    String str3 = (String) pqm0Var.f180350a;
                    bz31 bz31Var = (bz31) pqm0Var.f180351b;
                    az31 az31Var = bz31Var instanceof az31 ? (az31) bz31Var : null;
                    pqm0 pqm0Var2 = az31Var != null ? new pqm0(str3, az31Var) : null;
                    if (pqm0Var2 != null) {
                        arrayList2.add(pqm0Var2);
                    }
                }
                return kkc0.m56705r0(arrayList2);
            case 22:
                return kuf1.m57401k((Throwable) obj);
            case 24:
                api apiVar = (api) ((xul0) obj).mo49283h();
                return new rxc1(apiVar != null ? bvg1.m30623k(apiVar) : 0);
        }
    }
}
