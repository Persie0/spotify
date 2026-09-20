package p204p;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ner0 {

    /* JADX INFO: renamed from: a */
    public static final SparseArray f153065a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public static final HashMap f153066b;

    static {
        HashMap map = new HashMap();
        f153066b = map;
        map.put(ler0.f132669a, 0);
        map.put(ler0.f132670b, 1);
        map.put(ler0.f132671c, 2);
        for (ler0 ler0Var : map.keySet()) {
            f153065a.append(((Integer) f153066b.get(ler0Var)).intValue(), ler0Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m64271a(ler0 ler0Var) {
        Integer num = (Integer) f153066b.get(ler0Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + ler0Var);
    }

    /* JADX INFO: renamed from: b */
    public static ler0 m64272b(int i) {
        ler0 ler0Var = (ler0) f153065a.get(i);
        if (ler0Var != null) {
            return ler0Var;
        }
        throw new IllegalArgumentException(s571.m77246e(i, "Unknown Priority for value "));
    }
}
