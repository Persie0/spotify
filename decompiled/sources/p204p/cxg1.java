package p204p;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cxg1 implements Map, Serializable {

    /* JADX INFO: renamed from: g */
    public static final cxg1 f43031g = new cxg1(0, null, new Object[0]);

    /* JADX INFO: renamed from: a */
    public transient uwg1 f43032a;

    /* JADX INFO: renamed from: b */
    public transient xwg1 f43033b;

    /* JADX INFO: renamed from: c */
    public transient zwg1 f43034c;

    /* JADX INFO: renamed from: d */
    public final transient Object f43035d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f43036e;

    /* JADX INFO: renamed from: f */
    public final transient int f43037f;

    public cxg1(int i, Object obj, Object[] objArr) {
        this.f43035d = obj;
        this.f43036e = objArr;
        this.f43037f = i;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tvg1 entrySet() {
        uwg1 uwg1Var = this.f43032a;
        if (uwg1Var != null) {
            return uwg1Var;
        }
        uwg1 uwg1Var2 = new uwg1(this, this.f43036e, this.f43037f);
        this.f43032a = uwg1Var2;
        return uwg1Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        zwg1 zwg1Var = this.f43034c;
        if (zwg1Var == null) {
            zwg1Var = new zwg1(1, this.f43037f, this.f43036e);
            this.f43034c = zwg1Var;
        }
        return zwg1Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.f43037f;
            Object[] objArr = this.f43036e;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f43035d;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM39679O = epv0.m39679O(obj.hashCode());
                    while (true) {
                        int i2 = iM39679O & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iM39679O = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM39679O2 = epv0.m39679O(obj.hashCode());
                    while (true) {
                        int i4 = iM39679O2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iM39679O2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM39679O3 = epv0.m39679O(obj.hashCode());
                    while (true) {
                        int i5 = iM39679O3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iM39679O3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zsf1.m96840K(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        xwg1 xwg1Var = this.f43033b;
        if (xwg1Var != null) {
            return xwg1Var;
        }
        xwg1 xwg1Var2 = new xwg1(this, new zwg1(0, this.f43037f, this.f43036e));
        this.f43033b = xwg1Var2;
        return xwg1Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f43037f;
    }

    public final String toString() {
        int i = this.f43037f;
        nsf1.m65535u(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (uwg1) entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        zwg1 zwg1Var = this.f43034c;
        if (zwg1Var != null) {
            return zwg1Var;
        }
        zwg1 zwg1Var2 = new zwg1(1, this.f43037f, this.f43036e);
        this.f43034c = zwg1Var2;
        return zwg1Var2;
    }
}
