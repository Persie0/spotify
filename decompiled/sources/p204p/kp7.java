package p204p;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.agentstories.p017v1.SendStoryFeedbackRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.WeakHashMap;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class kp7 implements Predicate, Function, knx0, t6l0, yh00, grc, SingleOnSubscribe, a9b, Function3, uwj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125004a;

    /* JADX INFO: renamed from: b */
    public final Object f125005b;

    public /* synthetic */ kp7(Object obj, int i) {
        this.f125004a = i;
        this.f125005b = obj;
    }

    /* JADX INFO: renamed from: d */
    public static final twj m57020d(kp7 kp7Var, o2x0 o2x0Var) {
        return o2x0Var.f161171a.f149852O0 ? swj.f214674a : new rwj(new Exception(s571.m77246e(o2x0Var.f161171a.f149860d, "Failed to submit feedback, status: ")));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    @Override // io.reactivex.rxjava3.functions.Function3
    /* JADX INFO: renamed from: J0 */
    public Object mo23408J0(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object aj11Var;
        boolean z2;
        vaa0 vaa0Var;
        e07 e07Var;
        List list = (List) obj;
        xul0 xul0Var = (xul0) obj2;
        xul0 xul0Var2 = (xul0) obj3;
        api apiVar = (api) xul0Var.mo49283h();
        boolean zMo26697m = apiVar != null ? apiVar.mo26697m() : true;
        boolean z3 = false;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                api apiVar2 = (api) it.next();
                if (apiVar2.mo26691g() && !apiVar2.mo26697m()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        boolean z4 = zMo26697m && z;
        tti ttiVar = (tti) this.f125005b;
        if (ttiVar.f223608T0 != null) {
            y5p y5pVar = (y5p) xul0Var2.mo49283h();
            nzl0 nzl0Var = (y5pVar == null || (vaa0Var = y5pVar.f269498B) == null || (e07Var = vaa0Var.f239170a) == null) ? null : e07Var.f54889d;
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (wj50.m88271j(((api) it2.next()).mo26695k(), ttiVar.f223608T0)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            boolean z5 = xul0Var.mo49279c() && !((api) xul0Var.mo49278b()).mo26697m();
            if (nzl0Var != null && nzl0Var != nzl0.BUILT_IN_SPEAKER) {
                z3 = true;
            }
            if (!z2) {
                aj11Var = new aj11(1);
            } else if (z5 || z3) {
                aj11Var = new aj11(2);
            } else {
                aj11Var = bj11.f27596a;
            }
        } else {
            aj11Var = bj11.f27596a;
        }
        return new pqm0(Boolean.valueOf(z4), aj11Var);
    }

    @Override // p204p.a9b
    /* JADX INFO: renamed from: a */
    public Type mo25103a() {
        return (Type) this.f125005b;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Observable observableEmpty;
        switch (this.f125004a) {
            case 1:
                dd8 dd8Var = (dd8) obj;
                jd8 jd8Var = (jd8) this.f125005b;
                jd8Var.getClass();
                te8 te8Var = dd8Var.f47740a;
                if (!(te8Var instanceof je8) && !(te8Var instanceof se8)) {
                    return Observable.empty();
                }
                String strMo32497a = te8Var.mo32497a();
                hg8 hg8Var = (hg8) dd8Var.f47741b.get(strMo32497a);
                Queue queue = (Queue) dd8Var.f47742c.get(strMo32497a);
                if (hg8Var == null || queue == null) {
                    observableEmpty = Observable.empty();
                } else {
                    List listM43728j1 = g6f.m43728j1(queue);
                    queue.clear();
                    observableEmpty = Observable.fromIterable(listM43728j1).map(new d97(5, jd8Var, hg8Var));
                }
                wj50.m88279p(observableEmpty);
                return observableEmpty;
            case 2:
                YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) obj;
                AbstractC1806e9 abstractC1806e9 = (AbstractC1806e9) this.f125005b;
                wj50.m88279p(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity);
                return abstractC1806e9.mo38152J0(yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity);
            case 3:
                pqm0 pqm0Var = (pqm0) obj;
                String str = (String) pqm0Var.f180350a;
                return ((c99) this.f125005b).m31898a((t6s) pqm0Var.f180351b, str).map(new nch1(str, 3));
            case 5:
                if (!((o2x0) obj).f161171a.f149852O0) {
                    Single singleJust = Single.just(new t4m(3));
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                Single map = vjf1.m85770t(dau.f47107a, new ek9((fk9) this.f125005b, null, 1)).map(e370.f55656Z);
                wj50.m88279p(map);
                return map;
            case 9:
                oza ozaVar = (oza) this.f125005b;
                return new ObservableFromPublisher(ozaVar.f172200a.mo53041b().m23331J(new rc9(ozaVar, 4)));
            case 10:
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) obj;
                messagePresentationStatus.toString();
                Completable completable = (Completable) this.f125005b;
                if (!(messagePresentationStatus instanceof MessagePresentationStatus.Presented)) {
                    completable = CompletableEmpty.f7437a;
                }
                return completable.m23293d(Observable.just(w2a1.f247311a));
            case 13:
                return ftf1.m42621v((ovh0) this.f125005b);
            case 16:
                return (p2x0) this.f125005b;
            case 19:
                u4l0 u4l0Var = ((a1f) this.f125005b).f11398c;
                return g0b1.m43282x((luk) u4l0Var.f226773c, new fio0(u4l0Var, ((q0f) obj).f183990a.f279709a, null, 0));
            case 21:
                chf chfVar = ((odf) this.f125005b).f164181a;
                return chfVar.f38005h.flatMap(new m47(28, chfVar, ((sdf) obj).f208007a)).subscribeOn(chfVar.f37998a).map(p4h1.f173927O0).onErrorReturn(o5h1.f161976O0);
            default:
                otp0 otp0Var = ((oes0) obj).f164526a;
                qal qalVar = (qal) this.f125005b;
                he90 he90Var = (he90) qalVar.f186896b;
                CompletableOnErrorComplete completableOnErrorCompleteM23299p = he90Var.m47294x(otp0Var).m23296h(af8.f15064R0).m23299p(Functions.f7232h);
                String str2 = otp0Var.f170054a;
                String str3 = otp0Var.f170064k;
                ObservableSource observable = completableOnErrorCompleteM23299p.m23294e(Single.just(new kgs0(str2, str3, otp0Var.f170057d, otp0Var.f170058e))).toObservable();
                byte[] bArr = new byte[16];
                w4u0.f247891b.mo41480l().nextBytes(bArr);
                String strM60172a = lx8.m60172a(bArr);
                String strM48121m = ((hp3) he90Var.f90383g).m48121m(strM60172a);
                return Observable.concat(observable, he90Var.m47282l(str3, strM48121m, null).retry(1L).flatMapCompletable(new e6a0(he90Var, otp0Var, strM60172a, strM48121m, 27)).m23294e(Single.defer(new wu2(strM48121m, 1))).doOnError(clr0.f39350N0).doFinally(new ue0(he90Var, otp0Var, strM48121m, 16)).onErrorResumeNext(new rc9(qalVar, 20)).flatMapObservable(new n6i(12, qalVar, otp0Var)).onErrorComplete());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.uwj
    /* JADX INFO: renamed from: b */
    public Object mo26622b(String str, fbk fbkVar) {
        ywj ywjVar;
        if (fbkVar instanceof ywj) {
            ywjVar = (ywj) fbkVar;
            int i = ywjVar.f276976c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ywjVar.f276976c = i - Integer.MIN_VALUE;
            } else {
                ywjVar = new ywj(this, (ibk) fbkVar);
            }
        } else {
            ywjVar = new ywj(this, (ibk) fbkVar);
        }
        Object obj = ywjVar.f276974a;
        int i2 = ywjVar.f276976c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        aa51 aa51Var = (aa51) this.f125005b;
        zrz0 zrz0VarM3021r = SendStoryFeedbackRequest.m3021r();
        zrz0VarM3021r.m96784r(str);
        zrz0VarM3021r.m96783q(bsz0.RATING_LIKE);
        SingleSource map = aa51Var.m25183a((SendStoryFeedbackRequest) zrz0VarM3021r.build()).map(new rc9(this, 19));
        ywjVar.f276976c = 1;
        Object objM96567o = zn91.m96567o(map, ywjVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    @Override // p204p.grc
    /* JADX INFO: renamed from: c */
    public fiz mo45481c(String str) {
        return new hd1(fag1.m41173v((ago) this.f125005b, jtc.f115793w, str), 13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.uwj
    /* JADX INFO: renamed from: e */
    public Object mo57021e(String str, fbk fbkVar) {
        wwj wwjVar;
        if (fbkVar instanceof wwj) {
            wwjVar = (wwj) fbkVar;
            int i = wwjVar.f255780c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wwjVar.f255780c = i - Integer.MIN_VALUE;
            } else {
                wwjVar = new wwj(this, (ibk) fbkVar);
            }
        } else {
            wwjVar = new wwj(this, (ibk) fbkVar);
        }
        Object obj = wwjVar.f255778a;
        int i2 = wwjVar.f255780c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        aa51 aa51Var = (aa51) this.f125005b;
        zrz0 zrz0VarM3021r = SendStoryFeedbackRequest.m3021r();
        zrz0VarM3021r.m96784r(str);
        zrz0VarM3021r.m96783q(bsz0.RATING_UNSPECIFIED);
        SingleSource map = aa51Var.m25183a((SendStoryFeedbackRequest) zrz0VarM3021r.build()).map(new a99(this, 22));
        wwjVar.f255780c = 1;
        Object objM96567o = zn91.m96567o(map, wwjVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.uwj
    /* JADX INFO: renamed from: f */
    public Object mo26623f(gfj0 gfj0Var, fbk fbkVar) {
        xwj xwjVar;
        asz0 asz0Var;
        if (fbkVar instanceof xwj) {
            xwjVar = (xwj) fbkVar;
            int i = xwjVar.f266694c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xwjVar.f266694c = i - Integer.MIN_VALUE;
            } else {
                xwjVar = new xwj(this, (ibk) fbkVar);
            }
        } else {
            xwjVar = new xwj(this, (ibk) fbkVar);
        }
        Object obj = xwjVar.f266692a;
        int i2 = xwjVar.f266694c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        aa51 aa51Var = (aa51) this.f125005b;
        zrz0 zrz0VarM3021r = SendStoryFeedbackRequest.m3021r();
        zrz0VarM3021r.m96784r(gfj0Var.f79367a);
        zrz0VarM3021r.m96783q(bsz0.RATING_DISLIKE);
        ffj0 ffj0Var = gfj0Var.f79369c;
        int i3 = ffj0Var == null ? -1 : vwj.f245503a[ffj0Var.ordinal()];
        if (i3 == 1) {
            asz0Var = asz0.OPTION_INCORRECT;
        } else if (i3 == 2) {
            asz0Var = asz0.OPTION_OFFENSIVE;
        } else if (i3 == 3) {
            asz0Var = asz0.OPTION_BORING;
        } else if (i3 != 4) {
            asz0Var = i3 != 5 ? asz0.OPTION_UNSPECIFIED : asz0.OPTION_OTHER;
        } else {
            asz0Var = asz0.OPTION_OUTDATED;
        }
        zrz0VarM3021r.m96782m(asz0Var);
        String str = gfj0Var.f79368b;
        if (str == null) {
            str = "";
        }
        zrz0VarM3021r.m96785s(str);
        SingleSource map = aa51Var.m25183a((SendStoryFeedbackRequest) zrz0VarM3021r.build()).map(new gd8(this, 23));
        xwjVar.f266694c = 1;
        Object objM96567o = zn91.m96567o(map, xwjVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    @Override // p204p.a9b
    /* JADX INFO: renamed from: g */
    public Object mo25104g(x4l0 x4l0Var) {
        huf hufVar = new huf(x4l0Var);
        x4l0Var.mo52182p(new rc9(hufVar, 15));
        return hufVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public Object m57022h(String str, ibk ibkVar) {
        pma pmaVar;
        int i;
        kp7 kp7Var;
        odj odjVar;
        if (ibkVar instanceof pma) {
            pmaVar = (pma) ibkVar;
            int i2 = pmaVar.f179013g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pmaVar.f179013g = i2 - Integer.MIN_VALUE;
            } else {
                pmaVar = new pma(this, ibkVar);
            }
        } else {
            pmaVar = new pma(this, ibkVar);
        }
        Object objM86941o = pmaVar.f179011e;
        int i3 = pmaVar.f179013g;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(objM86941o);
                w0e1 w0e1Var = (w0e1) this.f125005b;
                pmaVar.f179007a = str;
                pmaVar.f179008b = this;
                i = 0;
                pmaVar.f179010d = 0;
                pmaVar.f179013g = 1;
                objM86941o = w0e1Var.m86941o(str, pmaVar);
                if (objM86941o != yukVar) {
                    kp7Var = this;
                }
                return yukVar;
            }
            if (i3 == 1) {
                int i4 = pmaVar.f179010d;
                kp7 kp7Var2 = pmaVar.f179008b;
                String str2 = pmaVar.f179007a;
                bga.m29073P(objM86941o);
                i = i4;
                str = str2;
                kp7Var = kp7Var2;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                odjVar = pmaVar.f179009c;
                bga.m29073P(objM86941o);
            }
            return new ldj(odjVar.f164195a, (List) ((p2x0) objM86941o).m68971d(), odjVar.f164197c);
            odj odjVar2 = (odj) ((p2x0) objM86941o).m68971d();
            ArrayList arrayList = odjVar2.f164196b;
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((niq0) it.next()).f154311b);
            }
            if (arrayList2.isEmpty()) {
                throw new IOException("No sections found for uri: " + str);
            }
            w0e1 w0e1Var2 = (w0e1) kp7Var.f125005b;
            wna wnaVar = odjVar2.f164198d;
            pmaVar.f179007a = null;
            pmaVar.f179008b = null;
            pmaVar.f179009c = odjVar2;
            pmaVar.f179010d = i;
            pmaVar.f179013g = 2;
            Object objM86942p = w0e1Var2.m86942p(arrayList2, wnaVar, pmaVar);
            if (objM86942p != yukVar) {
                objM86941o = objM86942p;
                odjVar = odjVar2;
                return new ldj(odjVar.f164195a, (List) ((p2x0) objM86941o).m68971d(), odjVar.f164197c);
            }
            return yukVar;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    @Override // p204p.knx0
    /* JADX INFO: renamed from: i */
    public Intent mo28051i(Intent intent) {
        return o12.m66041c((o12) this.f125005b, intent, false);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        lxe lxeVar = (lxe) this.f125005b;
        rb40 rb40Var = lxeVar.f137796b;
        boolean z = lxeVar.f137801g;
        skp skpVar = zb40.f281236a;
        rb40Var.m75138b().m43631a(zb40.f281241f, Boolean.valueOf(z));
        rb40Var.f197445e = new gxe(singleEmitter);
        rb40Var.f197444d = new hxe(singleEmitter);
        lxeVar.f137798d = ((hvu0) lxeVar.f137795a).m48896a(rb40Var.m75137a());
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        vq7 vq7Var = ((wq7) obj).f253937a;
        return vq7Var == null || wj50.m88271j(vq7Var.f243884a, ((vq7) this.f125005b).f243884a);
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        int i = this.f125004a;
        Object obj = this.f125005b;
        switch (i) {
            case 7:
                wba wbaVar = (wba) obj;
                vba vbaVar = wbaVar.f249720Z;
                if (vbaVar != null) {
                    wbaVar.f249721f.m1570D(vbaVar);
                }
                vba vbaVar2 = new vba(wbaVar.f249724i, swd1Var);
                wbaVar.f249720Z = vbaVar2;
                wbaVar.f249721f.m1590t(vbaVar2);
                break;
            default:
                pwd1 pwd1Var = swd1Var.f214650a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.f752O0, swd1Var)) {
                    coordinatorLayout.f752O0 = swd1Var;
                    boolean z = swd1Var.m79540d() > 0;
                    coordinatorLayout.f753P0 = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!pwd1Var.mo54434o()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = coordinatorLayout.getChildAt(i2);
                            WeakHashMap weakHashMap = mec1.f142677a;
                            if (!childAt.getFitsSystemWindows() || ((hqk) childAt.getLayoutParams()).f94198a == null || !pwd1Var.mo54434o()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
        }
        return swd1Var;
    }

    public kp7(String str, chb chbVar, Completable completable) {
        this.f125004a = 10;
        this.f125005b = completable;
    }

    public kp7(Flowable flowable, ulp ulpVar) {
        this.f125004a = 26;
        d0k[] d0kVarArr = bmu0.f28619a;
        this.f125005b = mvl0.m62953p(new zux(new onc(flowable), k0e1.m54985d(ulpVar.f231607f), new u8k(3, 0, null), 1));
    }

    public kp7(t96 t96Var) {
        this.f125004a = 20;
        this.f125005b = t96Var;
        t96Var.f248361a = this;
    }

    public kp7(Context context) {
        Object fybVar;
        this.f125004a = 12;
        Objects.requireNonNull(context);
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            fybVar = new f78();
        } else {
            fybVar = new fyb(context);
        }
        this.f125005b = fybVar;
    }
}
