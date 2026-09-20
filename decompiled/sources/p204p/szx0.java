package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class szx0 implements Iterator, tzx0 {

    /* JADX INFO: renamed from: a */
    public qzx0 f215690a;

    /* JADX INFO: renamed from: b */
    public qzx0 f215691b;

    public szx0(qzx0 qzx0Var, qzx0 qzx0Var2) {
        this.f215690a = qzx0Var2;
        this.f215691b = qzx0Var;
    }

    @Override // p204p.tzx0
    /* JADX INFO: renamed from: a */
    public final void mo76837a(qzx0 qzx0Var) {
        qzx0 qzx0VarMo68669c = null;
        if (this.f215690a == qzx0Var && qzx0Var == this.f215691b) {
            this.f215691b = null;
            this.f215690a = null;
        }
        qzx0 qzx0Var2 = this.f215690a;
        if (qzx0Var2 == qzx0Var) {
            this.f215690a = mo68668b(qzx0Var2);
        }
        qzx0 qzx0Var3 = this.f215691b;
        if (qzx0Var3 == qzx0Var) {
            qzx0 qzx0Var4 = this.f215690a;
            if (qzx0Var3 != qzx0Var4 && qzx0Var4 != null) {
                qzx0VarMo68669c = mo68669c(qzx0Var3);
            }
            this.f215691b = qzx0VarMo68669c;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract qzx0 mo68668b(qzx0 qzx0Var);

    /* JADX INFO: renamed from: c */
    public abstract qzx0 mo68669c(qzx0 qzx0Var);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f215691b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        qzx0 qzx0Var = this.f215691b;
        qzx0 qzx0Var2 = this.f215690a;
        this.f215691b = (qzx0Var == qzx0Var2 || qzx0Var2 == null) ? null : mo68669c(qzx0Var);
        return qzx0Var;
    }
}
