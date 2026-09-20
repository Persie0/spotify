package p204p;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.music.R;
import com.spotify.music.spotlets.offline.util.events.proto.DownloadInteraction;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class a5j0 implements Function, jlk0, BiFunction, rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12528a;

    /* JADX INFO: renamed from: b */
    public final Object f12529b;

    /* JADX INFO: renamed from: c */
    public Object f12530c;

    public /* synthetic */ a5j0(int i, Object obj, Object obj2) {
        this.f12528a = i;
        this.f12529b = obj;
        this.f12530c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public Object m24802a(int i, qsj0 qsj0Var, ibk ibkVar) {
        rwj0 rwj0Var;
        f4k f4kVar;
        z2h1 q3kVar;
        a5z0 a5z0Var;
        int i2;
        Object objM31495a;
        f4k f4kVar2;
        qsj0 qsj0Var2 = qsj0Var;
        if (ibkVar instanceof rwj0) {
            rwj0Var = (rwj0) ibkVar;
            int i3 = rwj0Var.f203362g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rwj0Var.f203362g = i3 - Integer.MIN_VALUE;
            } else {
                rwj0Var = new rwj0(this, ibkVar);
            }
        } else {
            rwj0Var = new rwj0(this, ibkVar);
        }
        Object obj = rwj0Var.f203360e;
        int i4 = rwj0Var.f203362g;
        int i5 = 4;
        String str = null;
        yuk yukVar = yuk.f276404a;
        if (i4 != 0) {
            if (i4 == 1) {
                int i6 = rwj0Var.f203356a;
                a5z0Var = rwj0Var.f203359d;
                f4k f4kVar3 = rwj0Var.f203358c;
                qsj0 qsj0Var3 = rwj0Var.f203357b;
                bga.m29073P(obj);
                objM31495a = obj;
                f4kVar = f4kVar3;
                i2 = i6;
                qsj0Var2 = qsj0Var3;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f4kVar2 = rwj0Var.f203358c;
                bga.m29073P(obj);
            }
            return new g7k(f4kVar2, (List) obj, i5);
        }
        bga.m29073P(obj);
        String str2 = qsj0Var2.f192135c;
        tvj0 tvj0Var = qsj0Var2.f192137e;
        if (tvj0Var instanceof ovj0) {
            List<ira1> list = ((ovj0) tvj0Var).f170515b;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (ira1 ira1Var : list) {
                String strValueOf = String.valueOf(ira1Var.f104938a);
                String str3 = ira1Var.f104939b;
                arrayList.add(new uku(8, 0L, strValueOf, str3, str3));
            }
            q3kVar = new r3k(opo.m67574x(arrayList));
        } else if (tvj0Var instanceof lvj0) {
            q3kVar = new t3k(Uri.parse(((lvj0) tvj0Var).f137332b));
        } else if (tvj0Var instanceof svj0) {
            svj0 svj0Var = (svj0) tvj0Var;
            ira1 ira1Var2 = svj0Var.f214452b;
            String str4 = ira1Var2.f104938a;
            if (str4 == null) {
                str4 = "";
            }
            Uri uri = Uri.parse(str4);
            String str5 = ira1Var2.f104939b;
            q3kVar = new q3k(new t3k(uri, new e4k(str5, str5)), new t3k(Uri.parse(svj0Var.f214453c.f137332b)));
        } else {
            if (!wj50.m88271j(tvj0Var, pvj0.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            q3kVar = null;
        }
        f4kVar = new f4k(str2, q3kVar, str, i5);
        a5z0Var = (a5z0) ((er70) this.f12530c).get();
        c5z0 c5z0Var = (c5z0) ((er70) this.f12529b).get();
        y4z0 y4z0Var = new y4z0(qsj0Var2.f192139g);
        rwj0Var.f203357b = qsj0Var2;
        rwj0Var.f203358c = f4kVar;
        rwj0Var.f203359d = a5z0Var;
        i2 = i;
        rwj0Var.f203356a = i2;
        rwj0Var.f203362g = 1;
        objM31495a = c5z0Var.m31495a(y4z0Var, rwj0Var);
        if (objM31495a != yukVar) {
        }
        return yukVar;
        rwj0Var.f203357b = null;
        rwj0Var.f203358c = f4kVar;
        rwj0Var.f203359d = null;
        rwj0Var.f203356a = i2;
        rwj0Var.f203362g = 2;
        Object objM24823a = a5z0Var.m24823a((x4z0) objM31495a, i2, qsj0Var2, rwj0Var);
        if (objM24823a != yukVar) {
            f4k f4kVar4 = f4kVar;
            obj = objM24823a;
            f4kVar2 = f4kVar4;
            return new g7k(f4kVar2, (List) obj, i5);
        }
        return yukVar;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        jp20 jp20Var;
        Observable observableJust;
        switch (this.f12528a) {
            case 1:
                o221 o221Var = (o221) obj;
                efj0 efj0Var = (efj0) this.f12530c;
                ContextTrack contextTrack = (ContextTrack) this.f12529b;
                if (k231.m55147a(contextTrack) != 3 || !o221Var.f160925c) {
                    return new bfj0(contextTrack.uri(), efj0Var.f59058a, contextTrack.provider(), Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_CAN_BAN)), Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_COLLECTION_IS_BANNED)));
                }
                String strUri = contextTrack.uri();
                String strUid = contextTrack.uid();
                String strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_CONTEXT_URI);
                if (strM38000d0 == null) {
                    strM38000d0 = efj0Var.f59058a;
                }
                return new cfj0(strUri, strM38000d0, strUid);
            case 5:
                PlayerState playerState = (PlayerState) obj;
                ooa0 ooa0Var = (ooa0) this.f12529b;
                noa0 noa0Var = (noa0) this.f12530c;
                ContextTrack contextTrack2 = (ContextTrack) playerState.track().mo49283h();
                return (contextTrack2 == null || e72.m38012j0(contextTrack2) == null) ? z9p0.f280849a : new aap0(tqg1.m81328p((ContextTrack) playerState.track().mo49278b(), true, null, null, new b6b0(noa0Var, 18)), new y3p0(!playerState.isPaused(), ((Number) playerState.duration().mo49280e(0L)).longValue(), ((Number) playerState.position(((Number) ooa0Var.invoke()).longValue()).mo49280e(0L)).longValue(), (float) ((Number) playerState.playbackSpeed().mo49280e(Double.valueOf(0.0d))).doubleValue()));
            case 7:
                gp20 gp20Var = (gp20) obj;
                Object obj2 = (ta0) this.f12530c;
                if (gp20Var instanceof ap20) {
                    return Observable.just(new jbt0(((ap20) gp20Var).f17816a, f7z.f66812d));
                }
                if (gp20Var instanceof cp20) {
                    cp20 cp20Var = (cp20) gp20Var;
                    return Observable.just(new jbt0(cp20Var.f40404a, new e7z(cp20Var.f40405b)));
                }
                boolean z = true;
                if (gp20Var instanceof ep20) {
                    jk10 jk10Var = ((ppk0) this.f12529b).f180061f;
                    jp20 jp20Var2 = ((ep20) gp20Var).f61533a;
                    hv31 hv31Var = jk10Var.f113177a;
                    if (jp20Var2 instanceof hp20) {
                        fv31 fv31Var = abt0.f14191a;
                        observableJust = k0e1.m54988g(((mv31) hv31Var).m62899t(fv31Var), dau.f47107a).startWithItem(new gv31(1, hv31Var.mo48707b(fv31Var, gbu.f78413a))).map(new x7q0(jp20Var2, 12));
                    } else {
                        if (!(jp20Var2 instanceof ip20)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        observableJust = Observable.just(Boolean.FALSE);
                    }
                    Observable observableSwitchMap = observableJust.switchMap(new jwj0(obj2, 5));
                    wj50.m88279p(observableSwitchMap);
                    return observableSwitchMap;
                }
                if (gp20Var instanceof bp20) {
                    return Observable.just(new jbt0(((bp20) gp20Var).f29297a, d7z.f46304d));
                }
                if (gp20Var instanceof dp20) {
                    return Observable.just(new jbt0(((dp20) gp20Var).f51157a, g7z.f77370d));
                }
                if (!gp20Var.equals(fp20.f71699a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ra0 ra0Var = (ra0) obj2;
                boolean z2 = ra0Var instanceof oa0;
                if (z2) {
                    jp20Var = ((oa0) ra0Var).f163171a;
                } else {
                    if (!(ra0Var instanceof sa0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jp20Var = ((sa0) ra0Var).f207099a;
                }
                if (z2) {
                    z = ((oa0) ra0Var).f163172b;
                } else if (!(ra0Var instanceof sa0)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Observable.just(new pbt0(jp20Var, z));
            case 12:
                axx axxVar = (axx) obj;
                a3m0 a3m0Var = (a3m0) this.f12529b;
                return ((cxx) a3m0Var.f12003d.getValue()).mo24638b(roa.m76031a((roa) this.f12530c, null, axxVar.f21021a, false, false, null, a3m0Var.f12002c.m94150c(), 98301)).map(new nha0(a3m0Var, axxVar)).map(jey.f111728W0).flattenAsObservable(tky.f221250U0);
            case 17:
                String str = ((n38) this.f12529b).f149951b;
                tqy0 tqy0Var = (tqy0) this.f12530c;
                return new xty0(str, tqy0Var.f222919e, new c0z0((p38) obj), tqy0Var.f222920f);
            case 18:
                return cun0.m33935d((cun0) this.f12529b, (ExternalAccessoryDescription) this.f12530c, (oyx) obj);
            case 20:
                return ((Single) ((neo0) this.f12529b).f153042g.invoke((String) this.f12530c)).toMaybe();
            case 21:
                nuo0 nuo0Var = (nuo0) this.f12529b;
                if (((Boolean) obj).booleanValue()) {
                    return ((e6b) ((a6b) nuo0Var.f158685a.get())).m37934a((z5b) this.f12530c).observeOn(nuo0Var.f158687c);
                }
                return Observable.just(Boolean.FALSE);
            case 25:
                return Flowable.m23322h((FlowableMap) this.f12529b, (FlowableMap) this.f12530c, new qm90((Long) obj));
            default:
                return ((owp0) ((r3n0) this.f12529b).f195525b).mo48946a((String) this.f12530c).map(j5z.f109158Z0).map(new wel0((a7x0) obj, 11));
        }
    }

    /* JADX INFO: renamed from: b */
    public nuu0 m24803b() {
        return (nuu0) this.f12530c;
    }

    /* JADX INFO: renamed from: c */
    public List m24804c() {
        return (List) this.f12529b;
    }

    /* JADX INFO: renamed from: d */
    public Set m24805d(d7m0 d7m0Var) {
        List list = d7m0Var.f46241b;
        ArrayList<a7m0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j6f.m52564V(((c7m0) it.next()).f34949b, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (a7m0 a7m0Var : arrayList) {
            kkm0 kkm0Var = (kkm0) ((vdm) this.f12530c).m85260z().get(a7m0Var.f13102a);
            if (kkm0Var == null) {
                throw new IllegalStateException(edb.m38564m("Missing SectionRegistration for section ", a7m0Var.f13102a.name()));
            }
            arrayList2.add(kkm0Var.f123631a);
        }
        return g6f.m43736n1(i6f.m49805U(arrayList2));
    }

    /* JADX INFO: renamed from: e */
    public void m24806e(String str, int i, boolean z) {
        String str2;
        voc1 voc1Var = (voc1) this.f12529b;
        u6s u6sVarM15765r = DownloadInteraction.m15765r();
        u6sVarM15765r.m82460m(str);
        u6sVarM15765r.m82462r(z);
        u6sVarM15765r.m82463s(voc1Var.f243453a);
        if (i == 1) {
            str2 = "header-toggle";
        } else if (i == 2) {
            str2 = "header-button";
        } else if (i == 3) {
            str2 = "item-row";
        } else if (i == 4) {
            str2 = "context-menu";
        } else {
            if (i != 5) {
                throw null;
            }
            str2 = "options-menu";
        }
        u6sVarM15765r.m82461q(str2);
        ((qre0) this.f12530c).m73616a(u6sVarM15765r.build());
    }

    /* JADX INFO: renamed from: f */
    public void m24807f() {
        this.f12530c = null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m24808g(int i, gh00 gh00Var) {
        a9i0 a9i0Var;
        q831 q831Var = (q831) this.f12529b;
        Integer numValueOf = Integer.valueOf(R.string.trials_snackbar_message);
        kv91 kv91Var = ((udm) this.f12530c).f229269a;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            a9i0Var = new a9i0(11, kv91Var, new j8g0(2));
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            a9i0Var = new a9i0(11, kv91Var, new j8g0(1));
        }
        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
        na6.m63963k(true, "Invalid resource ID provided: %s", null);
        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
        g631 g631Var = new g631(null, "", numValueOf, null, Integer.valueOf(R.string.trials_snackbar_cta), new dtz(a9i0Var, gh00Var), null, null, false);
        if (!q831Var.m72301f()) {
            return false;
        }
        q831Var.m72305j(g631Var);
        ((kv91) a9i0Var.f13579b).mo57449i(((j8g0) a9i0Var.f13580c).mo24514e(), null);
        return true;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        switch (this.f12528a) {
            case 26:
                return (FrameLayout) this.f12529b;
            default:
                return (CoordinatorLayout) this.f12529b;
        }
    }

    public /* synthetic */ a5j0(Object obj, Object obj2, Object obj3, int i) {
        this.f12528a = i;
        this.f12529b = obj2;
        this.f12530c = obj3;
    }

    public a5j0(xre xreVar) {
        this.f12528a = 19;
        this.f12529b = xreVar;
    }

    public a5j0() {
        this.f12528a = 16;
        zv41 zv41VarM52819d = jag1.m52819d(t4n0.f217050a);
        this.f12529b = zv41VarM52819d;
        this.f12530c = bzf1.m31021m(zv41VarM52819d);
    }

    public a5j0(qre0 qre0Var, voc1 voc1Var) {
        this.f12528a = 8;
        this.f12529b = voc1Var;
        this.f12530c = qre0Var;
    }

    public a5j0(Map map) {
        this.f12528a = 6;
        this.f12529b = map;
        this.f12530c = new bna0("Java nullability annotation states").m29938c(new jt70(this, 6));
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        am81 am81Var = (am81) obj2;
        q0p0 q0p0Var = (q0p0) this.f12529b;
        uo80 uo80Var = q0p0Var.f184049d;
        String str2 = (String) this.f12530c;
        String strM71855a = q0p0.m71855a(q0p0Var);
        wj50.m88279p(str);
        xsj0 xsj0VarM83596g = uo80Var.m83596g(str2);
        om21 om21Var = xsj0VarM83596g instanceof om21 ? (om21) xsj0VarM83596g : null;
        if (om21Var != null) {
            om21Var.mo34581i(strM71855a, str, am81Var);
        }
        return w2a1.f247311a;
    }
}
