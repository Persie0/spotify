package p204p;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.sort.SortButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class nfp implements ant, Function, t6l0, yj81, ggc1, BiFunction, Init, InterfaceC2207oa, w1j0, tut, rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153407a;

    /* JADX INFO: renamed from: b */
    public final Object f153408b;

    public /* synthetic */ nfp(Object obj, int i) {
        this.f153407a = i;
        this.f153408b = obj;
    }

    /* JADX INFO: renamed from: i */
    public static nfp m64351i(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_language_minimum_selection_dialog, (ViewGroup) null, false);
        int i = android.R.id.button1;
        if (((Button) vie1.m85629k(viewInflate, android.R.id.button1)) != null) {
            i = android.R.id.button2;
            if (((Button) vie1.m85629k(viewInflate, android.R.id.button2)) != null) {
                i = android.R.id.button3;
                if (((Button) vie1.m85629k(viewInflate, android.R.id.button3)) != null) {
                    i = R.id.buttonPanel;
                    if (((LinearLayout) vie1.m85629k(viewInflate, R.id.buttonPanel)) != null) {
                        i = android.R.id.message;
                        if (((TextView) vie1.m85629k(viewInflate, android.R.id.message)) != null) {
                            return new nfp((LinearLayout) viewInflate, 29);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: n */
    public static String m64352n(wr30 wr30Var) {
        HubsImmutableComponentBundle data;
        Object obj;
        ar30 ar30Var = wr30Var.events().get("click");
        String string = (ar30Var == null || (data = ar30Var.getData()) == null || (obj = data.get("uri")) == null) ? null : obj.toString();
        return string == null ? "" : string;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: a */
    public String m64353a(r300 r300Var) {
        String displayName;
        String str = r300Var.f195375d;
        String str2 = r300Var.f195373b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = h0b1.f86200a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM64358j = m64358j(displayName, m64354d(r300Var));
        if (!TextUtils.isEmpty(strM64358j)) {
            return strM64358j;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        ihi ihiVar = (ihi) obj;
        return ((x1p0) this.f153408b).m89659D(ihiVar.f102296c, ihiVar.f102294a, 1);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return g6f.m43711Y0((List) obj2, ((arm) ((ol1) this.f153408b).f166728b).m26960a((Map) obj));
    }

    @Override // p204p.tut
    /* JADX INFO: renamed from: b */
    public void mo27645b(Object obj) {
        lvx0 lvx0Var = (lvx0) this.f153408b;
        lvx0Var.mo31971e(wey.m87916a((wey) obj, ((wey) lvx0Var.getState()).f250644c));
    }

    @Override // p204p.ggc1
    /* JADX INFO: renamed from: c */
    public Subject mo44686c() {
        return (Subject) this.f153408b;
    }

    /* JADX INFO: renamed from: d */
    public String m64354d(r300 r300Var) {
        Resources resources = (Resources) this.f153408b;
        int i = r300Var.f195377f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = m64358j(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = m64358j(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? m64358j(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX INFO: renamed from: e */
    public ArtworkView m64355e() {
        return (ArtworkView) ((jmv) this.f153408b).findViewById(R.id.entity_media_artwork);
    }

    /* JADX INFO: renamed from: f */
    public View m64356f() {
        return ((jmv) this.f153408b).findViewById(R.id.entity_media_overlay);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        boolean z;
        boolean zBooleanValue;
        e921 e921Var = (e921) obj;
        wj50.m88279p(e921Var);
        kzr kzrVar = ((dzr) this.f153408b).f54716f;
        boolean z2 = kzrVar.f128183a == 2;
        if (kzrVar.m57764c() == 1) {
            tzr tzrVar = (tzr) ((dzr) this.f153408b).f54727q.getValue();
            synchronized (tzrVar) {
                zBooleanValue = ((Boolean) tzrVar.f225289b.getValue()).booleanValue();
            }
            if (zBooleanValue) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        r721 r721Var = null;
        n721 n721Var = z2 ? n721.f151043a : null;
        if (z && !e921Var.f57348o) {
            r721Var = r721.f196421a;
        }
        return First.m15575c(e921Var, s601.m77312o0(o721.f162452a, n721Var, r721Var));
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        o12 o12Var = (o12) this.f153408b;
        ((xba) ((pz0) o12Var.f160572c).mo25006a()).mo63162p1((c700) o12Var.f160571b, null);
        return p1j0.f173119a;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (LinearLayout) this.f153408b;
    }

    /* JADX INFO: renamed from: h */
    public LinearLayout m64357h() {
        return (LinearLayout) this.f153408b;
    }

    /* JADX INFO: renamed from: j */
    public String m64358j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f153408b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: k */
    public mpr m64359k(dd41 dd41Var, Bundle bundle) {
        String string;
        Uri uri = dd41Var.f47707a;
        if (uri == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LinkedList linkedList = new LinkedList(pathSegments);
        Boolean boolValueOf = null;
        if (linkedList.size() <= 1) {
            return null;
        }
        linkedList.pop();
        String str = (String) linkedList.pop();
        String str2 = linkedList.size() % 2 > 0 ? (String) linkedList.pop() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (linkedList.size() >= 2) {
            linkedHashMap.put((String) linkedList.pop(), (String) linkedList.pop());
        }
        for (String str3 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str3);
            if (queryParameter != null) {
                linkedHashMap.put(str3, bm51.m29801l0(queryParameter, "/", ":"));
            }
        }
        boolean zM88271j = wj50.m88271j(uri.getQueryParameter("loadingPlaceholder"), "pageApiDefault");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.contains("startMuted")) {
            boolValueOf = Boolean.valueOf(wj50.m88271j(uri.getQueryParameter("startMuted"), "true"));
        }
        Boolean bool = boolValueOf;
        String str4 = (bundle == null || (string = bundle.getString("origin")) == null) ? "" : string;
        String queryParameter2 = uri.getQueryParameter("entrypointIdentifier");
        String str5 = queryParameter2 == null ? "" : queryParameter2;
        wj50.m88279p(str);
        return new mpr(str, str2, linkedHashMap, zM88271j, bool, str4, str5, nyg1.m65891r(dd41Var), nyg1.m65890q(dd41Var), true, ((t36) this.f153408b).m79979k());
    }

    /* JADX INFO: renamed from: l */
    public void m64360l(Object obj) {
        ((kmq) this.f153408b).m63868l(obj);
    }

    /* JADX INFO: renamed from: m */
    public void m64361m(Exception exc) {
        ((kmq) this.f153408b).m63869m(exc);
    }

    @Override // p204p.tut
    /* JADX INFO: renamed from: o */
    public void mo27656o(Object obj, cvt cvtVar) {
        lvx0 lvx0Var = (lvx0) this.f153408b;
        if (!(((vey) obj) instanceof vey)) {
            throw new NoWhenBranchMatchedException();
        }
        lvx0Var.mo31971e(wey.m87916a((wey) lvx0Var.getState(), !((wey) lvx0Var.getState()).f250644c));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f153407a) {
            case 1:
                zg80 zg80Var = (zg80) obj;
                aop aopVar = (aop) this.f153408b;
                pzs0 pzs0Var = aopVar.f17734c;
                if (zg80Var != zg80.f282544a) {
                    ((SortButtonView) pzs0Var.f183797e).setVisibility(zg80Var == zg80.f282546c ? 0 : 8);
                    ((BehaviorRetainingAppBarLayout) aopVar.f17732a.f225650d).post(new eph(aopVar, 10));
                    ((ConstraintLayout) pzs0Var.f183796d).setVisibility(0);
                } else {
                    ((ConstraintLayout) pzs0Var.f183796d).setVisibility(8);
                }
                break;
            case 2:
            default:
                pqm0 pqm0Var = (pqm0) obj;
                deq deqVar = (deq) this.f153408b;
                deqVar.getClass();
                long jLongValue = ((Number) pqm0Var.f180350a).longValue();
                long jLongValue2 = ((Number) pqm0Var.f180351b).longValue();
                ezw0 ezw0Var = deqVar.f48151f;
                mec1.m61568t(deqVar.f48148c, deqVar.f48146a.getString(R.string.np_seekbar_state_description, ezw0Var.m40413f((int) jLongValue), ezw0Var.m40413f((int) jLongValue2)));
                break;
            case 3:
                String str = (String) obj;
                qxo qxoVar = (qxo) this.f153408b;
                wj50.m88279p(str);
                ((TextView) ((rk0) qxoVar.f193717c).f199941i).setText(str);
                break;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        if (swd1Var.f214650a.mo51811q(8)) {
            ((mcq) this.f153408b).m61470e();
        }
        return swd1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nfp(gh00 gh00Var) {
        this.f153407a = 17;
        this.f153408b = (qe70) gh00Var;
    }

    public nfp() {
        this.f153407a = 8;
        this.f153408b = new PublishSubject().m23811c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [p.gh00, p.qe70] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleUnsubscribeOn;
        int i = this.f153407a;
        int i2 = 2;
        int i3 = 20;
        int i4 = 1;
        Integer numValueOf = null;
        Object[] objArr = 0;
        Object obj2 = this.f153408b;
        switch (i) {
            case 2:
                pqm0 pqm0Var = (pqm0) obj;
                Object obj3 = pqm0Var.f180350a;
                Object obj4 = pqm0Var.f180351b;
                Objects.toString(obj3);
                Objects.toString(obj4);
                xxo xxoVar = (xxo) obj2;
                api apiVarM77296c = ((s5p) ((voi) xxoVar.f267035c)).m77296c();
                if (apiVarM77296c != null) {
                    return new hzq0(new p90(apiVarM77296c, (e07) obj3, xxoVar.f267033a, ((j4p0) xxoVar.f267037e).f108757b, xxoVar.f267034b));
                }
                return C2244p5.f174033a;
            case 4:
                return uoa.m83601b((uoa) obj2, (tl11) obj);
            case 10:
                xul0 xul0Var = (xul0) obj;
                whp whpVar = (whp) obj2;
                if (xul0Var.mo49279c()) {
                    if (((a5b) xul0Var.mo49278b()).f12480c >= fr0.m42463g((wy3) ((brq) whpVar.f251421d).f30159a, 86400000L)) {
                        a5b a5bVar = (a5b) xul0Var.mo49278b();
                        p14 p14Var = q14.Companion;
                        Set set = a5bVar.f12478a;
                        Set set2 = a5bVar.f12479b;
                        p14Var.getClass();
                        return Single.just(new q14(set, set2));
                    }
                }
                tgq tgqVar = (tgq) whpVar.f251419b;
                Single<irq> singleSubscribeOn = ((erq) tgqVar.f220237b).m39825a().subscribeOn((Scheduler) tgqVar.f220238c);
                frq frqVar = frq.f72648h;
                return singleSubscribeOn.map(new so3(9)).flatMap(new qro(whpVar, i3)).onErrorReturn(new t5p(whpVar, xul0Var));
            case 14:
                if (!((nlv0) obj2).f155174a) {
                    return Observable.just(new wed0(0), new xed0(2));
                }
                return Observable.just(new xed0(1));
            case 15:
                return osg1.m67734t(new aak0(null, ((ejs) obj2).f60287b.getString(R.string.dsa_sponsored_hat_text)), null, 12);
            case 16:
                fxx fxxVar = (fxx) obj;
                kps kpsVar = (kps) obj2;
                List list = fxxVar.f74479a;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((axx) it.next()).f21021a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    String str = (String) obj5;
                    Set set3 = dd41.f47702f;
                    if (r46.m74726U(str).f47709c == kpsVar.f125118b && !jjf1.m53566r(str)) {
                        arrayList2.add(obj5);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return Observable.just(fxxVar);
                }
                return kpsVar.f125117a.m76074b("EIS_playability_transformer_impl:external_integration_content_response", arrayList2, true).map(new qro(fxxVar, 26)).onErrorReturn(new t5p(fxxVar, i3)).toObservable();
            case 17:
                v5t v5tVar = (v5t) obj;
                wj50.m88279p(v5tVar);
                return (Boolean) ((qe70) obj2).invoke(v5tVar);
            case 23:
                xul0 xul0Var2 = (xul0) obj;
                v7x v7xVar = (v7x) obj2;
                wra0 wra0Var = v7xVar.f238334e;
                try {
                    v7x.m84898a(v7xVar, (gl00) xul0Var2.mo49278b());
                    wra0Var.mo46852b();
                    break;
                } catch (Throwable th) {
                    th.toString();
                    wra0Var.mo46853c();
                }
                return w2a1.f247311a;
            case 24:
                fxx fxxVar2 = (fxx) obj;
                List list2 = fxxVar2.f74479a;
                list2.size();
                int i5 = ((roa) obj2).f201207j.f104534a;
                return list2.size() > i5 ? fxx.m43028a(fxxVar2, list2.subList(0, i5), fxxVar2.f74480b, 12) : fxxVar2;
            case 25:
                ContextTrack contextTrack = (ContextTrack) obj;
                a5y a5yVar = (a5y) obj2;
                try {
                    numValueOf = Integer.valueOf(Color.parseColor("#" + contextTrack.metadata().get(ContextTrack.Metadata.KEY_EXTRACTED_COLOR)));
                    break;
                } catch (IllegalArgumentException unused) {
                }
                if (numValueOf == null || (singleUnsubscribeOn = Single.just(Integer.valueOf(numValueOf.intValue()))) == null) {
                    singleUnsubscribeOn = Single.create(new nps(i3, a5yVar, e72.m38000d0(contextTrack, "image_url"))).unsubscribeOn((Scheduler) a5yVar.f12645d);
                }
                wj50.m88279p(singleUnsubscribeOn);
                return singleUnsubscribeOn.map(new gg5(a5yVar)).map(new z4y(contextTrack, a5yVar));
            default:
                mft mftVar = (mft) obj;
                ksy ksyVar = (ksy) obj2;
                if (mftVar.f143173a && ksyVar.f126073e) {
                    return vjf1.m85770t(dau.f47107a, new dmx((Object) mftVar, (Object) ksyVar, (fbk) (objArr == true ? 1 : 0), 5)).ignoreElement().m23307y().onErrorReturn(isy.f105351b);
                }
                Observable observableJust = Observable.just(mftVar.f143175c);
                Observable<T> observableTake = new ObservableFromPublisher(ksyVar.f126069a).take(1L);
                String str2 = mftVar.f143176d;
                Set set4 = mftVar.f143179g;
                String str3 = mftVar.f143175c;
                int i6 = mftVar.f143180h;
                Set<String> set5 = mftVar.f143177e;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(set5, 10));
                for (String str4 : set5) {
                    Set set6 = dd41.f47702f;
                    arrayList3.add(r46.m74726U(str4).m35710h());
                }
                Set setM43736n1 = g6f.m43736n1(arrayList3);
                Set<String> set7 = set4;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(set7, 10));
                for (String str5 : set7) {
                    Set set8 = dd41.f47702f;
                    arrayList4.add(r46.m74726U(str5).m35710h());
                }
                Observable observableOnErrorReturn = Observable.combineLatest(observableJust, observableTake, ksyVar.f126071c.m26254a(new wsx(i6, str2, str3, g6f.m43736n1(arrayList4.subList(Math.max(0, set4.size() - 6), set4.size())), setM43736n1)).toObservable(), jsy.f115619b).flatMap(new tey(i4, ksyVar, mftVar)).map(new z4y(mftVar, i2)).onErrorReturn(hsy.f94846b);
                wj50.m88279p(observableOnErrorReturn);
                return observableOnErrorReturn;
        }
    }

    public nfp(Resources resources) {
        this.f153407a = 6;
        resources.getClass();
        this.f153408b = resources;
    }

    public nfp(oge0 oge0Var) {
        this.f153407a = 18;
        this.f153408b = new C2263po(13, oge0Var, this);
    }

    @Override // p204p.tut
    public void dispose() {
    }
}
