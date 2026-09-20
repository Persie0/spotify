package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ck90 {

    /* JADX INFO: renamed from: X */
    public static final Object f38879X = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f38880a;

    /* JADX INFO: renamed from: b */
    public final uzx0 f38881b;

    /* JADX INFO: renamed from: c */
    public int f38882c;

    /* JADX INFO: renamed from: d */
    public boolean f38883d;

    /* JADX INFO: renamed from: e */
    public volatile Object f38884e;

    /* JADX INFO: renamed from: f */
    public volatile Object f38885f;

    /* JADX INFO: renamed from: g */
    public int f38886g;

    /* JADX INFO: renamed from: h */
    public boolean f38887h;

    /* JADX INFO: renamed from: i */
    public boolean f38888i;

    /* JADX INFO: renamed from: t */
    public final zu3 f38889t;

    public ck90(Object obj) {
        this.f38880a = new Object();
        this.f38881b = new uzx0();
        this.f38882c = 0;
        this.f38885f = f38879X;
        this.f38889t = new zu3(this, 9);
        this.f38884e = obj;
        this.f38886g = 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m33095b(String str) {
        if (!ki5.m56473e().f122818a.mo42762c()) {
            throw new IllegalStateException(s571.m77251j("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m33096c(bk90 bk90Var) {
        if (bk90Var.f27869b) {
            if (!bk90Var.mo26205d()) {
                bk90Var.m29651a(false);
                return;
            }
            int i = bk90Var.f27870c;
            int i2 = this.f38886g;
            if (i >= i2) {
                return;
            }
            bk90Var.f27870c = i2;
            bk90Var.f27868a.mo31453b(this.f38884e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m33097d(bk90 bk90Var) {
        if (this.f38887h) {
            this.f38888i = true;
            return;
        }
        this.f38887h = true;
        do {
            this.f38888i = false;
            if (bk90Var != null) {
                m33096c(bk90Var);
                bk90Var = null;
            } else {
                uzx0 uzx0Var = this.f38881b;
                uzx0Var.getClass();
                rzx0 rzx0Var = new rzx0(uzx0Var);
                uzx0Var.f235654c.put(rzx0Var, Boolean.FALSE);
                while (rzx0Var.hasNext()) {
                    m33096c((bk90) ((Map.Entry) rzx0Var.next()).getValue());
                    if (this.f38888i) {
                        break;
                    }
                }
            }
        } while (this.f38888i);
        this.f38887h = false;
    }

    /* JADX INFO: renamed from: e */
    public Object mo33098e() {
        Object obj = this.f38884e;
        if (obj != f38879X) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m33099f(hc80 hc80Var, dqk0 dqk0Var) {
        Object obj;
        m33095b("observe");
        if (hc80Var.getLifecycle().mo31987b() == fb80.f67750a) {
            return;
        }
        ak90 ak90Var = new ak90(this, hc80Var, dqk0Var);
        uzx0 uzx0Var = this.f38881b;
        qzx0 qzx0VarMo84312a = uzx0Var.mo84312a(dqk0Var);
        if (qzx0VarMo84312a != null) {
            obj = qzx0VarMo84312a.f194329b;
        } else {
            qzx0 qzx0Var = new qzx0(dqk0Var, ak90Var);
            uzx0Var.f235655d++;
            qzx0 qzx0Var2 = uzx0Var.f235653b;
            if (qzx0Var2 == null) {
                uzx0Var.f235652a = qzx0Var;
                uzx0Var.f235653b = qzx0Var;
            } else {
                qzx0Var2.f194330c = qzx0Var;
                qzx0Var.f194331d = qzx0Var2;
                uzx0Var.f235653b = qzx0Var;
            }
            obj = null;
        }
        bk90 bk90Var = (bk90) obj;
        if (bk90Var != null && !bk90Var.mo26204c(hc80Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bk90Var != null) {
            return;
        }
        hc80Var.getLifecycle().mo31986a(ak90Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m33100g(dqk0 dqk0Var) {
        Object obj;
        m33095b("observeForever");
        zj90 zj90Var = new zj90(this, dqk0Var);
        uzx0 uzx0Var = this.f38881b;
        qzx0 qzx0VarMo84312a = uzx0Var.mo84312a(dqk0Var);
        if (qzx0VarMo84312a != null) {
            obj = qzx0VarMo84312a.f194329b;
        } else {
            qzx0 qzx0Var = new qzx0(dqk0Var, zj90Var);
            uzx0Var.f235655d++;
            qzx0 qzx0Var2 = uzx0Var.f235653b;
            if (qzx0Var2 == null) {
                uzx0Var.f235652a = qzx0Var;
                uzx0Var.f235653b = qzx0Var;
            } else {
                qzx0Var2.f194330c = qzx0Var;
                qzx0Var.f194331d = qzx0Var2;
                uzx0Var.f235653b = qzx0Var;
            }
            obj = null;
        }
        bk90 bk90Var = (bk90) obj;
        if (bk90Var instanceof ak90) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (bk90Var != null) {
            return;
        }
        zj90Var.m29651a(true);
    }

    /* JADX INFO: renamed from: j */
    public void m33101j(Object obj) {
        boolean z;
        synchronized (this.f38880a) {
            z = this.f38885f == f38879X;
            this.f38885f = obj;
        }
        if (z) {
            ki5.m56473e().mo42763d(this.f38889t);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo33102k(dqk0 dqk0Var) {
        m33095b("removeObserver");
        bk90 bk90Var = (bk90) this.f38881b.mo84313b(dqk0Var);
        if (bk90Var == null) {
            return;
        }
        bk90Var.mo26203b();
        bk90Var.m29651a(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m33103l(hc80 hc80Var) {
        m33095b("removeObservers");
        Iterator it = this.f38881b.iterator();
        while (true) {
            szx0 szx0Var = (szx0) it;
            if (!szx0Var.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) szx0Var.next();
            if (((bk90) entry.getValue()).mo26204c(hc80Var)) {
                mo33102k((dqk0) entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo33104m(Object obj) {
        m33095b("setValue");
        this.f38886g++;
        this.f38884e = obj;
        m33097d(null);
    }

    public ck90() {
        this.f38880a = new Object();
        this.f38881b = new uzx0();
        this.f38882c = 0;
        Object obj = f38879X;
        this.f38885f = obj;
        this.f38889t = new zu3(this, 9);
        this.f38884e = obj;
        this.f38886g = -1;
    }

    /* JADX INFO: renamed from: h */
    public void mo15625h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo15626i() {
    }
}
