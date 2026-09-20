package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.music.R;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ms40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f146694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms40(Object obj, int i) {
        super(0);
        this.f146693a = i;
        this.f146694b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.eh00
    public final Object invoke() {
        a350 a350Var;
        int iM63437n;
        List list;
        float f;
        int i = 8;
        int i2 = 2;
        Object objM95318b = null;
        int size = 0;
        switch (this.f146693a) {
            case 0:
                return new DispatcherWorker(((os40) this.f146694b).f168738e);
            case 1:
                z13 z13Var = (z13) this.f146694b;
                return new cjc0(new wa30((pk0) z13Var.f278218c), new m6z(z13Var, 11));
            case 2:
                return (InputMethodManager) ((View) ((u010) this.f146694b).f225345b).getContext().getSystemService("input_method");
            case 3:
                return (hgm) ((t050) this.f146694b).f215763a.invoke();
            case 4:
                return sam.m77645B(Boolean.valueOf(!((k150) this.f146694b).f118207c));
            case 5:
                b350 b350Var = (b350) this.f146694b;
                if (b350Var.f22898c > 0) {
                    a350 a350Var2 = b350Var.f22903h;
                    if (a350Var2 == null) {
                        wj50.m88260d0("coreInstrumentationListener");
                        throw null;
                    }
                    a350Var = a350Var2;
                } else {
                    a350Var = null;
                }
                yrk yrkVar = new yrk(b350Var.f22896a, b350Var.f22900e, b350Var.f22899d, b350Var.f22901f, a350Var, b350Var.f22902g);
                uoa uoaVar = b350Var.f22897b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                arrayList.add(new hka1());
                jqv0 jqv0Var = qpv0.f191387a;
                arrayList4.add(new C2570xf(i, yrkVar, jqv0Var.mo54112b(mja1.class)));
                arrayList.add(new j0i0());
                arrayList.add(new odn0());
                arrayList3.add(new pqm0(new lo4(i2), jqv0Var.mo54112b(mja1.class)));
                uoaVar.f232364d = new cxf(q0f1.m71825R(arrayList), q0f1.m71825R(arrayList2), q0f1.m71825R(arrayList3), q0f1.m71825R(arrayList4), q0f1.m71825R(arrayList5));
                return uoaVar.m83603g();
            case 6:
                Intent intent = new Intent("android.intent.action.MAIN");
                g550 g550Var = (g550) this.f146694b;
                intent.setClassName(g550Var.f76590a, g550Var.f76592c);
                return PendingIntent.getActivity(g550Var.f76590a, 0, intent, 67108864);
            case 7:
                pyu pyuVar = (pyu) this.f146694b;
                return h6f.m46710G((xk40) pyuVar.f183520b, (ija) pyuVar.f183521c, (t7j0) pyuVar.f183522d);
            case 8:
                return new DispatcherWorker(((wa50) this.f146694b).f249397g);
            case 9:
                ib50 ib50Var = (ib50) this.f146694b;
                long jNanoTime = System.nanoTime();
                qlv0 qlv0Var = new qlv0();
                qlv0 qlv0Var2 = new qlv0();
                synchronized (ib50Var.f100440c) {
                    qlv0Var.f189932a = jNanoTime - ib50Var.f100442e;
                    qlv0Var2.f189932a = 1000000000 / ((long) ib50Var.f100441d);
                }
                x0h1.m89578u(ib50Var.f100438a, null, 0, new gb50(qlv0Var, qlv0Var2, ib50Var, jNanoTime, (fbk) null), 3);
                return w2a1.f247311a;
            case 10:
                mz50 mz50Var = (mz50) this.f146694b;
                return h6f.m46715L(mz50Var.f148616a.get(), mz50Var.f148617b.get(), mz50Var.f148618c.get(), mz50Var.f148619d.get(), mz50Var.f148620e.get(), mz50Var.f148621f.get(), mz50Var.f148622g.get());
            case 11:
                ((k5m0) ((e0n) ((hjb0) this.f146694b).f92010d).get()).mo55548j();
                return w2a1.f247311a;
            case 12:
                u010 u010Var = ((y360) this.f146694b).f268765i;
                Resources resources = (Resources) u010Var.f225345b;
                mb80 mb80Var = (mb80) u010Var.f225346c;
                if (((cd4) ((a660) u010Var.f225347d).f12703a.get()).m32414v()) {
                    by50 by50Var = (by50) mb80Var.f141817b.current().getValue();
                    v260 v260VarM85664s = by50Var != null ? vig1.m85664s(by50Var, (mx50) mb80Var.f141819d.mo61351b().getValue()) : null;
                    if (!(v260VarM85664s instanceof s260) || ((s260) v260VarM85664s).f204907e == null) {
                        if (v260VarM85664s != null) {
                            int size2 = v260VarM85664s.mo77041c().f184507b.size() + (v260VarM85664s.mo77042d() ? 1 : 0);
                            m260 m260VarMo77040b = v260VarM85664s.mo77040b();
                            if (m260VarMo77040b != null && (list = m260VarMo77040b.f139234b) != null) {
                                size = list.size();
                            }
                            size += size2;
                        }
                        iM63437n = n0e1.m63437n((int) (((size * 62.0f) + 140.0f + ((v260VarM85664s != null ? v260VarM85664s.mo77040b() : null) != null ? 40.0f : 0.0f) + 80.0f) * resources.getDisplayMetrics().density), (int) (resources.getDisplayMetrics().heightPixels * 0.4f), (int) (resources.getDisplayMetrics().heightPixels * 0.75f));
                    } else {
                        f = resources.getDisplayMetrics().heightPixels * 0.75f;
                    }
                    return Integer.valueOf(iM63437n);
                }
                f = resources.getDisplayMetrics().heightPixels * 0.66f;
                iM63437n = (int) f;
                return Integer.valueOf(iM63437n);
            case 13:
                ((k5m0) ((e0n) ((gzl) this.f146694b).f85983e).get()).mo55548j();
                return w2a1.f247311a;
            case 14:
                i8g0 i8g0Var = (i8g0) ((x560) this.f146694b).f258314M0;
                i8g0Var.getClass();
                yt91 yt91VarM96903c = i8g0Var.f99785b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("top_bar", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("back_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
            case 15:
                return w9h1.m87517y((np0) this.f146694b, null, null, 3);
            case 16:
                return (o960) ((n960) this.f146694b).f151725a.get();
            case 17:
                return (fa60) ((ea60) this.f146694b).f57590a.get();
            case 18:
                z9j0 z9j0Var = (z9j0) ((mfn) ((ujh) ((o2n) this.f146694b).f161072a.f55002b).f231032b).f143099a.f169565X.get();
                jg31.m53271i(z9j0Var);
                return new cjc0(new k98(z9j0Var, 8), df60.f48495h);
            case 19:
                return new C1873fu((ql9) this.f146694b);
            case 20:
                pgo pgoVar = ((cu50) ((t7j) ((p2n) ((os60) this.f146694b).f168755d).f173371a.f55002b).f217839b).f42051b;
                jg31.m53271i(pgoVar);
                return new hgo(new g7a(pgoVar, 2), df60.f48468L0);
            case 21:
                return ((qs60) this.f146694b).f192005a.getString(R.string.kallax_prompted_by);
            case 22:
                return ((Resources) ((oyz) this.f146694b).f171916b).getString(R.string.kallax_prompted_by);
            case 23:
                z470 z470Var = (z470) this.f146694b;
                try {
                    return z470Var.m95318b();
                } catch (Exception e) {
                    z470.m95317e(e, "Account Graduation preferences could not be created first time");
                    if (e instanceof KeyStoreException) {
                        try {
                            Context context = z470Var.f279148a;
                            try {
                                context.getSharedPreferences("genalpha_account_graduation_encrypted_sharedprefs", 0).edit().clear().apply();
                                context.deleteSharedPreferences("genalpha_account_graduation_encrypted_sharedprefs");
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                keyStore.deleteEntry("_androidx_security_master_key_");
                            } catch (Exception e2) {
                                z470.m95317e(e2, "Account Graduation failed to delete shared preferences file");
                            }
                            objM95318b = z470Var.m95318b();
                        } catch (Exception e3) {
                            z470.m95317e(e3, "Account Graduation could not recreate shared preferences");
                            return objM95318b;
                        }
                        break;
                    }
                    return objM95318b;
                }
            case 24:
                return new v570((fk60) this.f146694b);
            case 25:
                s18 s18Var = (s18) this.f146694b;
                return kkc0.m56695h0(new pqm0("rose", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_rose))), new pqm0("salmon", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_salmon))), new pqm0("violet", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_violet))), new pqm0("lavender", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_lavender))), new pqm0("azure", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_azure))), new pqm0("aquamarine", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_aquamarine))), new pqm0("powder green", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_powder_green))), new pqm0("electric seafoam", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_electric_seafoam))), new pqm0("tangerine", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_tangerine))), new pqm0("gold", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_gold))), new pqm0("factory yellow", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_factory_yellow))), new pqm0("citric", Integer.valueOf(s18.m76919b(s18Var, R.color.kids_profile_avatar_picker_citric))));
            case 26:
                kk1 kk1Var = (kk1) this.f146694b;
                return new ba70((e940) kk1Var.f123475f, (z9j0) kk1Var.f123476g, (pgo) kk1Var.f123471b);
            case 27:
                return ((zw80) this.f146694b).m97113a(oh51.f165341a);
            case 28:
                return ((bz80) this.f146694b).m30979a(oh51.f165341a);
            default:
                return ((mz80) this.f146694b).m63239a();
        }
    }
}
