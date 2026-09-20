package p204p;

import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rm60 implements Closeable, Flushable {

    /* JADX INFO: renamed from: e */
    String f200459e;

    /* JADX INFO: renamed from: f */
    boolean f200460f;

    /* JADX INFO: renamed from: g */
    boolean f200461g;

    /* JADX INFO: renamed from: h */
    boolean f200462h;

    /* JADX INFO: renamed from: a */
    int f200455a = 0;

    /* JADX INFO: renamed from: b */
    int[] f200456b = new int[32];

    /* JADX INFO: renamed from: c */
    String[] f200457c = new String[32];

    /* JADX INFO: renamed from: d */
    int[] f200458d = new int[32];

    /* JADX INFO: renamed from: i */
    int f200463i = -1;

    /* JADX INFO: renamed from: x */
    public static rm60 m75901x(fqa fqaVar) {
        return new km60(fqaVar);
    }

    /* JADX INFO: renamed from: B */
    public final void m75902B(int i) {
        int[] iArr = this.f200456b;
        int i2 = this.f200455a;
        this.f200455a = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX INFO: renamed from: D */
    public final void m75903D(int i) {
        this.f200456b[this.f200455a - 1] = i;
    }

    /* JADX INFO: renamed from: G */
    public void mo56883G(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f200459e = str;
    }

    /* JADX INFO: renamed from: I */
    public final void m75904I(boolean z) {
        this.f200460f = z;
    }

    /* JADX INFO: renamed from: J */
    public final void m75905J(boolean z) {
        this.f200461g = z;
    }

    /* JADX INFO: renamed from: K */
    public abstract rm60 mo56884K(double d);

    /* JADX INFO: renamed from: L */
    public abstract rm60 mo56885L(long j);

    /* JADX INFO: renamed from: M */
    public abstract rm60 mo56886M(Number number);

    /* JADX INFO: renamed from: N */
    public abstract rm60 mo56887N(String str);

    /* JADX INFO: renamed from: P */
    public abstract rm60 mo56888P(boolean z);

    /* JADX INFO: renamed from: Q */
    public abstract fqa mo56889Q();

    /* JADX INFO: renamed from: a */
    public abstract rm60 mo56890a();

    /* JADX INFO: renamed from: c */
    public final int m75906c() {
        int iM75914y = m75914y();
        if (iM75914y != 5 && iM75914y != 3 && iM75914y != 2 && iM75914y != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i = this.f200463i;
        this.f200463i = this.f200455a;
        return i;
    }

    /* JADX INFO: renamed from: e */
    public abstract rm60 mo56891e();

    /* JADX INFO: renamed from: f */
    public final boolean m75907f() {
        int i = this.f200455a;
        int[] iArr = this.f200456b;
        if (i != iArr.length) {
            return false;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + m75910n() + ": circular reference?");
        }
        this.f200456b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f200457c;
        this.f200457c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f200458d;
        this.f200458d = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (!(this instanceof qm60)) {
            return true;
        }
        qm60 qm60Var = (qm60) this;
        Object[] objArr = qm60Var.f190145t;
        qm60Var.f190145t = Arrays.copyOf(objArr, objArr.length * 2);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public abstract rm60 mo56892g();

    /* JADX INFO: renamed from: h */
    public final void m75908h(int i) {
        this.f200463i = i;
    }

    /* JADX INFO: renamed from: i */
    public abstract rm60 mo56893i();

    /* JADX INFO: renamed from: k */
    public final String m75909k() {
        String str = this.f200459e;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: n */
    public final String m75910n() {
        return zl60.m96359a(this.f200455a, this.f200456b, this.f200457c, this.f200458d);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m75911o() {
        return this.f200461g;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m75912p() {
        return this.f200460f;
    }

    /* JADX INFO: renamed from: r */
    public final rm60 m75913r(Object obj) {
        if (obj instanceof Map) {
            mo56891e();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new IllegalArgumentException(key == null ? "Map keys must be non-null" : "Map keys must be of type String: ".concat(key.getClass().getName()));
                }
                mo56894s((String) key);
                m75913r(entry.getValue());
            }
            mo56893i();
            return this;
        }
        if (obj instanceof List) {
            mo56890a();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m75913r(it.next());
            }
            mo56892g();
            return this;
        }
        if (obj instanceof String) {
            mo56887N((String) obj);
            return this;
        }
        if (obj instanceof Boolean) {
            mo56888P(((Boolean) obj).booleanValue());
            return this;
        }
        if (obj instanceof Double) {
            mo56884K(((Double) obj).doubleValue());
            return this;
        }
        if (obj instanceof Long) {
            mo56885L(((Long) obj).longValue());
            return this;
        }
        if (obj instanceof Number) {
            mo56886M((Number) obj);
            return this;
        }
        if (obj != null) {
            throw new IllegalArgumentException("Unsupported type: ".concat(obj.getClass().getName()));
        }
        mo56895t();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public abstract rm60 mo56894s(String str);

    /* JADX INFO: renamed from: t */
    public abstract rm60 mo56895t();

    /* JADX INFO: renamed from: y */
    public final int m75914y() {
        int i = this.f200455a;
        if (i != 0) {
            return this.f200456b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: z */
    public final void m75915z() {
        int iM75914y = m75914y();
        if (iM75914y != 5 && iM75914y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f200462h = true;
    }
}
