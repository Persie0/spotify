package p204p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.music.R;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDecorationErrorEvent;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class kfp0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f122214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfp0(Object obj, int i) {
        super(1);
        this.f122213a = i;
        this.f122214b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object mvq0Var;
        int i = 21;
        int i2 = 13;
        int i3 = 0;
        fbk fbkVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f122213a) {
            case 0:
                return new p6b(((n6b) this.f122214b).f150802c);
            case 1:
                a9i0 a9i0Var = (a9i0) this.f122214b;
                y64 y64Var = (y64) a9i0Var.f13580c;
                return ((fju) a9i0Var.f13579b).mo26174a(new egp0(y64Var.m92905g(), y64Var.m92903f(), y64Var.m92879M(), y64Var.m92869F(), y64Var.m92941y()));
            case 2:
                int iIntValue = ((Number) obj).intValue();
                whp0 whp0Var = (whp0) ((bip0) this.f122214b);
                return new qhp0(whp0Var.f251422a, whp0Var.f251423b, iIntValue);
            case 3:
                vxx vxxVar = (vxx) this.f122214b;
                String strM38564m = edb.m38564m("Failed to fetch playlist metadata: ", ((j2x0) obj).mo27977b());
                Logger.m3966b(strM38564m, new Object[0]);
                qre0 qre0Var = (qre0) vxxVar.f245854g;
                k5v0 k5v0VarM20348q = RecentsDecorationErrorEvent.m20348q();
                k5v0VarM20348q.m55567q(strM38564m);
                k5v0VarM20348q.m55568r("playlist_decorator");
                k5v0VarM20348q.m55566m("data_fetch_error");
                qre0Var.m73616a(k5v0VarM20348q.build());
                return new ybv(objArr == true ? 1 : 0, -1);
            case 4:
                return ((fju) ((iv0) this.f122214b).f106058d).mo26174a(null);
            case 5:
                dju djuVar = ((h36) this.f122214b).f87146b.f60295c;
                return new f6q(djuVar.f49744b, djuVar.f49743a, 13);
            case 6:
                Bundle bundle = (Bundle) obj;
                awp0 awp0Var = (awp0) this.f122214b;
                awp0Var.f20588G0 = bundle;
                Bundle bundle2 = bundle.getBundle("deferred_component_state");
                if (bundle2 != null) {
                    yjq yjqVar = awp0Var.f20612a;
                    ArrayList arrayListM27339d = awp0Var.m27339d();
                    yjqVar.f273426d = true;
                    if (yjqVar.f273423a) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : arrayListM27339d) {
                            if (obj2 instanceof lx41) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((lx41) it.next()).mo32993e(bundle2);
                        }
                    } else {
                        yjqVar.f273427e = bundle2;
                    }
                }
                return w2a1.f247311a;
            case 7:
                String str = (String) obj;
                LinkedHashMap linkedHashMap = ((sxp0) this.f122214b).f214976r;
                if (linkedHashMap == null) {
                    wj50.m88260d0("allSectionElementsAndCompanions");
                    throw null;
                }
                uxt uxtVar = (uxt) linkedHashMap.get(str);
                if (uxtVar != null) {
                    return uxtVar.f235039c.f245828a;
                }
                return null;
            case 8:
                return ((izd1) obj).getData().mo28634a((ty80) this.f122214b);
            case 9:
                return ((i0q0) this.f122214b).f97294b;
            case 10:
                u1q0 u1q0Var = (u1q0) this.f122214b;
                return new bzg0(u1q0Var.f225884D.path(), u1q0Var.f225885E.f243453a, (st91) obj);
            case 11:
                e6a0 e6a0Var = (e6a0) this.f122214b;
                return ((okj0) e6a0Var.f56599c).m67253x(emk.m39429E((eju) e6a0Var.f56601e, (pq81) obj));
            case 12:
                return ((q3q0) this.f122214b).f184925b;
            case 13:
                qsp qspVar = (qsp) ((hmh0) obj);
                qspVar.f192162a = w7q0.f248754b;
                qspVar.f192165d = lin0.f133842Y0;
                qspVar.f192163b = RxEventSources.m15655a(k0e1.m54988g(((gcu0) ((pqk0) ((d5a0) this.f122214b).f45383e).f180346b).m44321c(), dau.f47107a).distinctUntilChanged().map(yby.f271307c1));
                return w2a1.f247311a;
            case 14:
                sef0 sef0Var = (sef0) this.f122214b;
                return ((tq80) ((kq80) sef0Var.f208285b)).m81307e().filter(new x74(sef0Var, i)).distinctUntilChanged().switchMap(new ezk0(sef0Var, 19)).distinctUntilChanged().firstOrError().onErrorReturnItem(new n1y("", "", lau.f131415a, false)).toObservable().toFlowable(BackpressureStrategy.f7190d);
            case 15:
                return new n5c(((l43) this.f122214b).f129485b.getString(R.string.popular_releases_carousel_title));
            case 16:
                return ((fcq0) this.f122214b).f68238l.getView();
            case 17:
                return ((fjh0) obj).m41842a(((ccq0) this.f122214b).f36594a);
            case 18:
                ((icp) obj).f100858d = new j27(this.f122214b, (fbk) (objArr2 == true ? 1 : 0), 24);
                return w2a1.f247311a;
            case 19:
                return ((kju) ((b7v0) this.f122214b).f24398c).mo26174a(null);
            case 20:
                int iOrdinal = ((b940) obj).ordinal();
                if (iOrdinal == 0) {
                    ukq0 ukq0Var = (ukq0) ((c170) this.f122214b).f33012i;
                    synchronized (ukq0Var) {
                        ukq0Var.m83340f("loaded", true);
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ukq0 ukq0Var2 = (ukq0) ((c170) this.f122214b).f33012i;
                    synchronized (ukq0Var2) {
                        ukq0Var2.m83340f("failed", false);
                    }
                }
                return w2a1.f247311a;
            case 21:
                return ((ziu) ((b7v0) this.f122214b).f24398c).mo26174a(null);
            case 22:
                return ((fju) ((b7v0) this.f122214b).f24398c).mo26174a(null);
            case 23:
                return ((soq0) this.f122214b).f212636a.f157053c;
            case 24:
                return ((kju) ((b7v0) this.f122214b).f24398c).mo26174a(null);
            case 25:
                ((icp) obj).f100858d = new ij60((qce0) this.f122214b, fbkVar, i);
                return w2a1.f247311a;
            case 26:
                return new wrq0("", ((w6k0) obj).f248414a, ((vm4) ((ftl) this.f122214b).f73244c).m85984a());
            case 27:
                byq0 byq0Var = (byq0) obj;
                nak0 nak0Var = (nak0) this.f122214b;
                if (byq0Var instanceof pxq0) {
                    nak0Var.accept(wuq0.f255254a);
                } else if (byq0Var instanceof txq0) {
                    nak0Var.accept(new bvq0(null));
                } else if (byq0Var instanceof zxq0) {
                    nak0Var.accept(new svq0(((zxq0) byq0Var).f287376a, null));
                } else if (byq0Var instanceof yxq0) {
                    nak0Var.accept(new ovq0(null));
                } else if (byq0Var instanceof uxq0) {
                    uxq0 uxq0Var = (uxq0) byq0Var;
                    nak0Var.accept(new hvq0(uxq0Var.f235028a, !uxq0Var.f235029b));
                } else if (byq0Var instanceof sxq0) {
                    nak0Var.accept(avq0.f20249a);
                } else if (byq0Var instanceof rxq0) {
                    nak0Var.accept(new zuq0(null, null));
                } else if (byq0Var instanceof vxq0) {
                    nak0Var.accept(new kvq0(null));
                } else if (byq0Var instanceof wxq0) {
                    nak0Var.accept(lvq0.f137378a);
                } else if (byq0Var instanceof ayq0) {
                    nak0Var.accept(rvq0.f203120a);
                } else if (byq0Var instanceof xxq0) {
                    int i4 = ((xxq0) byq0Var).f267050a.f148503b;
                    int iM38547C = edb.m38547C(i4);
                    if (iM38547C == 0 || iM38547C == 1) {
                        mvq0Var = new mvq0(i4 != 2);
                    } else {
                        if (iM38547C != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mvq0Var = new dvq0(null);
                    }
                    nak0Var.accept(mvq0Var);
                } else {
                    if (!(byq0Var instanceof qxq0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nak0Var.accept(new vuq0(null));
                }
                return w2a1.f247311a;
            case 28:
                v6k0 v6k0Var = (v6k0) obj;
                return new wrq0(v6k0Var.f237915a, v6k0Var.f237916b.f275576d, ((vm4) ((nu00) this.f122214b).f158474d).m85984a());
            default:
                String str2 = (String) obj;
                e6a0 e6a0Var2 = (e6a0) this.f122214b;
                return ((jpx) ((epx) e6a0Var2.f56599c)).m53978b(new C1668ai("prerelease_card_now_playing", false, (gh00) new k5n0(str2, 28))).filter(bxq0.f31960b).map(new b1h1(str2, i2)).flatMap(new cxq0(i3, e6a0Var2, str2)).firstOrError().flatMapMaybe(dxq0.f54064b);
        }
    }
}
