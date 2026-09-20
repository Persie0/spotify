package p204p;

import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class w300 implements v300 {

    /* JADX INFO: renamed from: b */
    public static final u300[] f247452b = u300.values();

    /* JADX INFO: renamed from: a */
    public final HashMap f247453a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final u300 m87094a(String str) {
        u300 u300Var = u300.PLAYLIST;
        if (str == null || str.length() == 0) {
            return u300Var;
        }
        HashMap map = this.f247453a;
        u300 u300Var2 = (u300) map.get(str);
        if (u300Var2 != null) {
            return u300Var2;
        }
        u300 u300Var3 = u300Var;
        for (u300 u300Var4 : f247452b) {
            if (Pattern.compile(u300Var4.f226253a).matcher(str).matches()) {
                if (u300Var3 != u300Var) {
                    na6.m63957e("Ambiguous patterns detected. Pattern for type " + u300Var3 + " overlaps with " + u300Var4 + ", which is not allowed.");
                }
                u300Var3 = u300Var4;
            }
        }
        map.put(str, u300Var3);
        return u300Var3;
    }
}
