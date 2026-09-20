package p204p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class tz8 implements o9d0 {

    /* JADX INFO: renamed from: a */
    public final hji f225177a;

    /* JADX INFO: renamed from: b */
    public final uzx f225178b;

    /* JADX INFO: renamed from: c */
    public final xnd0 f225179c;

    /* JADX INFO: renamed from: d */
    public final k8d0 f225180d;

    /* JADX INFO: renamed from: e */
    public final myx f225181e;

    /* JADX INFO: renamed from: f */
    public final chp f225182f;

    /* JADX INFO: renamed from: g */
    public final abs0 f225183g;

    /* JADX INFO: renamed from: h */
    public final xre f225184h;

    /* JADX INFO: renamed from: i */
    public final ak70 f225185i;

    /* JADX INFO: renamed from: j */
    public final i05 f225186j;

    /* JADX INFO: renamed from: k */
    public final h9d0 f225187k;

    /* JADX INFO: renamed from: l */
    public final r46 f225188l;

    /* JADX INFO: renamed from: m */
    public final CompositeDisposable f225189m = new CompositeDisposable();

    /* JADX INFO: renamed from: n */
    public final SerialDisposable f225190n = new SerialDisposable();

    /* JADX INFO: renamed from: o */
    public long f225191o;

    /* JADX INFO: renamed from: p */
    public final m12 f225192p;

    /* JADX INFO: renamed from: q */
    public final boolean f225193q;

    public tz8(hji hjiVar, uzx uzxVar, xnd0 xnd0Var, k8d0 k8d0Var, myx myxVar, chp chpVar, abs0 abs0Var, sxi sxiVar, xre xreVar, ak70 ak70Var, i05 i05Var, h9d0 h9d0Var, r46 r46Var) {
        this.f225177a = hjiVar;
        this.f225178b = uzxVar;
        this.f225179c = xnd0Var;
        this.f225180d = k8d0Var;
        this.f225181e = myxVar;
        this.f225182f = chpVar;
        this.f225183g = abs0Var;
        this.f225184h = xreVar;
        this.f225185i = ak70Var;
        this.f225186j = i05Var;
        this.f225187k = h9d0Var;
        this.f225188l = r46Var;
        m12 m12VarM49526x = uzxVar.f235651a.f246563c.m49526x(hjiVar.m47688a());
        this.f225192p = m12VarM49526x;
        m12VarM49526x.m60511Z();
        abs0Var.m25387o(hjiVar.m47689b(), UUID.randomUUID().toString());
        sxiVar.f214898b.put(hjiVar.m47689b(), hjiVar.m47688a());
        m82056o();
        this.f225193q = true;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: a */
    public Set mo36678a() {
        return this.f225177a.m47692e();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: c */
    public void mo36679c(zvm0 zvm0Var, Bundle bundle, gh00 gh00Var) {
        m82056o();
        roa roaVarM82054m = m82054m(zvm0Var);
        z650 z650VarMo82055n = mo82055n(roaVarM82054m);
        hji hjiVar = this.f225177a;
        String strM47689b = hjiVar.m47689b();
        String strM76035e = roaVarM82054m.m76035e();
        boolean zM88271j = wj50.m88271j(hjiVar.m47690c(), zvm0Var);
        ak70 ak70Var = this.f225185i;
        bsa bsaVarM26199b = ak70Var.m26199b(strM47689b, strM76035e, zM88271j);
        if (!"empty".equals(hjiVar.m47691d().m93944c())) {
            this.f225189m.mo23393b(this.f225178b.f235651a.f246565e.m27704e(roaVarM82054m, bundle).map(new hd41(this, 27)).subscribe(new wk6(this, bsaVarM26199b, gh00Var), new sz8(this, bsaVarM26199b, z650VarMo82055n, roaVarM82054m, gh00Var)));
        } else {
            Logger.m3966b("MBS: Requested to load children with empty root list type", new Object[0]);
            gh00Var.invoke(lau.f131415a);
            ak70Var.m26198a(bsaVarM26199b, 4, 1);
        }
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: d */
    public final zvm0 mo37697d() {
        return this.f225177a.m47690c();
    }

    @Override // p204p.o9d0
    public void destroy() {
        this.f225177a.getClass();
        this.f225189m.m23396g();
        this.f225190n.dispose();
        this.f225192p.m60494H();
        this.f225183g.m25378f();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: e */
    public void mo36680e(String str, Bundle bundle, String str2, ye30 ye30Var, gh00 gh00Var, th00 th00Var, eh00 eh00Var) {
        hji hjiVar = this.f225177a;
        this.f225190n.m23400a(this.f225187k.mo46866b(new g9d0(str2, hjiVar.m47689b(), str, 10, false, ye30Var, 16)).map(new np7(5, this, str2 == null ? hjiVar.m47689b() : str2)).doOnDispose(new rw3(gh00Var, eh00Var, 1)).subscribe(new sw3(1, gh00Var), new sw3(th00Var)));
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: f */
    public final xnd0 mo37698f() {
        return this.f225179c;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: g */
    public final long mo37699g() {
        return this.f225191o;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: k */
    public boolean mo36681k() {
        return this.f225193q;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: l */
    public final String mo37703l() {
        return this.f225177a.m47689b();
    }

    /* JADX INFO: renamed from: m */
    public final roa m82054m(zvm0 zvm0Var) {
        UbiSpecificationId ubiSpecificationId;
        String strM74738M = this.f225188l.m74738M(zvm0Var);
        hji hjiVar = this.f225177a;
        String strM47689b = hjiVar.m47689b();
        String str = hjiVar.m47688a().p.kyx.b java.lang.String;
        boolean zM88271j = wj50.m88271j(hjiVar.m47690c(), zvm0Var);
        ExternalAccessoryDescription externalAccessoryDescriptionM47688a = hjiVar.m47688a();
        String strM93944c = hjiVar.m47691d().m93944c();
        String strM93943b = hjiVar.m47691d().m93943b();
        String strM47689b2 = hjiVar.m47689b();
        boolean zM93945d = hjiVar.m47691d().m93945d();
        for (Map.Entry entry : this.f225182f.f38055b.entrySet()) {
            ubiSpecificationId = (UbiSpecificationId) entry.getKey();
            ((jw3) ((uw91) entry.getValue())).getClass();
            if (t0j.m79831l(strM47689b)) {
                return new roa(strM93944c, strM74738M, strM47689b2, strM93943b, externalAccessoryDescriptionM47688a, zM88271j, zM93945d, null, 0, 2, ubiSpecificationId, 118176);
            }
        }
        ubiSpecificationId = UbiSpecificationId.UNKNOWN;
        return new roa(strM93944c, strM74738M, strM47689b2, strM93943b, externalAccessoryDescriptionM47688a, zM88271j, zM93945d, null, 0, 2, ubiSpecificationId, 118176);
    }

    /* JADX INFO: renamed from: n */
    public z650 mo82055n(roa roaVar) {
        xul0 hzq0Var;
        UbiSpecificationId ubiSpecificationIdM76038h = roaVar.m76038h();
        if (ubiSpecificationIdM76038h != UbiSpecificationId.UNKNOWN) {
            String strM76035e = roaVar.m76035e();
            chp chpVar = this.f225182f;
            m0y m0yVar = (m0y) chpVar.m32805b(strM76035e, ubiSpecificationIdM76038h).mo49283h();
            n0y n0yVar = new n0y(ubiSpecificationIdM76038h, strM76035e, m0yVar != null ? Integer.valueOf(m0yVar.m60480b()) : null, 4);
            uw91 uw91Var = (uw91) chpVar.f38055b.get(n0yVar.m63464c());
            if (uw91Var == null || "spotify_media_browser_root_android_auto".equals(n0yVar.m63465d())) {
                hzq0Var = C2244p5.f174033a;
            } else {
                List list = jw3.f116563b;
                hzq0Var = new hzq0(iw3.m51780b(n0yVar.m63465d(), ((jw3) uw91Var).f116564a.f159009a).m44165h(n0yVar.m63463b(), strM76035e).m32157a(strM76035e));
            }
            av91 av91Var = (av91) hzq0Var.mo49283h();
            if (av91Var != null) {
                ExternalAccessoryDescription externalAccessoryDescriptionM47688a = this.f225177a.m47688a();
                myx myxVar = this.f225181e;
                return myxVar.m63229q(externalAccessoryDescriptionM47688a, myxVar.f148555h.m38285a(strM76035e), av91Var);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m82056o() {
        ((wy3) this.f225184h).getClass();
        this.f225191o = System.currentTimeMillis();
    }
}
