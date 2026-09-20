package p204p;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class kuy {

    /* JADX INFO: renamed from: a */
    public final nv21 f126735a = nv21.m65712f();

    /* JADX INFO: renamed from: b */
    public boolean f126736b;

    /* JADX INFO: renamed from: c */
    public boolean f126737c;

    static {
        new kuy(0);
    }

    public kuy() {
    }

    /* JADX INFO: renamed from: c */
    public static int m57411c(vyd1 vyd1Var, int i, Object obj) {
        int iM84098M = uwe.m84098M(i);
        if (vyd1Var == vyd1.f246079h) {
            iM84098M *= 2;
        }
        return m57412d(vyd1Var, obj) + iM84098M;
    }

    /* JADX INFO: renamed from: d */
    public static int m57412d(vyd1 vyd1Var, Object obj) {
        int size;
        int iM84099N;
        switch (vyd1Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = uwe.f234637i;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = uwe.f234637i;
                return 4;
            case 2:
                return uwe.m84100O(((Long) obj).longValue());
            case 3:
                return uwe.m84100O(((Long) obj).longValue());
            case 4:
                return uwe.m84100O(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = uwe.f234637i;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = uwe.f234637i;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = uwe.f234637i;
                return 1;
            case 8:
                if (!(obj instanceof gva)) {
                    return uwe.m84097L((String) obj);
                }
                Logger logger6 = uwe.f234637i;
                size = ((gva) obj).size();
                iM84099N = uwe.m84099N(size);
                break;
                break;
            case 9:
                return ((pre0) obj).getSerializedSize();
            case 10:
                Logger logger7 = uwe.f234637i;
                size = ((pre0) obj).getSerializedSize();
                iM84099N = uwe.m84099N(size);
                break;
            case 11:
                if (!(obj instanceof gva)) {
                    Logger logger8 = uwe.f234637i;
                    size = ((byte[]) obj).length;
                    iM84099N = uwe.m84099N(size);
                } else {
                    Logger logger9 = uwe.f234637i;
                    size = ((gva) obj).size();
                    iM84099N = uwe.m84099N(size);
                }
                break;
            case 12:
                return uwe.m84099N(((Integer) obj).intValue());
            case 13:
                return obj instanceof od50 ? uwe.m84100O(((od50) obj).getNumber()) : uwe.m84100O(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = uwe.f234637i;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = uwe.f234637i;
                return 8;
            case 16:
                return uwe.m84095J(((Integer) obj).intValue());
            case 17:
                return uwe.m84096K(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM84099N + size;
    }

    /* JADX INFO: renamed from: e */
    public static int m57413e(w110 w110Var, Object obj) {
        vyd1 vyd1Var = w110Var.f246925c;
        int i = w110Var.f246924b;
        if (!w110Var.f246926d) {
            return m57411c(vyd1Var, i, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!w110Var.f246927e) {
            int iM57411c = 0;
            while (i2 < size) {
                iM57411c += m57411c(vyd1Var, i, list.get(i2));
                i2++;
            }
            return iM57411c;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iM57412d = 0;
        while (i2 < size) {
            iM57412d += m57412d(vyd1Var, list.get(i2));
            i2++;
        }
        return uwe.m84099N(iM57412d) + uwe.m84098M(i) + iM57412d;
    }

    /* JADX INFO: renamed from: g */
    public static int m57414g(Map.Entry entry) {
        w110 w110Var = (w110) entry.getKey();
        Object value = entry.getValue();
        if (w110Var.f246925c.f246082a != yyd1.f277491i || w110Var.f246926d || w110Var.f246927e) {
            return m57413e(w110Var, value);
        }
        int i = ((w110) entry.getKey()).f246924b;
        int iM84099N = uwe.m84099N(i) + uwe.m84098M(2) + (uwe.m84098M(1) * 2);
        int iM84098M = uwe.m84098M(3);
        int serializedSize = ((pre0) value).getSerializedSize();
        return uwe.m84099N(serializedSize) + serializedSize + iM84098M + iM84099N;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m57415i(Map.Entry entry) {
        w110 w110Var = (w110) entry.getKey();
        if (w110Var.f246925c.f246082a != yyd1.f277491i) {
            return true;
        }
        if (!w110Var.f246926d) {
            Object value = entry.getValue();
            if (value instanceof sre0) {
                return ((sre0) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(obj instanceof sre0)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((sre0) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static void m57416n(w110 w110Var, Object obj) {
        vyd1 vyd1Var = w110Var.f246925c;
        Charset charset = ee50.f58680a;
        obj.getClass();
        boolean z = true;
        switch (vyd1Var.f246082a.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof gva) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case 7:
                if (!(obj instanceof Integer) && !(obj instanceof od50)) {
                    z = false;
                }
                break;
            case 8:
                if (!(obj instanceof pre0)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(w110Var.f246924b), w110Var.f246925c.f246082a, obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m57417o(uwe uweVar, vyd1 vyd1Var, int i, Object obj) {
        if (vyd1Var == vyd1.f246079h) {
            uweVar.mo74071g0(i, 3);
            ((pre0) obj).writeTo(uweVar);
            uweVar.mo74071g0(i, 4);
        }
        uweVar.mo74071g0(i, vyd1Var.f246083b);
        switch (vyd1Var.ordinal()) {
            case 0:
                uweVar.mo74063Y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                uweVar.mo74061W(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                uweVar.mo74075k0(((Long) obj).longValue());
                break;
            case 3:
                uweVar.mo74075k0(((Long) obj).longValue());
                break;
            case 4:
                uweVar.mo74065a0(((Integer) obj).intValue());
                break;
            case 5:
                uweVar.mo74063Y(((Long) obj).longValue());
                break;
            case 6:
                uweVar.mo74061W(((Integer) obj).intValue());
                break;
            case 7:
                uweVar.mo74055Q(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof gva)) {
                    uweVar.mo74070f0((String) obj);
                } else {
                    uweVar.mo74059U((gva) obj);
                }
                break;
            case 9:
                ((pre0) obj).writeTo(uweVar);
                break;
            case 10:
                uweVar.mo74066b0((pre0) obj);
                break;
            case 11:
                if (!(obj instanceof gva)) {
                    byte[] bArr = (byte[]) obj;
                    uweVar.mo74057S(bArr, bArr.length);
                } else {
                    uweVar.mo74059U((gva) obj);
                }
                break;
            case 12:
                uweVar.mo74073i0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof od50)) {
                    uweVar.mo74065a0(((Integer) obj).intValue());
                } else {
                    uweVar.mo74065a0(((od50) obj).getNumber());
                }
                break;
            case 14:
                uweVar.mo74061W(((Integer) obj).intValue());
                break;
            case 15:
                uweVar.mo74063Y(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                uweVar.mo74073i0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                uweVar.mo74075k0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m57418a(w110 w110Var, Object obj) {
        List arrayList;
        if (!w110Var.f246926d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m57416n(w110Var, obj);
        Object objM57420f = m57420f(w110Var);
        if (objM57420f == null) {
            arrayList = new ArrayList();
            this.f126735a.put(w110Var, arrayList);
        } else {
            arrayList = (List) objM57420f;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kuy clone() {
        kuy kuyVar = new kuy();
        nv21 nv21Var = this.f126735a;
        int i = nv21Var.f158769b;
        for (int i2 = 0; i2 < i; i2++) {
            tv21 tv21VarM65715c = nv21Var.m65715c(i2);
            kuyVar.m57425m((w110) tv21VarM65715c.f224032a, tv21VarM65715c.f224033b);
        }
        for (Map.Entry entry : nv21Var.m65716d()) {
            kuyVar.m57425m((w110) entry.getKey(), entry.getValue());
        }
        kuyVar.f126737c = this.f126737c;
        return kuyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kuy) {
            return this.f126735a.equals(((kuy) obj).f126735a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m57420f(w110 w110Var) {
        Object obj = this.f126735a.get(w110Var);
        return obj instanceof ds70 ? ((ds70) obj).m36753a() : obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m57421h() {
        nv21 nv21Var = this.f126735a;
        int i = nv21Var.f158769b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m57415i(nv21Var.m65715c(i2))) {
                return false;
            }
        }
        Iterator it = nv21Var.m65716d().iterator();
        while (it.hasNext()) {
            if (!m57415i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f126735a.hashCode();
    }

    /* JADX INFO: renamed from: j */
    public final Iterator m57422j() {
        nv21 nv21Var = this.f126735a;
        if (nv21Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f126737c ? new cs70(((xv21) nv21Var.entrySet()).iterator()) : ((xv21) nv21Var.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: k */
    public final void m57423k() {
        if (this.f126736b) {
            return;
        }
        nv21 nv21Var = this.f126735a;
        int i = nv21Var.f158769b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = nv21Var.m65715c(i2).f224033b;
            if (obj instanceof AbstractC0269h) {
                ((AbstractC0269h) obj).makeImmutable();
            }
        }
        Iterator it = nv21Var.m65716d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC0269h) {
                ((AbstractC0269h) value).makeImmutable();
            }
        }
        if (!nv21Var.f158771d) {
            for (int i3 = 0; i3 < nv21Var.f158769b; i3++) {
                tv21 tv21VarM65715c = nv21Var.m65715c(i3);
                if (((w110) tv21VarM65715c.f224032a).f246926d) {
                    tv21VarM65715c.setValue(Collections.unmodifiableList((List) tv21VarM65715c.f224033b));
                }
            }
            for (Map.Entry entry : nv21Var.m65716d()) {
                if (((w110) entry.getKey()).f246926d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!nv21Var.f158771d) {
            nv21Var.f158770c = nv21Var.f158770c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(nv21Var.f158770c);
            nv21Var.f158773f = nv21Var.f158773f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(nv21Var.f158773f);
            nv21Var.f158771d = true;
        }
        this.f126736b = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m57424l(Map.Entry entry) {
        w110 w110Var = (w110) entry.getKey();
        Object value = entry.getValue();
        boolean z = w110Var.f246926d;
        nv21 nv21Var = this.f126735a;
        if (z) {
            Object objM57420f = m57420f(w110Var);
            List list = (List) value;
            int size = list.size();
            if (objM57420f == null) {
                objM57420f = new ArrayList(size);
            }
            List list2 = (List) objM57420f;
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list2.add(obj);
            }
            nv21Var.put(w110Var, objM57420f);
            return;
        }
        if (w110Var.f246925c.f246082a != yyd1.f277491i) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            nv21Var.put(w110Var, value);
            return;
        }
        Object objM57420f2 = m57420f(w110Var);
        if (objM57420f2 != null) {
            nv21Var.put(w110Var, ((AbstractC0268g) ((pre0) objM57420f2).toBuilder()).mergeFrom((AbstractC0269h) ((pre0) value)).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        nv21Var.put(w110Var, value);
    }

    /* JADX INFO: renamed from: m */
    public final void m57425m(w110 w110Var, Object obj) {
        if (!w110Var.f246926d) {
            m57416n(w110Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                m57416n(w110Var, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f126735a.put(w110Var, obj);
    }

    public kuy(int i) {
        m57423k();
        m57423k();
    }
}
