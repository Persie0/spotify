package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class ajc0 extends AbstractMap implements ConcurrentMap, Serializable {

    /* JADX INFO: renamed from: t */
    public static final yhc0 f16230t = new yhc0();

    /* JADX INFO: renamed from: a */
    public final transient int f16231a;

    /* JADX INFO: renamed from: b */
    public final transient int f16232b;

    /* JADX INFO: renamed from: c */
    public final transient fic0[] f16233c;

    /* JADX INFO: renamed from: d */
    public final int f16234d;

    /* JADX INFO: renamed from: e */
    public final bdw f16235e;

    /* JADX INFO: renamed from: f */
    public final transient eic0 f16236f;

    /* JADX INFO: renamed from: g */
    public transient cic0 f16237g;

    /* JADX INFO: renamed from: h */
    public transient C2247p8 f16238h;

    /* JADX INFO: renamed from: i */
    public transient cic0 f16239i;

    public ajc0(rz10 rz10Var, eic0 eic0Var) {
        int i = rz10Var.f204025d;
        this.f16234d = Math.min(i == -1 ? 4 : i, 65536);
        this.f16235e = (bdw) vie1.m85630l((bdw) rz10Var.f204028g, ((jic0) vie1.m85630l((jic0) rz10Var.f204026e, jic0.f112719a)).mo47631a());
        this.f16236f = eic0Var;
        int i2 = rz10Var.f204024c;
        int iMin = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.f16234d) {
            i5++;
            i6 <<= 1;
        }
        this.f16232b = 32 - i5;
        this.f16231a = i6 - 1;
        this.f16233c = new fic0[i6];
        int i7 = iMin / i6;
        while (i4 < (i6 * i7 < iMin ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            fic0[] fic0VarArr = this.f16233c;
            if (i3 >= fic0VarArr.length) {
                return;
            }
            fic0VarArr[i3] = this.f16236f.mo24404h(this, i4);
            i3++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    /* JADX INFO: renamed from: a */
    public final int m26149a(Object obj) {
        int iMo25631b = this.f16235e.mo25631b(obj);
        int i = iMo25631b + ((iMo25631b << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    /* JADX INFO: renamed from: b */
    public final fic0 m26150b(int i) {
        return this.f16233c[(i >>> this.f16232b) & this.f16231a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (fic0 fic0Var : this.f16233c) {
            if (fic0Var.f69843b != 0) {
                fic0Var.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = fic0Var.f69846e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    fic0Var.mo41706e();
                    fic0Var.f69847f.set(0);
                    fic0Var.f69844c++;
                    fic0Var.f69843b = 0;
                    fic0Var.unlock();
                } catch (Throwable th) {
                    fic0Var.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iM26149a = m26149a(obj);
        fic0 fic0VarM26150b = m26150b(iM26149a);
        fic0VarM26150b.getClass();
        try {
            if (fic0VarM26150b.f69843b == 0) {
                return false;
            }
            dic0 dic0VarM41705d = fic0VarM26150b.m41705d(iM26149a, obj);
            if (dic0VarM41705d != null && dic0VarM41705d.getValue() != null) {
                z = true;
            }
            return z;
        } finally {
            fic0VarM26150b.m41708g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            fic0[] fic0VarArr = this.f16233c;
            long j = -1;
            int i = 0;
            while (i < 3) {
                int length = fic0VarArr.length;
                long j2 = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    fic0 fic0Var = fic0VarArr[i2];
                    int i3 = fic0Var.f69843b;
                    AtomicReferenceArray atomicReferenceArray = fic0Var.f69846e;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        for (dic0 dic0VarMo26068c = (dic0) atomicReferenceArray.get(i4); dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                            if (dic0VarMo26068c.getKey() == null || (value = dic0VarMo26068c.getValue()) == null) {
                                fic0Var.m41714m();
                                value = null;
                            }
                            if (value != null && this.f16236f.mo24400b().mo47631a().m28859c(obj, value)) {
                                return true;
                            }
                        }
                    }
                    j2 += (long) fic0Var.f69844c;
                }
                if (j2 == j) {
                    return false;
                }
                i++;
                j = j2;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        cic0 cic0Var = this.f16239i;
        if (cic0Var != null) {
            return cic0Var;
        }
        cic0 cic0Var2 = new cic0(this, 0);
        this.f16239i = cic0Var2;
        return cic0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM26149a = m26149a(obj);
        fic0 fic0VarM26150b = m26150b(iM26149a);
        fic0VarM26150b.getClass();
        try {
            dic0 dic0VarM41705d = fic0VarM26150b.m41705d(iM26149a, obj);
            if (dic0VarM41705d == null) {
                return null;
            }
            Object value = dic0VarM41705d.getValue();
            if (value == null) {
                fic0VarM26150b.m41714m();
            }
            return value;
        } finally {
            fic0VarM26150b.m41708g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        fic0[] fic0VarArr = this.f16233c;
        long j = 0;
        for (int i = 0; i < fic0VarArr.length; i++) {
            if (fic0VarArr[i].f69843b != 0) {
                return false;
            }
            j += (long) fic0VarArr[i].f69844c;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < fic0VarArr.length; i2++) {
            if (fic0VarArr[i2].f69843b != 0) {
                return false;
            }
            j -= (long) fic0VarArr[i2].f69844c;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        cic0 cic0Var = this.f16237g;
        if (cic0Var != null) {
            return cic0Var;
        }
        cic0 cic0Var2 = new cic0(this, 1);
        this.f16237g = cic0Var2;
        return cic0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM26149a = m26149a(obj);
        return m26150b(iM26149a).m41709h(obj, obj2, false, iM26149a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM26149a = m26149a(obj);
        return m26150b(iM26149a).m41709h(obj, obj2, true, iM26149a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iM26149a = m26149a(obj);
        fic0 fic0VarM26150b = m26150b(iM26149a);
        fic0VarM26150b.lock();
        try {
            fic0VarM26150b.m41711j();
            AtomicReferenceArray atomicReferenceArray = fic0VarM26150b.f69846e;
            int length = (atomicReferenceArray.length() - 1) & iM26149a;
            dic0 dic0Var = (dic0) atomicReferenceArray.get(length);
            for (dic0 dic0VarMo26068c = dic0Var; dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                Object key = dic0VarMo26068c.getKey();
                if (dic0VarMo26068c.mo26067b() == iM26149a && key != null && fic0VarM26150b.f69842a.f16235e.m28859c(obj, key)) {
                    Object value = dic0VarMo26068c.getValue();
                    if (value == null && dic0VarMo26068c.getValue() != null) {
                        return null;
                    }
                    fic0VarM26150b.f69844c++;
                    dic0 dic0VarM41710i = fic0VarM26150b.m41710i(dic0Var, dic0VarMo26068c);
                    int i = fic0VarM26150b.f69843b - 1;
                    atomicReferenceArray.set(length, dic0VarM41710i);
                    fic0VarM26150b.f69843b = i;
                    return value;
                }
            }
            return null;
        } finally {
            fic0VarM26150b.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM26149a = m26149a(obj);
        fic0 fic0VarM26150b = m26150b(iM26149a);
        fic0VarM26150b.lock();
        try {
            fic0VarM26150b.m41711j();
            AtomicReferenceArray atomicReferenceArray = fic0VarM26150b.f69846e;
            int length = (atomicReferenceArray.length() - 1) & iM26149a;
            dic0 dic0Var = (dic0) atomicReferenceArray.get(length);
            for (dic0 dic0VarMo26068c = dic0Var; dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                Object key = dic0VarMo26068c.getKey();
                if (dic0VarMo26068c.mo26067b() == iM26149a && key != null && fic0VarM26150b.f69842a.f16235e.m28859c(obj, key)) {
                    Object value = dic0VarMo26068c.getValue();
                    if (value != null) {
                        fic0VarM26150b.f69844c++;
                        fic0VarM26150b.m41713l(dic0VarMo26068c, obj2);
                        return value;
                    }
                    if (dic0VarMo26068c.getValue() == null) {
                        fic0VarM26150b.f69844c++;
                        dic0 dic0VarM41710i = fic0VarM26150b.m41710i(dic0Var, dic0VarMo26068c);
                        int i = fic0VarM26150b.f69843b - 1;
                        atomicReferenceArray.set(length, dic0VarM41710i);
                        fic0VarM26150b.f69843b = i;
                    }
                    return null;
                }
            }
            return null;
        } finally {
            fic0VarM26150b.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (fic0 fic0Var : this.f16233c) {
            j += (long) fic0Var.f69843b;
        }
        return k0e1.m54974I(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2247p8 c2247p8 = this.f16238h;
        if (c2247p8 != null) {
            return c2247p8;
        }
        C2247p8 c2247p9 = new C2247p8((Object) this, 3);
        this.f16238h = c2247p9;
        return c2247p9;
    }

    public Object writeReplace() {
        eic0 eic0Var = this.f16236f;
        return new gic0(eic0Var.mo24403f(), eic0Var.mo24400b(), this.f16235e, this.f16234d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iM26149a = m26149a(obj);
        fic0 fic0VarM26150b = m26150b(iM26149a);
        fic0VarM26150b.lock();
        try {
            fic0VarM26150b.m41711j();
            AtomicReferenceArray atomicReferenceArray = fic0VarM26150b.f69846e;
            int length = (atomicReferenceArray.length() - 1) & iM26149a;
            dic0 dic0Var = (dic0) atomicReferenceArray.get(length);
            for (dic0 dic0VarMo26068c = dic0Var; dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                Object key = dic0VarMo26068c.getKey();
                if (dic0VarMo26068c.mo26067b() == iM26149a && key != null && fic0VarM26150b.f69842a.f16235e.m28859c(obj, key)) {
                    if (fic0VarM26150b.f69842a.f16236f.mo24400b().mo47631a().m28859c(obj2, dic0VarMo26068c.getValue())) {
                        z = true;
                    } else if (dic0VarMo26068c.getValue() != null) {
                        return false;
                    }
                    fic0VarM26150b.f69844c++;
                    dic0 dic0VarM41710i = fic0VarM26150b.m41710i(dic0Var, dic0VarMo26068c);
                    int i = fic0VarM26150b.f69843b - 1;
                    atomicReferenceArray.set(length, dic0VarM41710i);
                    fic0VarM26150b.f69843b = i;
                    return z;
                }
            }
            return false;
        } finally {
            fic0VarM26150b.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iM26149a = m26149a(obj);
        fic0 fic0VarM26150b = m26150b(iM26149a);
        fic0VarM26150b.lock();
        try {
            fic0VarM26150b.m41711j();
            AtomicReferenceArray atomicReferenceArray = fic0VarM26150b.f69846e;
            int length = (atomicReferenceArray.length() - 1) & iM26149a;
            dic0 dic0Var = (dic0) atomicReferenceArray.get(length);
            for (dic0 dic0VarMo26068c = dic0Var; dic0VarMo26068c != null; dic0VarMo26068c = dic0VarMo26068c.mo26068c()) {
                Object key = dic0VarMo26068c.getKey();
                if (dic0VarMo26068c.mo26067b() == iM26149a && key != null && fic0VarM26150b.f69842a.f16235e.m28859c(obj, key)) {
                    Object value = dic0VarMo26068c.getValue();
                    if (value == null) {
                        if (dic0VarMo26068c.getValue() == null) {
                            fic0VarM26150b.f69844c++;
                            dic0 dic0VarM41710i = fic0VarM26150b.m41710i(dic0Var, dic0VarMo26068c);
                            int i = fic0VarM26150b.f69843b - 1;
                            atomicReferenceArray.set(length, dic0VarM41710i);
                            fic0VarM26150b.f69843b = i;
                        }
                        return false;
                    }
                    if (!fic0VarM26150b.f69842a.f16236f.mo24400b().mo47631a().m28859c(obj2, value)) {
                        return false;
                    }
                    fic0VarM26150b.f69844c++;
                    fic0VarM26150b.m41713l(dic0VarMo26068c, obj3);
                    return true;
                }
            }
            return false;
        } finally {
            fic0VarM26150b.unlock();
        }
    }
}
