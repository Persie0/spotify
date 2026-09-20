package p204p;

import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: p.fm */
/* JADX INFO: loaded from: classes11.dex */
public final class C1865fm implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f70899b;

    public /* synthetic */ C1865fm(Object obj, int i) {
        this.f70898a = i;
        this.f70899b = obj;
    }

    @Override // p204p.ewr
    public final void dispose() {
        w2a1 w2a1Var;
        switch (this.f70898a) {
            case 0:
                ((C2020jm) this.f70899b).f113719a.invoke();
                return;
            case 1:
                og0 og0Var = ((ig0) this.f70899b).f101853a;
                if (og0Var != null) {
                    og0Var.mo24738b();
                    w2a1Var = w2a1.f247311a;
                } else {
                    w2a1Var = null;
                }
                if (w2a1Var == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 2:
                ((wr0) this.f70899b).m88795d();
                return;
            case 3:
                ((tr1) this.f70899b).f222939b.m69810a(new s1m0(null));
                return;
            case 4:
                ((ckk0) this.f70899b).invoke();
                return;
            case 5:
                ((p62) this.f70899b).m84813d(false);
                return;
            case 6:
                gir girVar = (gir) this.f70899b;
                girVar.dismiss();
                girVar.f80242g.m82425g();
                return;
            case 7:
                maq0 maq0Var = (maq0) this.f70899b;
                maq0Var.m82425g();
                eug1.m40073o(maq0Var, null);
                maq0Var.f141647Q0.removeViewImmediate(maq0Var);
                return;
            case 8:
                ar4 ar4Var = (ar4) this.f70899b;
                mb31 mb31Var = ar4Var.f18934e;
                na31 na31Var = mb31Var.f141787h;
                if (na31Var != null) {
                    na31Var.m63947a();
                }
                mb31Var.m61341a();
                ActionMode actionMode = ar4Var.f18937h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                ar4Var.f18937h = null;
                return;
            case 9:
                kk40.m56680v(((dg5) this.f70899b).f48720d, null);
                return;
            case 10:
                kk40.m56680v(((to5) this.f70899b).f222175d, null);
                return;
            case 11:
                ((oi8) this.f70899b).m87300e();
                return;
            case 12:
                l29 l29Var = (l29) ((m29) this.f70899b).f139287c.getValue();
                if (l29Var != null) {
                    l29Var.close();
                    return;
                }
                return;
            case 13:
                d971 d971Var = (d971) this.f70899b;
                d971Var.f46718e.m37594a();
                d971Var.f46724k = null;
                return;
            case 14:
                ((r481) this.f70899b).mo31276b();
                return;
            case 15:
                di41 di41Var = ((y5a1) this.f70899b).f269387e;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                    return;
                }
                return;
            case 16:
                ((te7) this.f70899b).m84813d(false);
                return;
            case 17:
                ((Window) this.f70899b).clearFlags(128);
                return;
            case 18:
                gre greVar = (gre) this.f70899b;
                tp80 tp80Var = greVar.f83750f;
                if (tp80Var != null) {
                    if (tp80Var == null) {
                        wj50.m88260d0("listContentRuntime");
                        throw null;
                    }
                    ((xp80) tp80Var).m91650a();
                }
                di41 di41Var2 = greVar.f83754j;
                if (di41Var2 != null) {
                    di41Var2.mo26601e(null);
                    return;
                }
                return;
            case 19:
                ((oze) this.f70899b).f172254b.f240767b = null;
                return;
            case 20:
                u5m0 u5m0Var = (u5m0) this.f70899b;
                ArrayList arrayList = u5m0Var.f227070b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u5m0Var.f227069a.getLifecycle().mo31988d((gc80) it.next());
                }
                arrayList.clear();
                return;
            case 21:
                ((eri0) this.f70899b).m39811c();
                return;
            case 22:
                ((jwr) this.f70899b).f116712b.invoke();
                return;
            case 23:
                ((hr91) this.f70899b).stop();
                return;
            case 24:
                fmd0 fmd0Var = ((zgk) this.f70899b).f282670l;
                if (fmd0Var.f71029b) {
                    return;
                }
                kv91 kv91Var = (kv91) ((er70) fmd0Var.f71030c).get();
                l9g0 l9g0Var = (l9g0) fmd0Var.f71031d;
                l9g0Var.getClass();
                yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("outside_area", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                return;
            case 25:
                ((j871) this.f70899b).m52691o();
                return;
            case 26:
                ((f9l) this.f70899b).f67292f.f110193a.m97090l(null);
                return;
            case 27:
                c9k c9kVar = (c9k) ((C1790du) this.f70899b).f52930h;
                if (c9kVar != null) {
                    kk40.m56680v(c9kVar, null);
                    return;
                } else {
                    wj50.m88260d0("scope");
                    throw null;
                }
            case 28:
                ((View) this.f70899b).setKeepScreenOn(false);
                return;
            default:
                jut jutVar = (jut) this.f70899b;
                jutVar.mo37274b(false);
                jutVar.m54345c(null);
                return;
        }
    }
}
