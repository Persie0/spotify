package p204p;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class msn0 extends AbstractC2246p7 {

    /* JADX INFO: renamed from: c */
    public final isn0 f146833c;

    /* JADX INFO: renamed from: d */
    public int f146834d;

    /* JADX INFO: renamed from: e */
    public kj91 f146835e;

    /* JADX INFO: renamed from: f */
    public int f146836f;

    public msn0(isn0 isn0Var, int i) {
        super(i, isn0Var.f105279h);
        this.f146833c = isn0Var;
        this.f146834d = isn0Var.m51558f();
        this.f146836f = -1;
        m62775d();
    }

    @Override // p204p.AbstractC2246p7, java.util.ListIterator
    public final void add(Object obj) {
        m62774c();
        int i = this.f174531a;
        isn0 isn0Var = this.f146833c;
        isn0Var.add(i, obj);
        this.f174531a++;
        this.f174532b = isn0Var.mo47661a();
        this.f146834d = isn0Var.m51558f();
        this.f146836f = -1;
        m62775d();
    }

    /* JADX INFO: renamed from: c */
    public final void m62774c() {
        if (this.f146834d != this.f146833c.m51558f()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: d */
    public final void m62775d() {
        isn0 isn0Var = this.f146833c;
        Object[] objArr = isn0Var.f105277f;
        if (objArr == null) {
            this.f146835e = null;
            return;
        }
        int i = (isn0Var.f105279h - 1) & (-32);
        int i2 = this.f174531a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (isn0Var.f105275d / 5) + 1;
        kj91 kj91Var = this.f146835e;
        if (kj91Var == null) {
            this.f146835e = new kj91(objArr, i2, i, i3);
            return;
        }
        kj91Var.f174531a = i2;
        kj91Var.f174532b = i;
        kj91Var.f123271c = i3;
        if (kj91Var.f123272d.length < i3) {
            kj91Var.f123272d = new Object[i3];
        }
        kj91Var.f123272d[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        kj91Var.f123273e = r6;
        kj91Var.m56558d(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m62774c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f174531a;
        this.f146836f = i;
        kj91 kj91Var = this.f146835e;
        isn0 isn0Var = this.f146833c;
        if (kj91Var == null) {
            Object[] objArr = isn0Var.f105278g;
            this.f174531a = i + 1;
            return objArr[i];
        }
        if (kj91Var.hasNext()) {
            this.f174531a++;
            return kj91Var.next();
        }
        Object[] objArr2 = isn0Var.f105278g;
        int i2 = this.f174531a;
        this.f174531a = i2 + 1;
        return objArr2[i2 - kj91Var.f174532b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m62774c();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f174531a;
        this.f146836f = i - 1;
        kj91 kj91Var = this.f146835e;
        isn0 isn0Var = this.f146833c;
        if (kj91Var == null) {
            Object[] objArr = isn0Var.f105278g;
            int i2 = i - 1;
            this.f174531a = i2;
            return objArr[i2];
        }
        int i3 = kj91Var.f174532b;
        if (i <= i3) {
            this.f174531a = i - 1;
            return kj91Var.previous();
        }
        Object[] objArr2 = isn0Var.f105278g;
        int i4 = i - 1;
        this.f174531a = i4;
        return objArr2[i4 - i3];
    }

    @Override // p204p.AbstractC2246p7, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m62774c();
        int i = this.f146836f;
        if (i == -1) {
            throw new IllegalStateException();
        }
        isn0 isn0Var = this.f146833c;
        isn0Var.mo47662b(i);
        int i2 = this.f146836f;
        if (i2 < this.f174531a) {
            this.f174531a = i2;
        }
        this.f174532b = isn0Var.mo47661a();
        this.f146834d = isn0Var.m51558f();
        this.f146836f = -1;
        m62775d();
    }

    @Override // p204p.AbstractC2246p7, java.util.ListIterator
    public final void set(Object obj) {
        m62774c();
        int i = this.f146836f;
        if (i == -1) {
            throw new IllegalStateException();
        }
        isn0 isn0Var = this.f146833c;
        isn0Var.set(i, obj);
        this.f146834d = isn0Var.m51558f();
        m62775d();
    }
}
