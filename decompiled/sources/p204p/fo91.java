package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class fo91 {

    /* JADX INFO: renamed from: d */
    public static final fo91 f71477d = new fo91(lau.f131415a, nau.f152117a, null);

    /* JADX INFO: renamed from: a */
    public final Object f71478a;

    /* JADX INFO: renamed from: b */
    public final Object f71479b;

    /* JADX INFO: renamed from: c */
    public final fo91 f71480c;

    public fo91(List list, Map map, fo91 fo91Var) {
        this.f71478a = list;
        this.f71479b = map;
        this.f71480c = fo91Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final ur60 m42268a(int i) {
        ur60 ur60Var = (ur60) this.f71479b.get(Integer.valueOf(i));
        if (ur60Var != null) {
            return ur60Var;
        }
        fo91 fo91Var = this.f71480c;
        if (fo91Var != null) {
            return fo91Var.m42268a(i);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final List m42269b() {
        return this.f71478a;
    }
}
