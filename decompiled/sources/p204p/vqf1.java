package p204p;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class vqf1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final vqf1 f243945b;

    /* JADX INFO: renamed from: a */
    public boolean f243946a = true;

    static {
        vqf1 vqf1Var = new vqf1();
        f243945b = vqf1Var;
        vqf1Var.f243946a = false;
    }

    /* JADX INFO: renamed from: b */
    public static vqf1 m86210b() {
        return f243945b;
    }

    /* JADX INFO: renamed from: c */
    public final vqf1 m86211c() {
        if (isEmpty()) {
            return new vqf1();
        }
        vqf1 vqf1Var = new vqf1(this);
        vqf1Var.f243946a = true;
        return vqf1Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m86215h();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m86212d() {
        this.f243946a = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m86213e(vqf1 vqf1Var) {
        m86215h();
        if (vqf1Var.isEmpty()) {
            return;
        }
        putAll(vqf1Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m86214g() {
        return this.f243946a;
    }

    /* JADX INFO: renamed from: h */
    public final void m86215h() {
        if (!this.f243946a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = nnf1.f156416a;
                iHashCode = length;
                for (byte b : bArr) {
                    iHashCode = (iHashCode * 31) + b;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = nnf1.f156416a;
                int i2 = length2;
                for (byte b2 : bArr2) {
                    i2 = (i2 * 31) + b2;
                }
                if (i2 != 0) {
                    iHashCode2 = i2;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m86215h();
        Charset charset = nnf1.f156416a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m86215h();
        for (Object obj : map.keySet()) {
            Charset charset = nnf1.f156416a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m86215h();
        return super.remove(obj);
    }
}
