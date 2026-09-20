package p204p;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class hhc0 extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    public static final hhc0 f91326b;

    /* JADX INFO: renamed from: a */
    public boolean f91327a = true;

    static {
        hhc0 hhc0Var = new hhc0();
        f91326b = hhc0Var;
        hhc0Var.f91327a = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m47506b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof nd50) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = de50.f47970a;
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
    public static hhc0 m47507c() {
        return f91326b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m47508d();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m47508d() {
        if (!this.f91327a) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m47509e() {
        return this.f91327a;
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

    /* JADX INFO: renamed from: g */
    public final void m47510g() {
        this.f91327a = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m47511h(hhc0 hhc0Var) {
        m47508d();
        if (hhc0Var.isEmpty()) {
            return;
        }
        putAll(hhc0Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM47506b = 0;
        for (Map.Entry entry : entrySet()) {
            iM47506b += m47506b(entry.getValue()) ^ m47506b(entry.getKey());
        }
        return iM47506b;
    }

    /* JADX INFO: renamed from: i */
    public final hhc0 m47512i() {
        if (isEmpty()) {
            return new hhc0();
        }
        hhc0 hhc0Var = new hhc0(this);
        hhc0Var.f91327a = true;
        return hhc0Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m47508d();
        Charset charset = de50.f47970a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m47508d();
        for (Object obj : map.keySet()) {
            Charset charset = de50.f47970a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m47508d();
        return super.remove(obj);
    }
}
