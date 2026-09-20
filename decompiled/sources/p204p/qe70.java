package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qe70 implements hi00, Serializable {
    private final int arity;

    public qe70(int i) {
        this.arity = i;
    }

    @Override // p204p.hi00
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        return qpv0.f191387a.mo54122l(this);
    }
}
