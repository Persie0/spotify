package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class kmi0 {

    /* JADX INFO: renamed from: a */
    public final fwk0 f124167a;

    /* JADX INFO: renamed from: b */
    public final ii4 f124168b;

    /* JADX INFO: renamed from: c */
    public final tlp f124169c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f124170d;

    public kmi0(fwk0 fwk0Var, ii4 ii4Var) {
        n5q n5qVar = xsr.f265651a;
        tlp tlpVar = tlp.f221498c;
        this.f124167a = fwk0Var;
        this.f124168b = ii4Var;
        this.f124169c = tlpVar;
        this.f124170d = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final imi0 m56928a(String str) {
        Object objPutIfAbsent;
        if (!this.f124168b.m50686i()) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f124170d;
        Object imi0Var = concurrentHashMap.get(str);
        if (imi0Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (imi0Var = new imi0(str, this.f124167a, this.f124169c)))) != null) {
            imi0Var = objPutIfAbsent;
        }
        return (imi0) imi0Var;
    }
}
