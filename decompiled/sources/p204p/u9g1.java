package p204p;

import android.content.SharedPreferences;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass$StreamReportingAttribution;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u9g1 {

    /* JADX INFO: renamed from: a */
    public static final Object f228194a = new Object();

    /* JADX INFO: renamed from: b */
    public static sd40 f228195b = null;

    /* JADX INFO: renamed from: c */
    public static sd40 f228196c = null;

    /* JADX INFO: renamed from: d */
    public static int f228197d = 10;

    /* JADX INFO: renamed from: e */
    public static SharedPreferences f228198e;

    /* JADX INFO: renamed from: a */
    public static final void m82620a(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-1287096120);
        int i2 = i | 6 | (xq00Var.m91770i(eh00Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            y0v.m92603a(1, rkk.m75772x(2096411068, new zt10(21, eh00Var), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(fxh0Var, eh00Var, i, 10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m82621b(String str, wwu wwuVar, boolean z, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        long j;
        long j2;
        int i2;
        cxh0 cxh0Var;
        boolean z2;
        long j3;
        xq00Var.m91775k0(-101373494);
        int i3 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91770i(wwuVar) ? 32 : 16) | (xq00Var.m91768h(z) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024) | 24576;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            if (z) {
                xq00Var.m91771i0(1364326894);
                j = leu.m58815a(xq00Var).f112824b.f138757a;
            } else {
                xq00Var.m91771i0(1364328302);
                j = leu.m58815a(xq00Var).f112823a.f229875b.f123093a;
            }
            xq00Var.m91788r(false);
            if (z) {
                xq00Var.m91771i0(1364330510);
                j2 = leu.m58815a(xq00Var).f112823a.f229876c;
            } else {
                xq00Var.m91771i0(1364331502);
                j2 = leu.m58815a(xq00Var).f112824b.f138757a;
            }
            xq00Var.m91788r(false);
            long j4 = j2;
            fmx0 fmx0VarM47992a = hmx0.m47992a(50);
            float f = leu.m58816b(xq00Var).f117232d.f137886b;
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM96830A = zsf1.m96830A(hdi.m47247x(nec.m64246i(r9g1.m75068p(mi21.m61824h(f, cxh0Var2), fmx0VarM47992a), j, kxf1.f127485a), false, null, new tix0(0), null, eh00Var, 11), leu.m58816b(xq00Var).f117230b.f224762e, 0.0f, 2);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96830A);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (wwuVar != null) {
                xq00Var.m91771i0(1012204447);
                i2 = i3;
                z2 = true;
                cxh0Var = cxh0Var2;
                j3 = j4;
                y85.m93057b(wwuVar, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0Var2), j3, 0L, false, xq00Var, 56 | ((i3 >> 3) & 14), 48);
                mt60.m62806m(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, xq00Var, false);
            } else {
                i2 = i3;
                cxh0Var = cxh0Var2;
                z2 = true;
                j3 = j4;
                xq00Var.m91771i0(1012470644);
                xq00Var.m91788r(false);
            }
            ahf1.m25932d(str, null, leu.m58818d(xq00Var).f64975k, j3, null, null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2034);
            xq00Var.m91788r(z2);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new k80(str, wwuVar, z, eh00Var, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m82622c(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-1481395819);
        int i2 = i | 6;
        int i3 = 2;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            y0v.m92603a(1, rkk.m75772x(-2082282719, new zej0(i3, 27, false), xq00Var), xq00Var, 390, 2);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zen0(fxh0Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final xwa1 m82623d(dut dutVar, zz41 zz41Var) {
        return new xwa1(dutVar, zz41Var, zz41Var.getId());
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX INFO: renamed from: e */
    public static final void m82624e(clt0 clt0Var, boolean z, boolean z2, String str, e0o e0oVar, gh00 gh00Var, eh00 eh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        boolean z3;
        xq00 xq00Var2;
        fxh0 fxh0Var2;
        String strM29801l0;
        boolean z4;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(432623949);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(clt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= xq00Var.m91768h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(e0oVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if (xq00Var.m91752Y(i3 & 1, (4793491 & i3) != 4793490)) {
            if (str == null) {
                strM29801l0 = null;
            } else {
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    strM29801l0 = bm51.m29801l0("https://p.scdn.co/mp3-preview/{id}", "{id}", str2);
                } else {
                    strM29801l0 = null;
                }
            }
            int i4 = clt0Var.f39383b;
            int i5 = clt0Var.f39384c;
            String str3 = clt0Var.f39386e;
            int i6 = i3 & 458752;
            boolean z5 = i6 == 131072;
            Object objM91750T = xq00Var.m91750T();
            if (z5 || objM91750T == ia7Var) {
                objM91750T = new vrf0(27, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            eh00 eh00Var2 = (eh00) objM91750T;
            boolean z6 = i6 == 131072;
            Object objM91750T2 = xq00Var.m91750T();
            if (z6 || objM91750T2 == ia7Var) {
                objM91750T2 = new vrf0(28, gh00Var);
                xq00Var.m91793t0(objM91750T2);
            }
            tar0 tar0Var = new tar0(strM29801l0, z3, i4, i5, str3, z2, eh00Var2, (eh00) objM91750T2, eh00Var);
            boolean zM91766g = xq00Var.m91766g(clt0Var.f39386e);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g || objM91750T3 == ia7Var) {
                objM91750T3 = new var0((eri0) ((ofn) e0oVar.f55008a.f171807c).f164857h.get());
                xq00Var.m91793t0(objM91750T3);
            }
            var0 var0Var = (var0) objM91750T3;
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61822f = z2 ? mi21.m61822f(1.0f, cxh0Var) : mi21.m61820d(1.0f, cxh0Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46145P0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            yoh.m94285b(i3 & 896, 2, clt0Var.f39385d, xq00Var, null, z2);
            xq00Var2 = xq00Var;
            if (z2) {
                xq00Var2.m91771i0(389184800);
                riw0.m75615i(xq00Var2, mi21.m61834r(f, cxh0Var));
                xq00Var2.m91788r(false);
            } else {
                xq00Var2.m91771i0(389252907);
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                riw0.m75615i(xq00Var2, new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                xq00Var2.m91788r(false);
            }
            mif1.m61869b(var0Var, tar0Var, null, null, xq00Var2, 8, 12);
            if (z2) {
                xq00Var2.m91771i0(389402048);
                riw0.m75615i(xq00Var2, mi21.m61834r(f, cxh0Var));
                xq00Var2.m91788r(false);
                z4 = true;
            } else {
                xq00Var2.m91771i0(389470155);
                if (1.0f <= 0.0d) {
                    kt40.m57301a("invalid weight; must be greater than zero");
                }
                z4 = true;
                riw0.m75615i(xq00Var2, new cr70(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(z4);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sta(clt0Var, z, z2, str, e0oVar, gh00Var, eh00Var, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m82625f(px41 px41Var, int i, prn0 prn0Var) {
        boolean z;
        synchronized (f228194a) {
            int i2 = px41Var.f182205d;
            if (i2 == i) {
                px41Var.f182204c = prn0Var;
                z = true;
                px41Var.f182205d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: g */
    public static final fx6 m82626g(zu0 zu0Var) {
        suj sujVar = new suj();
        sujVar.f214135a = zu0Var;
        int i = 1;
        sujVar.f214136b = new slm(sujVar, 0, i);
        sujVar.f214137c = new slm(sujVar, 1, i);
        xdd0 xdd0Var = (xdd0) zu0Var.f286302e;
        jg31.m53271i(xdd0Var);
        aed0 aed0Var = (aed0) zu0Var.f286296Y;
        jg31.m53271i(aed0Var);
        j4p0 j4p0Var = (j4p0) zu0Var.f286303f;
        jg31.m53271i(j4p0Var);
        ulp ulpVar = (ulp) zu0Var.f286301d;
        jg31.m53271i(ulpVar);
        ac5 ac5Var = new ac5(ulpVar, 3);
        er70 er70VarM27971a = b2s.m27971a((slm) sujVar.f214136b);
        er70 er70VarM27971a2 = b2s.m27971a((slm) sujVar.f214137c);
        Flowable flowable = (Flowable) zu0Var.f286306i;
        jg31.m53271i(flowable);
        Scheduler scheduler = (Scheduler) zu0Var.f286307t;
        jg31.m53271i(scheduler);
        Set set = (Set) zu0Var.f286299b;
        jg31.m53271i(set);
        Set set2 = set;
        Observable observable = (Observable) zu0Var.f286297Z;
        jg31.m53271i(observable);
        qe0 qe0Var = (qe0) zu0Var.f286293L0;
        jg31.m53271i(qe0Var);
        dv3 dv3Var = (dv3) zu0Var.f286294M0;
        jg31.m53271i(dv3Var);
        hz6 hz6Var = (hz6) zu0Var.f286300c;
        jg31.m53271i(hz6Var);
        RxRouter rxRouter = (RxRouter) zu0Var.f286295X;
        jg31.m53271i(rxRouter);
        return new fx6(xdd0Var, aed0Var, j4p0Var, ac5Var, er70VarM27971a, er70VarM27971a2, flowable, scheduler, set2, observable, qe0Var, dv3Var, hz6Var, new a470(new C2048kd(new CosmosTransport(new qev0(rxRouter, i)))));
    }

    /* JADX INFO: renamed from: h */
    public static final Long m82627h(x430 x430Var, boolean z) {
        if (z || x430Var.f257971d.f139992b.m1932r() == 0) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(x430Var.f257971d.f139992b.m1932r()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static final void m82628i(xpz xpzVar) {
        exh0 exh0Var = (exh0) xpzVar;
        if (!exh0Var.f63770a.f63766L0) {
            mt40.m62791c("visitChildren called on an unattached node");
        }
        qqi0 qqi0Var = new qqi0(0, new exh0[16]);
        exh0 exh0Var2 = exh0Var.f63770a;
        exh0 exh0Var3 = exh0Var2.f63775f;
        if (exh0Var3 == null) {
            wjg1.m88329h(qqi0Var, exh0Var2);
        } else {
            qqi0Var.m73556b(exh0Var3);
        }
        while (true) {
            int i = qqi0Var.f191610c;
            if (i == 0) {
                return;
            }
            exh0 exh0VarM88331j = (exh0) qqi0Var.m73565l(i - 1);
            if ((exh0VarM88331j.f63773d & 1024) == 0) {
                wjg1.m88329h(qqi0Var, exh0VarM88331j);
            } else {
                while (exh0VarM88331j != null) {
                    if ((exh0VarM88331j.f63772c & 1024) != 0) {
                        qqi0 qqi0Var2 = null;
                        while (exh0VarM88331j != null) {
                            if (exh0VarM88331j instanceof pqz) {
                                pqz pqzVar = (pqz) exh0VarM88331j;
                                kpz kpzVar = ((rpz) ((oz3) wjg1.m88320J(pqzVar)).getFocusOwner()).f201665d;
                                if (kpzVar.f125167c.m36642a(pqzVar)) {
                                    kpzVar.m57064a();
                                }
                            } else if ((exh0VarM88331j.f63772c & 1024) != 0 && (exh0VarM88331j instanceof xlq)) {
                                int i2 = 0;
                                for (exh0 exh0Var4 = ((xlq) exh0VarM88331j).f263224N0; exh0Var4 != null; exh0Var4 = exh0Var4.f63775f) {
                                    if ((exh0Var4.f63772c & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            exh0VarM88331j = exh0Var4;
                                        } else {
                                            if (qqi0Var2 == null) {
                                                qqi0Var2 = new qqi0(0, new exh0[16]);
                                            }
                                            if (exh0VarM88331j != null) {
                                                qqi0Var2.m73556b(exh0VarM88331j);
                                                exh0VarM88331j = null;
                                            }
                                            qqi0Var2.m73556b(exh0Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            exh0VarM88331j = wjg1.m88331j(qqi0Var2);
                        }
                        break;
                    }
                    exh0VarM88331j = exh0VarM88331j.f63775f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Long m82629j(boolean z, kar0 kar0Var) {
        if (z || kar0Var == null) {
            return null;
        }
        long j = kar0Var.f120953b;
        hvi0 hvi0Var = cks.f39079b;
        if (cks.m33199r(j, ils.SECONDS) == 0) {
            return null;
        }
        return Long.valueOf(cks.m33187f(j));
    }

    /* JADX INFO: renamed from: k */
    public static final qf40 m82630k(List list, xq00 xq00Var) {
        boolean zM91766g = xq00Var.m91766g(list);
        Object objM91750T = xq00Var.m91750T();
        if (zM91766g || objM91750T == t6x0.f217647t) {
            objM91750T = opo.m67574x(list);
            xq00Var.m91793t0(objM91750T);
        }
        return (qf40) objM91750T;
    }

    /* JADX INFO: renamed from: l */
    public static final Object m82631l(qho qhoVar) {
        if (qhoVar instanceof oho) {
            return ((oho) qhoVar).f165512a;
        }
        throw new IllegalStateException(("BatchItemResultRequest must always produce Loaded, but got " + qhoVar).toString());
    }

    /* JADX INFO: renamed from: m */
    public static final ay7 m82632m(pgo pgoVar, tjo tjoVar, List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tjoVar.mo28634a(it.next()));
        }
        l49 l49Var = new l49(arrayList);
        List list2 = (List) m82631l(pgoVar.mo25866b(l49Var));
        fol folVar = new fol(pgoVar, l49Var, null, 3);
        return new ay7(jag1.m52819d(list2), msi0.m62770a(), new AtomicInteger(0), new rlv0(), folVar, dau.f47107a);
    }

    /* JADX INFO: renamed from: n */
    public static void m82633n(int i) {
        f228197d = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m82634o(SharedPreferences sharedPreferences) {
        f228198e = sharedPreferences;
    }

    /* JADX INFO: renamed from: p */
    public static final StreamReportingAttributionOuterClass$StreamReportingAttribution m82635p(gh00 gh00Var) {
        String str = (String) gh00Var.invoke("provenance_id");
        String str2 = (String) gh00Var.invoke("page_id");
        String str3 = (String) gh00Var.invoke("root_specification_id");
        String str4 = (String) gh00Var.invoke("leaf_specification_id");
        if (str == null && str2 == null && str3 == null && str4 == null) {
            return null;
        }
        pi51 pi51VarM21617r = StreamReportingAttributionOuterClass$StreamReportingAttribution.m21617r();
        if (str != null) {
            wj50.m88279p(pi51VarM21617r);
            pi51VarM21617r.m70072r(str);
        }
        if (str2 != null) {
            wj50.m88279p(pi51VarM21617r);
            pi51VarM21617r.m70071q(str2);
        }
        if (str3 != null) {
            wj50.m88279p(pi51VarM21617r);
            pi51VarM21617r.m70073s(str3);
        }
        if (str4 != null) {
            wj50.m88279p(pi51VarM21617r);
            pi51VarM21617r.m70070m(str4);
        }
        return (StreamReportingAttributionOuterClass$StreamReportingAttribution) pi51VarM21617r.build();
    }

    /* JADX INFO: renamed from: q */
    public static void m82636q(int i, String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences sharedPreferences = f228198e;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutInt = editorEdit.putInt(edb.m38566o("OopsSamplingOverride:", str, ":", str2), i)) == null) {
            return;
        }
        editorPutInt.apply();
    }
}
