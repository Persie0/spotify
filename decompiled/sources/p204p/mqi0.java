package p204p;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class mqi0 implements nmk0, b671 {

    /* JADX INFO: renamed from: a */
    public int f146296a;

    /* JADX INFO: renamed from: b */
    public boolean f146297b;

    /* JADX INFO: renamed from: c */
    public Object f146298c;

    /* JADX INFO: renamed from: d */
    public Object f146299d;

    /* JADX INFO: renamed from: e */
    public Object f146300e;

    /* JADX INFO: renamed from: f */
    public Object f146301f;

    public mqi0() {
        this.f146298c = new Object();
        this.f146299d = new uj5(0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m62562a(int i, int i2) {
        qqi0 qqi0Var = (qqi0) this.f146299d;
        int i3 = this.f146296a;
        return kmg1.m56919q((dxh0) qqi0Var.f191608a[i + i3], (dxh0) ((qqi0) this.f146300e).f191608a[i3 + i2]) != 0;
    }

    /* JADX INFO: renamed from: b */
    public cxq0 m62563b() {
        ig31.m50497o("Must set register function", ((r9w0) this.f146298c) != null);
        ig31.m50497o("Must set unregister function", ((r9w0) this.f146299d) != null);
        ig31.m50497o("Must set holder", ((fzj) this.f146300e) != null);
        i890 i890Var = (i890) ((fzj) this.f146300e).f75031b;
        ig31.m50507y(i890Var, "Key must not be null");
        jij0 jij0Var = new jij0(this, (fzj) this.f146300e, (gey[]) this.f146301f, this.f146297b, this.f146296a);
        sqe1 sqe1Var = new sqe1();
        sqe1Var.f213088b = this;
        sqe1Var.f213087a = i890Var;
        return new cxq0(19, jij0Var, sqe1Var);
    }

    /* JADX INFO: renamed from: c */
    public atz0 m62564c(Object obj) {
        atz0 atz0Var;
        synchronized (this.f146298c) {
            try {
                int iM62565e = m62565e();
                atz0Var = new atz0(iM62565e, obj);
                if (this.f146297b) {
                    atz0Var.m27155y();
                } else {
                    ((uj5) this.f146299d).put(Integer.valueOf(iM62565e), atz0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return atz0Var;
    }

    @Override // p204p.b671
    /* JADX INFO: renamed from: d */
    public void mo28282d(fyf fyfVar, xq00 xq00Var, int i) {
        boolean z = this.f146297b;
        xq00Var.m91775k0(-684576839);
        int i2 = i | (xq00Var.m91766g(this) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String string = ((l971) this.f146298c).m58500d().f226935c.toString();
            p671.f174307a.m69189b(string, rkk.m75772x(-1086134424, new c4v0(z, fyfVar, string), xq00Var), true, !z, pmr0.f179211W0, (voi0) this.f146299d, rkk.m75772x(714649473, new evm0(this.f146296a, 10, false), xq00Var), rkk.m75772x(1585471072, new y4g0(18, (gh00) this.f146300e), xq00Var), rkk.m75772x(1993254482, new C1818el(string, (eh00) this.f146301f, 21), xq00Var), null, bwy0.m30732g(xq00Var), new j4m0(leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224762e, leu.m58816b(xq00Var).f117230b.f224761d, leu.m58816b(xq00Var).f117230b.f224761d), null, xq00Var, 905970096, 6, 161984);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gex0(this, fyfVar, i, 8);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m62565e() {
        int i;
        synchronized (this.f146298c) {
            i = this.f146296a;
            this.f146296a = i + 1;
        }
        return i;
    }

    @Override // p204p.nmk0
    /* JADX INFO: renamed from: f */
    public void mo62566f(mmk0 mmk0Var) {
        synchronized (this.f146298c) {
            xw41 xw41Var = (xw41) ((HashMap) this.f146300e).remove(mmk0Var);
            if (xw41Var != null) {
                xw41Var.f266577c.set(false);
                ((CopyOnWriteArraySet) this.f146301f).remove(xw41Var);
            }
        }
    }

    @Override // p204p.nmk0
    /* JADX INFO: renamed from: g */
    public void mo62567g(Executor executor, mmk0 mmk0Var) {
        xw41 xw41Var;
        synchronized (this.f146298c) {
            xw41 xw41Var2 = (xw41) ((HashMap) this.f146300e).remove(mmk0Var);
            if (xw41Var2 != null) {
                xw41Var2.f266577c.set(false);
                ((CopyOnWriteArraySet) this.f146301f).remove(xw41Var2);
            }
            xw41Var = new xw41((AtomicReference) this.f146299d, executor, mmk0Var);
            ((HashMap) this.f146300e).put(mmk0Var, xw41Var);
            ((CopyOnWriteArraySet) this.f146301f).add(xw41Var);
        }
        xw41Var.m92279a(0);
    }

    /* JADX INFO: renamed from: h */
    public void m62568h(g7d1 g7d1Var) {
        this.f146298c = g7d1Var;
    }

    /* JADX INFO: renamed from: i */
    public void m62569i() {
        ArrayList arrayList;
        synchronized (this.f146298c) {
            try {
                this.f146297b = true;
                arrayList = new ArrayList(((uj5) this.f146299d).values());
                ((uj5) this.f146299d).clear();
                if (((gcd0) this.f146300e) != null) {
                    Handler handler = (Handler) this.f146301f;
                    handler.getClass();
                    handler.post((gcd0) this.f146300e);
                    this.f146300e = null;
                    this.f146301f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((atz0) it.next()).m27155y();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m62570j(qqi0 qqi0Var) {
        this.f146300e = qqi0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m62571k(qqi0 qqi0Var) {
        this.f146299d = qqi0Var;
    }

    /* JADX INFO: renamed from: l */
    public void m62572l(int i, Object obj) {
        synchronized (this.f146298c) {
            try {
                atz0 atz0Var = (atz0) ((uj5) this.f146299d).remove(Integer.valueOf(i));
                if (atz0Var != null) {
                    if (atz0Var.f19771f.getClass() == obj.getClass()) {
                        atz0Var.m28330u(obj);
                    } else {
                        yif1.m93819w0("Type mismatch, expected " + atz0Var.f19771f.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((gcd0) this.f146300e) != null && ((uj5) this.f146299d).isEmpty()) {
                    m62569i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m62573m() {
        this.f146296a = 24015;
    }

    /* JADX INFO: renamed from: n */
    public void m62574n(exh0 exh0Var) {
        this.f146298c = exh0Var;
    }

    /* JADX INFO: renamed from: o */
    public void m62575o(int i) {
        this.f146296a = i;
    }

    /* JADX INFO: renamed from: p */
    public void m62576p(boolean z) {
        this.f146297b = z;
    }

    /* JADX INFO: renamed from: q */
    public void m62577q(und1 und1Var) {
        this.f146299d = und1Var;
    }

    /* JADX INFO: renamed from: r */
    public void m62578r(fzj fzjVar) {
        this.f146300e = fzjVar;
    }

    public mqi0(xmj0 xmj0Var, exh0 exh0Var, int i, qqi0 qqi0Var, qqi0 qqi0Var2, boolean z) {
        this.f146301f = xmj0Var;
        this.f146298c = exh0Var;
        this.f146296a = i;
        this.f146299d = qqi0Var;
        this.f146300e = qqi0Var2;
        this.f146297b = z;
    }
}
