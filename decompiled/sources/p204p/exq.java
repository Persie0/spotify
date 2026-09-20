package p204p;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class exq {

    /* JADX INFO: renamed from: c */
    public static final er3 f63817c = new er3(9);

    /* JADX INFO: renamed from: d */
    public static final int f63818d;

    /* JADX INFO: renamed from: e */
    public static final int f63819e;

    /* JADX INFO: renamed from: f */
    public static final int f63820f;

    /* JADX INFO: renamed from: g */
    public static final int f63821g;

    /* JADX INFO: renamed from: h */
    public static final int f63822h;

    /* JADX INFO: renamed from: i */
    public static final int f63823i;

    /* JADX INFO: renamed from: j */
    public static final int f63824j;

    /* JADX INFO: renamed from: k */
    public static final int f63825k;

    /* JADX INFO: renamed from: l */
    public static final int f63826l;

    /* JADX INFO: renamed from: m */
    public static final exq f63827m;

    /* JADX INFO: renamed from: n */
    public static final exq f63828n;

    /* JADX INFO: renamed from: o */
    public static final exq f63829o;

    /* JADX INFO: renamed from: p */
    public static final exq f63830p;

    /* JADX INFO: renamed from: q */
    public static final exq f63831q;

    /* JADX INFO: renamed from: r */
    public static final ArrayList f63832r;

    /* JADX INFO: renamed from: s */
    public static final ArrayList f63833s;

    /* JADX INFO: renamed from: a */
    public final List f63834a;

    /* JADX INFO: renamed from: b */
    public final int f63835b;

    static {
        int i = f63818d;
        int i2 = i << 1;
        f63819e = i;
        int i3 = i << 2;
        f63820f = i2;
        int i4 = i << 3;
        f63821g = i3;
        int i5 = i << 4;
        f63822h = i4;
        int i6 = i << 5;
        f63823i = i5;
        f63824j = i6;
        f63818d = i << 7;
        int i7 = (i << 6) - 1;
        f63825k = i7;
        int i8 = i | i2 | i3;
        f63826l = i8;
        f63827m = new exq(i7);
        f63828n = new exq(i5 | i6);
        new exq(i);
        new exq(i2);
        new exq(i3);
        f63829o = new exq(i8);
        new exq(i4);
        f63830p = new exq(i5);
        f63831q = new exq(i6);
        new exq(i2 | i5 | i6);
        Field[] fields = exq.class.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            exq exqVar = obj instanceof exq ? (exq) obj : null;
            dxq dxqVar = exqVar != null ? new dxq(exqVar.f63835b, field2.getName()) : null;
            if (dxqVar != null) {
                arrayList2.add(dxqVar);
            }
        }
        f63832r = arrayList2;
        Field[] fields2 = exq.class.getFields();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (wj50.m88271j(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            int iIntValue = ((Integer) field4.get(null)).intValue();
            dxq dxqVar2 = iIntValue == ((-iIntValue) & iIntValue) ? new dxq(iIntValue, field4.getName()) : null;
            if (dxqVar2 != null) {
                arrayList5.add(dxqVar2);
            }
        }
        f63833s = arrayList5;
    }

    public exq(int i, List list) {
        this.f63834a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((cxq) it.next()).mo27425a();
        }
        this.f63835b = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m40266a(int i) {
        return (i & this.f63835b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!exq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        exq exqVar = (exq) obj;
        return wj50.m88271j(this.f63834a, exqVar.f63834a) && this.f63835b == exqVar.f63835b;
    }

    public final int hashCode() {
        return (this.f63834a.hashCode() * 31) + this.f63835b;
    }

    public final String toString() {
        Object next;
        Iterator it = f63832r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((dxq) next).f54043a != this.f63835b);
        dxq dxqVar = (dxq) next;
        String strM43753y0 = dxqVar != null ? dxqVar.f54044b : null;
        if (strM43753y0 == null) {
            ArrayList arrayList = new ArrayList();
            for (dxq dxqVar2 : f63833s) {
                String str = m40266a(dxqVar2.f54043a) ? dxqVar2.f54044b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strM43753y0 = g6f.m43753y0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbM38572u = edb.m38572u("DescriptorKindFilter(", strM43753y0, ", ");
        sbM38572u.append(this.f63834a);
        sbM38572u.append(')');
        return sbM38572u.toString();
    }

    public /* synthetic */ exq(int i) {
        this(i, lau.f131415a);
    }
}
