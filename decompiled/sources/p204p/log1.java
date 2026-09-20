package p204p;

import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class log1 {

    /* JADX INFO: renamed from: a */
    public final cmg1 f135425a;

    /* JADX INFO: renamed from: b */
    public final d1e1 f135426b;

    /* JADX INFO: renamed from: c */
    public final fog1 f135427c;

    /* JADX INFO: renamed from: d */
    public final String f135428d = UUID.randomUUID().toString();

    public log1(cmg1 cmg1Var, d1e1 d1e1Var, fog1 fog1Var) {
        this.f135425a = cmg1Var;
        this.f135426b = d1e1Var;
        this.f135427c = fog1Var;
    }

    /* JADX INFO: renamed from: a */
    public final fog1 m59565a() {
        return this.f135427c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m59566b(aog1 aog1Var, ibk ibkVar) {
        jog1 jog1Var;
        if (ibkVar instanceof jog1) {
            jog1Var = (jog1) ibkVar;
            int i = jog1Var.f114430c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jog1Var.f114430c = i - Integer.MIN_VALUE;
            } else {
                jog1Var = new jog1(this, ibkVar);
            }
        } else {
            jog1Var = new jog1(this, ibkVar);
        }
        Object obj = jog1Var.f114428a;
        int i2 = jog1Var.f114430c;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return w2a1Var;
            }
            bga.m29073P(obj);
            jog1Var.f114430c = 1;
            Object objM26589a = aog1Var.m26589a(this, jog1Var);
            Object obj2 = yuk.f276404a;
            return objM26589a == obj2 ? obj2 : w2a1Var;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m59567c(idf1 idf1Var, edf1 edf1Var) {
        String str = this.f135427c.f71532c;
        if (edf1Var != null) {
            idf1Var.m52811c();
            ((jdf1) idf1Var.f110458b).m53027G(edf1Var);
        }
        cmg1 cmg1Var = this.f135425a;
        Iterator it = cmg1Var.f39671c.f49528b.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            idf1Var.m52811c();
            ((jdf1) idf1Var.f110458b).m53030J(0);
        }
        if (((jdf1) idf1Var.f110458b).m53037y()) {
            ConcurrentHashMap concurrentHashMap = p9g1.f175243a;
            p9g1.m69387a(((jdf1) idf1Var.f110458b).m53038z() + 20000, mcf1.m61461b(idf1Var.m50346i()) * 1000);
        } else {
            ConcurrentHashMap concurrentHashMap2 = p9g1.f175243a;
            int iM53032L = ((jdf1) idf1Var.f110458b).m53032L();
            p9g1.m69387a(k2z0.m55198A(iM53032L) + 10000, mcf1.m61461b(idf1Var.m50346i()) * 1000);
        }
        pdf1 pdf1VarM94163a = cmg1Var.f39670b.m94163a(str);
        idf1Var.m52811c();
        ((jdf1) idf1Var.f110458b).m53028H(pdf1VarM94163a);
        hgf1 hgf1VarM50516z = igf1.m50516z();
        hgf1VarM50516z.m52811c();
        ((igf1) hgf1VarM50516z.f110458b).m50517A((jdf1) idf1Var.m52814g());
        igf1 igf1Var = (igf1) hgf1VarM50516z.m52814g();
        f7d1 f7d1Var = cmg1Var.f39669a;
        x0h1.m89578u((c9k) ((okj0) f7d1Var.f66660d).f166381b, null, 0, new mbd1(f7d1Var, igf1Var, null, 14), 3);
    }

    /* JADX INFO: renamed from: d */
    public final Object m59568d(int i, Integer num, th00 th00Var, mb61 mb61Var) {
        return new aog1(i, th00Var, num).m26589a(this, mb61Var);
    }
}
