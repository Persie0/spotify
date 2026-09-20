package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dte0 implements qse0 {

    /* JADX INFO: renamed from: i */
    public static final long f52802i;

    /* JADX INFO: renamed from: j */
    public static final long f52803j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f52804k = 0;

    /* JADX INFO: renamed from: a */
    public final gse0 f52805a;

    /* JADX INFO: renamed from: b */
    public final er70 f52806b;

    /* JADX INFO: renamed from: c */
    public final luk f52807c;

    /* JADX INFO: renamed from: d */
    public final c9k f52808d;

    /* JADX INFO: renamed from: e */
    public final wg61 f52809e;

    /* JADX INFO: renamed from: f */
    public final zv41 f52810f;

    /* JADX INFO: renamed from: g */
    public final zv41 f52811g;

    /* JADX INFO: renamed from: h */
    public final zv41 f52812h;

    static {
        new l45(17);
        hvi0 hvi0Var = cks.f39079b;
        f52802i = jwg1.m54449D(1, ils.SECONDS);
        f52803j = jwg1.m54449D(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, ils.MILLISECONDS);
    }

    public dte0(gse0 gse0Var, ron ronVar, luk lukVar, er70 er70Var, luk lukVar2) {
        this.f52805a = gse0Var;
        this.f52806b = er70Var;
        this.f52807c = lukVar2;
        this.f52808d = kk40.m56661c(mlg1.m62205A(qlg1.m73202g(), lukVar));
        this.f52809e = new wg61(new kjd0(11, ronVar, this));
        lau lauVar = lau.f131415a;
        this.f52810f = jag1.m52819d(lauVar);
        this.f52811g = jag1.m52819d(lauVar);
        this.f52812h = jag1.m52819d(sse0.f213583a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r4 = th;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m36848a(dte0 dte0Var, zv41 zv41Var, kse0 kse0Var, nse0 nse0Var, ibk ibkVar) {
        yse0 yse0Var;
        rse0 rse0Var;
        Object value;
        Object value2;
        Object value3;
        if (ibkVar instanceof yse0) {
            yse0Var = (yse0) ibkVar;
            int i = yse0Var.f275759e;
            if ((i & Integer.MIN_VALUE) != 0) {
                yse0Var.f275759e = i - Integer.MIN_VALUE;
            } else {
                yse0Var = new yse0(dte0Var, ibkVar);
            }
        } else {
            yse0Var = new yse0(dte0Var, ibkVar);
        }
        Object objM38777P = yse0Var.f275757c;
        int i2 = yse0Var.f275759e;
        if (i2 == 0) {
            bga.m29073P(objM38777P);
            guf gufVarM62210c = mlg1.m62210c();
            rse0Var = new rse0(kse0Var, nse0Var, new gkq(gufVarM62210c, 1));
            do {
                value = zv41Var.getValue();
            } while (!zv41Var.m97089k(value, g6f.m43701O0(rse0Var, (List) value)));
            yse0Var.f275755a = zv41Var;
            yse0Var.f275756b = rse0Var;
            yse0Var.f275759e = 1;
            objM38777P = gufVarM62210c.m38777P(yse0Var);
            yuk yukVar = yuk.f276404a;
            if (objM38777P == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rse0 rse0Var2 = yse0Var.f275756b;
            zv41 zv41Var2 = yse0Var.f275755a;
            try {
                bga.m29073P(objM38777P);
                rse0Var = rse0Var2;
                zv41Var = zv41Var2;
            } catch (Throwable th) {
                Throwable th2 = th;
                rse0Var = rse0Var2;
                zv41Var = zv41Var2;
                do {
                    value2 = zv41Var.getValue();
                } while (!zv41Var.m97089k(value2, g6f.m43696J0((List) value2, rse0Var)));
                throw th2;
            }
        }
        boolean zBooleanValue = ((Boolean) objM38777P).booleanValue();
        do {
            value3 = zv41Var.getValue();
        } while (!zv41Var.m97089k(value3, g6f.m43696J0((List) value3, rse0Var)));
        return qyg1.m74178H(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (p204p.qlk.m73247z(r0) == r3) goto L26;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m36849b(dte0 dte0Var, d0r0 d0r0Var, ibk ibkVar) {
        cte0 cte0Var;
        dte0Var.getClass();
        if (ibkVar instanceof cte0) {
            cte0Var = (cte0) ibkVar;
            int i = cte0Var.f41867c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cte0Var.f41867c = i - Integer.MIN_VALUE;
            } else {
                cte0Var = new cte0(dte0Var, ibkVar);
            }
        } else {
            cte0Var = new cte0(dte0Var, ibkVar);
        }
        Object objInvoke = cte0Var.f41865a;
        int i2 = cte0Var.f41867c;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bga.m29073P(objInvoke);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objInvoke);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objInvoke);
            gh00 gh00VarM34552g = d0r0Var.m34552g();
            cte0Var.f41867c = 1;
            objInvoke = gh00VarM34552g.invoke(cte0Var);
            if (objInvoke == yukVar) {
            }
            return yukVar;
            if (((Boolean) objInvoke).booleanValue()) {
                cte0Var.f41867c = 2;
            }
        } catch (Exception e) {
            na6.m63959g("Exception while dismissing message", e);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m36850c(rse0 rse0Var, kse0 kse0Var) {
        return ((mse0) rse0Var.m76319c()).m62741a().m37397a(kse0Var, rse0Var.m76317a());
    }

    /* JADX INFO: renamed from: f */
    public static final void m36851f(List list, dte0 dte0Var) {
        Object value;
        List list2;
        ArrayList arrayList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tse0 tse0Var = (tse0) it.next();
            ((gkq) tse0Var.m81414b().m76318b()).invoke(Boolean.valueOf(tse0Var.m81413a()));
        }
        zv41 zv41Var = dte0Var.f52811g;
        do {
            value = zv41Var.getValue();
            list2 = (List) value;
            arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((tse0) it2.next()).m81414b());
            }
        } while (!zv41Var.m97089k(value, g6f.m43697K0(list2, arrayList)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m36852d(pte0 pte0Var, ase0 ase0Var, ibk ibkVar) throws Throwable {
        use0 use0Var;
        if (ibkVar instanceof use0) {
            use0Var = (use0) ibkVar;
            int i = use0Var.f233621c;
            if ((i & Integer.MIN_VALUE) != 0) {
                use0Var.f233621c = i - Integer.MIN_VALUE;
            } else {
                use0Var = new use0(this, ibkVar);
            }
        } else {
            use0Var = new use0(this, ibkVar);
        }
        Object objM89557A = use0Var.f233619a;
        int i2 = use0Var.f233621c;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            zv41 zv41Var = this.f52812h;
            Object value = zv41Var.getValue();
            sse0 sse0Var = sse0.f213583a;
            luk lukVar = this.f52807c;
            fbk fbkVar = null;
            if (value == sse0Var) {
                zv41Var.m97091m(null, sse0.f213584b);
                x0h1.m89578u(this.f52808d, lukVar, 0, new xoa0(this, fbkVar, 21), 2);
            }
            aab0 aab0Var = new aab0(this, new kse0(pte0Var, ase0Var), ((nei0) ((ose0) this.f52806b.get())).m64264a(pte0Var, ase0Var), fbkVar, 23);
            use0Var.f233621c = 1;
            objM89557A = x0h1.m89557A(lukVar, aab0Var, use0Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89557A);
        }
        return qyg1.m74178H(((Boolean) objM89557A).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX INFO: renamed from: e */
    public final boolean m36853e(kse0 kse0Var, jse0 jse0Var, List list) {
        boolean z;
        ArrayList arrayListM58105f = l45.m58105f(list);
        Iterable iterable = (Iterable) this.f52811g.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!m36850c((rse0) it.next(), kse0Var)) {
                    }
                } else if (jse0Var.m54227a().mo51519a(arrayListM58105f)) {
                    z = true;
                }
                z = false;
            }
        } else if (jse0Var.m54227a().mo51519a(arrayListM58105f)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return z;
        }
        js3 js3Var = new js3(new wse0(jse0Var, list, kse0Var, this, null), this, kse0Var, (fbk) null);
        zv41 zv41Var = this.f52812h;
        zv41Var.getClass();
        zv41Var.m97091m(null, sse0.f213585c);
        x0h1.m89578u(this.f52808d, null, 0, new sqc0(js3Var, this, (fbk) null), 3);
        return z;
    }
}
