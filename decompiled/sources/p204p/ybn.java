package p204p;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.comscore.streaming.ContentType;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: classes7.dex */
public final class ybn implements v94, Function, SingleOnSubscribe, t6m0, mu61 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271218a;

    /* JADX INFO: renamed from: b */
    public final Object f271219b;

    /* JADX INFO: renamed from: c */
    public Object f271220c;

    public /* synthetic */ ybn(int i, Object obj, Object obj2) {
        this.f271218a = i;
        this.f271220c = obj;
        this.f271219b = obj2;
    }

    /* JADX INFO: renamed from: f */
    public static Activity m93289f(Activity activity) {
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public void mo24956K0(Object obj) {
        switch (this.f271218a) {
            case 2:
                jly jlyVar = (jly) obj;
                nmn nmnVar = (nmn) this.f271220c;
                jlyVar.f123380Q1 = (zsr) nmnVar.f155980i.get();
                jlyVar.f113703S1 = (shn) ((h4t0) this.f271219b).get();
                jlyVar.f113702R1 = new q6u((fqc0) nmnVar.f156233ze.get(), (foc0) nmnVar.f155509Ae.get(), (Random) nmnVar.f155875b.f212251m2.get(), 21);
                jlyVar.f113704T1 = nmnVar.m65099s2();
                break;
            case 3:
                pv11 pv11Var = (pv11) obj;
                pv11Var.f181575Z1 = xf40.m90452j(qqq0.f191633a, (jhn) this.f271219b);
                pv11Var.f181574Y1 = (z9j0) ((nmn) this.f271220c).f155773U0.get();
                break;
            default:
                SlateMessageHostActivity slateMessageHostActivity = (SlateMessageHostActivity) obj;
                slateMessageHostActivity.f113056Y0 = (zsr) ((son) this.f271220c).f211919a.f18590j0.get();
                slateMessageHostActivity.f5514Z0 = b2s.m27971a((jhn) this.f271219b);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m93290a(n0t n0tVar, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(390738210);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(n0tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(this) ? 256 : 128;
        }
        if (!xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91757b0();
        } else if (n0tVar.f149143O0) {
            xq00Var.m91771i0(1120810561);
            zum zumVar = (zum) this.f271219b;
            String str = n0tVar.f149154a;
            String str2 = n0tVar.f149155b;
            boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new ycq(21, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            zumVar.getClass();
            hjb0 hjb0Var = new hjb0(str, str2, (gh00) objM91750T);
            boolean zM91770i = xq00Var.m91770i(this);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == ia7Var) {
                objM91750T2 = new fpq(this, 1);
                xq00Var.m91793t0(objM91750T2);
            }
            ud6.m82826a("delete-playlist-dialog", (gh00) objM91750T2, rkk.m75772x(1662813625, new epq(hjb0Var, 1), xq00Var), xq00Var, 390);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(1121516896);
            xq00Var.m91788r(false);
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gek(this, n0tVar, gh00Var, i, 16);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f271218a) {
            case 13:
                int iOrdinal = ((dej0) obj).ordinal();
                if (iOrdinal == 0) {
                    Single singleJust = Single.just(udj0.f229260a);
                    wj50.m88279p(singleJust);
                    return singleJust;
                }
                if (iOrdinal == 2) {
                    Single singleJust2 = Single.just(udj0.f229262c);
                    wj50.m88279p(singleJust2);
                    return singleJust2;
                }
                C1939hj c1939hj = (C1939hj) ((InterfaceC1862fj) this.f271220c);
                String str = c1939hj.f91919e;
                if (str != null) {
                    c1939hj.f91919e = null;
                    c1939hj.f91920f = null;
                    c1939hj.f91915a.m94391a(str).subscribe(new ah4(str, 25));
                }
                return ((pto) this.f271219b).f181211d.mo41295a();
            case 15:
                List list = (List) obj;
                x28 x28Var = (x28) this.f271220c;
                hwo hwoVar = (hwo) x28Var.f257391t;
                String str2 = (String) x28Var.f257383b;
                vu40 vu40Var = (vu40) this.f271219b;
                String contextUri = vu40Var.getContextUri();
                String strMo81549c = vu40Var.mo81549c();
                if (strMo81549c == null) {
                    strMo81549c = vu40Var.getUri();
                }
                return hwo.m48943c(hwoVar, Collections.singletonList(strMo81549c), str2, list, lau.f131415a, contextUri);
            case 25:
                r8n r8nVar = (r8n) this.f271220c;
                List list2 = (List) this.f271219b;
                ae50 ae50VarM98153o = ((YourLibraryContainsResponse) obj).m98153o();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : ae50VarM98153o) {
                    if (((YourLibraryContainsResponseEntity) obj2).m98156o()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((YourLibraryContainsResponseEntity) it.next()).getUri());
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (list2.contains((String) it2.next())) {
                            return CompletableEmpty.f7437a;
                        }
                    }
                }
                return r8n.m74983n(g6f.m43727j0(list2), new r2q(r8nVar, 0));
            default:
                return ((Boolean) obj).booleanValue() ? ((Flowable) this.f271220c).m23332L((Scheduler) ((cdn) this.f271219b).f36915b).m23331J(kqd1.f125274W0) : Flowable.m23313I(C2244p5.f174033a);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m93291b() {
        int i = Build.VERSION.SDK_INT;
        return (i >= 36 || !(bm51.m29797h0(Build.MANUFACTURER, d6n0.f45731d, true) || bm51.m29797h0(Build.BRAND, d6n0.f45731d, true))) && i >= 34 && ((cej0) this.f271219b).m32585a() && ((gfz) this.f271220c).isEnabled();
    }

    /* JADX INFO: renamed from: c */
    public d850 m93292c(z520 z520Var) {
        String str;
        String str2;
        av91 av91Var;
        er70 er70Var = (er70) this.f271220c;
        a6h0 a6h0Var = (a6h0) this.f271219b;
        if (z520Var instanceof o3q0) {
            kv91 kv91Var = (kv91) er70Var.get();
            o3q0 o3q0Var = (o3q0) z520Var;
            String str3 = o3q0Var.f161431c;
            a6h0Var.getClass();
            yt91 yt91VarM96903c = a6h0Var.f12804a.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("mark_as_played_button", null, null, str3, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            String str4 = o3q0Var.f161430b;
            dv91 dv91Var = new dv91("hit", 1);
            String string = str4 != null ? str4.toString() : null;
            return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
        }
        boolean zEquals = z520Var.equals(n3q0.f150112d);
        nau nauVar = nau.f152117a;
        if (zEquals) {
            kv91 kv91Var2 = (kv91) er70Var.get();
            a6h0Var.getClass();
            yt91 yt91VarM96903c2 = a6h0Var.f12804a.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("toolbar", null, null, null, null));
            yt91VarM96903c2.f276056j = false;
            yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("back_button", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            return kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        if (z520Var instanceof l3q0) {
            kv91 kv91Var3 = (kv91) er70Var.get();
            l3q0 l3q0Var = (l3q0) z520Var;
            String str5 = l3q0Var.f129415b;
            if (l3q0Var.f129416c) {
                a6h0Var.getClass();
                yt91 yt91VarM96903c4 = a6h0Var.f12804a.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("auto_download_switch", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c4.m94607a();
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str5 != null ? str5.toString() : null;
                av91Var = new av91("", "", dv91Var2, new bv91("auto_download_enable", 1, Collections.singletonMap("item_to_download", string2 != null ? string2 : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
            } else {
                a6h0Var.getClass();
                yt91 yt91VarM96903c5 = a6h0Var.f12804a.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("auto_download_switch", null, null, null, null));
                yt91VarM96903c5.f276056j = false;
                zt91 zt91VarM94607a3 = yt91VarM96903c5.m94607a();
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str5 != null ? str5.toString() : null;
                av91Var = new av91("", "", dv91Var3, new bv91("auto_download_disable", 1, Collections.singletonMap("item_to_stop_download", string3 != null ? string3 : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
            }
            return kv91Var3.mo57453r(av91Var, null);
        }
        if (z520Var instanceof m3q0) {
            kv91 kv91Var4 = (kv91) er70Var.get();
            m3q0 m3q0Var = (m3q0) z520Var;
            String str6 = m3q0Var.f139699c;
            a6h0Var.getClass();
            yt91 yt91VarM96903c6 = a6h0Var.f12804a.m96903c();
            yt91VarM96903c6.f276055i.add(new bu91("manage_download_settings_button", null, null, str6, null));
            yt91VarM96903c6.f276056j = false;
            zt91 zt91VarM94607a4 = yt91VarM96903c6.m94607a();
            String str7 = m3q0Var.f139698b;
            dv91 dv91Var4 = new dv91("hit", 1);
            String string4 = str7 != null ? str7.toString() : null;
            return kv91Var4.mo57453r(new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4 != null ? string4 : "")), zt91VarM94607a4, st91.f213865b, System.currentTimeMillis()), null);
        }
        if (!(z520Var instanceof p3q0)) {
            if (z520Var.equals(n3q0.f150111c)) {
                kv91 kv91Var5 = (kv91) er70Var.get();
                a6h0Var.getClass();
                yt91 yt91VarM96903c7 = a6h0Var.f12804a.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("set_schedule_button", null, null, null, null));
                yt91VarM96903c7.f276056j = false;
                return kv91Var5.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c7.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            }
            if (!z520Var.equals(n3q0.f150110b)) {
                throw new NoWhenBranchMatchedException();
            }
            kv91 kv91Var6 = (kv91) er70Var.get();
            a6h0Var.getClass();
            yt91 yt91VarM96903c8 = a6h0Var.f12804a.m96903c();
            yt91VarM96903c8.f276055i.add(new bu91("delete_show_button", null, null, null, null));
            yt91VarM96903c8.f276056j = false;
            return kv91Var6.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c8.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
        kv91 kv91Var7 = (kv91) er70Var.get();
        a6h0Var.getClass();
        yt91 yt91VarM96903c9 = a6h0Var.f12804a.m96903c();
        yt91VarM96903c9.f276055i.add(new bu91("skip_finished_episodes_switch", null, null, null, null));
        yt91VarM96903c9.f276056j = false;
        zt91 zt91VarM94607a5 = yt91VarM96903c9.m94607a();
        boolean z = ((p3q0) z520Var).f173689b;
        char c = z ? (char) 2 : (char) 1;
        char c2 = z ? (char) 1 : (char) 2;
        dv91 dv91Var5 = new dv91("hit", 1);
        if (c == 1) {
            str = x09.f256833e;
        } else {
            if (c != 2) {
                throw null;
            }
            str = x09.f256832d;
        }
        pqm0 pqm0Var = new pqm0("state_before_toggle", str);
        if (c2 == 1) {
            str2 = x09.f256833e;
        } else {
            if (c2 != 2) {
                throw null;
            }
            str2 = x09.f256832d;
        }
        return kv91Var7.mo57453r(new av91("", "", dv91Var5, new bv91("toggle_state", 1, kkc0.m56695h0(pqm0Var, new pqm0("state_after_toggle", str2))), zt91VarM94607a5, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: d */
    public void m93293d(z650 z650Var, gh00 gh00Var) {
        Activity activityM93294e = m93294e(z650Var);
        if (activityM93294e == null) {
            gh00Var.invoke(null);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new eph(new lqk(gh00Var, this, activityM93294e), 9), 250L);
        }
    }

    /* JADX INFO: renamed from: e */
    public Activity m93294e(z650 z650Var) {
        Activity activityM93289f = m93289f(((v9x0) this.f271220c).m84993a());
        if (activityM93289f == null) {
            return null;
        }
        ydk0.m93461b((ydk0) ((jf50) this.f271219b).invoke(activityM93289f), z650Var, 2);
        return activityM93289f;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [p.qe70, p.th00] */
    @Override // p204p.t6m0
    /* JADX INFO: renamed from: h */
    public nsj mo40414h(bmm0 bmm0Var, Bundle bundle) {
        return (nsj) ((qe70) this.f271220c).invoke(bmm0Var, (xoi0) ((e6a0) this.f271219b).f56600d);
    }

    @Override // p204p.t6m0
    /* JADX INFO: renamed from: n */
    public tio mo40418n() {
        return (e6a0) this.f271219b;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p.qe70, p.th00] */
    @Override // p204p.mu61
    public void onSuccess() {
        ?? r0 = (qe70) ((mwo) this.f271220c).f147833f;
        View view = (View) this.f271219b;
        r0.invoke(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p.gh00, p.qe70] */
    @Override // p204p.mu61
    /* JADX INFO: renamed from: p */
    public void mo25096p(Exception exc) {
        ((qe70) ((mwo) this.f271220c).f147834g).invoke(exc);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        qzn qznVar = (qzn) this.f271220c;
        lxe lxeVarMo24613j = ((e940) qznVar.f194229b).mo24613j((String) this.f271219b);
        lxeVarMo24613j.m60192r((e99) qznVar.f194230c);
        lxeVarMo24613j.m60191q("ad_color_extraction");
        int i = 0;
        singleEmitter.setCancellable(new yvo(lxeVarMo24613j, i));
        lxeVarMo24613j.m60184j(new xvo(singleEmitter, i));
    }

    public ybn(son sonVar, nmn nmnVar, int i) {
        this.f271218a = i;
        this.f271220c = nmnVar;
        switch (i) {
            case 3:
                this.f271219b = new jhn(sonVar, 11);
                break;
            default:
                this.f271219b = be21.m28868a(new thn(sonVar, nmnVar, 0));
                break;
        }
    }

    public ybn(Activity activity) {
        this.f271218a = 18;
        this.f271220c = activity;
        this.f271219b = activity.getPackageManager();
    }

    public ybn(C2048kd c2048kd) {
        this.f271218a = 28;
        this.f271220c = c2048kd;
        this.f271219b = new wg61(new edq(this, 9));
    }

    public ybn(Context context, ConstraintLayout constraintLayout, String str, atn atnVar, st91 st91Var) {
        this.f271218a = 20;
        this.f271220c = o9p.f163105Z;
        up60 up60Var = hxt.f96286w;
        this.f271219b = ia7.m50020m(context, constraintLayout, w9h1.m87517y(atnVar.m27147a(str, st91Var, new jhp(this, 0)), null, null, 3), new c7y(0, 54, "", (String) null, "", (String) null), null, ContentType.LONG_FORM_ON_DEMAND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ybn(qfi0 qfi0Var, d6a0 d6a0Var, Bundle bundle, th00 th00Var) {
        this.f271218a = 17;
        this.f271220c = (qe70) th00Var;
        this.f271219b = new e6a0(qfi0Var, d6a0Var, bundle);
    }

    public ybn(he90 he90Var) {
        this.f271218a = 1;
        this.f271220c = he90Var;
        this.f271219b = b2s.m27972b(new n8n(this, 16));
    }

    public ybn(b5y0 b5y0Var) {
        this.f271218a = 7;
        this.f271220c = b5y0Var;
        this.f271219b = be21.m28868a(new tzn(this, 21));
    }

    public ybn(l3n l3nVar, mrq mrqVar) {
        this.f271218a = 6;
        this.f271220c = mrqVar;
        this.f271219b = new tzn(this, 10);
    }

    public ybn(zen zenVar, l3n l3nVar) {
        this.f271218a = 12;
        this.f271220c = zenVar;
        this.f271219b = be21.m28868a(new hbo(this, 7));
    }

    public ybn(tvm0 tvm0Var) {
        this.f271218a = 0;
        this.f271220c = tvm0Var;
        this.f271219b = b2s.m27972b(new n8n(this, 8));
    }

    public ybn(jen jenVar, l3n l3nVar) {
        this.f271218a = 5;
        this.f271220c = jenVar;
        this.f271219b = be21.m28868a(new n8n(this, 24));
    }

    public ybn(xsq xsqVar, oda1 oda1Var) {
        this.f271218a = 10;
        this.f271220c = xsqVar;
        this.f271219b = b2s.m27972b(new p8o(this, 25));
    }

    public ybn(y881 y881Var) {
        this.f271218a = 9;
        this.f271220c = y881Var;
        this.f271219b = be21.m28868a(new p8o(this, 16));
    }

    public ybn(bfn bfnVar, l3n l3nVar, yrq yrqVar) {
        this.f271218a = 8;
        this.f271220c = bfnVar;
        this.f271219b = be21.m28868a(new p8o(this, 3));
    }

    public ybn(etb1 etb1Var, eoh eohVar, gtb1 gtb1Var) {
        this.f271218a = 11;
        this.f271220c = etb1Var;
        this.f271219b = b2s.m27972b(new hbo(this, 2));
    }

    public ybn(son sonVar) {
        this.f271218a = 4;
        this.f271220c = sonVar;
        this.f271219b = new jhn(sonVar, 13);
    }
}
