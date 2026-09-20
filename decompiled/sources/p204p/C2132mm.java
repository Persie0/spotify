package p204p;

import android.R;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.audiorecognition.p030v1.AudioRecognitionRequest;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.mm */
/* JADX INFO: loaded from: classes11.dex */
public final class C2132mm implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f144985b;

    public /* synthetic */ C2132mm(Object obj, int i) {
        this.f144984a = i;
        this.f144985b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m62253b(api apiVar, fbk fbkVar) {
        ha0 ha0Var;
        Object c6x0Var;
        if (fbkVar instanceof ha0) {
            ha0Var = (ha0) fbkVar;
            int i = ha0Var.f89082c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ha0Var.f89082c = i - Integer.MIN_VALUE;
            } else {
                ha0Var = new ha0(this, fbkVar);
            }
        } else {
            ha0Var = new ha0(this, fbkVar);
        }
        Object obj = ha0Var.f89080a;
        int i2 = ha0Var.f89082c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                ja0 ja0Var = (ja0) this.f144985b;
                xi70 xi70Var = ja0Var.f110290b;
                String strMo26689e = apiVar.mo26689e();
                ((wy3) ja0Var.f110292d).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ha0Var.f89082c = 1;
                Object objM91090d = xi70Var.m91090d(jCurrentTimeMillis, strMo26689e, ha0Var);
                yuk yukVar = yuk.f276404a;
                if (objM91090d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            c6x0Var = w2a1Var;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3966b("DevicePredictability: Failed to save active device ID", thM77348a);
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r8.m37657B(r7, r0) == r5) goto L29;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m62254c(jjk jjkVar, fbk fbkVar) {
        blb blbVar;
        Object c6x0Var;
        Throwable thM77348a;
        if (fbkVar instanceof blb) {
            blbVar = (blb) fbkVar;
            int i = blbVar.f28152c;
            if ((i & Integer.MIN_VALUE) != 0) {
                blbVar.f28152c = i - Integer.MIN_VALUE;
            } else {
                blbVar = new blb(this, fbkVar);
            }
        } else {
            blbVar = new blb(this, fbkVar);
        }
        Object obj = blbVar.f28150a;
        int i2 = blbVar.f28152c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                e3p e3pVar = (e3p) ((clb) this.f144985b).f39232c;
                boolean zM88271j = wj50.m88271j(jjkVar, hjk.f92064a);
                yuk yukVar = yuk.f276404a;
                if (zM88271j) {
                    blbVar.f28152c = 1;
                    if (e3pVar.m37658C(blbVar) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (!(jjkVar instanceof ijk)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((ijk) jjkVar).f102816a;
                    blbVar.f28152c = 2;
                }
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a != null) {
                    qlg1.m73220y(blbVar.getContext());
                    Logger.m3967c(thM77348a, "Failed to refresh chat", new Object[0]);
                }
                return w2a1Var;
            }
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            c6x0Var = w2a1Var;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            qlg1.m73220y(blbVar.getContext());
            Logger.m3967c(thM77348a, "Failed to refresh chat", new Object[0]);
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public Object m62255d(fbk fbkVar) {
        C2057km c2057km;
        di41 di41Var;
        C2169nm c2169nm = (C2169nm) this.f144985b;
        if (fbkVar instanceof C2057km) {
            c2057km = (C2057km) fbkVar;
            int i = c2057km.f124020c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2057km.f124020c = i - Integer.MIN_VALUE;
            } else {
                c2057km = new C2057km(this, fbkVar);
            }
        } else {
            c2057km = new C2057km(this, fbkVar);
        }
        Object objM90447b = c2057km.f124018a;
        int i2 = c2057km.f124020c;
        if (i2 == 0) {
            bga.m29073P(objM90447b);
            xf10 xf10Var = (xf10) c2169nm.f155196b;
            C2038k3 c2038k3 = new C2038k3(c2169nm, 4);
            c2057km.f124020c = 1;
            objM90447b = xf10Var.m90447b(c2038k3, c2057km);
            yuk yukVar = yuk.f276404a;
            if (objM90447b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM90447b);
        }
        if (((Boolean) objM90447b).booleanValue() && (di41Var = c2169nm.f155200f) != null) {
            di41Var.mo26601e(null);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03ed  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        cbm0 cbm0VarM90662N1;
        FrameLayout frameLayout;
        nv8 nv8Var;
        pqm0 pqm0Var;
        MessageResponseToken messageResponseToken;
        int i = this.f144984a;
        Object[] objArr = 0;
        int i2 = 2;
        int i3 = 1;
        yuk yukVar = yuk.f276404a;
        Object[] objArr2 = 0;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f144985b;
        switch (i) {
            case 0:
                return m62255d(fbkVar);
            case 1:
                return m62253b((api) obj, fbkVar);
            case 2:
                ((cw0) obj2).f42590f.m97090l((sv0) obj);
                return w2a1Var;
            case 3:
                eh00 eh00Var = ((owv0) obj2).f170791c;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return w2a1Var;
            case 4:
                c52 c52Var = (c52) obj2;
                int iOrdinal = ((d92) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        c52Var.f34053a.mo47345e();
                    } else if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            c52Var.f34053a.mo47345e();
                        } else {
                            if (iOrdinal != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c52Var.f34056d = true;
                            di41 di41Var = c52Var.f34057e;
                            if (di41Var != null) {
                                di41Var.mo26601e(null);
                            }
                            c52Var.f34057e = null;
                        }
                    }
                }
                return w2a1Var;
            case 5:
                ed2 ed2Var = (ed2) obj;
                wc2 wc2Var = (wc2) obj2;
                pfm0 pfm0Var = wc2Var.f249939g;
                if (!(ed2Var instanceof cd2)) {
                    if (!wj50.m88271j(ed2Var, bd2.f25978a) && !wj50.m88271j(ed2Var, dd2.f47694a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pfm0Var.m69810a(new tq9((boolean) (objArr == true ? 1 : 0), i2));
                    Object objM44621a = wc2Var.f249935c.m44621a(fbkVar);
                    return objM44621a == yukVar ? objM44621a : w2a1Var;
                }
                obq0 obq0Var = wc2Var.f249938f;
                cd2 cd2Var = (cd2) ed2Var;
                int i4 = cd2Var.f36713a;
                obq0Var.f163695a.mo59114a(new qbq0(objArr2 == true ? 1 : 0, i3, kkc0.m56695h0(new pqm0("reason", fr0.m42451B(i4)), new pqm0("source", fr0.m42482z(cd2Var.f36714b))), "age_signal_blocked_page_shown"));
                int iM38547C = edb.m38547C(i4);
                if (iM38547C == 0) {
                    AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                    cbm0VarM90662N1 = xgg1.m90662N1("AGE_SIGNAL_BLOCKED_CONFIRM_AGE", "age-signal/blocked/confirm-age", 131, "age-signal");
                } else if (iM38547C == 1) {
                    AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                    cbm0VarM90662N1 = xgg1.m90662N1("AGE_SIGNAL_BLOCKED_ASK_PARENT", "age-signal/blocked/ask-parent", 130, "age-signal");
                } else {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AtomicReferenceArray atomicReferenceArray3 = cbm0.f36163e;
                    cbm0VarM90662N1 = xgg1.m90662N1("AGE_SIGNAL_BLOCKED_PARENT_SETUP", "age-signal/blocked/parent-setup", 132, "age-signal");
                }
                pfm0Var.m69810a(new q040(cbm0VarM90662N1, zc2.f281438b, null));
                return w2a1Var;
            case 6:
                Object objM42556b = fse0.m42556b((fse0) ((hd2) obj2).f89969b.f30112b, zc2.f281438b.f243453a, cse0.f41527a, null, fbkVar, 20);
                if (objM42556b != yukVar) {
                    objM42556b = w2a1Var;
                }
                return objM42556b == yukVar ? objM42556b : w2a1Var;
            case 7:
                uyc uycVar = (uyc) obj;
                xn2 xn2Var = (xn2) obj2;
                if (uycVar instanceof ryc) {
                    xn2Var.m91489f();
                } else {
                    if (!(uycVar instanceof tyc) && !(uycVar instanceof qyc) && !(uycVar instanceof syc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ck2) ((aj2) ((er70) xn2Var.f263491d).get())).m33057N(true);
                    ComposeView composeView = (ComposeView) xn2Var.f263494g;
                    if ((composeView != null ? composeView.getParent() : null) == null && (frameLayout = (FrameLayout) ((r55) xn2Var.f263490c).findViewById(R.id.content)) != null) {
                        ComposeView composeView2 = new ComposeView((r55) xn2Var.f263490c, null, 0, 6, null);
                        composeView2.setViewCompositionStrategy(mkr0.f144646T0);
                        composeView2.setContent(new fyf(new wn2(xn2Var, i3), true, 83245288));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 80;
                        frameLayout.addView(composeView2, layoutParams);
                        xn2Var.f263494g = composeView2;
                    }
                }
                return w2a1Var;
            case 8:
                ((b43) obj2).f23209k.m97090l((z33) obj);
                return w2a1Var;
            case 9:
                fw40 fw40Var = (fw40) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC2254pf.m69755L(fw40Var.m42932v(), (View) fw40Var.f73934b);
                }
                return w2a1Var;
            case 10:
                ((ujh) obj2).mo83286i();
                return w2a1Var;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                zv41 zv41Var = ((yd5) obj2).f271675Z;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                return w2a1Var;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                zv41 zv41Var2 = ((mq5) obj2).f146164R0;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, bool2);
                return w2a1Var;
            case 13:
                qho qhoVar = (qho) obj;
                sb6 sb6Var = (sb6) obj2;
                if (qhoVar instanceof nho) {
                    sb6Var.m35105h(new IllegalStateException(((nho) qhoVar).f154041a.getMessage()));
                } else if (qhoVar instanceof oho) {
                    sb6Var.f207363f = new tb6((List) ((oho) qhoVar).f165512a);
                    sb6Var.m35106i();
                } else {
                    if (!wj50.m88271j(qhoVar, pho.f177693a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sb6Var.m35107j();
                }
                return w2a1Var;
            case 14:
                ((th00) obj2).invoke(new Integer(((Number) obj).intValue()), Boolean.FALSE);
                return w2a1Var;
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    zv41 zv41Var3 = ((hw6) obj2).f95867c;
                    Boolean bool3 = Boolean.TRUE;
                    zv41Var3.getClass();
                    zv41Var3.m97091m(null, bool3);
                }
                return w2a1Var;
            case 16:
                AudioRecognitionRequest audioRecognitionRequest = (AudioRecognitionRequest) obj;
                byte[] byteArray = audioRecognitionRequest.toByteArray();
                wj50.m88279p(byteArray);
                if (!((yvu0) ((old1) obj2)).m94751f(2, a7j0.m24946H(byteArray))) {
                    throw new IllegalStateException("AudioRecognition WebSocket rejected a request");
                }
                if (audioRecognitionRequest.m3456p() == 1) {
                    new Integer(audioRecognitionRequest.m3457q().m3469s());
                    new Integer(audioRecognitionRequest.m3457q().m3468q());
                    audioRecognitionRequest.m3457q().getClass();
                }
                return w2a1Var;
            case 17:
                zl7 zl7Var = (zl7) obj;
                yum0 yum0Var = ((sl7) obj2).f210311g;
                if (!wj50.m88271j(yum0Var.getValue(), zl7Var)) {
                    yum0Var.setValue(zl7Var);
                }
                return w2a1Var;
            case 18:
                String str = (String) obj;
                ora0 ora0Var = ((nr7) obj2).f157461d;
                wj50.m88279p(str);
                ora0Var.f168519d = str;
                ora0Var.m67689a(new zz70(str, 12));
                return w2a1Var;
            case 19:
                if (((Boolean) obj).booleanValue() && (pqm0Var = (nv8Var = (nv8) obj2).f158834h) != null && (messageResponseToken = (MessageResponseToken) pqm0Var.f180350a) != null) {
                    ((bdl0) nv8Var.f158830d).m28838a(messageResponseToken);
                }
                return w2a1Var;
            case 20:
                ((mv8) obj2).invoke(fbkVar);
                return w2a1Var;
            case 21:
                ((lv8) obj2).invoke(fbkVar);
                return w2a1Var;
            case 22:
                ((lv8) obj2).invoke(fbkVar);
                return w2a1Var;
            case 23:
                z9j0 z9j0Var = (z9j0) ((xa9) obj2).f259621b;
                String str2 = jfb1.f111875b.f243453a;
                Boolean bool4 = Boolean.TRUE;
                if (str2 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo47348i(new p6j0(str2, "", true, false, 0, 0, false, null, null, null), pp91.m70529j(new pqm0("has_expired", bool4)));
                return w2a1Var;
            case 24:
                if (((Boolean) obj).booleanValue()) {
                    dfa dfaVar = (dfa) obj2;
                    adl0 adl0Var = dfaVar.f48542e;
                    MessageResponseToken messageResponseToken2 = dfaVar.f48547j;
                    if (messageResponseToken2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ((bdl0) adl0Var).m28838a(messageResponseToken2);
                }
                return w2a1Var;
            case 25:
                ((Boolean) obj).getClass();
                Object objM44622b = ((gfi0) ((nh61) obj2).f153885c).m44622b(new p6j0("spotify:find", "", true, false, 0, 0, false, null, null, null), null, fbkVar);
                return objM44622b == yukVar ? objM44622b : w2a1Var;
            case 26:
                Boolean bool5 = (Boolean) obj;
                bool5.getClass();
                zv41 zv41Var4 = (zv41) ((mma) obj2).f145090e.f153886d;
                zv41Var4.getClass();
                zv41Var4.m97091m(null, bool5);
                return w2a1Var;
            case 27:
                pqm0 pqm0Var2 = (pqm0) obj;
                v3a0 v3a0Var = (v3a0) pqm0Var2.f180350a;
                ebf0 ebf0Var = (ebf0) pqm0Var2.f180351b;
                fna fnaVar = (fna) obj2;
                int i5 = fnaVar.f71249i.m40708d() ? 0 : 10;
                if (v3a0Var.mo60646h() && ((AbstractC2328r7) ebf0Var.f57921a).mo36659c() >= i5) {
                    fnaVar.m35106i();
                } else if (v3a0Var.mo66186c()) {
                    fnaVar.m35107j();
                } else if (!v3a0Var.mo60646h()) {
                    fnaVar.m35104g();
                }
                return w2a1Var;
            case 28:
                return m62254c((jjk) obj, fbkVar);
            default:
                ((drb) obj2).f52280b = (xe50) obj;
                return w2a1Var;
        }
    }

    public /* synthetic */ C2132mm(xuk xukVar, Object obj, int i) {
        this.f144984a = i;
        this.f144985b = obj;
    }
}
