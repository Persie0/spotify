package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ftv0 extends hg40 {

    /* JADX INFO: renamed from: i */
    public static final Object[] f73316i;

    /* JADX INFO: renamed from: t */
    public static final ftv0 f73317t;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f73318d;

    /* JADX INFO: renamed from: e */
    public final transient int f73319e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f73320f;

    /* JADX INFO: renamed from: g */
    public final transient int f73321g;

    /* JADX INFO: renamed from: h */
    public final transient int f73322h;

    static {
        Object[] objArr = new Object[0];
        f73316i = objArr;
        f73317t = new ftv0(0, 0, 0, objArr, objArr);
    }

    public ftv0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f73318d = objArr;
        this.f73319e = i;
        this.f73320f = objArr2;
        this.f73321g = i2;
        this.f73322h = i3;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: b */
    public final int mo38715b(int i, Object[] objArr) {
        Object[] objArr2 = this.f73318d;
        int i2 = this.f73322h;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f73320f;
            if (objArr.length != 0) {
                int iM30841r = bxg1.m30841r(obj);
                while (true) {
                    int i = iM30841r & this.f73321g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM30841r = i + 1;
                }
            }
        }
        return false;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: d */
    public final Object[] mo38716d() {
        return this.f73318d;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: e */
    public final int mo38717e() {
        return this.f73322h;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: f */
    public final int mo38718f() {
        return 0;
    }

    @Override // p204p.hg40, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f73319e;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return false;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 iterator() {
        return mo38714a().listIterator(0);
    }

    @Override // p204p.hg40
    /* JADX INFO: renamed from: r */
    public final pf40 mo42688r() {
        return pf40.m69787l(this.f73322h, this.f73318d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f73322h;
    }

    @Override // p204p.hg40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
