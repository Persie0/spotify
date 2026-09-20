package p204p;

import android.content.Intent;
import android.text.Html;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateRequest;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public class f0m implements Producer, g3e, InterfaceC2207oa, Function, ant, m030, uc21, nka1, w1j0, zk61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64683a;

    /* JADX INFO: renamed from: b */
    public final Object f64684b;

    public /* synthetic */ f0m(Object obj, int i) {
        this.f64683a = i;
        this.f64684b = obj;
    }

    @Override // p204p.zk61
    /* JADX INFO: renamed from: a */
    public void mo40486a(vk61 vk61Var, int i) {
        String str;
        qdm qdmVar;
        List list = (List) ((hzd0) this.f64684b).mo33098e();
        if (list == null || (qdmVar = (qdm) g6f.m43747t0(i, list)) == null || (str = qdmVar.f187711a) == null) {
            str = "";
        }
        vk61Var.m85802a(str);
        jpg1.m53938t(vk61Var);
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        qoo qooVar = (qoo) this.f64684b;
        return ((ihi) obj).f102296c == u300.DAYLIST_SNAPSHOT && qooVar.m73395b() && qooVar.m73398e();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        String str;
        switch (this.f64683a) {
            case 5:
                gqx gqxVar = (gqx) obj;
                nuo nuoVar = (nuo) this.f64684b;
                String str2 = nuoVar.f158683c;
                ee7 ee7Var = (ee7) gqxVar.mo45449a(ee7.class, str2).f72301b;
                v140 v140Var = (v140) gqxVar.mo45449a(v140.class, str2).f72301b;
                String str3 = v140Var != null ? v140Var.f236243a : null;
                p3r p3rVar = (p3r) gqxVar.mo45449a(p3r.class, str2).f72301b;
                String str4 = p3rVar != null ? p3rVar.f173690a : null;
                cb7 cb7Var = (cb7) gqxVar.mo45449a(cb7.class, str2).f72301b;
                ArrayList<ab7> arrayListM52991k = cb7Var != null ? jcg1.m52991k(cb7Var.f36029a) : null;
                pad1 pad1Var = (pad1) gqxVar.mo45449a(pad1.class, str2).f72301b;
                sxg1 sxg1Var = pad1Var != null ? pad1Var.f175509a : null;
                iad1 iad1Var = sxg1Var instanceof iad1 ? (iad1) sxg1Var : null;
                ArrayList arrayList = new ArrayList();
                if (nuoVar.f158684d && iad1Var != null) {
                    qm61 qm61Var = qm61.f190148a;
                    arrayList.add(new sec1(qm61Var, qm61Var));
                }
                if (ee7Var != null && (str = ee7Var.f58695h) != null && (!wl51.m88460J0(str)) && (!wl51.m88460J0(ee7Var.f58694g) || !wl51.m88460J0(ee7Var.f58696i))) {
                    fm61 fm61Var = fm61.f70969a;
                    arrayList.add(new sec1(fm61Var, fm61Var));
                }
                if (str3 != null && str3.length() > 67) {
                    hm61 hm61Var = new hm61(str3);
                    arrayList.add(new sec1(hm61Var, hm61Var));
                }
                if ((ee7Var != null ? vvg1.m86470l(ee7Var) : null) instanceof y6a) {
                    dm61 dm61Var = dm61.f50436a;
                    arrayList.add(new sec1(dm61Var, dm61Var));
                }
                if (str4 != null && (!wl51.m88460J0(str4))) {
                    rl61 rl61Var = rl61.f200225a;
                    arrayList.add(new sec1(rl61Var, rl61Var));
                }
                if (arrayListM52991k != null && (!arrayListM52991k.isEmpty())) {
                    bm61 bm61Var = bm61.f28388a;
                    arrayList.add(new sec1(bm61Var, bm61Var));
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayListM52991k, 10));
                    for (ab7 ab7Var : arrayListM52991k) {
                        arrayList2.add(new xl61(ab7Var.f14015b, ab7Var.f14014a));
                    }
                    zl61 zl61Var = new zl61(arrayList2);
                    arrayList.add(new sec1(zl61Var, zl61Var));
                }
                if (ee7Var != null) {
                    vl61 vl61Var = vl61.f242390a;
                    arrayList.add(new sec1(vl61Var, vl61Var));
                    tl61 tl61Var = tl61.f221348a;
                    arrayList.add(new sec1(tl61Var, tl61Var));
                }
                return arrayList;
            case 9:
                k7p k7pVar = (k7p) this.f64684b;
                gfz gfzVar = k7pVar.f120171c;
                luk lukVar = k7pVar.f120172d;
                pri priVar = k7pVar.f120170b;
                boolean zIsEnabled = gfzVar.isEnabled();
                if (((Boolean) obj).booleanValue()) {
                    return k0e1.m54988g(((tri) priVar).m81356g(zIsEnabled), lukVar);
                }
                tri triVar = (tri) priVar;
                triVar.getClass();
                nti ntiVarM7377s = ConnectMessages$StateRequest.m7377s();
                ntiVarM7377s.m65626q();
                ntiVarM7377s.m65625m(false);
                ntiVarM7377s.m65629t(true);
                ntiVarM7377s.m65628s(true);
                ntiVarM7377s.m65627r(zIsEnabled);
                ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) ntiVarM7377s.build();
                wj50.m88279p(connectMessages$StateRequest);
                return k0e1.m54988g(triVar.m81353d(connectMessages$StateRequest), lukVar);
            default:
                return ((u7s0) this.f64684b).mo74958b(((u4s0) obj).f226794a).distinctUntilChanged().map(b5v.f23715W0);
        }
    }

    @Override // p204p.nka1
    /* JADX INFO: renamed from: b */
    public void mo40487b(String str) {
        ((gh00) this.f64684b).invoke(new vuq(str));
    }

    /* JADX INFO: renamed from: c */
    public cx10 m40488c() {
        AbstractC2601y5 abstractC2601y5 = (AbstractC2601y5) this.f64684b;
        if (!(abstractC2601y5 instanceof ssm0)) {
            return new cx10();
        }
        ArrayList arrayList = ((ssm0) abstractC2601y5).f213682b.f284182b;
        cx10 cx10Var = new cx10();
        cx10Var.f42884a.addAll(arrayList);
        return cx10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [p.q0m] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: d */
    public Object m40489d(y4e1 y4e1Var, ibk ibkVar) {
        e0m e0mVar;
        if (ibkVar instanceof e0m) {
            e0mVar = (e0m) ibkVar;
            int i = e0mVar.f54996d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0mVar.f54996d = i - Integer.MIN_VALUE;
            } else {
                e0mVar = new e0m(this, ibkVar);
            }
        } else {
            e0mVar = new e0m(this, ibkVar);
        }
        Object objM36222m = e0mVar.f54994b;
        int i2 = e0mVar.f54996d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM36222m);
                q0m q0mVar = y4e1Var.f269136a;
                djs0 djs0Var = (djs0) this.f64684b;
                String str = q0mVar.f184022a;
                String str2 = q0mVar.f184023b;
                String str3 = q0mVar.f184024c;
                e0mVar.f54993a = q0mVar;
                e0mVar.f54996d = 1;
                objM36222m = djs0Var.m36222m(str, str2, str3, e0mVar);
                yuk yukVar = yuk.f276404a;
                y4e1Var = q0mVar;
                if (objM36222m == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q0m q0mVar2 = e0mVar.f54993a;
                bga.m29073P(objM36222m);
                y4e1Var = q0mVar2;
            }
            return new d6e1((String) objM36222m, y4e1Var.f184026e);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            r0m r0mVarM76887a = s0m.m76887a(6, e2);
            String message = e2.getMessage();
            if (message == null) {
                message = "Cue audio resolution failed";
            }
            return new c6e1(r0mVarM76887a.f194523a, message, r0mVarM76887a.f194524b, y4e1Var.f184026e);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m40490e(int i, String str) {
        kv91 kv91Var = (kv91) this.f64684b;
        int iM38547C = edb.m38547C(i);
        nau nauVar = nau.f152117a;
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            zt91 zt91Var = zt91.f286105i;
            yt91 yt91VarM50626j = ihf1.m50626j();
            yt91VarM50626j.f276054h = "music";
            yt91VarM50626j.f276047a = "mobile-your-library-audiobook-progress-nudge";
            yt91VarM50626j.f276052f = "2.0.0";
            yt91VarM50626j.f276053g = "20.0.5";
            yt91VarM50626j.f276050d = str;
            zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
            Collections.singletonList("any");
            kv91Var.mo57453r(new av91("", "", new dv91("swipe", 1), new bv91("ui_hide", 1, nauVar), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
            return;
        }
        zt91 zt91Var2 = zt91.f286105i;
        yt91 yt91VarM50626j2 = ihf1.m50626j();
        yt91VarM50626j2.f276054h = "music";
        yt91VarM50626j2.f276047a = "mobile-your-library-audiobook-progress-nudge";
        yt91VarM50626j2.f276052f = "2.0.0";
        yt91VarM50626j2.f276053g = "20.0.5";
        yt91VarM50626j2.f276050d = str;
        yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j2, "any");
        yt91VarM42473q.f276055i.add(new bu91("overlay", null, null, null, null));
        yt91VarM42473q.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM42473q.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: f */
    public void m40491f(Intent intent, ho01 ho01Var, a611 a611Var) {
        ((po11) this.f64684b).m70467i(intent, ho01Var, a611Var);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        String strM35717o = dd41VarM74726U.m35717o(2);
        if (strM35717o != null) {
            return new u1j0(g4o0.class, new npr(strM35717o, hsg1.m48452r(dd41VarM74726U), nyg1.m65891r(dd41VarM74726U), nyg1.m65890q(dd41VarM74726U), true, ((t36) ((o12) this.f64684b).f160572c).m79979k()), uzq0.f235620a);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((p6m) this.f64684b).f174432c);
    }

    @Override // p204p.m030
    /* JADX INFO: renamed from: h */
    public uio mo40492h(int i) {
        return ((qio) this.f64684b).mo30418p0();
    }

    /* JADX INFO: renamed from: i */
    public void m40493i(pzy0 pzy0Var) throws Exception {
        cxl cxlVar;
        hqo hqoVar = (hqo) this.f64684b;
        fqo fqoVar = new fqo(pzy0Var);
        synchronized (hqoVar.f94228a) {
            cxlVar = hqoVar.f94230c;
            if (cxlVar == null) {
                hqoVar.f94229b.add(fqoVar);
            }
        }
        if (cxlVar != null) {
            cxlVar.invoke(fqoVar);
        }
    }

    @Override // p204p.g3e
    /* JADX INFO: renamed from: l */
    public fiz mo28356l(boolean z) {
        return z ? ((r2e) ((m3n) this.f64684b).f139686b).f195132a.m86024a("has-mobile-data-download", false) : new ysk(Boolean.FALSE, 27);
    }

    @Override // p204p.uc21
    public void lock() {
        ((ReentrantLock) this.f64684b).lock();
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f64683a) {
            case 7:
                Boolean bool = (Boolean) obj;
                EncoreButton encoreButton = ((e4p) this.f64684b).f56122a;
                wj50.m88279p(bool);
                encoreButton.setEnabled(bool.booleanValue());
                return;
            case 8:
                d7i d7iVar = (d7i) obj;
                j5p j5pVar = (j5p) this.f64684b;
                List list = d7iVar.f46208i;
                boolean z = d7iVar.f46214o;
                d03 d03Var = j5pVar.f109054e;
                TextView textView = (TextView) d03Var.f43717P0;
                TextView textView2 = (TextView) d03Var.f43719R0;
                if (!z) {
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                    return;
                } else {
                    textView.setVisibility(0);
                    textView2.setVisibility(0);
                    textView.setText(g6f.m43753y0(list, ", ", null, null, null, 54));
                    textView2.setText(j5pVar.f109032M0);
                    return;
                }
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            default:
                Set set = (Set) obj;
                jas jasVar = (jas) this.f64684b;
                wj50.m88279p(set);
                MobiusLoop mobiusLoop = jasVar.f110538b;
                if (mobiusLoop != null) {
                    mobiusLoop.m15600a(new s5s(set));
                    return;
                } else {
                    wj50.m88260d0("loop");
                    throw null;
                }
            case 10:
                String str = (String) obj;
                TextView textView3 = (TextView) ((map) this.f64684b).f141632b.f194055X;
                wj50.m88279p(textView3);
                textView3.setVisibility(!wl51.m88460J0(str) ? 0 : 8);
                textView3.setText(Html.fromHtml(str, 0));
                return;
            case 12:
                qfp qfpVar = (qfp) obj;
                String str2 = qfpVar.f188270a;
                suo suoVar = (suo) this.f64684b;
                q80 q80Var = (q80) suoVar.f214159d;
                TextView textView4 = q80Var.f186201f;
                TextView textView5 = q80Var.f186198c;
                TextView textView6 = q80Var.f186200e;
                TextView textView7 = q80Var.f186199d;
                Iterator it = h6f.m46715L(textView4, textView6, textView7).iterator();
                while (it.hasNext()) {
                    ((TextView) it.next()).setMaxLines(Alert.DURATION_SHOW_INDEFINITELY);
                }
                String str3 = qfpVar.f188273d;
                String str4 = qfpVar.f188272c;
                String str5 = qfpVar.f188271b;
                textView5.setVisibility(str2.length() > 0 ? 0 : 8);
                textView5.setText(str2);
                textView4.setVisibility(str5.length() == 0 ? 8 : 0);
                textView4.setText(str5);
                textView6.setVisibility(str4.length() == 0 ? 8 : 0);
                textView6.setText(str4);
                textView7.setVisibility(str3.length() != 0 ? 0 : 8);
                textView7.setText(str3);
                FrameLayout frameLayout = (FrameLayout) ((kc5) suoVar.f214157b).f121373i;
                inl0.m51135a(frameLayout, new lk00(15, frameLayout, q80Var));
                return;
            case 15:
                ((TextView) ((g0q) this.f64684b).f75421f.f257250e).setText((String) obj);
                return;
            case 19:
                ((rc81) this.f64684b).m75212x7708d991(((Boolean) obj).booleanValue());
                return;
            case 20:
                zp81 zp81Var = (zp81) obj;
                tdq tdqVar = (tdq) this.f64684b;
                EncoreButton encoreButton2 = (EncoreButton) tdqVar.f219454c.f225648b;
                encoreButton2.setVisibility(zp81Var != zp81.f285019a ? 0 : 8);
                zp81 zp81Var2 = zp81.f285020b;
                encoreButton2.setIconTintResource(zp81Var == zp81Var2 ? R.color.opacity_white_10 : R.color.white);
                if (zp81Var == zp81Var2) {
                    encoreButton2.setOnClickListener(new ryp(tdqVar, 1));
                    return;
                } else {
                    encoreButton2.setOnTouchListener(new azp(tdqVar, 2));
                    return;
                }
            case 21:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                CancellableSeekBar cancellableSeekBar = ((deq) this.f64684b).f48148c;
                cancellableSeekBar.setEnabled(zBooleanValue);
                if (zBooleanValue) {
                    return;
                }
                cancellableSeekBar.m9691a();
                return;
            case 22:
                q76 q76Var = (q76) obj;
                suo suoVar2 = (suo) this.f64684b;
                if (q76Var == null) {
                    ((TextView) ((tw80) suoVar2.f214158c).f224372h).setMaxLines(3);
                    ((ArtworkView) ((tw80) suoVar2.f214158c).f224367c).setVisibility(8);
                    return;
                } else {
                    tw80 tw80Var = (tw80) suoVar2.f214158c;
                    ((TextView) tw80Var.f224372h).setMaxLines(2);
                    ((ArtworkView) tw80Var.f224367c).setVisibility(0);
                    ((ArtworkView) tw80Var.f224367c).mo2820d(q76Var);
                    return;
                }
        }
    }

    @Override // p204p.uc21
    public void unlock() {
        ((ReentrantLock) this.f64684b).unlock();
    }

    public /* synthetic */ f0m(fnq fnqVar) {
        this.f64683a = 23;
        this.f64684b = fnqVar.f71348a.m53150g();
    }
}
