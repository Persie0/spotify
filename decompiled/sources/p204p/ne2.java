package p204p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import io.reactivex.rxjava3.core.FlowableEmitter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class ne2 implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152904a;

    /* JADX INFO: renamed from: b */
    public final Object f152905b;

    public /* synthetic */ ne2(Object obj, int i) {
        this.f152904a = i;
        this.f152905b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v72, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r10v74, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r10v76, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        int iNextIndex;
        View view;
        x811 x811Var;
        int i = this.f152904a;
        fb80 fb80Var = fb80.f67750a;
        int i2 = 1;
        ?? r7 = 0;
        Object obj = null;
        Object obj2 = this.f152905b;
        switch (i) {
            case 0:
                if (ta80Var == ta80.ON_RESUME) {
                    ((gh00) obj2).invoke(og2.f164979a);
                    return;
                }
                return;
            case 1:
                brb brbVar = (brb) obj2;
                VideoSurfaceView videoSurfaceView = brbVar.f30052b1;
                lwr lwrVar = brbVar.f30049Y0;
                if (ta80Var == ta80.ON_RESUME) {
                    lwrVar.m60127a(brbVar.f30045U0.subscribe(new zqb(brbVar, i2)));
                    return;
                }
                if (ta80Var == ta80.ON_PAUSE) {
                    lwrVar.m60129c();
                    pa9 pa9Var = brbVar.f30055e1;
                    if (pa9Var != null) {
                        pa9Var.m69441f();
                    }
                    videoSurfaceView.setVisibility(8);
                    brbVar.f30051a1.setVisibility(8);
                    brbVar.f30053c1.setVisibility(8);
                    pa9 pa9Var2 = brbVar.f30055e1;
                    if (pa9Var2 != null) {
                        pa9Var2.m69444i();
                    }
                    pa9 pa9Var3 = brbVar.f30055e1;
                    if (pa9Var3 != null) {
                        pa9Var3.m69446k(videoSurfaceView);
                    }
                    brbVar.f30055e1 = null;
                    return;
                }
                return;
            case 2:
                cwf cwfVar = (cwf) obj2;
                if (cwfVar.f42741e == null) {
                    xvf xvfVar = (xvf) cwfVar.getLastNonConfigurationInstance();
                    if (xvfVar != null) {
                        cwfVar.f42741e = xvfVar.f266380a;
                    }
                    if (cwfVar.f42741e == null) {
                        cwfVar.f42741e = new hjc1();
                    }
                }
                cwfVar.f31643a.mo31988d(this);
                return;
            case 3:
                new HashMap();
                b110[] b110VarArr = (b110[]) obj2;
                if (b110VarArr.length > 0) {
                    b110 b110Var = b110VarArr[0];
                    throw null;
                }
                if (b110VarArr.length <= 0) {
                    return;
                }
                b110 b110Var2 = b110VarArr[0];
                throw null;
            case 4:
                fxi fxiVar = (fxi) obj2;
                oc80 oc80Var = fxiVar.f74381d;
                if (oc80Var.f163857d == fb80Var) {
                    return;
                }
                if (ta80Var.m80335a().compareTo(oc80Var.f163857d) >= 0 || ta80Var.m80335a().m41223a(fb80.f67753d)) {
                    oc80Var.m66676g(ta80Var);
                    return;
                } else {
                    fxiVar.f74380c.post(new eph(fxiVar, i2));
                    return;
                }
            case 5:
                a6j a6jVar = (a6j) obj2;
                fb80 fb80VarMo31987b = a6jVar.f12808a.mo31987b();
                fb80 fb80VarMo31987b2 = a6jVar.f12809b.mo31987b();
                oc80 oc80Var2 = a6jVar.f12810c;
                if (oc80Var2.f163857d == fb80Var) {
                    return;
                }
                if (fb80VarMo31987b.compareTo(fb80VarMo31987b2) >= 0) {
                    fb80VarMo31987b = fb80VarMo31987b2;
                }
                oc80Var2.m66678i(fb80VarMo31987b);
                return;
            case 6:
                t7m t7mVar = (t7m) obj2;
                if (hc80Var == t7mVar.f217851b) {
                    t7mVar.m80236a();
                    return;
                }
                return;
            case 7:
                sir0 sir0Var = (sir0) obj2;
                int i3 = ghq.f79966a[ta80Var.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    sir0Var.mo30231j(Boolean.TRUE);
                    return;
                } else {
                    if (i3 == 3 || i3 == 4) {
                        sir0Var.mo30231j(Boolean.FALSE);
                        return;
                    }
                    return;
                }
            case 8:
                r9r r9rVar = (r9r) obj2;
                zcp zcpVar = r9rVar.f197107d;
                pcp pcpVar = r9rVar.f197112i;
                v5p v5pVar = r9rVar.f197110g;
                int i4 = q9r.f186658a[ta80Var.ordinal()];
                if (i4 == 1) {
                    AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                    v5pVar.m84739g(xgg1.m90759b1().f36166c);
                    kk40.m56680v(pcpVar.f176192d, null);
                    return;
                }
                if (i4 == 2) {
                    zv41 zv41Var = zcpVar.f281555a;
                    zv41Var.getClass();
                    zv41Var.m97091m(null, yyn0.f277546a);
                    zv41 zv41Var2 = zcpVar.f281556b;
                    Boolean bool = Boolean.TRUE;
                    zv41Var2.getClass();
                    zv41Var2.m97091m(null, bool);
                    return;
                }
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                    xgg1.m90759b1();
                    v5pVar.m84740i();
                    pcpVar.m69600b();
                    return;
                }
                zv41 zv41Var3 = zcpVar.f281555a;
                zv41Var3.getClass();
                zv41Var3.m97091m(null, yyn0.f277547b);
                zv41 zv41Var4 = zcpVar.f281556b;
                Boolean bool2 = Boolean.FALSE;
                zv41Var4.getClass();
                zv41Var4.m97091m(null, bool2);
                return;
            case 9:
                ygr ygrVar = (ygr) obj2;
                int i5 = xgr.f261368a[ta80Var.ordinal()];
                if (i5 == 1) {
                    ugr ugrVar = (ugr) hc80Var;
                    Iterable iterable = (Iterable) ygrVar.m25253b().f287331e.f158717a.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (wj50.m88271j(((uxi0) it.next()).f234940f, ugrVar.f98688Y0)) {
                                return;
                            }
                        }
                    }
                    ugrVar.dismiss();
                    return;
                }
                if (i5 == 2) {
                    ugr ugrVar2 = (ugr) hc80Var;
                    for (Object obj3 : (Iterable) ygrVar.m25253b().f287332f.f158717a.getValue()) {
                        if (wj50.m88271j(((uxi0) obj3).f234940f, ugrVar2.f98688Y0)) {
                            r7 = obj3;
                        }
                    }
                    uxi0 uxi0Var = (uxi0) r7;
                    if (uxi0Var != null) {
                        ygrVar.m25253b().m97201b(uxi0Var);
                        return;
                    }
                    return;
                }
                if (i5 != 3) {
                    if (i5 != 4) {
                        return;
                    }
                    ugr ugrVar3 = (ugr) hc80Var;
                    for (Object obj4 : (Iterable) ygrVar.m25253b().f287332f.f158717a.getValue()) {
                        if (wj50.m88271j(((uxi0) obj4).f234940f, ugrVar3.f98688Y0)) {
                            obj = obj4;
                        }
                    }
                    uxi0 uxi0Var2 = (uxi0) obj;
                    if (uxi0Var2 != null) {
                        ygrVar.m25253b().m97201b(uxi0Var2);
                    }
                    ugrVar3.f98716q1.mo31988d(this);
                    return;
                }
                ugr ugrVar4 = (ugr) hc80Var;
                if (ugrVar4.m83053m1().isShowing()) {
                    return;
                }
                List list = (List) ygrVar.m25253b().f287331e.f158717a.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (wj50.m88271j(((uxi0) listIterator.previous()).f234940f, ugrVar4.f98688Y0)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                uxi0 uxi0Var3 = (uxi0) g6f.m43747t0(iNextIndex, list);
                if (!wj50.m88271j(g6f.m43689C0(list), uxi0Var3)) {
                    ugrVar4.toString();
                }
                if (uxi0Var3 != null) {
                    ygrVar.m93608l(iNextIndex, uxi0Var3, false);
                    return;
                }
                return;
            case 10:
                zv41 zv41Var5 = ((gky) obj2).f80958f;
                int i6 = cky.f39113a[ta80Var.ordinal()];
                if (i6 == 1) {
                    Boolean bool3 = Boolean.TRUE;
                    zv41Var5.getClass();
                    zv41Var5.m97091m(null, bool3);
                    return;
                } else {
                    if (i6 != 2) {
                        return;
                    }
                    Boolean bool4 = Boolean.FALSE;
                    zv41Var5.getClass();
                    zv41Var5.m97091m(null, bool4);
                    return;
                }
            case 11:
                if (ta80Var != ta80.ON_STOP || (view = ((i500) obj2).f98706h1) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 12:
                ((FlowableEmitter) obj2).onNext(hc80Var.getLifecycle().mo31987b());
                return;
            case 13:
                w6j0 w6j0Var = (w6j0) obj2;
                Logger.m3969e("[CAL] lifecycle: " + ta80Var, new Object[0]);
                int i7 = fc80.f68027a[ta80Var.ordinal()];
                if (i7 == 1) {
                    w6j0Var.mo65372a();
                    return;
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    w6j0Var.mo65373c();
                    return;
                }
            case 14:
                jzb0 jzb0Var = (jzb0) obj2;
                if (hc80Var == jzb0Var.f117674c && ta80Var == ta80.ON_DESTROY) {
                    jzb0Var.f117673b.m26446b(null);
                    return;
                }
                return;
            case 15:
                lvi0 lvi0Var = (lvi0) obj2;
                lwr lwrVar2 = lvi0Var.f137329j1;
                if (ta80Var == ta80.ON_RESUME) {
                    lwrVar2.m60127a(lvi0Var.f137314U0.m23348j(d3v.f45018g).m23332L(lvi0Var.f137313T0).subscribe(new sgb0(lvi0Var, 26)));
                    x0h1.m89578u(n5h1.m63737m(lvi0Var.f137318Y0), null, 0, new rph0(lvi0Var, lvi0Var.f50039a.getContext(), r7, 14), 3);
                    return;
                } else {
                    if (ta80Var == ta80.ON_PAUSE) {
                        lwrVar2.m60129c();
                        return;
                    }
                    return;
                }
            case 16:
                if (ta80Var != ta80.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + ta80Var).toString());
                }
                hc80Var.getLifecycle().mo31988d(this);
                ((a9y0) obj2).m25167a();
                return;
            case 17:
                thy0 thy0Var = (thy0) obj2;
                oc80 oc80Var3 = thy0Var.f220518b;
                if (oc80Var3.f163857d != fb80Var) {
                    oc80Var3.m66678i(thy0Var.f220517a.getLifecycle().mo31987b());
                    return;
                }
                return;
            case 18:
                oc80 oc80Var4 = ((yb21) obj2).f271060c;
                if (oc80Var4.f163857d != fb80Var) {
                    oc80Var4.m66676g(ta80Var);
                    return;
                }
                return;
            case 19:
                rd51 rd51Var = (rd51) obj2;
                int i8 = qd51.f187492a[ta80Var.ordinal()];
                if (i8 == 1) {
                    rd51Var.m75323w();
                    return;
                }
                if (i8 == 2) {
                    rd51Var.m75322a();
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    rd51Var.m75323w();
                    rd51Var.f198040c.getLifecycle().mo31988d(rd51Var.f198041d);
                    rd51Var.f198042e = null;
                    return;
                }
            case 20:
                if (ta80Var == ta80.ON_STOP) {
                    ((hnb1) obj2).f93285b.mo55546f();
                    return;
                }
                return;
            case 21:
                if (ta80Var == ta80.ON_RESUME) {
                    vum0 vum0Var = (vum0) obj2;
                    vum0Var.m86438w(vum0Var.m86437v() + 1);
                    return;
                }
                return;
            case 22:
                jcq jcqVar = (jcq) obj2;
                int i9 = jic1.f112722a[ta80Var.ordinal()];
                if (i9 == 1) {
                    ((qe70) jcqVar.f111174c).invoke();
                    return;
                }
                if (i9 == 2) {
                    ((qe70) jcqVar.f111175d).invoke();
                    return;
                }
                if (i9 == 3) {
                    ((qe70) jcqVar.f111176e).invoke();
                    return;
                } else {
                    if (i9 != 4) {
                        return;
                    }
                    jcqVar.f111173b.removeOnAttachStateChangeListener(jcqVar);
                    hc80Var.getLifecycle().mo31988d(this);
                    return;
                }
            case 23:
                ((fpc1) obj2).m42325a();
                if (ta80Var == ta80.ON_DESTROY) {
                    hc80Var.getLifecycle().mo31988d(this);
                    return;
                }
                return;
            default:
                ycd1 ycd1Var = (ycd1) obj2;
                int i10 = vcd1.f240111a[ta80Var.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        ycd1Var.m93348a();
                        return;
                    } else {
                        if (ycd1Var.f271471h != null || (x811Var = ycd1Var.f271473j) == null) {
                            return;
                        }
                        ycd1Var.m93349b(x811Var, ycd1Var.m93351d(x811Var));
                        return;
                    }
                }
                di41 di41Var = ycd1Var.f271472i;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                ycd1Var.f271472i = null;
                lg21 lg21Var = ycd1Var.f271471h;
                if (lg21Var != null) {
                    lg21Var.m58932k();
                }
                lg21 lg21Var2 = ycd1Var.f271471h;
                if (lg21Var2 != null) {
                    lg21Var2.m58929h();
                }
                ycd1Var.f271471h = null;
                ycd1Var.m93350c(ob11.f163514a);
                return;
        }
    }
}
