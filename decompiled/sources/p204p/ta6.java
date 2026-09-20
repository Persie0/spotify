package p204p;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class ta6 {

    /* JADX INFO: renamed from: a */
    public final bb6 f218461a;

    /* JADX INFO: renamed from: b */
    public final HashMap f218462b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f218463c = new HashMap();

    public ta6(hg40 hg40Var, bb6 bb6Var) {
        this.f218461a = bb6Var;
        HashSet hashSet = new HashSet();
        Iterator<E> it = hg40Var.iterator();
        while (it.hasNext()) {
            qa6 qa6Var = (qa6) it.next();
            String str = qa6Var.f186760a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (hashSet.contains(lowerCase)) {
                throw new IllegalArgumentException(s571.m77251j("Assets with duplicate names are not allowed (", str, ")").toString());
            }
            hashSet.add(lowerCase);
            this.f218462b.put(str, qa6Var);
            this.f218463c.put(str, gb6.f78205a);
        }
    }
}
