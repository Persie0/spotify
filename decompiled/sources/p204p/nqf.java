package p204p;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class nqf extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: t */
    public static final Object f157260t = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f157261a;

    /* JADX INFO: renamed from: b */
    public transient int[] f157262b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f157263c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f157264d;

    /* JADX INFO: renamed from: e */
    public transient int f157265e;

    /* JADX INFO: renamed from: f */
    public transient int f157266f;

    /* JADX INFO: renamed from: g */
    public transient kqf f157267g;

    /* JADX INFO: renamed from: h */
    public transient kqf f157268h;

    /* JADX INFO: renamed from: i */
    public transient C2247p8 f157269i;

    /* JADX INFO: renamed from: a */
    public static nqf m65414a() {
        nqf nqfVar = new nqf();
        nqfVar.m65419f(3);
        return nqfVar;
    }

    /* JADX INFO: renamed from: b */
    public static nqf m65415b(int i) {
        nqf nqfVar = new nqf();
        nqfVar.m65419f(i);
        return nqfVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(s571.m77246e(i, "Invalid size: "));
        }
        m65419f(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapM65416c = m65416c();
        Iterator it = mapM65416c != null ? mapM65416c.entrySet().iterator() : new jqf(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map m65416c() {
        Object obj = this.f157261a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m65421h()) {
            return;
        }
        this.f157265e += 32;
        Map mapM65416c = m65416c();
        if (mapM65416c != null) {
            this.f157265e = k0e1.m54994m(size(), 3);
            mapM65416c.clear();
            this.f157261a = null;
            this.f157266f = 0;
            return;
        }
        Arrays.fill(m65424k(), 0, this.f157266f, (Object) null);
        Arrays.fill(m65425l(), 0, this.f157266f, (Object) null);
        Object obj = this.f157261a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m65423j(), 0, this.f157266f, 0);
        this.f157266f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM65416c = m65416c();
        if (mapM65416c != null) {
            return mapM65416c.containsKey(obj);
        }
        return m65418e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM65416c = m65416c();
        if (mapM65416c != null) {
            return mapM65416c.containsValue(obj);
        }
        for (int i = 0; i < this.f157266f; i++) {
            if (upf.m83705v(obj, m65425l()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m65417d() {
        return (1 << (this.f157265e & 31)) - 1;
    }

    /* JADX INFO: renamed from: e */
    public final int m65418e(Object obj) {
        if (m65421h()) {
            return -1;
        }
        int iM30841r = bxg1.m30841r(obj);
        int iM65417d = m65417d();
        Object obj2 = this.f157261a;
        Objects.requireNonNull(obj2);
        int iM53639x = jkg1.m53639x(iM30841r & iM65417d, obj2);
        if (iM53639x == 0) {
            return -1;
        }
        int i = ~iM65417d;
        int i2 = iM30841r & i;
        do {
            int i3 = iM53639x - 1;
            int i4 = m65423j()[i3];
            if ((i4 & i) == i2 && upf.m83705v(obj, m65424k()[i3])) {
                return i3;
            }
            iM53639x = i4 & iM65417d;
        } while (iM53639x != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        kqf kqfVar = this.f157268h;
        if (kqfVar != null) {
            return kqfVar;
        }
        kqf kqfVar2 = new kqf(this, 0);
        this.f157268h = kqfVar2;
        return kqfVar2;
    }

    /* JADX INFO: renamed from: f */
    public final void m65419f(int i) {
        c95.m31844j(i >= 0, "Expected size must be >= 0");
        this.f157265e = k0e1.m54994m(i, 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m65420g(int i, int i2) {
        Object obj = this.f157261a;
        Objects.requireNonNull(obj);
        int[] iArrM65423j = m65423j();
        Object[] objArrM65424k = m65424k();
        Object[] objArrM65425l = m65425l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrM65424k[i] = null;
            objArrM65425l[i] = null;
            iArrM65423j[i] = 0;
            return;
        }
        Object obj2 = objArrM65424k[i3];
        objArrM65424k[i] = obj2;
        objArrM65425l[i] = objArrM65425l[i3];
        objArrM65424k[i3] = null;
        objArrM65425l[i3] = null;
        iArrM65423j[i] = iArrM65423j[i3];
        iArrM65423j[i3] = 0;
        int iM30841r = bxg1.m30841r(obj2) & i2;
        int iM53639x = jkg1.m53639x(iM30841r, obj);
        if (iM53639x == size) {
            jkg1.m53640y(iM30841r, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iM53639x - 1;
            int i5 = iArrM65423j[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrM65423j[i4] = jkg1.m53635t(i5, i + 1, i2);
                return;
            }
            iM53639x = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM65416c = m65416c();
        if (mapM65416c != null) {
            return mapM65416c.get(obj);
        }
        int iM65418e = m65418e(obj);
        if (iM65418e == -1) {
            return null;
        }
        return m65425l()[iM65418e];
    }

    /* JADX INFO: renamed from: h */
    public final boolean m65421h() {
        return this.f157261a == null;
    }

    /* JADX INFO: renamed from: i */
    public final Object m65422i(Object obj) {
        if (!m65421h()) {
            int iM65417d = m65417d();
            Object obj2 = this.f157261a;
            Objects.requireNonNull(obj2);
            int iM53637v = jkg1.m53637v(obj, null, iM65417d, obj2, m65423j(), m65424k(), null);
            if (iM53637v != -1) {
                Object obj3 = m65425l()[iM53637v];
                m65420g(iM53637v, iM65417d);
                this.f157266f--;
                this.f157265e += 32;
                return obj3;
            }
        }
        return f157260t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m65423j() {
        int[] iArr = this.f157262b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: k */
    public final Object[] m65424k() {
        Object[] objArr = this.f157263c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        kqf kqfVar = this.f157267g;
        if (kqfVar != null) {
            return kqfVar;
        }
        kqf kqfVar2 = new kqf(this, 1);
        this.f157267g = kqfVar2;
        return kqfVar2;
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m65425l() {
        Object[] objArr = this.f157264d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: n */
    public final int m65426n(int i, int i2, int i3, int i4) {
        Object objM53626k = jkg1.m53626k(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            jkg1.m53640y(i3 & i5, i4 + 1, objM53626k);
        }
        Object obj = this.f157261a;
        Objects.requireNonNull(obj);
        int[] iArrM65423j = m65423j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM53639x = jkg1.m53639x(i6, obj);
            while (iM53639x != 0) {
                int i7 = iM53639x - 1;
                int i8 = iArrM65423j[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM53639x2 = jkg1.m53639x(i10, objM53626k);
                jkg1.m53640y(i10, iM53639x, objM53626k);
                iArrM65423j[i7] = jkg1.m53635t(i9, iM53639x2, i5);
                iM53639x = i8 & i;
            }
        }
        this.f157261a = objM53626k;
        this.f157265e = jkg1.m53635t(this.f157265e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:34:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:55:0x00f4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.nqf.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM65416c = m65416c();
        if (mapM65416c != null) {
            return mapM65416c.remove(obj);
        }
        Object objM65422i = m65422i(obj);
        if (objM65422i == f157260t) {
            return null;
        }
        return objM65422i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM65416c = m65416c();
        return mapM65416c != null ? mapM65416c.size() : this.f157266f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2247p8 c2247p8 = this.f157269i;
        if (c2247p8 != null) {
            return c2247p8;
        }
        C2247p8 c2247p9 = new C2247p8((Object) this, 2);
        this.f157269i = c2247p9;
        return c2247p9;
    }
}
