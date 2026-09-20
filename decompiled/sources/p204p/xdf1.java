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
public final class xdf1 implements bmk0 {

    /* JADX INFO: renamed from: f */
    public static final Charset f260478f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final guy f260479g = new guy("key", ei6.m39075l(t3d1.m79996k(bcf1.class, new v8f1(1))));

    /* JADX INFO: renamed from: h */
    public static final guy f260480h = new guy("value", ei6.m39075l(t3d1.m79996k(bcf1.class, new v8f1(2))));

    /* JADX INFO: renamed from: i */
    public static final bdf1 f260481i = bdf1.f26093b;

    /* JADX INFO: renamed from: a */
    public OutputStream f260482a;

    /* JADX INFO: renamed from: b */
    public final HashMap f260483b;

    /* JADX INFO: renamed from: c */
    public final HashMap f260484c;

    /* JADX INFO: renamed from: d */
    public final amk0 f260485d;

    /* JADX INFO: renamed from: e */
    public final p3t0 f260486e = new p3t0(this, 1);

    public xdf1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, amk0 amk0Var) {
        this.f260482a = byteArrayOutputStream;
        this.f260483b = map;
        this.f260484c = map2;
        this.f260485d = amk0Var;
    }

    /* JADX INFO: renamed from: i */
    public static int m90412i(guy guyVar) {
        bcf1 bcf1Var = (bcf1) guyVar.m45793a(bcf1.class);
        if (bcf1Var != null) {
            return ((v8f1) bcf1Var).f238571a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: a */
    public final bmk0 mo29864a(guy guyVar, Object obj) {
        m90414g(guyVar, obj, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: b */
    public final bmk0 mo29865b(guy guyVar, double d) throws IOException {
        m90413f(guyVar, d, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bmk0 mo29866c(guy guyVar, int i) {
        m90415h(guyVar, i, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bmk0 mo29867d(guy guyVar, boolean z) {
        m90415h(guyVar, z ? 1 : 0, true);
        return this;
    }

    @Override // p204p.bmk0
    /* JADX INFO: renamed from: e */
    public final bmk0 mo29868e(guy guyVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        bcf1 bcf1Var = (bcf1) guyVar.m45793a(bcf1.class);
        if (bcf1Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m90417k(((v8f1) bcf1Var).f238571a << 3);
        m90418l(j);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m90413f(guy guyVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m90417k((m90412i(guyVar) << 3) | 1);
        this.f260482a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: g */
    public final void m90414g(guy guyVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m90417k((m90412i(guyVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f260478f);
            m90417k(bytes.length);
            this.f260482a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m90414g(guyVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m90416j(f260481i, guyVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m90413f(guyVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m90417k((m90412i(guyVar) << 3) | 5);
            this.f260482a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z && jLongValue == 0) {
                return;
            }
            bcf1 bcf1Var = (bcf1) guyVar.m45793a(bcf1.class);
            if (bcf1Var == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            m90417k(((v8f1) bcf1Var).f238571a << 3);
            m90418l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m90415h(guyVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m90417k((m90412i(guyVar) << 3) | 2);
            m90417k(bArr.length);
            this.f260482a.write(bArr);
            return;
        }
        amk0 amk0Var = (amk0) this.f260483b.get(obj.getClass());
        if (amk0Var != null) {
            m90416j(amk0Var, guyVar, obj, z);
            return;
        }
        l3b1 l3b1Var = (l3b1) this.f260484c.get(obj.getClass());
        if (l3b1Var != null) {
            p3t0 p3t0Var = this.f260486e;
            p3t0Var.f173720b = false;
            p3t0Var.f173722d = guyVar;
            p3t0Var.f173721c = z;
            l3b1Var.mo24360a(obj, p3t0Var);
            return;
        }
        if (obj instanceof taf1) {
            m90415h(guyVar, ((taf1) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m90415h(guyVar, ((Enum) obj).ordinal(), true);
        } else {
            m90416j(this.f260485d, guyVar, obj, z);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m90415h(guy guyVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        bcf1 bcf1Var = (bcf1) guyVar.m45793a(bcf1.class);
        if (bcf1Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        m90417k(((v8f1) bcf1Var).f238571a << 3);
        m90417k(i);
    }

    /* JADX INFO: renamed from: j */
    public final void m90416j(amk0 amk0Var, guy guyVar, Object obj, boolean z) throws IOException {
        t580 t580Var = new t580(1);
        t580Var.f217242b = 0L;
        try {
            OutputStream outputStream = this.f260482a;
            this.f260482a = t580Var;
            try {
                amk0Var.mo24360a(obj, this);
                this.f260482a = outputStream;
                long j = t580Var.f217242b;
                t580Var.close();
                if (z && j == 0) {
                    return;
                }
                m90417k((m90412i(guyVar) << 3) | 2);
                m90418l(j);
                amk0Var.mo24360a(obj, this);
            } catch (Throwable th) {
                this.f260482a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                t580Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m90417k(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f260482a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f260482a.write(i & 127);
    }

    /* JADX INFO: renamed from: l */
    public final void m90418l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f260482a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f260482a.write(((int) j) & 127);
    }
}
