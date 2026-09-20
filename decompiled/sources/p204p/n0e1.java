package p204p;

import android.content.Context;
import android.graphics.Color;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.work.impl.WorkDatabase;
import com.google.common.base.VerifyException;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.KotlinNullPointerException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0e1 {

    /* JADX INFO: renamed from: a */
    public static final char[] f149042a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final gey f149043b;

    /* JADX INFO: renamed from: c */
    public static final gey[] f149044c;

    /* JADX INFO: renamed from: d */
    public static sd40 f149045d;

    static {
        gey geyVar = new gey("auth_api_credentials_begin_sign_in", 4L);
        gey geyVar2 = new gey("auth_api_credentials_sign_out", 2L);
        gey geyVar3 = new gey("auth_api_credentials_authorize", 1L);
        gey geyVar4 = new gey("auth_api_credentials_revoke_access", 1L);
        gey geyVar5 = new gey("auth_api_credentials_save_password", 3L);
        gey geyVar6 = new gey("auth_api_credentials_get_sign_in_intent", 4L);
        gey geyVar7 = new gey("auth_api_credentials_save_account_linking_token", 2L);
        f149043b = geyVar7;
        f149044c = new gey[]{geyVar, geyVar2, geyVar3, geyVar4, geyVar5, geyVar6, geyVar7};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: A */
    public static final Serializable m63393A(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b != 14) {
            throw new IllegalStateException(s571.m77246e(b, "Unsupported type "));
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (wj50.m88271j(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    /* JADX INFO: renamed from: B */
    public static final byte[] m63394B(thj0 thj0Var) throws IOException {
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) thj0Var.f220445a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrM64691g = nkf1.m64691g(networkRequest);
                int[] iArrM64690f = nkf1.m64690f(networkRequest);
                objectOutputStream.writeInt(iArrM64691g.length);
                for (int i : iArrM64691g) {
                    objectOutputStream.writeInt(i);
                }
                objectOutputStream.writeInt(iArrM64690f.length);
                for (int i2 : iArrM64690f) {
                    objectOutputStream.writeInt(i2);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    m63430g(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                m63430g(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static final to8 m63395C(int i) {
        if (i == 0) {
            return to8.f222196a;
        }
        if (i == 1) {
            return to8.f222197b;
        }
        throw new IllegalArgumentException(edb.m38563l("Could not convert ", i, " to BackoffPolicy"));
    }

    /* JADX INFO: renamed from: D */
    public static final int m63396D(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(edb.m38563l("Could not convert ", i, " to NetworkType"));
        }
        return 6;
    }

    /* JADX INFO: renamed from: E */
    public static final int m63397E(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(edb.m38563l("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    /* JADX INFO: renamed from: F */
    public static final h0e1 m63398F(int i) {
        if (i == 0) {
            return h0e1.f86263a;
        }
        if (i == 1) {
            return h0e1.f86264b;
        }
        if (i == 2) {
            return h0e1.f86265c;
        }
        if (i == 3) {
            return h0e1.f86266d;
        }
        if (i == 4) {
            return h0e1.f86267e;
        }
        if (i == 5) {
            return h0e1.f86268f;
        }
        throw new IllegalArgumentException(edb.m38563l("Could not convert ", i, " to State"));
    }

    /* JADX INFO: renamed from: G */
    public static fg90 m63399G(ExecutorService executorService) {
        if (executorService instanceof fg90) {
            return (fg90) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new syh0((ScheduledExecutorService) executorService) : new pyh0(executorService);
    }

    /* JADX INFO: renamed from: H */
    public static final int m63400H(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return 0;
        }
        int i2 = 1;
        if (iM38547C != 1) {
            i2 = 2;
            if (iM38547C != 2) {
                i2 = 3;
                if (iM38547C != 3) {
                    i2 = 4;
                    if (iM38547C != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + dq60.m36599A(i) + " to int");
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: I */
    public static final void m63401I(ol60 ol60Var, String str, Object obj) {
        try {
            if (obj instanceof String) {
                ol60Var.m67278b(str, zk60.m96301c((String) obj));
                return;
            }
            if (obj instanceof Boolean) {
                ol60Var.m67278b(str, zk60.m96299a((Boolean) obj));
                return;
            }
            if (!(obj instanceof Number)) {
                if (obj != null) {
                    ol60Var.m67278b(str, zk60.m96301c(obj.toString()));
                    return;
                } else {
                    it40 it40Var = zk60.f283668a;
                    ol60Var.m67278b(str, kl60.INSTANCE);
                    return;
                }
            }
            double dDoubleValue = ((Number) obj).doubleValue();
            if (!Double.isNaN(dDoubleValue) && !Double.isInfinite(dDoubleValue)) {
                ol60Var.m67278b(str, zk60.m96300b((Number) obj));
                return;
            }
            throw new IllegalArgumentException(("Cannot represent " + obj + " as JSON").toString());
        } catch (Exception e) {
            Logger.m3967c(e, "Unable to create json data", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m63402J(b450 b450Var, w4u0 w4u0Var) {
        try {
            int i = b450Var.f278778a;
            if (b450Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + b450Var);
            }
            int i2 = b450Var.f278779b;
            if (i2 < Integer.MAX_VALUE) {
                return w4u0Var.mo41477h(i, i2 + 1);
            }
            return i > Integer.MIN_VALUE ? w4u0Var.mo41477h(i - 1, i2) + 1 : w4u0Var.mo29121f();
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: K */
    public static long m63403K(t2b0 t2b0Var) {
        v4u0 v4u0Var = w4u0.f247890a;
        try {
            long j = t2b0Var.f195112a;
            if (t2b0Var.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + t2b0Var);
            }
            long j2 = t2b0Var.f195113b;
            if (j2 < Long.MAX_VALUE) {
                return w4u0.f247891b.mo41479k(j, j2 + 1);
            }
            if (j <= Long.MIN_VALUE) {
                return w4u0.f247891b.mo84666i();
            }
            return w4u0.f247891b.mo41479k(j - 1, j2) + 1;
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: L */
    public static ete m63404L(float f, float f2) {
        return new ete(f, f2);
    }

    /* JADX INFO: renamed from: M */
    public static Executor m63405M(Executor executor, inz inzVar) {
        executor.getClass();
        return executor == ckr.f39074a ? executor : new ie60(executor, inzVar, 1);
    }

    /* JADX INFO: renamed from: N */
    public static z350 m63406N(b450 b450Var) {
        return g0g1.m43304i(b450Var.f278779b, b450Var.f278778a, -b450Var.f278780c);
    }

    /* JADX INFO: renamed from: O */
    public static final MaybeCreate m63407O(juk jukVar, th00 th00Var) {
        if (jukVar.mo26595B(gk40.f80712X0) == null) {
            return new MaybeCreate(new w790(jukVar, th00Var, 2));
        }
        throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + jukVar).toString());
    }

    /* JADX INFO: renamed from: P */
    public static Set m63408P(Object obj) {
        return Collections.singleton(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static final byte[] m63409Q(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    y7j y7jVar = (y7j) it.next();
                    objectOutputStream.writeUTF(y7jVar.m93000a().toString());
                    objectOutputStream.writeBoolean(y7jVar.m93001b());
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    m63430g(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                m63430g(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static final int m63410R(h0e1 h0e1Var) {
        int iOrdinal = h0e1Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: S */
    public static z350 m63411S(z350 z350Var, int i) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = z350Var.f278778a;
        int i3 = z350Var.f278779b;
        if (z350Var.f278780c <= 0) {
            i = -i;
        }
        return g0g1.m43304i(i2, i3, i);
    }

    /* JADX INFO: renamed from: T */
    public static byte[] m63412T(sco scoVar) {
        HashMap map = scoVar.f207773a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    m63413U(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    m63430g(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            int i = clo.f39324a;
            gaz.m44190b().getClass();
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m63413U(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + qpv0.f191387a.mo54112b(obj.getClass()).mo29111F());
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            jqv0 jqv0Var = qpv0.f191387a;
            up60 up60VarMo54112b = jqv0Var.mo54112b(cls);
            if (up60VarMo54112b.equals(jqv0Var.mo54112b(Boolean[].class))) {
                i = 8;
            } else if (up60VarMo54112b.equals(jqv0Var.mo54112b(Byte[].class))) {
                i = 9;
            } else if (up60VarMo54112b.equals(jqv0Var.mo54112b(Integer[].class))) {
                i = 10;
            } else if (up60VarMo54112b.equals(jqv0Var.mo54112b(Long[].class))) {
                i = 11;
            } else if (up60VarMo54112b.equals(jqv0Var.mo54112b(Float[].class))) {
                i = 12;
            } else if (up60VarMo54112b.equals(jqv0Var.mo54112b(Double[].class))) {
                i = 13;
            } else {
                if (!up60VarMo54112b.equals(jqv0Var.mo54112b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + jqv0Var.mo54112b(objArr.getClass()).mo29110D());
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    /* JADX INFO: renamed from: V */
    public static String m63414V(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = h0b1.f86200a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* JADX INFO: renamed from: W */
    public static String m63415W(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f149042a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: X */
    public static final thj0 m63416X(byte[] bArr) throws IOException {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new thj0(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                thj0 thj0VarM74602j = r35.m74602j(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return thj0VarM74602j;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    m63430g(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                m63430g(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public static b450 m63417Y(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new b450(i, i2 - 1, 1);
        }
        b450 b450Var = b450.f23226d;
        return j0g1.m52070G();
    }

    /* JADX INFO: renamed from: Z */
    public static t2b0 m63418Z(long j, long j2) {
        if (j2 > Long.MIN_VALUE) {
            return new t2b0(j, j2 - 1);
        }
        t2b0 t2b0Var = t2b0.f216475d;
        return ebg1.m38383l();
    }

    /* JADX INFO: renamed from: a */
    public static k000 m63419a(FontWeight fontWeight, h000... h000VarArr) {
        mbq mbqVar = new mbq(3);
        mbqVar.m61421b(m63426d0(fontWeight.f533a));
        float f = 0;
        if (0.0f > f || f > 1.0f) {
            nt40.m65597a("'ital' must be in 0.0f..1.0f. Actual: 0.0");
        }
        mbqVar.m61421b(new i000("ital", f));
        mbqVar.m61422c(h000VarArr);
        return new k000((h000[]) mbqVar.m61424e(new h000[mbqVar.m61423d()]));
    }

    /* JADX INFO: renamed from: a0 */
    public static final long m63420a0(long j, long j2) {
        int iM50237e;
        int iM50239g = ic71.m50239g(j);
        int iM50238f = ic71.m50238f(j);
        if ((ic71.m50239g(j2) < ic71.m50238f(j)) && (ic71.m50239g(j) < ic71.m50238f(j2))) {
            if (ic71.m50233a(j2, j)) {
                iM50239g = ic71.m50239g(j2);
                iM50238f = iM50239g;
            } else {
                if (ic71.m50233a(j, j2)) {
                    iM50237e = ic71.m50237e(j2);
                } else {
                    int iM50239g2 = ic71.m50239g(j2);
                    if (iM50239g >= ic71.m50238f(j2) || iM50239g2 > iM50239g) {
                        iM50238f = ic71.m50239g(j2);
                    } else {
                        iM50239g = ic71.m50239g(j2);
                        iM50237e = ic71.m50237e(j2);
                    }
                }
                iM50238f -= iM50237e;
            }
        } else if (iM50238f > ic71.m50239g(j2)) {
            iM50239g -= ic71.m50237e(j2);
            iM50237e = ic71.m50237e(j2);
            iM50238f -= iM50237e;
        }
        return dvg1.m37112n(iM50239g, iM50238f);
    }

    /* JADX INFO: renamed from: b */
    public static final void m63421b(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m63422b0(boolean z, String str, Object obj) {
        if (!z) {
            throw new VerifyException(vie1.m85638t(str, obj));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m63423c(u790 u790Var, ibk ibkVar) {
        try {
            if (u790Var.isDone()) {
                return AbstractC2156n9.m63865i(u790Var);
            }
            hqb hqbVar = new hqb(1, seg1.m77914f(ibkVar));
            u790Var.mo28322a(new vod0(27, u790Var, hqbVar), akr.f16626a);
            hqbVar.mo42415l(new t690(u790Var, 4));
            return hqbVar.m48221p();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            wj50.m88253R(kotlinNullPointerException, wj50.class.getName());
            throw kotlinNullPointerException;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m63424c0(Object obj) {
        Object[] objArr = new Object[0];
        if (obj == null) {
            throw new VerifyException(vie1.m85638t("expected a non-null reference", objArr));
        }
    }

    /* JADX INFO: renamed from: d */
    public static x401 m63425d(Set set) {
        x401 x401Var = (x401) set;
        x401Var.f257925a.m61540b();
        return x401Var.f257925a.f142675i > 0 ? x401Var : x401.f257924b;
    }

    /* JADX INFO: renamed from: d0 */
    public static j000 m63426d0(int i) {
        if (1 > i || i >= 1001) {
            nt40.m65597a("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        return new j000(i);
    }

    /* JADX INFO: renamed from: e */
    public static final LinkedHashSet m63427e(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashSet.add(new y7j(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        m63430g(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                m63430g(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static i000 m63428e0(float f) {
        if (f <= 0.0f) {
            nt40.m65597a("'wdth' must be strictly > 0.0f. Actual: " + f);
        }
        return new i000("wdth", f);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m63429f(vcn0[] vcn0VarArr, vcn0[] vcn0VarArr2) {
        if (vcn0VarArr == null || vcn0VarArr2 == null || vcn0VarArr.length != vcn0VarArr2.length) {
            return false;
        }
        for (int i = 0; i < vcn0VarArr.length; i++) {
            if (vcn0VarArr[i].f240168a != vcn0VarArr2[i].f240168a || vcn0VarArr[i].f240169b.length != vcn0VarArr2[i].f240169b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final void m63430g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                y85.m93061f(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m63431h(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: i */
    public static Comparable m63432i(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    /* JADX INFO: renamed from: j */
    public static float m63433j(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: k */
    public static Comparable m63434k(ybs ybsVar, ybs ybsVar2) {
        return ybsVar.compareTo(ybsVar2) > 0 ? ybsVar2 : ybsVar;
    }

    /* JADX INFO: renamed from: l */
    public static double m63435l(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    /* JADX INFO: renamed from: m */
    public static float m63436m(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* JADX INFO: renamed from: n */
    public static int m63437n(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: o */
    public static int m63438o(int i, fte fteVar) {
        if (fteVar instanceof ete) {
            return ((Number) m63442s(Integer.valueOf(i), (ete) fteVar)).intValue();
        }
        if (!fteVar.isEmpty()) {
            if (i < ((Number) fteVar.mo28071n()).intValue()) {
                return ((Number) fteVar.mo28071n()).intValue();
            }
            return i > ((Number) fteVar.mo28072o()).intValue() ? ((Number) fteVar.mo28072o()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fteVar + '.');
    }

    /* JADX INFO: renamed from: p */
    public static long m63439p(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbM77254m = s571.m77254m(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbM77254m.append(j2);
        sbM77254m.append('.');
        throw new IllegalArgumentException(sbM77254m.toString());
    }

    /* JADX INFO: renamed from: q */
    public static long m63440q(long j, t2b0 t2b0Var) {
        long j2 = t2b0Var.f195113b;
        long j3 = t2b0Var.f195112a;
        if (!t2b0Var.isEmpty()) {
            if (j < Long.valueOf(j3).longValue()) {
                return Long.valueOf(j3).longValue();
            }
            return j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + t2b0Var + '.');
    }

    /* JADX INFO: renamed from: r */
    public static Comparable m63441r(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: s */
    public static Comparable m63442s(Comparable comparable, ete eteVar) {
        float f = eteVar.f62692b;
        float f2 = eteVar.f62691a;
        if (eteVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eteVar + '.');
        }
        if (!ete.m39933a(comparable, Float.valueOf(f2)) || ete.m39933a(Float.valueOf(f2), comparable)) {
            return (!ete.m39933a(Float.valueOf(f), comparable) || ete.m39933a(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f);
        }
        return Float.valueOf(f2);
    }

    /* JADX INFO: renamed from: t */
    public static float[] m63443t(int i, float[] fArr) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: u */
    public static final void m63444u(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(edb.m38560i(i, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public static vcn0[] m63445v(String str) {
        int i;
        String strTrim;
        float[] fArrM63443t;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrM63443t = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrM63443t = m63443t(i5, fArr);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(s571.m77251j("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new vcn0(strTrim.charAt(i2), fArrM63443t));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrM63443t = new float[i2];
                } else {
                    fArrM63443t = new float[i2];
                }
                arrayList.add(new vcn0(strTrim.charAt(i2), fArrM63443t));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new vcn0(str.charAt(i3), new float[0]));
        }
        return (vcn0[]) arrayList.toArray(new vcn0[i]);
    }

    /* JADX INFO: renamed from: w */
    public static final l0e1 m63446w(Context context, dii diiVar) {
        o0e1 o0e1Var = new o0e1(diiVar.f49365c);
        WorkDatabase workDatabaseM42177f = fn1.m42177f(context.getApplicationContext(), o0e1Var.f160371a, diiVar.f49366d, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        ft81 ft81Var = new ft81(context.getApplicationContext(), o0e1Var);
        mir0 mir0Var = new mir0(context.getApplicationContext(), diiVar, o0e1Var, workDatabaseM42177f);
        return new l0e1(context.getApplicationContext(), diiVar, o0e1Var, workDatabaseM42177f, (List) m0e1.f138654h.mo27353c0(context, diiVar, o0e1Var, workDatabaseM42177f, ft81Var, mir0Var), mir0Var, ft81Var);
    }

    /* JADX INFO: renamed from: x */
    public static vcn0[] m63447x(vcn0[] vcn0VarArr) {
        vcn0[] vcn0VarArr2 = new vcn0[vcn0VarArr.length];
        for (int i = 0; i < vcn0VarArr.length; i++) {
            vcn0VarArr2[i] = new vcn0(vcn0VarArr[i]);
        }
        return vcn0VarArr2;
    }

    /* JADX INFO: renamed from: y */
    public static final Object m63448y(f9q0 f9q0Var, String str, ibk ibkVar) {
        Object objMo31798c = f9q0Var.mo31798c(str, new b771(12), ibkVar);
        return objMo31798c == yuk.f276404a ? objMo31798c : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m63449z(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        if (s != -21521) {
            throw new IllegalStateException(s571.m77246e(s, "Magic number doesn't match: ").toString());
        }
        short s2 = dataInputStream.readShort();
        if (s2 != 1) {
            throw new IllegalStateException(s571.m77246e(s2, "Unsupported version number: ").toString());
        }
    }
}
