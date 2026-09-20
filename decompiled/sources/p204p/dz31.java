package p204p;

import android.content.Intent;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerState;
import com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass$StreamStartResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.observables.GroupedObservable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class dz31 implements Function, h741, ant, gk00, pqa0, BiFunction, dn6, nvt0, Function3, InterfaceC2207oa, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54515a;

    /* JADX INFO: renamed from: b */
    public final Object f54516b;

    public /* synthetic */ dz31(Object obj, int i) {
        this.f54515a = i;
        this.f54516b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        return new y9c1(((Boolean) obj).booleanValue(), (fv51) ((Optional) obj2).orElse(null), ((mw51) ((tr5) this.f54516b).f222974f).f147718c, ((Boolean) obj3).booleanValue());
    }

    /* JADX INFO: renamed from: a */
    public boolean m37397a(kse0 kse0Var, kse0 kse0Var2) {
        return !bk5.m29621l0((pte0[]) this.f54516b, kse0Var.f125937a) || m3h1.m60680p(kse0Var.f125938b, kse0Var2.f125938b);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((mwt0) this.f54516b).f147883b;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        ks30 ks30VarMo51484c;
        List list;
        switch (this.f54515a) {
            case 0:
                Float f = (Float) obj;
                Float f2 = (Float) this.f54516b;
                if (f.floatValue() <= 0.0f) {
                    return zy31.f287482a;
                }
                return new az31(q3d0.m72083N(f2.floatValue() * f.floatValue()), f2.floatValue() > 1.0f ? 1 : 2);
            case 3:
                u4l0 u4l0Var = (u4l0) this.f54516b;
                return new MaybeIgnoreElementCompletable(new FlowableSingleMaybe(((k7p0) u4l0Var.f226773c).m55694a((gb80) u4l0Var.f226772b).m77807a().mo48412a(new u7p0("listening-parties", true)).filter(ykq0.f273794R0).m23369g(zkq0.f283810Q0).m23375n().m23337R(3L, Functions.f7232h))).m23307y();
            case 6:
                StreamStartResponseOuterClass$StreamStartResponse streamStartResponseOuterClass$StreamStartResponse = (StreamStartResponseOuterClass$StreamStartResponse) obj;
                ij51 ij51Var = (ij51) this.f54516b;
                ij51Var.f102703N0 = streamStartResponseOuterClass$StreamStartResponse.m21695o();
                ij51Var.m50777V(streamStartResponseOuterClass$StreamStartResponse.m21694n(), 1);
                return CompletableEmpty.f7437a;
            case 8:
                ok21 ok21Var = (ok21) this.f54516b;
                return ok21.m67128j(ok21Var, ok21Var.f166257a.m95183k((List) obj), null, 6);
            case 11:
                return ((jw20) ((gq71) this.f54516b).f83381b.f120692b).m54399a().firstOrError().map(laz.f131466d).toObservable();
            case 13:
                nt30 nt30Var = (nt30) obj;
                ArrayList arrayListM79978f = new t36((i97) ((y421) this.f54516b).f269062b, 13).m79978f(nt30Var.body());
                return (arrayListM79978f == null || (ks30VarMo51484c = nt30Var.toBuilder().mo51483b(arrayListM79978f).mo51484c()) == null) ? nt30Var : ks30VarMo51484c;
            case 18:
                return Observable.fromAction(new yf41(8, (csr0) this.f54516b, (oj6) obj));
            case 19:
                gqx gqxVar = (gqx) obj;
                ArrayList arrayList = ((fmt0) this.f54516b).f71120c;
                int iM31820L = c95.m31820L(i6f.m49804T(arrayList, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : arrayList) {
                    daj dajVar = (daj) gqxVar.mo45449a(daj.class, (String) obj2).f72301b;
                    linkedHashMap.put(obj2, Boolean.valueOf((dajVar == null || (list = dajVar.f47053d) == null) ? false : list.contains(baj.f25220c)));
                }
                return new hot0(linkedHashMap);
            default:
                GroupedObservable groupedObservable = (GroupedObservable) obj;
                Observable<T> observableDistinctUntilChanged = groupedObservable.distinctUntilChanged();
                qal qalVar = (qal) this.f54516b;
                return observableDistinctUntilChanged.debounce(((b64) ((i4t0) qalVar.f186899e).get()).m28261e(), TimeUnit.MILLISECONDS, (Scheduler) qalVar.f186897c).concatMap(new vaa1(qalVar, 0)).takeUntil(((PublishSubject) qalVar.f186898d).filter(new b741(groupedObservable, 19)));
        }
    }

    @Override // p204p.nvt0
    /* JADX INFO: renamed from: b */
    public String mo28348b(int i) {
        return ((b741) ((be41) this.f54516b).f26281d).mo28348b(i);
    }

    @Override // p204p.h741
    /* JADX INFO: renamed from: c */
    public Iterator mo37398c(i741 i741Var, CharSequence charSequence) {
        return new f741(this, i741Var, charSequence, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: d */
    public Object m37399d(ibk ibkVar) {
        qt51 qt51Var;
        if (ibkVar instanceof qt51) {
            qt51Var = (qt51) ibkVar;
            int i = qt51Var.f192301c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qt51Var.f192301c = i - Integer.MIN_VALUE;
            } else {
                qt51Var = new qt51(this, ibkVar);
            }
        } else {
            qt51Var = new qt51(this, ibkVar);
        }
        Object objM76367a = qt51Var.f192299a;
        int i2 = qt51Var.f192301c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76367a);
                rt51 rt51Var = (rt51) this.f54516b;
                qt51Var.f192301c = 1;
                objM76367a = rt51Var.m76367a(qt51Var);
                yuk yukVar = yuk.f276404a;
                if (objM76367a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76367a);
            }
            n2x0 n2x0Var = ((o2x0) objM76367a).f161171a;
            if (n2x0Var.f149852O0) {
                return w2a1.f247311a;
            }
            String str = "Failed to confirm subscription cancellation. HTTP " + n2x0Var.f149860d + ": " + n2x0Var.f149859c;
            Logger.m3966b("SubscriptionCancellationConfirmationUseCase", str);
            return new c6x0(new Exception(str));
        } catch (Exception e) {
            Logger.m3966b("SubscriptionCancellationConfirmationUseCase", "Error confirming subscription cancellation", e);
            return new c6x0(e);
        }
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: e */
    public void mo37400e(String str, String str2) {
        ((ky61) this.f54516b).mo53808b(h15.m46399f('B', str, str2, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m37401f(ibk ibkVar) {
        qy71 qy71Var;
        if (ibkVar instanceof qy71) {
            qy71Var = (qy71) ibkVar;
            int i = qy71Var.f193849c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy71Var.f193849c = i - Integer.MIN_VALUE;
            } else {
                qy71Var = new qy71(this, ibkVar);
            }
        } else {
            qy71Var = new qy71(this, ibkVar);
        }
        Object objM86756u = qy71Var.f193847a;
        int i2 = qy71Var.f193849c;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM86756u);
            zv41 zv41Var = (zv41) this.f54516b;
            ro01 ro01Var = new ro01(2, 17, fbkVar);
            qy71Var.f193849c = 1;
            objM86756u = vyf1.m86756u(zv41Var, ro01Var, qy71Var);
            yuk yukVar = yuk.f276404a;
            if (objM86756u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86756u);
        }
        od91 od91Var = (od91) objM86756u;
        ld91 ld91Var = od91Var instanceof ld91 ? (ld91) od91Var : null;
        if (ld91Var != null) {
            return ld91Var.f132104a;
        }
        return null;
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        int i = this.f54515a;
        Object obj = this.f54516b;
        switch (i) {
            case 15:
                Set set = dd41.f47702f;
                dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
                en81 en81Var = (en81) obj;
                return en81Var.m39477c(dd41VarM74726U).flatMap(new wh51(8, en81Var, dd41VarM74726U));
            default:
                return ((rwx0) ((aya1) obj).f21178a.f116561a).f203428a.map(m1y.f139157f).distinctUntilChanged().firstOrError().map(oqq0.f168351V0).onErrorReturn(pqq0.f180376V0);
        }
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: k */
    public void mo37402k(String str, String str2, Throwable th) {
        ((ky61) this.f54516b).mo53808b(h15.m46399f('B', str, str2, th));
    }

    @Override // p204p.gk00
    public void onFailure(Throwable th) {
        vg61 vg61Var;
        vg61 vg61Var2 = (vg61) this.f54516b;
        synchronized (vg61Var2.f241149a) {
            try {
                List list = vg61Var2.f241159k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((mjq) it.next()).m61984b();
                    }
                    vg61Var2.f241159k = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        vg61Var2.f241169u.m33891c();
        ik40 ik40Var = vg61Var2.f241150b;
        Iterator it2 = ik40Var.m50922y().iterator();
        while (it2.hasNext() && (vg61Var = (vg61) it2.next()) != vg61Var2) {
            synchronized (vg61Var.f241149a) {
                try {
                    List list2 = vg61Var.f241159k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((mjq) it3.next()).m61984b();
                        }
                        vg61Var.f241159k = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            vg61Var.f241169u.m33891c();
        }
        synchronized (ik40Var.f103007c) {
            ((LinkedHashSet) ik40Var.f103010f).remove(vg61Var2);
        }
    }

    @Override // p204p.gk00
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f54515a) {
            case 4:
                ((Consumer) this.f54516b).accept((tb51) obj);
                return;
            case 5:
                ((y951) ((pi6) this.f54516b).f177836d).m93148a(((Boolean) obj).booleanValue() ? ua51.f228387a : ab51.f14012a);
                return;
            case 16:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hv81 hv81Var = (hv81) this.f54516b;
                hv81Var.f95631i.setEnabled(zBooleanValue);
                hv81Var.f95621Y.setEnabled(zBooleanValue);
                hv81Var.f95630h.setEnabled(zBooleanValue);
                return;
            default:
                ppb1 ppb1Var = (ppb1) obj;
                aqb1 aqb1Var = (aqb1) this.f54516b;
                if (ppb1Var == null) {
                    aqb1Var.getClass();
                    return;
                }
                CardView cardView = (CardView) aqb1Var.f18183g.f286305h;
                ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = ppb1Var.f180004a;
                layoutParams.height = ppb1Var.f180005b;
                cardView.setLayoutParams(layoutParams);
                return;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().mo49283h();
        return wj50.m88271j(contextTrack != null ? contextTrack.uri() : null, ((kkf) this.f54516b).f123591a);
    }

    public dz31(slq slqVar) {
        this.f54515a = 12;
        this.f54516b = jag1.m52819d(nd91.f152720a);
        ((jph0) ((qgy0) slqVar.get())).m53953f(new tb61(this, 19), new a061(this, 21));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Set] */
    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        ContextTrack contextTrack;
        ContextTrack contextTrack2;
        boolean z;
        switch (this.f54515a) {
            case 14:
                return new CompletableFromAction(new ue0((ik81) this.f54516b, (String) obj, (am81) obj2, 26));
            case 24:
                q5c1 q5c1Var = (q5c1) obj;
                PlayerState playerState = (PlayerState) obj2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                s5p s5pVar = (s5p) ((voi) this.f54516b);
                api apiVarM77296c = s5pVar.m77296c();
                boolean z2 = false;
                boolean z3 = (apiVarM77296c == null || apiVarM77296c.mo26697m()) ? false : true;
                if (z3 && (contextTrack2 = (ContextTrack) playerState.track().mo49283h()) != null && !e72.m37994a0(contextTrack2)) {
                    z2 = true;
                }
                if (z2 && (contextTrack = (ContextTrack) playerState.track().mo49283h()) != null && hc1.m47085n(contextTrack, true)) {
                    api apiVarM77296c2 = s5pVar.m77296c();
                    String name = apiVarM77296c2 != null ? apiVarM77296c2.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    String strMo26689e = apiVarM77296c2 != null ? apiVarM77296c2.mo26689e() : null;
                    linkedHashSet.add(new cc50(name, strMo26689e != null ? strMo26689e : ""));
                }
                if ((!z3 || z2) && (q5c1Var instanceof o5c1) && ((o5c1) q5c1Var).f161943a.contains(dtb1.f52760b)) {
                    linkedHashSet.add(bc50.f25780b);
                }
                return g6f.m43736n1(linkedHashSet);
            default:
                pe01 pe01Var = (pe01) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                api apiVarM77296c3 = ((s5p) ((bsc1) this.f54516b).f30290a).m77296c();
                if (apiVarM77296c3 != null ? apiVarM77296c3.mo26697m() : true) {
                    z = (pe01Var.f176584a || ((PlaybackQuality) playerState2.playbackQuality().mo49278b()).bitrateLevel() == BitrateLevel.LOW) ? false : true;
                }
                return Boolean.valueOf(z);
        }
    }
}
