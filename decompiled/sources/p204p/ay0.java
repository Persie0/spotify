package p204p;

import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.spotify.browse.clientnative.mobius.BrowseEffect;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.browse.clientnative.mobius.C0318b;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ay0 extends ri00 implements eh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f21056h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f21056h = i4;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        ContentCaptureSession contentCaptureSessionM27754a;
        Object value;
        int i = this.f21056h;
        nau nauVar = nau.f152117a;
        aoj aojVar = aoj.f17700a;
        xnj xnjVar = xnj.f263632a;
        int i2 = 1;
        fbk fbkVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f78014b;
        switch (i) {
            case 0:
                by0 by0Var = (by0) obj;
                if (by0Var.f32028a) {
                    by0Var.f32028a = false;
                    by0Var.f32030c.mo47722z(by0Var);
                }
                return w2a1Var;
            case 1:
                ((d31) obj).f44724N0.setContent(ozf.f172261b);
                return w2a1Var;
            case 2:
                xq1 xq1Var = (xq1) obj;
                kv91 kv91Var = xq1Var.f264839a;
                q8g0 q8g0Var = xq1Var.f264840b;
                q8g0Var.getClass();
                yt91 yt91VarM96903c = q8g0Var.f186318a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("filter_container", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("text_field", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("key_stroke", 1), new bv91("filter", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 3:
                ((xq1) obj).m91808f();
                return w2a1Var;
            case 4:
                ((bc2) obj).f25757g.onNext(cc2.f36281a);
                return w2a1Var;
            case 5:
                ((bc2) obj).f25757g.onNext(gc2.f78458a);
                return w2a1Var;
            case 6:
                return (or2) ((i4t0) obj).get();
            case 7:
                View view = (View) obj;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    ci11.m32832A(view);
                }
                if (i3 < 29 || (contentCaptureSessionM27754a = b0b1.m27754a(view)) == null) {
                    return null;
                }
                return new bgj(contentCaptureSessionM27754a, view);
            case 8:
                dg5 dg5Var = (dg5) obj;
                nuu0 nuu0Var = dg5Var.f48723g;
                String str = ((eg5) nuu0Var.f158717a.getValue()).f59218a;
                if (((eg5) nuu0Var.f158717a.getValue()).m38773b()) {
                    zv41 zv41Var = dg5Var.f48721e;
                    do {
                        value = zv41Var.getValue();
                    } while (!zv41Var.m97089k(value, eg5.m38772a((eg5) value, null, true, null, false, 9)));
                    x0h1.m89578u(dg5Var.f48720d, null, 0, new jr4(dg5Var, str, fbkVar, 4), 3);
                }
                return w2a1Var;
            case 9:
                ((zn5) obj).mo33826e();
                return w2a1Var;
            case 10:
                ty6 ty6Var = (ty6) obj;
                z9j0 z9j0Var = ty6Var.f224846b;
                if (z9j0Var.mo47349j(ty6Var.f224845a)) {
                    z9j0Var.mo47345e();
                } else {
                    ty6Var.f224847c.mo55548j();
                }
                return w2a1Var;
            case 11:
                ((oj7) obj).f165982a.onNext(cfq0.f37424a);
                return w2a1Var;
            case 12:
                un9 un9Var = (un9) obj;
                x0h1.m89578u(un9Var.f232105i, null, 0, new on9(un9Var, fbkVar, i2), 3);
                return w2a1Var;
            case 13:
                vv91 vv91Var = ((nx9) obj).f159407N1;
                if (vv91Var == null) {
                    wj50.m88260d0("ubiPageLocationChangeListener");
                    throw null;
                }
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                ((sfa0) vv91Var).m78000H(xgg1.m90927z5());
                return w2a1Var;
            case 14:
                fna fnaVar = (fna) obj;
                fnaVar.getClass();
                PublishSubject publishSubject = new PublishSubject();
                BrowseState.Loading loading = BrowseState.Loading.INSTANCE;
                fnaVar.f71239L0 = false;
                C0318b c0318b = fnaVar.f71244d;
                c0318b.getClass();
                gna gnaVar = new gna();
                CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
                coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(qpv0.f191387a.mo54112b(BrowseEffect.Load.class), new C1037x558fa59a().m15633a(new lna(c0318b.f3114c)));
                MobiusLoop mobiusLoopMo15595g = Mobius.m15582d(gnaVar, new C1044a(c0318b.f3112a, coroutinesSubtypeEffectHandlerBuilderM42464h)).mo15592d(new hna(c0318b)).mo15590b(new ina(c0318b)).mo15597i(new C2300qn(2, xsr.f265651a, new jna(c0318b, null))).mo15595g(loading);
                fnaVar.f71243Z = mobiusLoopMo15595g.m15601b(new cna(fnaVar, publishSubject));
                fnaVar.f71242Y = mobiusLoopMo15595g;
                return k0e1.m54985d(publishSubject.distinctUntilChanged(dna.f50714a).map(new ena(fnaVar)));
            case 15:
                ((z9j0) obj).mo47345e();
                return w2a1Var;
            case 16:
                return (ago) ((er70) obj).get();
            case 17:
                return (nfi0) ((i4t0) obj).get();
            case 18:
                ChoiceScreenUcActivity choiceScreenUcActivity = (ChoiceScreenUcActivity) obj;
                q6e q6eVar = ChoiceScreenUcActivity.f4108w1;
                i6m0 i6m0VarM11165p0 = choiceScreenUcActivity.m11165p0();
                bbg0 bbg0Var = choiceScreenUcActivity.f4119j1;
                if (bbg0Var == null) {
                    wj50.m88260d0("ubiEventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c3 = bbg0Var.f25561b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("item_unavailable", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("go_back_cta", null, null, null, null));
                yt91VarM96903c4.f276056j = true;
                ((zz8) i6m0VarM11165p0).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nauVar), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                choiceScreenUcActivity.m11166q0().m15621f(n8e.f151509a);
                return w2a1Var;
            case 19:
                ((dqi) obj).m36641e();
                return w2a1Var;
            case 20:
                ((upj) obj).m83710a(aojVar);
                return w2a1Var;
            case 21:
                ((upj) obj).m83710a(coj.f40277a);
                return w2a1Var;
            case 22:
                ((upj) obj).m83710a(aojVar);
                return w2a1Var;
            case 23:
                ((upj) obj).m83710a(xnjVar);
                return w2a1Var;
            case 24:
                ((rze) obj).f204143b.m84032w(0.0f);
                return w2a1Var;
            case 25:
                ((upj) obj).m83710a(xnjVar);
                return w2a1Var;
            case 26:
                ((n3k) obj).dismiss();
                return w2a1Var;
            case 27:
                ((r4l) obj).getClass();
                return Boolean.valueOf(wl51.m88496t0(Thread.currentThread().getName(), "Firebase Background Thread #", false));
            case 28:
                ((r4l) obj).getClass();
                return Boolean.valueOf(wl51.m88496t0(Thread.currentThread().getName(), "Firebase Blocking Thread #", false));
            default:
                ((r4l) obj).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ay0(int i) {
        this.f21056h = i;
        r4l r4lVar = rb5.f197468i;
        switch (i) {
            case 28:
                super(0, r4lVar, r4l.class, "isBlockingThread", "isBlockingThread()Z", 0, 0);
                break;
            case 29:
                super(0, r4lVar, r4l.class, "isNotMainThread", "isNotMainThread()Z", 0, 0);
                break;
            default:
                super(0, r4lVar, r4l.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay0(Object obj) {
        super(0, obj, zn5.class, "logUpdateConfirmationDialogImpression", "logUpdateConfirmationDialogImpression()V", 0, 0);
        this.f21056h = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay0(oz3 oz3Var) {
        super(0, oz3Var, b04.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0);
        this.f21056h = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay0(ty6 ty6Var) {
        super(0, ty6Var, ty6.class, "close", "close()V", 0, 0);
        this.f21056h = 10;
    }
}
