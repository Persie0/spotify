package p204p;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class j3t0 extends AbstractC1770d9 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final j3t0 f108474d;

    /* JADX INFO: renamed from: b */
    public Object[] f108475b;

    /* JADX INFO: renamed from: c */
    public int f108476c;

    static {
        j3t0 j3t0Var = new j3t0(0, new Object[0]);
        f108474d = j3t0Var;
        j3t0Var.f46559a = false;
    }

    public j3t0(int i, Object[] objArr) {
        this.f108475b = objArr;
        this.f108476c = i;
    }

    /* JADX INFO: renamed from: e */
    public static j3t0 m52316e() {
        return f108474d;
    }

    @Override // p204p.AbstractC1770d9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m35294a();
        int i = this.f108476c;
        Object[] objArr = this.f108475b;
        if (i == objArr.length) {
            this.f108475b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f108475b;
        int i2 = this.f108476c;
        this.f108476c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m52317f(int i) {
        if (i < 0 || i >= this.f108476c) {
            StringBuilder sbM56838j = klh.m56838j(i, "Index:", ", Size:");
            sbM56838j.append(this.f108476c);
            throw new IndexOutOfBoundsException(sbM56838j.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m52317f(i);
        return this.f108475b[i];
    }

    @Override // p204p.be50
    /* JADX INFO: renamed from: h */
    public final be50 mo28906h(int i) {
        if (i < this.f108476c) {
            throw new IllegalArgumentException();
        }
        return new j3t0(this.f108476c, Arrays.copyOf(this.f108475b, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m35294a();
        m52317f(i);
        Object[] objArr = this.f108475b;
        Object obj = objArr[i];
        int i2 = this.f108476c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f108476c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m35294a();
        m52317f(i);
        Object[] objArr = this.f108475b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f108476c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m35294a();
        if (i >= 0 && i <= (i2 = this.f108476c)) {
            Object[] objArr = this.f108475b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[m5p0.m60873e(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f108475b, i, objArr2, i + 1, this.f108476c - i);
                this.f108475b = objArr2;
            }
            this.f108475b[i] = obj;
            this.f108476c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM56838j = klh.m56838j(i, "Index:", ", Size:");
        sbM56838j.append(this.f108476c);
        throw new IndexOutOfBoundsException(sbM56838j.toString());
    }
}
