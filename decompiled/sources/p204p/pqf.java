package p204p;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class pqf extends AbstractSet implements Serializable {

    /* JADX INFO: renamed from: a */
    public transient Object f180318a;

    /* JADX INFO: renamed from: b */
    public transient int[] f180319b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f180320c;

    /* JADX INFO: renamed from: d */
    public transient int f180321d;

    /* JADX INFO: renamed from: e */
    public transient int f180322e;

    /* JADX INFO: renamed from: a */
    public static pqf m70647a(int i) {
        pqf pqfVar = new pqf();
        c95.m31844j(i >= 0, "Expected size must be >= 0");
        pqfVar.f180321d = k0e1.m54994m(i, 1);
        return pqfVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(s571.m77246e(i, "Invalid size: "));
        }
        c95.m31844j(i >= 0, "Expected size must be >= 0");
        this.f180321d = k0e1.m54994m(i, 1);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        char c = 31;
        if (m70649d()) {
            c95.m31856v(m70649d(), "Arrays already allocated");
            int i = this.f180321d;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f180318a = jkg1.m53626k(iMax2);
            this.f180321d = jkg1.m53635t(this.f180321d, 32 - Integer.numberOfLeadingZeros(iMax2 - 1), 31);
            this.f180319b = new int[i];
            this.f180320c = new Object[i];
        }
        Set setM70648b = m70648b();
        if (setM70648b != null) {
            return setM70648b.add(obj);
        }
        int[] iArrM70651f = m70651f();
        Object[] objArrM70650e = m70650e();
        int i2 = this.f180322e;
        int i3 = i2 + 1;
        int iM30841r = bxg1.m30841r(obj);
        int iM70652i = (1 << (this.f180321d & 31)) - 1;
        int i4 = iM30841r & iM70652i;
        Object obj2 = this.f180318a;
        Objects.requireNonNull(obj2);
        int iM53639x = jkg1.m53639x(i4, obj2);
        if (iM53639x != 0) {
            int i5 = ~iM70652i;
            int i6 = iM30841r & i5;
            int i7 = 0;
            while (true) {
                int i8 = iM53639x - 1;
                int i9 = iArrM70651f[i8];
                char c2 = c;
                if ((i9 & i5) == i6 && upf.m83705v(obj, objArrM70650e[i8])) {
                    return false;
                }
                int i10 = i9 & iM70652i;
                i7++;
                if (i10 == 0) {
                    if (i7 < 9) {
                        if (i3 <= iM70652i) {
                            iArrM70651f[i8] = jkg1.m53635t(i9, i3, iM70652i);
                            break;
                        }
                        iM70652i = m70652i(iM70652i, jkg1.m53636u(iM70652i), iM30841r, i2);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.f180321d & 31), 1.0f);
                    int i11 = isEmpty() ? -1 : 0;
                    while (i11 >= 0) {
                        linkedHashSet.add(m70650e()[i11]);
                        i11++;
                        if (i11 >= this.f180322e) {
                            i11 = -1;
                        }
                    }
                    this.f180318a = linkedHashSet;
                    this.f180319b = null;
                    this.f180320c = null;
                    this.f180321d += 32;
                    return linkedHashSet.add(obj);
                }
                iM53639x = i10;
                c = c2;
            }
        } else if (i3 > iM70652i) {
            iM70652i = m70652i(iM70652i, jkg1.m53636u(iM70652i), iM30841r, i2);
        } else {
            Object obj3 = this.f180318a;
            Objects.requireNonNull(obj3);
            jkg1.m53640y(i4, i3, obj3);
        }
        int length = m70651f().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f180319b = Arrays.copyOf(m70651f(), iMin);
            this.f180320c = Arrays.copyOf(m70650e(), iMin);
        }
        m70651f()[i2] = jkg1.m53635t(iM30841r, 0, iM70652i);
        m70650e()[i2] = obj;
        this.f180322e = i3;
        this.f180321d += 32;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final Set m70648b() {
        Object obj = this.f180318a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (m70649d()) {
            return;
        }
        this.f180321d += 32;
        Set setM70648b = m70648b();
        if (setM70648b != null) {
            this.f180321d = k0e1.m54994m(size(), 3);
            setM70648b.clear();
            this.f180318a = null;
            this.f180322e = 0;
            return;
        }
        Arrays.fill(m70650e(), 0, this.f180322e, (Object) null);
        Object obj = this.f180318a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m70651f(), 0, this.f180322e, 0);
        this.f180322e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (m70649d()) {
            return false;
        }
        Set setM70648b = m70648b();
        if (setM70648b != null) {
            return setM70648b.contains(obj);
        }
        int iM30841r = bxg1.m30841r(obj);
        int i = (1 << (this.f180321d & 31)) - 1;
        Object obj2 = this.f180318a;
        Objects.requireNonNull(obj2);
        int iM53639x = jkg1.m53639x(iM30841r & i, obj2);
        if (iM53639x == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iM30841r & i2;
        do {
            int i4 = iM53639x - 1;
            int i5 = m70651f()[i4];
            if ((i5 & i2) == i3 && upf.m83705v(obj, m70650e()[i4])) {
                return true;
            }
            iM53639x = i5 & i;
        } while (iM53639x != 0);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m70649d() {
        return this.f180318a == null;
    }

    /* JADX INFO: renamed from: e */
    public final Object[] m70650e() {
        Object[] objArr = this.f180320c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: f */
    public final int[] m70651f() {
        int[] iArr = this.f180319b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public final int m70652i(int i, int i2, int i3, int i4) {
        Object objM53626k = jkg1.m53626k(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            jkg1.m53640y(i3 & i5, i4 + 1, objM53626k);
        }
        Object obj = this.f180318a;
        Objects.requireNonNull(obj);
        int[] iArrM70651f = m70651f();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM53639x = jkg1.m53639x(i6, obj);
            while (iM53639x != 0) {
                int i7 = iM53639x - 1;
                int i8 = iArrM70651f[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM53639x2 = jkg1.m53639x(i10, objM53626k);
                jkg1.m53640y(i10, iM53639x, objM53626k);
                iArrM70651f[i7] = jkg1.m53635t(i9, iM53639x2, i5);
                iM53639x = i8 & i;
            }
        }
        this.f180318a = objM53626k;
        this.f180321d = jkg1.m53635t(this.f180321d, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setM70648b = m70648b();
        return setM70648b != null ? setM70648b.iterator() : new oqf(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (!m70649d()) {
            Set setM70648b = m70648b();
            if (setM70648b != null) {
                return setM70648b.remove(obj);
            }
            int i3 = (1 << (this.f180321d & 31)) - 1;
            Object obj2 = this.f180318a;
            Objects.requireNonNull(obj2);
            int iM53637v = jkg1.m53637v(obj, null, i3, obj2, m70651f(), m70650e(), null);
            if (iM53637v != -1) {
                Object obj3 = this.f180318a;
                Objects.requireNonNull(obj3);
                int[] iArrM70651f = m70651f();
                Object[] objArrM70650e = m70650e();
                int size = size();
                int i4 = size - 1;
                if (iM53637v < i4) {
                    Object obj4 = objArrM70650e[i4];
                    objArrM70650e[iM53637v] = obj4;
                    objArrM70650e[i4] = null;
                    iArrM70651f[iM53637v] = iArrM70651f[i4];
                    iArrM70651f[i4] = 0;
                    int iM30841r = bxg1.m30841r(obj4) & i3;
                    int iM53639x = jkg1.m53639x(iM30841r, obj3);
                    if (iM53639x == size) {
                        jkg1.m53640y(iM30841r, iM53637v + 1, obj3);
                    } else {
                        while (true) {
                            i = iM53639x - 1;
                            i2 = iArrM70651f[i];
                            int i5 = i2 & i3;
                            if (i5 == size) {
                                break;
                            }
                            iM53639x = i5;
                        }
                        iArrM70651f[i] = jkg1.m53635t(i2, iM53637v + 1, i3);
                    }
                } else {
                    objArrM70650e[iM53637v] = null;
                    iArrM70651f[iM53637v] = 0;
                }
                this.f180322e--;
                this.f180321d += 32;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setM70648b = m70648b();
        return setM70648b != null ? setM70648b.size() : this.f180322e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (m70649d()) {
            return new Object[0];
        }
        Set setM70648b = m70648b();
        return setM70648b != null ? setM70648b.toArray() : Arrays.copyOf(m70650e(), this.f180322e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (m70649d()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setM70648b = m70648b();
        if (setM70648b != null) {
            return setM70648b.toArray(objArr);
        }
        Object[] objArrM70650e = m70650e();
        int i = this.f180322e;
        c95.m31852r(0, i, objArrM70650e.length);
        if (objArr.length < i) {
            objArr = jhl0.m53423q(i, objArr);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrM70650e, 0, objArr, 0, i);
        return objArr;
    }
}
