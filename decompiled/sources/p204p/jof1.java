package p204p;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class jof1 implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114420a;

    /* JADX INFO: renamed from: b */
    public final transient Object[] f114421b;

    /* JADX INFO: renamed from: c */
    public transient AbstractCollection f114422c;

    /* JADX INFO: renamed from: d */
    public transient AbstractCollection f114423d;

    /* JADX INFO: renamed from: e */
    public transient AbstractCollection f114424e;

    public /* synthetic */ jof1(int i, Object[] objArr) {
        this.f114420a = i;
        this.f114421b = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f114420a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f114420a) {
            case 0:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f114420a) {
            case 0:
                hof1 hof1Var = (hof1) this.f114424e;
                if (hof1Var == null) {
                    hof1Var = new hof1(1, this.f114421b);
                    this.f114424e = hof1Var;
                }
                return hof1Var.contains(obj);
            case 1:
                iuf1 iuf1Var = (iuf1) this.f114424e;
                if (iuf1Var == null) {
                    iuf1Var = new iuf1(1, this.f114421b);
                    this.f114424e = iuf1Var;
                }
                return iuf1Var.contains(obj);
            default:
                dbh1 dbh1Var = (dbh1) this.f114424e;
                if (dbh1Var == null) {
                    dbh1Var = new dbh1(1, this.f114421b);
                    this.f114424e = dbh1Var;
                }
                return dbh1Var.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f114420a) {
            case 0:
                znf1 znf1Var = (znf1) this.f114422c;
                if (znf1Var != null) {
                    return znf1Var;
                }
                znf1 znf1Var2 = new znf1(this, this.f114421b);
                this.f114422c = znf1Var2;
                return znf1Var2;
            case 1:
                vtf1 vtf1Var = (vtf1) this.f114422c;
                if (vtf1Var != null) {
                    return vtf1Var;
                }
                vtf1 vtf1Var2 = new vtf1(this, this.f114421b);
                this.f114422c = vtf1Var2;
                return vtf1Var2;
            default:
                w7h1 w7h1Var = (w7h1) this.f114422c;
                if (w7h1Var != null) {
                    return w7h1Var;
                }
                w7h1 w7h1Var2 = new w7h1(this, this.f114421b);
                this.f114422c = w7h1Var2;
                return w7h1Var2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f114420a) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:6:0x0008  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.f114420a) {
            case 0:
                if (obj == null) {
                    obj2 = null;
                } else {
                    Object[] objArr = this.f114421b;
                    Object obj5 = objArr[0];
                    Objects.requireNonNull(obj5);
                    if (obj5.equals(obj)) {
                        obj2 = objArr[1];
                        Objects.requireNonNull(obj2);
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            case 1:
                if (obj == null) {
                    obj3 = null;
                } else {
                    Object[] objArr2 = this.f114421b;
                    Object obj6 = objArr2[0];
                    Objects.requireNonNull(obj6);
                    if (obj6.equals(obj)) {
                        obj3 = objArr2[1];
                        Objects.requireNonNull(obj3);
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            default:
                if (obj == null) {
                    obj4 = null;
                } else {
                    Object[] objArr3 = this.f114421b;
                    Object obj7 = objArr3[0];
                    obj7.getClass();
                    if (obj7.equals(obj)) {
                        obj4 = objArr3[1];
                        obj4.getClass();
                    } else {
                        obj4 = null;
                    }
                }
                if (obj4 == null) {
                    return null;
                }
                return obj4;
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f114420a) {
            case 0:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            default:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f114420a) {
            case 0:
                znf1 znf1Var = (znf1) this.f114422c;
                if (znf1Var == null) {
                    znf1Var = new znf1(this, this.f114421b);
                    this.f114422c = znf1Var;
                }
                Iterator it = znf1Var.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            case 1:
                vtf1 vtf1Var = (vtf1) this.f114422c;
                if (vtf1Var == null) {
                    vtf1Var = new vtf1(this, this.f114421b);
                    this.f114422c = vtf1Var;
                }
                Iterator it2 = vtf1Var.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
            default:
                w7h1 w7h1Var = (w7h1) this.f114422c;
                if (w7h1Var == null) {
                    w7h1Var = new w7h1(this, this.f114421b);
                    this.f114422c = w7h1Var;
                }
                Iterator it3 = w7h1Var.iterator();
                int iHashCode3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    iHashCode3 += next3 != null ? next3.hashCode() : 0;
                }
                return iHashCode3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f114420a) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f114420a) {
            case 0:
                dof1 dof1Var = (dof1) this.f114423d;
                if (dof1Var != null) {
                    return dof1Var;
                }
                dof1 dof1Var2 = new dof1(this, new hof1(0, this.f114421b));
                this.f114423d = dof1Var2;
                return dof1Var2;
            case 1:
                auf1 auf1Var = (auf1) this.f114423d;
                if (auf1Var != null) {
                    return auf1Var;
                }
                auf1 auf1Var2 = new auf1(this, new iuf1(0, this.f114421b));
                this.f114423d = auf1Var2;
                return auf1Var2;
            default:
                t9h1 t9h1Var = (t9h1) this.f114423d;
                if (t9h1Var != null) {
                    return t9h1Var;
                }
                t9h1 t9h1Var2 = new t9h1(this, new dbh1(0, this.f114421b));
                this.f114423d = t9h1Var2;
                return t9h1Var2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f114420a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f114420a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f114420a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f114420a) {
        }
        return 1;
    }

    public final String toString() {
        switch (this.f114420a) {
            case 0:
                boolean z = true;
                StringBuilder sb = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb.append('{');
                for (Map.Entry entry : (znf1) entrySet()) {
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
            case 1:
                boolean z2 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry2 : (vtf1) entrySet()) {
                    if (!z2) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z2 = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                boolean z3 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb3.append('{');
                for (Map.Entry entry3 : (w7h1) entrySet()) {
                    if (!z3) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z3 = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f114420a) {
            case 0:
                hof1 hof1Var = (hof1) this.f114424e;
                if (hof1Var != null) {
                    return hof1Var;
                }
                hof1 hof1Var2 = new hof1(1, this.f114421b);
                this.f114424e = hof1Var2;
                return hof1Var2;
            case 1:
                iuf1 iuf1Var = (iuf1) this.f114424e;
                if (iuf1Var != null) {
                    return iuf1Var;
                }
                iuf1 iuf1Var2 = new iuf1(1, this.f114421b);
                this.f114424e = iuf1Var2;
                return iuf1Var2;
            default:
                dbh1 dbh1Var = (dbh1) this.f114424e;
                if (dbh1Var != null) {
                    return dbh1Var;
                }
                dbh1 dbh1Var2 = new dbh1(1, this.f114421b);
                this.f114424e = dbh1Var2;
                return dbh1Var2;
        }
    }
}
