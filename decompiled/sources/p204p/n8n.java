package p204p;

import android.app.Activity;
import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class n8n implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151566a;

    /* JADX INFO: renamed from: b */
    public final Object f151567b;

    public /* synthetic */ n8n(Object obj, int i) {
        this.f151566a = i;
        this.f151567b = obj;
    }

    @Override // p204p.i4t0
    public final Object get() {
        int i = this.f151566a;
        int i2 = 1;
        int i3 = 0;
        Object obj = this.f151567b;
        switch (i) {
            case 0:
                return ptl.m70983d((o6q) ((kzj0) ((vpj) obj).f243701b).f128144d.get());
            case 1:
                beh0 beh0Var = ((gbn) obj).f78361a.f265608e;
                jg31.m53271i(beh0Var);
                return new eeh0(beh0Var.mo24361d());
            case 2:
                urm urmVar = (urm) obj;
                voc1 voc1VarM58014g = ((l3n) urmVar.f233404c).m58014g();
                len lenVar = (len) urmVar.f233403b;
                z9j0 z9j0Var = (z9j0) lenVar.f132604a.f169565X.get();
                jg31.m53271i(z9j0Var);
                fwk0 fwk0Var = (fwk0) lenVar.f132604a.f169914s3.get();
                jg31.m53271i(fwk0Var);
                return new C1790du(voc1VarM58014g, z9j0Var, fwk0Var);
            case 3:
                sii siiVar = (sii) ((nfn) ((r8n) obj).f196820c).f153401a.f211907Zf.get();
                jg31.m53271i(siiVar);
                return siiVar;
            case 4:
                sii siiVar2 = (sii) ((zfn) ((z4n) obj).f279302b).f282351a.f211907Zf.get();
                jg31.m53271i(siiVar2);
                return siiVar2;
            case 5:
                return new nbn(this);
            case 6:
                return new qbn(this);
            case 7:
                twx twxVar = (twx) ((vpj) obj).f243701b;
                return new x4m0((wi8) twxVar.f224496b.get(), (r500) twxVar.f224499e.get(), (w6j0) twxVar.f224495a.get(), (ymv0) twxVar.f224500f.get());
            case 8:
                return ptl.m70983d((o6q) ((tvm0) ((ybn) obj).f271220c).f224194c.get());
            case 9:
                return ptl.m70983d((o6q) ((con0) ((r8n) obj).f196820c).f40311c.get());
            case 10:
                m9p0 m9p0Var = (m9p0) ((fbk0) ((z4n) obj).f279302b).f67847b;
                jg31.m53271i(m9p0Var);
                return m9p0Var.m61227a();
            case 11:
                return hgi0.m47449B((dcm0) ((hcn) obj).f89845b);
            case 12:
                return hgi0.m47449B((dcm0) ((urm) obj).f233403b);
            case 13:
                return new ncn(this, 0);
            case 14:
                return new ocn(this);
            case 15:
                i0d i0dVar = (i0d) obj;
                pnp0 pnp0Var = (pnp0) i0dVar.f97204b;
                n011 n011Var = (n011) pnp0Var.f179463j.get();
                jg31.m53271i(n011Var);
                k5k0 k5k0VarM49369n = i0dVar.m49369n();
                ia7 ia7Var = new ia7(20);
                z4a0 z4a0Var = new z4a0((wnp0) i0dVar.f97205c, 1);
                Activity activity = (Activity) pnp0Var.f179457d.get();
                jg31.m53271i(activity);
                i4t0 i4t0Var = pnp0Var.f179460g;
                qcx0 qcx0Var = (qcx0) i4t0Var.get();
                jg31.m53271i(qcx0Var);
                ivz ivzVar = (ivz) pnp0Var.f179462i.get();
                jg31.m53271i(ivzVar);
                lwz lwzVar = (lwz) pnp0Var.f179461h.get();
                jg31.m53271i(lwzVar);
                dcm0 dcm0Var = (dcm0) i0dVar.f97206d;
                hc80 hc80Var = dcm0Var.f47583d.f68149c;
                jg31.m53272j(hc80Var);
                i4t0 i4t0Var2 = pnp0Var.f179465l;
                q831 q831Var = (q831) i4t0Var2.get();
                jg31.m53271i(q831Var);
                owz owzVar = new owz(activity, qcx0Var, ivzVar, lwzVar, hc80Var, q831Var, i0dVar.m49369n(), new xug0(16, (byte) 0));
                yby0 yby0Var = (yby0) pnp0Var.f179467n.get();
                jg31.m53271i(yby0Var);
                zby0 zby0Var = new zby0(yby0Var, new xug0(16, (byte) 0), 0);
                i4t0 i4t0Var3 = pnp0Var.f179456c;
                Context context = (Context) i4t0Var3.get();
                jg31.m53271i(context);
                hc80 hc80Var2 = dcm0Var.f47583d.f68149c;
                jg31.m53272j(hc80Var2);
                qcx0 qcx0Var2 = (qcx0) i4t0Var.get();
                jg31.m53271i(qcx0Var2);
                q831 q831Var2 = (q831) i4t0Var2.get();
                jg31.m53271i(q831Var2);
                k5k0 k5k0VarM49369n2 = i0dVar.m49369n();
                i4t0 i4t0Var4 = pnp0Var.f179464k;
                yz80 yz80Var = (yz80) i4t0Var4.get();
                jg31.m53271i(yz80Var);
                mjw0 mjw0Var = new mjw0(context, hc80Var2, qcx0Var2, q831Var2, k5k0VarM49369n2, yz80Var, new xug0(16, (byte) 0));
                i4t0 i4t0Var5 = pnp0Var.f179458e;
                z9j0 z9j0Var2 = (z9j0) i4t0Var5.get();
                jg31.m53271i(z9j0Var2);
                zby0 zby0Var2 = new zby0(z9j0Var2, new xug0(16, (byte) 0), 1);
                Context context2 = (Context) i4t0Var3.get();
                jg31.m53271i(context2);
                z9j0 z9j0Var3 = (z9j0) i4t0Var5.get();
                jg31.m53271i(z9j0Var3);
                qcx0 qcx0Var3 = (qcx0) i4t0Var.get();
                jg31.m53271i(qcx0Var3);
                hc80 hc80Var3 = dcm0Var.f47583d.f68149c;
                jg31.m53272j(hc80Var3);
                q831 q831Var3 = (q831) i4t0Var2.get();
                jg31.m53271i(q831Var3);
                yz80 yz80Var2 = (yz80) i4t0Var4.get();
                jg31.m53271i(yz80Var2);
                k5k0 k5k0VarM49369n3 = i0dVar.m49369n();
                i4t0 i4t0Var6 = pnp0Var.f179470q;
                jh10 jh10Var = (jh10) i4t0Var6.get();
                jg31.m53271i(jh10Var);
                k180 k180Var = new k180(context2, z9j0Var3, qcx0Var3, hc80Var3, q831Var3, yz80Var2, k5k0VarM49369n3, jh10Var, new xug0(16, (byte) 0));
                Context context3 = (Context) i4t0Var3.get();
                jg31.m53271i(context3);
                jg31.m53271i((Context) i4t0Var3.get());
                jg31.m53271i((jh10) i4t0Var6.get());
                d67 d67Var = new d67(10);
                qcx0 qcx0Var4 = (qcx0) i4t0Var.get();
                jg31.m53271i(qcx0Var4);
                hc80 hc80Var4 = dcm0Var.f47583d.f68149c;
                jg31.m53272j(hc80Var4);
                q831 q831Var4 = (q831) i4t0Var2.get();
                jg31.m53271i(q831Var4);
                k5k0 k5k0VarM49369n4 = i0dVar.m49369n();
                yz80 yz80Var3 = (yz80) i4t0Var4.get();
                jg31.m53271i(yz80Var3);
                List listM46715L = h6f.m46715L(zby0Var2, k180Var, new g0c0(context3, d67Var, qcx0Var4, hc80Var4, q831Var4, k5k0VarM49369n4, yz80Var3, new xug0(16, (byte) 0)), mjw0Var, owzVar, zby0Var);
                z9j0 z9j0Var4 = (z9j0) i4t0Var5.get();
                jg31.m53271i(z9j0Var4);
                bji bjiVar = (bji) pnp0Var.f179469p.get();
                jg31.m53271i(bjiVar);
                k4k0 k4k0Var = new k4k0(new sti(listM46715L, new orz0(z9j0Var4, new rl4(false, bjiVar), new xug0(16, (byte) 0))), 16);
                rkn rknVar = (rkn) pnp0Var.f179471r.get();
                jg31.m53271i(rknVar);
                return new e6a0(n011Var, k5k0VarM49369n, ia7Var, new cxb(z4a0Var, k4k0Var, rknVar, 29), 22);
            case 16:
                he90 he90Var = (he90) ((ybn) obj).f271220c;
                Flowable flowable = (Flowable) he90Var.f90378b;
                jg31.m53271i(flowable);
                xre xreVar = (xre) he90Var.f90379c;
                jg31.m53271i(xreVar);
                String str = (String) he90Var.f90384h;
                Object obj2 = he90Var.f90381e;
                Object obj3 = he90Var.f90385i;
                Object obj4 = he90Var.f90383g;
                Object obj5 = he90Var.f90380d;
                Object obj6 = he90Var.f90382f;
                return new i7p0(flowable, xreVar, str, new j7p0());
            case 17:
                return new nim(this, i2);
            case 18:
                okj0 okj0Var = ((udn) obj).f229273a;
                leh0 leh0Var = (leh0) okj0Var.f166380a;
                jg31.m53271i(leh0Var);
                dcr0 dcr0Var = (dcr0) okj0Var.f166382c;
                jg31.m53271i(dcr0Var);
                m011 m011Var = (m011) okj0Var.f166383d;
                jg31.m53271i(m011Var);
                return new p311(new oyn0(leh0Var, new m47(19, dcr0Var, m011Var)));
            case 19:
                return new uwx0(eit0.m39122k((RetrofitMaker) ((son) ((r8n) obj).f196820c).f211866Y2.get()));
            case 20:
                return new rqn(this, 1);
            case 21:
                return new zyn(this);
            case 22:
                iin iinVar = (iin) obj;
                l3n l3nVar = (l3n) iinVar.f102606b;
                String strM58011d = l3nVar.m58011d();
                kq80 kq80Var = ((mrq) iinVar.f102607c).f146591d;
                jg31.m53271i(kq80Var);
                uen uenVar = (uen) iinVar.f102608d;
                luk lukVar = (luk) uenVar.f229563a.f211486K2.get();
                jg31.m53271i(lukVar);
                pps0 pps0Var = new pps0(lukVar, kq80Var);
                String strM58011d2 = l3nVar.m58011d();
                hg6 hg6Var = (hg6) uenVar.f229564b.f169605Z5.get();
                jg31.m53271i(hg6Var);
                luk lukVar2 = (luk) uenVar.f229563a.f212491v3.get();
                jg31.m53271i(lukVar2);
                return new qce0(strM58011d, pps0Var, new eps0(strM58011d2, hg6Var, lukVar2), uenVar.f229564b.m68052x0());
            case 23:
                return bga.m29058A(((z0n) obj).f278141a);
            case 24:
                return new ozn(this, i3);
            case 25:
                cdn cdnVar = (cdn) obj;
                l3n l3nVar2 = (l3n) cdnVar.f36917d;
                String strM58011d3 = l3nVar2.m58011d();
                mrq mrqVar = (mrq) cdnVar.f36916c;
                pgo pgoVar = mrqVar.f146588a;
                jg31.m53271i(pgoVar);
                String strM58011d4 = l3nVar2.m58011d();
                kq80 kq80Var2 = mrqVar.f146591d;
                jg31.m53271i(kq80Var2);
                oen oenVar = (oen) cdnVar.f36915b;
                luk lukVar3 = (luk) oenVar.f164478b.f211486K2.get();
                jg31.m53271i(lukVar3);
                lrs0 lrs0Var = new lrs0(pgoVar, strM58011d4, kq80Var2, lukVar3);
                String strM58011d5 = l3nVar2.m58011d();
                luk lukVar4 = (luk) oenVar.f164478b.f212491v3.get();
                jg31.m53271i(lukVar4);
                mys mysVar = (mys) oenVar.f164479c.f169853o6.get();
                jg31.m53271i(mysVar);
                zqs0 zqs0Var = new zqs0(strM58011d5, lukVar4, mysVar);
                suj sujVarM68052x0 = oenVar.f164479c.m68052x0();
                mys mysVar2 = (mys) oenVar.f164479c.f169853o6.get();
                jg31.m53271i(mysVar2);
                bji bjiVar2 = (bji) oenVar.f164478b.f212567y1.get();
                jg31.m53271i(bjiVar2);
                return new bmh(strM58011d3, lrs0Var, zqs0Var, sujVarM68052x0, mysVar2, new nn40(new xl4(false, bjiVar2)));
            case 26:
                ven venVar = (ven) ((r8n) obj).f196820c;
                otn otnVar = venVar.f240774b;
                rqs0 rqs0Var = (rqs0) otnVar.f169365K8.get();
                jg31.m53271i(rqs0Var);
                k5m0 k5m0Var = (k5m0) otnVar.f169719g1.get();
                jg31.m53271i(k5m0Var);
                son sonVar = venVar.f240773a;
                luk lukVar5 = (luk) sonVar.f212410s1.get();
                jg31.m53271i(lukVar5);
                yts0 yts0Var = (yts0) sonVar.f211919a.f18301C5.get();
                jg31.m53271i(yts0Var);
                oga0 oga0VarM67888O1 = otnVar.m67888O1();
                lja1 lja1Var = (lja1) otnVar.f169556W7.get();
                jg31.m53271i(lja1Var);
                yc90 yc90Var = new yc90(1);
                bji bjiVar3 = (bji) sonVar.f212567y1.get();
                jg31.m53271i(bjiVar3);
                l54 l54Var = new l54(bjiVar3);
                jts0 jts0Var = (jts0) otnVar.f169381L8.get();
                jg31.m53271i(jts0Var);
                pss0 pss0Var = new pss0(rqs0Var, k5m0Var, lukVar5, yts0Var, oga0VarM67888O1, lja1Var, yc90Var, l54Var, jts0Var);
                kss0 kss0Var = (kss0) venVar.f240774b.f169624a8.get();
                jg31.m53271i(kss0Var);
                return new s010(pss0Var, kss0Var);
            case 27:
                qzn qznVar = (qzn) obj;
                return new kwu0(((l3n) qznVar.f194229b).m58011d(), ((jfn) qznVar.f194230c).f111938a.m67884N2(), 0);
            case 28:
                wym wymVar = (wym) obj;
                men menVar = (men) wymVar.f256321c;
                z9j0 z9j0Var5 = (z9j0) menVar.f142768b.f169565X.get();
                jg31.m53271i(z9j0Var5);
                String strM58011d6 = ((l3n) wymVar.f256320b).m58011d();
                q831 q831Var5 = (q831) menVar.f142767a.f211468Ja.get();
                jg31.m53271i(q831Var5);
                cgm cgmVar = (cgm) menVar.f142767a.f212203k8.get();
                jg31.m53271i(cgmVar);
                gcu0 gcu0Var = (gcu0) menVar.f142767a.f211595O3.get();
                jg31.m53271i(gcu0Var);
                suj sujVarM68052x1 = menVar.f142768b.m68052x0();
                kss0 kss0Var2 = (kss0) menVar.f142768b.f169624a8.get();
                jg31.m53271i(kss0Var2);
                xux0 xux0Var = (xux0) menVar.f142768b.f169878pf.get();
                jg31.m53271i(xux0Var);
                lja1 lja1Var2 = (lja1) menVar.f142768b.f169556W7.get();
                jg31.m53271i(lja1Var2);
                return new l22(z9j0Var5, strM58011d6, q831Var5, cgmVar, gcu0Var, sujVarM68052x1, kss0Var2, xux0Var, lja1Var2);
            default:
                return ((len) ((z4n) obj).f279302b).f132604a.m67879M2();
        }
    }
}
