package p204p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionListInteraction;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.d5 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1766d5 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45281b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1766d5(int i, Object obj, Object obj2) {
        super(0);
        this.f45280a = i;
        this.f45281b = obj;
        this.f45282c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0532  */
    @Override // p204p.eh00
    public final Object invoke() {
        av91 av91Var;
        int i = this.f45280a;
        nau nauVar = nau.f152117a;
        boolean z = true;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f45282c;
        Object obj2 = this.f45281b;
        switch (i) {
            case 0:
                return new cjc0((dut) ((C1802e5) obj2).f56201a.invoke((q2c) obj), C2076l3.f129136P0);
            case 1:
                ((gh00) obj2).invoke(w2a1Var);
                ((eh00) ((gzl) obj).f85983e).invoke();
                return w2a1Var;
            case 2:
                AccessibilityManager accessibilityManager = ((C2014jg) obj2).f111989b;
                if (accessibilityManager != null) {
                    accessibilityManager.removeAccessibilityStateChangeListener((AccessibilityManagerAccessibilityStateChangeListenerC1740cg) obj);
                }
                return w2a1Var;
            case 3:
                AccessibilityManager accessibilityManager2 = ((C2014jg) obj2).f111989b;
                if (accessibilityManager2 != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener((AccessibilityManagerTouchExplorationStateChangeListenerC1896gg) obj);
                }
                return w2a1Var;
            case 4:
                ((C2014jg) obj2).f111988a.getContentResolver().unregisterContentObserver((C1936hg) obj);
                return w2a1Var;
            case 5:
                sir0 sir0Var = (sir0) obj2;
                AccessibilityManager accessibilityManager3 = (AccessibilityManager) obj;
                if (!accessibilityManager3.isEnabled()) {
                    z = false;
                } else if (!accessibilityManager3.isTouchExplorationEnabled()) {
                    if (accessibilityManager3.isEnabled()) {
                        Iterator<AccessibilityServiceInfo> it = accessibilityManager3.getEnabledAccessibilityServiceList(-1).iterator();
                        while (it.hasNext()) {
                            if (wl51.m88496t0(it.next().getId(), "SwitchAccessService", true)) {
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                }
                return new unc(sir0Var.mo30231j(Boolean.valueOf(z)));
            case 6:
                jh41 jh41Var = (jh41) obj;
                if (!((List) obj2).isEmpty() && ((Boolean) jh41Var.f112337d.getValue()).booleanValue()) {
                    jh41Var.f112337d.setValue(Boolean.FALSE);
                }
                return w2a1Var;
            case 7:
                jh41 jh41Var2 = (jh41) obj2;
                String str = (String) obj;
                jh41Var2.f112335b.remove(str);
                jh41Var2.f112334a.remove(str);
                jh41Var2.m53327a();
                return w2a1Var;
            case 8:
                ((sf0) obj2).f208420a.mo58242e((rf0) obj);
                return w2a1Var;
            case 9:
                ol0 ol0Var = (ol0) obj2;
                lbk0 lbk0Var = ol0Var.f166713c;
                jz1 jz1Var = (jz1) ol0Var.f166714d.mo25006a();
                x02 x02Var = (x02) obj;
                k02 k02Var = new k02(x02Var.f256772i, x02Var.f256773t, x02Var.f256766c, x02Var.f256761X, x02Var.f256765b, x02Var.f256769f, "ad_npv");
                Bundle bundle = new Bundle();
                bundle.putParcelable("ad-data", k02Var);
                jz1Var.m49706b1(bundle);
                lbk0Var.mo58667d(jz1Var, "AdsDsaDialogFragment");
                return w2a1Var;
            case 10:
                nu0 nu0Var = (nu0) obj2;
                int i2 = nu0Var.f158467b;
                int i3 = nu0Var.f158468c;
                int iLongValue = (int) ((Number) ((kqi0) obj).getValue()).longValue();
                return Boolean.valueOf(i2 <= iLongValue && iLongValue <= i3);
            case 11:
                ((gh00) obj2).invoke(new ow0(((wum0) obj).m89067v()));
                return w2a1Var;
            case 12:
                d31 d31Var = (d31) obj2;
                kv91 kv91Var = d31Var.f44737f;
                wfh0 wfh0Var = d31Var.f44730Y;
                wfh0Var.getClass();
                yt91 yt91VarM96903c = wfh0Var.f250849a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57452p(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()));
                sfa0 sfa0Var = d31Var.f44738g;
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                sfa0Var.m78000H(xgg1.m90590D());
                d31Var.f44725O0.onNext(new vhx(((o21) obj).f160909d, null));
                return w2a1Var;
            case 13:
                d31 d31Var2 = (d31) obj2;
                d31Var2.f44737f.mo57452p((av91) obj);
                sfa0 sfa0Var2 = d31Var2.f44738g;
                AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                sfa0Var2.m78000H(xgg1.m90590D());
                d31Var2.f44725O0.onNext(new vhx(false, null));
                return w2a1Var;
            case 14:
                d31 d31Var3 = (d31) obj2;
                ((ubq0) d31Var3.f44732a.f194478b).mo59114a(new sbq0("adaptive_authentication", "close", n850.f151357c, "too_young_error"));
                d31Var3.f44725O0.onNext(new vhx(((w21) obj).f247204d, null));
                return w2a1Var;
            case 15:
                ((gh00) obj2).invoke(new ob1(((ubl0) obj).f228817a));
                return w2a1Var;
            case 16:
                yd1 yd1Var = (yd1) obj;
                ((gh00) obj2).invoke(new sd1(yd1Var.f271617d, yd1Var.f271618e, yd1Var.f271614a.f112009g.f128556b));
                return w2a1Var;
            case 17:
                ((gh00) obj2).invoke((uj1) obj);
                return w2a1Var;
            case 18:
                ((gh00) obj2).invoke((wj1) obj);
                return w2a1Var;
            case 19:
                x0h1.m89578u((xuk) obj2, null, 0, new ds1((u9m) obj, null, 0), 3);
                return w2a1Var;
            case 20:
                kx1 kx1Var = (kx1) obj2;
                i6m0 i6m0Var = kx1Var.f127294F1;
                if (i6m0Var == null) {
                    wj50.m88260d0("pageBoundUbiLogger");
                    throw null;
                }
                bbg0 bbg0Var = kx1Var.f127303O1;
                if (bbg0Var == null) {
                    wj50.m88260d0("ubiEventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c2 = bbg0Var.f25561b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("edit_address", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                String str2 = ((kvy) obj).f126977a;
                yt91 yt91VarM96903c3 = zt91VarM94607a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("form_field", str2, null, null, null));
                yt91VarM96903c3.f276056j = true;
                ((zz8) i6m0Var).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("focus_input_field", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 21:
                kx1 kx1Var2 = (kx1) obj2;
                i6m0 i6m0Var2 = kx1Var2.f127294F1;
                if (i6m0Var2 == null) {
                    wj50.m88260d0("pageBoundUbiLogger");
                    throw null;
                }
                bbg0 bbg0Var2 = kx1Var2.f127303O1;
                if (bbg0Var2 == null) {
                    wj50.m88260d0("ubiEventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c4 = bbg0Var2.f25561b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("edit_address", null, null, null, null));
                yt91VarM96903c4.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c4.m94607a();
                String str3 = ((jvy) obj).f116541a;
                yt91 yt91VarM96903c5 = zt91VarM94607a2.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("form_field", str3, null, null, null));
                yt91VarM96903c5.f276056j = true;
                ((zz8) i6m0Var2).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("focus_input_field", 1, nauVar), yt91VarM96903c5.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                t0h1 t0h1VarM57578h1 = kx1Var2.m57578h1();
                qre0 qre0Var = (qre0) t0h1VarM57578h1.f215890c;
                fw1 fw1VarM6719o = AddressCollectionListInteraction.m6719o();
                fw1VarM6719o.m42909m(((UUID) t0h1VarM57578h1.f215892e).toString());
                qre0Var.m73616a(fw1VarM6719o.build());
                return w2a1Var;
            case 22:
                kx1 kx1Var3 = (kx1) obj2;
                i6m0 i6m0Var3 = kx1Var3.f127294F1;
                if (i6m0Var3 == null) {
                    wj50.m88260d0("pageBoundUbiLogger");
                    throw null;
                }
                bbg0 bbg0Var3 = kx1Var3.f127303O1;
                if (bbg0Var3 == null) {
                    wj50.m88260d0("ubiEventFactory");
                    throw null;
                }
                yt91 yt91VarM96903c6 = bbg0Var3.f25561b.m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("edit_address", null, null, null, null));
                yt91VarM96903c6.f276056j = true;
                zt91 zt91VarM94607a3 = yt91VarM96903c6.m94607a();
                String str4 = ((hvy) obj).f95812a;
                yt91 yt91VarM96903c7 = zt91VarM94607a3.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("form_field", str4, null, null, null));
                yt91VarM96903c7.f276056j = true;
                ((zz8) i6m0Var3).mo57453r(new av91("", "", new dv91("hit", 1), new bv91("focus_input_field", 1, nauVar), yt91VarM96903c7.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return w2a1Var;
            case 23:
                ((ViewTreeObserver) ((ood0) obj2).f167567d).removeOnGlobalLayoutListener((zx1) obj);
                return w2a1Var;
            case 24:
                ((cy1) obj2).f43137a.removeOnAttachStateChangeListener((ay1) obj);
                return w2a1Var;
            case 25:
                ((cy1) obj2).f43138b.removeOnScrollChangedListener((by1) obj);
                return w2a1Var;
            case 26:
                a12 a12Var = (a12) obj;
                return new hog0(24, a12Var.f11266c1.path(), a12Var.f11268d1.f243453a, nsg1.m65548m((View) obj2));
            case 27:
                return ((k7p0) obj2).m55694a((ca2) ((wg61) ((ka2) obj).f120758e).getValue()).m77807a();
            case 28:
                wc2 wc2Var = (wc2) obj2;
                kv91 kv91Var2 = wc2Var.f249937e;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-age-signal-blocked-parent-setup";
                yt91VarM50626j.f276052f = "1.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j, "age-signal/blocked/parent-setup");
                yt91VarM42473q.f276055i.add(new bu91("ask_guardian_button", null, null, null, null));
                yt91VarM42473q.f276056j = false;
                zt91 zt91VarM94607a4 = yt91VarM42473q.m94607a();
                String str5 = xoc1.f263917J6.f243453a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str5 != null ? str5.toString() : null;
                if (string == null) {
                    string = "";
                }
                x0h1.m89578u((xuk) obj, null, 0, new fa2(wc2Var, kv91Var2.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis()), null), null, 1), 3);
                return w2a1Var;
            default:
                wc2 wc2Var2 = (wc2) obj2;
                kv91 kv91Var3 = wc2Var2.f249937e;
                int iM38547C = edb.m38547C(((cd2) obj).f36713a);
                if (iM38547C == 0) {
                    zt91 zt91Var2 = zt91.f286105i;
                    yt91 yt91VarM50626j2 = ihf1.m50626j();
                    yt91VarM50626j2.f276054h = "music";
                    yt91VarM50626j2.f276047a = "mobile-age-signal-blocked-confirm-age";
                    yt91VarM50626j2.f276052f = "1.0.0";
                    yt91VarM50626j2.f276053g = "20.0.5";
                    yt91 yt91VarM42473q2 = fr0.m42473q(yt91VarM50626j2, "age-signal/blocked/confirm-age");
                    yt91VarM42473q2.f276055i.add(new bu91("log_out_button", null, null, null, null));
                    yt91VarM42473q2.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("logout", 1, nauVar), yt91VarM42473q2.m94607a(), st91.f213865b, System.currentTimeMillis());
                } else if (iM38547C == 1) {
                    zt91 zt91Var3 = zt91.f286105i;
                    yt91 yt91VarM50626j3 = ihf1.m50626j();
                    yt91VarM50626j3.f276054h = "music";
                    yt91VarM50626j3.f276047a = "mobile-age-signal-blocked-ask-parent";
                    yt91VarM50626j3.f276052f = "1.0.0";
                    yt91VarM50626j3.f276053g = "20.0.5";
                    yt91 yt91VarM42473q3 = fr0.m42473q(yt91VarM50626j3, "age-signal/blocked/ask-parent");
                    yt91VarM42473q3.f276055i.add(new bu91("log_out_button", null, null, null, null));
                    yt91VarM42473q3.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("logout", 1, nauVar), yt91VarM42473q3.m94607a(), st91.f213865b, System.currentTimeMillis());
                } else {
                    if (iM38547C != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zt91 zt91Var4 = zt91.f286105i;
                    yt91 yt91VarM50626j4 = ihf1.m50626j();
                    yt91VarM50626j4.f276054h = "music";
                    yt91VarM50626j4.f276047a = "mobile-age-signal-blocked-parent-setup";
                    yt91VarM50626j4.f276052f = "1.1.0";
                    yt91VarM50626j4.f276053g = "20.0.5";
                    yt91 yt91VarM42473q4 = fr0.m42473q(yt91VarM50626j4, "age-signal/blocked/parent-setup");
                    yt91VarM42473q4.f276055i.add(new bu91("log_out_button", null, null, null, null));
                    yt91VarM42473q4.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("logout", 1, nauVar), yt91VarM42473q4.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                kv91Var3.mo57453r(av91Var, null);
                wc2Var2.f249936d.m40532a(sh7.f209120M0);
                return w2a1Var;
        }
    }
}
