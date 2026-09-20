package p204p;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.WorkerParameters;
import com.comscore.streaming.ContentType;
import com.google.android.gms.tasks.Task;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ButtonType;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.music.R;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import com.spotify.share.housekeeping.impl.ShareHousekeepingWorkerImpl;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class k9u implements Function, r7l0, BiFunction, wh00, q431, hbb, rdc1, g9f, yvy, Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120691a;

    /* JADX INFO: renamed from: b */
    public Object f120692b;

    public /* synthetic */ k9u(Object obj, int i) {
        this.f120691a = i;
        this.f120692b = obj;
    }

    /* JADX INFO: renamed from: g */
    public static final void m55843g(k9u k9uVar, Button button, MessageTemplate messageTemplate, String str, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var2.m91775k0(374849411);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var2.m91766g(button) : xq00Var2.m91770i(button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91770i(messageTemplate) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var2.m91766g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var2.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            ButtonType buttonType = button.getStyle().getButtonType();
            ButtonType buttonType2 = ButtonType.TERTIARY;
            cxh0 cxh0Var = cxh0.f43038a;
            if (buttonType == buttonType2) {
                xq00Var2.m91771i0(224068545);
                float f = 0;
                fmx0 fmx0VarM47993b = hmx0.m47993b(f);
                rgu rguVarM75488a = vvx.m86517r(xq00Var2).m75488a();
                fxh0 fxh0VarM39673I = epv0.m39673I(str, zsf1.m96830A(cxh0Var, f, 0.0f, 2));
                j4m0 j4m0Var = new j4m0(f, f, f, f);
                int i3 = i2 & 14;
                boolean z = ((i2 & 7168) == 2048) | (i3 == 4 || ((i2 & 8) != 0 && xq00Var2.m91770i(button)));
                Object objM91750T = xq00Var2.m91750T();
                if (z || objM91750T == ia7Var) {
                    objM91750T = new cu8(gh00Var, button, 14);
                    xq00Var2.m91793t0(objM91750T);
                }
                pye0.m71628o(button, messageTemplate, fxh0VarM39673I, 5, rguVarM75488a, j4m0Var, null, fmx0VarM47993b, null, (eh00) objM91750T, xq00Var2, Button.$stable | i3 | (i2 & ContentType.LONG_FORM_ON_DEMAND), 320);
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(224524245);
                rgu rguVarM86517r = vvx.m86517r(xq00Var2);
                fxh0 fxh0VarM39673I2 = epv0.m39673I(str, cxh0Var);
                int i4 = i2 & 14;
                boolean z2 = ((i2 & 7168) == 2048) | (i4 == 4 || ((i2 & 8) != 0 && xq00Var2.m91770i(button)));
                Object objM91750T2 = xq00Var2.m91750T();
                if (z2 || objM91750T2 == ia7Var) {
                    objM91750T2 = new cu8(gh00Var, button, 15);
                    xq00Var2.m91793t0(objM91750T2);
                }
                pye0.m71626m(button, messageTemplate, fxh0VarM39673I2, 0, rguVarM86517r, null, null, null, null, null, (eh00) objM91750T2, xq00Var, Button.$stable | i4 | (i2 & ContentType.LONG_FORM_ON_DEMAND), 1000);
                xq00Var2 = xq00Var;
                xq00Var2.m91788r(false);
            }
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yul((Object) k9uVar, (Object) button, (Object) messageTemplate, (Object) str, gh00Var, i, 29);
        }
    }

    @Override // p204p.g9f
    /* JADX INFO: renamed from: a */
    public void mo44024a(int i) {
        h3v h3vVar = (h3v) ((z9t) this.f120692b).f280876e;
        if (h3vVar != null) {
            h3vVar.mo46605a(i);
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) this.f120692b);
        linkedHashMap.put("episode_speed", String.valueOf(((p3p0) obj2).f173685a));
        return new c5w((d0w) obj, linkedHashMap);
    }

    @Override // p204p.hbb
    public Object attachCompleter(gbb gbbVar) {
        hk00 hk00Var = (hk00) this.f120692b;
        wj50.m88281r("The result can only set once!", hk00Var.f92306b == null);
        hk00Var.f92306b = gbbVar;
        return "FutureChain[" + hk00Var + "]";
    }

    /* JADX INFO: renamed from: b */
    public void m55844b(qwt qwtVar, c0f0 c0f0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-69459109);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qwtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(c0f0Var) : xq00Var.m91770i(c0f0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            m55845c(qwtVar, rkk.m75772x(-654844326, new rs40(c0f0Var, this, gh00Var), xq00Var), epv0.m39673I("messaging_inlinecard_compact", cxh0.f43038a), xq00Var, (i2 & 7168) | (i2 & 14) | 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ss40(this, qwtVar, c0f0Var, gh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m55845c(qwt qwtVar, fyf fyfVar, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1636677144);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qwtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            fyfVar.mo24510D0(qwtVar, xq00Var, Integer.valueOf(i2 & 126));
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rf00(this, qwtVar, fyfVar, fxh0Var, i, 22);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m55846d(qwt qwtVar, c0f0 c0f0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(2062845459);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qwtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(c0f0Var) : xq00Var.m91770i(c0f0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            m55845c(qwtVar, rkk.m75772x(-1354706316, new us40(c0f0Var, this, gh00Var), xq00Var), epv0.m39673I("messaging_inlinecard_micro_compact", cxh0.f43038a), xq00Var, (i2 & 7168) | (i2 & 14) | 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ss40(this, qwtVar, c0f0Var, gh00Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m55847e(qwt qwtVar, c0f0 c0f0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(360398225);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(qwtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? xq00Var.m91766g(c0f0Var) : xq00Var.m91770i(c0f0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(this) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            m55845c(qwtVar, rkk.m75772x(-606674318, new ws40(c0f0Var, this, gh00Var), xq00Var), epv0.m39673I("messaging_inlinecard_standard", cxh0.f43038a), xq00Var, (i2 & 7168) | (i2 & 14) | 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ss40(this, qwtVar, c0f0Var, gh00Var, i, 2);
        }
    }

    @Override // p204p.q431
    /* JADX INFO: renamed from: f */
    public void mo28183f(u231 u231Var) {
        ((lbk0) this.f120692b).mo58667d(u231Var, "PlayModePicker.Dialog");
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((n950) this.f120692b).f151721c);
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ConstraintLayout) this.f120692b;
    }

    @Override // p204p.yvy
    /* JADX INFO: renamed from: h */
    public kwy mo28558h(ovy ovyVar) {
        return ((m12) this.f120692b).mo28558h(ovyVar);
    }

    /* JADX INFO: renamed from: i */
    public ShareHousekeepingWorkerImpl m55848i(Context context, WorkerParameters workerParameters) {
        j1n j1nVar = (j1n) this.f120692b;
        j1nVar.getClass();
        z9t z9tVar = (z9t) ((ujh) j1nVar.f107805a.f55002b).f231032b;
        vyr0 vyr0Var = (vyr0) z9tVar.f280874c;
        xre xreVar = (xre) z9tVar.f280876e;
        jg31.m53271i(xreVar);
        luk lukVar = (luk) z9tVar.f280875d;
        jg31.m53271i(lukVar);
        return new ShareHousekeepingWorkerImpl(new ezw0(vyr0Var, xreVar, lukVar, 20), context, workerParameters);
    }

    @Override // p204p.yvy
    /* JADX INFO: renamed from: j */
    public fwy mo28559j(ovy ovyVar) {
        return ((m12) this.f120692b).mo28559j(ovyVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public Object m55849k(String str, ibk ibkVar) {
        htz htzVar;
        if (ibkVar instanceof htz) {
            htzVar = (htz) ibkVar;
            int i = htzVar.f95212c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htzVar.f95212c = i - Integer.MIN_VALUE;
            } else {
                htzVar = new htz(this, ibkVar);
            }
        } else {
            htzVar = new htz(this, ibkVar);
        }
        Object obj = htzVar.f95210a;
        int i2 = htzVar.f95212c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single map = z5f.m95456b((z5f) this.f120692b, str, new String[]{str}).map(new ze8(str, 3));
        htzVar.f95212c = 1;
        Object objM96567o = zn91.m96567o(map, htzVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    @Override // p204p.yvy
    /* JADX INFO: renamed from: n */
    public ovy mo28560n(String str) {
        return ((m12) this.f120692b).mo28560n(str);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        Exception excM65555t;
        mzx0 mzx0Var = (mzx0) this.f120692b;
        boolean zMo1518j = task.mo1518j();
        w2a1 w2a1Var = w2a1.f247311a;
        if (zMo1518j) {
            mzx0Var.resumeWith(w2a1Var);
            return;
        }
        Exception excMo1514f = task.mo1514f();
        if (excMo1514f == null || (excM65555t = nsg1.m65555t(excMo1514f)) == null) {
            mzx0Var.resumeWith(w2a1Var);
        } else {
            mzx0Var.resumeWith(new c6x0(excM65555t));
        }
    }

    public k9u(ConstraintLayout constraintLayout, EncoreButton encoreButton, TextView textView, TextView textView2) {
        this.f120691a = 17;
        this.f120692b = constraintLayout;
    }

    public k9u(int i) {
        this.f120691a = i;
        switch (i) {
            case 28:
                this.f120692b = pf40.m69788m();
                break;
        }
    }

    public k9u(rwt0 rwt0Var) {
        this.f120691a = 12;
        this.f120692b = (CaptureSessionOnClosedNotCalledQuirk) rwt0Var.m76583e(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Integer numValueOf;
        fg8 fg8Var;
        switch (this.f120691a) {
            case 1:
                l3v l3vVar = (l3v) ((h2v) this.f120692b).f87074i;
                return new v1k(false, false, false, true, false, ((Boolean) obj).booleanValue(), false, false, l3vVar.f129445a.m38343d(), l3vVar.f129445a.m38346g(), false, false, false, 62370);
            case 3:
                return xst.m91972c((xst) this.f120692b, ((GetEntityResponse) obj).m15422n().m15415t().m15449n().m15424n());
            case 5:
                acw acwVar = ((dcw) this.f120692b).f47650a;
                boolean z = ((pkt) obj).f178548a;
                fnw fnwVar = acwVar.f14469a;
                lnw lnwVarM19526t = EsPrefs$Value.m19526t();
                lnwVarM19526t.m59512m(z);
                EsPrefs$Value esPrefs$Value = (EsPrefs$Value) lnwVarM19526t.build();
                wj50.m88279p(esPrefs$Value);
                return fnwVar.m42237d(esPrefs$Value, "audio.equalizer_v2");
            case 6:
                hrw hrwVar = (hrw) this.f120692b;
                return hrwVar.m48413b(new xcw(3, ((w7p0) obj).f248730a, hrwVar)).flatMap(new grw(hrwVar));
            case 7:
                String str = (String) obj;
                kx21 kx21Var = (kx21) ((c0y) this.f120692b).f32910g.get();
                wj50.m88279p(str);
                return ((hy21) kx21Var).m49110d(str);
            case 10:
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    dcz dczVar = (dcz) this.f120692b;
                    dczVar.f47668d.observeOn(dczVar.f47665a).map(y4y.f269267c).observeOn(dczVar.f47667c).subscribe();
                }
                return bool;
            case 13:
                int iM38547C = edb.m38547C(((zl21) obj).mo63805a());
                if (iM38547C != 1) {
                    numValueOf = iM38547C != 2 ? null : Integer.valueOf(R.string.freetier_education_toastie_skip_too_fast);
                } else {
                    numValueOf = Integer.valueOf(R.string.freetier_education_toastie_skip_first);
                }
                if (numValueOf != null) {
                    return new CompletableFromAction(new ok0(27, (xyx) this.f120692b, numValueOf));
                }
                return CompletableEmpty.f7437a;
            case 15:
                return new h410(((l410) this.f120692b).f129477a, (List) obj);
            case 27:
                yc8 yc8Var = (yc8) obj;
                s860 s860Var = (s860) this.f120692b;
                int i = yc8Var.f271425b.f79567a;
                hg8 hg8Var = yc8Var.f271426c;
                int i2 = s860Var.f206569d;
                int iOrdinal = hg8Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        i2 = s860Var.f206570e;
                    } else if (iOrdinal == 2) {
                        i2 = s860Var.f206571f;
                    } else if (iOrdinal == 6) {
                        i2 = s860Var.f206572g;
                    } else if (iOrdinal == 7) {
                        i2 = s860Var.f206573h;
                    } else if (iOrdinal == 9) {
                        i2 = s860Var.f206574i;
                    } else if (iOrdinal == 10) {
                        i2 = s860Var.f206575j;
                    }
                }
                double dPow = Math.pow(10.0d, (((double) i2) - ((double) i)) / (((double) 10) * s860Var.f206566a));
                if (dPow <= s860Var.f206568c) {
                    fg8Var = fg8.f69242a;
                } else {
                    fg8Var = dPow <= s860Var.f206567b ? fg8.f69243b : fg8.f69244c;
                }
                return new yc8(yc8Var.f271424a, new gg8(i, fg8Var), hg8Var, yc8Var.f271427d);
            default:
                e301 e301Var = (e301) obj;
                z470 z470Var = (z470) this.f120692b;
                if (mkg1.m62160v(e301Var) && e301Var.f55572b) {
                    Single singleFlatMap = z470Var.f279152e.m61846a().flatMap(new wfx(z470Var, 21));
                    wj50.m88279p(singleFlatMap);
                    return singleFlatMap;
                }
                Single singleJust = Single.just(i4y0.f98660a);
                wj50.m88279p(singleJust);
                return singleJust;
        }
    }
}
