package p204p;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nm60 implements bmk0, m3b1 {

    /* JADX INFO: renamed from: a */
    public final boolean f155306a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f155307b;

    /* JADX INFO: renamed from: c */
    public final Map f155308c;

    /* JADX INFO: renamed from: d */
    public final Map f155309d;

    /* JADX INFO: renamed from: e */
    public final amk0 f155310e;

    /* JADX INFO: renamed from: f */
    public final boolean f155311f;

    public nm60(Writer writer, Map map, Map map2, amk0 amk0Var, boolean z) {
        this.f155307b = new JsonWriter(writer);
        this.f155308c = map;
        this.f155309d = map2;
        this.f155310e = amk0Var;
        this.f155311f = z;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: a */
    public final bmk0 mo29864a(guy guyVar, Object obj) throws IOException {
        m64807i(obj, guyVar.f84571a);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: b */
    public final bmk0 mo29865b(guy guyVar, double d) throws IOException {
        String str = guyVar.f84571a;
        m64808j();
        JsonWriter jsonWriter = this.f155307b;
        jsonWriter.name(str);
        m64808j();
        jsonWriter.value(d);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: c */
    public final bmk0 mo29866c(guy guyVar, int i) throws IOException {
        String str = guyVar.f84571a;
        m64808j();
        JsonWriter jsonWriter = this.f155307b;
        jsonWriter.name(str);
        m64808j();
        jsonWriter.value(i);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: d */
    public final bmk0 mo29867d(guy guyVar, boolean z) throws IOException {
        String str = guyVar.f84571a;
        m64808j();
        JsonWriter jsonWriter = this.f155307b;
        jsonWriter.name(str);
        m64808j();
        jsonWriter.value(z);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: e */
    public final bmk0 mo29868e(guy guyVar, long j) throws IOException {
        String str = guyVar.f84571a;
        m64808j();
        JsonWriter jsonWriter = this.f155307b;
        jsonWriter.name(str);
        m64808j();
        jsonWriter.value(j);
        return this;
    }

    @Override // p204p.m3b1
    /* JADX INFO: renamed from: f */
    public final m3b1 mo60660f(String str) throws IOException {
        m64808j();
        this.f155307b.value(str);
        return this;
    }

    @Override // p204p.m3b1
    /* JADX INFO: renamed from: g */
    public final m3b1 mo60661g(boolean z) throws IOException {
        m64808j();
        this.f155307b.value(z);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final nm60 m64806h(Object obj) {
        JsonWriter jsonWriter = this.f155307b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m64806h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m64807i(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            amk0 amk0Var = (amk0) this.f155308c.get(obj.getClass());
            if (amk0Var != null) {
                jsonWriter.beginObject();
                amk0Var.mo24360a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            l3b1 l3b1Var = (l3b1) this.f155309d.get(obj.getClass());
            if (l3b1Var != null) {
                l3b1Var.mo24360a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f155310e.mo24360a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof slk0) {
                int number = ((slk0) obj).getNumber();
                m64808j();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            m64808j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            m64808j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                m64808j();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m64806h(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m64806h(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final nm60 m64807i(Object obj, String str) throws IOException {
        boolean z = this.f155311f;
        JsonWriter jsonWriter = this.f155307b;
        if (z) {
            if (obj == null) {
                return this;
            }
            m64808j();
            jsonWriter.name(str);
            m64806h(obj);
            return this;
        }
        m64808j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m64806h(obj);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m64808j() {
        if (!this.f155306a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
