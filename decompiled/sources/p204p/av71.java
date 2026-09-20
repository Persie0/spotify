package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class av71 implements yu71 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f20120a = Pattern.compile("\\b(\\d{1,2}:[0-5]\\d:[0-5]\\d|[0-5]?\\d:[0-5]\\d)(?=$|\\s|[)\\],.!?;:])");

    /* JADX INFO: renamed from: a */
    public final boolean m27227a(int i, String str) {
        ArrayList arrayListM27228b = m27228b(i, str);
        if (arrayListM27228b.isEmpty()) {
            return false;
        }
        Iterator it = arrayListM27228b.iterator();
        while (it.hasNext()) {
            if (((xu71) it.next()) instanceof wu71) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m27228b(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f20120a.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                arrayList.add(new zu71(strGroup, matcher.start(), matcher.end()));
            }
        }
        List<zu71> listM43711Y0 = g6f.m43711Y0(arrayList, new fd11(13));
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        int iM97012a = 0;
        for (zu71 zu71Var : listM43711Y0) {
            if (zu71Var.m97013b() > iM97012a) {
                arrayList2.add(new vu71(str.substring(iM97012a, zu71Var.m97013b())));
                iM97012a = zu71Var.m97013b();
            }
            int iPow = i2;
            int i3 = iPow;
            for (Object obj : g6f.m43704R0(wl51.m88477a1(zu71Var.m97014c(), new String[]{":"}, i2, 6))) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                double d = iPow;
                Integer numM29807r0 = bm51.m29807r0((String) obj);
                iPow = (int) ((Math.pow(60.0d, i3) * ((double) (numM29807r0 != null ? numM29807r0.intValue() : i2))) + d);
                i3 = i4;
                iM97012a = iM97012a;
                i2 = 0;
            }
            int i5 = iM97012a;
            if (iPow < i) {
                arrayList2.add(new wu71(ikc0.m50939k("<", ">", arrayList2.size(), zu71Var.m97014c()), zu71Var.m97014c(), iPow));
                iM97012a = zu71Var.m97012a();
            } else {
                iM97012a = i5;
            }
            i2 = 0;
        }
        if (iM97012a < str.length()) {
            arrayList2.add(new vu71(str.substring(iM97012a)));
        }
        return arrayList2;
    }
}
