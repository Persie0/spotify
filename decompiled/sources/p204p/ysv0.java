package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ysv0 extends hg40 {

    /* JADX INFO: renamed from: d */
    public final transient xf40 f275889d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f275890e;

    /* JADX INFO: renamed from: f */
    public final transient int f275891f;

    /* JADX INFO: renamed from: g */
    public final transient int f275892g;

    public ysv0(xf40 xf40Var, Object[] objArr, int i, int i2) {
        this.f275889d = xf40Var;
        this.f275890e = objArr;
        this.f275891f = i;
        this.f275892g = i2;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: b */
    public final int mo38715b(int i, Object[] objArr) {
        return mo38714a().mo38715b(i, objArr);
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f275889d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return true;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 iterator() {
        return mo38714a().listIterator(0);
    }

    @Override // p204p.hg40
    /* JADX INFO: renamed from: r */
    public final pf40 mo42688r() {
        return new xsv0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f275892g;
    }

    @Override // p204p.hg40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
