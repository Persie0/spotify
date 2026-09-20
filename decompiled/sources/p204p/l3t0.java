package p204p;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class l3t0 implements bmk0 {

    /* JADX INFO: renamed from: f */
    public static final Charset f129430f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final guy f129431g = new guy("key", ei6.m39075l(ei6.m39074k(d3t0.class, new yn6(1))));

    /* JADX INFO: renamed from: h */
    public static final guy f129432h = new guy("value", ei6.m39075l(ei6.m39074k(d3t0.class, new yn6(2))));

    /* JADX INFO: renamed from: i */
    public static final k3t0 f129433i = new k3t0(0);

    /* JADX INFO: renamed from: a */
    public OutputStream f129434a;

    /* JADX INFO: renamed from: b */
    public final HashMap f129435b;

    /* JADX INFO: renamed from: c */
    public final HashMap f129436c;

    /* JADX INFO: renamed from: d */
    public final amk0 f129437d;

    /* JADX INFO: renamed from: e */
    public final p3t0 f129438e = new p3t0(this, 0);

    public l3t0(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, amk0 amk0Var) {
        this.f129434a = byteArrayOutputStream;
        this.f129435b = map;
        this.f129436c = map2;
        this.f129437d = amk0Var;
    }

    /* JADX INFO: renamed from: j */
    public static int m58021j(guy guyVar) {
        d3t0 d3t0Var = (d3t0) guyVar.m45793a(d3t0.class);
        if (d3t0Var != null) {
            return ((yn6) d3t0Var).f274400a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: a */
    public final bmk0 mo29864a(guy guyVar, Object obj) {
        m58024h(guyVar, obj, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: b */
    public final bmk0 mo29865b(guy guyVar, double d) throws IOException {
        m58022f(guyVar, d, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: c */
    public final bmk0 mo29866c(guy guyVar, int i) {
        m58023g(guyVar, i, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: d */
    public final bmk0 mo29867d(guy guyVar, boolean z) {
        m58023g(guyVar, z ? 1 : 0, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: e */
    public final bmk0 mo29868e(guy guyVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        d3t0 d3t0Var = (d3t0) guyVar.m45793a(d3t0.class);
        if (d3t0Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m58026k(((yn6) d3t0Var).f274400a << 3);
        m58027l(j);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m58022f(guy guyVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m58026k((m58021j(guyVar) << 3) | 1);
        this.f129434a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: g */
    public final void m58023g(guy guyVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        d3t0 d3t0Var = (d3t0) guyVar.m45793a(d3t0.class);
        if (d3t0Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m58026k(((yn6) d3t0Var).f274400a << 3);
        m58026k(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m58024h(guy guyVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m58026k((m58021j(guyVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f129430f);
            m58026k(bytes.length);
            this.f129434a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m58024h(guyVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m58025i(f129433i, guyVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m58022f(guyVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m58026k((m58021j(guyVar) << 3) | 5);
            this.f129434a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            d3t0 d3t0Var = (d3t0) guyVar.m45793a(d3t0.class);
            if (d3t0Var == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            m58026k(((yn6) d3t0Var).f274400a << 3);
            m58027l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m58023g(guyVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m58026k((m58021j(guyVar) << 3) | 2);
            m58026k(bArr.length);
            this.f129434a.write(bArr);
            return;
        }
        amk0 amk0Var = (amk0) this.f129435b.get(obj.getClass());
        if (amk0Var != null) {
            m58025i(amk0Var, guyVar, obj, z);
            return;
        }
        l3b1 l3b1Var = (l3b1) this.f129436c.get(obj.getClass());
        if (l3b1Var != null) {
            p3t0 p3t0Var = this.f129438e;
            p3t0Var.f173720b = false;
            p3t0Var.f173722d = guyVar;
            p3t0Var.f173721c = z;
            l3b1Var.mo24360a(obj, p3t0Var);
            return;
        }
        if (obj instanceof h2t0) {
            m58023g(guyVar, ((h2t0) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            m58023g(guyVar, ((Enum) obj).ordinal(), true);
        } else {
            m58025i(this.f129437d, guyVar, obj, z);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m58025i(amk0 amk0Var, guy guyVar, Object obj, boolean z) throws IOException {
        t580 t580Var = new t580(0);
        t580Var.f217242b = 0L;
        try {
            OutputStream outputStream = this.f129434a;
            this.f129434a = t580Var;
            try {
                amk0Var.mo24360a(obj, this);
                this.f129434a = outputStream;
                long j = t580Var.f217242b;
                t580Var.close();
                if (z && j == 0) {
                    return;
                }
                m58026k((m58021j(guyVar) << 3) | 2);
                m58027l(j);
                amk0Var.mo24360a(obj, this);
            } catch (Throwable th) {
                this.f129434a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                t580Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m58026k(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f129434a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f129434a.write(i & 127);
    }

    /* JADX INFO: renamed from: l */
    public final void m58027l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f129434a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f129434a.write(((int) j) & 127);
    }
}
