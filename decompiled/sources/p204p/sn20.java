package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sn20 implements Iterable, pq60 {

    /* JADX INFO: renamed from: b */
    public static final sn20 f210780b = new sn20(new String[0]);

    /* JADX INFO: renamed from: a */
    public final String[] f210781a;

    public sn20(String[] strArr) {
        this.f210781a = strArr;
    }

    /* JADX INFO: renamed from: a */
    public final long m78533a() {
        String[] strArr = this.f210781a;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        return length;
    }

    /* JADX INFO: renamed from: b */
    public final String m78534b(String str) {
        String[] strArr = this.f210781a;
        int length = strArr.length - 2;
        int iM92097r = xtm0.m92097r(length, 0, -2);
        if (iM92097r > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iM92097r) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX INFO: renamed from: d */
    public final String m78535d(int i) {
        String str = (String) bk5.m29587J0(i * 2, this.f210781a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(dq60.m36613m("name[", i, ']'));
    }

    /* JADX INFO: renamed from: e */
    public final sep m78536e() {
        sep sepVar = new sep(1, false);
        sepVar.f208338a.addAll(bk5.m29611g0(this.f210781a));
        return sepVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sn20) {
            return Arrays.equals(this.f210781a, ((sn20) obj).f210781a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final TreeMap m78537f() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String lowerCase = m78535d(i).toLowerCase(Locale.US);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(m78538i(i));
        }
        return treeMap;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f210781a);
    }

    /* JADX INFO: renamed from: i */
    public final String m78538i(int i) {
        String str = (String) bk5.m29587J0((i * 2) + 1, this.f210781a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(dq60.m36613m("value[", i, ']'));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        pqm0[] pqm0VarArr = new pqm0[size];
        for (int i = 0; i < size; i++) {
            pqm0VarArr[i] = pft0.m69840u(m78535d(i), m78538i(i));
        }
        return new C2042k7(pqm0VarArr, 1);
    }

    /* JADX INFO: renamed from: j */
    public final List m78539j(String str) {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(m78535d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m78538i(i));
            }
        }
        List listUnmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        return listUnmodifiableList == null ? lau.f131415a : listUnmodifiableList;
    }

    public final int size() {
        return this.f210781a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strM78535d = m78535d(i);
            String strM78538i = m78538i(i);
            sb.append(strM78535d);
            sb.append(": ");
            if (a0f1.m24351l(strM78535d)) {
                strM78538i = "██";
            }
            sb.append(strM78538i);
            sb.append("\n");
        }
        return sb.toString();
    }
}
