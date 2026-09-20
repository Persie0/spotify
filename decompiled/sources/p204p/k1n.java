package p204p;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.spotify.concertcampaignview.p047v1.CtaType;
import com.spotify.deeplinkimpl.events.proto.DeeplinkOpenError;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;
import com.spotify.searchview.proto.AudioEpisode;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class k1n implements Function, ant, InterfaceC1667ah, Predicate, w1j0, SingleTransformer, g5w0, iab, InterfaceC2207oa {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118394a;

    /* JADX INFO: renamed from: b */
    public final Object f118395b;

    public /* synthetic */ k1n(Object obj, int i) {
        this.f118394a = i;
        this.f118395b = obj;
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    /* JADX INFO: renamed from: V */
    public Single mo23389V(Single single) {
        return single.flatMap(new bco((kps) this.f118395b, 26));
    }

    /* JADX INFO: renamed from: a */
    public f5k m55116a(dnq dnqVar, String str, String str2) {
        return new f5k("campfire_delete_chat", (wwu) bpu.f29605c, (c5k) null, Integer.valueOf(R.string.menu_item_delete_chat_title), (String) null, false, (p221) null, new e5k(new v4k(3), 3, new d5k(rhq.f199280O0, rhq.f199281P0), new pek(this, dnqVar, str, str2, 9)), 244);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        ihi ihiVar = (ihi) obj;
        return ((x1p0) this.f118395b).m89659D(ihiVar.f102296c, ihiVar.f102294a, 3);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single map;
        switch (this.f118394a) {
            case 5:
                gyo gyoVar = (gyo) obj;
                iyo iyoVar = (iyo) this.f118395b;
                if (!(gyoVar instanceof fyo)) {
                    Single singleJust = Single.just(vb7.f239428a);
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                String str = ((fyo) gyoVar).f74785a;
                vl11 vl11Var = iyoVar.f107027i;
                String str2 = new gf41(str).f79272e;
                if (str2 == null) {
                    map = Single.error(new IllegalArgumentException("Invalid show URI: ".concat(str)));
                } else if (iyoVar.f107025g.m73350d()) {
                    map = iyoVar.f107022d.m42042a(new sl11(str2, new m6w(0), 0, null, vl11Var.f242347b, null, null, 131052)).map(kqd1.f125271T0);
                } else {
                    map = iyoVar.f107021c.m94144a(str2, vl11Var).map(njy0.f154682S0);
                    wj50.m88279p(map);
                }
                Single map2 = z5f.m95456b(iyoVar.f107023e, str, new String[]{str}).map(new vah1(str, 8));
                ryo ryoVar = iyoVar.f107026h;
                Single singleZip = Single.zip(map, map2, ryoVar.f203941a.map(new zy5(ryoVar, 7)), new h3n(21, iyoVar, gyoVar));
                wj50.m88279p(singleZip);
                return singleZip;
            case 12:
                C2263po c2263po = (C2263po) this.f118395b;
                return ((q7s0) c2263po.f179550b).mo59839a(((bbm0) c2263po.f179551c).mo3039c()).mo74958b(g6f.m43736n1(((k8z) obj).f120491c)).distinctUntilChanged().map(g2h1.f75942S0);
            default:
                return new pqm0((baq) this.f118395b, (Integer) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m55117b(o4e1 o4e1Var, ibk ibkVar) {
        mjs mjsVar;
        if (ibkVar instanceof mjs) {
            mjsVar = (mjs) ibkVar;
            int i = mjsVar.f144325d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjsVar.f144325d = i - Integer.MIN_VALUE;
            } else {
                mjsVar = new mjs(this, ibkVar);
            }
        } else {
            mjsVar = new mjs(this, ibkVar);
        }
        Object obj = mjsVar.f144323b;
        int i2 = mjsVar.f144325d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                ((ow6) ((m3n) this.f118395b).f139686b).mo68158h(CtaType.CTA_SHARE_FIELD_NUMBER, 0.1f);
                mjsVar.f144322a = o4e1Var;
                mjsVar.f144325d = 1;
                Object objM64619l = njg1.m64619l(800L, mjsVar);
                yuk yukVar = yuk.f276404a;
                if (objM64619l == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o4e1Var = mjsVar.f144322a;
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return new g6e1(o4e1Var.f161661a);
    }

    /* JADX INFO: renamed from: c */
    public void m55118c(int i, Intent intent, String str) {
        String strValueOf;
        int i2;
        if ((intent != null ? intent.getExtras() : null) != null) {
            strValueOf = intent + " Extras: " + intent.getExtras();
        } else {
            strValueOf = String.valueOf(intent);
        }
        hcn hcnVar = (hcn) this.f118395b;
        String dataString = intent != null ? intent.getDataString() : null;
        if (i == 1) {
            i2 = 1000;
        } else if (i == 2) {
            i2 = AudioEpisode.SHOW_URI_FIELD_NUMBER;
        } else if (i == 3) {
            i2 = 2001;
        } else {
            if (i != 4) {
                throw null;
            }
            i2 = 2003;
        }
        auo auoVarM9178s = DeeplinkOpenError.m9178s();
        if (dataString != null) {
            auoVarM9178s.m27214s(((grh) hcnVar.f89845b).mo28600b(dataString));
        }
        if (strValueOf != null) {
            auoVarM9178s.m27215t(strValueOf);
        }
        auoVarM9178s.m27213r(str);
        auoVarM9178s.m27211m(i2);
        auoVarM9178s.m27212q();
        DeeplinkOpenError deeplinkOpenError = (DeeplinkOpenError) auoVarM9178s.build();
        qre0 qre0Var = (qre0) hcnVar.f89846c;
        wj50.m88279p(deeplinkOpenError);
        qre0Var.m73616a(deeplinkOpenError);
        deeplinkOpenError.toString();
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: f */
    public void mo31884f(y8b y8bVar, IOException iOException) {
        ObservableEmitter observableEmitter = (ObservableEmitter) this.f118395b;
        if (observableEmitter.isDisposed()) {
            return;
        }
        observableEmitter.onError(iOException);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        return new u1j0(g4o0.class, new lpr(hsg1.m48452r(dd41VarM74726U), nyg1.m65891r(dd41VarM74726U), nyg1.m65890q(dd41VarM74726U), true, ((t36) ((o12) this.f118395b).f160572c).m79979k()), uzq0.f235620a);
    }

    @Override // p204p.g5w0
    /* JADX INFO: renamed from: m */
    public Object mo26036m(tu41 tu41Var, d850 d850Var, ibk ibkVar) {
        v6w0 v6w0Var;
        String str;
        fbk fbkVar = null;
        it41 it41Var = tu41Var instanceof it41 ? (it41) tu41Var : null;
        if (it41Var == null || (v6w0Var = it41Var.f105421a) == null || (str = v6w0Var.f237979a) == null) {
            return w2a1.f247311a;
        }
        iin iinVar = (iin) this.f118395b;
        return x0h1.m89557A((luk) iinVar.f102608d, new shh(d850Var, iinVar, str, fbkVar, 24), ibkVar);
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public boolean mo1561q(View view) {
        ((w9p) this.f118395b).f249214X.invoke(pjl.f178276a);
        return true;
    }

    @Override // p204p.g5w0
    /* JADX INFO: renamed from: r */
    public ad61 mo26041r() {
        return null;
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        int i = this.f118394a;
        Object obj2 = this.f118395b;
        switch (i) {
            case 6:
                Integer num = (Integer) obj;
                wj50.m88279p(num);
                ColorStateList colorStateListM37786a = e4p.m37786a(num.intValue());
                EncoreButton encoreButton = ((e4p) obj2).f56122a;
                encoreButton.setStrokeColor(colorStateListM37786a);
                encoreButton.setStrokeWidthResource(R.dimen.endless_dj_button_border_width);
                break;
            case 7:
                d7i d7iVar = (d7i) obj;
                wj50.m88279p(d7iVar);
                ((EncoreButton) ((j5p) obj2).f109055f.f226725d).setVisibility(d7iVar.f46217r ? 0 : 8);
                break;
            case 8:
            case 12:
            case 14:
            case 15:
            case 16:
            default:
                deq deqVar = (deq) obj2;
                deqVar.f48148c.setMax((int) ((Number) obj).longValue());
                deqVar.m35812a();
                break;
            case 9:
                String str = (String) obj;
                map mapVar = (map) obj2;
                ((TextView) mapVar.f141631a.f225646Y).setText(str);
                qyy0 qyy0Var = mapVar.f141632b;
                MotionLayout motionLayout = (MotionLayout) qyy0Var.f194059b;
                if (motionLayout.isLaidOut() && !motionLayout.isLayoutRequested()) {
                    float height = motionLayout.getHeight() * 0.3f;
                    TextView textView = (TextView) qyy0Var.f194057Z;
                    Float fValueOf = Float.valueOf(height);
                    z350 z350VarM63411S = n0e1.m63411S(g0g1.m43304i(56, 24, -1), 1);
                    z350 z350Var = rxj.f203614a;
                    inl0.m51135a(textView, new qxj(textView, textView, str, fValueOf, z350VarM63411S, 0));
                } else {
                    motionLayout.addOnLayoutChangeListener(new j96(4, qyy0Var, str));
                }
                break;
            case 10:
                ((EnhancedBadgeView) ((qbp) obj2).f187133c.f205041h).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
            case 11:
                pqm0 pqm0Var = (pqm0) obj;
                String str2 = (String) pqm0Var.f180350a;
                String str3 = (String) pqm0Var.f180351b;
                TextView textView2 = (TextView) ((kkx0) ((suo) obj2).f214158c).f123729e;
                if (str2.length() <= 0) {
                    str2 = str3;
                }
                textView2.setText(str2);
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                BackButtonView backButtonView = (BackButtonView) ((aop) obj2).f17732a.f225652f;
                wj50.m88279p(bool);
                backButtonView.setVisibility(bool.booleanValue() ? 0 : 8);
                break;
            case 17:
                ((rc81) obj2).m75214x552871a8((kc81) obj);
                break;
            case 18:
                ((ImageView) ((tdq) obj2).f219454c.f225649c).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean z;
        switch (this.f118394a) {
            case 14:
                qwh0 qwh0Var = ((wsp) this.f118395b).f254665f;
                wj50.m88279p(obj);
                return !((Boolean) qwh0Var.invoke(obj)).booleanValue();
            default:
                hwc1 hwc1Var = ((xxp) this.f118395b).f267043b;
                Double d = ((egr) obj).f59380a;
                if (d == null || wj50.m88267h(d, -1.0d)) {
                    z = false;
                } else {
                    xre xreVar = hwc1Var.f95911a;
                    if (System.currentTimeMillis() - hwc1Var.f95912b < 200) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    xre xreVar2 = hwc1Var.f95911a;
                    System.currentTimeMillis();
                }
                return z;
        }
    }

    @Override // p204p.iab
    /* JADX INFO: renamed from: y */
    public void mo31897y(y8b y8bVar, n2x0 n2x0Var) {
        ObservableEmitter observableEmitter = (ObservableEmitter) this.f118395b;
        try {
            String strM69093g = n2x0Var.f149863g.m69093g();
            if (n2x0Var.f149852O0) {
                if (strM69093g == null) {
                    strM69093g = "";
                }
                observableEmitter.onNext(strM69093g);
                observableEmitter.onComplete();
                return;
            }
            Exception exc = new Exception(strM69093g);
            if (observableEmitter.isDisposed()) {
                return;
            }
            observableEmitter.onError(exc);
        } catch (Exception e) {
            if (observableEmitter.isDisposed()) {
                return;
            }
            observableEmitter.onError(e);
        }
    }

    public k1n(son sonVar, otn otnVar) {
        this.f118394a = 1;
        this.f118395b = otnVar;
    }
}
