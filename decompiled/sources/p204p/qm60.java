package p204p;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
final class qm60 extends rm60 {

    /* JADX INFO: renamed from: X */
    private String f190144X;

    /* JADX INFO: renamed from: t */
    Object[] f190145t = new Object[32];

    /* JADX INFO: renamed from: p.qm60$a */
    public class C2299a extends u400 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ npa f190146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2299a(ai21 ai21Var, npa npaVar) {
            super(ai21Var);
            this.f190146b = npaVar;
        }

        @Override // p204p.u400, p204p.ai21, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (qm60.this.m75914y() == 9) {
                qm60 qm60Var = qm60.this;
                Object[] objArr = qm60Var.f190145t;
                int i = qm60Var.f200455a;
                if (objArr[i] == null) {
                    qm60Var.f200455a = i - 1;
                    Object objM91381J = xl60.m91379z(this.f190146b).m91381J();
                    qm60 qm60Var2 = qm60.this;
                    boolean z = qm60Var2.f200461g;
                    qm60Var2.f200461g = true;
                    try {
                        qm60Var2.m73267V(objM91381J);
                        qm60 qm60Var3 = qm60.this;
                        qm60Var3.f200461g = z;
                        int[] iArr = qm60Var3.f200458d;
                        int i2 = qm60Var3.f200455a - 1;
                        iArr[i2] = iArr[i2] + 1;
                        return;
                    } catch (Throwable th) {
                        qm60.this.f200461g = z;
                        throw th;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public qm60() {
        m75902B(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public qm60 m73267V(Object obj) {
        String str;
        Object objPut;
        int iM75914y = m75914y();
        int i = this.f200455a;
        if (i == 1) {
            if (iM75914y != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f200456b[i - 1] = 7;
            this.f190145t[i - 1] = obj;
            return this;
        }
        if (iM75914y != 3 || (str = this.f190144X) == null) {
            if (iM75914y == 1) {
                ((List) this.f190145t[i - 1]).add(obj);
                return this;
            }
            if (iM75914y == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f200461g) || (objPut = ((Map) this.f190145t[i - 1]).put(str, obj)) == null) {
            this.f190144X = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f190144X + "' has multiple values at path " + m75910n() + ": " + objPut + " and " + obj);
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: K */
    public rm60 mo56884K(double d) {
        if (!this.f200460f && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(Double.toString(d));
        }
        m73267V(Double.valueOf(d));
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: L */
    public rm60 mo56885L(long j) {
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(Long.toString(j));
        }
        m73267V(Long.valueOf(j));
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: M */
    public rm60 mo56886M(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo56885L(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo56884K(number.doubleValue());
        }
        if (number == null) {
            return mo56895t();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(bigDecimal.toString());
        }
        m73267V(bigDecimal);
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: N */
    public rm60 mo56887N(String str) {
        if (this.f200462h) {
            this.f200462h = false;
            return mo56894s(str);
        }
        m73267V(str);
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: P */
    public rm60 mo56888P(boolean z) {
        if (this.f200462h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m75910n());
        }
        m73267V(Boolean.valueOf(z));
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: Q */
    public fqa mo56889Q() {
        if (this.f200462h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + m75910n());
        }
        if (m75914y() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        m75902B(9);
        npa npaVar = new npa();
        return new tuu0(new C2299a(npaVar, npaVar));
    }

    /* JADX INFO: renamed from: X */
    public Object m73268X() {
        int i = this.f200455a;
        if (i > 1 || (i == 1 && this.f200456b[i - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f190145t[0];
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: a */
    public rm60 mo56890a() {
        if (this.f200462h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m75910n());
        }
        int i = this.f200455a;
        int i2 = this.f200463i;
        if (i == i2 && this.f200456b[i - 1] == 1) {
            this.f200463i = ~i2;
            return this;
        }
        m75907f();
        ArrayList arrayList = new ArrayList();
        m73267V(arrayList);
        Object[] objArr = this.f190145t;
        int i3 = this.f200455a;
        objArr[i3] = arrayList;
        this.f200458d[i3] = 0;
        m75902B(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.f200455a;
        if (i > 1 || (i == 1 && this.f200456b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f200455a = 0;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: e */
    public rm60 mo56891e() {
        if (this.f200462h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m75910n());
        }
        int i = this.f200455a;
        int i2 = this.f200463i;
        if (i == i2 && this.f200456b[i - 1] == 3) {
            this.f200463i = ~i2;
            return this;
        }
        m75907f();
        qn80 qn80Var = new qn80();
        m73267V(qn80Var);
        this.f190145t[this.f200455a] = qn80Var;
        m75902B(3);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f200455a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: g */
    public rm60 mo56892g() {
        if (m75914y() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.f200455a;
        int i2 = this.f200463i;
        if (i == (~i2)) {
            this.f200463i = ~i2;
            return this;
        }
        int i3 = i - 1;
        this.f200455a = i3;
        this.f190145t[i3] = null;
        int[] iArr = this.f200458d;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: i */
    public rm60 mo56893i() {
        if (m75914y() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f190144X != null) {
            throw new IllegalStateException("Dangling name: " + this.f190144X);
        }
        int i = this.f200455a;
        int i2 = this.f200463i;
        if (i == (~i2)) {
            this.f200463i = ~i2;
            return this;
        }
        this.f200462h = false;
        int i3 = i - 1;
        this.f200455a = i3;
        this.f190145t[i3] = null;
        this.f200457c[i3] = null;
        int[] iArr = this.f200458d;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: s */
    public rm60 mo56894s(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f200455a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (m75914y() != 3 || this.f190144X != null || this.f200462h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f190144X = str;
        this.f200457c[this.f200455a - 1] = str;
        return this;
    }

    @Override // p204p.rm60
    /* JADX INFO: renamed from: t */
    public rm60 mo56895t() {
        if (this.f200462h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m75910n());
        }
        m73267V(null);
        int[] iArr = this.f200458d;
        int i = this.f200455a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
