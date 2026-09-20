package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n0f1 extends l0f1 {

    /* JADX INFO: renamed from: X */
    public static final Object[] f149046X;

    /* JADX INFO: renamed from: Y */
    public static final n0f1 f149047Y;

    /* JADX INFO: renamed from: i */
    public final transient Object[] f149048i;

    /* JADX INFO: renamed from: t */
    public final transient Object[] f149049t;

    static {
        Object[] objArr = new Object[0];
        f149046X = objArr;
        f149047Y = new n0f1(objArr, objArr);
    }

    public n0f1(Object[] objArr, Object[] objArr2) {
        super(0);
        this.f149048i = objArr;
        this.f149049t = objArr2;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: a */
    public final int mo46350a(Object[] objArr) {
        System.arraycopy(this.f149048i, 0, objArr, 0, 0);
        return 0;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: b */
    public final int mo46351b() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f149049t.length;
        return false;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: d */
    public final int mo46352d() {
        return 0;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: e */
    public final Object[] mo46353e() {
        return this.f149048i;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        m0f1 m0f1Var = this.f128421g;
        if (m0f1Var == null) {
            i0f1 i0f1Var = k0f1.f118075g;
            m0f1Var = m0f1.f138666i;
            this.f128421g = m0f1Var;
        }
        return m0f1Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
