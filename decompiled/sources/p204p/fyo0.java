package p204p;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.listplatform.sortingimpl.SortingModel;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.music.R;
import com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin;
import com.squareup.moshi.JsonDataException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes8.dex */
public final class fyo0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fyo0(Object obj, int i) {
        super(0);
        this.f74786a = i;
        this.f74787b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d6  */
    @Override // p204p.eh00
    public final Object invoke() {
        int i = 7;
        int i2 = 4;
        boolean z = false;
        int i3 = 3;
        SortingModel sortingModel = null;
        jo70Var = null;
        jo70 jo70Var = null;
        rwp0 rwp0Var = null;
        sortingModel = null;
        sortingModel = null;
        sortingModel = null;
        switch (this.f74786a) {
            case 0:
                dnw dnwVarM17804F = EsPlayOrigin$PlayOrigin.m17804F();
                dnwVarM17804F.m36498w(xoc1.f264109i6.f243453a);
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                dnwVarM17804F.m36494s(xgg1.m90726W2().f36167d);
                dnwVarM17804F.m36496u(((iyo0) this.f74787b).f107030b.m35663a());
                return (EsPlayOrigin$PlayOrigin) dnwVarM17804F.build();
            case 1:
                s2o s2oVar = (s2o) this.f74787b;
                ((gb80) s2oVar.f205041h).mo31986a((e16) s2oVar.f205043t);
                ((iwr) s2oVar.f205038e).m51848b(((Flowable) s2oVar.f205039f).m23342W((Scheduler) s2oVar.f205036c).m23332L((Scheduler) s2oVar.f205035b).subscribe(new o4n0(s2oVar, i)));
                return w2a1.f247311a;
            case 2:
                q0p0 q0p0Var = (q0p0) this.f74787b;
                q0p0Var.f184055t = null;
                q0p0Var.f184043X = null;
                q0p0Var.f184044Y.m60129c();
                return w2a1.f247311a;
            case 3:
                return (p8p0) ((zbn) this.f74787b).get();
            case 4:
                rep0 rep0Var = (rep0) this.f74787b;
                Observable observableMo27556b = rep0Var.f198398a.mo27556b();
                qep0 qep0Var = qep0.f187985h;
                int i4 = 20;
                Observable observableDistinctUntilChanged = observableMo27556b.map(new r46(i4)).distinctUntilChanged();
                String str = rep0Var.f198400c.f250600a;
                return Observable.combineLatest(k0e1.m54988g(((mu80) rep0Var.f198399b).m62846k(str, new st80(rep0Var.f198404g, null, null, true, null, c5u0.f34291a, null, 0, null, 470)), dau.f47107a).map(gyx.f85775Z0), observableDistinctUntilChanged.switchMap(new k5k0(i4, rep0Var, str)), new t36(rep0Var, i4)).replay(1).m23778f();
            case 5:
                return new ynb0((d2j0) this.f74787b, 16);
            case 6:
                pjp0 pjp0Var = (pjp0) this.f74787b;
                String strMo48710e = pjp0Var.f178296b.mo48710e(pjp0.f178294e, "");
                if (strMo48710e != null && strMo48710e.length() != 0) {
                    try {
                        sortingModel = (SortingModel) pjp0Var.f178298d.fromJson(strMo48710e);
                    } catch (JsonDataException e) {
                        edb.m38545A("Failed to fetch sorting for items ", e.getMessage(), ".");
                    } catch (IOException e2) {
                        edb.m38545A("Failed to fetch sorting for items ", e2.getMessage(), ".");
                    }
                }
                return sortingModel == null ? new SortingModel(new al40(3)) : sortingModel;
            case 7:
                return new geg0(((dtp0) this.f74787b).f52882b);
            case 8:
                uxp0 uxp0Var = (uxp0) this.f74787b;
                Iterator it = uxp0Var.f235023x.iterator();
                while (it.hasNext()) {
                    rwp0 rwp0VarM86669a = ((vxp0) it.next()).m86669a(uxp0Var.f234995R);
                    if (rwp0VarM86669a != null) {
                        rwp0Var = rwp0VarM86669a;
                        if (rwp0Var != null) {
                            return ((abm0) rwp0Var.mo30694b(uxp0Var.f234996S, new txp0())).create();
                        }
                        throw new IllegalArgumentException("There is no page identifier accept that is accepting the current conditions :( There has to be at least one!");
                    }
                }
                if (rwp0Var != null) {
                    return ((abm0) rwp0Var.mo30694b(uxp0Var.f234996S, new txp0())).create();
                }
                throw new IllegalArgumentException("There is no page identifier accept that is accepting the current conditions :( There has to be at least one!");
            case 9:
                return ((gyp0) this.f74787b).f85687b.m96988u(7);
            case 10:
                izp0 izp0Var = (izp0) this.f74787b;
                MobiusLoop mobiusLoop = izp0Var.f107275c;
                if (mobiusLoop == null) {
                    wj50.m88260d0("loop");
                    throw null;
                }
                pqm0 pqm0VarM65518d = nsf1.m65518d(mobiusLoop);
                Disposable disposable = (Disposable) pqm0VarM65518d.f180350a;
                lqi0 lqi0Var = (lqi0) pqm0VarM65518d.f180351b;
                izp0Var.f107276d = disposable;
                return lqi0Var;
            case 11:
                i2q0 i2q0Var = (i2q0) this.f74787b;
                bji bjiVar = i2q0Var.f97912b;
                if (bjiVar != null) {
                    return (i2q0) bjiVar.mo29483e(new jzn0(i2q0Var, 2));
                }
                return null;
            case 12:
                return w9h1.m87517y(((pzs0) this.f74787b).m71773k(), null, null, 3);
            case 13:
                return w9h1.m87517y(((pzs0) ((e6a0) this.f74787b).f56600d).m71773k(), null, null, 3);
            case 14:
                l5q0 l5q0Var = (l5q0) this.f74787b;
                MobiusLoop mobiusLoop2 = l5q0Var.f129993b;
                if (mobiusLoop2 == null) {
                    wj50.m88260d0("loop");
                    throw null;
                }
                pqm0 pqm0VarM65518d2 = nsf1.m65518d(mobiusLoop2);
                Disposable disposable2 = (Disposable) pqm0VarM65518d2.f180350a;
                lqi0 lqi0Var2 = (lqi0) pqm0VarM65518d2.f180351b;
                l5q0Var.f129994c = disposable2;
                return lqi0Var2;
            case 15:
                w5q0 w5q0Var = (w5q0) this.f74787b;
                bji bjiVar2 = w5q0Var.f248171b;
                if (bjiVar2 != null) {
                    return (w5q0) bjiVar2.mo29483e(new jzn0(w5q0Var, i3));
                }
                return null;
            case 16:
                z5q0 z5q0Var = (z5q0) this.f74787b;
                bji bjiVar3 = z5q0Var.f279611b;
                if (bjiVar3 != null) {
                    return (z5q0) bjiVar3.mo29483e(new jzn0(z5q0Var, i2));
                }
                return null;
            case 17:
                l43 l43Var = (l43) this.f74787b;
                return z2h1.m95219z(new bjc0(l43Var.f129486c.m64581a(), new kfp0(l43Var, 15)), mi21.m61822f(1.0f, cxh0.f43038a), null, 4);
            case 18:
                maq0 maq0Var = (maq0) this.f74787b;
                jo70 parentLayoutCoordinates = maq0Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.mo30016a()) {
                    jo70Var = parentLayoutCoordinates;
                }
                if (jo70Var != null && maq0Var.m98378getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                abq0 abq0Var = (abq0) this.f74787b;
                k7q0 k7q0Var = abq0Var.f14166c;
                kv91 kv91Var = (kv91) ((i4t0) k7q0Var.f120178b).get();
                xug0 xug0Var = (xug0) k7q0Var.f120179c;
                xug0Var.getClass();
                yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                abq0Var.f14164a.m63782a(bda.f26063c);
                return w2a1.f247311a;
            case 20:
                return ((gju) this.f74787b).mo26174a(null);
            case 21:
                MobiusLoop mobiusLoop3 = ((seq0) this.f74787b).f208373b;
                if (mobiusLoop3 != null) {
                    return bnf1.m29974j(mobiusLoop3);
                }
                wj50.m88260d0("loop");
                throw null;
            case 22:
                MobiusLoop mobiusLoop4 = ((teq0) this.f74787b).f219781b;
                if (mobiusLoop4 == null) {
                    wj50.m88260d0("loop");
                    throw null;
                }
                Object obj = mobiusLoop4.f5591i;
                wj50.m88279p(obj);
                zv41 zv41VarM52819d = jag1.m52819d(obj);
                mobiusLoop4.m15601b(new u6m(zv41VarM52819d, i2));
                return zv41VarM52819d;
            case 23:
                ugq0 ugq0Var = (ugq0) this.f74787b;
                return ugq0Var.f230230a.mo35843c(ugq0Var.f230231b);
            case 24:
                mlq0 mlq0Var = (mlq0) this.f74787b;
                bji bjiVar4 = mlq0Var.f144906e;
                if (bjiVar4 != null) {
                    return (mlq0) bjiVar4.mo29483e(new jzn0(mlq0Var, 5));
                }
                return null;
            case 25:
                ejq0 ejq0Var = (ejq0) this.f74787b;
                if (ejq0Var.f60274a.m72308a()) {
                    io.reactivex.rxjava3.disposables.Disposable disposable3 = ejq0Var.f60279f;
                    if (disposable3 != null && !disposable3.isDisposed()) {
                        io.reactivex.rxjava3.disposables.Disposable disposable4 = ejq0Var.f60279f;
                        if (disposable4 == null) {
                            wj50.m88260d0("fetchCampaignDisposable");
                            throw null;
                        }
                        disposable4.dispose();
                    }
                    io.reactivex.rxjava3.disposables.Disposable disposable5 = ejq0Var.f60280g;
                    if (disposable5 != null && !disposable5.isDisposed()) {
                        io.reactivex.rxjava3.disposables.Disposable disposable6 = ejq0Var.f60280g;
                        if (disposable6 == null) {
                            wj50.m88260d0("sharedPrefDisposable");
                            throw null;
                        }
                        disposable6.dispose();
                    }
                    ejq0Var.f60281h = null;
                }
                return w2a1.f247311a;
            case 26:
                return (RecyclerView) mec1.m61562n((ViewGroup) ((wg61) ((y0i0) this.f74787b).f267989b).getValue(), R.id.prerelease_recycler);
            case 27:
                c2r0 c2r0Var = (c2r0) this.f74787b;
                dcm0 dcm0Var = c2r0Var.f33451d.f11718a;
                tfm0 tfm0Var = c2r0Var.f33452e;
                kv91 kv91Var2 = (kv91) ((i4t0) tfm0Var.f220020b).get();
                ipg0 ipg0Var = (ipg0) tfm0Var.f220021c;
                ipg0Var.getClass();
                yt91 yt91VarM96903c2 = ipg0Var.f104499b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("write_prompt_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                voc1 voc1Var = xoc1.f264061c6;
                String str2 = voc1Var.f243453a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str2 != null ? str2.toString() : null;
                if (string == null) {
                    string = "";
                }
                d850 d850VarMo57453r = kv91Var2.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                String str3 = voc1Var.f243453a;
                dcm0Var.m35665c("");
                dcm0Var.m35666d(str3, d850VarMo57453r, null);
                return w2a1.f247311a;
            case 28:
                return (k5r0) this.f74787b;
            default:
                ConstraintLayout root = ((tcr0) this.f74787b).f219135b.getRoot();
                dt71.m36829u(root, root.getContext().getResources().getDimension(R.dimen.rounded_track_row_corner_radius));
                return root;
        }
    }
}
