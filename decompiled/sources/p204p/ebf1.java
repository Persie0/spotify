package p204p;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ebf1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final ebf1 f57922b;

    /* JADX INFO: renamed from: a */
    public boolean f57923a = true;

    static {
        ebf1 ebf1Var = new ebf1();
        f57922b = ebf1Var;
        ebf1Var.f57923a = false;
    }

    /* JADX INFO: renamed from: c */
    public static int m38369c(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof naf1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM25351b = abf1.m25351b(length, bArr, 0, length);
        if (iM25351b == 0) {
            return 1;
        }
        return iM25351b;
    }

    /* JADX INFO: renamed from: b */
    public final ebf1 m38370b() {
        if (isEmpty()) {
            return new ebf1();
        }
        ebf1 ebf1Var = new ebf1(this);
        ebf1Var.f57923a = true;
        return ebf1Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m38371d();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m38371d() {
        if (!this.f57923a) {
            throw new UnsupportedOperationException();
        }
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

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM38369c = 0;
        for (Map.Entry entry : entrySet()) {
            iM38369c += m38369c(entry.getValue()) ^ m38369c(entry.getKey());
        }
        return iM38369c;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m38371d();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m38371d();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m38371d();
        return super.remove(obj);
    }
}
