package p204p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class s5j0 {

    /* JADX INFO: renamed from: a */
    public final yxi0 f205845a;

    /* JADX INFO: renamed from: b */
    public final m500 f205846b;

    /* JADX INFO: renamed from: c */
    public final aii0 f205847c;

    /* JADX INFO: renamed from: d */
    public final IdentityHashMap f205848d = new IdentityHashMap();

    /* JADX INFO: renamed from: e */
    public final IdentityHashMap f205849e = new IdentityHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f205850f = new LinkedHashMap();

    public s5j0(yxi0 yxi0Var, m500 m500Var, aii0 aii0Var) {
        this.f205845a = yxi0Var;
        this.f205846b = m500Var;
        this.f205847c = aii0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m77277a(i500 i500Var, int i, boolean z) {
        xxi0 xxi0VarM94844a;
        if (this.f205847c.m26104d()) {
            View view = i500Var.f98706h1;
            qrm0 qrm0Var = qrm0.f191883a;
            if (view == null || (xxi0VarM94844a = ndg1.m64219p(view)) == null) {
                xxi0VarM94844a = this.f205845a.m94844a(qrm0Var, i);
            }
            if (!(i500Var instanceof t250)) {
                m77278b(i500Var, xxi0VarM94844a, qrm0Var);
                return;
            }
            xxi0 xxi0Var = (xxi0) this.f205850f.remove(qrm0Var);
            IdentityHashMap identityHashMap = this.f205849e;
            IdentityHashMap identityHashMap2 = this.f205848d;
            if (xxi0Var != null) {
                tf60 tf60Var = (tf60) identityHashMap2.remove(xxi0Var);
                if (tf60Var != null) {
                    tf60Var.mo26601e(null);
                }
                identityHashMap.remove(xxi0Var);
            }
            tf60 tf60Var2 = (tf60) identityHashMap2.remove(xxi0VarM94844a);
            if (tf60Var2 != null) {
                tf60Var2.mo26601e(null);
            }
            identityHashMap.remove(xxi0VarM94844a);
            if (z) {
                ((t250) i500Var).mo69809s();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m77278b(i500 i500Var, xxi0 xxi0Var, qrm0 qrm0Var) {
        bnm0 bnm0VarMo2758g;
        voc1 f3300l1;
        voc1 voc1Var;
        xxi0 xxi0Var2;
        IdentityHashMap identityHashMap = this.f205848d;
        IdentityHashMap identityHashMap2 = this.f205849e;
        fbk fbkVar = null;
        if (qrm0Var != null && (xxi0Var2 = (xxi0) this.f205850f.put(qrm0Var, xxi0Var)) != null && xxi0Var2 != xxi0Var) {
            tf60 tf60Var = (tf60) identityHashMap.remove(xxi0Var2);
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
            identityHashMap2.remove(xxi0Var2);
        }
        tf60 tf60Var2 = (tf60) identityHashMap.remove(xxi0Var);
        if (tf60Var2 != null) {
            tf60Var2.mo26601e(null);
        }
        if (i500Var instanceof t250) {
            identityHashMap2.remove(xxi0Var);
            return;
        }
        voc1 voc1Var2 = (voc1) identityHashMap2.remove(xxi0Var);
        if (voc1Var2 != null) {
            xxi0Var.m92337a(new lem0(voc1Var2));
        }
        try {
            anm0 anm0Var = i500Var instanceof anm0 ? (anm0) i500Var : null;
            bnm0VarMo2758g = anm0Var != null ? anm0Var.mo2758g() : null;
        } catch (Exception e) {
            Logger.m3973i("NavigationEventBridge: failed to get PageViewObservable", e);
            bnm0VarMo2758g = null;
        }
        ofm0 ofm0Var = i500Var instanceof ofm0 ? (ofm0) i500Var : null;
        try {
            toc1 toc1Var = i500Var instanceof toc1 ? (toc1) i500Var : null;
            f3300l1 = toc1Var != null ? toc1Var.getF3300l1() : null;
        } catch (Exception e2) {
            Logger.m3973i("NavigationEventBridge: failed to get fallback viewUri", e2);
        }
        tfi0 tfi0Var = i500Var instanceof tfi0 ? (tfi0) i500Var : null;
        Object objMo80679j1 = tfi0Var != null ? tfi0Var.mo80679j1() : mvl0.m62953p(new gq0(bzf1.m31021m(i500Var.f98716q1.f163863j), 7));
        m500 m500Var = this.f205846b;
        if (ofm0Var == null) {
            voc1 voc1Var3 = f3300l1;
            identityHashMap2.put(xxi0Var, voc1Var3);
            xxi0Var.m92337a(new kem0(voc1Var3, null, bnm0VarMo2758g, null, 8));
            identityHashMap.put(xxi0Var, x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new lw2(objMo80679j1, xxi0Var, fbkVar, 24), 3));
            return;
        }
        jfm0 jfm0VarMo15684j0 = ofm0Var.mo15684j0(q040.class);
        t040 t040VarM70673m = pqo0.m70673m(jfm0VarMo15684j0);
        q040 q040Var = (q040) jfm0VarMo15684j0.mo31538a();
        if (q040Var == null || (voc1Var = q040Var.f183902b) == null) {
            voc1Var = f3300l1;
        }
        identityHashMap2.put(xxi0Var, voc1Var);
        xxi0Var.m92337a(new kem0(voc1Var, q040Var != null ? q040Var.f183901a : null, bnm0VarMo2758g, null, 8));
        identityHashMap.put(xxi0Var, x0h1.m89578u(n5h1.m63737m(m500Var), null, 0, new qai0(t040VarM70673m, f3300l1, this, xxi0Var, jfm0VarMo15684j0, objMo80679j1, null, 1), 3));
    }

    /* JADX INFO: renamed from: c */
    public final qrm0 m77279c(xxi0 xxi0Var) {
        for (qrm0 qrm0Var : qrm0.values()) {
            for (int i : edb.m38551G(6)) {
                if (this.f205845a.m94844a(qrm0Var, i) == xxi0Var) {
                    return qrm0Var;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m77280d() throws Exception {
        if (this.f205847c.m26104d()) {
            yxi0 yxi0Var = this.f205845a;
            qrm0 qrm0Var = qrm0.f191883a;
            xxi0 xxi0VarM94844a = yxi0Var.m94844a(qrm0Var, 5);
            tf60 tf60Var = (tf60) this.f205848d.remove(xxi0VarM94844a);
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
            this.f205849e.remove(xxi0VarM94844a);
            LinkedHashMap linkedHashMap = this.f205850f;
            if (linkedHashMap.get(qrm0Var) == xxi0VarM94844a) {
                linkedHashMap.remove(qrm0Var);
            }
            xxi0VarM94844a.f267011b.invoke();
        }
    }
}
