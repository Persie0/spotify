package p204p;

import android.os.Bundle;
import com.spotify.music.SpotifyMainActivity;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes8.dex */
public final class dxi implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f53994b;

    public /* synthetic */ dxi(Object obj, int i) {
        this.f53993a = i;
        this.f53994b = obj;
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        switch (this.f53993a) {
            case 0:
                bsa bsaVar = (bsa) this.f53994b;
                f9y0 f9y0VarM59915g = ((SpotifyMainActivity) bsaVar.f30267c).f42740d.m59915g();
                Bundle bundleM41108a = f9y0VarM59915g.m41108a("activityResultSavedState");
                if (bundleM41108a != null) {
                    ((cxi) bsaVar.f30269e).m69851e(bundleM41108a);
                }
                f9y0VarM59915g.m41110c("activityResultSavedState", new C1982ik(bsaVar, 2));
                return;
            case 1:
                p2q p2qVar = (p2q) this.f53994b;
                Bundle bundleM41108a2 = ((f9y0) p2qVar.f173399b.f42740d.f136904c).m41108a("INSTANCE_STATE_RECEIVING_PLUGIN_POINT");
                if (bundleM41108a2 == null) {
                    return;
                }
                ListIterator listIterator = ((ro80) p2qVar.f173382L0.f171916b).listIterator(0);
                while (true) {
                    qo80 qo80Var = (qo80) listIterator;
                    if (!qo80Var.hasNext()) {
                        return;
                    } else {
                        ((dvb0) ((er70) qo80Var.next()).get()).mo37081e(bundleM41108a2);
                    }
                }
                break;
            case 2:
                era0 era0Var = (era0) this.f53994b;
                gra0 gra0Var = era0Var.f62049a;
                ((xy3) gra0Var.f83701g).m92400e("session_ui_plugins_on_create_ui");
                Iterator it = gra0Var.f83697c.iterator();
                while (it.hasNext()) {
                    ((jvb0) it.next()).mo26291g(gra0Var.f83706l);
                }
                ((xy3) gra0Var.f83701g).m92396a("session_ui_plugins_on_create_ui");
                era0Var.f62061m = true;
                if (gra0Var.f83699e.f31643a.f163857d.m41223a(fb80.f67753d)) {
                    era0Var.m39770a();
                }
                x0h1.m89578u(era0Var.f62060l, null, 0, new dra0(gra0Var, era0Var, null, 1), 3);
                if (era0Var.f62052d) {
                    Iterator it2 = gra0Var.f83697c.iterator();
                    while (it2.hasNext()) {
                        ((jvb0) it2.next()).mo26292i();
                    }
                    era0Var.f62052d = false;
                }
                hc80Var.getLifecycle().mo31988d(this);
                return;
            case 3:
                vmj0 vmj0Var = (vmj0) this.f53994b;
                Bundle bundleM41108a3 = ((f9y0) vmj0Var.f242850a.f42740d.f136904c).m41108a("INSTANCE_STATE_RECEIVING_PLUGIN_POINT");
                if (bundleM41108a3 == null) {
                    return;
                }
                ListIterator listIterator2 = ((ro80) vmj0Var.f242837L0.f171916b).listIterator(0);
                while (true) {
                    qo80 qo80Var2 = (qo80) listIterator2;
                    if (!qo80Var2.hasNext()) {
                        return;
                    } else {
                        ((dvb0) ((er70) qo80Var2.next()).get()).mo37081e(bundleM41108a3);
                    }
                }
                break;
            case 4:
                dwl0 dwl0Var = (dwl0) this.f53994b;
                Bundle bundleM41108a4 = dwl0Var.f53725b.mo34135x().m41108a("orientation_plugin_saved_state");
                if (bundleM41108a4 != null) {
                    bundleM41108a4.getInt("orientation_plugin_saved_state", dwl0Var.f53724a.m89131h());
                    return;
                }
                return;
            default:
                zsw0 zsw0Var = (zsw0) this.f53994b;
                jrw0 jrw0Var = zsw0Var.f286009C1;
                if (jrw0Var == null) {
                    wj50.m88260d0("reportBlockingFlow");
                    throw null;
                }
                jrw0Var.f115331i.m60127a(jrw0Var.f115326d.m86857s(jrw0Var.f115332j, jrw0Var.m54198b(), jrw0Var.f115330h).subscribe(new irw0(jrw0Var, 4)));
                zsw0Var.m49699V0().f31643a.mo31988d(this);
                c700 c700VarMo15683g0 = zsw0Var.m49699V0().mo15683g0();
                c700VarMo15683g0.getClass();
                xi8 xi8Var = new xi8(c700VarMo15683g0);
                xi8Var.m91102m(zsw0Var);
                xi8Var.m91095f();
                return;
        }
    }
}
