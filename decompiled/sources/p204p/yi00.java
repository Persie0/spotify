package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class yi00 {

    /* JADX INFO: renamed from: c */
    public static final yi00 f273012c = new yi00(h6f.m46715L(si00.f209308d, vi00.f241575d, ti00.f220527d, ui00.f230557d));

    /* JADX INFO: renamed from: a */
    public final List f273013a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f273014b;

    public yi00(List list) {
        this.f273013a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            y400 y400Var = ((wi00) obj).f251467a;
            Object arrayList = linkedHashMap.get(y400Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(y400Var, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f273014b = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final xi00 m93696a(String str, y400 y400Var) {
        Integer numValueOf;
        List<wi00> list = (List) this.f273014b.get(y400Var);
        if (list != null) {
            for (wi00 wi00Var : list) {
                int i = 0;
                if (bm51.m29803n0(str, wi00Var.f251468b, false)) {
                    String strSubstring = str.substring(wi00Var.f251468b.length());
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i2 = 0;
                    while (true) {
                        if (i >= length) {
                            numValueOf = Integer.valueOf(i2);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i2 = (i2 * 10) + iCharAt;
                        i++;
                    }
                    if (numValueOf != null) {
                        return new xi00(wi00Var, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
