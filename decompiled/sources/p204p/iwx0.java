package p204p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iwx0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f106528a = new LinkedHashMap(10);

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f106529b = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: c */
    public final zv41 f106530c = jag1.m52819d(lau.f131415a);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (((p204p.k0y) r2.f106528a.remove(r3.f118165a)) != null) goto L10;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m51850a(k0y k0yVar) {
        if (k0yVar.f118167c) {
            if (((k0y) this.f106528a.putIfAbsent(k0yVar.f118165a, k0yVar)) == null) {
                this.f106529b.onNext(k0yVar);
                zv41 zv41Var = this.f106530c;
                List listM43728j1 = g6f.m43728j1(this.f106528a.values());
                zv41Var.getClass();
                zv41Var.m97091m(null, listM43728j1);
                return;
            }
            return;
        }
        throw th;
    }
}
