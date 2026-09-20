package p204p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Size;
import android.view.Surface;
import android.view.ViewGroup;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class zb70 implements du31, Function, ObservableOnSubscribe, pc81, zmm0, SingleTransformer, BiFunction, InterfaceC2207oa, nb40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f281272a;

    /* JADX INFO: renamed from: b */
    public final Object f281273b;

    public /* synthetic */ zb70(Object obj, int i) {
        this.f281272a = i;
        this.f281273b = obj;
    }

    /* JADX INFO: renamed from: j */
    public static u601 m95825j(ua40 ua40Var) {
        Object obj = null;
        if (ua40Var == null) {
            return null;
        }
        return new u601(ua40Var, new Size(ua40Var.mo60749d(), ua40Var.mo60748b()), new deb(new r27(obj, ua40Var.mo60750i1().getTimestamp(), fs61.f72777b)));
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    /* JADX INFO: renamed from: V */
    public Single mo23389V(Single single) {
        fcc0 fcc0Var = (fcc0) this.f281273b;
        whp whpVar = fcc0Var.f68057d;
        return ((kbj0) whpVar.f251419b).m55945a().doOnSuccess(new sup(whpVar, 2)).ignoreElement().m23294e(single).flatMap(new w090(fcc0Var, 10));
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: a */
    public ua40 mo26025a() {
        return m95825j(((C1668ai) this.f281273b).mo26025a());
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        mi80 mi80Var = (mi80) this.f281273b;
        String str = ((ihi) obj).f102294a;
        mi80Var.getClass();
        if (!str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str.equals("spotify:collection:tracks") && !str.equals("spotify:internal:collection:tracks") && (!bm51.m29803n0(str, "spotify:user:", false) || !bm51.m29796g0(str, ":collection", false))) {
            Set set = dd41.f47702f;
            dd41 dd41VarM74726U = r46.m74726U(str);
            he41 he41Var = dd41VarM74726U.f47710d;
            if (!wj50.m88271j(he41Var != null ? he41Var.getType() : null, avp0.f20242e)) {
                if (rwe0.f203333a[dd41VarM74726U.f47709c.ordinal()] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f281272a) {
            case 2:
                return ((n680) this.f281273b).f150736a.mo53041b().m23361z(PlayerState.EMPTY);
            case 8:
                return vjf1.m85770t(dau.f47107a, new q950((ai1) this.f281273b, null, 27)).onErrorReturn(wyx.f256382Y);
            case 12:
                wmb0 wmb0Var = (wmb0) this.f281273b;
                mv31 mv31Var = (mv31) ((hv31) wmb0Var.f252772c.getValue());
                return k0e1.m54988g(mxg1.m63112w(mv31Var.m62893n(), mv31Var, ijb0.m50786a(), jc31.f110955Q0), dau.f47107a).map(q2z.f184729L0).startWithItem(Float.valueOf(((hv31) wmb0Var.f252772c.getValue()).mo48708c(ijb0.m50786a(), 1.0f))).distinctUntilChanged().map(r2z.f195260L0).distinctUntilChanged();
            case 14:
                doc0 doc0Var = (doc0) this.f281273b;
                return vjf1.m85770t(doc0Var.f51010a, new cj40(doc0Var, null, 9));
            case 15:
                String strM47210B = hdi.m47210B((PlayerState) obj);
                if (strM47210B.length() > 0) {
                    ((ppc) ((u4i) this.f281273b).f226727f).f180006a.mo46962a(new opc(strM47210B));
                }
                return CompletableEmpty.f7437a;
            case 18:
                return (ObservableSource) ((n2d0) this.f281273b).invoke(obj);
            case 20:
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(new pqm0(Boolean.FALSE, 0L));
                }
                ka2 ka2Var = (ka2) this.f281273b;
                return ((ObservableFromPublisher) ka2Var.f120759f).map(new w090(ka2Var, 16));
            case 23:
                euh0 euh0Var = (euh0) obj;
                FlowableJust flowableJustM23313I = Flowable.m23313I(euh0Var.f62982a);
                long j = euh0Var.f62983b == 0 ? 0L : 100L;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return flowableJustM23313I.m23354r(j, (Scheduler) ((guh0) this.f281273b).f84477a);
            case 24:
                return ((Boolean) obj).booleanValue() ? ((xci0) this.f281273b).f260234b.m23331J(kaz.f120984O0) : Flowable.m23313I(new vci0(false, new am81(0L, 0L)));
            case 26:
                if (((Long) obj).longValue() >= 0) {
                    return CompletableEmpty.f7437a;
                }
                kbj0 kbj0Var = (kbj0) ((d2j0) this.f281273b).f44572b;
                return kbj0Var.m55946b().flatMapCompletable(new mj70(kbj0Var, 28));
            default:
                kcj0 kcj0Var = (kcj0) this.f281273b;
                return kcj0Var.m56068G().doOnSuccess(new qbj0(kcj0Var, 1)).flatMapObservable(new w090((Boolean) obj, 23));
        }
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: b */
    public int mo26026b() {
        return ((C1668ai) this.f281273b).mo26026b();
    }

    @Override // p204p.zmm0
    /* JADX INFO: renamed from: c */
    public Observable mo24811c() {
        lta0 lta0Var = ((LoginActivity) this.f281273b).f5326i1;
        if (lta0Var != null) {
            return lta0Var.f136734a.distinctUntilChanged();
        }
        wj50.m88260d0("loginActivityNavigationDelegate");
        throw null;
    }

    @Override // p204p.nb40
    public void close() {
        ((C1668ai) this.f281273b).close();
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: d */
    public int mo26027d() {
        return ((C1668ai) this.f281273b).mo26027d();
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: e */
    public int mo26028e() {
        return ((C1668ai) this.f281273b).mo26028e();
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: f */
    public void mo26029f() {
        ((C1668ai) this.f281273b).mo26029f();
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: g */
    public void mo26030g(mb40 mb40Var, Executor executor) {
        ((C1668ai) this.f281273b).mo26030g(new us30(25, this, mb40Var), executor);
    }

    @Override // p204p.nb40
    public Surface getSurface() {
        return ((C1668ai) this.f281273b).getSurface();
    }

    /* JADX INFO: renamed from: i */
    public ago m95826i() {
        ojo ojoVar = ago.f15436t;
        return g9g1.m44033i((opx) this.f281273b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public Object m95827k(String str, ibk ibkVar) {
        lz90 lz90Var;
        if (ibkVar instanceof lz90) {
            lz90Var = (lz90) ibkVar;
            int i = lz90Var.f138294c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lz90Var.f138294c = i - Integer.MIN_VALUE;
            } else {
                lz90Var = new lz90(this, ibkVar);
            }
        } else {
            lz90Var = new lz90(this, ibkVar);
        }
        Object objM59788b = lz90Var.f138292a;
        int i2 = lz90Var.f138294c;
        if (i2 == 0) {
            bga.m29073P(objM59788b);
            lr9 lr9Var = (lr9) this.f281273b;
            lz90Var.f138294c = 1;
            objM59788b = lr9Var.m59788b(str, lz90Var);
            yuk yukVar = yuk.f276404a;
            if (objM59788b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM59788b);
        }
        vr9 vr9Var = (vr9) objM59788b;
        ArrayList arrayList = vr9Var.f244113d;
        ArrayList<tr9> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof tr9) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
        for (tr9 tr9Var : arrayList2) {
            arrayList3.add(new z0c0(UUID.randomUUID().toString(), tr9Var.f223010b, tr9Var.f223011c, tr9Var.f223012d, true, false, false));
        }
        ArrayList arrayList4 = vr9Var.f244113d;
        ArrayList<ur9> arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (obj2 instanceof ur9) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(i6f.m49804T(arrayList5, 10));
        for (ur9 ur9Var : arrayList5) {
            arrayList6.add(new h3c0(UUID.randomUUID().toString(), ur9Var.f233278b, ur9Var.f233279c, ur9Var.f233280d, ur9Var.f233282f, ur9Var.f233281e, ur9Var.f233283g, ur9Var.f233284h, true, ur9Var.f233285i, false, false));
        }
        return new kz90(vr9Var.f244110a, arrayList3, arrayList6);
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: l */
    public int mo26035l() {
        return ((C1668ai) this.f281273b).mo26035l();
    }

    /* JADX INFO: renamed from: m */
    public boolean m95828m(int i) {
        if (i < 0) {
            return false;
        }
        zk1 zk1Var = (zk1) this.f281273b;
        if (i >= zk1Var.f283580c) {
            return false;
        }
        kj50 kj50VarM96290r = zk1Var.m96290r(i);
        gh00 gh00Var = ((zx70) kj50VarM96290r.f123249c).f287232c;
        return gh00Var != null && gh00Var.invoke(Integer.valueOf(i - kj50VarM96290r.f123247a)) == jbr0.f110847P0;
    }

    /* JADX INFO: renamed from: n */
    public xfh0 m95829n() {
        return new xfh0((st91) this.f281273b);
    }

    /* JADX INFO: renamed from: o */
    public void m95830o(String str, Bitmap bitmap) {
        uj5 uj5Var = MediaMetadataCompat.f11c;
        if (uj5Var.containsKey(str) && ((Integer) uj5Var.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(s571.m77251j("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f281273b).putParcelable(str, bitmap);
    }

    @Override // p204p.nb40
    /* JADX INFO: renamed from: p */
    public ua40 mo26039p() {
        return m95825j(((C1668ai) this.f281273b).mo26039p());
    }

    /* JADX INFO: renamed from: q */
    public void m95831q(long j, String str) {
        uj5 uj5Var = MediaMetadataCompat.f11c;
        if (uj5Var.containsKey(str) && ((Integer) uj5Var.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(s571.m77251j("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f281273b).putLong(str, j);
    }

    /* JADX INFO: renamed from: r */
    public void m95832r(String str, String str2) {
        uj5 uj5Var = MediaMetadataCompat.f11c;
        if (uj5Var.containsKey(str) && ((Integer) uj5Var.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(s571.m77251j("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f281273b).putCharSequence(str, str2);
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        gb80 gb80Var = (gb80) this.f281273b;
        ib80 ib80Var = new ib80(observableEmitter, gb80Var, 1);
        observableEmitter.onNext(gb80Var.mo31987b());
        gb80Var.mo31986a(ib80Var);
        observableEmitter.setCancellable(new gr5(9, gb80Var, ib80Var));
    }

    public String toString() {
        switch (this.f281272a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                st70 st70Var = (st70) this.f281273b;
                sb.append(st70Var);
                sb.append(": ");
                yma0 yma0Var = st70Var.f213836t;
                qr60 qr60Var = st70.f213830L0[0];
                sb.append(((Map) yma0Var.invoke()).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p204p.pc81
    /* JADX INFO: renamed from: u */
    public lkv0 mo45105u(ViewGroup viewGroup, Object obj, t9p0 t9p0Var, gxj0 gxj0Var) {
        return new qr90(viewGroup, (e940) ((oyz) ((mr90) this.f281273b).f146454b).f171916b);
    }

    public zb70(lb5 lb5Var, yib0 yib0Var) {
        this.f281272a = 11;
        this.f281273b = yib0Var;
    }

    public zb70(lr9 lr9Var, ri5 ri5Var) {
        this.f281272a = 7;
        this.f281273b = lr9Var;
    }

    public zb70(ni00 ni00Var, Flowable flowable, w6n0 w6n0Var, uqw uqwVar, gb80 gb80Var, k7p0 k7p0Var, jdp0 jdp0Var, y9w0 y9w0Var, qre0 qre0Var) {
        this.f281272a = 5;
        this.f281273b = y9w0Var;
    }

    public zb70(int i) {
        this.f281272a = i;
        switch (i) {
            case 21:
                this.f281273b = new zm8(5);
                break;
            default:
                this.f281273b = new Bundle();
                break;
        }
    }

    public zb70(MediaMetadataCompat mediaMetadataCompat) {
        this.f281272a = 16;
        Bundle bundle = new Bundle(mediaMetadataCompat.f12a);
        this.f281273b = bundle;
        ood0.m67479k(bundle);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        jps jpsVar = (jps) obj;
        ard0 ard0Var = (ard0) obj2;
        prd0 prd0Var = (prd0) this.f281273b;
        if (jpsVar.mo48181c()) {
            String string = prd0Var.f180560e.getString(jpsVar.mo48179a(), Integer.valueOf(jpsVar.mo48180b()));
            if (jpsVar == hps.f93842i) {
                return ard0.m26932a(ard0Var, string, 16335);
            }
            return ard0.m26932a(ard0Var, string, 16351);
        }
        Resources resources = prd0Var.f180560e;
        int i = 5;
        if (jpsVar != hps.f93837d && jpsVar != hps.f93836c) {
            if (jpsVar == hps.f93838e) {
                return prd0Var.f180558c.m81789L();
            }
            int i2 = 0;
            return new ard0(i, 0L, 0.0f, null, aew.f14970a, resources.getString(jpsVar.mo48179a(), Integer.valueOf(jpsVar.mo48180b())), i2, null, null, 0L, null, null, null, false, 16334);
        }
        int i3 = 0;
        return new ard0(i, 0L, 0.0f, null, aew.f14974e, resources.getString(jpsVar.mo48179a(), Integer.valueOf(jpsVar.mo48180b())), i3, null, null, 0L, null, null, null, false, 16334);
    }
}
