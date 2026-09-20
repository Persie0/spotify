package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class hzd0 extends xoi0 {

    /* JADX INFO: renamed from: Y */
    public final uzx0 f96902Y;

    public hzd0(Object obj) {
        super(obj);
        this.f96902Y = new uzx0();
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: h */
    public void mo15625h() {
        Iterator it = this.f96902Y.iterator();
        while (true) {
            szx0 szx0Var = (szx0) it;
            if (!szx0Var.hasNext()) {
                return;
            }
            gzd0 gzd0Var = (gzd0) ((Map.Entry) szx0Var.next()).getValue();
            gzd0Var.f85897a.m33100g(gzd0Var);
        }
    }

    @Override // p204p.ck90
    /* JADX INFO: renamed from: i */
    public void mo15626i() {
        Iterator it = this.f96902Y.iterator();
        while (true) {
            szx0 szx0Var = (szx0) it;
            if (!szx0Var.hasNext()) {
                return;
            }
            gzd0 gzd0Var = (gzd0) ((Map.Entry) szx0Var.next()).getValue();
            gzd0Var.f85897a.mo33102k(gzd0Var);
        }
    }

    /* JADX INFO: renamed from: n */
    public void mo49264n(ck90 ck90Var, dqk0 dqk0Var) {
        Object obj;
        if (ck90Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        gzd0 gzd0Var = new gzd0(ck90Var, dqk0Var);
        uzx0 uzx0Var = this.f96902Y;
        qzx0 qzx0VarMo84312a = uzx0Var.mo84312a(ck90Var);
        if (qzx0VarMo84312a != null) {
            obj = qzx0VarMo84312a.f194329b;
        } else {
            qzx0 qzx0Var = new qzx0(ck90Var, gzd0Var);
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
        gzd0 gzd0Var2 = (gzd0) obj;
        if (gzd0Var2 != null && gzd0Var2.f85898b != dqk0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (gzd0Var2 == null && this.f38882c > 0) {
            ck90Var.m33100g(gzd0Var);
        }
    }

    public hzd0() {
        this.f96902Y = new uzx0();
    }
}
