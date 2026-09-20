package p204p;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jtp0 extends qp71 {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f115937n = 0;

    /* JADX INFO: renamed from: e */
    public final int f115938e;

    /* JADX INFO: renamed from: f */
    public final qv11 f115939f;

    /* JADX INFO: renamed from: g */
    public final int f115940g;

    /* JADX INFO: renamed from: h */
    public final int f115941h;

    /* JADX INFO: renamed from: i */
    public final int[] f115942i;

    /* JADX INFO: renamed from: j */
    public final int[] f115943j;

    /* JADX INFO: renamed from: k */
    public final qp71[] f115944k;

    /* JADX INFO: renamed from: l */
    public final Object[] f115945l;

    /* JADX INFO: renamed from: m */
    public final HashMap f115946m;

    /* JADX WARN: Illegal instructions before constructor call */
    public jtp0(ArrayList arrayList, qv11 qv11Var) {
        qp71[] qp71VarArr = new qp71[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            qp71VarArr[i2] = ((dtd0) it.next()).mo36237a();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((dtd0) it2.next()).getUid();
            i++;
        }
        this(qp71VarArr, objArr, qv11Var);
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: a */
    public final int mo33542a(boolean z) {
        if (this.f115938e != 0) {
            int iM54302q = 0;
            if (z) {
                int[] iArr = this.f115939f.f192856b;
                iM54302q = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                qp71[] qp71VarArr = this.f115944k;
                if (!qp71VarArr[iM54302q].m73436p()) {
                    return qp71VarArr[iM54302q].mo33542a(z) + this.f115943j[iM54302q];
                }
                iM54302q = m54302q(iM54302q, z);
            } while (iM54302q != -1);
        }
        return -1;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: b */
    public final int mo26650b(Object obj) {
        int iMo26650b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f115946m.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iMo26650b = this.f115944k[iIntValue].mo26650b(obj3)) != -1) {
                return this.f115942i[iIntValue] + iMo26650b;
            }
        }
        return -1;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: c */
    public final int mo33543c(boolean z) {
        int iM54303r;
        int i = this.f115938e;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f115939f.f192856b;
                iM54303r = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iM54303r = i - 1;
            }
            do {
                qp71[] qp71VarArr = this.f115944k;
                if (!qp71VarArr[iM54303r].m73436p()) {
                    return qp71VarArr[iM54303r].mo33543c(z) + this.f115943j[iM54303r];
                }
                iM54303r = m54303r(iM54303r, z);
            } while (iM54303r != -1);
        }
        return -1;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: e */
    public final int mo33544e(int i, int i2, boolean z) {
        int[] iArr = this.f115943j;
        int iM46307e = h0b1.m46307e(iArr, i + 1, false, false);
        int i3 = iArr[iM46307e];
        qp71[] qp71VarArr = this.f115944k;
        int iMo33544e = qp71VarArr[iM46307e].mo33544e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo33544e != -1) {
            return i3 + iMo33544e;
        }
        int iM54302q = m54302q(iM46307e, z);
        while (iM54302q != -1 && qp71VarArr[iM54302q].m73436p()) {
            iM54302q = m54302q(iM54302q, z);
        }
        if (iM54302q != -1) {
            return qp71VarArr[iM54302q].mo33542a(z) + iArr[iM54302q];
        }
        if (i2 == 2) {
            return mo33542a(z);
        }
        return -1;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: f */
    public final bp71 mo26651f(int i, bp71 bp71Var, boolean z) {
        int[] iArr = this.f115942i;
        int iM46307e = h0b1.m46307e(iArr, i + 1, false, false);
        int i2 = this.f115943j[iM46307e];
        this.f115944k[iM46307e].mo26651f(i - iArr[iM46307e], bp71Var, z);
        bp71Var.f29345c += i2;
        if (z) {
            Object obj = this.f115945l[iM46307e];
            Object obj2 = bp71Var.f29344b;
            obj2.getClass();
            bp71Var.f29344b = Pair.create(obj, obj2);
        }
        return bp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: g */
    public final bp71 mo46978g(Object obj, bp71 bp71Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f115946m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f115943j[iIntValue];
        this.f115944k[iIntValue].mo46978g(obj3, bp71Var);
        bp71Var.f29345c += i;
        bp71Var.f29344b = obj;
        return bp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: h */
    public final int mo26652h() {
        return this.f115941h;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: k */
    public final int mo33545k(int i, int i2, boolean z) {
        int[] iArr = this.f115943j;
        int iM46307e = h0b1.m46307e(iArr, i + 1, false, false);
        int i3 = iArr[iM46307e];
        qp71[] qp71VarArr = this.f115944k;
        int iMo33545k = qp71VarArr[iM46307e].mo33545k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iMo33545k != -1) {
            return i3 + iMo33545k;
        }
        int iM54303r = m54303r(iM46307e, z);
        while (iM54303r != -1 && qp71VarArr[iM54303r].m73436p()) {
            iM54303r = m54303r(iM54303r, z);
        }
        if (iM54303r != -1) {
            return qp71VarArr[iM54303r].mo33543c(z) + iArr[iM54303r];
        }
        if (i2 == 2) {
            return mo33543c(z);
        }
        return -1;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: l */
    public final Object mo26653l(int i) {
        int[] iArr = this.f115942i;
        int iM46307e = h0b1.m46307e(iArr, i + 1, false, false);
        return Pair.create(this.f115945l[iM46307e], this.f115944k[iM46307e].mo26653l(i - iArr[iM46307e]));
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: n */
    public final mp71 mo26654n(int i, mp71 mp71Var, long j) {
        int[] iArr = this.f115943j;
        int iM46307e = h0b1.m46307e(iArr, i + 1, false, false);
        int i2 = iArr[iM46307e];
        int i3 = this.f115942i[iM46307e];
        this.f115944k[iM46307e].mo26654n(i - i2, mp71Var, j);
        Object objCreate = this.f115945l[iM46307e];
        if (!mp71.f145916q.equals(mp71Var.f145926a)) {
            objCreate = Pair.create(objCreate, mp71Var.f145926a);
        }
        mp71Var.f145926a = objCreate;
        mp71Var.f145939n += i3;
        mp71Var.f145940o += i3;
        return mp71Var;
    }

    @Override // p204p.qp71
    /* JADX INFO: renamed from: o */
    public final int mo26655o() {
        return this.f115940g;
    }

    /* JADX INFO: renamed from: q */
    public final int m54302q(int i, boolean z) {
        if (!z) {
            if (i < this.f115938e - 1) {
                return i + 1;
            }
            return -1;
        }
        qv11 qv11Var = this.f115939f;
        int i2 = qv11Var.f192857c[i] + 1;
        int[] iArr = qv11Var.f192856b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final int m54303r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        qv11 qv11Var = this.f115939f;
        int i2 = qv11Var.f192857c[i] - 1;
        if (i2 >= 0) {
            return qv11Var.f192856b[i2];
        }
        return -1;
    }

    public jtp0(qp71[] qp71VarArr, Object[] objArr, qv11 qv11Var) {
        this.f115939f = qv11Var;
        this.f115938e = qv11Var.f192856b.length;
        int length = qp71VarArr.length;
        this.f115944k = qp71VarArr;
        this.f115942i = new int[length];
        this.f115943j = new int[length];
        this.f115945l = objArr;
        this.f115946m = new HashMap();
        int length2 = qp71VarArr.length;
        int i = 0;
        int iMo26655o = 0;
        int iMo26652h = 0;
        int i2 = 0;
        while (i < length2) {
            qp71 qp71Var = qp71VarArr[i];
            this.f115944k[i2] = qp71Var;
            this.f115943j[i2] = iMo26655o;
            this.f115942i[i2] = iMo26652h;
            iMo26655o += qp71Var.mo26655o();
            iMo26652h += this.f115944k[i2].mo26652h();
            this.f115946m.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f115940g = iMo26655o;
        this.f115941h = iMo26652h;
    }
}
