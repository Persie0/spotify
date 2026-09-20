package p204p;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sco {

    /* JADX INFO: renamed from: b */
    public static final sco f207772b;

    /* JADX INFO: renamed from: a */
    public final HashMap f207773a;

    static {
        sco scoVar = new sco(new LinkedHashMap());
        n0e1.m63412T(scoVar);
        f207772b = scoVar;
    }

    public sco(sco scoVar) {
        this.f207773a = new HashMap(scoVar.f207773a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: a */
    public static final sco m77812a(byte[] bArr) {
        boolean z;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bArr.length == 0) {
            return f207772b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            byte b = (byte) (-21267);
            int i = 0;
            if (bArr2[0] == ((byte) 16777132)) {
                z = true;
                if (bArr2[1] != b) {
                    z = false;
                }
            } else {
                z = false;
            }
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n0e1.m63430g(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    n0e1.m63449z(dataInputStream);
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), n0e1.m63393A(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        n0e1.m63430g(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException unused) {
            int i4 = clo.f39324a;
            gaz.m44190b().getClass();
        } catch (ClassNotFoundException unused2) {
            int i5 = clo.f39324a;
            gaz.m44190b().getClass();
        }
        return new sco(linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77813b(String str) {
        Object obj = Boolean.FALSE;
        Object obj2 = this.f207773a.get(str);
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final long m77814c(String str) {
        Object obj = this.f207773a.get(str);
        return ((Number) (obj instanceof Long ? obj : 0L)).longValue();
    }

    /* JADX INFO: renamed from: d */
    public final String m77815d(String str) {
        Object obj = this.f207773a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final String[] m77816e(String str) {
        Object obj = this.f207773a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        cxl cxlVar = new cxl(obj);
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = cxlVar.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && sco.class.equals(obj.getClass())) {
                HashMap map = ((sco) obj).f207773a;
                HashMap map2 = this.f207773a;
                Set<String> setKeySet = map2.keySet();
                if (wj50.m88271j(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = bk5.m29623m0(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m77817f(String str) {
        Object obj = this.f207773a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f207773a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return dq60.m36616p(g6f.m43753y0(this.f207773a.entrySet(), null, null, null, zdm.f281763i, 31), "}", new StringBuilder("Data {"));
    }

    public sco(LinkedHashMap linkedHashMap) {
        this.f207773a = new HashMap(linkedHashMap);
    }
}
