package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j15 implements CharSequence {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f107639e = 0;

    /* JADX INFO: renamed from: a */
    public final List f107640a;

    /* JADX INFO: renamed from: b */
    public final String f107641b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f107642c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f107643d;

    static {
        new h15(0);
        t9y0 t9y0Var = z9y0.f280907a;
    }

    public j15(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f107640a = list;
        this.f107641b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                i15 i15Var = (i15) list.get(i);
                Object obj = i15Var.f97388a;
                if (obj instanceof ew31) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(i15Var);
                } else if (obj instanceof vsm0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(i15Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f107642c = arrayList;
        this.f107643d = arrayList2;
        List listM43711Y0 = arrayList2 != null ? g6f.m43711Y0(arrayList2, new ecb(18)) : null;
        if (listM43711Y0 == null || listM43711Y0.isEmpty()) {
            return;
        }
        int i2 = ((i15) g6f.m43741q0(listM43711Y0)).f97390c;
        soi0 soi0Var = u350.f226270a;
        soi0 soi0Var2 = new soi0(1);
        soi0Var2.m78648a(i2);
        int size2 = listM43711Y0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            i15 i15Var2 = (i15) listM43711Y0.get(i3);
            while (soi0Var2.f211200b != 0) {
                int iM78651d = soi0Var2.m78651d();
                int i4 = i15Var2.f97389b;
                int i5 = i15Var2.f97390c;
                if (i4 < iM78651d) {
                    if (i5 > iM78651d) {
                        nt40.m65597a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iM78651d);
                        break;
                    }
                    break;
                }
                soi0Var2.m78653f(soi0Var2.f211200b - 1);
            }
            soi0Var2.m78648a(i15Var2.f97390c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m52112a(int i) {
        List list = this.f107640a;
        if (list == null) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i15 i15Var = (i15) obj;
            if ((i15Var.f97388a instanceof yl80) && k15.m55049b(0, i, i15Var.f97389b, i15Var.f97390c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List m52113b() {
        ArrayList arrayList = this.f107642c;
        return arrayList == null ? lau.f131415a : arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final List m52114c(int i, int i2, String str) {
        List list = this.f107640a;
        if (list == null) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            i15 i15Var = (i15) list.get(i3);
            if ((i15Var.f97388a instanceof cl51) && str.equals(i15Var.f97391d) && k15.m55049b(i, i2, i15Var.f97389b, i15Var.f97390c)) {
                arrayList.add(qag1.m72449o(i15Var));
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f107641b.charAt(i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m52115d(int i) {
        List list = this.f107640a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                i15 i15Var = (i15) list.get(i2);
                if ((i15Var.f97388a instanceof yl80) && k15.m55049b(0, i, i15Var.f97389b, i15Var.f97390c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final j15 m52116e(j15 j15Var) {
        g15 g15Var = new g15(this);
        g15Var.m43332h(j15Var);
        return g15Var.m43339o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j15)) {
            return false;
        }
        j15 j15Var = (j15) obj;
        return wj50.m88271j(this.f107641b, j15Var.f107641b) && wj50.m88271j(this.f107640a, j15Var.f107640a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final j15 subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            nt40.m65597a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f107641b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        j15 j15Var = k15.f118204a;
        if (i > i2) {
            nt40.m65597a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.f107640a;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i15 i15Var = (i15) list.get(i3);
                int i4 = i15Var.f97389b;
                int i5 = i15Var.f97390c;
                if (k15.m55049b(i, i2, i4, i5)) {
                    arrayList.add(new i15(Math.max(i, i15Var.f97389b) - i, Math.min(i2, i5) - i, i15Var.f97388a, i15Var.f97391d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new j15(arrayList, strSubstring);
    }

    public final int hashCode() {
        int iHashCode = this.f107641b.hashCode() * 31;
        List list = this.f107640a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f107641b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f107641b;
    }

    public /* synthetic */ j15(String str, int i, List list) {
        this(str, list, lau.f131415a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j15(String str, List list, List list2) {
        j15 j15Var = k15.f118204a;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add((i15) list.get(i));
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add((i15) list2.get(i2));
                }
                list = arrayList;
            }
        }
        this(list, str);
    }

    public /* synthetic */ j15(String str) {
        this(str, lau.f131415a);
    }

    public j15(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
