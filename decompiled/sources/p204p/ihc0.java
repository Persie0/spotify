package p204p;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ihc0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final ihc0 f102235b;

    /* JADX INFO: renamed from: a */
    public boolean f102236a = true;

    static {
        ihc0 ihc0Var = new ihc0();
        f102235b = ihc0Var;
        ihc0Var.f102236a = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m50608b(Map map) {
        int iM50609c = 0;
        for (Map.Entry entry : map.entrySet()) {
            iM50609c += m50609c(entry.getValue()) ^ m50609c(entry.getKey());
        }
        return iM50609c;
    }

    /* JADX INFO: renamed from: c */
    public static int m50609c(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof od50) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = ee50.f58680a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static LinkedHashMap m50610d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m50611g(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj = map2.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj) : value.equals(obj))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m50612e();
        super.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m50612e() {
        if (!this.f102236a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && m50611g(this, (Map) obj);
    }

    /* JADX INFO: renamed from: h */
    public final ihc0 m50613h() {
        if (isEmpty()) {
            return new ihc0();
        }
        ihc0 ihc0Var = new ihc0(this);
        ihc0Var.f102236a = true;
        return ihc0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return m50608b(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m50612e();
        Charset charset = ee50.f58680a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m50612e();
        for (Object obj : map.keySet()) {
            Charset charset = ee50.f58680a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m50612e();
        return super.remove(obj);
    }
}
