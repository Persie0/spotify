package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class nay {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f152133a;

    /* JADX INFO: renamed from: b */
    public static final Map f152134b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f152133a = linkedHashMap;
        m64043b(ki41.f122810u, m64042a("java.util.ArrayList", "java.util.LinkedList"));
        m64043b(ki41.f122811v, m64042a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m64043b(ki41.f122812w, m64042a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        y400 y400Var = new y400("java.util.function.Function");
        m64043b(new vfe(y400Var.m92786b(), y400Var.f269048a.m95306g()), m64042a("java.util.function.UnaryOperator"));
        y400 y400Var2 = new y400("java.util.function.BiFunction");
        m64043b(new vfe(y400Var2.m92786b(), y400Var2.f269048a.m95306g()), m64042a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new pqm0(((vfe) entry.getKey()).m85354a(), ((vfe) entry.getValue()).m85354a()));
        }
        f152134b = kkc0.m56705r0(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m64042a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            y400 y400Var = new y400(str);
            arrayList.add(new vfe(y400Var.m92786b(), y400Var.f269048a.m95306g()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m64043b(vfe vfeVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f152133a.put(obj, vfeVar);
        }
    }
}
