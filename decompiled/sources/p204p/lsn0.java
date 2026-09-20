package p204p;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class lsn0 extends AbstractC2204o7 {

    /* JADX INFO: renamed from: c */
    public final hsn0 f136569c;

    /* JADX INFO: renamed from: d */
    public int f136570d;

    /* JADX INFO: renamed from: e */
    public jj91 f136571e;

    /* JADX INFO: renamed from: f */
    public int f136572f;

    public lsn0(hsn0 hsn0Var, int i) {
        super(i, hsn0Var.f94769h);
        this.f136569c = hsn0Var;
        this.f136570d = hsn0Var.m48545f();
        this.f136572f = -1;
        m59842c();
    }

    /* JADX INFO: renamed from: a */
    public final void m59840a() {
        if (this.f136570d != this.f136569c.m48545f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p204p.AbstractC2204o7, java.util.ListIterator
    public final void add(Object obj) {
        m59840a();
        this.f136569c.add(this.f162442a, obj);
        this.f162442a++;
        m59841b();
    }

    /* JADX INFO: renamed from: b */
    public final void m59841b() {
        hsn0 hsn0Var = this.f136569c;
        this.f162443b = hsn0Var.mo47661a();
        this.f136570d = hsn0Var.m48545f();
        this.f136572f = -1;
        m59842c();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: c */
    public final void m59842c() {
        hsn0 hsn0Var = this.f136569c;
        Object[] objArr = hsn0Var.f94767f;
        if (objArr == null) {
            this.f136571e = null;
            return;
        }
        int i = (hsn0Var.f94769h - 1) & (-32);
        int i2 = this.f162442a;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (hsn0Var.f94765d / 5) + 1;
        jj91 jj91Var = this.f136571e;
        if (jj91Var == null) {
            this.f136571e = new jj91(objArr, i2, i, i3);
            return;
        }
        jj91Var.f162442a = i2;
        jj91Var.f162443b = i;
        jj91Var.f112960c = i3;
        if (jj91Var.f112961d.length < i3) {
            jj91Var.f112961d = new Object[i3];
        }
        jj91Var.f112961d[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        jj91Var.f112962e = r6;
        jj91Var.m53529b(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m59840a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f162442a;
        this.f136572f = i;
        jj91 jj91Var = this.f136571e;
        hsn0 hsn0Var = this.f136569c;
        if (jj91Var == null) {
            Object[] objArr = hsn0Var.f94768g;
            this.f162442a = i + 1;
            return objArr[i];
        }
        if (jj91Var.hasNext()) {
            this.f162442a++;
            return jj91Var.next();
        }
        Object[] objArr2 = hsn0Var.f94768g;
        int i2 = this.f162442a;
        this.f162442a = i2 + 1;
        return objArr2[i2 - jj91Var.f162443b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m59840a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f162442a;
        this.f136572f = i - 1;
        jj91 jj91Var = this.f136571e;
        hsn0 hsn0Var = this.f136569c;
        if (jj91Var == null) {
            Object[] objArr = hsn0Var.f94768g;
            int i2 = i - 1;
            this.f162442a = i2;
            return objArr[i2];
        }
        int i3 = jj91Var.f162443b;
        if (i <= i3) {
            this.f162442a = i - 1;
            return jj91Var.previous();
        }
        Object[] objArr2 = hsn0Var.f94768g;
        int i4 = i - 1;
        this.f162442a = i4;
        return objArr2[i4 - i3];
    }

    @Override // p204p.AbstractC2204o7, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m59840a();
        int i = this.f136572f;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f136569c.mo47662b(i);
        int i2 = this.f136572f;
        if (i2 < this.f162442a) {
            this.f162442a = i2;
        }
        m59841b();
    }

    @Override // p204p.AbstractC2204o7, java.util.ListIterator
    public final void set(Object obj) {
        m59840a();
        int i = this.f136572f;
        if (i == -1) {
            throw new IllegalStateException();
        }
        hsn0 hsn0Var = this.f136569c;
        hsn0Var.set(i, obj);
        this.f136570d = hsn0Var.m48545f();
        m59842c();
    }
}
