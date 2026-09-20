package p204p;

import android.content.Context;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes9.dex */
public final class tqm implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f222832a;

    /* JADX INFO: renamed from: b */
    public final Object f222833b;

    public /* synthetic */ tqm(Object obj, int i) {
        this.f222832a = i;
        this.f222833b = obj;
    }

    @Override // p204p.i4t0
    public final Object get() {
        switch (this.f222832a) {
            case 0:
                return ptl.m70983d((o6q) ((zci) ((ujh) this.f222833b).f231032b).f281517d.get());
            case 1:
                return new mrm(this);
            case 2:
                uhc uhcVar = (uhc) this.f222833b;
                l3n l3nVar = (l3n) uhcVar.f230413d;
                voc1 voc1VarM58014g = l3nVar.m58014g();
                la80 la80Var = l3nVar.f129350b;
                zam0 zam0Var = l3nVar.f129351c;
                jg31.m53271i(zam0Var);
                jen jenVar = (jen) uhcVar.f230411b;
                vo11 vo11Var = (vo11) jenVar.f111629b.f169271E4.get();
                jg31.m53271i(vo11Var);
                oj81 oj81Var = (oj81) jenVar.f111629b.f169758i6.get();
                jg31.m53271i(oj81Var);
                p4w p4wVar = (p4w) jenVar.f111629b.f169633b.f171024B.get();
                jg31.m53271i(p4wVar);
                ds60 ds60Var = (ds60) jenVar.f111629b.f169395M6.get();
                jg31.m53271i(ds60Var);
                izj izjVar = (izj) jenVar.f111629b.f169466Qd.get();
                jg31.m53271i(izjVar);
                s4k s4kVar = (s4k) jenVar.f111629b.f169633b.f171051E.get();
                jg31.m53271i(s4kVar);
                rkn rknVar = (rkn) jenVar.f111629b.f169913s2.get();
                jg31.m53271i(rknVar);
                nr50 nr50Var = ((csq) uhcVar.f230412c).f41673c;
                jg31.m53271i(nr50Var);
                lrt0 lrt0Var = (lrt0) jenVar.f111628a.f212526wc.get();
                jg31.m53271i(lrt0Var);
                return new pr50(voc1VarM58014g, la80Var, zam0Var, vo11Var, oj81Var, p4wVar, ds60Var, izjVar, s4kVar, rknVar, nr50Var, lrt0Var);
            case 3:
                return ptl.m70983d((o6q) ((rfk) ((t7j) this.f222833b).f217839b).f198667b.get());
            case 4:
                abk abkVar = (abk) this.f222833b;
                String strM58011d = ((l3n) abkVar.f14137b).m58011d();
                shk shkVar = (shk) ((dgn) abkVar.f14138c).f48838a.f212566xq.get();
                jg31.m53271i(shkVar);
                return new hjb0(strM58011d, shkVar);
            case 5:
                return new q1b(((Boolean) ((C2099lq) this.f222833b).f135865L0).booleanValue(), new o1b(R.dimen.cwp_content_area_spacer, R.dimen.cwp_content_area_spacer_none));
            case 6:
                return new esm(this);
            case 7:
                xio xioVar = (xio) ((nol) ((sti) this.f222833b).f213917a).f156743l.get();
                jg31.m53271i(xioVar);
                return new nfi0(xioVar);
            case 8:
                return new wsm(this);
            case 9:
                return new ptm(this);
            case 10:
                return hgi0.m47449B((dcm0) ((t7j) this.f222833b).f217839b);
            case 11:
                xho xhoVar = (xho) ((bco) ((n6i) this.f222833b).f150891b).f25926b;
                jg31.m53271i(xhoVar);
                return xhoVar;
            case 12:
                return new qtm(this, 0);
            case 13:
                whp whpVar = (whp) ((sti) this.f222833b).f213917a;
                Context context = (Context) whpVar.f251419b;
                jg31.m53271i(context);
                rj10 rj10Var = new rj10(context);
                j6r j6rVar = (j6r) whpVar.f251420c;
                jg31.m53271i(j6rVar);
                qre0 qre0Var = (qre0) whpVar.f251421d;
                jg31.m53271i(qre0Var);
                return new xjp(rj10Var, j6rVar, qre0Var);
            case 14:
                kqr kqrVar = (kqr) ((ydi) this.f222833b).f271774b;
                aba0 aba0Var = (aba0) kqrVar.f125383a.get();
                jg31.m53271i(aba0Var);
                af41 af41Var = (af41) kqrVar.f125384b.get();
                jg31.m53271i(af41Var);
                return new kyd(aba0Var, af41Var);
            case 15:
                return new hum(this);
            case 16:
                urm urmVar = (urm) this.f222833b;
                String strM58011d2 = ((l3n) urmVar.f233404c).m58011d();
                men menVar = (men) urmVar.f233403b;
                gfi0 gfi0Var = (gfi0) menVar.f142768b.f169770j3.get();
                jg31.m53271i(gfi0Var);
                q831 q831Var = (q831) menVar.f142767a.f211468Ja.get();
                jg31.m53271i(q831Var);
                qkx0 qkx0Var = (qkx0) menVar.f142768b.f169864p1.get();
                jg31.m53271i(qkx0Var);
                kwf0 kwf0Var = (kwf0) menVar.f142768b.f169257D6.get();
                jg31.m53271i(kwf0Var);
                return new C1790du(strM58011d2, gfi0Var, q831Var, qkx0Var, kwf0Var);
            case 17:
                i0d i0dVar = (i0d) this.f222833b;
                mrq mrqVar = (mrq) i0dVar.f97206d;
                pgo pgoVar = mrqVar.f146588a;
                jg31.m53271i(pgoVar);
                String strM58011d3 = ((l3n) i0dVar.f97205c).m58011d();
                oen oenVar = (oen) i0dVar.f97204b;
                wrf0 wrf0Var = (wrf0) oenVar.f164479c.f169673d6.get();
                jg31.m53271i(wrf0Var);
                kq80 kq80Var = mrqVar.f146591d;
                jg31.m53271i(kq80Var);
                bji bjiVar = (bji) oenVar.f164478b.f212567y1.get();
                jg31.m53271i(bjiVar);
                nn40 nn40Var = new nn40(new xl4(false, bjiVar));
                z6g0 z6g0Var = (z6g0) oenVar.f164479c.f169707f6.get();
                jg31.m53271i(z6g0Var);
                mys mysVar = (mys) oenVar.f164479c.f169853o6.get();
                jg31.m53271i(mysVar);
                return new pk0(pgoVar, strM58011d3, wrf0Var, kq80Var, nn40Var, z6g0Var, mysVar, (mrq) i0dVar.f97206d);
            case 18:
                return new oum(this);
            case 19:
                return hgi0.m47449B((dcm0) ((t7j) this.f222833b).f217839b);
            case 20:
                abk abkVar2 = (abk) this.f222833b;
                ven venVar = (ven) abkVar2.f14137b;
                gfi0 gfi0Var2 = (gfi0) venVar.f240774b.f169770j3.get();
                jg31.m53271i(gfi0Var2);
                epx epxVar = (epx) venVar.f240773a.f211278C2.get();
                jg31.m53271i(epxVar);
                rbt rbtVar = new rbt(epxVar);
                m57 m57Var = new m57(9);
                bsn bsnVar = (bsn) venVar.f240774b.f169267Dg.get();
                jg31.m53271i(bsnVar);
                pgo pgoVar2 = ((trq) abkVar2.f14138c).f223105a;
                jg31.m53271i(pgoVar2);
                return new dmk(gfi0Var2, rbtVar, m57Var, bsnVar, pgoVar2);
            case 21:
                k7p0 k7p0Var = (k7p0) ((xeu) ((n6i) this.f222833b).f150891b).f260774b;
                jg31.m53271i(k7p0Var);
                return k7p0Var.m55694a(new ib7(1));
            case 22:
                urm urmVar2 = (urm) this.f222833b;
                k7p0 k7p0Var2 = (k7p0) ((a6v) urmVar2.f233404c).f12880f.get();
                jg31.m53271i(k7p0Var2);
                return qrl0.m73648u((dcm0) urmVar2.f233405d, k7p0Var2);
            case 23:
                return new tvm(this, 1);
            case 24:
                kv91 kv91Var = (kv91) ((n3x) ((sti) this.f222833b).f213917a).f150150b.get();
                jg31.m53271i(kv91Var);
                return kv91Var;
            case 25:
                tey teyVar = (tey) ((wym) this.f222833b).f256321c;
                st91 st91Var = (st91) teyVar.f219808b;
                puk pukVarMo98367create = ((ouk) teyVar.f219809c).mo98367create();
                st91Var.getClass();
                return new n6i(24, pukVarMo98367create, st91Var).m63776f();
            case 26:
                luk lukVar = ((gzm) this.f222833b).f85985a.f129998a;
                jg31.m53271i(lukVar);
                return new h1y(lukVar);
            case 27:
                urm urmVar3 = (urm) this.f222833b;
                g8y g8yVar = (g8y) urmVar3.f233404c;
                Scheduler scheduler = (Scheduler) g8yVar.f77627e.get();
                jg31.m53271i(scheduler);
                q8y q8yVar = (q8y) g8yVar.f77623a.get();
                jg31.m53271i(q8yVar);
                jwx0 jwx0Var = new jwx0(scheduler, q8yVar);
                Scheduler scheduler2 = (Scheduler) g8yVar.f77626d.get();
                jg31.m53271i(scheduler2);
                oc80 oc80Var = ((i8y) urmVar3.f233405d).f98716q1;
                t46 t46Var = new t46(28);
                viy0 viy0VarM83859e = urmVar3.m83859e();
                ubq0 ubq0Var = (ubq0) g8yVar.f77625c.get();
                jg31.m53271i(ubq0Var);
                return new l8y(jwx0Var, scheduler2, oc80Var, t46Var, new qrl(viy0VarM83859e, ubq0Var));
            case 28:
                return new hzm(this);
            default:
                return new e84((Context) ((mzm) this.f222833b).f148727a.f107186a.get());
        }
    }
}
