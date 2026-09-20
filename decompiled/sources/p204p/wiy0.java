package p204p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import com.spotify.music.R;
import com.spotify.trending.p166v1.TnyLocationSuggestion;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class wiy0 implements rdc1, Function, q2z0, a3c, r1c, BiFunction, vhz, t6l0, w1j0, gk00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251776a;

    /* JADX INFO: renamed from: b */
    public Object f251777b;

    public /* synthetic */ wiy0(Object obj, int i) {
        this.f251776a = i;
        this.f251777b = obj;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: a */
    public float mo39758a(float f, float f2, long j) {
        long j2 = j / 1000000;
        jhz jhzVarM56467a = ((khz) this.f251777b).m56467a(f2);
        long j3 = jhzVarM56467a.f112585c;
        return (Math.signum(jhzVarM56467a.f112583a) * jhzVarM56467a.f112584b * h84.m46826b(j3 > 0 ? j2 / j3 : 1.0f).f66848a) + f;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object obj2;
        switch (this.f251776a) {
            case 1:
                ypy0 ypy0Var = (ypy0) obj;
                List list = ypy0Var.f275093a;
                lh6 lh6Var = (lh6) this.f251777b;
                return new oh6(lh6Var.f133395d, null, ypy0Var.f275094b, !wl51.m88460J0(lh6Var.f133396e), list, ypy0Var.f275095c, 2);
            case 4:
                return xgz0.m90940b((xgz0) this.f251777b, (lcf) obj);
            case 7:
                Object obj3 = (ta0) obj;
                e501 e501Var = (e501) this.f251777b;
                if (!(obj3 instanceof ra0)) {
                    return (CompletableSource) e501Var.f56218a.invoke();
                }
                fpk0 fpk0Var = e501Var.f56220c;
                ra0 ra0Var = (ra0) obj3;
                if (ra0Var instanceof oa0) {
                    obj2 = ((oa0) ra0Var).f163171a;
                } else {
                    if (!(ra0Var instanceof sa0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ((sa0) ra0Var).f207099a;
                }
                return ((Observable) fpk0Var.invoke(obj2)).flatMapCompletable(new d501(e501Var, 0));
            case 8:
                return Single.create(new gjs0((vc01) this.f251777b, 29));
            case 11:
                onq0 onq0Var = onq0.f167317L0;
                cy11 cy11Var = (cy11) this.f251777b;
                return ((g421) obj).f76328c ? ((Single) cy11Var.invoke()).toObservable().doOnNext(new fxc1(27)).flatMap(onq0Var).onErrorReturnItem(y521.f269312a) : ((Single) cy11Var.invoke()).toObservable().compose(new pmk0()).doOnNext(new fxc1(28)).flatMap(onq0Var).onErrorResumeWith(Observable.empty());
            case 19:
                return xq41.m91816a((xq41) this.f251777b, ((aal) obj).f13891a);
            case 23:
                List list2 = (List) obj;
                qy51 qy51Var = (qy51) this.f251777b;
                return Collections.singletonMap(qy51Var.f193825i.f204979a, new ok21(new z2c(list2, !list2.isEmpty(), null, gbu.f78413a, qy51Var.f193821e)));
            default:
                wk0 wk0Var = (wk0) this.f251777b;
                return new FlowableTake(Flowable.m23322h(wk0Var.f252079b, ((rwx0) ((qwx0) wk0Var.f252085h)).f203428a.map(f8r0.f67052S0).onErrorReturnItem(Boolean.TRUE).toFlowable(BackpressureStrategy.f7190d), jbr0.f110849R0).m23331J(qgr0.f188529R0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m88228b(String str, ibk ibkVar) {
        lxy0 lxy0Var;
        if (ibkVar instanceof lxy0) {
            lxy0Var = (lxy0) ibkVar;
            int i = lxy0Var.f137916d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxy0Var.f137916d = i - Integer.MIN_VALUE;
            } else {
                lxy0Var = new lxy0(this, ibkVar);
            }
        } else {
            lxy0Var = new lxy0(this, ibkVar);
        }
        Object objM64461k = lxy0Var.f137914b;
        int i2 = lxy0Var.f137916d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM64461k);
                if (str.length() > 150) {
                    return new fka0(str);
                }
                nha0 nha0Var = (nha0) this.f251777b;
                lxy0Var.f137913a = str;
                lxy0Var.f137916d = 1;
                objM64461k = nha0Var.m64461k(str, lxy0Var);
                yuk yukVar = yuk.f276404a;
                if (objM64461k == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = lxy0Var.f137913a;
                bga.m29073P(objM64461k);
            }
            List list = (List) objM64461k;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(pag1.m69462A((TnyLocationSuggestion) it.next()));
            }
            return new hka0(str, arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new fka0(str);
        }
    }

    @Override // p204p.a3c
    /* JADX INFO: renamed from: c */
    public Observable mo24620c(AbstractC1961i abstractC1961i, ArrayList arrayList) {
        String uri = abstractC1961i.getUri();
        String name = abstractC1961i.getName();
        ya21 ya21Var = (ya21) this.f251777b;
        ((wy3) ya21Var.f270732b).getClass();
        v3o0 v3o0Var = new v3o0(uri, name, System.currentTimeMillis());
        ya21Var.f270738h = s601.m77308k0(v3o0Var, ya21Var.f270738h);
        return m88230s(v3o0Var, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public pj31 m88229e() {
        Object objM23798h = ((BehaviorSubject) this.f251777b).m23798h();
        wj50.m88279p(objM23798h);
        return (pj31) objM23798h;
    }

    @Override // p204p.a3c
    /* JADX INFO: renamed from: f */
    public Observable mo24621f(AbstractC1961i abstractC1961i, ArrayList arrayList, d3c d3cVar) {
        Observable observableJust;
        ec81 ec81Var = (ec81) d3cVar;
        ya21 ya21Var = (ya21) this.f251777b;
        Set set = dd41.f47702f;
        String str = ec81Var.f58261a;
        int iOrdinal = r46.m74726U(str).f47709c.ordinal();
        if (iOrdinal == 30 || iOrdinal == 42) {
            observableJust = Observable.just(ec81Var.m38488k(abstractC1961i, lau.f131415a));
        } else {
            thv0 thv0Var = ya21Var.f270734d;
            Set setM29624m1 = bk5.m29624m1(new String[]{abstractC1961i.getUri(), str});
            List list = ec81Var.f58264d.f278541a;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AbstractC1961i) it.next()).getUri());
            }
            observableJust = ahg1.m25976s(thv0.m80863a(thv0Var, ya21Var.f270737g.f152687d, null, null, g6f.m43736n1(ahg1.m25981x(g6f.m43700N0(ec81Var.f58265e, g6f.m43700N0(arrayList2, arrayList)))), setM29624m1, 6), arrayList).map(new hm11(3, ec81Var, abstractC1961i));
        }
        wj50.m88279p(observableJust);
        return observableJust;
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        return (u1j0) this.f251777b;
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ProgressBar) this.f251777b;
    }

    @Override // p204p.a3c
    /* JADX INFO: renamed from: i */
    public Observable mo24622i(List list, String str, d3c d3cVar) {
        ec81 ec81Var = (ec81) d3cVar;
        ya21 ya21Var = (ya21) this.f251777b;
        thv0 thv0Var = ya21Var.f270734d;
        Set setSingleton = Collections.singleton(ec81Var.f58261a);
        int i = ya21Var.f270737g.f152686c;
        List list2 = ec81Var.f58264d.f278541a;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1961i) it.next()).getUri());
        }
        return ahg1.m25976s(thv0.m80863a(thv0Var, i, str, null, g6f.m43736n1(ahg1.m25981x(g6f.m43700N0(ec81Var.f58265e, arrayList))), setSingleton, 4), list).map(new d501(ec81Var, 6));
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: l */
    public float mo39763l() {
        return 0.0f;
    }

    @Override // p204p.r1c
    /* JADX INFO: renamed from: m */
    public void mo15328m(int i) {
        ((SlateMessageHostActivity) this.f251777b).finish();
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: n */
    public long mo39764n(float f) {
        khz khzVar = (khz) this.f251777b;
        khzVar.getClass();
        float[] fArr = h84.f88615a;
        return ((long) (Math.exp(h84.m46825a(f, khzVar.f122744a * khzVar.f122745b) / (((double) lhz.f133674a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: o */
    public float mo39765o(float f, float f2) {
        khz khzVar = (khz) this.f251777b;
        khzVar.getClass();
        float[] fArr = h84.f88615a;
        float f3 = khzVar.f122744a;
        float f4 = khzVar.f122745b;
        double dM46825a = h84.m46825a(f2, f3 * f4);
        double d = lhz.f133674a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dM46825a) * ((double) (f3 * f4))))) + f;
    }

    @Override // p204p.gk00
    public void onSuccess(Object obj) {
        ((r761) this.f251777b).run();
    }

    @Override // p204p.a3c
    /* JADX INFO: renamed from: p */
    public zzb mo24453p(d3c d3cVar) {
        ec81 ec81Var = (ec81) d3cVar;
        String str = ec81Var.f58261a;
        String string = ec81Var.f58262b;
        ya21 ya21Var = (ya21) this.f251777b;
        Context context = ya21Var.f270733c;
        Set set = dd41.f47702f;
        int iOrdinal = r46.m74726U(str).f47709c.ordinal();
        if (iOrdinal == 30 || iOrdinal == 42) {
            string = context.getString(R.string.assisted_curation_card_title_similar_to_artist_or_album, string);
        } else if (iOrdinal == 925) {
            string = context.getString(R.string.assisted_curation_card_title_similar_to, string);
        }
        wj50.m88279p(string);
        String strM93165n = ya21.m93165n(ya21Var, str);
        s2c s2cVar = ya21Var.f270740j;
        z2c z2cVar = ec81Var.f58264d;
        return new zzb(string, null, null, strM93165n, s2cVar, z2cVar.f278541a, z2cVar.f278542b, new v1c(s2cVar.f204979a, str), ec81Var.f58263c, 12);
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: q */
    public float mo39767q(long j, float f) {
        long j2 = j / 1000000;
        jhz jhzVarM56467a = ((khz) this.f251777b).m56467a(f);
        long j3 = jhzVarM56467a.f112585c;
        return (((Math.signum(jhzVarM56467a.f112583a) * h84.m46826b(j3 > 0 ? j2 / j3 : 1.0f).f66849b) * jhzVarM56467a.f112584b) / j3) * 1000.0f;
    }

    @Override // p204p.a3c
    /* JADX INFO: renamed from: r */
    public Observable mo24454r(String str, List list) {
        ya21 ya21Var = (ya21) this.f251777b;
        if (ya21Var.f270738h.isEmpty()) {
            Observable observableJust = Observable.just(nau.f152117a);
            wj50.m88279p(observableJust);
            return observableJust;
        }
        Set set = ya21Var.f270738h;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(m88230s((v3o0) it.next(), list));
        }
        Observable observableCombineLatest = Observable.combineLatest(arrayList, snq0.f210990N0);
        wj50.m88279p(observableCombineLatest);
        return observableCombineLatest;
    }

    /* JADX INFO: renamed from: s */
    public Observable m88230s(v3o0 v3o0Var, List list) {
        Observable observable;
        Observable observable2;
        net netVar = net.f153101i;
        wow0 wow0Var = wow0.f253602f;
        ya21 ya21Var = (ya21) this.f251777b;
        thv0 thv0Var = ya21Var.f270734d;
        String str = v3o0Var.f236914a;
        int i = ya21Var.f270737g.f152688e;
        thv0Var.getClass();
        Observable observableM25976s = ahg1.m25976s(thv0Var.m80864b(i, "", null, Collections.singleton(str), gbu.f78413a), list);
        r0e1 r0e1Var = ya21Var.f270735e;
        String str2 = v3o0Var.f236914a;
        Set setM43736n1 = g6f.m43736n1(ahg1.m25981x(list));
        r0e1Var.getClass();
        Set set = dd41.f47702f;
        int iOrdinal = r46.m74726U(str2).f47709c.ordinal();
        int i2 = 13;
        if (iOrdinal != 30) {
            observable = iOrdinal != 925 ? Observable.error(new IllegalArgumentException("Unsupported uri ".concat(str2))) : ((t6f0) r0e1Var.f194478b).m80160b(str2).map(uwk.f234687e).flatMap(new fw40(i2, r0e1Var, setM43736n1)).onErrorResumeNext(wow0Var).toObservable();
        } else {
            observable = Single.just(str2).flatMap(new fw40(i2, r0e1Var, setM43736n1)).onErrorResumeNext(wow0Var).toObservable();
        }
        etq etqVar = ya21Var.f270736f;
        Set setM43736n2 = g6f.m43736n1(ahg1.m25981x(list));
        etqVar.getClass();
        int iOrdinal2 = r46.m74726U(str2).f47709c.ordinal();
        int i3 = 25;
        if (iOrdinal2 != 42) {
            observable2 = iOrdinal2 != 925 ? Observable.error(new IllegalArgumentException("Unsupported uri ".concat(str2))) : ((t6f0) etqVar.f62756b).m80160b(str2).map(v450.f237060X).flatMap(new lh51(i3, etqVar, setM43736n2)).onErrorResumeNext(netVar).toObservable();
        } else {
            observable2 = Single.just(str2).flatMap(new lh51(i3, etqVar, setM43736n2)).onErrorResumeNext(netVar).toObservable();
        }
        return Observable.combineLatest(observableM25976s, observable, observable2, new y3z0(i2, ya21Var, v3o0Var));
    }

    /* JADX INFO: renamed from: t */
    public BehaviorSubject m88231t() {
        return (BehaviorSubject) this.f251777b;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[LOOP:0: B:22:0x004b->B:32:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0083 A[EDGE_INSN: B:51:0x0083->B:33:0x0083 BREAK  A[LOOP:0: B:22:0x004b->B:32:0x0080], SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public Object m88232u(omc omcVar, eh00 eh00Var) {
        lh21 lh21Var;
        bqz0 bqz0Var;
        if (((AbstractC1806e9) this.f251777b) == null) {
            lfq0.m58914b("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC1806e9 abstractC1806e9 = (AbstractC1806e9) this.f251777b;
        if ((abstractC1806e9 instanceof lh21) && (bqz0Var = (lh21Var = (lh21) abstractC1806e9).f133351g) != null && !bqz0Var.equals(omcVar)) {
            z8i0 z8i0Var = new z8i0();
            bqz0 bqz0Var2 = lh21Var.f133351g;
            if (bqz0Var2 == null) {
                lfq0.m58914b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            dqi0 dqi0Var = lh21Var.f133349e;
            if (dqi0Var != null) {
                Object[] objArr = dqi0Var.f52019b;
                long[] jArr = dqi0Var.f52018a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    z8i0Var.m95606F1(objArr[(i << 3) + i3], bqz0Var2);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = lh21Var.f133347c;
                wj50.m88279p(obj);
                z8i0Var.m95606F1(obj, bqz0Var2);
            }
            z8i0Var.mo38151I0();
            lh21Var.mo38155T0();
            this.f251777b = z8i0Var;
        }
        AbstractC1806e9 abstractC1806e10 = (AbstractC1806e9) this.f251777b;
        wj50.m88279p(abstractC1806e10);
        oa31 oa31VarMo28828u = ua31.m82674j().mo28828u(abstractC1806e10.mo38181v1(omcVar));
        abstractC1806e10.mo38150H0(omcVar);
        try {
            oa31 oa31VarM66515j = oa31VarMo28828u.m66515j();
            try {
                Object objInvoke = eh00Var.invoke();
                oa31.m66513q(oa31VarM66515j);
                oa31VarMo28828u.mo28814c();
                abstractC1806e10.mo38151I0();
                return objInvoke;
            } catch (Throwable th) {
                oa31.m66513q(oa31VarM66515j);
                throw th;
            }
        } catch (Throwable th2) {
            oa31VarMo28828u.mo28814c();
            throw th2;
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(655);
        xg0 xg0Var = ((SpotifyCheckoutActivity) this.f251777b).f3331Z0;
        if (xg0Var == null) {
            wj50.m88260d0("viewBinding");
            throw null;
        }
        ((CoordinatorLayout) xg0Var.f261149b).setPadding(dx40VarMo51806g.f53848a, dx40VarMo51806g.f53849b, dx40VarMo51806g.f53850c, dx40VarMo51806g.f53851d);
        return swd1.f214649b;
    }

    public wiy0(int i) {
        this.f251776a = i;
        switch (i) {
            case 16:
                this.f251777b = BehaviorSubject.m23796g(new pj31());
                break;
        }
    }

    public wiy0(yqq yqqVar) {
        this.f251776a = 17;
        this.f251777b = new khz(j641.f109221a, yqqVar);
    }

    @Override // p204p.r1c
    /* JADX INFO: renamed from: d */
    public void mo15324d() {
    }

    @Override // p204p.r1c
    /* JADX INFO: renamed from: h */
    public void mo15325h() {
    }

    @Override // p204p.r1c
    /* JADX INFO: renamed from: k */
    public void mo15327k() {
    }

    @Override // p204p.gk00
    public void onFailure(Throwable th) {
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        Collection collectionM43701O0 = (List) obj;
        z331 z331Var = (z331) obj2;
        ((wy3) ((i431) this.f251777b).f98407a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z331Var instanceof w331) {
            collectionM43701O0 = g6f.m43701O0(((w331) z331Var).f247470a, collectionM43701O0);
        } else if (z331Var instanceof y331) {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : collectionM43701O0) {
                if (!wj50.m88271j(((a431) obj3).f12130a, ((y331) z331Var).f268746a)) {
                    arrayList.add(obj3);
                }
            }
            collectionM43701O0 = arrayList;
        } else if (!(z331Var instanceof x331)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : collectionM43701O0) {
            if (((a431) obj4).f12131b + 10000 > jCurrentTimeMillis) {
                arrayList2.add(obj4);
            }
        }
        return arrayList2;
    }

    @Override // p204p.r1c
    /* JADX INFO: renamed from: j */
    public void mo15326j(double d, float f, int i) {
    }
}
