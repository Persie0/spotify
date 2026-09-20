package p204p;

import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class w6j0 implements e850, npz {

    /* JADX INFO: renamed from: a */
    public final aey0 f248402a;

    /* JADX INFO: renamed from: b */
    public final h5j0 f248403b;

    /* JADX INFO: renamed from: c */
    public final lbm0 f248404c;

    /* JADX INFO: renamed from: d */
    public final y6j0 f248405d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f248406e;

    /* JADX INFO: renamed from: f */
    public final eew f248407f;

    /* JADX INFO: renamed from: g */
    public final er70 f248408g;

    /* JADX INFO: renamed from: h */
    public final wg61 f248409h = new wg61(new v6j0(this));

    /* JADX INFO: renamed from: i */
    public final wg61 f248410i = new wg61(new w0i0(this, 27));

    /* JADX INFO: renamed from: j */
    public final u7q f248411j = new u7q(2);

    public w6j0(aey0 aey0Var, h5j0 h5j0Var, lbm0 lbm0Var, y6j0 y6j0Var, i4t0 i4t0Var, eew eewVar, er70 er70Var) {
        this.f248402a = aey0Var;
        this.f248403b = h5j0Var;
        this.f248404c = lbm0Var;
        this.f248405d = y6j0Var;
        this.f248406e = i4t0Var;
        this.f248407f = eewVar;
        this.f248408g = er70Var;
    }

    @Override // p204p.npz
    /* JADX INFO: renamed from: a */
    public final void mo65372a() {
        ju91 ju91Var;
        er70 er70Var = this.f248408g;
        if (er70Var == null || (ju91Var = (ju91) er70Var.get()) == null || !ju91Var.f116060b.get()) {
            xvh0 xvh0Var = (xvh0) ((MobiusLoop) this.f248409h.getValue()).f5591i;
            if ((xvh0Var != null ? xvh0Var.f266391c : 0) == 1) {
                return;
            }
            this.f248407f.m38712b("NavigationLoggerImpl", "onAppForeground", null);
            m87298i().m41768b(new csw(m87293d()));
            lbm0 lbm0Var = this.f248404c;
            lbm0Var.f131691b = lbm0Var.m58672a();
        }
    }

    @Override // p204p.e850
    /* JADX INFO: renamed from: b */
    public final void mo34670b(aey0 aey0Var, av91 av91Var, d850 d850Var) {
        z650 z650Var = d850Var.f46380a;
        if (this.f248402a == aey0Var && !this.f248411j.m82531c(z650Var)) {
            m87298i().m41767a(new mvw(z650Var));
        }
    }

    @Override // p204p.npz
    /* JADX INFO: renamed from: c */
    public final void mo65373c() {
        ju91 ju91Var;
        er70 er70Var = this.f248408g;
        if (er70Var == null || (ju91Var = (ju91) er70Var.get()) == null || !ju91Var.f116060b.get()) {
            m87297h();
            y6j0 y6j0Var = this.f248405d;
            aey0 aey0Var = this.f248402a;
            this.f248407f.m38712b("NavigationLoggerImpl", "onAppBackground", "from page = " + y6j0Var.mo32928a(aey0Var));
            lbm0 lbm0Var = this.f248404c;
            kbm0 kbm0Var = lbm0Var.f131691b;
            if (kbm0Var != null) {
                lbm0Var.m58674c(kbm0Var);
            }
            s6j0 s6j0VarM87293d = m87293d();
            fin0 fin0VarM87298i = m87298i();
            bsw bswVar = new bsw(s6j0VarM87293d);
            ein0 ein0Var = fin0VarM87298i.f69925b;
            noa0 noa0Var = fin0VarM87298i.f69924a;
            AtomicBoolean atomicBoolean = ein0Var.f59986a;
            ArrayList arrayList = ein0Var.f59987b;
            if (atomicBoolean.getAndSet(true) && !arrayList.isEmpty()) {
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    noa0Var.invoke(it.next());
                }
                arrayList.clear();
            }
            noa0Var.invoke(bswVar);
            y6j0Var.m92957b(aey0Var, new ocm0(s6j0VarM87293d.f206132a, null, s6j0VarM87293d.f206133b.f196301a, null));
        }
    }

    /* JADX INFO: renamed from: d */
    public final s6j0 m87293d() {
        kbm0 kbm0Var = this.f248404c.f131691b;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new s6j0(kbm0Var, new r6j0(xgg1.m90800h0().f36166c, (String) null, 6), false, 12);
    }

    /* JADX INFO: renamed from: e */
    public final void m87294e(b3j0 b3j0Var) {
        m87297h();
        this.f248407f.m38712b("NavigationLoggerImpl", "beginNavigation", b3j0Var.mo28035b());
        if (b3j0Var.equals(t2j0.f216577a) || (b3j0Var instanceof s2j0)) {
            m87298i().m41768b(new fww(b3j0Var));
        } else {
            m87298i().m41767a(new fww(b3j0Var));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m87295f(b3j0 b3j0Var) {
        m87297h();
        this.f248407f.m38712b("NavigationLoggerImpl", "destinationChanging", b3j0Var.mo28035b());
        m87298i().m41767a(new zvw(b3j0Var));
    }

    /* JADX INFO: renamed from: g */
    public final void m87296g(r6j0 r6j0Var) {
        m87297h();
        lbm0 lbm0Var = this.f248404c;
        lbm0Var.m58674c(lbm0Var.m58672a());
        kbm0 kbm0Var = (kbm0) lbm0Var.f131690a.f174322a.get();
        s6j0 s6j0Var = new s6j0(kbm0Var, r6j0Var, false, 12);
        this.f248407f.m38712b("NavigationLoggerImpl", "endNavigation", s6j0Var.toString());
        m87298i().m41767a(new eww(s6j0Var, lau.f131415a, null));
        this.f248405d.m92957b(this.f248402a, new ocm0(kbm0Var, r6j0Var.f196302b, r6j0Var.f196301a, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m87297h() {
        bkq bkqVarM82540n = this.f248411j.m82540n();
        if (bkqVarM82540n == null) {
            return;
        }
        m87299j(bkqVarM82540n.m29721b().m26256b(), bkqVarM82540n.m29721b().m26255a());
        Iterator it = bkqVarM82540n.m29720a().iterator();
        while (it.hasNext()) {
            m87298i().m41767a(new mvw((z650) it.next()));
        }
    }

    /* JADX INFO: renamed from: i */
    public final fin0 m87298i() {
        return (fin0) this.f248410i.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m87299j(r6j0 r6j0Var, a9j0 a9j0Var) {
        String str;
        xvh0 xvh0Var;
        y8j0 y8j0Var;
        s6j0 s6j0Var = new s6j0(a9j0Var.m25144a(), r6j0Var, a9j0Var.m25145b(), a9j0Var.m25148e());
        ocm0 ocm0VarMo32928a = this.f248405d.mo32928a(this.f248402a);
        eww ewwVar = new eww(s6j0Var, a9j0Var.m25146c(), Long.valueOf(a9j0Var.m25147d()));
        this.f248407f.m38712b("NavigationLoggerImpl", "endNavigation", "destination: " + s6j0Var + ", currentLocation: " + ocm0VarMo32928a);
        if (wj50.m88271j(r6j0Var.f196301a, ocm0VarMo32928a != null ? ocm0VarMo32928a.f163961c : null) && (str = r6j0Var.f196302b) != null && str.equals(ocm0VarMo32928a.f163960b) && (xvh0Var = (xvh0) ((MobiusLoop) this.f248409h.getValue()).f5591i) != null && (y8j0Var = xvh0Var.f266390b) != null) {
            String str2 = r6j0Var.f196302b;
            b3j0 b3j0Var = y8j0Var.f270305a;
            if ((b3j0Var instanceof z2j0) && str2 != null && !wj50.m88271j(((z2j0) b3j0Var).f278598b, str2)) {
                return;
            }
        }
        this.f248404c.m58674c(a9j0Var.m25144a());
        m87298i().m41767a(ewwVar);
        this.f248405d.m92957b(this.f248402a, new ocm0(a9j0Var.m25144a(), r6j0Var.f196302b, r6j0Var.f196301a, null));
    }
}
