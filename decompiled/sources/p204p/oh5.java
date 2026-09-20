package p204p;

import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Method;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class oh5 implements vd50, ae10, e5y, Function, u9d0, InterfaceC2207oa, dly0, w111 {
    public /* synthetic */ oh5() {
    }

    /* JADX INFO: renamed from: a */
    public static final m47 m66926a(xq00 xq00Var) {
        int i = qu8.f192588h;
        int iM33187f = (int) cks.m33187f(qu8.f192587g);
        yzl yzlVar = ((pku) leu.m58817c(xq00Var).f235362a.f197471b).f178550a;
        sxj sxjVarM30755d = bx4.m30755d(kbv.m55958d(jg31.m53259E(iM33187f, 0, yzlVar, 2), 2), kbv.m55959e(jg31.m53259E(iM33187f, 0, yzlVar, 2), 2));
        boolean zM91762e = xq00Var.m91762e(iM33187f) | xq00Var.m91770i(yzlVar);
        Object objM91750T = xq00Var.m91750T();
        if (zM91762e || objM91750T == t6x0.f217647t) {
            objM91750T = new ku8(iM33187f, yzlVar);
            xq00Var.m91793t0(objM91750T);
        }
        return new m47(7, sxjVarM30755d, bx4.m30754c(1, (th00) objM91750T));
    }

    /* JADX INFO: renamed from: f */
    public static final im91 m66927f(int i, yzl yzlVar) {
        return jg31.m53259E(i, 0, yzlVar, 2);
    }

    /* JADX INFO: renamed from: g */
    public static final String m66928g(InterfaceC2415th interfaceC2415th) {
        ArrayList arrayList = bq31.f29654i;
        String str = ((C1742ci) interfaceC2415th).f38159b;
        if (g6f.m43725i0(bq31.f29655j, str)) {
            return "https://spotify-tap.spotifycdn.com/onboarding/generic/Headphones_Spotify_Tap.json";
        }
        return g6f.m43725i0(bq31.f29656k, str) ? "https://spotify-tap.spotifycdn.com/onboarding/generic/Speaker_Spotify_Tap.json" : "https://spotify-tap.spotifycdn.com/onboarding/generic/Earbuds_Spotify_Tap.json";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: h */
    public static final Method m66929h() {
        String[] strArr = z900.f280631b;
        return (Method) z900.f280634e.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static final int m66930i(InterfaceC2415th interfaceC2415th) {
        ArrayList arrayList = bq31.f29654i;
        return g6f.m43725i0(bq31.f29656k, ((C1742ci) interfaceC2415th).f38159b) ? R.string.tap_onboarding_dialog_description_sony_speaker : R.string.tap_onboarding_dialog_description_sony;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p.fr70] */
    /* JADX INFO: renamed from: j */
    public static final Method m66931j() {
        String[] strArr = z900.f280631b;
        return (Method) z900.f280633d.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static String m66932k(cw8 cw8Var) {
        return s571.m77246e(cw8Var.hashCode(), "BannerTicket-");
    }

    /* JADX INFO: renamed from: o */
    public static String m66933o(String str, LinkedHashMap linkedHashMap) {
        fk30 fk30Var = (fk30) linkedHashMap.get(str);
        if (fk30Var == null) {
            return null;
        }
        return fk30Var.text().title();
    }

    /* JADX INFO: renamed from: r */
    public static String m66934r(String str) {
        if (Pattern.compile("((https?|ftp|smtp|sftp|ftps|mailto)[\\w.-]+(?:\\.[\\w.-]+)+[/\\w\\-.~%?=&]*)|(https?://)", si5.m78171l(o7t0.m66392f(1))).matcher(str).find()) {
            return "";
        }
        return wl51.m88491o1(Pattern.compile("\\s+").matcher(vb71.f239433c.m83875g(vb71.f239434d.m83875g(vb71.f239432b.m83875g(Normalizer.normalize(str, Normalizer.Form.NFKD), ""), ""), "").toLowerCase(vb71.f239431a)).replaceAll(" ")).toString();
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ihi) obj).f102296c == u300.P2S;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return cr80.f41204h.get(obj);
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        m7u0 m7u0Var;
        if (i == 0) {
            m7u0Var = m7u0.CONTENT_RATING_TAG_UNSPECIFIED;
        } else if (i == 1) {
            m7u0Var = m7u0.CONTENT_RATING_TAG_EXPLICIT;
        } else if (i == 2) {
            m7u0Var = m7u0.CONTENT_RATING_TAG_MOGEF_19;
        } else if (i != 3) {
            m7u0Var = i != 4 ? null : m7u0.CONTENT_RATING_TAG_EROTIC;
        } else {
            m7u0Var = m7u0.CONTENT_RATING_TAG_SPOTIFY_18_PLUS;
        }
        return m7u0Var == null ? m7u0.UNRECOGNIZED : m7u0Var;
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: d */
    public void mo37835d(ddz0 ddz0Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) {
        to01 to01Var;
        eo01 eo01Var2 = eo01Var;
        if (fbkVar instanceof to01) {
            to01Var = (to01) fbkVar;
            int i = to01Var.f222127d;
            if ((i & Integer.MIN_VALUE) != 0) {
                to01Var.f222127d = i - Integer.MIN_VALUE;
            } else {
                to01Var = new to01(this, (ibk) fbkVar);
            }
        } else {
            to01Var = new to01(this, (ibk) fbkVar);
        }
        Object obj = to01Var.f222125b;
        int i2 = to01Var.f222127d;
        if (i2 == 0) {
            bga.m29073P(obj);
            lu01 lu01Var = eo01Var2.f61264a;
            if (lu01Var == null) {
                return null;
            }
            to01Var.f222124a = eo01Var2;
            to01Var.f222127d = 1;
            zz71 zz71Var = new zz71(true);
            zr01 zr01Var = new zr01(0, usg1.m83901t(lu01Var.f136946a, g6f.m43711Y0(Collections.singletonList(new sr01(new rr01(lu01Var, vsg1.m86352l(gn80.SHARE_FORMAT_ENTITY, new String[0])), new nk01(new um01(qpv0.f191387a.mo54112b(ewv.class)), new hwv(null, zz71Var, 0, false, new shv(onv.f167364a, 62), null, null), bk01.f27801a, true), new q111(z300.f278736b, gbu.f78413a, true, null))), new btm0(28))));
            yuk yukVar = yuk.f276404a;
            if (zr01Var == yukVar) {
                return yukVar;
            }
            obj = zr01Var;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eo01Var2 = to01Var.f222124a;
            bga.m29073P(obj);
        }
        zr01 zr01Var2 = (zr01) obj;
        return new e211(zr01Var2.f285503a, zr01Var2.f285504b, fji.f70297b, eo01Var2.f61266c.f129799a);
    }

    /* JADX INFO: renamed from: m */
    public String m66936m() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: n */
    public List m66937n(String str, String str2) {
        boolean z;
        String strM66934r = m66934r(str);
        String strM66934r2 = m66934r(str2);
        if (strM66934r2.length() <= 0) {
            return Collections.singletonList(new efz0(str, false));
        }
        if (strM66934r.length() <= 0) {
            return Collections.singletonList(new efz0(str, false));
        }
        if (str2.length() == 1) {
            return wl51.m88452B0(strM66934r) == wl51.m88452B0(strM66934r2) ? h6f.m46715L(new efz0(wl51.m88489m1(1, str), true), new efz0(wl51.m88500x0(1, str), false)) : Collections.singletonList(new efz0(str, false));
        }
        int iM88458H0 = wl51.m88458H0(strM66934r, strM66934r2, 0, false, 6);
        if (iM88458H0 == -1) {
            return Collections.singletonList(new efz0(str, false));
        }
        int length = strM66934r2.length();
        int length2 = str.length();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (iM88458H0 >= length2) {
                iM88458H0 = -1;
                break;
            }
            char cCharAt = str.charAt(iM88458H0);
            Iterator it = h6f.m46715L(vb71.f239433c, vb71.f239434d).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((urv0) it.next()).m83873e(String.valueOf(cCharAt))) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                i2++;
            }
            if (!z && i == -1) {
                i = iM88458H0;
            }
            if (i2 >= length) {
                break;
            }
            iM88458H0++;
        }
        b450 b450Var = new b450(i, iM88458H0, 1);
        ArrayList arrayList = new ArrayList();
        int i3 = b450Var.f278779b;
        if (i3 == -1 || i == -1) {
            arrayList.add(new efz0(str, false));
            return arrayList;
        }
        if (i > 0) {
            arrayList.add(new efz0(str.substring(0, i), false));
        }
        int i4 = i3 + 1;
        arrayList.add(new efz0(str.substring(i, i4), true));
        if (i4 < str.length()) {
            arrayList.add(new efz0(str.substring(i4, str.length()), false));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public smq0 m66938p(fk30 fk30Var) {
        wq30 wq30VarMain;
        List list;
        String str;
        int i;
        int i2 = wj50.m88271j(fk30Var.componentId().mo29575id(), "premiumPage:wtsOfferCardV2") ? 2 : 3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (fk30 fk30Var2 : fk30Var.children()) {
            linkedHashMap.put(fk30Var2.componentId().mo29575id(), fk30Var2);
        }
        String strM66933o = m66933o("premiumPage:wtsOfferHighlight", linkedHashMap);
        String strM66933o2 = m66933o("premiumPage:wtsOfferTitlePricePeriod", linkedHashMap);
        fk30 fk30Var3 = (fk30) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String strSubtitle = fk30Var3 == null ? null : fk30Var3.text().subtitle();
        fk30 fk30Var4 = (fk30) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String strAccessory = fk30Var4 == null ? null : fk30Var4.text().accessory();
        fk30 fk30Var5 = (fk30) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String strDescription = fk30Var5 == null ? null : fk30Var5.text().description();
        fk30 fk30Var6 = (fk30) linkedHashMap.get("premiumPage:wtsOfferTitlePricePeriod");
        String strUri = (fk30Var6 == null || (wq30VarMain = fk30Var6.images().main()) == null) ? null : wq30VarMain.uri();
        String strM66933o3 = m66933o("premiumPage:wtsOfferAdditionalPricePeriod", linkedHashMap);
        fk30 fk30Var7 = (fk30) linkedHashMap.get("premiumPage:wtsOfferDescription");
        List<wj30> list2 = lau.f131415a;
        if (fk30Var7 == null) {
            list = list2;
        } else {
            wj30[] wj30VarArrBundleArray = fk30Var7.custom().bundleArray("items");
            List listM29620k1 = wj30VarArrBundleArray != null ? bk5.m29620k1(wj30VarArrBundleArray) : null;
            if (listM29620k1 != null) {
                list2 = listM29620k1;
            }
            ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
            for (wj30 wj30Var : list2) {
                String strString = wj30Var.string("text");
                String strString2 = wj30Var.string("icon");
                String str2 = strM66933o3;
                String strString3 = wj30Var.string("color");
                int i3 = i2;
                String strString4 = wj30Var.string("state");
                if (strString4 != null) {
                    int iHashCode = strString4.hashCode();
                    str = strM66933o;
                    if (iHashCode != -1808450477) {
                        if (iHashCode == 0) {
                            strString4.equals("");
                        } else if (iHashCode == 104264043 && strString4.equals("muted")) {
                            i = 2;
                        }
                    } else if (strString4.equals("highlighted")) {
                        i = 1;
                    }
                    arrayList.add(new etk0(strString, strString2, i, strString3));
                    strM66933o3 = str2;
                    i2 = i3;
                    strM66933o = str;
                } else {
                    str = strM66933o;
                }
                i = 0;
                arrayList.add(new etk0(strString, strString2, i, strString3));
                strM66933o3 = str2;
                i2 = i3;
                strM66933o = str;
            }
            list = arrayList;
        }
        return new smq0(i2, strM66933o, strM66933o2, strSubtitle, strAccessory, strM66933o3, strDescription, strUri, list, m66933o("premiumPage:wtsOfferFootnote", linkedHashMap), fk30Var.custom().string("colorset"), fk30Var.custom().string("backgroundColorSet"), m66939q("premiumPage:wtsOfferCta", linkedHashMap), m66939q("premiumPage:wtsOfferSecondaryCta", linkedHashMap), gg5.m44655s(fk30Var));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX INFO: renamed from: q */
    public omq0 m66939q(String str, LinkedHashMap linkedHashMap) {
        String strString;
        String strString2;
        String strString3;
        String strM56834f;
        fk30 fk30Var;
        String str2;
        ogz ogzVar;
        wj30 wj30VarData;
        wj30 wj30VarData2;
        fk30 fk30Var2 = (fk30) linkedHashMap.get(str);
        if (fk30Var2 == null) {
            return null;
        }
        String strTitle = fk30Var2.text().title();
        m1b m1bVarM61181p = m95.m61181p(fk30Var2);
        mj30 mj30Var = (mj30) fk30Var2.events().get("click");
        int i = 0;
        boolean zBoolValue = (mj30Var == null || (wj30VarData2 = mj30Var.data()) == null) ? false : wj30VarData2.boolValue("renderAsPrimaryCTA", false);
        wj30 wj30VarBundle = (mj30Var == null || (wj30VarData = mj30Var.data()) == null) ? null : wj30VarData.bundle("flavorPageViewModel");
        if (wj30VarBundle == null || (strString = wj30VarBundle.string("planName")) == null || (strString2 = wj30VarBundle.string("benefit")) == null || (strString3 = wj30VarBundle.string("tagLine")) == null) {
            fk30Var = fk30Var2;
            ogzVar = null;
            str2 = strTitle;
        } else {
            String strString4 = wj30VarBundle.string("inviteExplanation");
            String strString5 = wj30VarBundle.string("legalText");
            String strString6 = wj30VarBundle.string("ctaText");
            wj30[] wj30VarArrBundleArray = wj30VarBundle.bundleArray("planDetailViewModels");
            if (wj30VarArrBundleArray == null) {
                fk30Var = fk30Var2;
                ogzVar = null;
                str2 = strTitle;
            } else {
                ArrayList arrayList = new ArrayList();
                if (wj30VarArrBundleArray.length != 0) {
                    ArrayList arrayList2 = new ArrayList(wj30VarArrBundleArray.length);
                    int length = wj30VarArrBundleArray.length;
                    int i2 = 0;
                    while (i < length) {
                        wj30 wj30Var = wj30VarArrBundleArray[i];
                        int i3 = i2 + 1;
                        fk30 fk30Var3 = fk30Var2;
                        wj30[] wj30VarArr = wj30VarArrBundleArray;
                        String strString7 = wj30Var.string("offerDuration", "");
                        int i4 = i;
                        String strString8 = wj30Var.string("offerPrice", "");
                        String str3 = strTitle;
                        String strString9 = wj30Var.string("paymentMethodText");
                        String strString10 = wj30Var.string("fullPriceComparison");
                        String strString11 = wj30Var.string("offerDescriptionText");
                        String strString12 = wj30Var.string("offerSavingsBadge");
                        String strString13 = wj30Var.string("checkoutUrl", "");
                        if (strString9 == null) {
                            strM56834f = klh.m56834f(strString7, " • ", strString8);
                        }
                        if (strString10 == null) {
                            strM56834f = strString9;
                            strString10 = strString11;
                        } else {
                            strM56834f = strString9;
                        }
                        arrayList2.add(Boolean.valueOf(arrayList.add(new e8o0(i2, strString12, strString13, strM56834f, strString10, wj30Var.string("discountBadgeText")))));
                        i = i4 + 1;
                        fk30Var2 = fk30Var3;
                        wj30VarArrBundleArray = wj30VarArr;
                        i2 = i3;
                        strTitle = str3;
                    }
                }
                fk30Var = fk30Var2;
                str2 = strTitle;
                ogzVar = new ogz(strString, strString2, strString3, strString4, strString5, arrayList, strString6);
            }
        }
        return new omq0(str2, m1bVarM61181p, zBoolValue, ogzVar, gg5.m44655s(fk30Var));
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: t */
    public void mo37836t() {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.e5y
    /* JADX INFO: renamed from: x */
    public ck81 mo37837x(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ oh5(son sonVar, otn otnVar) {
    }

    public oh5(m95 m95Var, tm4 tm4Var, gg5 gg5Var) {
    }

    @Override // p204p.u9d0
    /* JADX INFO: renamed from: b */
    public void mo66935b() {
    }

    @Override // p204p.dly0
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // p204p.dly0
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
