package p204p;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
final class om60 extends xl60 {

    /* JADX INFO: renamed from: h */
    private static final Object f166978h = new Object();

    /* JADX INFO: renamed from: g */
    private Object[] f166979g;

    /* JADX INFO: renamed from: p.om60$a */
    public static final class C2220a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a */
        final xl60.EnumC2579c f166980a;

        /* JADX INFO: renamed from: b */
        final Object[] f166981b;

        /* JADX INFO: renamed from: c */
        int f166982c;

        public C2220a(xl60.EnumC2579c enumC2579c, Object[] objArr, int i) {
            this.f166980a = enumC2579c;
            this.f166981b = objArr;
            this.f166982c = i;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2220a clone() {
            return new C2220a(this.f166980a, this.f166981b, this.f166982c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f166982c < this.f166981b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f166981b;
            int i = this.f166982c;
            this.f166982c = i + 1;
            return objArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public om60(Object obj) {
        int[] iArr = this.f263039b;
        int i = this.f263038a;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.f166979g = objArr;
        this.f263038a = i + 1;
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: X */
    private void m67315X(Object obj) {
        int i = this.f263038a;
        if (i == this.f166979g.length) {
            if (i == 256) {
                throw new JsonDataException("Nesting too deep at " + m91387h());
            }
            int[] iArr = this.f263039b;
            this.f263039b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f263040c;
            this.f263040c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f263041d;
            this.f263041d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f166979g;
            this.f166979g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f166979g;
        int i2 = this.f263038a;
        this.f263038a = i2 + 1;
        objArr2[i2] = obj;
    }

    /* JADX INFO: renamed from: c0 */
    private void m67316c0() {
        int i = this.f263038a;
        int i2 = i - 1;
        this.f263038a = i2;
        Object[] objArr = this.f166979g;
        objArr[i2] = null;
        this.f263039b[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.f263041d;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m67315X(it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private <T> T m67317e0(Class<T> cls, xl60.EnumC2579c enumC2579c) {
        int i = this.f263038a;
        Object obj = i != 0 ? this.f166979g[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && enumC2579c == xl60.EnumC2579c.NULL) {
            return null;
        }
        if (obj == f166978h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m91385V(obj, enumC2579c);
    }

    /* JADX INFO: renamed from: g0 */
    private String m67318g0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw m91385V(key, xl60.EnumC2579c.NAME);
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: B */
    public xl60.EnumC2579c mo51068B() {
        int i = this.f263038a;
        if (i == 0) {
            return xl60.EnumC2579c.END_DOCUMENT;
        }
        Object obj = this.f166979g[i - 1];
        if (obj instanceof C2220a) {
            return ((C2220a) obj).f166980a;
        }
        if (obj instanceof List) {
            return xl60.EnumC2579c.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return xl60.EnumC2579c.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return xl60.EnumC2579c.NAME;
        }
        if (obj instanceof String) {
            return xl60.EnumC2579c.STRING;
        }
        if (obj instanceof Boolean) {
            return xl60.EnumC2579c.BOOLEAN;
        }
        if (obj instanceof Number) {
            return xl60.EnumC2579c.NUMBER;
        }
        if (obj == null) {
            return xl60.EnumC2579c.NULL;
        }
        if (obj == f166978h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m91385V(obj, "a JSON value");
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: D */
    public xl60 mo51069D() {
        return new om60(this);
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: G */
    public void mo51070G() {
        if (mo51079i()) {
            m67315X(mo51084s());
        }
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: K */
    public int mo51071K(xl60.C2578b c2578b) {
        Map.Entry<?, ?> entry = (Map.Entry) m67317e0(Map.Entry.class, xl60.EnumC2579c.NAME);
        String strM67318g0 = m67318g0(entry);
        int length = c2578b.f263045a.length;
        for (int i = 0; i < length; i++) {
            if (c2578b.f263045a[i].equals(strM67318g0)) {
                this.f166979g[this.f263038a - 1] = entry.getValue();
                this.f263040c[this.f263038a - 2] = strM67318g0;
                return i;
            }
        }
        return -1;
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: L */
    public int mo51072L(xl60.C2578b c2578b) {
        int i = this.f263038a;
        Object obj = i != 0 ? this.f166979g[i - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f166978h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = c2578b.f263045a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c2578b.f263045a[i2].equals(str)) {
                m67316c0();
                return i2;
            }
        }
        return -1;
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: P */
    public void mo51073P() {
        if (!this.f263043f) {
            this.f166979g[this.f263038a - 1] = ((Map.Entry) m67317e0(Map.Entry.class, xl60.EnumC2579c.NAME)).getValue();
            this.f263040c[this.f263038a - 2] = "null";
        } else {
            xl60.EnumC2579c enumC2579cMo51068B = mo51068B();
            mo51084s();
            throw new JsonDataException("Cannot skip unexpected " + enumC2579cMo51068B + " at " + m91387h());
        }
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: Q */
    public void mo51074Q() {
        if (this.f263043f) {
            throw new JsonDataException("Cannot skip unexpected " + mo51068B() + " at " + m91387h());
        }
        int i = this.f263038a;
        if (i > 1) {
            this.f263040c[i - 2] = "null";
        }
        Object obj = i != 0 ? this.f166979g[i - 1] : null;
        if (obj instanceof C2220a) {
            throw new JsonDataException("Expected a value but was " + mo51068B() + " at path " + m91387h());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f166979g;
            objArr[i - 1] = ((Map.Entry) objArr[i - 1]).getValue();
        } else {
            if (i > 0) {
                m67316c0();
                return;
            }
            throw new JsonDataException("Expected a value but was " + mo51068B() + " at path " + m91387h());
        }
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: a */
    public void mo51075a() {
        List list = (List) m67317e0(List.class, xl60.EnumC2579c.BEGIN_ARRAY);
        C2220a c2220a = new C2220a(xl60.EnumC2579c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f166979g;
        int i = this.f263038a;
        objArr[i - 1] = c2220a;
        this.f263039b[i - 1] = 1;
        this.f263041d[i - 1] = 0;
        if (c2220a.hasNext()) {
            m67315X(c2220a.next());
        }
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: c */
    public void mo51076c() {
        Map map = (Map) m67317e0(Map.class, xl60.EnumC2579c.BEGIN_OBJECT);
        C2220a c2220a = new C2220a(xl60.EnumC2579c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f166979g;
        int i = this.f263038a;
        objArr[i - 1] = c2220a;
        this.f263039b[i - 1] = 3;
        if (c2220a.hasNext()) {
            m67315X(c2220a.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f166979g, 0, this.f263038a, (Object) null);
        this.f166979g[0] = f166978h;
        this.f263039b[0] = 8;
        this.f263038a = 1;
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: e */
    public void mo51077e() {
        xl60.EnumC2579c enumC2579c = xl60.EnumC2579c.END_ARRAY;
        C2220a c2220a = (C2220a) m67317e0(C2220a.class, enumC2579c);
        if (c2220a.f166980a != enumC2579c || c2220a.hasNext()) {
            throw m91385V(c2220a, enumC2579c);
        }
        m67316c0();
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: f */
    public void mo51078f() {
        xl60.EnumC2579c enumC2579c = xl60.EnumC2579c.END_OBJECT;
        C2220a c2220a = (C2220a) m67317e0(C2220a.class, enumC2579c);
        if (c2220a.f166980a != enumC2579c || c2220a.hasNext()) {
            throw m91385V(c2220a, enumC2579c);
        }
        this.f263040c[this.f263038a - 1] = null;
        m67316c0();
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: i */
    public boolean mo51079i() {
        int i = this.f263038a;
        if (i == 0) {
            return false;
        }
        Object obj = this.f166979g[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: n */
    public boolean mo51080n() {
        Boolean bool = (Boolean) m67317e0(Boolean.class, xl60.EnumC2579c.BOOLEAN);
        m67316c0();
        return bool.booleanValue();
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: o */
    public double mo51081o() throws JsonEncodingException {
        double dDoubleValue;
        xl60.EnumC2579c enumC2579c = xl60.EnumC2579c.NUMBER;
        Object objM67317e0 = m67317e0(Object.class, enumC2579c);
        if (objM67317e0 instanceof Number) {
            dDoubleValue = ((Number) objM67317e0).doubleValue();
        } else {
            if (!(objM67317e0 instanceof String)) {
                throw m91385V(objM67317e0, enumC2579c);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objM67317e0);
            } catch (NumberFormatException unused) {
                throw m91385V(objM67317e0, xl60.EnumC2579c.NUMBER);
            }
        }
        if (this.f263042e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            m67316c0();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + m91387h());
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: p */
    public int mo51082p() {
        int iIntValueExact;
        xl60.EnumC2579c enumC2579c = xl60.EnumC2579c.NUMBER;
        Object objM67317e0 = m67317e0(Object.class, enumC2579c);
        if (objM67317e0 instanceof Number) {
            iIntValueExact = ((Number) objM67317e0).intValue();
        } else {
            if (!(objM67317e0 instanceof String)) {
                throw m91385V(objM67317e0, enumC2579c);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objM67317e0);
                } catch (NumberFormatException unused) {
                    throw m91385V(objM67317e0, xl60.EnumC2579c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objM67317e0).intValueExact();
            }
        }
        m67316c0();
        return iIntValueExact;
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: r */
    public long mo51083r() {
        long jLongValueExact;
        xl60.EnumC2579c enumC2579c = xl60.EnumC2579c.NUMBER;
        Object objM67317e0 = m67317e0(Object.class, enumC2579c);
        if (objM67317e0 instanceof Number) {
            jLongValueExact = ((Number) objM67317e0).longValue();
        } else {
            if (!(objM67317e0 instanceof String)) {
                throw m91385V(objM67317e0, enumC2579c);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objM67317e0);
                } catch (NumberFormatException unused) {
                    throw m91385V(objM67317e0, xl60.EnumC2579c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objM67317e0).longValueExact();
            }
        }
        m67316c0();
        return jLongValueExact;
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: s */
    public String mo51084s() {
        Map.Entry<?, ?> entry = (Map.Entry) m67317e0(Map.Entry.class, xl60.EnumC2579c.NAME);
        String strM67318g0 = m67318g0(entry);
        this.f166979g[this.f263038a - 1] = entry.getValue();
        this.f263040c[this.f263038a - 2] = strM67318g0;
        return strM67318g0;
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: t */
    public <T> T mo51085t() {
        m67317e0(Void.class, xl60.EnumC2579c.NULL);
        m67316c0();
        return null;
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: x */
    public gqa mo51086x() throws IOException {
        Object objM91381J = m91381J();
        npa npaVar = new npa();
        rm60 rm60VarM75901x = rm60.m75901x(npaVar);
        try {
            rm60VarM75901x.m75913r(objM91381J);
            rm60VarM75901x.close();
            return npaVar;
        } catch (Throwable th) {
            if (rm60VarM75901x != null) {
                try {
                    rm60VarM75901x.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p204p.xl60
    /* JADX INFO: renamed from: y */
    public String mo51087y() {
        int i = this.f263038a;
        Object obj = i != 0 ? this.f166979g[i - 1] : null;
        if (obj instanceof String) {
            m67316c0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            m67316c0();
            return obj.toString();
        }
        if (obj == f166978h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m91385V(obj, xl60.EnumC2579c.STRING);
    }

    public om60(om60 om60Var) {
        super(om60Var);
        this.f166979g = (Object[]) om60Var.f166979g.clone();
        for (int i = 0; i < this.f263038a; i++) {
            Object[] objArr = this.f166979g;
            Object obj = objArr[i];
            if (obj instanceof C2220a) {
                objArr[i] = ((C2220a) obj).clone();
            }
        }
    }
}
