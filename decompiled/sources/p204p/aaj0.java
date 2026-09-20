package p204p;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aaj0 {

    /* JADX INFO: renamed from: a */
    public zxi0 f13856a;

    /* JADX INFO: renamed from: b */
    public boolean f13857b;

    /* JADX INFO: renamed from: a */
    public abstract jyi0 mo25252a();

    /* JADX INFO: renamed from: b */
    public final zxi0 m25253b() {
        zxi0 zxi0Var = this.f13856a;
        if (zxi0Var != null) {
            return zxi0Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* JADX INFO: renamed from: d */
    public void mo25255d(List list, ezi0 ezi0Var) {
        z6z z6zVar = new z6z(btz0.m30481E(new q5s0(20), new j691(new sxh0(13, this, ezi0Var), new ek5(list, 1))));
        while (z6zVar.hasNext()) {
            m25253b().m97207h((uxi0) z6zVar.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo25256e(zxi0 zxi0Var) {
        this.f13856a = zxi0Var;
        this.f13857b = true;
    }

    /* JADX INFO: renamed from: f */
    public void mo25257f(uxi0 uxi0Var) {
        jyi0 jyi0Var = uxi0Var.f234936b;
        if (jyi0Var == null) {
            jyi0Var = null;
        }
        if (jyi0Var == null) {
            return;
        }
        dzi0 dzi0Var = new dzi0();
        dzi0Var.f54675a = true;
        dzi0Var.f54676b = false;
        dzi0Var.f54677c = -1;
        dzi0Var.f54678d = false;
        dzi0Var.f54679e = false;
        mo25254c(jyi0Var, null, dzi0Var.m37469a());
        m25253b().m97202c(uxi0Var);
    }

    /* JADX INFO: renamed from: h */
    public Bundle mo25259h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void mo25260i(uxi0 uxi0Var, boolean z) {
        List list = (List) m25253b().f287331e.f158717a.getValue();
        if (!list.contains(uxi0Var)) {
            throw new IllegalStateException(("popBackStack was called with " + uxi0Var + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        uxi0 uxi0Var2 = null;
        while (mo25261j()) {
            uxi0Var2 = (uxi0) listIterator.previous();
            if (wj50.m88271j(uxi0Var2, uxi0Var)) {
                break;
            }
        }
        if (uxi0Var2 != null) {
            m25253b().m97203d(uxi0Var2, z);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean mo25261j() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void mo25258g(Bundle bundle) {
    }

    /* JADX INFO: renamed from: c */
    public jyi0 mo25254c(jyi0 jyi0Var, Bundle bundle, ezi0 ezi0Var) {
        return jyi0Var;
    }
}
