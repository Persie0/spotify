package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ctv0 extends yn40 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ etv0 f41989d;

    public ctv0(etv0 etv0Var) {
        this.f41989d = etv0Var;
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f41989d.contains(obj);
    }

    @Override // p204p.yn40
    public final Object get(int i) {
        ylk0 ylk0Var = this.f41989d.f62811e;
        c95.m31847m(i, ylk0Var.f274039c);
        return ylk0Var.f274037a[i];
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f41989d.f62811e.f274039c;
    }

    @Override // p204p.yn40, p204p.hg40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
