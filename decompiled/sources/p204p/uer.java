package p204p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uer implements ssi {

    /* JADX INFO: renamed from: a */
    public final er70 f229587a;

    /* JADX INFO: renamed from: b */
    public final voi f229588b;

    /* JADX INFO: renamed from: c */
    public final fer f229589c;

    /* JADX INFO: renamed from: d */
    public final ver f229590d;

    /* JADX INFO: renamed from: e */
    public final e24 f229591e;

    /* JADX INFO: renamed from: g */
    public final c9k f229593g;

    /* JADX INFO: renamed from: f */
    public final wg61 f229592f = new wg61(new edq(this, 18));

    /* JADX INFO: renamed from: h */
    public final zv41 f229594h = jag1.m52819d(null);

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f229595i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t */
    public final ConcurrentHashMap f229596t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: X */
    public final ConcurrentHashMap f229586X = new ConcurrentHashMap();

    public uer(er70 er70Var, luk lukVar, voi voiVar, fer ferVar, ver verVar, e24 e24Var) {
        this.f229587a = er70Var;
        this.f229588b = voiVar;
        this.f229589c = ferVar;
        this.f229590d = verVar;
        this.f229591e = e24Var;
        this.f229593g = edb.m38577z(lukVar);
    }

    /* JADX INFO: renamed from: i */
    public static dfr m82911i(ifr ifrVar, ddr ddrVar) {
        efr efrVarM50445b;
        Map mapM38746a;
        if (ifrVar == null || (efrVarM50445b = ifrVar.m50445b()) == null || (mapM38746a = efrVarM50445b.m38746a()) == null) {
            return null;
        }
        return (dfr) mapM38746a.get(ddrVar);
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        if (this.f229591e.m37578c()) {
            ConcurrentHashMap concurrentHashMap = this.f229596t;
            List listM43728j1 = g6f.m43728j1(concurrentHashMap.values());
            concurrentHashMap.clear();
            ConcurrentHashMap concurrentHashMap2 = this.f229586X;
            for (tf60 tf60Var : concurrentHashMap2.values()) {
                wj50.m88279p(tf60Var);
                tf60Var.mo26601e(null);
            }
            concurrentHashMap2.clear();
            qlg1.m73215t(this.f229593g.f35578a);
            this.f229594h.m97090l(null);
            Iterator it = listM43728j1.iterator();
            if (it.hasNext()) {
                ikc0.m50942n(it.next());
                throw null;
            }
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (this.f229591e.m37578c()) {
            fbk fbkVar = null;
            xuo xuoVar = new xuo(this, fbkVar, 28);
            c9k c9kVar = this.f229593g;
            x0h1.m89578u(c9kVar, null, 0, xuoVar, 3);
            for (ddr ddrVar : ddr.f47854c) {
                wxf1.m89255l(c9kVar, b0g1.m27776L(mvl0.m62953p(new ler(this.f229594h, this, ddrVar, 2)), new shh(this, ddrVar, fbkVar, 18)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        if (r0 == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r0 == r11) goto L42;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m82912c(ddr ddrVar, Long l, ibk ibkVar) {
        oer oerVar;
        ddr ddrVar2;
        Long l2;
        kmx kmxVarM27791m;
        if (ibkVar instanceof oer) {
            oerVar = (oer) ibkVar;
            int i = oerVar.f164516e;
            if ((i & Integer.MIN_VALUE) != 0) {
                oerVar.f164516e = i - Integer.MIN_VALUE;
            } else {
                oerVar = new oer(this, ibkVar);
            }
        } else {
            oerVar = new oer(this, ibkVar);
        }
        oer oerVar2 = oerVar;
        Object objM86755t = oerVar2.f164514c;
        int i2 = oerVar2.f164516e;
        zv41 zv41Var = this.f229594h;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            bpp bppVar = new bpp(4);
            oerVar2.f164512a = ddrVar;
            oerVar2.f164513b = l;
            oerVar2.f164516e = 1;
            if (vyf1.m86756u(zv41Var, bppVar, oerVar2) != yukVar) {
                ddrVar2 = ddrVar;
                l2 = l;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                bga.m29073P(objM86755t);
                return (qcr) objM86755t;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
            return (qcr) objM86755t;
        }
        Long l3 = oerVar2.f164513b;
        ddrVar2 = oerVar2.f164512a;
        bga.m29073P(objM86755t);
        l2 = l3;
        dfr dfrVarM82911i = m82911i((ifr) zv41Var.getValue(), ddrVar2);
        fbk fbkVar = null;
        if ((dfrVarM82911i != null ? dfrVarM82911i.m35901a() : null) == e261.f55372c) {
            dfrVarM82911i.m35903c().getClass();
            return dfrVarM82911i.m35903c();
        }
        this.f229589c.f68819a.mo30231j(pdr.f176535a);
        if (dfrVarM82911i == null) {
            kmxVarM27791m = b0g1.m27791m(new ler(zv41Var, this, ddrVar2, 0));
        } else {
            kmxVarM27791m = b0g1.m27791m(new ner(new ier(b0g1.m27791m(zv41Var), this, ddrVar2, dfrVarM82911i.m35901a(), dfrVarM82911i.m35902b(), 0), this, ddrVar2, 0));
        }
        if (l2 != null) {
            long jLongValue = l2.longValue();
            xuo xuoVar = new xuo(kmxVarM27791m, fbkVar, 27);
            oerVar2.f164512a = null;
            oerVar2.f164513b = null;
            oerVar2.f164516e = 2;
            objM86755t = s1h1.m76980u(jLongValue, xuoVar, oerVar2);
        } else {
            oerVar2.f164512a = null;
            oerVar2.f164513b = null;
            oerVar2.f164516e = 3;
            objM86755t = vyf1.m86755t(kmxVarM27791m, oerVar2);
        }
        return yukVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m82913d(String str, ddr ddrVar) {
        dfr dfrVarM82911i;
        if (str.length() == 0 || (dfrVarM82911i = m82911i((ifr) this.f229594h.getValue(), ddrVar)) == null) {
            return;
        }
        this.f229590d.m85327a(dfrVarM82911i.m35903c(), dfrVarM82911i.m35901a(), geg1.m44518y(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final Object m82914g(String str, ddr ddrVar, Long l, gh00 gh00Var, ibk ibkVar) {
        ser serVar;
        Object obj;
        if (ibkVar instanceof ser) {
            serVar = (ser) ibkVar;
            int i = serVar.f208380f;
            if ((i & Integer.MIN_VALUE) != 0) {
                serVar.f208380f = i - Integer.MIN_VALUE;
            } else {
                serVar = new ser(this, ibkVar);
            }
        } else {
            serVar = new ser(this, ibkVar);
        }
        Object objM82912c = serVar.f208378d;
        int i2 = serVar.f208380f;
        if (i2 == 0) {
            bga.m29073P(objM82912c);
            serVar.f208375a = str;
            serVar.f208376b = ddrVar;
            serVar.f208377c = (qe70) gh00Var;
            serVar.f208380f = 1;
            objM82912c = m82912c(ddrVar, l, serVar);
            Object obj2 = yuk.f276404a;
            if (objM82912c == obj2) {
                obj = gh00Var;
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = (gh00) serVar.f208377c;
            ddrVar = serVar.f208376b;
            str = serVar.f208375a;
            bga.m29073P(objM82912c);
            obj = obj3;
        }
        obj = gh00Var;
        Object obj4 = obj;
        qcr qcrVar = (qcr) objM82912c;
        if (qcrVar == null) {
            return null;
        }
        m82913d(str, ddrVar);
        di41 di41VarM89578u = x0h1.m89578u(this.f229593g, null, 0, new fol(22, this, obj4, qcrVar, qcrVar.mo66726e(), null), 3);
        tf60 tf60Var = (tf60) this.f229586X.put(new ger(str, ddrVar), di41VarM89578u);
        if (tf60Var != null) {
            tf60Var.mo26601e(null);
        }
        return qcrVar;
    }
}
