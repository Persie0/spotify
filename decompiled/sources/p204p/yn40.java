package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yn40 extends hg40 {
    @Override // p204p.ef40
    /* JADX INFO: renamed from: b */
    public final int mo38715b(int i, Object[] objArr) {
        return mo38714a().mo38715b(i, objArr);
    }

    public abstract Object get(int i);

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 iterator() {
        return mo38714a().listIterator(0);
    }

    @Override // p204p.hg40
    /* JADX INFO: renamed from: r */
    public final pf40 mo42688r() {
        return new xn40(this);
    }

    @Override // p204p.hg40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
