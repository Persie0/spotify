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
public final class erf1 implements bmk0 {

    /* JADX INFO: renamed from: f */
    public static final Charset f62118f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final guy f62119g = new guy("key", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(1))));

    /* JADX INFO: renamed from: h */
    public static final guy f62120h = new guy("value", ei6.m39075l(ilf1.m51017e(xqf1.class, new iqf1(2))));

    /* JADX INFO: renamed from: i */
    public static final bdf1 f62121i = new bdf1(2);

    /* JADX INFO: renamed from: a */
    public OutputStream f62122a;

    /* JADX INFO: renamed from: b */
    public final HashMap f62123b;

    /* JADX INFO: renamed from: c */
    public final HashMap f62124c;

    /* JADX INFO: renamed from: d */
    public final amk0 f62125d;

    /* JADX INFO: renamed from: e */
    public final p3t0 f62126e = new p3t0(this, 2);

    public erf1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, amk0 amk0Var) {
        this.f62122a = byteArrayOutputStream;
        this.f62123b = map;
        this.f62124c = map2;
        this.f62125d = amk0Var;
    }

    /* JADX INFO: renamed from: i */
    public static int m39775i(guy guyVar) {
        xqf1 xqf1Var = (xqf1) guyVar.m45793a(xqf1.class);
        if (xqf1Var != null) {
            return ((iqf1) xqf1Var).f104759a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: a */
    public final bmk0 mo29864a(guy guyVar, Object obj) {
        m39777g(guyVar, obj, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: b */
    public final bmk0 mo29865b(guy guyVar, double d) throws IOException {
        m39776f(guyVar, d, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bmk0 mo29866c(guy guyVar, int i) {
        m39778h(guyVar, i, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bmk0 mo29867d(guy guyVar, boolean z) {
        m39778h(guyVar, z ? 1 : 0, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: e */
    public final bmk0 mo29868e(guy guyVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        xqf1 xqf1Var = (xqf1) guyVar.m45793a(xqf1.class);
        if (xqf1Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m39780k(((iqf1) xqf1Var).f104759a << 3);
        m39781l(j);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m39776f(guy guyVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m39780k((m39775i(guyVar) << 3) | 1);
        this.f62122a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: g */
    public final void m39777g(guy guyVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m39780k((m39775i(guyVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f62118f);
            m39780k(bytes.length);
            this.f62122a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m39777g(guyVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m39779j(f62121i, guyVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m39776f(guyVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m39780k((m39775i(guyVar) << 3) | 5);
            this.f62122a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            xqf1 xqf1Var = (xqf1) guyVar.m45793a(xqf1.class);
            if (xqf1Var == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            m39780k(((iqf1) xqf1Var).f104759a << 3);
            m39781l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m39778h(guyVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m39780k((m39775i(guyVar) << 3) | 2);
            m39780k(bArr.length);
            this.f62122a.write(bArr);
            return;
        }
        amk0 amk0Var = (amk0) this.f62123b.get(obj.getClass());
        if (amk0Var != null) {
            m39779j(amk0Var, guyVar, obj, z);
            return;
        }
        l3b1 l3b1Var = (l3b1) this.f62124c.get(obj.getClass());
        if (l3b1Var != null) {
            p3t0 p3t0Var = this.f62126e;
            p3t0Var.f173720b = false;
            p3t0Var.f173722d = guyVar;
            p3t0Var.f173721c = z;
            l3b1Var.mo24360a(obj, p3t0Var);
            return;
        }
        if (obj instanceof qqf1) {
            m39778h(guyVar, ((qqf1) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m39778h(guyVar, ((Enum) obj).ordinal(), true);
        } else {
            m39779j(this.f62125d, guyVar, obj, z);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39778h(guy guyVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        xqf1 xqf1Var = (xqf1) guyVar.m45793a(xqf1.class);
        if (xqf1Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m39780k(((iqf1) xqf1Var).f104759a << 3);
        m39780k(i);
    }

    /* JADX INFO: renamed from: j */
    public final void m39779j(amk0 amk0Var, guy guyVar, Object obj, boolean z) throws IOException {
        t580 t580Var = new t580(2);
        t580Var.f217242b = 0L;
        try {
            OutputStream outputStream = this.f62122a;
            this.f62122a = t580Var;
            try {
                amk0Var.mo24360a(obj, this);
                this.f62122a = outputStream;
                long j = t580Var.f217242b;
                t580Var.close();
                if (z && j == 0) {
                    return;
                }
                m39780k((m39775i(guyVar) << 3) | 2);
                m39781l(j);
                amk0Var.mo24360a(obj, this);
            } catch (Throwable th) {
                this.f62122a = outputStream;
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
    public final void m39780k(int i) throws IOException {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) == 0) {
                this.f62122a.write(i2);
                return;
            } else {
                this.f62122a.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m39781l(long j) throws IOException {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) == 0) {
                this.f62122a.write(i);
                return;
            } else {
                this.f62122a.write(i | 128);
                j >>>= 7;
            }
        }
    }
}
