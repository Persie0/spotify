package p204p;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes11.dex */
public final class ngx0 extends AbstractC2154n7 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final Object[] f153808a;

    /* JADX INFO: renamed from: b */
    public final int f153809b;

    /* JADX INFO: renamed from: c */
    public int f153810c;

    /* JADX INFO: renamed from: d */
    public int f153811d;

    public ngx0(int i, Object[] objArr) {
        this.f153808a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f153809b = objArr.length;
            this.f153811d = i;
        } else {
            StringBuilder sbM56838j = klh.m56838j(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbM56838j.append(objArr.length);
            throw new IllegalArgumentException(sbM56838j.toString().toString());
        }
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f153811d;
    }

    /* JADX INFO: renamed from: b */
    public final void m64407b(Object obj) {
        if (m64409e()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f153808a[(mo33075a() + this.f153810c) % this.f153809b] = obj;
        this.f153811d = mo33075a() + 1;
    }

    /* JADX INFO: renamed from: d */
    public final ngx0 m64408d(int i) {
        int i2 = this.f153809b;
        int i3 = i2 + (i2 >> 1) + 1;
        if (i3 <= i) {
            i = i3;
        }
        return new ngx0(mo33075a(), this.f153810c == 0 ? Arrays.copyOf(this.f153808a, i) : toArray(new Object[i]));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m64409e() {
        return mo33075a() == this.f153809b;
    }

    /* JADX INFO: renamed from: f */
    public final void m64410f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(s571.m77246e(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.f153811d) {
            StringBuilder sbM56838j = klh.m56838j(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbM56838j.append(this.f153811d);
            throw new IllegalArgumentException(sbM56838j.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f153810c;
            int i3 = this.f153809b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f153808a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f153810c = i4;
            this.f153811d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int iMo33075a = mo33075a();
        if (i < 0 || i >= iMo33075a) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", iMo33075a, ", size: "));
        }
        return this.f153808a[(this.f153810c + i) % this.f153809b];
    }

    @Override // p204p.AbstractC2154n7, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new mgx0(this);
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo33075a()]);
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.f153811d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f153811d;
        int i3 = this.f153810c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f153808a;
            if (i5 >= i2 || i3 >= this.f153809b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        geg1.m44492E(i2, objArr);
        return objArr;
    }

    public ngx0(int i) {
        this(0, new Object[i]);
    }
}
