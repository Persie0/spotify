package p204p;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x8y0 {

    /* JADX INFO: renamed from: f */
    public static final Class[] f259238f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f259239a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f259240b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f259241c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f259242d;

    /* JADX INFO: renamed from: e */
    public final e9y0 f259243e;

    public x8y0(HashMap map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f259239a = linkedHashMap;
        this.f259240b = new LinkedHashMap();
        this.f259241c = new LinkedHashMap();
        this.f259242d = new LinkedHashMap();
        this.f259243e = new wvf(this, 2);
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m90231a(x8y0 x8y0Var) {
        LinkedHashMap linkedHashMap = x8y0Var.f259239a;
        for (Map.Entry entry : kkc0.m56706s0(x8y0Var.f259240b).entrySet()) {
            x8y0Var.m90234d(((e9y0) entry.getValue()).mo25168f(), (String) entry.getKey());
        }
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return pp91.m70529j(pft0.m69840u("keys", arrayList), pft0.m69840u("values", arrayList2));
    }

    /* JADX INFO: renamed from: b */
    public final Object m90232b(String str) {
        LinkedHashMap linkedHashMap = this.f259239a;
        try {
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            w8y0 w8y0Var = (w8y0) this.f259241c.remove(str);
            if (w8y0Var != null) {
                w8y0Var.m87476n();
            }
            this.f259242d.remove(str);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final xoi0 m90233c(String str) {
        LinkedHashMap linkedHashMap = this.f259241c;
        Object obj = linkedHashMap.get(str);
        xoi0 xoi0Var = obj instanceof xoi0 ? (xoi0) obj : null;
        if (xoi0Var != null) {
            return xoi0Var;
        }
        LinkedHashMap linkedHashMap2 = this.f259239a;
        w8y0 w8y0Var = linkedHashMap2.containsKey(str) ? new w8y0(this, str, linkedHashMap2.get(str)) : new w8y0(str, this);
        linkedHashMap.put(str, w8y0Var);
        return w8y0Var;
    }

    /* JADX INFO: renamed from: d */
    public final void m90234d(Object obj, String str) {
        if (!stf1.m79258r(obj)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            wj50.m88279p(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.f259241c.get(str);
        xoi0 xoi0Var = obj2 instanceof xoi0 ? (xoi0) obj2 : null;
        if (xoi0Var != null) {
            xoi0Var.mo33104m(obj);
        } else {
            this.f259239a.put(str, obj);
        }
        lqi0 lqi0Var = (lqi0) this.f259242d.get(str);
        if (lqi0Var == null) {
            return;
        }
        ((zv41) lqi0Var).m97090l(obj);
    }

    public x8y0() {
        this.f259239a = new LinkedHashMap();
        this.f259240b = new LinkedHashMap();
        this.f259241c = new LinkedHashMap();
        this.f259242d = new LinkedHashMap();
        this.f259243e = new wvf(this, 2);
    }
}
