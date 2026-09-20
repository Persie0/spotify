package p204p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.playbacknative.AudioDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class nms extends hns {

    /* JADX INFO: renamed from: f */
    public final di51 f156256f;

    /* JADX INFO: renamed from: g */
    public final zo40 f156257g;

    /* JADX INFO: renamed from: h */
    public final voi f156258h;

    /* JADX INFO: renamed from: i */
    public final xpp f156259i;

    /* JADX INFO: renamed from: j */
    public final xwi f156260j;

    /* JADX INFO: renamed from: k */
    public final x3p f156261k;

    /* JADX INFO: renamed from: l */
    public final luk f156262l;

    /* JADX INFO: renamed from: m */
    public final xuk f156263m;

    /* JADX INFO: renamed from: n */
    public tld0 f156264n;

    /* JADX INFO: renamed from: o */
    public xld0 f156265o;

    public nms(di51 di51Var, zo40 zo40Var, voi voiVar, xpp xppVar, xwi xwiVar, x3p x3pVar, luk lukVar) {
        this.f156256f = di51Var;
        this.f156257g = zo40Var;
        this.f156258h = voiVar;
        this.f156259i = xppVar;
        this.f156260j = xwiVar;
        this.f156261k = x3pVar;
        this.f156262l = lukVar;
        c9k c9kVarM69075f = p3n0.m69075f(lukVar);
        this.f156263m = c9kVarM69075f;
        xuk xukVarM37073v = dv9.m37073v(c9kVarM69075f, new edq(this, 26));
        this.f156263m = xukVarM37073v;
        fbk fbkVar = null;
        x0h1.m89578u(xukVarM37073v, null, 0, new kms(this, fbkVar, 0), 3);
        x0h1.m89578u(xukVarM37073v, null, 0, new kms(this, fbkVar, 1), 3);
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: d */
    public final boolean mo26391d(Intent intent, smd0 smd0Var) {
        this.f156257g.getClass();
        intent.toString();
        return false;
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: e */
    public final void mo26392e() {
        this.f156257g.getClass();
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: f */
    public final void mo26393f() throws Throwable {
        this.f156261k.m89810b(ybc.CAST_DYNAMIC_INDIVIDUAL_ROUTE_ON_SELECT);
        this.f156257g.mo26393f();
        m65158p();
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: g */
    public final void mo26394g(int i) throws Throwable {
        this.f156257g.mo26394g(i);
        m65159q(i);
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: i */
    public final void mo26396i(int i) {
        this.f156257g.getClass();
        kk40.m56680v(this.f156263m, null);
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: j */
    public final void mo26397j(int i) {
        this.f156257g.mo26397j(i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m65158p() throws Throwable {
        int iM72082M;
        int i;
        List list;
        fmd0 fmd0VarM91718a = this.f156259i.m91718a();
        Object obj = null;
        di51 di51Var = this.f156256f;
        if (fmd0VarM91718a != null && (list = (List) fmd0VarM91718a.f71031d) != null) {
            for (Object obj2 : list) {
                if (wj50.m88271j(((tld0) obj2).m81050g(), di51Var.f49258a)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (tld0) obj;
        }
        tld0 tld0Var = obj;
        int iMo26680B = 0;
        if (tld0Var != 0) {
            s5p s5pVar = (s5p) this.f156258h;
            api apiVarM77296c = s5pVar.m77296c();
            if (apiVarM77296c != null) {
                double dMo26688d = ((double) apiVarM77296c.mo26688d()) / ((double) AudioDriver.SPOTIFY_MAX_VOLUME);
                int iMo26680B2 = apiVarM77296c.mo26680B();
                if (iMo26680B2 >= 24) {
                    iMo26680B2 = 24;
                }
                iM72082M = q3d0.m72082M(dMo26688d * ((double) iMo26680B2));
            } else {
                iM72082M = 0;
            }
            api apiVarM77296c2 = s5pVar.m77296c();
            if (apiVarM77296c2 != null) {
                i = !apiVarM77296c2.mo26685G() ? 0 : 1;
            }
            api apiVarM77296c3 = s5pVar.m77296c();
            if (apiVarM77296c3 != null && (iMo26680B = apiVarM77296c3.mo26680B()) >= 24) {
                iMo26680B = 24;
            }
            e6a0 e6a0Var = new e6a0(di51Var.f49259b, tld0Var.m81051h());
            e6a0Var.m37901B(iM72082M);
            e6a0Var.m37902C(i);
            e6a0Var.m37903D(iMo26680B);
            e6a0Var.m37930x(2);
            e6a0Var.m37915i(Collections.singletonList(di51Var.f49258a));
            e6a0Var.m37913g(tld0Var.m81045b());
            this.f156264n = e6a0Var.m37919m();
            this.f156265o = new xld0(tld0Var, 3, false, false, true);
        } else {
            Logger.m3966b(edb.m38564m("GOS->No media route descriptor found for routeId ", di51Var.f49258a), new Object[0]);
        }
        tld0 tld0Var2 = this.f156264n;
        if (tld0Var2 != null) {
            m96360k(tld0Var2, h6f.m46716M(this.f156265o));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m65159q(int i) throws Throwable {
        tld0 tld0Var = this.f156264n;
        if (tld0Var != null) {
            new ArrayList();
            new ArrayList();
            new HashSet();
            Bundle bundle = new Bundle(tld0Var.f221451a);
            ArrayList arrayListM81048e = tld0Var.m81048e();
            ArrayList arrayListM81045b = tld0Var.m81045b();
            HashSet hashSetM81044a = tld0Var.m81044a();
            bundle.putInt("volume", i);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListM81045b));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListM81048e));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetM81044a));
            tld0 tld0Var2 = new tld0(bundle);
            this.f156264n = tld0Var2;
            m96360k(tld0Var2, h6f.m46716M(this.f156265o));
        }
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: l */
    public final void mo39918l(String str) {
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: m */
    public final void mo39919m(String str) {
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: n */
    public final void mo39920n(List list) {
    }
}
