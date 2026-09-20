package p204p;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.checkout.proto.model.p044v1.proto.GetSpotifyCheckoutPageRequest;
import com.spotify.checkout.proto.model.p044v1.proto.TrackingData;
import com.spotify.decipher.agent.p057v1.ClientSideEventRequest;
import com.spotify.decipher.agent.p057v1.SearchPlayableItemTappedEvent;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class qro implements Function, ant, jnx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191891a;

    /* JADX INFO: renamed from: b */
    public Object f191892b;

    public /* synthetic */ qro(Object obj, int i) {
        this.f191891a = i;
        this.f191892b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static fpr m73656b(ppr pprVar) {
        fpr.CREATOR.getClass();
        if (!(pprVar instanceof bs50)) {
            throw new NoWhenBranchMatchedException();
        }
        return fpr.m42381c(fpr.f71944S0, null, null, ((bs50) pprVar).getItemId(), false, false, null, null, null, false, false, false, false, pprVar, false, false, null, null, false, 1040379);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m73657a(ibk ibkVar) throws Throwable {
        fkq fkqVar;
        iph0 iph0Var;
        if (ibkVar instanceof fkq) {
            fkqVar = (fkq) ibkVar;
            int i = fkqVar.f70581d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fkqVar.f70581d = i - Integer.MIN_VALUE;
            } else {
                fkqVar = new fkq(this, ibkVar);
            }
        } else {
            fkqVar = new fkq(this, ibkVar);
        }
        Object obj = fkqVar.f70579b;
        int i2 = fkqVar.f70581d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iph0Var = fkqVar.f70578a;
            try {
                bga.m29073P(obj);
                iph0Var.m51278a();
                return w2a1.f247311a;
            } catch (Throwable th) {
                th = th;
                iph0Var.m51278a();
                throw th;
            }
        }
        bga.m29073P(obj);
        guf gufVarM62210c = mlg1.m62210c();
        iph0 iph0VarM53953f = ((jph0) ((qgy0) this.f191892b)).m53953f(new gkq(gufVarM62210c, 0), ajq.f16327c);
        try {
            fkqVar.f70578a = iph0VarM53953f;
            fkqVar.f70581d = 1;
            Object objM38777P = gufVarM62210c.m38777P(fkqVar);
            yuk yukVar = yuk.f276404a;
            if (objM38777P == yukVar) {
                return yukVar;
            }
            iph0Var = iph0VarM53953f;
            iph0Var.m51278a();
            return w2a1.f247311a;
        } catch (Throwable th2) {
            th = th2;
            iph0Var = iph0VarM53953f;
            iph0Var.m51278a();
            throw th;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i = 2;
        int i2 = 1;
        switch (this.f191891a) {
            case 3:
                List<String> list = (List) obj;
                if (!list.isEmpty()) {
                    for (String str : list) {
                        Set set = dd41.f47702f;
                        if (!r46.m74708A(str, gn80.SHOW_SHOW)) {
                            return Observable.just(t0j.f215896a);
                        }
                    }
                }
                m12 m12Var = (m12) this.f191892b;
                return ((z5f) m12Var.f138798d).m95459c(((qr1) m12Var.f138797c).f191696e, list, false).map(ket.f121955U0).map(let.f132698U0);
            case 10:
                return new pqm0((ntt0) this.f191892b, (Boolean) obj);
            case 15:
                return (pul0) this.f191892b;
            case 18:
                return ((vsk) ((u7q) this.f191892b).f227742c).m86360c(((e301) obj).f55571a).map(xwe.f266657X0).firstOrError();
            case 20:
                q14 q14Var = (q14) obj;
                qzn qznVar = (qzn) ((whp) this.f191892b).f251420c;
                drq drqVar = (drq) qznVar.f194229b;
                ljx0 ljx0Var = drqVar.f52376a;
                CompletableCreate completableCreateM71844v = q0f1.m71844v(ljx0Var, new mgi(i2, 9));
                Predicate predicate = Functions.f7232h;
                CompletableOnErrorComplete completableOnErrorCompleteM23299p = completableCreateM71844v.m23299p(predicate);
                Scheduler scheduler = (Scheduler) qznVar.f194230c;
                CompletableSubscribeOn completableSubscribeOnM23303t = completableOnErrorCompleteM23299p.m23303t(scheduler);
                ((wy3) ((xre) qznVar.f194231d)).getClass();
                return completableSubscribeOnM23303t.m23292c(q0f1.m71844v(ljx0Var, new szp(11, drqVar, new a5b(q14Var.f184205a, q14Var.f184206b, System.currentTimeMillis()))).m23299p(predicate).m23303t(scheduler)).m23294e(Single.just(q14Var));
            case 24:
                qgc0 qgc0Var = (qgc0) obj;
                if (!(qgc0Var instanceof pgc0)) {
                    Single singleJust = Single.just(x5s.f258505a);
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                ngc0 ngc0Var = ((pgc0) qgc0Var).f177287a;
                k4y k4yVar = ngc0Var.f153642c;
                e4y e4yVar = new e4y(k4yVar.f119369c, k4yVar.f119370d, k4yVar.f119367a, vkf1.m85845K(k4yVar.f119368b));
                d4y d4yVar = ngc0Var.f153643d;
                y3y y3yVar = new y3y(d4yVar.f45265c, d4yVar.f45266d, d4yVar.f45263a, vkf1.m85845K(d4yVar.f45264b));
                wx31 wx31Var = ngc0Var.f153641b;
                z5z z5zVar = new z5z(e4yVar, y3yVar, null, new rx31(wx31Var.f255926c, wx31Var.f255927d, wx31Var.f255924a, vkf1.m85845K(wx31Var.f255925b)));
                return ((Completable) ((C2483v5) ((C2445u9) this.f191892b).f228050c).invoke(z5zVar)).m23294e(Single.just(new y5s(z5zVar)));
            case 26:
                List list2 = (List) obj;
                fxx fxxVar = (fxx) this.f191892b;
                int iM31820L = c95.m31820L(i6f.m49804T(list2, 10));
                if (iM31820L < 16) {
                    iM31820L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
                for (Object obj2 : list2) {
                    linkedHashMap.put(((pob) obj2).f179663a, obj2);
                }
                List list3 = fxxVar.f74479a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    pob pobVar = (pob) linkedHashMap.get(((axx) obj3).f21021a);
                    if (pobVar != null ? pobVar.f179664b : true) {
                        arrayList.add(obj3);
                    }
                }
                return fxx.m43028a(fxxVar, arrayList, null, 14);
            case 27:
                m500 m500Var = (m500) ((tgq) this.f191892b).f220237b;
                if (lzj.m60353c(m500Var, "android.permission.CAMERA") == 0) {
                    i = 1;
                } else if (!ze0.m95955u0(m500Var, "android.permission.CAMERA")) {
                    i = 3;
                }
                return new q4t(i);
            case 28:
                wqt wqtVar = (wqt) this.f191892b;
                vb41 vb41Var = wqtVar.f254169b;
                mb10 mb10VarM6206q = GetSpotifyCheckoutPageRequest.m6206q();
                ub41 ub41Var = wqtVar.f254168a;
                mb10VarM6206q.m61339m(ub41Var.mo75140m0());
                it81 it81VarM6512q = TrackingData.m6512q();
                it81VarM6512q.m51614r(ub41Var.getSource().f55184a);
                it81VarM6512q.m51612m(wqtVar.f254170c);
                mb10VarM6206q.m61340q(it81VarM6512q);
                return vb41Var.mo26814c((GetSpotifyCheckoutPageRequest) mb10VarM6206q.build()).compose(new kq11(2)).map(new0.f153136Z0).onErrorReturn(wow0.f253594Z0);
            default:
                n0u n0uVar = (n0u) obj;
                return ((y621) this.f191892b).m92857a(t2b1.EMAIL, n0uVar.f149169a).onErrorReturn(new ibp(n0uVar, 20)).map(new j3p(n0uVar, 21));
        }
    }

    /* JADX INFO: renamed from: c */
    public yab m73658c(String str) {
        return k0e1.m54985d(((ezk0) this.f191892b).m40369i(Collections.singletonList(str)).map(u0o0.f225547T0).map(lew0.f132739T0).onErrorReturn(new0.f153127T0));
    }

    /* JADX INFO: renamed from: d */
    public void m73659d(ccp ccpVar) {
        ((CopyOnWriteArraySet) this.f191892b).remove(ccpVar);
    }

    /* JADX INFO: renamed from: e */
    public void m73660e(wag1 wag1Var) {
        Iterator it = ((CopyOnWriteArraySet) this.f191892b).iterator();
        while (it.hasNext()) {
            dcp dcpVar = ((ccp) it.next()).f36585a;
            if (dcpVar.f47598f) {
                if (wag1Var instanceof cyy0) {
                    if (dcpVar.f47596d.m57860e()) {
                        String str = ((cyy0) wag1Var).f43408d;
                        dcpVar.m35669b("spotify:search:".concat(fbg1.m41239g(str)), str);
                    }
                } else if (wag1Var instanceof ayy0) {
                    String str2 = ((ayy0) wag1Var).f21378d;
                    dcpVar.m35669b(str2, str2);
                } else {
                    if (!(wag1Var instanceof byy0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str3 = ((byy0) wag1Var).f32328d;
                    byz0 byz0Var = dcpVar.f47599g;
                    if (byz0Var != null) {
                        jme jmeVarM9136q = ClientSideEventRequest.m9136q();
                        jmeVarM9136q.m53775m(UUID.randomUUID().toString());
                        syy0 syy0VarM9151o = SearchPlayableItemTappedEvent.m9151o();
                        syy0VarM9151o.m79718m(str3);
                        jmeVarM9136q.m53777r(syy0VarM9151o);
                        x0h1.m89578u(dcpVar.f47597e, null, 0, new r2m(byz0Var, (ClientSideEventRequest) jmeVarM9136q.build(), null, 21), 3);
                    }
                }
            }
        }
    }

    @Override // p204p.jnx0
    /* JADX INFO: renamed from: n */
    public void mo25436n(Intent intent, dd41 dd41Var, e301 e301Var) {
        ((xcp) ((la2) this.f191892b).f131226b).m90397a(intent.getStringExtra("DEVICE_PICKER_INTERACTION_ID"), intent.getBooleanExtra("DEVICE_PICKER_OPEN_PARTICIPANTS", false));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        Drawable drawableFindDrawableByLayerId;
        switch (this.f191891a) {
            case 4:
                rjl rjlVar = (rjl) obj;
                twz0 twz0Var = ((w9p) this.f191892b).f249220d;
                if (rjlVar.f199855j.f220957a != 2) {
                    ((TextView) twz0Var.f224526c).setVisibility(8);
                } else {
                    ((TextView) twz0Var.f224526c).setVisibility(0);
                    ((TextView) twz0Var.f224526c).setText(rjlVar.f199854i);
                }
                break;
            case 5:
            case 7:
            case 10:
            case 11:
            case 14:
            case 15:
            default:
                ((EnhancedBadgeView) ((tdq) this.f191892b).f219454c.f225652f).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
            case 6:
                qbp qbpVar = (qbp) this.f191892b;
                nn40 nn40Var = qbpVar.f187132b;
                ConstraintLayout constraintLayout = (ConstraintLayout) qbpVar.f187133c.f205039f;
                Object systemService = constraintLayout.getContext().getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty() ^ true) && !constraintLayout.isAccessibilityFocused() && nn40Var.f156326b) {
                    constraintLayout.performAccessibilityAction(64, null);
                }
                nn40Var.f156326b = false;
                break;
            case 8:
                z3x z3xVar = (z3x) obj;
                xzo xzoVar = (xzo) this.f191892b;
                wj50.m88279p(z3xVar);
                z9p z9pVar = (z9p) xzoVar.f267728c;
                if (z3xVar.f279051d == null || z3xVar.f279052e == null) {
                    ((CalendarIconView) z9pVar.f280845d).setVisibility(8);
                } else {
                    ((CalendarIconView) z9pVar.f280845d).setVisibility(0);
                    ((CalendarIconView) z9pVar.f280845d).mo2820d(new q8b(124, null, null, z3xVar.f279051d, z3xVar.f279052e, false));
                }
                break;
            case 9:
                String str = (String) obj;
                aop aopVar = (aop) this.f191892b;
                wj50.m88279p(str);
                ((TextView) aopVar.f17732a.f225646Y).setText(str);
                rxj.m76659a(aopVar.f17733b.f111921t, str);
                break;
            case 12:
                String str2 = (String) obj;
                qxo qxoVar = (qxo) this.f191892b;
                wj50.m88279p(str2);
                ((TextView) ((rk0) qxoVar.f193717c).f199932X).setText(str2);
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                g0q g0qVar = (g0q) this.f191892b;
                wj50.m88279p(bool);
                ((TextView) g0qVar.f75420e.f39341c).setVisibility(bool.booleanValue() ? 0 : 8);
                break;
            case 16:
                nf81 nf81Var = (nf81) obj;
                adq adqVar = (adq) this.f191892b;
                wj50.m88279p(nf81Var);
                e60 e60Var = adqVar.f14659d;
                boolean z = nf81Var.f153295k;
                String str3 = nf81Var.f153287c;
                if (!z) {
                    ((TextView) e60Var.f56510g).setText(str3);
                } else {
                    Context context = adqVar.f14656a;
                    Drawable drawable = context.getDrawable(R.drawable.track_header_lock_icon_drawable);
                    if (drawable == null) {
                        drawable = null;
                    } else {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.encore_badge_size);
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
                        if (layerDrawable != null && (drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.lock_icon)) != null) {
                            drawableFindDrawableByLayerId.setTint(context.getColor(R.color.gray_7));
                        }
                    }
                    if (drawable != null) {
                        int i = Build.VERSION.SDK_INT >= 29 ? 2 : 1;
                        TextView textView = (TextView) e60Var.f56510g;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(new ImageSpan(drawable, i), 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) spannableString);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) str3);
                        textView.setText(spannableStringBuilder);
                    } else {
                        ((TextView) e60Var.f56510g).setText(str3);
                    }
                }
                break;
        }
    }

    public qro(int i) {
        this.f191891a = i;
        switch (i) {
            case 23:
                break;
            default:
                this.f191892b = new CopyOnWriteArraySet();
                break;
        }
    }

    public qro(Context context) {
        this.f191891a = 1;
        this.f191892b = new uz3(1, context.getResources());
    }
}
