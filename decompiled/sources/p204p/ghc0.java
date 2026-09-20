package p204p;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ghc0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final ghc0 f79883b;

    /* JADX INFO: renamed from: a */
    public boolean f79884a = true;

    static {
        ghc0 ghc0Var = new ghc0();
        f79883b = ghc0Var;
        ghc0Var.f79884a = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m44727b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof qd50) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = ce50.f37010a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final void m44728c() {
        if (!this.f79884a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m44728c();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final ghc0 m44729d() {
        if (isEmpty()) {
            return new ghc0();
        }
        ghc0 ghc0Var = new ghc0(this);
        ghc0Var.f79884a = true;
        return ghc0Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM44727b = 0;
        for (Map.Entry entry : entrySet()) {
            iM44727b += m44727b(entry.getValue()) ^ m44727b(entry.getKey());
        }
        return iM44727b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m44728c();
        Charset charset = ce50.f37010a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m44728c();
        for (Object obj : map.keySet()) {
            Charset charset = ce50.f37010a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m44728c();
        return super.remove(obj);
    }
}
