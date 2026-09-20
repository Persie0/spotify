package p204p;

import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.kidsgraduation.p088v1.RequestGraduationRequest;
import com.spotify.player.esperanto.proto.EsSessionResponse$SessionResponse;
import com.spotify.profile.profilelist.datasource.PartialProfileListDataException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class xeu implements BiFunction, Function, fyv, vd21, yld0, dac1, InterfaceC2207oa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260773a;

    /* JADX INFO: renamed from: b */
    public final Object f260774b;

    public /* synthetic */ xeu(int i, Object obj, Object obj2) {
        this.f260773a = i;
        this.f260774b = obj2;
    }

    @Override // p204p.vd21
    /* JADX INFO: renamed from: V */
    public void mo27465V() {
        qdy qdyVar = (qdy) this.f260774b;
        ConstraintLayout constraintLayout = qdyVar.f187788x;
        if (constraintLayout == null) {
            wj50.m88260d0("frontContainer");
            throw null;
        }
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = qdyVar.f187790z;
        if (constraintLayout2 == null) {
            wj50.m88260d0("backContainer");
            throw null;
        }
        constraintLayout2.setVisibility(4);
        ParagraphView paragraphView = qdyVar.f187771A;
        if (paragraphView == null) {
            wj50.m88260d0("storyTitleView");
            throw null;
        }
        paragraphView.setVisibility(4);
        ConstraintLayout constraintLayout3 = qdyVar.f187787w;
        if (constraintLayout3 != null) {
            constraintLayout3.setAlpha(1.0f);
        } else {
            wj50.m88260d0("frontSceneContainer");
            throw null;
        }
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: a */
    public void mo28347a() {
        ((k730) this.f260774b).f119928i1.m51847a();
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        se4 se4Var = (se4) this.f260774b;
        return se4Var.m77882b() > 0 && se4Var.m77881a() > 0;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        List list;
        Completable completableM58208g;
        switch (this.f260773a) {
            case 4:
                y5f y5fVar = (y5f) ((Map) obj).get(((e8w) this.f260774b).f57284a);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269419c : false);
            case 5:
                uqw uqwVar = (uqw) this.f260774b;
                return new mrw(uqwVar.f233135a, uqwVar.f233136b, ((EsSessionResponse$SessionResponse) obj).getSessionId(), uqwVar.f233137c);
            case 6:
                d7x d7xVar = (d7x) this.f260774b;
                int i = 29;
                return d7x.m35239h(d7xVar.f46283a, new j20(d7xVar, i)).m23299p(new j3p(d7xVar, i));
            case 7:
                uky ukyVar = ((rmx) this.f260774b).f200628c;
                return Single.fromCallable(new x31(6, ukyVar.f231388b, uky.m83349a((String) obj))).map(hcp0.f89863V0).onErrorResumeNext(tky.f221260b).subscribeOn(ukyVar.f231387a).onErrorComplete();
            case 9:
                pqm0 pqm0Var = (pqm0) obj;
                fxx fxxVar = (fxx) pqm0Var.f180350a;
                if (!((Boolean) pqm0Var.f180351b).booleanValue()) {
                    return Observable.just(fxxVar);
                }
                Observable observableJust = Observable.just(fxxVar);
                kps kpsVar = ((azx) this.f260774b).f21707j;
                kpsVar.getClass();
                return observableJust.compose(new bi1(kpsVar, 15));
            case 14:
                p2x0 p2x0Var = (p2x0) obj;
                sdo sdoVar = (sdo) this.f260774b;
                zv41 zv41Var = (zv41) sdoVar.f208051e;
                zv41 zv41Var2 = (zv41) sdoVar.f208053g;
                wvz wvzVar = (wvz) zv41Var.getValue();
                boolean z = p2x0Var instanceof k2x0;
                String str = "";
                if (z) {
                    list = lau.f131415a;
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<nw80> list2 = ((qu80) ((m2x0) p2x0Var).f139474a).f192598d;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
                    for (nw80 nw80Var : list2) {
                        String str2 = nw80Var.f159049c;
                        String str3 = (String) nw80Var.f159053g.get("parent_uri");
                        arrayList.add(new v6w0(str2, str3 == null ? "" : str3, null, null, null, null, 60));
                    }
                    list = arrayList;
                }
                if (!z) {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str4 = (String) ((qu80) ((m2x0) p2x0Var).f139474a).f192599e.f271272q.get("onboarding_image_url");
                    if (str4 != null) {
                        str = str4;
                    }
                }
                return wvz.m89167a(wvzVar, list, str, false, ((vvz) zv41Var2.getValue()).f245362a, ((vvz) zv41Var2.getValue()).f245363b, 4);
            case 16:
                Throwable th = (Throwable) obj;
                return Observable.error(th instanceof PartialProfileListDataException ? (PartialProfileListDataException) th : new PartialProfileListDataException((qxr0) this.f260774b, th));
            case 19:
                k570 k570Var = (k570) this.f260774b;
                int iOrdinal = ((gkt) obj).f80902a.ordinal();
                if (iOrdinal == 0) {
                    cvw0 cvw0VarM12231o = RequestGraduationRequest.m12231o();
                    cvw0VarM12231o.m34069m();
                    RequestGraduationRequest requestGraduationRequest = (RequestGraduationRequest) cvw0VarM12231o.build();
                    l570 l570Var = k570Var.f119427a;
                    wj50.m88279p(requestGraduationRequest);
                    completableM58208g = l570Var.m58208g(requestGraduationRequest);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    completableM58208g = g0b1.m43282x(xsr.f265652b, new ks10(k570Var, null, 1));
                }
                return completableM58208g.m23293d(Observable.just(lww.f137649f)).onErrorReturn(b0y.f22146e);
            case 22:
                if (((Boolean) obj).booleanValue()) {
                    return ((ox30) this.f260774b).f170853h.f134417e;
                }
                Observable observableEmpty = Observable.empty();
                wj50.m88279p(observableEmpty);
                return observableEmpty;
            case 23:
                return new CompletableFromAction(new h331((j331) ((tey) this.f260774b).f219809c, (String) obj, 2));
            default:
                return ((Boolean) obj).booleanValue() ? Observable.just(Boolean.TRUE) : Observable.just(Boolean.valueOf(((pz6) ((hz6) ((C2445u9) this.f260774b).f228049b)).f183611a.isWiredHeadsetOn()));
        }
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: c */
    public void mo28349c() {
        k730 k730Var = (k730) this.f260774b;
        h730 h730Var = k730Var.f119924e1;
        if (h730Var.f88327d || h730Var.f88328e) {
            k730Var.f119928i1.m51848b(k730Var.f119917X0.m23346b0(Flowable.m23322h(k730Var.f119914U0, k730Var.f119913T0, tky.f221266f), jey.f111747i).m23342W(k730Var.f119922c1).m23332L(k730Var.f119921b1).m23356t(Functions.f7225a).subscribe(new p8v(k730Var, 27)));
        }
    }

    @Override // p204p.yld0
    /* JADX INFO: renamed from: d */
    public void mo53252d(zld0 zld0Var, tld0 tld0Var, Collection collection) {
        mg10 mg10Var = (mg10) this.f260774b;
        if (zld0Var != mg10Var.f143283y || tld0Var == null) {
            if (zld0Var == mg10Var.f143263e) {
                if (tld0Var != null) {
                    mg10Var.m61677p(mg10Var.f143262d, tld0Var);
                }
                wmd0 wmd0Var = mg10Var.f143262d;
                wmd0Var.getClass();
                tmd0 tmd0Var = wmd0Var instanceof tmd0 ? (tmd0) wmd0Var : null;
                if (tmd0Var != null) {
                    tmd0Var.m81128q(collection);
                    return;
                }
                return;
            }
            return;
        }
        vmd0 vmd0Var = mg10Var.f143282x.f252810a;
        String strM81050g = tld0Var.m81050g();
        tmd0 tmd0Var2 = new tmd0(vmd0Var, strM81050g, mg10Var.m61663b(vmd0Var, strM81050g));
        tmd0Var2.m88561h(tld0Var);
        if (mg10Var.f143262d == tmd0Var2) {
            return;
        }
        zld0 zld0Var2 = mg10Var.f143283y;
        wmd0 wmd0Var2 = mg10Var.f143282x;
        umd0 umd0Var = mg10Var.f143264f;
        if (umd0Var != null) {
            umd0Var.m83430a();
            mg10Var.f143264f = null;
        }
        umd0 umd0Var2 = new umd0(mg10Var, tmd0Var2, zld0Var2, 3, true, wmd0Var2, collection);
        mg10Var.f143264f = umd0Var2;
        umd0Var2.m83431b();
        mg10Var.f143282x = null;
        mg10Var.f143283y = null;
    }

    @Override // p204p.fyv
    /* JADX INFO: renamed from: f */
    public fiz mo26898f() {
        q040 q040Var = (q040) ((g480) ((pfm0) this.f260774b).mo15684j0(q040.class)).mo31538a();
        return q040Var != null ? new ysk(q040Var.f183902b.f243453a, 27) : gau.f78095a;
    }

    public /* synthetic */ xeu(Object obj, int i) {
        this.f260773a = i;
        this.f260774b = obj;
    }

    public xeu(qxr qxrVar) {
        this.f260773a = 20;
        ojo ojoVar = ago.f15436t;
        this.f260774b = g9g1.m44033i(new erh(qxrVar));
    }

    public xeu() {
        this.f260773a = 10;
        this.f260774b = (ExtraSupportedSurfaceCombinationsQuirk) rbr.f197650a.m76583e(ExtraSupportedSurfaceCombinationsQuirk.class);
    }

    public xeu(voi voiVar, k7p0 k7p0Var, ugz0 ugz0Var, kv91 kv91Var) {
        this.f260773a = 1;
        this.f260774b = k7p0Var;
    }

    @Override // p204p.dac1
    /* JADX INFO: renamed from: e */
    public void mo28351e() {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return veu.m85329d((fk30) this.f260774b, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
