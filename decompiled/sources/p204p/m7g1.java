package p204p;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class m7g1 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final m7g1 f140775b;

    /* JADX INFO: renamed from: a */
    public boolean f140776a = true;

    static {
        m7g1 m7g1Var = new m7g1();
        f140775b = m7g1Var;
        m7g1Var.f140776a = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m61062b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof hgg1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM24800a = a5g1.m24800a(length, bArr, 0, length);
        if (iM24800a == 0) {
            return 1;
        }
        return iM24800a;
    }

    /* JADX INFO: renamed from: c */
    public final void m61063c() {
        if (!this.f140776a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m61063c();
        super.clear();
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
        int iM61062b = 0;
        for (Map.Entry entry : entrySet()) {
            iM61062b += m61062b(entry.getValue()) ^ m61062b(entry.getKey());
        }
        return iM61062b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m61063c();
        Charset charset = a5g1.f12516a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m61063c();
        for (Object obj : map.keySet()) {
            Charset charset = a5g1.f12516a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m61063c();
        return super.remove(obj);
    }
}
