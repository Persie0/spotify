package p204p;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.tabs.TabLayout;
import com.spotify.concertview.concertfeedview.p050v1.GetFeedNextPageResponse;
import com.spotify.concertview.concertfeedview.p050v1.Section;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.premiummarketing.premiumdestinationpage.p130v1.LoggingInfo;
import com.spotify.thestage.vtec.datasource.GetSiteResponse;
import com.spotify.thestage.vtec.datasource.Site;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public class iw3 implements InterfaceC2207oa, BiFunction, p1y0, vd50, Init, io.reactivex.rxjava3.functions.BiFunction, Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106333a;

    public /* synthetic */ iw3(int i) {
        this.f106333a = i;
    }

    /* JADX INFO: renamed from: b */
    public static final gag0 m51780b(String str, xul0 xul0Var) {
        xul0 hzq0Var;
        List list = jw3.f116563b;
        if (xul0Var.mo49279c()) {
            String str2 = (String) xul0Var.mo49278b();
            st91 st91Var = st91.f213865b;
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-android-auto-content-list";
            yt91VarM50626j.f276052f = "3.0.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276050d = str2;
            zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(lau.f131415a);
            arrayList.add(zt91VarM94607a);
            hzq0Var = new hzq0(new st91(arrayList));
        } else {
            hzq0Var = C2244p5.f174033a;
        }
        return new gag0(1, str, (st91) hzq0Var.mo49280e(st91.f213865b));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m51781c(String str) {
        List list = jw3.f116563b;
        return "com.spotify.expanded-search-result".equals(str);
    }

    /* JADX INFO: renamed from: e */
    public static RectF m51782e(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f2184b1 || !(view instanceof yk61)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        yk61 yk61Var = (yk61) view;
        int contentWidth = yk61Var.getContentWidth();
        int contentHeight = yk61Var.getContentHeight();
        int iM29100v = (int) bga.m29100v(yk61Var.getContext(), 24);
        if (contentWidth < iM29100v) {
            contentWidth = iM29100v;
        }
        int right = (yk61Var.getRight() + yk61Var.getLeft()) / 2;
        int bottom = (yk61Var.getBottom() + yk61Var.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    /* JADX INFO: renamed from: g */
    public static ik40 m51783g() {
        Class clsM56640B = kk40.m56640B("com.android.billingclient.api.SkuDetailsParams");
        Class clsM56640B2 = kk40.m56640B("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (clsM56640B == null || clsM56640B2 == null) {
            return null;
        }
        Method methodM56644F = kk40.m56644F(clsM56640B, "newBuilder", new Class[0]);
        Method methodM56644F2 = kk40.m56644F(clsM56640B2, "setType", String.class);
        Method methodM56644F3 = kk40.m56644F(clsM56640B2, "setSkusList", List.class);
        Method methodM56644F4 = kk40.m56644F(clsM56640B2, "build", new Class[0]);
        if (methodM56644F == null || methodM56644F2 == null || methodM56644F3 == null || methodM56644F4 == null) {
            return null;
        }
        ik40 ik40Var = new ik40(clsM56640B, clsM56640B2, methodM56644F, methodM56644F2, methodM56644F3, methodM56644F4, 0);
        if (!p2l.f173365a.contains(ik40.class)) {
            try {
                ik40.f103003i = ik40Var;
            } catch (Throwable th) {
                p2l.m68953a(ik40.class, th);
            }
        }
        if (p2l.f173365a.contains(ik40.class)) {
            return null;
        }
        try {
            return ik40.f103003i;
        } catch (Throwable th2) {
            p2l.m68953a(ik40.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static jsa0 m51784j(String str, int i, LoggingInfo loggingInfo) {
        return new jsa0(str, "", i, rbz.m75190h(loggingInfo.getName(), ":", loggingInfo.m19580q(), ":", loggingInfo.m19581s()));
    }

    /* JADX INFO: renamed from: k */
    public static List m51785k(int i, List list) {
        Integer num;
        ArrayList<n0m> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            num = null;
            n0m n0mVar = null;
            if (!it.hasNext()) {
                break;
            }
            c3e1 c3e1Var = (c3e1) it.next();
            Integer num2 = c3e1Var.f33665b;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                n0mVar = new n0m(c3e1Var, iIntValue, iIntValue >= 0 ? iIntValue : Math.max(0, i + iIntValue));
            }
            if (n0mVar != null) {
                arrayList.add(n0mVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((n0m) obj).f149112b >= 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Integer numValueOf = Integer.valueOf(((n0m) it2.next()).f149113c);
            loop2: while (true) {
                num = numValueOf;
                do {
                    if (!it2.hasNext()) {
                        break loop2;
                    }
                    numValueOf = Integer.valueOf(((n0m) it2.next()).f149113c);
                } while (num.compareTo(numValueOf) >= 0);
            }
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (n0m n0mVar2 : arrayList) {
            int i2 = n0mVar2.f149112b;
            if (i2 < 0 && n0mVar2.f149113c <= iIntValue2) {
                n0mVar2 = new n0m(n0mVar2.f149111a, i2, iIntValue2 + 1);
            }
            arrayList3.add(n0mVar2);
        }
        return g6f.m43711Y0(arrayList3, new hwd(12));
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m51786l(ArrayList arrayList) {
        List listM43748t1 = g6f.m43748t1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM43748t1) {
            pqm0 pqm0Var = (pqm0) obj;
            if (!((ifz0) pqm0Var.f180350a).f101845b.equals(((ifz0) pqm0Var.f180351b).f101845b)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((ifz0) ((pqm0) it.next()).f180351b);
        }
        return arrayList3;
    }

    @Override // p204p.p1y0
    /* JADX INFO: renamed from: a */
    public int mo41643a(xyx xyxVar, iro iroVar, int i) {
        iroVar.f167824a = 4;
        return -4;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f106333a) {
            case 3:
                return ((ihi) obj).f102296c == u300.CHART;
            default:
                he41 he41VarM30579c = bup0.f31192a.m30579c(((ihi) obj).f102294a);
                xtp0 xtp0Var = he41VarM30579c instanceof xtp0 ? (xtp0) he41VarM30579c : null;
                return wj50.m88271j(xtp0Var != null ? xtp0Var.f265907a : null, "offline-playable-artist");
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Site site = ((GetSiteResponse) obj).site;
        site.getClass();
        return site;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        slw slwVarM78506a = slw.m78506a(i);
        return slwVarM78506a == null ? slw.UNRECOGNIZED : slwVarM78506a;
    }

    /* JADX INFO: renamed from: f */
    public StaticLayout m51787f(sy41 sy41Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(sy41Var.f215133a, 0, sy41Var.f215134b, sy41Var.f215135c, sy41Var.f215136d);
        builderObtain.setTextDirection(sy41Var.f215137e);
        builderObtain.setAlignment(sy41Var.f215138f);
        builderObtain.setMaxLines(sy41Var.f215139g);
        builderObtain.setEllipsize(sy41Var.f215140h);
        builderObtain.setEllipsizedWidth(sy41Var.f215141i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(sy41Var.f215143k);
        builderObtain.setBreakStrategy(sy41Var.f215144l);
        builderObtain.setHyphenationFrequency(sy41Var.f215147o);
        builderObtain.setIndents(null, null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            c150.m31215I(builderObtain, sy41Var.f215142j);
        }
        if (i >= 28) {
            r35.m74591U(builderObtain);
        }
        if (i >= 33) {
            AbstractC2254pf.m69754K(builderObtain, sy41Var.f215145m, sy41Var.f215146n);
        }
        if (i >= 35) {
            nat.m64039a(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        switch (this.f106333a) {
            case 13:
                nl10 nl10Var = (nl10) obj;
                ok10 ok10Var = nl10Var.f154987a;
                ml10 ml10Var = nl10Var.f154989c;
                if ((ml10Var instanceof jl10) || (ml10Var instanceof kl10)) {
                    return First.m15575c(nl10.m64712c(nl10Var, false, kl10.f123774a, gm10.f81252a, 3), Collections.singleton(new qk10(ok10Var)));
                }
                if (ml10Var instanceof ll10) {
                    return First.m15575c(nl10Var, Collections.singleton(new rk10(ok10Var)));
                }
                if (ml10Var instanceof il10) {
                    return First.m15574b(nl10Var);
                }
                throw new NoWhenBranchMatchedException();
            default:
                return First.m15574b((fl70) obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public ood0 m51788h() {
        ood0 ood0Var;
        ood0 ood0Var2 = ood0.f167561g;
        if (ood0Var2 != null) {
            return ood0Var2;
        }
        synchronized (this) {
            ood0Var = ood0.f167561g;
            if (ood0Var == null) {
                ood0 ood0Var3 = new ood0(aba0.m25342a(p8y.m69343a()), new ihj0(26));
                ood0.f167561g = ood0Var3;
                ood0Var = ood0Var3;
            }
        }
        return ood0Var;
    }

    /* JADX INFO: renamed from: i */
    public boolean m51789i(StaticLayout staticLayout) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return AbstractC2254pf.m69783z(staticLayout);
        }
        return i >= 28;
    }

    @Override // p204p.p1y0
    public boolean isReady() {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void mo27217m(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFM51782e = m51782e(tabLayout, view);
        RectF rectFM51782e2 = m51782e(tabLayout, view2);
        int i = (int) rectFM51782e.left;
        int i2 = (int) rectFM51782e2.left;
        LinearInterpolator linearInterpolator = r05.f194383a;
        int iRound = Math.round((i2 - i) * f) + i;
        int i3 = drawable.getBounds().top;
        int i4 = (int) rectFM51782e.right;
        drawable.setBounds(iRound, i3, Math.round(f * (((int) rectFM51782e2.right) - i4)) + i4, drawable.getBounds().bottom);
    }

    /* JADX INFO: renamed from: n */
    public ArrayList m51790n(List list) {
        nw80 nw80Var;
        Map map;
        String str;
        co40 co40VarM43744r1 = g6f.m43744r1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = co40VarM43744r1.iterator();
        while (true) {
            do40 do40Var = (do40) it;
            if (!((Iterator) do40Var.f50936c).hasNext()) {
                return arrayList;
            }
            bo40 bo40Var = (bo40) do40Var.next();
            int i = bo40Var.f29008a;
            s5a0 s5a0Var = (s5a0) bo40Var.f29009b;
            ifz0 ifz0Var = null;
            q5a0 q5a0Var = s5a0Var instanceof q5a0 ? (q5a0) s5a0Var : null;
            if (q5a0Var != null && (nw80Var = q5a0Var.f185487a) != null && (map = nw80Var.f159053g) != null && (str = (String) map.get("workout.segment.id")) != null) {
                ifz0Var = new ifz0(i, str, t5m0.m80117g(map));
            }
            if (ifz0Var != null) {
                arrayList.add(ifz0Var);
            }
        }
    }

    @Override // p204p.p1y0
    /* JADX INFO: renamed from: s */
    public int mo41646s(long j) {
        return 0;
    }

    public /* synthetic */ iw3(Object obj, int i) {
        this.f106333a = i;
    }

    public /* synthetic */ iw3(son sonVar, otn otnVar, int i) {
        this.f106333a = i;
    }

    public /* synthetic */ iw3(boolean z) {
        this.f106333a = 24;
    }

    @Override // com.spotify.mobius.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        qyg1 iz10Var;
        List list;
        switch (this.f106333a) {
            case 4:
                rl90 rl90Var = (rl90) obj;
                GetFeedNextPageResponse getFeedNextPageResponse = (GetFeedNextPageResponse) obj2;
                List listM43700N0 = rl90Var.f200241b;
                ae50<Section> ae50VarM7250o = getFeedNextPageResponse.m7250o();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM7250o, 10));
                for (Section section : ae50VarM7250o) {
                    wj50.m88279p(section);
                    arrayList.add(osg1.m67739y(section));
                }
                boolean zM7249n = getFeedNextPageResponse.m7249n();
                if (listM43700N0.isEmpty()) {
                    list = arrayList;
                } else {
                    if (!arrayList.isEmpty()) {
                        if (zM7249n) {
                            d6z0 d6z0Var = (d6z0) g6f.m43687A0(listM43700N0);
                            qyg1 qyg1Var = d6z0Var.f45931c;
                            qyg1 qyg1Var2 = ((d6z0) g6f.m43741q0(arrayList)).f45931c;
                            if (qyg1Var == null && qyg1Var2 != null) {
                                iz10Var = qyg1Var2;
                            } else if (qyg1Var != null && qyg1Var2 == null) {
                                iz10Var = qyg1Var;
                            } else if ((qyg1Var instanceof iz10) && (qyg1Var2 instanceof iz10)) {
                                iz10Var = new iz10(g6f.m43700N0(((iz10) qyg1Var2).f107102b, ((iz10) qyg1Var).f107102b));
                            } else {
                                qyg1Var = null;
                                iz10Var = qyg1Var;
                            }
                            listM43700N0 = g6f.m43700N0(g6f.m43729k0(arrayList, 1), g6f.m43701O0(new d6z0(d6z0Var.f45929a, d6z0Var.f45930b, iz10Var, d6z0Var.f45932d, d6z0Var.f45933e, d6z0Var.f45934f, d6z0Var.f45935g, d6z0Var.f45936h, d6z0Var.f45937i, d6z0Var.f45938j), g6f.m43731l0(1, listM43700N0)));
                        } else {
                            listM43700N0 = g6f.m43700N0(arrayList, listM43700N0);
                        }
                    }
                    list = listM43700N0;
                }
                return rl90.m75815a(rl90Var, null, list, null, getFeedNextPageResponse.getNextPageToken(), 13);
            default:
                List list2 = (List) obj;
                List listM43711Y0 = g6f.m43711Y0((List) obj2, new btm0(18));
                Set setM43734m1 = g6f.m43734m1(listM43711Y0);
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(setM43734m1, 10));
                Iterator it = setM43734m1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((nb81) it.next()).f152211a);
                }
                int size = listM43711Y0.size();
                Object[] objArr = new nb81[size];
                int iMin = Math.min(list2.size(), listM43711Y0.size());
                int i = 0;
                for (int i2 = 0; i2 < iMin; i2++) {
                    nb81 nb81Var = (nb81) list2.get(i2);
                    if (arrayList2.contains(nb81Var.f152211a)) {
                        objArr[i2] = nb81Var;
                        setM43734m1.remove(nb81Var);
                    }
                }
                List listM43728j1 = g6f.m43728j1(setM43734m1);
                int i3 = 0;
                int i4 = 0;
                while (i < size) {
                    int i5 = i3 + 1;
                    if (objArr[i] == null) {
                        objArr[i3] = listM43728j1.get(i4);
                        i4++;
                    }
                    i++;
                    i3 = i5;
                }
                List<nb81> listM29620k1 = bk5.m29620k1(objArr);
                ArrayList arrayList3 = new ArrayList();
                for (nb81 nb81Var2 : listM29620k1) {
                    if (nb81Var2 != null) {
                        arrayList3.add(nb81Var2);
                    }
                }
                return arrayList3;
        }
    }

    @Override // p204p.p1y0
    /* JADX INFO: renamed from: d */
    public void mo41645d() {
    }
}
