package p204p;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class jpi0 {

    /* JADX INFO: renamed from: a */
    public Object[] f114675a;

    /* JADX INFO: renamed from: b */
    public int f114676b;

    /* JADX INFO: renamed from: c */
    public hpi0 f114677c;

    public jpi0(int i) {
        this.f114675a = i == 0 ? dmk0.f50555a : new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m53954a(Object obj) {
        int i = this.f114676b + 1;
        Object[] objArr = this.f114675a;
        if (objArr.length < i) {
            m53966m(i, objArr);
        }
        Object[] objArr2 = this.f114675a;
        int i2 = this.f114676b;
        objArr2[i2] = obj;
        this.f114676b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m53955b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f114676b;
        int size = list.size() + i;
        Object[] objArr = this.f114675a;
        if (objArr.length < size) {
            m53966m(size, objArr);
        }
        Object[] objArr2 = this.f114675a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f114676b = list.size() + this.f114676b;
    }

    /* JADX INFO: renamed from: c */
    public final void m53956c(jpi0 jpi0Var) {
        if (jpi0Var.m53961h()) {
            return;
        }
        int i = this.f114676b + jpi0Var.f114676b;
        Object[] objArr = this.f114675a;
        if (objArr.length < i) {
            m53966m(i, objArr);
        }
        bk5.m29629p0(this.f114676b, 0, jpi0Var.f114676b, jpi0Var.f114675a, this.f114675a);
        this.f114676b += jpi0Var.f114676b;
    }

    /* JADX INFO: renamed from: d */
    public final void m53957d() {
        bk5.m29578A0(this.f114675a, null, 0, this.f114676b);
        this.f114676b = 0;
    }

    /* JADX INFO: renamed from: e */
    public final Object m53958e() {
        if (m53961h()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.f114675a[0];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpi0) {
            jpi0 jpi0Var = (jpi0) obj;
            int i = jpi0Var.f114676b;
            int i2 = this.f114676b;
            if (i == i2) {
                Object[] objArr = this.f114675a;
                Object[] objArr2 = jpi0Var.f114675a;
                b450 b450VarM63417Y = n0e1.m63417Y(0, i2);
                int i3 = b450VarM63417Y.f278778a;
                int i4 = b450VarM63417Y.f278779b;
                if (i3 > i4) {
                    return true;
                }
                while (wj50.m88271j(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m53959f(int i) {
        if (i >= 0 && i < this.f114676b) {
            return this.f114675a[i];
        }
        m53968o(i);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final int m53960g(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.f114675a;
            int i2 = this.f114676b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.f114675a;
        int i3 = this.f114676b;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m53961h() {
        return this.f114676b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f114675a;
        int i = this.f114676b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m53962i() {
        return this.f114676b != 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m53963j(Object obj) {
        int iM53960g = m53960g(obj);
        if (iM53960g < 0) {
            return false;
        }
        m53964k(iM53960g);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m53964k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f114676b)) {
            m53968o(i);
            throw null;
        }
        Object[] objArr = this.f114675a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            bk5.m29629p0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.f114676b - 1;
        this.f114676b = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m53965l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f114676b) || i2 < 0 || i2 > i3) {
            StringBuilder sbM36619s = dq60.m36619s(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbM36619s.append(this.f114676b);
            epv0.m39675K(sbM36619s.toString());
            throw null;
        }
        if (i2 < i) {
            epv0.m39674J("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f114675a;
                bk5.m29629p0(i, i2, i3, objArr, objArr);
            }
            int i4 = this.f114676b;
            int i5 = i4 - (i2 - i);
            bk5.m29578A0(this.f114675a, null, i5, i4);
            this.f114676b = i5;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m53966m(int i, Object[] objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        bk5.m29629p0(0, 0, length, objArr, objArr2);
        this.f114675a = objArr2;
    }

    /* JADX INFO: renamed from: n */
    public final Object m53967n(int i, Object obj) {
        if (i < 0 || i >= this.f114676b) {
            m53968o(i);
            throw null;
        }
        Object[] objArr = this.f114675a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: o */
    public final void m53968o(int i) {
        StringBuilder sbM56838j = klh.m56838j(i, "Index ", " must be in 0..");
        sbM56838j.append(this.f114676b - 1);
        epv0.m39675K(sbM56838j.toString());
        throw null;
    }

    public final String toString() {
        gfx gfxVar = new gfx(this, 22);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f114675a;
        int i = this.f114676b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) gfxVar.invoke(obj));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ jpi0() {
        this(16);
    }
}
