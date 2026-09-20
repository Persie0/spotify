package p204p;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes11.dex */
public final class trn0 extends srn0 {

    /* JADX INFO: renamed from: e */
    public final qrn0 f223096e;

    /* JADX INFO: renamed from: f */
    public Object f223097f;

    /* JADX INFO: renamed from: g */
    public boolean f223098g;

    /* JADX INFO: renamed from: h */
    public int f223099h;

    /* JADX WARN: Illegal instructions before constructor call */
    public trn0(qrn0 qrn0Var) {
        Object obj = qrn0Var.f191888b;
        hqn0 hqn0Var = qrn0Var.f191890d;
        super(obj, hqn0Var);
        this.f223096e = qrn0Var;
        this.f223099h = hqn0Var.f94226e;
    }

    @Override // p204p.srn0, java.util.Iterator
    public final Object next() {
        if (this.f223096e.f191890d.f94226e != this.f223099h) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f223097f = next;
        this.f223098g = true;
        return next;
    }

    @Override // p204p.srn0, java.util.Iterator
    public final void remove() {
        if (!this.f223098g) {
            throw new IllegalStateException();
        }
        Object obj = this.f223097f;
        qrn0 qrn0Var = this.f223096e;
        qrn0Var.remove(obj);
        this.f223097f = null;
        this.f223098g = false;
        this.f223099h = qrn0Var.f191890d.f94226e;
        this.f213364b--;
    }
}
