package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zsv0 extends hg40 {

    /* JADX INFO: renamed from: d */
    public final transient xf40 f286004d;

    /* JADX INFO: renamed from: e */
    public final transient atv0 f286005e;

    public zsv0(xf40 xf40Var, atv0 atv0Var) {
        this.f286004d = xf40Var;
        this.f286005e = atv0Var;
    }

    @Override // p204p.hg40, p204p.ef40
    /* JADX INFO: renamed from: a */
    public final pf40 mo38714a() {
        return this.f286005e;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: b */
    public final int mo38715b(int i, Object[] objArr) {
        return this.f286005e.mo38715b(i, objArr);
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f286004d.get(obj) != null;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return true;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 iterator() {
        return this.f286005e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f286004d.size();
    }

    @Override // p204p.hg40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
