package p204p;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ms31 {

    /* JADX INFO: renamed from: a */
    public static final Set f146689a = bk5.m29624m1(new String[]{"addTime", "publishDate", "number", "rowId", "frecencyScore"});

    /* JADX INFO: renamed from: a */
    public static void m62698a(StringBuilder sb, gs31 gs31Var, int i) {
        gs31 gs31Var2 = gs31Var.f83876c;
        boolean z = gs31Var.f83875b;
        String str = gs31Var.f83874a;
        if (f146689a.contains(str)) {
            z = !z;
        }
        ArrayList arrayList = new ArrayList(wl51.m88477a1(str, new String[]{"_"}, 0, 6));
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            String str2 = (String) arrayList.get(i2);
            arrayList.set(i2, str2.substring(0, 1).toUpperCase(Locale.US).concat(str2.substring(1)));
        }
        String strM43753y0 = g6f.m43753y0(arrayList, "", null, null, null, 62);
        sb.append(strM43753y0);
        if (z && strM43753y0.length() > 0) {
            sb.append(" DESC");
        }
        if (5 <= i || gs31Var2 == null) {
            return;
        }
        sb.append(',');
        m62698a(sb, gs31Var2, i + 1);
    }

    /* JADX INFO: renamed from: b */
    public static final String m62699b(gs31 gs31Var) {
        StringBuilder sb = new StringBuilder(50);
        m62698a(sb, gs31Var, 0);
        return sb.toString();
    }
}
