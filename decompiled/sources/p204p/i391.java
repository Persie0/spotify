package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes9.dex */
public final class i391 implements SingleOnSubscribe, Function, dn6, s1l0, InterfaceC2207oa, r9w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98071a;

    /* JADX INFO: renamed from: b */
    public final Object f98072b;

    public /* synthetic */ i391(Object obj, int i) {
        this.f98071a = i;
        this.f98072b = obj;
    }

    /* JADX INFO: renamed from: a */
    public void m49580a(String str, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1564888142);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128) | (xq00Var.m91770i(this) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strM54977L = k0e1.m54977L(R.string.unblock_user_confirmation_dialog_button, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.remove_follower_confirmation_dialog_cancel_button, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.TRUE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | ((i2 & 896) == 256);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new puj0(eh00Var2, kqi0Var, 15);
                xq00Var.m91793t0(objM91750T2);
            }
            eh00 eh00Var3 = (eh00) objM91750T2;
            if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                xq00Var.m91771i0(2008060791);
                String strM54978M = k0e1.m54978M(R.string.unblock_user_confirmation_dialog_title, new Object[]{str}, xq00Var);
                String strM83240o = ((uj81) this.f98072b).m83240o(str);
                if (wl51.m88460J0(strM54977L)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                gku gkuVar = new gku(strM54977L, new peu(new t40(strM54977L), eh00Var));
                if (wl51.m88460J0(strM54977L2)) {
                    throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                }
                kku.m56741a(eh00Var3, null, null, strM54978M, strM83240o, gkuVar, new gku(strM54977L2, new peu(new t40(strM54977L2), eh00Var3)), xq00Var, 2359296, 6);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(2008611444);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rd71(this, str, eh00Var, eh00Var2, i);
        }
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        int i = this.f98071a;
        Object obj3 = this.f98072b;
        switch (i) {
            case 18:
                h5f1 h5f1Var = new h5f1((ev61) obj2);
                y5f1 y5f1Var = (y5f1) ((x5f1) obj).m37438q();
                Parcel parcelM43600C = y5f1Var.m43600C();
                int i2 = m5f1.f140220a;
                parcelM43600C.writeStrongBinder(h5f1Var);
                m5f1.m60864b(parcelM43600C, (SaveAccountLinkingTokenRequest) obj3);
                y5f1Var.m43610v1(1, parcelM43600C);
                break;
            default:
                kgf1 kgf1Var = new kgf1((thf1) obj3, (ev61) obj2, 2);
                acf1 acf1Var = (acf1) ((baf1) obj).m37438q();
                Parcel parcelM43604d2 = acf1Var.m43604d2();
                fmf1.m42108c(parcelM43604d2, kgf1Var);
                acf1Var.m43606f2(3, parcelM43604d2);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objJust;
        switch (this.f98071a) {
            case 3:
                fmt0 fmt0Var = (fmt0) obj;
                return ((jpx) ((k6a1) this.f98072b).f119706a).m53978b(new C1668ai("up-next-card", false, (gh00) new snt0(fmt0Var, 1))).filter(xjr0.f262200T0).take(1L).map(new dz31(fmt0Var, 19)).onErrorReturn(new rg41(fmt0Var, 18));
            case 5:
                List list = (List) obj;
                a531 a531Var = (a531) this.f98072b;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(gyf1.m46159y((fzd1) it.next(), ((Boolean) ((ni00) a531Var.f12416d).invoke()).booleanValue()));
                }
                return arrayList;
            case 7:
                return ((itb1) this.f98072b).f105508k.map(mmq0.f145210W0).startWithItem(Boolean.FALSE);
            case 10:
                return ((e5d1) this.f98072b).f56377r.m94205a(xmr0.WRAPPED).map(axq0.f20962X0).toObservable();
            case 11:
                if (((s6x0) obj).f206218a instanceof c6x0) {
                    Observable observableJust = Observable.just(w7d1.f248647a);
                    wj50.m88279p(observableJust);
                    return observableJust;
                }
                Observable map = ((z7d1) this.f98072b).f280181h.map(u6j0.f227364R0);
                wj50.m88279p(map);
                return map;
            case 13:
                return (nrd1) this.f98072b;
            case 16:
                p2x0 p2x0Var = (p2x0) obj;
                wyb1 wyb1Var = new wyb1((mle1) this.f98072b, 4);
                if (p2x0Var instanceof k2x0) {
                    objJust = wyb1Var.invoke(((k2x0) p2x0Var).f118699a);
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objJust = Single.just(u4m.f226774a);
                }
                return (SingleSource) objJust;
            default:
                ph3 ph3Var = (ph3) obj;
                t4z t4zVar = (t4z) this.f98072b;
                wj50.m88279p(ph3Var);
                b3l0 b3l0Var = t4zVar.f217178b;
                Boolean bool = (Boolean) ph3Var.f177455c.m41144c(so50.f211096a);
                return b3l0Var.m28036a(eem.m38689t(ph3Var.f177454b.f117620c), bool != null ? bool.booleanValue() : false).map(new rg41(t4zVar, ph3Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (r9 == r6) goto L38;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m49581b(pn1 pn1Var, ibk ibkVar) {
        kda1 kda1Var;
        ya3 ya3Var = (ya3) this.f98072b;
        if (ibkVar instanceof kda1) {
            kda1Var = (kda1) ibkVar;
            int i = kda1Var.f121651d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kda1Var.f121651d = i - Integer.MIN_VALUE;
            } else {
                kda1Var = new kda1(this, ibkVar);
            }
        } else {
            kda1Var = new kda1(this, ibkVar);
        }
        Object objM93170c = kda1Var.f121649b;
        int i2 = kda1Var.f121651d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM93170c);
                String str = pn1Var.f179284b;
                x93 x93Var = pn1Var.f179283a;
                aa3 z93Var = wj50.m88271j(str, yl1.f273875b) ? y93.f270477a : new z93(pn1Var.f179284b);
                boolean z = pn1Var.f179285c;
                yuk yukVar = yuk.f276404a;
                if (z) {
                    kda1Var.f121648a = pn1Var;
                    kda1Var.f121651d = 1;
                    if (ya3Var.m93178m(x93Var, z93Var, kda1Var) == yukVar) {
                    }
                    return new eq1(new z7i0(null, null, null, null, 15), pn1Var.f179284b);
                }
                kda1Var.f121648a = pn1Var;
                kda1Var.f121651d = 2;
                objM93170c = ya3Var.m93170c(x93Var, z93Var, kda1Var);
                return yukVar;
            }
            if (i2 == 1) {
                pn1Var = kda1Var.f121648a;
                bga.m29073P(objM93170c);
                return new eq1(new z7i0(null, null, null, null, 15), pn1Var.f179284b);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pn1Var = kda1Var.f121648a;
            bga.m29073P(objM93170c);
            w93 w93Var = (w93) objM93170c;
            if (!(w93Var instanceof u93)) {
                if (wj50.m88271j(w93Var, v93.f238832a)) {
                    return new eq1(new z7i0(null, null, null, null, 15), pn1Var.f179284b);
                }
                throw new NoWhenBranchMatchedException();
            }
            int iM38547C = edb.m38547C(((u93) w93Var).f228063a);
            if (iM38547C == 0) {
                return new eq1(new z7i0(null, null, null, null, 15), pn1Var.f179284b);
            }
            if (iM38547C == 1) {
                return new up1(new ggm(pn1Var.f179284b));
            }
            throw new NoWhenBranchMatchedException();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new eq1(new x7i0(e2), pn1Var.f179284b);
        }
    }

    /* JADX INFO: renamed from: c */
    public esc1 m49582c(st60 st60Var) {
        esc1 esc1Var = (esc1) ((mec0) this.f98072b).get(st60Var);
        if (esc1Var != null) {
            return esc1Var;
        }
        throw new IllegalArgumentException(String.format("Can not handle assistant %s", Arrays.copyOf(new Object[]{st60Var.f213825a}, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public Object m49583d(String str, ibk ibkVar) throws Throwable {
        h391 h391Var;
        Object c6x0Var;
        if (ibkVar instanceof h391) {
            h391Var = (h391) ibkVar;
            int i = h391Var.f87189c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h391Var.f87189c = i - Integer.MIN_VALUE;
            } else {
                h391Var = new h391(this, ibkVar);
            }
        } else {
            h391Var = new h391(this, ibkVar);
        }
        Object objM96567o = h391Var.f87187a;
        int i2 = h391Var.f87189c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                Single singleM66008b = o091.m66008b((o091) this.f98072b, str, 0L);
                h391Var.f87189c = 1;
                objM96567o = zn91.m96567o(singleM66008b, h391Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            c6x0Var = Boolean.valueOf(((k091) objM96567o).f117946h);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a == null || (thM77348a instanceof TimeoutCancellationException) || !(thM77348a instanceof CancellationException)) {
            return c6x0Var instanceof c6x0 ? Boolean.FALSE : c6x0Var;
        }
        throw thM77348a;
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        return aya1.m27508b((aya1) this.f98072b, intent);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        ul91 ul91Var = (ul91) this.f98072b;
        ul91Var.f231489b = singleEmitter;
        singleEmitter.setCancellable(new zg0(ul91Var, 11));
        if (ul91Var.f231490c) {
            return;
        }
        singleEmitter.onSuccess(Boolean.TRUE);
    }

    public /* synthetic */ i391(i5f1 i5f1Var, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.f98071a = 18;
        this.f98072b = saveAccountLinkingTokenRequest;
    }

    public i391() {
        this.f98071a = 20;
        this.f98072b = new dxc1();
    }

    public i391(kv91 kv91Var) {
        this.f98071a = 12;
        this.f98072b = kv91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-wear-app-onboarding-notification";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276051e = "wearAppOnboarding";
        yt91VarM50626j.m94607a();
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((b84) ((u6x) this.f98072b).f227447b).m28411b();
    }

    public i391(Context context) {
        this.f98071a = 14;
        c9k c9kVarM56661c = kk40.m56661c(new uuk("WiFiDisabledDetectorScope"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        this.f98072b = bzf1.m31027s(new in21(gk40.m45029e(context, intentFilter), 15), c9kVarM56661c, hf11.f90581a, 1);
    }

    public i391(htz0 htz0Var) {
        this.f98071a = 8;
        this.f98072b = new AtomicInteger(0);
    }
}
