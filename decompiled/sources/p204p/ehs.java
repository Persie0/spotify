package p204p;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ehs {

    /* JADX INFO: renamed from: a */
    public final int f59655a;

    /* JADX INFO: renamed from: b */
    public final vsd0 f59656b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f59657c;

    public ehs() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m38998a(m57 m57Var) {
        for (dhs dhsVar : this.f59657c) {
            h0b1.m46304c0(dhsVar.f49146a, new zq4(this, dhsVar.f49147b, m57Var, 15));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m38999b() {
        for (dhs dhsVar : this.f59657c) {
            h0b1.m46304c0(dhsVar.f49146a, new chs(this, dhsVar.f49147b, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m39000c() {
        for (dhs dhsVar : this.f59657c) {
            h0b1.m46304c0(dhsVar.f49146a, new chs(this, dhsVar.f49147b, 2));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m39001d(int i) {
        for (dhs dhsVar : this.f59657c) {
            h0b1.m46304c0(dhsVar.f49146a, new scb(this, dhsVar.f49147b, i, 7));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m39002e(Exception exc) {
        for (dhs dhsVar : this.f59657c) {
            h0b1.m46304c0(dhsVar.f49146a, new zq4(this, dhsVar.f49147b, exc, 14));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m39003f() {
        for (dhs dhsVar : this.f59657c) {
            h0b1.m46304c0(dhsVar.f49146a, new chs(this, dhsVar.f49147b, 0));
        }
    }

    public ehs(CopyOnWriteArrayList copyOnWriteArrayList, int i, vsd0 vsd0Var) {
        this.f59657c = copyOnWriteArrayList;
        this.f59655a = i;
        this.f59656b = vsd0Var;
    }
}
