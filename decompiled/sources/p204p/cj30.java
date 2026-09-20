package p204p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cj30 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final sk30 f38486a;

    /* JADX INFO: renamed from: b */
    public List f38487b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public final rb5 f38488c;

    /* JADX INFO: renamed from: d */
    public final mk30 f38489d;

    /* JADX INFO: renamed from: e */
    public final bj30 f38490e;

    public cj30(sk30 sk30Var) {
        et30 et30Var = et30.f62611d;
        this.f38489d = new mk30(2, this);
        this.f38490e = new bj30(this);
        this.f38486a = sk30Var;
        this.f38488c = new rb5(sk30Var);
    }

    /* JADX INFO: renamed from: a */
    public static void m32915a(cj30 cj30Var) {
        rb5 rb5Var = cj30Var.f38488c;
        ((IdentityHashMap) rb5Var.f197472c).clear();
        ((IdentityHashMap) rb5Var.f197473d).clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        fk30 fk30Var = (fk30) this.f38487b.get(i);
        fk30Var.getClass();
        return this.f38488c.m75154v(fk30Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f38487b.size();
    }
}
