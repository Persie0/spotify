package p204p;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class luy {

    /* JADX INFO: renamed from: c */
    public static final luy f137171c = new luy(0);

    /* JADX INFO: renamed from: a */
    public final ov21 f137172a = new ov21(16);

    /* JADX INFO: renamed from: b */
    public boolean f137173b;

    public luy() {
    }

    /* JADX INFO: renamed from: c */
    public static int m60033c(wyd1 wyd1Var, Object obj) {
        switch (wyd1Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return w780.m87324l(((Long) obj).longValue());
            case 3:
                return w780.m87324l(((Long) obj).longValue());
            case 4:
                return w780.m87320h(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return w780.m87323k(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((AbstractC2155n8) obj).mo24390a();
            case 10:
                return w780.m87322j((AbstractC2155n8) obj);
            case 11:
                if (obj instanceof hva) {
                    hva hvaVar = (hva) obj;
                    return hvaVar.size() + w780.m87323k(hvaVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return w780.m87323k(bArr.length) + bArr.length;
            case 12:
                return w780.m87323k(((Integer) obj).intValue());
            case 13:
                return obj instanceof pd50 ? w780.m87320h(((pd50) obj).getNumber()) : w780.m87320h(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return w780.m87323k((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return w780.m87324l((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m60034d(v110 v110Var, Object obj) {
        wyd1 wyd1Var = v110Var.f236218b;
        int i = v110Var.f236217a;
        if (!v110Var.f236219c) {
            int iM87325m = w780.m87325m(i);
            if (wyd1Var == wyd1.f256269e) {
                iM87325m *= 2;
            }
            return m60033c(wyd1Var, obj) + iM87325m;
        }
        int iM60033c = 0;
        for (Object obj2 : (List) obj) {
            int iM87325m2 = w780.m87325m(i);
            if (wyd1Var == wyd1.f256269e) {
                iM87325m2 *= 2;
            }
            iM60033c += m60033c(wyd1Var, obj2) + iM87325m2;
        }
        return iM60033c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m60035e(Map.Entry entry) {
        v110 v110Var = (v110) entry.getKey();
        if (v110Var.f236218b.f256273a != zyd1.MESSAGE) {
            return true;
        }
        if (!v110Var.f236219c) {
            Object value = entry.getValue();
            if (value instanceof AbstractC2155n8) {
                return ((AbstractC2155n8) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((AbstractC2155n8) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static Object m60036h(pwe pweVar, wyd1 wyd1Var) {
        switch (wyd1Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(pweVar.m71245k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(pweVar.m71244j()));
            case 2:
                return Long.valueOf(pweVar.m71247m());
            case 3:
                return Long.valueOf(pweVar.m71247m());
            case 4:
                return Integer.valueOf(pweVar.m71246l());
            case 5:
                return Long.valueOf(pweVar.m71245k());
            case 6:
                return Integer.valueOf(pweVar.m71244j());
            case 7:
                return Boolean.valueOf(pweVar.m71247m() != 0);
            case 8:
                int iM71246l = pweVar.m71246l();
                int i = pweVar.f181998b;
                int i2 = pweVar.f182000d;
                if (iM71246l > i - i2 || iM71246l <= 0) {
                    return iM71246l == 0 ? "" : new String(pweVar.m71243i(iM71246l), "UTF-8");
                }
                String str = new String(pweVar.f181997a, i2, iM71246l, "UTF-8");
                pweVar.f182000d += iM71246l;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return pweVar.m71240f();
            case 12:
                return Integer.valueOf(pweVar.m71246l());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(pweVar.m71244j());
            case 15:
                return Long.valueOf(pweVar.m71245k());
            case 16:
                int iM71246l2 = pweVar.m71246l();
                return Integer.valueOf((-(iM71246l2 & 1)) ^ (iM71246l2 >>> 1));
            case 17:
                long jM71247m = pweVar.m71247m();
                return Long.valueOf((-(jM71247m & 1)) ^ (jM71247m >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX INFO: renamed from: j */
    public static void m60037j(wyd1 wyd1Var, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (wyd1Var.f256273a) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof hva) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof pd50)) {
                    z = false;
                }
                z2 = z;
                break;
            case MESSAGE:
                z2 = obj instanceof AbstractC2155n8;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m60038k(w780 w780Var, wyd1 wyd1Var, Object obj) {
        switch (wyd1Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                w780Var.getClass();
                w780Var.m87352X(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                w780Var.getClass();
                w780Var.m87351W(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                w780Var.m87354Z(((Long) obj).longValue());
                break;
            case 3:
                w780Var.m87354Z(((Long) obj).longValue());
                break;
            case 4:
                w780Var.m87345Q(((Integer) obj).intValue());
                break;
            case 5:
                w780Var.m87352X(((Long) obj).longValue());
                break;
            case 6:
                w780Var.m87351W(((Integer) obj).intValue());
                break;
            case 7:
                w780Var.m87348T(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                w780Var.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                w780Var.m87353Y(bytes.length);
                w780Var.m87350V(bytes);
                break;
            case 9:
                w780Var.getClass();
                ((AbstractC2155n8) obj).mo24393d(w780Var);
                break;
            case 10:
                w780Var.m87347S((AbstractC2155n8) obj);
                break;
            case 11:
                if (!(obj instanceof hva)) {
                    byte[] bArr = (byte[]) obj;
                    w780Var.getClass();
                    w780Var.m87353Y(bArr.length);
                    w780Var.m87350V(bArr);
                } else {
                    hva hvaVar = (hva) obj;
                    w780Var.getClass();
                    w780Var.m87353Y(hvaVar.size());
                    w780Var.m87349U(hvaVar);
                }
                break;
            case 12:
                w780Var.m87353Y(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof pd50)) {
                    w780Var.m87345Q(((Integer) obj).intValue());
                } else {
                    w780Var.m87345Q(((pd50) obj).getNumber());
                }
                break;
            case 14:
                w780Var.m87351W(((Integer) obj).intValue());
                break;
            case 15:
                w780Var.m87352X(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                w780Var.m87353Y((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                w780Var.m87354Z((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m60039a(v110 v110Var, Object obj) {
        List arrayList;
        if (!v110Var.f236219c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m60037j(v110Var.f236218b, obj);
        ov21 ov21Var = this.f137172a;
        Object obj2 = ov21Var.get(v110Var);
        if (obj2 == null) {
            arrayList = new ArrayList();
            ov21Var.put(v110Var, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final luy clone() {
        ov21 ov21Var;
        luy luyVar = new luy();
        int i = 0;
        while (true) {
            ov21Var = this.f137172a;
            if (i >= ov21Var.f170407b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ov21Var.f170407b.get(i);
            luyVar.m60043i((v110) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : ov21Var.m68112c()) {
            luyVar.m60043i((v110) entry2.getKey(), entry2.getValue());
        }
        return luyVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m60041f() {
        if (this.f137173b) {
            return;
        }
        ov21 ov21Var = this.f137172a;
        if (!ov21Var.f170409d) {
            for (int i = 0; i < ov21Var.f170407b.size(); i++) {
                Map.Entry entry = (Map.Entry) ov21Var.f170407b.get(i);
                if (((v110) entry.getKey()).f236219c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : ov21Var.m68112c()) {
                if (((v110) entry2.getKey()).f236219c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!ov21Var.f170409d) {
            ov21Var.f170408c = ov21Var.f170408c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ov21Var.f170408c);
            ov21Var.f170409d = true;
        }
        this.f137173b = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m60042g(Map.Entry entry) {
        v110 v110Var = (v110) entry.getKey();
        Object value = entry.getValue();
        boolean z = v110Var.f236219c;
        ov21 ov21Var = this.f137172a;
        if (z) {
            Object arrayList = ov21Var.get(v110Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            ov21Var.put(v110Var, arrayList);
            return;
        }
        if (v110Var.f236218b.f256273a != zyd1.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            ov21Var.put(v110Var, value);
            return;
        }
        Object obj2 = ov21Var.get(v110Var);
        if (obj2 != null) {
            ov21Var.put(v110Var, ((AbstractC2155n8) obj2).mo24392c().mo26647d((a210) ((AbstractC2155n8) value)).mo26645b());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        ov21Var.put(v110Var, value);
    }

    /* JADX INFO: renamed from: i */
    public final void m60043i(v110 v110Var, Object obj) {
        boolean z = v110Var.f236219c;
        wyd1 wyd1Var = v110Var.f236218b;
        if (!z) {
            m60037j(wyd1Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m60037j(wyd1Var, it.next());
            }
            obj = arrayList;
        }
        this.f137172a.put(v110Var, obj);
    }

    public luy(int i) {
        m60041f();
    }
}
