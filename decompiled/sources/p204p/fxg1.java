package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class fxg1 extends tvg1 {

    /* JADX INFO: renamed from: i */
    public static final Object[] f74369i;

    /* JADX INFO: renamed from: t */
    public static final fxg1 f74370t;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f74371d;

    /* JADX INFO: renamed from: e */
    public final transient int f74372e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f74373f;

    /* JADX INFO: renamed from: g */
    public final transient int f74374g;

    /* JADX INFO: renamed from: h */
    public final transient int f74375h;

    static {
        Object[] objArr = new Object[0];
        f74369i = objArr;
        f74370t = new fxg1(0, 0, 0, objArr, objArr);
    }

    public fxg1(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f74371d = objArr;
        this.f74372e = i;
        this.f74373f = objArr2;
        this.f74374g = i2;
        this.f74375h = i3;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: a */
    public final o0f1 mo43014a() {
        return m81610l().listIterator(0);
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: b */
    public final Object[] mo43015b() {
        return this.f74371d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f74373f;
            if (objArr.length != 0) {
                int iM39680P = epv0.m39680P(obj);
                while (true) {
                    int i = iM39680P & this.f74374g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM39680P = i + 1;
                }
            }
        }
        return false;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: d */
    public final int mo43016d() {
        return 0;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: e */
    public final int mo43017e() {
        return this.f74375h;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: f */
    public final boolean mo43018f() {
        return false;
    }

    @Override // p204p.tvg1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f74372e;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: i */
    public final int mo43019i(Object[] objArr) {
        Object[] objArr2 = this.f74371d;
        int i = this.f74375h;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m81610l().listIterator(0);
    }

    @Override // p204p.tvg1
    /* JADX INFO: renamed from: m */
    public final vug1 mo43020m() {
        return vug1.m86422l(this.f74375h, this.f74371d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f74375h;
    }
}
