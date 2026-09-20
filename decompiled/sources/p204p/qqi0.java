package p204p;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class qqi0 implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public Object[] f191608a;

    /* JADX INFO: renamed from: b */
    public pqi0 f191609b;

    /* JADX INFO: renamed from: c */
    public int f191610c;

    public qqi0(int i, Object[] objArr) {
        this.f191608a = objArr;
        this.f191610c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m73555a(int i, Object obj) {
        int i2 = this.f191610c + 1;
        if (this.f191608a.length < i2) {
            m73567n(i2);
        }
        Object[] objArr = this.f191608a;
        int i3 = this.f191610c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f191610c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m73556b(Object obj) {
        int i = this.f191610c + 1;
        if (this.f191608a.length < i) {
            m73567n(i);
        }
        Object[] objArr = this.f191608a;
        int i2 = this.f191610c;
        objArr[i2] = obj;
        this.f191610c = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m73557c(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f191610c + size;
        if (this.f191608a.length < i2) {
            m73567n(i2);
        }
        Object[] objArr = this.f191608a;
        int i3 = this.f191610c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f191610c += size;
    }

    /* JADX INFO: renamed from: d */
    public final void m73558d(int i, qqi0 qqi0Var) {
        int i2 = qqi0Var.f191610c;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f191610c + i2;
        if (this.f191608a.length < i3) {
            m73567n(i3);
        }
        Object[] objArr = this.f191608a;
        int i4 = this.f191610c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(qqi0Var.f191608a, 0, objArr, i, i2);
        this.f191610c += i2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m73559e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f191610c + size;
        if (this.f191608a.length < i3) {
            m73567n(i3);
        }
        Object[] objArr = this.f191608a;
        int i4 = this.f191610c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f191610c += size;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final List m73560f() {
        pqi0 pqi0Var = this.f191609b;
        if (pqi0Var != null) {
            return pqi0Var;
        }
        pqi0 pqi0Var2 = new pqi0(this);
        this.f191609b = pqi0Var2;
        return pqi0Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m73561g() {
        Object[] objArr = this.f191608a;
        int i = this.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f191610c = 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m73562i(Object obj) {
        int i = this.f191610c - 1;
        if (i >= 0) {
            for (int i2 = 0; !wj50.m88271j(this.f191608a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final int m73563j(Object obj) {
        Object[] objArr = this.f191608a;
        int i = this.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            if (wj50.m88271j(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m73564k(Object obj) {
        int iM73563j = m73563j(obj);
        if (iM73563j < 0) {
            return false;
        }
        m73565l(iM73563j);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m73565l(int i) {
        Object[] objArr = this.f191608a;
        Object obj = objArr[i];
        int i2 = this.f191610c;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f191610c - 1;
        this.f191610c = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m73566m(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f191610c;
            if (i2 < i3) {
                Object[] objArr = this.f191608a;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f191610c;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f191608a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f191610c = i5;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m73567n(int i) {
        Object[] objArr = this.f191608a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f191608a = objArr2;
    }
}
